
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceVoidCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.workdocs.AmazonWorkDocs
import com.amazonaws.services.workdocs.AmazonWorkDocsClientBuilder
import com.amazonaws.services.workdocs.model.*

var codingue.koops.core.Environment.workdocs: AmazonWorkDocs
	get() {
		var service = this.capabilities[AmazonWorkDocs::class.java.name]
		if (service == null) {
			service = AmazonWorkDocsClientBuilder.standard().build()
			workdocs = service
		}
		return service as AmazonWorkDocs
	}
	set(workdocs) {
		this.capabilities[AmazonWorkDocs::class.java.name] = workdocs
	}

@Generated
class AmazonWorkDocsFunctions(val block: Block)

infix fun <T> AwsContinuation.workdocs(init: AmazonWorkDocsFunctions.() -> T): T {
	return AmazonWorkDocsFunctions(shell).run(init)
}

			

fun AmazonWorkDocsFunctions.abortDocumentVersionUpload(documentId: String, versionId: String, init: AmazonWorkDocsAbortDocumentVersionUploadCommand.() -> Unit): com.amazonaws.services.workdocs.model.AbortDocumentVersionUploadResult {
	return this.block.declare(AmazonWorkDocsAbortDocumentVersionUploadCommand(documentId, versionId).apply(init)) as com.amazonaws.services.workdocs.model.AbortDocumentVersionUploadResult
}

@Generated
class AmazonWorkDocsAbortDocumentVersionUploadCommand(val documentId: String, val versionId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.AbortDocumentVersionUploadRequest, com.amazonaws.services.workdocs.model.AbortDocumentVersionUploadResult> {

	var authenticationToken: String? = null

	override fun build(): com.amazonaws.services.workdocs.model.AbortDocumentVersionUploadRequest {
		val input = com.amazonaws.services.workdocs.model.AbortDocumentVersionUploadRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setDocumentId(this.documentId)
		input.setVersionId(this.versionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.AbortDocumentVersionUploadResult {
	  return com.amazonaws.services.workdocs.model.AbortDocumentVersionUploadResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.AbortDocumentVersionUploadResult {
		return environment.workdocs.abortDocumentVersionUpload(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs abort-document-version-upload")
				.argument("authentication-token", authenticationToken)
				.argument("document-id", documentId)
				.argument("version-id", versionId)
	}

}


fun AmazonWorkDocsFunctions.activateUser(userId: String, init: AmazonWorkDocsActivateUserCommand.() -> Unit): com.amazonaws.services.workdocs.model.ActivateUserResult {
	return this.block.declare(AmazonWorkDocsActivateUserCommand(userId).apply(init)) as com.amazonaws.services.workdocs.model.ActivateUserResult
}

@Generated
class AmazonWorkDocsActivateUserCommand(val userId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.ActivateUserRequest, com.amazonaws.services.workdocs.model.ActivateUserResult> {

	var authenticationToken: String? = null

	override fun build(): com.amazonaws.services.workdocs.model.ActivateUserRequest {
		val input = com.amazonaws.services.workdocs.model.ActivateUserRequest()
		input.setUserId(this.userId)
		input.setAuthenticationToken(this.authenticationToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.ActivateUserResult {
	  return com.amazonaws.services.workdocs.model.ActivateUserResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.ActivateUserResult {
		return environment.workdocs.activateUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs activate-user")
				.argument("user-id", userId)
				.argument("authentication-token", authenticationToken)
	}

}


fun AmazonWorkDocsFunctions.addResourcePermissions(resourceId: String, principals: List<com.amazonaws.services.workdocs.model.SharePrincipal>, init: AmazonWorkDocsAddResourcePermissionsCommand.() -> Unit): com.amazonaws.services.workdocs.model.AddResourcePermissionsResult {
	return this.block.declare(AmazonWorkDocsAddResourcePermissionsCommand(resourceId, principals).apply(init)) as com.amazonaws.services.workdocs.model.AddResourcePermissionsResult
}

@Generated
class AmazonWorkDocsAddResourcePermissionsCommand(val resourceId: String, val principals: List<com.amazonaws.services.workdocs.model.SharePrincipal>) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.AddResourcePermissionsRequest, com.amazonaws.services.workdocs.model.AddResourcePermissionsResult> {

	var authenticationToken: String? = null
	var notificationOptions: com.amazonaws.services.workdocs.model.NotificationOptions? = null

	override fun build(): com.amazonaws.services.workdocs.model.AddResourcePermissionsRequest {
		val input = com.amazonaws.services.workdocs.model.AddResourcePermissionsRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setResourceId(this.resourceId)
		input.setPrincipals(this.principals)
		input.setNotificationOptions(this.notificationOptions)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.AddResourcePermissionsResult {
	  return com.amazonaws.services.workdocs.model.AddResourcePermissionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.AddResourcePermissionsResult {
		return environment.workdocs.addResourcePermissions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs add-resource-permissions")
				.argument("authentication-token", authenticationToken)
				.argument("resource-id", resourceId)
				.argument("principals", principals.toString())
				.argument("notification-options", notificationOptions?.toString())
	}

}


fun AmazonWorkDocsFunctions.createComment(documentId: String, versionId: String, text: String, init: AmazonWorkDocsCreateCommentCommand.() -> Unit): com.amazonaws.services.workdocs.model.CreateCommentResult {
	return this.block.declare(AmazonWorkDocsCreateCommentCommand(documentId, versionId, text).apply(init)) as com.amazonaws.services.workdocs.model.CreateCommentResult
}

@Generated
class AmazonWorkDocsCreateCommentCommand(val documentId: String, val versionId: String, val text: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.CreateCommentRequest, com.amazonaws.services.workdocs.model.CreateCommentResult> {

	var authenticationToken: String? = null
	var parentId: String? = null
	var threadId: String? = null
	var visibility: CommentVisibilityType? = null
	var notifyCollaborators: Boolean? = false

	override fun build(): com.amazonaws.services.workdocs.model.CreateCommentRequest {
		val input = com.amazonaws.services.workdocs.model.CreateCommentRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setDocumentId(this.documentId)
		input.setVersionId(this.versionId)
		input.setParentId(this.parentId)
		input.setThreadId(this.threadId)
		input.setText(this.text)
		input.setVisibility(this.visibility?.toString())
		input.setNotifyCollaborators(this.notifyCollaborators)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.CreateCommentResult {
	  return com.amazonaws.services.workdocs.model.CreateCommentResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.CreateCommentResult {
		return environment.workdocs.createComment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs create-comment")
				.argument("authentication-token", authenticationToken)
				.argument("document-id", documentId)
				.argument("version-id", versionId)
				.argument("parent-id", parentId)
				.argument("thread-id", threadId)
				.argument("text", text)
				.argument("visibility", visibility?.toString())
				.option("notify-collaborators", notifyCollaborators ?: false)
	}

}


fun AmazonWorkDocsFunctions.createCustomMetadata(resourceId: String, customMetadata: Map<String, String>, init: AmazonWorkDocsCreateCustomMetadataCommand.() -> Unit): com.amazonaws.services.workdocs.model.CreateCustomMetadataResult {
	return this.block.declare(AmazonWorkDocsCreateCustomMetadataCommand(resourceId, customMetadata).apply(init)) as com.amazonaws.services.workdocs.model.CreateCustomMetadataResult
}

@Generated
class AmazonWorkDocsCreateCustomMetadataCommand(val resourceId: String, val customMetadata: Map<String, String>) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.CreateCustomMetadataRequest, com.amazonaws.services.workdocs.model.CreateCustomMetadataResult> {

	var authenticationToken: String? = null
	var versionId: String? = null

	override fun build(): com.amazonaws.services.workdocs.model.CreateCustomMetadataRequest {
		val input = com.amazonaws.services.workdocs.model.CreateCustomMetadataRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setResourceId(this.resourceId)
		input.setVersionId(this.versionId)
		input.setCustomMetadata(this.customMetadata)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.CreateCustomMetadataResult {
	  return com.amazonaws.services.workdocs.model.CreateCustomMetadataResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.CreateCustomMetadataResult {
		return environment.workdocs.createCustomMetadata(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs create-custom-metadata")
				.argument("authentication-token", authenticationToken)
				.argument("resource-id", resourceId)
				.argument("version-id", versionId)
				.argument("custom-metadata", customMetadata.toString())
	}

}


fun AmazonWorkDocsFunctions.createFolder(parentFolderId: String, init: AmazonWorkDocsCreateFolderCommand.() -> Unit): com.amazonaws.services.workdocs.model.CreateFolderResult {
	return this.block.declare(AmazonWorkDocsCreateFolderCommand(parentFolderId).apply(init)) as com.amazonaws.services.workdocs.model.CreateFolderResult
}

@Generated
class AmazonWorkDocsCreateFolderCommand(val parentFolderId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.CreateFolderRequest, com.amazonaws.services.workdocs.model.CreateFolderResult> {

	var authenticationToken: String? = null
	var name: String? = null

	override fun build(): com.amazonaws.services.workdocs.model.CreateFolderRequest {
		val input = com.amazonaws.services.workdocs.model.CreateFolderRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setName(this.name)
		input.setParentFolderId(this.parentFolderId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.CreateFolderResult {
	  return com.amazonaws.services.workdocs.model.CreateFolderResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.CreateFolderResult {
		return environment.workdocs.createFolder(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs create-folder")
				.argument("authentication-token", authenticationToken)
				.argument("name", name)
				.argument("parent-folder-id", parentFolderId)
	}

}


fun AmazonWorkDocsFunctions.createLabels(resourceId: String, labels: List<String>, init: AmazonWorkDocsCreateLabelsCommand.() -> Unit): com.amazonaws.services.workdocs.model.CreateLabelsResult {
	return this.block.declare(AmazonWorkDocsCreateLabelsCommand(resourceId, labels).apply(init)) as com.amazonaws.services.workdocs.model.CreateLabelsResult
}

@Generated
class AmazonWorkDocsCreateLabelsCommand(val resourceId: String, val labels: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.CreateLabelsRequest, com.amazonaws.services.workdocs.model.CreateLabelsResult> {

	var authenticationToken: String? = null

	override fun build(): com.amazonaws.services.workdocs.model.CreateLabelsRequest {
		val input = com.amazonaws.services.workdocs.model.CreateLabelsRequest()
		input.setResourceId(this.resourceId)
		input.setLabels(this.labels)
		input.setAuthenticationToken(this.authenticationToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.CreateLabelsResult {
	  return com.amazonaws.services.workdocs.model.CreateLabelsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.CreateLabelsResult {
		return environment.workdocs.createLabels(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs create-labels")
				.argument("resource-id", resourceId)
				.argument("labels", labels.toString())
				.argument("authentication-token", authenticationToken)
	}

}


fun AmazonWorkDocsFunctions.createNotificationSubscription(organizationId: String, endpoint: String, protocol: SubscriptionProtocolType, subscriptionType: SubscriptionType, init: AmazonWorkDocsCreateNotificationSubscriptionCommand.() -> Unit): com.amazonaws.services.workdocs.model.CreateNotificationSubscriptionResult {
	return this.block.declare(AmazonWorkDocsCreateNotificationSubscriptionCommand(organizationId, endpoint, protocol, subscriptionType).apply(init)) as com.amazonaws.services.workdocs.model.CreateNotificationSubscriptionResult
}

@Generated
class AmazonWorkDocsCreateNotificationSubscriptionCommand(val organizationId: String, val endpoint: String, val protocol: SubscriptionProtocolType, val subscriptionType: SubscriptionType) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.CreateNotificationSubscriptionRequest, com.amazonaws.services.workdocs.model.CreateNotificationSubscriptionResult> {



	override fun build(): com.amazonaws.services.workdocs.model.CreateNotificationSubscriptionRequest {
		val input = com.amazonaws.services.workdocs.model.CreateNotificationSubscriptionRequest()
		input.setOrganizationId(this.organizationId)
		input.setEndpoint(this.endpoint)
		input.setProtocol(this.protocol.toString())
		input.setSubscriptionType(this.subscriptionType.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.CreateNotificationSubscriptionResult {
	  return com.amazonaws.services.workdocs.model.CreateNotificationSubscriptionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.CreateNotificationSubscriptionResult {
		return environment.workdocs.createNotificationSubscription(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs create-notification-subscription")
				.argument("organization-id", organizationId)
				.argument("endpoint", endpoint)
				.argument("protocol", protocol.toString())
				.argument("subscription-type", subscriptionType.toString())
	}

}


fun AmazonWorkDocsFunctions.createUser(username: String, givenName: String, surname: String, password: String, init: AmazonWorkDocsCreateUserCommand.() -> Unit): com.amazonaws.services.workdocs.model.CreateUserResult {
	return this.block.declare(AmazonWorkDocsCreateUserCommand(username, givenName, surname, password).apply(init)) as com.amazonaws.services.workdocs.model.CreateUserResult
}

@Generated
class AmazonWorkDocsCreateUserCommand(val username: String, val givenName: String, val surname: String, val password: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.CreateUserRequest, com.amazonaws.services.workdocs.model.CreateUserResult> {

	var organizationId: String? = null
	var emailAddress: String? = null
	var timeZoneId: String? = null
	var storageRule: com.amazonaws.services.workdocs.model.StorageRuleType? = null
	var authenticationToken: String? = null

	override fun build(): com.amazonaws.services.workdocs.model.CreateUserRequest {
		val input = com.amazonaws.services.workdocs.model.CreateUserRequest()
		input.setOrganizationId(this.organizationId)
		input.setUsername(this.username)
		input.setEmailAddress(this.emailAddress)
		input.setGivenName(this.givenName)
		input.setSurname(this.surname)
		input.setPassword(this.password)
		input.setTimeZoneId(this.timeZoneId)
		input.setStorageRule(this.storageRule)
		input.setAuthenticationToken(this.authenticationToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.CreateUserResult {
	  return com.amazonaws.services.workdocs.model.CreateUserResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.CreateUserResult {
		return environment.workdocs.createUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs create-user")
				.argument("organization-id", organizationId)
				.argument("username", username)
				.argument("email-address", emailAddress)
				.argument("given-name", givenName)
				.argument("surname", surname)
				.argument("password", password)
				.argument("time-zone-id", timeZoneId)
				.argument("storage-rule", storageRule?.toString())
				.argument("authentication-token", authenticationToken)
	}

}


fun AmazonWorkDocsFunctions.deactivateUser(userId: String, init: AmazonWorkDocsDeactivateUserCommand.() -> Unit): com.amazonaws.services.workdocs.model.DeactivateUserResult {
	return this.block.declare(AmazonWorkDocsDeactivateUserCommand(userId).apply(init)) as com.amazonaws.services.workdocs.model.DeactivateUserResult
}

@Generated
class AmazonWorkDocsDeactivateUserCommand(val userId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.DeactivateUserRequest, com.amazonaws.services.workdocs.model.DeactivateUserResult> {

	var authenticationToken: String? = null

	override fun build(): com.amazonaws.services.workdocs.model.DeactivateUserRequest {
		val input = com.amazonaws.services.workdocs.model.DeactivateUserRequest()
		input.setUserId(this.userId)
		input.setAuthenticationToken(this.authenticationToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.DeactivateUserResult {
	  return com.amazonaws.services.workdocs.model.DeactivateUserResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.DeactivateUserResult {
		return environment.workdocs.deactivateUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs deactivate-user")
				.argument("user-id", userId)
				.argument("authentication-token", authenticationToken)
	}

}


fun AmazonWorkDocsFunctions.deleteComment(documentId: String, versionId: String, commentId: String, init: AmazonWorkDocsDeleteCommentCommand.() -> Unit): com.amazonaws.services.workdocs.model.DeleteCommentResult {
	return this.block.declare(AmazonWorkDocsDeleteCommentCommand(documentId, versionId, commentId).apply(init)) as com.amazonaws.services.workdocs.model.DeleteCommentResult
}

@Generated
class AmazonWorkDocsDeleteCommentCommand(val documentId: String, val versionId: String, val commentId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.DeleteCommentRequest, com.amazonaws.services.workdocs.model.DeleteCommentResult> {

	var authenticationToken: String? = null

	override fun build(): com.amazonaws.services.workdocs.model.DeleteCommentRequest {
		val input = com.amazonaws.services.workdocs.model.DeleteCommentRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setDocumentId(this.documentId)
		input.setVersionId(this.versionId)
		input.setCommentId(this.commentId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.DeleteCommentResult {
	  return com.amazonaws.services.workdocs.model.DeleteCommentResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.DeleteCommentResult {
		return environment.workdocs.deleteComment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs delete-comment")
				.argument("authentication-token", authenticationToken)
				.argument("document-id", documentId)
				.argument("version-id", versionId)
				.argument("comment-id", commentId)
	}

}


fun AmazonWorkDocsFunctions.deleteCustomMetadata(resourceId: String, init: AmazonWorkDocsDeleteCustomMetadataCommand.() -> Unit): com.amazonaws.services.workdocs.model.DeleteCustomMetadataResult {
	return this.block.declare(AmazonWorkDocsDeleteCustomMetadataCommand(resourceId).apply(init)) as com.amazonaws.services.workdocs.model.DeleteCustomMetadataResult
}

@Generated
class AmazonWorkDocsDeleteCustomMetadataCommand(val resourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.DeleteCustomMetadataRequest, com.amazonaws.services.workdocs.model.DeleteCustomMetadataResult> {

	var authenticationToken: String? = null
	var versionId: String? = null
	var keys: List<String>? = null
	var deleteAll: Boolean? = false

	override fun build(): com.amazonaws.services.workdocs.model.DeleteCustomMetadataRequest {
		val input = com.amazonaws.services.workdocs.model.DeleteCustomMetadataRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setResourceId(this.resourceId)
		input.setVersionId(this.versionId)
		input.setKeys(this.keys)
		input.setDeleteAll(this.deleteAll)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.DeleteCustomMetadataResult {
	  return com.amazonaws.services.workdocs.model.DeleteCustomMetadataResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.DeleteCustomMetadataResult {
		return environment.workdocs.deleteCustomMetadata(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs delete-custom-metadata")
				.argument("authentication-token", authenticationToken)
				.argument("resource-id", resourceId)
				.argument("version-id", versionId)
				.argument("keys", keys?.toString())
				.option("delete-all", deleteAll ?: false)
	}

}


fun AmazonWorkDocsFunctions.deleteDocument(documentId: String, init: AmazonWorkDocsDeleteDocumentCommand.() -> Unit): com.amazonaws.services.workdocs.model.DeleteDocumentResult {
	return this.block.declare(AmazonWorkDocsDeleteDocumentCommand(documentId).apply(init)) as com.amazonaws.services.workdocs.model.DeleteDocumentResult
}

@Generated
class AmazonWorkDocsDeleteDocumentCommand(val documentId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.DeleteDocumentRequest, com.amazonaws.services.workdocs.model.DeleteDocumentResult> {

	var authenticationToken: String? = null

	override fun build(): com.amazonaws.services.workdocs.model.DeleteDocumentRequest {
		val input = com.amazonaws.services.workdocs.model.DeleteDocumentRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setDocumentId(this.documentId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.DeleteDocumentResult {
	  return com.amazonaws.services.workdocs.model.DeleteDocumentResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.DeleteDocumentResult {
		return environment.workdocs.deleteDocument(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs delete-document")
				.argument("authentication-token", authenticationToken)
				.argument("document-id", documentId)
	}

}


fun AmazonWorkDocsFunctions.deleteFolder(folderId: String, init: AmazonWorkDocsDeleteFolderCommand.() -> Unit): com.amazonaws.services.workdocs.model.DeleteFolderResult {
	return this.block.declare(AmazonWorkDocsDeleteFolderCommand(folderId).apply(init)) as com.amazonaws.services.workdocs.model.DeleteFolderResult
}

@Generated
class AmazonWorkDocsDeleteFolderCommand(val folderId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.DeleteFolderRequest, com.amazonaws.services.workdocs.model.DeleteFolderResult> {

	var authenticationToken: String? = null

	override fun build(): com.amazonaws.services.workdocs.model.DeleteFolderRequest {
		val input = com.amazonaws.services.workdocs.model.DeleteFolderRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setFolderId(this.folderId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.DeleteFolderResult {
	  return com.amazonaws.services.workdocs.model.DeleteFolderResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.DeleteFolderResult {
		return environment.workdocs.deleteFolder(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs delete-folder")
				.argument("authentication-token", authenticationToken)
				.argument("folder-id", folderId)
	}

}


fun AmazonWorkDocsFunctions.deleteFolderContents(folderId: String, init: AmazonWorkDocsDeleteFolderContentsCommand.() -> Unit): com.amazonaws.services.workdocs.model.DeleteFolderContentsResult {
	return this.block.declare(AmazonWorkDocsDeleteFolderContentsCommand(folderId).apply(init)) as com.amazonaws.services.workdocs.model.DeleteFolderContentsResult
}

@Generated
class AmazonWorkDocsDeleteFolderContentsCommand(val folderId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.DeleteFolderContentsRequest, com.amazonaws.services.workdocs.model.DeleteFolderContentsResult> {

	var authenticationToken: String? = null

	override fun build(): com.amazonaws.services.workdocs.model.DeleteFolderContentsRequest {
		val input = com.amazonaws.services.workdocs.model.DeleteFolderContentsRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setFolderId(this.folderId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.DeleteFolderContentsResult {
	  return com.amazonaws.services.workdocs.model.DeleteFolderContentsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.DeleteFolderContentsResult {
		return environment.workdocs.deleteFolderContents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs delete-folder-contents")
				.argument("authentication-token", authenticationToken)
				.argument("folder-id", folderId)
	}

}


fun AmazonWorkDocsFunctions.deleteLabels(resourceId: String, init: AmazonWorkDocsDeleteLabelsCommand.() -> Unit): com.amazonaws.services.workdocs.model.DeleteLabelsResult {
	return this.block.declare(AmazonWorkDocsDeleteLabelsCommand(resourceId).apply(init)) as com.amazonaws.services.workdocs.model.DeleteLabelsResult
}

@Generated
class AmazonWorkDocsDeleteLabelsCommand(val resourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.DeleteLabelsRequest, com.amazonaws.services.workdocs.model.DeleteLabelsResult> {

	var authenticationToken: String? = null
	var labels: List<String>? = null
	var deleteAll: Boolean? = false

	override fun build(): com.amazonaws.services.workdocs.model.DeleteLabelsRequest {
		val input = com.amazonaws.services.workdocs.model.DeleteLabelsRequest()
		input.setResourceId(this.resourceId)
		input.setAuthenticationToken(this.authenticationToken)
		input.setLabels(this.labels)
		input.setDeleteAll(this.deleteAll)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.DeleteLabelsResult {
	  return com.amazonaws.services.workdocs.model.DeleteLabelsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.DeleteLabelsResult {
		return environment.workdocs.deleteLabels(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs delete-labels")
				.argument("resource-id", resourceId)
				.argument("authentication-token", authenticationToken)
				.argument("labels", labels?.toString())
				.option("delete-all", deleteAll ?: false)
	}

}


fun AmazonWorkDocsFunctions.deleteNotificationSubscription(subscriptionId: String, organizationId: String, init: AmazonWorkDocsDeleteNotificationSubscriptionCommand.() -> Unit): com.amazonaws.services.workdocs.model.DeleteNotificationSubscriptionResult {
	return this.block.declare(AmazonWorkDocsDeleteNotificationSubscriptionCommand(subscriptionId, organizationId).apply(init)) as com.amazonaws.services.workdocs.model.DeleteNotificationSubscriptionResult
}

@Generated
class AmazonWorkDocsDeleteNotificationSubscriptionCommand(val subscriptionId: String, val organizationId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.DeleteNotificationSubscriptionRequest, com.amazonaws.services.workdocs.model.DeleteNotificationSubscriptionResult> {



	override fun build(): com.amazonaws.services.workdocs.model.DeleteNotificationSubscriptionRequest {
		val input = com.amazonaws.services.workdocs.model.DeleteNotificationSubscriptionRequest()
		input.setSubscriptionId(this.subscriptionId)
		input.setOrganizationId(this.organizationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.DeleteNotificationSubscriptionResult {
	  return com.amazonaws.services.workdocs.model.DeleteNotificationSubscriptionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.DeleteNotificationSubscriptionResult {
		return environment.workdocs.deleteNotificationSubscription(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs delete-notification-subscription")
				.argument("subscription-id", subscriptionId)
				.argument("organization-id", organizationId)
	}

}


fun AmazonWorkDocsFunctions.deleteUser(userId: String, init: AmazonWorkDocsDeleteUserCommand.() -> Unit): com.amazonaws.services.workdocs.model.DeleteUserResult {
	return this.block.declare(AmazonWorkDocsDeleteUserCommand(userId).apply(init)) as com.amazonaws.services.workdocs.model.DeleteUserResult
}

@Generated
class AmazonWorkDocsDeleteUserCommand(val userId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.DeleteUserRequest, com.amazonaws.services.workdocs.model.DeleteUserResult> {

	var authenticationToken: String? = null

	override fun build(): com.amazonaws.services.workdocs.model.DeleteUserRequest {
		val input = com.amazonaws.services.workdocs.model.DeleteUserRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setUserId(this.userId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.DeleteUserResult {
	  return com.amazonaws.services.workdocs.model.DeleteUserResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.DeleteUserResult {
		return environment.workdocs.deleteUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs delete-user")
				.argument("authentication-token", authenticationToken)
				.argument("user-id", userId)
	}

}


fun AmazonWorkDocsFunctions.describeActivities(init: AmazonWorkDocsDescribeActivitiesCommand.() -> Unit): com.amazonaws.services.workdocs.model.DescribeActivitiesResult {
	return this.block.declare(AmazonWorkDocsDescribeActivitiesCommand().apply(init)) as com.amazonaws.services.workdocs.model.DescribeActivitiesResult
}

@Generated
class AmazonWorkDocsDescribeActivitiesCommand() : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.DescribeActivitiesRequest, com.amazonaws.services.workdocs.model.DescribeActivitiesResult> {

	var authenticationToken: String? = null
	var startTime: java.util.Date? = null
	var endTime: java.util.Date? = null
	var organizationId: String? = null
	var userId: String? = null
	var limit: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.workdocs.model.DescribeActivitiesRequest {
		val input = com.amazonaws.services.workdocs.model.DescribeActivitiesRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setStartTime(this.startTime)
		input.setEndTime(this.endTime)
		input.setOrganizationId(this.organizationId)
		input.setUserId(this.userId)
		input.setLimit(this.limit)
		input.setMarker(this.marker)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.DescribeActivitiesResult {
	  return com.amazonaws.services.workdocs.model.DescribeActivitiesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.DescribeActivitiesResult {
		return environment.workdocs.describeActivities(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs describe-activities")
				.argument("authentication-token", authenticationToken)
				.argument("start-time", startTime?.toString())
				.argument("end-time", endTime?.toString())
				.argument("organization-id", organizationId)
				.argument("user-id", userId)
				.argument("limit", limit?.toString())
				.argument("marker", marker)
	}

}


fun AmazonWorkDocsFunctions.describeComments(documentId: String, versionId: String, init: AmazonWorkDocsDescribeCommentsCommand.() -> Unit): com.amazonaws.services.workdocs.model.DescribeCommentsResult {
	return this.block.declare(AmazonWorkDocsDescribeCommentsCommand(documentId, versionId).apply(init)) as com.amazonaws.services.workdocs.model.DescribeCommentsResult
}

@Generated
class AmazonWorkDocsDescribeCommentsCommand(val documentId: String, val versionId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.DescribeCommentsRequest, com.amazonaws.services.workdocs.model.DescribeCommentsResult> {

	var authenticationToken: String? = null
	var limit: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.workdocs.model.DescribeCommentsRequest {
		val input = com.amazonaws.services.workdocs.model.DescribeCommentsRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setDocumentId(this.documentId)
		input.setVersionId(this.versionId)
		input.setLimit(this.limit)
		input.setMarker(this.marker)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.DescribeCommentsResult {
	  return com.amazonaws.services.workdocs.model.DescribeCommentsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.DescribeCommentsResult {
		return environment.workdocs.describeComments(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs describe-comments")
				.argument("authentication-token", authenticationToken)
				.argument("document-id", documentId)
				.argument("version-id", versionId)
				.argument("limit", limit?.toString())
				.argument("marker", marker)
	}

}


fun AmazonWorkDocsFunctions.describeDocumentVersions(documentId: String, init: AmazonWorkDocsDescribeDocumentVersionsCommand.() -> Unit): com.amazonaws.services.workdocs.model.DescribeDocumentVersionsResult {
	return this.block.declare(AmazonWorkDocsDescribeDocumentVersionsCommand(documentId).apply(init)) as com.amazonaws.services.workdocs.model.DescribeDocumentVersionsResult
}

@Generated
class AmazonWorkDocsDescribeDocumentVersionsCommand(val documentId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.DescribeDocumentVersionsRequest, com.amazonaws.services.workdocs.model.DescribeDocumentVersionsResult> {

	var authenticationToken: String? = null
	var marker: String? = null
	var limit: Int? = 0
	var include: String? = null
	var fields: String? = null

	override fun build(): com.amazonaws.services.workdocs.model.DescribeDocumentVersionsRequest {
		val input = com.amazonaws.services.workdocs.model.DescribeDocumentVersionsRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setDocumentId(this.documentId)
		input.setMarker(this.marker)
		input.setLimit(this.limit)
		input.setInclude(this.include)
		input.setFields(this.fields)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.DescribeDocumentVersionsResult {
	  return com.amazonaws.services.workdocs.model.DescribeDocumentVersionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.DescribeDocumentVersionsResult {
		return environment.workdocs.describeDocumentVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs describe-document-versions")
				.argument("authentication-token", authenticationToken)
				.argument("document-id", documentId)
				.argument("marker", marker)
				.argument("limit", limit?.toString())
				.argument("include", include)
				.argument("fields", fields)
	}

}


fun AmazonWorkDocsFunctions.describeFolderContents(folderId: String, init: AmazonWorkDocsDescribeFolderContentsCommand.() -> Unit): com.amazonaws.services.workdocs.model.DescribeFolderContentsResult {
	return this.block.declare(AmazonWorkDocsDescribeFolderContentsCommand(folderId).apply(init)) as com.amazonaws.services.workdocs.model.DescribeFolderContentsResult
}

@Generated
class AmazonWorkDocsDescribeFolderContentsCommand(val folderId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.DescribeFolderContentsRequest, com.amazonaws.services.workdocs.model.DescribeFolderContentsResult> {

	var authenticationToken: String? = null
	var sort: ResourceSortType? = null
	var order: OrderType? = null
	var limit: Int? = 0
	var marker: String? = null
	var type: FolderContentType? = null
	var include: String? = null

	override fun build(): com.amazonaws.services.workdocs.model.DescribeFolderContentsRequest {
		val input = com.amazonaws.services.workdocs.model.DescribeFolderContentsRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setFolderId(this.folderId)
		input.setSort(this.sort?.toString())
		input.setOrder(this.order?.toString())
		input.setLimit(this.limit)
		input.setMarker(this.marker)
		input.setType(this.type?.toString())
		input.setInclude(this.include)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.DescribeFolderContentsResult {
	  return com.amazonaws.services.workdocs.model.DescribeFolderContentsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.DescribeFolderContentsResult {
		return environment.workdocs.describeFolderContents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs describe-folder-contents")
				.argument("authentication-token", authenticationToken)
				.argument("folder-id", folderId)
				.argument("sort", sort?.toString())
				.argument("order", order?.toString())
				.argument("limit", limit?.toString())
				.argument("marker", marker)
				.argument("type", type?.toString())
				.argument("include", include)
	}

}


fun AmazonWorkDocsFunctions.describeGroups(searchQuery: String, init: AmazonWorkDocsDescribeGroupsCommand.() -> Unit): com.amazonaws.services.workdocs.model.DescribeGroupsResult {
	return this.block.declare(AmazonWorkDocsDescribeGroupsCommand(searchQuery).apply(init)) as com.amazonaws.services.workdocs.model.DescribeGroupsResult
}

@Generated
class AmazonWorkDocsDescribeGroupsCommand(val searchQuery: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.DescribeGroupsRequest, com.amazonaws.services.workdocs.model.DescribeGroupsResult> {

	var authenticationToken: String? = null
	var organizationId: String? = null
	var marker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.workdocs.model.DescribeGroupsRequest {
		val input = com.amazonaws.services.workdocs.model.DescribeGroupsRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setSearchQuery(this.searchQuery)
		input.setOrganizationId(this.organizationId)
		input.setMarker(this.marker)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.DescribeGroupsResult {
	  return com.amazonaws.services.workdocs.model.DescribeGroupsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.DescribeGroupsResult {
		return environment.workdocs.describeGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs describe-groups")
				.argument("authentication-token", authenticationToken)
				.argument("search-query", searchQuery)
				.argument("organization-id", organizationId)
				.argument("marker", marker)
				.argument("limit", limit?.toString())
	}

}


fun AmazonWorkDocsFunctions.describeNotificationSubscriptions(organizationId: String, init: AmazonWorkDocsDescribeNotificationSubscriptionsCommand.() -> Unit): com.amazonaws.services.workdocs.model.DescribeNotificationSubscriptionsResult {
	return this.block.declare(AmazonWorkDocsDescribeNotificationSubscriptionsCommand(organizationId).apply(init)) as com.amazonaws.services.workdocs.model.DescribeNotificationSubscriptionsResult
}

@Generated
class AmazonWorkDocsDescribeNotificationSubscriptionsCommand(val organizationId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.DescribeNotificationSubscriptionsRequest, com.amazonaws.services.workdocs.model.DescribeNotificationSubscriptionsResult> {

	var marker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.workdocs.model.DescribeNotificationSubscriptionsRequest {
		val input = com.amazonaws.services.workdocs.model.DescribeNotificationSubscriptionsRequest()
		input.setOrganizationId(this.organizationId)
		input.setMarker(this.marker)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.DescribeNotificationSubscriptionsResult {
	  return com.amazonaws.services.workdocs.model.DescribeNotificationSubscriptionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.DescribeNotificationSubscriptionsResult {
		return environment.workdocs.describeNotificationSubscriptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs describe-notification-subscriptions")
				.argument("organization-id", organizationId)
				.argument("marker", marker)
				.argument("limit", limit?.toString())
	}

}


fun AmazonWorkDocsFunctions.describeResourcePermissions(resourceId: String, init: AmazonWorkDocsDescribeResourcePermissionsCommand.() -> Unit): com.amazonaws.services.workdocs.model.DescribeResourcePermissionsResult {
	return this.block.declare(AmazonWorkDocsDescribeResourcePermissionsCommand(resourceId).apply(init)) as com.amazonaws.services.workdocs.model.DescribeResourcePermissionsResult
}

@Generated
class AmazonWorkDocsDescribeResourcePermissionsCommand(val resourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.DescribeResourcePermissionsRequest, com.amazonaws.services.workdocs.model.DescribeResourcePermissionsResult> {

	var authenticationToken: String? = null
	var principalId: String? = null
	var limit: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.workdocs.model.DescribeResourcePermissionsRequest {
		val input = com.amazonaws.services.workdocs.model.DescribeResourcePermissionsRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setResourceId(this.resourceId)
		input.setPrincipalId(this.principalId)
		input.setLimit(this.limit)
		input.setMarker(this.marker)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.DescribeResourcePermissionsResult {
	  return com.amazonaws.services.workdocs.model.DescribeResourcePermissionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.DescribeResourcePermissionsResult {
		return environment.workdocs.describeResourcePermissions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs describe-resource-permissions")
				.argument("authentication-token", authenticationToken)
				.argument("resource-id", resourceId)
				.argument("principal-id", principalId)
				.argument("limit", limit?.toString())
				.argument("marker", marker)
	}

}


fun AmazonWorkDocsFunctions.describeRootFolders(authenticationToken: String, init: AmazonWorkDocsDescribeRootFoldersCommand.() -> Unit): com.amazonaws.services.workdocs.model.DescribeRootFoldersResult {
	return this.block.declare(AmazonWorkDocsDescribeRootFoldersCommand(authenticationToken).apply(init)) as com.amazonaws.services.workdocs.model.DescribeRootFoldersResult
}

@Generated
class AmazonWorkDocsDescribeRootFoldersCommand(val authenticationToken: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.DescribeRootFoldersRequest, com.amazonaws.services.workdocs.model.DescribeRootFoldersResult> {

	var limit: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.workdocs.model.DescribeRootFoldersRequest {
		val input = com.amazonaws.services.workdocs.model.DescribeRootFoldersRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setLimit(this.limit)
		input.setMarker(this.marker)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.DescribeRootFoldersResult {
	  return com.amazonaws.services.workdocs.model.DescribeRootFoldersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.DescribeRootFoldersResult {
		return environment.workdocs.describeRootFolders(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs describe-root-folders")
				.argument("authentication-token", authenticationToken)
				.argument("limit", limit?.toString())
				.argument("marker", marker)
	}

}


fun AmazonWorkDocsFunctions.describeUsers(init: AmazonWorkDocsDescribeUsersCommand.() -> Unit): com.amazonaws.services.workdocs.model.DescribeUsersResult {
	return this.block.declare(AmazonWorkDocsDescribeUsersCommand().apply(init)) as com.amazonaws.services.workdocs.model.DescribeUsersResult
}

@Generated
class AmazonWorkDocsDescribeUsersCommand() : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.DescribeUsersRequest, com.amazonaws.services.workdocs.model.DescribeUsersResult> {

	var authenticationToken: String? = null
	var organizationId: String? = null
	var userIds: String? = null
	var query: String? = null
	var include: UserFilterType? = null
	var order: OrderType? = null
	var sort: UserSortType? = null
	var marker: String? = null
	var limit: Int? = 0
	var fields: String? = null

	override fun build(): com.amazonaws.services.workdocs.model.DescribeUsersRequest {
		val input = com.amazonaws.services.workdocs.model.DescribeUsersRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setOrganizationId(this.organizationId)
		input.setUserIds(this.userIds)
		input.setQuery(this.query)
		input.setInclude(this.include?.toString())
		input.setOrder(this.order?.toString())
		input.setSort(this.sort?.toString())
		input.setMarker(this.marker)
		input.setLimit(this.limit)
		input.setFields(this.fields)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.DescribeUsersResult {
	  return com.amazonaws.services.workdocs.model.DescribeUsersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.DescribeUsersResult {
		return environment.workdocs.describeUsers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs describe-users")
				.argument("authentication-token", authenticationToken)
				.argument("organization-id", organizationId)
				.argument("user-ids", userIds)
				.argument("query", query)
				.argument("include", include?.toString())
				.argument("order", order?.toString())
				.argument("sort", sort?.toString())
				.argument("marker", marker)
				.argument("limit", limit?.toString())
				.argument("fields", fields)
	}

}


fun AmazonWorkDocsFunctions.getCurrentUser(authenticationToken: String, init: AmazonWorkDocsGetCurrentUserCommand.() -> Unit): com.amazonaws.services.workdocs.model.GetCurrentUserResult {
	return this.block.declare(AmazonWorkDocsGetCurrentUserCommand(authenticationToken).apply(init)) as com.amazonaws.services.workdocs.model.GetCurrentUserResult
}

@Generated
class AmazonWorkDocsGetCurrentUserCommand(val authenticationToken: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.GetCurrentUserRequest, com.amazonaws.services.workdocs.model.GetCurrentUserResult> {



	override fun build(): com.amazonaws.services.workdocs.model.GetCurrentUserRequest {
		val input = com.amazonaws.services.workdocs.model.GetCurrentUserRequest()
		input.setAuthenticationToken(this.authenticationToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.GetCurrentUserResult {
	  return com.amazonaws.services.workdocs.model.GetCurrentUserResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.GetCurrentUserResult {
		return environment.workdocs.getCurrentUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs get-current-user")
				.argument("authentication-token", authenticationToken)
	}

}


fun AmazonWorkDocsFunctions.getDocument(documentId: String, init: AmazonWorkDocsGetDocumentCommand.() -> Unit): com.amazonaws.services.workdocs.model.GetDocumentResult {
	return this.block.declare(AmazonWorkDocsGetDocumentCommand(documentId).apply(init)) as com.amazonaws.services.workdocs.model.GetDocumentResult
}

@Generated
class AmazonWorkDocsGetDocumentCommand(val documentId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.GetDocumentRequest, com.amazonaws.services.workdocs.model.GetDocumentResult> {

	var authenticationToken: String? = null
	var includeCustomMetadata: Boolean? = false

	override fun build(): com.amazonaws.services.workdocs.model.GetDocumentRequest {
		val input = com.amazonaws.services.workdocs.model.GetDocumentRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setDocumentId(this.documentId)
		input.setIncludeCustomMetadata(this.includeCustomMetadata)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.GetDocumentResult {
	  return com.amazonaws.services.workdocs.model.GetDocumentResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.GetDocumentResult {
		return environment.workdocs.getDocument(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs get-document")
				.argument("authentication-token", authenticationToken)
				.argument("document-id", documentId)
				.option("include-custom-metadata", includeCustomMetadata ?: false)
	}

}


fun AmazonWorkDocsFunctions.getDocumentPath(documentId: String, init: AmazonWorkDocsGetDocumentPathCommand.() -> Unit): com.amazonaws.services.workdocs.model.GetDocumentPathResult {
	return this.block.declare(AmazonWorkDocsGetDocumentPathCommand(documentId).apply(init)) as com.amazonaws.services.workdocs.model.GetDocumentPathResult
}

@Generated
class AmazonWorkDocsGetDocumentPathCommand(val documentId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.GetDocumentPathRequest, com.amazonaws.services.workdocs.model.GetDocumentPathResult> {

	var authenticationToken: String? = null
	var limit: Int? = 0
	var fields: String? = null
	var marker: String? = null

	override fun build(): com.amazonaws.services.workdocs.model.GetDocumentPathRequest {
		val input = com.amazonaws.services.workdocs.model.GetDocumentPathRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setDocumentId(this.documentId)
		input.setLimit(this.limit)
		input.setFields(this.fields)
		input.setMarker(this.marker)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.GetDocumentPathResult {
	  return com.amazonaws.services.workdocs.model.GetDocumentPathResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.GetDocumentPathResult {
		return environment.workdocs.getDocumentPath(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs get-document-path")
				.argument("authentication-token", authenticationToken)
				.argument("document-id", documentId)
				.argument("limit", limit?.toString())
				.argument("fields", fields)
				.argument("marker", marker)
	}

}


fun AmazonWorkDocsFunctions.getDocumentVersion(documentId: String, versionId: String, init: AmazonWorkDocsGetDocumentVersionCommand.() -> Unit): com.amazonaws.services.workdocs.model.GetDocumentVersionResult {
	return this.block.declare(AmazonWorkDocsGetDocumentVersionCommand(documentId, versionId).apply(init)) as com.amazonaws.services.workdocs.model.GetDocumentVersionResult
}

@Generated
class AmazonWorkDocsGetDocumentVersionCommand(val documentId: String, val versionId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.GetDocumentVersionRequest, com.amazonaws.services.workdocs.model.GetDocumentVersionResult> {

	var authenticationToken: String? = null
	var fields: String? = null
	var includeCustomMetadata: Boolean? = false

	override fun build(): com.amazonaws.services.workdocs.model.GetDocumentVersionRequest {
		val input = com.amazonaws.services.workdocs.model.GetDocumentVersionRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setDocumentId(this.documentId)
		input.setVersionId(this.versionId)
		input.setFields(this.fields)
		input.setIncludeCustomMetadata(this.includeCustomMetadata)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.GetDocumentVersionResult {
	  return com.amazonaws.services.workdocs.model.GetDocumentVersionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.GetDocumentVersionResult {
		return environment.workdocs.getDocumentVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs get-document-version")
				.argument("authentication-token", authenticationToken)
				.argument("document-id", documentId)
				.argument("version-id", versionId)
				.argument("fields", fields)
				.option("include-custom-metadata", includeCustomMetadata ?: false)
	}

}


fun AmazonWorkDocsFunctions.getFolder(folderId: String, init: AmazonWorkDocsGetFolderCommand.() -> Unit): com.amazonaws.services.workdocs.model.GetFolderResult {
	return this.block.declare(AmazonWorkDocsGetFolderCommand(folderId).apply(init)) as com.amazonaws.services.workdocs.model.GetFolderResult
}

@Generated
class AmazonWorkDocsGetFolderCommand(val folderId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.GetFolderRequest, com.amazonaws.services.workdocs.model.GetFolderResult> {

	var authenticationToken: String? = null
	var includeCustomMetadata: Boolean? = false

	override fun build(): com.amazonaws.services.workdocs.model.GetFolderRequest {
		val input = com.amazonaws.services.workdocs.model.GetFolderRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setFolderId(this.folderId)
		input.setIncludeCustomMetadata(this.includeCustomMetadata)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.GetFolderResult {
	  return com.amazonaws.services.workdocs.model.GetFolderResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.GetFolderResult {
		return environment.workdocs.getFolder(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs get-folder")
				.argument("authentication-token", authenticationToken)
				.argument("folder-id", folderId)
				.option("include-custom-metadata", includeCustomMetadata ?: false)
	}

}


fun AmazonWorkDocsFunctions.getFolderPath(folderId: String, init: AmazonWorkDocsGetFolderPathCommand.() -> Unit): com.amazonaws.services.workdocs.model.GetFolderPathResult {
	return this.block.declare(AmazonWorkDocsGetFolderPathCommand(folderId).apply(init)) as com.amazonaws.services.workdocs.model.GetFolderPathResult
}

@Generated
class AmazonWorkDocsGetFolderPathCommand(val folderId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.GetFolderPathRequest, com.amazonaws.services.workdocs.model.GetFolderPathResult> {

	var authenticationToken: String? = null
	var limit: Int? = 0
	var fields: String? = null
	var marker: String? = null

	override fun build(): com.amazonaws.services.workdocs.model.GetFolderPathRequest {
		val input = com.amazonaws.services.workdocs.model.GetFolderPathRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setFolderId(this.folderId)
		input.setLimit(this.limit)
		input.setFields(this.fields)
		input.setMarker(this.marker)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.GetFolderPathResult {
	  return com.amazonaws.services.workdocs.model.GetFolderPathResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.GetFolderPathResult {
		return environment.workdocs.getFolderPath(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs get-folder-path")
				.argument("authentication-token", authenticationToken)
				.argument("folder-id", folderId)
				.argument("limit", limit?.toString())
				.argument("fields", fields)
				.argument("marker", marker)
	}

}


fun AmazonWorkDocsFunctions.initiateDocumentVersionUpload(parentFolderId: String, init: AmazonWorkDocsInitiateDocumentVersionUploadCommand.() -> Unit): com.amazonaws.services.workdocs.model.InitiateDocumentVersionUploadResult {
	return this.block.declare(AmazonWorkDocsInitiateDocumentVersionUploadCommand(parentFolderId).apply(init)) as com.amazonaws.services.workdocs.model.InitiateDocumentVersionUploadResult
}

@Generated
class AmazonWorkDocsInitiateDocumentVersionUploadCommand(val parentFolderId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.InitiateDocumentVersionUploadRequest, com.amazonaws.services.workdocs.model.InitiateDocumentVersionUploadResult> {

	var authenticationToken: String? = null
	var id: String? = null
	var name: String? = null
	var contentCreatedTimestamp: java.util.Date? = null
	var contentModifiedTimestamp: java.util.Date? = null
	var contentType: String? = null
	var documentSizeInBytes: Long? = 0L

	override fun build(): com.amazonaws.services.workdocs.model.InitiateDocumentVersionUploadRequest {
		val input = com.amazonaws.services.workdocs.model.InitiateDocumentVersionUploadRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setId(this.id)
		input.setName(this.name)
		input.setContentCreatedTimestamp(this.contentCreatedTimestamp)
		input.setContentModifiedTimestamp(this.contentModifiedTimestamp)
		input.setContentType(this.contentType)
		input.setDocumentSizeInBytes(this.documentSizeInBytes)
		input.setParentFolderId(this.parentFolderId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.InitiateDocumentVersionUploadResult {
	  return com.amazonaws.services.workdocs.model.InitiateDocumentVersionUploadResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.InitiateDocumentVersionUploadResult {
		return environment.workdocs.initiateDocumentVersionUpload(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs initiate-document-version-upload")
				.argument("authentication-token", authenticationToken)
				.argument("id", id)
				.argument("name", name)
				.argument("content-created-timestamp", contentCreatedTimestamp?.toString())
				.argument("content-modified-timestamp", contentModifiedTimestamp?.toString())
				.argument("content-type", contentType)
				.argument("document-size-in-bytes", documentSizeInBytes?.toString())
				.argument("parent-folder-id", parentFolderId)
	}

}


fun AmazonWorkDocsFunctions.removeAllResourcePermissions(resourceId: String, init: AmazonWorkDocsRemoveAllResourcePermissionsCommand.() -> Unit): com.amazonaws.services.workdocs.model.RemoveAllResourcePermissionsResult {
	return this.block.declare(AmazonWorkDocsRemoveAllResourcePermissionsCommand(resourceId).apply(init)) as com.amazonaws.services.workdocs.model.RemoveAllResourcePermissionsResult
}

@Generated
class AmazonWorkDocsRemoveAllResourcePermissionsCommand(val resourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.RemoveAllResourcePermissionsRequest, com.amazonaws.services.workdocs.model.RemoveAllResourcePermissionsResult> {

	var authenticationToken: String? = null

	override fun build(): com.amazonaws.services.workdocs.model.RemoveAllResourcePermissionsRequest {
		val input = com.amazonaws.services.workdocs.model.RemoveAllResourcePermissionsRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setResourceId(this.resourceId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.RemoveAllResourcePermissionsResult {
	  return com.amazonaws.services.workdocs.model.RemoveAllResourcePermissionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.RemoveAllResourcePermissionsResult {
		return environment.workdocs.removeAllResourcePermissions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs remove-all-resource-permissions")
				.argument("authentication-token", authenticationToken)
				.argument("resource-id", resourceId)
	}

}


fun AmazonWorkDocsFunctions.removeResourcePermission(resourceId: String, principalId: String, init: AmazonWorkDocsRemoveResourcePermissionCommand.() -> Unit): com.amazonaws.services.workdocs.model.RemoveResourcePermissionResult {
	return this.block.declare(AmazonWorkDocsRemoveResourcePermissionCommand(resourceId, principalId).apply(init)) as com.amazonaws.services.workdocs.model.RemoveResourcePermissionResult
}

@Generated
class AmazonWorkDocsRemoveResourcePermissionCommand(val resourceId: String, val principalId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.RemoveResourcePermissionRequest, com.amazonaws.services.workdocs.model.RemoveResourcePermissionResult> {

	var authenticationToken: String? = null
	var principalType: PrincipalType? = null

	override fun build(): com.amazonaws.services.workdocs.model.RemoveResourcePermissionRequest {
		val input = com.amazonaws.services.workdocs.model.RemoveResourcePermissionRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setResourceId(this.resourceId)
		input.setPrincipalId(this.principalId)
		input.setPrincipalType(this.principalType?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.RemoveResourcePermissionResult {
	  return com.amazonaws.services.workdocs.model.RemoveResourcePermissionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.RemoveResourcePermissionResult {
		return environment.workdocs.removeResourcePermission(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs remove-resource-permission")
				.argument("authentication-token", authenticationToken)
				.argument("resource-id", resourceId)
				.argument("principal-id", principalId)
				.argument("principal-type", principalType?.toString())
	}

}


fun AmazonWorkDocsFunctions.updateDocument(documentId: String, init: AmazonWorkDocsUpdateDocumentCommand.() -> Unit): com.amazonaws.services.workdocs.model.UpdateDocumentResult {
	return this.block.declare(AmazonWorkDocsUpdateDocumentCommand(documentId).apply(init)) as com.amazonaws.services.workdocs.model.UpdateDocumentResult
}

@Generated
class AmazonWorkDocsUpdateDocumentCommand(val documentId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.UpdateDocumentRequest, com.amazonaws.services.workdocs.model.UpdateDocumentResult> {

	var authenticationToken: String? = null
	var name: String? = null
	var parentFolderId: String? = null
	var resourceState: ResourceStateType? = null

	override fun build(): com.amazonaws.services.workdocs.model.UpdateDocumentRequest {
		val input = com.amazonaws.services.workdocs.model.UpdateDocumentRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setDocumentId(this.documentId)
		input.setName(this.name)
		input.setParentFolderId(this.parentFolderId)
		input.setResourceState(this.resourceState?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.UpdateDocumentResult {
	  return com.amazonaws.services.workdocs.model.UpdateDocumentResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.UpdateDocumentResult {
		return environment.workdocs.updateDocument(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs update-document")
				.argument("authentication-token", authenticationToken)
				.argument("document-id", documentId)
				.argument("name", name)
				.argument("parent-folder-id", parentFolderId)
				.argument("resource-state", resourceState?.toString())
	}

}


fun AmazonWorkDocsFunctions.updateDocumentVersion(documentId: String, versionId: String, init: AmazonWorkDocsUpdateDocumentVersionCommand.() -> Unit): com.amazonaws.services.workdocs.model.UpdateDocumentVersionResult {
	return this.block.declare(AmazonWorkDocsUpdateDocumentVersionCommand(documentId, versionId).apply(init)) as com.amazonaws.services.workdocs.model.UpdateDocumentVersionResult
}

@Generated
class AmazonWorkDocsUpdateDocumentVersionCommand(val documentId: String, val versionId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.UpdateDocumentVersionRequest, com.amazonaws.services.workdocs.model.UpdateDocumentVersionResult> {

	var authenticationToken: String? = null
	var versionStatus: DocumentVersionStatus? = null

	override fun build(): com.amazonaws.services.workdocs.model.UpdateDocumentVersionRequest {
		val input = com.amazonaws.services.workdocs.model.UpdateDocumentVersionRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setDocumentId(this.documentId)
		input.setVersionId(this.versionId)
		input.setVersionStatus(this.versionStatus?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.UpdateDocumentVersionResult {
	  return com.amazonaws.services.workdocs.model.UpdateDocumentVersionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.UpdateDocumentVersionResult {
		return environment.workdocs.updateDocumentVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs update-document-version")
				.argument("authentication-token", authenticationToken)
				.argument("document-id", documentId)
				.argument("version-id", versionId)
				.argument("version-status", versionStatus?.toString())
	}

}


fun AmazonWorkDocsFunctions.updateFolder(folderId: String, init: AmazonWorkDocsUpdateFolderCommand.() -> Unit): com.amazonaws.services.workdocs.model.UpdateFolderResult {
	return this.block.declare(AmazonWorkDocsUpdateFolderCommand(folderId).apply(init)) as com.amazonaws.services.workdocs.model.UpdateFolderResult
}

@Generated
class AmazonWorkDocsUpdateFolderCommand(val folderId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.UpdateFolderRequest, com.amazonaws.services.workdocs.model.UpdateFolderResult> {

	var authenticationToken: String? = null
	var name: String? = null
	var parentFolderId: String? = null
	var resourceState: ResourceStateType? = null

	override fun build(): com.amazonaws.services.workdocs.model.UpdateFolderRequest {
		val input = com.amazonaws.services.workdocs.model.UpdateFolderRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setFolderId(this.folderId)
		input.setName(this.name)
		input.setParentFolderId(this.parentFolderId)
		input.setResourceState(this.resourceState?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.UpdateFolderResult {
	  return com.amazonaws.services.workdocs.model.UpdateFolderResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.UpdateFolderResult {
		return environment.workdocs.updateFolder(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs update-folder")
				.argument("authentication-token", authenticationToken)
				.argument("folder-id", folderId)
				.argument("name", name)
				.argument("parent-folder-id", parentFolderId)
				.argument("resource-state", resourceState?.toString())
	}

}


fun AmazonWorkDocsFunctions.updateUser(userId: String, init: AmazonWorkDocsUpdateUserCommand.() -> Unit): com.amazonaws.services.workdocs.model.UpdateUserResult {
	return this.block.declare(AmazonWorkDocsUpdateUserCommand(userId).apply(init)) as com.amazonaws.services.workdocs.model.UpdateUserResult
}

@Generated
class AmazonWorkDocsUpdateUserCommand(val userId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.UpdateUserRequest, com.amazonaws.services.workdocs.model.UpdateUserResult> {

	var authenticationToken: String? = null
	var givenName: String? = null
	var surname: String? = null
	var type: UserType? = null
	var storageRule: com.amazonaws.services.workdocs.model.StorageRuleType? = null
	var timeZoneId: String? = null
	var locale: LocaleType? = null
	var grantPoweruserPrivileges: BooleanEnumType? = null

	override fun build(): com.amazonaws.services.workdocs.model.UpdateUserRequest {
		val input = com.amazonaws.services.workdocs.model.UpdateUserRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setUserId(this.userId)
		input.setGivenName(this.givenName)
		input.setSurname(this.surname)
		input.setType(this.type?.toString())
		input.setStorageRule(this.storageRule)
		input.setTimeZoneId(this.timeZoneId)
		input.setLocale(this.locale?.toString())
		input.setGrantPoweruserPrivileges(this.grantPoweruserPrivileges?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workdocs.model.UpdateUserResult {
	  return com.amazonaws.services.workdocs.model.UpdateUserResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workdocs.model.UpdateUserResult {
		return environment.workdocs.updateUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs update-user")
				.argument("authentication-token", authenticationToken)
				.argument("user-id", userId)
				.argument("given-name", givenName)
				.argument("surname", surname)
				.argument("type", type?.toString())
				.argument("storage-rule", storageRule?.toString())
				.argument("time-zone-id", timeZoneId)
				.argument("locale", locale?.toString())
				.argument("grant-poweruser-privileges", grantPoweruserPrivileges?.toString())
	}

}
