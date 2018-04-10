
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.iot.AWSIot
import com.amazonaws.services.iot.model.*

var codingue.koops.core.Environment.execute_api: AWSIot
	get() = this.capabilities[AWSIot::class.java.name] as AWSIot
	set(execute_api) {
		this.capabilities[AWSIot::class.java.name] = execute_api
	}

@Generated
class AWSIotFunctions(val block: Block)

infix fun AwsContinuation.execute_api(init: AWSIotFunctions.() -> Unit) {
	AWSIotFunctions(shell).apply(init)
}

			

fun AWSIotFunctions.acceptCertificateTransfer(init: AWSIotAcceptCertificateTransferCommand.() -> Unit) {
	this.block.declare(AWSIotAcceptCertificateTransferCommand().apply(init))
}

@Generated
class AWSIotAcceptCertificateTransferCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.AcceptCertificateTransferRequest> {

	var certificateId: String? = null
	var setAsActive: Boolean? = false

	override fun build(): com.amazonaws.services.iot.model.AcceptCertificateTransferRequest {
		val input = com.amazonaws.services.iot.model.AcceptCertificateTransferRequest()
		input.setCertificateId(this.certificateId)
		input.setSetAsActive(this.setAsActive)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.acceptCertificateTransfer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api accept-certificate-transfer")
				.argument("certificate-id", certificateId)
				.option("set-as-active", setAsActive ?: false)
	}

}


fun AWSIotFunctions.addThingToThingGroup(init: AWSIotAddThingToThingGroupCommand.() -> Unit) {
	this.block.declare(AWSIotAddThingToThingGroupCommand().apply(init))
}

@Generated
class AWSIotAddThingToThingGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.AddThingToThingGroupRequest> {

	var thingGroupName: String? = null
	var thingGroupArn: String? = null
	var thingName: String? = null
	var thingArn: String? = null

	override fun build(): com.amazonaws.services.iot.model.AddThingToThingGroupRequest {
		val input = com.amazonaws.services.iot.model.AddThingToThingGroupRequest()
		input.setThingGroupName(this.thingGroupName)
		input.setThingGroupArn(this.thingGroupArn)
		input.setThingName(this.thingName)
		input.setThingArn(this.thingArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.addThingToThingGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api add-thing-to-thing-group")
				.argument("thing-group-name", thingGroupName)
				.argument("thing-group-arn", thingGroupArn)
				.argument("thing-name", thingName)
				.argument("thing-arn", thingArn)
	}

}


fun AWSIotFunctions.associateTargetsWithJob(init: AWSIotAssociateTargetsWithJobCommand.() -> Unit) {
	this.block.declare(AWSIotAssociateTargetsWithJobCommand().apply(init))
}

@Generated
class AWSIotAssociateTargetsWithJobCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.AssociateTargetsWithJobRequest> {

	var targets: List<String>? = null
	var jobId: String? = null
	var comment: String? = null

	override fun build(): com.amazonaws.services.iot.model.AssociateTargetsWithJobRequest {
		val input = com.amazonaws.services.iot.model.AssociateTargetsWithJobRequest()
		input.setTargets(this.targets)
		input.setJobId(this.jobId)
		input.setComment(this.comment)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.associateTargetsWithJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api associate-targets-with-job")
				.argument("targets", targets?.toString())
				.argument("job-id", jobId)
				.argument("comment", comment)
	}

}


fun AWSIotFunctions.attachPolicy(init: AWSIotAttachPolicyCommand.() -> Unit) {
	this.block.declare(AWSIotAttachPolicyCommand().apply(init))
}

@Generated
class AWSIotAttachPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.AttachPolicyRequest> {

	var policyName: String? = null
	var target: String? = null

	override fun build(): com.amazonaws.services.iot.model.AttachPolicyRequest {
		val input = com.amazonaws.services.iot.model.AttachPolicyRequest()
		input.setPolicyName(this.policyName)
		input.setTarget(this.target)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.attachPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api attach-policy")
				.argument("policy-name", policyName)
				.argument("target", target)
	}

}


fun AWSIotFunctions.attachPrincipalPolicy(init: AWSIotAttachPrincipalPolicyCommand.() -> Unit) {
	this.block.declare(AWSIotAttachPrincipalPolicyCommand().apply(init))
}

@Generated
class AWSIotAttachPrincipalPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.AttachPrincipalPolicyRequest> {

	var policyName: String? = null
	var principal: String? = null

	override fun build(): com.amazonaws.services.iot.model.AttachPrincipalPolicyRequest {
		val input = com.amazonaws.services.iot.model.AttachPrincipalPolicyRequest()
		input.setPolicyName(this.policyName)
		input.setPrincipal(this.principal)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.attachPrincipalPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api attach-principal-policy")
				.argument("policy-name", policyName)
				.argument("principal", principal)
	}

}


fun AWSIotFunctions.attachThingPrincipal(init: AWSIotAttachThingPrincipalCommand.() -> Unit) {
	this.block.declare(AWSIotAttachThingPrincipalCommand().apply(init))
}

@Generated
class AWSIotAttachThingPrincipalCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.AttachThingPrincipalRequest> {

	var thingName: String? = null
	var principal: String? = null

	override fun build(): com.amazonaws.services.iot.model.AttachThingPrincipalRequest {
		val input = com.amazonaws.services.iot.model.AttachThingPrincipalRequest()
		input.setThingName(this.thingName)
		input.setPrincipal(this.principal)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.attachThingPrincipal(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api attach-thing-principal")
				.argument("thing-name", thingName)
				.argument("principal", principal)
	}

}


fun AWSIotFunctions.cancelCertificateTransfer(init: AWSIotCancelCertificateTransferCommand.() -> Unit) {
	this.block.declare(AWSIotCancelCertificateTransferCommand().apply(init))
}

@Generated
class AWSIotCancelCertificateTransferCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.CancelCertificateTransferRequest> {

	var certificateId: String? = null

	override fun build(): com.amazonaws.services.iot.model.CancelCertificateTransferRequest {
		val input = com.amazonaws.services.iot.model.CancelCertificateTransferRequest()
		input.setCertificateId(this.certificateId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.cancelCertificateTransfer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api cancel-certificate-transfer")
				.argument("certificate-id", certificateId)
	}

}


fun AWSIotFunctions.cancelJob(init: AWSIotCancelJobCommand.() -> Unit) {
	this.block.declare(AWSIotCancelJobCommand().apply(init))
}

@Generated
class AWSIotCancelJobCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.CancelJobRequest> {

	var jobId: String? = null
	var comment: String? = null

	override fun build(): com.amazonaws.services.iot.model.CancelJobRequest {
		val input = com.amazonaws.services.iot.model.CancelJobRequest()
		input.setJobId(this.jobId)
		input.setComment(this.comment)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.cancelJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api cancel-job")
				.argument("job-id", jobId)
				.argument("comment", comment)
	}

}


fun AWSIotFunctions.clearDefaultAuthorizer(init: AWSIotClearDefaultAuthorizerCommand.() -> Unit) {
	this.block.declare(AWSIotClearDefaultAuthorizerCommand().apply(init))
}

@Generated
class AWSIotClearDefaultAuthorizerCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ClearDefaultAuthorizerRequest> {



	override fun build(): com.amazonaws.services.iot.model.ClearDefaultAuthorizerRequest {
		val input = com.amazonaws.services.iot.model.ClearDefaultAuthorizerRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.clearDefaultAuthorizer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api clear-default-authorizer")

	}

}


fun AWSIotFunctions.createAuthorizer(init: AWSIotCreateAuthorizerCommand.() -> Unit) {
	this.block.declare(AWSIotCreateAuthorizerCommand().apply(init))
}

@Generated
class AWSIotCreateAuthorizerCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.CreateAuthorizerRequest> {

	var authorizerName: String? = null
	var authorizerFunctionArn: String? = null
	var tokenKeyName: String? = null
	var tokenSigningPublicKeys: Map<String, String>? = null
	var status: AuthorizerStatus? = null

	override fun build(): com.amazonaws.services.iot.model.CreateAuthorizerRequest {
		val input = com.amazonaws.services.iot.model.CreateAuthorizerRequest()
		input.setAuthorizerName(this.authorizerName)
		input.setAuthorizerFunctionArn(this.authorizerFunctionArn)
		input.setTokenKeyName(this.tokenKeyName)
		input.setTokenSigningPublicKeys(this.tokenSigningPublicKeys)
		input.setStatus(this.status?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.createAuthorizer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api create-authorizer")
				.argument("authorizer-name", authorizerName)
				.argument("authorizer-function-arn", authorizerFunctionArn)
				.argument("token-key-name", tokenKeyName)
				.argument("token-signing-public-keys", tokenSigningPublicKeys?.toString())
				.argument("status", status?.toString())
	}

}


fun AWSIotFunctions.createCertificateFromCsr(init: AWSIotCreateCertificateFromCsrCommand.() -> Unit) {
	this.block.declare(AWSIotCreateCertificateFromCsrCommand().apply(init))
}

@Generated
class AWSIotCreateCertificateFromCsrCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.CreateCertificateFromCsrRequest> {

	var certificateSigningRequest: String? = null
	var setAsActive: Boolean? = false

	override fun build(): com.amazonaws.services.iot.model.CreateCertificateFromCsrRequest {
		val input = com.amazonaws.services.iot.model.CreateCertificateFromCsrRequest()
		input.setCertificateSigningRequest(this.certificateSigningRequest)
		input.setSetAsActive(this.setAsActive)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.createCertificateFromCsr(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api create-certificate-from-csr")
				.argument("certificate-signing-request", certificateSigningRequest)
				.option("set-as-active", setAsActive ?: false)
	}

}


fun AWSIotFunctions.createJob(init: AWSIotCreateJobCommand.() -> Unit) {
	this.block.declare(AWSIotCreateJobCommand().apply(init))
}

@Generated
class AWSIotCreateJobCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.CreateJobRequest> {

	var jobId: String? = null
	var targets: List<String>? = null
	var documentSource: String? = null
	var document: String? = null
	var description: String? = null
	var presignedUrlConfig: com.amazonaws.services.iot.model.PresignedUrlConfig? = null
	var targetSelection: TargetSelection? = null
	var jobExecutionsRolloutConfig: com.amazonaws.services.iot.model.JobExecutionsRolloutConfig? = null
	var documentParameters: Map<String, String>? = null

	override fun build(): com.amazonaws.services.iot.model.CreateJobRequest {
		val input = com.amazonaws.services.iot.model.CreateJobRequest()
		input.setJobId(this.jobId)
		input.setTargets(this.targets)
		input.setDocumentSource(this.documentSource)
		input.setDocument(this.document)
		input.setDescription(this.description)
		input.setPresignedUrlConfig(this.presignedUrlConfig)
		input.setTargetSelection(this.targetSelection?.toString())
		input.setJobExecutionsRolloutConfig(this.jobExecutionsRolloutConfig)
		input.setDocumentParameters(this.documentParameters)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.createJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api create-job")
				.argument("job-id", jobId)
				.argument("targets", targets?.toString())
				.argument("document-source", documentSource)
				.argument("document", document)
				.argument("description", description)
				.argument("presigned-url-config", presignedUrlConfig?.toString())
				.argument("target-selection", targetSelection?.toString())
				.argument("job-executions-rollout-config", jobExecutionsRolloutConfig?.toString())
				.argument("document-parameters", documentParameters?.toString())
	}

}


fun AWSIotFunctions.createKeysAndCertificate(init: AWSIotCreateKeysAndCertificateCommand.() -> Unit) {
	this.block.declare(AWSIotCreateKeysAndCertificateCommand().apply(init))
}

@Generated
class AWSIotCreateKeysAndCertificateCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.CreateKeysAndCertificateRequest> {

	var setAsActive: Boolean? = false

	override fun build(): com.amazonaws.services.iot.model.CreateKeysAndCertificateRequest {
		val input = com.amazonaws.services.iot.model.CreateKeysAndCertificateRequest()
		input.setSetAsActive(this.setAsActive)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.createKeysAndCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api create-keys-and-certificate")
				.option("set-as-active", setAsActive ?: false)
	}

}


fun AWSIotFunctions.createOTAUpdate(init: AWSIotCreateOTAUpdateCommand.() -> Unit) {
	this.block.declare(AWSIotCreateOTAUpdateCommand().apply(init))
}

@Generated
class AWSIotCreateOTAUpdateCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.CreateOTAUpdateRequest> {

	var otaUpdateId: String? = null
	var description: String? = null
	var targets: List<String>? = null
	var targetSelection: TargetSelection? = null
	var files: List<com.amazonaws.services.iot.model.OTAUpdateFile>? = null
	var roleArn: String? = null
	var additionalParameters: Map<String, String>? = null

	override fun build(): com.amazonaws.services.iot.model.CreateOTAUpdateRequest {
		val input = com.amazonaws.services.iot.model.CreateOTAUpdateRequest()
		input.setOtaUpdateId(this.otaUpdateId)
		input.setDescription(this.description)
		input.setTargets(this.targets)
		input.setTargetSelection(this.targetSelection?.toString())
		input.setFiles(this.files)
		input.setRoleArn(this.roleArn)
		input.setAdditionalParameters(this.additionalParameters)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.createOTAUpdate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api create-otaupdate")
				.argument("ota-update-id", otaUpdateId)
				.argument("description", description)
				.argument("targets", targets?.toString())
				.argument("target-selection", targetSelection?.toString())
				.argument("files", files?.toString())
				.argument("role-arn", roleArn)
				.argument("additional-parameters", additionalParameters?.toString())
	}

}


fun AWSIotFunctions.createPolicy(init: AWSIotCreatePolicyCommand.() -> Unit) {
	this.block.declare(AWSIotCreatePolicyCommand().apply(init))
}

@Generated
class AWSIotCreatePolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.CreatePolicyRequest> {

	var policyName: String? = null
	var policyDocument: String? = null

	override fun build(): com.amazonaws.services.iot.model.CreatePolicyRequest {
		val input = com.amazonaws.services.iot.model.CreatePolicyRequest()
		input.setPolicyName(this.policyName)
		input.setPolicyDocument(this.policyDocument)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.createPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api create-policy")
				.argument("policy-name", policyName)
				.argument("policy-document", policyDocument)
	}

}


fun AWSIotFunctions.createPolicyVersion(init: AWSIotCreatePolicyVersionCommand.() -> Unit) {
	this.block.declare(AWSIotCreatePolicyVersionCommand().apply(init))
}

@Generated
class AWSIotCreatePolicyVersionCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.CreatePolicyVersionRequest> {

	var policyName: String? = null
	var policyDocument: String? = null
	var setAsDefault: Boolean? = false

	override fun build(): com.amazonaws.services.iot.model.CreatePolicyVersionRequest {
		val input = com.amazonaws.services.iot.model.CreatePolicyVersionRequest()
		input.setPolicyName(this.policyName)
		input.setPolicyDocument(this.policyDocument)
		input.setSetAsDefault(this.setAsDefault)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.createPolicyVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api create-policy-version")
				.argument("policy-name", policyName)
				.argument("policy-document", policyDocument)
				.option("set-as-default", setAsDefault ?: false)
	}

}


fun AWSIotFunctions.createRoleAlias(init: AWSIotCreateRoleAliasCommand.() -> Unit) {
	this.block.declare(AWSIotCreateRoleAliasCommand().apply(init))
}

@Generated
class AWSIotCreateRoleAliasCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.CreateRoleAliasRequest> {

	var roleAlias: String? = null
	var roleArn: String? = null
	var credentialDurationSeconds: Int? = 0

	override fun build(): com.amazonaws.services.iot.model.CreateRoleAliasRequest {
		val input = com.amazonaws.services.iot.model.CreateRoleAliasRequest()
		input.setRoleAlias(this.roleAlias)
		input.setRoleArn(this.roleArn)
		input.setCredentialDurationSeconds(this.credentialDurationSeconds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.createRoleAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api create-role-alias")
				.argument("role-alias", roleAlias)
				.argument("role-arn", roleArn)
				.argument("credential-duration-seconds", credentialDurationSeconds?.toString())
	}

}


fun AWSIotFunctions.createStream(init: AWSIotCreateStreamCommand.() -> Unit) {
	this.block.declare(AWSIotCreateStreamCommand().apply(init))
}

@Generated
class AWSIotCreateStreamCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.CreateStreamRequest> {

	var streamId: String? = null
	var description: String? = null
	var files: List<com.amazonaws.services.iot.model.StreamFile>? = null
	var roleArn: String? = null

	override fun build(): com.amazonaws.services.iot.model.CreateStreamRequest {
		val input = com.amazonaws.services.iot.model.CreateStreamRequest()
		input.setStreamId(this.streamId)
		input.setDescription(this.description)
		input.setFiles(this.files)
		input.setRoleArn(this.roleArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.createStream(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api create-stream")
				.argument("stream-id", streamId)
				.argument("description", description)
				.argument("files", files?.toString())
				.argument("role-arn", roleArn)
	}

}


fun AWSIotFunctions.createThing(init: AWSIotCreateThingCommand.() -> Unit) {
	this.block.declare(AWSIotCreateThingCommand().apply(init))
}

@Generated
class AWSIotCreateThingCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.CreateThingRequest> {

	var thingName: String? = null
	var thingTypeName: String? = null
	var attributePayload: com.amazonaws.services.iot.model.AttributePayload? = null

	override fun build(): com.amazonaws.services.iot.model.CreateThingRequest {
		val input = com.amazonaws.services.iot.model.CreateThingRequest()
		input.setThingName(this.thingName)
		input.setThingTypeName(this.thingTypeName)
		input.setAttributePayload(this.attributePayload)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.createThing(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api create-thing")
				.argument("thing-name", thingName)
				.argument("thing-type-name", thingTypeName)
				.argument("attribute-payload", attributePayload?.toString())
	}

}


fun AWSIotFunctions.createThingGroup(init: AWSIotCreateThingGroupCommand.() -> Unit) {
	this.block.declare(AWSIotCreateThingGroupCommand().apply(init))
}

@Generated
class AWSIotCreateThingGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.CreateThingGroupRequest> {

	var thingGroupName: String? = null
	var parentGroupName: String? = null
	var thingGroupProperties: com.amazonaws.services.iot.model.ThingGroupProperties? = null

	override fun build(): com.amazonaws.services.iot.model.CreateThingGroupRequest {
		val input = com.amazonaws.services.iot.model.CreateThingGroupRequest()
		input.setThingGroupName(this.thingGroupName)
		input.setParentGroupName(this.parentGroupName)
		input.setThingGroupProperties(this.thingGroupProperties)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.createThingGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api create-thing-group")
				.argument("thing-group-name", thingGroupName)
				.argument("parent-group-name", parentGroupName)
				.argument("thing-group-properties", thingGroupProperties?.toString())
	}

}


fun AWSIotFunctions.createThingType(init: AWSIotCreateThingTypeCommand.() -> Unit) {
	this.block.declare(AWSIotCreateThingTypeCommand().apply(init))
}

@Generated
class AWSIotCreateThingTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.CreateThingTypeRequest> {

	var thingTypeName: String? = null
	var thingTypeProperties: com.amazonaws.services.iot.model.ThingTypeProperties? = null

	override fun build(): com.amazonaws.services.iot.model.CreateThingTypeRequest {
		val input = com.amazonaws.services.iot.model.CreateThingTypeRequest()
		input.setThingTypeName(this.thingTypeName)
		input.setThingTypeProperties(this.thingTypeProperties)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.createThingType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api create-thing-type")
				.argument("thing-type-name", thingTypeName)
				.argument("thing-type-properties", thingTypeProperties?.toString())
	}

}


fun AWSIotFunctions.createTopicRule(init: AWSIotCreateTopicRuleCommand.() -> Unit) {
	this.block.declare(AWSIotCreateTopicRuleCommand().apply(init))
}

@Generated
class AWSIotCreateTopicRuleCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.CreateTopicRuleRequest> {

	var ruleName: String? = null
	var topicRulePayload: com.amazonaws.services.iot.model.TopicRulePayload? = null

	override fun build(): com.amazonaws.services.iot.model.CreateTopicRuleRequest {
		val input = com.amazonaws.services.iot.model.CreateTopicRuleRequest()
		input.setRuleName(this.ruleName)
		input.setTopicRulePayload(this.topicRulePayload)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.createTopicRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api create-topic-rule")
				.argument("rule-name", ruleName)
				.argument("topic-rule-payload", topicRulePayload?.toString())
	}

}


fun AWSIotFunctions.deleteAuthorizer(init: AWSIotDeleteAuthorizerCommand.() -> Unit) {
	this.block.declare(AWSIotDeleteAuthorizerCommand().apply(init))
}

@Generated
class AWSIotDeleteAuthorizerCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DeleteAuthorizerRequest> {

	var authorizerName: String? = null

	override fun build(): com.amazonaws.services.iot.model.DeleteAuthorizerRequest {
		val input = com.amazonaws.services.iot.model.DeleteAuthorizerRequest()
		input.setAuthorizerName(this.authorizerName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.deleteAuthorizer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api delete-authorizer")
				.argument("authorizer-name", authorizerName)
	}

}


fun AWSIotFunctions.deleteCACertificate(init: AWSIotDeleteCACertificateCommand.() -> Unit) {
	this.block.declare(AWSIotDeleteCACertificateCommand().apply(init))
}

@Generated
class AWSIotDeleteCACertificateCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DeleteCACertificateRequest> {

	var certificateId: String? = null

	override fun build(): com.amazonaws.services.iot.model.DeleteCACertificateRequest {
		val input = com.amazonaws.services.iot.model.DeleteCACertificateRequest()
		input.setCertificateId(this.certificateId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.deleteCACertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api delete-cacertificate")
				.argument("certificate-id", certificateId)
	}

}


fun AWSIotFunctions.deleteCertificate(init: AWSIotDeleteCertificateCommand.() -> Unit) {
	this.block.declare(AWSIotDeleteCertificateCommand().apply(init))
}

@Generated
class AWSIotDeleteCertificateCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DeleteCertificateRequest> {

	var certificateId: String? = null
	var forceDelete: Boolean? = false

	override fun build(): com.amazonaws.services.iot.model.DeleteCertificateRequest {
		val input = com.amazonaws.services.iot.model.DeleteCertificateRequest()
		input.setCertificateId(this.certificateId)
		input.setForceDelete(this.forceDelete)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.deleteCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api delete-certificate")
				.argument("certificate-id", certificateId)
				.option("force-delete", forceDelete ?: false)
	}

}


fun AWSIotFunctions.deleteOTAUpdate(init: AWSIotDeleteOTAUpdateCommand.() -> Unit) {
	this.block.declare(AWSIotDeleteOTAUpdateCommand().apply(init))
}

@Generated
class AWSIotDeleteOTAUpdateCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DeleteOTAUpdateRequest> {

	var otaUpdateId: String? = null

	override fun build(): com.amazonaws.services.iot.model.DeleteOTAUpdateRequest {
		val input = com.amazonaws.services.iot.model.DeleteOTAUpdateRequest()
		input.setOtaUpdateId(this.otaUpdateId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.deleteOTAUpdate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api delete-otaupdate")
				.argument("ota-update-id", otaUpdateId)
	}

}


fun AWSIotFunctions.deletePolicy(init: AWSIotDeletePolicyCommand.() -> Unit) {
	this.block.declare(AWSIotDeletePolicyCommand().apply(init))
}

@Generated
class AWSIotDeletePolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DeletePolicyRequest> {

	var policyName: String? = null

	override fun build(): com.amazonaws.services.iot.model.DeletePolicyRequest {
		val input = com.amazonaws.services.iot.model.DeletePolicyRequest()
		input.setPolicyName(this.policyName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.deletePolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api delete-policy")
				.argument("policy-name", policyName)
	}

}


fun AWSIotFunctions.deletePolicyVersion(init: AWSIotDeletePolicyVersionCommand.() -> Unit) {
	this.block.declare(AWSIotDeletePolicyVersionCommand().apply(init))
}

@Generated
class AWSIotDeletePolicyVersionCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DeletePolicyVersionRequest> {

	var policyName: String? = null
	var policyVersionId: String? = null

	override fun build(): com.amazonaws.services.iot.model.DeletePolicyVersionRequest {
		val input = com.amazonaws.services.iot.model.DeletePolicyVersionRequest()
		input.setPolicyName(this.policyName)
		input.setPolicyVersionId(this.policyVersionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.deletePolicyVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api delete-policy-version")
				.argument("policy-name", policyName)
				.argument("policy-version-id", policyVersionId)
	}

}


fun AWSIotFunctions.deleteRegistrationCode(init: AWSIotDeleteRegistrationCodeCommand.() -> Unit) {
	this.block.declare(AWSIotDeleteRegistrationCodeCommand().apply(init))
}

@Generated
class AWSIotDeleteRegistrationCodeCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DeleteRegistrationCodeRequest> {



	override fun build(): com.amazonaws.services.iot.model.DeleteRegistrationCodeRequest {
		val input = com.amazonaws.services.iot.model.DeleteRegistrationCodeRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.deleteRegistrationCode(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api delete-registration-code")

	}

}


fun AWSIotFunctions.deleteRoleAlias(init: AWSIotDeleteRoleAliasCommand.() -> Unit) {
	this.block.declare(AWSIotDeleteRoleAliasCommand().apply(init))
}

@Generated
class AWSIotDeleteRoleAliasCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DeleteRoleAliasRequest> {

	var roleAlias: String? = null

	override fun build(): com.amazonaws.services.iot.model.DeleteRoleAliasRequest {
		val input = com.amazonaws.services.iot.model.DeleteRoleAliasRequest()
		input.setRoleAlias(this.roleAlias)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.deleteRoleAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api delete-role-alias")
				.argument("role-alias", roleAlias)
	}

}


fun AWSIotFunctions.deleteStream(init: AWSIotDeleteStreamCommand.() -> Unit) {
	this.block.declare(AWSIotDeleteStreamCommand().apply(init))
}

@Generated
class AWSIotDeleteStreamCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DeleteStreamRequest> {

	var streamId: String? = null

	override fun build(): com.amazonaws.services.iot.model.DeleteStreamRequest {
		val input = com.amazonaws.services.iot.model.DeleteStreamRequest()
		input.setStreamId(this.streamId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.deleteStream(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api delete-stream")
				.argument("stream-id", streamId)
	}

}


fun AWSIotFunctions.deleteThing(init: AWSIotDeleteThingCommand.() -> Unit) {
	this.block.declare(AWSIotDeleteThingCommand().apply(init))
}

@Generated
class AWSIotDeleteThingCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DeleteThingRequest> {

	var thingName: String? = null
	var expectedVersion: Long? = 0L

	override fun build(): com.amazonaws.services.iot.model.DeleteThingRequest {
		val input = com.amazonaws.services.iot.model.DeleteThingRequest()
		input.setThingName(this.thingName)
		input.setExpectedVersion(this.expectedVersion)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.deleteThing(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api delete-thing")
				.argument("thing-name", thingName)
				.argument("expected-version", expectedVersion?.toString())
	}

}


fun AWSIotFunctions.deleteThingGroup(init: AWSIotDeleteThingGroupCommand.() -> Unit) {
	this.block.declare(AWSIotDeleteThingGroupCommand().apply(init))
}

@Generated
class AWSIotDeleteThingGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DeleteThingGroupRequest> {

	var thingGroupName: String? = null
	var expectedVersion: Long? = 0L

	override fun build(): com.amazonaws.services.iot.model.DeleteThingGroupRequest {
		val input = com.amazonaws.services.iot.model.DeleteThingGroupRequest()
		input.setThingGroupName(this.thingGroupName)
		input.setExpectedVersion(this.expectedVersion)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.deleteThingGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api delete-thing-group")
				.argument("thing-group-name", thingGroupName)
				.argument("expected-version", expectedVersion?.toString())
	}

}


fun AWSIotFunctions.deleteThingType(init: AWSIotDeleteThingTypeCommand.() -> Unit) {
	this.block.declare(AWSIotDeleteThingTypeCommand().apply(init))
}

@Generated
class AWSIotDeleteThingTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DeleteThingTypeRequest> {

	var thingTypeName: String? = null

	override fun build(): com.amazonaws.services.iot.model.DeleteThingTypeRequest {
		val input = com.amazonaws.services.iot.model.DeleteThingTypeRequest()
		input.setThingTypeName(this.thingTypeName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.deleteThingType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api delete-thing-type")
				.argument("thing-type-name", thingTypeName)
	}

}


fun AWSIotFunctions.deleteTopicRule(init: AWSIotDeleteTopicRuleCommand.() -> Unit) {
	this.block.declare(AWSIotDeleteTopicRuleCommand().apply(init))
}

@Generated
class AWSIotDeleteTopicRuleCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DeleteTopicRuleRequest> {

	var ruleName: String? = null

	override fun build(): com.amazonaws.services.iot.model.DeleteTopicRuleRequest {
		val input = com.amazonaws.services.iot.model.DeleteTopicRuleRequest()
		input.setRuleName(this.ruleName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.deleteTopicRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api delete-topic-rule")
				.argument("rule-name", ruleName)
	}

}


fun AWSIotFunctions.deleteV2LoggingLevel(init: AWSIotDeleteV2LoggingLevelCommand.() -> Unit) {
	this.block.declare(AWSIotDeleteV2LoggingLevelCommand().apply(init))
}

@Generated
class AWSIotDeleteV2LoggingLevelCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DeleteV2LoggingLevelRequest> {

	var targetType: LogTargetType? = null
	var targetName: String? = null

	override fun build(): com.amazonaws.services.iot.model.DeleteV2LoggingLevelRequest {
		val input = com.amazonaws.services.iot.model.DeleteV2LoggingLevelRequest()
		input.setTargetType(this.targetType?.toString())
		input.setTargetName(this.targetName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.deleteV2LoggingLevel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api delete-v2-logging-level")
				.argument("target-type", targetType?.toString())
				.argument("target-name", targetName)
	}

}


fun AWSIotFunctions.deprecateThingType(init: AWSIotDeprecateThingTypeCommand.() -> Unit) {
	this.block.declare(AWSIotDeprecateThingTypeCommand().apply(init))
}

@Generated
class AWSIotDeprecateThingTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DeprecateThingTypeRequest> {

	var thingTypeName: String? = null
	var undoDeprecate: Boolean? = false

	override fun build(): com.amazonaws.services.iot.model.DeprecateThingTypeRequest {
		val input = com.amazonaws.services.iot.model.DeprecateThingTypeRequest()
		input.setThingTypeName(this.thingTypeName)
		input.setUndoDeprecate(this.undoDeprecate)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.deprecateThingType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api deprecate-thing-type")
				.argument("thing-type-name", thingTypeName)
				.option("undo-deprecate", undoDeprecate ?: false)
	}

}


fun AWSIotFunctions.describeAuthorizer(init: AWSIotDescribeAuthorizerCommand.() -> Unit) {
	this.block.declare(AWSIotDescribeAuthorizerCommand().apply(init))
}

@Generated
class AWSIotDescribeAuthorizerCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DescribeAuthorizerRequest> {

	var authorizerName: String? = null

	override fun build(): com.amazonaws.services.iot.model.DescribeAuthorizerRequest {
		val input = com.amazonaws.services.iot.model.DescribeAuthorizerRequest()
		input.setAuthorizerName(this.authorizerName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.describeAuthorizer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api describe-authorizer")
				.argument("authorizer-name", authorizerName)
	}

}


fun AWSIotFunctions.describeCACertificate(init: AWSIotDescribeCACertificateCommand.() -> Unit) {
	this.block.declare(AWSIotDescribeCACertificateCommand().apply(init))
}

@Generated
class AWSIotDescribeCACertificateCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DescribeCACertificateRequest> {

	var certificateId: String? = null

	override fun build(): com.amazonaws.services.iot.model.DescribeCACertificateRequest {
		val input = com.amazonaws.services.iot.model.DescribeCACertificateRequest()
		input.setCertificateId(this.certificateId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.describeCACertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api describe-cacertificate")
				.argument("certificate-id", certificateId)
	}

}


fun AWSIotFunctions.describeCertificate(init: AWSIotDescribeCertificateCommand.() -> Unit) {
	this.block.declare(AWSIotDescribeCertificateCommand().apply(init))
}

@Generated
class AWSIotDescribeCertificateCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DescribeCertificateRequest> {

	var certificateId: String? = null

	override fun build(): com.amazonaws.services.iot.model.DescribeCertificateRequest {
		val input = com.amazonaws.services.iot.model.DescribeCertificateRequest()
		input.setCertificateId(this.certificateId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.describeCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api describe-certificate")
				.argument("certificate-id", certificateId)
	}

}


fun AWSIotFunctions.describeDefaultAuthorizer(init: AWSIotDescribeDefaultAuthorizerCommand.() -> Unit) {
	this.block.declare(AWSIotDescribeDefaultAuthorizerCommand().apply(init))
}

@Generated
class AWSIotDescribeDefaultAuthorizerCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DescribeDefaultAuthorizerRequest> {



	override fun build(): com.amazonaws.services.iot.model.DescribeDefaultAuthorizerRequest {
		val input = com.amazonaws.services.iot.model.DescribeDefaultAuthorizerRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.describeDefaultAuthorizer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api describe-default-authorizer")

	}

}


fun AWSIotFunctions.describeEndpoint(init: AWSIotDescribeEndpointCommand.() -> Unit) {
	this.block.declare(AWSIotDescribeEndpointCommand().apply(init))
}

@Generated
class AWSIotDescribeEndpointCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DescribeEndpointRequest> {

	var endpointType: String? = null

	override fun build(): com.amazonaws.services.iot.model.DescribeEndpointRequest {
		val input = com.amazonaws.services.iot.model.DescribeEndpointRequest()
		input.setEndpointType(this.endpointType)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.describeEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api describe-endpoint")
				.argument("endpoint-type", endpointType)
	}

}


fun AWSIotFunctions.describeEventConfigurations(init: AWSIotDescribeEventConfigurationsCommand.() -> Unit) {
	this.block.declare(AWSIotDescribeEventConfigurationsCommand().apply(init))
}

@Generated
class AWSIotDescribeEventConfigurationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DescribeEventConfigurationsRequest> {



	override fun build(): com.amazonaws.services.iot.model.DescribeEventConfigurationsRequest {
		val input = com.amazonaws.services.iot.model.DescribeEventConfigurationsRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.describeEventConfigurations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api describe-event-configurations")

	}

}


fun AWSIotFunctions.describeIndex(init: AWSIotDescribeIndexCommand.() -> Unit) {
	this.block.declare(AWSIotDescribeIndexCommand().apply(init))
}

@Generated
class AWSIotDescribeIndexCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DescribeIndexRequest> {

	var indexName: String? = null

	override fun build(): com.amazonaws.services.iot.model.DescribeIndexRequest {
		val input = com.amazonaws.services.iot.model.DescribeIndexRequest()
		input.setIndexName(this.indexName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.describeIndex(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api describe-index")
				.argument("index-name", indexName)
	}

}


fun AWSIotFunctions.describeJob(init: AWSIotDescribeJobCommand.() -> Unit) {
	this.block.declare(AWSIotDescribeJobCommand().apply(init))
}

@Generated
class AWSIotDescribeJobCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DescribeJobRequest> {

	var jobId: String? = null

	override fun build(): com.amazonaws.services.iot.model.DescribeJobRequest {
		val input = com.amazonaws.services.iot.model.DescribeJobRequest()
		input.setJobId(this.jobId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.describeJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api describe-job")
				.argument("job-id", jobId)
	}

}


fun AWSIotFunctions.describeJobExecution(init: AWSIotDescribeJobExecutionCommand.() -> Unit) {
	this.block.declare(AWSIotDescribeJobExecutionCommand().apply(init))
}

@Generated
class AWSIotDescribeJobExecutionCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DescribeJobExecutionRequest> {

	var jobId: String? = null
	var thingName: String? = null
	var executionNumber: Long? = 0L

	override fun build(): com.amazonaws.services.iot.model.DescribeJobExecutionRequest {
		val input = com.amazonaws.services.iot.model.DescribeJobExecutionRequest()
		input.setJobId(this.jobId)
		input.setThingName(this.thingName)
		input.setExecutionNumber(this.executionNumber)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.describeJobExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api describe-job-execution")
				.argument("job-id", jobId)
				.argument("thing-name", thingName)
				.argument("execution-number", executionNumber?.toString())
	}

}


fun AWSIotFunctions.describeRoleAlias(init: AWSIotDescribeRoleAliasCommand.() -> Unit) {
	this.block.declare(AWSIotDescribeRoleAliasCommand().apply(init))
}

@Generated
class AWSIotDescribeRoleAliasCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DescribeRoleAliasRequest> {

	var roleAlias: String? = null

	override fun build(): com.amazonaws.services.iot.model.DescribeRoleAliasRequest {
		val input = com.amazonaws.services.iot.model.DescribeRoleAliasRequest()
		input.setRoleAlias(this.roleAlias)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.describeRoleAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api describe-role-alias")
				.argument("role-alias", roleAlias)
	}

}


fun AWSIotFunctions.describeStream(init: AWSIotDescribeStreamCommand.() -> Unit) {
	this.block.declare(AWSIotDescribeStreamCommand().apply(init))
}

@Generated
class AWSIotDescribeStreamCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DescribeStreamRequest> {

	var streamId: String? = null

	override fun build(): com.amazonaws.services.iot.model.DescribeStreamRequest {
		val input = com.amazonaws.services.iot.model.DescribeStreamRequest()
		input.setStreamId(this.streamId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.describeStream(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api describe-stream")
				.argument("stream-id", streamId)
	}

}


fun AWSIotFunctions.describeThing(init: AWSIotDescribeThingCommand.() -> Unit) {
	this.block.declare(AWSIotDescribeThingCommand().apply(init))
}

@Generated
class AWSIotDescribeThingCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DescribeThingRequest> {

	var thingName: String? = null

	override fun build(): com.amazonaws.services.iot.model.DescribeThingRequest {
		val input = com.amazonaws.services.iot.model.DescribeThingRequest()
		input.setThingName(this.thingName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.describeThing(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api describe-thing")
				.argument("thing-name", thingName)
	}

}


fun AWSIotFunctions.describeThingGroup(init: AWSIotDescribeThingGroupCommand.() -> Unit) {
	this.block.declare(AWSIotDescribeThingGroupCommand().apply(init))
}

@Generated
class AWSIotDescribeThingGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DescribeThingGroupRequest> {

	var thingGroupName: String? = null

	override fun build(): com.amazonaws.services.iot.model.DescribeThingGroupRequest {
		val input = com.amazonaws.services.iot.model.DescribeThingGroupRequest()
		input.setThingGroupName(this.thingGroupName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.describeThingGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api describe-thing-group")
				.argument("thing-group-name", thingGroupName)
	}

}


fun AWSIotFunctions.describeThingRegistrationTask(init: AWSIotDescribeThingRegistrationTaskCommand.() -> Unit) {
	this.block.declare(AWSIotDescribeThingRegistrationTaskCommand().apply(init))
}

@Generated
class AWSIotDescribeThingRegistrationTaskCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DescribeThingRegistrationTaskRequest> {

	var taskId: String? = null

	override fun build(): com.amazonaws.services.iot.model.DescribeThingRegistrationTaskRequest {
		val input = com.amazonaws.services.iot.model.DescribeThingRegistrationTaskRequest()
		input.setTaskId(this.taskId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.describeThingRegistrationTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api describe-thing-registration-task")
				.argument("task-id", taskId)
	}

}


fun AWSIotFunctions.describeThingType(init: AWSIotDescribeThingTypeCommand.() -> Unit) {
	this.block.declare(AWSIotDescribeThingTypeCommand().apply(init))
}

@Generated
class AWSIotDescribeThingTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DescribeThingTypeRequest> {

	var thingTypeName: String? = null

	override fun build(): com.amazonaws.services.iot.model.DescribeThingTypeRequest {
		val input = com.amazonaws.services.iot.model.DescribeThingTypeRequest()
		input.setThingTypeName(this.thingTypeName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.describeThingType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api describe-thing-type")
				.argument("thing-type-name", thingTypeName)
	}

}


fun AWSIotFunctions.detachPolicy(init: AWSIotDetachPolicyCommand.() -> Unit) {
	this.block.declare(AWSIotDetachPolicyCommand().apply(init))
}

@Generated
class AWSIotDetachPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DetachPolicyRequest> {

	var policyName: String? = null
	var target: String? = null

	override fun build(): com.amazonaws.services.iot.model.DetachPolicyRequest {
		val input = com.amazonaws.services.iot.model.DetachPolicyRequest()
		input.setPolicyName(this.policyName)
		input.setTarget(this.target)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.detachPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api detach-policy")
				.argument("policy-name", policyName)
				.argument("target", target)
	}

}


fun AWSIotFunctions.detachPrincipalPolicy(init: AWSIotDetachPrincipalPolicyCommand.() -> Unit) {
	this.block.declare(AWSIotDetachPrincipalPolicyCommand().apply(init))
}

@Generated
class AWSIotDetachPrincipalPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DetachPrincipalPolicyRequest> {

	var policyName: String? = null
	var principal: String? = null

	override fun build(): com.amazonaws.services.iot.model.DetachPrincipalPolicyRequest {
		val input = com.amazonaws.services.iot.model.DetachPrincipalPolicyRequest()
		input.setPolicyName(this.policyName)
		input.setPrincipal(this.principal)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.detachPrincipalPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api detach-principal-policy")
				.argument("policy-name", policyName)
				.argument("principal", principal)
	}

}


fun AWSIotFunctions.detachThingPrincipal(init: AWSIotDetachThingPrincipalCommand.() -> Unit) {
	this.block.declare(AWSIotDetachThingPrincipalCommand().apply(init))
}

@Generated
class AWSIotDetachThingPrincipalCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DetachThingPrincipalRequest> {

	var thingName: String? = null
	var principal: String? = null

	override fun build(): com.amazonaws.services.iot.model.DetachThingPrincipalRequest {
		val input = com.amazonaws.services.iot.model.DetachThingPrincipalRequest()
		input.setThingName(this.thingName)
		input.setPrincipal(this.principal)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.detachThingPrincipal(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api detach-thing-principal")
				.argument("thing-name", thingName)
				.argument("principal", principal)
	}

}


fun AWSIotFunctions.disableTopicRule(init: AWSIotDisableTopicRuleCommand.() -> Unit) {
	this.block.declare(AWSIotDisableTopicRuleCommand().apply(init))
}

@Generated
class AWSIotDisableTopicRuleCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DisableTopicRuleRequest> {

	var ruleName: String? = null

	override fun build(): com.amazonaws.services.iot.model.DisableTopicRuleRequest {
		val input = com.amazonaws.services.iot.model.DisableTopicRuleRequest()
		input.setRuleName(this.ruleName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.disableTopicRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api disable-topic-rule")
				.argument("rule-name", ruleName)
	}

}


fun AWSIotFunctions.enableTopicRule(init: AWSIotEnableTopicRuleCommand.() -> Unit) {
	this.block.declare(AWSIotEnableTopicRuleCommand().apply(init))
}

@Generated
class AWSIotEnableTopicRuleCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.EnableTopicRuleRequest> {

	var ruleName: String? = null

	override fun build(): com.amazonaws.services.iot.model.EnableTopicRuleRequest {
		val input = com.amazonaws.services.iot.model.EnableTopicRuleRequest()
		input.setRuleName(this.ruleName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.enableTopicRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api enable-topic-rule")
				.argument("rule-name", ruleName)
	}

}


fun AWSIotFunctions.getEffectivePolicies(init: AWSIotGetEffectivePoliciesCommand.() -> Unit) {
	this.block.declare(AWSIotGetEffectivePoliciesCommand().apply(init))
}

@Generated
class AWSIotGetEffectivePoliciesCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.GetEffectivePoliciesRequest> {

	var principal: String? = null
	var cognitoIdentityPoolId: String? = null
	var thingName: String? = null

	override fun build(): com.amazonaws.services.iot.model.GetEffectivePoliciesRequest {
		val input = com.amazonaws.services.iot.model.GetEffectivePoliciesRequest()
		input.setPrincipal(this.principal)
		input.setCognitoIdentityPoolId(this.cognitoIdentityPoolId)
		input.setThingName(this.thingName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.getEffectivePolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api get-effective-policies")
				.argument("principal", principal)
				.argument("cognito-identity-pool-id", cognitoIdentityPoolId)
				.argument("thing-name", thingName)
	}

}


fun AWSIotFunctions.getIndexingConfiguration(init: AWSIotGetIndexingConfigurationCommand.() -> Unit) {
	this.block.declare(AWSIotGetIndexingConfigurationCommand().apply(init))
}

@Generated
class AWSIotGetIndexingConfigurationCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.GetIndexingConfigurationRequest> {



	override fun build(): com.amazonaws.services.iot.model.GetIndexingConfigurationRequest {
		val input = com.amazonaws.services.iot.model.GetIndexingConfigurationRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.getIndexingConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api get-indexing-configuration")

	}

}


fun AWSIotFunctions.getJobDocument(init: AWSIotGetJobDocumentCommand.() -> Unit) {
	this.block.declare(AWSIotGetJobDocumentCommand().apply(init))
}

@Generated
class AWSIotGetJobDocumentCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.GetJobDocumentRequest> {

	var jobId: String? = null

	override fun build(): com.amazonaws.services.iot.model.GetJobDocumentRequest {
		val input = com.amazonaws.services.iot.model.GetJobDocumentRequest()
		input.setJobId(this.jobId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.getJobDocument(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api get-job-document")
				.argument("job-id", jobId)
	}

}


fun AWSIotFunctions.getLoggingOptions(init: AWSIotGetLoggingOptionsCommand.() -> Unit) {
	this.block.declare(AWSIotGetLoggingOptionsCommand().apply(init))
}

@Generated
class AWSIotGetLoggingOptionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.GetLoggingOptionsRequest> {



	override fun build(): com.amazonaws.services.iot.model.GetLoggingOptionsRequest {
		val input = com.amazonaws.services.iot.model.GetLoggingOptionsRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.getLoggingOptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api get-logging-options")

	}

}


fun AWSIotFunctions.getOTAUpdate(init: AWSIotGetOTAUpdateCommand.() -> Unit) {
	this.block.declare(AWSIotGetOTAUpdateCommand().apply(init))
}

@Generated
class AWSIotGetOTAUpdateCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.GetOTAUpdateRequest> {

	var otaUpdateId: String? = null

	override fun build(): com.amazonaws.services.iot.model.GetOTAUpdateRequest {
		val input = com.amazonaws.services.iot.model.GetOTAUpdateRequest()
		input.setOtaUpdateId(this.otaUpdateId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.getOTAUpdate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api get-otaupdate")
				.argument("ota-update-id", otaUpdateId)
	}

}


fun AWSIotFunctions.getPolicy(init: AWSIotGetPolicyCommand.() -> Unit) {
	this.block.declare(AWSIotGetPolicyCommand().apply(init))
}

@Generated
class AWSIotGetPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.GetPolicyRequest> {

	var policyName: String? = null

	override fun build(): com.amazonaws.services.iot.model.GetPolicyRequest {
		val input = com.amazonaws.services.iot.model.GetPolicyRequest()
		input.setPolicyName(this.policyName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.getPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api get-policy")
				.argument("policy-name", policyName)
	}

}


fun AWSIotFunctions.getPolicyVersion(init: AWSIotGetPolicyVersionCommand.() -> Unit) {
	this.block.declare(AWSIotGetPolicyVersionCommand().apply(init))
}

@Generated
class AWSIotGetPolicyVersionCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.GetPolicyVersionRequest> {

	var policyName: String? = null
	var policyVersionId: String? = null

	override fun build(): com.amazonaws.services.iot.model.GetPolicyVersionRequest {
		val input = com.amazonaws.services.iot.model.GetPolicyVersionRequest()
		input.setPolicyName(this.policyName)
		input.setPolicyVersionId(this.policyVersionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.getPolicyVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api get-policy-version")
				.argument("policy-name", policyName)
				.argument("policy-version-id", policyVersionId)
	}

}


fun AWSIotFunctions.getRegistrationCode(init: AWSIotGetRegistrationCodeCommand.() -> Unit) {
	this.block.declare(AWSIotGetRegistrationCodeCommand().apply(init))
}

@Generated
class AWSIotGetRegistrationCodeCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.GetRegistrationCodeRequest> {



	override fun build(): com.amazonaws.services.iot.model.GetRegistrationCodeRequest {
		val input = com.amazonaws.services.iot.model.GetRegistrationCodeRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.getRegistrationCode(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api get-registration-code")

	}

}


fun AWSIotFunctions.getTopicRule(init: AWSIotGetTopicRuleCommand.() -> Unit) {
	this.block.declare(AWSIotGetTopicRuleCommand().apply(init))
}

@Generated
class AWSIotGetTopicRuleCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.GetTopicRuleRequest> {

	var ruleName: String? = null

	override fun build(): com.amazonaws.services.iot.model.GetTopicRuleRequest {
		val input = com.amazonaws.services.iot.model.GetTopicRuleRequest()
		input.setRuleName(this.ruleName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.getTopicRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api get-topic-rule")
				.argument("rule-name", ruleName)
	}

}


fun AWSIotFunctions.getV2LoggingOptions(init: AWSIotGetV2LoggingOptionsCommand.() -> Unit) {
	this.block.declare(AWSIotGetV2LoggingOptionsCommand().apply(init))
}

@Generated
class AWSIotGetV2LoggingOptionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.GetV2LoggingOptionsRequest> {



	override fun build(): com.amazonaws.services.iot.model.GetV2LoggingOptionsRequest {
		val input = com.amazonaws.services.iot.model.GetV2LoggingOptionsRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.getV2LoggingOptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api get-v2-logging-options")

	}

}


fun AWSIotFunctions.listAttachedPolicies(init: AWSIotListAttachedPoliciesCommand.() -> Unit) {
	this.block.declare(AWSIotListAttachedPoliciesCommand().apply(init))
}

@Generated
class AWSIotListAttachedPoliciesCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListAttachedPoliciesRequest> {

	var target: String? = null
	var recursive: Boolean? = false
	var marker: String? = null
	var pageSize: Int? = 0

	override fun build(): com.amazonaws.services.iot.model.ListAttachedPoliciesRequest {
		val input = com.amazonaws.services.iot.model.ListAttachedPoliciesRequest()
		input.setTarget(this.target)
		input.setRecursive(this.recursive)
		input.setMarker(this.marker)
		input.setPageSize(this.pageSize)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.listAttachedPolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-attached-policies")
				.argument("target", target)
				.option("recursive", recursive ?: false)
				.argument("marker", marker)
				.argument("page-size", pageSize?.toString())
	}

}


fun AWSIotFunctions.listAuthorizers(init: AWSIotListAuthorizersCommand.() -> Unit) {
	this.block.declare(AWSIotListAuthorizersCommand().apply(init))
}

@Generated
class AWSIotListAuthorizersCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListAuthorizersRequest> {

	var pageSize: Int? = 0
	var marker: String? = null
	var ascendingOrder: Boolean? = false
	var status: AuthorizerStatus? = null

	override fun build(): com.amazonaws.services.iot.model.ListAuthorizersRequest {
		val input = com.amazonaws.services.iot.model.ListAuthorizersRequest()
		input.setPageSize(this.pageSize)
		input.setMarker(this.marker)
		input.setAscendingOrder(this.ascendingOrder)
		input.setStatus(this.status?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.listAuthorizers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-authorizers")
				.argument("page-size", pageSize?.toString())
				.argument("marker", marker)
				.option("ascending-order", ascendingOrder ?: false)
				.argument("status", status?.toString())
	}

}


fun AWSIotFunctions.listCACertificates(init: AWSIotListCACertificatesCommand.() -> Unit) {
	this.block.declare(AWSIotListCACertificatesCommand().apply(init))
}

@Generated
class AWSIotListCACertificatesCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListCACertificatesRequest> {

	var pageSize: Int? = 0
	var marker: String? = null
	var ascendingOrder: Boolean? = false

	override fun build(): com.amazonaws.services.iot.model.ListCACertificatesRequest {
		val input = com.amazonaws.services.iot.model.ListCACertificatesRequest()
		input.setPageSize(this.pageSize)
		input.setMarker(this.marker)
		input.setAscendingOrder(this.ascendingOrder)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.listCACertificates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-cacertificates")
				.argument("page-size", pageSize?.toString())
				.argument("marker", marker)
				.option("ascending-order", ascendingOrder ?: false)
	}

}


fun AWSIotFunctions.listCertificates(init: AWSIotListCertificatesCommand.() -> Unit) {
	this.block.declare(AWSIotListCertificatesCommand().apply(init))
}

@Generated
class AWSIotListCertificatesCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListCertificatesRequest> {

	var pageSize: Int? = 0
	var marker: String? = null
	var ascendingOrder: Boolean? = false

	override fun build(): com.amazonaws.services.iot.model.ListCertificatesRequest {
		val input = com.amazonaws.services.iot.model.ListCertificatesRequest()
		input.setPageSize(this.pageSize)
		input.setMarker(this.marker)
		input.setAscendingOrder(this.ascendingOrder)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.listCertificates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-certificates")
				.argument("page-size", pageSize?.toString())
				.argument("marker", marker)
				.option("ascending-order", ascendingOrder ?: false)
	}

}


fun AWSIotFunctions.listCertificatesByCA(init: AWSIotListCertificatesByCACommand.() -> Unit) {
	this.block.declare(AWSIotListCertificatesByCACommand().apply(init))
}

@Generated
class AWSIotListCertificatesByCACommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListCertificatesByCARequest> {

	var caCertificateId: String? = null
	var pageSize: Int? = 0
	var marker: String? = null
	var ascendingOrder: Boolean? = false

	override fun build(): com.amazonaws.services.iot.model.ListCertificatesByCARequest {
		val input = com.amazonaws.services.iot.model.ListCertificatesByCARequest()
		input.setCaCertificateId(this.caCertificateId)
		input.setPageSize(this.pageSize)
		input.setMarker(this.marker)
		input.setAscendingOrder(this.ascendingOrder)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.listCertificatesByCA(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-certificates-by-ca")
				.argument("ca-certificate-id", caCertificateId)
				.argument("page-size", pageSize?.toString())
				.argument("marker", marker)
				.option("ascending-order", ascendingOrder ?: false)
	}

}


fun AWSIotFunctions.listIndices(init: AWSIotListIndicesCommand.() -> Unit) {
	this.block.declare(AWSIotListIndicesCommand().apply(init))
}

@Generated
class AWSIotListIndicesCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListIndicesRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.iot.model.ListIndicesRequest {
		val input = com.amazonaws.services.iot.model.ListIndicesRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.listIndices(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-indices")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSIotFunctions.listJobExecutionsForJob(init: AWSIotListJobExecutionsForJobCommand.() -> Unit) {
	this.block.declare(AWSIotListJobExecutionsForJobCommand().apply(init))
}

@Generated
class AWSIotListJobExecutionsForJobCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListJobExecutionsForJobRequest> {

	var jobId: String? = null
	var status: JobExecutionStatus? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.iot.model.ListJobExecutionsForJobRequest {
		val input = com.amazonaws.services.iot.model.ListJobExecutionsForJobRequest()
		input.setJobId(this.jobId)
		input.setStatus(this.status?.toString())
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.listJobExecutionsForJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-job-executions-for-job")
				.argument("job-id", jobId)
				.argument("status", status?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSIotFunctions.listJobExecutionsForThing(init: AWSIotListJobExecutionsForThingCommand.() -> Unit) {
	this.block.declare(AWSIotListJobExecutionsForThingCommand().apply(init))
}

@Generated
class AWSIotListJobExecutionsForThingCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListJobExecutionsForThingRequest> {

	var thingName: String? = null
	var status: JobExecutionStatus? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.iot.model.ListJobExecutionsForThingRequest {
		val input = com.amazonaws.services.iot.model.ListJobExecutionsForThingRequest()
		input.setThingName(this.thingName)
		input.setStatus(this.status?.toString())
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.listJobExecutionsForThing(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-job-executions-for-thing")
				.argument("thing-name", thingName)
				.argument("status", status?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSIotFunctions.listJobs(init: AWSIotListJobsCommand.() -> Unit) {
	this.block.declare(AWSIotListJobsCommand().apply(init))
}

@Generated
class AWSIotListJobsCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListJobsRequest> {

	var status: JobStatus? = null
	var targetSelection: TargetSelection? = null
	var maxResults: Int? = 0
	var nextToken: String? = null
	var thingGroupName: String? = null
	var thingGroupId: String? = null

	override fun build(): com.amazonaws.services.iot.model.ListJobsRequest {
		val input = com.amazonaws.services.iot.model.ListJobsRequest()
		input.setStatus(this.status?.toString())
		input.setTargetSelection(this.targetSelection?.toString())
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		input.setThingGroupName(this.thingGroupName)
		input.setThingGroupId(this.thingGroupId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.listJobs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-jobs")
				.argument("status", status?.toString())
				.argument("target-selection", targetSelection?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.argument("thing-group-name", thingGroupName)
				.argument("thing-group-id", thingGroupId)
	}

}


fun AWSIotFunctions.listOTAUpdates(init: AWSIotListOTAUpdatesCommand.() -> Unit) {
	this.block.declare(AWSIotListOTAUpdatesCommand().apply(init))
}

@Generated
class AWSIotListOTAUpdatesCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListOTAUpdatesRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null
	var otaUpdateStatus: OTAUpdateStatus? = null

	override fun build(): com.amazonaws.services.iot.model.ListOTAUpdatesRequest {
		val input = com.amazonaws.services.iot.model.ListOTAUpdatesRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		input.setOtaUpdateStatus(this.otaUpdateStatus?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.listOTAUpdates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-otaupdates")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.argument("ota-update-status", otaUpdateStatus?.toString())
	}

}


fun AWSIotFunctions.listOutgoingCertificates(init: AWSIotListOutgoingCertificatesCommand.() -> Unit) {
	this.block.declare(AWSIotListOutgoingCertificatesCommand().apply(init))
}

@Generated
class AWSIotListOutgoingCertificatesCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListOutgoingCertificatesRequest> {

	var pageSize: Int? = 0
	var marker: String? = null
	var ascendingOrder: Boolean? = false

	override fun build(): com.amazonaws.services.iot.model.ListOutgoingCertificatesRequest {
		val input = com.amazonaws.services.iot.model.ListOutgoingCertificatesRequest()
		input.setPageSize(this.pageSize)
		input.setMarker(this.marker)
		input.setAscendingOrder(this.ascendingOrder)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.listOutgoingCertificates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-outgoing-certificates")
				.argument("page-size", pageSize?.toString())
				.argument("marker", marker)
				.option("ascending-order", ascendingOrder ?: false)
	}

}


fun AWSIotFunctions.listPolicies(init: AWSIotListPoliciesCommand.() -> Unit) {
	this.block.declare(AWSIotListPoliciesCommand().apply(init))
}

@Generated
class AWSIotListPoliciesCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListPoliciesRequest> {

	var marker: String? = null
	var pageSize: Int? = 0
	var ascendingOrder: Boolean? = false

	override fun build(): com.amazonaws.services.iot.model.ListPoliciesRequest {
		val input = com.amazonaws.services.iot.model.ListPoliciesRequest()
		input.setMarker(this.marker)
		input.setPageSize(this.pageSize)
		input.setAscendingOrder(this.ascendingOrder)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.listPolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-policies")
				.argument("marker", marker)
				.argument("page-size", pageSize?.toString())
				.option("ascending-order", ascendingOrder ?: false)
	}

}


fun AWSIotFunctions.listPolicyPrincipals(init: AWSIotListPolicyPrincipalsCommand.() -> Unit) {
	this.block.declare(AWSIotListPolicyPrincipalsCommand().apply(init))
}

@Generated
class AWSIotListPolicyPrincipalsCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListPolicyPrincipalsRequest> {

	var policyName: String? = null
	var marker: String? = null
	var pageSize: Int? = 0
	var ascendingOrder: Boolean? = false

	override fun build(): com.amazonaws.services.iot.model.ListPolicyPrincipalsRequest {
		val input = com.amazonaws.services.iot.model.ListPolicyPrincipalsRequest()
		input.setPolicyName(this.policyName)
		input.setMarker(this.marker)
		input.setPageSize(this.pageSize)
		input.setAscendingOrder(this.ascendingOrder)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.listPolicyPrincipals(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-policy-principals")
				.argument("policy-name", policyName)
				.argument("marker", marker)
				.argument("page-size", pageSize?.toString())
				.option("ascending-order", ascendingOrder ?: false)
	}

}


fun AWSIotFunctions.listPolicyVersions(init: AWSIotListPolicyVersionsCommand.() -> Unit) {
	this.block.declare(AWSIotListPolicyVersionsCommand().apply(init))
}

@Generated
class AWSIotListPolicyVersionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListPolicyVersionsRequest> {

	var policyName: String? = null

	override fun build(): com.amazonaws.services.iot.model.ListPolicyVersionsRequest {
		val input = com.amazonaws.services.iot.model.ListPolicyVersionsRequest()
		input.setPolicyName(this.policyName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.listPolicyVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-policy-versions")
				.argument("policy-name", policyName)
	}

}


fun AWSIotFunctions.listPrincipalPolicies(init: AWSIotListPrincipalPoliciesCommand.() -> Unit) {
	this.block.declare(AWSIotListPrincipalPoliciesCommand().apply(init))
}

@Generated
class AWSIotListPrincipalPoliciesCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListPrincipalPoliciesRequest> {

	var principal: String? = null
	var marker: String? = null
	var pageSize: Int? = 0
	var ascendingOrder: Boolean? = false

	override fun build(): com.amazonaws.services.iot.model.ListPrincipalPoliciesRequest {
		val input = com.amazonaws.services.iot.model.ListPrincipalPoliciesRequest()
		input.setPrincipal(this.principal)
		input.setMarker(this.marker)
		input.setPageSize(this.pageSize)
		input.setAscendingOrder(this.ascendingOrder)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.listPrincipalPolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-principal-policies")
				.argument("principal", principal)
				.argument("marker", marker)
				.argument("page-size", pageSize?.toString())
				.option("ascending-order", ascendingOrder ?: false)
	}

}


fun AWSIotFunctions.listPrincipalThings(init: AWSIotListPrincipalThingsCommand.() -> Unit) {
	this.block.declare(AWSIotListPrincipalThingsCommand().apply(init))
}

@Generated
class AWSIotListPrincipalThingsCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListPrincipalThingsRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0
	var principal: String? = null

	override fun build(): com.amazonaws.services.iot.model.ListPrincipalThingsRequest {
		val input = com.amazonaws.services.iot.model.ListPrincipalThingsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setPrincipal(this.principal)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.listPrincipalThings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-principal-things")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("principal", principal)
	}

}


fun AWSIotFunctions.listRoleAliases(init: AWSIotListRoleAliasesCommand.() -> Unit) {
	this.block.declare(AWSIotListRoleAliasesCommand().apply(init))
}

@Generated
class AWSIotListRoleAliasesCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListRoleAliasesRequest> {

	var pageSize: Int? = 0
	var marker: String? = null
	var ascendingOrder: Boolean? = false

	override fun build(): com.amazonaws.services.iot.model.ListRoleAliasesRequest {
		val input = com.amazonaws.services.iot.model.ListRoleAliasesRequest()
		input.setPageSize(this.pageSize)
		input.setMarker(this.marker)
		input.setAscendingOrder(this.ascendingOrder)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.listRoleAliases(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-role-aliases")
				.argument("page-size", pageSize?.toString())
				.argument("marker", marker)
				.option("ascending-order", ascendingOrder ?: false)
	}

}


fun AWSIotFunctions.listStreams(init: AWSIotListStreamsCommand.() -> Unit) {
	this.block.declare(AWSIotListStreamsCommand().apply(init))
}

@Generated
class AWSIotListStreamsCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListStreamsRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null
	var ascendingOrder: Boolean? = false

	override fun build(): com.amazonaws.services.iot.model.ListStreamsRequest {
		val input = com.amazonaws.services.iot.model.ListStreamsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		input.setAscendingOrder(this.ascendingOrder)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.listStreams(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-streams")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.option("ascending-order", ascendingOrder ?: false)
	}

}


fun AWSIotFunctions.listTargetsForPolicy(init: AWSIotListTargetsForPolicyCommand.() -> Unit) {
	this.block.declare(AWSIotListTargetsForPolicyCommand().apply(init))
}

@Generated
class AWSIotListTargetsForPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListTargetsForPolicyRequest> {

	var policyName: String? = null
	var marker: String? = null
	var pageSize: Int? = 0

	override fun build(): com.amazonaws.services.iot.model.ListTargetsForPolicyRequest {
		val input = com.amazonaws.services.iot.model.ListTargetsForPolicyRequest()
		input.setPolicyName(this.policyName)
		input.setMarker(this.marker)
		input.setPageSize(this.pageSize)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.listTargetsForPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-targets-for-policy")
				.argument("policy-name", policyName)
				.argument("marker", marker)
				.argument("page-size", pageSize?.toString())
	}

}


fun AWSIotFunctions.listThingGroups(init: AWSIotListThingGroupsCommand.() -> Unit) {
	this.block.declare(AWSIotListThingGroupsCommand().apply(init))
}

@Generated
class AWSIotListThingGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListThingGroupsRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0
	var parentGroup: String? = null
	var namePrefixFilter: String? = null
	var recursive: Boolean? = false

	override fun build(): com.amazonaws.services.iot.model.ListThingGroupsRequest {
		val input = com.amazonaws.services.iot.model.ListThingGroupsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setParentGroup(this.parentGroup)
		input.setNamePrefixFilter(this.namePrefixFilter)
		input.setRecursive(this.recursive)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.listThingGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-thing-groups")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("parent-group", parentGroup)
				.argument("name-prefix-filter", namePrefixFilter)
				.option("recursive", recursive ?: false)
	}

}


fun AWSIotFunctions.listThingGroupsForThing(init: AWSIotListThingGroupsForThingCommand.() -> Unit) {
	this.block.declare(AWSIotListThingGroupsForThingCommand().apply(init))
}

@Generated
class AWSIotListThingGroupsForThingCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListThingGroupsForThingRequest> {

	var thingName: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.iot.model.ListThingGroupsForThingRequest {
		val input = com.amazonaws.services.iot.model.ListThingGroupsForThingRequest()
		input.setThingName(this.thingName)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.listThingGroupsForThing(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-thing-groups-for-thing")
				.argument("thing-name", thingName)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSIotFunctions.listThingPrincipals(init: AWSIotListThingPrincipalsCommand.() -> Unit) {
	this.block.declare(AWSIotListThingPrincipalsCommand().apply(init))
}

@Generated
class AWSIotListThingPrincipalsCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListThingPrincipalsRequest> {

	var thingName: String? = null

	override fun build(): com.amazonaws.services.iot.model.ListThingPrincipalsRequest {
		val input = com.amazonaws.services.iot.model.ListThingPrincipalsRequest()
		input.setThingName(this.thingName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.listThingPrincipals(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-thing-principals")
				.argument("thing-name", thingName)
	}

}


fun AWSIotFunctions.listThingRegistrationTaskReports(init: AWSIotListThingRegistrationTaskReportsCommand.() -> Unit) {
	this.block.declare(AWSIotListThingRegistrationTaskReportsCommand().apply(init))
}

@Generated
class AWSIotListThingRegistrationTaskReportsCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListThingRegistrationTaskReportsRequest> {

	var taskId: String? = null
	var reportType: ReportType? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.iot.model.ListThingRegistrationTaskReportsRequest {
		val input = com.amazonaws.services.iot.model.ListThingRegistrationTaskReportsRequest()
		input.setTaskId(this.taskId)
		input.setReportType(this.reportType?.toString())
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.listThingRegistrationTaskReports(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-thing-registration-task-reports")
				.argument("task-id", taskId)
				.argument("report-type", reportType?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSIotFunctions.listThingRegistrationTasks(init: AWSIotListThingRegistrationTasksCommand.() -> Unit) {
	this.block.declare(AWSIotListThingRegistrationTasksCommand().apply(init))
}

@Generated
class AWSIotListThingRegistrationTasksCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListThingRegistrationTasksRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0
	var status: Status? = null

	override fun build(): com.amazonaws.services.iot.model.ListThingRegistrationTasksRequest {
		val input = com.amazonaws.services.iot.model.ListThingRegistrationTasksRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setStatus(this.status?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.listThingRegistrationTasks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-thing-registration-tasks")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("status", status?.toString())
	}

}


fun AWSIotFunctions.listThingTypes(init: AWSIotListThingTypesCommand.() -> Unit) {
	this.block.declare(AWSIotListThingTypesCommand().apply(init))
}

@Generated
class AWSIotListThingTypesCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListThingTypesRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0
	var thingTypeName: String? = null

	override fun build(): com.amazonaws.services.iot.model.ListThingTypesRequest {
		val input = com.amazonaws.services.iot.model.ListThingTypesRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setThingTypeName(this.thingTypeName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.listThingTypes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-thing-types")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("thing-type-name", thingTypeName)
	}

}


fun AWSIotFunctions.listThings(init: AWSIotListThingsCommand.() -> Unit) {
	this.block.declare(AWSIotListThingsCommand().apply(init))
}

@Generated
class AWSIotListThingsCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListThingsRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0
	var attributeName: String? = null
	var attributeValue: String? = null
	var thingTypeName: String? = null

	override fun build(): com.amazonaws.services.iot.model.ListThingsRequest {
		val input = com.amazonaws.services.iot.model.ListThingsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setAttributeName(this.attributeName)
		input.setAttributeValue(this.attributeValue)
		input.setThingTypeName(this.thingTypeName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.listThings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-things")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("attribute-name", attributeName)
				.argument("attribute-value", attributeValue)
				.argument("thing-type-name", thingTypeName)
	}

}


fun AWSIotFunctions.listThingsInThingGroup(init: AWSIotListThingsInThingGroupCommand.() -> Unit) {
	this.block.declare(AWSIotListThingsInThingGroupCommand().apply(init))
}

@Generated
class AWSIotListThingsInThingGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListThingsInThingGroupRequest> {

	var thingGroupName: String? = null
	var recursive: Boolean? = false
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.iot.model.ListThingsInThingGroupRequest {
		val input = com.amazonaws.services.iot.model.ListThingsInThingGroupRequest()
		input.setThingGroupName(this.thingGroupName)
		input.setRecursive(this.recursive)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.listThingsInThingGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-things-in-thing-group")
				.argument("thing-group-name", thingGroupName)
				.option("recursive", recursive ?: false)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSIotFunctions.listTopicRules(init: AWSIotListTopicRulesCommand.() -> Unit) {
	this.block.declare(AWSIotListTopicRulesCommand().apply(init))
}

@Generated
class AWSIotListTopicRulesCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListTopicRulesRequest> {

	var topic: String? = null
	var maxResults: Int? = 0
	var nextToken: String? = null
	var ruleDisabled: Boolean? = false

	override fun build(): com.amazonaws.services.iot.model.ListTopicRulesRequest {
		val input = com.amazonaws.services.iot.model.ListTopicRulesRequest()
		input.setTopic(this.topic)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		input.setRuleDisabled(this.ruleDisabled)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.listTopicRules(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-topic-rules")
				.argument("topic", topic)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.option("rule-disabled", ruleDisabled ?: false)
	}

}


fun AWSIotFunctions.listV2LoggingLevels(init: AWSIotListV2LoggingLevelsCommand.() -> Unit) {
	this.block.declare(AWSIotListV2LoggingLevelsCommand().apply(init))
}

@Generated
class AWSIotListV2LoggingLevelsCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListV2LoggingLevelsRequest> {

	var targetType: LogTargetType? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.iot.model.ListV2LoggingLevelsRequest {
		val input = com.amazonaws.services.iot.model.ListV2LoggingLevelsRequest()
		input.setTargetType(this.targetType?.toString())
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.listV2LoggingLevels(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-v2-logging-levels")
				.argument("target-type", targetType?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSIotFunctions.registerCACertificate(init: AWSIotRegisterCACertificateCommand.() -> Unit) {
	this.block.declare(AWSIotRegisterCACertificateCommand().apply(init))
}

@Generated
class AWSIotRegisterCACertificateCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.RegisterCACertificateRequest> {

	var caCertificate: String? = null
	var verificationCertificate: String? = null
	var setAsActive: Boolean? = false
	var allowAutoRegistration: Boolean? = false
	var registrationConfig: com.amazonaws.services.iot.model.RegistrationConfig? = null

	override fun build(): com.amazonaws.services.iot.model.RegisterCACertificateRequest {
		val input = com.amazonaws.services.iot.model.RegisterCACertificateRequest()
		input.setCaCertificate(this.caCertificate)
		input.setVerificationCertificate(this.verificationCertificate)
		input.setSetAsActive(this.setAsActive)
		input.setAllowAutoRegistration(this.allowAutoRegistration)
		input.setRegistrationConfig(this.registrationConfig)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.registerCACertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api register-cacertificate")
				.argument("ca-certificate", caCertificate)
				.argument("verification-certificate", verificationCertificate)
				.option("set-as-active", setAsActive ?: false)
				.option("allow-auto-registration", allowAutoRegistration ?: false)
				.argument("registration-config", registrationConfig?.toString())
	}

}


fun AWSIotFunctions.registerCertificate(init: AWSIotRegisterCertificateCommand.() -> Unit) {
	this.block.declare(AWSIotRegisterCertificateCommand().apply(init))
}

@Generated
class AWSIotRegisterCertificateCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.RegisterCertificateRequest> {

	var certificatePem: String? = null
	var caCertificatePem: String? = null
	var setAsActive: Boolean? = false
	var status: CertificateStatus? = null

	override fun build(): com.amazonaws.services.iot.model.RegisterCertificateRequest {
		val input = com.amazonaws.services.iot.model.RegisterCertificateRequest()
		input.setCertificatePem(this.certificatePem)
		input.setCaCertificatePem(this.caCertificatePem)
		input.setSetAsActive(this.setAsActive)
		input.setStatus(this.status?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.registerCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api register-certificate")
				.argument("certificate-pem", certificatePem)
				.argument("ca-certificate-pem", caCertificatePem)
				.option("set-as-active", setAsActive ?: false)
				.argument("status", status?.toString())
	}

}


fun AWSIotFunctions.registerThing(init: AWSIotRegisterThingCommand.() -> Unit) {
	this.block.declare(AWSIotRegisterThingCommand().apply(init))
}

@Generated
class AWSIotRegisterThingCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.RegisterThingRequest> {

	var templateBody: String? = null
	var parameters: Map<String, String>? = null

	override fun build(): com.amazonaws.services.iot.model.RegisterThingRequest {
		val input = com.amazonaws.services.iot.model.RegisterThingRequest()
		input.setTemplateBody(this.templateBody)
		input.setParameters(this.parameters)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.registerThing(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api register-thing")
				.argument("template-body", templateBody)
				.argument("parameters", parameters?.toString())
	}

}


fun AWSIotFunctions.rejectCertificateTransfer(init: AWSIotRejectCertificateTransferCommand.() -> Unit) {
	this.block.declare(AWSIotRejectCertificateTransferCommand().apply(init))
}

@Generated
class AWSIotRejectCertificateTransferCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.RejectCertificateTransferRequest> {

	var certificateId: String? = null
	var rejectReason: String? = null

	override fun build(): com.amazonaws.services.iot.model.RejectCertificateTransferRequest {
		val input = com.amazonaws.services.iot.model.RejectCertificateTransferRequest()
		input.setCertificateId(this.certificateId)
		input.setRejectReason(this.rejectReason)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.rejectCertificateTransfer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api reject-certificate-transfer")
				.argument("certificate-id", certificateId)
				.argument("reject-reason", rejectReason)
	}

}


fun AWSIotFunctions.removeThingFromThingGroup(init: AWSIotRemoveThingFromThingGroupCommand.() -> Unit) {
	this.block.declare(AWSIotRemoveThingFromThingGroupCommand().apply(init))
}

@Generated
class AWSIotRemoveThingFromThingGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.RemoveThingFromThingGroupRequest> {

	var thingGroupName: String? = null
	var thingGroupArn: String? = null
	var thingName: String? = null
	var thingArn: String? = null

	override fun build(): com.amazonaws.services.iot.model.RemoveThingFromThingGroupRequest {
		val input = com.amazonaws.services.iot.model.RemoveThingFromThingGroupRequest()
		input.setThingGroupName(this.thingGroupName)
		input.setThingGroupArn(this.thingGroupArn)
		input.setThingName(this.thingName)
		input.setThingArn(this.thingArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.removeThingFromThingGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api remove-thing-from-thing-group")
				.argument("thing-group-name", thingGroupName)
				.argument("thing-group-arn", thingGroupArn)
				.argument("thing-name", thingName)
				.argument("thing-arn", thingArn)
	}

}


fun AWSIotFunctions.replaceTopicRule(init: AWSIotReplaceTopicRuleCommand.() -> Unit) {
	this.block.declare(AWSIotReplaceTopicRuleCommand().apply(init))
}

@Generated
class AWSIotReplaceTopicRuleCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ReplaceTopicRuleRequest> {

	var ruleName: String? = null
	var topicRulePayload: com.amazonaws.services.iot.model.TopicRulePayload? = null

	override fun build(): com.amazonaws.services.iot.model.ReplaceTopicRuleRequest {
		val input = com.amazonaws.services.iot.model.ReplaceTopicRuleRequest()
		input.setRuleName(this.ruleName)
		input.setTopicRulePayload(this.topicRulePayload)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.replaceTopicRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api replace-topic-rule")
				.argument("rule-name", ruleName)
				.argument("topic-rule-payload", topicRulePayload?.toString())
	}

}


fun AWSIotFunctions.searchIndex(init: AWSIotSearchIndexCommand.() -> Unit) {
	this.block.declare(AWSIotSearchIndexCommand().apply(init))
}

@Generated
class AWSIotSearchIndexCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.SearchIndexRequest> {

	var indexName: String? = null
	var queryString: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0
	var queryVersion: String? = null

	override fun build(): com.amazonaws.services.iot.model.SearchIndexRequest {
		val input = com.amazonaws.services.iot.model.SearchIndexRequest()
		input.setIndexName(this.indexName)
		input.setQueryString(this.queryString)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setQueryVersion(this.queryVersion)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.searchIndex(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api search-index")
				.argument("index-name", indexName)
				.argument("query-string", queryString)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("query-version", queryVersion)
	}

}


fun AWSIotFunctions.setDefaultAuthorizer(init: AWSIotSetDefaultAuthorizerCommand.() -> Unit) {
	this.block.declare(AWSIotSetDefaultAuthorizerCommand().apply(init))
}

@Generated
class AWSIotSetDefaultAuthorizerCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.SetDefaultAuthorizerRequest> {

	var authorizerName: String? = null

	override fun build(): com.amazonaws.services.iot.model.SetDefaultAuthorizerRequest {
		val input = com.amazonaws.services.iot.model.SetDefaultAuthorizerRequest()
		input.setAuthorizerName(this.authorizerName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.setDefaultAuthorizer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api set-default-authorizer")
				.argument("authorizer-name", authorizerName)
	}

}


fun AWSIotFunctions.setDefaultPolicyVersion(init: AWSIotSetDefaultPolicyVersionCommand.() -> Unit) {
	this.block.declare(AWSIotSetDefaultPolicyVersionCommand().apply(init))
}

@Generated
class AWSIotSetDefaultPolicyVersionCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.SetDefaultPolicyVersionRequest> {

	var policyName: String? = null
	var policyVersionId: String? = null

	override fun build(): com.amazonaws.services.iot.model.SetDefaultPolicyVersionRequest {
		val input = com.amazonaws.services.iot.model.SetDefaultPolicyVersionRequest()
		input.setPolicyName(this.policyName)
		input.setPolicyVersionId(this.policyVersionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.setDefaultPolicyVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api set-default-policy-version")
				.argument("policy-name", policyName)
				.argument("policy-version-id", policyVersionId)
	}

}


fun AWSIotFunctions.setLoggingOptions(init: AWSIotSetLoggingOptionsCommand.() -> Unit) {
	this.block.declare(AWSIotSetLoggingOptionsCommand().apply(init))
}

@Generated
class AWSIotSetLoggingOptionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.SetLoggingOptionsRequest> {

	var loggingOptionsPayload: com.amazonaws.services.iot.model.LoggingOptionsPayload? = null

	override fun build(): com.amazonaws.services.iot.model.SetLoggingOptionsRequest {
		val input = com.amazonaws.services.iot.model.SetLoggingOptionsRequest()
		input.setLoggingOptionsPayload(this.loggingOptionsPayload)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.setLoggingOptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api set-logging-options")
				.argument("logging-options-payload", loggingOptionsPayload?.toString())
	}

}


fun AWSIotFunctions.setV2LoggingLevel(init: AWSIotSetV2LoggingLevelCommand.() -> Unit) {
	this.block.declare(AWSIotSetV2LoggingLevelCommand().apply(init))
}

@Generated
class AWSIotSetV2LoggingLevelCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.SetV2LoggingLevelRequest> {

	var logTarget: com.amazonaws.services.iot.model.LogTarget? = null
	var logLevel: LogLevel? = null

	override fun build(): com.amazonaws.services.iot.model.SetV2LoggingLevelRequest {
		val input = com.amazonaws.services.iot.model.SetV2LoggingLevelRequest()
		input.setLogTarget(this.logTarget)
		input.setLogLevel(this.logLevel?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.setV2LoggingLevel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api set-v2-logging-level")
				.argument("log-target", logTarget?.toString())
				.argument("log-level", logLevel?.toString())
	}

}


fun AWSIotFunctions.setV2LoggingOptions(init: AWSIotSetV2LoggingOptionsCommand.() -> Unit) {
	this.block.declare(AWSIotSetV2LoggingOptionsCommand().apply(init))
}

@Generated
class AWSIotSetV2LoggingOptionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.SetV2LoggingOptionsRequest> {

	var roleArn: String? = null
	var defaultLogLevel: LogLevel? = null
	var disableAllLogs: Boolean? = false

	override fun build(): com.amazonaws.services.iot.model.SetV2LoggingOptionsRequest {
		val input = com.amazonaws.services.iot.model.SetV2LoggingOptionsRequest()
		input.setRoleArn(this.roleArn)
		input.setDefaultLogLevel(this.defaultLogLevel?.toString())
		input.setDisableAllLogs(this.disableAllLogs)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.setV2LoggingOptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api set-v2-logging-options")
				.argument("role-arn", roleArn)
				.argument("default-log-level", defaultLogLevel?.toString())
				.option("disable-all-logs", disableAllLogs ?: false)
	}

}


fun AWSIotFunctions.startThingRegistrationTask(init: AWSIotStartThingRegistrationTaskCommand.() -> Unit) {
	this.block.declare(AWSIotStartThingRegistrationTaskCommand().apply(init))
}

@Generated
class AWSIotStartThingRegistrationTaskCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.StartThingRegistrationTaskRequest> {

	var templateBody: String? = null
	var inputFileBucket: String? = null
	var inputFileKey: String? = null
	var roleArn: String? = null

	override fun build(): com.amazonaws.services.iot.model.StartThingRegistrationTaskRequest {
		val input = com.amazonaws.services.iot.model.StartThingRegistrationTaskRequest()
		input.setTemplateBody(this.templateBody)
		input.setInputFileBucket(this.inputFileBucket)
		input.setInputFileKey(this.inputFileKey)
		input.setRoleArn(this.roleArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.startThingRegistrationTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api start-thing-registration-task")
				.argument("template-body", templateBody)
				.argument("input-file-bucket", inputFileBucket)
				.argument("input-file-key", inputFileKey)
				.argument("role-arn", roleArn)
	}

}


fun AWSIotFunctions.stopThingRegistrationTask(init: AWSIotStopThingRegistrationTaskCommand.() -> Unit) {
	this.block.declare(AWSIotStopThingRegistrationTaskCommand().apply(init))
}

@Generated
class AWSIotStopThingRegistrationTaskCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.StopThingRegistrationTaskRequest> {

	var taskId: String? = null

	override fun build(): com.amazonaws.services.iot.model.StopThingRegistrationTaskRequest {
		val input = com.amazonaws.services.iot.model.StopThingRegistrationTaskRequest()
		input.setTaskId(this.taskId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.stopThingRegistrationTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api stop-thing-registration-task")
				.argument("task-id", taskId)
	}

}


fun AWSIotFunctions.testAuthorization(init: AWSIotTestAuthorizationCommand.() -> Unit) {
	this.block.declare(AWSIotTestAuthorizationCommand().apply(init))
}

@Generated
class AWSIotTestAuthorizationCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.TestAuthorizationRequest> {

	var principal: String? = null
	var cognitoIdentityPoolId: String? = null
	var authInfos: List<com.amazonaws.services.iot.model.AuthInfo>? = null
	var clientId: String? = null
	var policyNamesToAdd: List<String>? = null
	var policyNamesToSkip: List<String>? = null

	override fun build(): com.amazonaws.services.iot.model.TestAuthorizationRequest {
		val input = com.amazonaws.services.iot.model.TestAuthorizationRequest()
		input.setPrincipal(this.principal)
		input.setCognitoIdentityPoolId(this.cognitoIdentityPoolId)
		input.setAuthInfos(this.authInfos)
		input.setClientId(this.clientId)
		input.setPolicyNamesToAdd(this.policyNamesToAdd)
		input.setPolicyNamesToSkip(this.policyNamesToSkip)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.testAuthorization(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api test-authorization")
				.argument("principal", principal)
				.argument("cognito-identity-pool-id", cognitoIdentityPoolId)
				.argument("auth-infos", authInfos?.toString())
				.argument("client-id", clientId)
				.argument("policy-names-to-add", policyNamesToAdd?.toString())
				.argument("policy-names-to-skip", policyNamesToSkip?.toString())
	}

}


fun AWSIotFunctions.testInvokeAuthorizer(init: AWSIotTestInvokeAuthorizerCommand.() -> Unit) {
	this.block.declare(AWSIotTestInvokeAuthorizerCommand().apply(init))
}

@Generated
class AWSIotTestInvokeAuthorizerCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.TestInvokeAuthorizerRequest> {

	var authorizerName: String? = null
	var token: String? = null
	var tokenSignature: String? = null

	override fun build(): com.amazonaws.services.iot.model.TestInvokeAuthorizerRequest {
		val input = com.amazonaws.services.iot.model.TestInvokeAuthorizerRequest()
		input.setAuthorizerName(this.authorizerName)
		input.setToken(this.token)
		input.setTokenSignature(this.tokenSignature)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.testInvokeAuthorizer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api test-invoke-authorizer")
				.argument("authorizer-name", authorizerName)
				.argument("token", token)
				.argument("token-signature", tokenSignature)
	}

}


fun AWSIotFunctions.transferCertificate(init: AWSIotTransferCertificateCommand.() -> Unit) {
	this.block.declare(AWSIotTransferCertificateCommand().apply(init))
}

@Generated
class AWSIotTransferCertificateCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.TransferCertificateRequest> {

	var certificateId: String? = null
	var targetAwsAccount: String? = null
	var transferMessage: String? = null

	override fun build(): com.amazonaws.services.iot.model.TransferCertificateRequest {
		val input = com.amazonaws.services.iot.model.TransferCertificateRequest()
		input.setCertificateId(this.certificateId)
		input.setTargetAwsAccount(this.targetAwsAccount)
		input.setTransferMessage(this.transferMessage)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.transferCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api transfer-certificate")
				.argument("certificate-id", certificateId)
				.argument("target-aws-account", targetAwsAccount)
				.argument("transfer-message", transferMessage)
	}

}


fun AWSIotFunctions.updateAuthorizer(init: AWSIotUpdateAuthorizerCommand.() -> Unit) {
	this.block.declare(AWSIotUpdateAuthorizerCommand().apply(init))
}

@Generated
class AWSIotUpdateAuthorizerCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.UpdateAuthorizerRequest> {

	var authorizerName: String? = null
	var authorizerFunctionArn: String? = null
	var tokenKeyName: String? = null
	var tokenSigningPublicKeys: Map<String, String>? = null
	var status: AuthorizerStatus? = null

	override fun build(): com.amazonaws.services.iot.model.UpdateAuthorizerRequest {
		val input = com.amazonaws.services.iot.model.UpdateAuthorizerRequest()
		input.setAuthorizerName(this.authorizerName)
		input.setAuthorizerFunctionArn(this.authorizerFunctionArn)
		input.setTokenKeyName(this.tokenKeyName)
		input.setTokenSigningPublicKeys(this.tokenSigningPublicKeys)
		input.setStatus(this.status?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.updateAuthorizer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api update-authorizer")
				.argument("authorizer-name", authorizerName)
				.argument("authorizer-function-arn", authorizerFunctionArn)
				.argument("token-key-name", tokenKeyName)
				.argument("token-signing-public-keys", tokenSigningPublicKeys?.toString())
				.argument("status", status?.toString())
	}

}


fun AWSIotFunctions.updateCACertificate(init: AWSIotUpdateCACertificateCommand.() -> Unit) {
	this.block.declare(AWSIotUpdateCACertificateCommand().apply(init))
}

@Generated
class AWSIotUpdateCACertificateCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.UpdateCACertificateRequest> {

	var certificateId: String? = null
	var newStatus: CACertificateStatus? = null
	var newAutoRegistrationStatus: AutoRegistrationStatus? = null
	var registrationConfig: com.amazonaws.services.iot.model.RegistrationConfig? = null
	var removeAutoRegistration: Boolean? = false

	override fun build(): com.amazonaws.services.iot.model.UpdateCACertificateRequest {
		val input = com.amazonaws.services.iot.model.UpdateCACertificateRequest()
		input.setCertificateId(this.certificateId)
		input.setNewStatus(this.newStatus?.toString())
		input.setNewAutoRegistrationStatus(this.newAutoRegistrationStatus?.toString())
		input.setRegistrationConfig(this.registrationConfig)
		input.setRemoveAutoRegistration(this.removeAutoRegistration)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.updateCACertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api update-cacertificate")
				.argument("certificate-id", certificateId)
				.argument("new-status", newStatus?.toString())
				.argument("new-auto-registration-status", newAutoRegistrationStatus?.toString())
				.argument("registration-config", registrationConfig?.toString())
				.option("remove-auto-registration", removeAutoRegistration ?: false)
	}

}


fun AWSIotFunctions.updateCertificate(init: AWSIotUpdateCertificateCommand.() -> Unit) {
	this.block.declare(AWSIotUpdateCertificateCommand().apply(init))
}

@Generated
class AWSIotUpdateCertificateCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.UpdateCertificateRequest> {

	var certificateId: String? = null
	var newStatus: CertificateStatus? = null

	override fun build(): com.amazonaws.services.iot.model.UpdateCertificateRequest {
		val input = com.amazonaws.services.iot.model.UpdateCertificateRequest()
		input.setCertificateId(this.certificateId)
		input.setNewStatus(this.newStatus?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.updateCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api update-certificate")
				.argument("certificate-id", certificateId)
				.argument("new-status", newStatus?.toString())
	}

}


fun AWSIotFunctions.updateEventConfigurations(init: AWSIotUpdateEventConfigurationsCommand.() -> Unit) {
	this.block.declare(AWSIotUpdateEventConfigurationsCommand().apply(init))
}

@Generated
class AWSIotUpdateEventConfigurationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.UpdateEventConfigurationsRequest> {

	var eventConfigurations: Map<EventType, com.amazonaws.services.iot.model.Configuration>? = null

	override fun build(): com.amazonaws.services.iot.model.UpdateEventConfigurationsRequest {
		val input = com.amazonaws.services.iot.model.UpdateEventConfigurationsRequest()
		input.setEventConfigurations(this.eventConfigurations?.mapKeys { it.toString() })
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.updateEventConfigurations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api update-event-configurations")
				.argument("event-configurations", eventConfigurations?.toString())
	}

}


fun AWSIotFunctions.updateIndexingConfiguration(init: AWSIotUpdateIndexingConfigurationCommand.() -> Unit) {
	this.block.declare(AWSIotUpdateIndexingConfigurationCommand().apply(init))
}

@Generated
class AWSIotUpdateIndexingConfigurationCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.UpdateIndexingConfigurationRequest> {

	var thingIndexingConfiguration: com.amazonaws.services.iot.model.ThingIndexingConfiguration? = null

	override fun build(): com.amazonaws.services.iot.model.UpdateIndexingConfigurationRequest {
		val input = com.amazonaws.services.iot.model.UpdateIndexingConfigurationRequest()
		input.setThingIndexingConfiguration(this.thingIndexingConfiguration)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.updateIndexingConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api update-indexing-configuration")
				.argument("thing-indexing-configuration", thingIndexingConfiguration?.toString())
	}

}


fun AWSIotFunctions.updateRoleAlias(init: AWSIotUpdateRoleAliasCommand.() -> Unit) {
	this.block.declare(AWSIotUpdateRoleAliasCommand().apply(init))
}

@Generated
class AWSIotUpdateRoleAliasCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.UpdateRoleAliasRequest> {

	var roleAlias: String? = null
	var roleArn: String? = null
	var credentialDurationSeconds: Int? = 0

	override fun build(): com.amazonaws.services.iot.model.UpdateRoleAliasRequest {
		val input = com.amazonaws.services.iot.model.UpdateRoleAliasRequest()
		input.setRoleAlias(this.roleAlias)
		input.setRoleArn(this.roleArn)
		input.setCredentialDurationSeconds(this.credentialDurationSeconds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.updateRoleAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api update-role-alias")
				.argument("role-alias", roleAlias)
				.argument("role-arn", roleArn)
				.argument("credential-duration-seconds", credentialDurationSeconds?.toString())
	}

}


fun AWSIotFunctions.updateStream(init: AWSIotUpdateStreamCommand.() -> Unit) {
	this.block.declare(AWSIotUpdateStreamCommand().apply(init))
}

@Generated
class AWSIotUpdateStreamCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.UpdateStreamRequest> {

	var streamId: String? = null
	var description: String? = null
	var files: List<com.amazonaws.services.iot.model.StreamFile>? = null
	var roleArn: String? = null

	override fun build(): com.amazonaws.services.iot.model.UpdateStreamRequest {
		val input = com.amazonaws.services.iot.model.UpdateStreamRequest()
		input.setStreamId(this.streamId)
		input.setDescription(this.description)
		input.setFiles(this.files)
		input.setRoleArn(this.roleArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.updateStream(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api update-stream")
				.argument("stream-id", streamId)
				.argument("description", description)
				.argument("files", files?.toString())
				.argument("role-arn", roleArn)
	}

}


fun AWSIotFunctions.updateThing(init: AWSIotUpdateThingCommand.() -> Unit) {
	this.block.declare(AWSIotUpdateThingCommand().apply(init))
}

@Generated
class AWSIotUpdateThingCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.UpdateThingRequest> {

	var thingName: String? = null
	var thingTypeName: String? = null
	var attributePayload: com.amazonaws.services.iot.model.AttributePayload? = null
	var expectedVersion: Long? = 0L
	var removeThingType: Boolean? = false

	override fun build(): com.amazonaws.services.iot.model.UpdateThingRequest {
		val input = com.amazonaws.services.iot.model.UpdateThingRequest()
		input.setThingName(this.thingName)
		input.setThingTypeName(this.thingTypeName)
		input.setAttributePayload(this.attributePayload)
		input.setExpectedVersion(this.expectedVersion)
		input.setRemoveThingType(this.removeThingType)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.updateThing(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api update-thing")
				.argument("thing-name", thingName)
				.argument("thing-type-name", thingTypeName)
				.argument("attribute-payload", attributePayload?.toString())
				.argument("expected-version", expectedVersion?.toString())
				.option("remove-thing-type", removeThingType ?: false)
	}

}


fun AWSIotFunctions.updateThingGroup(init: AWSIotUpdateThingGroupCommand.() -> Unit) {
	this.block.declare(AWSIotUpdateThingGroupCommand().apply(init))
}

@Generated
class AWSIotUpdateThingGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.UpdateThingGroupRequest> {

	var thingGroupName: String? = null
	var thingGroupProperties: com.amazonaws.services.iot.model.ThingGroupProperties? = null
	var expectedVersion: Long? = 0L

	override fun build(): com.amazonaws.services.iot.model.UpdateThingGroupRequest {
		val input = com.amazonaws.services.iot.model.UpdateThingGroupRequest()
		input.setThingGroupName(this.thingGroupName)
		input.setThingGroupProperties(this.thingGroupProperties)
		input.setExpectedVersion(this.expectedVersion)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.updateThingGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api update-thing-group")
				.argument("thing-group-name", thingGroupName)
				.argument("thing-group-properties", thingGroupProperties?.toString())
				.argument("expected-version", expectedVersion?.toString())
	}

}


fun AWSIotFunctions.updateThingGroupsForThing(init: AWSIotUpdateThingGroupsForThingCommand.() -> Unit) {
	this.block.declare(AWSIotUpdateThingGroupsForThingCommand().apply(init))
}

@Generated
class AWSIotUpdateThingGroupsForThingCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.UpdateThingGroupsForThingRequest> {

	var thingName: String? = null
	var thingGroupsToAdd: List<String>? = null
	var thingGroupsToRemove: List<String>? = null

	override fun build(): com.amazonaws.services.iot.model.UpdateThingGroupsForThingRequest {
		val input = com.amazonaws.services.iot.model.UpdateThingGroupsForThingRequest()
		input.setThingName(this.thingName)
		input.setThingGroupsToAdd(this.thingGroupsToAdd)
		input.setThingGroupsToRemove(this.thingGroupsToRemove)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.execute_api.updateThingGroupsForThing(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api update-thing-groups-for-thing")
				.argument("thing-name", thingName)
				.argument("thing-groups-to-add", thingGroupsToAdd?.toString())
				.argument("thing-groups-to-remove", thingGroupsToRemove?.toString())
	}

}
