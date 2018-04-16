
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package com.codingue.koops.aws.lexmodels

import javax.annotation.Generated
import com.codingue.koops.common.*
import com.codingue.koops.core.*
import com.codingue.koops.aws.*
import com.amazonaws.services.lexmodelbuilding.*
import com.amazonaws.services.lexmodelbuilding.model.*

var com.codingue.koops.core.Environment.lexmodels: AmazonLexModelBuilding
	get() {
		var service = this.capabilities["aws-lexmodels"]
		if (service == null) {
			service = AmazonLexModelBuildingClientBuilder.standard().build()
			this.capabilities["aws-lexmodels"] = service
		}
		return service as AmazonLexModelBuilding
	}
	set(lexmodels) {
		this.capabilities["aws-lexmodels"] = lexmodels
	}

@Generated
class AmazonLexModelBuildingFunctions(val block: Script)

infix fun <T> AwsContinuation.lexmodels(init: AmazonLexModelBuildingFunctions.() -> T): T {
	return AmazonLexModelBuildingFunctions(shell).run(init)
}

			

fun AmazonLexModelBuildingFunctions.createBotVersion(init: (AmazonLexModelBuildingCreateBotVersionCommand.() -> Unit)? = null): com.amazonaws.services.lexmodelbuilding.model.CreateBotVersionResult {
	return this.block.declare(AmazonLexModelBuildingCreateBotVersionCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lexmodelbuilding.model.CreateBotVersionResult
}

@Generated
class AmazonLexModelBuildingCreateBotVersionCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.CreateBotVersionRequest, com.amazonaws.services.lexmodelbuilding.model.CreateBotVersionResult> {

	var name: String? = null
	var checksum: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.CreateBotVersionRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.CreateBotVersionRequest()
		input.setName(this.name)
		input.setChecksum(this.checksum)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lexmodelbuilding.model.CreateBotVersionResult {
	  return com.amazonaws.services.lexmodelbuilding.model.CreateBotVersionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lexmodelbuilding.model.CreateBotVersionResult {
		return environment.lexmodels.createBotVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models create-bot-version")
				.argument("name", name)
				.argument("checksum", checksum)
	}

}


fun AmazonLexModelBuildingFunctions.createIntentVersion(init: (AmazonLexModelBuildingCreateIntentVersionCommand.() -> Unit)? = null): com.amazonaws.services.lexmodelbuilding.model.CreateIntentVersionResult {
	return this.block.declare(AmazonLexModelBuildingCreateIntentVersionCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lexmodelbuilding.model.CreateIntentVersionResult
}

@Generated
class AmazonLexModelBuildingCreateIntentVersionCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.CreateIntentVersionRequest, com.amazonaws.services.lexmodelbuilding.model.CreateIntentVersionResult> {

	var name: String? = null
	var checksum: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.CreateIntentVersionRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.CreateIntentVersionRequest()
		input.setName(this.name)
		input.setChecksum(this.checksum)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lexmodelbuilding.model.CreateIntentVersionResult {
	  return com.amazonaws.services.lexmodelbuilding.model.CreateIntentVersionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lexmodelbuilding.model.CreateIntentVersionResult {
		return environment.lexmodels.createIntentVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models create-intent-version")
				.argument("name", name)
				.argument("checksum", checksum)
	}

}


fun AmazonLexModelBuildingFunctions.createSlotTypeVersion(init: (AmazonLexModelBuildingCreateSlotTypeVersionCommand.() -> Unit)? = null): com.amazonaws.services.lexmodelbuilding.model.CreateSlotTypeVersionResult {
	return this.block.declare(AmazonLexModelBuildingCreateSlotTypeVersionCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lexmodelbuilding.model.CreateSlotTypeVersionResult
}

@Generated
class AmazonLexModelBuildingCreateSlotTypeVersionCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.CreateSlotTypeVersionRequest, com.amazonaws.services.lexmodelbuilding.model.CreateSlotTypeVersionResult> {

	var name: String? = null
	var checksum: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.CreateSlotTypeVersionRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.CreateSlotTypeVersionRequest()
		input.setName(this.name)
		input.setChecksum(this.checksum)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lexmodelbuilding.model.CreateSlotTypeVersionResult {
	  return com.amazonaws.services.lexmodelbuilding.model.CreateSlotTypeVersionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lexmodelbuilding.model.CreateSlotTypeVersionResult {
		return environment.lexmodels.createSlotTypeVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models create-slot-type-version")
				.argument("name", name)
				.argument("checksum", checksum)
	}

}


fun AmazonLexModelBuildingFunctions.deleteBot(init: (AmazonLexModelBuildingDeleteBotCommand.() -> Unit)? = null): com.amazonaws.services.lexmodelbuilding.model.DeleteBotResult {
	return this.block.declare(AmazonLexModelBuildingDeleteBotCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lexmodelbuilding.model.DeleteBotResult
}

@Generated
class AmazonLexModelBuildingDeleteBotCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.DeleteBotRequest, com.amazonaws.services.lexmodelbuilding.model.DeleteBotResult> {

	var name: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.DeleteBotRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.DeleteBotRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lexmodelbuilding.model.DeleteBotResult {
	  return com.amazonaws.services.lexmodelbuilding.model.DeleteBotResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lexmodelbuilding.model.DeleteBotResult {
		return environment.lexmodels.deleteBot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models delete-bot")
				.argument("name", name)
	}

}


fun AmazonLexModelBuildingFunctions.deleteBotAlias(init: (AmazonLexModelBuildingDeleteBotAliasCommand.() -> Unit)? = null): com.amazonaws.services.lexmodelbuilding.model.DeleteBotAliasResult {
	return this.block.declare(AmazonLexModelBuildingDeleteBotAliasCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lexmodelbuilding.model.DeleteBotAliasResult
}

@Generated
class AmazonLexModelBuildingDeleteBotAliasCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.DeleteBotAliasRequest, com.amazonaws.services.lexmodelbuilding.model.DeleteBotAliasResult> {

	var name: String? = null
	var botName: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.DeleteBotAliasRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.DeleteBotAliasRequest()
		input.setName(this.name)
		input.setBotName(this.botName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lexmodelbuilding.model.DeleteBotAliasResult {
	  return com.amazonaws.services.lexmodelbuilding.model.DeleteBotAliasResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lexmodelbuilding.model.DeleteBotAliasResult {
		return environment.lexmodels.deleteBotAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models delete-bot-alias")
				.argument("name", name)
				.argument("bot-name", botName)
	}

}


fun AmazonLexModelBuildingFunctions.deleteBotChannelAssociation(init: (AmazonLexModelBuildingDeleteBotChannelAssociationCommand.() -> Unit)? = null): com.amazonaws.services.lexmodelbuilding.model.DeleteBotChannelAssociationResult {
	return this.block.declare(AmazonLexModelBuildingDeleteBotChannelAssociationCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lexmodelbuilding.model.DeleteBotChannelAssociationResult
}

@Generated
class AmazonLexModelBuildingDeleteBotChannelAssociationCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.DeleteBotChannelAssociationRequest, com.amazonaws.services.lexmodelbuilding.model.DeleteBotChannelAssociationResult> {

	var name: String? = null
	var botName: String? = null
	var botAlias: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.DeleteBotChannelAssociationRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.DeleteBotChannelAssociationRequest()
		input.setName(this.name)
		input.setBotName(this.botName)
		input.setBotAlias(this.botAlias)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lexmodelbuilding.model.DeleteBotChannelAssociationResult {
	  return com.amazonaws.services.lexmodelbuilding.model.DeleteBotChannelAssociationResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lexmodelbuilding.model.DeleteBotChannelAssociationResult {
		return environment.lexmodels.deleteBotChannelAssociation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models delete-bot-channel-association")
				.argument("name", name)
				.argument("bot-name", botName)
				.argument("bot-alias", botAlias)
	}

}


fun AmazonLexModelBuildingFunctions.deleteBotVersion(init: (AmazonLexModelBuildingDeleteBotVersionCommand.() -> Unit)? = null): com.amazonaws.services.lexmodelbuilding.model.DeleteBotVersionResult {
	return this.block.declare(AmazonLexModelBuildingDeleteBotVersionCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lexmodelbuilding.model.DeleteBotVersionResult
}

@Generated
class AmazonLexModelBuildingDeleteBotVersionCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.DeleteBotVersionRequest, com.amazonaws.services.lexmodelbuilding.model.DeleteBotVersionResult> {

	var name: String? = null
	var version: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.DeleteBotVersionRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.DeleteBotVersionRequest()
		input.setName(this.name)
		input.setVersion(this.version)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lexmodelbuilding.model.DeleteBotVersionResult {
	  return com.amazonaws.services.lexmodelbuilding.model.DeleteBotVersionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lexmodelbuilding.model.DeleteBotVersionResult {
		return environment.lexmodels.deleteBotVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models delete-bot-version")
				.argument("name", name)
				.argument("version", version)
	}

}


fun AmazonLexModelBuildingFunctions.deleteIntent(init: (AmazonLexModelBuildingDeleteIntentCommand.() -> Unit)? = null): com.amazonaws.services.lexmodelbuilding.model.DeleteIntentResult {
	return this.block.declare(AmazonLexModelBuildingDeleteIntentCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lexmodelbuilding.model.DeleteIntentResult
}

@Generated
class AmazonLexModelBuildingDeleteIntentCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.DeleteIntentRequest, com.amazonaws.services.lexmodelbuilding.model.DeleteIntentResult> {

	var name: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.DeleteIntentRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.DeleteIntentRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lexmodelbuilding.model.DeleteIntentResult {
	  return com.amazonaws.services.lexmodelbuilding.model.DeleteIntentResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lexmodelbuilding.model.DeleteIntentResult {
		return environment.lexmodels.deleteIntent(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models delete-intent")
				.argument("name", name)
	}

}


fun AmazonLexModelBuildingFunctions.deleteIntentVersion(init: (AmazonLexModelBuildingDeleteIntentVersionCommand.() -> Unit)? = null): com.amazonaws.services.lexmodelbuilding.model.DeleteIntentVersionResult {
	return this.block.declare(AmazonLexModelBuildingDeleteIntentVersionCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lexmodelbuilding.model.DeleteIntentVersionResult
}

@Generated
class AmazonLexModelBuildingDeleteIntentVersionCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.DeleteIntentVersionRequest, com.amazonaws.services.lexmodelbuilding.model.DeleteIntentVersionResult> {

	var name: String? = null
	var version: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.DeleteIntentVersionRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.DeleteIntentVersionRequest()
		input.setName(this.name)
		input.setVersion(this.version)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lexmodelbuilding.model.DeleteIntentVersionResult {
	  return com.amazonaws.services.lexmodelbuilding.model.DeleteIntentVersionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lexmodelbuilding.model.DeleteIntentVersionResult {
		return environment.lexmodels.deleteIntentVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models delete-intent-version")
				.argument("name", name)
				.argument("version", version)
	}

}


fun AmazonLexModelBuildingFunctions.deleteSlotType(init: (AmazonLexModelBuildingDeleteSlotTypeCommand.() -> Unit)? = null): com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeResult {
	return this.block.declare(AmazonLexModelBuildingDeleteSlotTypeCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeResult
}

@Generated
class AmazonLexModelBuildingDeleteSlotTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeRequest, com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeResult> {

	var name: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeResult {
	  return com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeResult {
		return environment.lexmodels.deleteSlotType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models delete-slot-type")
				.argument("name", name)
	}

}


fun AmazonLexModelBuildingFunctions.deleteSlotTypeVersion(init: (AmazonLexModelBuildingDeleteSlotTypeVersionCommand.() -> Unit)? = null): com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeVersionResult {
	return this.block.declare(AmazonLexModelBuildingDeleteSlotTypeVersionCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeVersionResult
}

@Generated
class AmazonLexModelBuildingDeleteSlotTypeVersionCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeVersionRequest, com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeVersionResult> {

	var name: String? = null
	var version: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeVersionRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeVersionRequest()
		input.setName(this.name)
		input.setVersion(this.version)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeVersionResult {
	  return com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeVersionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeVersionResult {
		return environment.lexmodels.deleteSlotTypeVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models delete-slot-type-version")
				.argument("name", name)
				.argument("version", version)
	}

}


fun AmazonLexModelBuildingFunctions.deleteUtterances(init: (AmazonLexModelBuildingDeleteUtterancesCommand.() -> Unit)? = null): com.amazonaws.services.lexmodelbuilding.model.DeleteUtterancesResult {
	return this.block.declare(AmazonLexModelBuildingDeleteUtterancesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lexmodelbuilding.model.DeleteUtterancesResult
}

@Generated
class AmazonLexModelBuildingDeleteUtterancesCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.DeleteUtterancesRequest, com.amazonaws.services.lexmodelbuilding.model.DeleteUtterancesResult> {

	var botName: String? = null
	var userId: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.DeleteUtterancesRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.DeleteUtterancesRequest()
		input.setBotName(this.botName)
		input.setUserId(this.userId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lexmodelbuilding.model.DeleteUtterancesResult {
	  return com.amazonaws.services.lexmodelbuilding.model.DeleteUtterancesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lexmodelbuilding.model.DeleteUtterancesResult {
		return environment.lexmodels.deleteUtterances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models delete-utterances")
				.argument("bot-name", botName)
				.argument("user-id", userId)
	}

}


fun AmazonLexModelBuildingFunctions.getBot(init: (AmazonLexModelBuildingGetBotCommand.() -> Unit)? = null): com.amazonaws.services.lexmodelbuilding.model.GetBotResult {
	return this.block.declare(AmazonLexModelBuildingGetBotCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lexmodelbuilding.model.GetBotResult
}

@Generated
class AmazonLexModelBuildingGetBotCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.GetBotRequest, com.amazonaws.services.lexmodelbuilding.model.GetBotResult> {

	var name: String? = null
	var versionOrAlias: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.GetBotRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.GetBotRequest()
		input.setName(this.name)
		input.setVersionOrAlias(this.versionOrAlias)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lexmodelbuilding.model.GetBotResult {
	  return com.amazonaws.services.lexmodelbuilding.model.GetBotResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lexmodelbuilding.model.GetBotResult {
		return environment.lexmodels.getBot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models get-bot")
				.argument("name", name)
				.argument("version-or-alias", versionOrAlias)
	}

}


fun AmazonLexModelBuildingFunctions.getBotAlias(init: (AmazonLexModelBuildingGetBotAliasCommand.() -> Unit)? = null): com.amazonaws.services.lexmodelbuilding.model.GetBotAliasResult {
	return this.block.declare(AmazonLexModelBuildingGetBotAliasCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lexmodelbuilding.model.GetBotAliasResult
}

@Generated
class AmazonLexModelBuildingGetBotAliasCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.GetBotAliasRequest, com.amazonaws.services.lexmodelbuilding.model.GetBotAliasResult> {

	var name: String? = null
	var botName: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.GetBotAliasRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.GetBotAliasRequest()
		input.setName(this.name)
		input.setBotName(this.botName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lexmodelbuilding.model.GetBotAliasResult {
	  return com.amazonaws.services.lexmodelbuilding.model.GetBotAliasResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lexmodelbuilding.model.GetBotAliasResult {
		return environment.lexmodels.getBotAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models get-bot-alias")
				.argument("name", name)
				.argument("bot-name", botName)
	}

}


fun AmazonLexModelBuildingFunctions.getBotAliases(init: (AmazonLexModelBuildingGetBotAliasesCommand.() -> Unit)? = null): com.amazonaws.services.lexmodelbuilding.model.GetBotAliasesResult {
	return this.block.declare(AmazonLexModelBuildingGetBotAliasesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lexmodelbuilding.model.GetBotAliasesResult
}

@Generated
class AmazonLexModelBuildingGetBotAliasesCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.GetBotAliasesRequest, com.amazonaws.services.lexmodelbuilding.model.GetBotAliasesResult> {

	var botName: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0
	var nameContains: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.GetBotAliasesRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.GetBotAliasesRequest()
		input.setBotName(this.botName)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setNameContains(this.nameContains)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lexmodelbuilding.model.GetBotAliasesResult {
	  return com.amazonaws.services.lexmodelbuilding.model.GetBotAliasesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lexmodelbuilding.model.GetBotAliasesResult {
		return environment.lexmodels.getBotAliases(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models get-bot-aliases")
				.argument("bot-name", botName)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("name-contains", nameContains)
	}

}


fun AmazonLexModelBuildingFunctions.getBotChannelAssociation(init: (AmazonLexModelBuildingGetBotChannelAssociationCommand.() -> Unit)? = null): com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationResult {
	return this.block.declare(AmazonLexModelBuildingGetBotChannelAssociationCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationResult
}

@Generated
class AmazonLexModelBuildingGetBotChannelAssociationCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationRequest, com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationResult> {

	var name: String? = null
	var botName: String? = null
	var botAlias: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationRequest()
		input.setName(this.name)
		input.setBotName(this.botName)
		input.setBotAlias(this.botAlias)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationResult {
	  return com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationResult {
		return environment.lexmodels.getBotChannelAssociation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models get-bot-channel-association")
				.argument("name", name)
				.argument("bot-name", botName)
				.argument("bot-alias", botAlias)
	}

}


fun AmazonLexModelBuildingFunctions.getBotChannelAssociations(init: (AmazonLexModelBuildingGetBotChannelAssociationsCommand.() -> Unit)? = null): com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationsResult {
	return this.block.declare(AmazonLexModelBuildingGetBotChannelAssociationsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationsResult
}

@Generated
class AmazonLexModelBuildingGetBotChannelAssociationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationsRequest, com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationsResult> {

	var botName: String? = null
	var botAlias: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0
	var nameContains: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationsRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationsRequest()
		input.setBotName(this.botName)
		input.setBotAlias(this.botAlias)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setNameContains(this.nameContains)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationsResult {
	  return com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationsResult {
		return environment.lexmodels.getBotChannelAssociations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models get-bot-channel-associations")
				.argument("bot-name", botName)
				.argument("bot-alias", botAlias)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("name-contains", nameContains)
	}

}


fun AmazonLexModelBuildingFunctions.getBotVersions(init: (AmazonLexModelBuildingGetBotVersionsCommand.() -> Unit)? = null): com.amazonaws.services.lexmodelbuilding.model.GetBotVersionsResult {
	return this.block.declare(AmazonLexModelBuildingGetBotVersionsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lexmodelbuilding.model.GetBotVersionsResult
}

@Generated
class AmazonLexModelBuildingGetBotVersionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.GetBotVersionsRequest, com.amazonaws.services.lexmodelbuilding.model.GetBotVersionsResult> {

	var name: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.GetBotVersionsRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.GetBotVersionsRequest()
		input.setName(this.name)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lexmodelbuilding.model.GetBotVersionsResult {
	  return com.amazonaws.services.lexmodelbuilding.model.GetBotVersionsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lexmodelbuilding.model.GetBotVersionsResult {
		return environment.lexmodels.getBotVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models get-bot-versions")
				.argument("name", name)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonLexModelBuildingFunctions.getBots(init: (AmazonLexModelBuildingGetBotsCommand.() -> Unit)? = null): com.amazonaws.services.lexmodelbuilding.model.GetBotsResult {
	return this.block.declare(AmazonLexModelBuildingGetBotsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lexmodelbuilding.model.GetBotsResult
}

@Generated
class AmazonLexModelBuildingGetBotsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.GetBotsRequest, com.amazonaws.services.lexmodelbuilding.model.GetBotsResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0
	var nameContains: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.GetBotsRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.GetBotsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setNameContains(this.nameContains)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lexmodelbuilding.model.GetBotsResult {
	  return com.amazonaws.services.lexmodelbuilding.model.GetBotsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lexmodelbuilding.model.GetBotsResult {
		return environment.lexmodels.getBots(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models get-bots")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("name-contains", nameContains)
	}

}


fun AmazonLexModelBuildingFunctions.getBuiltinIntent(init: (AmazonLexModelBuildingGetBuiltinIntentCommand.() -> Unit)? = null): com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentResult {
	return this.block.declare(AmazonLexModelBuildingGetBuiltinIntentCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentResult
}

@Generated
class AmazonLexModelBuildingGetBuiltinIntentCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentRequest, com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentResult> {

	var signature: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentRequest()
		input.setSignature(this.signature)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentResult {
	  return com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentResult {
		return environment.lexmodels.getBuiltinIntent(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models get-builtin-intent")
				.argument("signature", signature)
	}

}


fun AmazonLexModelBuildingFunctions.getBuiltinIntents(init: (AmazonLexModelBuildingGetBuiltinIntentsCommand.() -> Unit)? = null): com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentsResult {
	return this.block.declare(AmazonLexModelBuildingGetBuiltinIntentsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentsResult
}

@Generated
class AmazonLexModelBuildingGetBuiltinIntentsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentsRequest, com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentsResult> {

	var locale: Locale? = null
	var signatureContains: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentsRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentsRequest()
		input.setLocale(this.locale?.toString())
		input.setSignatureContains(this.signatureContains)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentsResult {
	  return com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentsResult {
		return environment.lexmodels.getBuiltinIntents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models get-builtin-intents")
				.argument("locale", locale?.toString())
				.argument("signature-contains", signatureContains)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonLexModelBuildingFunctions.getBuiltinSlotTypes(init: (AmazonLexModelBuildingGetBuiltinSlotTypesCommand.() -> Unit)? = null): com.amazonaws.services.lexmodelbuilding.model.GetBuiltinSlotTypesResult {
	return this.block.declare(AmazonLexModelBuildingGetBuiltinSlotTypesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lexmodelbuilding.model.GetBuiltinSlotTypesResult
}

@Generated
class AmazonLexModelBuildingGetBuiltinSlotTypesCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.GetBuiltinSlotTypesRequest, com.amazonaws.services.lexmodelbuilding.model.GetBuiltinSlotTypesResult> {

	var locale: Locale? = null
	var signatureContains: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.GetBuiltinSlotTypesRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.GetBuiltinSlotTypesRequest()
		input.setLocale(this.locale?.toString())
		input.setSignatureContains(this.signatureContains)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lexmodelbuilding.model.GetBuiltinSlotTypesResult {
	  return com.amazonaws.services.lexmodelbuilding.model.GetBuiltinSlotTypesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lexmodelbuilding.model.GetBuiltinSlotTypesResult {
		return environment.lexmodels.getBuiltinSlotTypes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models get-builtin-slot-types")
				.argument("locale", locale?.toString())
				.argument("signature-contains", signatureContains)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonLexModelBuildingFunctions.getExport(init: (AmazonLexModelBuildingGetExportCommand.() -> Unit)? = null): com.amazonaws.services.lexmodelbuilding.model.GetExportResult {
	return this.block.declare(AmazonLexModelBuildingGetExportCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lexmodelbuilding.model.GetExportResult
}

@Generated
class AmazonLexModelBuildingGetExportCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.GetExportRequest, com.amazonaws.services.lexmodelbuilding.model.GetExportResult> {

	var name: String? = null
	var version: String? = null
	var resourceType: ResourceType? = null
	var exportType: ExportType? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.GetExportRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.GetExportRequest()
		input.setName(this.name)
		input.setVersion(this.version)
		input.setResourceType(this.resourceType?.toString())
		input.setExportType(this.exportType?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lexmodelbuilding.model.GetExportResult {
	  return com.amazonaws.services.lexmodelbuilding.model.GetExportResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lexmodelbuilding.model.GetExportResult {
		return environment.lexmodels.getExport(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models get-export")
				.argument("name", name)
				.argument("version", version)
				.argument("resource-type", resourceType?.toString())
				.argument("export-type", exportType?.toString())
	}

}


fun AmazonLexModelBuildingFunctions.getImport(init: (AmazonLexModelBuildingGetImportCommand.() -> Unit)? = null): com.amazonaws.services.lexmodelbuilding.model.GetImportResult {
	return this.block.declare(AmazonLexModelBuildingGetImportCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lexmodelbuilding.model.GetImportResult
}

@Generated
class AmazonLexModelBuildingGetImportCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.GetImportRequest, com.amazonaws.services.lexmodelbuilding.model.GetImportResult> {

	var importId: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.GetImportRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.GetImportRequest()
		input.setImportId(this.importId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lexmodelbuilding.model.GetImportResult {
	  return com.amazonaws.services.lexmodelbuilding.model.GetImportResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lexmodelbuilding.model.GetImportResult {
		return environment.lexmodels.getImport(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models get-import")
				.argument("import-id", importId)
	}

}


fun AmazonLexModelBuildingFunctions.getIntent(init: (AmazonLexModelBuildingGetIntentCommand.() -> Unit)? = null): com.amazonaws.services.lexmodelbuilding.model.GetIntentResult {
	return this.block.declare(AmazonLexModelBuildingGetIntentCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lexmodelbuilding.model.GetIntentResult
}

@Generated
class AmazonLexModelBuildingGetIntentCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.GetIntentRequest, com.amazonaws.services.lexmodelbuilding.model.GetIntentResult> {

	var name: String? = null
	var version: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.GetIntentRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.GetIntentRequest()
		input.setName(this.name)
		input.setVersion(this.version)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lexmodelbuilding.model.GetIntentResult {
	  return com.amazonaws.services.lexmodelbuilding.model.GetIntentResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lexmodelbuilding.model.GetIntentResult {
		return environment.lexmodels.getIntent(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models get-intent")
				.argument("name", name)
				.argument("version", version)
	}

}


fun AmazonLexModelBuildingFunctions.getIntentVersions(init: (AmazonLexModelBuildingGetIntentVersionsCommand.() -> Unit)? = null): com.amazonaws.services.lexmodelbuilding.model.GetIntentVersionsResult {
	return this.block.declare(AmazonLexModelBuildingGetIntentVersionsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lexmodelbuilding.model.GetIntentVersionsResult
}

@Generated
class AmazonLexModelBuildingGetIntentVersionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.GetIntentVersionsRequest, com.amazonaws.services.lexmodelbuilding.model.GetIntentVersionsResult> {

	var name: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.GetIntentVersionsRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.GetIntentVersionsRequest()
		input.setName(this.name)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lexmodelbuilding.model.GetIntentVersionsResult {
	  return com.amazonaws.services.lexmodelbuilding.model.GetIntentVersionsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lexmodelbuilding.model.GetIntentVersionsResult {
		return environment.lexmodels.getIntentVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models get-intent-versions")
				.argument("name", name)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonLexModelBuildingFunctions.getIntents(init: (AmazonLexModelBuildingGetIntentsCommand.() -> Unit)? = null): com.amazonaws.services.lexmodelbuilding.model.GetIntentsResult {
	return this.block.declare(AmazonLexModelBuildingGetIntentsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lexmodelbuilding.model.GetIntentsResult
}

@Generated
class AmazonLexModelBuildingGetIntentsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.GetIntentsRequest, com.amazonaws.services.lexmodelbuilding.model.GetIntentsResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0
	var nameContains: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.GetIntentsRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.GetIntentsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setNameContains(this.nameContains)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lexmodelbuilding.model.GetIntentsResult {
	  return com.amazonaws.services.lexmodelbuilding.model.GetIntentsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lexmodelbuilding.model.GetIntentsResult {
		return environment.lexmodels.getIntents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models get-intents")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("name-contains", nameContains)
	}

}


fun AmazonLexModelBuildingFunctions.getSlotType(init: (AmazonLexModelBuildingGetSlotTypeCommand.() -> Unit)? = null): com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeResult {
	return this.block.declare(AmazonLexModelBuildingGetSlotTypeCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeResult
}

@Generated
class AmazonLexModelBuildingGetSlotTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeRequest, com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeResult> {

	var name: String? = null
	var version: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeRequest()
		input.setName(this.name)
		input.setVersion(this.version)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeResult {
	  return com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeResult {
		return environment.lexmodels.getSlotType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models get-slot-type")
				.argument("name", name)
				.argument("version", version)
	}

}


fun AmazonLexModelBuildingFunctions.getSlotTypeVersions(init: (AmazonLexModelBuildingGetSlotTypeVersionsCommand.() -> Unit)? = null): com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeVersionsResult {
	return this.block.declare(AmazonLexModelBuildingGetSlotTypeVersionsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeVersionsResult
}

@Generated
class AmazonLexModelBuildingGetSlotTypeVersionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeVersionsRequest, com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeVersionsResult> {

	var name: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeVersionsRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeVersionsRequest()
		input.setName(this.name)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeVersionsResult {
	  return com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeVersionsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeVersionsResult {
		return environment.lexmodels.getSlotTypeVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models get-slot-type-versions")
				.argument("name", name)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonLexModelBuildingFunctions.getSlotTypes(init: (AmazonLexModelBuildingGetSlotTypesCommand.() -> Unit)? = null): com.amazonaws.services.lexmodelbuilding.model.GetSlotTypesResult {
	return this.block.declare(AmazonLexModelBuildingGetSlotTypesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lexmodelbuilding.model.GetSlotTypesResult
}

@Generated
class AmazonLexModelBuildingGetSlotTypesCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.GetSlotTypesRequest, com.amazonaws.services.lexmodelbuilding.model.GetSlotTypesResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0
	var nameContains: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.GetSlotTypesRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.GetSlotTypesRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setNameContains(this.nameContains)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lexmodelbuilding.model.GetSlotTypesResult {
	  return com.amazonaws.services.lexmodelbuilding.model.GetSlotTypesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lexmodelbuilding.model.GetSlotTypesResult {
		return environment.lexmodels.getSlotTypes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models get-slot-types")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("name-contains", nameContains)
	}

}


fun AmazonLexModelBuildingFunctions.getUtterancesView(init: (AmazonLexModelBuildingGetUtterancesViewCommand.() -> Unit)? = null): com.amazonaws.services.lexmodelbuilding.model.GetUtterancesViewResult {
	return this.block.declare(AmazonLexModelBuildingGetUtterancesViewCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lexmodelbuilding.model.GetUtterancesViewResult
}

@Generated
class AmazonLexModelBuildingGetUtterancesViewCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.GetUtterancesViewRequest, com.amazonaws.services.lexmodelbuilding.model.GetUtterancesViewResult> {

	var botName: String? = null
	var botVersions: List<String>? = null
	var statusType: StatusType? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.GetUtterancesViewRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.GetUtterancesViewRequest()
		input.setBotName(this.botName)
		input.setBotVersions(this.botVersions)
		input.setStatusType(this.statusType?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lexmodelbuilding.model.GetUtterancesViewResult {
	  return com.amazonaws.services.lexmodelbuilding.model.GetUtterancesViewResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lexmodelbuilding.model.GetUtterancesViewResult {
		return environment.lexmodels.getUtterancesView(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models get-utterances-view")
				.argument("bot-name", botName)
				.argument("bot-versions", botVersions?.toString())
				.argument("status-type", statusType?.toString())
	}

}


fun AmazonLexModelBuildingFunctions.putBot(init: (AmazonLexModelBuildingPutBotCommand.() -> Unit)? = null): com.amazonaws.services.lexmodelbuilding.model.PutBotResult {
	return this.block.declare(AmazonLexModelBuildingPutBotCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lexmodelbuilding.model.PutBotResult
}

@Generated
class AmazonLexModelBuildingPutBotCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.PutBotRequest, com.amazonaws.services.lexmodelbuilding.model.PutBotResult> {

	var name: String? = null
	var description: String? = null
	var intents: List<com.amazonaws.services.lexmodelbuilding.model.Intent>? = null
	var clarificationPrompt: com.amazonaws.services.lexmodelbuilding.model.Prompt? = null
	var abortStatement: com.amazonaws.services.lexmodelbuilding.model.Statement? = null
	var idleSessionTTLInSeconds: Int? = 0
	var voiceId: String? = null
	var checksum: String? = null
	var processBehavior: ProcessBehavior? = null
	var locale: Locale? = null
	var childDirected: Boolean? = false
	var createVersion: Boolean? = false

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.PutBotRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.PutBotRequest()
		input.setName(this.name)
		input.setDescription(this.description)
		input.setIntents(this.intents)
		input.setClarificationPrompt(this.clarificationPrompt)
		input.setAbortStatement(this.abortStatement)
		input.setIdleSessionTTLInSeconds(this.idleSessionTTLInSeconds)
		input.setVoiceId(this.voiceId)
		input.setChecksum(this.checksum)
		input.setProcessBehavior(this.processBehavior?.toString())
		input.setLocale(this.locale?.toString())
		input.setChildDirected(this.childDirected)
		input.setCreateVersion(this.createVersion)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lexmodelbuilding.model.PutBotResult {
	  return com.amazonaws.services.lexmodelbuilding.model.PutBotResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lexmodelbuilding.model.PutBotResult {
		return environment.lexmodels.putBot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models put-bot")
				.argument("name", name)
				.argument("description", description)
				.argument("intents", intents?.toString())
				.argument("clarification-prompt", clarificationPrompt?.toString())
				.argument("abort-statement", abortStatement?.toString())
				.argument("idle-session-ttlin-seconds", idleSessionTTLInSeconds?.toString())
				.argument("voice-id", voiceId)
				.argument("checksum", checksum)
				.argument("process-behavior", processBehavior?.toString())
				.argument("locale", locale?.toString())
				.option("child-directed", childDirected ?: false)
				.option("create-version", createVersion ?: false)
	}

}


fun AmazonLexModelBuildingFunctions.putBotAlias(init: (AmazonLexModelBuildingPutBotAliasCommand.() -> Unit)? = null): com.amazonaws.services.lexmodelbuilding.model.PutBotAliasResult {
	return this.block.declare(AmazonLexModelBuildingPutBotAliasCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lexmodelbuilding.model.PutBotAliasResult
}

@Generated
class AmazonLexModelBuildingPutBotAliasCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.PutBotAliasRequest, com.amazonaws.services.lexmodelbuilding.model.PutBotAliasResult> {

	var name: String? = null
	var description: String? = null
	var botVersion: String? = null
	var botName: String? = null
	var checksum: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.PutBotAliasRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.PutBotAliasRequest()
		input.setName(this.name)
		input.setDescription(this.description)
		input.setBotVersion(this.botVersion)
		input.setBotName(this.botName)
		input.setChecksum(this.checksum)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lexmodelbuilding.model.PutBotAliasResult {
	  return com.amazonaws.services.lexmodelbuilding.model.PutBotAliasResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lexmodelbuilding.model.PutBotAliasResult {
		return environment.lexmodels.putBotAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models put-bot-alias")
				.argument("name", name)
				.argument("description", description)
				.argument("bot-version", botVersion)
				.argument("bot-name", botName)
				.argument("checksum", checksum)
	}

}


fun AmazonLexModelBuildingFunctions.putIntent(init: (AmazonLexModelBuildingPutIntentCommand.() -> Unit)? = null): com.amazonaws.services.lexmodelbuilding.model.PutIntentResult {
	return this.block.declare(AmazonLexModelBuildingPutIntentCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lexmodelbuilding.model.PutIntentResult
}

@Generated
class AmazonLexModelBuildingPutIntentCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.PutIntentRequest, com.amazonaws.services.lexmodelbuilding.model.PutIntentResult> {

	var name: String? = null
	var description: String? = null
	var slots: List<com.amazonaws.services.lexmodelbuilding.model.Slot>? = null
	var sampleUtterances: List<String>? = null
	var confirmationPrompt: com.amazonaws.services.lexmodelbuilding.model.Prompt? = null
	var rejectionStatement: com.amazonaws.services.lexmodelbuilding.model.Statement? = null
	var followUpPrompt: com.amazonaws.services.lexmodelbuilding.model.FollowUpPrompt? = null
	var conclusionStatement: com.amazonaws.services.lexmodelbuilding.model.Statement? = null
	var dialogCodeHook: com.amazonaws.services.lexmodelbuilding.model.CodeHook? = null
	var fulfillmentActivity: com.amazonaws.services.lexmodelbuilding.model.FulfillmentActivity? = null
	var parentIntentSignature: String? = null
	var checksum: String? = null
	var createVersion: Boolean? = false

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.PutIntentRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.PutIntentRequest()
		input.setName(this.name)
		input.setDescription(this.description)
		input.setSlots(this.slots)
		input.setSampleUtterances(this.sampleUtterances)
		input.setConfirmationPrompt(this.confirmationPrompt)
		input.setRejectionStatement(this.rejectionStatement)
		input.setFollowUpPrompt(this.followUpPrompt)
		input.setConclusionStatement(this.conclusionStatement)
		input.setDialogCodeHook(this.dialogCodeHook)
		input.setFulfillmentActivity(this.fulfillmentActivity)
		input.setParentIntentSignature(this.parentIntentSignature)
		input.setChecksum(this.checksum)
		input.setCreateVersion(this.createVersion)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lexmodelbuilding.model.PutIntentResult {
	  return com.amazonaws.services.lexmodelbuilding.model.PutIntentResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lexmodelbuilding.model.PutIntentResult {
		return environment.lexmodels.putIntent(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models put-intent")
				.argument("name", name)
				.argument("description", description)
				.argument("slots", slots?.toString())
				.argument("sample-utterances", sampleUtterances?.toString())
				.argument("confirmation-prompt", confirmationPrompt?.toString())
				.argument("rejection-statement", rejectionStatement?.toString())
				.argument("follow-up-prompt", followUpPrompt?.toString())
				.argument("conclusion-statement", conclusionStatement?.toString())
				.argument("dialog-code-hook", dialogCodeHook?.toString())
				.argument("fulfillment-activity", fulfillmentActivity?.toString())
				.argument("parent-intent-signature", parentIntentSignature)
				.argument("checksum", checksum)
				.option("create-version", createVersion ?: false)
	}

}


fun AmazonLexModelBuildingFunctions.putSlotType(init: (AmazonLexModelBuildingPutSlotTypeCommand.() -> Unit)? = null): com.amazonaws.services.lexmodelbuilding.model.PutSlotTypeResult {
	return this.block.declare(AmazonLexModelBuildingPutSlotTypeCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lexmodelbuilding.model.PutSlotTypeResult
}

@Generated
class AmazonLexModelBuildingPutSlotTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.PutSlotTypeRequest, com.amazonaws.services.lexmodelbuilding.model.PutSlotTypeResult> {

	var name: String? = null
	var description: String? = null
	var enumerationValues: List<com.amazonaws.services.lexmodelbuilding.model.EnumerationValue>? = null
	var checksum: String? = null
	var valueSelectionStrategy: SlotValueSelectionStrategy? = null
	var createVersion: Boolean? = false

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.PutSlotTypeRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.PutSlotTypeRequest()
		input.setName(this.name)
		input.setDescription(this.description)
		input.setEnumerationValues(this.enumerationValues)
		input.setChecksum(this.checksum)
		input.setValueSelectionStrategy(this.valueSelectionStrategy?.toString())
		input.setCreateVersion(this.createVersion)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lexmodelbuilding.model.PutSlotTypeResult {
	  return com.amazonaws.services.lexmodelbuilding.model.PutSlotTypeResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lexmodelbuilding.model.PutSlotTypeResult {
		return environment.lexmodels.putSlotType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models put-slot-type")
				.argument("name", name)
				.argument("description", description)
				.argument("enumeration-values", enumerationValues?.toString())
				.argument("checksum", checksum)
				.argument("value-selection-strategy", valueSelectionStrategy?.toString())
				.option("create-version", createVersion ?: false)
	}

}


fun AmazonLexModelBuildingFunctions.startImport(init: (AmazonLexModelBuildingStartImportCommand.() -> Unit)? = null): com.amazonaws.services.lexmodelbuilding.model.StartImportResult {
	return this.block.declare(AmazonLexModelBuildingStartImportCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lexmodelbuilding.model.StartImportResult
}

@Generated
class AmazonLexModelBuildingStartImportCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.StartImportRequest, com.amazonaws.services.lexmodelbuilding.model.StartImportResult> {

	var payload: java.nio.ByteBuffer? = null
	var resourceType: ResourceType? = null
	var mergeStrategy: MergeStrategy? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.StartImportRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.StartImportRequest()
		input.setPayload(this.payload)
		input.setResourceType(this.resourceType?.toString())
		input.setMergeStrategy(this.mergeStrategy?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lexmodelbuilding.model.StartImportResult {
	  return com.amazonaws.services.lexmodelbuilding.model.StartImportResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lexmodelbuilding.model.StartImportResult {
		return environment.lexmodels.startImport(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models start-import")
				.argument("payload", payload?.toString())
				.argument("resource-type", resourceType?.toString())
				.argument("merge-strategy", mergeStrategy?.toString())
	}

}
