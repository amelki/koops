
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws.sts

import javax.annotation.Generated
import codingue.koops.core.*
import codingue.koops.aws.*
import com.amazonaws.services.securitytoken.*
import com.amazonaws.services.securitytoken.model.*

var codingue.koops.core.Environment.sts: AWSSecurityTokenService
	get() {
		var service = this.capabilities["aws-sts"]
		if (service == null) {
			service = AWSSecurityTokenServiceClientBuilder.standard().build()
			this.capabilities["aws-sts"] = service
		}
		return service as AWSSecurityTokenService
	}
	set(sts) {
		this.capabilities["aws-sts"] = sts
	}

@Generated
class AWSSecurityTokenServiceFunctions(val block: Block)

infix fun <T> AwsContinuation.sts(init: AWSSecurityTokenServiceFunctions.() -> T): T {
	return AWSSecurityTokenServiceFunctions(shell).run(init)
}

			

fun AWSSecurityTokenServiceFunctions.assumeRole(roleArn: String, roleSessionName: String, init: AWSSecurityTokenServiceAssumeRoleCommand.() -> Unit): com.amazonaws.services.securitytoken.model.AssumeRoleResult {
	return this.block.declare(AWSSecurityTokenServiceAssumeRoleCommand(roleArn, roleSessionName).apply(init)) as com.amazonaws.services.securitytoken.model.AssumeRoleResult
}

@Generated
class AWSSecurityTokenServiceAssumeRoleCommand(val roleArn: String, val roleSessionName: String) : AmazonWebServiceCommand<com.amazonaws.services.securitytoken.model.AssumeRoleRequest, com.amazonaws.services.securitytoken.model.AssumeRoleResult> {

	var policy: String? = null
	var durationSeconds: Int? = 0
	var externalId: String? = null
	var serialNumber: String? = null
	var tokenCode: String? = null

	override fun build(): com.amazonaws.services.securitytoken.model.AssumeRoleRequest {
		val input = com.amazonaws.services.securitytoken.model.AssumeRoleRequest()
		input.setRoleArn(this.roleArn)
		input.setRoleSessionName(this.roleSessionName)
		input.setPolicy(this.policy)
		input.setDurationSeconds(this.durationSeconds)
		input.setExternalId(this.externalId)
		input.setSerialNumber(this.serialNumber)
		input.setTokenCode(this.tokenCode)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.securitytoken.model.AssumeRoleResult {
	  return com.amazonaws.services.securitytoken.model.AssumeRoleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.securitytoken.model.AssumeRoleResult {
		return environment.sts.assumeRole(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sts assume-role")
				.argument("role-arn", roleArn)
				.argument("role-session-name", roleSessionName)
				.argument("policy", policy)
				.argument("duration-seconds", durationSeconds?.toString())
				.argument("external-id", externalId)
				.argument("serial-number", serialNumber)
				.argument("token-code", tokenCode)
	}

}


fun AWSSecurityTokenServiceFunctions.assumeRoleWithSAML(roleArn: String, principalArn: String, sAMLAssertion: String, init: AWSSecurityTokenServiceAssumeRoleWithSAMLCommand.() -> Unit): com.amazonaws.services.securitytoken.model.AssumeRoleWithSAMLResult {
	return this.block.declare(AWSSecurityTokenServiceAssumeRoleWithSAMLCommand(roleArn, principalArn, sAMLAssertion).apply(init)) as com.amazonaws.services.securitytoken.model.AssumeRoleWithSAMLResult
}

@Generated
class AWSSecurityTokenServiceAssumeRoleWithSAMLCommand(val roleArn: String, val principalArn: String, val sAMLAssertion: String) : AmazonWebServiceCommand<com.amazonaws.services.securitytoken.model.AssumeRoleWithSAMLRequest, com.amazonaws.services.securitytoken.model.AssumeRoleWithSAMLResult> {

	var policy: String? = null
	var durationSeconds: Int? = 0

	override fun build(): com.amazonaws.services.securitytoken.model.AssumeRoleWithSAMLRequest {
		val input = com.amazonaws.services.securitytoken.model.AssumeRoleWithSAMLRequest()
		input.setRoleArn(this.roleArn)
		input.setPrincipalArn(this.principalArn)
		input.setSAMLAssertion(this.sAMLAssertion)
		input.setPolicy(this.policy)
		input.setDurationSeconds(this.durationSeconds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.securitytoken.model.AssumeRoleWithSAMLResult {
	  return com.amazonaws.services.securitytoken.model.AssumeRoleWithSAMLResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.securitytoken.model.AssumeRoleWithSAMLResult {
		return environment.sts.assumeRoleWithSAML(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sts assume-role-with-saml")
				.argument("role-arn", roleArn)
				.argument("principal-arn", principalArn)
				.argument("samlassertion", sAMLAssertion)
				.argument("policy", policy)
				.argument("duration-seconds", durationSeconds?.toString())
	}

}


fun AWSSecurityTokenServiceFunctions.assumeRoleWithWebIdentity(roleArn: String, roleSessionName: String, webIdentityToken: String, init: AWSSecurityTokenServiceAssumeRoleWithWebIdentityCommand.() -> Unit): com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityResult {
	return this.block.declare(AWSSecurityTokenServiceAssumeRoleWithWebIdentityCommand(roleArn, roleSessionName, webIdentityToken).apply(init)) as com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityResult
}

@Generated
class AWSSecurityTokenServiceAssumeRoleWithWebIdentityCommand(val roleArn: String, val roleSessionName: String, val webIdentityToken: String) : AmazonWebServiceCommand<com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest, com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityResult> {

	var providerId: String? = null
	var policy: String? = null
	var durationSeconds: Int? = 0

	override fun build(): com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest {
		val input = com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest()
		input.setRoleArn(this.roleArn)
		input.setRoleSessionName(this.roleSessionName)
		input.setWebIdentityToken(this.webIdentityToken)
		input.setProviderId(this.providerId)
		input.setPolicy(this.policy)
		input.setDurationSeconds(this.durationSeconds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityResult {
	  return com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityResult {
		return environment.sts.assumeRoleWithWebIdentity(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sts assume-role-with-web-identity")
				.argument("role-arn", roleArn)
				.argument("role-session-name", roleSessionName)
				.argument("web-identity-token", webIdentityToken)
				.argument("provider-id", providerId)
				.argument("policy", policy)
				.argument("duration-seconds", durationSeconds?.toString())
	}

}


fun AWSSecurityTokenServiceFunctions.decodeAuthorizationMessage(encodedMessage: String, init: AWSSecurityTokenServiceDecodeAuthorizationMessageCommand.() -> Unit): com.amazonaws.services.securitytoken.model.DecodeAuthorizationMessageResult {
	return this.block.declare(AWSSecurityTokenServiceDecodeAuthorizationMessageCommand(encodedMessage).apply(init)) as com.amazonaws.services.securitytoken.model.DecodeAuthorizationMessageResult
}

@Generated
class AWSSecurityTokenServiceDecodeAuthorizationMessageCommand(val encodedMessage: String) : AmazonWebServiceCommand<com.amazonaws.services.securitytoken.model.DecodeAuthorizationMessageRequest, com.amazonaws.services.securitytoken.model.DecodeAuthorizationMessageResult> {



	override fun build(): com.amazonaws.services.securitytoken.model.DecodeAuthorizationMessageRequest {
		val input = com.amazonaws.services.securitytoken.model.DecodeAuthorizationMessageRequest()
		input.setEncodedMessage(this.encodedMessage)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.securitytoken.model.DecodeAuthorizationMessageResult {
	  return com.amazonaws.services.securitytoken.model.DecodeAuthorizationMessageResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.securitytoken.model.DecodeAuthorizationMessageResult {
		return environment.sts.decodeAuthorizationMessage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sts decode-authorization-message")
				.argument("encoded-message", encodedMessage)
	}

}


fun AWSSecurityTokenServiceFunctions.getCallerIdentity(init: AWSSecurityTokenServiceGetCallerIdentityCommand.() -> Unit): com.amazonaws.services.securitytoken.model.GetCallerIdentityResult {
	return this.block.declare(AWSSecurityTokenServiceGetCallerIdentityCommand().apply(init)) as com.amazonaws.services.securitytoken.model.GetCallerIdentityResult
}

@Generated
class AWSSecurityTokenServiceGetCallerIdentityCommand() : AmazonWebServiceCommand<com.amazonaws.services.securitytoken.model.GetCallerIdentityRequest, com.amazonaws.services.securitytoken.model.GetCallerIdentityResult> {



	override fun build(): com.amazonaws.services.securitytoken.model.GetCallerIdentityRequest {
		val input = com.amazonaws.services.securitytoken.model.GetCallerIdentityRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.securitytoken.model.GetCallerIdentityResult {
	  return com.amazonaws.services.securitytoken.model.GetCallerIdentityResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.securitytoken.model.GetCallerIdentityResult {
		return environment.sts.getCallerIdentity(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sts get-caller-identity")

	}

}


fun AWSSecurityTokenServiceFunctions.getFederationToken(name: String, init: AWSSecurityTokenServiceGetFederationTokenCommand.() -> Unit): com.amazonaws.services.securitytoken.model.GetFederationTokenResult {
	return this.block.declare(AWSSecurityTokenServiceGetFederationTokenCommand(name).apply(init)) as com.amazonaws.services.securitytoken.model.GetFederationTokenResult
}

@Generated
class AWSSecurityTokenServiceGetFederationTokenCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.securitytoken.model.GetFederationTokenRequest, com.amazonaws.services.securitytoken.model.GetFederationTokenResult> {

	var policy: String? = null
	var durationSeconds: Int? = 0

	override fun build(): com.amazonaws.services.securitytoken.model.GetFederationTokenRequest {
		val input = com.amazonaws.services.securitytoken.model.GetFederationTokenRequest()
		input.setName(this.name)
		input.setPolicy(this.policy)
		input.setDurationSeconds(this.durationSeconds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.securitytoken.model.GetFederationTokenResult {
	  return com.amazonaws.services.securitytoken.model.GetFederationTokenResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.securitytoken.model.GetFederationTokenResult {
		return environment.sts.getFederationToken(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sts get-federation-token")
				.argument("name", name)
				.argument("policy", policy)
				.argument("duration-seconds", durationSeconds?.toString())
	}

}


fun AWSSecurityTokenServiceFunctions.getSessionToken(init: AWSSecurityTokenServiceGetSessionTokenCommand.() -> Unit): com.amazonaws.services.securitytoken.model.GetSessionTokenResult {
	return this.block.declare(AWSSecurityTokenServiceGetSessionTokenCommand().apply(init)) as com.amazonaws.services.securitytoken.model.GetSessionTokenResult
}

@Generated
class AWSSecurityTokenServiceGetSessionTokenCommand() : AmazonWebServiceCommand<com.amazonaws.services.securitytoken.model.GetSessionTokenRequest, com.amazonaws.services.securitytoken.model.GetSessionTokenResult> {

	var durationSeconds: Int? = 0
	var serialNumber: String? = null
	var tokenCode: String? = null

	override fun build(): com.amazonaws.services.securitytoken.model.GetSessionTokenRequest {
		val input = com.amazonaws.services.securitytoken.model.GetSessionTokenRequest()
		input.setDurationSeconds(this.durationSeconds)
		input.setSerialNumber(this.serialNumber)
		input.setTokenCode(this.tokenCode)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.securitytoken.model.GetSessionTokenResult {
	  return com.amazonaws.services.securitytoken.model.GetSessionTokenResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.securitytoken.model.GetSessionTokenResult {
		return environment.sts.getSessionToken(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sts get-session-token")
				.argument("duration-seconds", durationSeconds?.toString())
				.argument("serial-number", serialNumber)
				.argument("token-code", tokenCode)
	}

}
