
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.cognitoidp.AWSCognitoIdentityProvider
import com.amazonaws.services.cognitoidp.model.*

var codingue.koops.core.Environment.cognito_idp: AWSCognitoIdentityProvider
	get() = this.capabilities[AWSCognitoIdentityProvider::class.java.name] as AWSCognitoIdentityProvider
	set(cognito_idp) {
		this.capabilities[AWSCognitoIdentityProvider::class.java.name] = cognito_idp
	}

@Generated
class AWSCognitoIdentityProviderFunctions(val block: Block)

infix fun AwsContinuation.cognito_idp(init: AWSCognitoIdentityProviderFunctions.() -> Unit) {
	AWSCognitoIdentityProviderFunctions(shell).apply(init)
}

			

fun AWSCognitoIdentityProviderFunctions.addCustomAttributes(userPoolId: String, customAttributes: List<com.amazonaws.services.cognitoidp.model.SchemaAttributeType>, init: AWSCognitoIdentityProviderAddCustomAttributesCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderAddCustomAttributesCommand(userPoolId, customAttributes).apply(init))
}

@Generated
class AWSCognitoIdentityProviderAddCustomAttributesCommand(val userPoolId: String, val customAttributes: List<com.amazonaws.services.cognitoidp.model.SchemaAttributeType>) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AddCustomAttributesRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.AddCustomAttributesRequest {
		val input = com.amazonaws.services.cognitoidp.model.AddCustomAttributesRequest()
		input.setUserPoolId(this.userPoolId)
		input.setCustomAttributes(this.customAttributes)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.addCustomAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp add-custom-attributes")
				.argument("user-pool-id", userPoolId)
				.argument("custom-attributes", customAttributes.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.adminAddUserToGroup(userPoolId: String, username: String, groupName: String, init: AWSCognitoIdentityProviderAdminAddUserToGroupCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderAdminAddUserToGroupCommand(userPoolId, username, groupName).apply(init))
}

@Generated
class AWSCognitoIdentityProviderAdminAddUserToGroupCommand(val userPoolId: String, val username: String, val groupName: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminAddUserToGroupRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.AdminAddUserToGroupRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminAddUserToGroupRequest()
		input.setUserPoolId(this.userPoolId)
		input.setUsername(this.username)
		input.setGroupName(this.groupName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.adminAddUserToGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-add-user-to-group")
				.argument("user-pool-id", userPoolId)
				.argument("username", username)
				.argument("group-name", groupName)
	}

}


fun AWSCognitoIdentityProviderFunctions.adminConfirmSignUp(userPoolId: String, username: String, init: AWSCognitoIdentityProviderAdminConfirmSignUpCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderAdminConfirmSignUpCommand(userPoolId, username).apply(init))
}

@Generated
class AWSCognitoIdentityProviderAdminConfirmSignUpCommand(val userPoolId: String, val username: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminConfirmSignUpRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.AdminConfirmSignUpRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminConfirmSignUpRequest()
		input.setUserPoolId(this.userPoolId)
		input.setUsername(this.username)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.adminConfirmSignUp(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-confirm-sign-up")
				.argument("user-pool-id", userPoolId)
				.argument("username", username)
	}

}


fun AWSCognitoIdentityProviderFunctions.adminCreateUser(userPoolId: String, username: String, init: AWSCognitoIdentityProviderAdminCreateUserCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderAdminCreateUserCommand(userPoolId, username).apply(init))
}

@Generated
class AWSCognitoIdentityProviderAdminCreateUserCommand(val userPoolId: String, val username: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminCreateUserRequest> {

	var userAttributes: List<com.amazonaws.services.cognitoidp.model.AttributeType>? = null
	var validationData: List<com.amazonaws.services.cognitoidp.model.AttributeType>? = null
	var temporaryPassword: String? = null
	var forceAliasCreation: Boolean? = false
	var messageAction: MessageActionType? = null
	var desiredDeliveryMediums: List<DeliveryMediumType>? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.AdminCreateUserRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminCreateUserRequest()
		input.setUserPoolId(this.userPoolId)
		input.setUsername(this.username)
		input.setUserAttributes(this.userAttributes)
		input.setValidationData(this.validationData)
		input.setTemporaryPassword(this.temporaryPassword)
		input.setForceAliasCreation(this.forceAliasCreation)
		input.setMessageAction(this.messageAction?.toString())
		input.setDesiredDeliveryMediums(this.desiredDeliveryMediums?.map { it.toString() })
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.adminCreateUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-create-user")
				.argument("user-pool-id", userPoolId)
				.argument("username", username)
				.argument("user-attributes", userAttributes?.toString())
				.argument("validation-data", validationData?.toString())
				.argument("temporary-password", temporaryPassword)
				.option("force-alias-creation", forceAliasCreation ?: false)
				.argument("message-action", messageAction?.toString())
				.argument("desired-delivery-mediums", desiredDeliveryMediums?.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.adminDeleteUser(userPoolId: String, username: String, init: AWSCognitoIdentityProviderAdminDeleteUserCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderAdminDeleteUserCommand(userPoolId, username).apply(init))
}

@Generated
class AWSCognitoIdentityProviderAdminDeleteUserCommand(val userPoolId: String, val username: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminDeleteUserRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.AdminDeleteUserRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminDeleteUserRequest()
		input.setUserPoolId(this.userPoolId)
		input.setUsername(this.username)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.adminDeleteUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-delete-user")
				.argument("user-pool-id", userPoolId)
				.argument("username", username)
	}

}


fun AWSCognitoIdentityProviderFunctions.adminDeleteUserAttributes(userPoolId: String, username: String, userAttributeNames: List<String>, init: AWSCognitoIdentityProviderAdminDeleteUserAttributesCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderAdminDeleteUserAttributesCommand(userPoolId, username, userAttributeNames).apply(init))
}

@Generated
class AWSCognitoIdentityProviderAdminDeleteUserAttributesCommand(val userPoolId: String, val username: String, val userAttributeNames: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminDeleteUserAttributesRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.AdminDeleteUserAttributesRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminDeleteUserAttributesRequest()
		input.setUserPoolId(this.userPoolId)
		input.setUsername(this.username)
		input.setUserAttributeNames(this.userAttributeNames)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.adminDeleteUserAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-delete-user-attributes")
				.argument("user-pool-id", userPoolId)
				.argument("username", username)
				.argument("user-attribute-names", userAttributeNames.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.adminDisableProviderForUser(userPoolId: String, user: com.amazonaws.services.cognitoidp.model.ProviderUserIdentifierType, init: AWSCognitoIdentityProviderAdminDisableProviderForUserCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderAdminDisableProviderForUserCommand(userPoolId, user).apply(init))
}

@Generated
class AWSCognitoIdentityProviderAdminDisableProviderForUserCommand(val userPoolId: String, val user: com.amazonaws.services.cognitoidp.model.ProviderUserIdentifierType) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminDisableProviderForUserRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.AdminDisableProviderForUserRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminDisableProviderForUserRequest()
		input.setUserPoolId(this.userPoolId)
		input.setUser(this.user)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.adminDisableProviderForUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-disable-provider-for-user")
				.argument("user-pool-id", userPoolId)
				.argument("user", user.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.adminDisableUser(userPoolId: String, username: String, init: AWSCognitoIdentityProviderAdminDisableUserCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderAdminDisableUserCommand(userPoolId, username).apply(init))
}

@Generated
class AWSCognitoIdentityProviderAdminDisableUserCommand(val userPoolId: String, val username: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminDisableUserRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.AdminDisableUserRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminDisableUserRequest()
		input.setUserPoolId(this.userPoolId)
		input.setUsername(this.username)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.adminDisableUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-disable-user")
				.argument("user-pool-id", userPoolId)
				.argument("username", username)
	}

}


fun AWSCognitoIdentityProviderFunctions.adminEnableUser(userPoolId: String, username: String, init: AWSCognitoIdentityProviderAdminEnableUserCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderAdminEnableUserCommand(userPoolId, username).apply(init))
}

@Generated
class AWSCognitoIdentityProviderAdminEnableUserCommand(val userPoolId: String, val username: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminEnableUserRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.AdminEnableUserRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminEnableUserRequest()
		input.setUserPoolId(this.userPoolId)
		input.setUsername(this.username)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.adminEnableUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-enable-user")
				.argument("user-pool-id", userPoolId)
				.argument("username", username)
	}

}


fun AWSCognitoIdentityProviderFunctions.adminForgetDevice(userPoolId: String, username: String, deviceKey: String, init: AWSCognitoIdentityProviderAdminForgetDeviceCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderAdminForgetDeviceCommand(userPoolId, username, deviceKey).apply(init))
}

@Generated
class AWSCognitoIdentityProviderAdminForgetDeviceCommand(val userPoolId: String, val username: String, val deviceKey: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminForgetDeviceRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.AdminForgetDeviceRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminForgetDeviceRequest()
		input.setUserPoolId(this.userPoolId)
		input.setUsername(this.username)
		input.setDeviceKey(this.deviceKey)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.adminForgetDevice(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-forget-device")
				.argument("user-pool-id", userPoolId)
				.argument("username", username)
				.argument("device-key", deviceKey)
	}

}


fun AWSCognitoIdentityProviderFunctions.adminGetDevice(deviceKey: String, userPoolId: String, username: String, init: AWSCognitoIdentityProviderAdminGetDeviceCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderAdminGetDeviceCommand(deviceKey, userPoolId, username).apply(init))
}

@Generated
class AWSCognitoIdentityProviderAdminGetDeviceCommand(val deviceKey: String, val userPoolId: String, val username: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminGetDeviceRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.AdminGetDeviceRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminGetDeviceRequest()
		input.setDeviceKey(this.deviceKey)
		input.setUserPoolId(this.userPoolId)
		input.setUsername(this.username)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.adminGetDevice(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-get-device")
				.argument("device-key", deviceKey)
				.argument("user-pool-id", userPoolId)
				.argument("username", username)
	}

}


fun AWSCognitoIdentityProviderFunctions.adminGetUser(userPoolId: String, username: String, init: AWSCognitoIdentityProviderAdminGetUserCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderAdminGetUserCommand(userPoolId, username).apply(init))
}

@Generated
class AWSCognitoIdentityProviderAdminGetUserCommand(val userPoolId: String, val username: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminGetUserRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.AdminGetUserRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminGetUserRequest()
		input.setUserPoolId(this.userPoolId)
		input.setUsername(this.username)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.adminGetUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-get-user")
				.argument("user-pool-id", userPoolId)
				.argument("username", username)
	}

}


fun AWSCognitoIdentityProviderFunctions.adminInitiateAuth(userPoolId: String, clientId: String, authFlow: AuthFlowType, init: AWSCognitoIdentityProviderAdminInitiateAuthCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderAdminInitiateAuthCommand(userPoolId, clientId, authFlow).apply(init))
}

@Generated
class AWSCognitoIdentityProviderAdminInitiateAuthCommand(val userPoolId: String, val clientId: String, val authFlow: AuthFlowType) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminInitiateAuthRequest> {

	var authParameters: Map<String, String>? = null
	var clientMetadata: Map<String, String>? = null
	var analyticsMetadata: com.amazonaws.services.cognitoidp.model.AnalyticsMetadataType? = null
	var contextData: com.amazonaws.services.cognitoidp.model.ContextDataType? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.AdminInitiateAuthRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminInitiateAuthRequest()
		input.setUserPoolId(this.userPoolId)
		input.setClientId(this.clientId)
		input.setAuthFlow(this.authFlow.toString())
		input.setAuthParameters(this.authParameters)
		input.setClientMetadata(this.clientMetadata)
		input.setAnalyticsMetadata(this.analyticsMetadata)
		input.setContextData(this.contextData)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.adminInitiateAuth(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-initiate-auth")
				.argument("user-pool-id", userPoolId)
				.argument("client-id", clientId)
				.argument("auth-flow", authFlow.toString())
				.argument("auth-parameters", authParameters?.toString())
				.argument("client-metadata", clientMetadata?.toString())
				.argument("analytics-metadata", analyticsMetadata?.toString())
				.argument("context-data", contextData?.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.adminLinkProviderForUser(userPoolId: String, destinationUser: com.amazonaws.services.cognitoidp.model.ProviderUserIdentifierType, sourceUser: com.amazonaws.services.cognitoidp.model.ProviderUserIdentifierType, init: AWSCognitoIdentityProviderAdminLinkProviderForUserCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderAdminLinkProviderForUserCommand(userPoolId, destinationUser, sourceUser).apply(init))
}

@Generated
class AWSCognitoIdentityProviderAdminLinkProviderForUserCommand(val userPoolId: String, val destinationUser: com.amazonaws.services.cognitoidp.model.ProviderUserIdentifierType, val sourceUser: com.amazonaws.services.cognitoidp.model.ProviderUserIdentifierType) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminLinkProviderForUserRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.AdminLinkProviderForUserRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminLinkProviderForUserRequest()
		input.setUserPoolId(this.userPoolId)
		input.setDestinationUser(this.destinationUser)
		input.setSourceUser(this.sourceUser)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.adminLinkProviderForUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-link-provider-for-user")
				.argument("user-pool-id", userPoolId)
				.argument("destination-user", destinationUser.toString())
				.argument("source-user", sourceUser.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.adminListDevices(userPoolId: String, username: String, init: AWSCognitoIdentityProviderAdminListDevicesCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderAdminListDevicesCommand(userPoolId, username).apply(init))
}

@Generated
class AWSCognitoIdentityProviderAdminListDevicesCommand(val userPoolId: String, val username: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminListDevicesRequest> {

	var limit: Int? = 0
	var paginationToken: String? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.AdminListDevicesRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminListDevicesRequest()
		input.setUserPoolId(this.userPoolId)
		input.setUsername(this.username)
		input.setLimit(this.limit)
		input.setPaginationToken(this.paginationToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.adminListDevices(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-list-devices")
				.argument("user-pool-id", userPoolId)
				.argument("username", username)
				.argument("limit", limit?.toString())
				.argument("pagination-token", paginationToken)
	}

}


fun AWSCognitoIdentityProviderFunctions.adminListGroupsForUser(username: String, userPoolId: String, init: AWSCognitoIdentityProviderAdminListGroupsForUserCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderAdminListGroupsForUserCommand(username, userPoolId).apply(init))
}

@Generated
class AWSCognitoIdentityProviderAdminListGroupsForUserCommand(val username: String, val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminListGroupsForUserRequest> {

	var limit: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.AdminListGroupsForUserRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminListGroupsForUserRequest()
		input.setUsername(this.username)
		input.setUserPoolId(this.userPoolId)
		input.setLimit(this.limit)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.adminListGroupsForUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-list-groups-for-user")
				.argument("username", username)
				.argument("user-pool-id", userPoolId)
				.argument("limit", limit?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSCognitoIdentityProviderFunctions.adminListUserAuthEvents(userPoolId: String, username: String, init: AWSCognitoIdentityProviderAdminListUserAuthEventsCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderAdminListUserAuthEventsCommand(userPoolId, username).apply(init))
}

@Generated
class AWSCognitoIdentityProviderAdminListUserAuthEventsCommand(val userPoolId: String, val username: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminListUserAuthEventsRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.AdminListUserAuthEventsRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminListUserAuthEventsRequest()
		input.setUserPoolId(this.userPoolId)
		input.setUsername(this.username)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.adminListUserAuthEvents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-list-user-auth-events")
				.argument("user-pool-id", userPoolId)
				.argument("username", username)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSCognitoIdentityProviderFunctions.adminRemoveUserFromGroup(userPoolId: String, username: String, groupName: String, init: AWSCognitoIdentityProviderAdminRemoveUserFromGroupCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderAdminRemoveUserFromGroupCommand(userPoolId, username, groupName).apply(init))
}

@Generated
class AWSCognitoIdentityProviderAdminRemoveUserFromGroupCommand(val userPoolId: String, val username: String, val groupName: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminRemoveUserFromGroupRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.AdminRemoveUserFromGroupRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminRemoveUserFromGroupRequest()
		input.setUserPoolId(this.userPoolId)
		input.setUsername(this.username)
		input.setGroupName(this.groupName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.adminRemoveUserFromGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-remove-user-from-group")
				.argument("user-pool-id", userPoolId)
				.argument("username", username)
				.argument("group-name", groupName)
	}

}


fun AWSCognitoIdentityProviderFunctions.adminResetUserPassword(userPoolId: String, username: String, init: AWSCognitoIdentityProviderAdminResetUserPasswordCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderAdminResetUserPasswordCommand(userPoolId, username).apply(init))
}

@Generated
class AWSCognitoIdentityProviderAdminResetUserPasswordCommand(val userPoolId: String, val username: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminResetUserPasswordRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.AdminResetUserPasswordRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminResetUserPasswordRequest()
		input.setUserPoolId(this.userPoolId)
		input.setUsername(this.username)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.adminResetUserPassword(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-reset-user-password")
				.argument("user-pool-id", userPoolId)
				.argument("username", username)
	}

}


fun AWSCognitoIdentityProviderFunctions.adminRespondToAuthChallenge(userPoolId: String, clientId: String, challengeName: ChallengeNameType, init: AWSCognitoIdentityProviderAdminRespondToAuthChallengeCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderAdminRespondToAuthChallengeCommand(userPoolId, clientId, challengeName).apply(init))
}

@Generated
class AWSCognitoIdentityProviderAdminRespondToAuthChallengeCommand(val userPoolId: String, val clientId: String, val challengeName: ChallengeNameType) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminRespondToAuthChallengeRequest> {

	var challengeResponses: Map<String, String>? = null
	var session: String? = null
	var analyticsMetadata: com.amazonaws.services.cognitoidp.model.AnalyticsMetadataType? = null
	var contextData: com.amazonaws.services.cognitoidp.model.ContextDataType? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.AdminRespondToAuthChallengeRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminRespondToAuthChallengeRequest()
		input.setUserPoolId(this.userPoolId)
		input.setClientId(this.clientId)
		input.setChallengeName(this.challengeName.toString())
		input.setChallengeResponses(this.challengeResponses)
		input.setSession(this.session)
		input.setAnalyticsMetadata(this.analyticsMetadata)
		input.setContextData(this.contextData)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.adminRespondToAuthChallenge(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-respond-to-auth-challenge")
				.argument("user-pool-id", userPoolId)
				.argument("client-id", clientId)
				.argument("challenge-name", challengeName.toString())
				.argument("challenge-responses", challengeResponses?.toString())
				.argument("session", session)
				.argument("analytics-metadata", analyticsMetadata?.toString())
				.argument("context-data", contextData?.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.adminSetUserMFAPreference(username: String, userPoolId: String, init: AWSCognitoIdentityProviderAdminSetUserMFAPreferenceCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderAdminSetUserMFAPreferenceCommand(username, userPoolId).apply(init))
}

@Generated
class AWSCognitoIdentityProviderAdminSetUserMFAPreferenceCommand(val username: String, val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminSetUserMFAPreferenceRequest> {

	var sMSMfaSettings: com.amazonaws.services.cognitoidp.model.SMSMfaSettingsType? = null
	var softwareTokenMfaSettings: com.amazonaws.services.cognitoidp.model.SoftwareTokenMfaSettingsType? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.AdminSetUserMFAPreferenceRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminSetUserMFAPreferenceRequest()
		input.setSMSMfaSettings(this.sMSMfaSettings)
		input.setSoftwareTokenMfaSettings(this.softwareTokenMfaSettings)
		input.setUsername(this.username)
		input.setUserPoolId(this.userPoolId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.adminSetUserMFAPreference(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-set-user-mfapreference")
				.argument("smsmfa-settings", sMSMfaSettings?.toString())
				.argument("software-token-mfa-settings", softwareTokenMfaSettings?.toString())
				.argument("username", username)
				.argument("user-pool-id", userPoolId)
	}

}


fun AWSCognitoIdentityProviderFunctions.adminSetUserSettings(userPoolId: String, username: String, mFAOptions: List<com.amazonaws.services.cognitoidp.model.MFAOptionType>, init: AWSCognitoIdentityProviderAdminSetUserSettingsCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderAdminSetUserSettingsCommand(userPoolId, username, mFAOptions).apply(init))
}

@Generated
class AWSCognitoIdentityProviderAdminSetUserSettingsCommand(val userPoolId: String, val username: String, val mFAOptions: List<com.amazonaws.services.cognitoidp.model.MFAOptionType>) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminSetUserSettingsRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.AdminSetUserSettingsRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminSetUserSettingsRequest()
		input.setUserPoolId(this.userPoolId)
		input.setUsername(this.username)
		input.setMFAOptions(this.mFAOptions)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.adminSetUserSettings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-set-user-settings")
				.argument("user-pool-id", userPoolId)
				.argument("username", username)
				.argument("mfaoptions", mFAOptions.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.adminUpdateAuthEventFeedback(userPoolId: String, username: String, eventId: String, feedbackValue: FeedbackValueType, init: AWSCognitoIdentityProviderAdminUpdateAuthEventFeedbackCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderAdminUpdateAuthEventFeedbackCommand(userPoolId, username, eventId, feedbackValue).apply(init))
}

@Generated
class AWSCognitoIdentityProviderAdminUpdateAuthEventFeedbackCommand(val userPoolId: String, val username: String, val eventId: String, val feedbackValue: FeedbackValueType) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminUpdateAuthEventFeedbackRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.AdminUpdateAuthEventFeedbackRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminUpdateAuthEventFeedbackRequest()
		input.setUserPoolId(this.userPoolId)
		input.setUsername(this.username)
		input.setEventId(this.eventId)
		input.setFeedbackValue(this.feedbackValue.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.adminUpdateAuthEventFeedback(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-update-auth-event-feedback")
				.argument("user-pool-id", userPoolId)
				.argument("username", username)
				.argument("event-id", eventId)
				.argument("feedback-value", feedbackValue.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.adminUpdateDeviceStatus(userPoolId: String, username: String, deviceKey: String, init: AWSCognitoIdentityProviderAdminUpdateDeviceStatusCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderAdminUpdateDeviceStatusCommand(userPoolId, username, deviceKey).apply(init))
}

@Generated
class AWSCognitoIdentityProviderAdminUpdateDeviceStatusCommand(val userPoolId: String, val username: String, val deviceKey: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminUpdateDeviceStatusRequest> {

	var deviceRememberedStatus: DeviceRememberedStatusType? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.AdminUpdateDeviceStatusRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminUpdateDeviceStatusRequest()
		input.setUserPoolId(this.userPoolId)
		input.setUsername(this.username)
		input.setDeviceKey(this.deviceKey)
		input.setDeviceRememberedStatus(this.deviceRememberedStatus?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.adminUpdateDeviceStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-update-device-status")
				.argument("user-pool-id", userPoolId)
				.argument("username", username)
				.argument("device-key", deviceKey)
				.argument("device-remembered-status", deviceRememberedStatus?.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.adminUpdateUserAttributes(userPoolId: String, username: String, userAttributes: List<com.amazonaws.services.cognitoidp.model.AttributeType>, init: AWSCognitoIdentityProviderAdminUpdateUserAttributesCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderAdminUpdateUserAttributesCommand(userPoolId, username, userAttributes).apply(init))
}

@Generated
class AWSCognitoIdentityProviderAdminUpdateUserAttributesCommand(val userPoolId: String, val username: String, val userAttributes: List<com.amazonaws.services.cognitoidp.model.AttributeType>) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminUpdateUserAttributesRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.AdminUpdateUserAttributesRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminUpdateUserAttributesRequest()
		input.setUserPoolId(this.userPoolId)
		input.setUsername(this.username)
		input.setUserAttributes(this.userAttributes)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.adminUpdateUserAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-update-user-attributes")
				.argument("user-pool-id", userPoolId)
				.argument("username", username)
				.argument("user-attributes", userAttributes.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.adminUserGlobalSignOut(userPoolId: String, username: String, init: AWSCognitoIdentityProviderAdminUserGlobalSignOutCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderAdminUserGlobalSignOutCommand(userPoolId, username).apply(init))
}

@Generated
class AWSCognitoIdentityProviderAdminUserGlobalSignOutCommand(val userPoolId: String, val username: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminUserGlobalSignOutRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.AdminUserGlobalSignOutRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminUserGlobalSignOutRequest()
		input.setUserPoolId(this.userPoolId)
		input.setUsername(this.username)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.adminUserGlobalSignOut(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-user-global-sign-out")
				.argument("user-pool-id", userPoolId)
				.argument("username", username)
	}

}


fun AWSCognitoIdentityProviderFunctions.associateSoftwareToken(init: AWSCognitoIdentityProviderAssociateSoftwareTokenCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderAssociateSoftwareTokenCommand().apply(init))
}

@Generated
class AWSCognitoIdentityProviderAssociateSoftwareTokenCommand() : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AssociateSoftwareTokenRequest> {

	var accessToken: String? = null
	var session: String? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.AssociateSoftwareTokenRequest {
		val input = com.amazonaws.services.cognitoidp.model.AssociateSoftwareTokenRequest()
		input.setAccessToken(this.accessToken)
		input.setSession(this.session)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.associateSoftwareToken(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp associate-software-token")
				.argument("access-token", accessToken)
				.argument("session", session)
	}

}


fun AWSCognitoIdentityProviderFunctions.changePassword(previousPassword: String, proposedPassword: String, accessToken: String, init: AWSCognitoIdentityProviderChangePasswordCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderChangePasswordCommand(previousPassword, proposedPassword, accessToken).apply(init))
}

@Generated
class AWSCognitoIdentityProviderChangePasswordCommand(val previousPassword: String, val proposedPassword: String, val accessToken: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.ChangePasswordRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.ChangePasswordRequest {
		val input = com.amazonaws.services.cognitoidp.model.ChangePasswordRequest()
		input.setPreviousPassword(this.previousPassword)
		input.setProposedPassword(this.proposedPassword)
		input.setAccessToken(this.accessToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.changePassword(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp change-password")
				.argument("previous-password", previousPassword)
				.argument("proposed-password", proposedPassword)
				.argument("access-token", accessToken)
	}

}


fun AWSCognitoIdentityProviderFunctions.confirmDevice(accessToken: String, deviceKey: String, init: AWSCognitoIdentityProviderConfirmDeviceCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderConfirmDeviceCommand(accessToken, deviceKey).apply(init))
}

@Generated
class AWSCognitoIdentityProviderConfirmDeviceCommand(val accessToken: String, val deviceKey: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.ConfirmDeviceRequest> {

	var deviceSecretVerifierConfig: com.amazonaws.services.cognitoidp.model.DeviceSecretVerifierConfigType? = null
	var deviceName: String? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.ConfirmDeviceRequest {
		val input = com.amazonaws.services.cognitoidp.model.ConfirmDeviceRequest()
		input.setAccessToken(this.accessToken)
		input.setDeviceKey(this.deviceKey)
		input.setDeviceSecretVerifierConfig(this.deviceSecretVerifierConfig)
		input.setDeviceName(this.deviceName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.confirmDevice(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp confirm-device")
				.argument("access-token", accessToken)
				.argument("device-key", deviceKey)
				.argument("device-secret-verifier-config", deviceSecretVerifierConfig?.toString())
				.argument("device-name", deviceName)
	}

}


fun AWSCognitoIdentityProviderFunctions.confirmForgotPassword(clientId: String, username: String, confirmationCode: String, password: String, init: AWSCognitoIdentityProviderConfirmForgotPasswordCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderConfirmForgotPasswordCommand(clientId, username, confirmationCode, password).apply(init))
}

@Generated
class AWSCognitoIdentityProviderConfirmForgotPasswordCommand(val clientId: String, val username: String, val confirmationCode: String, val password: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.ConfirmForgotPasswordRequest> {

	var secretHash: String? = null
	var analyticsMetadata: com.amazonaws.services.cognitoidp.model.AnalyticsMetadataType? = null
	var userContextData: com.amazonaws.services.cognitoidp.model.UserContextDataType? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.ConfirmForgotPasswordRequest {
		val input = com.amazonaws.services.cognitoidp.model.ConfirmForgotPasswordRequest()
		input.setClientId(this.clientId)
		input.setSecretHash(this.secretHash)
		input.setUsername(this.username)
		input.setConfirmationCode(this.confirmationCode)
		input.setPassword(this.password)
		input.setAnalyticsMetadata(this.analyticsMetadata)
		input.setUserContextData(this.userContextData)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.confirmForgotPassword(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp confirm-forgot-password")
				.argument("client-id", clientId)
				.argument("secret-hash", secretHash)
				.argument("username", username)
				.argument("confirmation-code", confirmationCode)
				.argument("password", password)
				.argument("analytics-metadata", analyticsMetadata?.toString())
				.argument("user-context-data", userContextData?.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.confirmSignUp(clientId: String, username: String, confirmationCode: String, init: AWSCognitoIdentityProviderConfirmSignUpCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderConfirmSignUpCommand(clientId, username, confirmationCode).apply(init))
}

@Generated
class AWSCognitoIdentityProviderConfirmSignUpCommand(val clientId: String, val username: String, val confirmationCode: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.ConfirmSignUpRequest> {

	var secretHash: String? = null
	var forceAliasCreation: Boolean? = false
	var analyticsMetadata: com.amazonaws.services.cognitoidp.model.AnalyticsMetadataType? = null
	var userContextData: com.amazonaws.services.cognitoidp.model.UserContextDataType? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.ConfirmSignUpRequest {
		val input = com.amazonaws.services.cognitoidp.model.ConfirmSignUpRequest()
		input.setClientId(this.clientId)
		input.setSecretHash(this.secretHash)
		input.setUsername(this.username)
		input.setConfirmationCode(this.confirmationCode)
		input.setForceAliasCreation(this.forceAliasCreation)
		input.setAnalyticsMetadata(this.analyticsMetadata)
		input.setUserContextData(this.userContextData)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.confirmSignUp(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp confirm-sign-up")
				.argument("client-id", clientId)
				.argument("secret-hash", secretHash)
				.argument("username", username)
				.argument("confirmation-code", confirmationCode)
				.option("force-alias-creation", forceAliasCreation ?: false)
				.argument("analytics-metadata", analyticsMetadata?.toString())
				.argument("user-context-data", userContextData?.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.createGroup(groupName: String, userPoolId: String, init: AWSCognitoIdentityProviderCreateGroupCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderCreateGroupCommand(groupName, userPoolId).apply(init))
}

@Generated
class AWSCognitoIdentityProviderCreateGroupCommand(val groupName: String, val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.CreateGroupRequest> {

	var description: String? = null
	var roleArn: String? = null
	var precedence: Int? = 0

	override fun build(): com.amazonaws.services.cognitoidp.model.CreateGroupRequest {
		val input = com.amazonaws.services.cognitoidp.model.CreateGroupRequest()
		input.setGroupName(this.groupName)
		input.setUserPoolId(this.userPoolId)
		input.setDescription(this.description)
		input.setRoleArn(this.roleArn)
		input.setPrecedence(this.precedence)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.createGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp create-group")
				.argument("group-name", groupName)
				.argument("user-pool-id", userPoolId)
				.argument("description", description)
				.argument("role-arn", roleArn)
				.argument("precedence", precedence?.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.createIdentityProvider(userPoolId: String, providerName: String, providerType: IdentityProviderTypeType, providerDetails: Map<String, String>, init: AWSCognitoIdentityProviderCreateIdentityProviderCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderCreateIdentityProviderCommand(userPoolId, providerName, providerType, providerDetails).apply(init))
}

@Generated
class AWSCognitoIdentityProviderCreateIdentityProviderCommand(val userPoolId: String, val providerName: String, val providerType: IdentityProviderTypeType, val providerDetails: Map<String, String>) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.CreateIdentityProviderRequest> {

	var attributeMapping: Map<String, String>? = null
	var idpIdentifiers: List<String>? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.CreateIdentityProviderRequest {
		val input = com.amazonaws.services.cognitoidp.model.CreateIdentityProviderRequest()
		input.setUserPoolId(this.userPoolId)
		input.setProviderName(this.providerName)
		input.setProviderType(this.providerType.toString())
		input.setProviderDetails(this.providerDetails)
		input.setAttributeMapping(this.attributeMapping)
		input.setIdpIdentifiers(this.idpIdentifiers)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.createIdentityProvider(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp create-identity-provider")
				.argument("user-pool-id", userPoolId)
				.argument("provider-name", providerName)
				.argument("provider-type", providerType.toString())
				.argument("provider-details", providerDetails.toString())
				.argument("attribute-mapping", attributeMapping?.toString())
				.argument("idp-identifiers", idpIdentifiers?.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.createResourceServer(userPoolId: String, identifier: String, name: String, init: AWSCognitoIdentityProviderCreateResourceServerCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderCreateResourceServerCommand(userPoolId, identifier, name).apply(init))
}

@Generated
class AWSCognitoIdentityProviderCreateResourceServerCommand(val userPoolId: String, val identifier: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.CreateResourceServerRequest> {

	var scopes: List<com.amazonaws.services.cognitoidp.model.ResourceServerScopeType>? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.CreateResourceServerRequest {
		val input = com.amazonaws.services.cognitoidp.model.CreateResourceServerRequest()
		input.setUserPoolId(this.userPoolId)
		input.setIdentifier(this.identifier)
		input.setName(this.name)
		input.setScopes(this.scopes)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.createResourceServer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp create-resource-server")
				.argument("user-pool-id", userPoolId)
				.argument("identifier", identifier)
				.argument("name", name)
				.argument("scopes", scopes?.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.createUserImportJob(jobName: String, userPoolId: String, cloudWatchLogsRoleArn: String, init: AWSCognitoIdentityProviderCreateUserImportJobCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderCreateUserImportJobCommand(jobName, userPoolId, cloudWatchLogsRoleArn).apply(init))
}

@Generated
class AWSCognitoIdentityProviderCreateUserImportJobCommand(val jobName: String, val userPoolId: String, val cloudWatchLogsRoleArn: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.CreateUserImportJobRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.CreateUserImportJobRequest {
		val input = com.amazonaws.services.cognitoidp.model.CreateUserImportJobRequest()
		input.setJobName(this.jobName)
		input.setUserPoolId(this.userPoolId)
		input.setCloudWatchLogsRoleArn(this.cloudWatchLogsRoleArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.createUserImportJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp create-user-import-job")
				.argument("job-name", jobName)
				.argument("user-pool-id", userPoolId)
				.argument("cloud-watch-logs-role-arn", cloudWatchLogsRoleArn)
	}

}


fun AWSCognitoIdentityProviderFunctions.createUserPool(poolName: String, init: AWSCognitoIdentityProviderCreateUserPoolCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderCreateUserPoolCommand(poolName).apply(init))
}

@Generated
class AWSCognitoIdentityProviderCreateUserPoolCommand(val poolName: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.CreateUserPoolRequest> {

	var policies: com.amazonaws.services.cognitoidp.model.UserPoolPolicyType? = null
	var lambdaConfig: com.amazonaws.services.cognitoidp.model.LambdaConfigType? = null
	var autoVerifiedAttributes: List<VerifiedAttributeType>? = null
	var aliasAttributes: List<AliasAttributeType>? = null
	var usernameAttributes: List<UsernameAttributeType>? = null
	var smsVerificationMessage: String? = null
	var emailVerificationMessage: String? = null
	var emailVerificationSubject: String? = null
	var verificationMessageTemplate: com.amazonaws.services.cognitoidp.model.VerificationMessageTemplateType? = null
	var smsAuthenticationMessage: String? = null
	var mfaConfiguration: UserPoolMfaType? = null
	var deviceConfiguration: com.amazonaws.services.cognitoidp.model.DeviceConfigurationType? = null
	var emailConfiguration: com.amazonaws.services.cognitoidp.model.EmailConfigurationType? = null
	var smsConfiguration: com.amazonaws.services.cognitoidp.model.SmsConfigurationType? = null
	var userPoolTags: Map<String, String>? = null
	var adminCreateUserConfig: com.amazonaws.services.cognitoidp.model.AdminCreateUserConfigType? = null
	var schema: List<com.amazonaws.services.cognitoidp.model.SchemaAttributeType>? = null
	var userPoolAddOns: com.amazonaws.services.cognitoidp.model.UserPoolAddOnsType? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.CreateUserPoolRequest {
		val input = com.amazonaws.services.cognitoidp.model.CreateUserPoolRequest()
		input.setPoolName(this.poolName)
		input.setPolicies(this.policies)
		input.setLambdaConfig(this.lambdaConfig)
		input.setAutoVerifiedAttributes(this.autoVerifiedAttributes?.map { it.toString() })
		input.setAliasAttributes(this.aliasAttributes?.map { it.toString() })
		input.setUsernameAttributes(this.usernameAttributes?.map { it.toString() })
		input.setSmsVerificationMessage(this.smsVerificationMessage)
		input.setEmailVerificationMessage(this.emailVerificationMessage)
		input.setEmailVerificationSubject(this.emailVerificationSubject)
		input.setVerificationMessageTemplate(this.verificationMessageTemplate)
		input.setSmsAuthenticationMessage(this.smsAuthenticationMessage)
		input.setMfaConfiguration(this.mfaConfiguration?.toString())
		input.setDeviceConfiguration(this.deviceConfiguration)
		input.setEmailConfiguration(this.emailConfiguration)
		input.setSmsConfiguration(this.smsConfiguration)
		input.setUserPoolTags(this.userPoolTags)
		input.setAdminCreateUserConfig(this.adminCreateUserConfig)
		input.setSchema(this.schema)
		input.setUserPoolAddOns(this.userPoolAddOns)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.createUserPool(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp create-user-pool")
				.argument("pool-name", poolName)
				.argument("policies", policies?.toString())
				.argument("lambda-config", lambdaConfig?.toString())
				.argument("auto-verified-attributes", autoVerifiedAttributes?.toString())
				.argument("alias-attributes", aliasAttributes?.toString())
				.argument("username-attributes", usernameAttributes?.toString())
				.argument("sms-verification-message", smsVerificationMessage)
				.argument("email-verification-message", emailVerificationMessage)
				.argument("email-verification-subject", emailVerificationSubject)
				.argument("verification-message-template", verificationMessageTemplate?.toString())
				.argument("sms-authentication-message", smsAuthenticationMessage)
				.argument("mfa-configuration", mfaConfiguration?.toString())
				.argument("device-configuration", deviceConfiguration?.toString())
				.argument("email-configuration", emailConfiguration?.toString())
				.argument("sms-configuration", smsConfiguration?.toString())
				.argument("user-pool-tags", userPoolTags?.toString())
				.argument("admin-create-user-config", adminCreateUserConfig?.toString())
				.argument("schema", schema?.toString())
				.argument("user-pool-add-ons", userPoolAddOns?.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.createUserPoolClient(userPoolId: String, clientName: String, init: AWSCognitoIdentityProviderCreateUserPoolClientCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderCreateUserPoolClientCommand(userPoolId, clientName).apply(init))
}

@Generated
class AWSCognitoIdentityProviderCreateUserPoolClientCommand(val userPoolId: String, val clientName: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.CreateUserPoolClientRequest> {

	var generateSecret: Boolean? = false
	var refreshTokenValidity: Int? = 0
	var readAttributes: List<String>? = null
	var writeAttributes: List<String>? = null
	var explicitAuthFlows: List<ExplicitAuthFlowsType>? = null
	var supportedIdentityProviders: List<String>? = null
	var callbackURLs: List<String>? = null
	var logoutURLs: List<String>? = null
	var defaultRedirectURI: String? = null
	var allowedOAuthFlows: List<OAuthFlowType>? = null
	var allowedOAuthScopes: List<String>? = null
	var allowedOAuthFlowsUserPoolClient: Boolean? = false
	var analyticsConfiguration: com.amazonaws.services.cognitoidp.model.AnalyticsConfigurationType? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.CreateUserPoolClientRequest {
		val input = com.amazonaws.services.cognitoidp.model.CreateUserPoolClientRequest()
		input.setUserPoolId(this.userPoolId)
		input.setClientName(this.clientName)
		input.setGenerateSecret(this.generateSecret)
		input.setRefreshTokenValidity(this.refreshTokenValidity)
		input.setReadAttributes(this.readAttributes)
		input.setWriteAttributes(this.writeAttributes)
		input.setExplicitAuthFlows(this.explicitAuthFlows?.map { it.toString() })
		input.setSupportedIdentityProviders(this.supportedIdentityProviders)
		input.setCallbackURLs(this.callbackURLs)
		input.setLogoutURLs(this.logoutURLs)
		input.setDefaultRedirectURI(this.defaultRedirectURI)
		input.setAllowedOAuthFlows(this.allowedOAuthFlows?.map { it.toString() })
		input.setAllowedOAuthScopes(this.allowedOAuthScopes)
		input.setAllowedOAuthFlowsUserPoolClient(this.allowedOAuthFlowsUserPoolClient)
		input.setAnalyticsConfiguration(this.analyticsConfiguration)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.createUserPoolClient(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp create-user-pool-client")
				.argument("user-pool-id", userPoolId)
				.argument("client-name", clientName)
				.option("generate-secret", generateSecret ?: false)
				.argument("refresh-token-validity", refreshTokenValidity?.toString())
				.argument("read-attributes", readAttributes?.toString())
				.argument("write-attributes", writeAttributes?.toString())
				.argument("explicit-auth-flows", explicitAuthFlows?.toString())
				.argument("supported-identity-providers", supportedIdentityProviders?.toString())
				.argument("callback-urls", callbackURLs?.toString())
				.argument("logout-urls", logoutURLs?.toString())
				.argument("default-redirect-uri", defaultRedirectURI)
				.argument("allowed-oauth-flows", allowedOAuthFlows?.toString())
				.argument("allowed-oauth-scopes", allowedOAuthScopes?.toString())
				.option("allowed-oauth-flows-user-pool-client", allowedOAuthFlowsUserPoolClient ?: false)
				.argument("analytics-configuration", analyticsConfiguration?.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.createUserPoolDomain(domain: String, userPoolId: String, init: AWSCognitoIdentityProviderCreateUserPoolDomainCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderCreateUserPoolDomainCommand(domain, userPoolId).apply(init))
}

@Generated
class AWSCognitoIdentityProviderCreateUserPoolDomainCommand(val domain: String, val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.CreateUserPoolDomainRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.CreateUserPoolDomainRequest {
		val input = com.amazonaws.services.cognitoidp.model.CreateUserPoolDomainRequest()
		input.setDomain(this.domain)
		input.setUserPoolId(this.userPoolId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.createUserPoolDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp create-user-pool-domain")
				.argument("domain", domain)
				.argument("user-pool-id", userPoolId)
	}

}


fun AWSCognitoIdentityProviderFunctions.deleteGroup(groupName: String, userPoolId: String, init: AWSCognitoIdentityProviderDeleteGroupCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderDeleteGroupCommand(groupName, userPoolId).apply(init))
}

@Generated
class AWSCognitoIdentityProviderDeleteGroupCommand(val groupName: String, val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.DeleteGroupRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.DeleteGroupRequest {
		val input = com.amazonaws.services.cognitoidp.model.DeleteGroupRequest()
		input.setGroupName(this.groupName)
		input.setUserPoolId(this.userPoolId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.deleteGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp delete-group")
				.argument("group-name", groupName)
				.argument("user-pool-id", userPoolId)
	}

}


fun AWSCognitoIdentityProviderFunctions.deleteIdentityProvider(userPoolId: String, providerName: String, init: AWSCognitoIdentityProviderDeleteIdentityProviderCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderDeleteIdentityProviderCommand(userPoolId, providerName).apply(init))
}

@Generated
class AWSCognitoIdentityProviderDeleteIdentityProviderCommand(val userPoolId: String, val providerName: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.DeleteIdentityProviderRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.DeleteIdentityProviderRequest {
		val input = com.amazonaws.services.cognitoidp.model.DeleteIdentityProviderRequest()
		input.setUserPoolId(this.userPoolId)
		input.setProviderName(this.providerName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.deleteIdentityProvider(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp delete-identity-provider")
				.argument("user-pool-id", userPoolId)
				.argument("provider-name", providerName)
	}

}


fun AWSCognitoIdentityProviderFunctions.deleteResourceServer(userPoolId: String, identifier: String, init: AWSCognitoIdentityProviderDeleteResourceServerCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderDeleteResourceServerCommand(userPoolId, identifier).apply(init))
}

@Generated
class AWSCognitoIdentityProviderDeleteResourceServerCommand(val userPoolId: String, val identifier: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.DeleteResourceServerRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.DeleteResourceServerRequest {
		val input = com.amazonaws.services.cognitoidp.model.DeleteResourceServerRequest()
		input.setUserPoolId(this.userPoolId)
		input.setIdentifier(this.identifier)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.deleteResourceServer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp delete-resource-server")
				.argument("user-pool-id", userPoolId)
				.argument("identifier", identifier)
	}

}


fun AWSCognitoIdentityProviderFunctions.deleteUser(accessToken: String, init: AWSCognitoIdentityProviderDeleteUserCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderDeleteUserCommand(accessToken).apply(init))
}

@Generated
class AWSCognitoIdentityProviderDeleteUserCommand(val accessToken: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.DeleteUserRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.DeleteUserRequest {
		val input = com.amazonaws.services.cognitoidp.model.DeleteUserRequest()
		input.setAccessToken(this.accessToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.deleteUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp delete-user")
				.argument("access-token", accessToken)
	}

}


fun AWSCognitoIdentityProviderFunctions.deleteUserAttributes(userAttributeNames: List<String>, accessToken: String, init: AWSCognitoIdentityProviderDeleteUserAttributesCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderDeleteUserAttributesCommand(userAttributeNames, accessToken).apply(init))
}

@Generated
class AWSCognitoIdentityProviderDeleteUserAttributesCommand(val userAttributeNames: List<String>, val accessToken: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.DeleteUserAttributesRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.DeleteUserAttributesRequest {
		val input = com.amazonaws.services.cognitoidp.model.DeleteUserAttributesRequest()
		input.setUserAttributeNames(this.userAttributeNames)
		input.setAccessToken(this.accessToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.deleteUserAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp delete-user-attributes")
				.argument("user-attribute-names", userAttributeNames.toString())
				.argument("access-token", accessToken)
	}

}


fun AWSCognitoIdentityProviderFunctions.deleteUserPool(userPoolId: String, init: AWSCognitoIdentityProviderDeleteUserPoolCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderDeleteUserPoolCommand(userPoolId).apply(init))
}

@Generated
class AWSCognitoIdentityProviderDeleteUserPoolCommand(val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.DeleteUserPoolRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.DeleteUserPoolRequest {
		val input = com.amazonaws.services.cognitoidp.model.DeleteUserPoolRequest()
		input.setUserPoolId(this.userPoolId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.deleteUserPool(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp delete-user-pool")
				.argument("user-pool-id", userPoolId)
	}

}


fun AWSCognitoIdentityProviderFunctions.deleteUserPoolClient(userPoolId: String, clientId: String, init: AWSCognitoIdentityProviderDeleteUserPoolClientCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderDeleteUserPoolClientCommand(userPoolId, clientId).apply(init))
}

@Generated
class AWSCognitoIdentityProviderDeleteUserPoolClientCommand(val userPoolId: String, val clientId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.DeleteUserPoolClientRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.DeleteUserPoolClientRequest {
		val input = com.amazonaws.services.cognitoidp.model.DeleteUserPoolClientRequest()
		input.setUserPoolId(this.userPoolId)
		input.setClientId(this.clientId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.deleteUserPoolClient(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp delete-user-pool-client")
				.argument("user-pool-id", userPoolId)
				.argument("client-id", clientId)
	}

}


fun AWSCognitoIdentityProviderFunctions.deleteUserPoolDomain(domain: String, userPoolId: String, init: AWSCognitoIdentityProviderDeleteUserPoolDomainCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderDeleteUserPoolDomainCommand(domain, userPoolId).apply(init))
}

@Generated
class AWSCognitoIdentityProviderDeleteUserPoolDomainCommand(val domain: String, val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.DeleteUserPoolDomainRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.DeleteUserPoolDomainRequest {
		val input = com.amazonaws.services.cognitoidp.model.DeleteUserPoolDomainRequest()
		input.setDomain(this.domain)
		input.setUserPoolId(this.userPoolId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.deleteUserPoolDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp delete-user-pool-domain")
				.argument("domain", domain)
				.argument("user-pool-id", userPoolId)
	}

}


fun AWSCognitoIdentityProviderFunctions.describeIdentityProvider(userPoolId: String, providerName: String, init: AWSCognitoIdentityProviderDescribeIdentityProviderCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderDescribeIdentityProviderCommand(userPoolId, providerName).apply(init))
}

@Generated
class AWSCognitoIdentityProviderDescribeIdentityProviderCommand(val userPoolId: String, val providerName: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.DescribeIdentityProviderRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.DescribeIdentityProviderRequest {
		val input = com.amazonaws.services.cognitoidp.model.DescribeIdentityProviderRequest()
		input.setUserPoolId(this.userPoolId)
		input.setProviderName(this.providerName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.describeIdentityProvider(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp describe-identity-provider")
				.argument("user-pool-id", userPoolId)
				.argument("provider-name", providerName)
	}

}


fun AWSCognitoIdentityProviderFunctions.describeResourceServer(userPoolId: String, identifier: String, init: AWSCognitoIdentityProviderDescribeResourceServerCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderDescribeResourceServerCommand(userPoolId, identifier).apply(init))
}

@Generated
class AWSCognitoIdentityProviderDescribeResourceServerCommand(val userPoolId: String, val identifier: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.DescribeResourceServerRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.DescribeResourceServerRequest {
		val input = com.amazonaws.services.cognitoidp.model.DescribeResourceServerRequest()
		input.setUserPoolId(this.userPoolId)
		input.setIdentifier(this.identifier)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.describeResourceServer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp describe-resource-server")
				.argument("user-pool-id", userPoolId)
				.argument("identifier", identifier)
	}

}


fun AWSCognitoIdentityProviderFunctions.describeRiskConfiguration(userPoolId: String, init: AWSCognitoIdentityProviderDescribeRiskConfigurationCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderDescribeRiskConfigurationCommand(userPoolId).apply(init))
}

@Generated
class AWSCognitoIdentityProviderDescribeRiskConfigurationCommand(val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.DescribeRiskConfigurationRequest> {

	var clientId: String? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.DescribeRiskConfigurationRequest {
		val input = com.amazonaws.services.cognitoidp.model.DescribeRiskConfigurationRequest()
		input.setUserPoolId(this.userPoolId)
		input.setClientId(this.clientId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.describeRiskConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp describe-risk-configuration")
				.argument("user-pool-id", userPoolId)
				.argument("client-id", clientId)
	}

}


fun AWSCognitoIdentityProviderFunctions.describeUserImportJob(userPoolId: String, jobId: String, init: AWSCognitoIdentityProviderDescribeUserImportJobCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderDescribeUserImportJobCommand(userPoolId, jobId).apply(init))
}

@Generated
class AWSCognitoIdentityProviderDescribeUserImportJobCommand(val userPoolId: String, val jobId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.DescribeUserImportJobRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.DescribeUserImportJobRequest {
		val input = com.amazonaws.services.cognitoidp.model.DescribeUserImportJobRequest()
		input.setUserPoolId(this.userPoolId)
		input.setJobId(this.jobId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.describeUserImportJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp describe-user-import-job")
				.argument("user-pool-id", userPoolId)
				.argument("job-id", jobId)
	}

}


fun AWSCognitoIdentityProviderFunctions.describeUserPool(userPoolId: String, init: AWSCognitoIdentityProviderDescribeUserPoolCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderDescribeUserPoolCommand(userPoolId).apply(init))
}

@Generated
class AWSCognitoIdentityProviderDescribeUserPoolCommand(val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.DescribeUserPoolRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.DescribeUserPoolRequest {
		val input = com.amazonaws.services.cognitoidp.model.DescribeUserPoolRequest()
		input.setUserPoolId(this.userPoolId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.describeUserPool(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp describe-user-pool")
				.argument("user-pool-id", userPoolId)
	}

}


fun AWSCognitoIdentityProviderFunctions.describeUserPoolClient(userPoolId: String, clientId: String, init: AWSCognitoIdentityProviderDescribeUserPoolClientCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderDescribeUserPoolClientCommand(userPoolId, clientId).apply(init))
}

@Generated
class AWSCognitoIdentityProviderDescribeUserPoolClientCommand(val userPoolId: String, val clientId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.DescribeUserPoolClientRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.DescribeUserPoolClientRequest {
		val input = com.amazonaws.services.cognitoidp.model.DescribeUserPoolClientRequest()
		input.setUserPoolId(this.userPoolId)
		input.setClientId(this.clientId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.describeUserPoolClient(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp describe-user-pool-client")
				.argument("user-pool-id", userPoolId)
				.argument("client-id", clientId)
	}

}


fun AWSCognitoIdentityProviderFunctions.describeUserPoolDomain(domain: String, init: AWSCognitoIdentityProviderDescribeUserPoolDomainCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderDescribeUserPoolDomainCommand(domain).apply(init))
}

@Generated
class AWSCognitoIdentityProviderDescribeUserPoolDomainCommand(val domain: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.DescribeUserPoolDomainRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.DescribeUserPoolDomainRequest {
		val input = com.amazonaws.services.cognitoidp.model.DescribeUserPoolDomainRequest()
		input.setDomain(this.domain)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.describeUserPoolDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp describe-user-pool-domain")
				.argument("domain", domain)
	}

}


fun AWSCognitoIdentityProviderFunctions.forgetDevice(deviceKey: String, init: AWSCognitoIdentityProviderForgetDeviceCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderForgetDeviceCommand(deviceKey).apply(init))
}

@Generated
class AWSCognitoIdentityProviderForgetDeviceCommand(val deviceKey: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.ForgetDeviceRequest> {

	var accessToken: String? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.ForgetDeviceRequest {
		val input = com.amazonaws.services.cognitoidp.model.ForgetDeviceRequest()
		input.setAccessToken(this.accessToken)
		input.setDeviceKey(this.deviceKey)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.forgetDevice(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp forget-device")
				.argument("access-token", accessToken)
				.argument("device-key", deviceKey)
	}

}


fun AWSCognitoIdentityProviderFunctions.forgotPassword(clientId: String, username: String, init: AWSCognitoIdentityProviderForgotPasswordCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderForgotPasswordCommand(clientId, username).apply(init))
}

@Generated
class AWSCognitoIdentityProviderForgotPasswordCommand(val clientId: String, val username: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.ForgotPasswordRequest> {

	var secretHash: String? = null
	var userContextData: com.amazonaws.services.cognitoidp.model.UserContextDataType? = null
	var analyticsMetadata: com.amazonaws.services.cognitoidp.model.AnalyticsMetadataType? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.ForgotPasswordRequest {
		val input = com.amazonaws.services.cognitoidp.model.ForgotPasswordRequest()
		input.setClientId(this.clientId)
		input.setSecretHash(this.secretHash)
		input.setUserContextData(this.userContextData)
		input.setUsername(this.username)
		input.setAnalyticsMetadata(this.analyticsMetadata)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.forgotPassword(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp forgot-password")
				.argument("client-id", clientId)
				.argument("secret-hash", secretHash)
				.argument("user-context-data", userContextData?.toString())
				.argument("username", username)
				.argument("analytics-metadata", analyticsMetadata?.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.getCSVHeader(userPoolId: String, init: AWSCognitoIdentityProviderGetCSVHeaderCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderGetCSVHeaderCommand(userPoolId).apply(init))
}

@Generated
class AWSCognitoIdentityProviderGetCSVHeaderCommand(val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.GetCSVHeaderRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.GetCSVHeaderRequest {
		val input = com.amazonaws.services.cognitoidp.model.GetCSVHeaderRequest()
		input.setUserPoolId(this.userPoolId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.getCSVHeader(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp get-csvheader")
				.argument("user-pool-id", userPoolId)
	}

}


fun AWSCognitoIdentityProviderFunctions.getDevice(deviceKey: String, init: AWSCognitoIdentityProviderGetDeviceCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderGetDeviceCommand(deviceKey).apply(init))
}

@Generated
class AWSCognitoIdentityProviderGetDeviceCommand(val deviceKey: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.GetDeviceRequest> {

	var accessToken: String? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.GetDeviceRequest {
		val input = com.amazonaws.services.cognitoidp.model.GetDeviceRequest()
		input.setDeviceKey(this.deviceKey)
		input.setAccessToken(this.accessToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.getDevice(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp get-device")
				.argument("device-key", deviceKey)
				.argument("access-token", accessToken)
	}

}


fun AWSCognitoIdentityProviderFunctions.getGroup(groupName: String, userPoolId: String, init: AWSCognitoIdentityProviderGetGroupCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderGetGroupCommand(groupName, userPoolId).apply(init))
}

@Generated
class AWSCognitoIdentityProviderGetGroupCommand(val groupName: String, val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.GetGroupRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.GetGroupRequest {
		val input = com.amazonaws.services.cognitoidp.model.GetGroupRequest()
		input.setGroupName(this.groupName)
		input.setUserPoolId(this.userPoolId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.getGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp get-group")
				.argument("group-name", groupName)
				.argument("user-pool-id", userPoolId)
	}

}


fun AWSCognitoIdentityProviderFunctions.getIdentityProviderByIdentifier(userPoolId: String, idpIdentifier: String, init: AWSCognitoIdentityProviderGetIdentityProviderByIdentifierCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderGetIdentityProviderByIdentifierCommand(userPoolId, idpIdentifier).apply(init))
}

@Generated
class AWSCognitoIdentityProviderGetIdentityProviderByIdentifierCommand(val userPoolId: String, val idpIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.GetIdentityProviderByIdentifierRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.GetIdentityProviderByIdentifierRequest {
		val input = com.amazonaws.services.cognitoidp.model.GetIdentityProviderByIdentifierRequest()
		input.setUserPoolId(this.userPoolId)
		input.setIdpIdentifier(this.idpIdentifier)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.getIdentityProviderByIdentifier(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp get-identity-provider-by-identifier")
				.argument("user-pool-id", userPoolId)
				.argument("idp-identifier", idpIdentifier)
	}

}


fun AWSCognitoIdentityProviderFunctions.getSigningCertificate(userPoolId: String, init: AWSCognitoIdentityProviderGetSigningCertificateCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderGetSigningCertificateCommand(userPoolId).apply(init))
}

@Generated
class AWSCognitoIdentityProviderGetSigningCertificateCommand(val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.GetSigningCertificateRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.GetSigningCertificateRequest {
		val input = com.amazonaws.services.cognitoidp.model.GetSigningCertificateRequest()
		input.setUserPoolId(this.userPoolId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.getSigningCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp get-signing-certificate")
				.argument("user-pool-id", userPoolId)
	}

}


fun AWSCognitoIdentityProviderFunctions.getUICustomization(userPoolId: String, init: AWSCognitoIdentityProviderGetUICustomizationCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderGetUICustomizationCommand(userPoolId).apply(init))
}

@Generated
class AWSCognitoIdentityProviderGetUICustomizationCommand(val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.GetUICustomizationRequest> {

	var clientId: String? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.GetUICustomizationRequest {
		val input = com.amazonaws.services.cognitoidp.model.GetUICustomizationRequest()
		input.setUserPoolId(this.userPoolId)
		input.setClientId(this.clientId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.getUICustomization(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp get-uicustomization")
				.argument("user-pool-id", userPoolId)
				.argument("client-id", clientId)
	}

}


fun AWSCognitoIdentityProviderFunctions.getUser(accessToken: String, init: AWSCognitoIdentityProviderGetUserCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderGetUserCommand(accessToken).apply(init))
}

@Generated
class AWSCognitoIdentityProviderGetUserCommand(val accessToken: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.GetUserRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.GetUserRequest {
		val input = com.amazonaws.services.cognitoidp.model.GetUserRequest()
		input.setAccessToken(this.accessToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.getUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp get-user")
				.argument("access-token", accessToken)
	}

}


fun AWSCognitoIdentityProviderFunctions.getUserAttributeVerificationCode(accessToken: String, attributeName: String, init: AWSCognitoIdentityProviderGetUserAttributeVerificationCodeCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderGetUserAttributeVerificationCodeCommand(accessToken, attributeName).apply(init))
}

@Generated
class AWSCognitoIdentityProviderGetUserAttributeVerificationCodeCommand(val accessToken: String, val attributeName: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.GetUserAttributeVerificationCodeRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.GetUserAttributeVerificationCodeRequest {
		val input = com.amazonaws.services.cognitoidp.model.GetUserAttributeVerificationCodeRequest()
		input.setAccessToken(this.accessToken)
		input.setAttributeName(this.attributeName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.getUserAttributeVerificationCode(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp get-user-attribute-verification-code")
				.argument("access-token", accessToken)
				.argument("attribute-name", attributeName)
	}

}


fun AWSCognitoIdentityProviderFunctions.getUserPoolMfaConfig(userPoolId: String, init: AWSCognitoIdentityProviderGetUserPoolMfaConfigCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderGetUserPoolMfaConfigCommand(userPoolId).apply(init))
}

@Generated
class AWSCognitoIdentityProviderGetUserPoolMfaConfigCommand(val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.GetUserPoolMfaConfigRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.GetUserPoolMfaConfigRequest {
		val input = com.amazonaws.services.cognitoidp.model.GetUserPoolMfaConfigRequest()
		input.setUserPoolId(this.userPoolId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.getUserPoolMfaConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp get-user-pool-mfa-config")
				.argument("user-pool-id", userPoolId)
	}

}


fun AWSCognitoIdentityProviderFunctions.globalSignOut(accessToken: String, init: AWSCognitoIdentityProviderGlobalSignOutCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderGlobalSignOutCommand(accessToken).apply(init))
}

@Generated
class AWSCognitoIdentityProviderGlobalSignOutCommand(val accessToken: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.GlobalSignOutRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.GlobalSignOutRequest {
		val input = com.amazonaws.services.cognitoidp.model.GlobalSignOutRequest()
		input.setAccessToken(this.accessToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.globalSignOut(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp global-sign-out")
				.argument("access-token", accessToken)
	}

}


fun AWSCognitoIdentityProviderFunctions.initiateAuth(authFlow: AuthFlowType, clientId: String, init: AWSCognitoIdentityProviderInitiateAuthCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderInitiateAuthCommand(authFlow, clientId).apply(init))
}

@Generated
class AWSCognitoIdentityProviderInitiateAuthCommand(val authFlow: AuthFlowType, val clientId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.InitiateAuthRequest> {

	var authParameters: Map<String, String>? = null
	var clientMetadata: Map<String, String>? = null
	var analyticsMetadata: com.amazonaws.services.cognitoidp.model.AnalyticsMetadataType? = null
	var userContextData: com.amazonaws.services.cognitoidp.model.UserContextDataType? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.InitiateAuthRequest {
		val input = com.amazonaws.services.cognitoidp.model.InitiateAuthRequest()
		input.setAuthFlow(this.authFlow.toString())
		input.setAuthParameters(this.authParameters)
		input.setClientMetadata(this.clientMetadata)
		input.setClientId(this.clientId)
		input.setAnalyticsMetadata(this.analyticsMetadata)
		input.setUserContextData(this.userContextData)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.initiateAuth(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp initiate-auth")
				.argument("auth-flow", authFlow.toString())
				.argument("auth-parameters", authParameters?.toString())
				.argument("client-metadata", clientMetadata?.toString())
				.argument("client-id", clientId)
				.argument("analytics-metadata", analyticsMetadata?.toString())
				.argument("user-context-data", userContextData?.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.listDevices(accessToken: String, init: AWSCognitoIdentityProviderListDevicesCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderListDevicesCommand(accessToken).apply(init))
}

@Generated
class AWSCognitoIdentityProviderListDevicesCommand(val accessToken: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.ListDevicesRequest> {

	var limit: Int? = 0
	var paginationToken: String? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.ListDevicesRequest {
		val input = com.amazonaws.services.cognitoidp.model.ListDevicesRequest()
		input.setAccessToken(this.accessToken)
		input.setLimit(this.limit)
		input.setPaginationToken(this.paginationToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.listDevices(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp list-devices")
				.argument("access-token", accessToken)
				.argument("limit", limit?.toString())
				.argument("pagination-token", paginationToken)
	}

}


fun AWSCognitoIdentityProviderFunctions.listGroups(userPoolId: String, init: AWSCognitoIdentityProviderListGroupsCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderListGroupsCommand(userPoolId).apply(init))
}

@Generated
class AWSCognitoIdentityProviderListGroupsCommand(val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.ListGroupsRequest> {

	var limit: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.ListGroupsRequest {
		val input = com.amazonaws.services.cognitoidp.model.ListGroupsRequest()
		input.setUserPoolId(this.userPoolId)
		input.setLimit(this.limit)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.listGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp list-groups")
				.argument("user-pool-id", userPoolId)
				.argument("limit", limit?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSCognitoIdentityProviderFunctions.listIdentityProviders(userPoolId: String, init: AWSCognitoIdentityProviderListIdentityProvidersCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderListIdentityProvidersCommand(userPoolId).apply(init))
}

@Generated
class AWSCognitoIdentityProviderListIdentityProvidersCommand(val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.ListIdentityProvidersRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.ListIdentityProvidersRequest {
		val input = com.amazonaws.services.cognitoidp.model.ListIdentityProvidersRequest()
		input.setUserPoolId(this.userPoolId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.listIdentityProviders(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp list-identity-providers")
				.argument("user-pool-id", userPoolId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSCognitoIdentityProviderFunctions.listResourceServers(userPoolId: String, init: AWSCognitoIdentityProviderListResourceServersCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderListResourceServersCommand(userPoolId).apply(init))
}

@Generated
class AWSCognitoIdentityProviderListResourceServersCommand(val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.ListResourceServersRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.ListResourceServersRequest {
		val input = com.amazonaws.services.cognitoidp.model.ListResourceServersRequest()
		input.setUserPoolId(this.userPoolId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.listResourceServers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp list-resource-servers")
				.argument("user-pool-id", userPoolId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSCognitoIdentityProviderFunctions.listUserImportJobs(userPoolId: String, maxResults: Int, init: AWSCognitoIdentityProviderListUserImportJobsCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderListUserImportJobsCommand(userPoolId, maxResults).apply(init))
}

@Generated
class AWSCognitoIdentityProviderListUserImportJobsCommand(val userPoolId: String, val maxResults: Int) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.ListUserImportJobsRequest> {

	var paginationToken: String? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.ListUserImportJobsRequest {
		val input = com.amazonaws.services.cognitoidp.model.ListUserImportJobsRequest()
		input.setUserPoolId(this.userPoolId)
		input.setMaxResults(this.maxResults)
		input.setPaginationToken(this.paginationToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.listUserImportJobs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp list-user-import-jobs")
				.argument("user-pool-id", userPoolId)
				.argument("max-results", maxResults.toString())
				.argument("pagination-token", paginationToken)
	}

}


fun AWSCognitoIdentityProviderFunctions.listUserPoolClients(userPoolId: String, init: AWSCognitoIdentityProviderListUserPoolClientsCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderListUserPoolClientsCommand(userPoolId).apply(init))
}

@Generated
class AWSCognitoIdentityProviderListUserPoolClientsCommand(val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.ListUserPoolClientsRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.ListUserPoolClientsRequest {
		val input = com.amazonaws.services.cognitoidp.model.ListUserPoolClientsRequest()
		input.setUserPoolId(this.userPoolId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.listUserPoolClients(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp list-user-pool-clients")
				.argument("user-pool-id", userPoolId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSCognitoIdentityProviderFunctions.listUserPools(maxResults: Int, init: AWSCognitoIdentityProviderListUserPoolsCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderListUserPoolsCommand(maxResults).apply(init))
}

@Generated
class AWSCognitoIdentityProviderListUserPoolsCommand(val maxResults: Int) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.ListUserPoolsRequest> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.ListUserPoolsRequest {
		val input = com.amazonaws.services.cognitoidp.model.ListUserPoolsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.listUserPools(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp list-user-pools")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.listUsers(userPoolId: String, init: AWSCognitoIdentityProviderListUsersCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderListUsersCommand(userPoolId).apply(init))
}

@Generated
class AWSCognitoIdentityProviderListUsersCommand(val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.ListUsersRequest> {

	var attributesToGet: List<String>? = null
	var limit: Int? = 0
	var paginationToken: String? = null
	var filter: String? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.ListUsersRequest {
		val input = com.amazonaws.services.cognitoidp.model.ListUsersRequest()
		input.setUserPoolId(this.userPoolId)
		input.setAttributesToGet(this.attributesToGet)
		input.setLimit(this.limit)
		input.setPaginationToken(this.paginationToken)
		input.setFilter(this.filter)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.listUsers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp list-users")
				.argument("user-pool-id", userPoolId)
				.argument("attributes-to-get", attributesToGet?.toString())
				.argument("limit", limit?.toString())
				.argument("pagination-token", paginationToken)
				.argument("filter", filter)
	}

}


fun AWSCognitoIdentityProviderFunctions.listUsersInGroup(userPoolId: String, groupName: String, init: AWSCognitoIdentityProviderListUsersInGroupCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderListUsersInGroupCommand(userPoolId, groupName).apply(init))
}

@Generated
class AWSCognitoIdentityProviderListUsersInGroupCommand(val userPoolId: String, val groupName: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.ListUsersInGroupRequest> {

	var limit: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.ListUsersInGroupRequest {
		val input = com.amazonaws.services.cognitoidp.model.ListUsersInGroupRequest()
		input.setUserPoolId(this.userPoolId)
		input.setGroupName(this.groupName)
		input.setLimit(this.limit)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.listUsersInGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp list-users-in-group")
				.argument("user-pool-id", userPoolId)
				.argument("group-name", groupName)
				.argument("limit", limit?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSCognitoIdentityProviderFunctions.resendConfirmationCode(clientId: String, username: String, init: AWSCognitoIdentityProviderResendConfirmationCodeCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderResendConfirmationCodeCommand(clientId, username).apply(init))
}

@Generated
class AWSCognitoIdentityProviderResendConfirmationCodeCommand(val clientId: String, val username: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.ResendConfirmationCodeRequest> {

	var secretHash: String? = null
	var userContextData: com.amazonaws.services.cognitoidp.model.UserContextDataType? = null
	var analyticsMetadata: com.amazonaws.services.cognitoidp.model.AnalyticsMetadataType? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.ResendConfirmationCodeRequest {
		val input = com.amazonaws.services.cognitoidp.model.ResendConfirmationCodeRequest()
		input.setClientId(this.clientId)
		input.setSecretHash(this.secretHash)
		input.setUserContextData(this.userContextData)
		input.setUsername(this.username)
		input.setAnalyticsMetadata(this.analyticsMetadata)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.resendConfirmationCode(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp resend-confirmation-code")
				.argument("client-id", clientId)
				.argument("secret-hash", secretHash)
				.argument("user-context-data", userContextData?.toString())
				.argument("username", username)
				.argument("analytics-metadata", analyticsMetadata?.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.respondToAuthChallenge(clientId: String, challengeName: ChallengeNameType, init: AWSCognitoIdentityProviderRespondToAuthChallengeCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderRespondToAuthChallengeCommand(clientId, challengeName).apply(init))
}

@Generated
class AWSCognitoIdentityProviderRespondToAuthChallengeCommand(val clientId: String, val challengeName: ChallengeNameType) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.RespondToAuthChallengeRequest> {

	var session: String? = null
	var challengeResponses: Map<String, String>? = null
	var analyticsMetadata: com.amazonaws.services.cognitoidp.model.AnalyticsMetadataType? = null
	var userContextData: com.amazonaws.services.cognitoidp.model.UserContextDataType? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.RespondToAuthChallengeRequest {
		val input = com.amazonaws.services.cognitoidp.model.RespondToAuthChallengeRequest()
		input.setClientId(this.clientId)
		input.setChallengeName(this.challengeName.toString())
		input.setSession(this.session)
		input.setChallengeResponses(this.challengeResponses)
		input.setAnalyticsMetadata(this.analyticsMetadata)
		input.setUserContextData(this.userContextData)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.respondToAuthChallenge(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp respond-to-auth-challenge")
				.argument("client-id", clientId)
				.argument("challenge-name", challengeName.toString())
				.argument("session", session)
				.argument("challenge-responses", challengeResponses?.toString())
				.argument("analytics-metadata", analyticsMetadata?.toString())
				.argument("user-context-data", userContextData?.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.setRiskConfiguration(userPoolId: String, init: AWSCognitoIdentityProviderSetRiskConfigurationCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderSetRiskConfigurationCommand(userPoolId).apply(init))
}

@Generated
class AWSCognitoIdentityProviderSetRiskConfigurationCommand(val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.SetRiskConfigurationRequest> {

	var clientId: String? = null
	var compromisedCredentialsRiskConfiguration: com.amazonaws.services.cognitoidp.model.CompromisedCredentialsRiskConfigurationType? = null
	var accountTakeoverRiskConfiguration: com.amazonaws.services.cognitoidp.model.AccountTakeoverRiskConfigurationType? = null
	var riskExceptionConfiguration: com.amazonaws.services.cognitoidp.model.RiskExceptionConfigurationType? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.SetRiskConfigurationRequest {
		val input = com.amazonaws.services.cognitoidp.model.SetRiskConfigurationRequest()
		input.setUserPoolId(this.userPoolId)
		input.setClientId(this.clientId)
		input.setCompromisedCredentialsRiskConfiguration(this.compromisedCredentialsRiskConfiguration)
		input.setAccountTakeoverRiskConfiguration(this.accountTakeoverRiskConfiguration)
		input.setRiskExceptionConfiguration(this.riskExceptionConfiguration)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.setRiskConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp set-risk-configuration")
				.argument("user-pool-id", userPoolId)
				.argument("client-id", clientId)
				.argument("compromised-credentials-risk-configuration", compromisedCredentialsRiskConfiguration?.toString())
				.argument("account-takeover-risk-configuration", accountTakeoverRiskConfiguration?.toString())
				.argument("risk-exception-configuration", riskExceptionConfiguration?.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.setUICustomization(userPoolId: String, init: AWSCognitoIdentityProviderSetUICustomizationCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderSetUICustomizationCommand(userPoolId).apply(init))
}

@Generated
class AWSCognitoIdentityProviderSetUICustomizationCommand(val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.SetUICustomizationRequest> {

	var clientId: String? = null
	var cSS: String? = null
	var imageFile: java.nio.ByteBuffer? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.SetUICustomizationRequest {
		val input = com.amazonaws.services.cognitoidp.model.SetUICustomizationRequest()
		input.setUserPoolId(this.userPoolId)
		input.setClientId(this.clientId)
		input.setCSS(this.cSS)
		input.setImageFile(this.imageFile)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.setUICustomization(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp set-uicustomization")
				.argument("user-pool-id", userPoolId)
				.argument("client-id", clientId)
				.argument("css", cSS)
				.argument("image-file", imageFile?.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.setUserMFAPreference(accessToken: String, init: AWSCognitoIdentityProviderSetUserMFAPreferenceCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderSetUserMFAPreferenceCommand(accessToken).apply(init))
}

@Generated
class AWSCognitoIdentityProviderSetUserMFAPreferenceCommand(val accessToken: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.SetUserMFAPreferenceRequest> {

	var sMSMfaSettings: com.amazonaws.services.cognitoidp.model.SMSMfaSettingsType? = null
	var softwareTokenMfaSettings: com.amazonaws.services.cognitoidp.model.SoftwareTokenMfaSettingsType? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.SetUserMFAPreferenceRequest {
		val input = com.amazonaws.services.cognitoidp.model.SetUserMFAPreferenceRequest()
		input.setSMSMfaSettings(this.sMSMfaSettings)
		input.setSoftwareTokenMfaSettings(this.softwareTokenMfaSettings)
		input.setAccessToken(this.accessToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.setUserMFAPreference(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp set-user-mfapreference")
				.argument("smsmfa-settings", sMSMfaSettings?.toString())
				.argument("software-token-mfa-settings", softwareTokenMfaSettings?.toString())
				.argument("access-token", accessToken)
	}

}


fun AWSCognitoIdentityProviderFunctions.setUserPoolMfaConfig(userPoolId: String, init: AWSCognitoIdentityProviderSetUserPoolMfaConfigCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderSetUserPoolMfaConfigCommand(userPoolId).apply(init))
}

@Generated
class AWSCognitoIdentityProviderSetUserPoolMfaConfigCommand(val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.SetUserPoolMfaConfigRequest> {

	var smsMfaConfiguration: com.amazonaws.services.cognitoidp.model.SmsMfaConfigType? = null
	var softwareTokenMfaConfiguration: com.amazonaws.services.cognitoidp.model.SoftwareTokenMfaConfigType? = null
	var mfaConfiguration: UserPoolMfaType? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.SetUserPoolMfaConfigRequest {
		val input = com.amazonaws.services.cognitoidp.model.SetUserPoolMfaConfigRequest()
		input.setUserPoolId(this.userPoolId)
		input.setSmsMfaConfiguration(this.smsMfaConfiguration)
		input.setSoftwareTokenMfaConfiguration(this.softwareTokenMfaConfiguration)
		input.setMfaConfiguration(this.mfaConfiguration?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.setUserPoolMfaConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp set-user-pool-mfa-config")
				.argument("user-pool-id", userPoolId)
				.argument("sms-mfa-configuration", smsMfaConfiguration?.toString())
				.argument("software-token-mfa-configuration", softwareTokenMfaConfiguration?.toString())
				.argument("mfa-configuration", mfaConfiguration?.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.setUserSettings(accessToken: String, mFAOptions: List<com.amazonaws.services.cognitoidp.model.MFAOptionType>, init: AWSCognitoIdentityProviderSetUserSettingsCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderSetUserSettingsCommand(accessToken, mFAOptions).apply(init))
}

@Generated
class AWSCognitoIdentityProviderSetUserSettingsCommand(val accessToken: String, val mFAOptions: List<com.amazonaws.services.cognitoidp.model.MFAOptionType>) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.SetUserSettingsRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.SetUserSettingsRequest {
		val input = com.amazonaws.services.cognitoidp.model.SetUserSettingsRequest()
		input.setAccessToken(this.accessToken)
		input.setMFAOptions(this.mFAOptions)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.setUserSettings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp set-user-settings")
				.argument("access-token", accessToken)
				.argument("mfaoptions", mFAOptions.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.signUp(clientId: String, username: String, password: String, init: AWSCognitoIdentityProviderSignUpCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderSignUpCommand(clientId, username, password).apply(init))
}

@Generated
class AWSCognitoIdentityProviderSignUpCommand(val clientId: String, val username: String, val password: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.SignUpRequest> {

	var secretHash: String? = null
	var userAttributes: List<com.amazonaws.services.cognitoidp.model.AttributeType>? = null
	var validationData: List<com.amazonaws.services.cognitoidp.model.AttributeType>? = null
	var analyticsMetadata: com.amazonaws.services.cognitoidp.model.AnalyticsMetadataType? = null
	var userContextData: com.amazonaws.services.cognitoidp.model.UserContextDataType? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.SignUpRequest {
		val input = com.amazonaws.services.cognitoidp.model.SignUpRequest()
		input.setClientId(this.clientId)
		input.setSecretHash(this.secretHash)
		input.setUsername(this.username)
		input.setPassword(this.password)
		input.setUserAttributes(this.userAttributes)
		input.setValidationData(this.validationData)
		input.setAnalyticsMetadata(this.analyticsMetadata)
		input.setUserContextData(this.userContextData)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.signUp(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp sign-up")
				.argument("client-id", clientId)
				.argument("secret-hash", secretHash)
				.argument("username", username)
				.argument("password", password)
				.argument("user-attributes", userAttributes?.toString())
				.argument("validation-data", validationData?.toString())
				.argument("analytics-metadata", analyticsMetadata?.toString())
				.argument("user-context-data", userContextData?.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.startUserImportJob(userPoolId: String, jobId: String, init: AWSCognitoIdentityProviderStartUserImportJobCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderStartUserImportJobCommand(userPoolId, jobId).apply(init))
}

@Generated
class AWSCognitoIdentityProviderStartUserImportJobCommand(val userPoolId: String, val jobId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.StartUserImportJobRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.StartUserImportJobRequest {
		val input = com.amazonaws.services.cognitoidp.model.StartUserImportJobRequest()
		input.setUserPoolId(this.userPoolId)
		input.setJobId(this.jobId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.startUserImportJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp start-user-import-job")
				.argument("user-pool-id", userPoolId)
				.argument("job-id", jobId)
	}

}


fun AWSCognitoIdentityProviderFunctions.stopUserImportJob(userPoolId: String, jobId: String, init: AWSCognitoIdentityProviderStopUserImportJobCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderStopUserImportJobCommand(userPoolId, jobId).apply(init))
}

@Generated
class AWSCognitoIdentityProviderStopUserImportJobCommand(val userPoolId: String, val jobId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.StopUserImportJobRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.StopUserImportJobRequest {
		val input = com.amazonaws.services.cognitoidp.model.StopUserImportJobRequest()
		input.setUserPoolId(this.userPoolId)
		input.setJobId(this.jobId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.stopUserImportJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp stop-user-import-job")
				.argument("user-pool-id", userPoolId)
				.argument("job-id", jobId)
	}

}


fun AWSCognitoIdentityProviderFunctions.updateAuthEventFeedback(userPoolId: String, username: String, eventId: String, feedbackToken: String, feedbackValue: FeedbackValueType, init: AWSCognitoIdentityProviderUpdateAuthEventFeedbackCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderUpdateAuthEventFeedbackCommand(userPoolId, username, eventId, feedbackToken, feedbackValue).apply(init))
}

@Generated
class AWSCognitoIdentityProviderUpdateAuthEventFeedbackCommand(val userPoolId: String, val username: String, val eventId: String, val feedbackToken: String, val feedbackValue: FeedbackValueType) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.UpdateAuthEventFeedbackRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.UpdateAuthEventFeedbackRequest {
		val input = com.amazonaws.services.cognitoidp.model.UpdateAuthEventFeedbackRequest()
		input.setUserPoolId(this.userPoolId)
		input.setUsername(this.username)
		input.setEventId(this.eventId)
		input.setFeedbackToken(this.feedbackToken)
		input.setFeedbackValue(this.feedbackValue.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.updateAuthEventFeedback(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp update-auth-event-feedback")
				.argument("user-pool-id", userPoolId)
				.argument("username", username)
				.argument("event-id", eventId)
				.argument("feedback-token", feedbackToken)
				.argument("feedback-value", feedbackValue.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.updateDeviceStatus(accessToken: String, deviceKey: String, init: AWSCognitoIdentityProviderUpdateDeviceStatusCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderUpdateDeviceStatusCommand(accessToken, deviceKey).apply(init))
}

@Generated
class AWSCognitoIdentityProviderUpdateDeviceStatusCommand(val accessToken: String, val deviceKey: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.UpdateDeviceStatusRequest> {

	var deviceRememberedStatus: DeviceRememberedStatusType? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.UpdateDeviceStatusRequest {
		val input = com.amazonaws.services.cognitoidp.model.UpdateDeviceStatusRequest()
		input.setAccessToken(this.accessToken)
		input.setDeviceKey(this.deviceKey)
		input.setDeviceRememberedStatus(this.deviceRememberedStatus?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.updateDeviceStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp update-device-status")
				.argument("access-token", accessToken)
				.argument("device-key", deviceKey)
				.argument("device-remembered-status", deviceRememberedStatus?.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.updateGroup(groupName: String, userPoolId: String, init: AWSCognitoIdentityProviderUpdateGroupCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderUpdateGroupCommand(groupName, userPoolId).apply(init))
}

@Generated
class AWSCognitoIdentityProviderUpdateGroupCommand(val groupName: String, val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.UpdateGroupRequest> {

	var description: String? = null
	var roleArn: String? = null
	var precedence: Int? = 0

	override fun build(): com.amazonaws.services.cognitoidp.model.UpdateGroupRequest {
		val input = com.amazonaws.services.cognitoidp.model.UpdateGroupRequest()
		input.setGroupName(this.groupName)
		input.setUserPoolId(this.userPoolId)
		input.setDescription(this.description)
		input.setRoleArn(this.roleArn)
		input.setPrecedence(this.precedence)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.updateGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp update-group")
				.argument("group-name", groupName)
				.argument("user-pool-id", userPoolId)
				.argument("description", description)
				.argument("role-arn", roleArn)
				.argument("precedence", precedence?.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.updateIdentityProvider(userPoolId: String, providerName: String, init: AWSCognitoIdentityProviderUpdateIdentityProviderCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderUpdateIdentityProviderCommand(userPoolId, providerName).apply(init))
}

@Generated
class AWSCognitoIdentityProviderUpdateIdentityProviderCommand(val userPoolId: String, val providerName: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.UpdateIdentityProviderRequest> {

	var providerDetails: Map<String, String>? = null
	var attributeMapping: Map<String, String>? = null
	var idpIdentifiers: List<String>? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.UpdateIdentityProviderRequest {
		val input = com.amazonaws.services.cognitoidp.model.UpdateIdentityProviderRequest()
		input.setUserPoolId(this.userPoolId)
		input.setProviderName(this.providerName)
		input.setProviderDetails(this.providerDetails)
		input.setAttributeMapping(this.attributeMapping)
		input.setIdpIdentifiers(this.idpIdentifiers)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.updateIdentityProvider(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp update-identity-provider")
				.argument("user-pool-id", userPoolId)
				.argument("provider-name", providerName)
				.argument("provider-details", providerDetails?.toString())
				.argument("attribute-mapping", attributeMapping?.toString())
				.argument("idp-identifiers", idpIdentifiers?.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.updateResourceServer(userPoolId: String, identifier: String, name: String, init: AWSCognitoIdentityProviderUpdateResourceServerCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderUpdateResourceServerCommand(userPoolId, identifier, name).apply(init))
}

@Generated
class AWSCognitoIdentityProviderUpdateResourceServerCommand(val userPoolId: String, val identifier: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.UpdateResourceServerRequest> {

	var scopes: List<com.amazonaws.services.cognitoidp.model.ResourceServerScopeType>? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.UpdateResourceServerRequest {
		val input = com.amazonaws.services.cognitoidp.model.UpdateResourceServerRequest()
		input.setUserPoolId(this.userPoolId)
		input.setIdentifier(this.identifier)
		input.setName(this.name)
		input.setScopes(this.scopes)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.updateResourceServer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp update-resource-server")
				.argument("user-pool-id", userPoolId)
				.argument("identifier", identifier)
				.argument("name", name)
				.argument("scopes", scopes?.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.updateUserAttributes(userAttributes: List<com.amazonaws.services.cognitoidp.model.AttributeType>, accessToken: String, init: AWSCognitoIdentityProviderUpdateUserAttributesCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderUpdateUserAttributesCommand(userAttributes, accessToken).apply(init))
}

@Generated
class AWSCognitoIdentityProviderUpdateUserAttributesCommand(val userAttributes: List<com.amazonaws.services.cognitoidp.model.AttributeType>, val accessToken: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.UpdateUserAttributesRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.UpdateUserAttributesRequest {
		val input = com.amazonaws.services.cognitoidp.model.UpdateUserAttributesRequest()
		input.setUserAttributes(this.userAttributes)
		input.setAccessToken(this.accessToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.updateUserAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp update-user-attributes")
				.argument("user-attributes", userAttributes.toString())
				.argument("access-token", accessToken)
	}

}


fun AWSCognitoIdentityProviderFunctions.updateUserPool(userPoolId: String, init: AWSCognitoIdentityProviderUpdateUserPoolCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderUpdateUserPoolCommand(userPoolId).apply(init))
}

@Generated
class AWSCognitoIdentityProviderUpdateUserPoolCommand(val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.UpdateUserPoolRequest> {

	var policies: com.amazonaws.services.cognitoidp.model.UserPoolPolicyType? = null
	var lambdaConfig: com.amazonaws.services.cognitoidp.model.LambdaConfigType? = null
	var autoVerifiedAttributes: List<VerifiedAttributeType>? = null
	var smsVerificationMessage: String? = null
	var emailVerificationMessage: String? = null
	var emailVerificationSubject: String? = null
	var verificationMessageTemplate: com.amazonaws.services.cognitoidp.model.VerificationMessageTemplateType? = null
	var smsAuthenticationMessage: String? = null
	var mfaConfiguration: UserPoolMfaType? = null
	var deviceConfiguration: com.amazonaws.services.cognitoidp.model.DeviceConfigurationType? = null
	var emailConfiguration: com.amazonaws.services.cognitoidp.model.EmailConfigurationType? = null
	var smsConfiguration: com.amazonaws.services.cognitoidp.model.SmsConfigurationType? = null
	var userPoolTags: Map<String, String>? = null
	var adminCreateUserConfig: com.amazonaws.services.cognitoidp.model.AdminCreateUserConfigType? = null
	var userPoolAddOns: com.amazonaws.services.cognitoidp.model.UserPoolAddOnsType? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.UpdateUserPoolRequest {
		val input = com.amazonaws.services.cognitoidp.model.UpdateUserPoolRequest()
		input.setUserPoolId(this.userPoolId)
		input.setPolicies(this.policies)
		input.setLambdaConfig(this.lambdaConfig)
		input.setAutoVerifiedAttributes(this.autoVerifiedAttributes?.map { it.toString() })
		input.setSmsVerificationMessage(this.smsVerificationMessage)
		input.setEmailVerificationMessage(this.emailVerificationMessage)
		input.setEmailVerificationSubject(this.emailVerificationSubject)
		input.setVerificationMessageTemplate(this.verificationMessageTemplate)
		input.setSmsAuthenticationMessage(this.smsAuthenticationMessage)
		input.setMfaConfiguration(this.mfaConfiguration?.toString())
		input.setDeviceConfiguration(this.deviceConfiguration)
		input.setEmailConfiguration(this.emailConfiguration)
		input.setSmsConfiguration(this.smsConfiguration)
		input.setUserPoolTags(this.userPoolTags)
		input.setAdminCreateUserConfig(this.adminCreateUserConfig)
		input.setUserPoolAddOns(this.userPoolAddOns)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.updateUserPool(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp update-user-pool")
				.argument("user-pool-id", userPoolId)
				.argument("policies", policies?.toString())
				.argument("lambda-config", lambdaConfig?.toString())
				.argument("auto-verified-attributes", autoVerifiedAttributes?.toString())
				.argument("sms-verification-message", smsVerificationMessage)
				.argument("email-verification-message", emailVerificationMessage)
				.argument("email-verification-subject", emailVerificationSubject)
				.argument("verification-message-template", verificationMessageTemplate?.toString())
				.argument("sms-authentication-message", smsAuthenticationMessage)
				.argument("mfa-configuration", mfaConfiguration?.toString())
				.argument("device-configuration", deviceConfiguration?.toString())
				.argument("email-configuration", emailConfiguration?.toString())
				.argument("sms-configuration", smsConfiguration?.toString())
				.argument("user-pool-tags", userPoolTags?.toString())
				.argument("admin-create-user-config", adminCreateUserConfig?.toString())
				.argument("user-pool-add-ons", userPoolAddOns?.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.updateUserPoolClient(userPoolId: String, clientId: String, init: AWSCognitoIdentityProviderUpdateUserPoolClientCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderUpdateUserPoolClientCommand(userPoolId, clientId).apply(init))
}

@Generated
class AWSCognitoIdentityProviderUpdateUserPoolClientCommand(val userPoolId: String, val clientId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.UpdateUserPoolClientRequest> {

	var clientName: String? = null
	var refreshTokenValidity: Int? = 0
	var readAttributes: List<String>? = null
	var writeAttributes: List<String>? = null
	var explicitAuthFlows: List<ExplicitAuthFlowsType>? = null
	var supportedIdentityProviders: List<String>? = null
	var callbackURLs: List<String>? = null
	var logoutURLs: List<String>? = null
	var defaultRedirectURI: String? = null
	var allowedOAuthFlows: List<OAuthFlowType>? = null
	var allowedOAuthScopes: List<String>? = null
	var allowedOAuthFlowsUserPoolClient: Boolean? = false
	var analyticsConfiguration: com.amazonaws.services.cognitoidp.model.AnalyticsConfigurationType? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.UpdateUserPoolClientRequest {
		val input = com.amazonaws.services.cognitoidp.model.UpdateUserPoolClientRequest()
		input.setUserPoolId(this.userPoolId)
		input.setClientId(this.clientId)
		input.setClientName(this.clientName)
		input.setRefreshTokenValidity(this.refreshTokenValidity)
		input.setReadAttributes(this.readAttributes)
		input.setWriteAttributes(this.writeAttributes)
		input.setExplicitAuthFlows(this.explicitAuthFlows?.map { it.toString() })
		input.setSupportedIdentityProviders(this.supportedIdentityProviders)
		input.setCallbackURLs(this.callbackURLs)
		input.setLogoutURLs(this.logoutURLs)
		input.setDefaultRedirectURI(this.defaultRedirectURI)
		input.setAllowedOAuthFlows(this.allowedOAuthFlows?.map { it.toString() })
		input.setAllowedOAuthScopes(this.allowedOAuthScopes)
		input.setAllowedOAuthFlowsUserPoolClient(this.allowedOAuthFlowsUserPoolClient)
		input.setAnalyticsConfiguration(this.analyticsConfiguration)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.updateUserPoolClient(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp update-user-pool-client")
				.argument("user-pool-id", userPoolId)
				.argument("client-id", clientId)
				.argument("client-name", clientName)
				.argument("refresh-token-validity", refreshTokenValidity?.toString())
				.argument("read-attributes", readAttributes?.toString())
				.argument("write-attributes", writeAttributes?.toString())
				.argument("explicit-auth-flows", explicitAuthFlows?.toString())
				.argument("supported-identity-providers", supportedIdentityProviders?.toString())
				.argument("callback-urls", callbackURLs?.toString())
				.argument("logout-urls", logoutURLs?.toString())
				.argument("default-redirect-uri", defaultRedirectURI)
				.argument("allowed-oauth-flows", allowedOAuthFlows?.toString())
				.argument("allowed-oauth-scopes", allowedOAuthScopes?.toString())
				.option("allowed-oauth-flows-user-pool-client", allowedOAuthFlowsUserPoolClient ?: false)
				.argument("analytics-configuration", analyticsConfiguration?.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.verifySoftwareToken(userCode: String, init: AWSCognitoIdentityProviderVerifySoftwareTokenCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderVerifySoftwareTokenCommand(userCode).apply(init))
}

@Generated
class AWSCognitoIdentityProviderVerifySoftwareTokenCommand(val userCode: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.VerifySoftwareTokenRequest> {

	var accessToken: String? = null
	var session: String? = null
	var friendlyDeviceName: String? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.VerifySoftwareTokenRequest {
		val input = com.amazonaws.services.cognitoidp.model.VerifySoftwareTokenRequest()
		input.setAccessToken(this.accessToken)
		input.setSession(this.session)
		input.setUserCode(this.userCode)
		input.setFriendlyDeviceName(this.friendlyDeviceName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.verifySoftwareToken(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp verify-software-token")
				.argument("access-token", accessToken)
				.argument("session", session)
				.argument("user-code", userCode)
				.argument("friendly-device-name", friendlyDeviceName)
	}

}


fun AWSCognitoIdentityProviderFunctions.verifyUserAttribute(accessToken: String, attributeName: String, code: String, init: AWSCognitoIdentityProviderVerifyUserAttributeCommand.() -> Unit) {
	this.block.declare(AWSCognitoIdentityProviderVerifyUserAttributeCommand(accessToken, attributeName, code).apply(init))
}

@Generated
class AWSCognitoIdentityProviderVerifyUserAttributeCommand(val accessToken: String, val attributeName: String, val code: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.VerifyUserAttributeRequest> {



	override fun build(): com.amazonaws.services.cognitoidp.model.VerifyUserAttributeRequest {
		val input = com.amazonaws.services.cognitoidp.model.VerifyUserAttributeRequest()
		input.setAccessToken(this.accessToken)
		input.setAttributeName(this.attributeName)
		input.setCode(this.code)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_idp.verifyUserAttribute(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp verify-user-attribute")
				.argument("access-token", accessToken)
				.argument("attribute-name", attributeName)
				.argument("code", code)
	}

}
