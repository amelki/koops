
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws.ssm

import javax.annotation.Generated
import codingue.koops.core.*
import codingue.koops.aws.*
import com.amazonaws.services.simplesystemsmanagement.*
import com.amazonaws.services.simplesystemsmanagement.model.*

var codingue.koops.core.Environment.ssm: AWSSimpleSystemsManagement
	get() {
		var service = this.capabilities["aws-ssm"]
		if (service == null) {
			service = AWSSimpleSystemsManagementClientBuilder.standard().build()
			this.capabilities["aws-ssm"] = service
		}
		return service as AWSSimpleSystemsManagement
	}
	set(ssm) {
		this.capabilities["aws-ssm"] = ssm
	}

@Generated
class AWSSimpleSystemsManagementFunctions(val block: Block)

infix fun <T> AwsContinuation.ssm(init: AWSSimpleSystemsManagementFunctions.() -> T): T {
	return AWSSimpleSystemsManagementFunctions(shell).run(init)
}

			

fun AWSSimpleSystemsManagementFunctions.addTagsToResource(resourceType: ResourceTypeForTagging, resourceId: String, tags: List<com.amazonaws.services.simplesystemsmanagement.model.Tag>, init: AWSSimpleSystemsManagementAddTagsToResourceCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.AddTagsToResourceResult {
	return this.block.declare(AWSSimpleSystemsManagementAddTagsToResourceCommand(resourceType, resourceId, tags).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.AddTagsToResourceResult
}

@Generated
class AWSSimpleSystemsManagementAddTagsToResourceCommand(val resourceType: ResourceTypeForTagging, val resourceId: String, val tags: List<com.amazonaws.services.simplesystemsmanagement.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.AddTagsToResourceRequest, com.amazonaws.services.simplesystemsmanagement.model.AddTagsToResourceResult> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.AddTagsToResourceRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.AddTagsToResourceRequest()
		input.setResourceType(this.resourceType.toString())
		input.setResourceId(this.resourceId)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.AddTagsToResourceResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.AddTagsToResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.AddTagsToResourceResult {
		return environment.ssm.addTagsToResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm add-tags-to-resource")
				.argument("resource-type", resourceType.toString())
				.argument("resource-id", resourceId)
				.argument("tags", tags.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.cancelCommand(commandId: String, init: AWSSimpleSystemsManagementCancelCommandCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.CancelCommandResult {
	return this.block.declare(AWSSimpleSystemsManagementCancelCommandCommand(commandId).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.CancelCommandResult
}

@Generated
class AWSSimpleSystemsManagementCancelCommandCommand(val commandId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.CancelCommandRequest, com.amazonaws.services.simplesystemsmanagement.model.CancelCommandResult> {

	var instanceIds: List<String>? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.CancelCommandRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.CancelCommandRequest()
		input.setCommandId(this.commandId)
		input.setInstanceIds(this.instanceIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.CancelCommandResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.CancelCommandResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.CancelCommandResult {
		return environment.ssm.cancelCommand(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm cancel-command")
				.argument("command-id", commandId)
				.argument("instance-ids", instanceIds?.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.createActivation(iamRole: String, init: AWSSimpleSystemsManagementCreateActivationCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.CreateActivationResult {
	return this.block.declare(AWSSimpleSystemsManagementCreateActivationCommand(iamRole).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.CreateActivationResult
}

@Generated
class AWSSimpleSystemsManagementCreateActivationCommand(val iamRole: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.CreateActivationRequest, com.amazonaws.services.simplesystemsmanagement.model.CreateActivationResult> {

	var description: String? = null
	var defaultInstanceName: String? = null
	var registrationLimit: Int? = 0
	var expirationDate: java.util.Date? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.CreateActivationRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.CreateActivationRequest()
		input.setDescription(this.description)
		input.setDefaultInstanceName(this.defaultInstanceName)
		input.setIamRole(this.iamRole)
		input.setRegistrationLimit(this.registrationLimit)
		input.setExpirationDate(this.expirationDate)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.CreateActivationResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.CreateActivationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.CreateActivationResult {
		return environment.ssm.createActivation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm create-activation")
				.argument("description", description)
				.argument("default-instance-name", defaultInstanceName)
				.argument("iam-role", iamRole)
				.argument("registration-limit", registrationLimit?.toString())
				.argument("expiration-date", expirationDate?.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.createAssociation(name: String, init: AWSSimpleSystemsManagementCreateAssociationCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationResult {
	return this.block.declare(AWSSimpleSystemsManagementCreateAssociationCommand(name).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationResult
}

@Generated
class AWSSimpleSystemsManagementCreateAssociationCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationRequest, com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationResult> {

	var documentVersion: String? = null
	var instanceId: String? = null
	var parameters: Map<String, List<String>>? = null
	var targets: List<com.amazonaws.services.simplesystemsmanagement.model.Target>? = null
	var scheduleExpression: String? = null
	var outputLocation: com.amazonaws.services.simplesystemsmanagement.model.InstanceAssociationOutputLocation? = null
	var associationName: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationRequest()
		input.setName(this.name)
		input.setDocumentVersion(this.documentVersion)
		input.setInstanceId(this.instanceId)
		input.setParameters(this.parameters)
		input.setTargets(this.targets)
		input.setScheduleExpression(this.scheduleExpression)
		input.setOutputLocation(this.outputLocation)
		input.setAssociationName(this.associationName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationResult {
		return environment.ssm.createAssociation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm create-association")
				.argument("name", name)
				.argument("document-version", documentVersion)
				.argument("instance-id", instanceId)
				.argument("parameters", parameters?.toString())
				.argument("targets", targets?.toString())
				.argument("schedule-expression", scheduleExpression)
				.argument("output-location", outputLocation?.toString())
				.argument("association-name", associationName)
	}

}


fun AWSSimpleSystemsManagementFunctions.createAssociationBatch(entries: List<com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationBatchRequestEntry>, init: AWSSimpleSystemsManagementCreateAssociationBatchCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationBatchResult {
	return this.block.declare(AWSSimpleSystemsManagementCreateAssociationBatchCommand(entries).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationBatchResult
}

@Generated
class AWSSimpleSystemsManagementCreateAssociationBatchCommand(val entries: List<com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationBatchRequestEntry>) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationBatchRequest, com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationBatchResult> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationBatchRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationBatchRequest()
		input.setEntries(this.entries)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationBatchResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationBatchResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationBatchResult {
		return environment.ssm.createAssociationBatch(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm create-association-batch")
				.argument("entries", entries.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.createDocument(content: String, name: String, init: AWSSimpleSystemsManagementCreateDocumentCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.CreateDocumentResult {
	return this.block.declare(AWSSimpleSystemsManagementCreateDocumentCommand(content, name).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.CreateDocumentResult
}

@Generated
class AWSSimpleSystemsManagementCreateDocumentCommand(val content: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.CreateDocumentRequest, com.amazonaws.services.simplesystemsmanagement.model.CreateDocumentResult> {

	var documentType: DocumentType? = null
	var documentFormat: DocumentFormat? = null
	var targetType: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.CreateDocumentRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.CreateDocumentRequest()
		input.setContent(this.content)
		input.setName(this.name)
		input.setDocumentType(this.documentType?.toString())
		input.setDocumentFormat(this.documentFormat?.toString())
		input.setTargetType(this.targetType)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.CreateDocumentResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.CreateDocumentResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.CreateDocumentResult {
		return environment.ssm.createDocument(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm create-document")
				.argument("content", content)
				.argument("name", name)
				.argument("document-type", documentType?.toString())
				.argument("document-format", documentFormat?.toString())
				.argument("target-type", targetType)
	}

}


fun AWSSimpleSystemsManagementFunctions.createMaintenanceWindow(name: String, schedule: String, duration: Int, cutoff: Int, allowUnassociatedTargets: Boolean, init: AWSSimpleSystemsManagementCreateMaintenanceWindowCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.CreateMaintenanceWindowResult {
	return this.block.declare(AWSSimpleSystemsManagementCreateMaintenanceWindowCommand(name, schedule, duration, cutoff, allowUnassociatedTargets).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.CreateMaintenanceWindowResult
}

@Generated
class AWSSimpleSystemsManagementCreateMaintenanceWindowCommand(val name: String, val schedule: String, val duration: Int, val cutoff: Int, val allowUnassociatedTargets: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.CreateMaintenanceWindowRequest, com.amazonaws.services.simplesystemsmanagement.model.CreateMaintenanceWindowResult> {

	var description: String? = null
	var clientToken: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.CreateMaintenanceWindowRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.CreateMaintenanceWindowRequest()
		input.setName(this.name)
		input.setDescription(this.description)
		input.setSchedule(this.schedule)
		input.setDuration(this.duration)
		input.setCutoff(this.cutoff)
		input.setAllowUnassociatedTargets(this.allowUnassociatedTargets)
		input.setClientToken(this.clientToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.CreateMaintenanceWindowResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.CreateMaintenanceWindowResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.CreateMaintenanceWindowResult {
		return environment.ssm.createMaintenanceWindow(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm create-maintenance-window")
				.argument("name", name)
				.argument("description", description)
				.argument("schedule", schedule)
				.argument("duration", duration.toString())
				.argument("cutoff", cutoff.toString())
				.option("allow-unassociated-targets", allowUnassociatedTargets ?: false)
				.argument("client-token", clientToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.createPatchBaseline(name: String, init: AWSSimpleSystemsManagementCreatePatchBaselineCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.CreatePatchBaselineResult {
	return this.block.declare(AWSSimpleSystemsManagementCreatePatchBaselineCommand(name).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.CreatePatchBaselineResult
}

@Generated
class AWSSimpleSystemsManagementCreatePatchBaselineCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.CreatePatchBaselineRequest, com.amazonaws.services.simplesystemsmanagement.model.CreatePatchBaselineResult> {

	var operatingSystem: OperatingSystem? = null
	var globalFilters: com.amazonaws.services.simplesystemsmanagement.model.PatchFilterGroup? = null
	var approvalRules: com.amazonaws.services.simplesystemsmanagement.model.PatchRuleGroup? = null
	var approvedPatches: List<String>? = null
	var approvedPatchesComplianceLevel: PatchComplianceLevel? = null
	var approvedPatchesEnableNonSecurity: Boolean? = false
	var rejectedPatches: List<String>? = null
	var description: String? = null
	var sources: List<com.amazonaws.services.simplesystemsmanagement.model.PatchSource>? = null
	var clientToken: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.CreatePatchBaselineRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.CreatePatchBaselineRequest()
		input.setOperatingSystem(this.operatingSystem?.toString())
		input.setName(this.name)
		input.setGlobalFilters(this.globalFilters)
		input.setApprovalRules(this.approvalRules)
		input.setApprovedPatches(this.approvedPatches)
		input.setApprovedPatchesComplianceLevel(this.approvedPatchesComplianceLevel?.toString())
		input.setApprovedPatchesEnableNonSecurity(this.approvedPatchesEnableNonSecurity)
		input.setRejectedPatches(this.rejectedPatches)
		input.setDescription(this.description)
		input.setSources(this.sources)
		input.setClientToken(this.clientToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.CreatePatchBaselineResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.CreatePatchBaselineResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.CreatePatchBaselineResult {
		return environment.ssm.createPatchBaseline(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm create-patch-baseline")
				.argument("operating-system", operatingSystem?.toString())
				.argument("name", name)
				.argument("global-filters", globalFilters?.toString())
				.argument("approval-rules", approvalRules?.toString())
				.argument("approved-patches", approvedPatches?.toString())
				.argument("approved-patches-compliance-level", approvedPatchesComplianceLevel?.toString())
				.option("approved-patches-enable-non-security", approvedPatchesEnableNonSecurity ?: false)
				.argument("rejected-patches", rejectedPatches?.toString())
				.argument("description", description)
				.argument("sources", sources?.toString())
				.argument("client-token", clientToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.createResourceDataSync(syncName: String, s3Destination: com.amazonaws.services.simplesystemsmanagement.model.ResourceDataSyncS3Destination, init: AWSSimpleSystemsManagementCreateResourceDataSyncCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.CreateResourceDataSyncResult {
	return this.block.declare(AWSSimpleSystemsManagementCreateResourceDataSyncCommand(syncName, s3Destination).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.CreateResourceDataSyncResult
}

@Generated
class AWSSimpleSystemsManagementCreateResourceDataSyncCommand(val syncName: String, val s3Destination: com.amazonaws.services.simplesystemsmanagement.model.ResourceDataSyncS3Destination) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.CreateResourceDataSyncRequest, com.amazonaws.services.simplesystemsmanagement.model.CreateResourceDataSyncResult> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.CreateResourceDataSyncRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.CreateResourceDataSyncRequest()
		input.setSyncName(this.syncName)
		input.setS3Destination(this.s3Destination)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.CreateResourceDataSyncResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.CreateResourceDataSyncResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.CreateResourceDataSyncResult {
		return environment.ssm.createResourceDataSync(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm create-resource-data-sync")
				.argument("sync-name", syncName)
				.argument("s3-destination", s3Destination.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.deleteActivation(activationId: String, init: AWSSimpleSystemsManagementDeleteActivationCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.DeleteActivationResult {
	return this.block.declare(AWSSimpleSystemsManagementDeleteActivationCommand(activationId).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.DeleteActivationResult
}

@Generated
class AWSSimpleSystemsManagementDeleteActivationCommand(val activationId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DeleteActivationRequest, com.amazonaws.services.simplesystemsmanagement.model.DeleteActivationResult> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DeleteActivationRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DeleteActivationRequest()
		input.setActivationId(this.activationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.DeleteActivationResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.DeleteActivationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.DeleteActivationResult {
		return environment.ssm.deleteActivation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm delete-activation")
				.argument("activation-id", activationId)
	}

}


fun AWSSimpleSystemsManagementFunctions.deleteAssociation(init: AWSSimpleSystemsManagementDeleteAssociationCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.DeleteAssociationResult {
	return this.block.declare(AWSSimpleSystemsManagementDeleteAssociationCommand().apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.DeleteAssociationResult
}

@Generated
class AWSSimpleSystemsManagementDeleteAssociationCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DeleteAssociationRequest, com.amazonaws.services.simplesystemsmanagement.model.DeleteAssociationResult> {

	var name: String? = null
	var instanceId: String? = null
	var associationId: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DeleteAssociationRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DeleteAssociationRequest()
		input.setName(this.name)
		input.setInstanceId(this.instanceId)
		input.setAssociationId(this.associationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.DeleteAssociationResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.DeleteAssociationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.DeleteAssociationResult {
		return environment.ssm.deleteAssociation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm delete-association")
				.argument("name", name)
				.argument("instance-id", instanceId)
				.argument("association-id", associationId)
	}

}


fun AWSSimpleSystemsManagementFunctions.deleteDocument(name: String, init: AWSSimpleSystemsManagementDeleteDocumentCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.DeleteDocumentResult {
	return this.block.declare(AWSSimpleSystemsManagementDeleteDocumentCommand(name).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.DeleteDocumentResult
}

@Generated
class AWSSimpleSystemsManagementDeleteDocumentCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DeleteDocumentRequest, com.amazonaws.services.simplesystemsmanagement.model.DeleteDocumentResult> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DeleteDocumentRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DeleteDocumentRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.DeleteDocumentResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.DeleteDocumentResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.DeleteDocumentResult {
		return environment.ssm.deleteDocument(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm delete-document")
				.argument("name", name)
	}

}


fun AWSSimpleSystemsManagementFunctions.deleteMaintenanceWindow(windowId: String, init: AWSSimpleSystemsManagementDeleteMaintenanceWindowCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.DeleteMaintenanceWindowResult {
	return this.block.declare(AWSSimpleSystemsManagementDeleteMaintenanceWindowCommand(windowId).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.DeleteMaintenanceWindowResult
}

@Generated
class AWSSimpleSystemsManagementDeleteMaintenanceWindowCommand(val windowId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DeleteMaintenanceWindowRequest, com.amazonaws.services.simplesystemsmanagement.model.DeleteMaintenanceWindowResult> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DeleteMaintenanceWindowRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DeleteMaintenanceWindowRequest()
		input.setWindowId(this.windowId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.DeleteMaintenanceWindowResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.DeleteMaintenanceWindowResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.DeleteMaintenanceWindowResult {
		return environment.ssm.deleteMaintenanceWindow(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm delete-maintenance-window")
				.argument("window-id", windowId)
	}

}


fun AWSSimpleSystemsManagementFunctions.deleteParameter(name: String, init: AWSSimpleSystemsManagementDeleteParameterCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.DeleteParameterResult {
	return this.block.declare(AWSSimpleSystemsManagementDeleteParameterCommand(name).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.DeleteParameterResult
}

@Generated
class AWSSimpleSystemsManagementDeleteParameterCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DeleteParameterRequest, com.amazonaws.services.simplesystemsmanagement.model.DeleteParameterResult> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DeleteParameterRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DeleteParameterRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.DeleteParameterResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.DeleteParameterResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.DeleteParameterResult {
		return environment.ssm.deleteParameter(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm delete-parameter")
				.argument("name", name)
	}

}


fun AWSSimpleSystemsManagementFunctions.deleteParameters(names: List<String>, init: AWSSimpleSystemsManagementDeleteParametersCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.DeleteParametersResult {
	return this.block.declare(AWSSimpleSystemsManagementDeleteParametersCommand(names).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.DeleteParametersResult
}

@Generated
class AWSSimpleSystemsManagementDeleteParametersCommand(val names: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DeleteParametersRequest, com.amazonaws.services.simplesystemsmanagement.model.DeleteParametersResult> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DeleteParametersRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DeleteParametersRequest()
		input.setNames(this.names)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.DeleteParametersResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.DeleteParametersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.DeleteParametersResult {
		return environment.ssm.deleteParameters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm delete-parameters")
				.argument("names", names.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.deletePatchBaseline(baselineId: String, init: AWSSimpleSystemsManagementDeletePatchBaselineCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.DeletePatchBaselineResult {
	return this.block.declare(AWSSimpleSystemsManagementDeletePatchBaselineCommand(baselineId).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.DeletePatchBaselineResult
}

@Generated
class AWSSimpleSystemsManagementDeletePatchBaselineCommand(val baselineId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DeletePatchBaselineRequest, com.amazonaws.services.simplesystemsmanagement.model.DeletePatchBaselineResult> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DeletePatchBaselineRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DeletePatchBaselineRequest()
		input.setBaselineId(this.baselineId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.DeletePatchBaselineResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.DeletePatchBaselineResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.DeletePatchBaselineResult {
		return environment.ssm.deletePatchBaseline(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm delete-patch-baseline")
				.argument("baseline-id", baselineId)
	}

}


fun AWSSimpleSystemsManagementFunctions.deleteResourceDataSync(syncName: String, init: AWSSimpleSystemsManagementDeleteResourceDataSyncCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.DeleteResourceDataSyncResult {
	return this.block.declare(AWSSimpleSystemsManagementDeleteResourceDataSyncCommand(syncName).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.DeleteResourceDataSyncResult
}

@Generated
class AWSSimpleSystemsManagementDeleteResourceDataSyncCommand(val syncName: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DeleteResourceDataSyncRequest, com.amazonaws.services.simplesystemsmanagement.model.DeleteResourceDataSyncResult> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DeleteResourceDataSyncRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DeleteResourceDataSyncRequest()
		input.setSyncName(this.syncName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.DeleteResourceDataSyncResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.DeleteResourceDataSyncResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.DeleteResourceDataSyncResult {
		return environment.ssm.deleteResourceDataSync(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm delete-resource-data-sync")
				.argument("sync-name", syncName)
	}

}


fun AWSSimpleSystemsManagementFunctions.deregisterManagedInstance(instanceId: String, init: AWSSimpleSystemsManagementDeregisterManagedInstanceCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.DeregisterManagedInstanceResult {
	return this.block.declare(AWSSimpleSystemsManagementDeregisterManagedInstanceCommand(instanceId).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.DeregisterManagedInstanceResult
}

@Generated
class AWSSimpleSystemsManagementDeregisterManagedInstanceCommand(val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DeregisterManagedInstanceRequest, com.amazonaws.services.simplesystemsmanagement.model.DeregisterManagedInstanceResult> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DeregisterManagedInstanceRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DeregisterManagedInstanceRequest()
		input.setInstanceId(this.instanceId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.DeregisterManagedInstanceResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.DeregisterManagedInstanceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.DeregisterManagedInstanceResult {
		return environment.ssm.deregisterManagedInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm deregister-managed-instance")
				.argument("instance-id", instanceId)
	}

}


fun AWSSimpleSystemsManagementFunctions.deregisterPatchBaselineForPatchGroup(baselineId: String, patchGroup: String, init: AWSSimpleSystemsManagementDeregisterPatchBaselineForPatchGroupCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.DeregisterPatchBaselineForPatchGroupResult {
	return this.block.declare(AWSSimpleSystemsManagementDeregisterPatchBaselineForPatchGroupCommand(baselineId, patchGroup).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.DeregisterPatchBaselineForPatchGroupResult
}

@Generated
class AWSSimpleSystemsManagementDeregisterPatchBaselineForPatchGroupCommand(val baselineId: String, val patchGroup: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DeregisterPatchBaselineForPatchGroupRequest, com.amazonaws.services.simplesystemsmanagement.model.DeregisterPatchBaselineForPatchGroupResult> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DeregisterPatchBaselineForPatchGroupRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DeregisterPatchBaselineForPatchGroupRequest()
		input.setBaselineId(this.baselineId)
		input.setPatchGroup(this.patchGroup)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.DeregisterPatchBaselineForPatchGroupResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.DeregisterPatchBaselineForPatchGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.DeregisterPatchBaselineForPatchGroupResult {
		return environment.ssm.deregisterPatchBaselineForPatchGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm deregister-patch-baseline-for-patch-group")
				.argument("baseline-id", baselineId)
				.argument("patch-group", patchGroup)
	}

}


fun AWSSimpleSystemsManagementFunctions.deregisterTargetFromMaintenanceWindow(windowId: String, windowTargetId: String, init: AWSSimpleSystemsManagementDeregisterTargetFromMaintenanceWindowCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.DeregisterTargetFromMaintenanceWindowResult {
	return this.block.declare(AWSSimpleSystemsManagementDeregisterTargetFromMaintenanceWindowCommand(windowId, windowTargetId).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.DeregisterTargetFromMaintenanceWindowResult
}

@Generated
class AWSSimpleSystemsManagementDeregisterTargetFromMaintenanceWindowCommand(val windowId: String, val windowTargetId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DeregisterTargetFromMaintenanceWindowRequest, com.amazonaws.services.simplesystemsmanagement.model.DeregisterTargetFromMaintenanceWindowResult> {

	var safe: Boolean? = false

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DeregisterTargetFromMaintenanceWindowRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DeregisterTargetFromMaintenanceWindowRequest()
		input.setWindowId(this.windowId)
		input.setWindowTargetId(this.windowTargetId)
		input.setSafe(this.safe)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.DeregisterTargetFromMaintenanceWindowResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.DeregisterTargetFromMaintenanceWindowResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.DeregisterTargetFromMaintenanceWindowResult {
		return environment.ssm.deregisterTargetFromMaintenanceWindow(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm deregister-target-from-maintenance-window")
				.argument("window-id", windowId)
				.argument("window-target-id", windowTargetId)
				.option("safe", safe ?: false)
	}

}


fun AWSSimpleSystemsManagementFunctions.deregisterTaskFromMaintenanceWindow(windowId: String, windowTaskId: String, init: AWSSimpleSystemsManagementDeregisterTaskFromMaintenanceWindowCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.DeregisterTaskFromMaintenanceWindowResult {
	return this.block.declare(AWSSimpleSystemsManagementDeregisterTaskFromMaintenanceWindowCommand(windowId, windowTaskId).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.DeregisterTaskFromMaintenanceWindowResult
}

@Generated
class AWSSimpleSystemsManagementDeregisterTaskFromMaintenanceWindowCommand(val windowId: String, val windowTaskId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DeregisterTaskFromMaintenanceWindowRequest, com.amazonaws.services.simplesystemsmanagement.model.DeregisterTaskFromMaintenanceWindowResult> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DeregisterTaskFromMaintenanceWindowRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DeregisterTaskFromMaintenanceWindowRequest()
		input.setWindowId(this.windowId)
		input.setWindowTaskId(this.windowTaskId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.DeregisterTaskFromMaintenanceWindowResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.DeregisterTaskFromMaintenanceWindowResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.DeregisterTaskFromMaintenanceWindowResult {
		return environment.ssm.deregisterTaskFromMaintenanceWindow(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm deregister-task-from-maintenance-window")
				.argument("window-id", windowId)
				.argument("window-task-id", windowTaskId)
	}

}


fun AWSSimpleSystemsManagementFunctions.describeActivations(init: AWSSimpleSystemsManagementDescribeActivationsCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.DescribeActivationsResult {
	return this.block.declare(AWSSimpleSystemsManagementDescribeActivationsCommand().apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.DescribeActivationsResult
}

@Generated
class AWSSimpleSystemsManagementDescribeActivationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeActivationsRequest, com.amazonaws.services.simplesystemsmanagement.model.DescribeActivationsResult> {

	var filters: List<com.amazonaws.services.simplesystemsmanagement.model.DescribeActivationsFilter>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DescribeActivationsRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DescribeActivationsRequest()
		input.setFilters(this.filters)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.DescribeActivationsResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.DescribeActivationsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.DescribeActivationsResult {
		return environment.ssm.describeActivations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-activations")
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.describeAssociation(init: AWSSimpleSystemsManagementDescribeAssociationCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationResult {
	return this.block.declare(AWSSimpleSystemsManagementDescribeAssociationCommand().apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationResult
}

@Generated
class AWSSimpleSystemsManagementDescribeAssociationCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationRequest, com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationResult> {

	var name: String? = null
	var instanceId: String? = null
	var associationId: String? = null
	var associationVersion: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationRequest()
		input.setName(this.name)
		input.setInstanceId(this.instanceId)
		input.setAssociationId(this.associationId)
		input.setAssociationVersion(this.associationVersion)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationResult {
		return environment.ssm.describeAssociation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-association")
				.argument("name", name)
				.argument("instance-id", instanceId)
				.argument("association-id", associationId)
				.argument("association-version", associationVersion)
	}

}


fun AWSSimpleSystemsManagementFunctions.describeAutomationExecutions(init: AWSSimpleSystemsManagementDescribeAutomationExecutionsCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationExecutionsResult {
	return this.block.declare(AWSSimpleSystemsManagementDescribeAutomationExecutionsCommand().apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationExecutionsResult
}

@Generated
class AWSSimpleSystemsManagementDescribeAutomationExecutionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationExecutionsRequest, com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationExecutionsResult> {

	var filters: List<com.amazonaws.services.simplesystemsmanagement.model.AutomationExecutionFilter>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationExecutionsRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationExecutionsRequest()
		input.setFilters(this.filters)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationExecutionsResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationExecutionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationExecutionsResult {
		return environment.ssm.describeAutomationExecutions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-automation-executions")
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.describeAutomationStepExecutions(automationExecutionId: String, init: AWSSimpleSystemsManagementDescribeAutomationStepExecutionsCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationStepExecutionsResult {
	return this.block.declare(AWSSimpleSystemsManagementDescribeAutomationStepExecutionsCommand(automationExecutionId).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationStepExecutionsResult
}

@Generated
class AWSSimpleSystemsManagementDescribeAutomationStepExecutionsCommand(val automationExecutionId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationStepExecutionsRequest, com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationStepExecutionsResult> {

	var filters: List<com.amazonaws.services.simplesystemsmanagement.model.StepExecutionFilter>? = null
	var nextToken: String? = null
	var maxResults: Int? = 0
	var reverseOrder: Boolean? = false

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationStepExecutionsRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationStepExecutionsRequest()
		input.setAutomationExecutionId(this.automationExecutionId)
		input.setFilters(this.filters)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setReverseOrder(this.reverseOrder)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationStepExecutionsResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationStepExecutionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationStepExecutionsResult {
		return environment.ssm.describeAutomationStepExecutions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-automation-step-executions")
				.argument("automation-execution-id", automationExecutionId)
				.argument("filters", filters?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.option("reverse-order", reverseOrder ?: false)
	}

}


fun AWSSimpleSystemsManagementFunctions.describeAvailablePatches(init: AWSSimpleSystemsManagementDescribeAvailablePatchesCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.DescribeAvailablePatchesResult {
	return this.block.declare(AWSSimpleSystemsManagementDescribeAvailablePatchesCommand().apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.DescribeAvailablePatchesResult
}

@Generated
class AWSSimpleSystemsManagementDescribeAvailablePatchesCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeAvailablePatchesRequest, com.amazonaws.services.simplesystemsmanagement.model.DescribeAvailablePatchesResult> {

	var filters: List<com.amazonaws.services.simplesystemsmanagement.model.PatchOrchestratorFilter>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DescribeAvailablePatchesRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DescribeAvailablePatchesRequest()
		input.setFilters(this.filters)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.DescribeAvailablePatchesResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.DescribeAvailablePatchesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.DescribeAvailablePatchesResult {
		return environment.ssm.describeAvailablePatches(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-available-patches")
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.describeDocument(name: String, init: AWSSimpleSystemsManagementDescribeDocumentCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentResult {
	return this.block.declare(AWSSimpleSystemsManagementDescribeDocumentCommand(name).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentResult
}

@Generated
class AWSSimpleSystemsManagementDescribeDocumentCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentRequest, com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentResult> {

	var documentVersion: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentRequest()
		input.setName(this.name)
		input.setDocumentVersion(this.documentVersion)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentResult {
		return environment.ssm.describeDocument(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-document")
				.argument("name", name)
				.argument("document-version", documentVersion)
	}

}


fun AWSSimpleSystemsManagementFunctions.describeDocumentPermission(name: String, permissionType: DocumentPermissionType, init: AWSSimpleSystemsManagementDescribeDocumentPermissionCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentPermissionResult {
	return this.block.declare(AWSSimpleSystemsManagementDescribeDocumentPermissionCommand(name, permissionType).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentPermissionResult
}

@Generated
class AWSSimpleSystemsManagementDescribeDocumentPermissionCommand(val name: String, val permissionType: DocumentPermissionType) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentPermissionRequest, com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentPermissionResult> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentPermissionRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentPermissionRequest()
		input.setName(this.name)
		input.setPermissionType(this.permissionType.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentPermissionResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentPermissionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentPermissionResult {
		return environment.ssm.describeDocumentPermission(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-document-permission")
				.argument("name", name)
				.argument("permission-type", permissionType.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.describeEffectiveInstanceAssociations(instanceId: String, init: AWSSimpleSystemsManagementDescribeEffectiveInstanceAssociationsCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectiveInstanceAssociationsResult {
	return this.block.declare(AWSSimpleSystemsManagementDescribeEffectiveInstanceAssociationsCommand(instanceId).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectiveInstanceAssociationsResult
}

@Generated
class AWSSimpleSystemsManagementDescribeEffectiveInstanceAssociationsCommand(val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectiveInstanceAssociationsRequest, com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectiveInstanceAssociationsResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectiveInstanceAssociationsRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectiveInstanceAssociationsRequest()
		input.setInstanceId(this.instanceId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectiveInstanceAssociationsResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectiveInstanceAssociationsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectiveInstanceAssociationsResult {
		return environment.ssm.describeEffectiveInstanceAssociations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-effective-instance-associations")
				.argument("instance-id", instanceId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.describeEffectivePatchesForPatchBaseline(baselineId: String, init: AWSSimpleSystemsManagementDescribeEffectivePatchesForPatchBaselineCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectivePatchesForPatchBaselineResult {
	return this.block.declare(AWSSimpleSystemsManagementDescribeEffectivePatchesForPatchBaselineCommand(baselineId).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectivePatchesForPatchBaselineResult
}

@Generated
class AWSSimpleSystemsManagementDescribeEffectivePatchesForPatchBaselineCommand(val baselineId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectivePatchesForPatchBaselineRequest, com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectivePatchesForPatchBaselineResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectivePatchesForPatchBaselineRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectivePatchesForPatchBaselineRequest()
		input.setBaselineId(this.baselineId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectivePatchesForPatchBaselineResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectivePatchesForPatchBaselineResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectivePatchesForPatchBaselineResult {
		return environment.ssm.describeEffectivePatchesForPatchBaseline(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-effective-patches-for-patch-baseline")
				.argument("baseline-id", baselineId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.describeInstanceAssociationsStatus(instanceId: String, init: AWSSimpleSystemsManagementDescribeInstanceAssociationsStatusCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceAssociationsStatusResult {
	return this.block.declare(AWSSimpleSystemsManagementDescribeInstanceAssociationsStatusCommand(instanceId).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceAssociationsStatusResult
}

@Generated
class AWSSimpleSystemsManagementDescribeInstanceAssociationsStatusCommand(val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceAssociationsStatusRequest, com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceAssociationsStatusResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceAssociationsStatusRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceAssociationsStatusRequest()
		input.setInstanceId(this.instanceId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceAssociationsStatusResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceAssociationsStatusResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceAssociationsStatusResult {
		return environment.ssm.describeInstanceAssociationsStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-instance-associations-status")
				.argument("instance-id", instanceId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.describeInstanceInformation(init: AWSSimpleSystemsManagementDescribeInstanceInformationCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceInformationResult {
	return this.block.declare(AWSSimpleSystemsManagementDescribeInstanceInformationCommand().apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceInformationResult
}

@Generated
class AWSSimpleSystemsManagementDescribeInstanceInformationCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceInformationRequest, com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceInformationResult> {

	var instanceInformationFilterList: List<com.amazonaws.services.simplesystemsmanagement.model.InstanceInformationFilter>? = null
	var filters: List<com.amazonaws.services.simplesystemsmanagement.model.InstanceInformationStringFilter>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceInformationRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceInformationRequest()
		input.setInstanceInformationFilterList(this.instanceInformationFilterList)
		input.setFilters(this.filters)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceInformationResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceInformationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceInformationResult {
		return environment.ssm.describeInstanceInformation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-instance-information")
				.argument("instance-information-filter-list", instanceInformationFilterList?.toString())
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.describeInstancePatchStates(instanceIds: List<String>, init: AWSSimpleSystemsManagementDescribeInstancePatchStatesCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesResult {
	return this.block.declare(AWSSimpleSystemsManagementDescribeInstancePatchStatesCommand(instanceIds).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesResult
}

@Generated
class AWSSimpleSystemsManagementDescribeInstancePatchStatesCommand(val instanceIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesRequest, com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesRequest()
		input.setInstanceIds(this.instanceIds)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesResult {
		return environment.ssm.describeInstancePatchStates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-instance-patch-states")
				.argument("instance-ids", instanceIds.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.describeInstancePatchStatesForPatchGroup(patchGroup: String, init: AWSSimpleSystemsManagementDescribeInstancePatchStatesForPatchGroupCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesForPatchGroupResult {
	return this.block.declare(AWSSimpleSystemsManagementDescribeInstancePatchStatesForPatchGroupCommand(patchGroup).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesForPatchGroupResult
}

@Generated
class AWSSimpleSystemsManagementDescribeInstancePatchStatesForPatchGroupCommand(val patchGroup: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesForPatchGroupRequest, com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesForPatchGroupResult> {

	var filters: List<com.amazonaws.services.simplesystemsmanagement.model.InstancePatchStateFilter>? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesForPatchGroupRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesForPatchGroupRequest()
		input.setPatchGroup(this.patchGroup)
		input.setFilters(this.filters)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesForPatchGroupResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesForPatchGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesForPatchGroupResult {
		return environment.ssm.describeInstancePatchStatesForPatchGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-instance-patch-states-for-patch-group")
				.argument("patch-group", patchGroup)
				.argument("filters", filters?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.describeInstancePatches(instanceId: String, init: AWSSimpleSystemsManagementDescribeInstancePatchesCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchesResult {
	return this.block.declare(AWSSimpleSystemsManagementDescribeInstancePatchesCommand(instanceId).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchesResult
}

@Generated
class AWSSimpleSystemsManagementDescribeInstancePatchesCommand(val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchesRequest, com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchesResult> {

	var filters: List<com.amazonaws.services.simplesystemsmanagement.model.PatchOrchestratorFilter>? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchesRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchesRequest()
		input.setInstanceId(this.instanceId)
		input.setFilters(this.filters)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchesResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchesResult {
		return environment.ssm.describeInstancePatches(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-instance-patches")
				.argument("instance-id", instanceId)
				.argument("filters", filters?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.describeMaintenanceWindowExecutionTaskInvocations(windowExecutionId: String, taskId: String, init: AWSSimpleSystemsManagementDescribeMaintenanceWindowExecutionTaskInvocationsCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTaskInvocationsResult {
	return this.block.declare(AWSSimpleSystemsManagementDescribeMaintenanceWindowExecutionTaskInvocationsCommand(windowExecutionId, taskId).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTaskInvocationsResult
}

@Generated
class AWSSimpleSystemsManagementDescribeMaintenanceWindowExecutionTaskInvocationsCommand(val windowExecutionId: String, val taskId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTaskInvocationsRequest, com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTaskInvocationsResult> {

	var filters: List<com.amazonaws.services.simplesystemsmanagement.model.MaintenanceWindowFilter>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTaskInvocationsRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTaskInvocationsRequest()
		input.setWindowExecutionId(this.windowExecutionId)
		input.setTaskId(this.taskId)
		input.setFilters(this.filters)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTaskInvocationsResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTaskInvocationsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTaskInvocationsResult {
		return environment.ssm.describeMaintenanceWindowExecutionTaskInvocations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-maintenance-window-execution-task-invocations")
				.argument("window-execution-id", windowExecutionId)
				.argument("task-id", taskId)
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.describeMaintenanceWindowExecutionTasks(windowExecutionId: String, init: AWSSimpleSystemsManagementDescribeMaintenanceWindowExecutionTasksCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTasksResult {
	return this.block.declare(AWSSimpleSystemsManagementDescribeMaintenanceWindowExecutionTasksCommand(windowExecutionId).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTasksResult
}

@Generated
class AWSSimpleSystemsManagementDescribeMaintenanceWindowExecutionTasksCommand(val windowExecutionId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTasksRequest, com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTasksResult> {

	var filters: List<com.amazonaws.services.simplesystemsmanagement.model.MaintenanceWindowFilter>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTasksRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTasksRequest()
		input.setWindowExecutionId(this.windowExecutionId)
		input.setFilters(this.filters)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTasksResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTasksResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTasksResult {
		return environment.ssm.describeMaintenanceWindowExecutionTasks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-maintenance-window-execution-tasks")
				.argument("window-execution-id", windowExecutionId)
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.describeMaintenanceWindowExecutions(windowId: String, init: AWSSimpleSystemsManagementDescribeMaintenanceWindowExecutionsCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionsResult {
	return this.block.declare(AWSSimpleSystemsManagementDescribeMaintenanceWindowExecutionsCommand(windowId).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionsResult
}

@Generated
class AWSSimpleSystemsManagementDescribeMaintenanceWindowExecutionsCommand(val windowId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionsRequest, com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionsResult> {

	var filters: List<com.amazonaws.services.simplesystemsmanagement.model.MaintenanceWindowFilter>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionsRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionsRequest()
		input.setWindowId(this.windowId)
		input.setFilters(this.filters)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionsResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionsResult {
		return environment.ssm.describeMaintenanceWindowExecutions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-maintenance-window-executions")
				.argument("window-id", windowId)
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.describeMaintenanceWindowTargets(windowId: String, init: AWSSimpleSystemsManagementDescribeMaintenanceWindowTargetsCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTargetsResult {
	return this.block.declare(AWSSimpleSystemsManagementDescribeMaintenanceWindowTargetsCommand(windowId).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTargetsResult
}

@Generated
class AWSSimpleSystemsManagementDescribeMaintenanceWindowTargetsCommand(val windowId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTargetsRequest, com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTargetsResult> {

	var filters: List<com.amazonaws.services.simplesystemsmanagement.model.MaintenanceWindowFilter>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTargetsRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTargetsRequest()
		input.setWindowId(this.windowId)
		input.setFilters(this.filters)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTargetsResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTargetsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTargetsResult {
		return environment.ssm.describeMaintenanceWindowTargets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-maintenance-window-targets")
				.argument("window-id", windowId)
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.describeMaintenanceWindowTasks(windowId: String, init: AWSSimpleSystemsManagementDescribeMaintenanceWindowTasksCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTasksResult {
	return this.block.declare(AWSSimpleSystemsManagementDescribeMaintenanceWindowTasksCommand(windowId).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTasksResult
}

@Generated
class AWSSimpleSystemsManagementDescribeMaintenanceWindowTasksCommand(val windowId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTasksRequest, com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTasksResult> {

	var filters: List<com.amazonaws.services.simplesystemsmanagement.model.MaintenanceWindowFilter>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTasksRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTasksRequest()
		input.setWindowId(this.windowId)
		input.setFilters(this.filters)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTasksResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTasksResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTasksResult {
		return environment.ssm.describeMaintenanceWindowTasks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-maintenance-window-tasks")
				.argument("window-id", windowId)
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.describeMaintenanceWindows(init: AWSSimpleSystemsManagementDescribeMaintenanceWindowsCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsResult {
	return this.block.declare(AWSSimpleSystemsManagementDescribeMaintenanceWindowsCommand().apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsResult
}

@Generated
class AWSSimpleSystemsManagementDescribeMaintenanceWindowsCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsRequest, com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsResult> {

	var filters: List<com.amazonaws.services.simplesystemsmanagement.model.MaintenanceWindowFilter>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsRequest()
		input.setFilters(this.filters)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsResult {
		return environment.ssm.describeMaintenanceWindows(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-maintenance-windows")
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.describeParameters(init: AWSSimpleSystemsManagementDescribeParametersCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.DescribeParametersResult {
	return this.block.declare(AWSSimpleSystemsManagementDescribeParametersCommand().apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.DescribeParametersResult
}

@Generated
class AWSSimpleSystemsManagementDescribeParametersCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeParametersRequest, com.amazonaws.services.simplesystemsmanagement.model.DescribeParametersResult> {

	var filters: List<com.amazonaws.services.simplesystemsmanagement.model.ParametersFilter>? = null
	var parameterFilters: List<com.amazonaws.services.simplesystemsmanagement.model.ParameterStringFilter>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DescribeParametersRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DescribeParametersRequest()
		input.setFilters(this.filters)
		input.setParameterFilters(this.parameterFilters)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.DescribeParametersResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.DescribeParametersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.DescribeParametersResult {
		return environment.ssm.describeParameters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-parameters")
				.argument("filters", filters?.toString())
				.argument("parameter-filters", parameterFilters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.describePatchBaselines(init: AWSSimpleSystemsManagementDescribePatchBaselinesCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.DescribePatchBaselinesResult {
	return this.block.declare(AWSSimpleSystemsManagementDescribePatchBaselinesCommand().apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.DescribePatchBaselinesResult
}

@Generated
class AWSSimpleSystemsManagementDescribePatchBaselinesCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribePatchBaselinesRequest, com.amazonaws.services.simplesystemsmanagement.model.DescribePatchBaselinesResult> {

	var filters: List<com.amazonaws.services.simplesystemsmanagement.model.PatchOrchestratorFilter>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DescribePatchBaselinesRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DescribePatchBaselinesRequest()
		input.setFilters(this.filters)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.DescribePatchBaselinesResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.DescribePatchBaselinesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.DescribePatchBaselinesResult {
		return environment.ssm.describePatchBaselines(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-patch-baselines")
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.describePatchGroupState(patchGroup: String, init: AWSSimpleSystemsManagementDescribePatchGroupStateCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupStateResult {
	return this.block.declare(AWSSimpleSystemsManagementDescribePatchGroupStateCommand(patchGroup).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupStateResult
}

@Generated
class AWSSimpleSystemsManagementDescribePatchGroupStateCommand(val patchGroup: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupStateRequest, com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupStateResult> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupStateRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupStateRequest()
		input.setPatchGroup(this.patchGroup)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupStateResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupStateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupStateResult {
		return environment.ssm.describePatchGroupState(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-patch-group-state")
				.argument("patch-group", patchGroup)
	}

}


fun AWSSimpleSystemsManagementFunctions.describePatchGroups(init: AWSSimpleSystemsManagementDescribePatchGroupsCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupsResult {
	return this.block.declare(AWSSimpleSystemsManagementDescribePatchGroupsCommand().apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupsResult
}

@Generated
class AWSSimpleSystemsManagementDescribePatchGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupsRequest, com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupsResult> {

	var maxResults: Int? = 0
	var filters: List<com.amazonaws.services.simplesystemsmanagement.model.PatchOrchestratorFilter>? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupsRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupsRequest()
		input.setMaxResults(this.maxResults)
		input.setFilters(this.filters)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupsResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupsResult {
		return environment.ssm.describePatchGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-patch-groups")
				.argument("max-results", maxResults?.toString())
				.argument("filters", filters?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.getAutomationExecution(automationExecutionId: String, init: AWSSimpleSystemsManagementGetAutomationExecutionCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.GetAutomationExecutionResult {
	return this.block.declare(AWSSimpleSystemsManagementGetAutomationExecutionCommand(automationExecutionId).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.GetAutomationExecutionResult
}

@Generated
class AWSSimpleSystemsManagementGetAutomationExecutionCommand(val automationExecutionId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.GetAutomationExecutionRequest, com.amazonaws.services.simplesystemsmanagement.model.GetAutomationExecutionResult> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.GetAutomationExecutionRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.GetAutomationExecutionRequest()
		input.setAutomationExecutionId(this.automationExecutionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.GetAutomationExecutionResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.GetAutomationExecutionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.GetAutomationExecutionResult {
		return environment.ssm.getAutomationExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm get-automation-execution")
				.argument("automation-execution-id", automationExecutionId)
	}

}


fun AWSSimpleSystemsManagementFunctions.getCommandInvocation(commandId: String, instanceId: String, init: AWSSimpleSystemsManagementGetCommandInvocationCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.GetCommandInvocationResult {
	return this.block.declare(AWSSimpleSystemsManagementGetCommandInvocationCommand(commandId, instanceId).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.GetCommandInvocationResult
}

@Generated
class AWSSimpleSystemsManagementGetCommandInvocationCommand(val commandId: String, val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.GetCommandInvocationRequest, com.amazonaws.services.simplesystemsmanagement.model.GetCommandInvocationResult> {

	var pluginName: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.GetCommandInvocationRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.GetCommandInvocationRequest()
		input.setCommandId(this.commandId)
		input.setInstanceId(this.instanceId)
		input.setPluginName(this.pluginName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.GetCommandInvocationResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.GetCommandInvocationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.GetCommandInvocationResult {
		return environment.ssm.getCommandInvocation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm get-command-invocation")
				.argument("command-id", commandId)
				.argument("instance-id", instanceId)
				.argument("plugin-name", pluginName)
	}

}


fun AWSSimpleSystemsManagementFunctions.getDefaultPatchBaseline(init: AWSSimpleSystemsManagementGetDefaultPatchBaselineCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.GetDefaultPatchBaselineResult {
	return this.block.declare(AWSSimpleSystemsManagementGetDefaultPatchBaselineCommand().apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.GetDefaultPatchBaselineResult
}

@Generated
class AWSSimpleSystemsManagementGetDefaultPatchBaselineCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.GetDefaultPatchBaselineRequest, com.amazonaws.services.simplesystemsmanagement.model.GetDefaultPatchBaselineResult> {

	var operatingSystem: OperatingSystem? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.GetDefaultPatchBaselineRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.GetDefaultPatchBaselineRequest()
		input.setOperatingSystem(this.operatingSystem?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.GetDefaultPatchBaselineResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.GetDefaultPatchBaselineResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.GetDefaultPatchBaselineResult {
		return environment.ssm.getDefaultPatchBaseline(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm get-default-patch-baseline")
				.argument("operating-system", operatingSystem?.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.getDeployablePatchSnapshotForInstance(instanceId: String, snapshotId: String, init: AWSSimpleSystemsManagementGetDeployablePatchSnapshotForInstanceCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.GetDeployablePatchSnapshotForInstanceResult {
	return this.block.declare(AWSSimpleSystemsManagementGetDeployablePatchSnapshotForInstanceCommand(instanceId, snapshotId).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.GetDeployablePatchSnapshotForInstanceResult
}

@Generated
class AWSSimpleSystemsManagementGetDeployablePatchSnapshotForInstanceCommand(val instanceId: String, val snapshotId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.GetDeployablePatchSnapshotForInstanceRequest, com.amazonaws.services.simplesystemsmanagement.model.GetDeployablePatchSnapshotForInstanceResult> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.GetDeployablePatchSnapshotForInstanceRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.GetDeployablePatchSnapshotForInstanceRequest()
		input.setInstanceId(this.instanceId)
		input.setSnapshotId(this.snapshotId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.GetDeployablePatchSnapshotForInstanceResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.GetDeployablePatchSnapshotForInstanceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.GetDeployablePatchSnapshotForInstanceResult {
		return environment.ssm.getDeployablePatchSnapshotForInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm get-deployable-patch-snapshot-for-instance")
				.argument("instance-id", instanceId)
				.argument("snapshot-id", snapshotId)
	}

}


fun AWSSimpleSystemsManagementFunctions.getDocument(name: String, init: AWSSimpleSystemsManagementGetDocumentCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.GetDocumentResult {
	return this.block.declare(AWSSimpleSystemsManagementGetDocumentCommand(name).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.GetDocumentResult
}

@Generated
class AWSSimpleSystemsManagementGetDocumentCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.GetDocumentRequest, com.amazonaws.services.simplesystemsmanagement.model.GetDocumentResult> {

	var documentVersion: String? = null
	var documentFormat: DocumentFormat? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.GetDocumentRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.GetDocumentRequest()
		input.setName(this.name)
		input.setDocumentVersion(this.documentVersion)
		input.setDocumentFormat(this.documentFormat?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.GetDocumentResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.GetDocumentResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.GetDocumentResult {
		return environment.ssm.getDocument(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm get-document")
				.argument("name", name)
				.argument("document-version", documentVersion)
				.argument("document-format", documentFormat?.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.getInventory(init: AWSSimpleSystemsManagementGetInventoryCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.GetInventoryResult {
	return this.block.declare(AWSSimpleSystemsManagementGetInventoryCommand().apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.GetInventoryResult
}

@Generated
class AWSSimpleSystemsManagementGetInventoryCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.GetInventoryRequest, com.amazonaws.services.simplesystemsmanagement.model.GetInventoryResult> {

	var filters: List<com.amazonaws.services.simplesystemsmanagement.model.InventoryFilter>? = null
	var aggregators: List<com.amazonaws.services.simplesystemsmanagement.model.InventoryAggregator>? = null
	var resultAttributes: List<com.amazonaws.services.simplesystemsmanagement.model.ResultAttribute>? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.GetInventoryRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.GetInventoryRequest()
		input.setFilters(this.filters)
		input.setAggregators(this.aggregators)
		input.setResultAttributes(this.resultAttributes)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.GetInventoryResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.GetInventoryResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.GetInventoryResult {
		return environment.ssm.getInventory(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm get-inventory")
				.argument("filters", filters?.toString())
				.argument("aggregators", aggregators?.toString())
				.argument("result-attributes", resultAttributes?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.getInventorySchema(init: AWSSimpleSystemsManagementGetInventorySchemaCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.GetInventorySchemaResult {
	return this.block.declare(AWSSimpleSystemsManagementGetInventorySchemaCommand().apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.GetInventorySchemaResult
}

@Generated
class AWSSimpleSystemsManagementGetInventorySchemaCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.GetInventorySchemaRequest, com.amazonaws.services.simplesystemsmanagement.model.GetInventorySchemaResult> {

	var typeName: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0
	var aggregator: Boolean? = false
	var subType: Boolean? = false

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.GetInventorySchemaRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.GetInventorySchemaRequest()
		input.setTypeName(this.typeName)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setAggregator(this.aggregator)
		input.setSubType(this.subType)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.GetInventorySchemaResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.GetInventorySchemaResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.GetInventorySchemaResult {
		return environment.ssm.getInventorySchema(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm get-inventory-schema")
				.argument("type-name", typeName)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.option("aggregator", aggregator ?: false)
				.option("sub-type", subType ?: false)
	}

}


fun AWSSimpleSystemsManagementFunctions.getMaintenanceWindow(windowId: String, init: AWSSimpleSystemsManagementGetMaintenanceWindowCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowResult {
	return this.block.declare(AWSSimpleSystemsManagementGetMaintenanceWindowCommand(windowId).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowResult
}

@Generated
class AWSSimpleSystemsManagementGetMaintenanceWindowCommand(val windowId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowRequest, com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowResult> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowRequest()
		input.setWindowId(this.windowId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowResult {
		return environment.ssm.getMaintenanceWindow(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm get-maintenance-window")
				.argument("window-id", windowId)
	}

}


fun AWSSimpleSystemsManagementFunctions.getMaintenanceWindowExecution(windowExecutionId: String, init: AWSSimpleSystemsManagementGetMaintenanceWindowExecutionCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionResult {
	return this.block.declare(AWSSimpleSystemsManagementGetMaintenanceWindowExecutionCommand(windowExecutionId).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionResult
}

@Generated
class AWSSimpleSystemsManagementGetMaintenanceWindowExecutionCommand(val windowExecutionId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionRequest, com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionResult> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionRequest()
		input.setWindowExecutionId(this.windowExecutionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionResult {
		return environment.ssm.getMaintenanceWindowExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm get-maintenance-window-execution")
				.argument("window-execution-id", windowExecutionId)
	}

}


fun AWSSimpleSystemsManagementFunctions.getMaintenanceWindowExecutionTask(windowExecutionId: String, taskId: String, init: AWSSimpleSystemsManagementGetMaintenanceWindowExecutionTaskCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskResult {
	return this.block.declare(AWSSimpleSystemsManagementGetMaintenanceWindowExecutionTaskCommand(windowExecutionId, taskId).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskResult
}

@Generated
class AWSSimpleSystemsManagementGetMaintenanceWindowExecutionTaskCommand(val windowExecutionId: String, val taskId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskRequest, com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskResult> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskRequest()
		input.setWindowExecutionId(this.windowExecutionId)
		input.setTaskId(this.taskId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskResult {
		return environment.ssm.getMaintenanceWindowExecutionTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm get-maintenance-window-execution-task")
				.argument("window-execution-id", windowExecutionId)
				.argument("task-id", taskId)
	}

}


fun AWSSimpleSystemsManagementFunctions.getMaintenanceWindowExecutionTaskInvocation(windowExecutionId: String, taskId: String, invocationId: String, init: AWSSimpleSystemsManagementGetMaintenanceWindowExecutionTaskInvocationCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskInvocationResult {
	return this.block.declare(AWSSimpleSystemsManagementGetMaintenanceWindowExecutionTaskInvocationCommand(windowExecutionId, taskId, invocationId).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskInvocationResult
}

@Generated
class AWSSimpleSystemsManagementGetMaintenanceWindowExecutionTaskInvocationCommand(val windowExecutionId: String, val taskId: String, val invocationId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskInvocationRequest, com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskInvocationResult> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskInvocationRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskInvocationRequest()
		input.setWindowExecutionId(this.windowExecutionId)
		input.setTaskId(this.taskId)
		input.setInvocationId(this.invocationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskInvocationResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskInvocationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskInvocationResult {
		return environment.ssm.getMaintenanceWindowExecutionTaskInvocation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm get-maintenance-window-execution-task-invocation")
				.argument("window-execution-id", windowExecutionId)
				.argument("task-id", taskId)
				.argument("invocation-id", invocationId)
	}

}


fun AWSSimpleSystemsManagementFunctions.getMaintenanceWindowTask(windowId: String, windowTaskId: String, init: AWSSimpleSystemsManagementGetMaintenanceWindowTaskCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowTaskResult {
	return this.block.declare(AWSSimpleSystemsManagementGetMaintenanceWindowTaskCommand(windowId, windowTaskId).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowTaskResult
}

@Generated
class AWSSimpleSystemsManagementGetMaintenanceWindowTaskCommand(val windowId: String, val windowTaskId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowTaskRequest, com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowTaskResult> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowTaskRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowTaskRequest()
		input.setWindowId(this.windowId)
		input.setWindowTaskId(this.windowTaskId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowTaskResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowTaskResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowTaskResult {
		return environment.ssm.getMaintenanceWindowTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm get-maintenance-window-task")
				.argument("window-id", windowId)
				.argument("window-task-id", windowTaskId)
	}

}


fun AWSSimpleSystemsManagementFunctions.getParameter(name: String, init: AWSSimpleSystemsManagementGetParameterCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.GetParameterResult {
	return this.block.declare(AWSSimpleSystemsManagementGetParameterCommand(name).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.GetParameterResult
}

@Generated
class AWSSimpleSystemsManagementGetParameterCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.GetParameterRequest, com.amazonaws.services.simplesystemsmanagement.model.GetParameterResult> {

	var withDecryption: Boolean? = false

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.GetParameterRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.GetParameterRequest()
		input.setName(this.name)
		input.setWithDecryption(this.withDecryption)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.GetParameterResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.GetParameterResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.GetParameterResult {
		return environment.ssm.getParameter(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm get-parameter")
				.argument("name", name)
				.option("with-decryption", withDecryption ?: false)
	}

}


fun AWSSimpleSystemsManagementFunctions.getParameterHistory(name: String, init: AWSSimpleSystemsManagementGetParameterHistoryCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.GetParameterHistoryResult {
	return this.block.declare(AWSSimpleSystemsManagementGetParameterHistoryCommand(name).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.GetParameterHistoryResult
}

@Generated
class AWSSimpleSystemsManagementGetParameterHistoryCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.GetParameterHistoryRequest, com.amazonaws.services.simplesystemsmanagement.model.GetParameterHistoryResult> {

	var withDecryption: Boolean? = false
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.GetParameterHistoryRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.GetParameterHistoryRequest()
		input.setName(this.name)
		input.setWithDecryption(this.withDecryption)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.GetParameterHistoryResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.GetParameterHistoryResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.GetParameterHistoryResult {
		return environment.ssm.getParameterHistory(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm get-parameter-history")
				.argument("name", name)
				.option("with-decryption", withDecryption ?: false)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.getParameters(names: List<String>, init: AWSSimpleSystemsManagementGetParametersCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.GetParametersResult {
	return this.block.declare(AWSSimpleSystemsManagementGetParametersCommand(names).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.GetParametersResult
}

@Generated
class AWSSimpleSystemsManagementGetParametersCommand(val names: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.GetParametersRequest, com.amazonaws.services.simplesystemsmanagement.model.GetParametersResult> {

	var withDecryption: Boolean? = false

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.GetParametersRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.GetParametersRequest()
		input.setNames(this.names)
		input.setWithDecryption(this.withDecryption)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.GetParametersResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.GetParametersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.GetParametersResult {
		return environment.ssm.getParameters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm get-parameters")
				.argument("names", names.toString())
				.option("with-decryption", withDecryption ?: false)
	}

}


fun AWSSimpleSystemsManagementFunctions.getParametersByPath(path: String, init: AWSSimpleSystemsManagementGetParametersByPathCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.GetParametersByPathResult {
	return this.block.declare(AWSSimpleSystemsManagementGetParametersByPathCommand(path).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.GetParametersByPathResult
}

@Generated
class AWSSimpleSystemsManagementGetParametersByPathCommand(val path: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.GetParametersByPathRequest, com.amazonaws.services.simplesystemsmanagement.model.GetParametersByPathResult> {

	var recursive: Boolean? = false
	var parameterFilters: List<com.amazonaws.services.simplesystemsmanagement.model.ParameterStringFilter>? = null
	var withDecryption: Boolean? = false
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.GetParametersByPathRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.GetParametersByPathRequest()
		input.setPath(this.path)
		input.setRecursive(this.recursive)
		input.setParameterFilters(this.parameterFilters)
		input.setWithDecryption(this.withDecryption)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.GetParametersByPathResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.GetParametersByPathResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.GetParametersByPathResult {
		return environment.ssm.getParametersByPath(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm get-parameters-by-path")
				.argument("path", path)
				.option("recursive", recursive ?: false)
				.argument("parameter-filters", parameterFilters?.toString())
				.option("with-decryption", withDecryption ?: false)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.getPatchBaseline(baselineId: String, init: AWSSimpleSystemsManagementGetPatchBaselineCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineResult {
	return this.block.declare(AWSSimpleSystemsManagementGetPatchBaselineCommand(baselineId).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineResult
}

@Generated
class AWSSimpleSystemsManagementGetPatchBaselineCommand(val baselineId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineRequest, com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineResult> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineRequest()
		input.setBaselineId(this.baselineId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineResult {
		return environment.ssm.getPatchBaseline(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm get-patch-baseline")
				.argument("baseline-id", baselineId)
	}

}


fun AWSSimpleSystemsManagementFunctions.getPatchBaselineForPatchGroup(patchGroup: String, init: AWSSimpleSystemsManagementGetPatchBaselineForPatchGroupCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineForPatchGroupResult {
	return this.block.declare(AWSSimpleSystemsManagementGetPatchBaselineForPatchGroupCommand(patchGroup).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineForPatchGroupResult
}

@Generated
class AWSSimpleSystemsManagementGetPatchBaselineForPatchGroupCommand(val patchGroup: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineForPatchGroupRequest, com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineForPatchGroupResult> {

	var operatingSystem: OperatingSystem? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineForPatchGroupRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineForPatchGroupRequest()
		input.setPatchGroup(this.patchGroup)
		input.setOperatingSystem(this.operatingSystem?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineForPatchGroupResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineForPatchGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineForPatchGroupResult {
		return environment.ssm.getPatchBaselineForPatchGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm get-patch-baseline-for-patch-group")
				.argument("patch-group", patchGroup)
				.argument("operating-system", operatingSystem?.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.listAssociationVersions(associationId: String, init: AWSSimpleSystemsManagementListAssociationVersionsCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.ListAssociationVersionsResult {
	return this.block.declare(AWSSimpleSystemsManagementListAssociationVersionsCommand(associationId).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.ListAssociationVersionsResult
}

@Generated
class AWSSimpleSystemsManagementListAssociationVersionsCommand(val associationId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.ListAssociationVersionsRequest, com.amazonaws.services.simplesystemsmanagement.model.ListAssociationVersionsResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.ListAssociationVersionsRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.ListAssociationVersionsRequest()
		input.setAssociationId(this.associationId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.ListAssociationVersionsResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.ListAssociationVersionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.ListAssociationVersionsResult {
		return environment.ssm.listAssociationVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm list-association-versions")
				.argument("association-id", associationId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.listAssociations(init: AWSSimpleSystemsManagementListAssociationsCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.ListAssociationsResult {
	return this.block.declare(AWSSimpleSystemsManagementListAssociationsCommand().apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.ListAssociationsResult
}

@Generated
class AWSSimpleSystemsManagementListAssociationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.ListAssociationsRequest, com.amazonaws.services.simplesystemsmanagement.model.ListAssociationsResult> {

	var associationFilterList: List<com.amazonaws.services.simplesystemsmanagement.model.AssociationFilter>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.ListAssociationsRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.ListAssociationsRequest()
		input.setAssociationFilterList(this.associationFilterList)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.ListAssociationsResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.ListAssociationsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.ListAssociationsResult {
		return environment.ssm.listAssociations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm list-associations")
				.argument("association-filter-list", associationFilterList?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.listCommandInvocations(init: AWSSimpleSystemsManagementListCommandInvocationsCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.ListCommandInvocationsResult {
	return this.block.declare(AWSSimpleSystemsManagementListCommandInvocationsCommand().apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.ListCommandInvocationsResult
}

@Generated
class AWSSimpleSystemsManagementListCommandInvocationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.ListCommandInvocationsRequest, com.amazonaws.services.simplesystemsmanagement.model.ListCommandInvocationsResult> {

	var commandId: String? = null
	var instanceId: String? = null
	var maxResults: Int? = 0
	var nextToken: String? = null
	var filters: List<com.amazonaws.services.simplesystemsmanagement.model.CommandFilter>? = null
	var details: Boolean? = false

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.ListCommandInvocationsRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.ListCommandInvocationsRequest()
		input.setCommandId(this.commandId)
		input.setInstanceId(this.instanceId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		input.setFilters(this.filters)
		input.setDetails(this.details)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.ListCommandInvocationsResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.ListCommandInvocationsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.ListCommandInvocationsResult {
		return environment.ssm.listCommandInvocations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm list-command-invocations")
				.argument("command-id", commandId)
				.argument("instance-id", instanceId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.argument("filters", filters?.toString())
				.option("details", details ?: false)
	}

}


fun AWSSimpleSystemsManagementFunctions.listCommands(init: AWSSimpleSystemsManagementListCommandsCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.ListCommandsResult {
	return this.block.declare(AWSSimpleSystemsManagementListCommandsCommand().apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.ListCommandsResult
}

@Generated
class AWSSimpleSystemsManagementListCommandsCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.ListCommandsRequest, com.amazonaws.services.simplesystemsmanagement.model.ListCommandsResult> {

	var commandId: String? = null
	var instanceId: String? = null
	var maxResults: Int? = 0
	var nextToken: String? = null
	var filters: List<com.amazonaws.services.simplesystemsmanagement.model.CommandFilter>? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.ListCommandsRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.ListCommandsRequest()
		input.setCommandId(this.commandId)
		input.setInstanceId(this.instanceId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		input.setFilters(this.filters)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.ListCommandsResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.ListCommandsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.ListCommandsResult {
		return environment.ssm.listCommands(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm list-commands")
				.argument("command-id", commandId)
				.argument("instance-id", instanceId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.argument("filters", filters?.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.listComplianceItems(init: AWSSimpleSystemsManagementListComplianceItemsCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.ListComplianceItemsResult {
	return this.block.declare(AWSSimpleSystemsManagementListComplianceItemsCommand().apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.ListComplianceItemsResult
}

@Generated
class AWSSimpleSystemsManagementListComplianceItemsCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.ListComplianceItemsRequest, com.amazonaws.services.simplesystemsmanagement.model.ListComplianceItemsResult> {

	var filters: List<com.amazonaws.services.simplesystemsmanagement.model.ComplianceStringFilter>? = null
	var resourceIds: List<String>? = null
	var resourceTypes: List<String>? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.ListComplianceItemsRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.ListComplianceItemsRequest()
		input.setFilters(this.filters)
		input.setResourceIds(this.resourceIds)
		input.setResourceTypes(this.resourceTypes)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.ListComplianceItemsResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.ListComplianceItemsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.ListComplianceItemsResult {
		return environment.ssm.listComplianceItems(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm list-compliance-items")
				.argument("filters", filters?.toString())
				.argument("resource-ids", resourceIds?.toString())
				.argument("resource-types", resourceTypes?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.listComplianceSummaries(init: AWSSimpleSystemsManagementListComplianceSummariesCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.ListComplianceSummariesResult {
	return this.block.declare(AWSSimpleSystemsManagementListComplianceSummariesCommand().apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.ListComplianceSummariesResult
}

@Generated
class AWSSimpleSystemsManagementListComplianceSummariesCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.ListComplianceSummariesRequest, com.amazonaws.services.simplesystemsmanagement.model.ListComplianceSummariesResult> {

	var filters: List<com.amazonaws.services.simplesystemsmanagement.model.ComplianceStringFilter>? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.ListComplianceSummariesRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.ListComplianceSummariesRequest()
		input.setFilters(this.filters)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.ListComplianceSummariesResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.ListComplianceSummariesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.ListComplianceSummariesResult {
		return environment.ssm.listComplianceSummaries(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm list-compliance-summaries")
				.argument("filters", filters?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.listDocumentVersions(name: String, init: AWSSimpleSystemsManagementListDocumentVersionsCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.ListDocumentVersionsResult {
	return this.block.declare(AWSSimpleSystemsManagementListDocumentVersionsCommand(name).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.ListDocumentVersionsResult
}

@Generated
class AWSSimpleSystemsManagementListDocumentVersionsCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.ListDocumentVersionsRequest, com.amazonaws.services.simplesystemsmanagement.model.ListDocumentVersionsResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.ListDocumentVersionsRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.ListDocumentVersionsRequest()
		input.setName(this.name)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.ListDocumentVersionsResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.ListDocumentVersionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.ListDocumentVersionsResult {
		return environment.ssm.listDocumentVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm list-document-versions")
				.argument("name", name)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.listDocuments(init: AWSSimpleSystemsManagementListDocumentsCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.ListDocumentsResult {
	return this.block.declare(AWSSimpleSystemsManagementListDocumentsCommand().apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.ListDocumentsResult
}

@Generated
class AWSSimpleSystemsManagementListDocumentsCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.ListDocumentsRequest, com.amazonaws.services.simplesystemsmanagement.model.ListDocumentsResult> {

	var documentFilterList: List<com.amazonaws.services.simplesystemsmanagement.model.DocumentFilter>? = null
	var filters: List<com.amazonaws.services.simplesystemsmanagement.model.DocumentKeyValuesFilter>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.ListDocumentsRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.ListDocumentsRequest()
		input.setDocumentFilterList(this.documentFilterList)
		input.setFilters(this.filters)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.ListDocumentsResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.ListDocumentsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.ListDocumentsResult {
		return environment.ssm.listDocuments(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm list-documents")
				.argument("document-filter-list", documentFilterList?.toString())
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.listInventoryEntries(instanceId: String, typeName: String, init: AWSSimpleSystemsManagementListInventoryEntriesCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.ListInventoryEntriesResult {
	return this.block.declare(AWSSimpleSystemsManagementListInventoryEntriesCommand(instanceId, typeName).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.ListInventoryEntriesResult
}

@Generated
class AWSSimpleSystemsManagementListInventoryEntriesCommand(val instanceId: String, val typeName: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.ListInventoryEntriesRequest, com.amazonaws.services.simplesystemsmanagement.model.ListInventoryEntriesResult> {

	var filters: List<com.amazonaws.services.simplesystemsmanagement.model.InventoryFilter>? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.ListInventoryEntriesRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.ListInventoryEntriesRequest()
		input.setInstanceId(this.instanceId)
		input.setTypeName(this.typeName)
		input.setFilters(this.filters)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.ListInventoryEntriesResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.ListInventoryEntriesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.ListInventoryEntriesResult {
		return environment.ssm.listInventoryEntries(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm list-inventory-entries")
				.argument("instance-id", instanceId)
				.argument("type-name", typeName)
				.argument("filters", filters?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.listResourceComplianceSummaries(init: AWSSimpleSystemsManagementListResourceComplianceSummariesCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.ListResourceComplianceSummariesResult {
	return this.block.declare(AWSSimpleSystemsManagementListResourceComplianceSummariesCommand().apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.ListResourceComplianceSummariesResult
}

@Generated
class AWSSimpleSystemsManagementListResourceComplianceSummariesCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.ListResourceComplianceSummariesRequest, com.amazonaws.services.simplesystemsmanagement.model.ListResourceComplianceSummariesResult> {

	var filters: List<com.amazonaws.services.simplesystemsmanagement.model.ComplianceStringFilter>? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.ListResourceComplianceSummariesRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.ListResourceComplianceSummariesRequest()
		input.setFilters(this.filters)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.ListResourceComplianceSummariesResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.ListResourceComplianceSummariesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.ListResourceComplianceSummariesResult {
		return environment.ssm.listResourceComplianceSummaries(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm list-resource-compliance-summaries")
				.argument("filters", filters?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.listResourceDataSync(init: AWSSimpleSystemsManagementListResourceDataSyncCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.ListResourceDataSyncResult {
	return this.block.declare(AWSSimpleSystemsManagementListResourceDataSyncCommand().apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.ListResourceDataSyncResult
}

@Generated
class AWSSimpleSystemsManagementListResourceDataSyncCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.ListResourceDataSyncRequest, com.amazonaws.services.simplesystemsmanagement.model.ListResourceDataSyncResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.ListResourceDataSyncRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.ListResourceDataSyncRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.ListResourceDataSyncResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.ListResourceDataSyncResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.ListResourceDataSyncResult {
		return environment.ssm.listResourceDataSync(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm list-resource-data-sync")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.listTagsForResource(resourceType: ResourceTypeForTagging, resourceId: String, init: AWSSimpleSystemsManagementListTagsForResourceCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.ListTagsForResourceResult {
	return this.block.declare(AWSSimpleSystemsManagementListTagsForResourceCommand(resourceType, resourceId).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.ListTagsForResourceResult
}

@Generated
class AWSSimpleSystemsManagementListTagsForResourceCommand(val resourceType: ResourceTypeForTagging, val resourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.ListTagsForResourceRequest, com.amazonaws.services.simplesystemsmanagement.model.ListTagsForResourceResult> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.ListTagsForResourceRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.ListTagsForResourceRequest()
		input.setResourceType(this.resourceType.toString())
		input.setResourceId(this.resourceId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.ListTagsForResourceResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.ListTagsForResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.ListTagsForResourceResult {
		return environment.ssm.listTagsForResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm list-tags-for-resource")
				.argument("resource-type", resourceType.toString())
				.argument("resource-id", resourceId)
	}

}


fun AWSSimpleSystemsManagementFunctions.modifyDocumentPermission(name: String, permissionType: DocumentPermissionType, init: AWSSimpleSystemsManagementModifyDocumentPermissionCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.ModifyDocumentPermissionResult {
	return this.block.declare(AWSSimpleSystemsManagementModifyDocumentPermissionCommand(name, permissionType).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.ModifyDocumentPermissionResult
}

@Generated
class AWSSimpleSystemsManagementModifyDocumentPermissionCommand(val name: String, val permissionType: DocumentPermissionType) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.ModifyDocumentPermissionRequest, com.amazonaws.services.simplesystemsmanagement.model.ModifyDocumentPermissionResult> {

	var accountIdsToAdd: List<String>? = null
	var accountIdsToRemove: List<String>? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.ModifyDocumentPermissionRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.ModifyDocumentPermissionRequest()
		input.setName(this.name)
		input.setPermissionType(this.permissionType.toString())
		input.setAccountIdsToAdd(this.accountIdsToAdd)
		input.setAccountIdsToRemove(this.accountIdsToRemove)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.ModifyDocumentPermissionResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.ModifyDocumentPermissionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.ModifyDocumentPermissionResult {
		return environment.ssm.modifyDocumentPermission(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm modify-document-permission")
				.argument("name", name)
				.argument("permission-type", permissionType.toString())
				.argument("account-ids-to-add", accountIdsToAdd?.toString())
				.argument("account-ids-to-remove", accountIdsToRemove?.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.putComplianceItems(resourceId: String, resourceType: String, complianceType: String, executionSummary: com.amazonaws.services.simplesystemsmanagement.model.ComplianceExecutionSummary, items: List<com.amazonaws.services.simplesystemsmanagement.model.ComplianceItemEntry>, init: AWSSimpleSystemsManagementPutComplianceItemsCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.PutComplianceItemsResult {
	return this.block.declare(AWSSimpleSystemsManagementPutComplianceItemsCommand(resourceId, resourceType, complianceType, executionSummary, items).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.PutComplianceItemsResult
}

@Generated
class AWSSimpleSystemsManagementPutComplianceItemsCommand(val resourceId: String, val resourceType: String, val complianceType: String, val executionSummary: com.amazonaws.services.simplesystemsmanagement.model.ComplianceExecutionSummary, val items: List<com.amazonaws.services.simplesystemsmanagement.model.ComplianceItemEntry>) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.PutComplianceItemsRequest, com.amazonaws.services.simplesystemsmanagement.model.PutComplianceItemsResult> {

	var itemContentHash: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.PutComplianceItemsRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.PutComplianceItemsRequest()
		input.setResourceId(this.resourceId)
		input.setResourceType(this.resourceType)
		input.setComplianceType(this.complianceType)
		input.setExecutionSummary(this.executionSummary)
		input.setItems(this.items)
		input.setItemContentHash(this.itemContentHash)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.PutComplianceItemsResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.PutComplianceItemsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.PutComplianceItemsResult {
		return environment.ssm.putComplianceItems(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm put-compliance-items")
				.argument("resource-id", resourceId)
				.argument("resource-type", resourceType)
				.argument("compliance-type", complianceType)
				.argument("execution-summary", executionSummary.toString())
				.argument("items", items.toString())
				.argument("item-content-hash", itemContentHash)
	}

}


fun AWSSimpleSystemsManagementFunctions.putInventory(instanceId: String, items: List<com.amazonaws.services.simplesystemsmanagement.model.InventoryItem>, init: AWSSimpleSystemsManagementPutInventoryCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.PutInventoryResult {
	return this.block.declare(AWSSimpleSystemsManagementPutInventoryCommand(instanceId, items).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.PutInventoryResult
}

@Generated
class AWSSimpleSystemsManagementPutInventoryCommand(val instanceId: String, val items: List<com.amazonaws.services.simplesystemsmanagement.model.InventoryItem>) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.PutInventoryRequest, com.amazonaws.services.simplesystemsmanagement.model.PutInventoryResult> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.PutInventoryRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.PutInventoryRequest()
		input.setInstanceId(this.instanceId)
		input.setItems(this.items)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.PutInventoryResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.PutInventoryResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.PutInventoryResult {
		return environment.ssm.putInventory(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm put-inventory")
				.argument("instance-id", instanceId)
				.argument("items", items.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.putParameter(name: String, value: String, type: ParameterType, init: AWSSimpleSystemsManagementPutParameterCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.PutParameterResult {
	return this.block.declare(AWSSimpleSystemsManagementPutParameterCommand(name, value, type).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.PutParameterResult
}

@Generated
class AWSSimpleSystemsManagementPutParameterCommand(val name: String, val value: String, val type: ParameterType) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.PutParameterRequest, com.amazonaws.services.simplesystemsmanagement.model.PutParameterResult> {

	var description: String? = null
	var keyId: String? = null
	var overwrite: Boolean? = false
	var allowedPattern: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.PutParameterRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.PutParameterRequest()
		input.setName(this.name)
		input.setDescription(this.description)
		input.setValue(this.value)
		input.setType(this.type.toString())
		input.setKeyId(this.keyId)
		input.setOverwrite(this.overwrite)
		input.setAllowedPattern(this.allowedPattern)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.PutParameterResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.PutParameterResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.PutParameterResult {
		return environment.ssm.putParameter(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm put-parameter")
				.argument("name", name)
				.argument("description", description)
				.argument("value", value)
				.argument("type", type.toString())
				.argument("key-id", keyId)
				.option("overwrite", overwrite ?: false)
				.argument("allowed-pattern", allowedPattern)
	}

}


fun AWSSimpleSystemsManagementFunctions.registerDefaultPatchBaseline(baselineId: String, init: AWSSimpleSystemsManagementRegisterDefaultPatchBaselineCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.RegisterDefaultPatchBaselineResult {
	return this.block.declare(AWSSimpleSystemsManagementRegisterDefaultPatchBaselineCommand(baselineId).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.RegisterDefaultPatchBaselineResult
}

@Generated
class AWSSimpleSystemsManagementRegisterDefaultPatchBaselineCommand(val baselineId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.RegisterDefaultPatchBaselineRequest, com.amazonaws.services.simplesystemsmanagement.model.RegisterDefaultPatchBaselineResult> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.RegisterDefaultPatchBaselineRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.RegisterDefaultPatchBaselineRequest()
		input.setBaselineId(this.baselineId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.RegisterDefaultPatchBaselineResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.RegisterDefaultPatchBaselineResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.RegisterDefaultPatchBaselineResult {
		return environment.ssm.registerDefaultPatchBaseline(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm register-default-patch-baseline")
				.argument("baseline-id", baselineId)
	}

}


fun AWSSimpleSystemsManagementFunctions.registerPatchBaselineForPatchGroup(baselineId: String, patchGroup: String, init: AWSSimpleSystemsManagementRegisterPatchBaselineForPatchGroupCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.RegisterPatchBaselineForPatchGroupResult {
	return this.block.declare(AWSSimpleSystemsManagementRegisterPatchBaselineForPatchGroupCommand(baselineId, patchGroup).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.RegisterPatchBaselineForPatchGroupResult
}

@Generated
class AWSSimpleSystemsManagementRegisterPatchBaselineForPatchGroupCommand(val baselineId: String, val patchGroup: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.RegisterPatchBaselineForPatchGroupRequest, com.amazonaws.services.simplesystemsmanagement.model.RegisterPatchBaselineForPatchGroupResult> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.RegisterPatchBaselineForPatchGroupRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.RegisterPatchBaselineForPatchGroupRequest()
		input.setBaselineId(this.baselineId)
		input.setPatchGroup(this.patchGroup)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.RegisterPatchBaselineForPatchGroupResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.RegisterPatchBaselineForPatchGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.RegisterPatchBaselineForPatchGroupResult {
		return environment.ssm.registerPatchBaselineForPatchGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm register-patch-baseline-for-patch-group")
				.argument("baseline-id", baselineId)
				.argument("patch-group", patchGroup)
	}

}


fun AWSSimpleSystemsManagementFunctions.registerTargetWithMaintenanceWindow(windowId: String, resourceType: MaintenanceWindowResourceType, targets: List<com.amazonaws.services.simplesystemsmanagement.model.Target>, init: AWSSimpleSystemsManagementRegisterTargetWithMaintenanceWindowCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.RegisterTargetWithMaintenanceWindowResult {
	return this.block.declare(AWSSimpleSystemsManagementRegisterTargetWithMaintenanceWindowCommand(windowId, resourceType, targets).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.RegisterTargetWithMaintenanceWindowResult
}

@Generated
class AWSSimpleSystemsManagementRegisterTargetWithMaintenanceWindowCommand(val windowId: String, val resourceType: MaintenanceWindowResourceType, val targets: List<com.amazonaws.services.simplesystemsmanagement.model.Target>) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.RegisterTargetWithMaintenanceWindowRequest, com.amazonaws.services.simplesystemsmanagement.model.RegisterTargetWithMaintenanceWindowResult> {

	var ownerInformation: String? = null
	var name: String? = null
	var description: String? = null
	var clientToken: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.RegisterTargetWithMaintenanceWindowRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.RegisterTargetWithMaintenanceWindowRequest()
		input.setWindowId(this.windowId)
		input.setResourceType(this.resourceType.toString())
		input.setTargets(this.targets)
		input.setOwnerInformation(this.ownerInformation)
		input.setName(this.name)
		input.setDescription(this.description)
		input.setClientToken(this.clientToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.RegisterTargetWithMaintenanceWindowResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.RegisterTargetWithMaintenanceWindowResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.RegisterTargetWithMaintenanceWindowResult {
		return environment.ssm.registerTargetWithMaintenanceWindow(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm register-target-with-maintenance-window")
				.argument("window-id", windowId)
				.argument("resource-type", resourceType.toString())
				.argument("targets", targets.toString())
				.argument("owner-information", ownerInformation)
				.argument("name", name)
				.argument("description", description)
				.argument("client-token", clientToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.registerTaskWithMaintenanceWindow(windowId: String, targets: List<com.amazonaws.services.simplesystemsmanagement.model.Target>, taskArn: String, serviceRoleArn: String, taskType: MaintenanceWindowTaskType, maxConcurrency: String, maxErrors: String, init: AWSSimpleSystemsManagementRegisterTaskWithMaintenanceWindowCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.RegisterTaskWithMaintenanceWindowResult {
	return this.block.declare(AWSSimpleSystemsManagementRegisterTaskWithMaintenanceWindowCommand(windowId, targets, taskArn, serviceRoleArn, taskType, maxConcurrency, maxErrors).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.RegisterTaskWithMaintenanceWindowResult
}

@Generated
class AWSSimpleSystemsManagementRegisterTaskWithMaintenanceWindowCommand(val windowId: String, val targets: List<com.amazonaws.services.simplesystemsmanagement.model.Target>, val taskArn: String, val serviceRoleArn: String, val taskType: MaintenanceWindowTaskType, val maxConcurrency: String, val maxErrors: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.RegisterTaskWithMaintenanceWindowRequest, com.amazonaws.services.simplesystemsmanagement.model.RegisterTaskWithMaintenanceWindowResult> {

	var taskParameters: Map<String, com.amazonaws.services.simplesystemsmanagement.model.MaintenanceWindowTaskParameterValueExpression>? = null
	var taskInvocationParameters: com.amazonaws.services.simplesystemsmanagement.model.MaintenanceWindowTaskInvocationParameters? = null
	var priority: Int? = 0
	var loggingInfo: com.amazonaws.services.simplesystemsmanagement.model.LoggingInfo? = null
	var name: String? = null
	var description: String? = null
	var clientToken: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.RegisterTaskWithMaintenanceWindowRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.RegisterTaskWithMaintenanceWindowRequest()
		input.setWindowId(this.windowId)
		input.setTargets(this.targets)
		input.setTaskArn(this.taskArn)
		input.setServiceRoleArn(this.serviceRoleArn)
		input.setTaskType(this.taskType.toString())
		input.setTaskParameters(this.taskParameters)
		input.setTaskInvocationParameters(this.taskInvocationParameters)
		input.setPriority(this.priority)
		input.setMaxConcurrency(this.maxConcurrency)
		input.setMaxErrors(this.maxErrors)
		input.setLoggingInfo(this.loggingInfo)
		input.setName(this.name)
		input.setDescription(this.description)
		input.setClientToken(this.clientToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.RegisterTaskWithMaintenanceWindowResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.RegisterTaskWithMaintenanceWindowResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.RegisterTaskWithMaintenanceWindowResult {
		return environment.ssm.registerTaskWithMaintenanceWindow(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm register-task-with-maintenance-window")
				.argument("window-id", windowId)
				.argument("targets", targets.toString())
				.argument("task-arn", taskArn)
				.argument("service-role-arn", serviceRoleArn)
				.argument("task-type", taskType.toString())
				.argument("task-parameters", taskParameters?.toString())
				.argument("task-invocation-parameters", taskInvocationParameters?.toString())
				.argument("priority", priority?.toString())
				.argument("max-concurrency", maxConcurrency)
				.argument("max-errors", maxErrors)
				.argument("logging-info", loggingInfo?.toString())
				.argument("name", name)
				.argument("description", description)
				.argument("client-token", clientToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.removeTagsFromResource(resourceType: ResourceTypeForTagging, resourceId: String, tagKeys: List<String>, init: AWSSimpleSystemsManagementRemoveTagsFromResourceCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.RemoveTagsFromResourceResult {
	return this.block.declare(AWSSimpleSystemsManagementRemoveTagsFromResourceCommand(resourceType, resourceId, tagKeys).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.RemoveTagsFromResourceResult
}

@Generated
class AWSSimpleSystemsManagementRemoveTagsFromResourceCommand(val resourceType: ResourceTypeForTagging, val resourceId: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.RemoveTagsFromResourceRequest, com.amazonaws.services.simplesystemsmanagement.model.RemoveTagsFromResourceResult> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.RemoveTagsFromResourceRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.RemoveTagsFromResourceRequest()
		input.setResourceType(this.resourceType.toString())
		input.setResourceId(this.resourceId)
		input.setTagKeys(this.tagKeys)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.RemoveTagsFromResourceResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.RemoveTagsFromResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.RemoveTagsFromResourceResult {
		return environment.ssm.removeTagsFromResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm remove-tags-from-resource")
				.argument("resource-type", resourceType.toString())
				.argument("resource-id", resourceId)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.sendAutomationSignal(automationExecutionId: String, signalType: SignalType, init: AWSSimpleSystemsManagementSendAutomationSignalCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.SendAutomationSignalResult {
	return this.block.declare(AWSSimpleSystemsManagementSendAutomationSignalCommand(automationExecutionId, signalType).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.SendAutomationSignalResult
}

@Generated
class AWSSimpleSystemsManagementSendAutomationSignalCommand(val automationExecutionId: String, val signalType: SignalType) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.SendAutomationSignalRequest, com.amazonaws.services.simplesystemsmanagement.model.SendAutomationSignalResult> {

	var payload: Map<String, List<String>>? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.SendAutomationSignalRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.SendAutomationSignalRequest()
		input.setAutomationExecutionId(this.automationExecutionId)
		input.setSignalType(this.signalType.toString())
		input.setPayload(this.payload)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.SendAutomationSignalResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.SendAutomationSignalResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.SendAutomationSignalResult {
		return environment.ssm.sendAutomationSignal(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm send-automation-signal")
				.argument("automation-execution-id", automationExecutionId)
				.argument("signal-type", signalType.toString())
				.argument("payload", payload?.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.sendCommand(documentName: String, init: AWSSimpleSystemsManagementSendCommandCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.SendCommandResult {
	return this.block.declare(AWSSimpleSystemsManagementSendCommandCommand(documentName).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.SendCommandResult
}

@Generated
class AWSSimpleSystemsManagementSendCommandCommand(val documentName: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.SendCommandRequest, com.amazonaws.services.simplesystemsmanagement.model.SendCommandResult> {

	var instanceIds: List<String>? = null
	var targets: List<com.amazonaws.services.simplesystemsmanagement.model.Target>? = null
	var documentHash: String? = null
	var documentHashType: DocumentHashType? = null
	var timeoutSeconds: Int? = 0
	var comment: String? = null
	var parameters: Map<String, List<String>>? = null
	var outputS3Region: String? = null
	var outputS3BucketName: String? = null
	var outputS3KeyPrefix: String? = null
	var maxConcurrency: String? = null
	var maxErrors: String? = null
	var serviceRoleArn: String? = null
	var notificationConfig: com.amazonaws.services.simplesystemsmanagement.model.NotificationConfig? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.SendCommandRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.SendCommandRequest()
		input.setInstanceIds(this.instanceIds)
		input.setTargets(this.targets)
		input.setDocumentName(this.documentName)
		input.setDocumentHash(this.documentHash)
		input.setDocumentHashType(this.documentHashType?.toString())
		input.setTimeoutSeconds(this.timeoutSeconds)
		input.setComment(this.comment)
		input.setParameters(this.parameters)
		input.setOutputS3Region(this.outputS3Region)
		input.setOutputS3BucketName(this.outputS3BucketName)
		input.setOutputS3KeyPrefix(this.outputS3KeyPrefix)
		input.setMaxConcurrency(this.maxConcurrency)
		input.setMaxErrors(this.maxErrors)
		input.setServiceRoleArn(this.serviceRoleArn)
		input.setNotificationConfig(this.notificationConfig)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.SendCommandResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.SendCommandResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.SendCommandResult {
		return environment.ssm.sendCommand(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm send-command")
				.argument("instance-ids", instanceIds?.toString())
				.argument("targets", targets?.toString())
				.argument("document-name", documentName)
				.argument("document-hash", documentHash)
				.argument("document-hash-type", documentHashType?.toString())
				.argument("timeout-seconds", timeoutSeconds?.toString())
				.argument("comment", comment)
				.argument("parameters", parameters?.toString())
				.argument("output-s3-region", outputS3Region)
				.argument("output-s3-bucket-name", outputS3BucketName)
				.argument("output-s3-key-prefix", outputS3KeyPrefix)
				.argument("max-concurrency", maxConcurrency)
				.argument("max-errors", maxErrors)
				.argument("service-role-arn", serviceRoleArn)
				.argument("notification-config", notificationConfig?.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.startAutomationExecution(documentName: String, init: AWSSimpleSystemsManagementStartAutomationExecutionCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.StartAutomationExecutionResult {
	return this.block.declare(AWSSimpleSystemsManagementStartAutomationExecutionCommand(documentName).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.StartAutomationExecutionResult
}

@Generated
class AWSSimpleSystemsManagementStartAutomationExecutionCommand(val documentName: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.StartAutomationExecutionRequest, com.amazonaws.services.simplesystemsmanagement.model.StartAutomationExecutionResult> {

	var documentVersion: String? = null
	var parameters: Map<String, List<String>>? = null
	var clientToken: String? = null
	var mode: ExecutionMode? = null
	var targetParameterName: String? = null
	var targets: List<com.amazonaws.services.simplesystemsmanagement.model.Target>? = null
	var maxConcurrency: String? = null
	var maxErrors: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.StartAutomationExecutionRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.StartAutomationExecutionRequest()
		input.setDocumentName(this.documentName)
		input.setDocumentVersion(this.documentVersion)
		input.setParameters(this.parameters)
		input.setClientToken(this.clientToken)
		input.setMode(this.mode?.toString())
		input.setTargetParameterName(this.targetParameterName)
		input.setTargets(this.targets)
		input.setMaxConcurrency(this.maxConcurrency)
		input.setMaxErrors(this.maxErrors)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.StartAutomationExecutionResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.StartAutomationExecutionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.StartAutomationExecutionResult {
		return environment.ssm.startAutomationExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm start-automation-execution")
				.argument("document-name", documentName)
				.argument("document-version", documentVersion)
				.argument("parameters", parameters?.toString())
				.argument("client-token", clientToken)
				.argument("mode", mode?.toString())
				.argument("target-parameter-name", targetParameterName)
				.argument("targets", targets?.toString())
				.argument("max-concurrency", maxConcurrency)
				.argument("max-errors", maxErrors)
	}

}


fun AWSSimpleSystemsManagementFunctions.stopAutomationExecution(automationExecutionId: String, init: AWSSimpleSystemsManagementStopAutomationExecutionCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.StopAutomationExecutionResult {
	return this.block.declare(AWSSimpleSystemsManagementStopAutomationExecutionCommand(automationExecutionId).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.StopAutomationExecutionResult
}

@Generated
class AWSSimpleSystemsManagementStopAutomationExecutionCommand(val automationExecutionId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.StopAutomationExecutionRequest, com.amazonaws.services.simplesystemsmanagement.model.StopAutomationExecutionResult> {

	var type: StopType? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.StopAutomationExecutionRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.StopAutomationExecutionRequest()
		input.setAutomationExecutionId(this.automationExecutionId)
		input.setType(this.type?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.StopAutomationExecutionResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.StopAutomationExecutionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.StopAutomationExecutionResult {
		return environment.ssm.stopAutomationExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm stop-automation-execution")
				.argument("automation-execution-id", automationExecutionId)
				.argument("type", type?.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.updateAssociation(associationId: String, init: AWSSimpleSystemsManagementUpdateAssociationCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationResult {
	return this.block.declare(AWSSimpleSystemsManagementUpdateAssociationCommand(associationId).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationResult
}

@Generated
class AWSSimpleSystemsManagementUpdateAssociationCommand(val associationId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationRequest, com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationResult> {

	var parameters: Map<String, List<String>>? = null
	var documentVersion: String? = null
	var scheduleExpression: String? = null
	var outputLocation: com.amazonaws.services.simplesystemsmanagement.model.InstanceAssociationOutputLocation? = null
	var name: String? = null
	var targets: List<com.amazonaws.services.simplesystemsmanagement.model.Target>? = null
	var associationName: String? = null
	var associationVersion: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationRequest()
		input.setAssociationId(this.associationId)
		input.setParameters(this.parameters)
		input.setDocumentVersion(this.documentVersion)
		input.setScheduleExpression(this.scheduleExpression)
		input.setOutputLocation(this.outputLocation)
		input.setName(this.name)
		input.setTargets(this.targets)
		input.setAssociationName(this.associationName)
		input.setAssociationVersion(this.associationVersion)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationResult {
		return environment.ssm.updateAssociation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm update-association")
				.argument("association-id", associationId)
				.argument("parameters", parameters?.toString())
				.argument("document-version", documentVersion)
				.argument("schedule-expression", scheduleExpression)
				.argument("output-location", outputLocation?.toString())
				.argument("name", name)
				.argument("targets", targets?.toString())
				.argument("association-name", associationName)
				.argument("association-version", associationVersion)
	}

}


fun AWSSimpleSystemsManagementFunctions.updateAssociationStatus(name: String, instanceId: String, associationStatus: com.amazonaws.services.simplesystemsmanagement.model.AssociationStatus, init: AWSSimpleSystemsManagementUpdateAssociationStatusCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationStatusResult {
	return this.block.declare(AWSSimpleSystemsManagementUpdateAssociationStatusCommand(name, instanceId, associationStatus).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationStatusResult
}

@Generated
class AWSSimpleSystemsManagementUpdateAssociationStatusCommand(val name: String, val instanceId: String, val associationStatus: com.amazonaws.services.simplesystemsmanagement.model.AssociationStatus) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationStatusRequest, com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationStatusResult> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationStatusRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationStatusRequest()
		input.setName(this.name)
		input.setInstanceId(this.instanceId)
		input.setAssociationStatus(this.associationStatus)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationStatusResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationStatusResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationStatusResult {
		return environment.ssm.updateAssociationStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm update-association-status")
				.argument("name", name)
				.argument("instance-id", instanceId)
				.argument("association-status", associationStatus.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.updateDocument(content: String, name: String, init: AWSSimpleSystemsManagementUpdateDocumentCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentResult {
	return this.block.declare(AWSSimpleSystemsManagementUpdateDocumentCommand(content, name).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentResult
}

@Generated
class AWSSimpleSystemsManagementUpdateDocumentCommand(val content: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentRequest, com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentResult> {

	var documentVersion: String? = null
	var documentFormat: DocumentFormat? = null
	var targetType: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentRequest()
		input.setContent(this.content)
		input.setName(this.name)
		input.setDocumentVersion(this.documentVersion)
		input.setDocumentFormat(this.documentFormat?.toString())
		input.setTargetType(this.targetType)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentResult {
		return environment.ssm.updateDocument(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm update-document")
				.argument("content", content)
				.argument("name", name)
				.argument("document-version", documentVersion)
				.argument("document-format", documentFormat?.toString())
				.argument("target-type", targetType)
	}

}


fun AWSSimpleSystemsManagementFunctions.updateDocumentDefaultVersion(name: String, documentVersion: String, init: AWSSimpleSystemsManagementUpdateDocumentDefaultVersionCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentDefaultVersionResult {
	return this.block.declare(AWSSimpleSystemsManagementUpdateDocumentDefaultVersionCommand(name, documentVersion).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentDefaultVersionResult
}

@Generated
class AWSSimpleSystemsManagementUpdateDocumentDefaultVersionCommand(val name: String, val documentVersion: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentDefaultVersionRequest, com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentDefaultVersionResult> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentDefaultVersionRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentDefaultVersionRequest()
		input.setName(this.name)
		input.setDocumentVersion(this.documentVersion)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentDefaultVersionResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentDefaultVersionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentDefaultVersionResult {
		return environment.ssm.updateDocumentDefaultVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm update-document-default-version")
				.argument("name", name)
				.argument("document-version", documentVersion)
	}

}


fun AWSSimpleSystemsManagementFunctions.updateMaintenanceWindow(windowId: String, init: AWSSimpleSystemsManagementUpdateMaintenanceWindowCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowResult {
	return this.block.declare(AWSSimpleSystemsManagementUpdateMaintenanceWindowCommand(windowId).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowResult
}

@Generated
class AWSSimpleSystemsManagementUpdateMaintenanceWindowCommand(val windowId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowRequest, com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowResult> {

	var name: String? = null
	var description: String? = null
	var schedule: String? = null
	var duration: Int? = 0
	var cutoff: Int? = 0
	var allowUnassociatedTargets: Boolean? = false
	var enabled: Boolean? = false
	var replace: Boolean? = false

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowRequest()
		input.setWindowId(this.windowId)
		input.setName(this.name)
		input.setDescription(this.description)
		input.setSchedule(this.schedule)
		input.setDuration(this.duration)
		input.setCutoff(this.cutoff)
		input.setAllowUnassociatedTargets(this.allowUnassociatedTargets)
		input.setEnabled(this.enabled)
		input.setReplace(this.replace)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowResult {
		return environment.ssm.updateMaintenanceWindow(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm update-maintenance-window")
				.argument("window-id", windowId)
				.argument("name", name)
				.argument("description", description)
				.argument("schedule", schedule)
				.argument("duration", duration?.toString())
				.argument("cutoff", cutoff?.toString())
				.option("allow-unassociated-targets", allowUnassociatedTargets ?: false)
				.option("enabled", enabled ?: false)
				.option("replace", replace ?: false)
	}

}


fun AWSSimpleSystemsManagementFunctions.updateMaintenanceWindowTarget(windowId: String, windowTargetId: String, init: AWSSimpleSystemsManagementUpdateMaintenanceWindowTargetCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTargetResult {
	return this.block.declare(AWSSimpleSystemsManagementUpdateMaintenanceWindowTargetCommand(windowId, windowTargetId).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTargetResult
}

@Generated
class AWSSimpleSystemsManagementUpdateMaintenanceWindowTargetCommand(val windowId: String, val windowTargetId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTargetRequest, com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTargetResult> {

	var targets: List<com.amazonaws.services.simplesystemsmanagement.model.Target>? = null
	var ownerInformation: String? = null
	var name: String? = null
	var description: String? = null
	var replace: Boolean? = false

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTargetRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTargetRequest()
		input.setWindowId(this.windowId)
		input.setWindowTargetId(this.windowTargetId)
		input.setTargets(this.targets)
		input.setOwnerInformation(this.ownerInformation)
		input.setName(this.name)
		input.setDescription(this.description)
		input.setReplace(this.replace)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTargetResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTargetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTargetResult {
		return environment.ssm.updateMaintenanceWindowTarget(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm update-maintenance-window-target")
				.argument("window-id", windowId)
				.argument("window-target-id", windowTargetId)
				.argument("targets", targets?.toString())
				.argument("owner-information", ownerInformation)
				.argument("name", name)
				.argument("description", description)
				.option("replace", replace ?: false)
	}

}


fun AWSSimpleSystemsManagementFunctions.updateMaintenanceWindowTask(windowId: String, windowTaskId: String, init: AWSSimpleSystemsManagementUpdateMaintenanceWindowTaskCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTaskResult {
	return this.block.declare(AWSSimpleSystemsManagementUpdateMaintenanceWindowTaskCommand(windowId, windowTaskId).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTaskResult
}

@Generated
class AWSSimpleSystemsManagementUpdateMaintenanceWindowTaskCommand(val windowId: String, val windowTaskId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTaskRequest, com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTaskResult> {

	var targets: List<com.amazonaws.services.simplesystemsmanagement.model.Target>? = null
	var taskArn: String? = null
	var serviceRoleArn: String? = null
	var taskParameters: Map<String, com.amazonaws.services.simplesystemsmanagement.model.MaintenanceWindowTaskParameterValueExpression>? = null
	var taskInvocationParameters: com.amazonaws.services.simplesystemsmanagement.model.MaintenanceWindowTaskInvocationParameters? = null
	var priority: Int? = 0
	var maxConcurrency: String? = null
	var maxErrors: String? = null
	var loggingInfo: com.amazonaws.services.simplesystemsmanagement.model.LoggingInfo? = null
	var name: String? = null
	var description: String? = null
	var replace: Boolean? = false

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTaskRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTaskRequest()
		input.setWindowId(this.windowId)
		input.setWindowTaskId(this.windowTaskId)
		input.setTargets(this.targets)
		input.setTaskArn(this.taskArn)
		input.setServiceRoleArn(this.serviceRoleArn)
		input.setTaskParameters(this.taskParameters)
		input.setTaskInvocationParameters(this.taskInvocationParameters)
		input.setPriority(this.priority)
		input.setMaxConcurrency(this.maxConcurrency)
		input.setMaxErrors(this.maxErrors)
		input.setLoggingInfo(this.loggingInfo)
		input.setName(this.name)
		input.setDescription(this.description)
		input.setReplace(this.replace)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTaskResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTaskResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTaskResult {
		return environment.ssm.updateMaintenanceWindowTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm update-maintenance-window-task")
				.argument("window-id", windowId)
				.argument("window-task-id", windowTaskId)
				.argument("targets", targets?.toString())
				.argument("task-arn", taskArn)
				.argument("service-role-arn", serviceRoleArn)
				.argument("task-parameters", taskParameters?.toString())
				.argument("task-invocation-parameters", taskInvocationParameters?.toString())
				.argument("priority", priority?.toString())
				.argument("max-concurrency", maxConcurrency)
				.argument("max-errors", maxErrors)
				.argument("logging-info", loggingInfo?.toString())
				.argument("name", name)
				.argument("description", description)
				.option("replace", replace ?: false)
	}

}


fun AWSSimpleSystemsManagementFunctions.updateManagedInstanceRole(instanceId: String, iamRole: String, init: AWSSimpleSystemsManagementUpdateManagedInstanceRoleCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.UpdateManagedInstanceRoleResult {
	return this.block.declare(AWSSimpleSystemsManagementUpdateManagedInstanceRoleCommand(instanceId, iamRole).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.UpdateManagedInstanceRoleResult
}

@Generated
class AWSSimpleSystemsManagementUpdateManagedInstanceRoleCommand(val instanceId: String, val iamRole: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.UpdateManagedInstanceRoleRequest, com.amazonaws.services.simplesystemsmanagement.model.UpdateManagedInstanceRoleResult> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.UpdateManagedInstanceRoleRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.UpdateManagedInstanceRoleRequest()
		input.setInstanceId(this.instanceId)
		input.setIamRole(this.iamRole)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.UpdateManagedInstanceRoleResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.UpdateManagedInstanceRoleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.UpdateManagedInstanceRoleResult {
		return environment.ssm.updateManagedInstanceRole(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm update-managed-instance-role")
				.argument("instance-id", instanceId)
				.argument("iam-role", iamRole)
	}

}


fun AWSSimpleSystemsManagementFunctions.updatePatchBaseline(baselineId: String, init: AWSSimpleSystemsManagementUpdatePatchBaselineCommand.() -> Unit): com.amazonaws.services.simplesystemsmanagement.model.UpdatePatchBaselineResult {
	return this.block.declare(AWSSimpleSystemsManagementUpdatePatchBaselineCommand(baselineId).apply(init)) as com.amazonaws.services.simplesystemsmanagement.model.UpdatePatchBaselineResult
}

@Generated
class AWSSimpleSystemsManagementUpdatePatchBaselineCommand(val baselineId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.UpdatePatchBaselineRequest, com.amazonaws.services.simplesystemsmanagement.model.UpdatePatchBaselineResult> {

	var name: String? = null
	var globalFilters: com.amazonaws.services.simplesystemsmanagement.model.PatchFilterGroup? = null
	var approvalRules: com.amazonaws.services.simplesystemsmanagement.model.PatchRuleGroup? = null
	var approvedPatches: List<String>? = null
	var approvedPatchesComplianceLevel: PatchComplianceLevel? = null
	var approvedPatchesEnableNonSecurity: Boolean? = false
	var rejectedPatches: List<String>? = null
	var description: String? = null
	var sources: List<com.amazonaws.services.simplesystemsmanagement.model.PatchSource>? = null
	var replace: Boolean? = false

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.UpdatePatchBaselineRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.UpdatePatchBaselineRequest()
		input.setBaselineId(this.baselineId)
		input.setName(this.name)
		input.setGlobalFilters(this.globalFilters)
		input.setApprovalRules(this.approvalRules)
		input.setApprovedPatches(this.approvedPatches)
		input.setApprovedPatchesComplianceLevel(this.approvedPatchesComplianceLevel?.toString())
		input.setApprovedPatchesEnableNonSecurity(this.approvedPatchesEnableNonSecurity)
		input.setRejectedPatches(this.rejectedPatches)
		input.setDescription(this.description)
		input.setSources(this.sources)
		input.setReplace(this.replace)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simplesystemsmanagement.model.UpdatePatchBaselineResult {
	  return com.amazonaws.services.simplesystemsmanagement.model.UpdatePatchBaselineResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simplesystemsmanagement.model.UpdatePatchBaselineResult {
		return environment.ssm.updatePatchBaseline(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm update-patch-baseline")
				.argument("baseline-id", baselineId)
				.argument("name", name)
				.argument("global-filters", globalFilters?.toString())
				.argument("approval-rules", approvalRules?.toString())
				.argument("approved-patches", approvedPatches?.toString())
				.argument("approved-patches-compliance-level", approvedPatchesComplianceLevel?.toString())
				.option("approved-patches-enable-non-security", approvedPatchesEnableNonSecurity ?: false)
				.argument("rejected-patches", rejectedPatches?.toString())
				.argument("description", description)
				.argument("sources", sources?.toString())
				.option("replace", replace ?: false)
	}

}
