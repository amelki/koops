
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package com.codingue.koops.aws.mturk_requester

import javax.annotation.Generated
import com.codingue.koops.common.*
import com.codingue.koops.core.*
import com.codingue.koops.aws.*
import com.amazonaws.services.mturk.*
import com.amazonaws.services.mturk.model.*

var com.codingue.koops.core.Environment.mturk_requester: AmazonMTurk
	get() {
		var service = this.capabilities["aws-mturk_requester"]
		if (service == null) {
			service = AmazonMTurkClientBuilder.standard().build()
			this.capabilities["aws-mturk_requester"] = service
		}
		return service as AmazonMTurk
	}
	set(mturk_requester) {
		this.capabilities["aws-mturk_requester"] = mturk_requester
	}

@Generated
class AmazonMTurkFunctions(val block: Block)

infix fun <T> AwsContinuation.mturk_requester(init: AmazonMTurkFunctions.() -> T): T {
	return AmazonMTurkFunctions(shell).run(init)
}

			

fun AmazonMTurkFunctions.acceptQualificationRequest(qualificationRequestId: String, init: (AmazonMTurkAcceptQualificationRequestCommand.() -> Unit)? = null): com.amazonaws.services.mturk.model.AcceptQualificationRequestResult {
	return this.block.declare(AmazonMTurkAcceptQualificationRequestCommand(qualificationRequestId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mturk.model.AcceptQualificationRequestResult
}

@Generated
class AmazonMTurkAcceptQualificationRequestCommand(val qualificationRequestId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.AcceptQualificationRequestRequest, com.amazonaws.services.mturk.model.AcceptQualificationRequestResult> {

	var integerValue: Int? = 0

	override fun build(): com.amazonaws.services.mturk.model.AcceptQualificationRequestRequest {
		val input = com.amazonaws.services.mturk.model.AcceptQualificationRequestRequest()
		input.setQualificationRequestId(this.qualificationRequestId)
		input.setIntegerValue(this.integerValue)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mturk.model.AcceptQualificationRequestResult {
	  return com.amazonaws.services.mturk.model.AcceptQualificationRequestResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mturk.model.AcceptQualificationRequestResult {
		return environment.mturk_requester.acceptQualificationRequest(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester accept-qualification-request")
				.argument("qualification-request-id", qualificationRequestId)
				.argument("integer-value", integerValue?.toString())
	}

}


fun AmazonMTurkFunctions.approveAssignment(assignmentId: String, init: (AmazonMTurkApproveAssignmentCommand.() -> Unit)? = null): com.amazonaws.services.mturk.model.ApproveAssignmentResult {
	return this.block.declare(AmazonMTurkApproveAssignmentCommand(assignmentId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mturk.model.ApproveAssignmentResult
}

@Generated
class AmazonMTurkApproveAssignmentCommand(val assignmentId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.ApproveAssignmentRequest, com.amazonaws.services.mturk.model.ApproveAssignmentResult> {

	var requesterFeedback: String? = null
	var overrideRejection: Boolean? = false

	override fun build(): com.amazonaws.services.mturk.model.ApproveAssignmentRequest {
		val input = com.amazonaws.services.mturk.model.ApproveAssignmentRequest()
		input.setAssignmentId(this.assignmentId)
		input.setRequesterFeedback(this.requesterFeedback)
		input.setOverrideRejection(this.overrideRejection)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mturk.model.ApproveAssignmentResult {
	  return com.amazonaws.services.mturk.model.ApproveAssignmentResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mturk.model.ApproveAssignmentResult {
		return environment.mturk_requester.approveAssignment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester approve-assignment")
				.argument("assignment-id", assignmentId)
				.argument("requester-feedback", requesterFeedback)
				.option("override-rejection", overrideRejection ?: false)
	}

}


fun AmazonMTurkFunctions.associateQualificationWithWorker(qualificationTypeId: String, workerId: String, init: (AmazonMTurkAssociateQualificationWithWorkerCommand.() -> Unit)? = null): com.amazonaws.services.mturk.model.AssociateQualificationWithWorkerResult {
	return this.block.declare(AmazonMTurkAssociateQualificationWithWorkerCommand(qualificationTypeId, workerId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mturk.model.AssociateQualificationWithWorkerResult
}

@Generated
class AmazonMTurkAssociateQualificationWithWorkerCommand(val qualificationTypeId: String, val workerId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.AssociateQualificationWithWorkerRequest, com.amazonaws.services.mturk.model.AssociateQualificationWithWorkerResult> {

	var integerValue: Int? = 0
	var sendNotification: Boolean? = false

	override fun build(): com.amazonaws.services.mturk.model.AssociateQualificationWithWorkerRequest {
		val input = com.amazonaws.services.mturk.model.AssociateQualificationWithWorkerRequest()
		input.setQualificationTypeId(this.qualificationTypeId)
		input.setWorkerId(this.workerId)
		input.setIntegerValue(this.integerValue)
		input.setSendNotification(this.sendNotification)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mturk.model.AssociateQualificationWithWorkerResult {
	  return com.amazonaws.services.mturk.model.AssociateQualificationWithWorkerResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mturk.model.AssociateQualificationWithWorkerResult {
		return environment.mturk_requester.associateQualificationWithWorker(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester associate-qualification-with-worker")
				.argument("qualification-type-id", qualificationTypeId)
				.argument("worker-id", workerId)
				.argument("integer-value", integerValue?.toString())
				.option("send-notification", sendNotification ?: false)
	}

}


fun AmazonMTurkFunctions.createAdditionalAssignmentsForHIT(hITId: String, numberOfAdditionalAssignments: Int, init: (AmazonMTurkCreateAdditionalAssignmentsForHITCommand.() -> Unit)? = null): com.amazonaws.services.mturk.model.CreateAdditionalAssignmentsForHITResult {
	return this.block.declare(AmazonMTurkCreateAdditionalAssignmentsForHITCommand(hITId, numberOfAdditionalAssignments).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mturk.model.CreateAdditionalAssignmentsForHITResult
}

@Generated
class AmazonMTurkCreateAdditionalAssignmentsForHITCommand(val hITId: String, val numberOfAdditionalAssignments: Int) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.CreateAdditionalAssignmentsForHITRequest, com.amazonaws.services.mturk.model.CreateAdditionalAssignmentsForHITResult> {

	var uniqueRequestToken: String? = null

	override fun build(): com.amazonaws.services.mturk.model.CreateAdditionalAssignmentsForHITRequest {
		val input = com.amazonaws.services.mturk.model.CreateAdditionalAssignmentsForHITRequest()
		input.setHITId(this.hITId)
		input.setNumberOfAdditionalAssignments(this.numberOfAdditionalAssignments)
		input.setUniqueRequestToken(this.uniqueRequestToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mturk.model.CreateAdditionalAssignmentsForHITResult {
	  return com.amazonaws.services.mturk.model.CreateAdditionalAssignmentsForHITResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mturk.model.CreateAdditionalAssignmentsForHITResult {
		return environment.mturk_requester.createAdditionalAssignmentsForHIT(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester create-additional-assignments-for-hit")
				.argument("hitid", hITId)
				.argument("number-of-additional-assignments", numberOfAdditionalAssignments.toString())
				.argument("unique-request-token", uniqueRequestToken)
	}

}


fun AmazonMTurkFunctions.createHIT(lifetimeInSeconds: Long, assignmentDurationInSeconds: Long, reward: String, title: String, description: String, init: (AmazonMTurkCreateHITCommand.() -> Unit)? = null): com.amazonaws.services.mturk.model.CreateHITResult {
	return this.block.declare(AmazonMTurkCreateHITCommand(lifetimeInSeconds, assignmentDurationInSeconds, reward, title, description).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mturk.model.CreateHITResult
}

@Generated
class AmazonMTurkCreateHITCommand(val lifetimeInSeconds: Long, val assignmentDurationInSeconds: Long, val reward: String, val title: String, val description: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.CreateHITRequest, com.amazonaws.services.mturk.model.CreateHITResult> {

	var maxAssignments: Int? = 0
	var autoApprovalDelayInSeconds: Long? = 0L
	var keywords: String? = null
	var question: String? = null
	var requesterAnnotation: String? = null
	var qualificationRequirements: List<com.amazonaws.services.mturk.model.QualificationRequirement>? = null
	var uniqueRequestToken: String? = null
	var assignmentReviewPolicy: com.amazonaws.services.mturk.model.ReviewPolicy? = null
	var hITReviewPolicy: com.amazonaws.services.mturk.model.ReviewPolicy? = null
	var hITLayoutId: String? = null
	var hITLayoutParameters: List<com.amazonaws.services.mturk.model.HITLayoutParameter>? = null

	override fun build(): com.amazonaws.services.mturk.model.CreateHITRequest {
		val input = com.amazonaws.services.mturk.model.CreateHITRequest()
		input.setMaxAssignments(this.maxAssignments)
		input.setAutoApprovalDelayInSeconds(this.autoApprovalDelayInSeconds)
		input.setLifetimeInSeconds(this.lifetimeInSeconds)
		input.setAssignmentDurationInSeconds(this.assignmentDurationInSeconds)
		input.setReward(this.reward)
		input.setTitle(this.title)
		input.setKeywords(this.keywords)
		input.setDescription(this.description)
		input.setQuestion(this.question)
		input.setRequesterAnnotation(this.requesterAnnotation)
		input.setQualificationRequirements(this.qualificationRequirements)
		input.setUniqueRequestToken(this.uniqueRequestToken)
		input.setAssignmentReviewPolicy(this.assignmentReviewPolicy)
		input.setHITReviewPolicy(this.hITReviewPolicy)
		input.setHITLayoutId(this.hITLayoutId)
		input.setHITLayoutParameters(this.hITLayoutParameters)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mturk.model.CreateHITResult {
	  return com.amazonaws.services.mturk.model.CreateHITResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mturk.model.CreateHITResult {
		return environment.mturk_requester.createHIT(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester create-hit")
				.argument("max-assignments", maxAssignments?.toString())
				.argument("auto-approval-delay-in-seconds", autoApprovalDelayInSeconds?.toString())
				.argument("lifetime-in-seconds", lifetimeInSeconds.toString())
				.argument("assignment-duration-in-seconds", assignmentDurationInSeconds.toString())
				.argument("reward", reward)
				.argument("title", title)
				.argument("keywords", keywords)
				.argument("description", description)
				.argument("question", question)
				.argument("requester-annotation", requesterAnnotation)
				.argument("qualification-requirements", qualificationRequirements?.toString())
				.argument("unique-request-token", uniqueRequestToken)
				.argument("assignment-review-policy", assignmentReviewPolicy?.toString())
				.argument("hitreview-policy", hITReviewPolicy?.toString())
				.argument("hitlayout-id", hITLayoutId)
				.argument("hitlayout-parameters", hITLayoutParameters?.toString())
	}

}


fun AmazonMTurkFunctions.createHITType(assignmentDurationInSeconds: Long, reward: String, title: String, description: String, init: (AmazonMTurkCreateHITTypeCommand.() -> Unit)? = null): com.amazonaws.services.mturk.model.CreateHITTypeResult {
	return this.block.declare(AmazonMTurkCreateHITTypeCommand(assignmentDurationInSeconds, reward, title, description).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mturk.model.CreateHITTypeResult
}

@Generated
class AmazonMTurkCreateHITTypeCommand(val assignmentDurationInSeconds: Long, val reward: String, val title: String, val description: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.CreateHITTypeRequest, com.amazonaws.services.mturk.model.CreateHITTypeResult> {

	var autoApprovalDelayInSeconds: Long? = 0L
	var keywords: String? = null
	var qualificationRequirements: List<com.amazonaws.services.mturk.model.QualificationRequirement>? = null

	override fun build(): com.amazonaws.services.mturk.model.CreateHITTypeRequest {
		val input = com.amazonaws.services.mturk.model.CreateHITTypeRequest()
		input.setAutoApprovalDelayInSeconds(this.autoApprovalDelayInSeconds)
		input.setAssignmentDurationInSeconds(this.assignmentDurationInSeconds)
		input.setReward(this.reward)
		input.setTitle(this.title)
		input.setKeywords(this.keywords)
		input.setDescription(this.description)
		input.setQualificationRequirements(this.qualificationRequirements)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mturk.model.CreateHITTypeResult {
	  return com.amazonaws.services.mturk.model.CreateHITTypeResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mturk.model.CreateHITTypeResult {
		return environment.mturk_requester.createHITType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester create-hittype")
				.argument("auto-approval-delay-in-seconds", autoApprovalDelayInSeconds?.toString())
				.argument("assignment-duration-in-seconds", assignmentDurationInSeconds.toString())
				.argument("reward", reward)
				.argument("title", title)
				.argument("keywords", keywords)
				.argument("description", description)
				.argument("qualification-requirements", qualificationRequirements?.toString())
	}

}


fun AmazonMTurkFunctions.createHITWithHITType(hITTypeId: String, lifetimeInSeconds: Long, init: (AmazonMTurkCreateHITWithHITTypeCommand.() -> Unit)? = null): com.amazonaws.services.mturk.model.CreateHITWithHITTypeResult {
	return this.block.declare(AmazonMTurkCreateHITWithHITTypeCommand(hITTypeId, lifetimeInSeconds).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mturk.model.CreateHITWithHITTypeResult
}

@Generated
class AmazonMTurkCreateHITWithHITTypeCommand(val hITTypeId: String, val lifetimeInSeconds: Long) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.CreateHITWithHITTypeRequest, com.amazonaws.services.mturk.model.CreateHITWithHITTypeResult> {

	var maxAssignments: Int? = 0
	var question: String? = null
	var requesterAnnotation: String? = null
	var uniqueRequestToken: String? = null
	var assignmentReviewPolicy: com.amazonaws.services.mturk.model.ReviewPolicy? = null
	var hITReviewPolicy: com.amazonaws.services.mturk.model.ReviewPolicy? = null
	var hITLayoutId: String? = null
	var hITLayoutParameters: List<com.amazonaws.services.mturk.model.HITLayoutParameter>? = null

	override fun build(): com.amazonaws.services.mturk.model.CreateHITWithHITTypeRequest {
		val input = com.amazonaws.services.mturk.model.CreateHITWithHITTypeRequest()
		input.setHITTypeId(this.hITTypeId)
		input.setMaxAssignments(this.maxAssignments)
		input.setLifetimeInSeconds(this.lifetimeInSeconds)
		input.setQuestion(this.question)
		input.setRequesterAnnotation(this.requesterAnnotation)
		input.setUniqueRequestToken(this.uniqueRequestToken)
		input.setAssignmentReviewPolicy(this.assignmentReviewPolicy)
		input.setHITReviewPolicy(this.hITReviewPolicy)
		input.setHITLayoutId(this.hITLayoutId)
		input.setHITLayoutParameters(this.hITLayoutParameters)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mturk.model.CreateHITWithHITTypeResult {
	  return com.amazonaws.services.mturk.model.CreateHITWithHITTypeResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mturk.model.CreateHITWithHITTypeResult {
		return environment.mturk_requester.createHITWithHITType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester create-hitwith-hittype")
				.argument("hittype-id", hITTypeId)
				.argument("max-assignments", maxAssignments?.toString())
				.argument("lifetime-in-seconds", lifetimeInSeconds.toString())
				.argument("question", question)
				.argument("requester-annotation", requesterAnnotation)
				.argument("unique-request-token", uniqueRequestToken)
				.argument("assignment-review-policy", assignmentReviewPolicy?.toString())
				.argument("hitreview-policy", hITReviewPolicy?.toString())
				.argument("hitlayout-id", hITLayoutId)
				.argument("hitlayout-parameters", hITLayoutParameters?.toString())
	}

}


fun AmazonMTurkFunctions.createQualificationType(name: String, description: String, qualificationTypeStatus: QualificationTypeStatus, init: (AmazonMTurkCreateQualificationTypeCommand.() -> Unit)? = null): com.amazonaws.services.mturk.model.CreateQualificationTypeResult {
	return this.block.declare(AmazonMTurkCreateQualificationTypeCommand(name, description, qualificationTypeStatus).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mturk.model.CreateQualificationTypeResult
}

@Generated
class AmazonMTurkCreateQualificationTypeCommand(val name: String, val description: String, val qualificationTypeStatus: QualificationTypeStatus) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.CreateQualificationTypeRequest, com.amazonaws.services.mturk.model.CreateQualificationTypeResult> {

	var keywords: String? = null
	var retryDelayInSeconds: Long? = 0L
	var test: String? = null
	var answerKey: String? = null
	var testDurationInSeconds: Long? = 0L
	var autoGranted: Boolean? = false
	var autoGrantedValue: Int? = 0

	override fun build(): com.amazonaws.services.mturk.model.CreateQualificationTypeRequest {
		val input = com.amazonaws.services.mturk.model.CreateQualificationTypeRequest()
		input.setName(this.name)
		input.setKeywords(this.keywords)
		input.setDescription(this.description)
		input.setQualificationTypeStatus(this.qualificationTypeStatus.toString())
		input.setRetryDelayInSeconds(this.retryDelayInSeconds)
		input.setTest(this.test)
		input.setAnswerKey(this.answerKey)
		input.setTestDurationInSeconds(this.testDurationInSeconds)
		input.setAutoGranted(this.autoGranted)
		input.setAutoGrantedValue(this.autoGrantedValue)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mturk.model.CreateQualificationTypeResult {
	  return com.amazonaws.services.mturk.model.CreateQualificationTypeResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mturk.model.CreateQualificationTypeResult {
		return environment.mturk_requester.createQualificationType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester create-qualification-type")
				.argument("name", name)
				.argument("keywords", keywords)
				.argument("description", description)
				.argument("qualification-type-status", qualificationTypeStatus.toString())
				.argument("retry-delay-in-seconds", retryDelayInSeconds?.toString())
				.argument("test", test)
				.argument("answer-key", answerKey)
				.argument("test-duration-in-seconds", testDurationInSeconds?.toString())
				.option("auto-granted", autoGranted ?: false)
				.argument("auto-granted-value", autoGrantedValue?.toString())
	}

}


fun AmazonMTurkFunctions.createWorkerBlock(workerId: String, reason: String, init: (AmazonMTurkCreateWorkerBlockCommand.() -> Unit)? = null): com.amazonaws.services.mturk.model.CreateWorkerBlockResult {
	return this.block.declare(AmazonMTurkCreateWorkerBlockCommand(workerId, reason).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mturk.model.CreateWorkerBlockResult
}

@Generated
class AmazonMTurkCreateWorkerBlockCommand(val workerId: String, val reason: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.CreateWorkerBlockRequest, com.amazonaws.services.mturk.model.CreateWorkerBlockResult> {



	override fun build(): com.amazonaws.services.mturk.model.CreateWorkerBlockRequest {
		val input = com.amazonaws.services.mturk.model.CreateWorkerBlockRequest()
		input.setWorkerId(this.workerId)
		input.setReason(this.reason)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mturk.model.CreateWorkerBlockResult {
	  return com.amazonaws.services.mturk.model.CreateWorkerBlockResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mturk.model.CreateWorkerBlockResult {
		return environment.mturk_requester.createWorkerBlock(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester create-worker-block")
				.argument("worker-id", workerId)
				.argument("reason", reason)
	}

}


fun AmazonMTurkFunctions.deleteHIT(hITId: String, init: (AmazonMTurkDeleteHITCommand.() -> Unit)? = null): com.amazonaws.services.mturk.model.DeleteHITResult {
	return this.block.declare(AmazonMTurkDeleteHITCommand(hITId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mturk.model.DeleteHITResult
}

@Generated
class AmazonMTurkDeleteHITCommand(val hITId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.DeleteHITRequest, com.amazonaws.services.mturk.model.DeleteHITResult> {



	override fun build(): com.amazonaws.services.mturk.model.DeleteHITRequest {
		val input = com.amazonaws.services.mturk.model.DeleteHITRequest()
		input.setHITId(this.hITId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mturk.model.DeleteHITResult {
	  return com.amazonaws.services.mturk.model.DeleteHITResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mturk.model.DeleteHITResult {
		return environment.mturk_requester.deleteHIT(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester delete-hit")
				.argument("hitid", hITId)
	}

}


fun AmazonMTurkFunctions.deleteQualificationType(qualificationTypeId: String, init: (AmazonMTurkDeleteQualificationTypeCommand.() -> Unit)? = null): com.amazonaws.services.mturk.model.DeleteQualificationTypeResult {
	return this.block.declare(AmazonMTurkDeleteQualificationTypeCommand(qualificationTypeId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mturk.model.DeleteQualificationTypeResult
}

@Generated
class AmazonMTurkDeleteQualificationTypeCommand(val qualificationTypeId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.DeleteQualificationTypeRequest, com.amazonaws.services.mturk.model.DeleteQualificationTypeResult> {



	override fun build(): com.amazonaws.services.mturk.model.DeleteQualificationTypeRequest {
		val input = com.amazonaws.services.mturk.model.DeleteQualificationTypeRequest()
		input.setQualificationTypeId(this.qualificationTypeId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mturk.model.DeleteQualificationTypeResult {
	  return com.amazonaws.services.mturk.model.DeleteQualificationTypeResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mturk.model.DeleteQualificationTypeResult {
		return environment.mturk_requester.deleteQualificationType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester delete-qualification-type")
				.argument("qualification-type-id", qualificationTypeId)
	}

}


fun AmazonMTurkFunctions.deleteWorkerBlock(workerId: String, init: (AmazonMTurkDeleteWorkerBlockCommand.() -> Unit)? = null): com.amazonaws.services.mturk.model.DeleteWorkerBlockResult {
	return this.block.declare(AmazonMTurkDeleteWorkerBlockCommand(workerId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mturk.model.DeleteWorkerBlockResult
}

@Generated
class AmazonMTurkDeleteWorkerBlockCommand(val workerId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.DeleteWorkerBlockRequest, com.amazonaws.services.mturk.model.DeleteWorkerBlockResult> {

	var reason: String? = null

	override fun build(): com.amazonaws.services.mturk.model.DeleteWorkerBlockRequest {
		val input = com.amazonaws.services.mturk.model.DeleteWorkerBlockRequest()
		input.setWorkerId(this.workerId)
		input.setReason(this.reason)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mturk.model.DeleteWorkerBlockResult {
	  return com.amazonaws.services.mturk.model.DeleteWorkerBlockResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mturk.model.DeleteWorkerBlockResult {
		return environment.mturk_requester.deleteWorkerBlock(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester delete-worker-block")
				.argument("worker-id", workerId)
				.argument("reason", reason)
	}

}


fun AmazonMTurkFunctions.disassociateQualificationFromWorker(workerId: String, qualificationTypeId: String, init: (AmazonMTurkDisassociateQualificationFromWorkerCommand.() -> Unit)? = null): com.amazonaws.services.mturk.model.DisassociateQualificationFromWorkerResult {
	return this.block.declare(AmazonMTurkDisassociateQualificationFromWorkerCommand(workerId, qualificationTypeId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mturk.model.DisassociateQualificationFromWorkerResult
}

@Generated
class AmazonMTurkDisassociateQualificationFromWorkerCommand(val workerId: String, val qualificationTypeId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.DisassociateQualificationFromWorkerRequest, com.amazonaws.services.mturk.model.DisassociateQualificationFromWorkerResult> {

	var reason: String? = null

	override fun build(): com.amazonaws.services.mturk.model.DisassociateQualificationFromWorkerRequest {
		val input = com.amazonaws.services.mturk.model.DisassociateQualificationFromWorkerRequest()
		input.setWorkerId(this.workerId)
		input.setQualificationTypeId(this.qualificationTypeId)
		input.setReason(this.reason)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mturk.model.DisassociateQualificationFromWorkerResult {
	  return com.amazonaws.services.mturk.model.DisassociateQualificationFromWorkerResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mturk.model.DisassociateQualificationFromWorkerResult {
		return environment.mturk_requester.disassociateQualificationFromWorker(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester disassociate-qualification-from-worker")
				.argument("worker-id", workerId)
				.argument("qualification-type-id", qualificationTypeId)
				.argument("reason", reason)
	}

}


fun AmazonMTurkFunctions.getAccountBalance(init: (AmazonMTurkGetAccountBalanceCommand.() -> Unit)? = null): com.amazonaws.services.mturk.model.GetAccountBalanceResult {
	return this.block.declare(AmazonMTurkGetAccountBalanceCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mturk.model.GetAccountBalanceResult
}

@Generated
class AmazonMTurkGetAccountBalanceCommand() : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.GetAccountBalanceRequest, com.amazonaws.services.mturk.model.GetAccountBalanceResult> {



	override fun build(): com.amazonaws.services.mturk.model.GetAccountBalanceRequest {
		val input = com.amazonaws.services.mturk.model.GetAccountBalanceRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mturk.model.GetAccountBalanceResult {
	  return com.amazonaws.services.mturk.model.GetAccountBalanceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mturk.model.GetAccountBalanceResult {
		return environment.mturk_requester.getAccountBalance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester get-account-balance")

	}

}


fun AmazonMTurkFunctions.getAssignment(assignmentId: String, init: (AmazonMTurkGetAssignmentCommand.() -> Unit)? = null): com.amazonaws.services.mturk.model.GetAssignmentResult {
	return this.block.declare(AmazonMTurkGetAssignmentCommand(assignmentId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mturk.model.GetAssignmentResult
}

@Generated
class AmazonMTurkGetAssignmentCommand(val assignmentId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.GetAssignmentRequest, com.amazonaws.services.mturk.model.GetAssignmentResult> {



	override fun build(): com.amazonaws.services.mturk.model.GetAssignmentRequest {
		val input = com.amazonaws.services.mturk.model.GetAssignmentRequest()
		input.setAssignmentId(this.assignmentId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mturk.model.GetAssignmentResult {
	  return com.amazonaws.services.mturk.model.GetAssignmentResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mturk.model.GetAssignmentResult {
		return environment.mturk_requester.getAssignment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester get-assignment")
				.argument("assignment-id", assignmentId)
	}

}


fun AmazonMTurkFunctions.getFileUploadURL(assignmentId: String, questionIdentifier: String, init: (AmazonMTurkGetFileUploadURLCommand.() -> Unit)? = null): com.amazonaws.services.mturk.model.GetFileUploadURLResult {
	return this.block.declare(AmazonMTurkGetFileUploadURLCommand(assignmentId, questionIdentifier).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mturk.model.GetFileUploadURLResult
}

@Generated
class AmazonMTurkGetFileUploadURLCommand(val assignmentId: String, val questionIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.GetFileUploadURLRequest, com.amazonaws.services.mturk.model.GetFileUploadURLResult> {



	override fun build(): com.amazonaws.services.mturk.model.GetFileUploadURLRequest {
		val input = com.amazonaws.services.mturk.model.GetFileUploadURLRequest()
		input.setAssignmentId(this.assignmentId)
		input.setQuestionIdentifier(this.questionIdentifier)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mturk.model.GetFileUploadURLResult {
	  return com.amazonaws.services.mturk.model.GetFileUploadURLResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mturk.model.GetFileUploadURLResult {
		return environment.mturk_requester.getFileUploadURL(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester get-file-upload-url")
				.argument("assignment-id", assignmentId)
				.argument("question-identifier", questionIdentifier)
	}

}


fun AmazonMTurkFunctions.getHIT(hITId: String, init: (AmazonMTurkGetHITCommand.() -> Unit)? = null): com.amazonaws.services.mturk.model.GetHITResult {
	return this.block.declare(AmazonMTurkGetHITCommand(hITId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mturk.model.GetHITResult
}

@Generated
class AmazonMTurkGetHITCommand(val hITId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.GetHITRequest, com.amazonaws.services.mturk.model.GetHITResult> {



	override fun build(): com.amazonaws.services.mturk.model.GetHITRequest {
		val input = com.amazonaws.services.mturk.model.GetHITRequest()
		input.setHITId(this.hITId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mturk.model.GetHITResult {
	  return com.amazonaws.services.mturk.model.GetHITResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mturk.model.GetHITResult {
		return environment.mturk_requester.getHIT(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester get-hit")
				.argument("hitid", hITId)
	}

}


fun AmazonMTurkFunctions.getQualificationScore(qualificationTypeId: String, workerId: String, init: (AmazonMTurkGetQualificationScoreCommand.() -> Unit)? = null): com.amazonaws.services.mturk.model.GetQualificationScoreResult {
	return this.block.declare(AmazonMTurkGetQualificationScoreCommand(qualificationTypeId, workerId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mturk.model.GetQualificationScoreResult
}

@Generated
class AmazonMTurkGetQualificationScoreCommand(val qualificationTypeId: String, val workerId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.GetQualificationScoreRequest, com.amazonaws.services.mturk.model.GetQualificationScoreResult> {



	override fun build(): com.amazonaws.services.mturk.model.GetQualificationScoreRequest {
		val input = com.amazonaws.services.mturk.model.GetQualificationScoreRequest()
		input.setQualificationTypeId(this.qualificationTypeId)
		input.setWorkerId(this.workerId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mturk.model.GetQualificationScoreResult {
	  return com.amazonaws.services.mturk.model.GetQualificationScoreResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mturk.model.GetQualificationScoreResult {
		return environment.mturk_requester.getQualificationScore(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester get-qualification-score")
				.argument("qualification-type-id", qualificationTypeId)
				.argument("worker-id", workerId)
	}

}


fun AmazonMTurkFunctions.getQualificationType(qualificationTypeId: String, init: (AmazonMTurkGetQualificationTypeCommand.() -> Unit)? = null): com.amazonaws.services.mturk.model.GetQualificationTypeResult {
	return this.block.declare(AmazonMTurkGetQualificationTypeCommand(qualificationTypeId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mturk.model.GetQualificationTypeResult
}

@Generated
class AmazonMTurkGetQualificationTypeCommand(val qualificationTypeId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.GetQualificationTypeRequest, com.amazonaws.services.mturk.model.GetQualificationTypeResult> {



	override fun build(): com.amazonaws.services.mturk.model.GetQualificationTypeRequest {
		val input = com.amazonaws.services.mturk.model.GetQualificationTypeRequest()
		input.setQualificationTypeId(this.qualificationTypeId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mturk.model.GetQualificationTypeResult {
	  return com.amazonaws.services.mturk.model.GetQualificationTypeResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mturk.model.GetQualificationTypeResult {
		return environment.mturk_requester.getQualificationType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester get-qualification-type")
				.argument("qualification-type-id", qualificationTypeId)
	}

}


fun AmazonMTurkFunctions.listAssignmentsForHIT(hITId: String, init: (AmazonMTurkListAssignmentsForHITCommand.() -> Unit)? = null): com.amazonaws.services.mturk.model.ListAssignmentsForHITResult {
	return this.block.declare(AmazonMTurkListAssignmentsForHITCommand(hITId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mturk.model.ListAssignmentsForHITResult
}

@Generated
class AmazonMTurkListAssignmentsForHITCommand(val hITId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.ListAssignmentsForHITRequest, com.amazonaws.services.mturk.model.ListAssignmentsForHITResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0
	var assignmentStatuses: List<AssignmentStatus>? = null

	override fun build(): com.amazonaws.services.mturk.model.ListAssignmentsForHITRequest {
		val input = com.amazonaws.services.mturk.model.ListAssignmentsForHITRequest()
		input.setHITId(this.hITId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setAssignmentStatuses(this.assignmentStatuses?.map { it.toString() })
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mturk.model.ListAssignmentsForHITResult {
	  return com.amazonaws.services.mturk.model.ListAssignmentsForHITResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mturk.model.ListAssignmentsForHITResult {
		return environment.mturk_requester.listAssignmentsForHIT(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester list-assignments-for-hit")
				.argument("hitid", hITId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("assignment-statuses", assignmentStatuses?.toString())
	}

}


fun AmazonMTurkFunctions.listBonusPayments(init: (AmazonMTurkListBonusPaymentsCommand.() -> Unit)? = null): com.amazonaws.services.mturk.model.ListBonusPaymentsResult {
	return this.block.declare(AmazonMTurkListBonusPaymentsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mturk.model.ListBonusPaymentsResult
}

@Generated
class AmazonMTurkListBonusPaymentsCommand() : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.ListBonusPaymentsRequest, com.amazonaws.services.mturk.model.ListBonusPaymentsResult> {

	var hITId: String? = null
	var assignmentId: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.mturk.model.ListBonusPaymentsRequest {
		val input = com.amazonaws.services.mturk.model.ListBonusPaymentsRequest()
		input.setHITId(this.hITId)
		input.setAssignmentId(this.assignmentId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mturk.model.ListBonusPaymentsResult {
	  return com.amazonaws.services.mturk.model.ListBonusPaymentsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mturk.model.ListBonusPaymentsResult {
		return environment.mturk_requester.listBonusPayments(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester list-bonus-payments")
				.argument("hitid", hITId)
				.argument("assignment-id", assignmentId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonMTurkFunctions.listHITs(init: (AmazonMTurkListHITsCommand.() -> Unit)? = null): com.amazonaws.services.mturk.model.ListHITsResult {
	return this.block.declare(AmazonMTurkListHITsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mturk.model.ListHITsResult
}

@Generated
class AmazonMTurkListHITsCommand() : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.ListHITsRequest, com.amazonaws.services.mturk.model.ListHITsResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.mturk.model.ListHITsRequest {
		val input = com.amazonaws.services.mturk.model.ListHITsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mturk.model.ListHITsResult {
	  return com.amazonaws.services.mturk.model.ListHITsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mturk.model.ListHITsResult {
		return environment.mturk_requester.listHITs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester list-hits")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonMTurkFunctions.listHITsForQualificationType(qualificationTypeId: String, init: (AmazonMTurkListHITsForQualificationTypeCommand.() -> Unit)? = null): com.amazonaws.services.mturk.model.ListHITsForQualificationTypeResult {
	return this.block.declare(AmazonMTurkListHITsForQualificationTypeCommand(qualificationTypeId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mturk.model.ListHITsForQualificationTypeResult
}

@Generated
class AmazonMTurkListHITsForQualificationTypeCommand(val qualificationTypeId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.ListHITsForQualificationTypeRequest, com.amazonaws.services.mturk.model.ListHITsForQualificationTypeResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.mturk.model.ListHITsForQualificationTypeRequest {
		val input = com.amazonaws.services.mturk.model.ListHITsForQualificationTypeRequest()
		input.setQualificationTypeId(this.qualificationTypeId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mturk.model.ListHITsForQualificationTypeResult {
	  return com.amazonaws.services.mturk.model.ListHITsForQualificationTypeResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mturk.model.ListHITsForQualificationTypeResult {
		return environment.mturk_requester.listHITsForQualificationType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester list-hits-for-qualification-type")
				.argument("qualification-type-id", qualificationTypeId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonMTurkFunctions.listQualificationRequests(init: (AmazonMTurkListQualificationRequestsCommand.() -> Unit)? = null): com.amazonaws.services.mturk.model.ListQualificationRequestsResult {
	return this.block.declare(AmazonMTurkListQualificationRequestsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mturk.model.ListQualificationRequestsResult
}

@Generated
class AmazonMTurkListQualificationRequestsCommand() : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.ListQualificationRequestsRequest, com.amazonaws.services.mturk.model.ListQualificationRequestsResult> {

	var qualificationTypeId: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.mturk.model.ListQualificationRequestsRequest {
		val input = com.amazonaws.services.mturk.model.ListQualificationRequestsRequest()
		input.setQualificationTypeId(this.qualificationTypeId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mturk.model.ListQualificationRequestsResult {
	  return com.amazonaws.services.mturk.model.ListQualificationRequestsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mturk.model.ListQualificationRequestsResult {
		return environment.mturk_requester.listQualificationRequests(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester list-qualification-requests")
				.argument("qualification-type-id", qualificationTypeId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonMTurkFunctions.listQualificationTypes(mustBeRequestable: Boolean, init: (AmazonMTurkListQualificationTypesCommand.() -> Unit)? = null): com.amazonaws.services.mturk.model.ListQualificationTypesResult {
	return this.block.declare(AmazonMTurkListQualificationTypesCommand(mustBeRequestable).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mturk.model.ListQualificationTypesResult
}

@Generated
class AmazonMTurkListQualificationTypesCommand(val mustBeRequestable: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.ListQualificationTypesRequest, com.amazonaws.services.mturk.model.ListQualificationTypesResult> {

	var query: String? = null
	var mustBeOwnedByCaller: Boolean? = false
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.mturk.model.ListQualificationTypesRequest {
		val input = com.amazonaws.services.mturk.model.ListQualificationTypesRequest()
		input.setQuery(this.query)
		input.setMustBeRequestable(this.mustBeRequestable)
		input.setMustBeOwnedByCaller(this.mustBeOwnedByCaller)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mturk.model.ListQualificationTypesResult {
	  return com.amazonaws.services.mturk.model.ListQualificationTypesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mturk.model.ListQualificationTypesResult {
		return environment.mturk_requester.listQualificationTypes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester list-qualification-types")
				.argument("query", query)
				.option("must-be-requestable", mustBeRequestable ?: false)
				.option("must-be-owned-by-caller", mustBeOwnedByCaller ?: false)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonMTurkFunctions.listReviewPolicyResultsForHIT(hITId: String, init: (AmazonMTurkListReviewPolicyResultsForHITCommand.() -> Unit)? = null): com.amazonaws.services.mturk.model.ListReviewPolicyResultsForHITResult {
	return this.block.declare(AmazonMTurkListReviewPolicyResultsForHITCommand(hITId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mturk.model.ListReviewPolicyResultsForHITResult
}

@Generated
class AmazonMTurkListReviewPolicyResultsForHITCommand(val hITId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.ListReviewPolicyResultsForHITRequest, com.amazonaws.services.mturk.model.ListReviewPolicyResultsForHITResult> {

	var policyLevels: List<ReviewPolicyLevel>? = null
	var retrieveActions: Boolean? = false
	var retrieveResults: Boolean? = false
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.mturk.model.ListReviewPolicyResultsForHITRequest {
		val input = com.amazonaws.services.mturk.model.ListReviewPolicyResultsForHITRequest()
		input.setHITId(this.hITId)
		input.setPolicyLevels(this.policyLevels?.map { it.toString() })
		input.setRetrieveActions(this.retrieveActions)
		input.setRetrieveResults(this.retrieveResults)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mturk.model.ListReviewPolicyResultsForHITResult {
	  return com.amazonaws.services.mturk.model.ListReviewPolicyResultsForHITResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mturk.model.ListReviewPolicyResultsForHITResult {
		return environment.mturk_requester.listReviewPolicyResultsForHIT(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester list-review-policy-results-for-hit")
				.argument("hitid", hITId)
				.argument("policy-levels", policyLevels?.toString())
				.option("retrieve-actions", retrieveActions ?: false)
				.option("retrieve-results", retrieveResults ?: false)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonMTurkFunctions.listReviewableHITs(init: (AmazonMTurkListReviewableHITsCommand.() -> Unit)? = null): com.amazonaws.services.mturk.model.ListReviewableHITsResult {
	return this.block.declare(AmazonMTurkListReviewableHITsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mturk.model.ListReviewableHITsResult
}

@Generated
class AmazonMTurkListReviewableHITsCommand() : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.ListReviewableHITsRequest, com.amazonaws.services.mturk.model.ListReviewableHITsResult> {

	var hITTypeId: String? = null
	var status: ReviewableHITStatus? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.mturk.model.ListReviewableHITsRequest {
		val input = com.amazonaws.services.mturk.model.ListReviewableHITsRequest()
		input.setHITTypeId(this.hITTypeId)
		input.setStatus(this.status?.toString())
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mturk.model.ListReviewableHITsResult {
	  return com.amazonaws.services.mturk.model.ListReviewableHITsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mturk.model.ListReviewableHITsResult {
		return environment.mturk_requester.listReviewableHITs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester list-reviewable-hits")
				.argument("hittype-id", hITTypeId)
				.argument("status", status?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonMTurkFunctions.listWorkerBlocks(init: (AmazonMTurkListWorkerBlocksCommand.() -> Unit)? = null): com.amazonaws.services.mturk.model.ListWorkerBlocksResult {
	return this.block.declare(AmazonMTurkListWorkerBlocksCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mturk.model.ListWorkerBlocksResult
}

@Generated
class AmazonMTurkListWorkerBlocksCommand() : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.ListWorkerBlocksRequest, com.amazonaws.services.mturk.model.ListWorkerBlocksResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.mturk.model.ListWorkerBlocksRequest {
		val input = com.amazonaws.services.mturk.model.ListWorkerBlocksRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mturk.model.ListWorkerBlocksResult {
	  return com.amazonaws.services.mturk.model.ListWorkerBlocksResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mturk.model.ListWorkerBlocksResult {
		return environment.mturk_requester.listWorkerBlocks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester list-worker-blocks")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonMTurkFunctions.listWorkersWithQualificationType(qualificationTypeId: String, init: (AmazonMTurkListWorkersWithQualificationTypeCommand.() -> Unit)? = null): com.amazonaws.services.mturk.model.ListWorkersWithQualificationTypeResult {
	return this.block.declare(AmazonMTurkListWorkersWithQualificationTypeCommand(qualificationTypeId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mturk.model.ListWorkersWithQualificationTypeResult
}

@Generated
class AmazonMTurkListWorkersWithQualificationTypeCommand(val qualificationTypeId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.ListWorkersWithQualificationTypeRequest, com.amazonaws.services.mturk.model.ListWorkersWithQualificationTypeResult> {

	var status: QualificationStatus? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.mturk.model.ListWorkersWithQualificationTypeRequest {
		val input = com.amazonaws.services.mturk.model.ListWorkersWithQualificationTypeRequest()
		input.setQualificationTypeId(this.qualificationTypeId)
		input.setStatus(this.status?.toString())
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mturk.model.ListWorkersWithQualificationTypeResult {
	  return com.amazonaws.services.mturk.model.ListWorkersWithQualificationTypeResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mturk.model.ListWorkersWithQualificationTypeResult {
		return environment.mturk_requester.listWorkersWithQualificationType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester list-workers-with-qualification-type")
				.argument("qualification-type-id", qualificationTypeId)
				.argument("status", status?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonMTurkFunctions.notifyWorkers(subject: String, messageText: String, workerIds: List<String>, init: (AmazonMTurkNotifyWorkersCommand.() -> Unit)? = null): com.amazonaws.services.mturk.model.NotifyWorkersResult {
	return this.block.declare(AmazonMTurkNotifyWorkersCommand(subject, messageText, workerIds).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mturk.model.NotifyWorkersResult
}

@Generated
class AmazonMTurkNotifyWorkersCommand(val subject: String, val messageText: String, val workerIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.NotifyWorkersRequest, com.amazonaws.services.mturk.model.NotifyWorkersResult> {



	override fun build(): com.amazonaws.services.mturk.model.NotifyWorkersRequest {
		val input = com.amazonaws.services.mturk.model.NotifyWorkersRequest()
		input.setSubject(this.subject)
		input.setMessageText(this.messageText)
		input.setWorkerIds(this.workerIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mturk.model.NotifyWorkersResult {
	  return com.amazonaws.services.mturk.model.NotifyWorkersResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mturk.model.NotifyWorkersResult {
		return environment.mturk_requester.notifyWorkers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester notify-workers")
				.argument("subject", subject)
				.argument("message-text", messageText)
				.argument("worker-ids", workerIds.toString())
	}

}


fun AmazonMTurkFunctions.rejectAssignment(assignmentId: String, requesterFeedback: String, init: (AmazonMTurkRejectAssignmentCommand.() -> Unit)? = null): com.amazonaws.services.mturk.model.RejectAssignmentResult {
	return this.block.declare(AmazonMTurkRejectAssignmentCommand(assignmentId, requesterFeedback).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mturk.model.RejectAssignmentResult
}

@Generated
class AmazonMTurkRejectAssignmentCommand(val assignmentId: String, val requesterFeedback: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.RejectAssignmentRequest, com.amazonaws.services.mturk.model.RejectAssignmentResult> {



	override fun build(): com.amazonaws.services.mturk.model.RejectAssignmentRequest {
		val input = com.amazonaws.services.mturk.model.RejectAssignmentRequest()
		input.setAssignmentId(this.assignmentId)
		input.setRequesterFeedback(this.requesterFeedback)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mturk.model.RejectAssignmentResult {
	  return com.amazonaws.services.mturk.model.RejectAssignmentResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mturk.model.RejectAssignmentResult {
		return environment.mturk_requester.rejectAssignment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester reject-assignment")
				.argument("assignment-id", assignmentId)
				.argument("requester-feedback", requesterFeedback)
	}

}


fun AmazonMTurkFunctions.rejectQualificationRequest(qualificationRequestId: String, init: (AmazonMTurkRejectQualificationRequestCommand.() -> Unit)? = null): com.amazonaws.services.mturk.model.RejectQualificationRequestResult {
	return this.block.declare(AmazonMTurkRejectQualificationRequestCommand(qualificationRequestId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mturk.model.RejectQualificationRequestResult
}

@Generated
class AmazonMTurkRejectQualificationRequestCommand(val qualificationRequestId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.RejectQualificationRequestRequest, com.amazonaws.services.mturk.model.RejectQualificationRequestResult> {

	var reason: String? = null

	override fun build(): com.amazonaws.services.mturk.model.RejectQualificationRequestRequest {
		val input = com.amazonaws.services.mturk.model.RejectQualificationRequestRequest()
		input.setQualificationRequestId(this.qualificationRequestId)
		input.setReason(this.reason)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mturk.model.RejectQualificationRequestResult {
	  return com.amazonaws.services.mturk.model.RejectQualificationRequestResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mturk.model.RejectQualificationRequestResult {
		return environment.mturk_requester.rejectQualificationRequest(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester reject-qualification-request")
				.argument("qualification-request-id", qualificationRequestId)
				.argument("reason", reason)
	}

}


fun AmazonMTurkFunctions.sendBonus(workerId: String, bonusAmount: String, assignmentId: String, reason: String, init: (AmazonMTurkSendBonusCommand.() -> Unit)? = null): com.amazonaws.services.mturk.model.SendBonusResult {
	return this.block.declare(AmazonMTurkSendBonusCommand(workerId, bonusAmount, assignmentId, reason).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mturk.model.SendBonusResult
}

@Generated
class AmazonMTurkSendBonusCommand(val workerId: String, val bonusAmount: String, val assignmentId: String, val reason: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.SendBonusRequest, com.amazonaws.services.mturk.model.SendBonusResult> {

	var uniqueRequestToken: String? = null

	override fun build(): com.amazonaws.services.mturk.model.SendBonusRequest {
		val input = com.amazonaws.services.mturk.model.SendBonusRequest()
		input.setWorkerId(this.workerId)
		input.setBonusAmount(this.bonusAmount)
		input.setAssignmentId(this.assignmentId)
		input.setReason(this.reason)
		input.setUniqueRequestToken(this.uniqueRequestToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mturk.model.SendBonusResult {
	  return com.amazonaws.services.mturk.model.SendBonusResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mturk.model.SendBonusResult {
		return environment.mturk_requester.sendBonus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester send-bonus")
				.argument("worker-id", workerId)
				.argument("bonus-amount", bonusAmount)
				.argument("assignment-id", assignmentId)
				.argument("reason", reason)
				.argument("unique-request-token", uniqueRequestToken)
	}

}


fun AmazonMTurkFunctions.sendTestEventNotification(notification: com.amazonaws.services.mturk.model.NotificationSpecification, testEventType: EventType, init: (AmazonMTurkSendTestEventNotificationCommand.() -> Unit)? = null): com.amazonaws.services.mturk.model.SendTestEventNotificationResult {
	return this.block.declare(AmazonMTurkSendTestEventNotificationCommand(notification, testEventType).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mturk.model.SendTestEventNotificationResult
}

@Generated
class AmazonMTurkSendTestEventNotificationCommand(val notification: com.amazonaws.services.mturk.model.NotificationSpecification, val testEventType: EventType) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.SendTestEventNotificationRequest, com.amazonaws.services.mturk.model.SendTestEventNotificationResult> {



	override fun build(): com.amazonaws.services.mturk.model.SendTestEventNotificationRequest {
		val input = com.amazonaws.services.mturk.model.SendTestEventNotificationRequest()
		input.setNotification(this.notification)
		input.setTestEventType(this.testEventType.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mturk.model.SendTestEventNotificationResult {
	  return com.amazonaws.services.mturk.model.SendTestEventNotificationResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mturk.model.SendTestEventNotificationResult {
		return environment.mturk_requester.sendTestEventNotification(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester send-test-event-notification")
				.argument("notification", notification.toString())
				.argument("test-event-type", testEventType.toString())
	}

}


fun AmazonMTurkFunctions.updateExpirationForHIT(hITId: String, expireAt: java.util.Date, init: (AmazonMTurkUpdateExpirationForHITCommand.() -> Unit)? = null): com.amazonaws.services.mturk.model.UpdateExpirationForHITResult {
	return this.block.declare(AmazonMTurkUpdateExpirationForHITCommand(hITId, expireAt).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mturk.model.UpdateExpirationForHITResult
}

@Generated
class AmazonMTurkUpdateExpirationForHITCommand(val hITId: String, val expireAt: java.util.Date) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.UpdateExpirationForHITRequest, com.amazonaws.services.mturk.model.UpdateExpirationForHITResult> {



	override fun build(): com.amazonaws.services.mturk.model.UpdateExpirationForHITRequest {
		val input = com.amazonaws.services.mturk.model.UpdateExpirationForHITRequest()
		input.setHITId(this.hITId)
		input.setExpireAt(this.expireAt)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mturk.model.UpdateExpirationForHITResult {
	  return com.amazonaws.services.mturk.model.UpdateExpirationForHITResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mturk.model.UpdateExpirationForHITResult {
		return environment.mturk_requester.updateExpirationForHIT(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester update-expiration-for-hit")
				.argument("hitid", hITId)
				.argument("expire-at", expireAt.toString())
	}

}


fun AmazonMTurkFunctions.updateHITReviewStatus(hITId: String, init: (AmazonMTurkUpdateHITReviewStatusCommand.() -> Unit)? = null): com.amazonaws.services.mturk.model.UpdateHITReviewStatusResult {
	return this.block.declare(AmazonMTurkUpdateHITReviewStatusCommand(hITId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mturk.model.UpdateHITReviewStatusResult
}

@Generated
class AmazonMTurkUpdateHITReviewStatusCommand(val hITId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.UpdateHITReviewStatusRequest, com.amazonaws.services.mturk.model.UpdateHITReviewStatusResult> {

	var revert: Boolean? = false

	override fun build(): com.amazonaws.services.mturk.model.UpdateHITReviewStatusRequest {
		val input = com.amazonaws.services.mturk.model.UpdateHITReviewStatusRequest()
		input.setHITId(this.hITId)
		input.setRevert(this.revert)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mturk.model.UpdateHITReviewStatusResult {
	  return com.amazonaws.services.mturk.model.UpdateHITReviewStatusResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mturk.model.UpdateHITReviewStatusResult {
		return environment.mturk_requester.updateHITReviewStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester update-hitreview-status")
				.argument("hitid", hITId)
				.option("revert", revert ?: false)
	}

}


fun AmazonMTurkFunctions.updateHITTypeOfHIT(hITId: String, hITTypeId: String, init: (AmazonMTurkUpdateHITTypeOfHITCommand.() -> Unit)? = null): com.amazonaws.services.mturk.model.UpdateHITTypeOfHITResult {
	return this.block.declare(AmazonMTurkUpdateHITTypeOfHITCommand(hITId, hITTypeId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mturk.model.UpdateHITTypeOfHITResult
}

@Generated
class AmazonMTurkUpdateHITTypeOfHITCommand(val hITId: String, val hITTypeId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.UpdateHITTypeOfHITRequest, com.amazonaws.services.mturk.model.UpdateHITTypeOfHITResult> {



	override fun build(): com.amazonaws.services.mturk.model.UpdateHITTypeOfHITRequest {
		val input = com.amazonaws.services.mturk.model.UpdateHITTypeOfHITRequest()
		input.setHITId(this.hITId)
		input.setHITTypeId(this.hITTypeId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mturk.model.UpdateHITTypeOfHITResult {
	  return com.amazonaws.services.mturk.model.UpdateHITTypeOfHITResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mturk.model.UpdateHITTypeOfHITResult {
		return environment.mturk_requester.updateHITTypeOfHIT(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester update-hittype-of-hit")
				.argument("hitid", hITId)
				.argument("hittype-id", hITTypeId)
	}

}


fun AmazonMTurkFunctions.updateNotificationSettings(hITTypeId: String, init: (AmazonMTurkUpdateNotificationSettingsCommand.() -> Unit)? = null): com.amazonaws.services.mturk.model.UpdateNotificationSettingsResult {
	return this.block.declare(AmazonMTurkUpdateNotificationSettingsCommand(hITTypeId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mturk.model.UpdateNotificationSettingsResult
}

@Generated
class AmazonMTurkUpdateNotificationSettingsCommand(val hITTypeId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.UpdateNotificationSettingsRequest, com.amazonaws.services.mturk.model.UpdateNotificationSettingsResult> {

	var notification: com.amazonaws.services.mturk.model.NotificationSpecification? = null
	var active: Boolean? = false

	override fun build(): com.amazonaws.services.mturk.model.UpdateNotificationSettingsRequest {
		val input = com.amazonaws.services.mturk.model.UpdateNotificationSettingsRequest()
		input.setHITTypeId(this.hITTypeId)
		input.setNotification(this.notification)
		input.setActive(this.active)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mturk.model.UpdateNotificationSettingsResult {
	  return com.amazonaws.services.mturk.model.UpdateNotificationSettingsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mturk.model.UpdateNotificationSettingsResult {
		return environment.mturk_requester.updateNotificationSettings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester update-notification-settings")
				.argument("hittype-id", hITTypeId)
				.argument("notification", notification?.toString())
				.option("active", active ?: false)
	}

}


fun AmazonMTurkFunctions.updateQualificationType(qualificationTypeId: String, init: (AmazonMTurkUpdateQualificationTypeCommand.() -> Unit)? = null): com.amazonaws.services.mturk.model.UpdateQualificationTypeResult {
	return this.block.declare(AmazonMTurkUpdateQualificationTypeCommand(qualificationTypeId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mturk.model.UpdateQualificationTypeResult
}

@Generated
class AmazonMTurkUpdateQualificationTypeCommand(val qualificationTypeId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.UpdateQualificationTypeRequest, com.amazonaws.services.mturk.model.UpdateQualificationTypeResult> {

	var description: String? = null
	var qualificationTypeStatus: QualificationTypeStatus? = null
	var test: String? = null
	var answerKey: String? = null
	var testDurationInSeconds: Long? = 0L
	var retryDelayInSeconds: Long? = 0L
	var autoGranted: Boolean? = false
	var autoGrantedValue: Int? = 0

	override fun build(): com.amazonaws.services.mturk.model.UpdateQualificationTypeRequest {
		val input = com.amazonaws.services.mturk.model.UpdateQualificationTypeRequest()
		input.setQualificationTypeId(this.qualificationTypeId)
		input.setDescription(this.description)
		input.setQualificationTypeStatus(this.qualificationTypeStatus?.toString())
		input.setTest(this.test)
		input.setAnswerKey(this.answerKey)
		input.setTestDurationInSeconds(this.testDurationInSeconds)
		input.setRetryDelayInSeconds(this.retryDelayInSeconds)
		input.setAutoGranted(this.autoGranted)
		input.setAutoGrantedValue(this.autoGrantedValue)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mturk.model.UpdateQualificationTypeResult {
	  return com.amazonaws.services.mturk.model.UpdateQualificationTypeResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mturk.model.UpdateQualificationTypeResult {
		return environment.mturk_requester.updateQualificationType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester update-qualification-type")
				.argument("qualification-type-id", qualificationTypeId)
				.argument("description", description)
				.argument("qualification-type-status", qualificationTypeStatus?.toString())
				.argument("test", test)
				.argument("answer-key", answerKey)
				.argument("test-duration-in-seconds", testDurationInSeconds?.toString())
				.argument("retry-delay-in-seconds", retryDelayInSeconds?.toString())
				.option("auto-granted", autoGranted ?: false)
				.argument("auto-granted-value", autoGrantedValue?.toString())
	}

}
