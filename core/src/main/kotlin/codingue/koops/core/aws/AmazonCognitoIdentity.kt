
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity
import com.amazonaws.services.cognitoidentity.model.*

var codingue.koops.core.Environment.cognito_identity: AmazonCognitoIdentity
	get() = this.capabilities[AmazonCognitoIdentity::class.java.name] as AmazonCognitoIdentity
	set(cognito_identity) {
		this.capabilities[AmazonCognitoIdentity::class.java.name] = cognito_identity
	}

@Generated
class AmazonCognitoIdentityFunctions(val block: Block)

infix fun AwsContinuation.cognito_identity(init: AmazonCognitoIdentityFunctions.() -> Unit) {
	AmazonCognitoIdentityFunctions(shell).apply(init)
}

			

fun AmazonCognitoIdentityFunctions.createIdentityPool(identityPoolName: String, allowUnauthenticatedIdentities: Boolean, init: AmazonCognitoIdentityCreateIdentityPoolCommand.() -> Unit) {
	this.block.declare(AmazonCognitoIdentityCreateIdentityPoolCommand(identityPoolName, allowUnauthenticatedIdentities).apply(init))
}

@Generated
class AmazonCognitoIdentityCreateIdentityPoolCommand(val identityPoolName: String, val allowUnauthenticatedIdentities: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidentity.model.CreateIdentityPoolRequest> {

	var supportedLoginProviders: Map<String, String>? = null
	var developerProviderName: String? = null
	var openIdConnectProviderARNs: List<String>? = null
	var cognitoIdentityProviders: List<com.amazonaws.services.cognitoidentity.model.CognitoIdentityProvider>? = null
	var samlProviderARNs: List<String>? = null

	override fun build(): com.amazonaws.services.cognitoidentity.model.CreateIdentityPoolRequest {
		val input = com.amazonaws.services.cognitoidentity.model.CreateIdentityPoolRequest()
		input.setIdentityPoolName(this.identityPoolName)
		input.setAllowUnauthenticatedIdentities(this.allowUnauthenticatedIdentities)
		input.setSupportedLoginProviders(this.supportedLoginProviders)
		input.setDeveloperProviderName(this.developerProviderName)
		input.setOpenIdConnectProviderARNs(this.openIdConnectProviderARNs)
		input.setCognitoIdentityProviders(this.cognitoIdentityProviders)
		input.setSamlProviderARNs(this.samlProviderARNs)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_identity.createIdentityPool(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-identity create-identity-pool")
				.argument("identity-pool-name", identityPoolName)
				.option("allow-unauthenticated-identities", allowUnauthenticatedIdentities ?: false)
				.argument("supported-login-providers", supportedLoginProviders?.toString())
				.argument("developer-provider-name", developerProviderName)
				.argument("open-id-connect-provider-arns", openIdConnectProviderARNs?.toString())
				.argument("cognito-identity-providers", cognitoIdentityProviders?.toString())
				.argument("saml-provider-arns", samlProviderARNs?.toString())
	}

}


fun AmazonCognitoIdentityFunctions.deleteIdentities(identityIdsToDelete: List<String>, init: AmazonCognitoIdentityDeleteIdentitiesCommand.() -> Unit) {
	this.block.declare(AmazonCognitoIdentityDeleteIdentitiesCommand(identityIdsToDelete).apply(init))
}

@Generated
class AmazonCognitoIdentityDeleteIdentitiesCommand(val identityIdsToDelete: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidentity.model.DeleteIdentitiesRequest> {



	override fun build(): com.amazonaws.services.cognitoidentity.model.DeleteIdentitiesRequest {
		val input = com.amazonaws.services.cognitoidentity.model.DeleteIdentitiesRequest()
		input.setIdentityIdsToDelete(this.identityIdsToDelete)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_identity.deleteIdentities(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-identity delete-identities")
				.argument("identity-ids-to-delete", identityIdsToDelete.toString())
	}

}


fun AmazonCognitoIdentityFunctions.deleteIdentityPool(identityPoolId: String, init: AmazonCognitoIdentityDeleteIdentityPoolCommand.() -> Unit) {
	this.block.declare(AmazonCognitoIdentityDeleteIdentityPoolCommand(identityPoolId).apply(init))
}

@Generated
class AmazonCognitoIdentityDeleteIdentityPoolCommand(val identityPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidentity.model.DeleteIdentityPoolRequest> {



	override fun build(): com.amazonaws.services.cognitoidentity.model.DeleteIdentityPoolRequest {
		val input = com.amazonaws.services.cognitoidentity.model.DeleteIdentityPoolRequest()
		input.setIdentityPoolId(this.identityPoolId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_identity.deleteIdentityPool(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-identity delete-identity-pool")
				.argument("identity-pool-id", identityPoolId)
	}

}


fun AmazonCognitoIdentityFunctions.describeIdentity(identityId: String, init: AmazonCognitoIdentityDescribeIdentityCommand.() -> Unit) {
	this.block.declare(AmazonCognitoIdentityDescribeIdentityCommand(identityId).apply(init))
}

@Generated
class AmazonCognitoIdentityDescribeIdentityCommand(val identityId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidentity.model.DescribeIdentityRequest> {



	override fun build(): com.amazonaws.services.cognitoidentity.model.DescribeIdentityRequest {
		val input = com.amazonaws.services.cognitoidentity.model.DescribeIdentityRequest()
		input.setIdentityId(this.identityId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_identity.describeIdentity(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-identity describe-identity")
				.argument("identity-id", identityId)
	}

}


fun AmazonCognitoIdentityFunctions.describeIdentityPool(identityPoolId: String, init: AmazonCognitoIdentityDescribeIdentityPoolCommand.() -> Unit) {
	this.block.declare(AmazonCognitoIdentityDescribeIdentityPoolCommand(identityPoolId).apply(init))
}

@Generated
class AmazonCognitoIdentityDescribeIdentityPoolCommand(val identityPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidentity.model.DescribeIdentityPoolRequest> {



	override fun build(): com.amazonaws.services.cognitoidentity.model.DescribeIdentityPoolRequest {
		val input = com.amazonaws.services.cognitoidentity.model.DescribeIdentityPoolRequest()
		input.setIdentityPoolId(this.identityPoolId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_identity.describeIdentityPool(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-identity describe-identity-pool")
				.argument("identity-pool-id", identityPoolId)
	}

}


fun AmazonCognitoIdentityFunctions.getCredentialsForIdentity(identityId: String, init: AmazonCognitoIdentityGetCredentialsForIdentityCommand.() -> Unit) {
	this.block.declare(AmazonCognitoIdentityGetCredentialsForIdentityCommand(identityId).apply(init))
}

@Generated
class AmazonCognitoIdentityGetCredentialsForIdentityCommand(val identityId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityRequest> {

	var logins: Map<String, String>? = null
	var customRoleArn: String? = null

	override fun build(): com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityRequest {
		val input = com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityRequest()
		input.setIdentityId(this.identityId)
		input.setLogins(this.logins)
		input.setCustomRoleArn(this.customRoleArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_identity.getCredentialsForIdentity(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-identity get-credentials-for-identity")
				.argument("identity-id", identityId)
				.argument("logins", logins?.toString())
				.argument("custom-role-arn", customRoleArn)
	}

}


fun AmazonCognitoIdentityFunctions.getId(identityPoolId: String, init: AmazonCognitoIdentityGetIdCommand.() -> Unit) {
	this.block.declare(AmazonCognitoIdentityGetIdCommand(identityPoolId).apply(init))
}

@Generated
class AmazonCognitoIdentityGetIdCommand(val identityPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidentity.model.GetIdRequest> {

	var accountId: String? = null
	var logins: Map<String, String>? = null

	override fun build(): com.amazonaws.services.cognitoidentity.model.GetIdRequest {
		val input = com.amazonaws.services.cognitoidentity.model.GetIdRequest()
		input.setAccountId(this.accountId)
		input.setIdentityPoolId(this.identityPoolId)
		input.setLogins(this.logins)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_identity.getId(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-identity get-id")
				.argument("account-id", accountId)
				.argument("identity-pool-id", identityPoolId)
				.argument("logins", logins?.toString())
	}

}


fun AmazonCognitoIdentityFunctions.getIdentityPoolRoles(identityPoolId: String, init: AmazonCognitoIdentityGetIdentityPoolRolesCommand.() -> Unit) {
	this.block.declare(AmazonCognitoIdentityGetIdentityPoolRolesCommand(identityPoolId).apply(init))
}

@Generated
class AmazonCognitoIdentityGetIdentityPoolRolesCommand(val identityPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidentity.model.GetIdentityPoolRolesRequest> {



	override fun build(): com.amazonaws.services.cognitoidentity.model.GetIdentityPoolRolesRequest {
		val input = com.amazonaws.services.cognitoidentity.model.GetIdentityPoolRolesRequest()
		input.setIdentityPoolId(this.identityPoolId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_identity.getIdentityPoolRoles(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-identity get-identity-pool-roles")
				.argument("identity-pool-id", identityPoolId)
	}

}


fun AmazonCognitoIdentityFunctions.getOpenIdToken(identityId: String, init: AmazonCognitoIdentityGetOpenIdTokenCommand.() -> Unit) {
	this.block.declare(AmazonCognitoIdentityGetOpenIdTokenCommand(identityId).apply(init))
}

@Generated
class AmazonCognitoIdentityGetOpenIdTokenCommand(val identityId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenRequest> {

	var logins: Map<String, String>? = null

	override fun build(): com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenRequest {
		val input = com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenRequest()
		input.setIdentityId(this.identityId)
		input.setLogins(this.logins)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_identity.getOpenIdToken(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-identity get-open-id-token")
				.argument("identity-id", identityId)
				.argument("logins", logins?.toString())
	}

}


fun AmazonCognitoIdentityFunctions.getOpenIdTokenForDeveloperIdentity(identityPoolId: String, logins: Map<String, String>, init: AmazonCognitoIdentityGetOpenIdTokenForDeveloperIdentityCommand.() -> Unit) {
	this.block.declare(AmazonCognitoIdentityGetOpenIdTokenForDeveloperIdentityCommand(identityPoolId, logins).apply(init))
}

@Generated
class AmazonCognitoIdentityGetOpenIdTokenForDeveloperIdentityCommand(val identityPoolId: String, val logins: Map<String, String>) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenForDeveloperIdentityRequest> {

	var identityId: String? = null
	var tokenDuration: Long? = 0L

	override fun build(): com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenForDeveloperIdentityRequest {
		val input = com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenForDeveloperIdentityRequest()
		input.setIdentityPoolId(this.identityPoolId)
		input.setIdentityId(this.identityId)
		input.setLogins(this.logins)
		input.setTokenDuration(this.tokenDuration)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_identity.getOpenIdTokenForDeveloperIdentity(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-identity get-open-id-token-for-developer-identity")
				.argument("identity-pool-id", identityPoolId)
				.argument("identity-id", identityId)
				.argument("logins", logins.toString())
				.argument("token-duration", tokenDuration?.toString())
	}

}


fun AmazonCognitoIdentityFunctions.listIdentities(identityPoolId: String, maxResults: Int, init: AmazonCognitoIdentityListIdentitiesCommand.() -> Unit) {
	this.block.declare(AmazonCognitoIdentityListIdentitiesCommand(identityPoolId, maxResults).apply(init))
}

@Generated
class AmazonCognitoIdentityListIdentitiesCommand(val identityPoolId: String, val maxResults: Int) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidentity.model.ListIdentitiesRequest> {

	var nextToken: String? = null
	var hideDisabled: Boolean? = false

	override fun build(): com.amazonaws.services.cognitoidentity.model.ListIdentitiesRequest {
		val input = com.amazonaws.services.cognitoidentity.model.ListIdentitiesRequest()
		input.setIdentityPoolId(this.identityPoolId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		input.setHideDisabled(this.hideDisabled)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_identity.listIdentities(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-identity list-identities")
				.argument("identity-pool-id", identityPoolId)
				.argument("max-results", maxResults.toString())
				.argument("next-token", nextToken)
				.option("hide-disabled", hideDisabled ?: false)
	}

}


fun AmazonCognitoIdentityFunctions.listIdentityPools(maxResults: Int, init: AmazonCognitoIdentityListIdentityPoolsCommand.() -> Unit) {
	this.block.declare(AmazonCognitoIdentityListIdentityPoolsCommand(maxResults).apply(init))
}

@Generated
class AmazonCognitoIdentityListIdentityPoolsCommand(val maxResults: Int) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidentity.model.ListIdentityPoolsRequest> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cognitoidentity.model.ListIdentityPoolsRequest {
		val input = com.amazonaws.services.cognitoidentity.model.ListIdentityPoolsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_identity.listIdentityPools(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-identity list-identity-pools")
				.argument("max-results", maxResults.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonCognitoIdentityFunctions.lookupDeveloperIdentity(identityPoolId: String, init: AmazonCognitoIdentityLookupDeveloperIdentityCommand.() -> Unit) {
	this.block.declare(AmazonCognitoIdentityLookupDeveloperIdentityCommand(identityPoolId).apply(init))
}

@Generated
class AmazonCognitoIdentityLookupDeveloperIdentityCommand(val identityPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidentity.model.LookupDeveloperIdentityRequest> {

	var identityId: String? = null
	var developerUserIdentifier: String? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cognitoidentity.model.LookupDeveloperIdentityRequest {
		val input = com.amazonaws.services.cognitoidentity.model.LookupDeveloperIdentityRequest()
		input.setIdentityPoolId(this.identityPoolId)
		input.setIdentityId(this.identityId)
		input.setDeveloperUserIdentifier(this.developerUserIdentifier)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_identity.lookupDeveloperIdentity(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-identity lookup-developer-identity")
				.argument("identity-pool-id", identityPoolId)
				.argument("identity-id", identityId)
				.argument("developer-user-identifier", developerUserIdentifier)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonCognitoIdentityFunctions.mergeDeveloperIdentities(sourceUserIdentifier: String, destinationUserIdentifier: String, developerProviderName: String, identityPoolId: String, init: AmazonCognitoIdentityMergeDeveloperIdentitiesCommand.() -> Unit) {
	this.block.declare(AmazonCognitoIdentityMergeDeveloperIdentitiesCommand(sourceUserIdentifier, destinationUserIdentifier, developerProviderName, identityPoolId).apply(init))
}

@Generated
class AmazonCognitoIdentityMergeDeveloperIdentitiesCommand(val sourceUserIdentifier: String, val destinationUserIdentifier: String, val developerProviderName: String, val identityPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidentity.model.MergeDeveloperIdentitiesRequest> {



	override fun build(): com.amazonaws.services.cognitoidentity.model.MergeDeveloperIdentitiesRequest {
		val input = com.amazonaws.services.cognitoidentity.model.MergeDeveloperIdentitiesRequest()
		input.setSourceUserIdentifier(this.sourceUserIdentifier)
		input.setDestinationUserIdentifier(this.destinationUserIdentifier)
		input.setDeveloperProviderName(this.developerProviderName)
		input.setIdentityPoolId(this.identityPoolId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_identity.mergeDeveloperIdentities(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-identity merge-developer-identities")
				.argument("source-user-identifier", sourceUserIdentifier)
				.argument("destination-user-identifier", destinationUserIdentifier)
				.argument("developer-provider-name", developerProviderName)
				.argument("identity-pool-id", identityPoolId)
	}

}


fun AmazonCognitoIdentityFunctions.setIdentityPoolRoles(identityPoolId: String, roles: Map<String, String>, init: AmazonCognitoIdentitySetIdentityPoolRolesCommand.() -> Unit) {
	this.block.declare(AmazonCognitoIdentitySetIdentityPoolRolesCommand(identityPoolId, roles).apply(init))
}

@Generated
class AmazonCognitoIdentitySetIdentityPoolRolesCommand(val identityPoolId: String, val roles: Map<String, String>) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidentity.model.SetIdentityPoolRolesRequest> {

	var roleMappings: Map<String, com.amazonaws.services.cognitoidentity.model.RoleMapping>? = null

	override fun build(): com.amazonaws.services.cognitoidentity.model.SetIdentityPoolRolesRequest {
		val input = com.amazonaws.services.cognitoidentity.model.SetIdentityPoolRolesRequest()
		input.setIdentityPoolId(this.identityPoolId)
		input.setRoles(this.roles)
		input.setRoleMappings(this.roleMappings)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_identity.setIdentityPoolRoles(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-identity set-identity-pool-roles")
				.argument("identity-pool-id", identityPoolId)
				.argument("roles", roles.toString())
				.argument("role-mappings", roleMappings?.toString())
	}

}


fun AmazonCognitoIdentityFunctions.unlinkDeveloperIdentity(identityId: String, identityPoolId: String, developerProviderName: String, developerUserIdentifier: String, init: AmazonCognitoIdentityUnlinkDeveloperIdentityCommand.() -> Unit) {
	this.block.declare(AmazonCognitoIdentityUnlinkDeveloperIdentityCommand(identityId, identityPoolId, developerProviderName, developerUserIdentifier).apply(init))
}

@Generated
class AmazonCognitoIdentityUnlinkDeveloperIdentityCommand(val identityId: String, val identityPoolId: String, val developerProviderName: String, val developerUserIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidentity.model.UnlinkDeveloperIdentityRequest> {



	override fun build(): com.amazonaws.services.cognitoidentity.model.UnlinkDeveloperIdentityRequest {
		val input = com.amazonaws.services.cognitoidentity.model.UnlinkDeveloperIdentityRequest()
		input.setIdentityId(this.identityId)
		input.setIdentityPoolId(this.identityPoolId)
		input.setDeveloperProviderName(this.developerProviderName)
		input.setDeveloperUserIdentifier(this.developerUserIdentifier)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_identity.unlinkDeveloperIdentity(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-identity unlink-developer-identity")
				.argument("identity-id", identityId)
				.argument("identity-pool-id", identityPoolId)
				.argument("developer-provider-name", developerProviderName)
				.argument("developer-user-identifier", developerUserIdentifier)
	}

}


fun AmazonCognitoIdentityFunctions.unlinkIdentity(identityId: String, logins: Map<String, String>, loginsToRemove: List<String>, init: AmazonCognitoIdentityUnlinkIdentityCommand.() -> Unit) {
	this.block.declare(AmazonCognitoIdentityUnlinkIdentityCommand(identityId, logins, loginsToRemove).apply(init))
}

@Generated
class AmazonCognitoIdentityUnlinkIdentityCommand(val identityId: String, val logins: Map<String, String>, val loginsToRemove: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidentity.model.UnlinkIdentityRequest> {



	override fun build(): com.amazonaws.services.cognitoidentity.model.UnlinkIdentityRequest {
		val input = com.amazonaws.services.cognitoidentity.model.UnlinkIdentityRequest()
		input.setIdentityId(this.identityId)
		input.setLogins(this.logins)
		input.setLoginsToRemove(this.loginsToRemove)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_identity.unlinkIdentity(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-identity unlink-identity")
				.argument("identity-id", identityId)
				.argument("logins", logins.toString())
				.argument("logins-to-remove", loginsToRemove.toString())
	}

}


fun AmazonCognitoIdentityFunctions.updateIdentityPool(identityPoolId: String, identityPoolName: String, allowUnauthenticatedIdentities: Boolean, init: AmazonCognitoIdentityUpdateIdentityPoolCommand.() -> Unit) {
	this.block.declare(AmazonCognitoIdentityUpdateIdentityPoolCommand(identityPoolId, identityPoolName, allowUnauthenticatedIdentities).apply(init))
}

@Generated
class AmazonCognitoIdentityUpdateIdentityPoolCommand(val identityPoolId: String, val identityPoolName: String, val allowUnauthenticatedIdentities: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.cognitoidentity.model.UpdateIdentityPoolRequest> {

	var supportedLoginProviders: Map<String, String>? = null
	var developerProviderName: String? = null
	var openIdConnectProviderARNs: List<String>? = null
	var cognitoIdentityProviders: List<com.amazonaws.services.cognitoidentity.model.CognitoIdentityProvider>? = null
	var samlProviderARNs: List<String>? = null

	override fun build(): com.amazonaws.services.cognitoidentity.model.UpdateIdentityPoolRequest {
		val input = com.amazonaws.services.cognitoidentity.model.UpdateIdentityPoolRequest()
		input.setIdentityPoolId(this.identityPoolId)
		input.setIdentityPoolName(this.identityPoolName)
		input.setAllowUnauthenticatedIdentities(this.allowUnauthenticatedIdentities)
		input.setSupportedLoginProviders(this.supportedLoginProviders)
		input.setDeveloperProviderName(this.developerProviderName)
		input.setOpenIdConnectProviderARNs(this.openIdConnectProviderARNs)
		input.setCognitoIdentityProviders(this.cognitoIdentityProviders)
		input.setSamlProviderARNs(this.samlProviderARNs)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_identity.updateIdentityPool(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-identity update-identity-pool")
				.argument("identity-pool-id", identityPoolId)
				.argument("identity-pool-name", identityPoolName)
				.option("allow-unauthenticated-identities", allowUnauthenticatedIdentities ?: false)
				.argument("supported-login-providers", supportedLoginProviders?.toString())
				.argument("developer-provider-name", developerProviderName)
				.argument("open-id-connect-provider-arns", openIdConnectProviderARNs?.toString())
				.argument("cognito-identity-providers", cognitoIdentityProviders?.toString())
				.argument("saml-provider-arns", samlProviderARNs?.toString())
	}

}
