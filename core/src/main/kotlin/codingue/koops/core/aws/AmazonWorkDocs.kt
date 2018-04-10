
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.workdocs.AmazonWorkDocs
import com.amazonaws.services.workdocs.model.*

var codingue.koops.core.Environment.workdocs: AmazonWorkDocs
	get() = this.capabilities[AmazonWorkDocs::class.java.name] as AmazonWorkDocs
	set(workdocs) {
		this.capabilities[AmazonWorkDocs::class.java.name] = workdocs
	}

@Generated
class AmazonWorkDocsFunctions(val block: Block)

infix fun AwsContinuation.workdocs(init: AmazonWorkDocsFunctions.() -> Unit) {
	AmazonWorkDocsFunctions(shell).apply(init)
}

			

fun AmazonWorkDocsFunctions.abortDocumentVersionUpload(documentId: String, versionId: String, init: AmazonWorkDocsAbortDocumentVersionUploadCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsAbortDocumentVersionUploadCommand(documentId, versionId).apply(init))
}

@Generated
class AmazonWorkDocsAbortDocumentVersionUploadCommand(val documentId: String, val versionId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.AbortDocumentVersionUploadRequest> {

	var authenticationToken: String? = null

	override fun build(): com.amazonaws.services.workdocs.model.AbortDocumentVersionUploadRequest {
		val input = com.amazonaws.services.workdocs.model.AbortDocumentVersionUploadRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setDocumentId(this.documentId)
		input.setVersionId(this.versionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.abortDocumentVersionUpload(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs abort-document-version-upload")
				.argument("authentication-token", authenticationToken)
				.argument("document-id", documentId)
				.argument("version-id", versionId)
	}

}


fun AmazonWorkDocsFunctions.activateUser(userId: String, init: AmazonWorkDocsActivateUserCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsActivateUserCommand(userId).apply(init))
}

@Generated
class AmazonWorkDocsActivateUserCommand(val userId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.ActivateUserRequest> {

	var authenticationToken: String? = null

	override fun build(): com.amazonaws.services.workdocs.model.ActivateUserRequest {
		val input = com.amazonaws.services.workdocs.model.ActivateUserRequest()
		input.setUserId(this.userId)
		input.setAuthenticationToken(this.authenticationToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.activateUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs activate-user")
				.argument("user-id", userId)
				.argument("authentication-token", authenticationToken)
	}

}


fun AmazonWorkDocsFunctions.addResourcePermissions(resourceId: String, principals: List<com.amazonaws.services.workdocs.model.SharePrincipal>, init: AmazonWorkDocsAddResourcePermissionsCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsAddResourcePermissionsCommand(resourceId, principals).apply(init))
}

@Generated
class AmazonWorkDocsAddResourcePermissionsCommand(val resourceId: String, val principals: List<com.amazonaws.services.workdocs.model.SharePrincipal>) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.AddResourcePermissionsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.addResourcePermissions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs add-resource-permissions")
				.argument("authentication-token", authenticationToken)
				.argument("resource-id", resourceId)
				.argument("principals", principals.toString())
				.argument("notification-options", notificationOptions?.toString())
	}

}


fun AmazonWorkDocsFunctions.createComment(documentId: String, versionId: String, text: String, init: AmazonWorkDocsCreateCommentCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsCreateCommentCommand(documentId, versionId, text).apply(init))
}

@Generated
class AmazonWorkDocsCreateCommentCommand(val documentId: String, val versionId: String, val text: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.CreateCommentRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.createComment(build())
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


fun AmazonWorkDocsFunctions.createCustomMetadata(resourceId: String, customMetadata: Map<String, String>, init: AmazonWorkDocsCreateCustomMetadataCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsCreateCustomMetadataCommand(resourceId, customMetadata).apply(init))
}

@Generated
class AmazonWorkDocsCreateCustomMetadataCommand(val resourceId: String, val customMetadata: Map<String, String>) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.CreateCustomMetadataRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.createCustomMetadata(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs create-custom-metadata")
				.argument("authentication-token", authenticationToken)
				.argument("resource-id", resourceId)
				.argument("version-id", versionId)
				.argument("custom-metadata", customMetadata.toString())
	}

}


fun AmazonWorkDocsFunctions.createFolder(parentFolderId: String, init: AmazonWorkDocsCreateFolderCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsCreateFolderCommand(parentFolderId).apply(init))
}

@Generated
class AmazonWorkDocsCreateFolderCommand(val parentFolderId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.CreateFolderRequest> {

	var authenticationToken: String? = null
	var name: String? = null

	override fun build(): com.amazonaws.services.workdocs.model.CreateFolderRequest {
		val input = com.amazonaws.services.workdocs.model.CreateFolderRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setName(this.name)
		input.setParentFolderId(this.parentFolderId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.createFolder(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs create-folder")
				.argument("authentication-token", authenticationToken)
				.argument("name", name)
				.argument("parent-folder-id", parentFolderId)
	}

}


fun AmazonWorkDocsFunctions.createLabels(resourceId: String, labels: List<String>, init: AmazonWorkDocsCreateLabelsCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsCreateLabelsCommand(resourceId, labels).apply(init))
}

@Generated
class AmazonWorkDocsCreateLabelsCommand(val resourceId: String, val labels: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.CreateLabelsRequest> {

	var authenticationToken: String? = null

	override fun build(): com.amazonaws.services.workdocs.model.CreateLabelsRequest {
		val input = com.amazonaws.services.workdocs.model.CreateLabelsRequest()
		input.setResourceId(this.resourceId)
		input.setLabels(this.labels)
		input.setAuthenticationToken(this.authenticationToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.createLabels(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs create-labels")
				.argument("resource-id", resourceId)
				.argument("labels", labels.toString())
				.argument("authentication-token", authenticationToken)
	}

}


fun AmazonWorkDocsFunctions.createNotificationSubscription(organizationId: String, endpoint: String, protocol: SubscriptionProtocolType, subscriptionType: SubscriptionType, init: AmazonWorkDocsCreateNotificationSubscriptionCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsCreateNotificationSubscriptionCommand(organizationId, endpoint, protocol, subscriptionType).apply(init))
}

@Generated
class AmazonWorkDocsCreateNotificationSubscriptionCommand(val organizationId: String, val endpoint: String, val protocol: SubscriptionProtocolType, val subscriptionType: SubscriptionType) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.CreateNotificationSubscriptionRequest> {



	override fun build(): com.amazonaws.services.workdocs.model.CreateNotificationSubscriptionRequest {
		val input = com.amazonaws.services.workdocs.model.CreateNotificationSubscriptionRequest()
		input.setOrganizationId(this.organizationId)
		input.setEndpoint(this.endpoint)
		input.setProtocol(this.protocol.toString())
		input.setSubscriptionType(this.subscriptionType.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.createNotificationSubscription(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs create-notification-subscription")
				.argument("organization-id", organizationId)
				.argument("endpoint", endpoint)
				.argument("protocol", protocol.toString())
				.argument("subscription-type", subscriptionType.toString())
	}

}


fun AmazonWorkDocsFunctions.createUser(username: String, givenName: String, surname: String, password: String, init: AmazonWorkDocsCreateUserCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsCreateUserCommand(username, givenName, surname, password).apply(init))
}

@Generated
class AmazonWorkDocsCreateUserCommand(val username: String, val givenName: String, val surname: String, val password: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.CreateUserRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.createUser(build())
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


fun AmazonWorkDocsFunctions.deactivateUser(userId: String, init: AmazonWorkDocsDeactivateUserCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsDeactivateUserCommand(userId).apply(init))
}

@Generated
class AmazonWorkDocsDeactivateUserCommand(val userId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.DeactivateUserRequest> {

	var authenticationToken: String? = null

	override fun build(): com.amazonaws.services.workdocs.model.DeactivateUserRequest {
		val input = com.amazonaws.services.workdocs.model.DeactivateUserRequest()
		input.setUserId(this.userId)
		input.setAuthenticationToken(this.authenticationToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.deactivateUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs deactivate-user")
				.argument("user-id", userId)
				.argument("authentication-token", authenticationToken)
	}

}


fun AmazonWorkDocsFunctions.deleteComment(documentId: String, versionId: String, commentId: String, init: AmazonWorkDocsDeleteCommentCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsDeleteCommentCommand(documentId, versionId, commentId).apply(init))
}

@Generated
class AmazonWorkDocsDeleteCommentCommand(val documentId: String, val versionId: String, val commentId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.DeleteCommentRequest> {

	var authenticationToken: String? = null

	override fun build(): com.amazonaws.services.workdocs.model.DeleteCommentRequest {
		val input = com.amazonaws.services.workdocs.model.DeleteCommentRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setDocumentId(this.documentId)
		input.setVersionId(this.versionId)
		input.setCommentId(this.commentId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.deleteComment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs delete-comment")
				.argument("authentication-token", authenticationToken)
				.argument("document-id", documentId)
				.argument("version-id", versionId)
				.argument("comment-id", commentId)
	}

}


fun AmazonWorkDocsFunctions.deleteCustomMetadata(resourceId: String, init: AmazonWorkDocsDeleteCustomMetadataCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsDeleteCustomMetadataCommand(resourceId).apply(init))
}

@Generated
class AmazonWorkDocsDeleteCustomMetadataCommand(val resourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.DeleteCustomMetadataRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.deleteCustomMetadata(build())
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


fun AmazonWorkDocsFunctions.deleteDocument(documentId: String, init: AmazonWorkDocsDeleteDocumentCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsDeleteDocumentCommand(documentId).apply(init))
}

@Generated
class AmazonWorkDocsDeleteDocumentCommand(val documentId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.DeleteDocumentRequest> {

	var authenticationToken: String? = null

	override fun build(): com.amazonaws.services.workdocs.model.DeleteDocumentRequest {
		val input = com.amazonaws.services.workdocs.model.DeleteDocumentRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setDocumentId(this.documentId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.deleteDocument(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs delete-document")
				.argument("authentication-token", authenticationToken)
				.argument("document-id", documentId)
	}

}


fun AmazonWorkDocsFunctions.deleteFolder(folderId: String, init: AmazonWorkDocsDeleteFolderCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsDeleteFolderCommand(folderId).apply(init))
}

@Generated
class AmazonWorkDocsDeleteFolderCommand(val folderId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.DeleteFolderRequest> {

	var authenticationToken: String? = null

	override fun build(): com.amazonaws.services.workdocs.model.DeleteFolderRequest {
		val input = com.amazonaws.services.workdocs.model.DeleteFolderRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setFolderId(this.folderId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.deleteFolder(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs delete-folder")
				.argument("authentication-token", authenticationToken)
				.argument("folder-id", folderId)
	}

}


fun AmazonWorkDocsFunctions.deleteFolderContents(folderId: String, init: AmazonWorkDocsDeleteFolderContentsCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsDeleteFolderContentsCommand(folderId).apply(init))
}

@Generated
class AmazonWorkDocsDeleteFolderContentsCommand(val folderId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.DeleteFolderContentsRequest> {

	var authenticationToken: String? = null

	override fun build(): com.amazonaws.services.workdocs.model.DeleteFolderContentsRequest {
		val input = com.amazonaws.services.workdocs.model.DeleteFolderContentsRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setFolderId(this.folderId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.deleteFolderContents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs delete-folder-contents")
				.argument("authentication-token", authenticationToken)
				.argument("folder-id", folderId)
	}

}


fun AmazonWorkDocsFunctions.deleteLabels(resourceId: String, init: AmazonWorkDocsDeleteLabelsCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsDeleteLabelsCommand(resourceId).apply(init))
}

@Generated
class AmazonWorkDocsDeleteLabelsCommand(val resourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.DeleteLabelsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.deleteLabels(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs delete-labels")
				.argument("resource-id", resourceId)
				.argument("authentication-token", authenticationToken)
				.argument("labels", labels?.toString())
				.option("delete-all", deleteAll ?: false)
	}

}


fun AmazonWorkDocsFunctions.deleteNotificationSubscription(subscriptionId: String, organizationId: String, init: AmazonWorkDocsDeleteNotificationSubscriptionCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsDeleteNotificationSubscriptionCommand(subscriptionId, organizationId).apply(init))
}

@Generated
class AmazonWorkDocsDeleteNotificationSubscriptionCommand(val subscriptionId: String, val organizationId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.DeleteNotificationSubscriptionRequest> {



	override fun build(): com.amazonaws.services.workdocs.model.DeleteNotificationSubscriptionRequest {
		val input = com.amazonaws.services.workdocs.model.DeleteNotificationSubscriptionRequest()
		input.setSubscriptionId(this.subscriptionId)
		input.setOrganizationId(this.organizationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.deleteNotificationSubscription(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs delete-notification-subscription")
				.argument("subscription-id", subscriptionId)
				.argument("organization-id", organizationId)
	}

}


fun AmazonWorkDocsFunctions.deleteUser(userId: String, init: AmazonWorkDocsDeleteUserCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsDeleteUserCommand(userId).apply(init))
}

@Generated
class AmazonWorkDocsDeleteUserCommand(val userId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.DeleteUserRequest> {

	var authenticationToken: String? = null

	override fun build(): com.amazonaws.services.workdocs.model.DeleteUserRequest {
		val input = com.amazonaws.services.workdocs.model.DeleteUserRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setUserId(this.userId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.deleteUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs delete-user")
				.argument("authentication-token", authenticationToken)
				.argument("user-id", userId)
	}

}


fun AmazonWorkDocsFunctions.describeActivities(init: AmazonWorkDocsDescribeActivitiesCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsDescribeActivitiesCommand().apply(init))
}

@Generated
class AmazonWorkDocsDescribeActivitiesCommand() : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.DescribeActivitiesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.describeActivities(build())
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


fun AmazonWorkDocsFunctions.describeComments(documentId: String, versionId: String, init: AmazonWorkDocsDescribeCommentsCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsDescribeCommentsCommand(documentId, versionId).apply(init))
}

@Generated
class AmazonWorkDocsDescribeCommentsCommand(val documentId: String, val versionId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.DescribeCommentsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.describeComments(build())
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


fun AmazonWorkDocsFunctions.describeDocumentVersions(documentId: String, init: AmazonWorkDocsDescribeDocumentVersionsCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsDescribeDocumentVersionsCommand(documentId).apply(init))
}

@Generated
class AmazonWorkDocsDescribeDocumentVersionsCommand(val documentId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.DescribeDocumentVersionsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.describeDocumentVersions(build())
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


fun AmazonWorkDocsFunctions.describeFolderContents(folderId: String, init: AmazonWorkDocsDescribeFolderContentsCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsDescribeFolderContentsCommand(folderId).apply(init))
}

@Generated
class AmazonWorkDocsDescribeFolderContentsCommand(val folderId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.DescribeFolderContentsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.describeFolderContents(build())
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


fun AmazonWorkDocsFunctions.describeGroups(searchQuery: String, init: AmazonWorkDocsDescribeGroupsCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsDescribeGroupsCommand(searchQuery).apply(init))
}

@Generated
class AmazonWorkDocsDescribeGroupsCommand(val searchQuery: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.DescribeGroupsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.describeGroups(build())
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


fun AmazonWorkDocsFunctions.describeNotificationSubscriptions(organizationId: String, init: AmazonWorkDocsDescribeNotificationSubscriptionsCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsDescribeNotificationSubscriptionsCommand(organizationId).apply(init))
}

@Generated
class AmazonWorkDocsDescribeNotificationSubscriptionsCommand(val organizationId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.DescribeNotificationSubscriptionsRequest> {

	var marker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.workdocs.model.DescribeNotificationSubscriptionsRequest {
		val input = com.amazonaws.services.workdocs.model.DescribeNotificationSubscriptionsRequest()
		input.setOrganizationId(this.organizationId)
		input.setMarker(this.marker)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.describeNotificationSubscriptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs describe-notification-subscriptions")
				.argument("organization-id", organizationId)
				.argument("marker", marker)
				.argument("limit", limit?.toString())
	}

}


fun AmazonWorkDocsFunctions.describeResourcePermissions(resourceId: String, init: AmazonWorkDocsDescribeResourcePermissionsCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsDescribeResourcePermissionsCommand(resourceId).apply(init))
}

@Generated
class AmazonWorkDocsDescribeResourcePermissionsCommand(val resourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.DescribeResourcePermissionsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.describeResourcePermissions(build())
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


fun AmazonWorkDocsFunctions.describeRootFolders(authenticationToken: String, init: AmazonWorkDocsDescribeRootFoldersCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsDescribeRootFoldersCommand(authenticationToken).apply(init))
}

@Generated
class AmazonWorkDocsDescribeRootFoldersCommand(val authenticationToken: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.DescribeRootFoldersRequest> {

	var limit: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.workdocs.model.DescribeRootFoldersRequest {
		val input = com.amazonaws.services.workdocs.model.DescribeRootFoldersRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setLimit(this.limit)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.describeRootFolders(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs describe-root-folders")
				.argument("authentication-token", authenticationToken)
				.argument("limit", limit?.toString())
				.argument("marker", marker)
	}

}


fun AmazonWorkDocsFunctions.describeUsers(init: AmazonWorkDocsDescribeUsersCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsDescribeUsersCommand().apply(init))
}

@Generated
class AmazonWorkDocsDescribeUsersCommand() : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.DescribeUsersRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.describeUsers(build())
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


fun AmazonWorkDocsFunctions.getCurrentUser(authenticationToken: String, init: AmazonWorkDocsGetCurrentUserCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsGetCurrentUserCommand(authenticationToken).apply(init))
}

@Generated
class AmazonWorkDocsGetCurrentUserCommand(val authenticationToken: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.GetCurrentUserRequest> {



	override fun build(): com.amazonaws.services.workdocs.model.GetCurrentUserRequest {
		val input = com.amazonaws.services.workdocs.model.GetCurrentUserRequest()
		input.setAuthenticationToken(this.authenticationToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.getCurrentUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs get-current-user")
				.argument("authentication-token", authenticationToken)
	}

}


fun AmazonWorkDocsFunctions.getDocument(documentId: String, init: AmazonWorkDocsGetDocumentCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsGetDocumentCommand(documentId).apply(init))
}

@Generated
class AmazonWorkDocsGetDocumentCommand(val documentId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.GetDocumentRequest> {

	var authenticationToken: String? = null
	var includeCustomMetadata: Boolean? = false

	override fun build(): com.amazonaws.services.workdocs.model.GetDocumentRequest {
		val input = com.amazonaws.services.workdocs.model.GetDocumentRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setDocumentId(this.documentId)
		input.setIncludeCustomMetadata(this.includeCustomMetadata)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.getDocument(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs get-document")
				.argument("authentication-token", authenticationToken)
				.argument("document-id", documentId)
				.option("include-custom-metadata", includeCustomMetadata ?: false)
	}

}


fun AmazonWorkDocsFunctions.getDocumentPath(documentId: String, init: AmazonWorkDocsGetDocumentPathCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsGetDocumentPathCommand(documentId).apply(init))
}

@Generated
class AmazonWorkDocsGetDocumentPathCommand(val documentId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.GetDocumentPathRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.getDocumentPath(build())
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


fun AmazonWorkDocsFunctions.getDocumentVersion(documentId: String, versionId: String, init: AmazonWorkDocsGetDocumentVersionCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsGetDocumentVersionCommand(documentId, versionId).apply(init))
}

@Generated
class AmazonWorkDocsGetDocumentVersionCommand(val documentId: String, val versionId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.GetDocumentVersionRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.getDocumentVersion(build())
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


fun AmazonWorkDocsFunctions.getFolder(folderId: String, init: AmazonWorkDocsGetFolderCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsGetFolderCommand(folderId).apply(init))
}

@Generated
class AmazonWorkDocsGetFolderCommand(val folderId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.GetFolderRequest> {

	var authenticationToken: String? = null
	var includeCustomMetadata: Boolean? = false

	override fun build(): com.amazonaws.services.workdocs.model.GetFolderRequest {
		val input = com.amazonaws.services.workdocs.model.GetFolderRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setFolderId(this.folderId)
		input.setIncludeCustomMetadata(this.includeCustomMetadata)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.getFolder(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs get-folder")
				.argument("authentication-token", authenticationToken)
				.argument("folder-id", folderId)
				.option("include-custom-metadata", includeCustomMetadata ?: false)
	}

}


fun AmazonWorkDocsFunctions.getFolderPath(folderId: String, init: AmazonWorkDocsGetFolderPathCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsGetFolderPathCommand(folderId).apply(init))
}

@Generated
class AmazonWorkDocsGetFolderPathCommand(val folderId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.GetFolderPathRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.getFolderPath(build())
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


fun AmazonWorkDocsFunctions.initiateDocumentVersionUpload(parentFolderId: String, init: AmazonWorkDocsInitiateDocumentVersionUploadCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsInitiateDocumentVersionUploadCommand(parentFolderId).apply(init))
}

@Generated
class AmazonWorkDocsInitiateDocumentVersionUploadCommand(val parentFolderId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.InitiateDocumentVersionUploadRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.initiateDocumentVersionUpload(build())
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


fun AmazonWorkDocsFunctions.removeAllResourcePermissions(resourceId: String, init: AmazonWorkDocsRemoveAllResourcePermissionsCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsRemoveAllResourcePermissionsCommand(resourceId).apply(init))
}

@Generated
class AmazonWorkDocsRemoveAllResourcePermissionsCommand(val resourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.RemoveAllResourcePermissionsRequest> {

	var authenticationToken: String? = null

	override fun build(): com.amazonaws.services.workdocs.model.RemoveAllResourcePermissionsRequest {
		val input = com.amazonaws.services.workdocs.model.RemoveAllResourcePermissionsRequest()
		input.setAuthenticationToken(this.authenticationToken)
		input.setResourceId(this.resourceId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.removeAllResourcePermissions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs remove-all-resource-permissions")
				.argument("authentication-token", authenticationToken)
				.argument("resource-id", resourceId)
	}

}


fun AmazonWorkDocsFunctions.removeResourcePermission(resourceId: String, principalId: String, init: AmazonWorkDocsRemoveResourcePermissionCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsRemoveResourcePermissionCommand(resourceId, principalId).apply(init))
}

@Generated
class AmazonWorkDocsRemoveResourcePermissionCommand(val resourceId: String, val principalId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.RemoveResourcePermissionRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.removeResourcePermission(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs remove-resource-permission")
				.argument("authentication-token", authenticationToken)
				.argument("resource-id", resourceId)
				.argument("principal-id", principalId)
				.argument("principal-type", principalType?.toString())
	}

}


fun AmazonWorkDocsFunctions.updateDocument(documentId: String, init: AmazonWorkDocsUpdateDocumentCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsUpdateDocumentCommand(documentId).apply(init))
}

@Generated
class AmazonWorkDocsUpdateDocumentCommand(val documentId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.UpdateDocumentRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.updateDocument(build())
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


fun AmazonWorkDocsFunctions.updateDocumentVersion(documentId: String, versionId: String, init: AmazonWorkDocsUpdateDocumentVersionCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsUpdateDocumentVersionCommand(documentId, versionId).apply(init))
}

@Generated
class AmazonWorkDocsUpdateDocumentVersionCommand(val documentId: String, val versionId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.UpdateDocumentVersionRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.updateDocumentVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workdocs update-document-version")
				.argument("authentication-token", authenticationToken)
				.argument("document-id", documentId)
				.argument("version-id", versionId)
				.argument("version-status", versionStatus?.toString())
	}

}


fun AmazonWorkDocsFunctions.updateFolder(folderId: String, init: AmazonWorkDocsUpdateFolderCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsUpdateFolderCommand(folderId).apply(init))
}

@Generated
class AmazonWorkDocsUpdateFolderCommand(val folderId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.UpdateFolderRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.updateFolder(build())
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


fun AmazonWorkDocsFunctions.updateUser(userId: String, init: AmazonWorkDocsUpdateUserCommand.() -> Unit) {
	this.block.declare(AmazonWorkDocsUpdateUserCommand(userId).apply(init))
}

@Generated
class AmazonWorkDocsUpdateUserCommand(val userId: String) : AmazonWebServiceCommand<com.amazonaws.services.workdocs.model.UpdateUserRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workdocs.updateUser(build())
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
