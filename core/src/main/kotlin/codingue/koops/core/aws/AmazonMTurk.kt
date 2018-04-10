
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.mturk.AmazonMTurk
import com.amazonaws.services.mturk.model.*

var codingue.koops.core.Environment.mturk_requester: AmazonMTurk
	get() = this.capabilities[AmazonMTurk::class.java.name] as AmazonMTurk
	set(mturk_requester) {
		this.capabilities[AmazonMTurk::class.java.name] = mturk_requester
	}

@Generated
class AmazonMTurkFunctions(val block: Block)

infix fun AwsContinuation.mturk_requester(init: AmazonMTurkFunctions.() -> Unit) {
	AmazonMTurkFunctions(shell).apply(init)
}

			

fun AmazonMTurkFunctions.acceptQualificationRequest(qualificationRequestId: String, init: AmazonMTurkAcceptQualificationRequestCommand.() -> Unit) {
	this.block.declare(AmazonMTurkAcceptQualificationRequestCommand(qualificationRequestId).apply(init))
}

@Generated
class AmazonMTurkAcceptQualificationRequestCommand(val qualificationRequestId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.AcceptQualificationRequestRequest> {

	var integerValue: Int? = 0

	override fun build(): com.amazonaws.services.mturk.model.AcceptQualificationRequestRequest {
		val input = com.amazonaws.services.mturk.model.AcceptQualificationRequestRequest()
		input.setQualificationRequestId(this.qualificationRequestId)
		input.setIntegerValue(this.integerValue)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mturk_requester.acceptQualificationRequest(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester accept-qualification-request")
				.argument("qualification-request-id", qualificationRequestId)
				.argument("integer-value", integerValue?.toString())
	}

}


fun AmazonMTurkFunctions.approveAssignment(assignmentId: String, init: AmazonMTurkApproveAssignmentCommand.() -> Unit) {
	this.block.declare(AmazonMTurkApproveAssignmentCommand(assignmentId).apply(init))
}

@Generated
class AmazonMTurkApproveAssignmentCommand(val assignmentId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.ApproveAssignmentRequest> {

	var requesterFeedback: String? = null
	var overrideRejection: Boolean? = false

	override fun build(): com.amazonaws.services.mturk.model.ApproveAssignmentRequest {
		val input = com.amazonaws.services.mturk.model.ApproveAssignmentRequest()
		input.setAssignmentId(this.assignmentId)
		input.setRequesterFeedback(this.requesterFeedback)
		input.setOverrideRejection(this.overrideRejection)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mturk_requester.approveAssignment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester approve-assignment")
				.argument("assignment-id", assignmentId)
				.argument("requester-feedback", requesterFeedback)
				.option("override-rejection", overrideRejection ?: false)
	}

}


fun AmazonMTurkFunctions.associateQualificationWithWorker(qualificationTypeId: String, workerId: String, init: AmazonMTurkAssociateQualificationWithWorkerCommand.() -> Unit) {
	this.block.declare(AmazonMTurkAssociateQualificationWithWorkerCommand(qualificationTypeId, workerId).apply(init))
}

@Generated
class AmazonMTurkAssociateQualificationWithWorkerCommand(val qualificationTypeId: String, val workerId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.AssociateQualificationWithWorkerRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mturk_requester.associateQualificationWithWorker(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester associate-qualification-with-worker")
				.argument("qualification-type-id", qualificationTypeId)
				.argument("worker-id", workerId)
				.argument("integer-value", integerValue?.toString())
				.option("send-notification", sendNotification ?: false)
	}

}


fun AmazonMTurkFunctions.createAdditionalAssignmentsForHIT(hITId: String, numberOfAdditionalAssignments: Int, init: AmazonMTurkCreateAdditionalAssignmentsForHITCommand.() -> Unit) {
	this.block.declare(AmazonMTurkCreateAdditionalAssignmentsForHITCommand(hITId, numberOfAdditionalAssignments).apply(init))
}

@Generated
class AmazonMTurkCreateAdditionalAssignmentsForHITCommand(val hITId: String, val numberOfAdditionalAssignments: Int) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.CreateAdditionalAssignmentsForHITRequest> {

	var uniqueRequestToken: String? = null

	override fun build(): com.amazonaws.services.mturk.model.CreateAdditionalAssignmentsForHITRequest {
		val input = com.amazonaws.services.mturk.model.CreateAdditionalAssignmentsForHITRequest()
		input.setHITId(this.hITId)
		input.setNumberOfAdditionalAssignments(this.numberOfAdditionalAssignments)
		input.setUniqueRequestToken(this.uniqueRequestToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mturk_requester.createAdditionalAssignmentsForHIT(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester create-additional-assignments-for-hit")
				.argument("hitid", hITId)
				.argument("number-of-additional-assignments", numberOfAdditionalAssignments.toString())
				.argument("unique-request-token", uniqueRequestToken)
	}

}


fun AmazonMTurkFunctions.createHIT(lifetimeInSeconds: Long, assignmentDurationInSeconds: Long, reward: String, title: String, description: String, init: AmazonMTurkCreateHITCommand.() -> Unit) {
	this.block.declare(AmazonMTurkCreateHITCommand(lifetimeInSeconds, assignmentDurationInSeconds, reward, title, description).apply(init))
}

@Generated
class AmazonMTurkCreateHITCommand(val lifetimeInSeconds: Long, val assignmentDurationInSeconds: Long, val reward: String, val title: String, val description: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.CreateHITRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mturk_requester.createHIT(build())
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


fun AmazonMTurkFunctions.createHITType(assignmentDurationInSeconds: Long, reward: String, title: String, description: String, init: AmazonMTurkCreateHITTypeCommand.() -> Unit) {
	this.block.declare(AmazonMTurkCreateHITTypeCommand(assignmentDurationInSeconds, reward, title, description).apply(init))
}

@Generated
class AmazonMTurkCreateHITTypeCommand(val assignmentDurationInSeconds: Long, val reward: String, val title: String, val description: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.CreateHITTypeRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mturk_requester.createHITType(build())
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


fun AmazonMTurkFunctions.createHITWithHITType(hITTypeId: String, lifetimeInSeconds: Long, init: AmazonMTurkCreateHITWithHITTypeCommand.() -> Unit) {
	this.block.declare(AmazonMTurkCreateHITWithHITTypeCommand(hITTypeId, lifetimeInSeconds).apply(init))
}

@Generated
class AmazonMTurkCreateHITWithHITTypeCommand(val hITTypeId: String, val lifetimeInSeconds: Long) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.CreateHITWithHITTypeRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mturk_requester.createHITWithHITType(build())
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


fun AmazonMTurkFunctions.createQualificationType(name: String, description: String, qualificationTypeStatus: QualificationTypeStatus, init: AmazonMTurkCreateQualificationTypeCommand.() -> Unit) {
	this.block.declare(AmazonMTurkCreateQualificationTypeCommand(name, description, qualificationTypeStatus).apply(init))
}

@Generated
class AmazonMTurkCreateQualificationTypeCommand(val name: String, val description: String, val qualificationTypeStatus: QualificationTypeStatus) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.CreateQualificationTypeRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mturk_requester.createQualificationType(build())
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


fun AmazonMTurkFunctions.createWorkerBlock(workerId: String, reason: String, init: AmazonMTurkCreateWorkerBlockCommand.() -> Unit) {
	this.block.declare(AmazonMTurkCreateWorkerBlockCommand(workerId, reason).apply(init))
}

@Generated
class AmazonMTurkCreateWorkerBlockCommand(val workerId: String, val reason: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.CreateWorkerBlockRequest> {



	override fun build(): com.amazonaws.services.mturk.model.CreateWorkerBlockRequest {
		val input = com.amazonaws.services.mturk.model.CreateWorkerBlockRequest()
		input.setWorkerId(this.workerId)
		input.setReason(this.reason)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mturk_requester.createWorkerBlock(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester create-worker-block")
				.argument("worker-id", workerId)
				.argument("reason", reason)
	}

}


fun AmazonMTurkFunctions.deleteHIT(hITId: String, init: AmazonMTurkDeleteHITCommand.() -> Unit) {
	this.block.declare(AmazonMTurkDeleteHITCommand(hITId).apply(init))
}

@Generated
class AmazonMTurkDeleteHITCommand(val hITId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.DeleteHITRequest> {



	override fun build(): com.amazonaws.services.mturk.model.DeleteHITRequest {
		val input = com.amazonaws.services.mturk.model.DeleteHITRequest()
		input.setHITId(this.hITId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mturk_requester.deleteHIT(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester delete-hit")
				.argument("hitid", hITId)
	}

}


fun AmazonMTurkFunctions.deleteQualificationType(qualificationTypeId: String, init: AmazonMTurkDeleteQualificationTypeCommand.() -> Unit) {
	this.block.declare(AmazonMTurkDeleteQualificationTypeCommand(qualificationTypeId).apply(init))
}

@Generated
class AmazonMTurkDeleteQualificationTypeCommand(val qualificationTypeId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.DeleteQualificationTypeRequest> {



	override fun build(): com.amazonaws.services.mturk.model.DeleteQualificationTypeRequest {
		val input = com.amazonaws.services.mturk.model.DeleteQualificationTypeRequest()
		input.setQualificationTypeId(this.qualificationTypeId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mturk_requester.deleteQualificationType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester delete-qualification-type")
				.argument("qualification-type-id", qualificationTypeId)
	}

}


fun AmazonMTurkFunctions.deleteWorkerBlock(workerId: String, init: AmazonMTurkDeleteWorkerBlockCommand.() -> Unit) {
	this.block.declare(AmazonMTurkDeleteWorkerBlockCommand(workerId).apply(init))
}

@Generated
class AmazonMTurkDeleteWorkerBlockCommand(val workerId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.DeleteWorkerBlockRequest> {

	var reason: String? = null

	override fun build(): com.amazonaws.services.mturk.model.DeleteWorkerBlockRequest {
		val input = com.amazonaws.services.mturk.model.DeleteWorkerBlockRequest()
		input.setWorkerId(this.workerId)
		input.setReason(this.reason)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mturk_requester.deleteWorkerBlock(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester delete-worker-block")
				.argument("worker-id", workerId)
				.argument("reason", reason)
	}

}


fun AmazonMTurkFunctions.disassociateQualificationFromWorker(workerId: String, qualificationTypeId: String, init: AmazonMTurkDisassociateQualificationFromWorkerCommand.() -> Unit) {
	this.block.declare(AmazonMTurkDisassociateQualificationFromWorkerCommand(workerId, qualificationTypeId).apply(init))
}

@Generated
class AmazonMTurkDisassociateQualificationFromWorkerCommand(val workerId: String, val qualificationTypeId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.DisassociateQualificationFromWorkerRequest> {

	var reason: String? = null

	override fun build(): com.amazonaws.services.mturk.model.DisassociateQualificationFromWorkerRequest {
		val input = com.amazonaws.services.mturk.model.DisassociateQualificationFromWorkerRequest()
		input.setWorkerId(this.workerId)
		input.setQualificationTypeId(this.qualificationTypeId)
		input.setReason(this.reason)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mturk_requester.disassociateQualificationFromWorker(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester disassociate-qualification-from-worker")
				.argument("worker-id", workerId)
				.argument("qualification-type-id", qualificationTypeId)
				.argument("reason", reason)
	}

}


fun AmazonMTurkFunctions.getAccountBalance(init: AmazonMTurkGetAccountBalanceCommand.() -> Unit) {
	this.block.declare(AmazonMTurkGetAccountBalanceCommand().apply(init))
}

@Generated
class AmazonMTurkGetAccountBalanceCommand() : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.GetAccountBalanceRequest> {



	override fun build(): com.amazonaws.services.mturk.model.GetAccountBalanceRequest {
		val input = com.amazonaws.services.mturk.model.GetAccountBalanceRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mturk_requester.getAccountBalance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester get-account-balance")

	}

}


fun AmazonMTurkFunctions.getAssignment(assignmentId: String, init: AmazonMTurkGetAssignmentCommand.() -> Unit) {
	this.block.declare(AmazonMTurkGetAssignmentCommand(assignmentId).apply(init))
}

@Generated
class AmazonMTurkGetAssignmentCommand(val assignmentId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.GetAssignmentRequest> {



	override fun build(): com.amazonaws.services.mturk.model.GetAssignmentRequest {
		val input = com.amazonaws.services.mturk.model.GetAssignmentRequest()
		input.setAssignmentId(this.assignmentId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mturk_requester.getAssignment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester get-assignment")
				.argument("assignment-id", assignmentId)
	}

}


fun AmazonMTurkFunctions.getFileUploadURL(assignmentId: String, questionIdentifier: String, init: AmazonMTurkGetFileUploadURLCommand.() -> Unit) {
	this.block.declare(AmazonMTurkGetFileUploadURLCommand(assignmentId, questionIdentifier).apply(init))
}

@Generated
class AmazonMTurkGetFileUploadURLCommand(val assignmentId: String, val questionIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.GetFileUploadURLRequest> {



	override fun build(): com.amazonaws.services.mturk.model.GetFileUploadURLRequest {
		val input = com.amazonaws.services.mturk.model.GetFileUploadURLRequest()
		input.setAssignmentId(this.assignmentId)
		input.setQuestionIdentifier(this.questionIdentifier)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mturk_requester.getFileUploadURL(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester get-file-upload-url")
				.argument("assignment-id", assignmentId)
				.argument("question-identifier", questionIdentifier)
	}

}


fun AmazonMTurkFunctions.getHIT(hITId: String, init: AmazonMTurkGetHITCommand.() -> Unit) {
	this.block.declare(AmazonMTurkGetHITCommand(hITId).apply(init))
}

@Generated
class AmazonMTurkGetHITCommand(val hITId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.GetHITRequest> {



	override fun build(): com.amazonaws.services.mturk.model.GetHITRequest {
		val input = com.amazonaws.services.mturk.model.GetHITRequest()
		input.setHITId(this.hITId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mturk_requester.getHIT(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester get-hit")
				.argument("hitid", hITId)
	}

}


fun AmazonMTurkFunctions.getQualificationScore(qualificationTypeId: String, workerId: String, init: AmazonMTurkGetQualificationScoreCommand.() -> Unit) {
	this.block.declare(AmazonMTurkGetQualificationScoreCommand(qualificationTypeId, workerId).apply(init))
}

@Generated
class AmazonMTurkGetQualificationScoreCommand(val qualificationTypeId: String, val workerId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.GetQualificationScoreRequest> {



	override fun build(): com.amazonaws.services.mturk.model.GetQualificationScoreRequest {
		val input = com.amazonaws.services.mturk.model.GetQualificationScoreRequest()
		input.setQualificationTypeId(this.qualificationTypeId)
		input.setWorkerId(this.workerId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mturk_requester.getQualificationScore(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester get-qualification-score")
				.argument("qualification-type-id", qualificationTypeId)
				.argument("worker-id", workerId)
	}

}


fun AmazonMTurkFunctions.getQualificationType(qualificationTypeId: String, init: AmazonMTurkGetQualificationTypeCommand.() -> Unit) {
	this.block.declare(AmazonMTurkGetQualificationTypeCommand(qualificationTypeId).apply(init))
}

@Generated
class AmazonMTurkGetQualificationTypeCommand(val qualificationTypeId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.GetQualificationTypeRequest> {



	override fun build(): com.amazonaws.services.mturk.model.GetQualificationTypeRequest {
		val input = com.amazonaws.services.mturk.model.GetQualificationTypeRequest()
		input.setQualificationTypeId(this.qualificationTypeId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mturk_requester.getQualificationType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester get-qualification-type")
				.argument("qualification-type-id", qualificationTypeId)
	}

}


fun AmazonMTurkFunctions.listAssignmentsForHIT(hITId: String, init: AmazonMTurkListAssignmentsForHITCommand.() -> Unit) {
	this.block.declare(AmazonMTurkListAssignmentsForHITCommand(hITId).apply(init))
}

@Generated
class AmazonMTurkListAssignmentsForHITCommand(val hITId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.ListAssignmentsForHITRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mturk_requester.listAssignmentsForHIT(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester list-assignments-for-hit")
				.argument("hitid", hITId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("assignment-statuses", assignmentStatuses?.toString())
	}

}


fun AmazonMTurkFunctions.listBonusPayments(init: AmazonMTurkListBonusPaymentsCommand.() -> Unit) {
	this.block.declare(AmazonMTurkListBonusPaymentsCommand().apply(init))
}

@Generated
class AmazonMTurkListBonusPaymentsCommand() : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.ListBonusPaymentsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mturk_requester.listBonusPayments(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester list-bonus-payments")
				.argument("hitid", hITId)
				.argument("assignment-id", assignmentId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonMTurkFunctions.listHITs(init: AmazonMTurkListHITsCommand.() -> Unit) {
	this.block.declare(AmazonMTurkListHITsCommand().apply(init))
}

@Generated
class AmazonMTurkListHITsCommand() : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.ListHITsRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.mturk.model.ListHITsRequest {
		val input = com.amazonaws.services.mturk.model.ListHITsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mturk_requester.listHITs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester list-hits")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonMTurkFunctions.listHITsForQualificationType(qualificationTypeId: String, init: AmazonMTurkListHITsForQualificationTypeCommand.() -> Unit) {
	this.block.declare(AmazonMTurkListHITsForQualificationTypeCommand(qualificationTypeId).apply(init))
}

@Generated
class AmazonMTurkListHITsForQualificationTypeCommand(val qualificationTypeId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.ListHITsForQualificationTypeRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.mturk.model.ListHITsForQualificationTypeRequest {
		val input = com.amazonaws.services.mturk.model.ListHITsForQualificationTypeRequest()
		input.setQualificationTypeId(this.qualificationTypeId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mturk_requester.listHITsForQualificationType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester list-hits-for-qualification-type")
				.argument("qualification-type-id", qualificationTypeId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonMTurkFunctions.listQualificationRequests(init: AmazonMTurkListQualificationRequestsCommand.() -> Unit) {
	this.block.declare(AmazonMTurkListQualificationRequestsCommand().apply(init))
}

@Generated
class AmazonMTurkListQualificationRequestsCommand() : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.ListQualificationRequestsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mturk_requester.listQualificationRequests(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester list-qualification-requests")
				.argument("qualification-type-id", qualificationTypeId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonMTurkFunctions.listQualificationTypes(mustBeRequestable: Boolean, init: AmazonMTurkListQualificationTypesCommand.() -> Unit) {
	this.block.declare(AmazonMTurkListQualificationTypesCommand(mustBeRequestable).apply(init))
}

@Generated
class AmazonMTurkListQualificationTypesCommand(val mustBeRequestable: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.ListQualificationTypesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mturk_requester.listQualificationTypes(build())
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


fun AmazonMTurkFunctions.listReviewPolicyResultsForHIT(hITId: String, init: AmazonMTurkListReviewPolicyResultsForHITCommand.() -> Unit) {
	this.block.declare(AmazonMTurkListReviewPolicyResultsForHITCommand(hITId).apply(init))
}

@Generated
class AmazonMTurkListReviewPolicyResultsForHITCommand(val hITId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.ListReviewPolicyResultsForHITRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mturk_requester.listReviewPolicyResultsForHIT(build())
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


fun AmazonMTurkFunctions.listReviewableHITs(init: AmazonMTurkListReviewableHITsCommand.() -> Unit) {
	this.block.declare(AmazonMTurkListReviewableHITsCommand().apply(init))
}

@Generated
class AmazonMTurkListReviewableHITsCommand() : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.ListReviewableHITsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mturk_requester.listReviewableHITs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester list-reviewable-hits")
				.argument("hittype-id", hITTypeId)
				.argument("status", status?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonMTurkFunctions.listWorkerBlocks(init: AmazonMTurkListWorkerBlocksCommand.() -> Unit) {
	this.block.declare(AmazonMTurkListWorkerBlocksCommand().apply(init))
}

@Generated
class AmazonMTurkListWorkerBlocksCommand() : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.ListWorkerBlocksRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.mturk.model.ListWorkerBlocksRequest {
		val input = com.amazonaws.services.mturk.model.ListWorkerBlocksRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mturk_requester.listWorkerBlocks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester list-worker-blocks")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonMTurkFunctions.listWorkersWithQualificationType(qualificationTypeId: String, init: AmazonMTurkListWorkersWithQualificationTypeCommand.() -> Unit) {
	this.block.declare(AmazonMTurkListWorkersWithQualificationTypeCommand(qualificationTypeId).apply(init))
}

@Generated
class AmazonMTurkListWorkersWithQualificationTypeCommand(val qualificationTypeId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.ListWorkersWithQualificationTypeRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mturk_requester.listWorkersWithQualificationType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester list-workers-with-qualification-type")
				.argument("qualification-type-id", qualificationTypeId)
				.argument("status", status?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonMTurkFunctions.notifyWorkers(subject: String, messageText: String, workerIds: List<String>, init: AmazonMTurkNotifyWorkersCommand.() -> Unit) {
	this.block.declare(AmazonMTurkNotifyWorkersCommand(subject, messageText, workerIds).apply(init))
}

@Generated
class AmazonMTurkNotifyWorkersCommand(val subject: String, val messageText: String, val workerIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.NotifyWorkersRequest> {



	override fun build(): com.amazonaws.services.mturk.model.NotifyWorkersRequest {
		val input = com.amazonaws.services.mturk.model.NotifyWorkersRequest()
		input.setSubject(this.subject)
		input.setMessageText(this.messageText)
		input.setWorkerIds(this.workerIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mturk_requester.notifyWorkers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester notify-workers")
				.argument("subject", subject)
				.argument("message-text", messageText)
				.argument("worker-ids", workerIds.toString())
	}

}


fun AmazonMTurkFunctions.rejectAssignment(assignmentId: String, requesterFeedback: String, init: AmazonMTurkRejectAssignmentCommand.() -> Unit) {
	this.block.declare(AmazonMTurkRejectAssignmentCommand(assignmentId, requesterFeedback).apply(init))
}

@Generated
class AmazonMTurkRejectAssignmentCommand(val assignmentId: String, val requesterFeedback: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.RejectAssignmentRequest> {



	override fun build(): com.amazonaws.services.mturk.model.RejectAssignmentRequest {
		val input = com.amazonaws.services.mturk.model.RejectAssignmentRequest()
		input.setAssignmentId(this.assignmentId)
		input.setRequesterFeedback(this.requesterFeedback)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mturk_requester.rejectAssignment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester reject-assignment")
				.argument("assignment-id", assignmentId)
				.argument("requester-feedback", requesterFeedback)
	}

}


fun AmazonMTurkFunctions.rejectQualificationRequest(qualificationRequestId: String, init: AmazonMTurkRejectQualificationRequestCommand.() -> Unit) {
	this.block.declare(AmazonMTurkRejectQualificationRequestCommand(qualificationRequestId).apply(init))
}

@Generated
class AmazonMTurkRejectQualificationRequestCommand(val qualificationRequestId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.RejectQualificationRequestRequest> {

	var reason: String? = null

	override fun build(): com.amazonaws.services.mturk.model.RejectQualificationRequestRequest {
		val input = com.amazonaws.services.mturk.model.RejectQualificationRequestRequest()
		input.setQualificationRequestId(this.qualificationRequestId)
		input.setReason(this.reason)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mturk_requester.rejectQualificationRequest(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester reject-qualification-request")
				.argument("qualification-request-id", qualificationRequestId)
				.argument("reason", reason)
	}

}


fun AmazonMTurkFunctions.sendBonus(workerId: String, bonusAmount: String, assignmentId: String, reason: String, init: AmazonMTurkSendBonusCommand.() -> Unit) {
	this.block.declare(AmazonMTurkSendBonusCommand(workerId, bonusAmount, assignmentId, reason).apply(init))
}

@Generated
class AmazonMTurkSendBonusCommand(val workerId: String, val bonusAmount: String, val assignmentId: String, val reason: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.SendBonusRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mturk_requester.sendBonus(build())
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


fun AmazonMTurkFunctions.sendTestEventNotification(notification: com.amazonaws.services.mturk.model.NotificationSpecification, testEventType: EventType, init: AmazonMTurkSendTestEventNotificationCommand.() -> Unit) {
	this.block.declare(AmazonMTurkSendTestEventNotificationCommand(notification, testEventType).apply(init))
}

@Generated
class AmazonMTurkSendTestEventNotificationCommand(val notification: com.amazonaws.services.mturk.model.NotificationSpecification, val testEventType: EventType) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.SendTestEventNotificationRequest> {



	override fun build(): com.amazonaws.services.mturk.model.SendTestEventNotificationRequest {
		val input = com.amazonaws.services.mturk.model.SendTestEventNotificationRequest()
		input.setNotification(this.notification)
		input.setTestEventType(this.testEventType.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mturk_requester.sendTestEventNotification(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester send-test-event-notification")
				.argument("notification", notification.toString())
				.argument("test-event-type", testEventType.toString())
	}

}


fun AmazonMTurkFunctions.updateExpirationForHIT(hITId: String, expireAt: java.util.Date, init: AmazonMTurkUpdateExpirationForHITCommand.() -> Unit) {
	this.block.declare(AmazonMTurkUpdateExpirationForHITCommand(hITId, expireAt).apply(init))
}

@Generated
class AmazonMTurkUpdateExpirationForHITCommand(val hITId: String, val expireAt: java.util.Date) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.UpdateExpirationForHITRequest> {



	override fun build(): com.amazonaws.services.mturk.model.UpdateExpirationForHITRequest {
		val input = com.amazonaws.services.mturk.model.UpdateExpirationForHITRequest()
		input.setHITId(this.hITId)
		input.setExpireAt(this.expireAt)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mturk_requester.updateExpirationForHIT(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester update-expiration-for-hit")
				.argument("hitid", hITId)
				.argument("expire-at", expireAt.toString())
	}

}


fun AmazonMTurkFunctions.updateHITReviewStatus(hITId: String, init: AmazonMTurkUpdateHITReviewStatusCommand.() -> Unit) {
	this.block.declare(AmazonMTurkUpdateHITReviewStatusCommand(hITId).apply(init))
}

@Generated
class AmazonMTurkUpdateHITReviewStatusCommand(val hITId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.UpdateHITReviewStatusRequest> {

	var revert: Boolean? = false

	override fun build(): com.amazonaws.services.mturk.model.UpdateHITReviewStatusRequest {
		val input = com.amazonaws.services.mturk.model.UpdateHITReviewStatusRequest()
		input.setHITId(this.hITId)
		input.setRevert(this.revert)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mturk_requester.updateHITReviewStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester update-hitreview-status")
				.argument("hitid", hITId)
				.option("revert", revert ?: false)
	}

}


fun AmazonMTurkFunctions.updateHITTypeOfHIT(hITId: String, hITTypeId: String, init: AmazonMTurkUpdateHITTypeOfHITCommand.() -> Unit) {
	this.block.declare(AmazonMTurkUpdateHITTypeOfHITCommand(hITId, hITTypeId).apply(init))
}

@Generated
class AmazonMTurkUpdateHITTypeOfHITCommand(val hITId: String, val hITTypeId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.UpdateHITTypeOfHITRequest> {



	override fun build(): com.amazonaws.services.mturk.model.UpdateHITTypeOfHITRequest {
		val input = com.amazonaws.services.mturk.model.UpdateHITTypeOfHITRequest()
		input.setHITId(this.hITId)
		input.setHITTypeId(this.hITTypeId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mturk_requester.updateHITTypeOfHIT(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester update-hittype-of-hit")
				.argument("hitid", hITId)
				.argument("hittype-id", hITTypeId)
	}

}


fun AmazonMTurkFunctions.updateNotificationSettings(hITTypeId: String, init: AmazonMTurkUpdateNotificationSettingsCommand.() -> Unit) {
	this.block.declare(AmazonMTurkUpdateNotificationSettingsCommand(hITTypeId).apply(init))
}

@Generated
class AmazonMTurkUpdateNotificationSettingsCommand(val hITTypeId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.UpdateNotificationSettingsRequest> {

	var notification: com.amazonaws.services.mturk.model.NotificationSpecification? = null
	var active: Boolean? = false

	override fun build(): com.amazonaws.services.mturk.model.UpdateNotificationSettingsRequest {
		val input = com.amazonaws.services.mturk.model.UpdateNotificationSettingsRequest()
		input.setHITTypeId(this.hITTypeId)
		input.setNotification(this.notification)
		input.setActive(this.active)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mturk_requester.updateNotificationSettings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mturk-requester update-notification-settings")
				.argument("hittype-id", hITTypeId)
				.argument("notification", notification?.toString())
				.option("active", active ?: false)
	}

}


fun AmazonMTurkFunctions.updateQualificationType(qualificationTypeId: String, init: AmazonMTurkUpdateQualificationTypeCommand.() -> Unit) {
	this.block.declare(AmazonMTurkUpdateQualificationTypeCommand(qualificationTypeId).apply(init))
}

@Generated
class AmazonMTurkUpdateQualificationTypeCommand(val qualificationTypeId: String) : AmazonWebServiceCommand<com.amazonaws.services.mturk.model.UpdateQualificationTypeRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mturk_requester.updateQualificationType(build())
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
