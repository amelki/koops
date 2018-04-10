
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.identitymanagement.AmazonIdentityManagement
import com.amazonaws.services.identitymanagement.model.*

var codingue.koops.core.Environment.iam: AmazonIdentityManagement
	get() = this.capabilities[AmazonIdentityManagement::class.java.name] as AmazonIdentityManagement
	set(iam) {
		this.capabilities[AmazonIdentityManagement::class.java.name] = iam
	}

@Generated
class AmazonIdentityManagementFunctions(val block: Block)

infix fun AwsContinuation.iam(init: AmazonIdentityManagementFunctions.() -> Unit) {
	AmazonIdentityManagementFunctions(shell).apply(init)
}

			

fun AmazonIdentityManagementFunctions.addClientIDToOpenIDConnectProvider(openIDConnectProviderArn: String, clientID: String, init: AmazonIdentityManagementAddClientIDToOpenIDConnectProviderCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementAddClientIDToOpenIDConnectProviderCommand(openIDConnectProviderArn, clientID).apply(init))
}

@Generated
class AmazonIdentityManagementAddClientIDToOpenIDConnectProviderCommand(val openIDConnectProviderArn: String, val clientID: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.AddClientIDToOpenIDConnectProviderRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.AddClientIDToOpenIDConnectProviderRequest {
		val input = com.amazonaws.services.identitymanagement.model.AddClientIDToOpenIDConnectProviderRequest()
		input.setOpenIDConnectProviderArn(this.openIDConnectProviderArn)
		input.setClientID(this.clientID)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.addClientIDToOpenIDConnectProvider(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam add-client-idto-open-idconnect-provider")
				.argument("open-idconnect-provider-arn", openIDConnectProviderArn)
				.argument("client-id", clientID)
	}

}


fun AmazonIdentityManagementFunctions.addRoleToInstanceProfile(instanceProfileName: String, roleName: String, init: AmazonIdentityManagementAddRoleToInstanceProfileCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementAddRoleToInstanceProfileCommand(instanceProfileName, roleName).apply(init))
}

@Generated
class AmazonIdentityManagementAddRoleToInstanceProfileCommand(val instanceProfileName: String, val roleName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.AddRoleToInstanceProfileRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.AddRoleToInstanceProfileRequest {
		val input = com.amazonaws.services.identitymanagement.model.AddRoleToInstanceProfileRequest()
		input.setInstanceProfileName(this.instanceProfileName)
		input.setRoleName(this.roleName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.addRoleToInstanceProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam add-role-to-instance-profile")
				.argument("instance-profile-name", instanceProfileName)
				.argument("role-name", roleName)
	}

}


fun AmazonIdentityManagementFunctions.addUserToGroup(groupName: String, userName: String, init: AmazonIdentityManagementAddUserToGroupCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementAddUserToGroupCommand(groupName, userName).apply(init))
}

@Generated
class AmazonIdentityManagementAddUserToGroupCommand(val groupName: String, val userName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.AddUserToGroupRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.AddUserToGroupRequest {
		val input = com.amazonaws.services.identitymanagement.model.AddUserToGroupRequest()
		input.setGroupName(this.groupName)
		input.setUserName(this.userName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.addUserToGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam add-user-to-group")
				.argument("group-name", groupName)
				.argument("user-name", userName)
	}

}


fun AmazonIdentityManagementFunctions.attachGroupPolicy(groupName: String, policyArn: String, init: AmazonIdentityManagementAttachGroupPolicyCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementAttachGroupPolicyCommand(groupName, policyArn).apply(init))
}

@Generated
class AmazonIdentityManagementAttachGroupPolicyCommand(val groupName: String, val policyArn: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.AttachGroupPolicyRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.AttachGroupPolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.AttachGroupPolicyRequest()
		input.setGroupName(this.groupName)
		input.setPolicyArn(this.policyArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.attachGroupPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam attach-group-policy")
				.argument("group-name", groupName)
				.argument("policy-arn", policyArn)
	}

}


fun AmazonIdentityManagementFunctions.attachRolePolicy(roleName: String, policyArn: String, init: AmazonIdentityManagementAttachRolePolicyCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementAttachRolePolicyCommand(roleName, policyArn).apply(init))
}

@Generated
class AmazonIdentityManagementAttachRolePolicyCommand(val roleName: String, val policyArn: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.AttachRolePolicyRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.AttachRolePolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.AttachRolePolicyRequest()
		input.setRoleName(this.roleName)
		input.setPolicyArn(this.policyArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.attachRolePolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam attach-role-policy")
				.argument("role-name", roleName)
				.argument("policy-arn", policyArn)
	}

}


fun AmazonIdentityManagementFunctions.attachUserPolicy(userName: String, policyArn: String, init: AmazonIdentityManagementAttachUserPolicyCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementAttachUserPolicyCommand(userName, policyArn).apply(init))
}

@Generated
class AmazonIdentityManagementAttachUserPolicyCommand(val userName: String, val policyArn: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.AttachUserPolicyRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.AttachUserPolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.AttachUserPolicyRequest()
		input.setUserName(this.userName)
		input.setPolicyArn(this.policyArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.attachUserPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam attach-user-policy")
				.argument("user-name", userName)
				.argument("policy-arn", policyArn)
	}

}


fun AmazonIdentityManagementFunctions.changePassword(oldPassword: String, newPassword: String, init: AmazonIdentityManagementChangePasswordCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementChangePasswordCommand(oldPassword, newPassword).apply(init))
}

@Generated
class AmazonIdentityManagementChangePasswordCommand(val oldPassword: String, val newPassword: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ChangePasswordRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.ChangePasswordRequest {
		val input = com.amazonaws.services.identitymanagement.model.ChangePasswordRequest()
		input.setOldPassword(this.oldPassword)
		input.setNewPassword(this.newPassword)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.changePassword(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam change-password")
				.argument("old-password", oldPassword)
				.argument("new-password", newPassword)
	}

}


fun AmazonIdentityManagementFunctions.createAccessKey(init: AmazonIdentityManagementCreateAccessKeyCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementCreateAccessKeyCommand().apply(init))
}

@Generated
class AmazonIdentityManagementCreateAccessKeyCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.CreateAccessKeyRequest> {

	var userName: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.CreateAccessKeyRequest {
		val input = com.amazonaws.services.identitymanagement.model.CreateAccessKeyRequest()
		input.setUserName(this.userName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.createAccessKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam create-access-key")
				.argument("user-name", userName)
	}

}


fun AmazonIdentityManagementFunctions.createAccountAlias(accountAlias: String, init: AmazonIdentityManagementCreateAccountAliasCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementCreateAccountAliasCommand(accountAlias).apply(init))
}

@Generated
class AmazonIdentityManagementCreateAccountAliasCommand(val accountAlias: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.CreateAccountAliasRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.CreateAccountAliasRequest {
		val input = com.amazonaws.services.identitymanagement.model.CreateAccountAliasRequest()
		input.setAccountAlias(this.accountAlias)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.createAccountAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam create-account-alias")
				.argument("account-alias", accountAlias)
	}

}


fun AmazonIdentityManagementFunctions.createGroup(groupName: String, init: AmazonIdentityManagementCreateGroupCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementCreateGroupCommand(groupName).apply(init))
}

@Generated
class AmazonIdentityManagementCreateGroupCommand(val groupName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.CreateGroupRequest> {

	var path: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.CreateGroupRequest {
		val input = com.amazonaws.services.identitymanagement.model.CreateGroupRequest()
		input.setPath(this.path)
		input.setGroupName(this.groupName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.createGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam create-group")
				.argument("path", path)
				.argument("group-name", groupName)
	}

}


fun AmazonIdentityManagementFunctions.createInstanceProfile(instanceProfileName: String, init: AmazonIdentityManagementCreateInstanceProfileCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementCreateInstanceProfileCommand(instanceProfileName).apply(init))
}

@Generated
class AmazonIdentityManagementCreateInstanceProfileCommand(val instanceProfileName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.CreateInstanceProfileRequest> {

	var path: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.CreateInstanceProfileRequest {
		val input = com.amazonaws.services.identitymanagement.model.CreateInstanceProfileRequest()
		input.setInstanceProfileName(this.instanceProfileName)
		input.setPath(this.path)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.createInstanceProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam create-instance-profile")
				.argument("instance-profile-name", instanceProfileName)
				.argument("path", path)
	}

}


fun AmazonIdentityManagementFunctions.createLoginProfile(userName: String, password: String, init: AmazonIdentityManagementCreateLoginProfileCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementCreateLoginProfileCommand(userName, password).apply(init))
}

@Generated
class AmazonIdentityManagementCreateLoginProfileCommand(val userName: String, val password: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.CreateLoginProfileRequest> {

	var passwordResetRequired: Boolean? = false

	override fun build(): com.amazonaws.services.identitymanagement.model.CreateLoginProfileRequest {
		val input = com.amazonaws.services.identitymanagement.model.CreateLoginProfileRequest()
		input.setUserName(this.userName)
		input.setPassword(this.password)
		input.setPasswordResetRequired(this.passwordResetRequired)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.createLoginProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam create-login-profile")
				.argument("user-name", userName)
				.argument("password", password)
				.option("password-reset-required", passwordResetRequired ?: false)
	}

}


fun AmazonIdentityManagementFunctions.createOpenIDConnectProvider(url: String, thumbprintList: List<String>, init: AmazonIdentityManagementCreateOpenIDConnectProviderCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementCreateOpenIDConnectProviderCommand(url, thumbprintList).apply(init))
}

@Generated
class AmazonIdentityManagementCreateOpenIDConnectProviderCommand(val url: String, val thumbprintList: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.CreateOpenIDConnectProviderRequest> {

	var clientIDList: List<String>? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.CreateOpenIDConnectProviderRequest {
		val input = com.amazonaws.services.identitymanagement.model.CreateOpenIDConnectProviderRequest()
		input.setUrl(this.url)
		input.setClientIDList(this.clientIDList)
		input.setThumbprintList(this.thumbprintList)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.createOpenIDConnectProvider(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam create-open-idconnect-provider")
				.argument("url", url)
				.argument("client-idlist", clientIDList?.toString())
				.argument("thumbprint-list", thumbprintList.toString())
	}

}


fun AmazonIdentityManagementFunctions.createPolicy(policyName: String, policyDocument: String, init: AmazonIdentityManagementCreatePolicyCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementCreatePolicyCommand(policyName, policyDocument).apply(init))
}

@Generated
class AmazonIdentityManagementCreatePolicyCommand(val policyName: String, val policyDocument: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.CreatePolicyRequest> {

	var path: String? = null
	var description: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.CreatePolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.CreatePolicyRequest()
		input.setPolicyName(this.policyName)
		input.setPath(this.path)
		input.setPolicyDocument(this.policyDocument)
		input.setDescription(this.description)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.createPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam create-policy")
				.argument("policy-name", policyName)
				.argument("path", path)
				.argument("policy-document", policyDocument)
				.argument("description", description)
	}

}


fun AmazonIdentityManagementFunctions.createPolicyVersion(policyArn: String, policyDocument: String, init: AmazonIdentityManagementCreatePolicyVersionCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementCreatePolicyVersionCommand(policyArn, policyDocument).apply(init))
}

@Generated
class AmazonIdentityManagementCreatePolicyVersionCommand(val policyArn: String, val policyDocument: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.CreatePolicyVersionRequest> {

	var setAsDefault: Boolean? = false

	override fun build(): com.amazonaws.services.identitymanagement.model.CreatePolicyVersionRequest {
		val input = com.amazonaws.services.identitymanagement.model.CreatePolicyVersionRequest()
		input.setPolicyArn(this.policyArn)
		input.setPolicyDocument(this.policyDocument)
		input.setSetAsDefault(this.setAsDefault)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.createPolicyVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam create-policy-version")
				.argument("policy-arn", policyArn)
				.argument("policy-document", policyDocument)
				.option("set-as-default", setAsDefault ?: false)
	}

}


fun AmazonIdentityManagementFunctions.createRole(roleName: String, assumeRolePolicyDocument: String, init: AmazonIdentityManagementCreateRoleCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementCreateRoleCommand(roleName, assumeRolePolicyDocument).apply(init))
}

@Generated
class AmazonIdentityManagementCreateRoleCommand(val roleName: String, val assumeRolePolicyDocument: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.CreateRoleRequest> {

	var path: String? = null
	var description: String? = null
	var maxSessionDuration: Int? = 0

	override fun build(): com.amazonaws.services.identitymanagement.model.CreateRoleRequest {
		val input = com.amazonaws.services.identitymanagement.model.CreateRoleRequest()
		input.setPath(this.path)
		input.setRoleName(this.roleName)
		input.setAssumeRolePolicyDocument(this.assumeRolePolicyDocument)
		input.setDescription(this.description)
		input.setMaxSessionDuration(this.maxSessionDuration)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.createRole(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam create-role")
				.argument("path", path)
				.argument("role-name", roleName)
				.argument("assume-role-policy-document", assumeRolePolicyDocument)
				.argument("description", description)
				.argument("max-session-duration", maxSessionDuration?.toString())
	}

}


fun AmazonIdentityManagementFunctions.createSAMLProvider(sAMLMetadataDocument: String, name: String, init: AmazonIdentityManagementCreateSAMLProviderCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementCreateSAMLProviderCommand(sAMLMetadataDocument, name).apply(init))
}

@Generated
class AmazonIdentityManagementCreateSAMLProviderCommand(val sAMLMetadataDocument: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.CreateSAMLProviderRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.CreateSAMLProviderRequest {
		val input = com.amazonaws.services.identitymanagement.model.CreateSAMLProviderRequest()
		input.setSAMLMetadataDocument(this.sAMLMetadataDocument)
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.createSAMLProvider(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam create-samlprovider")
				.argument("samlmetadata-document", sAMLMetadataDocument)
				.argument("name", name)
	}

}


fun AmazonIdentityManagementFunctions.createServiceLinkedRole(aWSServiceName: String, init: AmazonIdentityManagementCreateServiceLinkedRoleCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementCreateServiceLinkedRoleCommand(aWSServiceName).apply(init))
}

@Generated
class AmazonIdentityManagementCreateServiceLinkedRoleCommand(val aWSServiceName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.CreateServiceLinkedRoleRequest> {

	var description: String? = null
	var customSuffix: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.CreateServiceLinkedRoleRequest {
		val input = com.amazonaws.services.identitymanagement.model.CreateServiceLinkedRoleRequest()
		input.setAWSServiceName(this.aWSServiceName)
		input.setDescription(this.description)
		input.setCustomSuffix(this.customSuffix)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.createServiceLinkedRole(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam create-service-linked-role")
				.argument("awsservice-name", aWSServiceName)
				.argument("description", description)
				.argument("custom-suffix", customSuffix)
	}

}


fun AmazonIdentityManagementFunctions.createServiceSpecificCredential(userName: String, serviceName: String, init: AmazonIdentityManagementCreateServiceSpecificCredentialCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementCreateServiceSpecificCredentialCommand(userName, serviceName).apply(init))
}

@Generated
class AmazonIdentityManagementCreateServiceSpecificCredentialCommand(val userName: String, val serviceName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.CreateServiceSpecificCredentialRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.CreateServiceSpecificCredentialRequest {
		val input = com.amazonaws.services.identitymanagement.model.CreateServiceSpecificCredentialRequest()
		input.setUserName(this.userName)
		input.setServiceName(this.serviceName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.createServiceSpecificCredential(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam create-service-specific-credential")
				.argument("user-name", userName)
				.argument("service-name", serviceName)
	}

}


fun AmazonIdentityManagementFunctions.createUser(userName: String, init: AmazonIdentityManagementCreateUserCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementCreateUserCommand(userName).apply(init))
}

@Generated
class AmazonIdentityManagementCreateUserCommand(val userName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.CreateUserRequest> {

	var path: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.CreateUserRequest {
		val input = com.amazonaws.services.identitymanagement.model.CreateUserRequest()
		input.setPath(this.path)
		input.setUserName(this.userName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.createUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam create-user")
				.argument("path", path)
				.argument("user-name", userName)
	}

}


fun AmazonIdentityManagementFunctions.createVirtualMFADevice(virtualMFADeviceName: String, init: AmazonIdentityManagementCreateVirtualMFADeviceCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementCreateVirtualMFADeviceCommand(virtualMFADeviceName).apply(init))
}

@Generated
class AmazonIdentityManagementCreateVirtualMFADeviceCommand(val virtualMFADeviceName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.CreateVirtualMFADeviceRequest> {

	var path: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.CreateVirtualMFADeviceRequest {
		val input = com.amazonaws.services.identitymanagement.model.CreateVirtualMFADeviceRequest()
		input.setPath(this.path)
		input.setVirtualMFADeviceName(this.virtualMFADeviceName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.createVirtualMFADevice(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam create-virtual-mfadevice")
				.argument("path", path)
				.argument("virtual-mfadevice-name", virtualMFADeviceName)
	}

}


fun AmazonIdentityManagementFunctions.deactivateMFADevice(userName: String, serialNumber: String, init: AmazonIdentityManagementDeactivateMFADeviceCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementDeactivateMFADeviceCommand(userName, serialNumber).apply(init))
}

@Generated
class AmazonIdentityManagementDeactivateMFADeviceCommand(val userName: String, val serialNumber: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeactivateMFADeviceRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DeactivateMFADeviceRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeactivateMFADeviceRequest()
		input.setUserName(this.userName)
		input.setSerialNumber(this.serialNumber)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.deactivateMFADevice(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam deactivate-mfadevice")
				.argument("user-name", userName)
				.argument("serial-number", serialNumber)
	}

}


fun AmazonIdentityManagementFunctions.deleteAccessKey(accessKeyId: String, init: AmazonIdentityManagementDeleteAccessKeyCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementDeleteAccessKeyCommand(accessKeyId).apply(init))
}

@Generated
class AmazonIdentityManagementDeleteAccessKeyCommand(val accessKeyId: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeleteAccessKeyRequest> {

	var userName: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.DeleteAccessKeyRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeleteAccessKeyRequest()
		input.setUserName(this.userName)
		input.setAccessKeyId(this.accessKeyId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.deleteAccessKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-access-key")
				.argument("user-name", userName)
				.argument("access-key-id", accessKeyId)
	}

}


fun AmazonIdentityManagementFunctions.deleteAccountAlias(accountAlias: String, init: AmazonIdentityManagementDeleteAccountAliasCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementDeleteAccountAliasCommand(accountAlias).apply(init))
}

@Generated
class AmazonIdentityManagementDeleteAccountAliasCommand(val accountAlias: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeleteAccountAliasRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DeleteAccountAliasRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeleteAccountAliasRequest()
		input.setAccountAlias(this.accountAlias)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.deleteAccountAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-account-alias")
				.argument("account-alias", accountAlias)
	}

}


fun AmazonIdentityManagementFunctions.deleteAccountPasswordPolicy(init: AmazonIdentityManagementDeleteAccountPasswordPolicyCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementDeleteAccountPasswordPolicyCommand().apply(init))
}

@Generated
class AmazonIdentityManagementDeleteAccountPasswordPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeleteAccountPasswordPolicyRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DeleteAccountPasswordPolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeleteAccountPasswordPolicyRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.deleteAccountPasswordPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-account-password-policy")

	}

}


fun AmazonIdentityManagementFunctions.deleteGroup(groupName: String, init: AmazonIdentityManagementDeleteGroupCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementDeleteGroupCommand(groupName).apply(init))
}

@Generated
class AmazonIdentityManagementDeleteGroupCommand(val groupName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeleteGroupRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DeleteGroupRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeleteGroupRequest()
		input.setGroupName(this.groupName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.deleteGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-group")
				.argument("group-name", groupName)
	}

}


fun AmazonIdentityManagementFunctions.deleteGroupPolicy(groupName: String, policyName: String, init: AmazonIdentityManagementDeleteGroupPolicyCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementDeleteGroupPolicyCommand(groupName, policyName).apply(init))
}

@Generated
class AmazonIdentityManagementDeleteGroupPolicyCommand(val groupName: String, val policyName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeleteGroupPolicyRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DeleteGroupPolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeleteGroupPolicyRequest()
		input.setGroupName(this.groupName)
		input.setPolicyName(this.policyName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.deleteGroupPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-group-policy")
				.argument("group-name", groupName)
				.argument("policy-name", policyName)
	}

}


fun AmazonIdentityManagementFunctions.deleteInstanceProfile(instanceProfileName: String, init: AmazonIdentityManagementDeleteInstanceProfileCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementDeleteInstanceProfileCommand(instanceProfileName).apply(init))
}

@Generated
class AmazonIdentityManagementDeleteInstanceProfileCommand(val instanceProfileName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeleteInstanceProfileRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DeleteInstanceProfileRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeleteInstanceProfileRequest()
		input.setInstanceProfileName(this.instanceProfileName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.deleteInstanceProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-instance-profile")
				.argument("instance-profile-name", instanceProfileName)
	}

}


fun AmazonIdentityManagementFunctions.deleteLoginProfile(userName: String, init: AmazonIdentityManagementDeleteLoginProfileCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementDeleteLoginProfileCommand(userName).apply(init))
}

@Generated
class AmazonIdentityManagementDeleteLoginProfileCommand(val userName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeleteLoginProfileRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DeleteLoginProfileRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeleteLoginProfileRequest()
		input.setUserName(this.userName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.deleteLoginProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-login-profile")
				.argument("user-name", userName)
	}

}


fun AmazonIdentityManagementFunctions.deleteOpenIDConnectProvider(openIDConnectProviderArn: String, init: AmazonIdentityManagementDeleteOpenIDConnectProviderCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementDeleteOpenIDConnectProviderCommand(openIDConnectProviderArn).apply(init))
}

@Generated
class AmazonIdentityManagementDeleteOpenIDConnectProviderCommand(val openIDConnectProviderArn: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeleteOpenIDConnectProviderRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DeleteOpenIDConnectProviderRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeleteOpenIDConnectProviderRequest()
		input.setOpenIDConnectProviderArn(this.openIDConnectProviderArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.deleteOpenIDConnectProvider(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-open-idconnect-provider")
				.argument("open-idconnect-provider-arn", openIDConnectProviderArn)
	}

}


fun AmazonIdentityManagementFunctions.deletePolicy(policyArn: String, init: AmazonIdentityManagementDeletePolicyCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementDeletePolicyCommand(policyArn).apply(init))
}

@Generated
class AmazonIdentityManagementDeletePolicyCommand(val policyArn: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeletePolicyRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DeletePolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeletePolicyRequest()
		input.setPolicyArn(this.policyArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.deletePolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-policy")
				.argument("policy-arn", policyArn)
	}

}


fun AmazonIdentityManagementFunctions.deletePolicyVersion(policyArn: String, versionId: String, init: AmazonIdentityManagementDeletePolicyVersionCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementDeletePolicyVersionCommand(policyArn, versionId).apply(init))
}

@Generated
class AmazonIdentityManagementDeletePolicyVersionCommand(val policyArn: String, val versionId: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeletePolicyVersionRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DeletePolicyVersionRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeletePolicyVersionRequest()
		input.setPolicyArn(this.policyArn)
		input.setVersionId(this.versionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.deletePolicyVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-policy-version")
				.argument("policy-arn", policyArn)
				.argument("version-id", versionId)
	}

}


fun AmazonIdentityManagementFunctions.deleteRole(roleName: String, init: AmazonIdentityManagementDeleteRoleCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementDeleteRoleCommand(roleName).apply(init))
}

@Generated
class AmazonIdentityManagementDeleteRoleCommand(val roleName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeleteRoleRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DeleteRoleRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeleteRoleRequest()
		input.setRoleName(this.roleName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.deleteRole(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-role")
				.argument("role-name", roleName)
	}

}


fun AmazonIdentityManagementFunctions.deleteRolePolicy(roleName: String, policyName: String, init: AmazonIdentityManagementDeleteRolePolicyCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementDeleteRolePolicyCommand(roleName, policyName).apply(init))
}

@Generated
class AmazonIdentityManagementDeleteRolePolicyCommand(val roleName: String, val policyName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeleteRolePolicyRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DeleteRolePolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeleteRolePolicyRequest()
		input.setRoleName(this.roleName)
		input.setPolicyName(this.policyName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.deleteRolePolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-role-policy")
				.argument("role-name", roleName)
				.argument("policy-name", policyName)
	}

}


fun AmazonIdentityManagementFunctions.deleteSAMLProvider(sAMLProviderArn: String, init: AmazonIdentityManagementDeleteSAMLProviderCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementDeleteSAMLProviderCommand(sAMLProviderArn).apply(init))
}

@Generated
class AmazonIdentityManagementDeleteSAMLProviderCommand(val sAMLProviderArn: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeleteSAMLProviderRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DeleteSAMLProviderRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeleteSAMLProviderRequest()
		input.setSAMLProviderArn(this.sAMLProviderArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.deleteSAMLProvider(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-samlprovider")
				.argument("samlprovider-arn", sAMLProviderArn)
	}

}


fun AmazonIdentityManagementFunctions.deleteSSHPublicKey(userName: String, sSHPublicKeyId: String, init: AmazonIdentityManagementDeleteSSHPublicKeyCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementDeleteSSHPublicKeyCommand(userName, sSHPublicKeyId).apply(init))
}

@Generated
class AmazonIdentityManagementDeleteSSHPublicKeyCommand(val userName: String, val sSHPublicKeyId: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeleteSSHPublicKeyRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DeleteSSHPublicKeyRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeleteSSHPublicKeyRequest()
		input.setUserName(this.userName)
		input.setSSHPublicKeyId(this.sSHPublicKeyId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.deleteSSHPublicKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-sshpublic-key")
				.argument("user-name", userName)
				.argument("sshpublic-key-id", sSHPublicKeyId)
	}

}


fun AmazonIdentityManagementFunctions.deleteServerCertificate(serverCertificateName: String, init: AmazonIdentityManagementDeleteServerCertificateCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementDeleteServerCertificateCommand(serverCertificateName).apply(init))
}

@Generated
class AmazonIdentityManagementDeleteServerCertificateCommand(val serverCertificateName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeleteServerCertificateRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DeleteServerCertificateRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeleteServerCertificateRequest()
		input.setServerCertificateName(this.serverCertificateName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.deleteServerCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-server-certificate")
				.argument("server-certificate-name", serverCertificateName)
	}

}


fun AmazonIdentityManagementFunctions.deleteServiceLinkedRole(roleName: String, init: AmazonIdentityManagementDeleteServiceLinkedRoleCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementDeleteServiceLinkedRoleCommand(roleName).apply(init))
}

@Generated
class AmazonIdentityManagementDeleteServiceLinkedRoleCommand(val roleName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeleteServiceLinkedRoleRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DeleteServiceLinkedRoleRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeleteServiceLinkedRoleRequest()
		input.setRoleName(this.roleName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.deleteServiceLinkedRole(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-service-linked-role")
				.argument("role-name", roleName)
	}

}


fun AmazonIdentityManagementFunctions.deleteServiceSpecificCredential(serviceSpecificCredentialId: String, init: AmazonIdentityManagementDeleteServiceSpecificCredentialCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementDeleteServiceSpecificCredentialCommand(serviceSpecificCredentialId).apply(init))
}

@Generated
class AmazonIdentityManagementDeleteServiceSpecificCredentialCommand(val serviceSpecificCredentialId: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeleteServiceSpecificCredentialRequest> {

	var userName: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.DeleteServiceSpecificCredentialRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeleteServiceSpecificCredentialRequest()
		input.setUserName(this.userName)
		input.setServiceSpecificCredentialId(this.serviceSpecificCredentialId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.deleteServiceSpecificCredential(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-service-specific-credential")
				.argument("user-name", userName)
				.argument("service-specific-credential-id", serviceSpecificCredentialId)
	}

}


fun AmazonIdentityManagementFunctions.deleteSigningCertificate(certificateId: String, init: AmazonIdentityManagementDeleteSigningCertificateCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementDeleteSigningCertificateCommand(certificateId).apply(init))
}

@Generated
class AmazonIdentityManagementDeleteSigningCertificateCommand(val certificateId: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeleteSigningCertificateRequest> {

	var userName: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.DeleteSigningCertificateRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeleteSigningCertificateRequest()
		input.setUserName(this.userName)
		input.setCertificateId(this.certificateId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.deleteSigningCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-signing-certificate")
				.argument("user-name", userName)
				.argument("certificate-id", certificateId)
	}

}


fun AmazonIdentityManagementFunctions.deleteUser(userName: String, init: AmazonIdentityManagementDeleteUserCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementDeleteUserCommand(userName).apply(init))
}

@Generated
class AmazonIdentityManagementDeleteUserCommand(val userName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeleteUserRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DeleteUserRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeleteUserRequest()
		input.setUserName(this.userName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.deleteUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-user")
				.argument("user-name", userName)
	}

}


fun AmazonIdentityManagementFunctions.deleteUserPolicy(userName: String, policyName: String, init: AmazonIdentityManagementDeleteUserPolicyCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementDeleteUserPolicyCommand(userName, policyName).apply(init))
}

@Generated
class AmazonIdentityManagementDeleteUserPolicyCommand(val userName: String, val policyName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeleteUserPolicyRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DeleteUserPolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeleteUserPolicyRequest()
		input.setUserName(this.userName)
		input.setPolicyName(this.policyName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.deleteUserPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-user-policy")
				.argument("user-name", userName)
				.argument("policy-name", policyName)
	}

}


fun AmazonIdentityManagementFunctions.deleteVirtualMFADevice(serialNumber: String, init: AmazonIdentityManagementDeleteVirtualMFADeviceCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementDeleteVirtualMFADeviceCommand(serialNumber).apply(init))
}

@Generated
class AmazonIdentityManagementDeleteVirtualMFADeviceCommand(val serialNumber: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeleteVirtualMFADeviceRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DeleteVirtualMFADeviceRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeleteVirtualMFADeviceRequest()
		input.setSerialNumber(this.serialNumber)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.deleteVirtualMFADevice(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-virtual-mfadevice")
				.argument("serial-number", serialNumber)
	}

}


fun AmazonIdentityManagementFunctions.detachGroupPolicy(groupName: String, policyArn: String, init: AmazonIdentityManagementDetachGroupPolicyCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementDetachGroupPolicyCommand(groupName, policyArn).apply(init))
}

@Generated
class AmazonIdentityManagementDetachGroupPolicyCommand(val groupName: String, val policyArn: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DetachGroupPolicyRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DetachGroupPolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.DetachGroupPolicyRequest()
		input.setGroupName(this.groupName)
		input.setPolicyArn(this.policyArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.detachGroupPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam detach-group-policy")
				.argument("group-name", groupName)
				.argument("policy-arn", policyArn)
	}

}


fun AmazonIdentityManagementFunctions.detachRolePolicy(roleName: String, policyArn: String, init: AmazonIdentityManagementDetachRolePolicyCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementDetachRolePolicyCommand(roleName, policyArn).apply(init))
}

@Generated
class AmazonIdentityManagementDetachRolePolicyCommand(val roleName: String, val policyArn: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DetachRolePolicyRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DetachRolePolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.DetachRolePolicyRequest()
		input.setRoleName(this.roleName)
		input.setPolicyArn(this.policyArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.detachRolePolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam detach-role-policy")
				.argument("role-name", roleName)
				.argument("policy-arn", policyArn)
	}

}


fun AmazonIdentityManagementFunctions.detachUserPolicy(userName: String, policyArn: String, init: AmazonIdentityManagementDetachUserPolicyCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementDetachUserPolicyCommand(userName, policyArn).apply(init))
}

@Generated
class AmazonIdentityManagementDetachUserPolicyCommand(val userName: String, val policyArn: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DetachUserPolicyRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DetachUserPolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.DetachUserPolicyRequest()
		input.setUserName(this.userName)
		input.setPolicyArn(this.policyArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.detachUserPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam detach-user-policy")
				.argument("user-name", userName)
				.argument("policy-arn", policyArn)
	}

}


fun AmazonIdentityManagementFunctions.enableMFADevice(userName: String, serialNumber: String, authenticationCode1: String, authenticationCode2: String, init: AmazonIdentityManagementEnableMFADeviceCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementEnableMFADeviceCommand(userName, serialNumber, authenticationCode1, authenticationCode2).apply(init))
}

@Generated
class AmazonIdentityManagementEnableMFADeviceCommand(val userName: String, val serialNumber: String, val authenticationCode1: String, val authenticationCode2: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.EnableMFADeviceRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.EnableMFADeviceRequest {
		val input = com.amazonaws.services.identitymanagement.model.EnableMFADeviceRequest()
		input.setUserName(this.userName)
		input.setSerialNumber(this.serialNumber)
		input.setAuthenticationCode1(this.authenticationCode1)
		input.setAuthenticationCode2(this.authenticationCode2)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.enableMFADevice(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam enable-mfadevice")
				.argument("user-name", userName)
				.argument("serial-number", serialNumber)
				.argument("authentication-code1", authenticationCode1)
				.argument("authentication-code2", authenticationCode2)
	}

}


fun AmazonIdentityManagementFunctions.generateCredentialReport(init: AmazonIdentityManagementGenerateCredentialReportCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementGenerateCredentialReportCommand().apply(init))
}

@Generated
class AmazonIdentityManagementGenerateCredentialReportCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GenerateCredentialReportRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.GenerateCredentialReportRequest {
		val input = com.amazonaws.services.identitymanagement.model.GenerateCredentialReportRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.generateCredentialReport(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam generate-credential-report")

	}

}


fun AmazonIdentityManagementFunctions.getAccessKeyLastUsed(accessKeyId: String, init: AmazonIdentityManagementGetAccessKeyLastUsedCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementGetAccessKeyLastUsedCommand(accessKeyId).apply(init))
}

@Generated
class AmazonIdentityManagementGetAccessKeyLastUsedCommand(val accessKeyId: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetAccessKeyLastUsedRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.GetAccessKeyLastUsedRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetAccessKeyLastUsedRequest()
		input.setAccessKeyId(this.accessKeyId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.getAccessKeyLastUsed(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-access-key-last-used")
				.argument("access-key-id", accessKeyId)
	}

}


fun AmazonIdentityManagementFunctions.getAccountAuthorizationDetails(init: AmazonIdentityManagementGetAccountAuthorizationDetailsCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementGetAccountAuthorizationDetailsCommand().apply(init))
}

@Generated
class AmazonIdentityManagementGetAccountAuthorizationDetailsCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetAccountAuthorizationDetailsRequest> {

	var filter: List<EntityType>? = null
	var maxItems: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.GetAccountAuthorizationDetailsRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetAccountAuthorizationDetailsRequest()
		input.setFilter(this.filter?.map { it.toString() })
		input.setMaxItems(this.maxItems)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.getAccountAuthorizationDetails(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-account-authorization-details")
				.argument("filter", filter?.toString())
				.argument("max-items", maxItems?.toString())
				.argument("marker", marker)
	}

}


fun AmazonIdentityManagementFunctions.getAccountPasswordPolicy(init: AmazonIdentityManagementGetAccountPasswordPolicyCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementGetAccountPasswordPolicyCommand().apply(init))
}

@Generated
class AmazonIdentityManagementGetAccountPasswordPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetAccountPasswordPolicyRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.GetAccountPasswordPolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetAccountPasswordPolicyRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.getAccountPasswordPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-account-password-policy")

	}

}


fun AmazonIdentityManagementFunctions.getAccountSummary(init: AmazonIdentityManagementGetAccountSummaryCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementGetAccountSummaryCommand().apply(init))
}

@Generated
class AmazonIdentityManagementGetAccountSummaryCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetAccountSummaryRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.GetAccountSummaryRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetAccountSummaryRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.getAccountSummary(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-account-summary")

	}

}


fun AmazonIdentityManagementFunctions.getContextKeysForCustomPolicy(policyInputList: List<String>, init: AmazonIdentityManagementGetContextKeysForCustomPolicyCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementGetContextKeysForCustomPolicyCommand(policyInputList).apply(init))
}

@Generated
class AmazonIdentityManagementGetContextKeysForCustomPolicyCommand(val policyInputList: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetContextKeysForCustomPolicyRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.GetContextKeysForCustomPolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetContextKeysForCustomPolicyRequest()
		input.setPolicyInputList(this.policyInputList)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.getContextKeysForCustomPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-context-keys-for-custom-policy")
				.argument("policy-input-list", policyInputList.toString())
	}

}


fun AmazonIdentityManagementFunctions.getContextKeysForPrincipalPolicy(policySourceArn: String, init: AmazonIdentityManagementGetContextKeysForPrincipalPolicyCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementGetContextKeysForPrincipalPolicyCommand(policySourceArn).apply(init))
}

@Generated
class AmazonIdentityManagementGetContextKeysForPrincipalPolicyCommand(val policySourceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetContextKeysForPrincipalPolicyRequest> {

	var policyInputList: List<String>? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.GetContextKeysForPrincipalPolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetContextKeysForPrincipalPolicyRequest()
		input.setPolicySourceArn(this.policySourceArn)
		input.setPolicyInputList(this.policyInputList)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.getContextKeysForPrincipalPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-context-keys-for-principal-policy")
				.argument("policy-source-arn", policySourceArn)
				.argument("policy-input-list", policyInputList?.toString())
	}

}


fun AmazonIdentityManagementFunctions.getCredentialReport(init: AmazonIdentityManagementGetCredentialReportCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementGetCredentialReportCommand().apply(init))
}

@Generated
class AmazonIdentityManagementGetCredentialReportCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetCredentialReportRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.GetCredentialReportRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetCredentialReportRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.getCredentialReport(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-credential-report")

	}

}


fun AmazonIdentityManagementFunctions.getGroup(groupName: String, init: AmazonIdentityManagementGetGroupCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementGetGroupCommand(groupName).apply(init))
}

@Generated
class AmazonIdentityManagementGetGroupCommand(val groupName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetGroupRequest> {

	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.identitymanagement.model.GetGroupRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetGroupRequest()
		input.setGroupName(this.groupName)
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.getGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-group")
				.argument("group-name", groupName)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.getGroupPolicy(groupName: String, policyName: String, init: AmazonIdentityManagementGetGroupPolicyCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementGetGroupPolicyCommand(groupName, policyName).apply(init))
}

@Generated
class AmazonIdentityManagementGetGroupPolicyCommand(val groupName: String, val policyName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetGroupPolicyRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.GetGroupPolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetGroupPolicyRequest()
		input.setGroupName(this.groupName)
		input.setPolicyName(this.policyName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.getGroupPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-group-policy")
				.argument("group-name", groupName)
				.argument("policy-name", policyName)
	}

}


fun AmazonIdentityManagementFunctions.getInstanceProfile(instanceProfileName: String, init: AmazonIdentityManagementGetInstanceProfileCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementGetInstanceProfileCommand(instanceProfileName).apply(init))
}

@Generated
class AmazonIdentityManagementGetInstanceProfileCommand(val instanceProfileName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetInstanceProfileRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.GetInstanceProfileRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetInstanceProfileRequest()
		input.setInstanceProfileName(this.instanceProfileName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.getInstanceProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-instance-profile")
				.argument("instance-profile-name", instanceProfileName)
	}

}


fun AmazonIdentityManagementFunctions.getLoginProfile(userName: String, init: AmazonIdentityManagementGetLoginProfileCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementGetLoginProfileCommand(userName).apply(init))
}

@Generated
class AmazonIdentityManagementGetLoginProfileCommand(val userName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetLoginProfileRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.GetLoginProfileRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetLoginProfileRequest()
		input.setUserName(this.userName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.getLoginProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-login-profile")
				.argument("user-name", userName)
	}

}


fun AmazonIdentityManagementFunctions.getOpenIDConnectProvider(openIDConnectProviderArn: String, init: AmazonIdentityManagementGetOpenIDConnectProviderCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementGetOpenIDConnectProviderCommand(openIDConnectProviderArn).apply(init))
}

@Generated
class AmazonIdentityManagementGetOpenIDConnectProviderCommand(val openIDConnectProviderArn: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetOpenIDConnectProviderRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.GetOpenIDConnectProviderRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetOpenIDConnectProviderRequest()
		input.setOpenIDConnectProviderArn(this.openIDConnectProviderArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.getOpenIDConnectProvider(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-open-idconnect-provider")
				.argument("open-idconnect-provider-arn", openIDConnectProviderArn)
	}

}


fun AmazonIdentityManagementFunctions.getPolicy(policyArn: String, init: AmazonIdentityManagementGetPolicyCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementGetPolicyCommand(policyArn).apply(init))
}

@Generated
class AmazonIdentityManagementGetPolicyCommand(val policyArn: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetPolicyRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.GetPolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetPolicyRequest()
		input.setPolicyArn(this.policyArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.getPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-policy")
				.argument("policy-arn", policyArn)
	}

}


fun AmazonIdentityManagementFunctions.getPolicyVersion(policyArn: String, versionId: String, init: AmazonIdentityManagementGetPolicyVersionCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementGetPolicyVersionCommand(policyArn, versionId).apply(init))
}

@Generated
class AmazonIdentityManagementGetPolicyVersionCommand(val policyArn: String, val versionId: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetPolicyVersionRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.GetPolicyVersionRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetPolicyVersionRequest()
		input.setPolicyArn(this.policyArn)
		input.setVersionId(this.versionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.getPolicyVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-policy-version")
				.argument("policy-arn", policyArn)
				.argument("version-id", versionId)
	}

}


fun AmazonIdentityManagementFunctions.getRole(roleName: String, init: AmazonIdentityManagementGetRoleCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementGetRoleCommand(roleName).apply(init))
}

@Generated
class AmazonIdentityManagementGetRoleCommand(val roleName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetRoleRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.GetRoleRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetRoleRequest()
		input.setRoleName(this.roleName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.getRole(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-role")
				.argument("role-name", roleName)
	}

}


fun AmazonIdentityManagementFunctions.getRolePolicy(roleName: String, policyName: String, init: AmazonIdentityManagementGetRolePolicyCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementGetRolePolicyCommand(roleName, policyName).apply(init))
}

@Generated
class AmazonIdentityManagementGetRolePolicyCommand(val roleName: String, val policyName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetRolePolicyRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.GetRolePolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetRolePolicyRequest()
		input.setRoleName(this.roleName)
		input.setPolicyName(this.policyName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.getRolePolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-role-policy")
				.argument("role-name", roleName)
				.argument("policy-name", policyName)
	}

}


fun AmazonIdentityManagementFunctions.getSAMLProvider(sAMLProviderArn: String, init: AmazonIdentityManagementGetSAMLProviderCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementGetSAMLProviderCommand(sAMLProviderArn).apply(init))
}

@Generated
class AmazonIdentityManagementGetSAMLProviderCommand(val sAMLProviderArn: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetSAMLProviderRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.GetSAMLProviderRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetSAMLProviderRequest()
		input.setSAMLProviderArn(this.sAMLProviderArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.getSAMLProvider(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-samlprovider")
				.argument("samlprovider-arn", sAMLProviderArn)
	}

}


fun AmazonIdentityManagementFunctions.getSSHPublicKey(userName: String, sSHPublicKeyId: String, encoding: String, init: AmazonIdentityManagementGetSSHPublicKeyCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementGetSSHPublicKeyCommand(userName, sSHPublicKeyId, encoding).apply(init))
}

@Generated
class AmazonIdentityManagementGetSSHPublicKeyCommand(val userName: String, val sSHPublicKeyId: String, val encoding: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetSSHPublicKeyRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.GetSSHPublicKeyRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetSSHPublicKeyRequest()
		input.setUserName(this.userName)
		input.setSSHPublicKeyId(this.sSHPublicKeyId)
		input.setEncoding(this.encoding)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.getSSHPublicKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-sshpublic-key")
				.argument("user-name", userName)
				.argument("sshpublic-key-id", sSHPublicKeyId)
				.argument("encoding", encoding)
	}

}


fun AmazonIdentityManagementFunctions.getServerCertificate(serverCertificateName: String, init: AmazonIdentityManagementGetServerCertificateCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementGetServerCertificateCommand(serverCertificateName).apply(init))
}

@Generated
class AmazonIdentityManagementGetServerCertificateCommand(val serverCertificateName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetServerCertificateRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.GetServerCertificateRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetServerCertificateRequest()
		input.setServerCertificateName(this.serverCertificateName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.getServerCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-server-certificate")
				.argument("server-certificate-name", serverCertificateName)
	}

}


fun AmazonIdentityManagementFunctions.getServiceLinkedRoleDeletionStatus(deletionTaskId: String, init: AmazonIdentityManagementGetServiceLinkedRoleDeletionStatusCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementGetServiceLinkedRoleDeletionStatusCommand(deletionTaskId).apply(init))
}

@Generated
class AmazonIdentityManagementGetServiceLinkedRoleDeletionStatusCommand(val deletionTaskId: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetServiceLinkedRoleDeletionStatusRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.GetServiceLinkedRoleDeletionStatusRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetServiceLinkedRoleDeletionStatusRequest()
		input.setDeletionTaskId(this.deletionTaskId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.getServiceLinkedRoleDeletionStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-service-linked-role-deletion-status")
				.argument("deletion-task-id", deletionTaskId)
	}

}


fun AmazonIdentityManagementFunctions.getUser(init: AmazonIdentityManagementGetUserCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementGetUserCommand().apply(init))
}

@Generated
class AmazonIdentityManagementGetUserCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetUserRequest> {

	var userName: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.GetUserRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetUserRequest()
		input.setUserName(this.userName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.getUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-user")
				.argument("user-name", userName)
	}

}


fun AmazonIdentityManagementFunctions.getUserPolicy(userName: String, policyName: String, init: AmazonIdentityManagementGetUserPolicyCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementGetUserPolicyCommand(userName, policyName).apply(init))
}

@Generated
class AmazonIdentityManagementGetUserPolicyCommand(val userName: String, val policyName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetUserPolicyRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.GetUserPolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetUserPolicyRequest()
		input.setUserName(this.userName)
		input.setPolicyName(this.policyName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.getUserPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-user-policy")
				.argument("user-name", userName)
				.argument("policy-name", policyName)
	}

}


fun AmazonIdentityManagementFunctions.listAccessKeys(init: AmazonIdentityManagementListAccessKeysCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementListAccessKeysCommand().apply(init))
}

@Generated
class AmazonIdentityManagementListAccessKeysCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListAccessKeysRequest> {

	var userName: String? = null
	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.identitymanagement.model.ListAccessKeysRequest {
		val input = com.amazonaws.services.identitymanagement.model.ListAccessKeysRequest()
		input.setUserName(this.userName)
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.listAccessKeys(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-access-keys")
				.argument("user-name", userName)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listAccountAliases(init: AmazonIdentityManagementListAccountAliasesCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementListAccountAliasesCommand().apply(init))
}

@Generated
class AmazonIdentityManagementListAccountAliasesCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListAccountAliasesRequest> {

	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.identitymanagement.model.ListAccountAliasesRequest {
		val input = com.amazonaws.services.identitymanagement.model.ListAccountAliasesRequest()
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.listAccountAliases(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-account-aliases")
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listAttachedGroupPolicies(groupName: String, init: AmazonIdentityManagementListAttachedGroupPoliciesCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementListAttachedGroupPoliciesCommand(groupName).apply(init))
}

@Generated
class AmazonIdentityManagementListAttachedGroupPoliciesCommand(val groupName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListAttachedGroupPoliciesRequest> {

	var pathPrefix: String? = null
	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.identitymanagement.model.ListAttachedGroupPoliciesRequest {
		val input = com.amazonaws.services.identitymanagement.model.ListAttachedGroupPoliciesRequest()
		input.setGroupName(this.groupName)
		input.setPathPrefix(this.pathPrefix)
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.listAttachedGroupPolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-attached-group-policies")
				.argument("group-name", groupName)
				.argument("path-prefix", pathPrefix)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listAttachedRolePolicies(roleName: String, init: AmazonIdentityManagementListAttachedRolePoliciesCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementListAttachedRolePoliciesCommand(roleName).apply(init))
}

@Generated
class AmazonIdentityManagementListAttachedRolePoliciesCommand(val roleName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListAttachedRolePoliciesRequest> {

	var pathPrefix: String? = null
	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.identitymanagement.model.ListAttachedRolePoliciesRequest {
		val input = com.amazonaws.services.identitymanagement.model.ListAttachedRolePoliciesRequest()
		input.setRoleName(this.roleName)
		input.setPathPrefix(this.pathPrefix)
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.listAttachedRolePolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-attached-role-policies")
				.argument("role-name", roleName)
				.argument("path-prefix", pathPrefix)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listAttachedUserPolicies(userName: String, init: AmazonIdentityManagementListAttachedUserPoliciesCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementListAttachedUserPoliciesCommand(userName).apply(init))
}

@Generated
class AmazonIdentityManagementListAttachedUserPoliciesCommand(val userName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListAttachedUserPoliciesRequest> {

	var pathPrefix: String? = null
	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.identitymanagement.model.ListAttachedUserPoliciesRequest {
		val input = com.amazonaws.services.identitymanagement.model.ListAttachedUserPoliciesRequest()
		input.setUserName(this.userName)
		input.setPathPrefix(this.pathPrefix)
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.listAttachedUserPolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-attached-user-policies")
				.argument("user-name", userName)
				.argument("path-prefix", pathPrefix)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listEntitiesForPolicy(policyArn: String, init: AmazonIdentityManagementListEntitiesForPolicyCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementListEntitiesForPolicyCommand(policyArn).apply(init))
}

@Generated
class AmazonIdentityManagementListEntitiesForPolicyCommand(val policyArn: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListEntitiesForPolicyRequest> {

	var entityFilter: EntityType? = null
	var pathPrefix: String? = null
	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.identitymanagement.model.ListEntitiesForPolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.ListEntitiesForPolicyRequest()
		input.setPolicyArn(this.policyArn)
		input.setEntityFilter(this.entityFilter?.toString())
		input.setPathPrefix(this.pathPrefix)
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.listEntitiesForPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-entities-for-policy")
				.argument("policy-arn", policyArn)
				.argument("entity-filter", entityFilter?.toString())
				.argument("path-prefix", pathPrefix)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listGroupPolicies(groupName: String, init: AmazonIdentityManagementListGroupPoliciesCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementListGroupPoliciesCommand(groupName).apply(init))
}

@Generated
class AmazonIdentityManagementListGroupPoliciesCommand(val groupName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListGroupPoliciesRequest> {

	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.identitymanagement.model.ListGroupPoliciesRequest {
		val input = com.amazonaws.services.identitymanagement.model.ListGroupPoliciesRequest()
		input.setGroupName(this.groupName)
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.listGroupPolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-group-policies")
				.argument("group-name", groupName)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listGroups(init: AmazonIdentityManagementListGroupsCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementListGroupsCommand().apply(init))
}

@Generated
class AmazonIdentityManagementListGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListGroupsRequest> {

	var pathPrefix: String? = null
	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.identitymanagement.model.ListGroupsRequest {
		val input = com.amazonaws.services.identitymanagement.model.ListGroupsRequest()
		input.setPathPrefix(this.pathPrefix)
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.listGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-groups")
				.argument("path-prefix", pathPrefix)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listGroupsForUser(userName: String, init: AmazonIdentityManagementListGroupsForUserCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementListGroupsForUserCommand(userName).apply(init))
}

@Generated
class AmazonIdentityManagementListGroupsForUserCommand(val userName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListGroupsForUserRequest> {

	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.identitymanagement.model.ListGroupsForUserRequest {
		val input = com.amazonaws.services.identitymanagement.model.ListGroupsForUserRequest()
		input.setUserName(this.userName)
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.listGroupsForUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-groups-for-user")
				.argument("user-name", userName)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listInstanceProfiles(init: AmazonIdentityManagementListInstanceProfilesCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementListInstanceProfilesCommand().apply(init))
}

@Generated
class AmazonIdentityManagementListInstanceProfilesCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListInstanceProfilesRequest> {

	var pathPrefix: String? = null
	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.identitymanagement.model.ListInstanceProfilesRequest {
		val input = com.amazonaws.services.identitymanagement.model.ListInstanceProfilesRequest()
		input.setPathPrefix(this.pathPrefix)
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.listInstanceProfiles(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-instance-profiles")
				.argument("path-prefix", pathPrefix)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listInstanceProfilesForRole(roleName: String, init: AmazonIdentityManagementListInstanceProfilesForRoleCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementListInstanceProfilesForRoleCommand(roleName).apply(init))
}

@Generated
class AmazonIdentityManagementListInstanceProfilesForRoleCommand(val roleName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListInstanceProfilesForRoleRequest> {

	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.identitymanagement.model.ListInstanceProfilesForRoleRequest {
		val input = com.amazonaws.services.identitymanagement.model.ListInstanceProfilesForRoleRequest()
		input.setRoleName(this.roleName)
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.listInstanceProfilesForRole(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-instance-profiles-for-role")
				.argument("role-name", roleName)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listMFADevices(init: AmazonIdentityManagementListMFADevicesCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementListMFADevicesCommand().apply(init))
}

@Generated
class AmazonIdentityManagementListMFADevicesCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListMFADevicesRequest> {

	var userName: String? = null
	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.identitymanagement.model.ListMFADevicesRequest {
		val input = com.amazonaws.services.identitymanagement.model.ListMFADevicesRequest()
		input.setUserName(this.userName)
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.listMFADevices(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-mfadevices")
				.argument("user-name", userName)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listOpenIDConnectProviders(init: AmazonIdentityManagementListOpenIDConnectProvidersCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementListOpenIDConnectProvidersCommand().apply(init))
}

@Generated
class AmazonIdentityManagementListOpenIDConnectProvidersCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListOpenIDConnectProvidersRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.ListOpenIDConnectProvidersRequest {
		val input = com.amazonaws.services.identitymanagement.model.ListOpenIDConnectProvidersRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.listOpenIDConnectProviders(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-open-idconnect-providers")

	}

}


fun AmazonIdentityManagementFunctions.listPolicies(init: AmazonIdentityManagementListPoliciesCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementListPoliciesCommand().apply(init))
}

@Generated
class AmazonIdentityManagementListPoliciesCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListPoliciesRequest> {

	var scope: String? = null
	var onlyAttached: Boolean? = false
	var pathPrefix: String? = null
	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.identitymanagement.model.ListPoliciesRequest {
		val input = com.amazonaws.services.identitymanagement.model.ListPoliciesRequest()
		input.setScope(this.scope)
		input.setOnlyAttached(this.onlyAttached)
		input.setPathPrefix(this.pathPrefix)
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.listPolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-policies")
				.argument("scope", scope)
				.option("only-attached", onlyAttached ?: false)
				.argument("path-prefix", pathPrefix)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listPolicyVersions(policyArn: String, init: AmazonIdentityManagementListPolicyVersionsCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementListPolicyVersionsCommand(policyArn).apply(init))
}

@Generated
class AmazonIdentityManagementListPolicyVersionsCommand(val policyArn: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListPolicyVersionsRequest> {

	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.identitymanagement.model.ListPolicyVersionsRequest {
		val input = com.amazonaws.services.identitymanagement.model.ListPolicyVersionsRequest()
		input.setPolicyArn(this.policyArn)
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.listPolicyVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-policy-versions")
				.argument("policy-arn", policyArn)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listRolePolicies(roleName: String, init: AmazonIdentityManagementListRolePoliciesCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementListRolePoliciesCommand(roleName).apply(init))
}

@Generated
class AmazonIdentityManagementListRolePoliciesCommand(val roleName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListRolePoliciesRequest> {

	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.identitymanagement.model.ListRolePoliciesRequest {
		val input = com.amazonaws.services.identitymanagement.model.ListRolePoliciesRequest()
		input.setRoleName(this.roleName)
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.listRolePolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-role-policies")
				.argument("role-name", roleName)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listRoles(init: AmazonIdentityManagementListRolesCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementListRolesCommand().apply(init))
}

@Generated
class AmazonIdentityManagementListRolesCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListRolesRequest> {

	var pathPrefix: String? = null
	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.identitymanagement.model.ListRolesRequest {
		val input = com.amazonaws.services.identitymanagement.model.ListRolesRequest()
		input.setPathPrefix(this.pathPrefix)
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.listRoles(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-roles")
				.argument("path-prefix", pathPrefix)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listSAMLProviders(init: AmazonIdentityManagementListSAMLProvidersCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementListSAMLProvidersCommand().apply(init))
}

@Generated
class AmazonIdentityManagementListSAMLProvidersCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListSAMLProvidersRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.ListSAMLProvidersRequest {
		val input = com.amazonaws.services.identitymanagement.model.ListSAMLProvidersRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.listSAMLProviders(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-samlproviders")

	}

}


fun AmazonIdentityManagementFunctions.listSSHPublicKeys(init: AmazonIdentityManagementListSSHPublicKeysCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementListSSHPublicKeysCommand().apply(init))
}

@Generated
class AmazonIdentityManagementListSSHPublicKeysCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListSSHPublicKeysRequest> {

	var userName: String? = null
	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.identitymanagement.model.ListSSHPublicKeysRequest {
		val input = com.amazonaws.services.identitymanagement.model.ListSSHPublicKeysRequest()
		input.setUserName(this.userName)
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.listSSHPublicKeys(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-sshpublic-keys")
				.argument("user-name", userName)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listServerCertificates(init: AmazonIdentityManagementListServerCertificatesCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementListServerCertificatesCommand().apply(init))
}

@Generated
class AmazonIdentityManagementListServerCertificatesCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListServerCertificatesRequest> {

	var pathPrefix: String? = null
	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.identitymanagement.model.ListServerCertificatesRequest {
		val input = com.amazonaws.services.identitymanagement.model.ListServerCertificatesRequest()
		input.setPathPrefix(this.pathPrefix)
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.listServerCertificates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-server-certificates")
				.argument("path-prefix", pathPrefix)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listServiceSpecificCredentials(init: AmazonIdentityManagementListServiceSpecificCredentialsCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementListServiceSpecificCredentialsCommand().apply(init))
}

@Generated
class AmazonIdentityManagementListServiceSpecificCredentialsCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListServiceSpecificCredentialsRequest> {

	var userName: String? = null
	var serviceName: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.ListServiceSpecificCredentialsRequest {
		val input = com.amazonaws.services.identitymanagement.model.ListServiceSpecificCredentialsRequest()
		input.setUserName(this.userName)
		input.setServiceName(this.serviceName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.listServiceSpecificCredentials(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-service-specific-credentials")
				.argument("user-name", userName)
				.argument("service-name", serviceName)
	}

}


fun AmazonIdentityManagementFunctions.listSigningCertificates(init: AmazonIdentityManagementListSigningCertificatesCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementListSigningCertificatesCommand().apply(init))
}

@Generated
class AmazonIdentityManagementListSigningCertificatesCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListSigningCertificatesRequest> {

	var userName: String? = null
	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.identitymanagement.model.ListSigningCertificatesRequest {
		val input = com.amazonaws.services.identitymanagement.model.ListSigningCertificatesRequest()
		input.setUserName(this.userName)
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.listSigningCertificates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-signing-certificates")
				.argument("user-name", userName)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listUserPolicies(userName: String, init: AmazonIdentityManagementListUserPoliciesCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementListUserPoliciesCommand(userName).apply(init))
}

@Generated
class AmazonIdentityManagementListUserPoliciesCommand(val userName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListUserPoliciesRequest> {

	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.identitymanagement.model.ListUserPoliciesRequest {
		val input = com.amazonaws.services.identitymanagement.model.ListUserPoliciesRequest()
		input.setUserName(this.userName)
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.listUserPolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-user-policies")
				.argument("user-name", userName)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listUsers(init: AmazonIdentityManagementListUsersCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementListUsersCommand().apply(init))
}

@Generated
class AmazonIdentityManagementListUsersCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListUsersRequest> {

	var pathPrefix: String? = null
	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.identitymanagement.model.ListUsersRequest {
		val input = com.amazonaws.services.identitymanagement.model.ListUsersRequest()
		input.setPathPrefix(this.pathPrefix)
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.listUsers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-users")
				.argument("path-prefix", pathPrefix)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listVirtualMFADevices(init: AmazonIdentityManagementListVirtualMFADevicesCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementListVirtualMFADevicesCommand().apply(init))
}

@Generated
class AmazonIdentityManagementListVirtualMFADevicesCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListVirtualMFADevicesRequest> {

	var assignmentStatus: String? = null
	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.identitymanagement.model.ListVirtualMFADevicesRequest {
		val input = com.amazonaws.services.identitymanagement.model.ListVirtualMFADevicesRequest()
		input.setAssignmentStatus(this.assignmentStatus)
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.listVirtualMFADevices(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-virtual-mfadevices")
				.argument("assignment-status", assignmentStatus)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.putGroupPolicy(groupName: String, policyName: String, policyDocument: String, init: AmazonIdentityManagementPutGroupPolicyCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementPutGroupPolicyCommand(groupName, policyName, policyDocument).apply(init))
}

@Generated
class AmazonIdentityManagementPutGroupPolicyCommand(val groupName: String, val policyName: String, val policyDocument: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.PutGroupPolicyRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.PutGroupPolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.PutGroupPolicyRequest()
		input.setGroupName(this.groupName)
		input.setPolicyName(this.policyName)
		input.setPolicyDocument(this.policyDocument)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.putGroupPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam put-group-policy")
				.argument("group-name", groupName)
				.argument("policy-name", policyName)
				.argument("policy-document", policyDocument)
	}

}


fun AmazonIdentityManagementFunctions.putRolePolicy(roleName: String, policyName: String, policyDocument: String, init: AmazonIdentityManagementPutRolePolicyCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementPutRolePolicyCommand(roleName, policyName, policyDocument).apply(init))
}

@Generated
class AmazonIdentityManagementPutRolePolicyCommand(val roleName: String, val policyName: String, val policyDocument: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.PutRolePolicyRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.PutRolePolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.PutRolePolicyRequest()
		input.setRoleName(this.roleName)
		input.setPolicyName(this.policyName)
		input.setPolicyDocument(this.policyDocument)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.putRolePolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam put-role-policy")
				.argument("role-name", roleName)
				.argument("policy-name", policyName)
				.argument("policy-document", policyDocument)
	}

}


fun AmazonIdentityManagementFunctions.putUserPolicy(userName: String, policyName: String, policyDocument: String, init: AmazonIdentityManagementPutUserPolicyCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementPutUserPolicyCommand(userName, policyName, policyDocument).apply(init))
}

@Generated
class AmazonIdentityManagementPutUserPolicyCommand(val userName: String, val policyName: String, val policyDocument: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.PutUserPolicyRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.PutUserPolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.PutUserPolicyRequest()
		input.setUserName(this.userName)
		input.setPolicyName(this.policyName)
		input.setPolicyDocument(this.policyDocument)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.putUserPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam put-user-policy")
				.argument("user-name", userName)
				.argument("policy-name", policyName)
				.argument("policy-document", policyDocument)
	}

}


fun AmazonIdentityManagementFunctions.removeClientIDFromOpenIDConnectProvider(openIDConnectProviderArn: String, clientID: String, init: AmazonIdentityManagementRemoveClientIDFromOpenIDConnectProviderCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementRemoveClientIDFromOpenIDConnectProviderCommand(openIDConnectProviderArn, clientID).apply(init))
}

@Generated
class AmazonIdentityManagementRemoveClientIDFromOpenIDConnectProviderCommand(val openIDConnectProviderArn: String, val clientID: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.RemoveClientIDFromOpenIDConnectProviderRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.RemoveClientIDFromOpenIDConnectProviderRequest {
		val input = com.amazonaws.services.identitymanagement.model.RemoveClientIDFromOpenIDConnectProviderRequest()
		input.setOpenIDConnectProviderArn(this.openIDConnectProviderArn)
		input.setClientID(this.clientID)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.removeClientIDFromOpenIDConnectProvider(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam remove-client-idfrom-open-idconnect-provider")
				.argument("open-idconnect-provider-arn", openIDConnectProviderArn)
				.argument("client-id", clientID)
	}

}


fun AmazonIdentityManagementFunctions.removeRoleFromInstanceProfile(instanceProfileName: String, roleName: String, init: AmazonIdentityManagementRemoveRoleFromInstanceProfileCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementRemoveRoleFromInstanceProfileCommand(instanceProfileName, roleName).apply(init))
}

@Generated
class AmazonIdentityManagementRemoveRoleFromInstanceProfileCommand(val instanceProfileName: String, val roleName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.RemoveRoleFromInstanceProfileRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.RemoveRoleFromInstanceProfileRequest {
		val input = com.amazonaws.services.identitymanagement.model.RemoveRoleFromInstanceProfileRequest()
		input.setInstanceProfileName(this.instanceProfileName)
		input.setRoleName(this.roleName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.removeRoleFromInstanceProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam remove-role-from-instance-profile")
				.argument("instance-profile-name", instanceProfileName)
				.argument("role-name", roleName)
	}

}


fun AmazonIdentityManagementFunctions.removeUserFromGroup(groupName: String, userName: String, init: AmazonIdentityManagementRemoveUserFromGroupCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementRemoveUserFromGroupCommand(groupName, userName).apply(init))
}

@Generated
class AmazonIdentityManagementRemoveUserFromGroupCommand(val groupName: String, val userName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.RemoveUserFromGroupRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.RemoveUserFromGroupRequest {
		val input = com.amazonaws.services.identitymanagement.model.RemoveUserFromGroupRequest()
		input.setGroupName(this.groupName)
		input.setUserName(this.userName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.removeUserFromGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam remove-user-from-group")
				.argument("group-name", groupName)
				.argument("user-name", userName)
	}

}


fun AmazonIdentityManagementFunctions.resetServiceSpecificCredential(serviceSpecificCredentialId: String, init: AmazonIdentityManagementResetServiceSpecificCredentialCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementResetServiceSpecificCredentialCommand(serviceSpecificCredentialId).apply(init))
}

@Generated
class AmazonIdentityManagementResetServiceSpecificCredentialCommand(val serviceSpecificCredentialId: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ResetServiceSpecificCredentialRequest> {

	var userName: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.ResetServiceSpecificCredentialRequest {
		val input = com.amazonaws.services.identitymanagement.model.ResetServiceSpecificCredentialRequest()
		input.setUserName(this.userName)
		input.setServiceSpecificCredentialId(this.serviceSpecificCredentialId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.resetServiceSpecificCredential(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam reset-service-specific-credential")
				.argument("user-name", userName)
				.argument("service-specific-credential-id", serviceSpecificCredentialId)
	}

}


fun AmazonIdentityManagementFunctions.resyncMFADevice(userName: String, serialNumber: String, authenticationCode1: String, authenticationCode2: String, init: AmazonIdentityManagementResyncMFADeviceCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementResyncMFADeviceCommand(userName, serialNumber, authenticationCode1, authenticationCode2).apply(init))
}

@Generated
class AmazonIdentityManagementResyncMFADeviceCommand(val userName: String, val serialNumber: String, val authenticationCode1: String, val authenticationCode2: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ResyncMFADeviceRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.ResyncMFADeviceRequest {
		val input = com.amazonaws.services.identitymanagement.model.ResyncMFADeviceRequest()
		input.setUserName(this.userName)
		input.setSerialNumber(this.serialNumber)
		input.setAuthenticationCode1(this.authenticationCode1)
		input.setAuthenticationCode2(this.authenticationCode2)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.resyncMFADevice(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam resync-mfadevice")
				.argument("user-name", userName)
				.argument("serial-number", serialNumber)
				.argument("authentication-code1", authenticationCode1)
				.argument("authentication-code2", authenticationCode2)
	}

}


fun AmazonIdentityManagementFunctions.setDefaultPolicyVersion(policyArn: String, versionId: String, init: AmazonIdentityManagementSetDefaultPolicyVersionCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementSetDefaultPolicyVersionCommand(policyArn, versionId).apply(init))
}

@Generated
class AmazonIdentityManagementSetDefaultPolicyVersionCommand(val policyArn: String, val versionId: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.SetDefaultPolicyVersionRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.SetDefaultPolicyVersionRequest {
		val input = com.amazonaws.services.identitymanagement.model.SetDefaultPolicyVersionRequest()
		input.setPolicyArn(this.policyArn)
		input.setVersionId(this.versionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.setDefaultPolicyVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam set-default-policy-version")
				.argument("policy-arn", policyArn)
				.argument("version-id", versionId)
	}

}


fun AmazonIdentityManagementFunctions.simulateCustomPolicy(policyInputList: List<String>, actionNames: List<String>, init: AmazonIdentityManagementSimulateCustomPolicyCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementSimulateCustomPolicyCommand(policyInputList, actionNames).apply(init))
}

@Generated
class AmazonIdentityManagementSimulateCustomPolicyCommand(val policyInputList: List<String>, val actionNames: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.SimulateCustomPolicyRequest> {

	var resourceArns: List<String>? = null
	var resourcePolicy: String? = null
	var resourceOwner: String? = null
	var callerArn: String? = null
	var contextEntries: List<com.amazonaws.services.identitymanagement.model.ContextEntry>? = null
	var resourceHandlingOption: String? = null
	var maxItems: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.SimulateCustomPolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.SimulateCustomPolicyRequest()
		input.setPolicyInputList(this.policyInputList)
		input.setActionNames(this.actionNames)
		input.setResourceArns(this.resourceArns)
		input.setResourcePolicy(this.resourcePolicy)
		input.setResourceOwner(this.resourceOwner)
		input.setCallerArn(this.callerArn)
		input.setContextEntries(this.contextEntries)
		input.setResourceHandlingOption(this.resourceHandlingOption)
		input.setMaxItems(this.maxItems)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.simulateCustomPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam simulate-custom-policy")
				.argument("policy-input-list", policyInputList.toString())
				.argument("action-names", actionNames.toString())
				.argument("resource-arns", resourceArns?.toString())
				.argument("resource-policy", resourcePolicy)
				.argument("resource-owner", resourceOwner)
				.argument("caller-arn", callerArn)
				.argument("context-entries", contextEntries?.toString())
				.argument("resource-handling-option", resourceHandlingOption)
				.argument("max-items", maxItems?.toString())
				.argument("marker", marker)
	}

}


fun AmazonIdentityManagementFunctions.simulatePrincipalPolicy(policySourceArn: String, actionNames: List<String>, init: AmazonIdentityManagementSimulatePrincipalPolicyCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementSimulatePrincipalPolicyCommand(policySourceArn, actionNames).apply(init))
}

@Generated
class AmazonIdentityManagementSimulatePrincipalPolicyCommand(val policySourceArn: String, val actionNames: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.SimulatePrincipalPolicyRequest> {

	var policyInputList: List<String>? = null
	var resourceArns: List<String>? = null
	var resourcePolicy: String? = null
	var resourceOwner: String? = null
	var callerArn: String? = null
	var contextEntries: List<com.amazonaws.services.identitymanagement.model.ContextEntry>? = null
	var resourceHandlingOption: String? = null
	var maxItems: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.SimulatePrincipalPolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.SimulatePrincipalPolicyRequest()
		input.setPolicySourceArn(this.policySourceArn)
		input.setPolicyInputList(this.policyInputList)
		input.setActionNames(this.actionNames)
		input.setResourceArns(this.resourceArns)
		input.setResourcePolicy(this.resourcePolicy)
		input.setResourceOwner(this.resourceOwner)
		input.setCallerArn(this.callerArn)
		input.setContextEntries(this.contextEntries)
		input.setResourceHandlingOption(this.resourceHandlingOption)
		input.setMaxItems(this.maxItems)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.simulatePrincipalPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam simulate-principal-policy")
				.argument("policy-source-arn", policySourceArn)
				.argument("policy-input-list", policyInputList?.toString())
				.argument("action-names", actionNames.toString())
				.argument("resource-arns", resourceArns?.toString())
				.argument("resource-policy", resourcePolicy)
				.argument("resource-owner", resourceOwner)
				.argument("caller-arn", callerArn)
				.argument("context-entries", contextEntries?.toString())
				.argument("resource-handling-option", resourceHandlingOption)
				.argument("max-items", maxItems?.toString())
				.argument("marker", marker)
	}

}


fun AmazonIdentityManagementFunctions.updateAccessKey(accessKeyId: String, status: String, init: AmazonIdentityManagementUpdateAccessKeyCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementUpdateAccessKeyCommand(accessKeyId, status).apply(init))
}

@Generated
class AmazonIdentityManagementUpdateAccessKeyCommand(val accessKeyId: String, val status: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.UpdateAccessKeyRequest> {

	var userName: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.UpdateAccessKeyRequest {
		val input = com.amazonaws.services.identitymanagement.model.UpdateAccessKeyRequest()
		input.setUserName(this.userName)
		input.setAccessKeyId(this.accessKeyId)
		input.setStatus(this.status)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.updateAccessKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam update-access-key")
				.argument("user-name", userName)
				.argument("access-key-id", accessKeyId)
				.argument("status", status)
	}

}


fun AmazonIdentityManagementFunctions.updateAccountPasswordPolicy(init: AmazonIdentityManagementUpdateAccountPasswordPolicyCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementUpdateAccountPasswordPolicyCommand().apply(init))
}

@Generated
class AmazonIdentityManagementUpdateAccountPasswordPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.UpdateAccountPasswordPolicyRequest> {

	var minimumPasswordLength: Int? = 0
	var requireSymbols: Boolean? = false
	var requireNumbers: Boolean? = false
	var requireUppercaseCharacters: Boolean? = false
	var requireLowercaseCharacters: Boolean? = false
	var allowUsersToChangePassword: Boolean? = false
	var maxPasswordAge: Int? = 0
	var passwordReusePrevention: Int? = 0
	var hardExpiry: Boolean? = false

	override fun build(): com.amazonaws.services.identitymanagement.model.UpdateAccountPasswordPolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.UpdateAccountPasswordPolicyRequest()
		input.setMinimumPasswordLength(this.minimumPasswordLength)
		input.setRequireSymbols(this.requireSymbols)
		input.setRequireNumbers(this.requireNumbers)
		input.setRequireUppercaseCharacters(this.requireUppercaseCharacters)
		input.setRequireLowercaseCharacters(this.requireLowercaseCharacters)
		input.setAllowUsersToChangePassword(this.allowUsersToChangePassword)
		input.setMaxPasswordAge(this.maxPasswordAge)
		input.setPasswordReusePrevention(this.passwordReusePrevention)
		input.setHardExpiry(this.hardExpiry)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.updateAccountPasswordPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam update-account-password-policy")
				.argument("minimum-password-length", minimumPasswordLength?.toString())
				.option("require-symbols", requireSymbols ?: false)
				.option("require-numbers", requireNumbers ?: false)
				.option("require-uppercase-characters", requireUppercaseCharacters ?: false)
				.option("require-lowercase-characters", requireLowercaseCharacters ?: false)
				.option("allow-users-to-change-password", allowUsersToChangePassword ?: false)
				.argument("max-password-age", maxPasswordAge?.toString())
				.argument("password-reuse-prevention", passwordReusePrevention?.toString())
				.option("hard-expiry", hardExpiry ?: false)
	}

}


fun AmazonIdentityManagementFunctions.updateAssumeRolePolicy(roleName: String, policyDocument: String, init: AmazonIdentityManagementUpdateAssumeRolePolicyCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementUpdateAssumeRolePolicyCommand(roleName, policyDocument).apply(init))
}

@Generated
class AmazonIdentityManagementUpdateAssumeRolePolicyCommand(val roleName: String, val policyDocument: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.UpdateAssumeRolePolicyRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.UpdateAssumeRolePolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.UpdateAssumeRolePolicyRequest()
		input.setRoleName(this.roleName)
		input.setPolicyDocument(this.policyDocument)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.updateAssumeRolePolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam update-assume-role-policy")
				.argument("role-name", roleName)
				.argument("policy-document", policyDocument)
	}

}


fun AmazonIdentityManagementFunctions.updateGroup(groupName: String, init: AmazonIdentityManagementUpdateGroupCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementUpdateGroupCommand(groupName).apply(init))
}

@Generated
class AmazonIdentityManagementUpdateGroupCommand(val groupName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.UpdateGroupRequest> {

	var newPath: String? = null
	var newGroupName: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.UpdateGroupRequest {
		val input = com.amazonaws.services.identitymanagement.model.UpdateGroupRequest()
		input.setGroupName(this.groupName)
		input.setNewPath(this.newPath)
		input.setNewGroupName(this.newGroupName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.updateGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam update-group")
				.argument("group-name", groupName)
				.argument("new-path", newPath)
				.argument("new-group-name", newGroupName)
	}

}


fun AmazonIdentityManagementFunctions.updateLoginProfile(userName: String, init: AmazonIdentityManagementUpdateLoginProfileCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementUpdateLoginProfileCommand(userName).apply(init))
}

@Generated
class AmazonIdentityManagementUpdateLoginProfileCommand(val userName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.UpdateLoginProfileRequest> {

	var password: String? = null
	var passwordResetRequired: Boolean? = false

	override fun build(): com.amazonaws.services.identitymanagement.model.UpdateLoginProfileRequest {
		val input = com.amazonaws.services.identitymanagement.model.UpdateLoginProfileRequest()
		input.setUserName(this.userName)
		input.setPassword(this.password)
		input.setPasswordResetRequired(this.passwordResetRequired)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.updateLoginProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam update-login-profile")
				.argument("user-name", userName)
				.argument("password", password)
				.option("password-reset-required", passwordResetRequired ?: false)
	}

}


fun AmazonIdentityManagementFunctions.updateOpenIDConnectProviderThumbprint(openIDConnectProviderArn: String, thumbprintList: List<String>, init: AmazonIdentityManagementUpdateOpenIDConnectProviderThumbprintCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementUpdateOpenIDConnectProviderThumbprintCommand(openIDConnectProviderArn, thumbprintList).apply(init))
}

@Generated
class AmazonIdentityManagementUpdateOpenIDConnectProviderThumbprintCommand(val openIDConnectProviderArn: String, val thumbprintList: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.UpdateOpenIDConnectProviderThumbprintRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.UpdateOpenIDConnectProviderThumbprintRequest {
		val input = com.amazonaws.services.identitymanagement.model.UpdateOpenIDConnectProviderThumbprintRequest()
		input.setOpenIDConnectProviderArn(this.openIDConnectProviderArn)
		input.setThumbprintList(this.thumbprintList)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.updateOpenIDConnectProviderThumbprint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam update-open-idconnect-provider-thumbprint")
				.argument("open-idconnect-provider-arn", openIDConnectProviderArn)
				.argument("thumbprint-list", thumbprintList.toString())
	}

}


fun AmazonIdentityManagementFunctions.updateRole(roleName: String, init: AmazonIdentityManagementUpdateRoleCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementUpdateRoleCommand(roleName).apply(init))
}

@Generated
class AmazonIdentityManagementUpdateRoleCommand(val roleName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.UpdateRoleRequest> {

	var description: String? = null
	var maxSessionDuration: Int? = 0

	override fun build(): com.amazonaws.services.identitymanagement.model.UpdateRoleRequest {
		val input = com.amazonaws.services.identitymanagement.model.UpdateRoleRequest()
		input.setRoleName(this.roleName)
		input.setDescription(this.description)
		input.setMaxSessionDuration(this.maxSessionDuration)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.updateRole(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam update-role")
				.argument("role-name", roleName)
				.argument("description", description)
				.argument("max-session-duration", maxSessionDuration?.toString())
	}

}


fun AmazonIdentityManagementFunctions.updateRoleDescription(roleName: String, description: String, init: AmazonIdentityManagementUpdateRoleDescriptionCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementUpdateRoleDescriptionCommand(roleName, description).apply(init))
}

@Generated
class AmazonIdentityManagementUpdateRoleDescriptionCommand(val roleName: String, val description: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.UpdateRoleDescriptionRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.UpdateRoleDescriptionRequest {
		val input = com.amazonaws.services.identitymanagement.model.UpdateRoleDescriptionRequest()
		input.setRoleName(this.roleName)
		input.setDescription(this.description)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.updateRoleDescription(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam update-role-description")
				.argument("role-name", roleName)
				.argument("description", description)
	}

}


fun AmazonIdentityManagementFunctions.updateSAMLProvider(sAMLMetadataDocument: String, sAMLProviderArn: String, init: AmazonIdentityManagementUpdateSAMLProviderCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementUpdateSAMLProviderCommand(sAMLMetadataDocument, sAMLProviderArn).apply(init))
}

@Generated
class AmazonIdentityManagementUpdateSAMLProviderCommand(val sAMLMetadataDocument: String, val sAMLProviderArn: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.UpdateSAMLProviderRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.UpdateSAMLProviderRequest {
		val input = com.amazonaws.services.identitymanagement.model.UpdateSAMLProviderRequest()
		input.setSAMLMetadataDocument(this.sAMLMetadataDocument)
		input.setSAMLProviderArn(this.sAMLProviderArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.updateSAMLProvider(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam update-samlprovider")
				.argument("samlmetadata-document", sAMLMetadataDocument)
				.argument("samlprovider-arn", sAMLProviderArn)
	}

}


fun AmazonIdentityManagementFunctions.updateSSHPublicKey(userName: String, sSHPublicKeyId: String, status: String, init: AmazonIdentityManagementUpdateSSHPublicKeyCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementUpdateSSHPublicKeyCommand(userName, sSHPublicKeyId, status).apply(init))
}

@Generated
class AmazonIdentityManagementUpdateSSHPublicKeyCommand(val userName: String, val sSHPublicKeyId: String, val status: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.UpdateSSHPublicKeyRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.UpdateSSHPublicKeyRequest {
		val input = com.amazonaws.services.identitymanagement.model.UpdateSSHPublicKeyRequest()
		input.setUserName(this.userName)
		input.setSSHPublicKeyId(this.sSHPublicKeyId)
		input.setStatus(this.status)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.updateSSHPublicKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam update-sshpublic-key")
				.argument("user-name", userName)
				.argument("sshpublic-key-id", sSHPublicKeyId)
				.argument("status", status)
	}

}


fun AmazonIdentityManagementFunctions.updateServerCertificate(serverCertificateName: String, init: AmazonIdentityManagementUpdateServerCertificateCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementUpdateServerCertificateCommand(serverCertificateName).apply(init))
}

@Generated
class AmazonIdentityManagementUpdateServerCertificateCommand(val serverCertificateName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.UpdateServerCertificateRequest> {

	var newPath: String? = null
	var newServerCertificateName: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.UpdateServerCertificateRequest {
		val input = com.amazonaws.services.identitymanagement.model.UpdateServerCertificateRequest()
		input.setServerCertificateName(this.serverCertificateName)
		input.setNewPath(this.newPath)
		input.setNewServerCertificateName(this.newServerCertificateName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.updateServerCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam update-server-certificate")
				.argument("server-certificate-name", serverCertificateName)
				.argument("new-path", newPath)
				.argument("new-server-certificate-name", newServerCertificateName)
	}

}


fun AmazonIdentityManagementFunctions.updateServiceSpecificCredential(serviceSpecificCredentialId: String, status: String, init: AmazonIdentityManagementUpdateServiceSpecificCredentialCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementUpdateServiceSpecificCredentialCommand(serviceSpecificCredentialId, status).apply(init))
}

@Generated
class AmazonIdentityManagementUpdateServiceSpecificCredentialCommand(val serviceSpecificCredentialId: String, val status: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.UpdateServiceSpecificCredentialRequest> {

	var userName: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.UpdateServiceSpecificCredentialRequest {
		val input = com.amazonaws.services.identitymanagement.model.UpdateServiceSpecificCredentialRequest()
		input.setUserName(this.userName)
		input.setServiceSpecificCredentialId(this.serviceSpecificCredentialId)
		input.setStatus(this.status)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.updateServiceSpecificCredential(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam update-service-specific-credential")
				.argument("user-name", userName)
				.argument("service-specific-credential-id", serviceSpecificCredentialId)
				.argument("status", status)
	}

}


fun AmazonIdentityManagementFunctions.updateSigningCertificate(certificateId: String, status: String, init: AmazonIdentityManagementUpdateSigningCertificateCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementUpdateSigningCertificateCommand(certificateId, status).apply(init))
}

@Generated
class AmazonIdentityManagementUpdateSigningCertificateCommand(val certificateId: String, val status: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.UpdateSigningCertificateRequest> {

	var userName: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.UpdateSigningCertificateRequest {
		val input = com.amazonaws.services.identitymanagement.model.UpdateSigningCertificateRequest()
		input.setUserName(this.userName)
		input.setCertificateId(this.certificateId)
		input.setStatus(this.status)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.updateSigningCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam update-signing-certificate")
				.argument("user-name", userName)
				.argument("certificate-id", certificateId)
				.argument("status", status)
	}

}


fun AmazonIdentityManagementFunctions.updateUser(userName: String, init: AmazonIdentityManagementUpdateUserCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementUpdateUserCommand(userName).apply(init))
}

@Generated
class AmazonIdentityManagementUpdateUserCommand(val userName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.UpdateUserRequest> {

	var newPath: String? = null
	var newUserName: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.UpdateUserRequest {
		val input = com.amazonaws.services.identitymanagement.model.UpdateUserRequest()
		input.setUserName(this.userName)
		input.setNewPath(this.newPath)
		input.setNewUserName(this.newUserName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.updateUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam update-user")
				.argument("user-name", userName)
				.argument("new-path", newPath)
				.argument("new-user-name", newUserName)
	}

}


fun AmazonIdentityManagementFunctions.uploadSSHPublicKey(userName: String, sSHPublicKeyBody: String, init: AmazonIdentityManagementUploadSSHPublicKeyCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementUploadSSHPublicKeyCommand(userName, sSHPublicKeyBody).apply(init))
}

@Generated
class AmazonIdentityManagementUploadSSHPublicKeyCommand(val userName: String, val sSHPublicKeyBody: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.UploadSSHPublicKeyRequest> {



	override fun build(): com.amazonaws.services.identitymanagement.model.UploadSSHPublicKeyRequest {
		val input = com.amazonaws.services.identitymanagement.model.UploadSSHPublicKeyRequest()
		input.setUserName(this.userName)
		input.setSSHPublicKeyBody(this.sSHPublicKeyBody)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.uploadSSHPublicKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam upload-sshpublic-key")
				.argument("user-name", userName)
				.argument("sshpublic-key-body", sSHPublicKeyBody)
	}

}


fun AmazonIdentityManagementFunctions.uploadServerCertificate(serverCertificateName: String, certificateBody: String, privateKey: String, init: AmazonIdentityManagementUploadServerCertificateCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementUploadServerCertificateCommand(serverCertificateName, certificateBody, privateKey).apply(init))
}

@Generated
class AmazonIdentityManagementUploadServerCertificateCommand(val serverCertificateName: String, val certificateBody: String, val privateKey: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.UploadServerCertificateRequest> {

	var path: String? = null
	var certificateChain: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.UploadServerCertificateRequest {
		val input = com.amazonaws.services.identitymanagement.model.UploadServerCertificateRequest()
		input.setPath(this.path)
		input.setServerCertificateName(this.serverCertificateName)
		input.setCertificateBody(this.certificateBody)
		input.setPrivateKey(this.privateKey)
		input.setCertificateChain(this.certificateChain)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.uploadServerCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam upload-server-certificate")
				.argument("path", path)
				.argument("server-certificate-name", serverCertificateName)
				.argument("certificate-body", certificateBody)
				.argument("private-key", privateKey)
				.argument("certificate-chain", certificateChain)
	}

}


fun AmazonIdentityManagementFunctions.uploadSigningCertificate(certificateBody: String, init: AmazonIdentityManagementUploadSigningCertificateCommand.() -> Unit) {
	this.block.declare(AmazonIdentityManagementUploadSigningCertificateCommand(certificateBody).apply(init))
}

@Generated
class AmazonIdentityManagementUploadSigningCertificateCommand(val certificateBody: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.UploadSigningCertificateRequest> {

	var userName: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.UploadSigningCertificateRequest {
		val input = com.amazonaws.services.identitymanagement.model.UploadSigningCertificateRequest()
		input.setUserName(this.userName)
		input.setCertificateBody(this.certificateBody)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iam.uploadSigningCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam upload-signing-certificate")
				.argument("user-name", userName)
				.argument("certificate-body", certificateBody)
	}

}
