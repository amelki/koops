
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.simplesystemsmanagement.AWSSimpleSystemsManagement
import com.amazonaws.services.simplesystemsmanagement.model.*

var codingue.koops.core.Environment.ssm: AWSSimpleSystemsManagement
	get() = this.capabilities[AWSSimpleSystemsManagement::class.java.name] as AWSSimpleSystemsManagement
	set(ssm) {
		this.capabilities[AWSSimpleSystemsManagement::class.java.name] = ssm
	}

@Generated
class AWSSimpleSystemsManagementFunctions(val block: Block)

infix fun AwsContinuation.ssm(init: AWSSimpleSystemsManagementFunctions.() -> Unit) {
	AWSSimpleSystemsManagementFunctions(shell).apply(init)
}

			

fun AWSSimpleSystemsManagementFunctions.addTagsToResource(resourceType: ResourceTypeForTagging, resourceId: String, tags: List<com.amazonaws.services.simplesystemsmanagement.model.Tag>, init: AWSSimpleSystemsManagementAddTagsToResourceCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementAddTagsToResourceCommand(resourceType, resourceId, tags).apply(init))
}

@Generated
class AWSSimpleSystemsManagementAddTagsToResourceCommand(val resourceType: ResourceTypeForTagging, val resourceId: String, val tags: List<com.amazonaws.services.simplesystemsmanagement.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.AddTagsToResourceRequest> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.AddTagsToResourceRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.AddTagsToResourceRequest()
		input.setResourceType(this.resourceType.toString())
		input.setResourceId(this.resourceId)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.addTagsToResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm add-tags-to-resource")
				.argument("resource-type", resourceType.toString())
				.argument("resource-id", resourceId)
				.argument("tags", tags.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.cancelCommand(commandId: String, init: AWSSimpleSystemsManagementCancelCommandCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementCancelCommandCommand(commandId).apply(init))
}

@Generated
class AWSSimpleSystemsManagementCancelCommandCommand(val commandId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.CancelCommandRequest> {

	var instanceIds: List<String>? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.CancelCommandRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.CancelCommandRequest()
		input.setCommandId(this.commandId)
		input.setInstanceIds(this.instanceIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.cancelCommand(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm cancel-command")
				.argument("command-id", commandId)
				.argument("instance-ids", instanceIds?.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.createActivation(iamRole: String, init: AWSSimpleSystemsManagementCreateActivationCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementCreateActivationCommand(iamRole).apply(init))
}

@Generated
class AWSSimpleSystemsManagementCreateActivationCommand(val iamRole: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.CreateActivationRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.createActivation(build())
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


fun AWSSimpleSystemsManagementFunctions.createAssociation(name: String, init: AWSSimpleSystemsManagementCreateAssociationCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementCreateAssociationCommand(name).apply(init))
}

@Generated
class AWSSimpleSystemsManagementCreateAssociationCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.createAssociation(build())
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


fun AWSSimpleSystemsManagementFunctions.createAssociationBatch(entries: List<com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationBatchRequestEntry>, init: AWSSimpleSystemsManagementCreateAssociationBatchCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementCreateAssociationBatchCommand(entries).apply(init))
}

@Generated
class AWSSimpleSystemsManagementCreateAssociationBatchCommand(val entries: List<com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationBatchRequestEntry>) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationBatchRequest> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationBatchRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.CreateAssociationBatchRequest()
		input.setEntries(this.entries)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.createAssociationBatch(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm create-association-batch")
				.argument("entries", entries.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.createDocument(content: String, name: String, init: AWSSimpleSystemsManagementCreateDocumentCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementCreateDocumentCommand(content, name).apply(init))
}

@Generated
class AWSSimpleSystemsManagementCreateDocumentCommand(val content: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.CreateDocumentRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.createDocument(build())
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


fun AWSSimpleSystemsManagementFunctions.createMaintenanceWindow(name: String, schedule: String, duration: Int, cutoff: Int, allowUnassociatedTargets: Boolean, init: AWSSimpleSystemsManagementCreateMaintenanceWindowCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementCreateMaintenanceWindowCommand(name, schedule, duration, cutoff, allowUnassociatedTargets).apply(init))
}

@Generated
class AWSSimpleSystemsManagementCreateMaintenanceWindowCommand(val name: String, val schedule: String, val duration: Int, val cutoff: Int, val allowUnassociatedTargets: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.CreateMaintenanceWindowRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.createMaintenanceWindow(build())
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


fun AWSSimpleSystemsManagementFunctions.createPatchBaseline(name: String, init: AWSSimpleSystemsManagementCreatePatchBaselineCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementCreatePatchBaselineCommand(name).apply(init))
}

@Generated
class AWSSimpleSystemsManagementCreatePatchBaselineCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.CreatePatchBaselineRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.createPatchBaseline(build())
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


fun AWSSimpleSystemsManagementFunctions.createResourceDataSync(syncName: String, s3Destination: com.amazonaws.services.simplesystemsmanagement.model.ResourceDataSyncS3Destination, init: AWSSimpleSystemsManagementCreateResourceDataSyncCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementCreateResourceDataSyncCommand(syncName, s3Destination).apply(init))
}

@Generated
class AWSSimpleSystemsManagementCreateResourceDataSyncCommand(val syncName: String, val s3Destination: com.amazonaws.services.simplesystemsmanagement.model.ResourceDataSyncS3Destination) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.CreateResourceDataSyncRequest> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.CreateResourceDataSyncRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.CreateResourceDataSyncRequest()
		input.setSyncName(this.syncName)
		input.setS3Destination(this.s3Destination)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.createResourceDataSync(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm create-resource-data-sync")
				.argument("sync-name", syncName)
				.argument("s3-destination", s3Destination.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.deleteActivation(activationId: String, init: AWSSimpleSystemsManagementDeleteActivationCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementDeleteActivationCommand(activationId).apply(init))
}

@Generated
class AWSSimpleSystemsManagementDeleteActivationCommand(val activationId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DeleteActivationRequest> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DeleteActivationRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DeleteActivationRequest()
		input.setActivationId(this.activationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.deleteActivation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm delete-activation")
				.argument("activation-id", activationId)
	}

}


fun AWSSimpleSystemsManagementFunctions.deleteAssociation(init: AWSSimpleSystemsManagementDeleteAssociationCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementDeleteAssociationCommand().apply(init))
}

@Generated
class AWSSimpleSystemsManagementDeleteAssociationCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DeleteAssociationRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.deleteAssociation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm delete-association")
				.argument("name", name)
				.argument("instance-id", instanceId)
				.argument("association-id", associationId)
	}

}


fun AWSSimpleSystemsManagementFunctions.deleteDocument(name: String, init: AWSSimpleSystemsManagementDeleteDocumentCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementDeleteDocumentCommand(name).apply(init))
}

@Generated
class AWSSimpleSystemsManagementDeleteDocumentCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DeleteDocumentRequest> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DeleteDocumentRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DeleteDocumentRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.deleteDocument(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm delete-document")
				.argument("name", name)
	}

}


fun AWSSimpleSystemsManagementFunctions.deleteMaintenanceWindow(windowId: String, init: AWSSimpleSystemsManagementDeleteMaintenanceWindowCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementDeleteMaintenanceWindowCommand(windowId).apply(init))
}

@Generated
class AWSSimpleSystemsManagementDeleteMaintenanceWindowCommand(val windowId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DeleteMaintenanceWindowRequest> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DeleteMaintenanceWindowRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DeleteMaintenanceWindowRequest()
		input.setWindowId(this.windowId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.deleteMaintenanceWindow(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm delete-maintenance-window")
				.argument("window-id", windowId)
	}

}


fun AWSSimpleSystemsManagementFunctions.deleteParameter(name: String, init: AWSSimpleSystemsManagementDeleteParameterCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementDeleteParameterCommand(name).apply(init))
}

@Generated
class AWSSimpleSystemsManagementDeleteParameterCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DeleteParameterRequest> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DeleteParameterRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DeleteParameterRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.deleteParameter(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm delete-parameter")
				.argument("name", name)
	}

}


fun AWSSimpleSystemsManagementFunctions.deleteParameters(names: List<String>, init: AWSSimpleSystemsManagementDeleteParametersCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementDeleteParametersCommand(names).apply(init))
}

@Generated
class AWSSimpleSystemsManagementDeleteParametersCommand(val names: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DeleteParametersRequest> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DeleteParametersRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DeleteParametersRequest()
		input.setNames(this.names)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.deleteParameters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm delete-parameters")
				.argument("names", names.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.deletePatchBaseline(baselineId: String, init: AWSSimpleSystemsManagementDeletePatchBaselineCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementDeletePatchBaselineCommand(baselineId).apply(init))
}

@Generated
class AWSSimpleSystemsManagementDeletePatchBaselineCommand(val baselineId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DeletePatchBaselineRequest> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DeletePatchBaselineRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DeletePatchBaselineRequest()
		input.setBaselineId(this.baselineId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.deletePatchBaseline(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm delete-patch-baseline")
				.argument("baseline-id", baselineId)
	}

}


fun AWSSimpleSystemsManagementFunctions.deleteResourceDataSync(syncName: String, init: AWSSimpleSystemsManagementDeleteResourceDataSyncCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementDeleteResourceDataSyncCommand(syncName).apply(init))
}

@Generated
class AWSSimpleSystemsManagementDeleteResourceDataSyncCommand(val syncName: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DeleteResourceDataSyncRequest> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DeleteResourceDataSyncRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DeleteResourceDataSyncRequest()
		input.setSyncName(this.syncName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.deleteResourceDataSync(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm delete-resource-data-sync")
				.argument("sync-name", syncName)
	}

}


fun AWSSimpleSystemsManagementFunctions.deregisterManagedInstance(instanceId: String, init: AWSSimpleSystemsManagementDeregisterManagedInstanceCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementDeregisterManagedInstanceCommand(instanceId).apply(init))
}

@Generated
class AWSSimpleSystemsManagementDeregisterManagedInstanceCommand(val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DeregisterManagedInstanceRequest> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DeregisterManagedInstanceRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DeregisterManagedInstanceRequest()
		input.setInstanceId(this.instanceId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.deregisterManagedInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm deregister-managed-instance")
				.argument("instance-id", instanceId)
	}

}


fun AWSSimpleSystemsManagementFunctions.deregisterPatchBaselineForPatchGroup(baselineId: String, patchGroup: String, init: AWSSimpleSystemsManagementDeregisterPatchBaselineForPatchGroupCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementDeregisterPatchBaselineForPatchGroupCommand(baselineId, patchGroup).apply(init))
}

@Generated
class AWSSimpleSystemsManagementDeregisterPatchBaselineForPatchGroupCommand(val baselineId: String, val patchGroup: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DeregisterPatchBaselineForPatchGroupRequest> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DeregisterPatchBaselineForPatchGroupRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DeregisterPatchBaselineForPatchGroupRequest()
		input.setBaselineId(this.baselineId)
		input.setPatchGroup(this.patchGroup)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.deregisterPatchBaselineForPatchGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm deregister-patch-baseline-for-patch-group")
				.argument("baseline-id", baselineId)
				.argument("patch-group", patchGroup)
	}

}


fun AWSSimpleSystemsManagementFunctions.deregisterTargetFromMaintenanceWindow(windowId: String, windowTargetId: String, init: AWSSimpleSystemsManagementDeregisterTargetFromMaintenanceWindowCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementDeregisterTargetFromMaintenanceWindowCommand(windowId, windowTargetId).apply(init))
}

@Generated
class AWSSimpleSystemsManagementDeregisterTargetFromMaintenanceWindowCommand(val windowId: String, val windowTargetId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DeregisterTargetFromMaintenanceWindowRequest> {

	var safe: Boolean? = false

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DeregisterTargetFromMaintenanceWindowRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DeregisterTargetFromMaintenanceWindowRequest()
		input.setWindowId(this.windowId)
		input.setWindowTargetId(this.windowTargetId)
		input.setSafe(this.safe)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.deregisterTargetFromMaintenanceWindow(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm deregister-target-from-maintenance-window")
				.argument("window-id", windowId)
				.argument("window-target-id", windowTargetId)
				.option("safe", safe ?: false)
	}

}


fun AWSSimpleSystemsManagementFunctions.deregisterTaskFromMaintenanceWindow(windowId: String, windowTaskId: String, init: AWSSimpleSystemsManagementDeregisterTaskFromMaintenanceWindowCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementDeregisterTaskFromMaintenanceWindowCommand(windowId, windowTaskId).apply(init))
}

@Generated
class AWSSimpleSystemsManagementDeregisterTaskFromMaintenanceWindowCommand(val windowId: String, val windowTaskId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DeregisterTaskFromMaintenanceWindowRequest> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DeregisterTaskFromMaintenanceWindowRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DeregisterTaskFromMaintenanceWindowRequest()
		input.setWindowId(this.windowId)
		input.setWindowTaskId(this.windowTaskId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.deregisterTaskFromMaintenanceWindow(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm deregister-task-from-maintenance-window")
				.argument("window-id", windowId)
				.argument("window-task-id", windowTaskId)
	}

}


fun AWSSimpleSystemsManagementFunctions.describeActivations(init: AWSSimpleSystemsManagementDescribeActivationsCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementDescribeActivationsCommand().apply(init))
}

@Generated
class AWSSimpleSystemsManagementDescribeActivationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeActivationsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.describeActivations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-activations")
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.describeAssociation(init: AWSSimpleSystemsManagementDescribeAssociationCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementDescribeAssociationCommand().apply(init))
}

@Generated
class AWSSimpleSystemsManagementDescribeAssociationCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeAssociationRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.describeAssociation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-association")
				.argument("name", name)
				.argument("instance-id", instanceId)
				.argument("association-id", associationId)
				.argument("association-version", associationVersion)
	}

}


fun AWSSimpleSystemsManagementFunctions.describeAutomationExecutions(init: AWSSimpleSystemsManagementDescribeAutomationExecutionsCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementDescribeAutomationExecutionsCommand().apply(init))
}

@Generated
class AWSSimpleSystemsManagementDescribeAutomationExecutionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationExecutionsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.describeAutomationExecutions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-automation-executions")
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.describeAutomationStepExecutions(automationExecutionId: String, init: AWSSimpleSystemsManagementDescribeAutomationStepExecutionsCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementDescribeAutomationStepExecutionsCommand(automationExecutionId).apply(init))
}

@Generated
class AWSSimpleSystemsManagementDescribeAutomationStepExecutionsCommand(val automationExecutionId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeAutomationStepExecutionsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.describeAutomationStepExecutions(build())
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


fun AWSSimpleSystemsManagementFunctions.describeAvailablePatches(init: AWSSimpleSystemsManagementDescribeAvailablePatchesCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementDescribeAvailablePatchesCommand().apply(init))
}

@Generated
class AWSSimpleSystemsManagementDescribeAvailablePatchesCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeAvailablePatchesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.describeAvailablePatches(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-available-patches")
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.describeDocument(name: String, init: AWSSimpleSystemsManagementDescribeDocumentCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementDescribeDocumentCommand(name).apply(init))
}

@Generated
class AWSSimpleSystemsManagementDescribeDocumentCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentRequest> {

	var documentVersion: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentRequest()
		input.setName(this.name)
		input.setDocumentVersion(this.documentVersion)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.describeDocument(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-document")
				.argument("name", name)
				.argument("document-version", documentVersion)
	}

}


fun AWSSimpleSystemsManagementFunctions.describeDocumentPermission(name: String, permissionType: DocumentPermissionType, init: AWSSimpleSystemsManagementDescribeDocumentPermissionCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementDescribeDocumentPermissionCommand(name, permissionType).apply(init))
}

@Generated
class AWSSimpleSystemsManagementDescribeDocumentPermissionCommand(val name: String, val permissionType: DocumentPermissionType) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentPermissionRequest> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentPermissionRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DescribeDocumentPermissionRequest()
		input.setName(this.name)
		input.setPermissionType(this.permissionType.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.describeDocumentPermission(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-document-permission")
				.argument("name", name)
				.argument("permission-type", permissionType.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.describeEffectiveInstanceAssociations(instanceId: String, init: AWSSimpleSystemsManagementDescribeEffectiveInstanceAssociationsCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementDescribeEffectiveInstanceAssociationsCommand(instanceId).apply(init))
}

@Generated
class AWSSimpleSystemsManagementDescribeEffectiveInstanceAssociationsCommand(val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectiveInstanceAssociationsRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectiveInstanceAssociationsRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectiveInstanceAssociationsRequest()
		input.setInstanceId(this.instanceId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.describeEffectiveInstanceAssociations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-effective-instance-associations")
				.argument("instance-id", instanceId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.describeEffectivePatchesForPatchBaseline(baselineId: String, init: AWSSimpleSystemsManagementDescribeEffectivePatchesForPatchBaselineCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementDescribeEffectivePatchesForPatchBaselineCommand(baselineId).apply(init))
}

@Generated
class AWSSimpleSystemsManagementDescribeEffectivePatchesForPatchBaselineCommand(val baselineId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectivePatchesForPatchBaselineRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectivePatchesForPatchBaselineRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DescribeEffectivePatchesForPatchBaselineRequest()
		input.setBaselineId(this.baselineId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.describeEffectivePatchesForPatchBaseline(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-effective-patches-for-patch-baseline")
				.argument("baseline-id", baselineId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.describeInstanceAssociationsStatus(instanceId: String, init: AWSSimpleSystemsManagementDescribeInstanceAssociationsStatusCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementDescribeInstanceAssociationsStatusCommand(instanceId).apply(init))
}

@Generated
class AWSSimpleSystemsManagementDescribeInstanceAssociationsStatusCommand(val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceAssociationsStatusRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceAssociationsStatusRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceAssociationsStatusRequest()
		input.setInstanceId(this.instanceId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.describeInstanceAssociationsStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-instance-associations-status")
				.argument("instance-id", instanceId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.describeInstanceInformation(init: AWSSimpleSystemsManagementDescribeInstanceInformationCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementDescribeInstanceInformationCommand().apply(init))
}

@Generated
class AWSSimpleSystemsManagementDescribeInstanceInformationCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeInstanceInformationRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.describeInstanceInformation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-instance-information")
				.argument("instance-information-filter-list", instanceInformationFilterList?.toString())
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.describeInstancePatchStates(instanceIds: List<String>, init: AWSSimpleSystemsManagementDescribeInstancePatchStatesCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementDescribeInstancePatchStatesCommand(instanceIds).apply(init))
}

@Generated
class AWSSimpleSystemsManagementDescribeInstancePatchStatesCommand(val instanceIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesRequest()
		input.setInstanceIds(this.instanceIds)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.describeInstancePatchStates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-instance-patch-states")
				.argument("instance-ids", instanceIds.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.describeInstancePatchStatesForPatchGroup(patchGroup: String, init: AWSSimpleSystemsManagementDescribeInstancePatchStatesForPatchGroupCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementDescribeInstancePatchStatesForPatchGroupCommand(patchGroup).apply(init))
}

@Generated
class AWSSimpleSystemsManagementDescribeInstancePatchStatesForPatchGroupCommand(val patchGroup: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchStatesForPatchGroupRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.describeInstancePatchStatesForPatchGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-instance-patch-states-for-patch-group")
				.argument("patch-group", patchGroup)
				.argument("filters", filters?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.describeInstancePatches(instanceId: String, init: AWSSimpleSystemsManagementDescribeInstancePatchesCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementDescribeInstancePatchesCommand(instanceId).apply(init))
}

@Generated
class AWSSimpleSystemsManagementDescribeInstancePatchesCommand(val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeInstancePatchesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.describeInstancePatches(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-instance-patches")
				.argument("instance-id", instanceId)
				.argument("filters", filters?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.describeMaintenanceWindowExecutionTaskInvocations(windowExecutionId: String, taskId: String, init: AWSSimpleSystemsManagementDescribeMaintenanceWindowExecutionTaskInvocationsCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementDescribeMaintenanceWindowExecutionTaskInvocationsCommand(windowExecutionId, taskId).apply(init))
}

@Generated
class AWSSimpleSystemsManagementDescribeMaintenanceWindowExecutionTaskInvocationsCommand(val windowExecutionId: String, val taskId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTaskInvocationsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.describeMaintenanceWindowExecutionTaskInvocations(build())
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


fun AWSSimpleSystemsManagementFunctions.describeMaintenanceWindowExecutionTasks(windowExecutionId: String, init: AWSSimpleSystemsManagementDescribeMaintenanceWindowExecutionTasksCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementDescribeMaintenanceWindowExecutionTasksCommand(windowExecutionId).apply(init))
}

@Generated
class AWSSimpleSystemsManagementDescribeMaintenanceWindowExecutionTasksCommand(val windowExecutionId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionTasksRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.describeMaintenanceWindowExecutionTasks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-maintenance-window-execution-tasks")
				.argument("window-execution-id", windowExecutionId)
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.describeMaintenanceWindowExecutions(windowId: String, init: AWSSimpleSystemsManagementDescribeMaintenanceWindowExecutionsCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementDescribeMaintenanceWindowExecutionsCommand(windowId).apply(init))
}

@Generated
class AWSSimpleSystemsManagementDescribeMaintenanceWindowExecutionsCommand(val windowId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowExecutionsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.describeMaintenanceWindowExecutions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-maintenance-window-executions")
				.argument("window-id", windowId)
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.describeMaintenanceWindowTargets(windowId: String, init: AWSSimpleSystemsManagementDescribeMaintenanceWindowTargetsCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementDescribeMaintenanceWindowTargetsCommand(windowId).apply(init))
}

@Generated
class AWSSimpleSystemsManagementDescribeMaintenanceWindowTargetsCommand(val windowId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTargetsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.describeMaintenanceWindowTargets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-maintenance-window-targets")
				.argument("window-id", windowId)
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.describeMaintenanceWindowTasks(windowId: String, init: AWSSimpleSystemsManagementDescribeMaintenanceWindowTasksCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementDescribeMaintenanceWindowTasksCommand(windowId).apply(init))
}

@Generated
class AWSSimpleSystemsManagementDescribeMaintenanceWindowTasksCommand(val windowId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowTasksRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.describeMaintenanceWindowTasks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-maintenance-window-tasks")
				.argument("window-id", windowId)
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.describeMaintenanceWindows(init: AWSSimpleSystemsManagementDescribeMaintenanceWindowsCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementDescribeMaintenanceWindowsCommand().apply(init))
}

@Generated
class AWSSimpleSystemsManagementDescribeMaintenanceWindowsCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeMaintenanceWindowsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.describeMaintenanceWindows(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-maintenance-windows")
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.describeParameters(init: AWSSimpleSystemsManagementDescribeParametersCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementDescribeParametersCommand().apply(init))
}

@Generated
class AWSSimpleSystemsManagementDescribeParametersCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribeParametersRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.describeParameters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-parameters")
				.argument("filters", filters?.toString())
				.argument("parameter-filters", parameterFilters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.describePatchBaselines(init: AWSSimpleSystemsManagementDescribePatchBaselinesCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementDescribePatchBaselinesCommand().apply(init))
}

@Generated
class AWSSimpleSystemsManagementDescribePatchBaselinesCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribePatchBaselinesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.describePatchBaselines(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-patch-baselines")
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.describePatchGroupState(patchGroup: String, init: AWSSimpleSystemsManagementDescribePatchGroupStateCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementDescribePatchGroupStateCommand(patchGroup).apply(init))
}

@Generated
class AWSSimpleSystemsManagementDescribePatchGroupStateCommand(val patchGroup: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupStateRequest> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupStateRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupStateRequest()
		input.setPatchGroup(this.patchGroup)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.describePatchGroupState(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-patch-group-state")
				.argument("patch-group", patchGroup)
	}

}


fun AWSSimpleSystemsManagementFunctions.describePatchGroups(init: AWSSimpleSystemsManagementDescribePatchGroupsCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementDescribePatchGroupsCommand().apply(init))
}

@Generated
class AWSSimpleSystemsManagementDescribePatchGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.DescribePatchGroupsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.describePatchGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm describe-patch-groups")
				.argument("max-results", maxResults?.toString())
				.argument("filters", filters?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.getAutomationExecution(automationExecutionId: String, init: AWSSimpleSystemsManagementGetAutomationExecutionCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementGetAutomationExecutionCommand(automationExecutionId).apply(init))
}

@Generated
class AWSSimpleSystemsManagementGetAutomationExecutionCommand(val automationExecutionId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.GetAutomationExecutionRequest> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.GetAutomationExecutionRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.GetAutomationExecutionRequest()
		input.setAutomationExecutionId(this.automationExecutionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.getAutomationExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm get-automation-execution")
				.argument("automation-execution-id", automationExecutionId)
	}

}


fun AWSSimpleSystemsManagementFunctions.getCommandInvocation(commandId: String, instanceId: String, init: AWSSimpleSystemsManagementGetCommandInvocationCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementGetCommandInvocationCommand(commandId, instanceId).apply(init))
}

@Generated
class AWSSimpleSystemsManagementGetCommandInvocationCommand(val commandId: String, val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.GetCommandInvocationRequest> {

	var pluginName: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.GetCommandInvocationRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.GetCommandInvocationRequest()
		input.setCommandId(this.commandId)
		input.setInstanceId(this.instanceId)
		input.setPluginName(this.pluginName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.getCommandInvocation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm get-command-invocation")
				.argument("command-id", commandId)
				.argument("instance-id", instanceId)
				.argument("plugin-name", pluginName)
	}

}


fun AWSSimpleSystemsManagementFunctions.getDefaultPatchBaseline(init: AWSSimpleSystemsManagementGetDefaultPatchBaselineCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementGetDefaultPatchBaselineCommand().apply(init))
}

@Generated
class AWSSimpleSystemsManagementGetDefaultPatchBaselineCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.GetDefaultPatchBaselineRequest> {

	var operatingSystem: OperatingSystem? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.GetDefaultPatchBaselineRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.GetDefaultPatchBaselineRequest()
		input.setOperatingSystem(this.operatingSystem?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.getDefaultPatchBaseline(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm get-default-patch-baseline")
				.argument("operating-system", operatingSystem?.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.getDeployablePatchSnapshotForInstance(instanceId: String, snapshotId: String, init: AWSSimpleSystemsManagementGetDeployablePatchSnapshotForInstanceCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementGetDeployablePatchSnapshotForInstanceCommand(instanceId, snapshotId).apply(init))
}

@Generated
class AWSSimpleSystemsManagementGetDeployablePatchSnapshotForInstanceCommand(val instanceId: String, val snapshotId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.GetDeployablePatchSnapshotForInstanceRequest> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.GetDeployablePatchSnapshotForInstanceRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.GetDeployablePatchSnapshotForInstanceRequest()
		input.setInstanceId(this.instanceId)
		input.setSnapshotId(this.snapshotId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.getDeployablePatchSnapshotForInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm get-deployable-patch-snapshot-for-instance")
				.argument("instance-id", instanceId)
				.argument("snapshot-id", snapshotId)
	}

}


fun AWSSimpleSystemsManagementFunctions.getDocument(name: String, init: AWSSimpleSystemsManagementGetDocumentCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementGetDocumentCommand(name).apply(init))
}

@Generated
class AWSSimpleSystemsManagementGetDocumentCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.GetDocumentRequest> {

	var documentVersion: String? = null
	var documentFormat: DocumentFormat? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.GetDocumentRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.GetDocumentRequest()
		input.setName(this.name)
		input.setDocumentVersion(this.documentVersion)
		input.setDocumentFormat(this.documentFormat?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.getDocument(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm get-document")
				.argument("name", name)
				.argument("document-version", documentVersion)
				.argument("document-format", documentFormat?.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.getInventory(init: AWSSimpleSystemsManagementGetInventoryCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementGetInventoryCommand().apply(init))
}

@Generated
class AWSSimpleSystemsManagementGetInventoryCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.GetInventoryRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.getInventory(build())
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


fun AWSSimpleSystemsManagementFunctions.getInventorySchema(init: AWSSimpleSystemsManagementGetInventorySchemaCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementGetInventorySchemaCommand().apply(init))
}

@Generated
class AWSSimpleSystemsManagementGetInventorySchemaCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.GetInventorySchemaRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.getInventorySchema(build())
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


fun AWSSimpleSystemsManagementFunctions.getMaintenanceWindow(windowId: String, init: AWSSimpleSystemsManagementGetMaintenanceWindowCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementGetMaintenanceWindowCommand(windowId).apply(init))
}

@Generated
class AWSSimpleSystemsManagementGetMaintenanceWindowCommand(val windowId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowRequest> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowRequest()
		input.setWindowId(this.windowId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.getMaintenanceWindow(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm get-maintenance-window")
				.argument("window-id", windowId)
	}

}


fun AWSSimpleSystemsManagementFunctions.getMaintenanceWindowExecution(windowExecutionId: String, init: AWSSimpleSystemsManagementGetMaintenanceWindowExecutionCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementGetMaintenanceWindowExecutionCommand(windowExecutionId).apply(init))
}

@Generated
class AWSSimpleSystemsManagementGetMaintenanceWindowExecutionCommand(val windowExecutionId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionRequest> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionRequest()
		input.setWindowExecutionId(this.windowExecutionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.getMaintenanceWindowExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm get-maintenance-window-execution")
				.argument("window-execution-id", windowExecutionId)
	}

}


fun AWSSimpleSystemsManagementFunctions.getMaintenanceWindowExecutionTask(windowExecutionId: String, taskId: String, init: AWSSimpleSystemsManagementGetMaintenanceWindowExecutionTaskCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementGetMaintenanceWindowExecutionTaskCommand(windowExecutionId, taskId).apply(init))
}

@Generated
class AWSSimpleSystemsManagementGetMaintenanceWindowExecutionTaskCommand(val windowExecutionId: String, val taskId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskRequest> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskRequest()
		input.setWindowExecutionId(this.windowExecutionId)
		input.setTaskId(this.taskId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.getMaintenanceWindowExecutionTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm get-maintenance-window-execution-task")
				.argument("window-execution-id", windowExecutionId)
				.argument("task-id", taskId)
	}

}


fun AWSSimpleSystemsManagementFunctions.getMaintenanceWindowExecutionTaskInvocation(windowExecutionId: String, taskId: String, invocationId: String, init: AWSSimpleSystemsManagementGetMaintenanceWindowExecutionTaskInvocationCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementGetMaintenanceWindowExecutionTaskInvocationCommand(windowExecutionId, taskId, invocationId).apply(init))
}

@Generated
class AWSSimpleSystemsManagementGetMaintenanceWindowExecutionTaskInvocationCommand(val windowExecutionId: String, val taskId: String, val invocationId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskInvocationRequest> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskInvocationRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowExecutionTaskInvocationRequest()
		input.setWindowExecutionId(this.windowExecutionId)
		input.setTaskId(this.taskId)
		input.setInvocationId(this.invocationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.getMaintenanceWindowExecutionTaskInvocation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm get-maintenance-window-execution-task-invocation")
				.argument("window-execution-id", windowExecutionId)
				.argument("task-id", taskId)
				.argument("invocation-id", invocationId)
	}

}


fun AWSSimpleSystemsManagementFunctions.getMaintenanceWindowTask(windowId: String, windowTaskId: String, init: AWSSimpleSystemsManagementGetMaintenanceWindowTaskCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementGetMaintenanceWindowTaskCommand(windowId, windowTaskId).apply(init))
}

@Generated
class AWSSimpleSystemsManagementGetMaintenanceWindowTaskCommand(val windowId: String, val windowTaskId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowTaskRequest> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowTaskRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.GetMaintenanceWindowTaskRequest()
		input.setWindowId(this.windowId)
		input.setWindowTaskId(this.windowTaskId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.getMaintenanceWindowTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm get-maintenance-window-task")
				.argument("window-id", windowId)
				.argument("window-task-id", windowTaskId)
	}

}


fun AWSSimpleSystemsManagementFunctions.getParameter(name: String, init: AWSSimpleSystemsManagementGetParameterCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementGetParameterCommand(name).apply(init))
}

@Generated
class AWSSimpleSystemsManagementGetParameterCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.GetParameterRequest> {

	var withDecryption: Boolean? = false

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.GetParameterRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.GetParameterRequest()
		input.setName(this.name)
		input.setWithDecryption(this.withDecryption)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.getParameter(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm get-parameter")
				.argument("name", name)
				.option("with-decryption", withDecryption ?: false)
	}

}


fun AWSSimpleSystemsManagementFunctions.getParameterHistory(name: String, init: AWSSimpleSystemsManagementGetParameterHistoryCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementGetParameterHistoryCommand(name).apply(init))
}

@Generated
class AWSSimpleSystemsManagementGetParameterHistoryCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.GetParameterHistoryRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.getParameterHistory(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm get-parameter-history")
				.argument("name", name)
				.option("with-decryption", withDecryption ?: false)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.getParameters(names: List<String>, init: AWSSimpleSystemsManagementGetParametersCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementGetParametersCommand(names).apply(init))
}

@Generated
class AWSSimpleSystemsManagementGetParametersCommand(val names: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.GetParametersRequest> {

	var withDecryption: Boolean? = false

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.GetParametersRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.GetParametersRequest()
		input.setNames(this.names)
		input.setWithDecryption(this.withDecryption)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.getParameters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm get-parameters")
				.argument("names", names.toString())
				.option("with-decryption", withDecryption ?: false)
	}

}


fun AWSSimpleSystemsManagementFunctions.getParametersByPath(path: String, init: AWSSimpleSystemsManagementGetParametersByPathCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementGetParametersByPathCommand(path).apply(init))
}

@Generated
class AWSSimpleSystemsManagementGetParametersByPathCommand(val path: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.GetParametersByPathRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.getParametersByPath(build())
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


fun AWSSimpleSystemsManagementFunctions.getPatchBaseline(baselineId: String, init: AWSSimpleSystemsManagementGetPatchBaselineCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementGetPatchBaselineCommand(baselineId).apply(init))
}

@Generated
class AWSSimpleSystemsManagementGetPatchBaselineCommand(val baselineId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineRequest> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineRequest()
		input.setBaselineId(this.baselineId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.getPatchBaseline(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm get-patch-baseline")
				.argument("baseline-id", baselineId)
	}

}


fun AWSSimpleSystemsManagementFunctions.getPatchBaselineForPatchGroup(patchGroup: String, init: AWSSimpleSystemsManagementGetPatchBaselineForPatchGroupCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementGetPatchBaselineForPatchGroupCommand(patchGroup).apply(init))
}

@Generated
class AWSSimpleSystemsManagementGetPatchBaselineForPatchGroupCommand(val patchGroup: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineForPatchGroupRequest> {

	var operatingSystem: OperatingSystem? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineForPatchGroupRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.GetPatchBaselineForPatchGroupRequest()
		input.setPatchGroup(this.patchGroup)
		input.setOperatingSystem(this.operatingSystem?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.getPatchBaselineForPatchGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm get-patch-baseline-for-patch-group")
				.argument("patch-group", patchGroup)
				.argument("operating-system", operatingSystem?.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.listAssociationVersions(associationId: String, init: AWSSimpleSystemsManagementListAssociationVersionsCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementListAssociationVersionsCommand(associationId).apply(init))
}

@Generated
class AWSSimpleSystemsManagementListAssociationVersionsCommand(val associationId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.ListAssociationVersionsRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.ListAssociationVersionsRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.ListAssociationVersionsRequest()
		input.setAssociationId(this.associationId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.listAssociationVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm list-association-versions")
				.argument("association-id", associationId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.listAssociations(init: AWSSimpleSystemsManagementListAssociationsCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementListAssociationsCommand().apply(init))
}

@Generated
class AWSSimpleSystemsManagementListAssociationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.ListAssociationsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.listAssociations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm list-associations")
				.argument("association-filter-list", associationFilterList?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.listCommandInvocations(init: AWSSimpleSystemsManagementListCommandInvocationsCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementListCommandInvocationsCommand().apply(init))
}

@Generated
class AWSSimpleSystemsManagementListCommandInvocationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.ListCommandInvocationsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.listCommandInvocations(build())
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


fun AWSSimpleSystemsManagementFunctions.listCommands(init: AWSSimpleSystemsManagementListCommandsCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementListCommandsCommand().apply(init))
}

@Generated
class AWSSimpleSystemsManagementListCommandsCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.ListCommandsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.listCommands(build())
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


fun AWSSimpleSystemsManagementFunctions.listComplianceItems(init: AWSSimpleSystemsManagementListComplianceItemsCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementListComplianceItemsCommand().apply(init))
}

@Generated
class AWSSimpleSystemsManagementListComplianceItemsCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.ListComplianceItemsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.listComplianceItems(build())
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


fun AWSSimpleSystemsManagementFunctions.listComplianceSummaries(init: AWSSimpleSystemsManagementListComplianceSummariesCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementListComplianceSummariesCommand().apply(init))
}

@Generated
class AWSSimpleSystemsManagementListComplianceSummariesCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.ListComplianceSummariesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.listComplianceSummaries(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm list-compliance-summaries")
				.argument("filters", filters?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.listDocumentVersions(name: String, init: AWSSimpleSystemsManagementListDocumentVersionsCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementListDocumentVersionsCommand(name).apply(init))
}

@Generated
class AWSSimpleSystemsManagementListDocumentVersionsCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.ListDocumentVersionsRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.ListDocumentVersionsRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.ListDocumentVersionsRequest()
		input.setName(this.name)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.listDocumentVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm list-document-versions")
				.argument("name", name)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.listDocuments(init: AWSSimpleSystemsManagementListDocumentsCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementListDocumentsCommand().apply(init))
}

@Generated
class AWSSimpleSystemsManagementListDocumentsCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.ListDocumentsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.listDocuments(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm list-documents")
				.argument("document-filter-list", documentFilterList?.toString())
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSimpleSystemsManagementFunctions.listInventoryEntries(instanceId: String, typeName: String, init: AWSSimpleSystemsManagementListInventoryEntriesCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementListInventoryEntriesCommand(instanceId, typeName).apply(init))
}

@Generated
class AWSSimpleSystemsManagementListInventoryEntriesCommand(val instanceId: String, val typeName: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.ListInventoryEntriesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.listInventoryEntries(build())
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


fun AWSSimpleSystemsManagementFunctions.listResourceComplianceSummaries(init: AWSSimpleSystemsManagementListResourceComplianceSummariesCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementListResourceComplianceSummariesCommand().apply(init))
}

@Generated
class AWSSimpleSystemsManagementListResourceComplianceSummariesCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.ListResourceComplianceSummariesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.listResourceComplianceSummaries(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm list-resource-compliance-summaries")
				.argument("filters", filters?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.listResourceDataSync(init: AWSSimpleSystemsManagementListResourceDataSyncCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementListResourceDataSyncCommand().apply(init))
}

@Generated
class AWSSimpleSystemsManagementListResourceDataSyncCommand() : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.ListResourceDataSyncRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.ListResourceDataSyncRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.ListResourceDataSyncRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.listResourceDataSync(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm list-resource-data-sync")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.listTagsForResource(resourceType: ResourceTypeForTagging, resourceId: String, init: AWSSimpleSystemsManagementListTagsForResourceCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementListTagsForResourceCommand(resourceType, resourceId).apply(init))
}

@Generated
class AWSSimpleSystemsManagementListTagsForResourceCommand(val resourceType: ResourceTypeForTagging, val resourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.ListTagsForResourceRequest> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.ListTagsForResourceRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.ListTagsForResourceRequest()
		input.setResourceType(this.resourceType.toString())
		input.setResourceId(this.resourceId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.listTagsForResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm list-tags-for-resource")
				.argument("resource-type", resourceType.toString())
				.argument("resource-id", resourceId)
	}

}


fun AWSSimpleSystemsManagementFunctions.modifyDocumentPermission(name: String, permissionType: DocumentPermissionType, init: AWSSimpleSystemsManagementModifyDocumentPermissionCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementModifyDocumentPermissionCommand(name, permissionType).apply(init))
}

@Generated
class AWSSimpleSystemsManagementModifyDocumentPermissionCommand(val name: String, val permissionType: DocumentPermissionType) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.ModifyDocumentPermissionRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.modifyDocumentPermission(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm modify-document-permission")
				.argument("name", name)
				.argument("permission-type", permissionType.toString())
				.argument("account-ids-to-add", accountIdsToAdd?.toString())
				.argument("account-ids-to-remove", accountIdsToRemove?.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.putComplianceItems(resourceId: String, resourceType: String, complianceType: String, executionSummary: com.amazonaws.services.simplesystemsmanagement.model.ComplianceExecutionSummary, items: List<com.amazonaws.services.simplesystemsmanagement.model.ComplianceItemEntry>, init: AWSSimpleSystemsManagementPutComplianceItemsCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementPutComplianceItemsCommand(resourceId, resourceType, complianceType, executionSummary, items).apply(init))
}

@Generated
class AWSSimpleSystemsManagementPutComplianceItemsCommand(val resourceId: String, val resourceType: String, val complianceType: String, val executionSummary: com.amazonaws.services.simplesystemsmanagement.model.ComplianceExecutionSummary, val items: List<com.amazonaws.services.simplesystemsmanagement.model.ComplianceItemEntry>) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.PutComplianceItemsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.putComplianceItems(build())
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


fun AWSSimpleSystemsManagementFunctions.putInventory(instanceId: String, items: List<com.amazonaws.services.simplesystemsmanagement.model.InventoryItem>, init: AWSSimpleSystemsManagementPutInventoryCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementPutInventoryCommand(instanceId, items).apply(init))
}

@Generated
class AWSSimpleSystemsManagementPutInventoryCommand(val instanceId: String, val items: List<com.amazonaws.services.simplesystemsmanagement.model.InventoryItem>) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.PutInventoryRequest> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.PutInventoryRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.PutInventoryRequest()
		input.setInstanceId(this.instanceId)
		input.setItems(this.items)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.putInventory(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm put-inventory")
				.argument("instance-id", instanceId)
				.argument("items", items.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.putParameter(name: String, value: String, type: ParameterType, init: AWSSimpleSystemsManagementPutParameterCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementPutParameterCommand(name, value, type).apply(init))
}

@Generated
class AWSSimpleSystemsManagementPutParameterCommand(val name: String, val value: String, val type: ParameterType) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.PutParameterRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.putParameter(build())
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


fun AWSSimpleSystemsManagementFunctions.registerDefaultPatchBaseline(baselineId: String, init: AWSSimpleSystemsManagementRegisterDefaultPatchBaselineCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementRegisterDefaultPatchBaselineCommand(baselineId).apply(init))
}

@Generated
class AWSSimpleSystemsManagementRegisterDefaultPatchBaselineCommand(val baselineId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.RegisterDefaultPatchBaselineRequest> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.RegisterDefaultPatchBaselineRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.RegisterDefaultPatchBaselineRequest()
		input.setBaselineId(this.baselineId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.registerDefaultPatchBaseline(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm register-default-patch-baseline")
				.argument("baseline-id", baselineId)
	}

}


fun AWSSimpleSystemsManagementFunctions.registerPatchBaselineForPatchGroup(baselineId: String, patchGroup: String, init: AWSSimpleSystemsManagementRegisterPatchBaselineForPatchGroupCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementRegisterPatchBaselineForPatchGroupCommand(baselineId, patchGroup).apply(init))
}

@Generated
class AWSSimpleSystemsManagementRegisterPatchBaselineForPatchGroupCommand(val baselineId: String, val patchGroup: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.RegisterPatchBaselineForPatchGroupRequest> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.RegisterPatchBaselineForPatchGroupRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.RegisterPatchBaselineForPatchGroupRequest()
		input.setBaselineId(this.baselineId)
		input.setPatchGroup(this.patchGroup)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.registerPatchBaselineForPatchGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm register-patch-baseline-for-patch-group")
				.argument("baseline-id", baselineId)
				.argument("patch-group", patchGroup)
	}

}


fun AWSSimpleSystemsManagementFunctions.registerTargetWithMaintenanceWindow(windowId: String, resourceType: MaintenanceWindowResourceType, targets: List<com.amazonaws.services.simplesystemsmanagement.model.Target>, init: AWSSimpleSystemsManagementRegisterTargetWithMaintenanceWindowCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementRegisterTargetWithMaintenanceWindowCommand(windowId, resourceType, targets).apply(init))
}

@Generated
class AWSSimpleSystemsManagementRegisterTargetWithMaintenanceWindowCommand(val windowId: String, val resourceType: MaintenanceWindowResourceType, val targets: List<com.amazonaws.services.simplesystemsmanagement.model.Target>) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.RegisterTargetWithMaintenanceWindowRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.registerTargetWithMaintenanceWindow(build())
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


fun AWSSimpleSystemsManagementFunctions.registerTaskWithMaintenanceWindow(windowId: String, targets: List<com.amazonaws.services.simplesystemsmanagement.model.Target>, taskArn: String, serviceRoleArn: String, taskType: MaintenanceWindowTaskType, maxConcurrency: String, maxErrors: String, init: AWSSimpleSystemsManagementRegisterTaskWithMaintenanceWindowCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementRegisterTaskWithMaintenanceWindowCommand(windowId, targets, taskArn, serviceRoleArn, taskType, maxConcurrency, maxErrors).apply(init))
}

@Generated
class AWSSimpleSystemsManagementRegisterTaskWithMaintenanceWindowCommand(val windowId: String, val targets: List<com.amazonaws.services.simplesystemsmanagement.model.Target>, val taskArn: String, val serviceRoleArn: String, val taskType: MaintenanceWindowTaskType, val maxConcurrency: String, val maxErrors: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.RegisterTaskWithMaintenanceWindowRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.registerTaskWithMaintenanceWindow(build())
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


fun AWSSimpleSystemsManagementFunctions.removeTagsFromResource(resourceType: ResourceTypeForTagging, resourceId: String, tagKeys: List<String>, init: AWSSimpleSystemsManagementRemoveTagsFromResourceCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementRemoveTagsFromResourceCommand(resourceType, resourceId, tagKeys).apply(init))
}

@Generated
class AWSSimpleSystemsManagementRemoveTagsFromResourceCommand(val resourceType: ResourceTypeForTagging, val resourceId: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.RemoveTagsFromResourceRequest> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.RemoveTagsFromResourceRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.RemoveTagsFromResourceRequest()
		input.setResourceType(this.resourceType.toString())
		input.setResourceId(this.resourceId)
		input.setTagKeys(this.tagKeys)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.removeTagsFromResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm remove-tags-from-resource")
				.argument("resource-type", resourceType.toString())
				.argument("resource-id", resourceId)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.sendAutomationSignal(automationExecutionId: String, signalType: SignalType, init: AWSSimpleSystemsManagementSendAutomationSignalCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementSendAutomationSignalCommand(automationExecutionId, signalType).apply(init))
}

@Generated
class AWSSimpleSystemsManagementSendAutomationSignalCommand(val automationExecutionId: String, val signalType: SignalType) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.SendAutomationSignalRequest> {

	var payload: Map<String, List<String>>? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.SendAutomationSignalRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.SendAutomationSignalRequest()
		input.setAutomationExecutionId(this.automationExecutionId)
		input.setSignalType(this.signalType.toString())
		input.setPayload(this.payload)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.sendAutomationSignal(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm send-automation-signal")
				.argument("automation-execution-id", automationExecutionId)
				.argument("signal-type", signalType.toString())
				.argument("payload", payload?.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.sendCommand(documentName: String, init: AWSSimpleSystemsManagementSendCommandCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementSendCommandCommand(documentName).apply(init))
}

@Generated
class AWSSimpleSystemsManagementSendCommandCommand(val documentName: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.SendCommandRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.sendCommand(build())
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


fun AWSSimpleSystemsManagementFunctions.startAutomationExecution(documentName: String, init: AWSSimpleSystemsManagementStartAutomationExecutionCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementStartAutomationExecutionCommand(documentName).apply(init))
}

@Generated
class AWSSimpleSystemsManagementStartAutomationExecutionCommand(val documentName: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.StartAutomationExecutionRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.startAutomationExecution(build())
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


fun AWSSimpleSystemsManagementFunctions.stopAutomationExecution(automationExecutionId: String, init: AWSSimpleSystemsManagementStopAutomationExecutionCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementStopAutomationExecutionCommand(automationExecutionId).apply(init))
}

@Generated
class AWSSimpleSystemsManagementStopAutomationExecutionCommand(val automationExecutionId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.StopAutomationExecutionRequest> {

	var type: StopType? = null

	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.StopAutomationExecutionRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.StopAutomationExecutionRequest()
		input.setAutomationExecutionId(this.automationExecutionId)
		input.setType(this.type?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.stopAutomationExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm stop-automation-execution")
				.argument("automation-execution-id", automationExecutionId)
				.argument("type", type?.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.updateAssociation(associationId: String, init: AWSSimpleSystemsManagementUpdateAssociationCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementUpdateAssociationCommand(associationId).apply(init))
}

@Generated
class AWSSimpleSystemsManagementUpdateAssociationCommand(val associationId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.updateAssociation(build())
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


fun AWSSimpleSystemsManagementFunctions.updateAssociationStatus(name: String, instanceId: String, associationStatus: com.amazonaws.services.simplesystemsmanagement.model.AssociationStatus, init: AWSSimpleSystemsManagementUpdateAssociationStatusCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementUpdateAssociationStatusCommand(name, instanceId, associationStatus).apply(init))
}

@Generated
class AWSSimpleSystemsManagementUpdateAssociationStatusCommand(val name: String, val instanceId: String, val associationStatus: com.amazonaws.services.simplesystemsmanagement.model.AssociationStatus) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationStatusRequest> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationStatusRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.UpdateAssociationStatusRequest()
		input.setName(this.name)
		input.setInstanceId(this.instanceId)
		input.setAssociationStatus(this.associationStatus)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.updateAssociationStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm update-association-status")
				.argument("name", name)
				.argument("instance-id", instanceId)
				.argument("association-status", associationStatus.toString())
	}

}


fun AWSSimpleSystemsManagementFunctions.updateDocument(content: String, name: String, init: AWSSimpleSystemsManagementUpdateDocumentCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementUpdateDocumentCommand(content, name).apply(init))
}

@Generated
class AWSSimpleSystemsManagementUpdateDocumentCommand(val content: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.updateDocument(build())
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


fun AWSSimpleSystemsManagementFunctions.updateDocumentDefaultVersion(name: String, documentVersion: String, init: AWSSimpleSystemsManagementUpdateDocumentDefaultVersionCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementUpdateDocumentDefaultVersionCommand(name, documentVersion).apply(init))
}

@Generated
class AWSSimpleSystemsManagementUpdateDocumentDefaultVersionCommand(val name: String, val documentVersion: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentDefaultVersionRequest> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentDefaultVersionRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.UpdateDocumentDefaultVersionRequest()
		input.setName(this.name)
		input.setDocumentVersion(this.documentVersion)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.updateDocumentDefaultVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm update-document-default-version")
				.argument("name", name)
				.argument("document-version", documentVersion)
	}

}


fun AWSSimpleSystemsManagementFunctions.updateMaintenanceWindow(windowId: String, init: AWSSimpleSystemsManagementUpdateMaintenanceWindowCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementUpdateMaintenanceWindowCommand(windowId).apply(init))
}

@Generated
class AWSSimpleSystemsManagementUpdateMaintenanceWindowCommand(val windowId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.updateMaintenanceWindow(build())
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


fun AWSSimpleSystemsManagementFunctions.updateMaintenanceWindowTarget(windowId: String, windowTargetId: String, init: AWSSimpleSystemsManagementUpdateMaintenanceWindowTargetCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementUpdateMaintenanceWindowTargetCommand(windowId, windowTargetId).apply(init))
}

@Generated
class AWSSimpleSystemsManagementUpdateMaintenanceWindowTargetCommand(val windowId: String, val windowTargetId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTargetRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.updateMaintenanceWindowTarget(build())
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


fun AWSSimpleSystemsManagementFunctions.updateMaintenanceWindowTask(windowId: String, windowTaskId: String, init: AWSSimpleSystemsManagementUpdateMaintenanceWindowTaskCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementUpdateMaintenanceWindowTaskCommand(windowId, windowTaskId).apply(init))
}

@Generated
class AWSSimpleSystemsManagementUpdateMaintenanceWindowTaskCommand(val windowId: String, val windowTaskId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.UpdateMaintenanceWindowTaskRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.updateMaintenanceWindowTask(build())
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


fun AWSSimpleSystemsManagementFunctions.updateManagedInstanceRole(instanceId: String, iamRole: String, init: AWSSimpleSystemsManagementUpdateManagedInstanceRoleCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementUpdateManagedInstanceRoleCommand(instanceId, iamRole).apply(init))
}

@Generated
class AWSSimpleSystemsManagementUpdateManagedInstanceRoleCommand(val instanceId: String, val iamRole: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.UpdateManagedInstanceRoleRequest> {



	override fun build(): com.amazonaws.services.simplesystemsmanagement.model.UpdateManagedInstanceRoleRequest {
		val input = com.amazonaws.services.simplesystemsmanagement.model.UpdateManagedInstanceRoleRequest()
		input.setInstanceId(this.instanceId)
		input.setIamRole(this.iamRole)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.updateManagedInstanceRole(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ssm update-managed-instance-role")
				.argument("instance-id", instanceId)
				.argument("iam-role", iamRole)
	}

}


fun AWSSimpleSystemsManagementFunctions.updatePatchBaseline(baselineId: String, init: AWSSimpleSystemsManagementUpdatePatchBaselineCommand.() -> Unit) {
	this.block.declare(AWSSimpleSystemsManagementUpdatePatchBaselineCommand(baselineId).apply(init))
}

@Generated
class AWSSimpleSystemsManagementUpdatePatchBaselineCommand(val baselineId: String) : AmazonWebServiceCommand<com.amazonaws.services.simplesystemsmanagement.model.UpdatePatchBaselineRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ssm.updatePatchBaseline(build())
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
