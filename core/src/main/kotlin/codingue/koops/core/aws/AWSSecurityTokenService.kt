
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.securitytoken.AWSSecurityTokenService
import com.amazonaws.services.securitytoken.model.*

var codingue.koops.core.Environment.sts: AWSSecurityTokenService
	get() = this.capabilities[AWSSecurityTokenService::class.java.name] as AWSSecurityTokenService
	set(sts) {
		this.capabilities[AWSSecurityTokenService::class.java.name] = sts
	}

@Generated
class AWSSecurityTokenServiceFunctions(val block: Block)

infix fun AwsContinuation.sts(init: AWSSecurityTokenServiceFunctions.() -> Unit) {
	AWSSecurityTokenServiceFunctions(shell).apply(init)
}

			

fun AWSSecurityTokenServiceFunctions.assumeRole(roleArn: String, roleSessionName: String, init: AWSSecurityTokenServiceAssumeRoleCommand.() -> Unit) {
	this.block.declare(AWSSecurityTokenServiceAssumeRoleCommand(roleArn, roleSessionName).apply(init))
}

@Generated
class AWSSecurityTokenServiceAssumeRoleCommand(val roleArn: String, val roleSessionName: String) : AmazonWebServiceCommand<com.amazonaws.services.securitytoken.model.AssumeRoleRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sts.assumeRole(build())
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


fun AWSSecurityTokenServiceFunctions.assumeRoleWithSAML(roleArn: String, principalArn: String, sAMLAssertion: String, init: AWSSecurityTokenServiceAssumeRoleWithSAMLCommand.() -> Unit) {
	this.block.declare(AWSSecurityTokenServiceAssumeRoleWithSAMLCommand(roleArn, principalArn, sAMLAssertion).apply(init))
}

@Generated
class AWSSecurityTokenServiceAssumeRoleWithSAMLCommand(val roleArn: String, val principalArn: String, val sAMLAssertion: String) : AmazonWebServiceCommand<com.amazonaws.services.securitytoken.model.AssumeRoleWithSAMLRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sts.assumeRoleWithSAML(build())
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


fun AWSSecurityTokenServiceFunctions.assumeRoleWithWebIdentity(roleArn: String, roleSessionName: String, webIdentityToken: String, init: AWSSecurityTokenServiceAssumeRoleWithWebIdentityCommand.() -> Unit) {
	this.block.declare(AWSSecurityTokenServiceAssumeRoleWithWebIdentityCommand(roleArn, roleSessionName, webIdentityToken).apply(init))
}

@Generated
class AWSSecurityTokenServiceAssumeRoleWithWebIdentityCommand(val roleArn: String, val roleSessionName: String, val webIdentityToken: String) : AmazonWebServiceCommand<com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sts.assumeRoleWithWebIdentity(build())
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


fun AWSSecurityTokenServiceFunctions.decodeAuthorizationMessage(encodedMessage: String, init: AWSSecurityTokenServiceDecodeAuthorizationMessageCommand.() -> Unit) {
	this.block.declare(AWSSecurityTokenServiceDecodeAuthorizationMessageCommand(encodedMessage).apply(init))
}

@Generated
class AWSSecurityTokenServiceDecodeAuthorizationMessageCommand(val encodedMessage: String) : AmazonWebServiceCommand<com.amazonaws.services.securitytoken.model.DecodeAuthorizationMessageRequest> {



	override fun build(): com.amazonaws.services.securitytoken.model.DecodeAuthorizationMessageRequest {
		val input = com.amazonaws.services.securitytoken.model.DecodeAuthorizationMessageRequest()
		input.setEncodedMessage(this.encodedMessage)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sts.decodeAuthorizationMessage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sts decode-authorization-message")
				.argument("encoded-message", encodedMessage)
	}

}


fun AWSSecurityTokenServiceFunctions.getCallerIdentity(init: AWSSecurityTokenServiceGetCallerIdentityCommand.() -> Unit) {
	this.block.declare(AWSSecurityTokenServiceGetCallerIdentityCommand().apply(init))
}

@Generated
class AWSSecurityTokenServiceGetCallerIdentityCommand() : AmazonWebServiceCommand<com.amazonaws.services.securitytoken.model.GetCallerIdentityRequest> {



	override fun build(): com.amazonaws.services.securitytoken.model.GetCallerIdentityRequest {
		val input = com.amazonaws.services.securitytoken.model.GetCallerIdentityRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sts.getCallerIdentity(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sts get-caller-identity")

	}

}


fun AWSSecurityTokenServiceFunctions.getFederationToken(name: String, init: AWSSecurityTokenServiceGetFederationTokenCommand.() -> Unit) {
	this.block.declare(AWSSecurityTokenServiceGetFederationTokenCommand(name).apply(init))
}

@Generated
class AWSSecurityTokenServiceGetFederationTokenCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.securitytoken.model.GetFederationTokenRequest> {

	var policy: String? = null
	var durationSeconds: Int? = 0

	override fun build(): com.amazonaws.services.securitytoken.model.GetFederationTokenRequest {
		val input = com.amazonaws.services.securitytoken.model.GetFederationTokenRequest()
		input.setName(this.name)
		input.setPolicy(this.policy)
		input.setDurationSeconds(this.durationSeconds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sts.getFederationToken(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sts get-federation-token")
				.argument("name", name)
				.argument("policy", policy)
				.argument("duration-seconds", durationSeconds?.toString())
	}

}


fun AWSSecurityTokenServiceFunctions.getSessionToken(init: AWSSecurityTokenServiceGetSessionTokenCommand.() -> Unit) {
	this.block.declare(AWSSecurityTokenServiceGetSessionTokenCommand().apply(init))
}

@Generated
class AWSSecurityTokenServiceGetSessionTokenCommand() : AmazonWebServiceCommand<com.amazonaws.services.securitytoken.model.GetSessionTokenRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sts.getSessionToken(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sts get-session-token")
				.argument("duration-seconds", durationSeconds?.toString())
				.argument("serial-number", serialNumber)
				.argument("token-code", tokenCode)
	}

}
