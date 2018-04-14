
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws.kms

import javax.annotation.Generated
import codingue.koops.core.*
import codingue.koops.aws.*
import com.amazonaws.services.kms.*
import com.amazonaws.services.kms.model.*

var codingue.koops.core.Environment.kms: AWSKMS
	get() {
		var service = this.capabilities["aws-kms"]
		if (service == null) {
			service = AWSKMSClientBuilder.standard().build()
			this.capabilities["aws-kms"] = service
		}
		return service as AWSKMS
	}
	set(kms) {
		this.capabilities["aws-kms"] = kms
	}

@Generated
class AWSKMSFunctions(val block: Block)

infix fun <T> AwsContinuation.kms(init: AWSKMSFunctions.() -> T): T {
	return AWSKMSFunctions(shell).run(init)
}

			

fun AWSKMSFunctions.cancelKeyDeletion(keyId: String, init: AWSKMSCancelKeyDeletionCommand.() -> Unit): com.amazonaws.services.kms.model.CancelKeyDeletionResult {
	return this.block.declare(AWSKMSCancelKeyDeletionCommand(keyId).apply(init)) as com.amazonaws.services.kms.model.CancelKeyDeletionResult
}

@Generated
class AWSKMSCancelKeyDeletionCommand(val keyId: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.CancelKeyDeletionRequest, com.amazonaws.services.kms.model.CancelKeyDeletionResult> {



	override fun build(): com.amazonaws.services.kms.model.CancelKeyDeletionRequest {
		val input = com.amazonaws.services.kms.model.CancelKeyDeletionRequest()
		input.setKeyId(this.keyId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kms.model.CancelKeyDeletionResult {
	  return com.amazonaws.services.kms.model.CancelKeyDeletionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kms.model.CancelKeyDeletionResult {
		return environment.kms.cancelKeyDeletion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms cancel-key-deletion")
				.argument("key-id", keyId)
	}

}


fun AWSKMSFunctions.createAlias(aliasName: String, targetKeyId: String, init: AWSKMSCreateAliasCommand.() -> Unit): com.amazonaws.services.kms.model.CreateAliasResult {
	return this.block.declare(AWSKMSCreateAliasCommand(aliasName, targetKeyId).apply(init)) as com.amazonaws.services.kms.model.CreateAliasResult
}

@Generated
class AWSKMSCreateAliasCommand(val aliasName: String, val targetKeyId: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.CreateAliasRequest, com.amazonaws.services.kms.model.CreateAliasResult> {



	override fun build(): com.amazonaws.services.kms.model.CreateAliasRequest {
		val input = com.amazonaws.services.kms.model.CreateAliasRequest()
		input.setAliasName(this.aliasName)
		input.setTargetKeyId(this.targetKeyId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kms.model.CreateAliasResult {
	  return com.amazonaws.services.kms.model.CreateAliasResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kms.model.CreateAliasResult {
		return environment.kms.createAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms create-alias")
				.argument("alias-name", aliasName)
				.argument("target-key-id", targetKeyId)
	}

}


fun AWSKMSFunctions.createGrant(keyId: String, granteePrincipal: String, operations: List<GrantOperation>, init: AWSKMSCreateGrantCommand.() -> Unit): com.amazonaws.services.kms.model.CreateGrantResult {
	return this.block.declare(AWSKMSCreateGrantCommand(keyId, granteePrincipal, operations).apply(init)) as com.amazonaws.services.kms.model.CreateGrantResult
}

@Generated
class AWSKMSCreateGrantCommand(val keyId: String, val granteePrincipal: String, val operations: List<GrantOperation>) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.CreateGrantRequest, com.amazonaws.services.kms.model.CreateGrantResult> {

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

	
	override fun dryResult(): com.amazonaws.services.kms.model.CreateGrantResult {
	  return com.amazonaws.services.kms.model.CreateGrantResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kms.model.CreateGrantResult {
		return environment.kms.createGrant(build())
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


fun AWSKMSFunctions.createKey(init: AWSKMSCreateKeyCommand.() -> Unit): com.amazonaws.services.kms.model.CreateKeyResult {
	return this.block.declare(AWSKMSCreateKeyCommand().apply(init)) as com.amazonaws.services.kms.model.CreateKeyResult
}

@Generated
class AWSKMSCreateKeyCommand() : AmazonWebServiceCommand<com.amazonaws.services.kms.model.CreateKeyRequest, com.amazonaws.services.kms.model.CreateKeyResult> {

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

	
	override fun dryResult(): com.amazonaws.services.kms.model.CreateKeyResult {
	  return com.amazonaws.services.kms.model.CreateKeyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kms.model.CreateKeyResult {
		return environment.kms.createKey(build())
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


fun AWSKMSFunctions.decrypt(ciphertextBlob: java.nio.ByteBuffer, init: AWSKMSDecryptCommand.() -> Unit): com.amazonaws.services.kms.model.DecryptResult {
	return this.block.declare(AWSKMSDecryptCommand(ciphertextBlob).apply(init)) as com.amazonaws.services.kms.model.DecryptResult
}

@Generated
class AWSKMSDecryptCommand(val ciphertextBlob: java.nio.ByteBuffer) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.DecryptRequest, com.amazonaws.services.kms.model.DecryptResult> {

	var encryptionContext: Map<String, String>? = null
	var grantTokens: List<String>? = null

	override fun build(): com.amazonaws.services.kms.model.DecryptRequest {
		val input = com.amazonaws.services.kms.model.DecryptRequest()
		input.setCiphertextBlob(this.ciphertextBlob)
		input.setEncryptionContext(this.encryptionContext)
		input.setGrantTokens(this.grantTokens)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kms.model.DecryptResult {
	  return com.amazonaws.services.kms.model.DecryptResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kms.model.DecryptResult {
		return environment.kms.decrypt(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms decrypt")
				.argument("ciphertext-blob", ciphertextBlob.toString())
				.argument("encryption-context", encryptionContext?.toString())
				.argument("grant-tokens", grantTokens?.toString())
	}

}


fun AWSKMSFunctions.deleteAlias(aliasName: String, init: AWSKMSDeleteAliasCommand.() -> Unit): com.amazonaws.services.kms.model.DeleteAliasResult {
	return this.block.declare(AWSKMSDeleteAliasCommand(aliasName).apply(init)) as com.amazonaws.services.kms.model.DeleteAliasResult
}

@Generated
class AWSKMSDeleteAliasCommand(val aliasName: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.DeleteAliasRequest, com.amazonaws.services.kms.model.DeleteAliasResult> {



	override fun build(): com.amazonaws.services.kms.model.DeleteAliasRequest {
		val input = com.amazonaws.services.kms.model.DeleteAliasRequest()
		input.setAliasName(this.aliasName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kms.model.DeleteAliasResult {
	  return com.amazonaws.services.kms.model.DeleteAliasResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kms.model.DeleteAliasResult {
		return environment.kms.deleteAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms delete-alias")
				.argument("alias-name", aliasName)
	}

}


fun AWSKMSFunctions.deleteImportedKeyMaterial(keyId: String, init: AWSKMSDeleteImportedKeyMaterialCommand.() -> Unit): com.amazonaws.services.kms.model.DeleteImportedKeyMaterialResult {
	return this.block.declare(AWSKMSDeleteImportedKeyMaterialCommand(keyId).apply(init)) as com.amazonaws.services.kms.model.DeleteImportedKeyMaterialResult
}

@Generated
class AWSKMSDeleteImportedKeyMaterialCommand(val keyId: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.DeleteImportedKeyMaterialRequest, com.amazonaws.services.kms.model.DeleteImportedKeyMaterialResult> {



	override fun build(): com.amazonaws.services.kms.model.DeleteImportedKeyMaterialRequest {
		val input = com.amazonaws.services.kms.model.DeleteImportedKeyMaterialRequest()
		input.setKeyId(this.keyId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kms.model.DeleteImportedKeyMaterialResult {
	  return com.amazonaws.services.kms.model.DeleteImportedKeyMaterialResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kms.model.DeleteImportedKeyMaterialResult {
		return environment.kms.deleteImportedKeyMaterial(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms delete-imported-key-material")
				.argument("key-id", keyId)
	}

}


fun AWSKMSFunctions.describeKey(keyId: String, init: AWSKMSDescribeKeyCommand.() -> Unit): com.amazonaws.services.kms.model.DescribeKeyResult {
	return this.block.declare(AWSKMSDescribeKeyCommand(keyId).apply(init)) as com.amazonaws.services.kms.model.DescribeKeyResult
}

@Generated
class AWSKMSDescribeKeyCommand(val keyId: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.DescribeKeyRequest, com.amazonaws.services.kms.model.DescribeKeyResult> {

	var grantTokens: List<String>? = null

	override fun build(): com.amazonaws.services.kms.model.DescribeKeyRequest {
		val input = com.amazonaws.services.kms.model.DescribeKeyRequest()
		input.setKeyId(this.keyId)
		input.setGrantTokens(this.grantTokens)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kms.model.DescribeKeyResult {
	  return com.amazonaws.services.kms.model.DescribeKeyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kms.model.DescribeKeyResult {
		return environment.kms.describeKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms describe-key")
				.argument("key-id", keyId)
				.argument("grant-tokens", grantTokens?.toString())
	}

}


fun AWSKMSFunctions.disableKey(keyId: String, init: AWSKMSDisableKeyCommand.() -> Unit): com.amazonaws.services.kms.model.DisableKeyResult {
	return this.block.declare(AWSKMSDisableKeyCommand(keyId).apply(init)) as com.amazonaws.services.kms.model.DisableKeyResult
}

@Generated
class AWSKMSDisableKeyCommand(val keyId: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.DisableKeyRequest, com.amazonaws.services.kms.model.DisableKeyResult> {



	override fun build(): com.amazonaws.services.kms.model.DisableKeyRequest {
		val input = com.amazonaws.services.kms.model.DisableKeyRequest()
		input.setKeyId(this.keyId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kms.model.DisableKeyResult {
	  return com.amazonaws.services.kms.model.DisableKeyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kms.model.DisableKeyResult {
		return environment.kms.disableKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms disable-key")
				.argument("key-id", keyId)
	}

}


fun AWSKMSFunctions.disableKeyRotation(keyId: String, init: AWSKMSDisableKeyRotationCommand.() -> Unit): com.amazonaws.services.kms.model.DisableKeyRotationResult {
	return this.block.declare(AWSKMSDisableKeyRotationCommand(keyId).apply(init)) as com.amazonaws.services.kms.model.DisableKeyRotationResult
}

@Generated
class AWSKMSDisableKeyRotationCommand(val keyId: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.DisableKeyRotationRequest, com.amazonaws.services.kms.model.DisableKeyRotationResult> {



	override fun build(): com.amazonaws.services.kms.model.DisableKeyRotationRequest {
		val input = com.amazonaws.services.kms.model.DisableKeyRotationRequest()
		input.setKeyId(this.keyId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kms.model.DisableKeyRotationResult {
	  return com.amazonaws.services.kms.model.DisableKeyRotationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kms.model.DisableKeyRotationResult {
		return environment.kms.disableKeyRotation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms disable-key-rotation")
				.argument("key-id", keyId)
	}

}


fun AWSKMSFunctions.enableKey(keyId: String, init: AWSKMSEnableKeyCommand.() -> Unit): com.amazonaws.services.kms.model.EnableKeyResult {
	return this.block.declare(AWSKMSEnableKeyCommand(keyId).apply(init)) as com.amazonaws.services.kms.model.EnableKeyResult
}

@Generated
class AWSKMSEnableKeyCommand(val keyId: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.EnableKeyRequest, com.amazonaws.services.kms.model.EnableKeyResult> {



	override fun build(): com.amazonaws.services.kms.model.EnableKeyRequest {
		val input = com.amazonaws.services.kms.model.EnableKeyRequest()
		input.setKeyId(this.keyId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kms.model.EnableKeyResult {
	  return com.amazonaws.services.kms.model.EnableKeyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kms.model.EnableKeyResult {
		return environment.kms.enableKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms enable-key")
				.argument("key-id", keyId)
	}

}


fun AWSKMSFunctions.enableKeyRotation(keyId: String, init: AWSKMSEnableKeyRotationCommand.() -> Unit): com.amazonaws.services.kms.model.EnableKeyRotationResult {
	return this.block.declare(AWSKMSEnableKeyRotationCommand(keyId).apply(init)) as com.amazonaws.services.kms.model.EnableKeyRotationResult
}

@Generated
class AWSKMSEnableKeyRotationCommand(val keyId: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.EnableKeyRotationRequest, com.amazonaws.services.kms.model.EnableKeyRotationResult> {



	override fun build(): com.amazonaws.services.kms.model.EnableKeyRotationRequest {
		val input = com.amazonaws.services.kms.model.EnableKeyRotationRequest()
		input.setKeyId(this.keyId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kms.model.EnableKeyRotationResult {
	  return com.amazonaws.services.kms.model.EnableKeyRotationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kms.model.EnableKeyRotationResult {
		return environment.kms.enableKeyRotation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms enable-key-rotation")
				.argument("key-id", keyId)
	}

}


fun AWSKMSFunctions.encrypt(keyId: String, plaintext: java.nio.ByteBuffer, init: AWSKMSEncryptCommand.() -> Unit): com.amazonaws.services.kms.model.EncryptResult {
	return this.block.declare(AWSKMSEncryptCommand(keyId, plaintext).apply(init)) as com.amazonaws.services.kms.model.EncryptResult
}

@Generated
class AWSKMSEncryptCommand(val keyId: String, val plaintext: java.nio.ByteBuffer) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.EncryptRequest, com.amazonaws.services.kms.model.EncryptResult> {

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

	
	override fun dryResult(): com.amazonaws.services.kms.model.EncryptResult {
	  return com.amazonaws.services.kms.model.EncryptResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kms.model.EncryptResult {
		return environment.kms.encrypt(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms encrypt")
				.argument("key-id", keyId)
				.argument("plaintext", plaintext.toString())
				.argument("encryption-context", encryptionContext?.toString())
				.argument("grant-tokens", grantTokens?.toString())
	}

}


fun AWSKMSFunctions.generateDataKey(keyId: String, init: AWSKMSGenerateDataKeyCommand.() -> Unit): com.amazonaws.services.kms.model.GenerateDataKeyResult {
	return this.block.declare(AWSKMSGenerateDataKeyCommand(keyId).apply(init)) as com.amazonaws.services.kms.model.GenerateDataKeyResult
}

@Generated
class AWSKMSGenerateDataKeyCommand(val keyId: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.GenerateDataKeyRequest, com.amazonaws.services.kms.model.GenerateDataKeyResult> {

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

	
	override fun dryResult(): com.amazonaws.services.kms.model.GenerateDataKeyResult {
	  return com.amazonaws.services.kms.model.GenerateDataKeyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kms.model.GenerateDataKeyResult {
		return environment.kms.generateDataKey(build())
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


fun AWSKMSFunctions.generateDataKeyWithoutPlaintext(keyId: String, init: AWSKMSGenerateDataKeyWithoutPlaintextCommand.() -> Unit): com.amazonaws.services.kms.model.GenerateDataKeyWithoutPlaintextResult {
	return this.block.declare(AWSKMSGenerateDataKeyWithoutPlaintextCommand(keyId).apply(init)) as com.amazonaws.services.kms.model.GenerateDataKeyWithoutPlaintextResult
}

@Generated
class AWSKMSGenerateDataKeyWithoutPlaintextCommand(val keyId: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.GenerateDataKeyWithoutPlaintextRequest, com.amazonaws.services.kms.model.GenerateDataKeyWithoutPlaintextResult> {

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

	
	override fun dryResult(): com.amazonaws.services.kms.model.GenerateDataKeyWithoutPlaintextResult {
	  return com.amazonaws.services.kms.model.GenerateDataKeyWithoutPlaintextResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kms.model.GenerateDataKeyWithoutPlaintextResult {
		return environment.kms.generateDataKeyWithoutPlaintext(build())
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


fun AWSKMSFunctions.generateRandom(init: AWSKMSGenerateRandomCommand.() -> Unit): com.amazonaws.services.kms.model.GenerateRandomResult {
	return this.block.declare(AWSKMSGenerateRandomCommand().apply(init)) as com.amazonaws.services.kms.model.GenerateRandomResult
}

@Generated
class AWSKMSGenerateRandomCommand() : AmazonWebServiceCommand<com.amazonaws.services.kms.model.GenerateRandomRequest, com.amazonaws.services.kms.model.GenerateRandomResult> {

	var numberOfBytes: Int? = 0

	override fun build(): com.amazonaws.services.kms.model.GenerateRandomRequest {
		val input = com.amazonaws.services.kms.model.GenerateRandomRequest()
		input.setNumberOfBytes(this.numberOfBytes)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kms.model.GenerateRandomResult {
	  return com.amazonaws.services.kms.model.GenerateRandomResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kms.model.GenerateRandomResult {
		return environment.kms.generateRandom(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms generate-random")
				.argument("number-of-bytes", numberOfBytes?.toString())
	}

}


fun AWSKMSFunctions.getKeyPolicy(keyId: String, policyName: String, init: AWSKMSGetKeyPolicyCommand.() -> Unit): com.amazonaws.services.kms.model.GetKeyPolicyResult {
	return this.block.declare(AWSKMSGetKeyPolicyCommand(keyId, policyName).apply(init)) as com.amazonaws.services.kms.model.GetKeyPolicyResult
}

@Generated
class AWSKMSGetKeyPolicyCommand(val keyId: String, val policyName: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.GetKeyPolicyRequest, com.amazonaws.services.kms.model.GetKeyPolicyResult> {



	override fun build(): com.amazonaws.services.kms.model.GetKeyPolicyRequest {
		val input = com.amazonaws.services.kms.model.GetKeyPolicyRequest()
		input.setKeyId(this.keyId)
		input.setPolicyName(this.policyName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kms.model.GetKeyPolicyResult {
	  return com.amazonaws.services.kms.model.GetKeyPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kms.model.GetKeyPolicyResult {
		return environment.kms.getKeyPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms get-key-policy")
				.argument("key-id", keyId)
				.argument("policy-name", policyName)
	}

}


fun AWSKMSFunctions.getKeyRotationStatus(keyId: String, init: AWSKMSGetKeyRotationStatusCommand.() -> Unit): com.amazonaws.services.kms.model.GetKeyRotationStatusResult {
	return this.block.declare(AWSKMSGetKeyRotationStatusCommand(keyId).apply(init)) as com.amazonaws.services.kms.model.GetKeyRotationStatusResult
}

@Generated
class AWSKMSGetKeyRotationStatusCommand(val keyId: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.GetKeyRotationStatusRequest, com.amazonaws.services.kms.model.GetKeyRotationStatusResult> {



	override fun build(): com.amazonaws.services.kms.model.GetKeyRotationStatusRequest {
		val input = com.amazonaws.services.kms.model.GetKeyRotationStatusRequest()
		input.setKeyId(this.keyId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kms.model.GetKeyRotationStatusResult {
	  return com.amazonaws.services.kms.model.GetKeyRotationStatusResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kms.model.GetKeyRotationStatusResult {
		return environment.kms.getKeyRotationStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms get-key-rotation-status")
				.argument("key-id", keyId)
	}

}


fun AWSKMSFunctions.getParametersForImport(keyId: String, wrappingAlgorithm: AlgorithmSpec, wrappingKeySpec: WrappingKeySpec, init: AWSKMSGetParametersForImportCommand.() -> Unit): com.amazonaws.services.kms.model.GetParametersForImportResult {
	return this.block.declare(AWSKMSGetParametersForImportCommand(keyId, wrappingAlgorithm, wrappingKeySpec).apply(init)) as com.amazonaws.services.kms.model.GetParametersForImportResult
}

@Generated
class AWSKMSGetParametersForImportCommand(val keyId: String, val wrappingAlgorithm: AlgorithmSpec, val wrappingKeySpec: WrappingKeySpec) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.GetParametersForImportRequest, com.amazonaws.services.kms.model.GetParametersForImportResult> {



	override fun build(): com.amazonaws.services.kms.model.GetParametersForImportRequest {
		val input = com.amazonaws.services.kms.model.GetParametersForImportRequest()
		input.setKeyId(this.keyId)
		input.setWrappingAlgorithm(this.wrappingAlgorithm.toString())
		input.setWrappingKeySpec(this.wrappingKeySpec.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kms.model.GetParametersForImportResult {
	  return com.amazonaws.services.kms.model.GetParametersForImportResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kms.model.GetParametersForImportResult {
		return environment.kms.getParametersForImport(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms get-parameters-for-import")
				.argument("key-id", keyId)
				.argument("wrapping-algorithm", wrappingAlgorithm.toString())
				.argument("wrapping-key-spec", wrappingKeySpec.toString())
	}

}


fun AWSKMSFunctions.importKeyMaterial(keyId: String, importToken: java.nio.ByteBuffer, encryptedKeyMaterial: java.nio.ByteBuffer, init: AWSKMSImportKeyMaterialCommand.() -> Unit): com.amazonaws.services.kms.model.ImportKeyMaterialResult {
	return this.block.declare(AWSKMSImportKeyMaterialCommand(keyId, importToken, encryptedKeyMaterial).apply(init)) as com.amazonaws.services.kms.model.ImportKeyMaterialResult
}

@Generated
class AWSKMSImportKeyMaterialCommand(val keyId: String, val importToken: java.nio.ByteBuffer, val encryptedKeyMaterial: java.nio.ByteBuffer) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.ImportKeyMaterialRequest, com.amazonaws.services.kms.model.ImportKeyMaterialResult> {

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

	
	override fun dryResult(): com.amazonaws.services.kms.model.ImportKeyMaterialResult {
	  return com.amazonaws.services.kms.model.ImportKeyMaterialResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kms.model.ImportKeyMaterialResult {
		return environment.kms.importKeyMaterial(build())
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


fun AWSKMSFunctions.listAliases(init: AWSKMSListAliasesCommand.() -> Unit): com.amazonaws.services.kms.model.ListAliasesResult {
	return this.block.declare(AWSKMSListAliasesCommand().apply(init)) as com.amazonaws.services.kms.model.ListAliasesResult
}

@Generated
class AWSKMSListAliasesCommand() : AmazonWebServiceCommand<com.amazonaws.services.kms.model.ListAliasesRequest, com.amazonaws.services.kms.model.ListAliasesResult> {

	var limit: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.kms.model.ListAliasesRequest {
		val input = com.amazonaws.services.kms.model.ListAliasesRequest()
		input.setLimit(this.limit)
		input.setMarker(this.marker)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kms.model.ListAliasesResult {
	  return com.amazonaws.services.kms.model.ListAliasesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kms.model.ListAliasesResult {
		return environment.kms.listAliases(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms list-aliases")
				.argument("limit", limit?.toString())
				.argument("marker", marker)
	}

}


fun AWSKMSFunctions.listGrants(keyId: String, init: AWSKMSListGrantsCommand.() -> Unit): com.amazonaws.services.kms.model.ListGrantsResult {
	return this.block.declare(AWSKMSListGrantsCommand(keyId).apply(init)) as com.amazonaws.services.kms.model.ListGrantsResult
}

@Generated
class AWSKMSListGrantsCommand(val keyId: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.ListGrantsRequest, com.amazonaws.services.kms.model.ListGrantsResult> {

	var limit: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.kms.model.ListGrantsRequest {
		val input = com.amazonaws.services.kms.model.ListGrantsRequest()
		input.setLimit(this.limit)
		input.setMarker(this.marker)
		input.setKeyId(this.keyId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kms.model.ListGrantsResult {
	  return com.amazonaws.services.kms.model.ListGrantsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kms.model.ListGrantsResult {
		return environment.kms.listGrants(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms list-grants")
				.argument("limit", limit?.toString())
				.argument("marker", marker)
				.argument("key-id", keyId)
	}

}


fun AWSKMSFunctions.listKeyPolicies(keyId: String, init: AWSKMSListKeyPoliciesCommand.() -> Unit): com.amazonaws.services.kms.model.ListKeyPoliciesResult {
	return this.block.declare(AWSKMSListKeyPoliciesCommand(keyId).apply(init)) as com.amazonaws.services.kms.model.ListKeyPoliciesResult
}

@Generated
class AWSKMSListKeyPoliciesCommand(val keyId: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.ListKeyPoliciesRequest, com.amazonaws.services.kms.model.ListKeyPoliciesResult> {

	var limit: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.kms.model.ListKeyPoliciesRequest {
		val input = com.amazonaws.services.kms.model.ListKeyPoliciesRequest()
		input.setKeyId(this.keyId)
		input.setLimit(this.limit)
		input.setMarker(this.marker)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kms.model.ListKeyPoliciesResult {
	  return com.amazonaws.services.kms.model.ListKeyPoliciesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kms.model.ListKeyPoliciesResult {
		return environment.kms.listKeyPolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms list-key-policies")
				.argument("key-id", keyId)
				.argument("limit", limit?.toString())
				.argument("marker", marker)
	}

}


fun AWSKMSFunctions.listKeys(init: AWSKMSListKeysCommand.() -> Unit): com.amazonaws.services.kms.model.ListKeysResult {
	return this.block.declare(AWSKMSListKeysCommand().apply(init)) as com.amazonaws.services.kms.model.ListKeysResult
}

@Generated
class AWSKMSListKeysCommand() : AmazonWebServiceCommand<com.amazonaws.services.kms.model.ListKeysRequest, com.amazonaws.services.kms.model.ListKeysResult> {

	var limit: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.kms.model.ListKeysRequest {
		val input = com.amazonaws.services.kms.model.ListKeysRequest()
		input.setLimit(this.limit)
		input.setMarker(this.marker)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kms.model.ListKeysResult {
	  return com.amazonaws.services.kms.model.ListKeysResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kms.model.ListKeysResult {
		return environment.kms.listKeys(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms list-keys")
				.argument("limit", limit?.toString())
				.argument("marker", marker)
	}

}


fun AWSKMSFunctions.listResourceTags(keyId: String, init: AWSKMSListResourceTagsCommand.() -> Unit): com.amazonaws.services.kms.model.ListResourceTagsResult {
	return this.block.declare(AWSKMSListResourceTagsCommand(keyId).apply(init)) as com.amazonaws.services.kms.model.ListResourceTagsResult
}

@Generated
class AWSKMSListResourceTagsCommand(val keyId: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.ListResourceTagsRequest, com.amazonaws.services.kms.model.ListResourceTagsResult> {

	var limit: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.kms.model.ListResourceTagsRequest {
		val input = com.amazonaws.services.kms.model.ListResourceTagsRequest()
		input.setKeyId(this.keyId)
		input.setLimit(this.limit)
		input.setMarker(this.marker)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kms.model.ListResourceTagsResult {
	  return com.amazonaws.services.kms.model.ListResourceTagsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kms.model.ListResourceTagsResult {
		return environment.kms.listResourceTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms list-resource-tags")
				.argument("key-id", keyId)
				.argument("limit", limit?.toString())
				.argument("marker", marker)
	}

}


fun AWSKMSFunctions.listRetirableGrants(retiringPrincipal: String, init: AWSKMSListRetirableGrantsCommand.() -> Unit): com.amazonaws.services.kms.model.ListRetirableGrantsResult {
	return this.block.declare(AWSKMSListRetirableGrantsCommand(retiringPrincipal).apply(init)) as com.amazonaws.services.kms.model.ListRetirableGrantsResult
}

@Generated
class AWSKMSListRetirableGrantsCommand(val retiringPrincipal: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.ListRetirableGrantsRequest, com.amazonaws.services.kms.model.ListRetirableGrantsResult> {

	var limit: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.kms.model.ListRetirableGrantsRequest {
		val input = com.amazonaws.services.kms.model.ListRetirableGrantsRequest()
		input.setLimit(this.limit)
		input.setMarker(this.marker)
		input.setRetiringPrincipal(this.retiringPrincipal)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kms.model.ListRetirableGrantsResult {
	  return com.amazonaws.services.kms.model.ListRetirableGrantsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kms.model.ListRetirableGrantsResult {
		return environment.kms.listRetirableGrants(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms list-retirable-grants")
				.argument("limit", limit?.toString())
				.argument("marker", marker)
				.argument("retiring-principal", retiringPrincipal)
	}

}


fun AWSKMSFunctions.putKeyPolicy(keyId: String, policyName: String, policy: String, init: AWSKMSPutKeyPolicyCommand.() -> Unit): com.amazonaws.services.kms.model.PutKeyPolicyResult {
	return this.block.declare(AWSKMSPutKeyPolicyCommand(keyId, policyName, policy).apply(init)) as com.amazonaws.services.kms.model.PutKeyPolicyResult
}

@Generated
class AWSKMSPutKeyPolicyCommand(val keyId: String, val policyName: String, val policy: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.PutKeyPolicyRequest, com.amazonaws.services.kms.model.PutKeyPolicyResult> {

	var bypassPolicyLockoutSafetyCheck: Boolean? = false

	override fun build(): com.amazonaws.services.kms.model.PutKeyPolicyRequest {
		val input = com.amazonaws.services.kms.model.PutKeyPolicyRequest()
		input.setKeyId(this.keyId)
		input.setPolicyName(this.policyName)
		input.setPolicy(this.policy)
		input.setBypassPolicyLockoutSafetyCheck(this.bypassPolicyLockoutSafetyCheck)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kms.model.PutKeyPolicyResult {
	  return com.amazonaws.services.kms.model.PutKeyPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kms.model.PutKeyPolicyResult {
		return environment.kms.putKeyPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms put-key-policy")
				.argument("key-id", keyId)
				.argument("policy-name", policyName)
				.argument("policy", policy)
				.option("bypass-policy-lockout-safety-check", bypassPolicyLockoutSafetyCheck ?: false)
	}

}


fun AWSKMSFunctions.reEncrypt(ciphertextBlob: java.nio.ByteBuffer, destinationKeyId: String, init: AWSKMSReEncryptCommand.() -> Unit): com.amazonaws.services.kms.model.ReEncryptResult {
	return this.block.declare(AWSKMSReEncryptCommand(ciphertextBlob, destinationKeyId).apply(init)) as com.amazonaws.services.kms.model.ReEncryptResult
}

@Generated
class AWSKMSReEncryptCommand(val ciphertextBlob: java.nio.ByteBuffer, val destinationKeyId: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.ReEncryptRequest, com.amazonaws.services.kms.model.ReEncryptResult> {

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

	
	override fun dryResult(): com.amazonaws.services.kms.model.ReEncryptResult {
	  return com.amazonaws.services.kms.model.ReEncryptResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kms.model.ReEncryptResult {
		return environment.kms.reEncrypt(build())
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


fun AWSKMSFunctions.retireGrant(init: AWSKMSRetireGrantCommand.() -> Unit): com.amazonaws.services.kms.model.RetireGrantResult {
	return this.block.declare(AWSKMSRetireGrantCommand().apply(init)) as com.amazonaws.services.kms.model.RetireGrantResult
}

@Generated
class AWSKMSRetireGrantCommand() : AmazonWebServiceCommand<com.amazonaws.services.kms.model.RetireGrantRequest, com.amazonaws.services.kms.model.RetireGrantResult> {

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

	
	override fun dryResult(): com.amazonaws.services.kms.model.RetireGrantResult {
	  return com.amazonaws.services.kms.model.RetireGrantResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kms.model.RetireGrantResult {
		return environment.kms.retireGrant(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms retire-grant")
				.argument("grant-token", grantToken)
				.argument("key-id", keyId)
				.argument("grant-id", grantId)
	}

}


fun AWSKMSFunctions.revokeGrant(keyId: String, grantId: String, init: AWSKMSRevokeGrantCommand.() -> Unit): com.amazonaws.services.kms.model.RevokeGrantResult {
	return this.block.declare(AWSKMSRevokeGrantCommand(keyId, grantId).apply(init)) as com.amazonaws.services.kms.model.RevokeGrantResult
}

@Generated
class AWSKMSRevokeGrantCommand(val keyId: String, val grantId: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.RevokeGrantRequest, com.amazonaws.services.kms.model.RevokeGrantResult> {



	override fun build(): com.amazonaws.services.kms.model.RevokeGrantRequest {
		val input = com.amazonaws.services.kms.model.RevokeGrantRequest()
		input.setKeyId(this.keyId)
		input.setGrantId(this.grantId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kms.model.RevokeGrantResult {
	  return com.amazonaws.services.kms.model.RevokeGrantResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kms.model.RevokeGrantResult {
		return environment.kms.revokeGrant(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms revoke-grant")
				.argument("key-id", keyId)
				.argument("grant-id", grantId)
	}

}


fun AWSKMSFunctions.scheduleKeyDeletion(keyId: String, init: AWSKMSScheduleKeyDeletionCommand.() -> Unit): com.amazonaws.services.kms.model.ScheduleKeyDeletionResult {
	return this.block.declare(AWSKMSScheduleKeyDeletionCommand(keyId).apply(init)) as com.amazonaws.services.kms.model.ScheduleKeyDeletionResult
}

@Generated
class AWSKMSScheduleKeyDeletionCommand(val keyId: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.ScheduleKeyDeletionRequest, com.amazonaws.services.kms.model.ScheduleKeyDeletionResult> {

	var pendingWindowInDays: Int? = 0

	override fun build(): com.amazonaws.services.kms.model.ScheduleKeyDeletionRequest {
		val input = com.amazonaws.services.kms.model.ScheduleKeyDeletionRequest()
		input.setKeyId(this.keyId)
		input.setPendingWindowInDays(this.pendingWindowInDays)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kms.model.ScheduleKeyDeletionResult {
	  return com.amazonaws.services.kms.model.ScheduleKeyDeletionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kms.model.ScheduleKeyDeletionResult {
		return environment.kms.scheduleKeyDeletion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms schedule-key-deletion")
				.argument("key-id", keyId)
				.argument("pending-window-in-days", pendingWindowInDays?.toString())
	}

}


fun AWSKMSFunctions.tagResource(keyId: String, tags: List<com.amazonaws.services.kms.model.Tag>, init: AWSKMSTagResourceCommand.() -> Unit): com.amazonaws.services.kms.model.TagResourceResult {
	return this.block.declare(AWSKMSTagResourceCommand(keyId, tags).apply(init)) as com.amazonaws.services.kms.model.TagResourceResult
}

@Generated
class AWSKMSTagResourceCommand(val keyId: String, val tags: List<com.amazonaws.services.kms.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.TagResourceRequest, com.amazonaws.services.kms.model.TagResourceResult> {



	override fun build(): com.amazonaws.services.kms.model.TagResourceRequest {
		val input = com.amazonaws.services.kms.model.TagResourceRequest()
		input.setKeyId(this.keyId)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kms.model.TagResourceResult {
	  return com.amazonaws.services.kms.model.TagResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kms.model.TagResourceResult {
		return environment.kms.tagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms tag-resource")
				.argument("key-id", keyId)
				.argument("tags", tags.toString())
	}

}


fun AWSKMSFunctions.untagResource(keyId: String, tagKeys: List<String>, init: AWSKMSUntagResourceCommand.() -> Unit): com.amazonaws.services.kms.model.UntagResourceResult {
	return this.block.declare(AWSKMSUntagResourceCommand(keyId, tagKeys).apply(init)) as com.amazonaws.services.kms.model.UntagResourceResult
}

@Generated
class AWSKMSUntagResourceCommand(val keyId: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.UntagResourceRequest, com.amazonaws.services.kms.model.UntagResourceResult> {



	override fun build(): com.amazonaws.services.kms.model.UntagResourceRequest {
		val input = com.amazonaws.services.kms.model.UntagResourceRequest()
		input.setKeyId(this.keyId)
		input.setTagKeys(this.tagKeys)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kms.model.UntagResourceResult {
	  return com.amazonaws.services.kms.model.UntagResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kms.model.UntagResourceResult {
		return environment.kms.untagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms untag-resource")
				.argument("key-id", keyId)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AWSKMSFunctions.updateAlias(aliasName: String, targetKeyId: String, init: AWSKMSUpdateAliasCommand.() -> Unit): com.amazonaws.services.kms.model.UpdateAliasResult {
	return this.block.declare(AWSKMSUpdateAliasCommand(aliasName, targetKeyId).apply(init)) as com.amazonaws.services.kms.model.UpdateAliasResult
}

@Generated
class AWSKMSUpdateAliasCommand(val aliasName: String, val targetKeyId: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.UpdateAliasRequest, com.amazonaws.services.kms.model.UpdateAliasResult> {



	override fun build(): com.amazonaws.services.kms.model.UpdateAliasRequest {
		val input = com.amazonaws.services.kms.model.UpdateAliasRequest()
		input.setAliasName(this.aliasName)
		input.setTargetKeyId(this.targetKeyId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kms.model.UpdateAliasResult {
	  return com.amazonaws.services.kms.model.UpdateAliasResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kms.model.UpdateAliasResult {
		return environment.kms.updateAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms update-alias")
				.argument("alias-name", aliasName)
				.argument("target-key-id", targetKeyId)
	}

}


fun AWSKMSFunctions.updateKeyDescription(keyId: String, description: String, init: AWSKMSUpdateKeyDescriptionCommand.() -> Unit): com.amazonaws.services.kms.model.UpdateKeyDescriptionResult {
	return this.block.declare(AWSKMSUpdateKeyDescriptionCommand(keyId, description).apply(init)) as com.amazonaws.services.kms.model.UpdateKeyDescriptionResult
}

@Generated
class AWSKMSUpdateKeyDescriptionCommand(val keyId: String, val description: String) : AmazonWebServiceCommand<com.amazonaws.services.kms.model.UpdateKeyDescriptionRequest, com.amazonaws.services.kms.model.UpdateKeyDescriptionResult> {



	override fun build(): com.amazonaws.services.kms.model.UpdateKeyDescriptionRequest {
		val input = com.amazonaws.services.kms.model.UpdateKeyDescriptionRequest()
		input.setKeyId(this.keyId)
		input.setDescription(this.description)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kms.model.UpdateKeyDescriptionResult {
	  return com.amazonaws.services.kms.model.UpdateKeyDescriptionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kms.model.UpdateKeyDescriptionResult {
		return environment.kms.updateKeyDescription(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kms update-key-description")
				.argument("key-id", keyId)
				.argument("description", description)
	}

}
