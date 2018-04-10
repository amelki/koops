
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.lexmodelbuilding.AmazonLexModelBuilding
import com.amazonaws.services.lexmodelbuilding.model.*

var codingue.koops.core.Environment.lexmodels: AmazonLexModelBuilding
	get() = this.capabilities[AmazonLexModelBuilding::class.java.name] as AmazonLexModelBuilding
	set(lexmodels) {
		this.capabilities[AmazonLexModelBuilding::class.java.name] = lexmodels
	}

@Generated
class AmazonLexModelBuildingFunctions(val block: Block)

infix fun AwsContinuation.lexmodels(init: AmazonLexModelBuildingFunctions.() -> Unit) {
	AmazonLexModelBuildingFunctions(shell).apply(init)
}

			

fun AmazonLexModelBuildingFunctions.createBotVersion(init: AmazonLexModelBuildingCreateBotVersionCommand.() -> Unit) {
	this.block.declare(AmazonLexModelBuildingCreateBotVersionCommand().apply(init))
}

@Generated
class AmazonLexModelBuildingCreateBotVersionCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.CreateBotVersionRequest> {

	var name: String? = null
	var checksum: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.CreateBotVersionRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.CreateBotVersionRequest()
		input.setName(this.name)
		input.setChecksum(this.checksum)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lexmodels.createBotVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models create-bot-version")
				.argument("name", name)
				.argument("checksum", checksum)
	}

}


fun AmazonLexModelBuildingFunctions.createIntentVersion(init: AmazonLexModelBuildingCreateIntentVersionCommand.() -> Unit) {
	this.block.declare(AmazonLexModelBuildingCreateIntentVersionCommand().apply(init))
}

@Generated
class AmazonLexModelBuildingCreateIntentVersionCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.CreateIntentVersionRequest> {

	var name: String? = null
	var checksum: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.CreateIntentVersionRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.CreateIntentVersionRequest()
		input.setName(this.name)
		input.setChecksum(this.checksum)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lexmodels.createIntentVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models create-intent-version")
				.argument("name", name)
				.argument("checksum", checksum)
	}

}


fun AmazonLexModelBuildingFunctions.createSlotTypeVersion(init: AmazonLexModelBuildingCreateSlotTypeVersionCommand.() -> Unit) {
	this.block.declare(AmazonLexModelBuildingCreateSlotTypeVersionCommand().apply(init))
}

@Generated
class AmazonLexModelBuildingCreateSlotTypeVersionCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.CreateSlotTypeVersionRequest> {

	var name: String? = null
	var checksum: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.CreateSlotTypeVersionRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.CreateSlotTypeVersionRequest()
		input.setName(this.name)
		input.setChecksum(this.checksum)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lexmodels.createSlotTypeVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models create-slot-type-version")
				.argument("name", name)
				.argument("checksum", checksum)
	}

}


fun AmazonLexModelBuildingFunctions.deleteBot(init: AmazonLexModelBuildingDeleteBotCommand.() -> Unit) {
	this.block.declare(AmazonLexModelBuildingDeleteBotCommand().apply(init))
}

@Generated
class AmazonLexModelBuildingDeleteBotCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.DeleteBotRequest> {

	var name: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.DeleteBotRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.DeleteBotRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lexmodels.deleteBot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models delete-bot")
				.argument("name", name)
	}

}


fun AmazonLexModelBuildingFunctions.deleteBotAlias(init: AmazonLexModelBuildingDeleteBotAliasCommand.() -> Unit) {
	this.block.declare(AmazonLexModelBuildingDeleteBotAliasCommand().apply(init))
}

@Generated
class AmazonLexModelBuildingDeleteBotAliasCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.DeleteBotAliasRequest> {

	var name: String? = null
	var botName: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.DeleteBotAliasRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.DeleteBotAliasRequest()
		input.setName(this.name)
		input.setBotName(this.botName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lexmodels.deleteBotAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models delete-bot-alias")
				.argument("name", name)
				.argument("bot-name", botName)
	}

}


fun AmazonLexModelBuildingFunctions.deleteBotChannelAssociation(init: AmazonLexModelBuildingDeleteBotChannelAssociationCommand.() -> Unit) {
	this.block.declare(AmazonLexModelBuildingDeleteBotChannelAssociationCommand().apply(init))
}

@Generated
class AmazonLexModelBuildingDeleteBotChannelAssociationCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.DeleteBotChannelAssociationRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lexmodels.deleteBotChannelAssociation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models delete-bot-channel-association")
				.argument("name", name)
				.argument("bot-name", botName)
				.argument("bot-alias", botAlias)
	}

}


fun AmazonLexModelBuildingFunctions.deleteBotVersion(init: AmazonLexModelBuildingDeleteBotVersionCommand.() -> Unit) {
	this.block.declare(AmazonLexModelBuildingDeleteBotVersionCommand().apply(init))
}

@Generated
class AmazonLexModelBuildingDeleteBotVersionCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.DeleteBotVersionRequest> {

	var name: String? = null
	var version: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.DeleteBotVersionRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.DeleteBotVersionRequest()
		input.setName(this.name)
		input.setVersion(this.version)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lexmodels.deleteBotVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models delete-bot-version")
				.argument("name", name)
				.argument("version", version)
	}

}


fun AmazonLexModelBuildingFunctions.deleteIntent(init: AmazonLexModelBuildingDeleteIntentCommand.() -> Unit) {
	this.block.declare(AmazonLexModelBuildingDeleteIntentCommand().apply(init))
}

@Generated
class AmazonLexModelBuildingDeleteIntentCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.DeleteIntentRequest> {

	var name: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.DeleteIntentRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.DeleteIntentRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lexmodels.deleteIntent(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models delete-intent")
				.argument("name", name)
	}

}


fun AmazonLexModelBuildingFunctions.deleteIntentVersion(init: AmazonLexModelBuildingDeleteIntentVersionCommand.() -> Unit) {
	this.block.declare(AmazonLexModelBuildingDeleteIntentVersionCommand().apply(init))
}

@Generated
class AmazonLexModelBuildingDeleteIntentVersionCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.DeleteIntentVersionRequest> {

	var name: String? = null
	var version: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.DeleteIntentVersionRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.DeleteIntentVersionRequest()
		input.setName(this.name)
		input.setVersion(this.version)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lexmodels.deleteIntentVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models delete-intent-version")
				.argument("name", name)
				.argument("version", version)
	}

}


fun AmazonLexModelBuildingFunctions.deleteSlotType(init: AmazonLexModelBuildingDeleteSlotTypeCommand.() -> Unit) {
	this.block.declare(AmazonLexModelBuildingDeleteSlotTypeCommand().apply(init))
}

@Generated
class AmazonLexModelBuildingDeleteSlotTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeRequest> {

	var name: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lexmodels.deleteSlotType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models delete-slot-type")
				.argument("name", name)
	}

}


fun AmazonLexModelBuildingFunctions.deleteSlotTypeVersion(init: AmazonLexModelBuildingDeleteSlotTypeVersionCommand.() -> Unit) {
	this.block.declare(AmazonLexModelBuildingDeleteSlotTypeVersionCommand().apply(init))
}

@Generated
class AmazonLexModelBuildingDeleteSlotTypeVersionCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeVersionRequest> {

	var name: String? = null
	var version: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeVersionRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeVersionRequest()
		input.setName(this.name)
		input.setVersion(this.version)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lexmodels.deleteSlotTypeVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models delete-slot-type-version")
				.argument("name", name)
				.argument("version", version)
	}

}


fun AmazonLexModelBuildingFunctions.deleteUtterances(init: AmazonLexModelBuildingDeleteUtterancesCommand.() -> Unit) {
	this.block.declare(AmazonLexModelBuildingDeleteUtterancesCommand().apply(init))
}

@Generated
class AmazonLexModelBuildingDeleteUtterancesCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.DeleteUtterancesRequest> {

	var botName: String? = null
	var userId: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.DeleteUtterancesRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.DeleteUtterancesRequest()
		input.setBotName(this.botName)
		input.setUserId(this.userId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lexmodels.deleteUtterances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models delete-utterances")
				.argument("bot-name", botName)
				.argument("user-id", userId)
	}

}


fun AmazonLexModelBuildingFunctions.getBot(init: AmazonLexModelBuildingGetBotCommand.() -> Unit) {
	this.block.declare(AmazonLexModelBuildingGetBotCommand().apply(init))
}

@Generated
class AmazonLexModelBuildingGetBotCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.GetBotRequest> {

	var name: String? = null
	var versionOrAlias: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.GetBotRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.GetBotRequest()
		input.setName(this.name)
		input.setVersionOrAlias(this.versionOrAlias)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lexmodels.getBot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models get-bot")
				.argument("name", name)
				.argument("version-or-alias", versionOrAlias)
	}

}


fun AmazonLexModelBuildingFunctions.getBotAlias(init: AmazonLexModelBuildingGetBotAliasCommand.() -> Unit) {
	this.block.declare(AmazonLexModelBuildingGetBotAliasCommand().apply(init))
}

@Generated
class AmazonLexModelBuildingGetBotAliasCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.GetBotAliasRequest> {

	var name: String? = null
	var botName: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.GetBotAliasRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.GetBotAliasRequest()
		input.setName(this.name)
		input.setBotName(this.botName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lexmodels.getBotAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models get-bot-alias")
				.argument("name", name)
				.argument("bot-name", botName)
	}

}


fun AmazonLexModelBuildingFunctions.getBotAliases(init: AmazonLexModelBuildingGetBotAliasesCommand.() -> Unit) {
	this.block.declare(AmazonLexModelBuildingGetBotAliasesCommand().apply(init))
}

@Generated
class AmazonLexModelBuildingGetBotAliasesCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.GetBotAliasesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lexmodels.getBotAliases(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models get-bot-aliases")
				.argument("bot-name", botName)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("name-contains", nameContains)
	}

}


fun AmazonLexModelBuildingFunctions.getBotChannelAssociation(init: AmazonLexModelBuildingGetBotChannelAssociationCommand.() -> Unit) {
	this.block.declare(AmazonLexModelBuildingGetBotChannelAssociationCommand().apply(init))
}

@Generated
class AmazonLexModelBuildingGetBotChannelAssociationCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lexmodels.getBotChannelAssociation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models get-bot-channel-association")
				.argument("name", name)
				.argument("bot-name", botName)
				.argument("bot-alias", botAlias)
	}

}


fun AmazonLexModelBuildingFunctions.getBotChannelAssociations(init: AmazonLexModelBuildingGetBotChannelAssociationsCommand.() -> Unit) {
	this.block.declare(AmazonLexModelBuildingGetBotChannelAssociationsCommand().apply(init))
}

@Generated
class AmazonLexModelBuildingGetBotChannelAssociationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lexmodels.getBotChannelAssociations(build())
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


fun AmazonLexModelBuildingFunctions.getBotVersions(init: AmazonLexModelBuildingGetBotVersionsCommand.() -> Unit) {
	this.block.declare(AmazonLexModelBuildingGetBotVersionsCommand().apply(init))
}

@Generated
class AmazonLexModelBuildingGetBotVersionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.GetBotVersionsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lexmodels.getBotVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models get-bot-versions")
				.argument("name", name)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonLexModelBuildingFunctions.getBots(init: AmazonLexModelBuildingGetBotsCommand.() -> Unit) {
	this.block.declare(AmazonLexModelBuildingGetBotsCommand().apply(init))
}

@Generated
class AmazonLexModelBuildingGetBotsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.GetBotsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lexmodels.getBots(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models get-bots")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("name-contains", nameContains)
	}

}


fun AmazonLexModelBuildingFunctions.getBuiltinIntent(init: AmazonLexModelBuildingGetBuiltinIntentCommand.() -> Unit) {
	this.block.declare(AmazonLexModelBuildingGetBuiltinIntentCommand().apply(init))
}

@Generated
class AmazonLexModelBuildingGetBuiltinIntentCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentRequest> {

	var signature: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentRequest()
		input.setSignature(this.signature)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lexmodels.getBuiltinIntent(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models get-builtin-intent")
				.argument("signature", signature)
	}

}


fun AmazonLexModelBuildingFunctions.getBuiltinIntents(init: AmazonLexModelBuildingGetBuiltinIntentsCommand.() -> Unit) {
	this.block.declare(AmazonLexModelBuildingGetBuiltinIntentsCommand().apply(init))
}

@Generated
class AmazonLexModelBuildingGetBuiltinIntentsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lexmodels.getBuiltinIntents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models get-builtin-intents")
				.argument("locale", locale?.toString())
				.argument("signature-contains", signatureContains)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonLexModelBuildingFunctions.getBuiltinSlotTypes(init: AmazonLexModelBuildingGetBuiltinSlotTypesCommand.() -> Unit) {
	this.block.declare(AmazonLexModelBuildingGetBuiltinSlotTypesCommand().apply(init))
}

@Generated
class AmazonLexModelBuildingGetBuiltinSlotTypesCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.GetBuiltinSlotTypesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lexmodels.getBuiltinSlotTypes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models get-builtin-slot-types")
				.argument("locale", locale?.toString())
				.argument("signature-contains", signatureContains)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonLexModelBuildingFunctions.getExport(init: AmazonLexModelBuildingGetExportCommand.() -> Unit) {
	this.block.declare(AmazonLexModelBuildingGetExportCommand().apply(init))
}

@Generated
class AmazonLexModelBuildingGetExportCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.GetExportRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lexmodels.getExport(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models get-export")
				.argument("name", name)
				.argument("version", version)
				.argument("resource-type", resourceType?.toString())
				.argument("export-type", exportType?.toString())
	}

}


fun AmazonLexModelBuildingFunctions.getImport(init: AmazonLexModelBuildingGetImportCommand.() -> Unit) {
	this.block.declare(AmazonLexModelBuildingGetImportCommand().apply(init))
}

@Generated
class AmazonLexModelBuildingGetImportCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.GetImportRequest> {

	var importId: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.GetImportRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.GetImportRequest()
		input.setImportId(this.importId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lexmodels.getImport(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models get-import")
				.argument("import-id", importId)
	}

}


fun AmazonLexModelBuildingFunctions.getIntent(init: AmazonLexModelBuildingGetIntentCommand.() -> Unit) {
	this.block.declare(AmazonLexModelBuildingGetIntentCommand().apply(init))
}

@Generated
class AmazonLexModelBuildingGetIntentCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.GetIntentRequest> {

	var name: String? = null
	var version: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.GetIntentRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.GetIntentRequest()
		input.setName(this.name)
		input.setVersion(this.version)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lexmodels.getIntent(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models get-intent")
				.argument("name", name)
				.argument("version", version)
	}

}


fun AmazonLexModelBuildingFunctions.getIntentVersions(init: AmazonLexModelBuildingGetIntentVersionsCommand.() -> Unit) {
	this.block.declare(AmazonLexModelBuildingGetIntentVersionsCommand().apply(init))
}

@Generated
class AmazonLexModelBuildingGetIntentVersionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.GetIntentVersionsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lexmodels.getIntentVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models get-intent-versions")
				.argument("name", name)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonLexModelBuildingFunctions.getIntents(init: AmazonLexModelBuildingGetIntentsCommand.() -> Unit) {
	this.block.declare(AmazonLexModelBuildingGetIntentsCommand().apply(init))
}

@Generated
class AmazonLexModelBuildingGetIntentsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.GetIntentsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lexmodels.getIntents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models get-intents")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("name-contains", nameContains)
	}

}


fun AmazonLexModelBuildingFunctions.getSlotType(init: AmazonLexModelBuildingGetSlotTypeCommand.() -> Unit) {
	this.block.declare(AmazonLexModelBuildingGetSlotTypeCommand().apply(init))
}

@Generated
class AmazonLexModelBuildingGetSlotTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeRequest> {

	var name: String? = null
	var version: String? = null

	override fun build(): com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeRequest {
		val input = com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeRequest()
		input.setName(this.name)
		input.setVersion(this.version)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lexmodels.getSlotType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models get-slot-type")
				.argument("name", name)
				.argument("version", version)
	}

}


fun AmazonLexModelBuildingFunctions.getSlotTypeVersions(init: AmazonLexModelBuildingGetSlotTypeVersionsCommand.() -> Unit) {
	this.block.declare(AmazonLexModelBuildingGetSlotTypeVersionsCommand().apply(init))
}

@Generated
class AmazonLexModelBuildingGetSlotTypeVersionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeVersionsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lexmodels.getSlotTypeVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models get-slot-type-versions")
				.argument("name", name)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonLexModelBuildingFunctions.getSlotTypes(init: AmazonLexModelBuildingGetSlotTypesCommand.() -> Unit) {
	this.block.declare(AmazonLexModelBuildingGetSlotTypesCommand().apply(init))
}

@Generated
class AmazonLexModelBuildingGetSlotTypesCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.GetSlotTypesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lexmodels.getSlotTypes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models get-slot-types")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("name-contains", nameContains)
	}

}


fun AmazonLexModelBuildingFunctions.getUtterancesView(init: AmazonLexModelBuildingGetUtterancesViewCommand.() -> Unit) {
	this.block.declare(AmazonLexModelBuildingGetUtterancesViewCommand().apply(init))
}

@Generated
class AmazonLexModelBuildingGetUtterancesViewCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.GetUtterancesViewRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lexmodels.getUtterancesView(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models get-utterances-view")
				.argument("bot-name", botName)
				.argument("bot-versions", botVersions?.toString())
				.argument("status-type", statusType?.toString())
	}

}


fun AmazonLexModelBuildingFunctions.putBot(init: AmazonLexModelBuildingPutBotCommand.() -> Unit) {
	this.block.declare(AmazonLexModelBuildingPutBotCommand().apply(init))
}

@Generated
class AmazonLexModelBuildingPutBotCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.PutBotRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lexmodels.putBot(build())
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


fun AmazonLexModelBuildingFunctions.putBotAlias(init: AmazonLexModelBuildingPutBotAliasCommand.() -> Unit) {
	this.block.declare(AmazonLexModelBuildingPutBotAliasCommand().apply(init))
}

@Generated
class AmazonLexModelBuildingPutBotAliasCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.PutBotAliasRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lexmodels.putBotAlias(build())
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


fun AmazonLexModelBuildingFunctions.putIntent(init: AmazonLexModelBuildingPutIntentCommand.() -> Unit) {
	this.block.declare(AmazonLexModelBuildingPutIntentCommand().apply(init))
}

@Generated
class AmazonLexModelBuildingPutIntentCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.PutIntentRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lexmodels.putIntent(build())
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


fun AmazonLexModelBuildingFunctions.putSlotType(init: AmazonLexModelBuildingPutSlotTypeCommand.() -> Unit) {
	this.block.declare(AmazonLexModelBuildingPutSlotTypeCommand().apply(init))
}

@Generated
class AmazonLexModelBuildingPutSlotTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.PutSlotTypeRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lexmodels.putSlotType(build())
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


fun AmazonLexModelBuildingFunctions.startImport(init: AmazonLexModelBuildingStartImportCommand.() -> Unit) {
	this.block.declare(AmazonLexModelBuildingStartImportCommand().apply(init))
}

@Generated
class AmazonLexModelBuildingStartImportCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexmodelbuilding.model.StartImportRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lexmodels.startImport(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-models start-import")
				.argument("payload", payload?.toString())
				.argument("resource-type", resourceType?.toString())
				.argument("merge-strategy", mergeStrategy?.toString())
	}

}
