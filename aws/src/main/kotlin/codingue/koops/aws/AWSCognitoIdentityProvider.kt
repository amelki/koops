
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws

import javax.annotation.Generated
import codingue.koops.core.*
import com.amazonaws.services.cognitoidp.*
import com.amazonaws.services.cognitoidp.model.*

var codingue.koops.core.Environment.cognito_idp: AWSCognitoIdentityProvider
	get() {
		var service = this.capabilities["aws-cognito_idp"]
		if (service == null) {
			service = AWSCognitoIdentityProviderClientBuilder.standard().build()
			this.capabilities["aws-cognito_idp"] = service
		}
		return service as AWSCognitoIdentityProvider
	}
	set(cognito_idp) {
		this.capabilities["aws-cognito_idp"] = cognito_idp
	}

@Generated
class AWSCognitoIdentityProviderFunctions(val block: Block)

infix fun <T> AwsContinuation.cognito_idp(init: AWSCognitoIdentityProviderFunctions.() -> T): T {
	return AWSCognitoIdentityProviderFunctions(shell).run(init)
}

			

fun AWSCognitoIdentityProviderFunctions.addCustomAttributes(userPoolId: String, customAttributes: List<com.amazonaws.services.cognitoidp.model.SchemaAttributeType>, init: AWSCognitoIdentityProviderAddCustomAttributesCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.AddCustomAttributesResult {
	return this.block.declare(AWSCognitoIdentityProviderAddCustomAttributesCommand(userPoolId, customAttributes).apply(init)) as com.amazonaws.services.cognitoidp.model.AddCustomAttributesResult
}

@Generated
class AWSCognitoIdentityProviderAddCustomAttributesCommand(val userPoolId: String, val customAttributes: List<com.amazonaws.services.cognitoidp.model.SchemaAttributeType>) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AddCustomAttributesRequest, com.amazonaws.services.cognitoidp.model.AddCustomAttributesResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.AddCustomAttributesRequest {
		val input = com.amazonaws.services.cognitoidp.model.AddCustomAttributesRequest()
		input.setUserPoolId(this.userPoolId)
		input.setCustomAttributes(this.customAttributes)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.AddCustomAttributesResult {
	  return com.amazonaws.services.cognitoidp.model.AddCustomAttributesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.AddCustomAttributesResult {
		return environment.cognito_idp.addCustomAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp add-custom-attributes")
				.argument("user-pool-id", userPoolId)
				.argument("custom-attributes", customAttributes.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.adminAddUserToGroup(userPoolId: String, username: String, groupName: String, init: AWSCognitoIdentityProviderAdminAddUserToGroupCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.AdminAddUserToGroupResult {
	return this.block.declare(AWSCognitoIdentityProviderAdminAddUserToGroupCommand(userPoolId, username, groupName).apply(init)) as com.amazonaws.services.cognitoidp.model.AdminAddUserToGroupResult
}

@Generated
class AWSCognitoIdentityProviderAdminAddUserToGroupCommand(val userPoolId: String, val username: String, val groupName: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminAddUserToGroupRequest, com.amazonaws.services.cognitoidp.model.AdminAddUserToGroupResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.AdminAddUserToGroupRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminAddUserToGroupRequest()
		input.setUserPoolId(this.userPoolId)
		input.setUsername(this.username)
		input.setGroupName(this.groupName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.AdminAddUserToGroupResult {
	  return com.amazonaws.services.cognitoidp.model.AdminAddUserToGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.AdminAddUserToGroupResult {
		return environment.cognito_idp.adminAddUserToGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-add-user-to-group")
				.argument("user-pool-id", userPoolId)
				.argument("username", username)
				.argument("group-name", groupName)
	}

}


fun AWSCognitoIdentityProviderFunctions.adminConfirmSignUp(userPoolId: String, username: String, init: AWSCognitoIdentityProviderAdminConfirmSignUpCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.AdminConfirmSignUpResult {
	return this.block.declare(AWSCognitoIdentityProviderAdminConfirmSignUpCommand(userPoolId, username).apply(init)) as com.amazonaws.services.cognitoidp.model.AdminConfirmSignUpResult
}

@Generated
class AWSCognitoIdentityProviderAdminConfirmSignUpCommand(val userPoolId: String, val username: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminConfirmSignUpRequest, com.amazonaws.services.cognitoidp.model.AdminConfirmSignUpResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.AdminConfirmSignUpRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminConfirmSignUpRequest()
		input.setUserPoolId(this.userPoolId)
		input.setUsername(this.username)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.AdminConfirmSignUpResult {
	  return com.amazonaws.services.cognitoidp.model.AdminConfirmSignUpResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.AdminConfirmSignUpResult {
		return environment.cognito_idp.adminConfirmSignUp(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-confirm-sign-up")
				.argument("user-pool-id", userPoolId)
				.argument("username", username)
	}

}


fun AWSCognitoIdentityProviderFunctions.adminCreateUser(userPoolId: String, username: String, init: AWSCognitoIdentityProviderAdminCreateUserCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.AdminCreateUserResult {
	return this.block.declare(AWSCognitoIdentityProviderAdminCreateUserCommand(userPoolId, username).apply(init)) as com.amazonaws.services.cognitoidp.model.AdminCreateUserResult
}

@Generated
class AWSCognitoIdentityProviderAdminCreateUserCommand(val userPoolId: String, val username: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminCreateUserRequest, com.amazonaws.services.cognitoidp.model.AdminCreateUserResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.AdminCreateUserResult {
	  return com.amazonaws.services.cognitoidp.model.AdminCreateUserResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.AdminCreateUserResult {
		return environment.cognito_idp.adminCreateUser(build())
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


fun AWSCognitoIdentityProviderFunctions.adminDeleteUser(userPoolId: String, username: String, init: AWSCognitoIdentityProviderAdminDeleteUserCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.AdminDeleteUserResult {
	return this.block.declare(AWSCognitoIdentityProviderAdminDeleteUserCommand(userPoolId, username).apply(init)) as com.amazonaws.services.cognitoidp.model.AdminDeleteUserResult
}

@Generated
class AWSCognitoIdentityProviderAdminDeleteUserCommand(val userPoolId: String, val username: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminDeleteUserRequest, com.amazonaws.services.cognitoidp.model.AdminDeleteUserResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.AdminDeleteUserRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminDeleteUserRequest()
		input.setUserPoolId(this.userPoolId)
		input.setUsername(this.username)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.AdminDeleteUserResult {
	  return com.amazonaws.services.cognitoidp.model.AdminDeleteUserResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.AdminDeleteUserResult {
		return environment.cognito_idp.adminDeleteUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-delete-user")
				.argument("user-pool-id", userPoolId)
				.argument("username", username)
	}

}


fun AWSCognitoIdentityProviderFunctions.adminDeleteUserAttributes(userPoolId: String, username: String, userAttributeNames: List<String>, init: AWSCognitoIdentityProviderAdminDeleteUserAttributesCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.AdminDeleteUserAttributesResult {
	return this.block.declare(AWSCognitoIdentityProviderAdminDeleteUserAttributesCommand(userPoolId, username, userAttributeNames).apply(init)) as com.amazonaws.services.cognitoidp.model.AdminDeleteUserAttributesResult
}

@Generated
class AWSCognitoIdentityProviderAdminDeleteUserAttributesCommand(val userPoolId: String, val username: String, val userAttributeNames: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminDeleteUserAttributesRequest, com.amazonaws.services.cognitoidp.model.AdminDeleteUserAttributesResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.AdminDeleteUserAttributesRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminDeleteUserAttributesRequest()
		input.setUserPoolId(this.userPoolId)
		input.setUsername(this.username)
		input.setUserAttributeNames(this.userAttributeNames)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.AdminDeleteUserAttributesResult {
	  return com.amazonaws.services.cognitoidp.model.AdminDeleteUserAttributesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.AdminDeleteUserAttributesResult {
		return environment.cognito_idp.adminDeleteUserAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-delete-user-attributes")
				.argument("user-pool-id", userPoolId)
				.argument("username", username)
				.argument("user-attribute-names", userAttributeNames.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.adminDisableProviderForUser(userPoolId: String, user: com.amazonaws.services.cognitoidp.model.ProviderUserIdentifierType, init: AWSCognitoIdentityProviderAdminDisableProviderForUserCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.AdminDisableProviderForUserResult {
	return this.block.declare(AWSCognitoIdentityProviderAdminDisableProviderForUserCommand(userPoolId, user).apply(init)) as com.amazonaws.services.cognitoidp.model.AdminDisableProviderForUserResult
}

@Generated
class AWSCognitoIdentityProviderAdminDisableProviderForUserCommand(val userPoolId: String, val user: com.amazonaws.services.cognitoidp.model.ProviderUserIdentifierType) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminDisableProviderForUserRequest, com.amazonaws.services.cognitoidp.model.AdminDisableProviderForUserResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.AdminDisableProviderForUserRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminDisableProviderForUserRequest()
		input.setUserPoolId(this.userPoolId)
		input.setUser(this.user)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.AdminDisableProviderForUserResult {
	  return com.amazonaws.services.cognitoidp.model.AdminDisableProviderForUserResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.AdminDisableProviderForUserResult {
		return environment.cognito_idp.adminDisableProviderForUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-disable-provider-for-user")
				.argument("user-pool-id", userPoolId)
				.argument("user", user.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.adminDisableUser(userPoolId: String, username: String, init: AWSCognitoIdentityProviderAdminDisableUserCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.AdminDisableUserResult {
	return this.block.declare(AWSCognitoIdentityProviderAdminDisableUserCommand(userPoolId, username).apply(init)) as com.amazonaws.services.cognitoidp.model.AdminDisableUserResult
}

@Generated
class AWSCognitoIdentityProviderAdminDisableUserCommand(val userPoolId: String, val username: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminDisableUserRequest, com.amazonaws.services.cognitoidp.model.AdminDisableUserResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.AdminDisableUserRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminDisableUserRequest()
		input.setUserPoolId(this.userPoolId)
		input.setUsername(this.username)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.AdminDisableUserResult {
	  return com.amazonaws.services.cognitoidp.model.AdminDisableUserResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.AdminDisableUserResult {
		return environment.cognito_idp.adminDisableUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-disable-user")
				.argument("user-pool-id", userPoolId)
				.argument("username", username)
	}

}


fun AWSCognitoIdentityProviderFunctions.adminEnableUser(userPoolId: String, username: String, init: AWSCognitoIdentityProviderAdminEnableUserCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.AdminEnableUserResult {
	return this.block.declare(AWSCognitoIdentityProviderAdminEnableUserCommand(userPoolId, username).apply(init)) as com.amazonaws.services.cognitoidp.model.AdminEnableUserResult
}

@Generated
class AWSCognitoIdentityProviderAdminEnableUserCommand(val userPoolId: String, val username: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminEnableUserRequest, com.amazonaws.services.cognitoidp.model.AdminEnableUserResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.AdminEnableUserRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminEnableUserRequest()
		input.setUserPoolId(this.userPoolId)
		input.setUsername(this.username)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.AdminEnableUserResult {
	  return com.amazonaws.services.cognitoidp.model.AdminEnableUserResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.AdminEnableUserResult {
		return environment.cognito_idp.adminEnableUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-enable-user")
				.argument("user-pool-id", userPoolId)
				.argument("username", username)
	}

}


fun AWSCognitoIdentityProviderFunctions.adminForgetDevice(userPoolId: String, username: String, deviceKey: String, init: AWSCognitoIdentityProviderAdminForgetDeviceCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.AdminForgetDeviceResult {
	return this.block.declare(AWSCognitoIdentityProviderAdminForgetDeviceCommand(userPoolId, username, deviceKey).apply(init)) as com.amazonaws.services.cognitoidp.model.AdminForgetDeviceResult
}

@Generated
class AWSCognitoIdentityProviderAdminForgetDeviceCommand(val userPoolId: String, val username: String, val deviceKey: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminForgetDeviceRequest, com.amazonaws.services.cognitoidp.model.AdminForgetDeviceResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.AdminForgetDeviceRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminForgetDeviceRequest()
		input.setUserPoolId(this.userPoolId)
		input.setUsername(this.username)
		input.setDeviceKey(this.deviceKey)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.AdminForgetDeviceResult {
	  return com.amazonaws.services.cognitoidp.model.AdminForgetDeviceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.AdminForgetDeviceResult {
		return environment.cognito_idp.adminForgetDevice(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-forget-device")
				.argument("user-pool-id", userPoolId)
				.argument("username", username)
				.argument("device-key", deviceKey)
	}

}


fun AWSCognitoIdentityProviderFunctions.adminGetDevice(deviceKey: String, userPoolId: String, username: String, init: AWSCognitoIdentityProviderAdminGetDeviceCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.AdminGetDeviceResult {
	return this.block.declare(AWSCognitoIdentityProviderAdminGetDeviceCommand(deviceKey, userPoolId, username).apply(init)) as com.amazonaws.services.cognitoidp.model.AdminGetDeviceResult
}

@Generated
class AWSCognitoIdentityProviderAdminGetDeviceCommand(val deviceKey: String, val userPoolId: String, val username: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminGetDeviceRequest, com.amazonaws.services.cognitoidp.model.AdminGetDeviceResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.AdminGetDeviceRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminGetDeviceRequest()
		input.setDeviceKey(this.deviceKey)
		input.setUserPoolId(this.userPoolId)
		input.setUsername(this.username)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.AdminGetDeviceResult {
	  return com.amazonaws.services.cognitoidp.model.AdminGetDeviceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.AdminGetDeviceResult {
		return environment.cognito_idp.adminGetDevice(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-get-device")
				.argument("device-key", deviceKey)
				.argument("user-pool-id", userPoolId)
				.argument("username", username)
	}

}


fun AWSCognitoIdentityProviderFunctions.adminGetUser(userPoolId: String, username: String, init: AWSCognitoIdentityProviderAdminGetUserCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.AdminGetUserResult {
	return this.block.declare(AWSCognitoIdentityProviderAdminGetUserCommand(userPoolId, username).apply(init)) as com.amazonaws.services.cognitoidp.model.AdminGetUserResult
}

@Generated
class AWSCognitoIdentityProviderAdminGetUserCommand(val userPoolId: String, val username: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminGetUserRequest, com.amazonaws.services.cognitoidp.model.AdminGetUserResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.AdminGetUserRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminGetUserRequest()
		input.setUserPoolId(this.userPoolId)
		input.setUsername(this.username)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.AdminGetUserResult {
	  return com.amazonaws.services.cognitoidp.model.AdminGetUserResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.AdminGetUserResult {
		return environment.cognito_idp.adminGetUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-get-user")
				.argument("user-pool-id", userPoolId)
				.argument("username", username)
	}

}


fun AWSCognitoIdentityProviderFunctions.adminInitiateAuth(userPoolId: String, clientId: String, authFlow: AuthFlowType, init: AWSCognitoIdentityProviderAdminInitiateAuthCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.AdminInitiateAuthResult {
	return this.block.declare(AWSCognitoIdentityProviderAdminInitiateAuthCommand(userPoolId, clientId, authFlow).apply(init)) as com.amazonaws.services.cognitoidp.model.AdminInitiateAuthResult
}

@Generated
class AWSCognitoIdentityProviderAdminInitiateAuthCommand(val userPoolId: String, val clientId: String, val authFlow: AuthFlowType) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminInitiateAuthRequest, com.amazonaws.services.cognitoidp.model.AdminInitiateAuthResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.AdminInitiateAuthResult {
	  return com.amazonaws.services.cognitoidp.model.AdminInitiateAuthResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.AdminInitiateAuthResult {
		return environment.cognito_idp.adminInitiateAuth(build())
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


fun AWSCognitoIdentityProviderFunctions.adminLinkProviderForUser(userPoolId: String, destinationUser: com.amazonaws.services.cognitoidp.model.ProviderUserIdentifierType, sourceUser: com.amazonaws.services.cognitoidp.model.ProviderUserIdentifierType, init: AWSCognitoIdentityProviderAdminLinkProviderForUserCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.AdminLinkProviderForUserResult {
	return this.block.declare(AWSCognitoIdentityProviderAdminLinkProviderForUserCommand(userPoolId, destinationUser, sourceUser).apply(init)) as com.amazonaws.services.cognitoidp.model.AdminLinkProviderForUserResult
}

@Generated
class AWSCognitoIdentityProviderAdminLinkProviderForUserCommand(val userPoolId: String, val destinationUser: com.amazonaws.services.cognitoidp.model.ProviderUserIdentifierType, val sourceUser: com.amazonaws.services.cognitoidp.model.ProviderUserIdentifierType) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminLinkProviderForUserRequest, com.amazonaws.services.cognitoidp.model.AdminLinkProviderForUserResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.AdminLinkProviderForUserRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminLinkProviderForUserRequest()
		input.setUserPoolId(this.userPoolId)
		input.setDestinationUser(this.destinationUser)
		input.setSourceUser(this.sourceUser)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.AdminLinkProviderForUserResult {
	  return com.amazonaws.services.cognitoidp.model.AdminLinkProviderForUserResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.AdminLinkProviderForUserResult {
		return environment.cognito_idp.adminLinkProviderForUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-link-provider-for-user")
				.argument("user-pool-id", userPoolId)
				.argument("destination-user", destinationUser.toString())
				.argument("source-user", sourceUser.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.adminListDevices(userPoolId: String, username: String, init: AWSCognitoIdentityProviderAdminListDevicesCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.AdminListDevicesResult {
	return this.block.declare(AWSCognitoIdentityProviderAdminListDevicesCommand(userPoolId, username).apply(init)) as com.amazonaws.services.cognitoidp.model.AdminListDevicesResult
}

@Generated
class AWSCognitoIdentityProviderAdminListDevicesCommand(val userPoolId: String, val username: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminListDevicesRequest, com.amazonaws.services.cognitoidp.model.AdminListDevicesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.AdminListDevicesResult {
	  return com.amazonaws.services.cognitoidp.model.AdminListDevicesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.AdminListDevicesResult {
		return environment.cognito_idp.adminListDevices(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-list-devices")
				.argument("user-pool-id", userPoolId)
				.argument("username", username)
				.argument("limit", limit?.toString())
				.argument("pagination-token", paginationToken)
	}

}


fun AWSCognitoIdentityProviderFunctions.adminListGroupsForUser(username: String, userPoolId: String, init: AWSCognitoIdentityProviderAdminListGroupsForUserCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.AdminListGroupsForUserResult {
	return this.block.declare(AWSCognitoIdentityProviderAdminListGroupsForUserCommand(username, userPoolId).apply(init)) as com.amazonaws.services.cognitoidp.model.AdminListGroupsForUserResult
}

@Generated
class AWSCognitoIdentityProviderAdminListGroupsForUserCommand(val username: String, val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminListGroupsForUserRequest, com.amazonaws.services.cognitoidp.model.AdminListGroupsForUserResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.AdminListGroupsForUserResult {
	  return com.amazonaws.services.cognitoidp.model.AdminListGroupsForUserResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.AdminListGroupsForUserResult {
		return environment.cognito_idp.adminListGroupsForUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-list-groups-for-user")
				.argument("username", username)
				.argument("user-pool-id", userPoolId)
				.argument("limit", limit?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSCognitoIdentityProviderFunctions.adminListUserAuthEvents(userPoolId: String, username: String, init: AWSCognitoIdentityProviderAdminListUserAuthEventsCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.AdminListUserAuthEventsResult {
	return this.block.declare(AWSCognitoIdentityProviderAdminListUserAuthEventsCommand(userPoolId, username).apply(init)) as com.amazonaws.services.cognitoidp.model.AdminListUserAuthEventsResult
}

@Generated
class AWSCognitoIdentityProviderAdminListUserAuthEventsCommand(val userPoolId: String, val username: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminListUserAuthEventsRequest, com.amazonaws.services.cognitoidp.model.AdminListUserAuthEventsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.AdminListUserAuthEventsResult {
	  return com.amazonaws.services.cognitoidp.model.AdminListUserAuthEventsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.AdminListUserAuthEventsResult {
		return environment.cognito_idp.adminListUserAuthEvents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-list-user-auth-events")
				.argument("user-pool-id", userPoolId)
				.argument("username", username)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSCognitoIdentityProviderFunctions.adminRemoveUserFromGroup(userPoolId: String, username: String, groupName: String, init: AWSCognitoIdentityProviderAdminRemoveUserFromGroupCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.AdminRemoveUserFromGroupResult {
	return this.block.declare(AWSCognitoIdentityProviderAdminRemoveUserFromGroupCommand(userPoolId, username, groupName).apply(init)) as com.amazonaws.services.cognitoidp.model.AdminRemoveUserFromGroupResult
}

@Generated
class AWSCognitoIdentityProviderAdminRemoveUserFromGroupCommand(val userPoolId: String, val username: String, val groupName: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminRemoveUserFromGroupRequest, com.amazonaws.services.cognitoidp.model.AdminRemoveUserFromGroupResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.AdminRemoveUserFromGroupRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminRemoveUserFromGroupRequest()
		input.setUserPoolId(this.userPoolId)
		input.setUsername(this.username)
		input.setGroupName(this.groupName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.AdminRemoveUserFromGroupResult {
	  return com.amazonaws.services.cognitoidp.model.AdminRemoveUserFromGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.AdminRemoveUserFromGroupResult {
		return environment.cognito_idp.adminRemoveUserFromGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-remove-user-from-group")
				.argument("user-pool-id", userPoolId)
				.argument("username", username)
				.argument("group-name", groupName)
	}

}


fun AWSCognitoIdentityProviderFunctions.adminResetUserPassword(userPoolId: String, username: String, init: AWSCognitoIdentityProviderAdminResetUserPasswordCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.AdminResetUserPasswordResult {
	return this.block.declare(AWSCognitoIdentityProviderAdminResetUserPasswordCommand(userPoolId, username).apply(init)) as com.amazonaws.services.cognitoidp.model.AdminResetUserPasswordResult
}

@Generated
class AWSCognitoIdentityProviderAdminResetUserPasswordCommand(val userPoolId: String, val username: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminResetUserPasswordRequest, com.amazonaws.services.cognitoidp.model.AdminResetUserPasswordResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.AdminResetUserPasswordRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminResetUserPasswordRequest()
		input.setUserPoolId(this.userPoolId)
		input.setUsername(this.username)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.AdminResetUserPasswordResult {
	  return com.amazonaws.services.cognitoidp.model.AdminResetUserPasswordResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.AdminResetUserPasswordResult {
		return environment.cognito_idp.adminResetUserPassword(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-reset-user-password")
				.argument("user-pool-id", userPoolId)
				.argument("username", username)
	}

}


fun AWSCognitoIdentityProviderFunctions.adminRespondToAuthChallenge(userPoolId: String, clientId: String, challengeName: ChallengeNameType, init: AWSCognitoIdentityProviderAdminRespondToAuthChallengeCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.AdminRespondToAuthChallengeResult {
	return this.block.declare(AWSCognitoIdentityProviderAdminRespondToAuthChallengeCommand(userPoolId, clientId, challengeName).apply(init)) as com.amazonaws.services.cognitoidp.model.AdminRespondToAuthChallengeResult
}

@Generated
class AWSCognitoIdentityProviderAdminRespondToAuthChallengeCommand(val userPoolId: String, val clientId: String, val challengeName: ChallengeNameType) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminRespondToAuthChallengeRequest, com.amazonaws.services.cognitoidp.model.AdminRespondToAuthChallengeResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.AdminRespondToAuthChallengeResult {
	  return com.amazonaws.services.cognitoidp.model.AdminRespondToAuthChallengeResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.AdminRespondToAuthChallengeResult {
		return environment.cognito_idp.adminRespondToAuthChallenge(build())
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


fun AWSCognitoIdentityProviderFunctions.adminSetUserMFAPreference(username: String, userPoolId: String, init: AWSCognitoIdentityProviderAdminSetUserMFAPreferenceCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.AdminSetUserMFAPreferenceResult {
	return this.block.declare(AWSCognitoIdentityProviderAdminSetUserMFAPreferenceCommand(username, userPoolId).apply(init)) as com.amazonaws.services.cognitoidp.model.AdminSetUserMFAPreferenceResult
}

@Generated
class AWSCognitoIdentityProviderAdminSetUserMFAPreferenceCommand(val username: String, val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminSetUserMFAPreferenceRequest, com.amazonaws.services.cognitoidp.model.AdminSetUserMFAPreferenceResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.AdminSetUserMFAPreferenceResult {
	  return com.amazonaws.services.cognitoidp.model.AdminSetUserMFAPreferenceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.AdminSetUserMFAPreferenceResult {
		return environment.cognito_idp.adminSetUserMFAPreference(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-set-user-mfapreference")
				.argument("smsmfa-settings", sMSMfaSettings?.toString())
				.argument("software-token-mfa-settings", softwareTokenMfaSettings?.toString())
				.argument("username", username)
				.argument("user-pool-id", userPoolId)
	}

}


fun AWSCognitoIdentityProviderFunctions.adminSetUserSettings(userPoolId: String, username: String, mFAOptions: List<com.amazonaws.services.cognitoidp.model.MFAOptionType>, init: AWSCognitoIdentityProviderAdminSetUserSettingsCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.AdminSetUserSettingsResult {
	return this.block.declare(AWSCognitoIdentityProviderAdminSetUserSettingsCommand(userPoolId, username, mFAOptions).apply(init)) as com.amazonaws.services.cognitoidp.model.AdminSetUserSettingsResult
}

@Generated
class AWSCognitoIdentityProviderAdminSetUserSettingsCommand(val userPoolId: String, val username: String, val mFAOptions: List<com.amazonaws.services.cognitoidp.model.MFAOptionType>) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminSetUserSettingsRequest, com.amazonaws.services.cognitoidp.model.AdminSetUserSettingsResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.AdminSetUserSettingsRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminSetUserSettingsRequest()
		input.setUserPoolId(this.userPoolId)
		input.setUsername(this.username)
		input.setMFAOptions(this.mFAOptions)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.AdminSetUserSettingsResult {
	  return com.amazonaws.services.cognitoidp.model.AdminSetUserSettingsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.AdminSetUserSettingsResult {
		return environment.cognito_idp.adminSetUserSettings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-set-user-settings")
				.argument("user-pool-id", userPoolId)
				.argument("username", username)
				.argument("mfaoptions", mFAOptions.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.adminUpdateAuthEventFeedback(userPoolId: String, username: String, eventId: String, feedbackValue: FeedbackValueType, init: AWSCognitoIdentityProviderAdminUpdateAuthEventFeedbackCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.AdminUpdateAuthEventFeedbackResult {
	return this.block.declare(AWSCognitoIdentityProviderAdminUpdateAuthEventFeedbackCommand(userPoolId, username, eventId, feedbackValue).apply(init)) as com.amazonaws.services.cognitoidp.model.AdminUpdateAuthEventFeedbackResult
}

@Generated
class AWSCognitoIdentityProviderAdminUpdateAuthEventFeedbackCommand(val userPoolId: String, val username: String, val eventId: String, val feedbackValue: FeedbackValueType) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminUpdateAuthEventFeedbackRequest, com.amazonaws.services.cognitoidp.model.AdminUpdateAuthEventFeedbackResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.AdminUpdateAuthEventFeedbackRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminUpdateAuthEventFeedbackRequest()
		input.setUserPoolId(this.userPoolId)
		input.setUsername(this.username)
		input.setEventId(this.eventId)
		input.setFeedbackValue(this.feedbackValue.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.AdminUpdateAuthEventFeedbackResult {
	  return com.amazonaws.services.cognitoidp.model.AdminUpdateAuthEventFeedbackResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.AdminUpdateAuthEventFeedbackResult {
		return environment.cognito_idp.adminUpdateAuthEventFeedback(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-update-auth-event-feedback")
				.argument("user-pool-id", userPoolId)
				.argument("username", username)
				.argument("event-id", eventId)
				.argument("feedback-value", feedbackValue.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.adminUpdateDeviceStatus(userPoolId: String, username: String, deviceKey: String, init: AWSCognitoIdentityProviderAdminUpdateDeviceStatusCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.AdminUpdateDeviceStatusResult {
	return this.block.declare(AWSCognitoIdentityProviderAdminUpdateDeviceStatusCommand(userPoolId, username, deviceKey).apply(init)) as com.amazonaws.services.cognitoidp.model.AdminUpdateDeviceStatusResult
}

@Generated
class AWSCognitoIdentityProviderAdminUpdateDeviceStatusCommand(val userPoolId: String, val username: String, val deviceKey: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminUpdateDeviceStatusRequest, com.amazonaws.services.cognitoidp.model.AdminUpdateDeviceStatusResult> {

	var deviceRememberedStatus: DeviceRememberedStatusType? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.AdminUpdateDeviceStatusRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminUpdateDeviceStatusRequest()
		input.setUserPoolId(this.userPoolId)
		input.setUsername(this.username)
		input.setDeviceKey(this.deviceKey)
		input.setDeviceRememberedStatus(this.deviceRememberedStatus?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.AdminUpdateDeviceStatusResult {
	  return com.amazonaws.services.cognitoidp.model.AdminUpdateDeviceStatusResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.AdminUpdateDeviceStatusResult {
		return environment.cognito_idp.adminUpdateDeviceStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-update-device-status")
				.argument("user-pool-id", userPoolId)
				.argument("username", username)
				.argument("device-key", deviceKey)
				.argument("device-remembered-status", deviceRememberedStatus?.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.adminUpdateUserAttributes(userPoolId: String, username: String, userAttributes: List<com.amazonaws.services.cognitoidp.model.AttributeType>, init: AWSCognitoIdentityProviderAdminUpdateUserAttributesCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.AdminUpdateUserAttributesResult {
	return this.block.declare(AWSCognitoIdentityProviderAdminUpdateUserAttributesCommand(userPoolId, username, userAttributes).apply(init)) as com.amazonaws.services.cognitoidp.model.AdminUpdateUserAttributesResult
}

@Generated
class AWSCognitoIdentityProviderAdminUpdateUserAttributesCommand(val userPoolId: String, val username: String, val userAttributes: List<com.amazonaws.services.cognitoidp.model.AttributeType>) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminUpdateUserAttributesRequest, com.amazonaws.services.cognitoidp.model.AdminUpdateUserAttributesResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.AdminUpdateUserAttributesRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminUpdateUserAttributesRequest()
		input.setUserPoolId(this.userPoolId)
		input.setUsername(this.username)
		input.setUserAttributes(this.userAttributes)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.AdminUpdateUserAttributesResult {
	  return com.amazonaws.services.cognitoidp.model.AdminUpdateUserAttributesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.AdminUpdateUserAttributesResult {
		return environment.cognito_idp.adminUpdateUserAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-update-user-attributes")
				.argument("user-pool-id", userPoolId)
				.argument("username", username)
				.argument("user-attributes", userAttributes.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.adminUserGlobalSignOut(userPoolId: String, username: String, init: AWSCognitoIdentityProviderAdminUserGlobalSignOutCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.AdminUserGlobalSignOutResult {
	return this.block.declare(AWSCognitoIdentityProviderAdminUserGlobalSignOutCommand(userPoolId, username).apply(init)) as com.amazonaws.services.cognitoidp.model.AdminUserGlobalSignOutResult
}

@Generated
class AWSCognitoIdentityProviderAdminUserGlobalSignOutCommand(val userPoolId: String, val username: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AdminUserGlobalSignOutRequest, com.amazonaws.services.cognitoidp.model.AdminUserGlobalSignOutResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.AdminUserGlobalSignOutRequest {
		val input = com.amazonaws.services.cognitoidp.model.AdminUserGlobalSignOutRequest()
		input.setUserPoolId(this.userPoolId)
		input.setUsername(this.username)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.AdminUserGlobalSignOutResult {
	  return com.amazonaws.services.cognitoidp.model.AdminUserGlobalSignOutResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.AdminUserGlobalSignOutResult {
		return environment.cognito_idp.adminUserGlobalSignOut(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp admin-user-global-sign-out")
				.argument("user-pool-id", userPoolId)
				.argument("username", username)
	}

}


fun AWSCognitoIdentityProviderFunctions.associateSoftwareToken(init: AWSCognitoIdentityProviderAssociateSoftwareTokenCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.AssociateSoftwareTokenResult {
	return this.block.declare(AWSCognitoIdentityProviderAssociateSoftwareTokenCommand().apply(init)) as com.amazonaws.services.cognitoidp.model.AssociateSoftwareTokenResult
}

@Generated
class AWSCognitoIdentityProviderAssociateSoftwareTokenCommand() : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.AssociateSoftwareTokenRequest, com.amazonaws.services.cognitoidp.model.AssociateSoftwareTokenResult> {

	var accessToken: String? = null
	var session: String? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.AssociateSoftwareTokenRequest {
		val input = com.amazonaws.services.cognitoidp.model.AssociateSoftwareTokenRequest()
		input.setAccessToken(this.accessToken)
		input.setSession(this.session)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.AssociateSoftwareTokenResult {
	  return com.amazonaws.services.cognitoidp.model.AssociateSoftwareTokenResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.AssociateSoftwareTokenResult {
		return environment.cognito_idp.associateSoftwareToken(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp associate-software-token")
				.argument("access-token", accessToken)
				.argument("session", session)
	}

}


fun AWSCognitoIdentityProviderFunctions.changePassword(previousPassword: String, proposedPassword: String, accessToken: String, init: AWSCognitoIdentityProviderChangePasswordCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.ChangePasswordResult {
	return this.block.declare(AWSCognitoIdentityProviderChangePasswordCommand(previousPassword, proposedPassword, accessToken).apply(init)) as com.amazonaws.services.cognitoidp.model.ChangePasswordResult
}

@Generated
class AWSCognitoIdentityProviderChangePasswordCommand(val previousPassword: String, val proposedPassword: String, val accessToken: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.ChangePasswordRequest, com.amazonaws.services.cognitoidp.model.ChangePasswordResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.ChangePasswordRequest {
		val input = com.amazonaws.services.cognitoidp.model.ChangePasswordRequest()
		input.setPreviousPassword(this.previousPassword)
		input.setProposedPassword(this.proposedPassword)
		input.setAccessToken(this.accessToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.ChangePasswordResult {
	  return com.amazonaws.services.cognitoidp.model.ChangePasswordResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.ChangePasswordResult {
		return environment.cognito_idp.changePassword(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp change-password")
				.argument("previous-password", previousPassword)
				.argument("proposed-password", proposedPassword)
				.argument("access-token", accessToken)
	}

}


fun AWSCognitoIdentityProviderFunctions.confirmDevice(accessToken: String, deviceKey: String, init: AWSCognitoIdentityProviderConfirmDeviceCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.ConfirmDeviceResult {
	return this.block.declare(AWSCognitoIdentityProviderConfirmDeviceCommand(accessToken, deviceKey).apply(init)) as com.amazonaws.services.cognitoidp.model.ConfirmDeviceResult
}

@Generated
class AWSCognitoIdentityProviderConfirmDeviceCommand(val accessToken: String, val deviceKey: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.ConfirmDeviceRequest, com.amazonaws.services.cognitoidp.model.ConfirmDeviceResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.ConfirmDeviceResult {
	  return com.amazonaws.services.cognitoidp.model.ConfirmDeviceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.ConfirmDeviceResult {
		return environment.cognito_idp.confirmDevice(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp confirm-device")
				.argument("access-token", accessToken)
				.argument("device-key", deviceKey)
				.argument("device-secret-verifier-config", deviceSecretVerifierConfig?.toString())
				.argument("device-name", deviceName)
	}

}


fun AWSCognitoIdentityProviderFunctions.confirmForgotPassword(clientId: String, username: String, confirmationCode: String, password: String, init: AWSCognitoIdentityProviderConfirmForgotPasswordCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.ConfirmForgotPasswordResult {
	return this.block.declare(AWSCognitoIdentityProviderConfirmForgotPasswordCommand(clientId, username, confirmationCode, password).apply(init)) as com.amazonaws.services.cognitoidp.model.ConfirmForgotPasswordResult
}

@Generated
class AWSCognitoIdentityProviderConfirmForgotPasswordCommand(val clientId: String, val username: String, val confirmationCode: String, val password: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.ConfirmForgotPasswordRequest, com.amazonaws.services.cognitoidp.model.ConfirmForgotPasswordResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.ConfirmForgotPasswordResult {
	  return com.amazonaws.services.cognitoidp.model.ConfirmForgotPasswordResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.ConfirmForgotPasswordResult {
		return environment.cognito_idp.confirmForgotPassword(build())
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


fun AWSCognitoIdentityProviderFunctions.confirmSignUp(clientId: String, username: String, confirmationCode: String, init: AWSCognitoIdentityProviderConfirmSignUpCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.ConfirmSignUpResult {
	return this.block.declare(AWSCognitoIdentityProviderConfirmSignUpCommand(clientId, username, confirmationCode).apply(init)) as com.amazonaws.services.cognitoidp.model.ConfirmSignUpResult
}

@Generated
class AWSCognitoIdentityProviderConfirmSignUpCommand(val clientId: String, val username: String, val confirmationCode: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.ConfirmSignUpRequest, com.amazonaws.services.cognitoidp.model.ConfirmSignUpResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.ConfirmSignUpResult {
	  return com.amazonaws.services.cognitoidp.model.ConfirmSignUpResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.ConfirmSignUpResult {
		return environment.cognito_idp.confirmSignUp(build())
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


fun AWSCognitoIdentityProviderFunctions.createGroup(groupName: String, userPoolId: String, init: AWSCognitoIdentityProviderCreateGroupCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.CreateGroupResult {
	return this.block.declare(AWSCognitoIdentityProviderCreateGroupCommand(groupName, userPoolId).apply(init)) as com.amazonaws.services.cognitoidp.model.CreateGroupResult
}

@Generated
class AWSCognitoIdentityProviderCreateGroupCommand(val groupName: String, val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.CreateGroupRequest, com.amazonaws.services.cognitoidp.model.CreateGroupResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.CreateGroupResult {
	  return com.amazonaws.services.cognitoidp.model.CreateGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.CreateGroupResult {
		return environment.cognito_idp.createGroup(build())
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


fun AWSCognitoIdentityProviderFunctions.createIdentityProvider(userPoolId: String, providerName: String, providerType: IdentityProviderTypeType, providerDetails: Map<String, String>, init: AWSCognitoIdentityProviderCreateIdentityProviderCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.CreateIdentityProviderResult {
	return this.block.declare(AWSCognitoIdentityProviderCreateIdentityProviderCommand(userPoolId, providerName, providerType, providerDetails).apply(init)) as com.amazonaws.services.cognitoidp.model.CreateIdentityProviderResult
}

@Generated
class AWSCognitoIdentityProviderCreateIdentityProviderCommand(val userPoolId: String, val providerName: String, val providerType: IdentityProviderTypeType, val providerDetails: Map<String, String>) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.CreateIdentityProviderRequest, com.amazonaws.services.cognitoidp.model.CreateIdentityProviderResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.CreateIdentityProviderResult {
	  return com.amazonaws.services.cognitoidp.model.CreateIdentityProviderResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.CreateIdentityProviderResult {
		return environment.cognito_idp.createIdentityProvider(build())
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


fun AWSCognitoIdentityProviderFunctions.createResourceServer(userPoolId: String, identifier: String, name: String, init: AWSCognitoIdentityProviderCreateResourceServerCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.CreateResourceServerResult {
	return this.block.declare(AWSCognitoIdentityProviderCreateResourceServerCommand(userPoolId, identifier, name).apply(init)) as com.amazonaws.services.cognitoidp.model.CreateResourceServerResult
}

@Generated
class AWSCognitoIdentityProviderCreateResourceServerCommand(val userPoolId: String, val identifier: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.CreateResourceServerRequest, com.amazonaws.services.cognitoidp.model.CreateResourceServerResult> {

	var scopes: List<com.amazonaws.services.cognitoidp.model.ResourceServerScopeType>? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.CreateResourceServerRequest {
		val input = com.amazonaws.services.cognitoidp.model.CreateResourceServerRequest()
		input.setUserPoolId(this.userPoolId)
		input.setIdentifier(this.identifier)
		input.setName(this.name)
		input.setScopes(this.scopes)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.CreateResourceServerResult {
	  return com.amazonaws.services.cognitoidp.model.CreateResourceServerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.CreateResourceServerResult {
		return environment.cognito_idp.createResourceServer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp create-resource-server")
				.argument("user-pool-id", userPoolId)
				.argument("identifier", identifier)
				.argument("name", name)
				.argument("scopes", scopes?.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.createUserImportJob(jobName: String, userPoolId: String, cloudWatchLogsRoleArn: String, init: AWSCognitoIdentityProviderCreateUserImportJobCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.CreateUserImportJobResult {
	return this.block.declare(AWSCognitoIdentityProviderCreateUserImportJobCommand(jobName, userPoolId, cloudWatchLogsRoleArn).apply(init)) as com.amazonaws.services.cognitoidp.model.CreateUserImportJobResult
}

@Generated
class AWSCognitoIdentityProviderCreateUserImportJobCommand(val jobName: String, val userPoolId: String, val cloudWatchLogsRoleArn: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.CreateUserImportJobRequest, com.amazonaws.services.cognitoidp.model.CreateUserImportJobResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.CreateUserImportJobRequest {
		val input = com.amazonaws.services.cognitoidp.model.CreateUserImportJobRequest()
		input.setJobName(this.jobName)
		input.setUserPoolId(this.userPoolId)
		input.setCloudWatchLogsRoleArn(this.cloudWatchLogsRoleArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.CreateUserImportJobResult {
	  return com.amazonaws.services.cognitoidp.model.CreateUserImportJobResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.CreateUserImportJobResult {
		return environment.cognito_idp.createUserImportJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp create-user-import-job")
				.argument("job-name", jobName)
				.argument("user-pool-id", userPoolId)
				.argument("cloud-watch-logs-role-arn", cloudWatchLogsRoleArn)
	}

}


fun AWSCognitoIdentityProviderFunctions.createUserPool(poolName: String, init: AWSCognitoIdentityProviderCreateUserPoolCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.CreateUserPoolResult {
	return this.block.declare(AWSCognitoIdentityProviderCreateUserPoolCommand(poolName).apply(init)) as com.amazonaws.services.cognitoidp.model.CreateUserPoolResult
}

@Generated
class AWSCognitoIdentityProviderCreateUserPoolCommand(val poolName: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.CreateUserPoolRequest, com.amazonaws.services.cognitoidp.model.CreateUserPoolResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.CreateUserPoolResult {
	  return com.amazonaws.services.cognitoidp.model.CreateUserPoolResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.CreateUserPoolResult {
		return environment.cognito_idp.createUserPool(build())
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


fun AWSCognitoIdentityProviderFunctions.createUserPoolClient(userPoolId: String, clientName: String, init: AWSCognitoIdentityProviderCreateUserPoolClientCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.CreateUserPoolClientResult {
	return this.block.declare(AWSCognitoIdentityProviderCreateUserPoolClientCommand(userPoolId, clientName).apply(init)) as com.amazonaws.services.cognitoidp.model.CreateUserPoolClientResult
}

@Generated
class AWSCognitoIdentityProviderCreateUserPoolClientCommand(val userPoolId: String, val clientName: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.CreateUserPoolClientRequest, com.amazonaws.services.cognitoidp.model.CreateUserPoolClientResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.CreateUserPoolClientResult {
	  return com.amazonaws.services.cognitoidp.model.CreateUserPoolClientResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.CreateUserPoolClientResult {
		return environment.cognito_idp.createUserPoolClient(build())
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


fun AWSCognitoIdentityProviderFunctions.createUserPoolDomain(domain: String, userPoolId: String, init: AWSCognitoIdentityProviderCreateUserPoolDomainCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.CreateUserPoolDomainResult {
	return this.block.declare(AWSCognitoIdentityProviderCreateUserPoolDomainCommand(domain, userPoolId).apply(init)) as com.amazonaws.services.cognitoidp.model.CreateUserPoolDomainResult
}

@Generated
class AWSCognitoIdentityProviderCreateUserPoolDomainCommand(val domain: String, val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.CreateUserPoolDomainRequest, com.amazonaws.services.cognitoidp.model.CreateUserPoolDomainResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.CreateUserPoolDomainRequest {
		val input = com.amazonaws.services.cognitoidp.model.CreateUserPoolDomainRequest()
		input.setDomain(this.domain)
		input.setUserPoolId(this.userPoolId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.CreateUserPoolDomainResult {
	  return com.amazonaws.services.cognitoidp.model.CreateUserPoolDomainResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.CreateUserPoolDomainResult {
		return environment.cognito_idp.createUserPoolDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp create-user-pool-domain")
				.argument("domain", domain)
				.argument("user-pool-id", userPoolId)
	}

}


fun AWSCognitoIdentityProviderFunctions.deleteGroup(groupName: String, userPoolId: String, init: AWSCognitoIdentityProviderDeleteGroupCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.DeleteGroupResult {
	return this.block.declare(AWSCognitoIdentityProviderDeleteGroupCommand(groupName, userPoolId).apply(init)) as com.amazonaws.services.cognitoidp.model.DeleteGroupResult
}

@Generated
class AWSCognitoIdentityProviderDeleteGroupCommand(val groupName: String, val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.DeleteGroupRequest, com.amazonaws.services.cognitoidp.model.DeleteGroupResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.DeleteGroupRequest {
		val input = com.amazonaws.services.cognitoidp.model.DeleteGroupRequest()
		input.setGroupName(this.groupName)
		input.setUserPoolId(this.userPoolId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.DeleteGroupResult {
	  return com.amazonaws.services.cognitoidp.model.DeleteGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.DeleteGroupResult {
		return environment.cognito_idp.deleteGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp delete-group")
				.argument("group-name", groupName)
				.argument("user-pool-id", userPoolId)
	}

}


fun AWSCognitoIdentityProviderFunctions.deleteIdentityProvider(userPoolId: String, providerName: String, init: AWSCognitoIdentityProviderDeleteIdentityProviderCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.DeleteIdentityProviderResult {
	return this.block.declare(AWSCognitoIdentityProviderDeleteIdentityProviderCommand(userPoolId, providerName).apply(init)) as com.amazonaws.services.cognitoidp.model.DeleteIdentityProviderResult
}

@Generated
class AWSCognitoIdentityProviderDeleteIdentityProviderCommand(val userPoolId: String, val providerName: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.DeleteIdentityProviderRequest, com.amazonaws.services.cognitoidp.model.DeleteIdentityProviderResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.DeleteIdentityProviderRequest {
		val input = com.amazonaws.services.cognitoidp.model.DeleteIdentityProviderRequest()
		input.setUserPoolId(this.userPoolId)
		input.setProviderName(this.providerName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.DeleteIdentityProviderResult {
	  return com.amazonaws.services.cognitoidp.model.DeleteIdentityProviderResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.DeleteIdentityProviderResult {
		return environment.cognito_idp.deleteIdentityProvider(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp delete-identity-provider")
				.argument("user-pool-id", userPoolId)
				.argument("provider-name", providerName)
	}

}


fun AWSCognitoIdentityProviderFunctions.deleteResourceServer(userPoolId: String, identifier: String, init: AWSCognitoIdentityProviderDeleteResourceServerCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.DeleteResourceServerResult {
	return this.block.declare(AWSCognitoIdentityProviderDeleteResourceServerCommand(userPoolId, identifier).apply(init)) as com.amazonaws.services.cognitoidp.model.DeleteResourceServerResult
}

@Generated
class AWSCognitoIdentityProviderDeleteResourceServerCommand(val userPoolId: String, val identifier: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.DeleteResourceServerRequest, com.amazonaws.services.cognitoidp.model.DeleteResourceServerResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.DeleteResourceServerRequest {
		val input = com.amazonaws.services.cognitoidp.model.DeleteResourceServerRequest()
		input.setUserPoolId(this.userPoolId)
		input.setIdentifier(this.identifier)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.DeleteResourceServerResult {
	  return com.amazonaws.services.cognitoidp.model.DeleteResourceServerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.DeleteResourceServerResult {
		return environment.cognito_idp.deleteResourceServer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp delete-resource-server")
				.argument("user-pool-id", userPoolId)
				.argument("identifier", identifier)
	}

}


fun AWSCognitoIdentityProviderFunctions.deleteUser(accessToken: String, init: AWSCognitoIdentityProviderDeleteUserCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.DeleteUserResult {
	return this.block.declare(AWSCognitoIdentityProviderDeleteUserCommand(accessToken).apply(init)) as com.amazonaws.services.cognitoidp.model.DeleteUserResult
}

@Generated
class AWSCognitoIdentityProviderDeleteUserCommand(val accessToken: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.DeleteUserRequest, com.amazonaws.services.cognitoidp.model.DeleteUserResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.DeleteUserRequest {
		val input = com.amazonaws.services.cognitoidp.model.DeleteUserRequest()
		input.setAccessToken(this.accessToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.DeleteUserResult {
	  return com.amazonaws.services.cognitoidp.model.DeleteUserResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.DeleteUserResult {
		return environment.cognito_idp.deleteUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp delete-user")
				.argument("access-token", accessToken)
	}

}


fun AWSCognitoIdentityProviderFunctions.deleteUserAttributes(userAttributeNames: List<String>, accessToken: String, init: AWSCognitoIdentityProviderDeleteUserAttributesCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.DeleteUserAttributesResult {
	return this.block.declare(AWSCognitoIdentityProviderDeleteUserAttributesCommand(userAttributeNames, accessToken).apply(init)) as com.amazonaws.services.cognitoidp.model.DeleteUserAttributesResult
}

@Generated
class AWSCognitoIdentityProviderDeleteUserAttributesCommand(val userAttributeNames: List<String>, val accessToken: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.DeleteUserAttributesRequest, com.amazonaws.services.cognitoidp.model.DeleteUserAttributesResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.DeleteUserAttributesRequest {
		val input = com.amazonaws.services.cognitoidp.model.DeleteUserAttributesRequest()
		input.setUserAttributeNames(this.userAttributeNames)
		input.setAccessToken(this.accessToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.DeleteUserAttributesResult {
	  return com.amazonaws.services.cognitoidp.model.DeleteUserAttributesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.DeleteUserAttributesResult {
		return environment.cognito_idp.deleteUserAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp delete-user-attributes")
				.argument("user-attribute-names", userAttributeNames.toString())
				.argument("access-token", accessToken)
	}

}


fun AWSCognitoIdentityProviderFunctions.deleteUserPool(userPoolId: String, init: AWSCognitoIdentityProviderDeleteUserPoolCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.DeleteUserPoolResult {
	return this.block.declare(AWSCognitoIdentityProviderDeleteUserPoolCommand(userPoolId).apply(init)) as com.amazonaws.services.cognitoidp.model.DeleteUserPoolResult
}

@Generated
class AWSCognitoIdentityProviderDeleteUserPoolCommand(val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.DeleteUserPoolRequest, com.amazonaws.services.cognitoidp.model.DeleteUserPoolResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.DeleteUserPoolRequest {
		val input = com.amazonaws.services.cognitoidp.model.DeleteUserPoolRequest()
		input.setUserPoolId(this.userPoolId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.DeleteUserPoolResult {
	  return com.amazonaws.services.cognitoidp.model.DeleteUserPoolResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.DeleteUserPoolResult {
		return environment.cognito_idp.deleteUserPool(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp delete-user-pool")
				.argument("user-pool-id", userPoolId)
	}

}


fun AWSCognitoIdentityProviderFunctions.deleteUserPoolClient(userPoolId: String, clientId: String, init: AWSCognitoIdentityProviderDeleteUserPoolClientCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.DeleteUserPoolClientResult {
	return this.block.declare(AWSCognitoIdentityProviderDeleteUserPoolClientCommand(userPoolId, clientId).apply(init)) as com.amazonaws.services.cognitoidp.model.DeleteUserPoolClientResult
}

@Generated
class AWSCognitoIdentityProviderDeleteUserPoolClientCommand(val userPoolId: String, val clientId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.DeleteUserPoolClientRequest, com.amazonaws.services.cognitoidp.model.DeleteUserPoolClientResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.DeleteUserPoolClientRequest {
		val input = com.amazonaws.services.cognitoidp.model.DeleteUserPoolClientRequest()
		input.setUserPoolId(this.userPoolId)
		input.setClientId(this.clientId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.DeleteUserPoolClientResult {
	  return com.amazonaws.services.cognitoidp.model.DeleteUserPoolClientResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.DeleteUserPoolClientResult {
		return environment.cognito_idp.deleteUserPoolClient(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp delete-user-pool-client")
				.argument("user-pool-id", userPoolId)
				.argument("client-id", clientId)
	}

}


fun AWSCognitoIdentityProviderFunctions.deleteUserPoolDomain(domain: String, userPoolId: String, init: AWSCognitoIdentityProviderDeleteUserPoolDomainCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.DeleteUserPoolDomainResult {
	return this.block.declare(AWSCognitoIdentityProviderDeleteUserPoolDomainCommand(domain, userPoolId).apply(init)) as com.amazonaws.services.cognitoidp.model.DeleteUserPoolDomainResult
}

@Generated
class AWSCognitoIdentityProviderDeleteUserPoolDomainCommand(val domain: String, val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.DeleteUserPoolDomainRequest, com.amazonaws.services.cognitoidp.model.DeleteUserPoolDomainResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.DeleteUserPoolDomainRequest {
		val input = com.amazonaws.services.cognitoidp.model.DeleteUserPoolDomainRequest()
		input.setDomain(this.domain)
		input.setUserPoolId(this.userPoolId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.DeleteUserPoolDomainResult {
	  return com.amazonaws.services.cognitoidp.model.DeleteUserPoolDomainResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.DeleteUserPoolDomainResult {
		return environment.cognito_idp.deleteUserPoolDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp delete-user-pool-domain")
				.argument("domain", domain)
				.argument("user-pool-id", userPoolId)
	}

}


fun AWSCognitoIdentityProviderFunctions.describeIdentityProvider(userPoolId: String, providerName: String, init: AWSCognitoIdentityProviderDescribeIdentityProviderCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.DescribeIdentityProviderResult {
	return this.block.declare(AWSCognitoIdentityProviderDescribeIdentityProviderCommand(userPoolId, providerName).apply(init)) as com.amazonaws.services.cognitoidp.model.DescribeIdentityProviderResult
}

@Generated
class AWSCognitoIdentityProviderDescribeIdentityProviderCommand(val userPoolId: String, val providerName: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.DescribeIdentityProviderRequest, com.amazonaws.services.cognitoidp.model.DescribeIdentityProviderResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.DescribeIdentityProviderRequest {
		val input = com.amazonaws.services.cognitoidp.model.DescribeIdentityProviderRequest()
		input.setUserPoolId(this.userPoolId)
		input.setProviderName(this.providerName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.DescribeIdentityProviderResult {
	  return com.amazonaws.services.cognitoidp.model.DescribeIdentityProviderResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.DescribeIdentityProviderResult {
		return environment.cognito_idp.describeIdentityProvider(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp describe-identity-provider")
				.argument("user-pool-id", userPoolId)
				.argument("provider-name", providerName)
	}

}


fun AWSCognitoIdentityProviderFunctions.describeResourceServer(userPoolId: String, identifier: String, init: AWSCognitoIdentityProviderDescribeResourceServerCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.DescribeResourceServerResult {
	return this.block.declare(AWSCognitoIdentityProviderDescribeResourceServerCommand(userPoolId, identifier).apply(init)) as com.amazonaws.services.cognitoidp.model.DescribeResourceServerResult
}

@Generated
class AWSCognitoIdentityProviderDescribeResourceServerCommand(val userPoolId: String, val identifier: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.DescribeResourceServerRequest, com.amazonaws.services.cognitoidp.model.DescribeResourceServerResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.DescribeResourceServerRequest {
		val input = com.amazonaws.services.cognitoidp.model.DescribeResourceServerRequest()
		input.setUserPoolId(this.userPoolId)
		input.setIdentifier(this.identifier)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.DescribeResourceServerResult {
	  return com.amazonaws.services.cognitoidp.model.DescribeResourceServerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.DescribeResourceServerResult {
		return environment.cognito_idp.describeResourceServer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp describe-resource-server")
				.argument("user-pool-id", userPoolId)
				.argument("identifier", identifier)
	}

}


fun AWSCognitoIdentityProviderFunctions.describeRiskConfiguration(userPoolId: String, init: AWSCognitoIdentityProviderDescribeRiskConfigurationCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.DescribeRiskConfigurationResult {
	return this.block.declare(AWSCognitoIdentityProviderDescribeRiskConfigurationCommand(userPoolId).apply(init)) as com.amazonaws.services.cognitoidp.model.DescribeRiskConfigurationResult
}

@Generated
class AWSCognitoIdentityProviderDescribeRiskConfigurationCommand(val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.DescribeRiskConfigurationRequest, com.amazonaws.services.cognitoidp.model.DescribeRiskConfigurationResult> {

	var clientId: String? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.DescribeRiskConfigurationRequest {
		val input = com.amazonaws.services.cognitoidp.model.DescribeRiskConfigurationRequest()
		input.setUserPoolId(this.userPoolId)
		input.setClientId(this.clientId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.DescribeRiskConfigurationResult {
	  return com.amazonaws.services.cognitoidp.model.DescribeRiskConfigurationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.DescribeRiskConfigurationResult {
		return environment.cognito_idp.describeRiskConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp describe-risk-configuration")
				.argument("user-pool-id", userPoolId)
				.argument("client-id", clientId)
	}

}


fun AWSCognitoIdentityProviderFunctions.describeUserImportJob(userPoolId: String, jobId: String, init: AWSCognitoIdentityProviderDescribeUserImportJobCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.DescribeUserImportJobResult {
	return this.block.declare(AWSCognitoIdentityProviderDescribeUserImportJobCommand(userPoolId, jobId).apply(init)) as com.amazonaws.services.cognitoidp.model.DescribeUserImportJobResult
}

@Generated
class AWSCognitoIdentityProviderDescribeUserImportJobCommand(val userPoolId: String, val jobId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.DescribeUserImportJobRequest, com.amazonaws.services.cognitoidp.model.DescribeUserImportJobResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.DescribeUserImportJobRequest {
		val input = com.amazonaws.services.cognitoidp.model.DescribeUserImportJobRequest()
		input.setUserPoolId(this.userPoolId)
		input.setJobId(this.jobId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.DescribeUserImportJobResult {
	  return com.amazonaws.services.cognitoidp.model.DescribeUserImportJobResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.DescribeUserImportJobResult {
		return environment.cognito_idp.describeUserImportJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp describe-user-import-job")
				.argument("user-pool-id", userPoolId)
				.argument("job-id", jobId)
	}

}


fun AWSCognitoIdentityProviderFunctions.describeUserPool(userPoolId: String, init: AWSCognitoIdentityProviderDescribeUserPoolCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.DescribeUserPoolResult {
	return this.block.declare(AWSCognitoIdentityProviderDescribeUserPoolCommand(userPoolId).apply(init)) as com.amazonaws.services.cognitoidp.model.DescribeUserPoolResult
}

@Generated
class AWSCognitoIdentityProviderDescribeUserPoolCommand(val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.DescribeUserPoolRequest, com.amazonaws.services.cognitoidp.model.DescribeUserPoolResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.DescribeUserPoolRequest {
		val input = com.amazonaws.services.cognitoidp.model.DescribeUserPoolRequest()
		input.setUserPoolId(this.userPoolId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.DescribeUserPoolResult {
	  return com.amazonaws.services.cognitoidp.model.DescribeUserPoolResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.DescribeUserPoolResult {
		return environment.cognito_idp.describeUserPool(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp describe-user-pool")
				.argument("user-pool-id", userPoolId)
	}

}


fun AWSCognitoIdentityProviderFunctions.describeUserPoolClient(userPoolId: String, clientId: String, init: AWSCognitoIdentityProviderDescribeUserPoolClientCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.DescribeUserPoolClientResult {
	return this.block.declare(AWSCognitoIdentityProviderDescribeUserPoolClientCommand(userPoolId, clientId).apply(init)) as com.amazonaws.services.cognitoidp.model.DescribeUserPoolClientResult
}

@Generated
class AWSCognitoIdentityProviderDescribeUserPoolClientCommand(val userPoolId: String, val clientId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.DescribeUserPoolClientRequest, com.amazonaws.services.cognitoidp.model.DescribeUserPoolClientResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.DescribeUserPoolClientRequest {
		val input = com.amazonaws.services.cognitoidp.model.DescribeUserPoolClientRequest()
		input.setUserPoolId(this.userPoolId)
		input.setClientId(this.clientId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.DescribeUserPoolClientResult {
	  return com.amazonaws.services.cognitoidp.model.DescribeUserPoolClientResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.DescribeUserPoolClientResult {
		return environment.cognito_idp.describeUserPoolClient(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp describe-user-pool-client")
				.argument("user-pool-id", userPoolId)
				.argument("client-id", clientId)
	}

}


fun AWSCognitoIdentityProviderFunctions.describeUserPoolDomain(domain: String, init: AWSCognitoIdentityProviderDescribeUserPoolDomainCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.DescribeUserPoolDomainResult {
	return this.block.declare(AWSCognitoIdentityProviderDescribeUserPoolDomainCommand(domain).apply(init)) as com.amazonaws.services.cognitoidp.model.DescribeUserPoolDomainResult
}

@Generated
class AWSCognitoIdentityProviderDescribeUserPoolDomainCommand(val domain: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.DescribeUserPoolDomainRequest, com.amazonaws.services.cognitoidp.model.DescribeUserPoolDomainResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.DescribeUserPoolDomainRequest {
		val input = com.amazonaws.services.cognitoidp.model.DescribeUserPoolDomainRequest()
		input.setDomain(this.domain)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.DescribeUserPoolDomainResult {
	  return com.amazonaws.services.cognitoidp.model.DescribeUserPoolDomainResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.DescribeUserPoolDomainResult {
		return environment.cognito_idp.describeUserPoolDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp describe-user-pool-domain")
				.argument("domain", domain)
	}

}


fun AWSCognitoIdentityProviderFunctions.forgetDevice(deviceKey: String, init: AWSCognitoIdentityProviderForgetDeviceCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.ForgetDeviceResult {
	return this.block.declare(AWSCognitoIdentityProviderForgetDeviceCommand(deviceKey).apply(init)) as com.amazonaws.services.cognitoidp.model.ForgetDeviceResult
}

@Generated
class AWSCognitoIdentityProviderForgetDeviceCommand(val deviceKey: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.ForgetDeviceRequest, com.amazonaws.services.cognitoidp.model.ForgetDeviceResult> {

	var accessToken: String? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.ForgetDeviceRequest {
		val input = com.amazonaws.services.cognitoidp.model.ForgetDeviceRequest()
		input.setAccessToken(this.accessToken)
		input.setDeviceKey(this.deviceKey)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.ForgetDeviceResult {
	  return com.amazonaws.services.cognitoidp.model.ForgetDeviceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.ForgetDeviceResult {
		return environment.cognito_idp.forgetDevice(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp forget-device")
				.argument("access-token", accessToken)
				.argument("device-key", deviceKey)
	}

}


fun AWSCognitoIdentityProviderFunctions.forgotPassword(clientId: String, username: String, init: AWSCognitoIdentityProviderForgotPasswordCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.ForgotPasswordResult {
	return this.block.declare(AWSCognitoIdentityProviderForgotPasswordCommand(clientId, username).apply(init)) as com.amazonaws.services.cognitoidp.model.ForgotPasswordResult
}

@Generated
class AWSCognitoIdentityProviderForgotPasswordCommand(val clientId: String, val username: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.ForgotPasswordRequest, com.amazonaws.services.cognitoidp.model.ForgotPasswordResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.ForgotPasswordResult {
	  return com.amazonaws.services.cognitoidp.model.ForgotPasswordResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.ForgotPasswordResult {
		return environment.cognito_idp.forgotPassword(build())
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


fun AWSCognitoIdentityProviderFunctions.getCSVHeader(userPoolId: String, init: AWSCognitoIdentityProviderGetCSVHeaderCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.GetCSVHeaderResult {
	return this.block.declare(AWSCognitoIdentityProviderGetCSVHeaderCommand(userPoolId).apply(init)) as com.amazonaws.services.cognitoidp.model.GetCSVHeaderResult
}

@Generated
class AWSCognitoIdentityProviderGetCSVHeaderCommand(val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.GetCSVHeaderRequest, com.amazonaws.services.cognitoidp.model.GetCSVHeaderResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.GetCSVHeaderRequest {
		val input = com.amazonaws.services.cognitoidp.model.GetCSVHeaderRequest()
		input.setUserPoolId(this.userPoolId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.GetCSVHeaderResult {
	  return com.amazonaws.services.cognitoidp.model.GetCSVHeaderResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.GetCSVHeaderResult {
		return environment.cognito_idp.getCSVHeader(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp get-csvheader")
				.argument("user-pool-id", userPoolId)
	}

}


fun AWSCognitoIdentityProviderFunctions.getDevice(deviceKey: String, init: AWSCognitoIdentityProviderGetDeviceCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.GetDeviceResult {
	return this.block.declare(AWSCognitoIdentityProviderGetDeviceCommand(deviceKey).apply(init)) as com.amazonaws.services.cognitoidp.model.GetDeviceResult
}

@Generated
class AWSCognitoIdentityProviderGetDeviceCommand(val deviceKey: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.GetDeviceRequest, com.amazonaws.services.cognitoidp.model.GetDeviceResult> {

	var accessToken: String? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.GetDeviceRequest {
		val input = com.amazonaws.services.cognitoidp.model.GetDeviceRequest()
		input.setDeviceKey(this.deviceKey)
		input.setAccessToken(this.accessToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.GetDeviceResult {
	  return com.amazonaws.services.cognitoidp.model.GetDeviceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.GetDeviceResult {
		return environment.cognito_idp.getDevice(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp get-device")
				.argument("device-key", deviceKey)
				.argument("access-token", accessToken)
	}

}


fun AWSCognitoIdentityProviderFunctions.getGroup(groupName: String, userPoolId: String, init: AWSCognitoIdentityProviderGetGroupCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.GetGroupResult {
	return this.block.declare(AWSCognitoIdentityProviderGetGroupCommand(groupName, userPoolId).apply(init)) as com.amazonaws.services.cognitoidp.model.GetGroupResult
}

@Generated
class AWSCognitoIdentityProviderGetGroupCommand(val groupName: String, val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.GetGroupRequest, com.amazonaws.services.cognitoidp.model.GetGroupResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.GetGroupRequest {
		val input = com.amazonaws.services.cognitoidp.model.GetGroupRequest()
		input.setGroupName(this.groupName)
		input.setUserPoolId(this.userPoolId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.GetGroupResult {
	  return com.amazonaws.services.cognitoidp.model.GetGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.GetGroupResult {
		return environment.cognito_idp.getGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp get-group")
				.argument("group-name", groupName)
				.argument("user-pool-id", userPoolId)
	}

}


fun AWSCognitoIdentityProviderFunctions.getIdentityProviderByIdentifier(userPoolId: String, idpIdentifier: String, init: AWSCognitoIdentityProviderGetIdentityProviderByIdentifierCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.GetIdentityProviderByIdentifierResult {
	return this.block.declare(AWSCognitoIdentityProviderGetIdentityProviderByIdentifierCommand(userPoolId, idpIdentifier).apply(init)) as com.amazonaws.services.cognitoidp.model.GetIdentityProviderByIdentifierResult
}

@Generated
class AWSCognitoIdentityProviderGetIdentityProviderByIdentifierCommand(val userPoolId: String, val idpIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.GetIdentityProviderByIdentifierRequest, com.amazonaws.services.cognitoidp.model.GetIdentityProviderByIdentifierResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.GetIdentityProviderByIdentifierRequest {
		val input = com.amazonaws.services.cognitoidp.model.GetIdentityProviderByIdentifierRequest()
		input.setUserPoolId(this.userPoolId)
		input.setIdpIdentifier(this.idpIdentifier)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.GetIdentityProviderByIdentifierResult {
	  return com.amazonaws.services.cognitoidp.model.GetIdentityProviderByIdentifierResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.GetIdentityProviderByIdentifierResult {
		return environment.cognito_idp.getIdentityProviderByIdentifier(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp get-identity-provider-by-identifier")
				.argument("user-pool-id", userPoolId)
				.argument("idp-identifier", idpIdentifier)
	}

}


fun AWSCognitoIdentityProviderFunctions.getSigningCertificate(userPoolId: String, init: AWSCognitoIdentityProviderGetSigningCertificateCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.GetSigningCertificateResult {
	return this.block.declare(AWSCognitoIdentityProviderGetSigningCertificateCommand(userPoolId).apply(init)) as com.amazonaws.services.cognitoidp.model.GetSigningCertificateResult
}

@Generated
class AWSCognitoIdentityProviderGetSigningCertificateCommand(val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.GetSigningCertificateRequest, com.amazonaws.services.cognitoidp.model.GetSigningCertificateResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.GetSigningCertificateRequest {
		val input = com.amazonaws.services.cognitoidp.model.GetSigningCertificateRequest()
		input.setUserPoolId(this.userPoolId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.GetSigningCertificateResult {
	  return com.amazonaws.services.cognitoidp.model.GetSigningCertificateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.GetSigningCertificateResult {
		return environment.cognito_idp.getSigningCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp get-signing-certificate")
				.argument("user-pool-id", userPoolId)
	}

}


fun AWSCognitoIdentityProviderFunctions.getUICustomization(userPoolId: String, init: AWSCognitoIdentityProviderGetUICustomizationCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.GetUICustomizationResult {
	return this.block.declare(AWSCognitoIdentityProviderGetUICustomizationCommand(userPoolId).apply(init)) as com.amazonaws.services.cognitoidp.model.GetUICustomizationResult
}

@Generated
class AWSCognitoIdentityProviderGetUICustomizationCommand(val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.GetUICustomizationRequest, com.amazonaws.services.cognitoidp.model.GetUICustomizationResult> {

	var clientId: String? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.GetUICustomizationRequest {
		val input = com.amazonaws.services.cognitoidp.model.GetUICustomizationRequest()
		input.setUserPoolId(this.userPoolId)
		input.setClientId(this.clientId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.GetUICustomizationResult {
	  return com.amazonaws.services.cognitoidp.model.GetUICustomizationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.GetUICustomizationResult {
		return environment.cognito_idp.getUICustomization(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp get-uicustomization")
				.argument("user-pool-id", userPoolId)
				.argument("client-id", clientId)
	}

}


fun AWSCognitoIdentityProviderFunctions.getUser(accessToken: String, init: AWSCognitoIdentityProviderGetUserCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.GetUserResult {
	return this.block.declare(AWSCognitoIdentityProviderGetUserCommand(accessToken).apply(init)) as com.amazonaws.services.cognitoidp.model.GetUserResult
}

@Generated
class AWSCognitoIdentityProviderGetUserCommand(val accessToken: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.GetUserRequest, com.amazonaws.services.cognitoidp.model.GetUserResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.GetUserRequest {
		val input = com.amazonaws.services.cognitoidp.model.GetUserRequest()
		input.setAccessToken(this.accessToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.GetUserResult {
	  return com.amazonaws.services.cognitoidp.model.GetUserResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.GetUserResult {
		return environment.cognito_idp.getUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp get-user")
				.argument("access-token", accessToken)
	}

}


fun AWSCognitoIdentityProviderFunctions.getUserAttributeVerificationCode(accessToken: String, attributeName: String, init: AWSCognitoIdentityProviderGetUserAttributeVerificationCodeCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.GetUserAttributeVerificationCodeResult {
	return this.block.declare(AWSCognitoIdentityProviderGetUserAttributeVerificationCodeCommand(accessToken, attributeName).apply(init)) as com.amazonaws.services.cognitoidp.model.GetUserAttributeVerificationCodeResult
}

@Generated
class AWSCognitoIdentityProviderGetUserAttributeVerificationCodeCommand(val accessToken: String, val attributeName: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.GetUserAttributeVerificationCodeRequest, com.amazonaws.services.cognitoidp.model.GetUserAttributeVerificationCodeResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.GetUserAttributeVerificationCodeRequest {
		val input = com.amazonaws.services.cognitoidp.model.GetUserAttributeVerificationCodeRequest()
		input.setAccessToken(this.accessToken)
		input.setAttributeName(this.attributeName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.GetUserAttributeVerificationCodeResult {
	  return com.amazonaws.services.cognitoidp.model.GetUserAttributeVerificationCodeResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.GetUserAttributeVerificationCodeResult {
		return environment.cognito_idp.getUserAttributeVerificationCode(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp get-user-attribute-verification-code")
				.argument("access-token", accessToken)
				.argument("attribute-name", attributeName)
	}

}


fun AWSCognitoIdentityProviderFunctions.getUserPoolMfaConfig(userPoolId: String, init: AWSCognitoIdentityProviderGetUserPoolMfaConfigCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.GetUserPoolMfaConfigResult {
	return this.block.declare(AWSCognitoIdentityProviderGetUserPoolMfaConfigCommand(userPoolId).apply(init)) as com.amazonaws.services.cognitoidp.model.GetUserPoolMfaConfigResult
}

@Generated
class AWSCognitoIdentityProviderGetUserPoolMfaConfigCommand(val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.GetUserPoolMfaConfigRequest, com.amazonaws.services.cognitoidp.model.GetUserPoolMfaConfigResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.GetUserPoolMfaConfigRequest {
		val input = com.amazonaws.services.cognitoidp.model.GetUserPoolMfaConfigRequest()
		input.setUserPoolId(this.userPoolId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.GetUserPoolMfaConfigResult {
	  return com.amazonaws.services.cognitoidp.model.GetUserPoolMfaConfigResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.GetUserPoolMfaConfigResult {
		return environment.cognito_idp.getUserPoolMfaConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp get-user-pool-mfa-config")
				.argument("user-pool-id", userPoolId)
	}

}


fun AWSCognitoIdentityProviderFunctions.globalSignOut(accessToken: String, init: AWSCognitoIdentityProviderGlobalSignOutCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.GlobalSignOutResult {
	return this.block.declare(AWSCognitoIdentityProviderGlobalSignOutCommand(accessToken).apply(init)) as com.amazonaws.services.cognitoidp.model.GlobalSignOutResult
}

@Generated
class AWSCognitoIdentityProviderGlobalSignOutCommand(val accessToken: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.GlobalSignOutRequest, com.amazonaws.services.cognitoidp.model.GlobalSignOutResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.GlobalSignOutRequest {
		val input = com.amazonaws.services.cognitoidp.model.GlobalSignOutRequest()
		input.setAccessToken(this.accessToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.GlobalSignOutResult {
	  return com.amazonaws.services.cognitoidp.model.GlobalSignOutResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.GlobalSignOutResult {
		return environment.cognito_idp.globalSignOut(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp global-sign-out")
				.argument("access-token", accessToken)
	}

}


fun AWSCognitoIdentityProviderFunctions.initiateAuth(authFlow: AuthFlowType, clientId: String, init: AWSCognitoIdentityProviderInitiateAuthCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.InitiateAuthResult {
	return this.block.declare(AWSCognitoIdentityProviderInitiateAuthCommand(authFlow, clientId).apply(init)) as com.amazonaws.services.cognitoidp.model.InitiateAuthResult
}

@Generated
class AWSCognitoIdentityProviderInitiateAuthCommand(val authFlow: AuthFlowType, val clientId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.InitiateAuthRequest, com.amazonaws.services.cognitoidp.model.InitiateAuthResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.InitiateAuthResult {
	  return com.amazonaws.services.cognitoidp.model.InitiateAuthResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.InitiateAuthResult {
		return environment.cognito_idp.initiateAuth(build())
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


fun AWSCognitoIdentityProviderFunctions.listDevices(accessToken: String, init: AWSCognitoIdentityProviderListDevicesCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.ListDevicesResult {
	return this.block.declare(AWSCognitoIdentityProviderListDevicesCommand(accessToken).apply(init)) as com.amazonaws.services.cognitoidp.model.ListDevicesResult
}

@Generated
class AWSCognitoIdentityProviderListDevicesCommand(val accessToken: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.ListDevicesRequest, com.amazonaws.services.cognitoidp.model.ListDevicesResult> {

	var limit: Int? = 0
	var paginationToken: String? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.ListDevicesRequest {
		val input = com.amazonaws.services.cognitoidp.model.ListDevicesRequest()
		input.setAccessToken(this.accessToken)
		input.setLimit(this.limit)
		input.setPaginationToken(this.paginationToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.ListDevicesResult {
	  return com.amazonaws.services.cognitoidp.model.ListDevicesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.ListDevicesResult {
		return environment.cognito_idp.listDevices(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp list-devices")
				.argument("access-token", accessToken)
				.argument("limit", limit?.toString())
				.argument("pagination-token", paginationToken)
	}

}


fun AWSCognitoIdentityProviderFunctions.listGroups(userPoolId: String, init: AWSCognitoIdentityProviderListGroupsCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.ListGroupsResult {
	return this.block.declare(AWSCognitoIdentityProviderListGroupsCommand(userPoolId).apply(init)) as com.amazonaws.services.cognitoidp.model.ListGroupsResult
}

@Generated
class AWSCognitoIdentityProviderListGroupsCommand(val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.ListGroupsRequest, com.amazonaws.services.cognitoidp.model.ListGroupsResult> {

	var limit: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.ListGroupsRequest {
		val input = com.amazonaws.services.cognitoidp.model.ListGroupsRequest()
		input.setUserPoolId(this.userPoolId)
		input.setLimit(this.limit)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.ListGroupsResult {
	  return com.amazonaws.services.cognitoidp.model.ListGroupsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.ListGroupsResult {
		return environment.cognito_idp.listGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp list-groups")
				.argument("user-pool-id", userPoolId)
				.argument("limit", limit?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSCognitoIdentityProviderFunctions.listIdentityProviders(userPoolId: String, init: AWSCognitoIdentityProviderListIdentityProvidersCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.ListIdentityProvidersResult {
	return this.block.declare(AWSCognitoIdentityProviderListIdentityProvidersCommand(userPoolId).apply(init)) as com.amazonaws.services.cognitoidp.model.ListIdentityProvidersResult
}

@Generated
class AWSCognitoIdentityProviderListIdentityProvidersCommand(val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.ListIdentityProvidersRequest, com.amazonaws.services.cognitoidp.model.ListIdentityProvidersResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.ListIdentityProvidersRequest {
		val input = com.amazonaws.services.cognitoidp.model.ListIdentityProvidersRequest()
		input.setUserPoolId(this.userPoolId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.ListIdentityProvidersResult {
	  return com.amazonaws.services.cognitoidp.model.ListIdentityProvidersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.ListIdentityProvidersResult {
		return environment.cognito_idp.listIdentityProviders(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp list-identity-providers")
				.argument("user-pool-id", userPoolId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSCognitoIdentityProviderFunctions.listResourceServers(userPoolId: String, init: AWSCognitoIdentityProviderListResourceServersCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.ListResourceServersResult {
	return this.block.declare(AWSCognitoIdentityProviderListResourceServersCommand(userPoolId).apply(init)) as com.amazonaws.services.cognitoidp.model.ListResourceServersResult
}

@Generated
class AWSCognitoIdentityProviderListResourceServersCommand(val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.ListResourceServersRequest, com.amazonaws.services.cognitoidp.model.ListResourceServersResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.ListResourceServersRequest {
		val input = com.amazonaws.services.cognitoidp.model.ListResourceServersRequest()
		input.setUserPoolId(this.userPoolId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.ListResourceServersResult {
	  return com.amazonaws.services.cognitoidp.model.ListResourceServersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.ListResourceServersResult {
		return environment.cognito_idp.listResourceServers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp list-resource-servers")
				.argument("user-pool-id", userPoolId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSCognitoIdentityProviderFunctions.listUserImportJobs(userPoolId: String, maxResults: Int, init: AWSCognitoIdentityProviderListUserImportJobsCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.ListUserImportJobsResult {
	return this.block.declare(AWSCognitoIdentityProviderListUserImportJobsCommand(userPoolId, maxResults).apply(init)) as com.amazonaws.services.cognitoidp.model.ListUserImportJobsResult
}

@Generated
class AWSCognitoIdentityProviderListUserImportJobsCommand(val userPoolId: String, val maxResults: Int) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.ListUserImportJobsRequest, com.amazonaws.services.cognitoidp.model.ListUserImportJobsResult> {

	var paginationToken: String? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.ListUserImportJobsRequest {
		val input = com.amazonaws.services.cognitoidp.model.ListUserImportJobsRequest()
		input.setUserPoolId(this.userPoolId)
		input.setMaxResults(this.maxResults)
		input.setPaginationToken(this.paginationToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.ListUserImportJobsResult {
	  return com.amazonaws.services.cognitoidp.model.ListUserImportJobsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.ListUserImportJobsResult {
		return environment.cognito_idp.listUserImportJobs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp list-user-import-jobs")
				.argument("user-pool-id", userPoolId)
				.argument("max-results", maxResults.toString())
				.argument("pagination-token", paginationToken)
	}

}


fun AWSCognitoIdentityProviderFunctions.listUserPoolClients(userPoolId: String, init: AWSCognitoIdentityProviderListUserPoolClientsCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.ListUserPoolClientsResult {
	return this.block.declare(AWSCognitoIdentityProviderListUserPoolClientsCommand(userPoolId).apply(init)) as com.amazonaws.services.cognitoidp.model.ListUserPoolClientsResult
}

@Generated
class AWSCognitoIdentityProviderListUserPoolClientsCommand(val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.ListUserPoolClientsRequest, com.amazonaws.services.cognitoidp.model.ListUserPoolClientsResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.ListUserPoolClientsRequest {
		val input = com.amazonaws.services.cognitoidp.model.ListUserPoolClientsRequest()
		input.setUserPoolId(this.userPoolId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.ListUserPoolClientsResult {
	  return com.amazonaws.services.cognitoidp.model.ListUserPoolClientsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.ListUserPoolClientsResult {
		return environment.cognito_idp.listUserPoolClients(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp list-user-pool-clients")
				.argument("user-pool-id", userPoolId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSCognitoIdentityProviderFunctions.listUserPools(maxResults: Int, init: AWSCognitoIdentityProviderListUserPoolsCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.ListUserPoolsResult {
	return this.block.declare(AWSCognitoIdentityProviderListUserPoolsCommand(maxResults).apply(init)) as com.amazonaws.services.cognitoidp.model.ListUserPoolsResult
}

@Generated
class AWSCognitoIdentityProviderListUserPoolsCommand(val maxResults: Int) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.ListUserPoolsRequest, com.amazonaws.services.cognitoidp.model.ListUserPoolsResult> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.ListUserPoolsRequest {
		val input = com.amazonaws.services.cognitoidp.model.ListUserPoolsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.ListUserPoolsResult {
	  return com.amazonaws.services.cognitoidp.model.ListUserPoolsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.ListUserPoolsResult {
		return environment.cognito_idp.listUserPools(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp list-user-pools")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.listUsers(userPoolId: String, init: AWSCognitoIdentityProviderListUsersCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.ListUsersResult {
	return this.block.declare(AWSCognitoIdentityProviderListUsersCommand(userPoolId).apply(init)) as com.amazonaws.services.cognitoidp.model.ListUsersResult
}

@Generated
class AWSCognitoIdentityProviderListUsersCommand(val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.ListUsersRequest, com.amazonaws.services.cognitoidp.model.ListUsersResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.ListUsersResult {
	  return com.amazonaws.services.cognitoidp.model.ListUsersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.ListUsersResult {
		return environment.cognito_idp.listUsers(build())
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


fun AWSCognitoIdentityProviderFunctions.listUsersInGroup(userPoolId: String, groupName: String, init: AWSCognitoIdentityProviderListUsersInGroupCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.ListUsersInGroupResult {
	return this.block.declare(AWSCognitoIdentityProviderListUsersInGroupCommand(userPoolId, groupName).apply(init)) as com.amazonaws.services.cognitoidp.model.ListUsersInGroupResult
}

@Generated
class AWSCognitoIdentityProviderListUsersInGroupCommand(val userPoolId: String, val groupName: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.ListUsersInGroupRequest, com.amazonaws.services.cognitoidp.model.ListUsersInGroupResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.ListUsersInGroupResult {
	  return com.amazonaws.services.cognitoidp.model.ListUsersInGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.ListUsersInGroupResult {
		return environment.cognito_idp.listUsersInGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp list-users-in-group")
				.argument("user-pool-id", userPoolId)
				.argument("group-name", groupName)
				.argument("limit", limit?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSCognitoIdentityProviderFunctions.resendConfirmationCode(clientId: String, username: String, init: AWSCognitoIdentityProviderResendConfirmationCodeCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.ResendConfirmationCodeResult {
	return this.block.declare(AWSCognitoIdentityProviderResendConfirmationCodeCommand(clientId, username).apply(init)) as com.amazonaws.services.cognitoidp.model.ResendConfirmationCodeResult
}

@Generated
class AWSCognitoIdentityProviderResendConfirmationCodeCommand(val clientId: String, val username: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.ResendConfirmationCodeRequest, com.amazonaws.services.cognitoidp.model.ResendConfirmationCodeResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.ResendConfirmationCodeResult {
	  return com.amazonaws.services.cognitoidp.model.ResendConfirmationCodeResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.ResendConfirmationCodeResult {
		return environment.cognito_idp.resendConfirmationCode(build())
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


fun AWSCognitoIdentityProviderFunctions.respondToAuthChallenge(clientId: String, challengeName: ChallengeNameType, init: AWSCognitoIdentityProviderRespondToAuthChallengeCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.RespondToAuthChallengeResult {
	return this.block.declare(AWSCognitoIdentityProviderRespondToAuthChallengeCommand(clientId, challengeName).apply(init)) as com.amazonaws.services.cognitoidp.model.RespondToAuthChallengeResult
}

@Generated
class AWSCognitoIdentityProviderRespondToAuthChallengeCommand(val clientId: String, val challengeName: ChallengeNameType) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.RespondToAuthChallengeRequest, com.amazonaws.services.cognitoidp.model.RespondToAuthChallengeResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.RespondToAuthChallengeResult {
	  return com.amazonaws.services.cognitoidp.model.RespondToAuthChallengeResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.RespondToAuthChallengeResult {
		return environment.cognito_idp.respondToAuthChallenge(build())
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


fun AWSCognitoIdentityProviderFunctions.setRiskConfiguration(userPoolId: String, init: AWSCognitoIdentityProviderSetRiskConfigurationCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.SetRiskConfigurationResult {
	return this.block.declare(AWSCognitoIdentityProviderSetRiskConfigurationCommand(userPoolId).apply(init)) as com.amazonaws.services.cognitoidp.model.SetRiskConfigurationResult
}

@Generated
class AWSCognitoIdentityProviderSetRiskConfigurationCommand(val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.SetRiskConfigurationRequest, com.amazonaws.services.cognitoidp.model.SetRiskConfigurationResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.SetRiskConfigurationResult {
	  return com.amazonaws.services.cognitoidp.model.SetRiskConfigurationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.SetRiskConfigurationResult {
		return environment.cognito_idp.setRiskConfiguration(build())
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


fun AWSCognitoIdentityProviderFunctions.setUICustomization(userPoolId: String, init: AWSCognitoIdentityProviderSetUICustomizationCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.SetUICustomizationResult {
	return this.block.declare(AWSCognitoIdentityProviderSetUICustomizationCommand(userPoolId).apply(init)) as com.amazonaws.services.cognitoidp.model.SetUICustomizationResult
}

@Generated
class AWSCognitoIdentityProviderSetUICustomizationCommand(val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.SetUICustomizationRequest, com.amazonaws.services.cognitoidp.model.SetUICustomizationResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.SetUICustomizationResult {
	  return com.amazonaws.services.cognitoidp.model.SetUICustomizationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.SetUICustomizationResult {
		return environment.cognito_idp.setUICustomization(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp set-uicustomization")
				.argument("user-pool-id", userPoolId)
				.argument("client-id", clientId)
				.argument("css", cSS)
				.argument("image-file", imageFile?.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.setUserMFAPreference(accessToken: String, init: AWSCognitoIdentityProviderSetUserMFAPreferenceCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.SetUserMFAPreferenceResult {
	return this.block.declare(AWSCognitoIdentityProviderSetUserMFAPreferenceCommand(accessToken).apply(init)) as com.amazonaws.services.cognitoidp.model.SetUserMFAPreferenceResult
}

@Generated
class AWSCognitoIdentityProviderSetUserMFAPreferenceCommand(val accessToken: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.SetUserMFAPreferenceRequest, com.amazonaws.services.cognitoidp.model.SetUserMFAPreferenceResult> {

	var sMSMfaSettings: com.amazonaws.services.cognitoidp.model.SMSMfaSettingsType? = null
	var softwareTokenMfaSettings: com.amazonaws.services.cognitoidp.model.SoftwareTokenMfaSettingsType? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.SetUserMFAPreferenceRequest {
		val input = com.amazonaws.services.cognitoidp.model.SetUserMFAPreferenceRequest()
		input.setSMSMfaSettings(this.sMSMfaSettings)
		input.setSoftwareTokenMfaSettings(this.softwareTokenMfaSettings)
		input.setAccessToken(this.accessToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.SetUserMFAPreferenceResult {
	  return com.amazonaws.services.cognitoidp.model.SetUserMFAPreferenceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.SetUserMFAPreferenceResult {
		return environment.cognito_idp.setUserMFAPreference(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp set-user-mfapreference")
				.argument("smsmfa-settings", sMSMfaSettings?.toString())
				.argument("software-token-mfa-settings", softwareTokenMfaSettings?.toString())
				.argument("access-token", accessToken)
	}

}


fun AWSCognitoIdentityProviderFunctions.setUserPoolMfaConfig(userPoolId: String, init: AWSCognitoIdentityProviderSetUserPoolMfaConfigCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.SetUserPoolMfaConfigResult {
	return this.block.declare(AWSCognitoIdentityProviderSetUserPoolMfaConfigCommand(userPoolId).apply(init)) as com.amazonaws.services.cognitoidp.model.SetUserPoolMfaConfigResult
}

@Generated
class AWSCognitoIdentityProviderSetUserPoolMfaConfigCommand(val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.SetUserPoolMfaConfigRequest, com.amazonaws.services.cognitoidp.model.SetUserPoolMfaConfigResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.SetUserPoolMfaConfigResult {
	  return com.amazonaws.services.cognitoidp.model.SetUserPoolMfaConfigResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.SetUserPoolMfaConfigResult {
		return environment.cognito_idp.setUserPoolMfaConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp set-user-pool-mfa-config")
				.argument("user-pool-id", userPoolId)
				.argument("sms-mfa-configuration", smsMfaConfiguration?.toString())
				.argument("software-token-mfa-configuration", softwareTokenMfaConfiguration?.toString())
				.argument("mfa-configuration", mfaConfiguration?.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.setUserSettings(accessToken: String, mFAOptions: List<com.amazonaws.services.cognitoidp.model.MFAOptionType>, init: AWSCognitoIdentityProviderSetUserSettingsCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.SetUserSettingsResult {
	return this.block.declare(AWSCognitoIdentityProviderSetUserSettingsCommand(accessToken, mFAOptions).apply(init)) as com.amazonaws.services.cognitoidp.model.SetUserSettingsResult
}

@Generated
class AWSCognitoIdentityProviderSetUserSettingsCommand(val accessToken: String, val mFAOptions: List<com.amazonaws.services.cognitoidp.model.MFAOptionType>) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.SetUserSettingsRequest, com.amazonaws.services.cognitoidp.model.SetUserSettingsResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.SetUserSettingsRequest {
		val input = com.amazonaws.services.cognitoidp.model.SetUserSettingsRequest()
		input.setAccessToken(this.accessToken)
		input.setMFAOptions(this.mFAOptions)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.SetUserSettingsResult {
	  return com.amazonaws.services.cognitoidp.model.SetUserSettingsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.SetUserSettingsResult {
		return environment.cognito_idp.setUserSettings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp set-user-settings")
				.argument("access-token", accessToken)
				.argument("mfaoptions", mFAOptions.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.signUp(clientId: String, username: String, password: String, init: AWSCognitoIdentityProviderSignUpCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.SignUpResult {
	return this.block.declare(AWSCognitoIdentityProviderSignUpCommand(clientId, username, password).apply(init)) as com.amazonaws.services.cognitoidp.model.SignUpResult
}

@Generated
class AWSCognitoIdentityProviderSignUpCommand(val clientId: String, val username: String, val password: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.SignUpRequest, com.amazonaws.services.cognitoidp.model.SignUpResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.SignUpResult {
	  return com.amazonaws.services.cognitoidp.model.SignUpResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.SignUpResult {
		return environment.cognito_idp.signUp(build())
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


fun AWSCognitoIdentityProviderFunctions.startUserImportJob(userPoolId: String, jobId: String, init: AWSCognitoIdentityProviderStartUserImportJobCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.StartUserImportJobResult {
	return this.block.declare(AWSCognitoIdentityProviderStartUserImportJobCommand(userPoolId, jobId).apply(init)) as com.amazonaws.services.cognitoidp.model.StartUserImportJobResult
}

@Generated
class AWSCognitoIdentityProviderStartUserImportJobCommand(val userPoolId: String, val jobId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.StartUserImportJobRequest, com.amazonaws.services.cognitoidp.model.StartUserImportJobResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.StartUserImportJobRequest {
		val input = com.amazonaws.services.cognitoidp.model.StartUserImportJobRequest()
		input.setUserPoolId(this.userPoolId)
		input.setJobId(this.jobId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.StartUserImportJobResult {
	  return com.amazonaws.services.cognitoidp.model.StartUserImportJobResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.StartUserImportJobResult {
		return environment.cognito_idp.startUserImportJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp start-user-import-job")
				.argument("user-pool-id", userPoolId)
				.argument("job-id", jobId)
	}

}


fun AWSCognitoIdentityProviderFunctions.stopUserImportJob(userPoolId: String, jobId: String, init: AWSCognitoIdentityProviderStopUserImportJobCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.StopUserImportJobResult {
	return this.block.declare(AWSCognitoIdentityProviderStopUserImportJobCommand(userPoolId, jobId).apply(init)) as com.amazonaws.services.cognitoidp.model.StopUserImportJobResult
}

@Generated
class AWSCognitoIdentityProviderStopUserImportJobCommand(val userPoolId: String, val jobId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.StopUserImportJobRequest, com.amazonaws.services.cognitoidp.model.StopUserImportJobResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.StopUserImportJobRequest {
		val input = com.amazonaws.services.cognitoidp.model.StopUserImportJobRequest()
		input.setUserPoolId(this.userPoolId)
		input.setJobId(this.jobId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.StopUserImportJobResult {
	  return com.amazonaws.services.cognitoidp.model.StopUserImportJobResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.StopUserImportJobResult {
		return environment.cognito_idp.stopUserImportJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp stop-user-import-job")
				.argument("user-pool-id", userPoolId)
				.argument("job-id", jobId)
	}

}


fun AWSCognitoIdentityProviderFunctions.updateAuthEventFeedback(userPoolId: String, username: String, eventId: String, feedbackToken: String, feedbackValue: FeedbackValueType, init: AWSCognitoIdentityProviderUpdateAuthEventFeedbackCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.UpdateAuthEventFeedbackResult {
	return this.block.declare(AWSCognitoIdentityProviderUpdateAuthEventFeedbackCommand(userPoolId, username, eventId, feedbackToken, feedbackValue).apply(init)) as com.amazonaws.services.cognitoidp.model.UpdateAuthEventFeedbackResult
}

@Generated
class AWSCognitoIdentityProviderUpdateAuthEventFeedbackCommand(val userPoolId: String, val username: String, val eventId: String, val feedbackToken: String, val feedbackValue: FeedbackValueType) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.UpdateAuthEventFeedbackRequest, com.amazonaws.services.cognitoidp.model.UpdateAuthEventFeedbackResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.UpdateAuthEventFeedbackRequest {
		val input = com.amazonaws.services.cognitoidp.model.UpdateAuthEventFeedbackRequest()
		input.setUserPoolId(this.userPoolId)
		input.setUsername(this.username)
		input.setEventId(this.eventId)
		input.setFeedbackToken(this.feedbackToken)
		input.setFeedbackValue(this.feedbackValue.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.UpdateAuthEventFeedbackResult {
	  return com.amazonaws.services.cognitoidp.model.UpdateAuthEventFeedbackResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.UpdateAuthEventFeedbackResult {
		return environment.cognito_idp.updateAuthEventFeedback(build())
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


fun AWSCognitoIdentityProviderFunctions.updateDeviceStatus(accessToken: String, deviceKey: String, init: AWSCognitoIdentityProviderUpdateDeviceStatusCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.UpdateDeviceStatusResult {
	return this.block.declare(AWSCognitoIdentityProviderUpdateDeviceStatusCommand(accessToken, deviceKey).apply(init)) as com.amazonaws.services.cognitoidp.model.UpdateDeviceStatusResult
}

@Generated
class AWSCognitoIdentityProviderUpdateDeviceStatusCommand(val accessToken: String, val deviceKey: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.UpdateDeviceStatusRequest, com.amazonaws.services.cognitoidp.model.UpdateDeviceStatusResult> {

	var deviceRememberedStatus: DeviceRememberedStatusType? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.UpdateDeviceStatusRequest {
		val input = com.amazonaws.services.cognitoidp.model.UpdateDeviceStatusRequest()
		input.setAccessToken(this.accessToken)
		input.setDeviceKey(this.deviceKey)
		input.setDeviceRememberedStatus(this.deviceRememberedStatus?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.UpdateDeviceStatusResult {
	  return com.amazonaws.services.cognitoidp.model.UpdateDeviceStatusResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.UpdateDeviceStatusResult {
		return environment.cognito_idp.updateDeviceStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp update-device-status")
				.argument("access-token", accessToken)
				.argument("device-key", deviceKey)
				.argument("device-remembered-status", deviceRememberedStatus?.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.updateGroup(groupName: String, userPoolId: String, init: AWSCognitoIdentityProviderUpdateGroupCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.UpdateGroupResult {
	return this.block.declare(AWSCognitoIdentityProviderUpdateGroupCommand(groupName, userPoolId).apply(init)) as com.amazonaws.services.cognitoidp.model.UpdateGroupResult
}

@Generated
class AWSCognitoIdentityProviderUpdateGroupCommand(val groupName: String, val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.UpdateGroupRequest, com.amazonaws.services.cognitoidp.model.UpdateGroupResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.UpdateGroupResult {
	  return com.amazonaws.services.cognitoidp.model.UpdateGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.UpdateGroupResult {
		return environment.cognito_idp.updateGroup(build())
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


fun AWSCognitoIdentityProviderFunctions.updateIdentityProvider(userPoolId: String, providerName: String, init: AWSCognitoIdentityProviderUpdateIdentityProviderCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.UpdateIdentityProviderResult {
	return this.block.declare(AWSCognitoIdentityProviderUpdateIdentityProviderCommand(userPoolId, providerName).apply(init)) as com.amazonaws.services.cognitoidp.model.UpdateIdentityProviderResult
}

@Generated
class AWSCognitoIdentityProviderUpdateIdentityProviderCommand(val userPoolId: String, val providerName: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.UpdateIdentityProviderRequest, com.amazonaws.services.cognitoidp.model.UpdateIdentityProviderResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.UpdateIdentityProviderResult {
	  return com.amazonaws.services.cognitoidp.model.UpdateIdentityProviderResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.UpdateIdentityProviderResult {
		return environment.cognito_idp.updateIdentityProvider(build())
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


fun AWSCognitoIdentityProviderFunctions.updateResourceServer(userPoolId: String, identifier: String, name: String, init: AWSCognitoIdentityProviderUpdateResourceServerCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.UpdateResourceServerResult {
	return this.block.declare(AWSCognitoIdentityProviderUpdateResourceServerCommand(userPoolId, identifier, name).apply(init)) as com.amazonaws.services.cognitoidp.model.UpdateResourceServerResult
}

@Generated
class AWSCognitoIdentityProviderUpdateResourceServerCommand(val userPoolId: String, val identifier: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.UpdateResourceServerRequest, com.amazonaws.services.cognitoidp.model.UpdateResourceServerResult> {

	var scopes: List<com.amazonaws.services.cognitoidp.model.ResourceServerScopeType>? = null

	override fun build(): com.amazonaws.services.cognitoidp.model.UpdateResourceServerRequest {
		val input = com.amazonaws.services.cognitoidp.model.UpdateResourceServerRequest()
		input.setUserPoolId(this.userPoolId)
		input.setIdentifier(this.identifier)
		input.setName(this.name)
		input.setScopes(this.scopes)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.UpdateResourceServerResult {
	  return com.amazonaws.services.cognitoidp.model.UpdateResourceServerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.UpdateResourceServerResult {
		return environment.cognito_idp.updateResourceServer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp update-resource-server")
				.argument("user-pool-id", userPoolId)
				.argument("identifier", identifier)
				.argument("name", name)
				.argument("scopes", scopes?.toString())
	}

}


fun AWSCognitoIdentityProviderFunctions.updateUserAttributes(userAttributes: List<com.amazonaws.services.cognitoidp.model.AttributeType>, accessToken: String, init: AWSCognitoIdentityProviderUpdateUserAttributesCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.UpdateUserAttributesResult {
	return this.block.declare(AWSCognitoIdentityProviderUpdateUserAttributesCommand(userAttributes, accessToken).apply(init)) as com.amazonaws.services.cognitoidp.model.UpdateUserAttributesResult
}

@Generated
class AWSCognitoIdentityProviderUpdateUserAttributesCommand(val userAttributes: List<com.amazonaws.services.cognitoidp.model.AttributeType>, val accessToken: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.UpdateUserAttributesRequest, com.amazonaws.services.cognitoidp.model.UpdateUserAttributesResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.UpdateUserAttributesRequest {
		val input = com.amazonaws.services.cognitoidp.model.UpdateUserAttributesRequest()
		input.setUserAttributes(this.userAttributes)
		input.setAccessToken(this.accessToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.UpdateUserAttributesResult {
	  return com.amazonaws.services.cognitoidp.model.UpdateUserAttributesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.UpdateUserAttributesResult {
		return environment.cognito_idp.updateUserAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp update-user-attributes")
				.argument("user-attributes", userAttributes.toString())
				.argument("access-token", accessToken)
	}

}


fun AWSCognitoIdentityProviderFunctions.updateUserPool(userPoolId: String, init: AWSCognitoIdentityProviderUpdateUserPoolCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.UpdateUserPoolResult {
	return this.block.declare(AWSCognitoIdentityProviderUpdateUserPoolCommand(userPoolId).apply(init)) as com.amazonaws.services.cognitoidp.model.UpdateUserPoolResult
}

@Generated
class AWSCognitoIdentityProviderUpdateUserPoolCommand(val userPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.UpdateUserPoolRequest, com.amazonaws.services.cognitoidp.model.UpdateUserPoolResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.UpdateUserPoolResult {
	  return com.amazonaws.services.cognitoidp.model.UpdateUserPoolResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.UpdateUserPoolResult {
		return environment.cognito_idp.updateUserPool(build())
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


fun AWSCognitoIdentityProviderFunctions.updateUserPoolClient(userPoolId: String, clientId: String, init: AWSCognitoIdentityProviderUpdateUserPoolClientCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.UpdateUserPoolClientResult {
	return this.block.declare(AWSCognitoIdentityProviderUpdateUserPoolClientCommand(userPoolId, clientId).apply(init)) as com.amazonaws.services.cognitoidp.model.UpdateUserPoolClientResult
}

@Generated
class AWSCognitoIdentityProviderUpdateUserPoolClientCommand(val userPoolId: String, val clientId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.UpdateUserPoolClientRequest, com.amazonaws.services.cognitoidp.model.UpdateUserPoolClientResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.UpdateUserPoolClientResult {
	  return com.amazonaws.services.cognitoidp.model.UpdateUserPoolClientResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.UpdateUserPoolClientResult {
		return environment.cognito_idp.updateUserPoolClient(build())
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


fun AWSCognitoIdentityProviderFunctions.verifySoftwareToken(userCode: String, init: AWSCognitoIdentityProviderVerifySoftwareTokenCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.VerifySoftwareTokenResult {
	return this.block.declare(AWSCognitoIdentityProviderVerifySoftwareTokenCommand(userCode).apply(init)) as com.amazonaws.services.cognitoidp.model.VerifySoftwareTokenResult
}

@Generated
class AWSCognitoIdentityProviderVerifySoftwareTokenCommand(val userCode: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.VerifySoftwareTokenRequest, com.amazonaws.services.cognitoidp.model.VerifySoftwareTokenResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.VerifySoftwareTokenResult {
	  return com.amazonaws.services.cognitoidp.model.VerifySoftwareTokenResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.VerifySoftwareTokenResult {
		return environment.cognito_idp.verifySoftwareToken(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp verify-software-token")
				.argument("access-token", accessToken)
				.argument("session", session)
				.argument("user-code", userCode)
				.argument("friendly-device-name", friendlyDeviceName)
	}

}


fun AWSCognitoIdentityProviderFunctions.verifyUserAttribute(accessToken: String, attributeName: String, code: String, init: AWSCognitoIdentityProviderVerifyUserAttributeCommand.() -> Unit): com.amazonaws.services.cognitoidp.model.VerifyUserAttributeResult {
	return this.block.declare(AWSCognitoIdentityProviderVerifyUserAttributeCommand(accessToken, attributeName, code).apply(init)) as com.amazonaws.services.cognitoidp.model.VerifyUserAttributeResult
}

@Generated
class AWSCognitoIdentityProviderVerifyUserAttributeCommand(val accessToken: String, val attributeName: String, val code: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidp.model.VerifyUserAttributeRequest, com.amazonaws.services.cognitoidp.model.VerifyUserAttributeResult> {



	override fun build(): com.amazonaws.services.cognitoidp.model.VerifyUserAttributeRequest {
		val input = com.amazonaws.services.cognitoidp.model.VerifyUserAttributeRequest()
		input.setAccessToken(this.accessToken)
		input.setAttributeName(this.attributeName)
		input.setCode(this.code)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitoidp.model.VerifyUserAttributeResult {
	  return com.amazonaws.services.cognitoidp.model.VerifyUserAttributeResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitoidp.model.VerifyUserAttributeResult {
		return environment.cognito_idp.verifyUserAttribute(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-idp verify-user-attribute")
				.argument("access-token", accessToken)
				.argument("attribute-name", attributeName)
				.argument("code", code)
	}

}
