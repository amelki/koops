
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package com.codingue.koops.aws.iam

import javax.annotation.Generated
import com.codingue.koops.common.*
import com.codingue.koops.core.*
import com.codingue.koops.aws.*
import com.amazonaws.services.identitymanagement.*
import com.amazonaws.services.identitymanagement.model.*

var com.codingue.koops.core.Environment.iam: AmazonIdentityManagement
	get() {
		var service = this.capabilities["aws-iam"]
		if (service == null) {
			service = AmazonIdentityManagementClientBuilder.standard().build()
			this.capabilities["aws-iam"] = service
		}
		return service as AmazonIdentityManagement
	}
	set(iam) {
		this.capabilities["aws-iam"] = iam
	}

@Generated
class AmazonIdentityManagementFunctions(val block: Block)

infix fun <T> AwsContinuation.iam(init: AmazonIdentityManagementFunctions.() -> T): T {
	return AmazonIdentityManagementFunctions(shell).run(init)
}

			

fun AmazonIdentityManagementFunctions.addClientIDToOpenIDConnectProvider(openIDConnectProviderArn: String, clientID: String, init: (AmazonIdentityManagementAddClientIDToOpenIDConnectProviderCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.AddClientIDToOpenIDConnectProviderResult {
	return this.block.declare(AmazonIdentityManagementAddClientIDToOpenIDConnectProviderCommand(openIDConnectProviderArn, clientID).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.AddClientIDToOpenIDConnectProviderResult
}

@Generated
class AmazonIdentityManagementAddClientIDToOpenIDConnectProviderCommand(val openIDConnectProviderArn: String, val clientID: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.AddClientIDToOpenIDConnectProviderRequest, com.amazonaws.services.identitymanagement.model.AddClientIDToOpenIDConnectProviderResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.AddClientIDToOpenIDConnectProviderRequest {
		val input = com.amazonaws.services.identitymanagement.model.AddClientIDToOpenIDConnectProviderRequest()
		input.setOpenIDConnectProviderArn(this.openIDConnectProviderArn)
		input.setClientID(this.clientID)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.AddClientIDToOpenIDConnectProviderResult {
	  return com.amazonaws.services.identitymanagement.model.AddClientIDToOpenIDConnectProviderResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.AddClientIDToOpenIDConnectProviderResult {
		return environment.iam.addClientIDToOpenIDConnectProvider(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam add-client-idto-open-idconnect-provider")
				.argument("open-idconnect-provider-arn", openIDConnectProviderArn)
				.argument("client-id", clientID)
	}

}


fun AmazonIdentityManagementFunctions.addRoleToInstanceProfile(instanceProfileName: String, roleName: String, init: (AmazonIdentityManagementAddRoleToInstanceProfileCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.AddRoleToInstanceProfileResult {
	return this.block.declare(AmazonIdentityManagementAddRoleToInstanceProfileCommand(instanceProfileName, roleName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.AddRoleToInstanceProfileResult
}

@Generated
class AmazonIdentityManagementAddRoleToInstanceProfileCommand(val instanceProfileName: String, val roleName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.AddRoleToInstanceProfileRequest, com.amazonaws.services.identitymanagement.model.AddRoleToInstanceProfileResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.AddRoleToInstanceProfileRequest {
		val input = com.amazonaws.services.identitymanagement.model.AddRoleToInstanceProfileRequest()
		input.setInstanceProfileName(this.instanceProfileName)
		input.setRoleName(this.roleName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.AddRoleToInstanceProfileResult {
	  return com.amazonaws.services.identitymanagement.model.AddRoleToInstanceProfileResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.AddRoleToInstanceProfileResult {
		return environment.iam.addRoleToInstanceProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam add-role-to-instance-profile")
				.argument("instance-profile-name", instanceProfileName)
				.argument("role-name", roleName)
	}

}


fun AmazonIdentityManagementFunctions.addUserToGroup(groupName: String, userName: String, init: (AmazonIdentityManagementAddUserToGroupCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.AddUserToGroupResult {
	return this.block.declare(AmazonIdentityManagementAddUserToGroupCommand(groupName, userName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.AddUserToGroupResult
}

@Generated
class AmazonIdentityManagementAddUserToGroupCommand(val groupName: String, val userName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.AddUserToGroupRequest, com.amazonaws.services.identitymanagement.model.AddUserToGroupResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.AddUserToGroupRequest {
		val input = com.amazonaws.services.identitymanagement.model.AddUserToGroupRequest()
		input.setGroupName(this.groupName)
		input.setUserName(this.userName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.AddUserToGroupResult {
	  return com.amazonaws.services.identitymanagement.model.AddUserToGroupResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.AddUserToGroupResult {
		return environment.iam.addUserToGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam add-user-to-group")
				.argument("group-name", groupName)
				.argument("user-name", userName)
	}

}


fun AmazonIdentityManagementFunctions.attachGroupPolicy(groupName: String, policyArn: String, init: (AmazonIdentityManagementAttachGroupPolicyCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.AttachGroupPolicyResult {
	return this.block.declare(AmazonIdentityManagementAttachGroupPolicyCommand(groupName, policyArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.AttachGroupPolicyResult
}

@Generated
class AmazonIdentityManagementAttachGroupPolicyCommand(val groupName: String, val policyArn: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.AttachGroupPolicyRequest, com.amazonaws.services.identitymanagement.model.AttachGroupPolicyResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.AttachGroupPolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.AttachGroupPolicyRequest()
		input.setGroupName(this.groupName)
		input.setPolicyArn(this.policyArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.AttachGroupPolicyResult {
	  return com.amazonaws.services.identitymanagement.model.AttachGroupPolicyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.AttachGroupPolicyResult {
		return environment.iam.attachGroupPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam attach-group-policy")
				.argument("group-name", groupName)
				.argument("policy-arn", policyArn)
	}

}


fun AmazonIdentityManagementFunctions.attachRolePolicy(roleName: String, policyArn: String, init: (AmazonIdentityManagementAttachRolePolicyCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.AttachRolePolicyResult {
	return this.block.declare(AmazonIdentityManagementAttachRolePolicyCommand(roleName, policyArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.AttachRolePolicyResult
}

@Generated
class AmazonIdentityManagementAttachRolePolicyCommand(val roleName: String, val policyArn: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.AttachRolePolicyRequest, com.amazonaws.services.identitymanagement.model.AttachRolePolicyResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.AttachRolePolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.AttachRolePolicyRequest()
		input.setRoleName(this.roleName)
		input.setPolicyArn(this.policyArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.AttachRolePolicyResult {
	  return com.amazonaws.services.identitymanagement.model.AttachRolePolicyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.AttachRolePolicyResult {
		return environment.iam.attachRolePolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam attach-role-policy")
				.argument("role-name", roleName)
				.argument("policy-arn", policyArn)
	}

}


fun AmazonIdentityManagementFunctions.attachUserPolicy(userName: String, policyArn: String, init: (AmazonIdentityManagementAttachUserPolicyCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.AttachUserPolicyResult {
	return this.block.declare(AmazonIdentityManagementAttachUserPolicyCommand(userName, policyArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.AttachUserPolicyResult
}

@Generated
class AmazonIdentityManagementAttachUserPolicyCommand(val userName: String, val policyArn: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.AttachUserPolicyRequest, com.amazonaws.services.identitymanagement.model.AttachUserPolicyResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.AttachUserPolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.AttachUserPolicyRequest()
		input.setUserName(this.userName)
		input.setPolicyArn(this.policyArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.AttachUserPolicyResult {
	  return com.amazonaws.services.identitymanagement.model.AttachUserPolicyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.AttachUserPolicyResult {
		return environment.iam.attachUserPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam attach-user-policy")
				.argument("user-name", userName)
				.argument("policy-arn", policyArn)
	}

}


fun AmazonIdentityManagementFunctions.changePassword(oldPassword: String, newPassword: String, init: (AmazonIdentityManagementChangePasswordCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.ChangePasswordResult {
	return this.block.declare(AmazonIdentityManagementChangePasswordCommand(oldPassword, newPassword).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.ChangePasswordResult
}

@Generated
class AmazonIdentityManagementChangePasswordCommand(val oldPassword: String, val newPassword: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ChangePasswordRequest, com.amazonaws.services.identitymanagement.model.ChangePasswordResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.ChangePasswordRequest {
		val input = com.amazonaws.services.identitymanagement.model.ChangePasswordRequest()
		input.setOldPassword(this.oldPassword)
		input.setNewPassword(this.newPassword)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.ChangePasswordResult {
	  return com.amazonaws.services.identitymanagement.model.ChangePasswordResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.ChangePasswordResult {
		return environment.iam.changePassword(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam change-password")
				.argument("old-password", oldPassword)
				.argument("new-password", newPassword)
	}

}


fun AmazonIdentityManagementFunctions.createAccessKey(init: (AmazonIdentityManagementCreateAccessKeyCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.CreateAccessKeyResult {
	return this.block.declare(AmazonIdentityManagementCreateAccessKeyCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.CreateAccessKeyResult
}

@Generated
class AmazonIdentityManagementCreateAccessKeyCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.CreateAccessKeyRequest, com.amazonaws.services.identitymanagement.model.CreateAccessKeyResult> {

	var userName: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.CreateAccessKeyRequest {
		val input = com.amazonaws.services.identitymanagement.model.CreateAccessKeyRequest()
		input.setUserName(this.userName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.CreateAccessKeyResult {
	  return com.amazonaws.services.identitymanagement.model.CreateAccessKeyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.CreateAccessKeyResult {
		return environment.iam.createAccessKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam create-access-key")
				.argument("user-name", userName)
	}

}


fun AmazonIdentityManagementFunctions.createAccountAlias(accountAlias: String, init: (AmazonIdentityManagementCreateAccountAliasCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.CreateAccountAliasResult {
	return this.block.declare(AmazonIdentityManagementCreateAccountAliasCommand(accountAlias).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.CreateAccountAliasResult
}

@Generated
class AmazonIdentityManagementCreateAccountAliasCommand(val accountAlias: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.CreateAccountAliasRequest, com.amazonaws.services.identitymanagement.model.CreateAccountAliasResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.CreateAccountAliasRequest {
		val input = com.amazonaws.services.identitymanagement.model.CreateAccountAliasRequest()
		input.setAccountAlias(this.accountAlias)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.CreateAccountAliasResult {
	  return com.amazonaws.services.identitymanagement.model.CreateAccountAliasResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.CreateAccountAliasResult {
		return environment.iam.createAccountAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam create-account-alias")
				.argument("account-alias", accountAlias)
	}

}


fun AmazonIdentityManagementFunctions.createGroup(groupName: String, init: (AmazonIdentityManagementCreateGroupCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.CreateGroupResult {
	return this.block.declare(AmazonIdentityManagementCreateGroupCommand(groupName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.CreateGroupResult
}

@Generated
class AmazonIdentityManagementCreateGroupCommand(val groupName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.CreateGroupRequest, com.amazonaws.services.identitymanagement.model.CreateGroupResult> {

	var path: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.CreateGroupRequest {
		val input = com.amazonaws.services.identitymanagement.model.CreateGroupRequest()
		input.setPath(this.path)
		input.setGroupName(this.groupName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.CreateGroupResult {
	  return com.amazonaws.services.identitymanagement.model.CreateGroupResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.CreateGroupResult {
		return environment.iam.createGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam create-group")
				.argument("path", path)
				.argument("group-name", groupName)
	}

}


fun AmazonIdentityManagementFunctions.createInstanceProfile(instanceProfileName: String, init: (AmazonIdentityManagementCreateInstanceProfileCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.CreateInstanceProfileResult {
	return this.block.declare(AmazonIdentityManagementCreateInstanceProfileCommand(instanceProfileName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.CreateInstanceProfileResult
}

@Generated
class AmazonIdentityManagementCreateInstanceProfileCommand(val instanceProfileName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.CreateInstanceProfileRequest, com.amazonaws.services.identitymanagement.model.CreateInstanceProfileResult> {

	var path: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.CreateInstanceProfileRequest {
		val input = com.amazonaws.services.identitymanagement.model.CreateInstanceProfileRequest()
		input.setInstanceProfileName(this.instanceProfileName)
		input.setPath(this.path)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.CreateInstanceProfileResult {
	  return com.amazonaws.services.identitymanagement.model.CreateInstanceProfileResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.CreateInstanceProfileResult {
		return environment.iam.createInstanceProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam create-instance-profile")
				.argument("instance-profile-name", instanceProfileName)
				.argument("path", path)
	}

}


fun AmazonIdentityManagementFunctions.createLoginProfile(userName: String, password: String, init: (AmazonIdentityManagementCreateLoginProfileCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.CreateLoginProfileResult {
	return this.block.declare(AmazonIdentityManagementCreateLoginProfileCommand(userName, password).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.CreateLoginProfileResult
}

@Generated
class AmazonIdentityManagementCreateLoginProfileCommand(val userName: String, val password: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.CreateLoginProfileRequest, com.amazonaws.services.identitymanagement.model.CreateLoginProfileResult> {

	var passwordResetRequired: Boolean? = false

	override fun build(): com.amazonaws.services.identitymanagement.model.CreateLoginProfileRequest {
		val input = com.amazonaws.services.identitymanagement.model.CreateLoginProfileRequest()
		input.setUserName(this.userName)
		input.setPassword(this.password)
		input.setPasswordResetRequired(this.passwordResetRequired)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.CreateLoginProfileResult {
	  return com.amazonaws.services.identitymanagement.model.CreateLoginProfileResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.CreateLoginProfileResult {
		return environment.iam.createLoginProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam create-login-profile")
				.argument("user-name", userName)
				.argument("password", password)
				.option("password-reset-required", passwordResetRequired ?: false)
	}

}


fun AmazonIdentityManagementFunctions.createOpenIDConnectProvider(url: String, thumbprintList: List<String>, init: (AmazonIdentityManagementCreateOpenIDConnectProviderCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.CreateOpenIDConnectProviderResult {
	return this.block.declare(AmazonIdentityManagementCreateOpenIDConnectProviderCommand(url, thumbprintList).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.CreateOpenIDConnectProviderResult
}

@Generated
class AmazonIdentityManagementCreateOpenIDConnectProviderCommand(val url: String, val thumbprintList: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.CreateOpenIDConnectProviderRequest, com.amazonaws.services.identitymanagement.model.CreateOpenIDConnectProviderResult> {

	var clientIDList: List<String>? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.CreateOpenIDConnectProviderRequest {
		val input = com.amazonaws.services.identitymanagement.model.CreateOpenIDConnectProviderRequest()
		input.setUrl(this.url)
		input.setClientIDList(this.clientIDList)
		input.setThumbprintList(this.thumbprintList)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.CreateOpenIDConnectProviderResult {
	  return com.amazonaws.services.identitymanagement.model.CreateOpenIDConnectProviderResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.CreateOpenIDConnectProviderResult {
		return environment.iam.createOpenIDConnectProvider(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam create-open-idconnect-provider")
				.argument("url", url)
				.argument("client-idlist", clientIDList?.toString())
				.argument("thumbprint-list", thumbprintList.toString())
	}

}


fun AmazonIdentityManagementFunctions.createPolicy(policyName: String, policyDocument: String, init: (AmazonIdentityManagementCreatePolicyCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.CreatePolicyResult {
	return this.block.declare(AmazonIdentityManagementCreatePolicyCommand(policyName, policyDocument).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.CreatePolicyResult
}

@Generated
class AmazonIdentityManagementCreatePolicyCommand(val policyName: String, val policyDocument: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.CreatePolicyRequest, com.amazonaws.services.identitymanagement.model.CreatePolicyResult> {

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

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.CreatePolicyResult {
	  return com.amazonaws.services.identitymanagement.model.CreatePolicyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.CreatePolicyResult {
		return environment.iam.createPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam create-policy")
				.argument("policy-name", policyName)
				.argument("path", path)
				.argument("policy-document", policyDocument)
				.argument("description", description)
	}

}


fun AmazonIdentityManagementFunctions.createPolicyVersion(policyArn: String, policyDocument: String, init: (AmazonIdentityManagementCreatePolicyVersionCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.CreatePolicyVersionResult {
	return this.block.declare(AmazonIdentityManagementCreatePolicyVersionCommand(policyArn, policyDocument).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.CreatePolicyVersionResult
}

@Generated
class AmazonIdentityManagementCreatePolicyVersionCommand(val policyArn: String, val policyDocument: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.CreatePolicyVersionRequest, com.amazonaws.services.identitymanagement.model.CreatePolicyVersionResult> {

	var setAsDefault: Boolean? = false

	override fun build(): com.amazonaws.services.identitymanagement.model.CreatePolicyVersionRequest {
		val input = com.amazonaws.services.identitymanagement.model.CreatePolicyVersionRequest()
		input.setPolicyArn(this.policyArn)
		input.setPolicyDocument(this.policyDocument)
		input.setSetAsDefault(this.setAsDefault)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.CreatePolicyVersionResult {
	  return com.amazonaws.services.identitymanagement.model.CreatePolicyVersionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.CreatePolicyVersionResult {
		return environment.iam.createPolicyVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam create-policy-version")
				.argument("policy-arn", policyArn)
				.argument("policy-document", policyDocument)
				.option("set-as-default", setAsDefault ?: false)
	}

}


fun AmazonIdentityManagementFunctions.createRole(roleName: String, assumeRolePolicyDocument: String, init: (AmazonIdentityManagementCreateRoleCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.CreateRoleResult {
	return this.block.declare(AmazonIdentityManagementCreateRoleCommand(roleName, assumeRolePolicyDocument).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.CreateRoleResult
}

@Generated
class AmazonIdentityManagementCreateRoleCommand(val roleName: String, val assumeRolePolicyDocument: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.CreateRoleRequest, com.amazonaws.services.identitymanagement.model.CreateRoleResult> {

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

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.CreateRoleResult {
	  return com.amazonaws.services.identitymanagement.model.CreateRoleResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.CreateRoleResult {
		return environment.iam.createRole(build())
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


fun AmazonIdentityManagementFunctions.createSAMLProvider(sAMLMetadataDocument: String, name: String, init: (AmazonIdentityManagementCreateSAMLProviderCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.CreateSAMLProviderResult {
	return this.block.declare(AmazonIdentityManagementCreateSAMLProviderCommand(sAMLMetadataDocument, name).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.CreateSAMLProviderResult
}

@Generated
class AmazonIdentityManagementCreateSAMLProviderCommand(val sAMLMetadataDocument: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.CreateSAMLProviderRequest, com.amazonaws.services.identitymanagement.model.CreateSAMLProviderResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.CreateSAMLProviderRequest {
		val input = com.amazonaws.services.identitymanagement.model.CreateSAMLProviderRequest()
		input.setSAMLMetadataDocument(this.sAMLMetadataDocument)
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.CreateSAMLProviderResult {
	  return com.amazonaws.services.identitymanagement.model.CreateSAMLProviderResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.CreateSAMLProviderResult {
		return environment.iam.createSAMLProvider(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam create-samlprovider")
				.argument("samlmetadata-document", sAMLMetadataDocument)
				.argument("name", name)
	}

}


fun AmazonIdentityManagementFunctions.createServiceLinkedRole(aWSServiceName: String, init: (AmazonIdentityManagementCreateServiceLinkedRoleCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.CreateServiceLinkedRoleResult {
	return this.block.declare(AmazonIdentityManagementCreateServiceLinkedRoleCommand(aWSServiceName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.CreateServiceLinkedRoleResult
}

@Generated
class AmazonIdentityManagementCreateServiceLinkedRoleCommand(val aWSServiceName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.CreateServiceLinkedRoleRequest, com.amazonaws.services.identitymanagement.model.CreateServiceLinkedRoleResult> {

	var description: String? = null
	var customSuffix: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.CreateServiceLinkedRoleRequest {
		val input = com.amazonaws.services.identitymanagement.model.CreateServiceLinkedRoleRequest()
		input.setAWSServiceName(this.aWSServiceName)
		input.setDescription(this.description)
		input.setCustomSuffix(this.customSuffix)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.CreateServiceLinkedRoleResult {
	  return com.amazonaws.services.identitymanagement.model.CreateServiceLinkedRoleResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.CreateServiceLinkedRoleResult {
		return environment.iam.createServiceLinkedRole(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam create-service-linked-role")
				.argument("awsservice-name", aWSServiceName)
				.argument("description", description)
				.argument("custom-suffix", customSuffix)
	}

}


fun AmazonIdentityManagementFunctions.createServiceSpecificCredential(userName: String, serviceName: String, init: (AmazonIdentityManagementCreateServiceSpecificCredentialCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.CreateServiceSpecificCredentialResult {
	return this.block.declare(AmazonIdentityManagementCreateServiceSpecificCredentialCommand(userName, serviceName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.CreateServiceSpecificCredentialResult
}

@Generated
class AmazonIdentityManagementCreateServiceSpecificCredentialCommand(val userName: String, val serviceName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.CreateServiceSpecificCredentialRequest, com.amazonaws.services.identitymanagement.model.CreateServiceSpecificCredentialResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.CreateServiceSpecificCredentialRequest {
		val input = com.amazonaws.services.identitymanagement.model.CreateServiceSpecificCredentialRequest()
		input.setUserName(this.userName)
		input.setServiceName(this.serviceName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.CreateServiceSpecificCredentialResult {
	  return com.amazonaws.services.identitymanagement.model.CreateServiceSpecificCredentialResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.CreateServiceSpecificCredentialResult {
		return environment.iam.createServiceSpecificCredential(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam create-service-specific-credential")
				.argument("user-name", userName)
				.argument("service-name", serviceName)
	}

}


fun AmazonIdentityManagementFunctions.createUser(userName: String, init: (AmazonIdentityManagementCreateUserCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.CreateUserResult {
	return this.block.declare(AmazonIdentityManagementCreateUserCommand(userName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.CreateUserResult
}

@Generated
class AmazonIdentityManagementCreateUserCommand(val userName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.CreateUserRequest, com.amazonaws.services.identitymanagement.model.CreateUserResult> {

	var path: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.CreateUserRequest {
		val input = com.amazonaws.services.identitymanagement.model.CreateUserRequest()
		input.setPath(this.path)
		input.setUserName(this.userName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.CreateUserResult {
	  return com.amazonaws.services.identitymanagement.model.CreateUserResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.CreateUserResult {
		return environment.iam.createUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam create-user")
				.argument("path", path)
				.argument("user-name", userName)
	}

}


fun AmazonIdentityManagementFunctions.createVirtualMFADevice(virtualMFADeviceName: String, init: (AmazonIdentityManagementCreateVirtualMFADeviceCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.CreateVirtualMFADeviceResult {
	return this.block.declare(AmazonIdentityManagementCreateVirtualMFADeviceCommand(virtualMFADeviceName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.CreateVirtualMFADeviceResult
}

@Generated
class AmazonIdentityManagementCreateVirtualMFADeviceCommand(val virtualMFADeviceName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.CreateVirtualMFADeviceRequest, com.amazonaws.services.identitymanagement.model.CreateVirtualMFADeviceResult> {

	var path: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.CreateVirtualMFADeviceRequest {
		val input = com.amazonaws.services.identitymanagement.model.CreateVirtualMFADeviceRequest()
		input.setPath(this.path)
		input.setVirtualMFADeviceName(this.virtualMFADeviceName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.CreateVirtualMFADeviceResult {
	  return com.amazonaws.services.identitymanagement.model.CreateVirtualMFADeviceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.CreateVirtualMFADeviceResult {
		return environment.iam.createVirtualMFADevice(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam create-virtual-mfadevice")
				.argument("path", path)
				.argument("virtual-mfadevice-name", virtualMFADeviceName)
	}

}


fun AmazonIdentityManagementFunctions.deactivateMFADevice(userName: String, serialNumber: String, init: (AmazonIdentityManagementDeactivateMFADeviceCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.DeactivateMFADeviceResult {
	return this.block.declare(AmazonIdentityManagementDeactivateMFADeviceCommand(userName, serialNumber).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.DeactivateMFADeviceResult
}

@Generated
class AmazonIdentityManagementDeactivateMFADeviceCommand(val userName: String, val serialNumber: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeactivateMFADeviceRequest, com.amazonaws.services.identitymanagement.model.DeactivateMFADeviceResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DeactivateMFADeviceRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeactivateMFADeviceRequest()
		input.setUserName(this.userName)
		input.setSerialNumber(this.serialNumber)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.DeactivateMFADeviceResult {
	  return com.amazonaws.services.identitymanagement.model.DeactivateMFADeviceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.DeactivateMFADeviceResult {
		return environment.iam.deactivateMFADevice(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam deactivate-mfadevice")
				.argument("user-name", userName)
				.argument("serial-number", serialNumber)
	}

}


fun AmazonIdentityManagementFunctions.deleteAccessKey(accessKeyId: String, init: (AmazonIdentityManagementDeleteAccessKeyCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.DeleteAccessKeyResult {
	return this.block.declare(AmazonIdentityManagementDeleteAccessKeyCommand(accessKeyId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.DeleteAccessKeyResult
}

@Generated
class AmazonIdentityManagementDeleteAccessKeyCommand(val accessKeyId: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeleteAccessKeyRequest, com.amazonaws.services.identitymanagement.model.DeleteAccessKeyResult> {

	var userName: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.DeleteAccessKeyRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeleteAccessKeyRequest()
		input.setUserName(this.userName)
		input.setAccessKeyId(this.accessKeyId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.DeleteAccessKeyResult {
	  return com.amazonaws.services.identitymanagement.model.DeleteAccessKeyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.DeleteAccessKeyResult {
		return environment.iam.deleteAccessKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-access-key")
				.argument("user-name", userName)
				.argument("access-key-id", accessKeyId)
	}

}


fun AmazonIdentityManagementFunctions.deleteAccountAlias(accountAlias: String, init: (AmazonIdentityManagementDeleteAccountAliasCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.DeleteAccountAliasResult {
	return this.block.declare(AmazonIdentityManagementDeleteAccountAliasCommand(accountAlias).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.DeleteAccountAliasResult
}

@Generated
class AmazonIdentityManagementDeleteAccountAliasCommand(val accountAlias: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeleteAccountAliasRequest, com.amazonaws.services.identitymanagement.model.DeleteAccountAliasResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DeleteAccountAliasRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeleteAccountAliasRequest()
		input.setAccountAlias(this.accountAlias)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.DeleteAccountAliasResult {
	  return com.amazonaws.services.identitymanagement.model.DeleteAccountAliasResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.DeleteAccountAliasResult {
		return environment.iam.deleteAccountAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-account-alias")
				.argument("account-alias", accountAlias)
	}

}


fun AmazonIdentityManagementFunctions.deleteAccountPasswordPolicy(init: (AmazonIdentityManagementDeleteAccountPasswordPolicyCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.DeleteAccountPasswordPolicyResult {
	return this.block.declare(AmazonIdentityManagementDeleteAccountPasswordPolicyCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.DeleteAccountPasswordPolicyResult
}

@Generated
class AmazonIdentityManagementDeleteAccountPasswordPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeleteAccountPasswordPolicyRequest, com.amazonaws.services.identitymanagement.model.DeleteAccountPasswordPolicyResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DeleteAccountPasswordPolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeleteAccountPasswordPolicyRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.DeleteAccountPasswordPolicyResult {
	  return com.amazonaws.services.identitymanagement.model.DeleteAccountPasswordPolicyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.DeleteAccountPasswordPolicyResult {
		return environment.iam.deleteAccountPasswordPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-account-password-policy")

	}

}


fun AmazonIdentityManagementFunctions.deleteGroup(groupName: String, init: (AmazonIdentityManagementDeleteGroupCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.DeleteGroupResult {
	return this.block.declare(AmazonIdentityManagementDeleteGroupCommand(groupName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.DeleteGroupResult
}

@Generated
class AmazonIdentityManagementDeleteGroupCommand(val groupName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeleteGroupRequest, com.amazonaws.services.identitymanagement.model.DeleteGroupResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DeleteGroupRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeleteGroupRequest()
		input.setGroupName(this.groupName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.DeleteGroupResult {
	  return com.amazonaws.services.identitymanagement.model.DeleteGroupResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.DeleteGroupResult {
		return environment.iam.deleteGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-group")
				.argument("group-name", groupName)
	}

}


fun AmazonIdentityManagementFunctions.deleteGroupPolicy(groupName: String, policyName: String, init: (AmazonIdentityManagementDeleteGroupPolicyCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.DeleteGroupPolicyResult {
	return this.block.declare(AmazonIdentityManagementDeleteGroupPolicyCommand(groupName, policyName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.DeleteGroupPolicyResult
}

@Generated
class AmazonIdentityManagementDeleteGroupPolicyCommand(val groupName: String, val policyName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeleteGroupPolicyRequest, com.amazonaws.services.identitymanagement.model.DeleteGroupPolicyResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DeleteGroupPolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeleteGroupPolicyRequest()
		input.setGroupName(this.groupName)
		input.setPolicyName(this.policyName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.DeleteGroupPolicyResult {
	  return com.amazonaws.services.identitymanagement.model.DeleteGroupPolicyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.DeleteGroupPolicyResult {
		return environment.iam.deleteGroupPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-group-policy")
				.argument("group-name", groupName)
				.argument("policy-name", policyName)
	}

}


fun AmazonIdentityManagementFunctions.deleteInstanceProfile(instanceProfileName: String, init: (AmazonIdentityManagementDeleteInstanceProfileCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.DeleteInstanceProfileResult {
	return this.block.declare(AmazonIdentityManagementDeleteInstanceProfileCommand(instanceProfileName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.DeleteInstanceProfileResult
}

@Generated
class AmazonIdentityManagementDeleteInstanceProfileCommand(val instanceProfileName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeleteInstanceProfileRequest, com.amazonaws.services.identitymanagement.model.DeleteInstanceProfileResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DeleteInstanceProfileRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeleteInstanceProfileRequest()
		input.setInstanceProfileName(this.instanceProfileName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.DeleteInstanceProfileResult {
	  return com.amazonaws.services.identitymanagement.model.DeleteInstanceProfileResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.DeleteInstanceProfileResult {
		return environment.iam.deleteInstanceProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-instance-profile")
				.argument("instance-profile-name", instanceProfileName)
	}

}


fun AmazonIdentityManagementFunctions.deleteLoginProfile(userName: String, init: (AmazonIdentityManagementDeleteLoginProfileCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.DeleteLoginProfileResult {
	return this.block.declare(AmazonIdentityManagementDeleteLoginProfileCommand(userName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.DeleteLoginProfileResult
}

@Generated
class AmazonIdentityManagementDeleteLoginProfileCommand(val userName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeleteLoginProfileRequest, com.amazonaws.services.identitymanagement.model.DeleteLoginProfileResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DeleteLoginProfileRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeleteLoginProfileRequest()
		input.setUserName(this.userName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.DeleteLoginProfileResult {
	  return com.amazonaws.services.identitymanagement.model.DeleteLoginProfileResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.DeleteLoginProfileResult {
		return environment.iam.deleteLoginProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-login-profile")
				.argument("user-name", userName)
	}

}


fun AmazonIdentityManagementFunctions.deleteOpenIDConnectProvider(openIDConnectProviderArn: String, init: (AmazonIdentityManagementDeleteOpenIDConnectProviderCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.DeleteOpenIDConnectProviderResult {
	return this.block.declare(AmazonIdentityManagementDeleteOpenIDConnectProviderCommand(openIDConnectProviderArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.DeleteOpenIDConnectProviderResult
}

@Generated
class AmazonIdentityManagementDeleteOpenIDConnectProviderCommand(val openIDConnectProviderArn: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeleteOpenIDConnectProviderRequest, com.amazonaws.services.identitymanagement.model.DeleteOpenIDConnectProviderResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DeleteOpenIDConnectProviderRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeleteOpenIDConnectProviderRequest()
		input.setOpenIDConnectProviderArn(this.openIDConnectProviderArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.DeleteOpenIDConnectProviderResult {
	  return com.amazonaws.services.identitymanagement.model.DeleteOpenIDConnectProviderResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.DeleteOpenIDConnectProviderResult {
		return environment.iam.deleteOpenIDConnectProvider(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-open-idconnect-provider")
				.argument("open-idconnect-provider-arn", openIDConnectProviderArn)
	}

}


fun AmazonIdentityManagementFunctions.deletePolicy(policyArn: String, init: (AmazonIdentityManagementDeletePolicyCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.DeletePolicyResult {
	return this.block.declare(AmazonIdentityManagementDeletePolicyCommand(policyArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.DeletePolicyResult
}

@Generated
class AmazonIdentityManagementDeletePolicyCommand(val policyArn: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeletePolicyRequest, com.amazonaws.services.identitymanagement.model.DeletePolicyResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DeletePolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeletePolicyRequest()
		input.setPolicyArn(this.policyArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.DeletePolicyResult {
	  return com.amazonaws.services.identitymanagement.model.DeletePolicyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.DeletePolicyResult {
		return environment.iam.deletePolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-policy")
				.argument("policy-arn", policyArn)
	}

}


fun AmazonIdentityManagementFunctions.deletePolicyVersion(policyArn: String, versionId: String, init: (AmazonIdentityManagementDeletePolicyVersionCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.DeletePolicyVersionResult {
	return this.block.declare(AmazonIdentityManagementDeletePolicyVersionCommand(policyArn, versionId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.DeletePolicyVersionResult
}

@Generated
class AmazonIdentityManagementDeletePolicyVersionCommand(val policyArn: String, val versionId: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeletePolicyVersionRequest, com.amazonaws.services.identitymanagement.model.DeletePolicyVersionResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DeletePolicyVersionRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeletePolicyVersionRequest()
		input.setPolicyArn(this.policyArn)
		input.setVersionId(this.versionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.DeletePolicyVersionResult {
	  return com.amazonaws.services.identitymanagement.model.DeletePolicyVersionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.DeletePolicyVersionResult {
		return environment.iam.deletePolicyVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-policy-version")
				.argument("policy-arn", policyArn)
				.argument("version-id", versionId)
	}

}


fun AmazonIdentityManagementFunctions.deleteRole(roleName: String, init: (AmazonIdentityManagementDeleteRoleCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.DeleteRoleResult {
	return this.block.declare(AmazonIdentityManagementDeleteRoleCommand(roleName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.DeleteRoleResult
}

@Generated
class AmazonIdentityManagementDeleteRoleCommand(val roleName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeleteRoleRequest, com.amazonaws.services.identitymanagement.model.DeleteRoleResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DeleteRoleRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeleteRoleRequest()
		input.setRoleName(this.roleName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.DeleteRoleResult {
	  return com.amazonaws.services.identitymanagement.model.DeleteRoleResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.DeleteRoleResult {
		return environment.iam.deleteRole(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-role")
				.argument("role-name", roleName)
	}

}


fun AmazonIdentityManagementFunctions.deleteRolePolicy(roleName: String, policyName: String, init: (AmazonIdentityManagementDeleteRolePolicyCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.DeleteRolePolicyResult {
	return this.block.declare(AmazonIdentityManagementDeleteRolePolicyCommand(roleName, policyName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.DeleteRolePolicyResult
}

@Generated
class AmazonIdentityManagementDeleteRolePolicyCommand(val roleName: String, val policyName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeleteRolePolicyRequest, com.amazonaws.services.identitymanagement.model.DeleteRolePolicyResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DeleteRolePolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeleteRolePolicyRequest()
		input.setRoleName(this.roleName)
		input.setPolicyName(this.policyName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.DeleteRolePolicyResult {
	  return com.amazonaws.services.identitymanagement.model.DeleteRolePolicyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.DeleteRolePolicyResult {
		return environment.iam.deleteRolePolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-role-policy")
				.argument("role-name", roleName)
				.argument("policy-name", policyName)
	}

}


fun AmazonIdentityManagementFunctions.deleteSAMLProvider(sAMLProviderArn: String, init: (AmazonIdentityManagementDeleteSAMLProviderCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.DeleteSAMLProviderResult {
	return this.block.declare(AmazonIdentityManagementDeleteSAMLProviderCommand(sAMLProviderArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.DeleteSAMLProviderResult
}

@Generated
class AmazonIdentityManagementDeleteSAMLProviderCommand(val sAMLProviderArn: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeleteSAMLProviderRequest, com.amazonaws.services.identitymanagement.model.DeleteSAMLProviderResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DeleteSAMLProviderRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeleteSAMLProviderRequest()
		input.setSAMLProviderArn(this.sAMLProviderArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.DeleteSAMLProviderResult {
	  return com.amazonaws.services.identitymanagement.model.DeleteSAMLProviderResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.DeleteSAMLProviderResult {
		return environment.iam.deleteSAMLProvider(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-samlprovider")
				.argument("samlprovider-arn", sAMLProviderArn)
	}

}


fun AmazonIdentityManagementFunctions.deleteSSHPublicKey(userName: String, sSHPublicKeyId: String, init: (AmazonIdentityManagementDeleteSSHPublicKeyCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.DeleteSSHPublicKeyResult {
	return this.block.declare(AmazonIdentityManagementDeleteSSHPublicKeyCommand(userName, sSHPublicKeyId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.DeleteSSHPublicKeyResult
}

@Generated
class AmazonIdentityManagementDeleteSSHPublicKeyCommand(val userName: String, val sSHPublicKeyId: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeleteSSHPublicKeyRequest, com.amazonaws.services.identitymanagement.model.DeleteSSHPublicKeyResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DeleteSSHPublicKeyRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeleteSSHPublicKeyRequest()
		input.setUserName(this.userName)
		input.setSSHPublicKeyId(this.sSHPublicKeyId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.DeleteSSHPublicKeyResult {
	  return com.amazonaws.services.identitymanagement.model.DeleteSSHPublicKeyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.DeleteSSHPublicKeyResult {
		return environment.iam.deleteSSHPublicKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-sshpublic-key")
				.argument("user-name", userName)
				.argument("sshpublic-key-id", sSHPublicKeyId)
	}

}


fun AmazonIdentityManagementFunctions.deleteServerCertificate(serverCertificateName: String, init: (AmazonIdentityManagementDeleteServerCertificateCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.DeleteServerCertificateResult {
	return this.block.declare(AmazonIdentityManagementDeleteServerCertificateCommand(serverCertificateName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.DeleteServerCertificateResult
}

@Generated
class AmazonIdentityManagementDeleteServerCertificateCommand(val serverCertificateName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeleteServerCertificateRequest, com.amazonaws.services.identitymanagement.model.DeleteServerCertificateResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DeleteServerCertificateRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeleteServerCertificateRequest()
		input.setServerCertificateName(this.serverCertificateName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.DeleteServerCertificateResult {
	  return com.amazonaws.services.identitymanagement.model.DeleteServerCertificateResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.DeleteServerCertificateResult {
		return environment.iam.deleteServerCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-server-certificate")
				.argument("server-certificate-name", serverCertificateName)
	}

}


fun AmazonIdentityManagementFunctions.deleteServiceLinkedRole(roleName: String, init: (AmazonIdentityManagementDeleteServiceLinkedRoleCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.DeleteServiceLinkedRoleResult {
	return this.block.declare(AmazonIdentityManagementDeleteServiceLinkedRoleCommand(roleName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.DeleteServiceLinkedRoleResult
}

@Generated
class AmazonIdentityManagementDeleteServiceLinkedRoleCommand(val roleName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeleteServiceLinkedRoleRequest, com.amazonaws.services.identitymanagement.model.DeleteServiceLinkedRoleResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DeleteServiceLinkedRoleRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeleteServiceLinkedRoleRequest()
		input.setRoleName(this.roleName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.DeleteServiceLinkedRoleResult {
	  return com.amazonaws.services.identitymanagement.model.DeleteServiceLinkedRoleResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.DeleteServiceLinkedRoleResult {
		return environment.iam.deleteServiceLinkedRole(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-service-linked-role")
				.argument("role-name", roleName)
	}

}


fun AmazonIdentityManagementFunctions.deleteServiceSpecificCredential(serviceSpecificCredentialId: String, init: (AmazonIdentityManagementDeleteServiceSpecificCredentialCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.DeleteServiceSpecificCredentialResult {
	return this.block.declare(AmazonIdentityManagementDeleteServiceSpecificCredentialCommand(serviceSpecificCredentialId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.DeleteServiceSpecificCredentialResult
}

@Generated
class AmazonIdentityManagementDeleteServiceSpecificCredentialCommand(val serviceSpecificCredentialId: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeleteServiceSpecificCredentialRequest, com.amazonaws.services.identitymanagement.model.DeleteServiceSpecificCredentialResult> {

	var userName: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.DeleteServiceSpecificCredentialRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeleteServiceSpecificCredentialRequest()
		input.setUserName(this.userName)
		input.setServiceSpecificCredentialId(this.serviceSpecificCredentialId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.DeleteServiceSpecificCredentialResult {
	  return com.amazonaws.services.identitymanagement.model.DeleteServiceSpecificCredentialResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.DeleteServiceSpecificCredentialResult {
		return environment.iam.deleteServiceSpecificCredential(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-service-specific-credential")
				.argument("user-name", userName)
				.argument("service-specific-credential-id", serviceSpecificCredentialId)
	}

}


fun AmazonIdentityManagementFunctions.deleteSigningCertificate(certificateId: String, init: (AmazonIdentityManagementDeleteSigningCertificateCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.DeleteSigningCertificateResult {
	return this.block.declare(AmazonIdentityManagementDeleteSigningCertificateCommand(certificateId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.DeleteSigningCertificateResult
}

@Generated
class AmazonIdentityManagementDeleteSigningCertificateCommand(val certificateId: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeleteSigningCertificateRequest, com.amazonaws.services.identitymanagement.model.DeleteSigningCertificateResult> {

	var userName: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.DeleteSigningCertificateRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeleteSigningCertificateRequest()
		input.setUserName(this.userName)
		input.setCertificateId(this.certificateId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.DeleteSigningCertificateResult {
	  return com.amazonaws.services.identitymanagement.model.DeleteSigningCertificateResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.DeleteSigningCertificateResult {
		return environment.iam.deleteSigningCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-signing-certificate")
				.argument("user-name", userName)
				.argument("certificate-id", certificateId)
	}

}


fun AmazonIdentityManagementFunctions.deleteUser(userName: String, init: (AmazonIdentityManagementDeleteUserCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.DeleteUserResult {
	return this.block.declare(AmazonIdentityManagementDeleteUserCommand(userName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.DeleteUserResult
}

@Generated
class AmazonIdentityManagementDeleteUserCommand(val userName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeleteUserRequest, com.amazonaws.services.identitymanagement.model.DeleteUserResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DeleteUserRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeleteUserRequest()
		input.setUserName(this.userName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.DeleteUserResult {
	  return com.amazonaws.services.identitymanagement.model.DeleteUserResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.DeleteUserResult {
		return environment.iam.deleteUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-user")
				.argument("user-name", userName)
	}

}


fun AmazonIdentityManagementFunctions.deleteUserPolicy(userName: String, policyName: String, init: (AmazonIdentityManagementDeleteUserPolicyCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.DeleteUserPolicyResult {
	return this.block.declare(AmazonIdentityManagementDeleteUserPolicyCommand(userName, policyName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.DeleteUserPolicyResult
}

@Generated
class AmazonIdentityManagementDeleteUserPolicyCommand(val userName: String, val policyName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeleteUserPolicyRequest, com.amazonaws.services.identitymanagement.model.DeleteUserPolicyResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DeleteUserPolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeleteUserPolicyRequest()
		input.setUserName(this.userName)
		input.setPolicyName(this.policyName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.DeleteUserPolicyResult {
	  return com.amazonaws.services.identitymanagement.model.DeleteUserPolicyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.DeleteUserPolicyResult {
		return environment.iam.deleteUserPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-user-policy")
				.argument("user-name", userName)
				.argument("policy-name", policyName)
	}

}


fun AmazonIdentityManagementFunctions.deleteVirtualMFADevice(serialNumber: String, init: (AmazonIdentityManagementDeleteVirtualMFADeviceCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.DeleteVirtualMFADeviceResult {
	return this.block.declare(AmazonIdentityManagementDeleteVirtualMFADeviceCommand(serialNumber).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.DeleteVirtualMFADeviceResult
}

@Generated
class AmazonIdentityManagementDeleteVirtualMFADeviceCommand(val serialNumber: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DeleteVirtualMFADeviceRequest, com.amazonaws.services.identitymanagement.model.DeleteVirtualMFADeviceResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DeleteVirtualMFADeviceRequest {
		val input = com.amazonaws.services.identitymanagement.model.DeleteVirtualMFADeviceRequest()
		input.setSerialNumber(this.serialNumber)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.DeleteVirtualMFADeviceResult {
	  return com.amazonaws.services.identitymanagement.model.DeleteVirtualMFADeviceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.DeleteVirtualMFADeviceResult {
		return environment.iam.deleteVirtualMFADevice(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam delete-virtual-mfadevice")
				.argument("serial-number", serialNumber)
	}

}


fun AmazonIdentityManagementFunctions.detachGroupPolicy(groupName: String, policyArn: String, init: (AmazonIdentityManagementDetachGroupPolicyCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.DetachGroupPolicyResult {
	return this.block.declare(AmazonIdentityManagementDetachGroupPolicyCommand(groupName, policyArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.DetachGroupPolicyResult
}

@Generated
class AmazonIdentityManagementDetachGroupPolicyCommand(val groupName: String, val policyArn: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DetachGroupPolicyRequest, com.amazonaws.services.identitymanagement.model.DetachGroupPolicyResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DetachGroupPolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.DetachGroupPolicyRequest()
		input.setGroupName(this.groupName)
		input.setPolicyArn(this.policyArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.DetachGroupPolicyResult {
	  return com.amazonaws.services.identitymanagement.model.DetachGroupPolicyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.DetachGroupPolicyResult {
		return environment.iam.detachGroupPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam detach-group-policy")
				.argument("group-name", groupName)
				.argument("policy-arn", policyArn)
	}

}


fun AmazonIdentityManagementFunctions.detachRolePolicy(roleName: String, policyArn: String, init: (AmazonIdentityManagementDetachRolePolicyCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.DetachRolePolicyResult {
	return this.block.declare(AmazonIdentityManagementDetachRolePolicyCommand(roleName, policyArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.DetachRolePolicyResult
}

@Generated
class AmazonIdentityManagementDetachRolePolicyCommand(val roleName: String, val policyArn: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DetachRolePolicyRequest, com.amazonaws.services.identitymanagement.model.DetachRolePolicyResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DetachRolePolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.DetachRolePolicyRequest()
		input.setRoleName(this.roleName)
		input.setPolicyArn(this.policyArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.DetachRolePolicyResult {
	  return com.amazonaws.services.identitymanagement.model.DetachRolePolicyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.DetachRolePolicyResult {
		return environment.iam.detachRolePolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam detach-role-policy")
				.argument("role-name", roleName)
				.argument("policy-arn", policyArn)
	}

}


fun AmazonIdentityManagementFunctions.detachUserPolicy(userName: String, policyArn: String, init: (AmazonIdentityManagementDetachUserPolicyCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.DetachUserPolicyResult {
	return this.block.declare(AmazonIdentityManagementDetachUserPolicyCommand(userName, policyArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.DetachUserPolicyResult
}

@Generated
class AmazonIdentityManagementDetachUserPolicyCommand(val userName: String, val policyArn: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.DetachUserPolicyRequest, com.amazonaws.services.identitymanagement.model.DetachUserPolicyResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.DetachUserPolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.DetachUserPolicyRequest()
		input.setUserName(this.userName)
		input.setPolicyArn(this.policyArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.DetachUserPolicyResult {
	  return com.amazonaws.services.identitymanagement.model.DetachUserPolicyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.DetachUserPolicyResult {
		return environment.iam.detachUserPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam detach-user-policy")
				.argument("user-name", userName)
				.argument("policy-arn", policyArn)
	}

}


fun AmazonIdentityManagementFunctions.enableMFADevice(userName: String, serialNumber: String, authenticationCode1: String, authenticationCode2: String, init: (AmazonIdentityManagementEnableMFADeviceCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.EnableMFADeviceResult {
	return this.block.declare(AmazonIdentityManagementEnableMFADeviceCommand(userName, serialNumber, authenticationCode1, authenticationCode2).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.EnableMFADeviceResult
}

@Generated
class AmazonIdentityManagementEnableMFADeviceCommand(val userName: String, val serialNumber: String, val authenticationCode1: String, val authenticationCode2: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.EnableMFADeviceRequest, com.amazonaws.services.identitymanagement.model.EnableMFADeviceResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.EnableMFADeviceRequest {
		val input = com.amazonaws.services.identitymanagement.model.EnableMFADeviceRequest()
		input.setUserName(this.userName)
		input.setSerialNumber(this.serialNumber)
		input.setAuthenticationCode1(this.authenticationCode1)
		input.setAuthenticationCode2(this.authenticationCode2)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.EnableMFADeviceResult {
	  return com.amazonaws.services.identitymanagement.model.EnableMFADeviceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.EnableMFADeviceResult {
		return environment.iam.enableMFADevice(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam enable-mfadevice")
				.argument("user-name", userName)
				.argument("serial-number", serialNumber)
				.argument("authentication-code1", authenticationCode1)
				.argument("authentication-code2", authenticationCode2)
	}

}


fun AmazonIdentityManagementFunctions.generateCredentialReport(init: (AmazonIdentityManagementGenerateCredentialReportCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.GenerateCredentialReportResult {
	return this.block.declare(AmazonIdentityManagementGenerateCredentialReportCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.GenerateCredentialReportResult
}

@Generated
class AmazonIdentityManagementGenerateCredentialReportCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GenerateCredentialReportRequest, com.amazonaws.services.identitymanagement.model.GenerateCredentialReportResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.GenerateCredentialReportRequest {
		val input = com.amazonaws.services.identitymanagement.model.GenerateCredentialReportRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.GenerateCredentialReportResult {
	  return com.amazonaws.services.identitymanagement.model.GenerateCredentialReportResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.GenerateCredentialReportResult {
		return environment.iam.generateCredentialReport(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam generate-credential-report")

	}

}


fun AmazonIdentityManagementFunctions.getAccessKeyLastUsed(accessKeyId: String, init: (AmazonIdentityManagementGetAccessKeyLastUsedCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.GetAccessKeyLastUsedResult {
	return this.block.declare(AmazonIdentityManagementGetAccessKeyLastUsedCommand(accessKeyId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.GetAccessKeyLastUsedResult
}

@Generated
class AmazonIdentityManagementGetAccessKeyLastUsedCommand(val accessKeyId: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetAccessKeyLastUsedRequest, com.amazonaws.services.identitymanagement.model.GetAccessKeyLastUsedResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.GetAccessKeyLastUsedRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetAccessKeyLastUsedRequest()
		input.setAccessKeyId(this.accessKeyId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.GetAccessKeyLastUsedResult {
	  return com.amazonaws.services.identitymanagement.model.GetAccessKeyLastUsedResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.GetAccessKeyLastUsedResult {
		return environment.iam.getAccessKeyLastUsed(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-access-key-last-used")
				.argument("access-key-id", accessKeyId)
	}

}


fun AmazonIdentityManagementFunctions.getAccountAuthorizationDetails(init: (AmazonIdentityManagementGetAccountAuthorizationDetailsCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.GetAccountAuthorizationDetailsResult {
	return this.block.declare(AmazonIdentityManagementGetAccountAuthorizationDetailsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.GetAccountAuthorizationDetailsResult
}

@Generated
class AmazonIdentityManagementGetAccountAuthorizationDetailsCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetAccountAuthorizationDetailsRequest, com.amazonaws.services.identitymanagement.model.GetAccountAuthorizationDetailsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.GetAccountAuthorizationDetailsResult {
	  return com.amazonaws.services.identitymanagement.model.GetAccountAuthorizationDetailsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.GetAccountAuthorizationDetailsResult {
		return environment.iam.getAccountAuthorizationDetails(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-account-authorization-details")
				.argument("filter", filter?.toString())
				.argument("max-items", maxItems?.toString())
				.argument("marker", marker)
	}

}


fun AmazonIdentityManagementFunctions.getAccountPasswordPolicy(init: (AmazonIdentityManagementGetAccountPasswordPolicyCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.GetAccountPasswordPolicyResult {
	return this.block.declare(AmazonIdentityManagementGetAccountPasswordPolicyCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.GetAccountPasswordPolicyResult
}

@Generated
class AmazonIdentityManagementGetAccountPasswordPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetAccountPasswordPolicyRequest, com.amazonaws.services.identitymanagement.model.GetAccountPasswordPolicyResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.GetAccountPasswordPolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetAccountPasswordPolicyRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.GetAccountPasswordPolicyResult {
	  return com.amazonaws.services.identitymanagement.model.GetAccountPasswordPolicyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.GetAccountPasswordPolicyResult {
		return environment.iam.getAccountPasswordPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-account-password-policy")

	}

}


fun AmazonIdentityManagementFunctions.getAccountSummary(init: (AmazonIdentityManagementGetAccountSummaryCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.GetAccountSummaryResult {
	return this.block.declare(AmazonIdentityManagementGetAccountSummaryCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.GetAccountSummaryResult
}

@Generated
class AmazonIdentityManagementGetAccountSummaryCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetAccountSummaryRequest, com.amazonaws.services.identitymanagement.model.GetAccountSummaryResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.GetAccountSummaryRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetAccountSummaryRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.GetAccountSummaryResult {
	  return com.amazonaws.services.identitymanagement.model.GetAccountSummaryResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.GetAccountSummaryResult {
		return environment.iam.getAccountSummary(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-account-summary")

	}

}


fun AmazonIdentityManagementFunctions.getContextKeysForCustomPolicy(policyInputList: List<String>, init: (AmazonIdentityManagementGetContextKeysForCustomPolicyCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.GetContextKeysForCustomPolicyResult {
	return this.block.declare(AmazonIdentityManagementGetContextKeysForCustomPolicyCommand(policyInputList).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.GetContextKeysForCustomPolicyResult
}

@Generated
class AmazonIdentityManagementGetContextKeysForCustomPolicyCommand(val policyInputList: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetContextKeysForCustomPolicyRequest, com.amazonaws.services.identitymanagement.model.GetContextKeysForCustomPolicyResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.GetContextKeysForCustomPolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetContextKeysForCustomPolicyRequest()
		input.setPolicyInputList(this.policyInputList)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.GetContextKeysForCustomPolicyResult {
	  return com.amazonaws.services.identitymanagement.model.GetContextKeysForCustomPolicyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.GetContextKeysForCustomPolicyResult {
		return environment.iam.getContextKeysForCustomPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-context-keys-for-custom-policy")
				.argument("policy-input-list", policyInputList.toString())
	}

}


fun AmazonIdentityManagementFunctions.getContextKeysForPrincipalPolicy(policySourceArn: String, init: (AmazonIdentityManagementGetContextKeysForPrincipalPolicyCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.GetContextKeysForPrincipalPolicyResult {
	return this.block.declare(AmazonIdentityManagementGetContextKeysForPrincipalPolicyCommand(policySourceArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.GetContextKeysForPrincipalPolicyResult
}

@Generated
class AmazonIdentityManagementGetContextKeysForPrincipalPolicyCommand(val policySourceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetContextKeysForPrincipalPolicyRequest, com.amazonaws.services.identitymanagement.model.GetContextKeysForPrincipalPolicyResult> {

	var policyInputList: List<String>? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.GetContextKeysForPrincipalPolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetContextKeysForPrincipalPolicyRequest()
		input.setPolicySourceArn(this.policySourceArn)
		input.setPolicyInputList(this.policyInputList)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.GetContextKeysForPrincipalPolicyResult {
	  return com.amazonaws.services.identitymanagement.model.GetContextKeysForPrincipalPolicyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.GetContextKeysForPrincipalPolicyResult {
		return environment.iam.getContextKeysForPrincipalPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-context-keys-for-principal-policy")
				.argument("policy-source-arn", policySourceArn)
				.argument("policy-input-list", policyInputList?.toString())
	}

}


fun AmazonIdentityManagementFunctions.getCredentialReport(init: (AmazonIdentityManagementGetCredentialReportCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.GetCredentialReportResult {
	return this.block.declare(AmazonIdentityManagementGetCredentialReportCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.GetCredentialReportResult
}

@Generated
class AmazonIdentityManagementGetCredentialReportCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetCredentialReportRequest, com.amazonaws.services.identitymanagement.model.GetCredentialReportResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.GetCredentialReportRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetCredentialReportRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.GetCredentialReportResult {
	  return com.amazonaws.services.identitymanagement.model.GetCredentialReportResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.GetCredentialReportResult {
		return environment.iam.getCredentialReport(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-credential-report")

	}

}


fun AmazonIdentityManagementFunctions.getGroup(groupName: String, init: (AmazonIdentityManagementGetGroupCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.GetGroupResult {
	return this.block.declare(AmazonIdentityManagementGetGroupCommand(groupName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.GetGroupResult
}

@Generated
class AmazonIdentityManagementGetGroupCommand(val groupName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetGroupRequest, com.amazonaws.services.identitymanagement.model.GetGroupResult> {

	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.identitymanagement.model.GetGroupRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetGroupRequest()
		input.setGroupName(this.groupName)
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.GetGroupResult {
	  return com.amazonaws.services.identitymanagement.model.GetGroupResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.GetGroupResult {
		return environment.iam.getGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-group")
				.argument("group-name", groupName)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.getGroupPolicy(groupName: String, policyName: String, init: (AmazonIdentityManagementGetGroupPolicyCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.GetGroupPolicyResult {
	return this.block.declare(AmazonIdentityManagementGetGroupPolicyCommand(groupName, policyName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.GetGroupPolicyResult
}

@Generated
class AmazonIdentityManagementGetGroupPolicyCommand(val groupName: String, val policyName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetGroupPolicyRequest, com.amazonaws.services.identitymanagement.model.GetGroupPolicyResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.GetGroupPolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetGroupPolicyRequest()
		input.setGroupName(this.groupName)
		input.setPolicyName(this.policyName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.GetGroupPolicyResult {
	  return com.amazonaws.services.identitymanagement.model.GetGroupPolicyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.GetGroupPolicyResult {
		return environment.iam.getGroupPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-group-policy")
				.argument("group-name", groupName)
				.argument("policy-name", policyName)
	}

}


fun AmazonIdentityManagementFunctions.getInstanceProfile(instanceProfileName: String, init: (AmazonIdentityManagementGetInstanceProfileCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.GetInstanceProfileResult {
	return this.block.declare(AmazonIdentityManagementGetInstanceProfileCommand(instanceProfileName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.GetInstanceProfileResult
}

@Generated
class AmazonIdentityManagementGetInstanceProfileCommand(val instanceProfileName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetInstanceProfileRequest, com.amazonaws.services.identitymanagement.model.GetInstanceProfileResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.GetInstanceProfileRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetInstanceProfileRequest()
		input.setInstanceProfileName(this.instanceProfileName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.GetInstanceProfileResult {
	  return com.amazonaws.services.identitymanagement.model.GetInstanceProfileResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.GetInstanceProfileResult {
		return environment.iam.getInstanceProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-instance-profile")
				.argument("instance-profile-name", instanceProfileName)
	}

}


fun AmazonIdentityManagementFunctions.getLoginProfile(userName: String, init: (AmazonIdentityManagementGetLoginProfileCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.GetLoginProfileResult {
	return this.block.declare(AmazonIdentityManagementGetLoginProfileCommand(userName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.GetLoginProfileResult
}

@Generated
class AmazonIdentityManagementGetLoginProfileCommand(val userName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetLoginProfileRequest, com.amazonaws.services.identitymanagement.model.GetLoginProfileResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.GetLoginProfileRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetLoginProfileRequest()
		input.setUserName(this.userName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.GetLoginProfileResult {
	  return com.amazonaws.services.identitymanagement.model.GetLoginProfileResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.GetLoginProfileResult {
		return environment.iam.getLoginProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-login-profile")
				.argument("user-name", userName)
	}

}


fun AmazonIdentityManagementFunctions.getOpenIDConnectProvider(openIDConnectProviderArn: String, init: (AmazonIdentityManagementGetOpenIDConnectProviderCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.GetOpenIDConnectProviderResult {
	return this.block.declare(AmazonIdentityManagementGetOpenIDConnectProviderCommand(openIDConnectProviderArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.GetOpenIDConnectProviderResult
}

@Generated
class AmazonIdentityManagementGetOpenIDConnectProviderCommand(val openIDConnectProviderArn: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetOpenIDConnectProviderRequest, com.amazonaws.services.identitymanagement.model.GetOpenIDConnectProviderResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.GetOpenIDConnectProviderRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetOpenIDConnectProviderRequest()
		input.setOpenIDConnectProviderArn(this.openIDConnectProviderArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.GetOpenIDConnectProviderResult {
	  return com.amazonaws.services.identitymanagement.model.GetOpenIDConnectProviderResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.GetOpenIDConnectProviderResult {
		return environment.iam.getOpenIDConnectProvider(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-open-idconnect-provider")
				.argument("open-idconnect-provider-arn", openIDConnectProviderArn)
	}

}


fun AmazonIdentityManagementFunctions.getPolicy(policyArn: String, init: (AmazonIdentityManagementGetPolicyCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.GetPolicyResult {
	return this.block.declare(AmazonIdentityManagementGetPolicyCommand(policyArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.GetPolicyResult
}

@Generated
class AmazonIdentityManagementGetPolicyCommand(val policyArn: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetPolicyRequest, com.amazonaws.services.identitymanagement.model.GetPolicyResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.GetPolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetPolicyRequest()
		input.setPolicyArn(this.policyArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.GetPolicyResult {
	  return com.amazonaws.services.identitymanagement.model.GetPolicyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.GetPolicyResult {
		return environment.iam.getPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-policy")
				.argument("policy-arn", policyArn)
	}

}


fun AmazonIdentityManagementFunctions.getPolicyVersion(policyArn: String, versionId: String, init: (AmazonIdentityManagementGetPolicyVersionCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.GetPolicyVersionResult {
	return this.block.declare(AmazonIdentityManagementGetPolicyVersionCommand(policyArn, versionId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.GetPolicyVersionResult
}

@Generated
class AmazonIdentityManagementGetPolicyVersionCommand(val policyArn: String, val versionId: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetPolicyVersionRequest, com.amazonaws.services.identitymanagement.model.GetPolicyVersionResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.GetPolicyVersionRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetPolicyVersionRequest()
		input.setPolicyArn(this.policyArn)
		input.setVersionId(this.versionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.GetPolicyVersionResult {
	  return com.amazonaws.services.identitymanagement.model.GetPolicyVersionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.GetPolicyVersionResult {
		return environment.iam.getPolicyVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-policy-version")
				.argument("policy-arn", policyArn)
				.argument("version-id", versionId)
	}

}


fun AmazonIdentityManagementFunctions.getRole(roleName: String, init: (AmazonIdentityManagementGetRoleCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.GetRoleResult {
	return this.block.declare(AmazonIdentityManagementGetRoleCommand(roleName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.GetRoleResult
}

@Generated
class AmazonIdentityManagementGetRoleCommand(val roleName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetRoleRequest, com.amazonaws.services.identitymanagement.model.GetRoleResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.GetRoleRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetRoleRequest()
		input.setRoleName(this.roleName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.GetRoleResult {
	  return com.amazonaws.services.identitymanagement.model.GetRoleResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.GetRoleResult {
		return environment.iam.getRole(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-role")
				.argument("role-name", roleName)
	}

}


fun AmazonIdentityManagementFunctions.getRolePolicy(roleName: String, policyName: String, init: (AmazonIdentityManagementGetRolePolicyCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.GetRolePolicyResult {
	return this.block.declare(AmazonIdentityManagementGetRolePolicyCommand(roleName, policyName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.GetRolePolicyResult
}

@Generated
class AmazonIdentityManagementGetRolePolicyCommand(val roleName: String, val policyName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetRolePolicyRequest, com.amazonaws.services.identitymanagement.model.GetRolePolicyResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.GetRolePolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetRolePolicyRequest()
		input.setRoleName(this.roleName)
		input.setPolicyName(this.policyName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.GetRolePolicyResult {
	  return com.amazonaws.services.identitymanagement.model.GetRolePolicyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.GetRolePolicyResult {
		return environment.iam.getRolePolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-role-policy")
				.argument("role-name", roleName)
				.argument("policy-name", policyName)
	}

}


fun AmazonIdentityManagementFunctions.getSAMLProvider(sAMLProviderArn: String, init: (AmazonIdentityManagementGetSAMLProviderCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.GetSAMLProviderResult {
	return this.block.declare(AmazonIdentityManagementGetSAMLProviderCommand(sAMLProviderArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.GetSAMLProviderResult
}

@Generated
class AmazonIdentityManagementGetSAMLProviderCommand(val sAMLProviderArn: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetSAMLProviderRequest, com.amazonaws.services.identitymanagement.model.GetSAMLProviderResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.GetSAMLProviderRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetSAMLProviderRequest()
		input.setSAMLProviderArn(this.sAMLProviderArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.GetSAMLProviderResult {
	  return com.amazonaws.services.identitymanagement.model.GetSAMLProviderResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.GetSAMLProviderResult {
		return environment.iam.getSAMLProvider(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-samlprovider")
				.argument("samlprovider-arn", sAMLProviderArn)
	}

}


fun AmazonIdentityManagementFunctions.getSSHPublicKey(userName: String, sSHPublicKeyId: String, encoding: String, init: (AmazonIdentityManagementGetSSHPublicKeyCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.GetSSHPublicKeyResult {
	return this.block.declare(AmazonIdentityManagementGetSSHPublicKeyCommand(userName, sSHPublicKeyId, encoding).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.GetSSHPublicKeyResult
}

@Generated
class AmazonIdentityManagementGetSSHPublicKeyCommand(val userName: String, val sSHPublicKeyId: String, val encoding: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetSSHPublicKeyRequest, com.amazonaws.services.identitymanagement.model.GetSSHPublicKeyResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.GetSSHPublicKeyRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetSSHPublicKeyRequest()
		input.setUserName(this.userName)
		input.setSSHPublicKeyId(this.sSHPublicKeyId)
		input.setEncoding(this.encoding)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.GetSSHPublicKeyResult {
	  return com.amazonaws.services.identitymanagement.model.GetSSHPublicKeyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.GetSSHPublicKeyResult {
		return environment.iam.getSSHPublicKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-sshpublic-key")
				.argument("user-name", userName)
				.argument("sshpublic-key-id", sSHPublicKeyId)
				.argument("encoding", encoding)
	}

}


fun AmazonIdentityManagementFunctions.getServerCertificate(serverCertificateName: String, init: (AmazonIdentityManagementGetServerCertificateCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.GetServerCertificateResult {
	return this.block.declare(AmazonIdentityManagementGetServerCertificateCommand(serverCertificateName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.GetServerCertificateResult
}

@Generated
class AmazonIdentityManagementGetServerCertificateCommand(val serverCertificateName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetServerCertificateRequest, com.amazonaws.services.identitymanagement.model.GetServerCertificateResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.GetServerCertificateRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetServerCertificateRequest()
		input.setServerCertificateName(this.serverCertificateName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.GetServerCertificateResult {
	  return com.amazonaws.services.identitymanagement.model.GetServerCertificateResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.GetServerCertificateResult {
		return environment.iam.getServerCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-server-certificate")
				.argument("server-certificate-name", serverCertificateName)
	}

}


fun AmazonIdentityManagementFunctions.getServiceLinkedRoleDeletionStatus(deletionTaskId: String, init: (AmazonIdentityManagementGetServiceLinkedRoleDeletionStatusCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.GetServiceLinkedRoleDeletionStatusResult {
	return this.block.declare(AmazonIdentityManagementGetServiceLinkedRoleDeletionStatusCommand(deletionTaskId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.GetServiceLinkedRoleDeletionStatusResult
}

@Generated
class AmazonIdentityManagementGetServiceLinkedRoleDeletionStatusCommand(val deletionTaskId: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetServiceLinkedRoleDeletionStatusRequest, com.amazonaws.services.identitymanagement.model.GetServiceLinkedRoleDeletionStatusResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.GetServiceLinkedRoleDeletionStatusRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetServiceLinkedRoleDeletionStatusRequest()
		input.setDeletionTaskId(this.deletionTaskId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.GetServiceLinkedRoleDeletionStatusResult {
	  return com.amazonaws.services.identitymanagement.model.GetServiceLinkedRoleDeletionStatusResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.GetServiceLinkedRoleDeletionStatusResult {
		return environment.iam.getServiceLinkedRoleDeletionStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-service-linked-role-deletion-status")
				.argument("deletion-task-id", deletionTaskId)
	}

}


fun AmazonIdentityManagementFunctions.getUser(init: (AmazonIdentityManagementGetUserCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.GetUserResult {
	return this.block.declare(AmazonIdentityManagementGetUserCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.GetUserResult
}

@Generated
class AmazonIdentityManagementGetUserCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetUserRequest, com.amazonaws.services.identitymanagement.model.GetUserResult> {

	var userName: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.GetUserRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetUserRequest()
		input.setUserName(this.userName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.GetUserResult {
	  return com.amazonaws.services.identitymanagement.model.GetUserResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.GetUserResult {
		return environment.iam.getUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-user")
				.argument("user-name", userName)
	}

}


fun AmazonIdentityManagementFunctions.getUserPolicy(userName: String, policyName: String, init: (AmazonIdentityManagementGetUserPolicyCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.GetUserPolicyResult {
	return this.block.declare(AmazonIdentityManagementGetUserPolicyCommand(userName, policyName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.GetUserPolicyResult
}

@Generated
class AmazonIdentityManagementGetUserPolicyCommand(val userName: String, val policyName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.GetUserPolicyRequest, com.amazonaws.services.identitymanagement.model.GetUserPolicyResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.GetUserPolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.GetUserPolicyRequest()
		input.setUserName(this.userName)
		input.setPolicyName(this.policyName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.GetUserPolicyResult {
	  return com.amazonaws.services.identitymanagement.model.GetUserPolicyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.GetUserPolicyResult {
		return environment.iam.getUserPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam get-user-policy")
				.argument("user-name", userName)
				.argument("policy-name", policyName)
	}

}


fun AmazonIdentityManagementFunctions.listAccessKeys(init: (AmazonIdentityManagementListAccessKeysCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.ListAccessKeysResult {
	return this.block.declare(AmazonIdentityManagementListAccessKeysCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.ListAccessKeysResult
}

@Generated
class AmazonIdentityManagementListAccessKeysCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListAccessKeysRequest, com.amazonaws.services.identitymanagement.model.ListAccessKeysResult> {

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

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.ListAccessKeysResult {
	  return com.amazonaws.services.identitymanagement.model.ListAccessKeysResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.ListAccessKeysResult {
		return environment.iam.listAccessKeys(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-access-keys")
				.argument("user-name", userName)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listAccountAliases(init: (AmazonIdentityManagementListAccountAliasesCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.ListAccountAliasesResult {
	return this.block.declare(AmazonIdentityManagementListAccountAliasesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.ListAccountAliasesResult
}

@Generated
class AmazonIdentityManagementListAccountAliasesCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListAccountAliasesRequest, com.amazonaws.services.identitymanagement.model.ListAccountAliasesResult> {

	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.identitymanagement.model.ListAccountAliasesRequest {
		val input = com.amazonaws.services.identitymanagement.model.ListAccountAliasesRequest()
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.ListAccountAliasesResult {
	  return com.amazonaws.services.identitymanagement.model.ListAccountAliasesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.ListAccountAliasesResult {
		return environment.iam.listAccountAliases(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-account-aliases")
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listAttachedGroupPolicies(groupName: String, init: (AmazonIdentityManagementListAttachedGroupPoliciesCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.ListAttachedGroupPoliciesResult {
	return this.block.declare(AmazonIdentityManagementListAttachedGroupPoliciesCommand(groupName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.ListAttachedGroupPoliciesResult
}

@Generated
class AmazonIdentityManagementListAttachedGroupPoliciesCommand(val groupName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListAttachedGroupPoliciesRequest, com.amazonaws.services.identitymanagement.model.ListAttachedGroupPoliciesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.ListAttachedGroupPoliciesResult {
	  return com.amazonaws.services.identitymanagement.model.ListAttachedGroupPoliciesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.ListAttachedGroupPoliciesResult {
		return environment.iam.listAttachedGroupPolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-attached-group-policies")
				.argument("group-name", groupName)
				.argument("path-prefix", pathPrefix)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listAttachedRolePolicies(roleName: String, init: (AmazonIdentityManagementListAttachedRolePoliciesCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.ListAttachedRolePoliciesResult {
	return this.block.declare(AmazonIdentityManagementListAttachedRolePoliciesCommand(roleName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.ListAttachedRolePoliciesResult
}

@Generated
class AmazonIdentityManagementListAttachedRolePoliciesCommand(val roleName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListAttachedRolePoliciesRequest, com.amazonaws.services.identitymanagement.model.ListAttachedRolePoliciesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.ListAttachedRolePoliciesResult {
	  return com.amazonaws.services.identitymanagement.model.ListAttachedRolePoliciesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.ListAttachedRolePoliciesResult {
		return environment.iam.listAttachedRolePolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-attached-role-policies")
				.argument("role-name", roleName)
				.argument("path-prefix", pathPrefix)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listAttachedUserPolicies(userName: String, init: (AmazonIdentityManagementListAttachedUserPoliciesCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.ListAttachedUserPoliciesResult {
	return this.block.declare(AmazonIdentityManagementListAttachedUserPoliciesCommand(userName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.ListAttachedUserPoliciesResult
}

@Generated
class AmazonIdentityManagementListAttachedUserPoliciesCommand(val userName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListAttachedUserPoliciesRequest, com.amazonaws.services.identitymanagement.model.ListAttachedUserPoliciesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.ListAttachedUserPoliciesResult {
	  return com.amazonaws.services.identitymanagement.model.ListAttachedUserPoliciesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.ListAttachedUserPoliciesResult {
		return environment.iam.listAttachedUserPolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-attached-user-policies")
				.argument("user-name", userName)
				.argument("path-prefix", pathPrefix)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listEntitiesForPolicy(policyArn: String, init: (AmazonIdentityManagementListEntitiesForPolicyCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.ListEntitiesForPolicyResult {
	return this.block.declare(AmazonIdentityManagementListEntitiesForPolicyCommand(policyArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.ListEntitiesForPolicyResult
}

@Generated
class AmazonIdentityManagementListEntitiesForPolicyCommand(val policyArn: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListEntitiesForPolicyRequest, com.amazonaws.services.identitymanagement.model.ListEntitiesForPolicyResult> {

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

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.ListEntitiesForPolicyResult {
	  return com.amazonaws.services.identitymanagement.model.ListEntitiesForPolicyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.ListEntitiesForPolicyResult {
		return environment.iam.listEntitiesForPolicy(build())
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


fun AmazonIdentityManagementFunctions.listGroupPolicies(groupName: String, init: (AmazonIdentityManagementListGroupPoliciesCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.ListGroupPoliciesResult {
	return this.block.declare(AmazonIdentityManagementListGroupPoliciesCommand(groupName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.ListGroupPoliciesResult
}

@Generated
class AmazonIdentityManagementListGroupPoliciesCommand(val groupName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListGroupPoliciesRequest, com.amazonaws.services.identitymanagement.model.ListGroupPoliciesResult> {

	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.identitymanagement.model.ListGroupPoliciesRequest {
		val input = com.amazonaws.services.identitymanagement.model.ListGroupPoliciesRequest()
		input.setGroupName(this.groupName)
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.ListGroupPoliciesResult {
	  return com.amazonaws.services.identitymanagement.model.ListGroupPoliciesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.ListGroupPoliciesResult {
		return environment.iam.listGroupPolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-group-policies")
				.argument("group-name", groupName)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listGroups(init: (AmazonIdentityManagementListGroupsCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.ListGroupsResult {
	return this.block.declare(AmazonIdentityManagementListGroupsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.ListGroupsResult
}

@Generated
class AmazonIdentityManagementListGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListGroupsRequest, com.amazonaws.services.identitymanagement.model.ListGroupsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.ListGroupsResult {
	  return com.amazonaws.services.identitymanagement.model.ListGroupsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.ListGroupsResult {
		return environment.iam.listGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-groups")
				.argument("path-prefix", pathPrefix)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listGroupsForUser(userName: String, init: (AmazonIdentityManagementListGroupsForUserCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.ListGroupsForUserResult {
	return this.block.declare(AmazonIdentityManagementListGroupsForUserCommand(userName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.ListGroupsForUserResult
}

@Generated
class AmazonIdentityManagementListGroupsForUserCommand(val userName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListGroupsForUserRequest, com.amazonaws.services.identitymanagement.model.ListGroupsForUserResult> {

	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.identitymanagement.model.ListGroupsForUserRequest {
		val input = com.amazonaws.services.identitymanagement.model.ListGroupsForUserRequest()
		input.setUserName(this.userName)
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.ListGroupsForUserResult {
	  return com.amazonaws.services.identitymanagement.model.ListGroupsForUserResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.ListGroupsForUserResult {
		return environment.iam.listGroupsForUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-groups-for-user")
				.argument("user-name", userName)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listInstanceProfiles(init: (AmazonIdentityManagementListInstanceProfilesCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.ListInstanceProfilesResult {
	return this.block.declare(AmazonIdentityManagementListInstanceProfilesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.ListInstanceProfilesResult
}

@Generated
class AmazonIdentityManagementListInstanceProfilesCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListInstanceProfilesRequest, com.amazonaws.services.identitymanagement.model.ListInstanceProfilesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.ListInstanceProfilesResult {
	  return com.amazonaws.services.identitymanagement.model.ListInstanceProfilesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.ListInstanceProfilesResult {
		return environment.iam.listInstanceProfiles(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-instance-profiles")
				.argument("path-prefix", pathPrefix)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listInstanceProfilesForRole(roleName: String, init: (AmazonIdentityManagementListInstanceProfilesForRoleCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.ListInstanceProfilesForRoleResult {
	return this.block.declare(AmazonIdentityManagementListInstanceProfilesForRoleCommand(roleName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.ListInstanceProfilesForRoleResult
}

@Generated
class AmazonIdentityManagementListInstanceProfilesForRoleCommand(val roleName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListInstanceProfilesForRoleRequest, com.amazonaws.services.identitymanagement.model.ListInstanceProfilesForRoleResult> {

	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.identitymanagement.model.ListInstanceProfilesForRoleRequest {
		val input = com.amazonaws.services.identitymanagement.model.ListInstanceProfilesForRoleRequest()
		input.setRoleName(this.roleName)
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.ListInstanceProfilesForRoleResult {
	  return com.amazonaws.services.identitymanagement.model.ListInstanceProfilesForRoleResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.ListInstanceProfilesForRoleResult {
		return environment.iam.listInstanceProfilesForRole(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-instance-profiles-for-role")
				.argument("role-name", roleName)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listMFADevices(init: (AmazonIdentityManagementListMFADevicesCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.ListMFADevicesResult {
	return this.block.declare(AmazonIdentityManagementListMFADevicesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.ListMFADevicesResult
}

@Generated
class AmazonIdentityManagementListMFADevicesCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListMFADevicesRequest, com.amazonaws.services.identitymanagement.model.ListMFADevicesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.ListMFADevicesResult {
	  return com.amazonaws.services.identitymanagement.model.ListMFADevicesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.ListMFADevicesResult {
		return environment.iam.listMFADevices(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-mfadevices")
				.argument("user-name", userName)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listOpenIDConnectProviders(init: (AmazonIdentityManagementListOpenIDConnectProvidersCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.ListOpenIDConnectProvidersResult {
	return this.block.declare(AmazonIdentityManagementListOpenIDConnectProvidersCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.ListOpenIDConnectProvidersResult
}

@Generated
class AmazonIdentityManagementListOpenIDConnectProvidersCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListOpenIDConnectProvidersRequest, com.amazonaws.services.identitymanagement.model.ListOpenIDConnectProvidersResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.ListOpenIDConnectProvidersRequest {
		val input = com.amazonaws.services.identitymanagement.model.ListOpenIDConnectProvidersRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.ListOpenIDConnectProvidersResult {
	  return com.amazonaws.services.identitymanagement.model.ListOpenIDConnectProvidersResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.ListOpenIDConnectProvidersResult {
		return environment.iam.listOpenIDConnectProviders(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-open-idconnect-providers")

	}

}


fun AmazonIdentityManagementFunctions.listPolicies(init: (AmazonIdentityManagementListPoliciesCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.ListPoliciesResult {
	return this.block.declare(AmazonIdentityManagementListPoliciesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.ListPoliciesResult
}

@Generated
class AmazonIdentityManagementListPoliciesCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListPoliciesRequest, com.amazonaws.services.identitymanagement.model.ListPoliciesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.ListPoliciesResult {
	  return com.amazonaws.services.identitymanagement.model.ListPoliciesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.ListPoliciesResult {
		return environment.iam.listPolicies(build())
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


fun AmazonIdentityManagementFunctions.listPolicyVersions(policyArn: String, init: (AmazonIdentityManagementListPolicyVersionsCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.ListPolicyVersionsResult {
	return this.block.declare(AmazonIdentityManagementListPolicyVersionsCommand(policyArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.ListPolicyVersionsResult
}

@Generated
class AmazonIdentityManagementListPolicyVersionsCommand(val policyArn: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListPolicyVersionsRequest, com.amazonaws.services.identitymanagement.model.ListPolicyVersionsResult> {

	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.identitymanagement.model.ListPolicyVersionsRequest {
		val input = com.amazonaws.services.identitymanagement.model.ListPolicyVersionsRequest()
		input.setPolicyArn(this.policyArn)
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.ListPolicyVersionsResult {
	  return com.amazonaws.services.identitymanagement.model.ListPolicyVersionsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.ListPolicyVersionsResult {
		return environment.iam.listPolicyVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-policy-versions")
				.argument("policy-arn", policyArn)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listRolePolicies(roleName: String, init: (AmazonIdentityManagementListRolePoliciesCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.ListRolePoliciesResult {
	return this.block.declare(AmazonIdentityManagementListRolePoliciesCommand(roleName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.ListRolePoliciesResult
}

@Generated
class AmazonIdentityManagementListRolePoliciesCommand(val roleName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListRolePoliciesRequest, com.amazonaws.services.identitymanagement.model.ListRolePoliciesResult> {

	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.identitymanagement.model.ListRolePoliciesRequest {
		val input = com.amazonaws.services.identitymanagement.model.ListRolePoliciesRequest()
		input.setRoleName(this.roleName)
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.ListRolePoliciesResult {
	  return com.amazonaws.services.identitymanagement.model.ListRolePoliciesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.ListRolePoliciesResult {
		return environment.iam.listRolePolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-role-policies")
				.argument("role-name", roleName)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listRoles(init: (AmazonIdentityManagementListRolesCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.ListRolesResult {
	return this.block.declare(AmazonIdentityManagementListRolesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.ListRolesResult
}

@Generated
class AmazonIdentityManagementListRolesCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListRolesRequest, com.amazonaws.services.identitymanagement.model.ListRolesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.ListRolesResult {
	  return com.amazonaws.services.identitymanagement.model.ListRolesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.ListRolesResult {
		return environment.iam.listRoles(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-roles")
				.argument("path-prefix", pathPrefix)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listSAMLProviders(init: (AmazonIdentityManagementListSAMLProvidersCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.ListSAMLProvidersResult {
	return this.block.declare(AmazonIdentityManagementListSAMLProvidersCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.ListSAMLProvidersResult
}

@Generated
class AmazonIdentityManagementListSAMLProvidersCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListSAMLProvidersRequest, com.amazonaws.services.identitymanagement.model.ListSAMLProvidersResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.ListSAMLProvidersRequest {
		val input = com.amazonaws.services.identitymanagement.model.ListSAMLProvidersRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.ListSAMLProvidersResult {
	  return com.amazonaws.services.identitymanagement.model.ListSAMLProvidersResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.ListSAMLProvidersResult {
		return environment.iam.listSAMLProviders(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-samlproviders")

	}

}


fun AmazonIdentityManagementFunctions.listSSHPublicKeys(init: (AmazonIdentityManagementListSSHPublicKeysCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.ListSSHPublicKeysResult {
	return this.block.declare(AmazonIdentityManagementListSSHPublicKeysCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.ListSSHPublicKeysResult
}

@Generated
class AmazonIdentityManagementListSSHPublicKeysCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListSSHPublicKeysRequest, com.amazonaws.services.identitymanagement.model.ListSSHPublicKeysResult> {

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

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.ListSSHPublicKeysResult {
	  return com.amazonaws.services.identitymanagement.model.ListSSHPublicKeysResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.ListSSHPublicKeysResult {
		return environment.iam.listSSHPublicKeys(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-sshpublic-keys")
				.argument("user-name", userName)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listServerCertificates(init: (AmazonIdentityManagementListServerCertificatesCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.ListServerCertificatesResult {
	return this.block.declare(AmazonIdentityManagementListServerCertificatesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.ListServerCertificatesResult
}

@Generated
class AmazonIdentityManagementListServerCertificatesCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListServerCertificatesRequest, com.amazonaws.services.identitymanagement.model.ListServerCertificatesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.ListServerCertificatesResult {
	  return com.amazonaws.services.identitymanagement.model.ListServerCertificatesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.ListServerCertificatesResult {
		return environment.iam.listServerCertificates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-server-certificates")
				.argument("path-prefix", pathPrefix)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listServiceSpecificCredentials(init: (AmazonIdentityManagementListServiceSpecificCredentialsCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.ListServiceSpecificCredentialsResult {
	return this.block.declare(AmazonIdentityManagementListServiceSpecificCredentialsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.ListServiceSpecificCredentialsResult
}

@Generated
class AmazonIdentityManagementListServiceSpecificCredentialsCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListServiceSpecificCredentialsRequest, com.amazonaws.services.identitymanagement.model.ListServiceSpecificCredentialsResult> {

	var userName: String? = null
	var serviceName: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.ListServiceSpecificCredentialsRequest {
		val input = com.amazonaws.services.identitymanagement.model.ListServiceSpecificCredentialsRequest()
		input.setUserName(this.userName)
		input.setServiceName(this.serviceName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.ListServiceSpecificCredentialsResult {
	  return com.amazonaws.services.identitymanagement.model.ListServiceSpecificCredentialsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.ListServiceSpecificCredentialsResult {
		return environment.iam.listServiceSpecificCredentials(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-service-specific-credentials")
				.argument("user-name", userName)
				.argument("service-name", serviceName)
	}

}


fun AmazonIdentityManagementFunctions.listSigningCertificates(init: (AmazonIdentityManagementListSigningCertificatesCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.ListSigningCertificatesResult {
	return this.block.declare(AmazonIdentityManagementListSigningCertificatesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.ListSigningCertificatesResult
}

@Generated
class AmazonIdentityManagementListSigningCertificatesCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListSigningCertificatesRequest, com.amazonaws.services.identitymanagement.model.ListSigningCertificatesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.ListSigningCertificatesResult {
	  return com.amazonaws.services.identitymanagement.model.ListSigningCertificatesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.ListSigningCertificatesResult {
		return environment.iam.listSigningCertificates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-signing-certificates")
				.argument("user-name", userName)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listUserPolicies(userName: String, init: (AmazonIdentityManagementListUserPoliciesCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.ListUserPoliciesResult {
	return this.block.declare(AmazonIdentityManagementListUserPoliciesCommand(userName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.ListUserPoliciesResult
}

@Generated
class AmazonIdentityManagementListUserPoliciesCommand(val userName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListUserPoliciesRequest, com.amazonaws.services.identitymanagement.model.ListUserPoliciesResult> {

	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.identitymanagement.model.ListUserPoliciesRequest {
		val input = com.amazonaws.services.identitymanagement.model.ListUserPoliciesRequest()
		input.setUserName(this.userName)
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.ListUserPoliciesResult {
	  return com.amazonaws.services.identitymanagement.model.ListUserPoliciesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.ListUserPoliciesResult {
		return environment.iam.listUserPolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-user-policies")
				.argument("user-name", userName)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listUsers(init: (AmazonIdentityManagementListUsersCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.ListUsersResult {
	return this.block.declare(AmazonIdentityManagementListUsersCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.ListUsersResult
}

@Generated
class AmazonIdentityManagementListUsersCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListUsersRequest, com.amazonaws.services.identitymanagement.model.ListUsersResult> {

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

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.ListUsersResult {
	  return com.amazonaws.services.identitymanagement.model.ListUsersResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.ListUsersResult {
		return environment.iam.listUsers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-users")
				.argument("path-prefix", pathPrefix)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.listVirtualMFADevices(init: (AmazonIdentityManagementListVirtualMFADevicesCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.ListVirtualMFADevicesResult {
	return this.block.declare(AmazonIdentityManagementListVirtualMFADevicesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.ListVirtualMFADevicesResult
}

@Generated
class AmazonIdentityManagementListVirtualMFADevicesCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ListVirtualMFADevicesRequest, com.amazonaws.services.identitymanagement.model.ListVirtualMFADevicesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.ListVirtualMFADevicesResult {
	  return com.amazonaws.services.identitymanagement.model.ListVirtualMFADevicesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.ListVirtualMFADevicesResult {
		return environment.iam.listVirtualMFADevices(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam list-virtual-mfadevices")
				.argument("assignment-status", assignmentStatus)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonIdentityManagementFunctions.putGroupPolicy(groupName: String, policyName: String, policyDocument: String, init: (AmazonIdentityManagementPutGroupPolicyCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.PutGroupPolicyResult {
	return this.block.declare(AmazonIdentityManagementPutGroupPolicyCommand(groupName, policyName, policyDocument).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.PutGroupPolicyResult
}

@Generated
class AmazonIdentityManagementPutGroupPolicyCommand(val groupName: String, val policyName: String, val policyDocument: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.PutGroupPolicyRequest, com.amazonaws.services.identitymanagement.model.PutGroupPolicyResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.PutGroupPolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.PutGroupPolicyRequest()
		input.setGroupName(this.groupName)
		input.setPolicyName(this.policyName)
		input.setPolicyDocument(this.policyDocument)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.PutGroupPolicyResult {
	  return com.amazonaws.services.identitymanagement.model.PutGroupPolicyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.PutGroupPolicyResult {
		return environment.iam.putGroupPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam put-group-policy")
				.argument("group-name", groupName)
				.argument("policy-name", policyName)
				.argument("policy-document", policyDocument)
	}

}


fun AmazonIdentityManagementFunctions.putRolePolicy(roleName: String, policyName: String, policyDocument: String, init: (AmazonIdentityManagementPutRolePolicyCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.PutRolePolicyResult {
	return this.block.declare(AmazonIdentityManagementPutRolePolicyCommand(roleName, policyName, policyDocument).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.PutRolePolicyResult
}

@Generated
class AmazonIdentityManagementPutRolePolicyCommand(val roleName: String, val policyName: String, val policyDocument: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.PutRolePolicyRequest, com.amazonaws.services.identitymanagement.model.PutRolePolicyResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.PutRolePolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.PutRolePolicyRequest()
		input.setRoleName(this.roleName)
		input.setPolicyName(this.policyName)
		input.setPolicyDocument(this.policyDocument)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.PutRolePolicyResult {
	  return com.amazonaws.services.identitymanagement.model.PutRolePolicyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.PutRolePolicyResult {
		return environment.iam.putRolePolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam put-role-policy")
				.argument("role-name", roleName)
				.argument("policy-name", policyName)
				.argument("policy-document", policyDocument)
	}

}


fun AmazonIdentityManagementFunctions.putUserPolicy(userName: String, policyName: String, policyDocument: String, init: (AmazonIdentityManagementPutUserPolicyCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.PutUserPolicyResult {
	return this.block.declare(AmazonIdentityManagementPutUserPolicyCommand(userName, policyName, policyDocument).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.PutUserPolicyResult
}

@Generated
class AmazonIdentityManagementPutUserPolicyCommand(val userName: String, val policyName: String, val policyDocument: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.PutUserPolicyRequest, com.amazonaws.services.identitymanagement.model.PutUserPolicyResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.PutUserPolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.PutUserPolicyRequest()
		input.setUserName(this.userName)
		input.setPolicyName(this.policyName)
		input.setPolicyDocument(this.policyDocument)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.PutUserPolicyResult {
	  return com.amazonaws.services.identitymanagement.model.PutUserPolicyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.PutUserPolicyResult {
		return environment.iam.putUserPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam put-user-policy")
				.argument("user-name", userName)
				.argument("policy-name", policyName)
				.argument("policy-document", policyDocument)
	}

}


fun AmazonIdentityManagementFunctions.removeClientIDFromOpenIDConnectProvider(openIDConnectProviderArn: String, clientID: String, init: (AmazonIdentityManagementRemoveClientIDFromOpenIDConnectProviderCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.RemoveClientIDFromOpenIDConnectProviderResult {
	return this.block.declare(AmazonIdentityManagementRemoveClientIDFromOpenIDConnectProviderCommand(openIDConnectProviderArn, clientID).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.RemoveClientIDFromOpenIDConnectProviderResult
}

@Generated
class AmazonIdentityManagementRemoveClientIDFromOpenIDConnectProviderCommand(val openIDConnectProviderArn: String, val clientID: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.RemoveClientIDFromOpenIDConnectProviderRequest, com.amazonaws.services.identitymanagement.model.RemoveClientIDFromOpenIDConnectProviderResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.RemoveClientIDFromOpenIDConnectProviderRequest {
		val input = com.amazonaws.services.identitymanagement.model.RemoveClientIDFromOpenIDConnectProviderRequest()
		input.setOpenIDConnectProviderArn(this.openIDConnectProviderArn)
		input.setClientID(this.clientID)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.RemoveClientIDFromOpenIDConnectProviderResult {
	  return com.amazonaws.services.identitymanagement.model.RemoveClientIDFromOpenIDConnectProviderResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.RemoveClientIDFromOpenIDConnectProviderResult {
		return environment.iam.removeClientIDFromOpenIDConnectProvider(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam remove-client-idfrom-open-idconnect-provider")
				.argument("open-idconnect-provider-arn", openIDConnectProviderArn)
				.argument("client-id", clientID)
	}

}


fun AmazonIdentityManagementFunctions.removeRoleFromInstanceProfile(instanceProfileName: String, roleName: String, init: (AmazonIdentityManagementRemoveRoleFromInstanceProfileCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.RemoveRoleFromInstanceProfileResult {
	return this.block.declare(AmazonIdentityManagementRemoveRoleFromInstanceProfileCommand(instanceProfileName, roleName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.RemoveRoleFromInstanceProfileResult
}

@Generated
class AmazonIdentityManagementRemoveRoleFromInstanceProfileCommand(val instanceProfileName: String, val roleName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.RemoveRoleFromInstanceProfileRequest, com.amazonaws.services.identitymanagement.model.RemoveRoleFromInstanceProfileResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.RemoveRoleFromInstanceProfileRequest {
		val input = com.amazonaws.services.identitymanagement.model.RemoveRoleFromInstanceProfileRequest()
		input.setInstanceProfileName(this.instanceProfileName)
		input.setRoleName(this.roleName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.RemoveRoleFromInstanceProfileResult {
	  return com.amazonaws.services.identitymanagement.model.RemoveRoleFromInstanceProfileResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.RemoveRoleFromInstanceProfileResult {
		return environment.iam.removeRoleFromInstanceProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam remove-role-from-instance-profile")
				.argument("instance-profile-name", instanceProfileName)
				.argument("role-name", roleName)
	}

}


fun AmazonIdentityManagementFunctions.removeUserFromGroup(groupName: String, userName: String, init: (AmazonIdentityManagementRemoveUserFromGroupCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.RemoveUserFromGroupResult {
	return this.block.declare(AmazonIdentityManagementRemoveUserFromGroupCommand(groupName, userName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.RemoveUserFromGroupResult
}

@Generated
class AmazonIdentityManagementRemoveUserFromGroupCommand(val groupName: String, val userName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.RemoveUserFromGroupRequest, com.amazonaws.services.identitymanagement.model.RemoveUserFromGroupResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.RemoveUserFromGroupRequest {
		val input = com.amazonaws.services.identitymanagement.model.RemoveUserFromGroupRequest()
		input.setGroupName(this.groupName)
		input.setUserName(this.userName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.RemoveUserFromGroupResult {
	  return com.amazonaws.services.identitymanagement.model.RemoveUserFromGroupResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.RemoveUserFromGroupResult {
		return environment.iam.removeUserFromGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam remove-user-from-group")
				.argument("group-name", groupName)
				.argument("user-name", userName)
	}

}


fun AmazonIdentityManagementFunctions.resetServiceSpecificCredential(serviceSpecificCredentialId: String, init: (AmazonIdentityManagementResetServiceSpecificCredentialCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.ResetServiceSpecificCredentialResult {
	return this.block.declare(AmazonIdentityManagementResetServiceSpecificCredentialCommand(serviceSpecificCredentialId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.ResetServiceSpecificCredentialResult
}

@Generated
class AmazonIdentityManagementResetServiceSpecificCredentialCommand(val serviceSpecificCredentialId: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ResetServiceSpecificCredentialRequest, com.amazonaws.services.identitymanagement.model.ResetServiceSpecificCredentialResult> {

	var userName: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.ResetServiceSpecificCredentialRequest {
		val input = com.amazonaws.services.identitymanagement.model.ResetServiceSpecificCredentialRequest()
		input.setUserName(this.userName)
		input.setServiceSpecificCredentialId(this.serviceSpecificCredentialId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.ResetServiceSpecificCredentialResult {
	  return com.amazonaws.services.identitymanagement.model.ResetServiceSpecificCredentialResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.ResetServiceSpecificCredentialResult {
		return environment.iam.resetServiceSpecificCredential(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam reset-service-specific-credential")
				.argument("user-name", userName)
				.argument("service-specific-credential-id", serviceSpecificCredentialId)
	}

}


fun AmazonIdentityManagementFunctions.resyncMFADevice(userName: String, serialNumber: String, authenticationCode1: String, authenticationCode2: String, init: (AmazonIdentityManagementResyncMFADeviceCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.ResyncMFADeviceResult {
	return this.block.declare(AmazonIdentityManagementResyncMFADeviceCommand(userName, serialNumber, authenticationCode1, authenticationCode2).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.ResyncMFADeviceResult
}

@Generated
class AmazonIdentityManagementResyncMFADeviceCommand(val userName: String, val serialNumber: String, val authenticationCode1: String, val authenticationCode2: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.ResyncMFADeviceRequest, com.amazonaws.services.identitymanagement.model.ResyncMFADeviceResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.ResyncMFADeviceRequest {
		val input = com.amazonaws.services.identitymanagement.model.ResyncMFADeviceRequest()
		input.setUserName(this.userName)
		input.setSerialNumber(this.serialNumber)
		input.setAuthenticationCode1(this.authenticationCode1)
		input.setAuthenticationCode2(this.authenticationCode2)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.ResyncMFADeviceResult {
	  return com.amazonaws.services.identitymanagement.model.ResyncMFADeviceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.ResyncMFADeviceResult {
		return environment.iam.resyncMFADevice(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam resync-mfadevice")
				.argument("user-name", userName)
				.argument("serial-number", serialNumber)
				.argument("authentication-code1", authenticationCode1)
				.argument("authentication-code2", authenticationCode2)
	}

}


fun AmazonIdentityManagementFunctions.setDefaultPolicyVersion(policyArn: String, versionId: String, init: (AmazonIdentityManagementSetDefaultPolicyVersionCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.SetDefaultPolicyVersionResult {
	return this.block.declare(AmazonIdentityManagementSetDefaultPolicyVersionCommand(policyArn, versionId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.SetDefaultPolicyVersionResult
}

@Generated
class AmazonIdentityManagementSetDefaultPolicyVersionCommand(val policyArn: String, val versionId: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.SetDefaultPolicyVersionRequest, com.amazonaws.services.identitymanagement.model.SetDefaultPolicyVersionResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.SetDefaultPolicyVersionRequest {
		val input = com.amazonaws.services.identitymanagement.model.SetDefaultPolicyVersionRequest()
		input.setPolicyArn(this.policyArn)
		input.setVersionId(this.versionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.SetDefaultPolicyVersionResult {
	  return com.amazonaws.services.identitymanagement.model.SetDefaultPolicyVersionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.SetDefaultPolicyVersionResult {
		return environment.iam.setDefaultPolicyVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam set-default-policy-version")
				.argument("policy-arn", policyArn)
				.argument("version-id", versionId)
	}

}


fun AmazonIdentityManagementFunctions.simulateCustomPolicy(policyInputList: List<String>, actionNames: List<String>, init: (AmazonIdentityManagementSimulateCustomPolicyCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.SimulateCustomPolicyResult {
	return this.block.declare(AmazonIdentityManagementSimulateCustomPolicyCommand(policyInputList, actionNames).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.SimulateCustomPolicyResult
}

@Generated
class AmazonIdentityManagementSimulateCustomPolicyCommand(val policyInputList: List<String>, val actionNames: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.SimulateCustomPolicyRequest, com.amazonaws.services.identitymanagement.model.SimulateCustomPolicyResult> {

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

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.SimulateCustomPolicyResult {
	  return com.amazonaws.services.identitymanagement.model.SimulateCustomPolicyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.SimulateCustomPolicyResult {
		return environment.iam.simulateCustomPolicy(build())
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


fun AmazonIdentityManagementFunctions.simulatePrincipalPolicy(policySourceArn: String, actionNames: List<String>, init: (AmazonIdentityManagementSimulatePrincipalPolicyCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.SimulatePrincipalPolicyResult {
	return this.block.declare(AmazonIdentityManagementSimulatePrincipalPolicyCommand(policySourceArn, actionNames).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.SimulatePrincipalPolicyResult
}

@Generated
class AmazonIdentityManagementSimulatePrincipalPolicyCommand(val policySourceArn: String, val actionNames: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.SimulatePrincipalPolicyRequest, com.amazonaws.services.identitymanagement.model.SimulatePrincipalPolicyResult> {

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

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.SimulatePrincipalPolicyResult {
	  return com.amazonaws.services.identitymanagement.model.SimulatePrincipalPolicyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.SimulatePrincipalPolicyResult {
		return environment.iam.simulatePrincipalPolicy(build())
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


fun AmazonIdentityManagementFunctions.updateAccessKey(accessKeyId: String, status: String, init: (AmazonIdentityManagementUpdateAccessKeyCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.UpdateAccessKeyResult {
	return this.block.declare(AmazonIdentityManagementUpdateAccessKeyCommand(accessKeyId, status).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.UpdateAccessKeyResult
}

@Generated
class AmazonIdentityManagementUpdateAccessKeyCommand(val accessKeyId: String, val status: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.UpdateAccessKeyRequest, com.amazonaws.services.identitymanagement.model.UpdateAccessKeyResult> {

	var userName: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.UpdateAccessKeyRequest {
		val input = com.amazonaws.services.identitymanagement.model.UpdateAccessKeyRequest()
		input.setUserName(this.userName)
		input.setAccessKeyId(this.accessKeyId)
		input.setStatus(this.status)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.UpdateAccessKeyResult {
	  return com.amazonaws.services.identitymanagement.model.UpdateAccessKeyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.UpdateAccessKeyResult {
		return environment.iam.updateAccessKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam update-access-key")
				.argument("user-name", userName)
				.argument("access-key-id", accessKeyId)
				.argument("status", status)
	}

}


fun AmazonIdentityManagementFunctions.updateAccountPasswordPolicy(init: (AmazonIdentityManagementUpdateAccountPasswordPolicyCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.UpdateAccountPasswordPolicyResult {
	return this.block.declare(AmazonIdentityManagementUpdateAccountPasswordPolicyCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.UpdateAccountPasswordPolicyResult
}

@Generated
class AmazonIdentityManagementUpdateAccountPasswordPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.UpdateAccountPasswordPolicyRequest, com.amazonaws.services.identitymanagement.model.UpdateAccountPasswordPolicyResult> {

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

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.UpdateAccountPasswordPolicyResult {
	  return com.amazonaws.services.identitymanagement.model.UpdateAccountPasswordPolicyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.UpdateAccountPasswordPolicyResult {
		return environment.iam.updateAccountPasswordPolicy(build())
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


fun AmazonIdentityManagementFunctions.updateAssumeRolePolicy(roleName: String, policyDocument: String, init: (AmazonIdentityManagementUpdateAssumeRolePolicyCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.UpdateAssumeRolePolicyResult {
	return this.block.declare(AmazonIdentityManagementUpdateAssumeRolePolicyCommand(roleName, policyDocument).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.UpdateAssumeRolePolicyResult
}

@Generated
class AmazonIdentityManagementUpdateAssumeRolePolicyCommand(val roleName: String, val policyDocument: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.UpdateAssumeRolePolicyRequest, com.amazonaws.services.identitymanagement.model.UpdateAssumeRolePolicyResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.UpdateAssumeRolePolicyRequest {
		val input = com.amazonaws.services.identitymanagement.model.UpdateAssumeRolePolicyRequest()
		input.setRoleName(this.roleName)
		input.setPolicyDocument(this.policyDocument)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.UpdateAssumeRolePolicyResult {
	  return com.amazonaws.services.identitymanagement.model.UpdateAssumeRolePolicyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.UpdateAssumeRolePolicyResult {
		return environment.iam.updateAssumeRolePolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam update-assume-role-policy")
				.argument("role-name", roleName)
				.argument("policy-document", policyDocument)
	}

}


fun AmazonIdentityManagementFunctions.updateGroup(groupName: String, init: (AmazonIdentityManagementUpdateGroupCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.UpdateGroupResult {
	return this.block.declare(AmazonIdentityManagementUpdateGroupCommand(groupName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.UpdateGroupResult
}

@Generated
class AmazonIdentityManagementUpdateGroupCommand(val groupName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.UpdateGroupRequest, com.amazonaws.services.identitymanagement.model.UpdateGroupResult> {

	var newPath: String? = null
	var newGroupName: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.UpdateGroupRequest {
		val input = com.amazonaws.services.identitymanagement.model.UpdateGroupRequest()
		input.setGroupName(this.groupName)
		input.setNewPath(this.newPath)
		input.setNewGroupName(this.newGroupName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.UpdateGroupResult {
	  return com.amazonaws.services.identitymanagement.model.UpdateGroupResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.UpdateGroupResult {
		return environment.iam.updateGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam update-group")
				.argument("group-name", groupName)
				.argument("new-path", newPath)
				.argument("new-group-name", newGroupName)
	}

}


fun AmazonIdentityManagementFunctions.updateLoginProfile(userName: String, init: (AmazonIdentityManagementUpdateLoginProfileCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.UpdateLoginProfileResult {
	return this.block.declare(AmazonIdentityManagementUpdateLoginProfileCommand(userName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.UpdateLoginProfileResult
}

@Generated
class AmazonIdentityManagementUpdateLoginProfileCommand(val userName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.UpdateLoginProfileRequest, com.amazonaws.services.identitymanagement.model.UpdateLoginProfileResult> {

	var password: String? = null
	var passwordResetRequired: Boolean? = false

	override fun build(): com.amazonaws.services.identitymanagement.model.UpdateLoginProfileRequest {
		val input = com.amazonaws.services.identitymanagement.model.UpdateLoginProfileRequest()
		input.setUserName(this.userName)
		input.setPassword(this.password)
		input.setPasswordResetRequired(this.passwordResetRequired)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.UpdateLoginProfileResult {
	  return com.amazonaws.services.identitymanagement.model.UpdateLoginProfileResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.UpdateLoginProfileResult {
		return environment.iam.updateLoginProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam update-login-profile")
				.argument("user-name", userName)
				.argument("password", password)
				.option("password-reset-required", passwordResetRequired ?: false)
	}

}


fun AmazonIdentityManagementFunctions.updateOpenIDConnectProviderThumbprint(openIDConnectProviderArn: String, thumbprintList: List<String>, init: (AmazonIdentityManagementUpdateOpenIDConnectProviderThumbprintCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.UpdateOpenIDConnectProviderThumbprintResult {
	return this.block.declare(AmazonIdentityManagementUpdateOpenIDConnectProviderThumbprintCommand(openIDConnectProviderArn, thumbprintList).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.UpdateOpenIDConnectProviderThumbprintResult
}

@Generated
class AmazonIdentityManagementUpdateOpenIDConnectProviderThumbprintCommand(val openIDConnectProviderArn: String, val thumbprintList: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.UpdateOpenIDConnectProviderThumbprintRequest, com.amazonaws.services.identitymanagement.model.UpdateOpenIDConnectProviderThumbprintResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.UpdateOpenIDConnectProviderThumbprintRequest {
		val input = com.amazonaws.services.identitymanagement.model.UpdateOpenIDConnectProviderThumbprintRequest()
		input.setOpenIDConnectProviderArn(this.openIDConnectProviderArn)
		input.setThumbprintList(this.thumbprintList)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.UpdateOpenIDConnectProviderThumbprintResult {
	  return com.amazonaws.services.identitymanagement.model.UpdateOpenIDConnectProviderThumbprintResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.UpdateOpenIDConnectProviderThumbprintResult {
		return environment.iam.updateOpenIDConnectProviderThumbprint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam update-open-idconnect-provider-thumbprint")
				.argument("open-idconnect-provider-arn", openIDConnectProviderArn)
				.argument("thumbprint-list", thumbprintList.toString())
	}

}


fun AmazonIdentityManagementFunctions.updateRole(roleName: String, init: (AmazonIdentityManagementUpdateRoleCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.UpdateRoleResult {
	return this.block.declare(AmazonIdentityManagementUpdateRoleCommand(roleName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.UpdateRoleResult
}

@Generated
class AmazonIdentityManagementUpdateRoleCommand(val roleName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.UpdateRoleRequest, com.amazonaws.services.identitymanagement.model.UpdateRoleResult> {

	var description: String? = null
	var maxSessionDuration: Int? = 0

	override fun build(): com.amazonaws.services.identitymanagement.model.UpdateRoleRequest {
		val input = com.amazonaws.services.identitymanagement.model.UpdateRoleRequest()
		input.setRoleName(this.roleName)
		input.setDescription(this.description)
		input.setMaxSessionDuration(this.maxSessionDuration)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.UpdateRoleResult {
	  return com.amazonaws.services.identitymanagement.model.UpdateRoleResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.UpdateRoleResult {
		return environment.iam.updateRole(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam update-role")
				.argument("role-name", roleName)
				.argument("description", description)
				.argument("max-session-duration", maxSessionDuration?.toString())
	}

}


fun AmazonIdentityManagementFunctions.updateRoleDescription(roleName: String, description: String, init: (AmazonIdentityManagementUpdateRoleDescriptionCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.UpdateRoleDescriptionResult {
	return this.block.declare(AmazonIdentityManagementUpdateRoleDescriptionCommand(roleName, description).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.UpdateRoleDescriptionResult
}

@Generated
class AmazonIdentityManagementUpdateRoleDescriptionCommand(val roleName: String, val description: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.UpdateRoleDescriptionRequest, com.amazonaws.services.identitymanagement.model.UpdateRoleDescriptionResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.UpdateRoleDescriptionRequest {
		val input = com.amazonaws.services.identitymanagement.model.UpdateRoleDescriptionRequest()
		input.setRoleName(this.roleName)
		input.setDescription(this.description)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.UpdateRoleDescriptionResult {
	  return com.amazonaws.services.identitymanagement.model.UpdateRoleDescriptionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.UpdateRoleDescriptionResult {
		return environment.iam.updateRoleDescription(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam update-role-description")
				.argument("role-name", roleName)
				.argument("description", description)
	}

}


fun AmazonIdentityManagementFunctions.updateSAMLProvider(sAMLMetadataDocument: String, sAMLProviderArn: String, init: (AmazonIdentityManagementUpdateSAMLProviderCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.UpdateSAMLProviderResult {
	return this.block.declare(AmazonIdentityManagementUpdateSAMLProviderCommand(sAMLMetadataDocument, sAMLProviderArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.UpdateSAMLProviderResult
}

@Generated
class AmazonIdentityManagementUpdateSAMLProviderCommand(val sAMLMetadataDocument: String, val sAMLProviderArn: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.UpdateSAMLProviderRequest, com.amazonaws.services.identitymanagement.model.UpdateSAMLProviderResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.UpdateSAMLProviderRequest {
		val input = com.amazonaws.services.identitymanagement.model.UpdateSAMLProviderRequest()
		input.setSAMLMetadataDocument(this.sAMLMetadataDocument)
		input.setSAMLProviderArn(this.sAMLProviderArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.UpdateSAMLProviderResult {
	  return com.amazonaws.services.identitymanagement.model.UpdateSAMLProviderResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.UpdateSAMLProviderResult {
		return environment.iam.updateSAMLProvider(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam update-samlprovider")
				.argument("samlmetadata-document", sAMLMetadataDocument)
				.argument("samlprovider-arn", sAMLProviderArn)
	}

}


fun AmazonIdentityManagementFunctions.updateSSHPublicKey(userName: String, sSHPublicKeyId: String, status: String, init: (AmazonIdentityManagementUpdateSSHPublicKeyCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.UpdateSSHPublicKeyResult {
	return this.block.declare(AmazonIdentityManagementUpdateSSHPublicKeyCommand(userName, sSHPublicKeyId, status).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.UpdateSSHPublicKeyResult
}

@Generated
class AmazonIdentityManagementUpdateSSHPublicKeyCommand(val userName: String, val sSHPublicKeyId: String, val status: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.UpdateSSHPublicKeyRequest, com.amazonaws.services.identitymanagement.model.UpdateSSHPublicKeyResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.UpdateSSHPublicKeyRequest {
		val input = com.amazonaws.services.identitymanagement.model.UpdateSSHPublicKeyRequest()
		input.setUserName(this.userName)
		input.setSSHPublicKeyId(this.sSHPublicKeyId)
		input.setStatus(this.status)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.UpdateSSHPublicKeyResult {
	  return com.amazonaws.services.identitymanagement.model.UpdateSSHPublicKeyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.UpdateSSHPublicKeyResult {
		return environment.iam.updateSSHPublicKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam update-sshpublic-key")
				.argument("user-name", userName)
				.argument("sshpublic-key-id", sSHPublicKeyId)
				.argument("status", status)
	}

}


fun AmazonIdentityManagementFunctions.updateServerCertificate(serverCertificateName: String, init: (AmazonIdentityManagementUpdateServerCertificateCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.UpdateServerCertificateResult {
	return this.block.declare(AmazonIdentityManagementUpdateServerCertificateCommand(serverCertificateName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.UpdateServerCertificateResult
}

@Generated
class AmazonIdentityManagementUpdateServerCertificateCommand(val serverCertificateName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.UpdateServerCertificateRequest, com.amazonaws.services.identitymanagement.model.UpdateServerCertificateResult> {

	var newPath: String? = null
	var newServerCertificateName: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.UpdateServerCertificateRequest {
		val input = com.amazonaws.services.identitymanagement.model.UpdateServerCertificateRequest()
		input.setServerCertificateName(this.serverCertificateName)
		input.setNewPath(this.newPath)
		input.setNewServerCertificateName(this.newServerCertificateName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.UpdateServerCertificateResult {
	  return com.amazonaws.services.identitymanagement.model.UpdateServerCertificateResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.UpdateServerCertificateResult {
		return environment.iam.updateServerCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam update-server-certificate")
				.argument("server-certificate-name", serverCertificateName)
				.argument("new-path", newPath)
				.argument("new-server-certificate-name", newServerCertificateName)
	}

}


fun AmazonIdentityManagementFunctions.updateServiceSpecificCredential(serviceSpecificCredentialId: String, status: String, init: (AmazonIdentityManagementUpdateServiceSpecificCredentialCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.UpdateServiceSpecificCredentialResult {
	return this.block.declare(AmazonIdentityManagementUpdateServiceSpecificCredentialCommand(serviceSpecificCredentialId, status).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.UpdateServiceSpecificCredentialResult
}

@Generated
class AmazonIdentityManagementUpdateServiceSpecificCredentialCommand(val serviceSpecificCredentialId: String, val status: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.UpdateServiceSpecificCredentialRequest, com.amazonaws.services.identitymanagement.model.UpdateServiceSpecificCredentialResult> {

	var userName: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.UpdateServiceSpecificCredentialRequest {
		val input = com.amazonaws.services.identitymanagement.model.UpdateServiceSpecificCredentialRequest()
		input.setUserName(this.userName)
		input.setServiceSpecificCredentialId(this.serviceSpecificCredentialId)
		input.setStatus(this.status)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.UpdateServiceSpecificCredentialResult {
	  return com.amazonaws.services.identitymanagement.model.UpdateServiceSpecificCredentialResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.UpdateServiceSpecificCredentialResult {
		return environment.iam.updateServiceSpecificCredential(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam update-service-specific-credential")
				.argument("user-name", userName)
				.argument("service-specific-credential-id", serviceSpecificCredentialId)
				.argument("status", status)
	}

}


fun AmazonIdentityManagementFunctions.updateSigningCertificate(certificateId: String, status: String, init: (AmazonIdentityManagementUpdateSigningCertificateCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.UpdateSigningCertificateResult {
	return this.block.declare(AmazonIdentityManagementUpdateSigningCertificateCommand(certificateId, status).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.UpdateSigningCertificateResult
}

@Generated
class AmazonIdentityManagementUpdateSigningCertificateCommand(val certificateId: String, val status: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.UpdateSigningCertificateRequest, com.amazonaws.services.identitymanagement.model.UpdateSigningCertificateResult> {

	var userName: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.UpdateSigningCertificateRequest {
		val input = com.amazonaws.services.identitymanagement.model.UpdateSigningCertificateRequest()
		input.setUserName(this.userName)
		input.setCertificateId(this.certificateId)
		input.setStatus(this.status)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.UpdateSigningCertificateResult {
	  return com.amazonaws.services.identitymanagement.model.UpdateSigningCertificateResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.UpdateSigningCertificateResult {
		return environment.iam.updateSigningCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam update-signing-certificate")
				.argument("user-name", userName)
				.argument("certificate-id", certificateId)
				.argument("status", status)
	}

}


fun AmazonIdentityManagementFunctions.updateUser(userName: String, init: (AmazonIdentityManagementUpdateUserCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.UpdateUserResult {
	return this.block.declare(AmazonIdentityManagementUpdateUserCommand(userName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.UpdateUserResult
}

@Generated
class AmazonIdentityManagementUpdateUserCommand(val userName: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.UpdateUserRequest, com.amazonaws.services.identitymanagement.model.UpdateUserResult> {

	var newPath: String? = null
	var newUserName: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.UpdateUserRequest {
		val input = com.amazonaws.services.identitymanagement.model.UpdateUserRequest()
		input.setUserName(this.userName)
		input.setNewPath(this.newPath)
		input.setNewUserName(this.newUserName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.UpdateUserResult {
	  return com.amazonaws.services.identitymanagement.model.UpdateUserResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.UpdateUserResult {
		return environment.iam.updateUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam update-user")
				.argument("user-name", userName)
				.argument("new-path", newPath)
				.argument("new-user-name", newUserName)
	}

}


fun AmazonIdentityManagementFunctions.uploadSSHPublicKey(userName: String, sSHPublicKeyBody: String, init: (AmazonIdentityManagementUploadSSHPublicKeyCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.UploadSSHPublicKeyResult {
	return this.block.declare(AmazonIdentityManagementUploadSSHPublicKeyCommand(userName, sSHPublicKeyBody).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.UploadSSHPublicKeyResult
}

@Generated
class AmazonIdentityManagementUploadSSHPublicKeyCommand(val userName: String, val sSHPublicKeyBody: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.UploadSSHPublicKeyRequest, com.amazonaws.services.identitymanagement.model.UploadSSHPublicKeyResult> {



	override fun build(): com.amazonaws.services.identitymanagement.model.UploadSSHPublicKeyRequest {
		val input = com.amazonaws.services.identitymanagement.model.UploadSSHPublicKeyRequest()
		input.setUserName(this.userName)
		input.setSSHPublicKeyBody(this.sSHPublicKeyBody)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.UploadSSHPublicKeyResult {
	  return com.amazonaws.services.identitymanagement.model.UploadSSHPublicKeyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.UploadSSHPublicKeyResult {
		return environment.iam.uploadSSHPublicKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam upload-sshpublic-key")
				.argument("user-name", userName)
				.argument("sshpublic-key-body", sSHPublicKeyBody)
	}

}


fun AmazonIdentityManagementFunctions.uploadServerCertificate(serverCertificateName: String, certificateBody: String, privateKey: String, init: (AmazonIdentityManagementUploadServerCertificateCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.UploadServerCertificateResult {
	return this.block.declare(AmazonIdentityManagementUploadServerCertificateCommand(serverCertificateName, certificateBody, privateKey).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.UploadServerCertificateResult
}

@Generated
class AmazonIdentityManagementUploadServerCertificateCommand(val serverCertificateName: String, val certificateBody: String, val privateKey: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.UploadServerCertificateRequest, com.amazonaws.services.identitymanagement.model.UploadServerCertificateResult> {

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

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.UploadServerCertificateResult {
	  return com.amazonaws.services.identitymanagement.model.UploadServerCertificateResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.UploadServerCertificateResult {
		return environment.iam.uploadServerCertificate(build())
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


fun AmazonIdentityManagementFunctions.uploadSigningCertificate(certificateBody: String, init: (AmazonIdentityManagementUploadSigningCertificateCommand.() -> Unit)? = null): com.amazonaws.services.identitymanagement.model.UploadSigningCertificateResult {
	return this.block.declare(AmazonIdentityManagementUploadSigningCertificateCommand(certificateBody).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.identitymanagement.model.UploadSigningCertificateResult
}

@Generated
class AmazonIdentityManagementUploadSigningCertificateCommand(val certificateBody: String) : AmazonWebServiceCommand<com.amazonaws.services.identitymanagement.model.UploadSigningCertificateRequest, com.amazonaws.services.identitymanagement.model.UploadSigningCertificateResult> {

	var userName: String? = null

	override fun build(): com.amazonaws.services.identitymanagement.model.UploadSigningCertificateRequest {
		val input = com.amazonaws.services.identitymanagement.model.UploadSigningCertificateRequest()
		input.setUserName(this.userName)
		input.setCertificateBody(this.certificateBody)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.identitymanagement.model.UploadSigningCertificateResult {
	  return com.amazonaws.services.identitymanagement.model.UploadSigningCertificateResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.identitymanagement.model.UploadSigningCertificateResult {
		return environment.iam.uploadSigningCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iam upload-signing-certificate")
				.argument("user-name", userName)
				.argument("certificate-body", certificateBody)
	}

}
