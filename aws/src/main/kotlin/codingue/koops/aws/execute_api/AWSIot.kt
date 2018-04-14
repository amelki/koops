
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws.execute_api

import javax.annotation.Generated
import codingue.koops.core.*
import codingue.koops.aws.*
import com.amazonaws.services.iot.*
import com.amazonaws.services.iot.model.*

var codingue.koops.core.Environment.execute_api: AWSIot
	get() {
		var service = this.capabilities["aws-execute_api"]
		if (service == null) {
			service = AWSIotClientBuilder.standard().build()
			this.capabilities["aws-execute_api"] = service
		}
		return service as AWSIot
	}
	set(execute_api) {
		this.capabilities["aws-execute_api"] = execute_api
	}

@Generated
class AWSIotFunctions(val block: Block)

infix fun <T> AwsContinuation.execute_api(init: AWSIotFunctions.() -> T): T {
	return AWSIotFunctions(shell).run(init)
}

			

fun AWSIotFunctions.acceptCertificateTransfer(init: AWSIotAcceptCertificateTransferCommand.() -> Unit): com.amazonaws.services.iot.model.AcceptCertificateTransferResult {
	return this.block.declare(AWSIotAcceptCertificateTransferCommand().apply(init)) as com.amazonaws.services.iot.model.AcceptCertificateTransferResult
}

@Generated
class AWSIotAcceptCertificateTransferCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.AcceptCertificateTransferRequest, com.amazonaws.services.iot.model.AcceptCertificateTransferResult> {

	var certificateId: String? = null
	var setAsActive: Boolean? = false

	override fun build(): com.amazonaws.services.iot.model.AcceptCertificateTransferRequest {
		val input = com.amazonaws.services.iot.model.AcceptCertificateTransferRequest()
		input.setCertificateId(this.certificateId)
		input.setSetAsActive(this.setAsActive)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.AcceptCertificateTransferResult {
	  return com.amazonaws.services.iot.model.AcceptCertificateTransferResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.AcceptCertificateTransferResult {
		return environment.execute_api.acceptCertificateTransfer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api accept-certificate-transfer")
				.argument("certificate-id", certificateId)
				.option("set-as-active", setAsActive ?: false)
	}

}


fun AWSIotFunctions.addThingToThingGroup(init: AWSIotAddThingToThingGroupCommand.() -> Unit): com.amazonaws.services.iot.model.AddThingToThingGroupResult {
	return this.block.declare(AWSIotAddThingToThingGroupCommand().apply(init)) as com.amazonaws.services.iot.model.AddThingToThingGroupResult
}

@Generated
class AWSIotAddThingToThingGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.AddThingToThingGroupRequest, com.amazonaws.services.iot.model.AddThingToThingGroupResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.AddThingToThingGroupResult {
	  return com.amazonaws.services.iot.model.AddThingToThingGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.AddThingToThingGroupResult {
		return environment.execute_api.addThingToThingGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api add-thing-to-thing-group")
				.argument("thing-group-name", thingGroupName)
				.argument("thing-group-arn", thingGroupArn)
				.argument("thing-name", thingName)
				.argument("thing-arn", thingArn)
	}

}


fun AWSIotFunctions.associateTargetsWithJob(init: AWSIotAssociateTargetsWithJobCommand.() -> Unit): com.amazonaws.services.iot.model.AssociateTargetsWithJobResult {
	return this.block.declare(AWSIotAssociateTargetsWithJobCommand().apply(init)) as com.amazonaws.services.iot.model.AssociateTargetsWithJobResult
}

@Generated
class AWSIotAssociateTargetsWithJobCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.AssociateTargetsWithJobRequest, com.amazonaws.services.iot.model.AssociateTargetsWithJobResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.AssociateTargetsWithJobResult {
	  return com.amazonaws.services.iot.model.AssociateTargetsWithJobResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.AssociateTargetsWithJobResult {
		return environment.execute_api.associateTargetsWithJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api associate-targets-with-job")
				.argument("targets", targets?.toString())
				.argument("job-id", jobId)
				.argument("comment", comment)
	}

}


fun AWSIotFunctions.attachPolicy(init: AWSIotAttachPolicyCommand.() -> Unit): com.amazonaws.services.iot.model.AttachPolicyResult {
	return this.block.declare(AWSIotAttachPolicyCommand().apply(init)) as com.amazonaws.services.iot.model.AttachPolicyResult
}

@Generated
class AWSIotAttachPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.AttachPolicyRequest, com.amazonaws.services.iot.model.AttachPolicyResult> {

	var policyName: String? = null
	var target: String? = null

	override fun build(): com.amazonaws.services.iot.model.AttachPolicyRequest {
		val input = com.amazonaws.services.iot.model.AttachPolicyRequest()
		input.setPolicyName(this.policyName)
		input.setTarget(this.target)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.AttachPolicyResult {
	  return com.amazonaws.services.iot.model.AttachPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.AttachPolicyResult {
		return environment.execute_api.attachPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api attach-policy")
				.argument("policy-name", policyName)
				.argument("target", target)
	}

}


fun AWSIotFunctions.attachPrincipalPolicy(init: AWSIotAttachPrincipalPolicyCommand.() -> Unit): com.amazonaws.services.iot.model.AttachPrincipalPolicyResult {
	return this.block.declare(AWSIotAttachPrincipalPolicyCommand().apply(init)) as com.amazonaws.services.iot.model.AttachPrincipalPolicyResult
}

@Generated
class AWSIotAttachPrincipalPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.AttachPrincipalPolicyRequest, com.amazonaws.services.iot.model.AttachPrincipalPolicyResult> {

	var policyName: String? = null
	var principal: String? = null

	override fun build(): com.amazonaws.services.iot.model.AttachPrincipalPolicyRequest {
		val input = com.amazonaws.services.iot.model.AttachPrincipalPolicyRequest()
		input.setPolicyName(this.policyName)
		input.setPrincipal(this.principal)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.AttachPrincipalPolicyResult {
	  return com.amazonaws.services.iot.model.AttachPrincipalPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.AttachPrincipalPolicyResult {
		return environment.execute_api.attachPrincipalPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api attach-principal-policy")
				.argument("policy-name", policyName)
				.argument("principal", principal)
	}

}


fun AWSIotFunctions.attachThingPrincipal(init: AWSIotAttachThingPrincipalCommand.() -> Unit): com.amazonaws.services.iot.model.AttachThingPrincipalResult {
	return this.block.declare(AWSIotAttachThingPrincipalCommand().apply(init)) as com.amazonaws.services.iot.model.AttachThingPrincipalResult
}

@Generated
class AWSIotAttachThingPrincipalCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.AttachThingPrincipalRequest, com.amazonaws.services.iot.model.AttachThingPrincipalResult> {

	var thingName: String? = null
	var principal: String? = null

	override fun build(): com.amazonaws.services.iot.model.AttachThingPrincipalRequest {
		val input = com.amazonaws.services.iot.model.AttachThingPrincipalRequest()
		input.setThingName(this.thingName)
		input.setPrincipal(this.principal)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.AttachThingPrincipalResult {
	  return com.amazonaws.services.iot.model.AttachThingPrincipalResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.AttachThingPrincipalResult {
		return environment.execute_api.attachThingPrincipal(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api attach-thing-principal")
				.argument("thing-name", thingName)
				.argument("principal", principal)
	}

}


fun AWSIotFunctions.cancelCertificateTransfer(init: AWSIotCancelCertificateTransferCommand.() -> Unit): com.amazonaws.services.iot.model.CancelCertificateTransferResult {
	return this.block.declare(AWSIotCancelCertificateTransferCommand().apply(init)) as com.amazonaws.services.iot.model.CancelCertificateTransferResult
}

@Generated
class AWSIotCancelCertificateTransferCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.CancelCertificateTransferRequest, com.amazonaws.services.iot.model.CancelCertificateTransferResult> {

	var certificateId: String? = null

	override fun build(): com.amazonaws.services.iot.model.CancelCertificateTransferRequest {
		val input = com.amazonaws.services.iot.model.CancelCertificateTransferRequest()
		input.setCertificateId(this.certificateId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.CancelCertificateTransferResult {
	  return com.amazonaws.services.iot.model.CancelCertificateTransferResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.CancelCertificateTransferResult {
		return environment.execute_api.cancelCertificateTransfer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api cancel-certificate-transfer")
				.argument("certificate-id", certificateId)
	}

}


fun AWSIotFunctions.cancelJob(init: AWSIotCancelJobCommand.() -> Unit): com.amazonaws.services.iot.model.CancelJobResult {
	return this.block.declare(AWSIotCancelJobCommand().apply(init)) as com.amazonaws.services.iot.model.CancelJobResult
}

@Generated
class AWSIotCancelJobCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.CancelJobRequest, com.amazonaws.services.iot.model.CancelJobResult> {

	var jobId: String? = null
	var comment: String? = null

	override fun build(): com.amazonaws.services.iot.model.CancelJobRequest {
		val input = com.amazonaws.services.iot.model.CancelJobRequest()
		input.setJobId(this.jobId)
		input.setComment(this.comment)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.CancelJobResult {
	  return com.amazonaws.services.iot.model.CancelJobResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.CancelJobResult {
		return environment.execute_api.cancelJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api cancel-job")
				.argument("job-id", jobId)
				.argument("comment", comment)
	}

}


fun AWSIotFunctions.clearDefaultAuthorizer(init: AWSIotClearDefaultAuthorizerCommand.() -> Unit): com.amazonaws.services.iot.model.ClearDefaultAuthorizerResult {
	return this.block.declare(AWSIotClearDefaultAuthorizerCommand().apply(init)) as com.amazonaws.services.iot.model.ClearDefaultAuthorizerResult
}

@Generated
class AWSIotClearDefaultAuthorizerCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ClearDefaultAuthorizerRequest, com.amazonaws.services.iot.model.ClearDefaultAuthorizerResult> {



	override fun build(): com.amazonaws.services.iot.model.ClearDefaultAuthorizerRequest {
		val input = com.amazonaws.services.iot.model.ClearDefaultAuthorizerRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.ClearDefaultAuthorizerResult {
	  return com.amazonaws.services.iot.model.ClearDefaultAuthorizerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.ClearDefaultAuthorizerResult {
		return environment.execute_api.clearDefaultAuthorizer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api clear-default-authorizer")

	}

}


fun AWSIotFunctions.createAuthorizer(init: AWSIotCreateAuthorizerCommand.() -> Unit): com.amazonaws.services.iot.model.CreateAuthorizerResult {
	return this.block.declare(AWSIotCreateAuthorizerCommand().apply(init)) as com.amazonaws.services.iot.model.CreateAuthorizerResult
}

@Generated
class AWSIotCreateAuthorizerCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.CreateAuthorizerRequest, com.amazonaws.services.iot.model.CreateAuthorizerResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.CreateAuthorizerResult {
	  return com.amazonaws.services.iot.model.CreateAuthorizerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.CreateAuthorizerResult {
		return environment.execute_api.createAuthorizer(build())
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


fun AWSIotFunctions.createCertificateFromCsr(init: AWSIotCreateCertificateFromCsrCommand.() -> Unit): com.amazonaws.services.iot.model.CreateCertificateFromCsrResult {
	return this.block.declare(AWSIotCreateCertificateFromCsrCommand().apply(init)) as com.amazonaws.services.iot.model.CreateCertificateFromCsrResult
}

@Generated
class AWSIotCreateCertificateFromCsrCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.CreateCertificateFromCsrRequest, com.amazonaws.services.iot.model.CreateCertificateFromCsrResult> {

	var certificateSigningRequest: String? = null
	var setAsActive: Boolean? = false

	override fun build(): com.amazonaws.services.iot.model.CreateCertificateFromCsrRequest {
		val input = com.amazonaws.services.iot.model.CreateCertificateFromCsrRequest()
		input.setCertificateSigningRequest(this.certificateSigningRequest)
		input.setSetAsActive(this.setAsActive)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.CreateCertificateFromCsrResult {
	  return com.amazonaws.services.iot.model.CreateCertificateFromCsrResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.CreateCertificateFromCsrResult {
		return environment.execute_api.createCertificateFromCsr(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api create-certificate-from-csr")
				.argument("certificate-signing-request", certificateSigningRequest)
				.option("set-as-active", setAsActive ?: false)
	}

}


fun AWSIotFunctions.createJob(init: AWSIotCreateJobCommand.() -> Unit): com.amazonaws.services.iot.model.CreateJobResult {
	return this.block.declare(AWSIotCreateJobCommand().apply(init)) as com.amazonaws.services.iot.model.CreateJobResult
}

@Generated
class AWSIotCreateJobCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.CreateJobRequest, com.amazonaws.services.iot.model.CreateJobResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.CreateJobResult {
	  return com.amazonaws.services.iot.model.CreateJobResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.CreateJobResult {
		return environment.execute_api.createJob(build())
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


fun AWSIotFunctions.createKeysAndCertificate(init: AWSIotCreateKeysAndCertificateCommand.() -> Unit): com.amazonaws.services.iot.model.CreateKeysAndCertificateResult {
	return this.block.declare(AWSIotCreateKeysAndCertificateCommand().apply(init)) as com.amazonaws.services.iot.model.CreateKeysAndCertificateResult
}

@Generated
class AWSIotCreateKeysAndCertificateCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.CreateKeysAndCertificateRequest, com.amazonaws.services.iot.model.CreateKeysAndCertificateResult> {

	var setAsActive: Boolean? = false

	override fun build(): com.amazonaws.services.iot.model.CreateKeysAndCertificateRequest {
		val input = com.amazonaws.services.iot.model.CreateKeysAndCertificateRequest()
		input.setSetAsActive(this.setAsActive)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.CreateKeysAndCertificateResult {
	  return com.amazonaws.services.iot.model.CreateKeysAndCertificateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.CreateKeysAndCertificateResult {
		return environment.execute_api.createKeysAndCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api create-keys-and-certificate")
				.option("set-as-active", setAsActive ?: false)
	}

}


fun AWSIotFunctions.createOTAUpdate(init: AWSIotCreateOTAUpdateCommand.() -> Unit): com.amazonaws.services.iot.model.CreateOTAUpdateResult {
	return this.block.declare(AWSIotCreateOTAUpdateCommand().apply(init)) as com.amazonaws.services.iot.model.CreateOTAUpdateResult
}

@Generated
class AWSIotCreateOTAUpdateCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.CreateOTAUpdateRequest, com.amazonaws.services.iot.model.CreateOTAUpdateResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.CreateOTAUpdateResult {
	  return com.amazonaws.services.iot.model.CreateOTAUpdateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.CreateOTAUpdateResult {
		return environment.execute_api.createOTAUpdate(build())
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


fun AWSIotFunctions.createPolicy(init: AWSIotCreatePolicyCommand.() -> Unit): com.amazonaws.services.iot.model.CreatePolicyResult {
	return this.block.declare(AWSIotCreatePolicyCommand().apply(init)) as com.amazonaws.services.iot.model.CreatePolicyResult
}

@Generated
class AWSIotCreatePolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.CreatePolicyRequest, com.amazonaws.services.iot.model.CreatePolicyResult> {

	var policyName: String? = null
	var policyDocument: String? = null

	override fun build(): com.amazonaws.services.iot.model.CreatePolicyRequest {
		val input = com.amazonaws.services.iot.model.CreatePolicyRequest()
		input.setPolicyName(this.policyName)
		input.setPolicyDocument(this.policyDocument)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.CreatePolicyResult {
	  return com.amazonaws.services.iot.model.CreatePolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.CreatePolicyResult {
		return environment.execute_api.createPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api create-policy")
				.argument("policy-name", policyName)
				.argument("policy-document", policyDocument)
	}

}


fun AWSIotFunctions.createPolicyVersion(init: AWSIotCreatePolicyVersionCommand.() -> Unit): com.amazonaws.services.iot.model.CreatePolicyVersionResult {
	return this.block.declare(AWSIotCreatePolicyVersionCommand().apply(init)) as com.amazonaws.services.iot.model.CreatePolicyVersionResult
}

@Generated
class AWSIotCreatePolicyVersionCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.CreatePolicyVersionRequest, com.amazonaws.services.iot.model.CreatePolicyVersionResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.CreatePolicyVersionResult {
	  return com.amazonaws.services.iot.model.CreatePolicyVersionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.CreatePolicyVersionResult {
		return environment.execute_api.createPolicyVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api create-policy-version")
				.argument("policy-name", policyName)
				.argument("policy-document", policyDocument)
				.option("set-as-default", setAsDefault ?: false)
	}

}


fun AWSIotFunctions.createRoleAlias(init: AWSIotCreateRoleAliasCommand.() -> Unit): com.amazonaws.services.iot.model.CreateRoleAliasResult {
	return this.block.declare(AWSIotCreateRoleAliasCommand().apply(init)) as com.amazonaws.services.iot.model.CreateRoleAliasResult
}

@Generated
class AWSIotCreateRoleAliasCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.CreateRoleAliasRequest, com.amazonaws.services.iot.model.CreateRoleAliasResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.CreateRoleAliasResult {
	  return com.amazonaws.services.iot.model.CreateRoleAliasResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.CreateRoleAliasResult {
		return environment.execute_api.createRoleAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api create-role-alias")
				.argument("role-alias", roleAlias)
				.argument("role-arn", roleArn)
				.argument("credential-duration-seconds", credentialDurationSeconds?.toString())
	}

}


fun AWSIotFunctions.createStream(init: AWSIotCreateStreamCommand.() -> Unit): com.amazonaws.services.iot.model.CreateStreamResult {
	return this.block.declare(AWSIotCreateStreamCommand().apply(init)) as com.amazonaws.services.iot.model.CreateStreamResult
}

@Generated
class AWSIotCreateStreamCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.CreateStreamRequest, com.amazonaws.services.iot.model.CreateStreamResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.CreateStreamResult {
	  return com.amazonaws.services.iot.model.CreateStreamResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.CreateStreamResult {
		return environment.execute_api.createStream(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api create-stream")
				.argument("stream-id", streamId)
				.argument("description", description)
				.argument("files", files?.toString())
				.argument("role-arn", roleArn)
	}

}


fun AWSIotFunctions.createThing(init: AWSIotCreateThingCommand.() -> Unit): com.amazonaws.services.iot.model.CreateThingResult {
	return this.block.declare(AWSIotCreateThingCommand().apply(init)) as com.amazonaws.services.iot.model.CreateThingResult
}

@Generated
class AWSIotCreateThingCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.CreateThingRequest, com.amazonaws.services.iot.model.CreateThingResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.CreateThingResult {
	  return com.amazonaws.services.iot.model.CreateThingResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.CreateThingResult {
		return environment.execute_api.createThing(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api create-thing")
				.argument("thing-name", thingName)
				.argument("thing-type-name", thingTypeName)
				.argument("attribute-payload", attributePayload?.toString())
	}

}


fun AWSIotFunctions.createThingGroup(init: AWSIotCreateThingGroupCommand.() -> Unit): com.amazonaws.services.iot.model.CreateThingGroupResult {
	return this.block.declare(AWSIotCreateThingGroupCommand().apply(init)) as com.amazonaws.services.iot.model.CreateThingGroupResult
}

@Generated
class AWSIotCreateThingGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.CreateThingGroupRequest, com.amazonaws.services.iot.model.CreateThingGroupResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.CreateThingGroupResult {
	  return com.amazonaws.services.iot.model.CreateThingGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.CreateThingGroupResult {
		return environment.execute_api.createThingGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api create-thing-group")
				.argument("thing-group-name", thingGroupName)
				.argument("parent-group-name", parentGroupName)
				.argument("thing-group-properties", thingGroupProperties?.toString())
	}

}


fun AWSIotFunctions.createThingType(init: AWSIotCreateThingTypeCommand.() -> Unit): com.amazonaws.services.iot.model.CreateThingTypeResult {
	return this.block.declare(AWSIotCreateThingTypeCommand().apply(init)) as com.amazonaws.services.iot.model.CreateThingTypeResult
}

@Generated
class AWSIotCreateThingTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.CreateThingTypeRequest, com.amazonaws.services.iot.model.CreateThingTypeResult> {

	var thingTypeName: String? = null
	var thingTypeProperties: com.amazonaws.services.iot.model.ThingTypeProperties? = null

	override fun build(): com.amazonaws.services.iot.model.CreateThingTypeRequest {
		val input = com.amazonaws.services.iot.model.CreateThingTypeRequest()
		input.setThingTypeName(this.thingTypeName)
		input.setThingTypeProperties(this.thingTypeProperties)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.CreateThingTypeResult {
	  return com.amazonaws.services.iot.model.CreateThingTypeResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.CreateThingTypeResult {
		return environment.execute_api.createThingType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api create-thing-type")
				.argument("thing-type-name", thingTypeName)
				.argument("thing-type-properties", thingTypeProperties?.toString())
	}

}


fun AWSIotFunctions.createTopicRule(init: AWSIotCreateTopicRuleCommand.() -> Unit): com.amazonaws.services.iot.model.CreateTopicRuleResult {
	return this.block.declare(AWSIotCreateTopicRuleCommand().apply(init)) as com.amazonaws.services.iot.model.CreateTopicRuleResult
}

@Generated
class AWSIotCreateTopicRuleCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.CreateTopicRuleRequest, com.amazonaws.services.iot.model.CreateTopicRuleResult> {

	var ruleName: String? = null
	var topicRulePayload: com.amazonaws.services.iot.model.TopicRulePayload? = null

	override fun build(): com.amazonaws.services.iot.model.CreateTopicRuleRequest {
		val input = com.amazonaws.services.iot.model.CreateTopicRuleRequest()
		input.setRuleName(this.ruleName)
		input.setTopicRulePayload(this.topicRulePayload)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.CreateTopicRuleResult {
	  return com.amazonaws.services.iot.model.CreateTopicRuleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.CreateTopicRuleResult {
		return environment.execute_api.createTopicRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api create-topic-rule")
				.argument("rule-name", ruleName)
				.argument("topic-rule-payload", topicRulePayload?.toString())
	}

}


fun AWSIotFunctions.deleteAuthorizer(init: AWSIotDeleteAuthorizerCommand.() -> Unit): com.amazonaws.services.iot.model.DeleteAuthorizerResult {
	return this.block.declare(AWSIotDeleteAuthorizerCommand().apply(init)) as com.amazonaws.services.iot.model.DeleteAuthorizerResult
}

@Generated
class AWSIotDeleteAuthorizerCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DeleteAuthorizerRequest, com.amazonaws.services.iot.model.DeleteAuthorizerResult> {

	var authorizerName: String? = null

	override fun build(): com.amazonaws.services.iot.model.DeleteAuthorizerRequest {
		val input = com.amazonaws.services.iot.model.DeleteAuthorizerRequest()
		input.setAuthorizerName(this.authorizerName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.DeleteAuthorizerResult {
	  return com.amazonaws.services.iot.model.DeleteAuthorizerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.DeleteAuthorizerResult {
		return environment.execute_api.deleteAuthorizer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api delete-authorizer")
				.argument("authorizer-name", authorizerName)
	}

}


fun AWSIotFunctions.deleteCACertificate(init: AWSIotDeleteCACertificateCommand.() -> Unit): com.amazonaws.services.iot.model.DeleteCACertificateResult {
	return this.block.declare(AWSIotDeleteCACertificateCommand().apply(init)) as com.amazonaws.services.iot.model.DeleteCACertificateResult
}

@Generated
class AWSIotDeleteCACertificateCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DeleteCACertificateRequest, com.amazonaws.services.iot.model.DeleteCACertificateResult> {

	var certificateId: String? = null

	override fun build(): com.amazonaws.services.iot.model.DeleteCACertificateRequest {
		val input = com.amazonaws.services.iot.model.DeleteCACertificateRequest()
		input.setCertificateId(this.certificateId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.DeleteCACertificateResult {
	  return com.amazonaws.services.iot.model.DeleteCACertificateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.DeleteCACertificateResult {
		return environment.execute_api.deleteCACertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api delete-cacertificate")
				.argument("certificate-id", certificateId)
	}

}


fun AWSIotFunctions.deleteCertificate(init: AWSIotDeleteCertificateCommand.() -> Unit): com.amazonaws.services.iot.model.DeleteCertificateResult {
	return this.block.declare(AWSIotDeleteCertificateCommand().apply(init)) as com.amazonaws.services.iot.model.DeleteCertificateResult
}

@Generated
class AWSIotDeleteCertificateCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DeleteCertificateRequest, com.amazonaws.services.iot.model.DeleteCertificateResult> {

	var certificateId: String? = null
	var forceDelete: Boolean? = false

	override fun build(): com.amazonaws.services.iot.model.DeleteCertificateRequest {
		val input = com.amazonaws.services.iot.model.DeleteCertificateRequest()
		input.setCertificateId(this.certificateId)
		input.setForceDelete(this.forceDelete)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.DeleteCertificateResult {
	  return com.amazonaws.services.iot.model.DeleteCertificateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.DeleteCertificateResult {
		return environment.execute_api.deleteCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api delete-certificate")
				.argument("certificate-id", certificateId)
				.option("force-delete", forceDelete ?: false)
	}

}


fun AWSIotFunctions.deleteOTAUpdate(init: AWSIotDeleteOTAUpdateCommand.() -> Unit): com.amazonaws.services.iot.model.DeleteOTAUpdateResult {
	return this.block.declare(AWSIotDeleteOTAUpdateCommand().apply(init)) as com.amazonaws.services.iot.model.DeleteOTAUpdateResult
}

@Generated
class AWSIotDeleteOTAUpdateCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DeleteOTAUpdateRequest, com.amazonaws.services.iot.model.DeleteOTAUpdateResult> {

	var otaUpdateId: String? = null

	override fun build(): com.amazonaws.services.iot.model.DeleteOTAUpdateRequest {
		val input = com.amazonaws.services.iot.model.DeleteOTAUpdateRequest()
		input.setOtaUpdateId(this.otaUpdateId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.DeleteOTAUpdateResult {
	  return com.amazonaws.services.iot.model.DeleteOTAUpdateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.DeleteOTAUpdateResult {
		return environment.execute_api.deleteOTAUpdate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api delete-otaupdate")
				.argument("ota-update-id", otaUpdateId)
	}

}


fun AWSIotFunctions.deletePolicy(init: AWSIotDeletePolicyCommand.() -> Unit): com.amazonaws.services.iot.model.DeletePolicyResult {
	return this.block.declare(AWSIotDeletePolicyCommand().apply(init)) as com.amazonaws.services.iot.model.DeletePolicyResult
}

@Generated
class AWSIotDeletePolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DeletePolicyRequest, com.amazonaws.services.iot.model.DeletePolicyResult> {

	var policyName: String? = null

	override fun build(): com.amazonaws.services.iot.model.DeletePolicyRequest {
		val input = com.amazonaws.services.iot.model.DeletePolicyRequest()
		input.setPolicyName(this.policyName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.DeletePolicyResult {
	  return com.amazonaws.services.iot.model.DeletePolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.DeletePolicyResult {
		return environment.execute_api.deletePolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api delete-policy")
				.argument("policy-name", policyName)
	}

}


fun AWSIotFunctions.deletePolicyVersion(init: AWSIotDeletePolicyVersionCommand.() -> Unit): com.amazonaws.services.iot.model.DeletePolicyVersionResult {
	return this.block.declare(AWSIotDeletePolicyVersionCommand().apply(init)) as com.amazonaws.services.iot.model.DeletePolicyVersionResult
}

@Generated
class AWSIotDeletePolicyVersionCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DeletePolicyVersionRequest, com.amazonaws.services.iot.model.DeletePolicyVersionResult> {

	var policyName: String? = null
	var policyVersionId: String? = null

	override fun build(): com.amazonaws.services.iot.model.DeletePolicyVersionRequest {
		val input = com.amazonaws.services.iot.model.DeletePolicyVersionRequest()
		input.setPolicyName(this.policyName)
		input.setPolicyVersionId(this.policyVersionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.DeletePolicyVersionResult {
	  return com.amazonaws.services.iot.model.DeletePolicyVersionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.DeletePolicyVersionResult {
		return environment.execute_api.deletePolicyVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api delete-policy-version")
				.argument("policy-name", policyName)
				.argument("policy-version-id", policyVersionId)
	}

}


fun AWSIotFunctions.deleteRegistrationCode(init: AWSIotDeleteRegistrationCodeCommand.() -> Unit): com.amazonaws.services.iot.model.DeleteRegistrationCodeResult {
	return this.block.declare(AWSIotDeleteRegistrationCodeCommand().apply(init)) as com.amazonaws.services.iot.model.DeleteRegistrationCodeResult
}

@Generated
class AWSIotDeleteRegistrationCodeCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DeleteRegistrationCodeRequest, com.amazonaws.services.iot.model.DeleteRegistrationCodeResult> {



	override fun build(): com.amazonaws.services.iot.model.DeleteRegistrationCodeRequest {
		val input = com.amazonaws.services.iot.model.DeleteRegistrationCodeRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.DeleteRegistrationCodeResult {
	  return com.amazonaws.services.iot.model.DeleteRegistrationCodeResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.DeleteRegistrationCodeResult {
		return environment.execute_api.deleteRegistrationCode(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api delete-registration-code")

	}

}


fun AWSIotFunctions.deleteRoleAlias(init: AWSIotDeleteRoleAliasCommand.() -> Unit): com.amazonaws.services.iot.model.DeleteRoleAliasResult {
	return this.block.declare(AWSIotDeleteRoleAliasCommand().apply(init)) as com.amazonaws.services.iot.model.DeleteRoleAliasResult
}

@Generated
class AWSIotDeleteRoleAliasCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DeleteRoleAliasRequest, com.amazonaws.services.iot.model.DeleteRoleAliasResult> {

	var roleAlias: String? = null

	override fun build(): com.amazonaws.services.iot.model.DeleteRoleAliasRequest {
		val input = com.amazonaws.services.iot.model.DeleteRoleAliasRequest()
		input.setRoleAlias(this.roleAlias)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.DeleteRoleAliasResult {
	  return com.amazonaws.services.iot.model.DeleteRoleAliasResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.DeleteRoleAliasResult {
		return environment.execute_api.deleteRoleAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api delete-role-alias")
				.argument("role-alias", roleAlias)
	}

}


fun AWSIotFunctions.deleteStream(init: AWSIotDeleteStreamCommand.() -> Unit): com.amazonaws.services.iot.model.DeleteStreamResult {
	return this.block.declare(AWSIotDeleteStreamCommand().apply(init)) as com.amazonaws.services.iot.model.DeleteStreamResult
}

@Generated
class AWSIotDeleteStreamCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DeleteStreamRequest, com.amazonaws.services.iot.model.DeleteStreamResult> {

	var streamId: String? = null

	override fun build(): com.amazonaws.services.iot.model.DeleteStreamRequest {
		val input = com.amazonaws.services.iot.model.DeleteStreamRequest()
		input.setStreamId(this.streamId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.DeleteStreamResult {
	  return com.amazonaws.services.iot.model.DeleteStreamResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.DeleteStreamResult {
		return environment.execute_api.deleteStream(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api delete-stream")
				.argument("stream-id", streamId)
	}

}


fun AWSIotFunctions.deleteThing(init: AWSIotDeleteThingCommand.() -> Unit): com.amazonaws.services.iot.model.DeleteThingResult {
	return this.block.declare(AWSIotDeleteThingCommand().apply(init)) as com.amazonaws.services.iot.model.DeleteThingResult
}

@Generated
class AWSIotDeleteThingCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DeleteThingRequest, com.amazonaws.services.iot.model.DeleteThingResult> {

	var thingName: String? = null
	var expectedVersion: Long? = 0L

	override fun build(): com.amazonaws.services.iot.model.DeleteThingRequest {
		val input = com.amazonaws.services.iot.model.DeleteThingRequest()
		input.setThingName(this.thingName)
		input.setExpectedVersion(this.expectedVersion)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.DeleteThingResult {
	  return com.amazonaws.services.iot.model.DeleteThingResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.DeleteThingResult {
		return environment.execute_api.deleteThing(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api delete-thing")
				.argument("thing-name", thingName)
				.argument("expected-version", expectedVersion?.toString())
	}

}


fun AWSIotFunctions.deleteThingGroup(init: AWSIotDeleteThingGroupCommand.() -> Unit): com.amazonaws.services.iot.model.DeleteThingGroupResult {
	return this.block.declare(AWSIotDeleteThingGroupCommand().apply(init)) as com.amazonaws.services.iot.model.DeleteThingGroupResult
}

@Generated
class AWSIotDeleteThingGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DeleteThingGroupRequest, com.amazonaws.services.iot.model.DeleteThingGroupResult> {

	var thingGroupName: String? = null
	var expectedVersion: Long? = 0L

	override fun build(): com.amazonaws.services.iot.model.DeleteThingGroupRequest {
		val input = com.amazonaws.services.iot.model.DeleteThingGroupRequest()
		input.setThingGroupName(this.thingGroupName)
		input.setExpectedVersion(this.expectedVersion)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.DeleteThingGroupResult {
	  return com.amazonaws.services.iot.model.DeleteThingGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.DeleteThingGroupResult {
		return environment.execute_api.deleteThingGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api delete-thing-group")
				.argument("thing-group-name", thingGroupName)
				.argument("expected-version", expectedVersion?.toString())
	}

}


fun AWSIotFunctions.deleteThingType(init: AWSIotDeleteThingTypeCommand.() -> Unit): com.amazonaws.services.iot.model.DeleteThingTypeResult {
	return this.block.declare(AWSIotDeleteThingTypeCommand().apply(init)) as com.amazonaws.services.iot.model.DeleteThingTypeResult
}

@Generated
class AWSIotDeleteThingTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DeleteThingTypeRequest, com.amazonaws.services.iot.model.DeleteThingTypeResult> {

	var thingTypeName: String? = null

	override fun build(): com.amazonaws.services.iot.model.DeleteThingTypeRequest {
		val input = com.amazonaws.services.iot.model.DeleteThingTypeRequest()
		input.setThingTypeName(this.thingTypeName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.DeleteThingTypeResult {
	  return com.amazonaws.services.iot.model.DeleteThingTypeResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.DeleteThingTypeResult {
		return environment.execute_api.deleteThingType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api delete-thing-type")
				.argument("thing-type-name", thingTypeName)
	}

}


fun AWSIotFunctions.deleteTopicRule(init: AWSIotDeleteTopicRuleCommand.() -> Unit): com.amazonaws.services.iot.model.DeleteTopicRuleResult {
	return this.block.declare(AWSIotDeleteTopicRuleCommand().apply(init)) as com.amazonaws.services.iot.model.DeleteTopicRuleResult
}

@Generated
class AWSIotDeleteTopicRuleCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DeleteTopicRuleRequest, com.amazonaws.services.iot.model.DeleteTopicRuleResult> {

	var ruleName: String? = null

	override fun build(): com.amazonaws.services.iot.model.DeleteTopicRuleRequest {
		val input = com.amazonaws.services.iot.model.DeleteTopicRuleRequest()
		input.setRuleName(this.ruleName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.DeleteTopicRuleResult {
	  return com.amazonaws.services.iot.model.DeleteTopicRuleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.DeleteTopicRuleResult {
		return environment.execute_api.deleteTopicRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api delete-topic-rule")
				.argument("rule-name", ruleName)
	}

}


fun AWSIotFunctions.deleteV2LoggingLevel(init: AWSIotDeleteV2LoggingLevelCommand.() -> Unit): com.amazonaws.services.iot.model.DeleteV2LoggingLevelResult {
	return this.block.declare(AWSIotDeleteV2LoggingLevelCommand().apply(init)) as com.amazonaws.services.iot.model.DeleteV2LoggingLevelResult
}

@Generated
class AWSIotDeleteV2LoggingLevelCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DeleteV2LoggingLevelRequest, com.amazonaws.services.iot.model.DeleteV2LoggingLevelResult> {

	var targetType: LogTargetType? = null
	var targetName: String? = null

	override fun build(): com.amazonaws.services.iot.model.DeleteV2LoggingLevelRequest {
		val input = com.amazonaws.services.iot.model.DeleteV2LoggingLevelRequest()
		input.setTargetType(this.targetType?.toString())
		input.setTargetName(this.targetName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.DeleteV2LoggingLevelResult {
	  return com.amazonaws.services.iot.model.DeleteV2LoggingLevelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.DeleteV2LoggingLevelResult {
		return environment.execute_api.deleteV2LoggingLevel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api delete-v2-logging-level")
				.argument("target-type", targetType?.toString())
				.argument("target-name", targetName)
	}

}


fun AWSIotFunctions.deprecateThingType(init: AWSIotDeprecateThingTypeCommand.() -> Unit): com.amazonaws.services.iot.model.DeprecateThingTypeResult {
	return this.block.declare(AWSIotDeprecateThingTypeCommand().apply(init)) as com.amazonaws.services.iot.model.DeprecateThingTypeResult
}

@Generated
class AWSIotDeprecateThingTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DeprecateThingTypeRequest, com.amazonaws.services.iot.model.DeprecateThingTypeResult> {

	var thingTypeName: String? = null
	var undoDeprecate: Boolean? = false

	override fun build(): com.amazonaws.services.iot.model.DeprecateThingTypeRequest {
		val input = com.amazonaws.services.iot.model.DeprecateThingTypeRequest()
		input.setThingTypeName(this.thingTypeName)
		input.setUndoDeprecate(this.undoDeprecate)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.DeprecateThingTypeResult {
	  return com.amazonaws.services.iot.model.DeprecateThingTypeResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.DeprecateThingTypeResult {
		return environment.execute_api.deprecateThingType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api deprecate-thing-type")
				.argument("thing-type-name", thingTypeName)
				.option("undo-deprecate", undoDeprecate ?: false)
	}

}


fun AWSIotFunctions.describeAuthorizer(init: AWSIotDescribeAuthorizerCommand.() -> Unit): com.amazonaws.services.iot.model.DescribeAuthorizerResult {
	return this.block.declare(AWSIotDescribeAuthorizerCommand().apply(init)) as com.amazonaws.services.iot.model.DescribeAuthorizerResult
}

@Generated
class AWSIotDescribeAuthorizerCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DescribeAuthorizerRequest, com.amazonaws.services.iot.model.DescribeAuthorizerResult> {

	var authorizerName: String? = null

	override fun build(): com.amazonaws.services.iot.model.DescribeAuthorizerRequest {
		val input = com.amazonaws.services.iot.model.DescribeAuthorizerRequest()
		input.setAuthorizerName(this.authorizerName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.DescribeAuthorizerResult {
	  return com.amazonaws.services.iot.model.DescribeAuthorizerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.DescribeAuthorizerResult {
		return environment.execute_api.describeAuthorizer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api describe-authorizer")
				.argument("authorizer-name", authorizerName)
	}

}


fun AWSIotFunctions.describeCACertificate(init: AWSIotDescribeCACertificateCommand.() -> Unit): com.amazonaws.services.iot.model.DescribeCACertificateResult {
	return this.block.declare(AWSIotDescribeCACertificateCommand().apply(init)) as com.amazonaws.services.iot.model.DescribeCACertificateResult
}

@Generated
class AWSIotDescribeCACertificateCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DescribeCACertificateRequest, com.amazonaws.services.iot.model.DescribeCACertificateResult> {

	var certificateId: String? = null

	override fun build(): com.amazonaws.services.iot.model.DescribeCACertificateRequest {
		val input = com.amazonaws.services.iot.model.DescribeCACertificateRequest()
		input.setCertificateId(this.certificateId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.DescribeCACertificateResult {
	  return com.amazonaws.services.iot.model.DescribeCACertificateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.DescribeCACertificateResult {
		return environment.execute_api.describeCACertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api describe-cacertificate")
				.argument("certificate-id", certificateId)
	}

}


fun AWSIotFunctions.describeCertificate(init: AWSIotDescribeCertificateCommand.() -> Unit): com.amazonaws.services.iot.model.DescribeCertificateResult {
	return this.block.declare(AWSIotDescribeCertificateCommand().apply(init)) as com.amazonaws.services.iot.model.DescribeCertificateResult
}

@Generated
class AWSIotDescribeCertificateCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DescribeCertificateRequest, com.amazonaws.services.iot.model.DescribeCertificateResult> {

	var certificateId: String? = null

	override fun build(): com.amazonaws.services.iot.model.DescribeCertificateRequest {
		val input = com.amazonaws.services.iot.model.DescribeCertificateRequest()
		input.setCertificateId(this.certificateId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.DescribeCertificateResult {
	  return com.amazonaws.services.iot.model.DescribeCertificateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.DescribeCertificateResult {
		return environment.execute_api.describeCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api describe-certificate")
				.argument("certificate-id", certificateId)
	}

}


fun AWSIotFunctions.describeDefaultAuthorizer(init: AWSIotDescribeDefaultAuthorizerCommand.() -> Unit): com.amazonaws.services.iot.model.DescribeDefaultAuthorizerResult {
	return this.block.declare(AWSIotDescribeDefaultAuthorizerCommand().apply(init)) as com.amazonaws.services.iot.model.DescribeDefaultAuthorizerResult
}

@Generated
class AWSIotDescribeDefaultAuthorizerCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DescribeDefaultAuthorizerRequest, com.amazonaws.services.iot.model.DescribeDefaultAuthorizerResult> {



	override fun build(): com.amazonaws.services.iot.model.DescribeDefaultAuthorizerRequest {
		val input = com.amazonaws.services.iot.model.DescribeDefaultAuthorizerRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.DescribeDefaultAuthorizerResult {
	  return com.amazonaws.services.iot.model.DescribeDefaultAuthorizerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.DescribeDefaultAuthorizerResult {
		return environment.execute_api.describeDefaultAuthorizer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api describe-default-authorizer")

	}

}


fun AWSIotFunctions.describeEndpoint(init: AWSIotDescribeEndpointCommand.() -> Unit): com.amazonaws.services.iot.model.DescribeEndpointResult {
	return this.block.declare(AWSIotDescribeEndpointCommand().apply(init)) as com.amazonaws.services.iot.model.DescribeEndpointResult
}

@Generated
class AWSIotDescribeEndpointCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DescribeEndpointRequest, com.amazonaws.services.iot.model.DescribeEndpointResult> {

	var endpointType: String? = null

	override fun build(): com.amazonaws.services.iot.model.DescribeEndpointRequest {
		val input = com.amazonaws.services.iot.model.DescribeEndpointRequest()
		input.setEndpointType(this.endpointType)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.DescribeEndpointResult {
	  return com.amazonaws.services.iot.model.DescribeEndpointResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.DescribeEndpointResult {
		return environment.execute_api.describeEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api describe-endpoint")
				.argument("endpoint-type", endpointType)
	}

}


fun AWSIotFunctions.describeEventConfigurations(init: AWSIotDescribeEventConfigurationsCommand.() -> Unit): com.amazonaws.services.iot.model.DescribeEventConfigurationsResult {
	return this.block.declare(AWSIotDescribeEventConfigurationsCommand().apply(init)) as com.amazonaws.services.iot.model.DescribeEventConfigurationsResult
}

@Generated
class AWSIotDescribeEventConfigurationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DescribeEventConfigurationsRequest, com.amazonaws.services.iot.model.DescribeEventConfigurationsResult> {



	override fun build(): com.amazonaws.services.iot.model.DescribeEventConfigurationsRequest {
		val input = com.amazonaws.services.iot.model.DescribeEventConfigurationsRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.DescribeEventConfigurationsResult {
	  return com.amazonaws.services.iot.model.DescribeEventConfigurationsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.DescribeEventConfigurationsResult {
		return environment.execute_api.describeEventConfigurations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api describe-event-configurations")

	}

}


fun AWSIotFunctions.describeIndex(init: AWSIotDescribeIndexCommand.() -> Unit): com.amazonaws.services.iot.model.DescribeIndexResult {
	return this.block.declare(AWSIotDescribeIndexCommand().apply(init)) as com.amazonaws.services.iot.model.DescribeIndexResult
}

@Generated
class AWSIotDescribeIndexCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DescribeIndexRequest, com.amazonaws.services.iot.model.DescribeIndexResult> {

	var indexName: String? = null

	override fun build(): com.amazonaws.services.iot.model.DescribeIndexRequest {
		val input = com.amazonaws.services.iot.model.DescribeIndexRequest()
		input.setIndexName(this.indexName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.DescribeIndexResult {
	  return com.amazonaws.services.iot.model.DescribeIndexResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.DescribeIndexResult {
		return environment.execute_api.describeIndex(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api describe-index")
				.argument("index-name", indexName)
	}

}


fun AWSIotFunctions.describeJob(init: AWSIotDescribeJobCommand.() -> Unit): com.amazonaws.services.iot.model.DescribeJobResult {
	return this.block.declare(AWSIotDescribeJobCommand().apply(init)) as com.amazonaws.services.iot.model.DescribeJobResult
}

@Generated
class AWSIotDescribeJobCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DescribeJobRequest, com.amazonaws.services.iot.model.DescribeJobResult> {

	var jobId: String? = null

	override fun build(): com.amazonaws.services.iot.model.DescribeJobRequest {
		val input = com.amazonaws.services.iot.model.DescribeJobRequest()
		input.setJobId(this.jobId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.DescribeJobResult {
	  return com.amazonaws.services.iot.model.DescribeJobResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.DescribeJobResult {
		return environment.execute_api.describeJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api describe-job")
				.argument("job-id", jobId)
	}

}


fun AWSIotFunctions.describeJobExecution(init: AWSIotDescribeJobExecutionCommand.() -> Unit): com.amazonaws.services.iot.model.DescribeJobExecutionResult {
	return this.block.declare(AWSIotDescribeJobExecutionCommand().apply(init)) as com.amazonaws.services.iot.model.DescribeJobExecutionResult
}

@Generated
class AWSIotDescribeJobExecutionCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DescribeJobExecutionRequest, com.amazonaws.services.iot.model.DescribeJobExecutionResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.DescribeJobExecutionResult {
	  return com.amazonaws.services.iot.model.DescribeJobExecutionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.DescribeJobExecutionResult {
		return environment.execute_api.describeJobExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api describe-job-execution")
				.argument("job-id", jobId)
				.argument("thing-name", thingName)
				.argument("execution-number", executionNumber?.toString())
	}

}


fun AWSIotFunctions.describeRoleAlias(init: AWSIotDescribeRoleAliasCommand.() -> Unit): com.amazonaws.services.iot.model.DescribeRoleAliasResult {
	return this.block.declare(AWSIotDescribeRoleAliasCommand().apply(init)) as com.amazonaws.services.iot.model.DescribeRoleAliasResult
}

@Generated
class AWSIotDescribeRoleAliasCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DescribeRoleAliasRequest, com.amazonaws.services.iot.model.DescribeRoleAliasResult> {

	var roleAlias: String? = null

	override fun build(): com.amazonaws.services.iot.model.DescribeRoleAliasRequest {
		val input = com.amazonaws.services.iot.model.DescribeRoleAliasRequest()
		input.setRoleAlias(this.roleAlias)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.DescribeRoleAliasResult {
	  return com.amazonaws.services.iot.model.DescribeRoleAliasResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.DescribeRoleAliasResult {
		return environment.execute_api.describeRoleAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api describe-role-alias")
				.argument("role-alias", roleAlias)
	}

}


fun AWSIotFunctions.describeStream(init: AWSIotDescribeStreamCommand.() -> Unit): com.amazonaws.services.iot.model.DescribeStreamResult {
	return this.block.declare(AWSIotDescribeStreamCommand().apply(init)) as com.amazonaws.services.iot.model.DescribeStreamResult
}

@Generated
class AWSIotDescribeStreamCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DescribeStreamRequest, com.amazonaws.services.iot.model.DescribeStreamResult> {

	var streamId: String? = null

	override fun build(): com.amazonaws.services.iot.model.DescribeStreamRequest {
		val input = com.amazonaws.services.iot.model.DescribeStreamRequest()
		input.setStreamId(this.streamId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.DescribeStreamResult {
	  return com.amazonaws.services.iot.model.DescribeStreamResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.DescribeStreamResult {
		return environment.execute_api.describeStream(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api describe-stream")
				.argument("stream-id", streamId)
	}

}


fun AWSIotFunctions.describeThing(init: AWSIotDescribeThingCommand.() -> Unit): com.amazonaws.services.iot.model.DescribeThingResult {
	return this.block.declare(AWSIotDescribeThingCommand().apply(init)) as com.amazonaws.services.iot.model.DescribeThingResult
}

@Generated
class AWSIotDescribeThingCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DescribeThingRequest, com.amazonaws.services.iot.model.DescribeThingResult> {

	var thingName: String? = null

	override fun build(): com.amazonaws.services.iot.model.DescribeThingRequest {
		val input = com.amazonaws.services.iot.model.DescribeThingRequest()
		input.setThingName(this.thingName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.DescribeThingResult {
	  return com.amazonaws.services.iot.model.DescribeThingResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.DescribeThingResult {
		return environment.execute_api.describeThing(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api describe-thing")
				.argument("thing-name", thingName)
	}

}


fun AWSIotFunctions.describeThingGroup(init: AWSIotDescribeThingGroupCommand.() -> Unit): com.amazonaws.services.iot.model.DescribeThingGroupResult {
	return this.block.declare(AWSIotDescribeThingGroupCommand().apply(init)) as com.amazonaws.services.iot.model.DescribeThingGroupResult
}

@Generated
class AWSIotDescribeThingGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DescribeThingGroupRequest, com.amazonaws.services.iot.model.DescribeThingGroupResult> {

	var thingGroupName: String? = null

	override fun build(): com.amazonaws.services.iot.model.DescribeThingGroupRequest {
		val input = com.amazonaws.services.iot.model.DescribeThingGroupRequest()
		input.setThingGroupName(this.thingGroupName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.DescribeThingGroupResult {
	  return com.amazonaws.services.iot.model.DescribeThingGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.DescribeThingGroupResult {
		return environment.execute_api.describeThingGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api describe-thing-group")
				.argument("thing-group-name", thingGroupName)
	}

}


fun AWSIotFunctions.describeThingRegistrationTask(init: AWSIotDescribeThingRegistrationTaskCommand.() -> Unit): com.amazonaws.services.iot.model.DescribeThingRegistrationTaskResult {
	return this.block.declare(AWSIotDescribeThingRegistrationTaskCommand().apply(init)) as com.amazonaws.services.iot.model.DescribeThingRegistrationTaskResult
}

@Generated
class AWSIotDescribeThingRegistrationTaskCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DescribeThingRegistrationTaskRequest, com.amazonaws.services.iot.model.DescribeThingRegistrationTaskResult> {

	var taskId: String? = null

	override fun build(): com.amazonaws.services.iot.model.DescribeThingRegistrationTaskRequest {
		val input = com.amazonaws.services.iot.model.DescribeThingRegistrationTaskRequest()
		input.setTaskId(this.taskId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.DescribeThingRegistrationTaskResult {
	  return com.amazonaws.services.iot.model.DescribeThingRegistrationTaskResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.DescribeThingRegistrationTaskResult {
		return environment.execute_api.describeThingRegistrationTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api describe-thing-registration-task")
				.argument("task-id", taskId)
	}

}


fun AWSIotFunctions.describeThingType(init: AWSIotDescribeThingTypeCommand.() -> Unit): com.amazonaws.services.iot.model.DescribeThingTypeResult {
	return this.block.declare(AWSIotDescribeThingTypeCommand().apply(init)) as com.amazonaws.services.iot.model.DescribeThingTypeResult
}

@Generated
class AWSIotDescribeThingTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DescribeThingTypeRequest, com.amazonaws.services.iot.model.DescribeThingTypeResult> {

	var thingTypeName: String? = null

	override fun build(): com.amazonaws.services.iot.model.DescribeThingTypeRequest {
		val input = com.amazonaws.services.iot.model.DescribeThingTypeRequest()
		input.setThingTypeName(this.thingTypeName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.DescribeThingTypeResult {
	  return com.amazonaws.services.iot.model.DescribeThingTypeResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.DescribeThingTypeResult {
		return environment.execute_api.describeThingType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api describe-thing-type")
				.argument("thing-type-name", thingTypeName)
	}

}


fun AWSIotFunctions.detachPolicy(init: AWSIotDetachPolicyCommand.() -> Unit): com.amazonaws.services.iot.model.DetachPolicyResult {
	return this.block.declare(AWSIotDetachPolicyCommand().apply(init)) as com.amazonaws.services.iot.model.DetachPolicyResult
}

@Generated
class AWSIotDetachPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DetachPolicyRequest, com.amazonaws.services.iot.model.DetachPolicyResult> {

	var policyName: String? = null
	var target: String? = null

	override fun build(): com.amazonaws.services.iot.model.DetachPolicyRequest {
		val input = com.amazonaws.services.iot.model.DetachPolicyRequest()
		input.setPolicyName(this.policyName)
		input.setTarget(this.target)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.DetachPolicyResult {
	  return com.amazonaws.services.iot.model.DetachPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.DetachPolicyResult {
		return environment.execute_api.detachPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api detach-policy")
				.argument("policy-name", policyName)
				.argument("target", target)
	}

}


fun AWSIotFunctions.detachPrincipalPolicy(init: AWSIotDetachPrincipalPolicyCommand.() -> Unit): com.amazonaws.services.iot.model.DetachPrincipalPolicyResult {
	return this.block.declare(AWSIotDetachPrincipalPolicyCommand().apply(init)) as com.amazonaws.services.iot.model.DetachPrincipalPolicyResult
}

@Generated
class AWSIotDetachPrincipalPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DetachPrincipalPolicyRequest, com.amazonaws.services.iot.model.DetachPrincipalPolicyResult> {

	var policyName: String? = null
	var principal: String? = null

	override fun build(): com.amazonaws.services.iot.model.DetachPrincipalPolicyRequest {
		val input = com.amazonaws.services.iot.model.DetachPrincipalPolicyRequest()
		input.setPolicyName(this.policyName)
		input.setPrincipal(this.principal)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.DetachPrincipalPolicyResult {
	  return com.amazonaws.services.iot.model.DetachPrincipalPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.DetachPrincipalPolicyResult {
		return environment.execute_api.detachPrincipalPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api detach-principal-policy")
				.argument("policy-name", policyName)
				.argument("principal", principal)
	}

}


fun AWSIotFunctions.detachThingPrincipal(init: AWSIotDetachThingPrincipalCommand.() -> Unit): com.amazonaws.services.iot.model.DetachThingPrincipalResult {
	return this.block.declare(AWSIotDetachThingPrincipalCommand().apply(init)) as com.amazonaws.services.iot.model.DetachThingPrincipalResult
}

@Generated
class AWSIotDetachThingPrincipalCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DetachThingPrincipalRequest, com.amazonaws.services.iot.model.DetachThingPrincipalResult> {

	var thingName: String? = null
	var principal: String? = null

	override fun build(): com.amazonaws.services.iot.model.DetachThingPrincipalRequest {
		val input = com.amazonaws.services.iot.model.DetachThingPrincipalRequest()
		input.setThingName(this.thingName)
		input.setPrincipal(this.principal)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.DetachThingPrincipalResult {
	  return com.amazonaws.services.iot.model.DetachThingPrincipalResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.DetachThingPrincipalResult {
		return environment.execute_api.detachThingPrincipal(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api detach-thing-principal")
				.argument("thing-name", thingName)
				.argument("principal", principal)
	}

}


fun AWSIotFunctions.disableTopicRule(init: AWSIotDisableTopicRuleCommand.() -> Unit): com.amazonaws.services.iot.model.DisableTopicRuleResult {
	return this.block.declare(AWSIotDisableTopicRuleCommand().apply(init)) as com.amazonaws.services.iot.model.DisableTopicRuleResult
}

@Generated
class AWSIotDisableTopicRuleCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.DisableTopicRuleRequest, com.amazonaws.services.iot.model.DisableTopicRuleResult> {

	var ruleName: String? = null

	override fun build(): com.amazonaws.services.iot.model.DisableTopicRuleRequest {
		val input = com.amazonaws.services.iot.model.DisableTopicRuleRequest()
		input.setRuleName(this.ruleName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.DisableTopicRuleResult {
	  return com.amazonaws.services.iot.model.DisableTopicRuleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.DisableTopicRuleResult {
		return environment.execute_api.disableTopicRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api disable-topic-rule")
				.argument("rule-name", ruleName)
	}

}


fun AWSIotFunctions.enableTopicRule(init: AWSIotEnableTopicRuleCommand.() -> Unit): com.amazonaws.services.iot.model.EnableTopicRuleResult {
	return this.block.declare(AWSIotEnableTopicRuleCommand().apply(init)) as com.amazonaws.services.iot.model.EnableTopicRuleResult
}

@Generated
class AWSIotEnableTopicRuleCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.EnableTopicRuleRequest, com.amazonaws.services.iot.model.EnableTopicRuleResult> {

	var ruleName: String? = null

	override fun build(): com.amazonaws.services.iot.model.EnableTopicRuleRequest {
		val input = com.amazonaws.services.iot.model.EnableTopicRuleRequest()
		input.setRuleName(this.ruleName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.EnableTopicRuleResult {
	  return com.amazonaws.services.iot.model.EnableTopicRuleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.EnableTopicRuleResult {
		return environment.execute_api.enableTopicRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api enable-topic-rule")
				.argument("rule-name", ruleName)
	}

}


fun AWSIotFunctions.getEffectivePolicies(init: AWSIotGetEffectivePoliciesCommand.() -> Unit): com.amazonaws.services.iot.model.GetEffectivePoliciesResult {
	return this.block.declare(AWSIotGetEffectivePoliciesCommand().apply(init)) as com.amazonaws.services.iot.model.GetEffectivePoliciesResult
}

@Generated
class AWSIotGetEffectivePoliciesCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.GetEffectivePoliciesRequest, com.amazonaws.services.iot.model.GetEffectivePoliciesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.GetEffectivePoliciesResult {
	  return com.amazonaws.services.iot.model.GetEffectivePoliciesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.GetEffectivePoliciesResult {
		return environment.execute_api.getEffectivePolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api get-effective-policies")
				.argument("principal", principal)
				.argument("cognito-identity-pool-id", cognitoIdentityPoolId)
				.argument("thing-name", thingName)
	}

}


fun AWSIotFunctions.getIndexingConfiguration(init: AWSIotGetIndexingConfigurationCommand.() -> Unit): com.amazonaws.services.iot.model.GetIndexingConfigurationResult {
	return this.block.declare(AWSIotGetIndexingConfigurationCommand().apply(init)) as com.amazonaws.services.iot.model.GetIndexingConfigurationResult
}

@Generated
class AWSIotGetIndexingConfigurationCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.GetIndexingConfigurationRequest, com.amazonaws.services.iot.model.GetIndexingConfigurationResult> {



	override fun build(): com.amazonaws.services.iot.model.GetIndexingConfigurationRequest {
		val input = com.amazonaws.services.iot.model.GetIndexingConfigurationRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.GetIndexingConfigurationResult {
	  return com.amazonaws.services.iot.model.GetIndexingConfigurationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.GetIndexingConfigurationResult {
		return environment.execute_api.getIndexingConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api get-indexing-configuration")

	}

}


fun AWSIotFunctions.getJobDocument(init: AWSIotGetJobDocumentCommand.() -> Unit): com.amazonaws.services.iot.model.GetJobDocumentResult {
	return this.block.declare(AWSIotGetJobDocumentCommand().apply(init)) as com.amazonaws.services.iot.model.GetJobDocumentResult
}

@Generated
class AWSIotGetJobDocumentCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.GetJobDocumentRequest, com.amazonaws.services.iot.model.GetJobDocumentResult> {

	var jobId: String? = null

	override fun build(): com.amazonaws.services.iot.model.GetJobDocumentRequest {
		val input = com.amazonaws.services.iot.model.GetJobDocumentRequest()
		input.setJobId(this.jobId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.GetJobDocumentResult {
	  return com.amazonaws.services.iot.model.GetJobDocumentResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.GetJobDocumentResult {
		return environment.execute_api.getJobDocument(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api get-job-document")
				.argument("job-id", jobId)
	}

}


fun AWSIotFunctions.getLoggingOptions(init: AWSIotGetLoggingOptionsCommand.() -> Unit): com.amazonaws.services.iot.model.GetLoggingOptionsResult {
	return this.block.declare(AWSIotGetLoggingOptionsCommand().apply(init)) as com.amazonaws.services.iot.model.GetLoggingOptionsResult
}

@Generated
class AWSIotGetLoggingOptionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.GetLoggingOptionsRequest, com.amazonaws.services.iot.model.GetLoggingOptionsResult> {



	override fun build(): com.amazonaws.services.iot.model.GetLoggingOptionsRequest {
		val input = com.amazonaws.services.iot.model.GetLoggingOptionsRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.GetLoggingOptionsResult {
	  return com.amazonaws.services.iot.model.GetLoggingOptionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.GetLoggingOptionsResult {
		return environment.execute_api.getLoggingOptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api get-logging-options")

	}

}


fun AWSIotFunctions.getOTAUpdate(init: AWSIotGetOTAUpdateCommand.() -> Unit): com.amazonaws.services.iot.model.GetOTAUpdateResult {
	return this.block.declare(AWSIotGetOTAUpdateCommand().apply(init)) as com.amazonaws.services.iot.model.GetOTAUpdateResult
}

@Generated
class AWSIotGetOTAUpdateCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.GetOTAUpdateRequest, com.amazonaws.services.iot.model.GetOTAUpdateResult> {

	var otaUpdateId: String? = null

	override fun build(): com.amazonaws.services.iot.model.GetOTAUpdateRequest {
		val input = com.amazonaws.services.iot.model.GetOTAUpdateRequest()
		input.setOtaUpdateId(this.otaUpdateId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.GetOTAUpdateResult {
	  return com.amazonaws.services.iot.model.GetOTAUpdateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.GetOTAUpdateResult {
		return environment.execute_api.getOTAUpdate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api get-otaupdate")
				.argument("ota-update-id", otaUpdateId)
	}

}


fun AWSIotFunctions.getPolicy(init: AWSIotGetPolicyCommand.() -> Unit): com.amazonaws.services.iot.model.GetPolicyResult {
	return this.block.declare(AWSIotGetPolicyCommand().apply(init)) as com.amazonaws.services.iot.model.GetPolicyResult
}

@Generated
class AWSIotGetPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.GetPolicyRequest, com.amazonaws.services.iot.model.GetPolicyResult> {

	var policyName: String? = null

	override fun build(): com.amazonaws.services.iot.model.GetPolicyRequest {
		val input = com.amazonaws.services.iot.model.GetPolicyRequest()
		input.setPolicyName(this.policyName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.GetPolicyResult {
	  return com.amazonaws.services.iot.model.GetPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.GetPolicyResult {
		return environment.execute_api.getPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api get-policy")
				.argument("policy-name", policyName)
	}

}


fun AWSIotFunctions.getPolicyVersion(init: AWSIotGetPolicyVersionCommand.() -> Unit): com.amazonaws.services.iot.model.GetPolicyVersionResult {
	return this.block.declare(AWSIotGetPolicyVersionCommand().apply(init)) as com.amazonaws.services.iot.model.GetPolicyVersionResult
}

@Generated
class AWSIotGetPolicyVersionCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.GetPolicyVersionRequest, com.amazonaws.services.iot.model.GetPolicyVersionResult> {

	var policyName: String? = null
	var policyVersionId: String? = null

	override fun build(): com.amazonaws.services.iot.model.GetPolicyVersionRequest {
		val input = com.amazonaws.services.iot.model.GetPolicyVersionRequest()
		input.setPolicyName(this.policyName)
		input.setPolicyVersionId(this.policyVersionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.GetPolicyVersionResult {
	  return com.amazonaws.services.iot.model.GetPolicyVersionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.GetPolicyVersionResult {
		return environment.execute_api.getPolicyVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api get-policy-version")
				.argument("policy-name", policyName)
				.argument("policy-version-id", policyVersionId)
	}

}


fun AWSIotFunctions.getRegistrationCode(init: AWSIotGetRegistrationCodeCommand.() -> Unit): com.amazonaws.services.iot.model.GetRegistrationCodeResult {
	return this.block.declare(AWSIotGetRegistrationCodeCommand().apply(init)) as com.amazonaws.services.iot.model.GetRegistrationCodeResult
}

@Generated
class AWSIotGetRegistrationCodeCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.GetRegistrationCodeRequest, com.amazonaws.services.iot.model.GetRegistrationCodeResult> {



	override fun build(): com.amazonaws.services.iot.model.GetRegistrationCodeRequest {
		val input = com.amazonaws.services.iot.model.GetRegistrationCodeRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.GetRegistrationCodeResult {
	  return com.amazonaws.services.iot.model.GetRegistrationCodeResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.GetRegistrationCodeResult {
		return environment.execute_api.getRegistrationCode(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api get-registration-code")

	}

}


fun AWSIotFunctions.getTopicRule(init: AWSIotGetTopicRuleCommand.() -> Unit): com.amazonaws.services.iot.model.GetTopicRuleResult {
	return this.block.declare(AWSIotGetTopicRuleCommand().apply(init)) as com.amazonaws.services.iot.model.GetTopicRuleResult
}

@Generated
class AWSIotGetTopicRuleCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.GetTopicRuleRequest, com.amazonaws.services.iot.model.GetTopicRuleResult> {

	var ruleName: String? = null

	override fun build(): com.amazonaws.services.iot.model.GetTopicRuleRequest {
		val input = com.amazonaws.services.iot.model.GetTopicRuleRequest()
		input.setRuleName(this.ruleName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.GetTopicRuleResult {
	  return com.amazonaws.services.iot.model.GetTopicRuleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.GetTopicRuleResult {
		return environment.execute_api.getTopicRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api get-topic-rule")
				.argument("rule-name", ruleName)
	}

}


fun AWSIotFunctions.getV2LoggingOptions(init: AWSIotGetV2LoggingOptionsCommand.() -> Unit): com.amazonaws.services.iot.model.GetV2LoggingOptionsResult {
	return this.block.declare(AWSIotGetV2LoggingOptionsCommand().apply(init)) as com.amazonaws.services.iot.model.GetV2LoggingOptionsResult
}

@Generated
class AWSIotGetV2LoggingOptionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.GetV2LoggingOptionsRequest, com.amazonaws.services.iot.model.GetV2LoggingOptionsResult> {



	override fun build(): com.amazonaws.services.iot.model.GetV2LoggingOptionsRequest {
		val input = com.amazonaws.services.iot.model.GetV2LoggingOptionsRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.GetV2LoggingOptionsResult {
	  return com.amazonaws.services.iot.model.GetV2LoggingOptionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.GetV2LoggingOptionsResult {
		return environment.execute_api.getV2LoggingOptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api get-v2-logging-options")

	}

}


fun AWSIotFunctions.listAttachedPolicies(init: AWSIotListAttachedPoliciesCommand.() -> Unit): com.amazonaws.services.iot.model.ListAttachedPoliciesResult {
	return this.block.declare(AWSIotListAttachedPoliciesCommand().apply(init)) as com.amazonaws.services.iot.model.ListAttachedPoliciesResult
}

@Generated
class AWSIotListAttachedPoliciesCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListAttachedPoliciesRequest, com.amazonaws.services.iot.model.ListAttachedPoliciesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.ListAttachedPoliciesResult {
	  return com.amazonaws.services.iot.model.ListAttachedPoliciesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.ListAttachedPoliciesResult {
		return environment.execute_api.listAttachedPolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-attached-policies")
				.argument("target", target)
				.option("recursive", recursive ?: false)
				.argument("marker", marker)
				.argument("page-size", pageSize?.toString())
	}

}


fun AWSIotFunctions.listAuthorizers(init: AWSIotListAuthorizersCommand.() -> Unit): com.amazonaws.services.iot.model.ListAuthorizersResult {
	return this.block.declare(AWSIotListAuthorizersCommand().apply(init)) as com.amazonaws.services.iot.model.ListAuthorizersResult
}

@Generated
class AWSIotListAuthorizersCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListAuthorizersRequest, com.amazonaws.services.iot.model.ListAuthorizersResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.ListAuthorizersResult {
	  return com.amazonaws.services.iot.model.ListAuthorizersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.ListAuthorizersResult {
		return environment.execute_api.listAuthorizers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-authorizers")
				.argument("page-size", pageSize?.toString())
				.argument("marker", marker)
				.option("ascending-order", ascendingOrder ?: false)
				.argument("status", status?.toString())
	}

}


fun AWSIotFunctions.listCACertificates(init: AWSIotListCACertificatesCommand.() -> Unit): com.amazonaws.services.iot.model.ListCACertificatesResult {
	return this.block.declare(AWSIotListCACertificatesCommand().apply(init)) as com.amazonaws.services.iot.model.ListCACertificatesResult
}

@Generated
class AWSIotListCACertificatesCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListCACertificatesRequest, com.amazonaws.services.iot.model.ListCACertificatesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.ListCACertificatesResult {
	  return com.amazonaws.services.iot.model.ListCACertificatesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.ListCACertificatesResult {
		return environment.execute_api.listCACertificates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-cacertificates")
				.argument("page-size", pageSize?.toString())
				.argument("marker", marker)
				.option("ascending-order", ascendingOrder ?: false)
	}

}


fun AWSIotFunctions.listCertificates(init: AWSIotListCertificatesCommand.() -> Unit): com.amazonaws.services.iot.model.ListCertificatesResult {
	return this.block.declare(AWSIotListCertificatesCommand().apply(init)) as com.amazonaws.services.iot.model.ListCertificatesResult
}

@Generated
class AWSIotListCertificatesCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListCertificatesRequest, com.amazonaws.services.iot.model.ListCertificatesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.ListCertificatesResult {
	  return com.amazonaws.services.iot.model.ListCertificatesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.ListCertificatesResult {
		return environment.execute_api.listCertificates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-certificates")
				.argument("page-size", pageSize?.toString())
				.argument("marker", marker)
				.option("ascending-order", ascendingOrder ?: false)
	}

}


fun AWSIotFunctions.listCertificatesByCA(init: AWSIotListCertificatesByCACommand.() -> Unit): com.amazonaws.services.iot.model.ListCertificatesByCAResult {
	return this.block.declare(AWSIotListCertificatesByCACommand().apply(init)) as com.amazonaws.services.iot.model.ListCertificatesByCAResult
}

@Generated
class AWSIotListCertificatesByCACommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListCertificatesByCARequest, com.amazonaws.services.iot.model.ListCertificatesByCAResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.ListCertificatesByCAResult {
	  return com.amazonaws.services.iot.model.ListCertificatesByCAResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.ListCertificatesByCAResult {
		return environment.execute_api.listCertificatesByCA(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-certificates-by-ca")
				.argument("ca-certificate-id", caCertificateId)
				.argument("page-size", pageSize?.toString())
				.argument("marker", marker)
				.option("ascending-order", ascendingOrder ?: false)
	}

}


fun AWSIotFunctions.listIndices(init: AWSIotListIndicesCommand.() -> Unit): com.amazonaws.services.iot.model.ListIndicesResult {
	return this.block.declare(AWSIotListIndicesCommand().apply(init)) as com.amazonaws.services.iot.model.ListIndicesResult
}

@Generated
class AWSIotListIndicesCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListIndicesRequest, com.amazonaws.services.iot.model.ListIndicesResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.iot.model.ListIndicesRequest {
		val input = com.amazonaws.services.iot.model.ListIndicesRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.ListIndicesResult {
	  return com.amazonaws.services.iot.model.ListIndicesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.ListIndicesResult {
		return environment.execute_api.listIndices(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-indices")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSIotFunctions.listJobExecutionsForJob(init: AWSIotListJobExecutionsForJobCommand.() -> Unit): com.amazonaws.services.iot.model.ListJobExecutionsForJobResult {
	return this.block.declare(AWSIotListJobExecutionsForJobCommand().apply(init)) as com.amazonaws.services.iot.model.ListJobExecutionsForJobResult
}

@Generated
class AWSIotListJobExecutionsForJobCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListJobExecutionsForJobRequest, com.amazonaws.services.iot.model.ListJobExecutionsForJobResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.ListJobExecutionsForJobResult {
	  return com.amazonaws.services.iot.model.ListJobExecutionsForJobResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.ListJobExecutionsForJobResult {
		return environment.execute_api.listJobExecutionsForJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-job-executions-for-job")
				.argument("job-id", jobId)
				.argument("status", status?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSIotFunctions.listJobExecutionsForThing(init: AWSIotListJobExecutionsForThingCommand.() -> Unit): com.amazonaws.services.iot.model.ListJobExecutionsForThingResult {
	return this.block.declare(AWSIotListJobExecutionsForThingCommand().apply(init)) as com.amazonaws.services.iot.model.ListJobExecutionsForThingResult
}

@Generated
class AWSIotListJobExecutionsForThingCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListJobExecutionsForThingRequest, com.amazonaws.services.iot.model.ListJobExecutionsForThingResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.ListJobExecutionsForThingResult {
	  return com.amazonaws.services.iot.model.ListJobExecutionsForThingResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.ListJobExecutionsForThingResult {
		return environment.execute_api.listJobExecutionsForThing(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-job-executions-for-thing")
				.argument("thing-name", thingName)
				.argument("status", status?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSIotFunctions.listJobs(init: AWSIotListJobsCommand.() -> Unit): com.amazonaws.services.iot.model.ListJobsResult {
	return this.block.declare(AWSIotListJobsCommand().apply(init)) as com.amazonaws.services.iot.model.ListJobsResult
}

@Generated
class AWSIotListJobsCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListJobsRequest, com.amazonaws.services.iot.model.ListJobsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.ListJobsResult {
	  return com.amazonaws.services.iot.model.ListJobsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.ListJobsResult {
		return environment.execute_api.listJobs(build())
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


fun AWSIotFunctions.listOTAUpdates(init: AWSIotListOTAUpdatesCommand.() -> Unit): com.amazonaws.services.iot.model.ListOTAUpdatesResult {
	return this.block.declare(AWSIotListOTAUpdatesCommand().apply(init)) as com.amazonaws.services.iot.model.ListOTAUpdatesResult
}

@Generated
class AWSIotListOTAUpdatesCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListOTAUpdatesRequest, com.amazonaws.services.iot.model.ListOTAUpdatesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.ListOTAUpdatesResult {
	  return com.amazonaws.services.iot.model.ListOTAUpdatesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.ListOTAUpdatesResult {
		return environment.execute_api.listOTAUpdates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-otaupdates")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.argument("ota-update-status", otaUpdateStatus?.toString())
	}

}


fun AWSIotFunctions.listOutgoingCertificates(init: AWSIotListOutgoingCertificatesCommand.() -> Unit): com.amazonaws.services.iot.model.ListOutgoingCertificatesResult {
	return this.block.declare(AWSIotListOutgoingCertificatesCommand().apply(init)) as com.amazonaws.services.iot.model.ListOutgoingCertificatesResult
}

@Generated
class AWSIotListOutgoingCertificatesCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListOutgoingCertificatesRequest, com.amazonaws.services.iot.model.ListOutgoingCertificatesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.ListOutgoingCertificatesResult {
	  return com.amazonaws.services.iot.model.ListOutgoingCertificatesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.ListOutgoingCertificatesResult {
		return environment.execute_api.listOutgoingCertificates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-outgoing-certificates")
				.argument("page-size", pageSize?.toString())
				.argument("marker", marker)
				.option("ascending-order", ascendingOrder ?: false)
	}

}


fun AWSIotFunctions.listPolicies(init: AWSIotListPoliciesCommand.() -> Unit): com.amazonaws.services.iot.model.ListPoliciesResult {
	return this.block.declare(AWSIotListPoliciesCommand().apply(init)) as com.amazonaws.services.iot.model.ListPoliciesResult
}

@Generated
class AWSIotListPoliciesCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListPoliciesRequest, com.amazonaws.services.iot.model.ListPoliciesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.ListPoliciesResult {
	  return com.amazonaws.services.iot.model.ListPoliciesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.ListPoliciesResult {
		return environment.execute_api.listPolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-policies")
				.argument("marker", marker)
				.argument("page-size", pageSize?.toString())
				.option("ascending-order", ascendingOrder ?: false)
	}

}


fun AWSIotFunctions.listPolicyPrincipals(init: AWSIotListPolicyPrincipalsCommand.() -> Unit): com.amazonaws.services.iot.model.ListPolicyPrincipalsResult {
	return this.block.declare(AWSIotListPolicyPrincipalsCommand().apply(init)) as com.amazonaws.services.iot.model.ListPolicyPrincipalsResult
}

@Generated
class AWSIotListPolicyPrincipalsCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListPolicyPrincipalsRequest, com.amazonaws.services.iot.model.ListPolicyPrincipalsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.ListPolicyPrincipalsResult {
	  return com.amazonaws.services.iot.model.ListPolicyPrincipalsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.ListPolicyPrincipalsResult {
		return environment.execute_api.listPolicyPrincipals(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-policy-principals")
				.argument("policy-name", policyName)
				.argument("marker", marker)
				.argument("page-size", pageSize?.toString())
				.option("ascending-order", ascendingOrder ?: false)
	}

}


fun AWSIotFunctions.listPolicyVersions(init: AWSIotListPolicyVersionsCommand.() -> Unit): com.amazonaws.services.iot.model.ListPolicyVersionsResult {
	return this.block.declare(AWSIotListPolicyVersionsCommand().apply(init)) as com.amazonaws.services.iot.model.ListPolicyVersionsResult
}

@Generated
class AWSIotListPolicyVersionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListPolicyVersionsRequest, com.amazonaws.services.iot.model.ListPolicyVersionsResult> {

	var policyName: String? = null

	override fun build(): com.amazonaws.services.iot.model.ListPolicyVersionsRequest {
		val input = com.amazonaws.services.iot.model.ListPolicyVersionsRequest()
		input.setPolicyName(this.policyName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.ListPolicyVersionsResult {
	  return com.amazonaws.services.iot.model.ListPolicyVersionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.ListPolicyVersionsResult {
		return environment.execute_api.listPolicyVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-policy-versions")
				.argument("policy-name", policyName)
	}

}


fun AWSIotFunctions.listPrincipalPolicies(init: AWSIotListPrincipalPoliciesCommand.() -> Unit): com.amazonaws.services.iot.model.ListPrincipalPoliciesResult {
	return this.block.declare(AWSIotListPrincipalPoliciesCommand().apply(init)) as com.amazonaws.services.iot.model.ListPrincipalPoliciesResult
}

@Generated
class AWSIotListPrincipalPoliciesCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListPrincipalPoliciesRequest, com.amazonaws.services.iot.model.ListPrincipalPoliciesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.ListPrincipalPoliciesResult {
	  return com.amazonaws.services.iot.model.ListPrincipalPoliciesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.ListPrincipalPoliciesResult {
		return environment.execute_api.listPrincipalPolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-principal-policies")
				.argument("principal", principal)
				.argument("marker", marker)
				.argument("page-size", pageSize?.toString())
				.option("ascending-order", ascendingOrder ?: false)
	}

}


fun AWSIotFunctions.listPrincipalThings(init: AWSIotListPrincipalThingsCommand.() -> Unit): com.amazonaws.services.iot.model.ListPrincipalThingsResult {
	return this.block.declare(AWSIotListPrincipalThingsCommand().apply(init)) as com.amazonaws.services.iot.model.ListPrincipalThingsResult
}

@Generated
class AWSIotListPrincipalThingsCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListPrincipalThingsRequest, com.amazonaws.services.iot.model.ListPrincipalThingsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.ListPrincipalThingsResult {
	  return com.amazonaws.services.iot.model.ListPrincipalThingsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.ListPrincipalThingsResult {
		return environment.execute_api.listPrincipalThings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-principal-things")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("principal", principal)
	}

}


fun AWSIotFunctions.listRoleAliases(init: AWSIotListRoleAliasesCommand.() -> Unit): com.amazonaws.services.iot.model.ListRoleAliasesResult {
	return this.block.declare(AWSIotListRoleAliasesCommand().apply(init)) as com.amazonaws.services.iot.model.ListRoleAliasesResult
}

@Generated
class AWSIotListRoleAliasesCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListRoleAliasesRequest, com.amazonaws.services.iot.model.ListRoleAliasesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.ListRoleAliasesResult {
	  return com.amazonaws.services.iot.model.ListRoleAliasesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.ListRoleAliasesResult {
		return environment.execute_api.listRoleAliases(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-role-aliases")
				.argument("page-size", pageSize?.toString())
				.argument("marker", marker)
				.option("ascending-order", ascendingOrder ?: false)
	}

}


fun AWSIotFunctions.listStreams(init: AWSIotListStreamsCommand.() -> Unit): com.amazonaws.services.iot.model.ListStreamsResult {
	return this.block.declare(AWSIotListStreamsCommand().apply(init)) as com.amazonaws.services.iot.model.ListStreamsResult
}

@Generated
class AWSIotListStreamsCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListStreamsRequest, com.amazonaws.services.iot.model.ListStreamsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.ListStreamsResult {
	  return com.amazonaws.services.iot.model.ListStreamsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.ListStreamsResult {
		return environment.execute_api.listStreams(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-streams")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.option("ascending-order", ascendingOrder ?: false)
	}

}


fun AWSIotFunctions.listTargetsForPolicy(init: AWSIotListTargetsForPolicyCommand.() -> Unit): com.amazonaws.services.iot.model.ListTargetsForPolicyResult {
	return this.block.declare(AWSIotListTargetsForPolicyCommand().apply(init)) as com.amazonaws.services.iot.model.ListTargetsForPolicyResult
}

@Generated
class AWSIotListTargetsForPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListTargetsForPolicyRequest, com.amazonaws.services.iot.model.ListTargetsForPolicyResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.ListTargetsForPolicyResult {
	  return com.amazonaws.services.iot.model.ListTargetsForPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.ListTargetsForPolicyResult {
		return environment.execute_api.listTargetsForPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-targets-for-policy")
				.argument("policy-name", policyName)
				.argument("marker", marker)
				.argument("page-size", pageSize?.toString())
	}

}


fun AWSIotFunctions.listThingGroups(init: AWSIotListThingGroupsCommand.() -> Unit): com.amazonaws.services.iot.model.ListThingGroupsResult {
	return this.block.declare(AWSIotListThingGroupsCommand().apply(init)) as com.amazonaws.services.iot.model.ListThingGroupsResult
}

@Generated
class AWSIotListThingGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListThingGroupsRequest, com.amazonaws.services.iot.model.ListThingGroupsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.ListThingGroupsResult {
	  return com.amazonaws.services.iot.model.ListThingGroupsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.ListThingGroupsResult {
		return environment.execute_api.listThingGroups(build())
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


fun AWSIotFunctions.listThingGroupsForThing(init: AWSIotListThingGroupsForThingCommand.() -> Unit): com.amazonaws.services.iot.model.ListThingGroupsForThingResult {
	return this.block.declare(AWSIotListThingGroupsForThingCommand().apply(init)) as com.amazonaws.services.iot.model.ListThingGroupsForThingResult
}

@Generated
class AWSIotListThingGroupsForThingCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListThingGroupsForThingRequest, com.amazonaws.services.iot.model.ListThingGroupsForThingResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.ListThingGroupsForThingResult {
	  return com.amazonaws.services.iot.model.ListThingGroupsForThingResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.ListThingGroupsForThingResult {
		return environment.execute_api.listThingGroupsForThing(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-thing-groups-for-thing")
				.argument("thing-name", thingName)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSIotFunctions.listThingPrincipals(init: AWSIotListThingPrincipalsCommand.() -> Unit): com.amazonaws.services.iot.model.ListThingPrincipalsResult {
	return this.block.declare(AWSIotListThingPrincipalsCommand().apply(init)) as com.amazonaws.services.iot.model.ListThingPrincipalsResult
}

@Generated
class AWSIotListThingPrincipalsCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListThingPrincipalsRequest, com.amazonaws.services.iot.model.ListThingPrincipalsResult> {

	var thingName: String? = null

	override fun build(): com.amazonaws.services.iot.model.ListThingPrincipalsRequest {
		val input = com.amazonaws.services.iot.model.ListThingPrincipalsRequest()
		input.setThingName(this.thingName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.ListThingPrincipalsResult {
	  return com.amazonaws.services.iot.model.ListThingPrincipalsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.ListThingPrincipalsResult {
		return environment.execute_api.listThingPrincipals(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-thing-principals")
				.argument("thing-name", thingName)
	}

}


fun AWSIotFunctions.listThingRegistrationTaskReports(init: AWSIotListThingRegistrationTaskReportsCommand.() -> Unit): com.amazonaws.services.iot.model.ListThingRegistrationTaskReportsResult {
	return this.block.declare(AWSIotListThingRegistrationTaskReportsCommand().apply(init)) as com.amazonaws.services.iot.model.ListThingRegistrationTaskReportsResult
}

@Generated
class AWSIotListThingRegistrationTaskReportsCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListThingRegistrationTaskReportsRequest, com.amazonaws.services.iot.model.ListThingRegistrationTaskReportsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.ListThingRegistrationTaskReportsResult {
	  return com.amazonaws.services.iot.model.ListThingRegistrationTaskReportsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.ListThingRegistrationTaskReportsResult {
		return environment.execute_api.listThingRegistrationTaskReports(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-thing-registration-task-reports")
				.argument("task-id", taskId)
				.argument("report-type", reportType?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSIotFunctions.listThingRegistrationTasks(init: AWSIotListThingRegistrationTasksCommand.() -> Unit): com.amazonaws.services.iot.model.ListThingRegistrationTasksResult {
	return this.block.declare(AWSIotListThingRegistrationTasksCommand().apply(init)) as com.amazonaws.services.iot.model.ListThingRegistrationTasksResult
}

@Generated
class AWSIotListThingRegistrationTasksCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListThingRegistrationTasksRequest, com.amazonaws.services.iot.model.ListThingRegistrationTasksResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.ListThingRegistrationTasksResult {
	  return com.amazonaws.services.iot.model.ListThingRegistrationTasksResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.ListThingRegistrationTasksResult {
		return environment.execute_api.listThingRegistrationTasks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-thing-registration-tasks")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("status", status?.toString())
	}

}


fun AWSIotFunctions.listThingTypes(init: AWSIotListThingTypesCommand.() -> Unit): com.amazonaws.services.iot.model.ListThingTypesResult {
	return this.block.declare(AWSIotListThingTypesCommand().apply(init)) as com.amazonaws.services.iot.model.ListThingTypesResult
}

@Generated
class AWSIotListThingTypesCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListThingTypesRequest, com.amazonaws.services.iot.model.ListThingTypesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.ListThingTypesResult {
	  return com.amazonaws.services.iot.model.ListThingTypesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.ListThingTypesResult {
		return environment.execute_api.listThingTypes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-thing-types")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("thing-type-name", thingTypeName)
	}

}


fun AWSIotFunctions.listThings(init: AWSIotListThingsCommand.() -> Unit): com.amazonaws.services.iot.model.ListThingsResult {
	return this.block.declare(AWSIotListThingsCommand().apply(init)) as com.amazonaws.services.iot.model.ListThingsResult
}

@Generated
class AWSIotListThingsCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListThingsRequest, com.amazonaws.services.iot.model.ListThingsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.ListThingsResult {
	  return com.amazonaws.services.iot.model.ListThingsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.ListThingsResult {
		return environment.execute_api.listThings(build())
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


fun AWSIotFunctions.listThingsInThingGroup(init: AWSIotListThingsInThingGroupCommand.() -> Unit): com.amazonaws.services.iot.model.ListThingsInThingGroupResult {
	return this.block.declare(AWSIotListThingsInThingGroupCommand().apply(init)) as com.amazonaws.services.iot.model.ListThingsInThingGroupResult
}

@Generated
class AWSIotListThingsInThingGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListThingsInThingGroupRequest, com.amazonaws.services.iot.model.ListThingsInThingGroupResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.ListThingsInThingGroupResult {
	  return com.amazonaws.services.iot.model.ListThingsInThingGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.ListThingsInThingGroupResult {
		return environment.execute_api.listThingsInThingGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-things-in-thing-group")
				.argument("thing-group-name", thingGroupName)
				.option("recursive", recursive ?: false)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSIotFunctions.listTopicRules(init: AWSIotListTopicRulesCommand.() -> Unit): com.amazonaws.services.iot.model.ListTopicRulesResult {
	return this.block.declare(AWSIotListTopicRulesCommand().apply(init)) as com.amazonaws.services.iot.model.ListTopicRulesResult
}

@Generated
class AWSIotListTopicRulesCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListTopicRulesRequest, com.amazonaws.services.iot.model.ListTopicRulesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.ListTopicRulesResult {
	  return com.amazonaws.services.iot.model.ListTopicRulesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.ListTopicRulesResult {
		return environment.execute_api.listTopicRules(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-topic-rules")
				.argument("topic", topic)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.option("rule-disabled", ruleDisabled ?: false)
	}

}


fun AWSIotFunctions.listV2LoggingLevels(init: AWSIotListV2LoggingLevelsCommand.() -> Unit): com.amazonaws.services.iot.model.ListV2LoggingLevelsResult {
	return this.block.declare(AWSIotListV2LoggingLevelsCommand().apply(init)) as com.amazonaws.services.iot.model.ListV2LoggingLevelsResult
}

@Generated
class AWSIotListV2LoggingLevelsCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ListV2LoggingLevelsRequest, com.amazonaws.services.iot.model.ListV2LoggingLevelsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.ListV2LoggingLevelsResult {
	  return com.amazonaws.services.iot.model.ListV2LoggingLevelsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.ListV2LoggingLevelsResult {
		return environment.execute_api.listV2LoggingLevels(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api list-v2-logging-levels")
				.argument("target-type", targetType?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSIotFunctions.registerCACertificate(init: AWSIotRegisterCACertificateCommand.() -> Unit): com.amazonaws.services.iot.model.RegisterCACertificateResult {
	return this.block.declare(AWSIotRegisterCACertificateCommand().apply(init)) as com.amazonaws.services.iot.model.RegisterCACertificateResult
}

@Generated
class AWSIotRegisterCACertificateCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.RegisterCACertificateRequest, com.amazonaws.services.iot.model.RegisterCACertificateResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.RegisterCACertificateResult {
	  return com.amazonaws.services.iot.model.RegisterCACertificateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.RegisterCACertificateResult {
		return environment.execute_api.registerCACertificate(build())
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


fun AWSIotFunctions.registerCertificate(init: AWSIotRegisterCertificateCommand.() -> Unit): com.amazonaws.services.iot.model.RegisterCertificateResult {
	return this.block.declare(AWSIotRegisterCertificateCommand().apply(init)) as com.amazonaws.services.iot.model.RegisterCertificateResult
}

@Generated
class AWSIotRegisterCertificateCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.RegisterCertificateRequest, com.amazonaws.services.iot.model.RegisterCertificateResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.RegisterCertificateResult {
	  return com.amazonaws.services.iot.model.RegisterCertificateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.RegisterCertificateResult {
		return environment.execute_api.registerCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api register-certificate")
				.argument("certificate-pem", certificatePem)
				.argument("ca-certificate-pem", caCertificatePem)
				.option("set-as-active", setAsActive ?: false)
				.argument("status", status?.toString())
	}

}


fun AWSIotFunctions.registerThing(init: AWSIotRegisterThingCommand.() -> Unit): com.amazonaws.services.iot.model.RegisterThingResult {
	return this.block.declare(AWSIotRegisterThingCommand().apply(init)) as com.amazonaws.services.iot.model.RegisterThingResult
}

@Generated
class AWSIotRegisterThingCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.RegisterThingRequest, com.amazonaws.services.iot.model.RegisterThingResult> {

	var templateBody: String? = null
	var parameters: Map<String, String>? = null

	override fun build(): com.amazonaws.services.iot.model.RegisterThingRequest {
		val input = com.amazonaws.services.iot.model.RegisterThingRequest()
		input.setTemplateBody(this.templateBody)
		input.setParameters(this.parameters)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.RegisterThingResult {
	  return com.amazonaws.services.iot.model.RegisterThingResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.RegisterThingResult {
		return environment.execute_api.registerThing(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api register-thing")
				.argument("template-body", templateBody)
				.argument("parameters", parameters?.toString())
	}

}


fun AWSIotFunctions.rejectCertificateTransfer(init: AWSIotRejectCertificateTransferCommand.() -> Unit): com.amazonaws.services.iot.model.RejectCertificateTransferResult {
	return this.block.declare(AWSIotRejectCertificateTransferCommand().apply(init)) as com.amazonaws.services.iot.model.RejectCertificateTransferResult
}

@Generated
class AWSIotRejectCertificateTransferCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.RejectCertificateTransferRequest, com.amazonaws.services.iot.model.RejectCertificateTransferResult> {

	var certificateId: String? = null
	var rejectReason: String? = null

	override fun build(): com.amazonaws.services.iot.model.RejectCertificateTransferRequest {
		val input = com.amazonaws.services.iot.model.RejectCertificateTransferRequest()
		input.setCertificateId(this.certificateId)
		input.setRejectReason(this.rejectReason)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.RejectCertificateTransferResult {
	  return com.amazonaws.services.iot.model.RejectCertificateTransferResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.RejectCertificateTransferResult {
		return environment.execute_api.rejectCertificateTransfer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api reject-certificate-transfer")
				.argument("certificate-id", certificateId)
				.argument("reject-reason", rejectReason)
	}

}


fun AWSIotFunctions.removeThingFromThingGroup(init: AWSIotRemoveThingFromThingGroupCommand.() -> Unit): com.amazonaws.services.iot.model.RemoveThingFromThingGroupResult {
	return this.block.declare(AWSIotRemoveThingFromThingGroupCommand().apply(init)) as com.amazonaws.services.iot.model.RemoveThingFromThingGroupResult
}

@Generated
class AWSIotRemoveThingFromThingGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.RemoveThingFromThingGroupRequest, com.amazonaws.services.iot.model.RemoveThingFromThingGroupResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.RemoveThingFromThingGroupResult {
	  return com.amazonaws.services.iot.model.RemoveThingFromThingGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.RemoveThingFromThingGroupResult {
		return environment.execute_api.removeThingFromThingGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api remove-thing-from-thing-group")
				.argument("thing-group-name", thingGroupName)
				.argument("thing-group-arn", thingGroupArn)
				.argument("thing-name", thingName)
				.argument("thing-arn", thingArn)
	}

}


fun AWSIotFunctions.replaceTopicRule(init: AWSIotReplaceTopicRuleCommand.() -> Unit): com.amazonaws.services.iot.model.ReplaceTopicRuleResult {
	return this.block.declare(AWSIotReplaceTopicRuleCommand().apply(init)) as com.amazonaws.services.iot.model.ReplaceTopicRuleResult
}

@Generated
class AWSIotReplaceTopicRuleCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.ReplaceTopicRuleRequest, com.amazonaws.services.iot.model.ReplaceTopicRuleResult> {

	var ruleName: String? = null
	var topicRulePayload: com.amazonaws.services.iot.model.TopicRulePayload? = null

	override fun build(): com.amazonaws.services.iot.model.ReplaceTopicRuleRequest {
		val input = com.amazonaws.services.iot.model.ReplaceTopicRuleRequest()
		input.setRuleName(this.ruleName)
		input.setTopicRulePayload(this.topicRulePayload)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.ReplaceTopicRuleResult {
	  return com.amazonaws.services.iot.model.ReplaceTopicRuleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.ReplaceTopicRuleResult {
		return environment.execute_api.replaceTopicRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api replace-topic-rule")
				.argument("rule-name", ruleName)
				.argument("topic-rule-payload", topicRulePayload?.toString())
	}

}


fun AWSIotFunctions.searchIndex(init: AWSIotSearchIndexCommand.() -> Unit): com.amazonaws.services.iot.model.SearchIndexResult {
	return this.block.declare(AWSIotSearchIndexCommand().apply(init)) as com.amazonaws.services.iot.model.SearchIndexResult
}

@Generated
class AWSIotSearchIndexCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.SearchIndexRequest, com.amazonaws.services.iot.model.SearchIndexResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.SearchIndexResult {
	  return com.amazonaws.services.iot.model.SearchIndexResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.SearchIndexResult {
		return environment.execute_api.searchIndex(build())
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


fun AWSIotFunctions.setDefaultAuthorizer(init: AWSIotSetDefaultAuthorizerCommand.() -> Unit): com.amazonaws.services.iot.model.SetDefaultAuthorizerResult {
	return this.block.declare(AWSIotSetDefaultAuthorizerCommand().apply(init)) as com.amazonaws.services.iot.model.SetDefaultAuthorizerResult
}

@Generated
class AWSIotSetDefaultAuthorizerCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.SetDefaultAuthorizerRequest, com.amazonaws.services.iot.model.SetDefaultAuthorizerResult> {

	var authorizerName: String? = null

	override fun build(): com.amazonaws.services.iot.model.SetDefaultAuthorizerRequest {
		val input = com.amazonaws.services.iot.model.SetDefaultAuthorizerRequest()
		input.setAuthorizerName(this.authorizerName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.SetDefaultAuthorizerResult {
	  return com.amazonaws.services.iot.model.SetDefaultAuthorizerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.SetDefaultAuthorizerResult {
		return environment.execute_api.setDefaultAuthorizer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api set-default-authorizer")
				.argument("authorizer-name", authorizerName)
	}

}


fun AWSIotFunctions.setDefaultPolicyVersion(init: AWSIotSetDefaultPolicyVersionCommand.() -> Unit): com.amazonaws.services.iot.model.SetDefaultPolicyVersionResult {
	return this.block.declare(AWSIotSetDefaultPolicyVersionCommand().apply(init)) as com.amazonaws.services.iot.model.SetDefaultPolicyVersionResult
}

@Generated
class AWSIotSetDefaultPolicyVersionCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.SetDefaultPolicyVersionRequest, com.amazonaws.services.iot.model.SetDefaultPolicyVersionResult> {

	var policyName: String? = null
	var policyVersionId: String? = null

	override fun build(): com.amazonaws.services.iot.model.SetDefaultPolicyVersionRequest {
		val input = com.amazonaws.services.iot.model.SetDefaultPolicyVersionRequest()
		input.setPolicyName(this.policyName)
		input.setPolicyVersionId(this.policyVersionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.SetDefaultPolicyVersionResult {
	  return com.amazonaws.services.iot.model.SetDefaultPolicyVersionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.SetDefaultPolicyVersionResult {
		return environment.execute_api.setDefaultPolicyVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api set-default-policy-version")
				.argument("policy-name", policyName)
				.argument("policy-version-id", policyVersionId)
	}

}


fun AWSIotFunctions.setLoggingOptions(init: AWSIotSetLoggingOptionsCommand.() -> Unit): com.amazonaws.services.iot.model.SetLoggingOptionsResult {
	return this.block.declare(AWSIotSetLoggingOptionsCommand().apply(init)) as com.amazonaws.services.iot.model.SetLoggingOptionsResult
}

@Generated
class AWSIotSetLoggingOptionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.SetLoggingOptionsRequest, com.amazonaws.services.iot.model.SetLoggingOptionsResult> {

	var loggingOptionsPayload: com.amazonaws.services.iot.model.LoggingOptionsPayload? = null

	override fun build(): com.amazonaws.services.iot.model.SetLoggingOptionsRequest {
		val input = com.amazonaws.services.iot.model.SetLoggingOptionsRequest()
		input.setLoggingOptionsPayload(this.loggingOptionsPayload)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.SetLoggingOptionsResult {
	  return com.amazonaws.services.iot.model.SetLoggingOptionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.SetLoggingOptionsResult {
		return environment.execute_api.setLoggingOptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api set-logging-options")
				.argument("logging-options-payload", loggingOptionsPayload?.toString())
	}

}


fun AWSIotFunctions.setV2LoggingLevel(init: AWSIotSetV2LoggingLevelCommand.() -> Unit): com.amazonaws.services.iot.model.SetV2LoggingLevelResult {
	return this.block.declare(AWSIotSetV2LoggingLevelCommand().apply(init)) as com.amazonaws.services.iot.model.SetV2LoggingLevelResult
}

@Generated
class AWSIotSetV2LoggingLevelCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.SetV2LoggingLevelRequest, com.amazonaws.services.iot.model.SetV2LoggingLevelResult> {

	var logTarget: com.amazonaws.services.iot.model.LogTarget? = null
	var logLevel: LogLevel? = null

	override fun build(): com.amazonaws.services.iot.model.SetV2LoggingLevelRequest {
		val input = com.amazonaws.services.iot.model.SetV2LoggingLevelRequest()
		input.setLogTarget(this.logTarget)
		input.setLogLevel(this.logLevel?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.SetV2LoggingLevelResult {
	  return com.amazonaws.services.iot.model.SetV2LoggingLevelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.SetV2LoggingLevelResult {
		return environment.execute_api.setV2LoggingLevel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api set-v2-logging-level")
				.argument("log-target", logTarget?.toString())
				.argument("log-level", logLevel?.toString())
	}

}


fun AWSIotFunctions.setV2LoggingOptions(init: AWSIotSetV2LoggingOptionsCommand.() -> Unit): com.amazonaws.services.iot.model.SetV2LoggingOptionsResult {
	return this.block.declare(AWSIotSetV2LoggingOptionsCommand().apply(init)) as com.amazonaws.services.iot.model.SetV2LoggingOptionsResult
}

@Generated
class AWSIotSetV2LoggingOptionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.SetV2LoggingOptionsRequest, com.amazonaws.services.iot.model.SetV2LoggingOptionsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.SetV2LoggingOptionsResult {
	  return com.amazonaws.services.iot.model.SetV2LoggingOptionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.SetV2LoggingOptionsResult {
		return environment.execute_api.setV2LoggingOptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api set-v2-logging-options")
				.argument("role-arn", roleArn)
				.argument("default-log-level", defaultLogLevel?.toString())
				.option("disable-all-logs", disableAllLogs ?: false)
	}

}


fun AWSIotFunctions.startThingRegistrationTask(init: AWSIotStartThingRegistrationTaskCommand.() -> Unit): com.amazonaws.services.iot.model.StartThingRegistrationTaskResult {
	return this.block.declare(AWSIotStartThingRegistrationTaskCommand().apply(init)) as com.amazonaws.services.iot.model.StartThingRegistrationTaskResult
}

@Generated
class AWSIotStartThingRegistrationTaskCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.StartThingRegistrationTaskRequest, com.amazonaws.services.iot.model.StartThingRegistrationTaskResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.StartThingRegistrationTaskResult {
	  return com.amazonaws.services.iot.model.StartThingRegistrationTaskResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.StartThingRegistrationTaskResult {
		return environment.execute_api.startThingRegistrationTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api start-thing-registration-task")
				.argument("template-body", templateBody)
				.argument("input-file-bucket", inputFileBucket)
				.argument("input-file-key", inputFileKey)
				.argument("role-arn", roleArn)
	}

}


fun AWSIotFunctions.stopThingRegistrationTask(init: AWSIotStopThingRegistrationTaskCommand.() -> Unit): com.amazonaws.services.iot.model.StopThingRegistrationTaskResult {
	return this.block.declare(AWSIotStopThingRegistrationTaskCommand().apply(init)) as com.amazonaws.services.iot.model.StopThingRegistrationTaskResult
}

@Generated
class AWSIotStopThingRegistrationTaskCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.StopThingRegistrationTaskRequest, com.amazonaws.services.iot.model.StopThingRegistrationTaskResult> {

	var taskId: String? = null

	override fun build(): com.amazonaws.services.iot.model.StopThingRegistrationTaskRequest {
		val input = com.amazonaws.services.iot.model.StopThingRegistrationTaskRequest()
		input.setTaskId(this.taskId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.StopThingRegistrationTaskResult {
	  return com.amazonaws.services.iot.model.StopThingRegistrationTaskResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.StopThingRegistrationTaskResult {
		return environment.execute_api.stopThingRegistrationTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api stop-thing-registration-task")
				.argument("task-id", taskId)
	}

}


fun AWSIotFunctions.testAuthorization(init: AWSIotTestAuthorizationCommand.() -> Unit): com.amazonaws.services.iot.model.TestAuthorizationResult {
	return this.block.declare(AWSIotTestAuthorizationCommand().apply(init)) as com.amazonaws.services.iot.model.TestAuthorizationResult
}

@Generated
class AWSIotTestAuthorizationCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.TestAuthorizationRequest, com.amazonaws.services.iot.model.TestAuthorizationResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.TestAuthorizationResult {
	  return com.amazonaws.services.iot.model.TestAuthorizationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.TestAuthorizationResult {
		return environment.execute_api.testAuthorization(build())
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


fun AWSIotFunctions.testInvokeAuthorizer(init: AWSIotTestInvokeAuthorizerCommand.() -> Unit): com.amazonaws.services.iot.model.TestInvokeAuthorizerResult {
	return this.block.declare(AWSIotTestInvokeAuthorizerCommand().apply(init)) as com.amazonaws.services.iot.model.TestInvokeAuthorizerResult
}

@Generated
class AWSIotTestInvokeAuthorizerCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.TestInvokeAuthorizerRequest, com.amazonaws.services.iot.model.TestInvokeAuthorizerResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.TestInvokeAuthorizerResult {
	  return com.amazonaws.services.iot.model.TestInvokeAuthorizerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.TestInvokeAuthorizerResult {
		return environment.execute_api.testInvokeAuthorizer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api test-invoke-authorizer")
				.argument("authorizer-name", authorizerName)
				.argument("token", token)
				.argument("token-signature", tokenSignature)
	}

}


fun AWSIotFunctions.transferCertificate(init: AWSIotTransferCertificateCommand.() -> Unit): com.amazonaws.services.iot.model.TransferCertificateResult {
	return this.block.declare(AWSIotTransferCertificateCommand().apply(init)) as com.amazonaws.services.iot.model.TransferCertificateResult
}

@Generated
class AWSIotTransferCertificateCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.TransferCertificateRequest, com.amazonaws.services.iot.model.TransferCertificateResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.TransferCertificateResult {
	  return com.amazonaws.services.iot.model.TransferCertificateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.TransferCertificateResult {
		return environment.execute_api.transferCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api transfer-certificate")
				.argument("certificate-id", certificateId)
				.argument("target-aws-account", targetAwsAccount)
				.argument("transfer-message", transferMessage)
	}

}


fun AWSIotFunctions.updateAuthorizer(init: AWSIotUpdateAuthorizerCommand.() -> Unit): com.amazonaws.services.iot.model.UpdateAuthorizerResult {
	return this.block.declare(AWSIotUpdateAuthorizerCommand().apply(init)) as com.amazonaws.services.iot.model.UpdateAuthorizerResult
}

@Generated
class AWSIotUpdateAuthorizerCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.UpdateAuthorizerRequest, com.amazonaws.services.iot.model.UpdateAuthorizerResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.UpdateAuthorizerResult {
	  return com.amazonaws.services.iot.model.UpdateAuthorizerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.UpdateAuthorizerResult {
		return environment.execute_api.updateAuthorizer(build())
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


fun AWSIotFunctions.updateCACertificate(init: AWSIotUpdateCACertificateCommand.() -> Unit): com.amazonaws.services.iot.model.UpdateCACertificateResult {
	return this.block.declare(AWSIotUpdateCACertificateCommand().apply(init)) as com.amazonaws.services.iot.model.UpdateCACertificateResult
}

@Generated
class AWSIotUpdateCACertificateCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.UpdateCACertificateRequest, com.amazonaws.services.iot.model.UpdateCACertificateResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.UpdateCACertificateResult {
	  return com.amazonaws.services.iot.model.UpdateCACertificateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.UpdateCACertificateResult {
		return environment.execute_api.updateCACertificate(build())
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


fun AWSIotFunctions.updateCertificate(init: AWSIotUpdateCertificateCommand.() -> Unit): com.amazonaws.services.iot.model.UpdateCertificateResult {
	return this.block.declare(AWSIotUpdateCertificateCommand().apply(init)) as com.amazonaws.services.iot.model.UpdateCertificateResult
}

@Generated
class AWSIotUpdateCertificateCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.UpdateCertificateRequest, com.amazonaws.services.iot.model.UpdateCertificateResult> {

	var certificateId: String? = null
	var newStatus: CertificateStatus? = null

	override fun build(): com.amazonaws.services.iot.model.UpdateCertificateRequest {
		val input = com.amazonaws.services.iot.model.UpdateCertificateRequest()
		input.setCertificateId(this.certificateId)
		input.setNewStatus(this.newStatus?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.UpdateCertificateResult {
	  return com.amazonaws.services.iot.model.UpdateCertificateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.UpdateCertificateResult {
		return environment.execute_api.updateCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api update-certificate")
				.argument("certificate-id", certificateId)
				.argument("new-status", newStatus?.toString())
	}

}


fun AWSIotFunctions.updateEventConfigurations(init: AWSIotUpdateEventConfigurationsCommand.() -> Unit): com.amazonaws.services.iot.model.UpdateEventConfigurationsResult {
	return this.block.declare(AWSIotUpdateEventConfigurationsCommand().apply(init)) as com.amazonaws.services.iot.model.UpdateEventConfigurationsResult
}

@Generated
class AWSIotUpdateEventConfigurationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.UpdateEventConfigurationsRequest, com.amazonaws.services.iot.model.UpdateEventConfigurationsResult> {

	var eventConfigurations: Map<EventType, com.amazonaws.services.iot.model.Configuration>? = null

	override fun build(): com.amazonaws.services.iot.model.UpdateEventConfigurationsRequest {
		val input = com.amazonaws.services.iot.model.UpdateEventConfigurationsRequest()
		input.setEventConfigurations(this.eventConfigurations?.mapKeys { it.toString() })
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.UpdateEventConfigurationsResult {
	  return com.amazonaws.services.iot.model.UpdateEventConfigurationsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.UpdateEventConfigurationsResult {
		return environment.execute_api.updateEventConfigurations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api update-event-configurations")
				.argument("event-configurations", eventConfigurations?.toString())
	}

}


fun AWSIotFunctions.updateIndexingConfiguration(init: AWSIotUpdateIndexingConfigurationCommand.() -> Unit): com.amazonaws.services.iot.model.UpdateIndexingConfigurationResult {
	return this.block.declare(AWSIotUpdateIndexingConfigurationCommand().apply(init)) as com.amazonaws.services.iot.model.UpdateIndexingConfigurationResult
}

@Generated
class AWSIotUpdateIndexingConfigurationCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.UpdateIndexingConfigurationRequest, com.amazonaws.services.iot.model.UpdateIndexingConfigurationResult> {

	var thingIndexingConfiguration: com.amazonaws.services.iot.model.ThingIndexingConfiguration? = null

	override fun build(): com.amazonaws.services.iot.model.UpdateIndexingConfigurationRequest {
		val input = com.amazonaws.services.iot.model.UpdateIndexingConfigurationRequest()
		input.setThingIndexingConfiguration(this.thingIndexingConfiguration)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iot.model.UpdateIndexingConfigurationResult {
	  return com.amazonaws.services.iot.model.UpdateIndexingConfigurationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.UpdateIndexingConfigurationResult {
		return environment.execute_api.updateIndexingConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api update-indexing-configuration")
				.argument("thing-indexing-configuration", thingIndexingConfiguration?.toString())
	}

}


fun AWSIotFunctions.updateRoleAlias(init: AWSIotUpdateRoleAliasCommand.() -> Unit): com.amazonaws.services.iot.model.UpdateRoleAliasResult {
	return this.block.declare(AWSIotUpdateRoleAliasCommand().apply(init)) as com.amazonaws.services.iot.model.UpdateRoleAliasResult
}

@Generated
class AWSIotUpdateRoleAliasCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.UpdateRoleAliasRequest, com.amazonaws.services.iot.model.UpdateRoleAliasResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.UpdateRoleAliasResult {
	  return com.amazonaws.services.iot.model.UpdateRoleAliasResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.UpdateRoleAliasResult {
		return environment.execute_api.updateRoleAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api update-role-alias")
				.argument("role-alias", roleAlias)
				.argument("role-arn", roleArn)
				.argument("credential-duration-seconds", credentialDurationSeconds?.toString())
	}

}


fun AWSIotFunctions.updateStream(init: AWSIotUpdateStreamCommand.() -> Unit): com.amazonaws.services.iot.model.UpdateStreamResult {
	return this.block.declare(AWSIotUpdateStreamCommand().apply(init)) as com.amazonaws.services.iot.model.UpdateStreamResult
}

@Generated
class AWSIotUpdateStreamCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.UpdateStreamRequest, com.amazonaws.services.iot.model.UpdateStreamResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.UpdateStreamResult {
	  return com.amazonaws.services.iot.model.UpdateStreamResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.UpdateStreamResult {
		return environment.execute_api.updateStream(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api update-stream")
				.argument("stream-id", streamId)
				.argument("description", description)
				.argument("files", files?.toString())
				.argument("role-arn", roleArn)
	}

}


fun AWSIotFunctions.updateThing(init: AWSIotUpdateThingCommand.() -> Unit): com.amazonaws.services.iot.model.UpdateThingResult {
	return this.block.declare(AWSIotUpdateThingCommand().apply(init)) as com.amazonaws.services.iot.model.UpdateThingResult
}

@Generated
class AWSIotUpdateThingCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.UpdateThingRequest, com.amazonaws.services.iot.model.UpdateThingResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.UpdateThingResult {
	  return com.amazonaws.services.iot.model.UpdateThingResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.UpdateThingResult {
		return environment.execute_api.updateThing(build())
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


fun AWSIotFunctions.updateThingGroup(init: AWSIotUpdateThingGroupCommand.() -> Unit): com.amazonaws.services.iot.model.UpdateThingGroupResult {
	return this.block.declare(AWSIotUpdateThingGroupCommand().apply(init)) as com.amazonaws.services.iot.model.UpdateThingGroupResult
}

@Generated
class AWSIotUpdateThingGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.UpdateThingGroupRequest, com.amazonaws.services.iot.model.UpdateThingGroupResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.UpdateThingGroupResult {
	  return com.amazonaws.services.iot.model.UpdateThingGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.UpdateThingGroupResult {
		return environment.execute_api.updateThingGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api update-thing-group")
				.argument("thing-group-name", thingGroupName)
				.argument("thing-group-properties", thingGroupProperties?.toString())
				.argument("expected-version", expectedVersion?.toString())
	}

}


fun AWSIotFunctions.updateThingGroupsForThing(init: AWSIotUpdateThingGroupsForThingCommand.() -> Unit): com.amazonaws.services.iot.model.UpdateThingGroupsForThingResult {
	return this.block.declare(AWSIotUpdateThingGroupsForThingCommand().apply(init)) as com.amazonaws.services.iot.model.UpdateThingGroupsForThingResult
}

@Generated
class AWSIotUpdateThingGroupsForThingCommand() : AmazonWebServiceCommand<com.amazonaws.services.iot.model.UpdateThingGroupsForThingRequest, com.amazonaws.services.iot.model.UpdateThingGroupsForThingResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iot.model.UpdateThingGroupsForThingResult {
	  return com.amazonaws.services.iot.model.UpdateThingGroupsForThingResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iot.model.UpdateThingGroupsForThingResult {
		return environment.execute_api.updateThingGroupsForThing(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws execute-api update-thing-groups-for-thing")
				.argument("thing-name", thingName)
				.argument("thing-groups-to-add", thingGroupsToAdd?.toString())
				.argument("thing-groups-to-remove", thingGroupsToRemove?.toString())
	}

}
