
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.kms.AWSKMS
import com.amazonaws.services.kms.model.*

var codingue.koops.core.Environment.kms: AWSKMS
	get() = this.capabilities[AWSKMS::class.java.name] as AWSKMS
	set(kms) {
		this.capabilities[AWSKMS::class.java.name] = kms
	}

@Generated
class AWSKMSFunctions(val block: Block)

infix fun AwsContinuation.kms(init: AWSKMSFunctions.() -> Unit) {
	AWSKMSFunctions(shell).apply(init)
}

			

fun AWSKMSFunctions.cancelKeyDeletion(keyId: String, init: AWSKMSCancelKeyDeletionCommand.() -> Unit) {
	this.block.declare(AWSKMSCancelKeyDeletionCommand(keyId).apply(init))
}

@Generated
class AWSKMSCancelKeyDeletionCommand(val keyId: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.CancelKeyDeletionRequest> {



	override fun build(): com.amazonaws.services.kms.model.CancelKeyDeletionRequest {
		val input = com.amazonaws.services.kms.model.CancelKeyDeletionRequest()
		input.setKeyId(this.keyId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kms.cancelKeyDeletion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms cancel-key-deletion")
				.argument("key-id", keyId)
	}

}


fun AWSKMSFunctions.createAlias(aliasName: String, targetKeyId: String, init: AWSKMSCreateAliasCommand.() -> Unit) {
	this.block.declare(AWSKMSCreateAliasCommand(aliasName, targetKeyId).apply(init))
}

@Generated
class AWSKMSCreateAliasCommand(val aliasName: String, val targetKeyId: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.CreateAliasRequest> {



	override fun build(): com.amazonaws.services.kms.model.CreateAliasRequest {
		val input = com.amazonaws.services.kms.model.CreateAliasRequest()
		input.setAliasName(this.aliasName)
		input.setTargetKeyId(this.targetKeyId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kms.createAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms create-alias")
				.argument("alias-name", aliasName)
				.argument("target-key-id", targetKeyId)
	}

}


fun AWSKMSFunctions.createGrant(keyId: String, granteePrincipal: String, operations: List<GrantOperation>, init: AWSKMSCreateGrantCommand.() -> Unit) {
	this.block.declare(AWSKMSCreateGrantCommand(keyId, granteePrincipal, operations).apply(init))
}

@Generated
class AWSKMSCreateGrantCommand(val keyId: String, val granteePrincipal: String, val operations: List<GrantOperation>) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.CreateGrantRequest> {

	var retiringPrincipal: String? = null
	var constraints: com.amazonaws.services.kms.model.GrantConstraints? = null
	var grantTokens: List<String>? = null
	var name: String? = null

	override fun build(): com.amazonaws.services.kms.model.CreateGrantRequest {
		val input = com.amazonaws.services.kms.model.CreateGrantRequest()
		input.setKeyId(this.keyId)
		input.setGranteePrincipal(this.granteePrincipal)
		input.setRetiringPrincipal(this.retiringPrincipal)
		input.setOperations(this.operations.map { it.toString() })
		input.setConstraints(this.constraints)
		input.setGrantTokens(this.grantTokens)
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kms.createGrant(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms create-grant")
				.argument("key-id", keyId)
				.argument("grantee-principal", granteePrincipal)
				.argument("retiring-principal", retiringPrincipal)
				.argument("operations", operations.toString())
				.argument("constraints", constraints?.toString())
				.argument("grant-tokens", grantTokens?.toString())
				.argument("name", name)
	}

}


fun AWSKMSFunctions.createKey(init: AWSKMSCreateKeyCommand.() -> Unit) {
	this.block.declare(AWSKMSCreateKeyCommand().apply(init))
}

@Generated
class AWSKMSCreateKeyCommand() : AmazonWebServiceCommand<com.amazonaws.services.kms.model.CreateKeyRequest> {

	var policy: String? = null
	var description: String? = null
	var keyUsage: KeyUsageType? = null
	var origin: OriginType? = null
	var bypassPolicyLockoutSafetyCheck: Boolean? = false
	var tags: List<com.amazonaws.services.kms.model.Tag>? = null

	override fun build(): com.amazonaws.services.kms.model.CreateKeyRequest {
		val input = com.amazonaws.services.kms.model.CreateKeyRequest()
		input.setPolicy(this.policy)
		input.setDescription(this.description)
		input.setKeyUsage(this.keyUsage?.toString())
		input.setOrigin(this.origin?.toString())
		input.setBypassPolicyLockoutSafetyCheck(this.bypassPolicyLockoutSafetyCheck)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kms.createKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms create-key")
				.argument("policy", policy)
				.argument("description", description)
				.argument("key-usage", keyUsage?.toString())
				.argument("origin", origin?.toString())
				.option("bypass-policy-lockout-safety-check", bypassPolicyLockoutSafetyCheck ?: false)
				.argument("tags", tags?.toString())
	}

}


fun AWSKMSFunctions.decrypt(ciphertextBlob: java.nio.ByteBuffer, init: AWSKMSDecryptCommand.() -> Unit) {
	this.block.declare(AWSKMSDecryptCommand(ciphertextBlob).apply(init))
}

@Generated
class AWSKMSDecryptCommand(val ciphertextBlob: java.nio.ByteBuffer) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.DecryptRequest> {

	var encryptionContext: Map<String, String>? = null
	var grantTokens: List<String>? = null

	override fun build(): com.amazonaws.services.kms.model.DecryptRequest {
		val input = com.amazonaws.services.kms.model.DecryptRequest()
		input.setCiphertextBlob(this.ciphertextBlob)
		input.setEncryptionContext(this.encryptionContext)
		input.setGrantTokens(this.grantTokens)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kms.decrypt(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms decrypt")
				.argument("ciphertext-blob", ciphertextBlob.toString())
				.argument("encryption-context", encryptionContext?.toString())
				.argument("grant-tokens", grantTokens?.toString())
	}

}


fun AWSKMSFunctions.deleteAlias(aliasName: String, init: AWSKMSDeleteAliasCommand.() -> Unit) {
	this.block.declare(AWSKMSDeleteAliasCommand(aliasName).apply(init))
}

@Generated
class AWSKMSDeleteAliasCommand(val aliasName: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.DeleteAliasRequest> {



	override fun build(): com.amazonaws.services.kms.model.DeleteAliasRequest {
		val input = com.amazonaws.services.kms.model.DeleteAliasRequest()
		input.setAliasName(this.aliasName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kms.deleteAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms delete-alias")
				.argument("alias-name", aliasName)
	}

}


fun AWSKMSFunctions.deleteImportedKeyMaterial(keyId: String, init: AWSKMSDeleteImportedKeyMaterialCommand.() -> Unit) {
	this.block.declare(AWSKMSDeleteImportedKeyMaterialCommand(keyId).apply(init))
}

@Generated
class AWSKMSDeleteImportedKeyMaterialCommand(val keyId: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.DeleteImportedKeyMaterialRequest> {



	override fun build(): com.amazonaws.services.kms.model.DeleteImportedKeyMaterialRequest {
		val input = com.amazonaws.services.kms.model.DeleteImportedKeyMaterialRequest()
		input.setKeyId(this.keyId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kms.deleteImportedKeyMaterial(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms delete-imported-key-material")
				.argument("key-id", keyId)
	}

}


fun AWSKMSFunctions.describeKey(keyId: String, init: AWSKMSDescribeKeyCommand.() -> Unit) {
	this.block.declare(AWSKMSDescribeKeyCommand(keyId).apply(init))
}

@Generated
class AWSKMSDescribeKeyCommand(val keyId: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.DescribeKeyRequest> {

	var grantTokens: List<String>? = null

	override fun build(): com.amazonaws.services.kms.model.DescribeKeyRequest {
		val input = com.amazonaws.services.kms.model.DescribeKeyRequest()
		input.setKeyId(this.keyId)
		input.setGrantTokens(this.grantTokens)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kms.describeKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms describe-key")
				.argument("key-id", keyId)
				.argument("grant-tokens", grantTokens?.toString())
	}

}


fun AWSKMSFunctions.disableKey(keyId: String, init: AWSKMSDisableKeyCommand.() -> Unit) {
	this.block.declare(AWSKMSDisableKeyCommand(keyId).apply(init))
}

@Generated
class AWSKMSDisableKeyCommand(val keyId: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.DisableKeyRequest> {



	override fun build(): com.amazonaws.services.kms.model.DisableKeyRequest {
		val input = com.amazonaws.services.kms.model.DisableKeyRequest()
		input.setKeyId(this.keyId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kms.disableKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms disable-key")
				.argument("key-id", keyId)
	}

}


fun AWSKMSFunctions.disableKeyRotation(keyId: String, init: AWSKMSDisableKeyRotationCommand.() -> Unit) {
	this.block.declare(AWSKMSDisableKeyRotationCommand(keyId).apply(init))
}

@Generated
class AWSKMSDisableKeyRotationCommand(val keyId: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.DisableKeyRotationRequest> {



	override fun build(): com.amazonaws.services.kms.model.DisableKeyRotationRequest {
		val input = com.amazonaws.services.kms.model.DisableKeyRotationRequest()
		input.setKeyId(this.keyId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kms.disableKeyRotation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms disable-key-rotation")
				.argument("key-id", keyId)
	}

}


fun AWSKMSFunctions.enableKey(keyId: String, init: AWSKMSEnableKeyCommand.() -> Unit) {
	this.block.declare(AWSKMSEnableKeyCommand(keyId).apply(init))
}

@Generated
class AWSKMSEnableKeyCommand(val keyId: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.EnableKeyRequest> {



	override fun build(): com.amazonaws.services.kms.model.EnableKeyRequest {
		val input = com.amazonaws.services.kms.model.EnableKeyRequest()
		input.setKeyId(this.keyId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kms.enableKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms enable-key")
				.argument("key-id", keyId)
	}

}


fun AWSKMSFunctions.enableKeyRotation(keyId: String, init: AWSKMSEnableKeyRotationCommand.() -> Unit) {
	this.block.declare(AWSKMSEnableKeyRotationCommand(keyId).apply(init))
}

@Generated
class AWSKMSEnableKeyRotationCommand(val keyId: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.EnableKeyRotationRequest> {



	override fun build(): com.amazonaws.services.kms.model.EnableKeyRotationRequest {
		val input = com.amazonaws.services.kms.model.EnableKeyRotationRequest()
		input.setKeyId(this.keyId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kms.enableKeyRotation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms enable-key-rotation")
				.argument("key-id", keyId)
	}

}


fun AWSKMSFunctions.encrypt(keyId: String, plaintext: java.nio.ByteBuffer, init: AWSKMSEncryptCommand.() -> Unit) {
	this.block.declare(AWSKMSEncryptCommand(keyId, plaintext).apply(init))
}

@Generated
class AWSKMSEncryptCommand(val keyId: String, val plaintext: java.nio.ByteBuffer) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.EncryptRequest> {

	var encryptionContext: Map<String, String>? = null
	var grantTokens: List<String>? = null

	override fun build(): com.amazonaws.services.kms.model.EncryptRequest {
		val input = com.amazonaws.services.kms.model.EncryptRequest()
		input.setKeyId(this.keyId)
		input.setPlaintext(this.plaintext)
		input.setEncryptionContext(this.encryptionContext)
		input.setGrantTokens(this.grantTokens)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kms.encrypt(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms encrypt")
				.argument("key-id", keyId)
				.argument("plaintext", plaintext.toString())
				.argument("encryption-context", encryptionContext?.toString())
				.argument("grant-tokens", grantTokens?.toString())
	}

}


fun AWSKMSFunctions.generateDataKey(keyId: String, init: AWSKMSGenerateDataKeyCommand.() -> Unit) {
	this.block.declare(AWSKMSGenerateDataKeyCommand(keyId).apply(init))
}

@Generated
class AWSKMSGenerateDataKeyCommand(val keyId: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.GenerateDataKeyRequest> {

	var encryptionContext: Map<String, String>? = null
	var numberOfBytes: Int? = 0
	var keySpec: DataKeySpec? = null
	var grantTokens: List<String>? = null

	override fun build(): com.amazonaws.services.kms.model.GenerateDataKeyRequest {
		val input = com.amazonaws.services.kms.model.GenerateDataKeyRequest()
		input.setKeyId(this.keyId)
		input.setEncryptionContext(this.encryptionContext)
		input.setNumberOfBytes(this.numberOfBytes)
		input.setKeySpec(this.keySpec?.toString())
		input.setGrantTokens(this.grantTokens)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kms.generateDataKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms generate-data-key")
				.argument("key-id", keyId)
				.argument("encryption-context", encryptionContext?.toString())
				.argument("number-of-bytes", numberOfBytes?.toString())
				.argument("key-spec", keySpec?.toString())
				.argument("grant-tokens", grantTokens?.toString())
	}

}


fun AWSKMSFunctions.generateDataKeyWithoutPlaintext(keyId: String, init: AWSKMSGenerateDataKeyWithoutPlaintextCommand.() -> Unit) {
	this.block.declare(AWSKMSGenerateDataKeyWithoutPlaintextCommand(keyId).apply(init))
}

@Generated
class AWSKMSGenerateDataKeyWithoutPlaintextCommand(val keyId: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.GenerateDataKeyWithoutPlaintextRequest> {

	var encryptionContext: Map<String, String>? = null
	var keySpec: DataKeySpec? = null
	var numberOfBytes: Int? = 0
	var grantTokens: List<String>? = null

	override fun build(): com.amazonaws.services.kms.model.GenerateDataKeyWithoutPlaintextRequest {
		val input = com.amazonaws.services.kms.model.GenerateDataKeyWithoutPlaintextRequest()
		input.setKeyId(this.keyId)
		input.setEncryptionContext(this.encryptionContext)
		input.setKeySpec(this.keySpec?.toString())
		input.setNumberOfBytes(this.numberOfBytes)
		input.setGrantTokens(this.grantTokens)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kms.generateDataKeyWithoutPlaintext(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms generate-data-key-without-plaintext")
				.argument("key-id", keyId)
				.argument("encryption-context", encryptionContext?.toString())
				.argument("key-spec", keySpec?.toString())
				.argument("number-of-bytes", numberOfBytes?.toString())
				.argument("grant-tokens", grantTokens?.toString())
	}

}


fun AWSKMSFunctions.generateRandom(init: AWSKMSGenerateRandomCommand.() -> Unit) {
	this.block.declare(AWSKMSGenerateRandomCommand().apply(init))
}

@Generated
class AWSKMSGenerateRandomCommand() : AmazonWebServiceCommand<com.amazonaws.services.kms.model.GenerateRandomRequest> {

	var numberOfBytes: Int? = 0

	override fun build(): com.amazonaws.services.kms.model.GenerateRandomRequest {
		val input = com.amazonaws.services.kms.model.GenerateRandomRequest()
		input.setNumberOfBytes(this.numberOfBytes)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kms.generateRandom(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms generate-random")
				.argument("number-of-bytes", numberOfBytes?.toString())
	}

}


fun AWSKMSFunctions.getKeyPolicy(keyId: String, policyName: String, init: AWSKMSGetKeyPolicyCommand.() -> Unit) {
	this.block.declare(AWSKMSGetKeyPolicyCommand(keyId, policyName).apply(init))
}

@Generated
class AWSKMSGetKeyPolicyCommand(val keyId: String, val policyName: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.GetKeyPolicyRequest> {



	override fun build(): com.amazonaws.services.kms.model.GetKeyPolicyRequest {
		val input = com.amazonaws.services.kms.model.GetKeyPolicyRequest()
		input.setKeyId(this.keyId)
		input.setPolicyName(this.policyName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kms.getKeyPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms get-key-policy")
				.argument("key-id", keyId)
				.argument("policy-name", policyName)
	}

}


fun AWSKMSFunctions.getKeyRotationStatus(keyId: String, init: AWSKMSGetKeyRotationStatusCommand.() -> Unit) {
	this.block.declare(AWSKMSGetKeyRotationStatusCommand(keyId).apply(init))
}

@Generated
class AWSKMSGetKeyRotationStatusCommand(val keyId: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.GetKeyRotationStatusRequest> {



	override fun build(): com.amazonaws.services.kms.model.GetKeyRotationStatusRequest {
		val input = com.amazonaws.services.kms.model.GetKeyRotationStatusRequest()
		input.setKeyId(this.keyId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kms.getKeyRotationStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms get-key-rotation-status")
				.argument("key-id", keyId)
	}

}


fun AWSKMSFunctions.getParametersForImport(keyId: String, wrappingAlgorithm: AlgorithmSpec, wrappingKeySpec: WrappingKeySpec, init: AWSKMSGetParametersForImportCommand.() -> Unit) {
	this.block.declare(AWSKMSGetParametersForImportCommand(keyId, wrappingAlgorithm, wrappingKeySpec).apply(init))
}

@Generated
class AWSKMSGetParametersForImportCommand(val keyId: String, val wrappingAlgorithm: AlgorithmSpec, val wrappingKeySpec: WrappingKeySpec) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.GetParametersForImportRequest> {



	override fun build(): com.amazonaws.services.kms.model.GetParametersForImportRequest {
		val input = com.amazonaws.services.kms.model.GetParametersForImportRequest()
		input.setKeyId(this.keyId)
		input.setWrappingAlgorithm(this.wrappingAlgorithm.toString())
		input.setWrappingKeySpec(this.wrappingKeySpec.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kms.getParametersForImport(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms get-parameters-for-import")
				.argument("key-id", keyId)
				.argument("wrapping-algorithm", wrappingAlgorithm.toString())
				.argument("wrapping-key-spec", wrappingKeySpec.toString())
	}

}


fun AWSKMSFunctions.importKeyMaterial(keyId: String, importToken: java.nio.ByteBuffer, encryptedKeyMaterial: java.nio.ByteBuffer, init: AWSKMSImportKeyMaterialCommand.() -> Unit) {
	this.block.declare(AWSKMSImportKeyMaterialCommand(keyId, importToken, encryptedKeyMaterial).apply(init))
}

@Generated
class AWSKMSImportKeyMaterialCommand(val keyId: String, val importToken: java.nio.ByteBuffer, val encryptedKeyMaterial: java.nio.ByteBuffer) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.ImportKeyMaterialRequest> {

	var validTo: java.util.Date? = null
	var expirationModel: ExpirationModelType? = null

	override fun build(): com.amazonaws.services.kms.model.ImportKeyMaterialRequest {
		val input = com.amazonaws.services.kms.model.ImportKeyMaterialRequest()
		input.setKeyId(this.keyId)
		input.setImportToken(this.importToken)
		input.setEncryptedKeyMaterial(this.encryptedKeyMaterial)
		input.setValidTo(this.validTo)
		input.setExpirationModel(this.expirationModel?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kms.importKeyMaterial(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms import-key-material")
				.argument("key-id", keyId)
				.argument("import-token", importToken.toString())
				.argument("encrypted-key-material", encryptedKeyMaterial.toString())
				.argument("valid-to", validTo?.toString())
				.argument("expiration-model", expirationModel?.toString())
	}

}


fun AWSKMSFunctions.listAliases(init: AWSKMSListAliasesCommand.() -> Unit) {
	this.block.declare(AWSKMSListAliasesCommand().apply(init))
}

@Generated
class AWSKMSListAliasesCommand() : AmazonWebServiceCommand<com.amazonaws.services.kms.model.ListAliasesRequest> {

	var limit: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.kms.model.ListAliasesRequest {
		val input = com.amazonaws.services.kms.model.ListAliasesRequest()
		input.setLimit(this.limit)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kms.listAliases(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms list-aliases")
				.argument("limit", limit?.toString())
				.argument("marker", marker)
	}

}


fun AWSKMSFunctions.listGrants(keyId: String, init: AWSKMSListGrantsCommand.() -> Unit) {
	this.block.declare(AWSKMSListGrantsCommand(keyId).apply(init))
}

@Generated
class AWSKMSListGrantsCommand(val keyId: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.ListGrantsRequest> {

	var limit: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.kms.model.ListGrantsRequest {
		val input = com.amazonaws.services.kms.model.ListGrantsRequest()
		input.setLimit(this.limit)
		input.setMarker(this.marker)
		input.setKeyId(this.keyId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kms.listGrants(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms list-grants")
				.argument("limit", limit?.toString())
				.argument("marker", marker)
				.argument("key-id", keyId)
	}

}


fun AWSKMSFunctions.listKeyPolicies(keyId: String, init: AWSKMSListKeyPoliciesCommand.() -> Unit) {
	this.block.declare(AWSKMSListKeyPoliciesCommand(keyId).apply(init))
}

@Generated
class AWSKMSListKeyPoliciesCommand(val keyId: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.ListKeyPoliciesRequest> {

	var limit: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.kms.model.ListKeyPoliciesRequest {
		val input = com.amazonaws.services.kms.model.ListKeyPoliciesRequest()
		input.setKeyId(this.keyId)
		input.setLimit(this.limit)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kms.listKeyPolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms list-key-policies")
				.argument("key-id", keyId)
				.argument("limit", limit?.toString())
				.argument("marker", marker)
	}

}


fun AWSKMSFunctions.listKeys(init: AWSKMSListKeysCommand.() -> Unit) {
	this.block.declare(AWSKMSListKeysCommand().apply(init))
}

@Generated
class AWSKMSListKeysCommand() : AmazonWebServiceCommand<com.amazonaws.services.kms.model.ListKeysRequest> {

	var limit: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.kms.model.ListKeysRequest {
		val input = com.amazonaws.services.kms.model.ListKeysRequest()
		input.setLimit(this.limit)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kms.listKeys(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms list-keys")
				.argument("limit", limit?.toString())
				.argument("marker", marker)
	}

}


fun AWSKMSFunctions.listResourceTags(keyId: String, init: AWSKMSListResourceTagsCommand.() -> Unit) {
	this.block.declare(AWSKMSListResourceTagsCommand(keyId).apply(init))
}

@Generated
class AWSKMSListResourceTagsCommand(val keyId: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.ListResourceTagsRequest> {

	var limit: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.kms.model.ListResourceTagsRequest {
		val input = com.amazonaws.services.kms.model.ListResourceTagsRequest()
		input.setKeyId(this.keyId)
		input.setLimit(this.limit)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kms.listResourceTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms list-resource-tags")
				.argument("key-id", keyId)
				.argument("limit", limit?.toString())
				.argument("marker", marker)
	}

}


fun AWSKMSFunctions.listRetirableGrants(retiringPrincipal: String, init: AWSKMSListRetirableGrantsCommand.() -> Unit) {
	this.block.declare(AWSKMSListRetirableGrantsCommand(retiringPrincipal).apply(init))
}

@Generated
class AWSKMSListRetirableGrantsCommand(val retiringPrincipal: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.ListRetirableGrantsRequest> {

	var limit: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.kms.model.ListRetirableGrantsRequest {
		val input = com.amazonaws.services.kms.model.ListRetirableGrantsRequest()
		input.setLimit(this.limit)
		input.setMarker(this.marker)
		input.setRetiringPrincipal(this.retiringPrincipal)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kms.listRetirableGrants(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms list-retirable-grants")
				.argument("limit", limit?.toString())
				.argument("marker", marker)
				.argument("retiring-principal", retiringPrincipal)
	}

}


fun AWSKMSFunctions.putKeyPolicy(keyId: String, policyName: String, policy: String, init: AWSKMSPutKeyPolicyCommand.() -> Unit) {
	this.block.declare(AWSKMSPutKeyPolicyCommand(keyId, policyName, policy).apply(init))
}

@Generated
class AWSKMSPutKeyPolicyCommand(val keyId: String, val policyName: String, val policy: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.PutKeyPolicyRequest> {

	var bypassPolicyLockoutSafetyCheck: Boolean? = false

	override fun build(): com.amazonaws.services.kms.model.PutKeyPolicyRequest {
		val input = com.amazonaws.services.kms.model.PutKeyPolicyRequest()
		input.setKeyId(this.keyId)
		input.setPolicyName(this.policyName)
		input.setPolicy(this.policy)
		input.setBypassPolicyLockoutSafetyCheck(this.bypassPolicyLockoutSafetyCheck)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kms.putKeyPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms put-key-policy")
				.argument("key-id", keyId)
				.argument("policy-name", policyName)
				.argument("policy", policy)
				.option("bypass-policy-lockout-safety-check", bypassPolicyLockoutSafetyCheck ?: false)
	}

}


fun AWSKMSFunctions.reEncrypt(ciphertextBlob: java.nio.ByteBuffer, destinationKeyId: String, init: AWSKMSReEncryptCommand.() -> Unit) {
	this.block.declare(AWSKMSReEncryptCommand(ciphertextBlob, destinationKeyId).apply(init))
}

@Generated
class AWSKMSReEncryptCommand(val ciphertextBlob: java.nio.ByteBuffer, val destinationKeyId: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.ReEncryptRequest> {

	var sourceEncryptionContext: Map<String, String>? = null
	var destinationEncryptionContext: Map<String, String>? = null
	var grantTokens: List<String>? = null

	override fun build(): com.amazonaws.services.kms.model.ReEncryptRequest {
		val input = com.amazonaws.services.kms.model.ReEncryptRequest()
		input.setCiphertextBlob(this.ciphertextBlob)
		input.setSourceEncryptionContext(this.sourceEncryptionContext)
		input.setDestinationKeyId(this.destinationKeyId)
		input.setDestinationEncryptionContext(this.destinationEncryptionContext)
		input.setGrantTokens(this.grantTokens)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kms.reEncrypt(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms re-encrypt")
				.argument("ciphertext-blob", ciphertextBlob.toString())
				.argument("source-encryption-context", sourceEncryptionContext?.toString())
				.argument("destination-key-id", destinationKeyId)
				.argument("destination-encryption-context", destinationEncryptionContext?.toString())
				.argument("grant-tokens", grantTokens?.toString())
	}

}


fun AWSKMSFunctions.retireGrant(init: AWSKMSRetireGrantCommand.() -> Unit) {
	this.block.declare(AWSKMSRetireGrantCommand().apply(init))
}

@Generated
class AWSKMSRetireGrantCommand() : AmazonWebServiceCommand<com.amazonaws.services.kms.model.RetireGrantRequest> {

	var grantToken: String? = null
	var keyId: String? = null
	var grantId: String? = null

	override fun build(): com.amazonaws.services.kms.model.RetireGrantRequest {
		val input = com.amazonaws.services.kms.model.RetireGrantRequest()
		input.setGrantToken(this.grantToken)
		input.setKeyId(this.keyId)
		input.setGrantId(this.grantId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kms.retireGrant(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms retire-grant")
				.argument("grant-token", grantToken)
				.argument("key-id", keyId)
				.argument("grant-id", grantId)
	}

}


fun AWSKMSFunctions.revokeGrant(keyId: String, grantId: String, init: AWSKMSRevokeGrantCommand.() -> Unit) {
	this.block.declare(AWSKMSRevokeGrantCommand(keyId, grantId).apply(init))
}

@Generated
class AWSKMSRevokeGrantCommand(val keyId: String, val grantId: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.RevokeGrantRequest> {



	override fun build(): com.amazonaws.services.kms.model.RevokeGrantRequest {
		val input = com.amazonaws.services.kms.model.RevokeGrantRequest()
		input.setKeyId(this.keyId)
		input.setGrantId(this.grantId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kms.revokeGrant(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms revoke-grant")
				.argument("key-id", keyId)
				.argument("grant-id", grantId)
	}

}


fun AWSKMSFunctions.scheduleKeyDeletion(keyId: String, init: AWSKMSScheduleKeyDeletionCommand.() -> Unit) {
	this.block.declare(AWSKMSScheduleKeyDeletionCommand(keyId).apply(init))
}

@Generated
class AWSKMSScheduleKeyDeletionCommand(val keyId: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.ScheduleKeyDeletionRequest> {

	var pendingWindowInDays: Int? = 0

	override fun build(): com.amazonaws.services.kms.model.ScheduleKeyDeletionRequest {
		val input = com.amazonaws.services.kms.model.ScheduleKeyDeletionRequest()
		input.setKeyId(this.keyId)
		input.setPendingWindowInDays(this.pendingWindowInDays)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kms.scheduleKeyDeletion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms schedule-key-deletion")
				.argument("key-id", keyId)
				.argument("pending-window-in-days", pendingWindowInDays?.toString())
	}

}


fun AWSKMSFunctions.tagResource(keyId: String, tags: List<com.amazonaws.services.kms.model.Tag>, init: AWSKMSTagResourceCommand.() -> Unit) {
	this.block.declare(AWSKMSTagResourceCommand(keyId, tags).apply(init))
}

@Generated
class AWSKMSTagResourceCommand(val keyId: String, val tags: List<com.amazonaws.services.kms.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.TagResourceRequest> {



	override fun build(): com.amazonaws.services.kms.model.TagResourceRequest {
		val input = com.amazonaws.services.kms.model.TagResourceRequest()
		input.setKeyId(this.keyId)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kms.tagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms tag-resource")
				.argument("key-id", keyId)
				.argument("tags", tags.toString())
	}

}


fun AWSKMSFunctions.untagResource(keyId: String, tagKeys: List<String>, init: AWSKMSUntagResourceCommand.() -> Unit) {
	this.block.declare(AWSKMSUntagResourceCommand(keyId, tagKeys).apply(init))
}

@Generated
class AWSKMSUntagResourceCommand(val keyId: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.UntagResourceRequest> {



	override fun build(): com.amazonaws.services.kms.model.UntagResourceRequest {
		val input = com.amazonaws.services.kms.model.UntagResourceRequest()
		input.setKeyId(this.keyId)
		input.setTagKeys(this.tagKeys)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kms.untagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms untag-resource")
				.argument("key-id", keyId)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AWSKMSFunctions.updateAlias(aliasName: String, targetKeyId: String, init: AWSKMSUpdateAliasCommand.() -> Unit) {
	this.block.declare(AWSKMSUpdateAliasCommand(aliasName, targetKeyId).apply(init))
}

@Generated
class AWSKMSUpdateAliasCommand(val aliasName: String, val targetKeyId: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.UpdateAliasRequest> {



	override fun build(): com.amazonaws.services.kms.model.UpdateAliasRequest {
		val input = com.amazonaws.services.kms.model.UpdateAliasRequest()
		input.setAliasName(this.aliasName)
		input.setTargetKeyId(this.targetKeyId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kms.updateAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms update-alias")
				.argument("alias-name", aliasName)
				.argument("target-key-id", targetKeyId)
	}

}


fun AWSKMSFunctions.updateKeyDescription(keyId: String, description: String, init: AWSKMSUpdateKeyDescriptionCommand.() -> Unit) {
	this.block.declare(AWSKMSUpdateKeyDescriptionCommand(keyId, description).apply(init))
}

@Generated
class AWSKMSUpdateKeyDescriptionCommand(val keyId: String, val description: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.UpdateKeyDescriptionRequest> {



	override fun build(): com.amazonaws.services.kms.model.UpdateKeyDescriptionRequest {
		val input = com.amazonaws.services.kms.model.UpdateKeyDescriptionRequest()
		input.setKeyId(this.keyId)
		input.setDescription(this.description)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kms.updateKeyDescription(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms update-key-description")
				.argument("key-id", keyId)
				.argument("description", description)
	}

}
