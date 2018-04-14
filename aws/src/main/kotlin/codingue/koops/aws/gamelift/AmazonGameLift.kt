
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws.gamelift

import javax.annotation.Generated
import codingue.koops.core.*
import codingue.koops.aws.*
import com.amazonaws.services.gamelift.*
import com.amazonaws.services.gamelift.model.*

var codingue.koops.core.Environment.gamelift: AmazonGameLift
	get() {
		var service = this.capabilities["aws-gamelift"]
		if (service == null) {
			service = AmazonGameLiftClientBuilder.standard().build()
			this.capabilities["aws-gamelift"] = service
		}
		return service as AmazonGameLift
	}
	set(gamelift) {
		this.capabilities["aws-gamelift"] = gamelift
	}

@Generated
class AmazonGameLiftFunctions(val block: Block)

infix fun <T> AwsContinuation.gamelift(init: AmazonGameLiftFunctions.() -> T): T {
	return AmazonGameLiftFunctions(shell).run(init)
}

			

fun AmazonGameLiftFunctions.acceptMatch(ticketId: String, playerIds: List<String>, acceptanceType: AcceptanceType, init: AmazonGameLiftAcceptMatchCommand.() -> Unit): com.amazonaws.services.gamelift.model.AcceptMatchResult {
	return this.block.declare(AmazonGameLiftAcceptMatchCommand(ticketId, playerIds, acceptanceType).apply(init)) as com.amazonaws.services.gamelift.model.AcceptMatchResult
}

@Generated
class AmazonGameLiftAcceptMatchCommand(val ticketId: String, val playerIds: List<String>, val acceptanceType: AcceptanceType) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.AcceptMatchRequest, com.amazonaws.services.gamelift.model.AcceptMatchResult> {



	override fun build(): com.amazonaws.services.gamelift.model.AcceptMatchRequest {
		val input = com.amazonaws.services.gamelift.model.AcceptMatchRequest()
		input.setTicketId(this.ticketId)
		input.setPlayerIds(this.playerIds)
		input.setAcceptanceType(this.acceptanceType.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.AcceptMatchResult {
	  return com.amazonaws.services.gamelift.model.AcceptMatchResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.AcceptMatchResult {
		return environment.gamelift.acceptMatch(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift accept-match")
				.argument("ticket-id", ticketId)
				.argument("player-ids", playerIds.toString())
				.argument("acceptance-type", acceptanceType.toString())
	}

}


fun AmazonGameLiftFunctions.createAlias(name: String, routingStrategy: com.amazonaws.services.gamelift.model.RoutingStrategy, init: AmazonGameLiftCreateAliasCommand.() -> Unit): com.amazonaws.services.gamelift.model.CreateAliasResult {
	return this.block.declare(AmazonGameLiftCreateAliasCommand(name, routingStrategy).apply(init)) as com.amazonaws.services.gamelift.model.CreateAliasResult
}

@Generated
class AmazonGameLiftCreateAliasCommand(val name: String, val routingStrategy: com.amazonaws.services.gamelift.model.RoutingStrategy) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.CreateAliasRequest, com.amazonaws.services.gamelift.model.CreateAliasResult> {

	var description: String? = null

	override fun build(): com.amazonaws.services.gamelift.model.CreateAliasRequest {
		val input = com.amazonaws.services.gamelift.model.CreateAliasRequest()
		input.setName(this.name)
		input.setDescription(this.description)
		input.setRoutingStrategy(this.routingStrategy)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.CreateAliasResult {
	  return com.amazonaws.services.gamelift.model.CreateAliasResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.CreateAliasResult {
		return environment.gamelift.createAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift create-alias")
				.argument("name", name)
				.argument("description", description)
				.argument("routing-strategy", routingStrategy.toString())
	}

}


fun AmazonGameLiftFunctions.createBuild(init: AmazonGameLiftCreateBuildCommand.() -> Unit): com.amazonaws.services.gamelift.model.CreateBuildResult {
	return this.block.declare(AmazonGameLiftCreateBuildCommand().apply(init)) as com.amazonaws.services.gamelift.model.CreateBuildResult
}

@Generated
class AmazonGameLiftCreateBuildCommand() : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.CreateBuildRequest, com.amazonaws.services.gamelift.model.CreateBuildResult> {

	var name: String? = null
	var version: String? = null
	var storageLocation: com.amazonaws.services.gamelift.model.S3Location? = null
	var operatingSystem: OperatingSystem? = null

	override fun build(): com.amazonaws.services.gamelift.model.CreateBuildRequest {
		val input = com.amazonaws.services.gamelift.model.CreateBuildRequest()
		input.setName(this.name)
		input.setVersion(this.version)
		input.setStorageLocation(this.storageLocation)
		input.setOperatingSystem(this.operatingSystem?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.CreateBuildResult {
	  return com.amazonaws.services.gamelift.model.CreateBuildResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.CreateBuildResult {
		return environment.gamelift.createBuild(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift create-build")
				.argument("name", name)
				.argument("version", version)
				.argument("storage-location", storageLocation?.toString())
				.argument("operating-system", operatingSystem?.toString())
	}

}


fun AmazonGameLiftFunctions.createFleet(name: String, buildId: String, eC2InstanceType: EC2InstanceType, init: AmazonGameLiftCreateFleetCommand.() -> Unit): com.amazonaws.services.gamelift.model.CreateFleetResult {
	return this.block.declare(AmazonGameLiftCreateFleetCommand(name, buildId, eC2InstanceType).apply(init)) as com.amazonaws.services.gamelift.model.CreateFleetResult
}

@Generated
class AmazonGameLiftCreateFleetCommand(val name: String, val buildId: String, val eC2InstanceType: EC2InstanceType) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.CreateFleetRequest, com.amazonaws.services.gamelift.model.CreateFleetResult> {

	var description: String? = null
	var serverLaunchPath: String? = null
	var serverLaunchParameters: String? = null
	var logPaths: List<String>? = null
	var eC2InboundPermissions: List<com.amazonaws.services.gamelift.model.IpPermission>? = null
	var newGameSessionProtectionPolicy: ProtectionPolicy? = null
	var runtimeConfiguration: com.amazonaws.services.gamelift.model.RuntimeConfiguration? = null
	var resourceCreationLimitPolicy: com.amazonaws.services.gamelift.model.ResourceCreationLimitPolicy? = null
	var metricGroups: List<String>? = null
	var peerVpcAwsAccountId: String? = null
	var peerVpcId: String? = null
	var fleetType: FleetType? = null

	override fun build(): com.amazonaws.services.gamelift.model.CreateFleetRequest {
		val input = com.amazonaws.services.gamelift.model.CreateFleetRequest()
		input.setName(this.name)
		input.setDescription(this.description)
		input.setBuildId(this.buildId)
		input.setServerLaunchPath(this.serverLaunchPath)
		input.setServerLaunchParameters(this.serverLaunchParameters)
		input.setLogPaths(this.logPaths)
		input.setEC2InstanceType(this.eC2InstanceType.toString())
		input.setEC2InboundPermissions(this.eC2InboundPermissions)
		input.setNewGameSessionProtectionPolicy(this.newGameSessionProtectionPolicy?.toString())
		input.setRuntimeConfiguration(this.runtimeConfiguration)
		input.setResourceCreationLimitPolicy(this.resourceCreationLimitPolicy)
		input.setMetricGroups(this.metricGroups)
		input.setPeerVpcAwsAccountId(this.peerVpcAwsAccountId)
		input.setPeerVpcId(this.peerVpcId)
		input.setFleetType(this.fleetType?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.CreateFleetResult {
	  return com.amazonaws.services.gamelift.model.CreateFleetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.CreateFleetResult {
		return environment.gamelift.createFleet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift create-fleet")
				.argument("name", name)
				.argument("description", description)
				.argument("build-id", buildId)
				.argument("server-launch-path", serverLaunchPath)
				.argument("server-launch-parameters", serverLaunchParameters)
				.argument("log-paths", logPaths?.toString())
				.argument("ec2-instance-type", eC2InstanceType.toString())
				.argument("ec2-inbound-permissions", eC2InboundPermissions?.toString())
				.argument("new-game-session-protection-policy", newGameSessionProtectionPolicy?.toString())
				.argument("runtime-configuration", runtimeConfiguration?.toString())
				.argument("resource-creation-limit-policy", resourceCreationLimitPolicy?.toString())
				.argument("metric-groups", metricGroups?.toString())
				.argument("peer-vpc-aws-account-id", peerVpcAwsAccountId)
				.argument("peer-vpc-id", peerVpcId)
				.argument("fleet-type", fleetType?.toString())
	}

}


fun AmazonGameLiftFunctions.createGameSession(maximumPlayerSessionCount: Int, init: AmazonGameLiftCreateGameSessionCommand.() -> Unit): com.amazonaws.services.gamelift.model.CreateGameSessionResult {
	return this.block.declare(AmazonGameLiftCreateGameSessionCommand(maximumPlayerSessionCount).apply(init)) as com.amazonaws.services.gamelift.model.CreateGameSessionResult
}

@Generated
class AmazonGameLiftCreateGameSessionCommand(val maximumPlayerSessionCount: Int) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.CreateGameSessionRequest, com.amazonaws.services.gamelift.model.CreateGameSessionResult> {

	var fleetId: String? = null
	var aliasId: String? = null
	var name: String? = null
	var gameProperties: List<com.amazonaws.services.gamelift.model.GameProperty>? = null
	var creatorId: String? = null
	var gameSessionId: String? = null
	var idempotencyToken: String? = null
	var gameSessionData: String? = null

	override fun build(): com.amazonaws.services.gamelift.model.CreateGameSessionRequest {
		val input = com.amazonaws.services.gamelift.model.CreateGameSessionRequest()
		input.setFleetId(this.fleetId)
		input.setAliasId(this.aliasId)
		input.setMaximumPlayerSessionCount(this.maximumPlayerSessionCount)
		input.setName(this.name)
		input.setGameProperties(this.gameProperties)
		input.setCreatorId(this.creatorId)
		input.setGameSessionId(this.gameSessionId)
		input.setIdempotencyToken(this.idempotencyToken)
		input.setGameSessionData(this.gameSessionData)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.CreateGameSessionResult {
	  return com.amazonaws.services.gamelift.model.CreateGameSessionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.CreateGameSessionResult {
		return environment.gamelift.createGameSession(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift create-game-session")
				.argument("fleet-id", fleetId)
				.argument("alias-id", aliasId)
				.argument("maximum-player-session-count", maximumPlayerSessionCount.toString())
				.argument("name", name)
				.argument("game-properties", gameProperties?.toString())
				.argument("creator-id", creatorId)
				.argument("game-session-id", gameSessionId)
				.argument("idempotency-token", idempotencyToken)
				.argument("game-session-data", gameSessionData)
	}

}


fun AmazonGameLiftFunctions.createGameSessionQueue(name: String, init: AmazonGameLiftCreateGameSessionQueueCommand.() -> Unit): com.amazonaws.services.gamelift.model.CreateGameSessionQueueResult {
	return this.block.declare(AmazonGameLiftCreateGameSessionQueueCommand(name).apply(init)) as com.amazonaws.services.gamelift.model.CreateGameSessionQueueResult
}

@Generated
class AmazonGameLiftCreateGameSessionQueueCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.CreateGameSessionQueueRequest, com.amazonaws.services.gamelift.model.CreateGameSessionQueueResult> {

	var timeoutInSeconds: Int? = 0
	var playerLatencyPolicies: List<com.amazonaws.services.gamelift.model.PlayerLatencyPolicy>? = null
	var destinations: List<com.amazonaws.services.gamelift.model.GameSessionQueueDestination>? = null

	override fun build(): com.amazonaws.services.gamelift.model.CreateGameSessionQueueRequest {
		val input = com.amazonaws.services.gamelift.model.CreateGameSessionQueueRequest()
		input.setName(this.name)
		input.setTimeoutInSeconds(this.timeoutInSeconds)
		input.setPlayerLatencyPolicies(this.playerLatencyPolicies)
		input.setDestinations(this.destinations)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.CreateGameSessionQueueResult {
	  return com.amazonaws.services.gamelift.model.CreateGameSessionQueueResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.CreateGameSessionQueueResult {
		return environment.gamelift.createGameSessionQueue(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift create-game-session-queue")
				.argument("name", name)
				.argument("timeout-in-seconds", timeoutInSeconds?.toString())
				.argument("player-latency-policies", playerLatencyPolicies?.toString())
				.argument("destinations", destinations?.toString())
	}

}


fun AmazonGameLiftFunctions.createMatchmakingConfiguration(name: String, gameSessionQueueArns: List<String>, requestTimeoutSeconds: Int, acceptanceRequired: Boolean, ruleSetName: String, init: AmazonGameLiftCreateMatchmakingConfigurationCommand.() -> Unit): com.amazonaws.services.gamelift.model.CreateMatchmakingConfigurationResult {
	return this.block.declare(AmazonGameLiftCreateMatchmakingConfigurationCommand(name, gameSessionQueueArns, requestTimeoutSeconds, acceptanceRequired, ruleSetName).apply(init)) as com.amazonaws.services.gamelift.model.CreateMatchmakingConfigurationResult
}

@Generated
class AmazonGameLiftCreateMatchmakingConfigurationCommand(val name: String, val gameSessionQueueArns: List<String>, val requestTimeoutSeconds: Int, val acceptanceRequired: Boolean, val ruleSetName: String) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.CreateMatchmakingConfigurationRequest, com.amazonaws.services.gamelift.model.CreateMatchmakingConfigurationResult> {

	var description: String? = null
	var acceptanceTimeoutSeconds: Int? = 0
	var notificationTarget: String? = null
	var additionalPlayerCount: Int? = 0
	var customEventData: String? = null
	var gameProperties: List<com.amazonaws.services.gamelift.model.GameProperty>? = null
	var gameSessionData: String? = null

	override fun build(): com.amazonaws.services.gamelift.model.CreateMatchmakingConfigurationRequest {
		val input = com.amazonaws.services.gamelift.model.CreateMatchmakingConfigurationRequest()
		input.setName(this.name)
		input.setDescription(this.description)
		input.setGameSessionQueueArns(this.gameSessionQueueArns)
		input.setRequestTimeoutSeconds(this.requestTimeoutSeconds)
		input.setAcceptanceTimeoutSeconds(this.acceptanceTimeoutSeconds)
		input.setAcceptanceRequired(this.acceptanceRequired)
		input.setRuleSetName(this.ruleSetName)
		input.setNotificationTarget(this.notificationTarget)
		input.setAdditionalPlayerCount(this.additionalPlayerCount)
		input.setCustomEventData(this.customEventData)
		input.setGameProperties(this.gameProperties)
		input.setGameSessionData(this.gameSessionData)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.CreateMatchmakingConfigurationResult {
	  return com.amazonaws.services.gamelift.model.CreateMatchmakingConfigurationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.CreateMatchmakingConfigurationResult {
		return environment.gamelift.createMatchmakingConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift create-matchmaking-configuration")
				.argument("name", name)
				.argument("description", description)
				.argument("game-session-queue-arns", gameSessionQueueArns.toString())
				.argument("request-timeout-seconds", requestTimeoutSeconds.toString())
				.argument("acceptance-timeout-seconds", acceptanceTimeoutSeconds?.toString())
				.option("acceptance-required", acceptanceRequired ?: false)
				.argument("rule-set-name", ruleSetName)
				.argument("notification-target", notificationTarget)
				.argument("additional-player-count", additionalPlayerCount?.toString())
				.argument("custom-event-data", customEventData)
				.argument("game-properties", gameProperties?.toString())
				.argument("game-session-data", gameSessionData)
	}

}


fun AmazonGameLiftFunctions.createMatchmakingRuleSet(name: String, ruleSetBody: String, init: AmazonGameLiftCreateMatchmakingRuleSetCommand.() -> Unit): com.amazonaws.services.gamelift.model.CreateMatchmakingRuleSetResult {
	return this.block.declare(AmazonGameLiftCreateMatchmakingRuleSetCommand(name, ruleSetBody).apply(init)) as com.amazonaws.services.gamelift.model.CreateMatchmakingRuleSetResult
}

@Generated
class AmazonGameLiftCreateMatchmakingRuleSetCommand(val name: String, val ruleSetBody: String) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.CreateMatchmakingRuleSetRequest, com.amazonaws.services.gamelift.model.CreateMatchmakingRuleSetResult> {



	override fun build(): com.amazonaws.services.gamelift.model.CreateMatchmakingRuleSetRequest {
		val input = com.amazonaws.services.gamelift.model.CreateMatchmakingRuleSetRequest()
		input.setName(this.name)
		input.setRuleSetBody(this.ruleSetBody)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.CreateMatchmakingRuleSetResult {
	  return com.amazonaws.services.gamelift.model.CreateMatchmakingRuleSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.CreateMatchmakingRuleSetResult {
		return environment.gamelift.createMatchmakingRuleSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift create-matchmaking-rule-set")
				.argument("name", name)
				.argument("rule-set-body", ruleSetBody)
	}

}


fun AmazonGameLiftFunctions.createPlayerSession(gameSessionId: String, playerId: String, init: AmazonGameLiftCreatePlayerSessionCommand.() -> Unit): com.amazonaws.services.gamelift.model.CreatePlayerSessionResult {
	return this.block.declare(AmazonGameLiftCreatePlayerSessionCommand(gameSessionId, playerId).apply(init)) as com.amazonaws.services.gamelift.model.CreatePlayerSessionResult
}

@Generated
class AmazonGameLiftCreatePlayerSessionCommand(val gameSessionId: String, val playerId: String) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.CreatePlayerSessionRequest, com.amazonaws.services.gamelift.model.CreatePlayerSessionResult> {

	var playerData: String? = null

	override fun build(): com.amazonaws.services.gamelift.model.CreatePlayerSessionRequest {
		val input = com.amazonaws.services.gamelift.model.CreatePlayerSessionRequest()
		input.setGameSessionId(this.gameSessionId)
		input.setPlayerId(this.playerId)
		input.setPlayerData(this.playerData)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.CreatePlayerSessionResult {
	  return com.amazonaws.services.gamelift.model.CreatePlayerSessionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.CreatePlayerSessionResult {
		return environment.gamelift.createPlayerSession(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift create-player-session")
				.argument("game-session-id", gameSessionId)
				.argument("player-id", playerId)
				.argument("player-data", playerData)
	}

}


fun AmazonGameLiftFunctions.createPlayerSessions(gameSessionId: String, playerIds: List<String>, init: AmazonGameLiftCreatePlayerSessionsCommand.() -> Unit): com.amazonaws.services.gamelift.model.CreatePlayerSessionsResult {
	return this.block.declare(AmazonGameLiftCreatePlayerSessionsCommand(gameSessionId, playerIds).apply(init)) as com.amazonaws.services.gamelift.model.CreatePlayerSessionsResult
}

@Generated
class AmazonGameLiftCreatePlayerSessionsCommand(val gameSessionId: String, val playerIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.CreatePlayerSessionsRequest, com.amazonaws.services.gamelift.model.CreatePlayerSessionsResult> {

	var playerDataMap: Map<String, String>? = null

	override fun build(): com.amazonaws.services.gamelift.model.CreatePlayerSessionsRequest {
		val input = com.amazonaws.services.gamelift.model.CreatePlayerSessionsRequest()
		input.setGameSessionId(this.gameSessionId)
		input.setPlayerIds(this.playerIds)
		input.setPlayerDataMap(this.playerDataMap)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.CreatePlayerSessionsResult {
	  return com.amazonaws.services.gamelift.model.CreatePlayerSessionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.CreatePlayerSessionsResult {
		return environment.gamelift.createPlayerSessions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift create-player-sessions")
				.argument("game-session-id", gameSessionId)
				.argument("player-ids", playerIds.toString())
				.argument("player-data-map", playerDataMap?.toString())
	}

}


fun AmazonGameLiftFunctions.createVpcPeeringAuthorization(gameLiftAwsAccountId: String, peerVpcId: String, init: AmazonGameLiftCreateVpcPeeringAuthorizationCommand.() -> Unit): com.amazonaws.services.gamelift.model.CreateVpcPeeringAuthorizationResult {
	return this.block.declare(AmazonGameLiftCreateVpcPeeringAuthorizationCommand(gameLiftAwsAccountId, peerVpcId).apply(init)) as com.amazonaws.services.gamelift.model.CreateVpcPeeringAuthorizationResult
}

@Generated
class AmazonGameLiftCreateVpcPeeringAuthorizationCommand(val gameLiftAwsAccountId: String, val peerVpcId: String) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.CreateVpcPeeringAuthorizationRequest, com.amazonaws.services.gamelift.model.CreateVpcPeeringAuthorizationResult> {



	override fun build(): com.amazonaws.services.gamelift.model.CreateVpcPeeringAuthorizationRequest {
		val input = com.amazonaws.services.gamelift.model.CreateVpcPeeringAuthorizationRequest()
		input.setGameLiftAwsAccountId(this.gameLiftAwsAccountId)
		input.setPeerVpcId(this.peerVpcId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.CreateVpcPeeringAuthorizationResult {
	  return com.amazonaws.services.gamelift.model.CreateVpcPeeringAuthorizationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.CreateVpcPeeringAuthorizationResult {
		return environment.gamelift.createVpcPeeringAuthorization(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift create-vpc-peering-authorization")
				.argument("game-lift-aws-account-id", gameLiftAwsAccountId)
				.argument("peer-vpc-id", peerVpcId)
	}

}


fun AmazonGameLiftFunctions.createVpcPeeringConnection(fleetId: String, peerVpcAwsAccountId: String, peerVpcId: String, init: AmazonGameLiftCreateVpcPeeringConnectionCommand.() -> Unit): com.amazonaws.services.gamelift.model.CreateVpcPeeringConnectionResult {
	return this.block.declare(AmazonGameLiftCreateVpcPeeringConnectionCommand(fleetId, peerVpcAwsAccountId, peerVpcId).apply(init)) as com.amazonaws.services.gamelift.model.CreateVpcPeeringConnectionResult
}

@Generated
class AmazonGameLiftCreateVpcPeeringConnectionCommand(val fleetId: String, val peerVpcAwsAccountId: String, val peerVpcId: String) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.CreateVpcPeeringConnectionRequest, com.amazonaws.services.gamelift.model.CreateVpcPeeringConnectionResult> {



	override fun build(): com.amazonaws.services.gamelift.model.CreateVpcPeeringConnectionRequest {
		val input = com.amazonaws.services.gamelift.model.CreateVpcPeeringConnectionRequest()
		input.setFleetId(this.fleetId)
		input.setPeerVpcAwsAccountId(this.peerVpcAwsAccountId)
		input.setPeerVpcId(this.peerVpcId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.CreateVpcPeeringConnectionResult {
	  return com.amazonaws.services.gamelift.model.CreateVpcPeeringConnectionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.CreateVpcPeeringConnectionResult {
		return environment.gamelift.createVpcPeeringConnection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift create-vpc-peering-connection")
				.argument("fleet-id", fleetId)
				.argument("peer-vpc-aws-account-id", peerVpcAwsAccountId)
				.argument("peer-vpc-id", peerVpcId)
	}

}


fun AmazonGameLiftFunctions.deleteAlias(aliasId: String, init: AmazonGameLiftDeleteAliasCommand.() -> Unit): com.amazonaws.services.gamelift.model.DeleteAliasResult {
	return this.block.declare(AmazonGameLiftDeleteAliasCommand(aliasId).apply(init)) as com.amazonaws.services.gamelift.model.DeleteAliasResult
}

@Generated
class AmazonGameLiftDeleteAliasCommand(val aliasId: String) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.DeleteAliasRequest, com.amazonaws.services.gamelift.model.DeleteAliasResult> {



	override fun build(): com.amazonaws.services.gamelift.model.DeleteAliasRequest {
		val input = com.amazonaws.services.gamelift.model.DeleteAliasRequest()
		input.setAliasId(this.aliasId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.DeleteAliasResult {
	  return com.amazonaws.services.gamelift.model.DeleteAliasResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.DeleteAliasResult {
		return environment.gamelift.deleteAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift delete-alias")
				.argument("alias-id", aliasId)
	}

}


fun AmazonGameLiftFunctions.deleteBuild(buildId: String, init: AmazonGameLiftDeleteBuildCommand.() -> Unit): com.amazonaws.services.gamelift.model.DeleteBuildResult {
	return this.block.declare(AmazonGameLiftDeleteBuildCommand(buildId).apply(init)) as com.amazonaws.services.gamelift.model.DeleteBuildResult
}

@Generated
class AmazonGameLiftDeleteBuildCommand(val buildId: String) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.DeleteBuildRequest, com.amazonaws.services.gamelift.model.DeleteBuildResult> {



	override fun build(): com.amazonaws.services.gamelift.model.DeleteBuildRequest {
		val input = com.amazonaws.services.gamelift.model.DeleteBuildRequest()
		input.setBuildId(this.buildId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.DeleteBuildResult {
	  return com.amazonaws.services.gamelift.model.DeleteBuildResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.DeleteBuildResult {
		return environment.gamelift.deleteBuild(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift delete-build")
				.argument("build-id", buildId)
	}

}


fun AmazonGameLiftFunctions.deleteFleet(fleetId: String, init: AmazonGameLiftDeleteFleetCommand.() -> Unit): com.amazonaws.services.gamelift.model.DeleteFleetResult {
	return this.block.declare(AmazonGameLiftDeleteFleetCommand(fleetId).apply(init)) as com.amazonaws.services.gamelift.model.DeleteFleetResult
}

@Generated
class AmazonGameLiftDeleteFleetCommand(val fleetId: String) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.DeleteFleetRequest, com.amazonaws.services.gamelift.model.DeleteFleetResult> {



	override fun build(): com.amazonaws.services.gamelift.model.DeleteFleetRequest {
		val input = com.amazonaws.services.gamelift.model.DeleteFleetRequest()
		input.setFleetId(this.fleetId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.DeleteFleetResult {
	  return com.amazonaws.services.gamelift.model.DeleteFleetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.DeleteFleetResult {
		return environment.gamelift.deleteFleet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift delete-fleet")
				.argument("fleet-id", fleetId)
	}

}


fun AmazonGameLiftFunctions.deleteGameSessionQueue(name: String, init: AmazonGameLiftDeleteGameSessionQueueCommand.() -> Unit): com.amazonaws.services.gamelift.model.DeleteGameSessionQueueResult {
	return this.block.declare(AmazonGameLiftDeleteGameSessionQueueCommand(name).apply(init)) as com.amazonaws.services.gamelift.model.DeleteGameSessionQueueResult
}

@Generated
class AmazonGameLiftDeleteGameSessionQueueCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.DeleteGameSessionQueueRequest, com.amazonaws.services.gamelift.model.DeleteGameSessionQueueResult> {



	override fun build(): com.amazonaws.services.gamelift.model.DeleteGameSessionQueueRequest {
		val input = com.amazonaws.services.gamelift.model.DeleteGameSessionQueueRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.DeleteGameSessionQueueResult {
	  return com.amazonaws.services.gamelift.model.DeleteGameSessionQueueResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.DeleteGameSessionQueueResult {
		return environment.gamelift.deleteGameSessionQueue(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift delete-game-session-queue")
				.argument("name", name)
	}

}


fun AmazonGameLiftFunctions.deleteMatchmakingConfiguration(name: String, init: AmazonGameLiftDeleteMatchmakingConfigurationCommand.() -> Unit): com.amazonaws.services.gamelift.model.DeleteMatchmakingConfigurationResult {
	return this.block.declare(AmazonGameLiftDeleteMatchmakingConfigurationCommand(name).apply(init)) as com.amazonaws.services.gamelift.model.DeleteMatchmakingConfigurationResult
}

@Generated
class AmazonGameLiftDeleteMatchmakingConfigurationCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.DeleteMatchmakingConfigurationRequest, com.amazonaws.services.gamelift.model.DeleteMatchmakingConfigurationResult> {



	override fun build(): com.amazonaws.services.gamelift.model.DeleteMatchmakingConfigurationRequest {
		val input = com.amazonaws.services.gamelift.model.DeleteMatchmakingConfigurationRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.DeleteMatchmakingConfigurationResult {
	  return com.amazonaws.services.gamelift.model.DeleteMatchmakingConfigurationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.DeleteMatchmakingConfigurationResult {
		return environment.gamelift.deleteMatchmakingConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift delete-matchmaking-configuration")
				.argument("name", name)
	}

}


fun AmazonGameLiftFunctions.deleteScalingPolicy(name: String, fleetId: String, init: AmazonGameLiftDeleteScalingPolicyCommand.() -> Unit): com.amazonaws.services.gamelift.model.DeleteScalingPolicyResult {
	return this.block.declare(AmazonGameLiftDeleteScalingPolicyCommand(name, fleetId).apply(init)) as com.amazonaws.services.gamelift.model.DeleteScalingPolicyResult
}

@Generated
class AmazonGameLiftDeleteScalingPolicyCommand(val name: String, val fleetId: String) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.DeleteScalingPolicyRequest, com.amazonaws.services.gamelift.model.DeleteScalingPolicyResult> {



	override fun build(): com.amazonaws.services.gamelift.model.DeleteScalingPolicyRequest {
		val input = com.amazonaws.services.gamelift.model.DeleteScalingPolicyRequest()
		input.setName(this.name)
		input.setFleetId(this.fleetId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.DeleteScalingPolicyResult {
	  return com.amazonaws.services.gamelift.model.DeleteScalingPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.DeleteScalingPolicyResult {
		return environment.gamelift.deleteScalingPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift delete-scaling-policy")
				.argument("name", name)
				.argument("fleet-id", fleetId)
	}

}


fun AmazonGameLiftFunctions.deleteVpcPeeringAuthorization(gameLiftAwsAccountId: String, peerVpcId: String, init: AmazonGameLiftDeleteVpcPeeringAuthorizationCommand.() -> Unit): com.amazonaws.services.gamelift.model.DeleteVpcPeeringAuthorizationResult {
	return this.block.declare(AmazonGameLiftDeleteVpcPeeringAuthorizationCommand(gameLiftAwsAccountId, peerVpcId).apply(init)) as com.amazonaws.services.gamelift.model.DeleteVpcPeeringAuthorizationResult
}

@Generated
class AmazonGameLiftDeleteVpcPeeringAuthorizationCommand(val gameLiftAwsAccountId: String, val peerVpcId: String) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.DeleteVpcPeeringAuthorizationRequest, com.amazonaws.services.gamelift.model.DeleteVpcPeeringAuthorizationResult> {



	override fun build(): com.amazonaws.services.gamelift.model.DeleteVpcPeeringAuthorizationRequest {
		val input = com.amazonaws.services.gamelift.model.DeleteVpcPeeringAuthorizationRequest()
		input.setGameLiftAwsAccountId(this.gameLiftAwsAccountId)
		input.setPeerVpcId(this.peerVpcId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.DeleteVpcPeeringAuthorizationResult {
	  return com.amazonaws.services.gamelift.model.DeleteVpcPeeringAuthorizationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.DeleteVpcPeeringAuthorizationResult {
		return environment.gamelift.deleteVpcPeeringAuthorization(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift delete-vpc-peering-authorization")
				.argument("game-lift-aws-account-id", gameLiftAwsAccountId)
				.argument("peer-vpc-id", peerVpcId)
	}

}


fun AmazonGameLiftFunctions.deleteVpcPeeringConnection(fleetId: String, vpcPeeringConnectionId: String, init: AmazonGameLiftDeleteVpcPeeringConnectionCommand.() -> Unit): com.amazonaws.services.gamelift.model.DeleteVpcPeeringConnectionResult {
	return this.block.declare(AmazonGameLiftDeleteVpcPeeringConnectionCommand(fleetId, vpcPeeringConnectionId).apply(init)) as com.amazonaws.services.gamelift.model.DeleteVpcPeeringConnectionResult
}

@Generated
class AmazonGameLiftDeleteVpcPeeringConnectionCommand(val fleetId: String, val vpcPeeringConnectionId: String) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.DeleteVpcPeeringConnectionRequest, com.amazonaws.services.gamelift.model.DeleteVpcPeeringConnectionResult> {



	override fun build(): com.amazonaws.services.gamelift.model.DeleteVpcPeeringConnectionRequest {
		val input = com.amazonaws.services.gamelift.model.DeleteVpcPeeringConnectionRequest()
		input.setFleetId(this.fleetId)
		input.setVpcPeeringConnectionId(this.vpcPeeringConnectionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.DeleteVpcPeeringConnectionResult {
	  return com.amazonaws.services.gamelift.model.DeleteVpcPeeringConnectionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.DeleteVpcPeeringConnectionResult {
		return environment.gamelift.deleteVpcPeeringConnection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift delete-vpc-peering-connection")
				.argument("fleet-id", fleetId)
				.argument("vpc-peering-connection-id", vpcPeeringConnectionId)
	}

}


fun AmazonGameLiftFunctions.describeAlias(aliasId: String, init: AmazonGameLiftDescribeAliasCommand.() -> Unit): com.amazonaws.services.gamelift.model.DescribeAliasResult {
	return this.block.declare(AmazonGameLiftDescribeAliasCommand(aliasId).apply(init)) as com.amazonaws.services.gamelift.model.DescribeAliasResult
}

@Generated
class AmazonGameLiftDescribeAliasCommand(val aliasId: String) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.DescribeAliasRequest, com.amazonaws.services.gamelift.model.DescribeAliasResult> {



	override fun build(): com.amazonaws.services.gamelift.model.DescribeAliasRequest {
		val input = com.amazonaws.services.gamelift.model.DescribeAliasRequest()
		input.setAliasId(this.aliasId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.DescribeAliasResult {
	  return com.amazonaws.services.gamelift.model.DescribeAliasResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.DescribeAliasResult {
		return environment.gamelift.describeAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift describe-alias")
				.argument("alias-id", aliasId)
	}

}


fun AmazonGameLiftFunctions.describeBuild(buildId: String, init: AmazonGameLiftDescribeBuildCommand.() -> Unit): com.amazonaws.services.gamelift.model.DescribeBuildResult {
	return this.block.declare(AmazonGameLiftDescribeBuildCommand(buildId).apply(init)) as com.amazonaws.services.gamelift.model.DescribeBuildResult
}

@Generated
class AmazonGameLiftDescribeBuildCommand(val buildId: String) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.DescribeBuildRequest, com.amazonaws.services.gamelift.model.DescribeBuildResult> {



	override fun build(): com.amazonaws.services.gamelift.model.DescribeBuildRequest {
		val input = com.amazonaws.services.gamelift.model.DescribeBuildRequest()
		input.setBuildId(this.buildId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.DescribeBuildResult {
	  return com.amazonaws.services.gamelift.model.DescribeBuildResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.DescribeBuildResult {
		return environment.gamelift.describeBuild(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift describe-build")
				.argument("build-id", buildId)
	}

}


fun AmazonGameLiftFunctions.describeEC2InstanceLimits(init: AmazonGameLiftDescribeEC2InstanceLimitsCommand.() -> Unit): com.amazonaws.services.gamelift.model.DescribeEC2InstanceLimitsResult {
	return this.block.declare(AmazonGameLiftDescribeEC2InstanceLimitsCommand().apply(init)) as com.amazonaws.services.gamelift.model.DescribeEC2InstanceLimitsResult
}

@Generated
class AmazonGameLiftDescribeEC2InstanceLimitsCommand() : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.DescribeEC2InstanceLimitsRequest, com.amazonaws.services.gamelift.model.DescribeEC2InstanceLimitsResult> {

	var eC2InstanceType: EC2InstanceType? = null

	override fun build(): com.amazonaws.services.gamelift.model.DescribeEC2InstanceLimitsRequest {
		val input = com.amazonaws.services.gamelift.model.DescribeEC2InstanceLimitsRequest()
		input.setEC2InstanceType(this.eC2InstanceType?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.DescribeEC2InstanceLimitsResult {
	  return com.amazonaws.services.gamelift.model.DescribeEC2InstanceLimitsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.DescribeEC2InstanceLimitsResult {
		return environment.gamelift.describeEC2InstanceLimits(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift describe-ec2-instance-limits")
				.argument("ec2-instance-type", eC2InstanceType?.toString())
	}

}


fun AmazonGameLiftFunctions.describeFleetAttributes(init: AmazonGameLiftDescribeFleetAttributesCommand.() -> Unit): com.amazonaws.services.gamelift.model.DescribeFleetAttributesResult {
	return this.block.declare(AmazonGameLiftDescribeFleetAttributesCommand().apply(init)) as com.amazonaws.services.gamelift.model.DescribeFleetAttributesResult
}

@Generated
class AmazonGameLiftDescribeFleetAttributesCommand() : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.DescribeFleetAttributesRequest, com.amazonaws.services.gamelift.model.DescribeFleetAttributesResult> {

	var fleetIds: List<String>? = null
	var limit: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.gamelift.model.DescribeFleetAttributesRequest {
		val input = com.amazonaws.services.gamelift.model.DescribeFleetAttributesRequest()
		input.setFleetIds(this.fleetIds)
		input.setLimit(this.limit)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.DescribeFleetAttributesResult {
	  return com.amazonaws.services.gamelift.model.DescribeFleetAttributesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.DescribeFleetAttributesResult {
		return environment.gamelift.describeFleetAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift describe-fleet-attributes")
				.argument("fleet-ids", fleetIds?.toString())
				.argument("limit", limit?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonGameLiftFunctions.describeFleetCapacity(init: AmazonGameLiftDescribeFleetCapacityCommand.() -> Unit): com.amazonaws.services.gamelift.model.DescribeFleetCapacityResult {
	return this.block.declare(AmazonGameLiftDescribeFleetCapacityCommand().apply(init)) as com.amazonaws.services.gamelift.model.DescribeFleetCapacityResult
}

@Generated
class AmazonGameLiftDescribeFleetCapacityCommand() : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.DescribeFleetCapacityRequest, com.amazonaws.services.gamelift.model.DescribeFleetCapacityResult> {

	var fleetIds: List<String>? = null
	var limit: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.gamelift.model.DescribeFleetCapacityRequest {
		val input = com.amazonaws.services.gamelift.model.DescribeFleetCapacityRequest()
		input.setFleetIds(this.fleetIds)
		input.setLimit(this.limit)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.DescribeFleetCapacityResult {
	  return com.amazonaws.services.gamelift.model.DescribeFleetCapacityResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.DescribeFleetCapacityResult {
		return environment.gamelift.describeFleetCapacity(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift describe-fleet-capacity")
				.argument("fleet-ids", fleetIds?.toString())
				.argument("limit", limit?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonGameLiftFunctions.describeFleetEvents(fleetId: String, init: AmazonGameLiftDescribeFleetEventsCommand.() -> Unit): com.amazonaws.services.gamelift.model.DescribeFleetEventsResult {
	return this.block.declare(AmazonGameLiftDescribeFleetEventsCommand(fleetId).apply(init)) as com.amazonaws.services.gamelift.model.DescribeFleetEventsResult
}

@Generated
class AmazonGameLiftDescribeFleetEventsCommand(val fleetId: String) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.DescribeFleetEventsRequest, com.amazonaws.services.gamelift.model.DescribeFleetEventsResult> {

	var startTime: java.util.Date? = null
	var endTime: java.util.Date? = null
	var limit: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.gamelift.model.DescribeFleetEventsRequest {
		val input = com.amazonaws.services.gamelift.model.DescribeFleetEventsRequest()
		input.setFleetId(this.fleetId)
		input.setStartTime(this.startTime)
		input.setEndTime(this.endTime)
		input.setLimit(this.limit)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.DescribeFleetEventsResult {
	  return com.amazonaws.services.gamelift.model.DescribeFleetEventsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.DescribeFleetEventsResult {
		return environment.gamelift.describeFleetEvents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift describe-fleet-events")
				.argument("fleet-id", fleetId)
				.argument("start-time", startTime?.toString())
				.argument("end-time", endTime?.toString())
				.argument("limit", limit?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonGameLiftFunctions.describeFleetPortSettings(fleetId: String, init: AmazonGameLiftDescribeFleetPortSettingsCommand.() -> Unit): com.amazonaws.services.gamelift.model.DescribeFleetPortSettingsResult {
	return this.block.declare(AmazonGameLiftDescribeFleetPortSettingsCommand(fleetId).apply(init)) as com.amazonaws.services.gamelift.model.DescribeFleetPortSettingsResult
}

@Generated
class AmazonGameLiftDescribeFleetPortSettingsCommand(val fleetId: String) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.DescribeFleetPortSettingsRequest, com.amazonaws.services.gamelift.model.DescribeFleetPortSettingsResult> {



	override fun build(): com.amazonaws.services.gamelift.model.DescribeFleetPortSettingsRequest {
		val input = com.amazonaws.services.gamelift.model.DescribeFleetPortSettingsRequest()
		input.setFleetId(this.fleetId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.DescribeFleetPortSettingsResult {
	  return com.amazonaws.services.gamelift.model.DescribeFleetPortSettingsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.DescribeFleetPortSettingsResult {
		return environment.gamelift.describeFleetPortSettings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift describe-fleet-port-settings")
				.argument("fleet-id", fleetId)
	}

}


fun AmazonGameLiftFunctions.describeFleetUtilization(init: AmazonGameLiftDescribeFleetUtilizationCommand.() -> Unit): com.amazonaws.services.gamelift.model.DescribeFleetUtilizationResult {
	return this.block.declare(AmazonGameLiftDescribeFleetUtilizationCommand().apply(init)) as com.amazonaws.services.gamelift.model.DescribeFleetUtilizationResult
}

@Generated
class AmazonGameLiftDescribeFleetUtilizationCommand() : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.DescribeFleetUtilizationRequest, com.amazonaws.services.gamelift.model.DescribeFleetUtilizationResult> {

	var fleetIds: List<String>? = null
	var limit: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.gamelift.model.DescribeFleetUtilizationRequest {
		val input = com.amazonaws.services.gamelift.model.DescribeFleetUtilizationRequest()
		input.setFleetIds(this.fleetIds)
		input.setLimit(this.limit)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.DescribeFleetUtilizationResult {
	  return com.amazonaws.services.gamelift.model.DescribeFleetUtilizationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.DescribeFleetUtilizationResult {
		return environment.gamelift.describeFleetUtilization(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift describe-fleet-utilization")
				.argument("fleet-ids", fleetIds?.toString())
				.argument("limit", limit?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonGameLiftFunctions.describeGameSessionDetails(init: AmazonGameLiftDescribeGameSessionDetailsCommand.() -> Unit): com.amazonaws.services.gamelift.model.DescribeGameSessionDetailsResult {
	return this.block.declare(AmazonGameLiftDescribeGameSessionDetailsCommand().apply(init)) as com.amazonaws.services.gamelift.model.DescribeGameSessionDetailsResult
}

@Generated
class AmazonGameLiftDescribeGameSessionDetailsCommand() : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.DescribeGameSessionDetailsRequest, com.amazonaws.services.gamelift.model.DescribeGameSessionDetailsResult> {

	var fleetId: String? = null
	var gameSessionId: String? = null
	var aliasId: String? = null
	var statusFilter: String? = null
	var limit: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.gamelift.model.DescribeGameSessionDetailsRequest {
		val input = com.amazonaws.services.gamelift.model.DescribeGameSessionDetailsRequest()
		input.setFleetId(this.fleetId)
		input.setGameSessionId(this.gameSessionId)
		input.setAliasId(this.aliasId)
		input.setStatusFilter(this.statusFilter)
		input.setLimit(this.limit)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.DescribeGameSessionDetailsResult {
	  return com.amazonaws.services.gamelift.model.DescribeGameSessionDetailsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.DescribeGameSessionDetailsResult {
		return environment.gamelift.describeGameSessionDetails(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift describe-game-session-details")
				.argument("fleet-id", fleetId)
				.argument("game-session-id", gameSessionId)
				.argument("alias-id", aliasId)
				.argument("status-filter", statusFilter)
				.argument("limit", limit?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonGameLiftFunctions.describeGameSessionPlacement(placementId: String, init: AmazonGameLiftDescribeGameSessionPlacementCommand.() -> Unit): com.amazonaws.services.gamelift.model.DescribeGameSessionPlacementResult {
	return this.block.declare(AmazonGameLiftDescribeGameSessionPlacementCommand(placementId).apply(init)) as com.amazonaws.services.gamelift.model.DescribeGameSessionPlacementResult
}

@Generated
class AmazonGameLiftDescribeGameSessionPlacementCommand(val placementId: String) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.DescribeGameSessionPlacementRequest, com.amazonaws.services.gamelift.model.DescribeGameSessionPlacementResult> {



	override fun build(): com.amazonaws.services.gamelift.model.DescribeGameSessionPlacementRequest {
		val input = com.amazonaws.services.gamelift.model.DescribeGameSessionPlacementRequest()
		input.setPlacementId(this.placementId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.DescribeGameSessionPlacementResult {
	  return com.amazonaws.services.gamelift.model.DescribeGameSessionPlacementResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.DescribeGameSessionPlacementResult {
		return environment.gamelift.describeGameSessionPlacement(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift describe-game-session-placement")
				.argument("placement-id", placementId)
	}

}


fun AmazonGameLiftFunctions.describeGameSessionQueues(init: AmazonGameLiftDescribeGameSessionQueuesCommand.() -> Unit): com.amazonaws.services.gamelift.model.DescribeGameSessionQueuesResult {
	return this.block.declare(AmazonGameLiftDescribeGameSessionQueuesCommand().apply(init)) as com.amazonaws.services.gamelift.model.DescribeGameSessionQueuesResult
}

@Generated
class AmazonGameLiftDescribeGameSessionQueuesCommand() : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.DescribeGameSessionQueuesRequest, com.amazonaws.services.gamelift.model.DescribeGameSessionQueuesResult> {

	var names: List<String>? = null
	var limit: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.gamelift.model.DescribeGameSessionQueuesRequest {
		val input = com.amazonaws.services.gamelift.model.DescribeGameSessionQueuesRequest()
		input.setNames(this.names)
		input.setLimit(this.limit)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.DescribeGameSessionQueuesResult {
	  return com.amazonaws.services.gamelift.model.DescribeGameSessionQueuesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.DescribeGameSessionQueuesResult {
		return environment.gamelift.describeGameSessionQueues(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift describe-game-session-queues")
				.argument("names", names?.toString())
				.argument("limit", limit?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonGameLiftFunctions.describeGameSessions(init: AmazonGameLiftDescribeGameSessionsCommand.() -> Unit): com.amazonaws.services.gamelift.model.DescribeGameSessionsResult {
	return this.block.declare(AmazonGameLiftDescribeGameSessionsCommand().apply(init)) as com.amazonaws.services.gamelift.model.DescribeGameSessionsResult
}

@Generated
class AmazonGameLiftDescribeGameSessionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.DescribeGameSessionsRequest, com.amazonaws.services.gamelift.model.DescribeGameSessionsResult> {

	var fleetId: String? = null
	var gameSessionId: String? = null
	var aliasId: String? = null
	var statusFilter: String? = null
	var limit: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.gamelift.model.DescribeGameSessionsRequest {
		val input = com.amazonaws.services.gamelift.model.DescribeGameSessionsRequest()
		input.setFleetId(this.fleetId)
		input.setGameSessionId(this.gameSessionId)
		input.setAliasId(this.aliasId)
		input.setStatusFilter(this.statusFilter)
		input.setLimit(this.limit)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.DescribeGameSessionsResult {
	  return com.amazonaws.services.gamelift.model.DescribeGameSessionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.DescribeGameSessionsResult {
		return environment.gamelift.describeGameSessions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift describe-game-sessions")
				.argument("fleet-id", fleetId)
				.argument("game-session-id", gameSessionId)
				.argument("alias-id", aliasId)
				.argument("status-filter", statusFilter)
				.argument("limit", limit?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonGameLiftFunctions.describeInstances(fleetId: String, init: AmazonGameLiftDescribeInstancesCommand.() -> Unit): com.amazonaws.services.gamelift.model.DescribeInstancesResult {
	return this.block.declare(AmazonGameLiftDescribeInstancesCommand(fleetId).apply(init)) as com.amazonaws.services.gamelift.model.DescribeInstancesResult
}

@Generated
class AmazonGameLiftDescribeInstancesCommand(val fleetId: String) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.DescribeInstancesRequest, com.amazonaws.services.gamelift.model.DescribeInstancesResult> {

	var instanceId: String? = null
	var limit: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.gamelift.model.DescribeInstancesRequest {
		val input = com.amazonaws.services.gamelift.model.DescribeInstancesRequest()
		input.setFleetId(this.fleetId)
		input.setInstanceId(this.instanceId)
		input.setLimit(this.limit)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.DescribeInstancesResult {
	  return com.amazonaws.services.gamelift.model.DescribeInstancesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.DescribeInstancesResult {
		return environment.gamelift.describeInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift describe-instances")
				.argument("fleet-id", fleetId)
				.argument("instance-id", instanceId)
				.argument("limit", limit?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonGameLiftFunctions.describeMatchmaking(ticketIds: List<String>, init: AmazonGameLiftDescribeMatchmakingCommand.() -> Unit): com.amazonaws.services.gamelift.model.DescribeMatchmakingResult {
	return this.block.declare(AmazonGameLiftDescribeMatchmakingCommand(ticketIds).apply(init)) as com.amazonaws.services.gamelift.model.DescribeMatchmakingResult
}

@Generated
class AmazonGameLiftDescribeMatchmakingCommand(val ticketIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.DescribeMatchmakingRequest, com.amazonaws.services.gamelift.model.DescribeMatchmakingResult> {



	override fun build(): com.amazonaws.services.gamelift.model.DescribeMatchmakingRequest {
		val input = com.amazonaws.services.gamelift.model.DescribeMatchmakingRequest()
		input.setTicketIds(this.ticketIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.DescribeMatchmakingResult {
	  return com.amazonaws.services.gamelift.model.DescribeMatchmakingResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.DescribeMatchmakingResult {
		return environment.gamelift.describeMatchmaking(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift describe-matchmaking")
				.argument("ticket-ids", ticketIds.toString())
	}

}


fun AmazonGameLiftFunctions.describeMatchmakingConfigurations(init: AmazonGameLiftDescribeMatchmakingConfigurationsCommand.() -> Unit): com.amazonaws.services.gamelift.model.DescribeMatchmakingConfigurationsResult {
	return this.block.declare(AmazonGameLiftDescribeMatchmakingConfigurationsCommand().apply(init)) as com.amazonaws.services.gamelift.model.DescribeMatchmakingConfigurationsResult
}

@Generated
class AmazonGameLiftDescribeMatchmakingConfigurationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.DescribeMatchmakingConfigurationsRequest, com.amazonaws.services.gamelift.model.DescribeMatchmakingConfigurationsResult> {

	var names: List<String>? = null
	var ruleSetName: String? = null
	var limit: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.gamelift.model.DescribeMatchmakingConfigurationsRequest {
		val input = com.amazonaws.services.gamelift.model.DescribeMatchmakingConfigurationsRequest()
		input.setNames(this.names)
		input.setRuleSetName(this.ruleSetName)
		input.setLimit(this.limit)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.DescribeMatchmakingConfigurationsResult {
	  return com.amazonaws.services.gamelift.model.DescribeMatchmakingConfigurationsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.DescribeMatchmakingConfigurationsResult {
		return environment.gamelift.describeMatchmakingConfigurations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift describe-matchmaking-configurations")
				.argument("names", names?.toString())
				.argument("rule-set-name", ruleSetName)
				.argument("limit", limit?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonGameLiftFunctions.describeMatchmakingRuleSets(init: AmazonGameLiftDescribeMatchmakingRuleSetsCommand.() -> Unit): com.amazonaws.services.gamelift.model.DescribeMatchmakingRuleSetsResult {
	return this.block.declare(AmazonGameLiftDescribeMatchmakingRuleSetsCommand().apply(init)) as com.amazonaws.services.gamelift.model.DescribeMatchmakingRuleSetsResult
}

@Generated
class AmazonGameLiftDescribeMatchmakingRuleSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.DescribeMatchmakingRuleSetsRequest, com.amazonaws.services.gamelift.model.DescribeMatchmakingRuleSetsResult> {

	var names: List<String>? = null
	var limit: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.gamelift.model.DescribeMatchmakingRuleSetsRequest {
		val input = com.amazonaws.services.gamelift.model.DescribeMatchmakingRuleSetsRequest()
		input.setNames(this.names)
		input.setLimit(this.limit)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.DescribeMatchmakingRuleSetsResult {
	  return com.amazonaws.services.gamelift.model.DescribeMatchmakingRuleSetsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.DescribeMatchmakingRuleSetsResult {
		return environment.gamelift.describeMatchmakingRuleSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift describe-matchmaking-rule-sets")
				.argument("names", names?.toString())
				.argument("limit", limit?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonGameLiftFunctions.describePlayerSessions(init: AmazonGameLiftDescribePlayerSessionsCommand.() -> Unit): com.amazonaws.services.gamelift.model.DescribePlayerSessionsResult {
	return this.block.declare(AmazonGameLiftDescribePlayerSessionsCommand().apply(init)) as com.amazonaws.services.gamelift.model.DescribePlayerSessionsResult
}

@Generated
class AmazonGameLiftDescribePlayerSessionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.DescribePlayerSessionsRequest, com.amazonaws.services.gamelift.model.DescribePlayerSessionsResult> {

	var gameSessionId: String? = null
	var playerId: String? = null
	var playerSessionId: String? = null
	var playerSessionStatusFilter: String? = null
	var limit: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.gamelift.model.DescribePlayerSessionsRequest {
		val input = com.amazonaws.services.gamelift.model.DescribePlayerSessionsRequest()
		input.setGameSessionId(this.gameSessionId)
		input.setPlayerId(this.playerId)
		input.setPlayerSessionId(this.playerSessionId)
		input.setPlayerSessionStatusFilter(this.playerSessionStatusFilter)
		input.setLimit(this.limit)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.DescribePlayerSessionsResult {
	  return com.amazonaws.services.gamelift.model.DescribePlayerSessionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.DescribePlayerSessionsResult {
		return environment.gamelift.describePlayerSessions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift describe-player-sessions")
				.argument("game-session-id", gameSessionId)
				.argument("player-id", playerId)
				.argument("player-session-id", playerSessionId)
				.argument("player-session-status-filter", playerSessionStatusFilter)
				.argument("limit", limit?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonGameLiftFunctions.describeRuntimeConfiguration(fleetId: String, init: AmazonGameLiftDescribeRuntimeConfigurationCommand.() -> Unit): com.amazonaws.services.gamelift.model.DescribeRuntimeConfigurationResult {
	return this.block.declare(AmazonGameLiftDescribeRuntimeConfigurationCommand(fleetId).apply(init)) as com.amazonaws.services.gamelift.model.DescribeRuntimeConfigurationResult
}

@Generated
class AmazonGameLiftDescribeRuntimeConfigurationCommand(val fleetId: String) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.DescribeRuntimeConfigurationRequest, com.amazonaws.services.gamelift.model.DescribeRuntimeConfigurationResult> {



	override fun build(): com.amazonaws.services.gamelift.model.DescribeRuntimeConfigurationRequest {
		val input = com.amazonaws.services.gamelift.model.DescribeRuntimeConfigurationRequest()
		input.setFleetId(this.fleetId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.DescribeRuntimeConfigurationResult {
	  return com.amazonaws.services.gamelift.model.DescribeRuntimeConfigurationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.DescribeRuntimeConfigurationResult {
		return environment.gamelift.describeRuntimeConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift describe-runtime-configuration")
				.argument("fleet-id", fleetId)
	}

}


fun AmazonGameLiftFunctions.describeScalingPolicies(fleetId: String, init: AmazonGameLiftDescribeScalingPoliciesCommand.() -> Unit): com.amazonaws.services.gamelift.model.DescribeScalingPoliciesResult {
	return this.block.declare(AmazonGameLiftDescribeScalingPoliciesCommand(fleetId).apply(init)) as com.amazonaws.services.gamelift.model.DescribeScalingPoliciesResult
}

@Generated
class AmazonGameLiftDescribeScalingPoliciesCommand(val fleetId: String) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.DescribeScalingPoliciesRequest, com.amazonaws.services.gamelift.model.DescribeScalingPoliciesResult> {

	var statusFilter: ScalingStatusType? = null
	var limit: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.gamelift.model.DescribeScalingPoliciesRequest {
		val input = com.amazonaws.services.gamelift.model.DescribeScalingPoliciesRequest()
		input.setFleetId(this.fleetId)
		input.setStatusFilter(this.statusFilter?.toString())
		input.setLimit(this.limit)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.DescribeScalingPoliciesResult {
	  return com.amazonaws.services.gamelift.model.DescribeScalingPoliciesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.DescribeScalingPoliciesResult {
		return environment.gamelift.describeScalingPolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift describe-scaling-policies")
				.argument("fleet-id", fleetId)
				.argument("status-filter", statusFilter?.toString())
				.argument("limit", limit?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonGameLiftFunctions.describeVpcPeeringAuthorizations(init: AmazonGameLiftDescribeVpcPeeringAuthorizationsCommand.() -> Unit): com.amazonaws.services.gamelift.model.DescribeVpcPeeringAuthorizationsResult {
	return this.block.declare(AmazonGameLiftDescribeVpcPeeringAuthorizationsCommand().apply(init)) as com.amazonaws.services.gamelift.model.DescribeVpcPeeringAuthorizationsResult
}

@Generated
class AmazonGameLiftDescribeVpcPeeringAuthorizationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.DescribeVpcPeeringAuthorizationsRequest, com.amazonaws.services.gamelift.model.DescribeVpcPeeringAuthorizationsResult> {



	override fun build(): com.amazonaws.services.gamelift.model.DescribeVpcPeeringAuthorizationsRequest {
		val input = com.amazonaws.services.gamelift.model.DescribeVpcPeeringAuthorizationsRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.DescribeVpcPeeringAuthorizationsResult {
	  return com.amazonaws.services.gamelift.model.DescribeVpcPeeringAuthorizationsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.DescribeVpcPeeringAuthorizationsResult {
		return environment.gamelift.describeVpcPeeringAuthorizations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift describe-vpc-peering-authorizations")

	}

}


fun AmazonGameLiftFunctions.describeVpcPeeringConnections(init: AmazonGameLiftDescribeVpcPeeringConnectionsCommand.() -> Unit): com.amazonaws.services.gamelift.model.DescribeVpcPeeringConnectionsResult {
	return this.block.declare(AmazonGameLiftDescribeVpcPeeringConnectionsCommand().apply(init)) as com.amazonaws.services.gamelift.model.DescribeVpcPeeringConnectionsResult
}

@Generated
class AmazonGameLiftDescribeVpcPeeringConnectionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.DescribeVpcPeeringConnectionsRequest, com.amazonaws.services.gamelift.model.DescribeVpcPeeringConnectionsResult> {

	var fleetId: String? = null

	override fun build(): com.amazonaws.services.gamelift.model.DescribeVpcPeeringConnectionsRequest {
		val input = com.amazonaws.services.gamelift.model.DescribeVpcPeeringConnectionsRequest()
		input.setFleetId(this.fleetId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.DescribeVpcPeeringConnectionsResult {
	  return com.amazonaws.services.gamelift.model.DescribeVpcPeeringConnectionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.DescribeVpcPeeringConnectionsResult {
		return environment.gamelift.describeVpcPeeringConnections(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift describe-vpc-peering-connections")
				.argument("fleet-id", fleetId)
	}

}


fun AmazonGameLiftFunctions.getGameSessionLogUrl(gameSessionId: String, init: AmazonGameLiftGetGameSessionLogUrlCommand.() -> Unit): com.amazonaws.services.gamelift.model.GetGameSessionLogUrlResult {
	return this.block.declare(AmazonGameLiftGetGameSessionLogUrlCommand(gameSessionId).apply(init)) as com.amazonaws.services.gamelift.model.GetGameSessionLogUrlResult
}

@Generated
class AmazonGameLiftGetGameSessionLogUrlCommand(val gameSessionId: String) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.GetGameSessionLogUrlRequest, com.amazonaws.services.gamelift.model.GetGameSessionLogUrlResult> {



	override fun build(): com.amazonaws.services.gamelift.model.GetGameSessionLogUrlRequest {
		val input = com.amazonaws.services.gamelift.model.GetGameSessionLogUrlRequest()
		input.setGameSessionId(this.gameSessionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.GetGameSessionLogUrlResult {
	  return com.amazonaws.services.gamelift.model.GetGameSessionLogUrlResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.GetGameSessionLogUrlResult {
		return environment.gamelift.getGameSessionLogUrl(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift get-game-session-log-url")
				.argument("game-session-id", gameSessionId)
	}

}


fun AmazonGameLiftFunctions.getInstanceAccess(fleetId: String, instanceId: String, init: AmazonGameLiftGetInstanceAccessCommand.() -> Unit): com.amazonaws.services.gamelift.model.GetInstanceAccessResult {
	return this.block.declare(AmazonGameLiftGetInstanceAccessCommand(fleetId, instanceId).apply(init)) as com.amazonaws.services.gamelift.model.GetInstanceAccessResult
}

@Generated
class AmazonGameLiftGetInstanceAccessCommand(val fleetId: String, val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.GetInstanceAccessRequest, com.amazonaws.services.gamelift.model.GetInstanceAccessResult> {



	override fun build(): com.amazonaws.services.gamelift.model.GetInstanceAccessRequest {
		val input = com.amazonaws.services.gamelift.model.GetInstanceAccessRequest()
		input.setFleetId(this.fleetId)
		input.setInstanceId(this.instanceId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.GetInstanceAccessResult {
	  return com.amazonaws.services.gamelift.model.GetInstanceAccessResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.GetInstanceAccessResult {
		return environment.gamelift.getInstanceAccess(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift get-instance-access")
				.argument("fleet-id", fleetId)
				.argument("instance-id", instanceId)
	}

}


fun AmazonGameLiftFunctions.listAliases(init: AmazonGameLiftListAliasesCommand.() -> Unit): com.amazonaws.services.gamelift.model.ListAliasesResult {
	return this.block.declare(AmazonGameLiftListAliasesCommand().apply(init)) as com.amazonaws.services.gamelift.model.ListAliasesResult
}

@Generated
class AmazonGameLiftListAliasesCommand() : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.ListAliasesRequest, com.amazonaws.services.gamelift.model.ListAliasesResult> {

	var routingStrategyType: RoutingStrategyType? = null
	var name: String? = null
	var limit: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.gamelift.model.ListAliasesRequest {
		val input = com.amazonaws.services.gamelift.model.ListAliasesRequest()
		input.setRoutingStrategyType(this.routingStrategyType?.toString())
		input.setName(this.name)
		input.setLimit(this.limit)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.ListAliasesResult {
	  return com.amazonaws.services.gamelift.model.ListAliasesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.ListAliasesResult {
		return environment.gamelift.listAliases(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift list-aliases")
				.argument("routing-strategy-type", routingStrategyType?.toString())
				.argument("name", name)
				.argument("limit", limit?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonGameLiftFunctions.listBuilds(init: AmazonGameLiftListBuildsCommand.() -> Unit): com.amazonaws.services.gamelift.model.ListBuildsResult {
	return this.block.declare(AmazonGameLiftListBuildsCommand().apply(init)) as com.amazonaws.services.gamelift.model.ListBuildsResult
}

@Generated
class AmazonGameLiftListBuildsCommand() : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.ListBuildsRequest, com.amazonaws.services.gamelift.model.ListBuildsResult> {

	var status: BuildStatus? = null
	var limit: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.gamelift.model.ListBuildsRequest {
		val input = com.amazonaws.services.gamelift.model.ListBuildsRequest()
		input.setStatus(this.status?.toString())
		input.setLimit(this.limit)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.ListBuildsResult {
	  return com.amazonaws.services.gamelift.model.ListBuildsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.ListBuildsResult {
		return environment.gamelift.listBuilds(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift list-builds")
				.argument("status", status?.toString())
				.argument("limit", limit?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonGameLiftFunctions.listFleets(init: AmazonGameLiftListFleetsCommand.() -> Unit): com.amazonaws.services.gamelift.model.ListFleetsResult {
	return this.block.declare(AmazonGameLiftListFleetsCommand().apply(init)) as com.amazonaws.services.gamelift.model.ListFleetsResult
}

@Generated
class AmazonGameLiftListFleetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.ListFleetsRequest, com.amazonaws.services.gamelift.model.ListFleetsResult> {

	var buildId: String? = null
	var limit: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.gamelift.model.ListFleetsRequest {
		val input = com.amazonaws.services.gamelift.model.ListFleetsRequest()
		input.setBuildId(this.buildId)
		input.setLimit(this.limit)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.ListFleetsResult {
	  return com.amazonaws.services.gamelift.model.ListFleetsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.ListFleetsResult {
		return environment.gamelift.listFleets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift list-fleets")
				.argument("build-id", buildId)
				.argument("limit", limit?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonGameLiftFunctions.putScalingPolicy(name: String, fleetId: String, scalingAdjustment: Int, scalingAdjustmentType: ScalingAdjustmentType, threshold: Double, comparisonOperator: ComparisonOperatorType, evaluationPeriods: Int, metricName: MetricName, init: AmazonGameLiftPutScalingPolicyCommand.() -> Unit): com.amazonaws.services.gamelift.model.PutScalingPolicyResult {
	return this.block.declare(AmazonGameLiftPutScalingPolicyCommand(name, fleetId, scalingAdjustment, scalingAdjustmentType, threshold, comparisonOperator, evaluationPeriods, metricName).apply(init)) as com.amazonaws.services.gamelift.model.PutScalingPolicyResult
}

@Generated
class AmazonGameLiftPutScalingPolicyCommand(val name: String, val fleetId: String, val scalingAdjustment: Int, val scalingAdjustmentType: ScalingAdjustmentType, val threshold: Double, val comparisonOperator: ComparisonOperatorType, val evaluationPeriods: Int, val metricName: MetricName) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.PutScalingPolicyRequest, com.amazonaws.services.gamelift.model.PutScalingPolicyResult> {



	override fun build(): com.amazonaws.services.gamelift.model.PutScalingPolicyRequest {
		val input = com.amazonaws.services.gamelift.model.PutScalingPolicyRequest()
		input.setName(this.name)
		input.setFleetId(this.fleetId)
		input.setScalingAdjustment(this.scalingAdjustment)
		input.setScalingAdjustmentType(this.scalingAdjustmentType.toString())
		input.setThreshold(this.threshold)
		input.setComparisonOperator(this.comparisonOperator.toString())
		input.setEvaluationPeriods(this.evaluationPeriods)
		input.setMetricName(this.metricName.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.PutScalingPolicyResult {
	  return com.amazonaws.services.gamelift.model.PutScalingPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.PutScalingPolicyResult {
		return environment.gamelift.putScalingPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift put-scaling-policy")
				.argument("name", name)
				.argument("fleet-id", fleetId)
				.argument("scaling-adjustment", scalingAdjustment.toString())
				.argument("scaling-adjustment-type", scalingAdjustmentType.toString())
				.argument("threshold", threshold.toString())
				.argument("comparison-operator", comparisonOperator.toString())
				.argument("evaluation-periods", evaluationPeriods.toString())
				.argument("metric-name", metricName.toString())
	}

}


fun AmazonGameLiftFunctions.requestUploadCredentials(buildId: String, init: AmazonGameLiftRequestUploadCredentialsCommand.() -> Unit): com.amazonaws.services.gamelift.model.RequestUploadCredentialsResult {
	return this.block.declare(AmazonGameLiftRequestUploadCredentialsCommand(buildId).apply(init)) as com.amazonaws.services.gamelift.model.RequestUploadCredentialsResult
}

@Generated
class AmazonGameLiftRequestUploadCredentialsCommand(val buildId: String) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.RequestUploadCredentialsRequest, com.amazonaws.services.gamelift.model.RequestUploadCredentialsResult> {



	override fun build(): com.amazonaws.services.gamelift.model.RequestUploadCredentialsRequest {
		val input = com.amazonaws.services.gamelift.model.RequestUploadCredentialsRequest()
		input.setBuildId(this.buildId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.RequestUploadCredentialsResult {
	  return com.amazonaws.services.gamelift.model.RequestUploadCredentialsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.RequestUploadCredentialsResult {
		return environment.gamelift.requestUploadCredentials(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift request-upload-credentials")
				.argument("build-id", buildId)
	}

}


fun AmazonGameLiftFunctions.resolveAlias(aliasId: String, init: AmazonGameLiftResolveAliasCommand.() -> Unit): com.amazonaws.services.gamelift.model.ResolveAliasResult {
	return this.block.declare(AmazonGameLiftResolveAliasCommand(aliasId).apply(init)) as com.amazonaws.services.gamelift.model.ResolveAliasResult
}

@Generated
class AmazonGameLiftResolveAliasCommand(val aliasId: String) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.ResolveAliasRequest, com.amazonaws.services.gamelift.model.ResolveAliasResult> {



	override fun build(): com.amazonaws.services.gamelift.model.ResolveAliasRequest {
		val input = com.amazonaws.services.gamelift.model.ResolveAliasRequest()
		input.setAliasId(this.aliasId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.ResolveAliasResult {
	  return com.amazonaws.services.gamelift.model.ResolveAliasResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.ResolveAliasResult {
		return environment.gamelift.resolveAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift resolve-alias")
				.argument("alias-id", aliasId)
	}

}


fun AmazonGameLiftFunctions.searchGameSessions(init: AmazonGameLiftSearchGameSessionsCommand.() -> Unit): com.amazonaws.services.gamelift.model.SearchGameSessionsResult {
	return this.block.declare(AmazonGameLiftSearchGameSessionsCommand().apply(init)) as com.amazonaws.services.gamelift.model.SearchGameSessionsResult
}

@Generated
class AmazonGameLiftSearchGameSessionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.SearchGameSessionsRequest, com.amazonaws.services.gamelift.model.SearchGameSessionsResult> {

	var fleetId: String? = null
	var aliasId: String? = null
	var filterExpression: String? = null
	var sortExpression: String? = null
	var limit: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.gamelift.model.SearchGameSessionsRequest {
		val input = com.amazonaws.services.gamelift.model.SearchGameSessionsRequest()
		input.setFleetId(this.fleetId)
		input.setAliasId(this.aliasId)
		input.setFilterExpression(this.filterExpression)
		input.setSortExpression(this.sortExpression)
		input.setLimit(this.limit)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.SearchGameSessionsResult {
	  return com.amazonaws.services.gamelift.model.SearchGameSessionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.SearchGameSessionsResult {
		return environment.gamelift.searchGameSessions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift search-game-sessions")
				.argument("fleet-id", fleetId)
				.argument("alias-id", aliasId)
				.argument("filter-expression", filterExpression)
				.argument("sort-expression", sortExpression)
				.argument("limit", limit?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonGameLiftFunctions.startGameSessionPlacement(placementId: String, gameSessionQueueName: String, maximumPlayerSessionCount: Int, init: AmazonGameLiftStartGameSessionPlacementCommand.() -> Unit): com.amazonaws.services.gamelift.model.StartGameSessionPlacementResult {
	return this.block.declare(AmazonGameLiftStartGameSessionPlacementCommand(placementId, gameSessionQueueName, maximumPlayerSessionCount).apply(init)) as com.amazonaws.services.gamelift.model.StartGameSessionPlacementResult
}

@Generated
class AmazonGameLiftStartGameSessionPlacementCommand(val placementId: String, val gameSessionQueueName: String, val maximumPlayerSessionCount: Int) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.StartGameSessionPlacementRequest, com.amazonaws.services.gamelift.model.StartGameSessionPlacementResult> {

	var gameProperties: List<com.amazonaws.services.gamelift.model.GameProperty>? = null
	var gameSessionName: String? = null
	var playerLatencies: List<com.amazonaws.services.gamelift.model.PlayerLatency>? = null
	var desiredPlayerSessions: List<com.amazonaws.services.gamelift.model.DesiredPlayerSession>? = null
	var gameSessionData: String? = null

	override fun build(): com.amazonaws.services.gamelift.model.StartGameSessionPlacementRequest {
		val input = com.amazonaws.services.gamelift.model.StartGameSessionPlacementRequest()
		input.setPlacementId(this.placementId)
		input.setGameSessionQueueName(this.gameSessionQueueName)
		input.setGameProperties(this.gameProperties)
		input.setMaximumPlayerSessionCount(this.maximumPlayerSessionCount)
		input.setGameSessionName(this.gameSessionName)
		input.setPlayerLatencies(this.playerLatencies)
		input.setDesiredPlayerSessions(this.desiredPlayerSessions)
		input.setGameSessionData(this.gameSessionData)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.StartGameSessionPlacementResult {
	  return com.amazonaws.services.gamelift.model.StartGameSessionPlacementResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.StartGameSessionPlacementResult {
		return environment.gamelift.startGameSessionPlacement(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift start-game-session-placement")
				.argument("placement-id", placementId)
				.argument("game-session-queue-name", gameSessionQueueName)
				.argument("game-properties", gameProperties?.toString())
				.argument("maximum-player-session-count", maximumPlayerSessionCount.toString())
				.argument("game-session-name", gameSessionName)
				.argument("player-latencies", playerLatencies?.toString())
				.argument("desired-player-sessions", desiredPlayerSessions?.toString())
				.argument("game-session-data", gameSessionData)
	}

}


fun AmazonGameLiftFunctions.startMatchBackfill(configurationName: String, gameSessionArn: String, players: List<com.amazonaws.services.gamelift.model.Player>, init: AmazonGameLiftStartMatchBackfillCommand.() -> Unit): com.amazonaws.services.gamelift.model.StartMatchBackfillResult {
	return this.block.declare(AmazonGameLiftStartMatchBackfillCommand(configurationName, gameSessionArn, players).apply(init)) as com.amazonaws.services.gamelift.model.StartMatchBackfillResult
}

@Generated
class AmazonGameLiftStartMatchBackfillCommand(val configurationName: String, val gameSessionArn: String, val players: List<com.amazonaws.services.gamelift.model.Player>) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.StartMatchBackfillRequest, com.amazonaws.services.gamelift.model.StartMatchBackfillResult> {

	var ticketId: String? = null

	override fun build(): com.amazonaws.services.gamelift.model.StartMatchBackfillRequest {
		val input = com.amazonaws.services.gamelift.model.StartMatchBackfillRequest()
		input.setTicketId(this.ticketId)
		input.setConfigurationName(this.configurationName)
		input.setGameSessionArn(this.gameSessionArn)
		input.setPlayers(this.players)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.StartMatchBackfillResult {
	  return com.amazonaws.services.gamelift.model.StartMatchBackfillResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.StartMatchBackfillResult {
		return environment.gamelift.startMatchBackfill(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift start-match-backfill")
				.argument("ticket-id", ticketId)
				.argument("configuration-name", configurationName)
				.argument("game-session-arn", gameSessionArn)
				.argument("players", players.toString())
	}

}


fun AmazonGameLiftFunctions.startMatchmaking(configurationName: String, players: List<com.amazonaws.services.gamelift.model.Player>, init: AmazonGameLiftStartMatchmakingCommand.() -> Unit): com.amazonaws.services.gamelift.model.StartMatchmakingResult {
	return this.block.declare(AmazonGameLiftStartMatchmakingCommand(configurationName, players).apply(init)) as com.amazonaws.services.gamelift.model.StartMatchmakingResult
}

@Generated
class AmazonGameLiftStartMatchmakingCommand(val configurationName: String, val players: List<com.amazonaws.services.gamelift.model.Player>) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.StartMatchmakingRequest, com.amazonaws.services.gamelift.model.StartMatchmakingResult> {

	var ticketId: String? = null

	override fun build(): com.amazonaws.services.gamelift.model.StartMatchmakingRequest {
		val input = com.amazonaws.services.gamelift.model.StartMatchmakingRequest()
		input.setTicketId(this.ticketId)
		input.setConfigurationName(this.configurationName)
		input.setPlayers(this.players)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.StartMatchmakingResult {
	  return com.amazonaws.services.gamelift.model.StartMatchmakingResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.StartMatchmakingResult {
		return environment.gamelift.startMatchmaking(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift start-matchmaking")
				.argument("ticket-id", ticketId)
				.argument("configuration-name", configurationName)
				.argument("players", players.toString())
	}

}


fun AmazonGameLiftFunctions.stopGameSessionPlacement(placementId: String, init: AmazonGameLiftStopGameSessionPlacementCommand.() -> Unit): com.amazonaws.services.gamelift.model.StopGameSessionPlacementResult {
	return this.block.declare(AmazonGameLiftStopGameSessionPlacementCommand(placementId).apply(init)) as com.amazonaws.services.gamelift.model.StopGameSessionPlacementResult
}

@Generated
class AmazonGameLiftStopGameSessionPlacementCommand(val placementId: String) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.StopGameSessionPlacementRequest, com.amazonaws.services.gamelift.model.StopGameSessionPlacementResult> {



	override fun build(): com.amazonaws.services.gamelift.model.StopGameSessionPlacementRequest {
		val input = com.amazonaws.services.gamelift.model.StopGameSessionPlacementRequest()
		input.setPlacementId(this.placementId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.StopGameSessionPlacementResult {
	  return com.amazonaws.services.gamelift.model.StopGameSessionPlacementResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.StopGameSessionPlacementResult {
		return environment.gamelift.stopGameSessionPlacement(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift stop-game-session-placement")
				.argument("placement-id", placementId)
	}

}


fun AmazonGameLiftFunctions.stopMatchmaking(ticketId: String, init: AmazonGameLiftStopMatchmakingCommand.() -> Unit): com.amazonaws.services.gamelift.model.StopMatchmakingResult {
	return this.block.declare(AmazonGameLiftStopMatchmakingCommand(ticketId).apply(init)) as com.amazonaws.services.gamelift.model.StopMatchmakingResult
}

@Generated
class AmazonGameLiftStopMatchmakingCommand(val ticketId: String) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.StopMatchmakingRequest, com.amazonaws.services.gamelift.model.StopMatchmakingResult> {



	override fun build(): com.amazonaws.services.gamelift.model.StopMatchmakingRequest {
		val input = com.amazonaws.services.gamelift.model.StopMatchmakingRequest()
		input.setTicketId(this.ticketId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.StopMatchmakingResult {
	  return com.amazonaws.services.gamelift.model.StopMatchmakingResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.StopMatchmakingResult {
		return environment.gamelift.stopMatchmaking(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift stop-matchmaking")
				.argument("ticket-id", ticketId)
	}

}


fun AmazonGameLiftFunctions.updateAlias(aliasId: String, init: AmazonGameLiftUpdateAliasCommand.() -> Unit): com.amazonaws.services.gamelift.model.UpdateAliasResult {
	return this.block.declare(AmazonGameLiftUpdateAliasCommand(aliasId).apply(init)) as com.amazonaws.services.gamelift.model.UpdateAliasResult
}

@Generated
class AmazonGameLiftUpdateAliasCommand(val aliasId: String) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.UpdateAliasRequest, com.amazonaws.services.gamelift.model.UpdateAliasResult> {

	var name: String? = null
	var description: String? = null
	var routingStrategy: com.amazonaws.services.gamelift.model.RoutingStrategy? = null

	override fun build(): com.amazonaws.services.gamelift.model.UpdateAliasRequest {
		val input = com.amazonaws.services.gamelift.model.UpdateAliasRequest()
		input.setAliasId(this.aliasId)
		input.setName(this.name)
		input.setDescription(this.description)
		input.setRoutingStrategy(this.routingStrategy)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.UpdateAliasResult {
	  return com.amazonaws.services.gamelift.model.UpdateAliasResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.UpdateAliasResult {
		return environment.gamelift.updateAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift update-alias")
				.argument("alias-id", aliasId)
				.argument("name", name)
				.argument("description", description)
				.argument("routing-strategy", routingStrategy?.toString())
	}

}


fun AmazonGameLiftFunctions.updateBuild(buildId: String, init: AmazonGameLiftUpdateBuildCommand.() -> Unit): com.amazonaws.services.gamelift.model.UpdateBuildResult {
	return this.block.declare(AmazonGameLiftUpdateBuildCommand(buildId).apply(init)) as com.amazonaws.services.gamelift.model.UpdateBuildResult
}

@Generated
class AmazonGameLiftUpdateBuildCommand(val buildId: String) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.UpdateBuildRequest, com.amazonaws.services.gamelift.model.UpdateBuildResult> {

	var name: String? = null
	var version: String? = null

	override fun build(): com.amazonaws.services.gamelift.model.UpdateBuildRequest {
		val input = com.amazonaws.services.gamelift.model.UpdateBuildRequest()
		input.setBuildId(this.buildId)
		input.setName(this.name)
		input.setVersion(this.version)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.UpdateBuildResult {
	  return com.amazonaws.services.gamelift.model.UpdateBuildResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.UpdateBuildResult {
		return environment.gamelift.updateBuild(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift update-build")
				.argument("build-id", buildId)
				.argument("name", name)
				.argument("version", version)
	}

}


fun AmazonGameLiftFunctions.updateFleetAttributes(fleetId: String, init: AmazonGameLiftUpdateFleetAttributesCommand.() -> Unit): com.amazonaws.services.gamelift.model.UpdateFleetAttributesResult {
	return this.block.declare(AmazonGameLiftUpdateFleetAttributesCommand(fleetId).apply(init)) as com.amazonaws.services.gamelift.model.UpdateFleetAttributesResult
}

@Generated
class AmazonGameLiftUpdateFleetAttributesCommand(val fleetId: String) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.UpdateFleetAttributesRequest, com.amazonaws.services.gamelift.model.UpdateFleetAttributesResult> {

	var name: String? = null
	var description: String? = null
	var newGameSessionProtectionPolicy: ProtectionPolicy? = null
	var resourceCreationLimitPolicy: com.amazonaws.services.gamelift.model.ResourceCreationLimitPolicy? = null
	var metricGroups: List<String>? = null

	override fun build(): com.amazonaws.services.gamelift.model.UpdateFleetAttributesRequest {
		val input = com.amazonaws.services.gamelift.model.UpdateFleetAttributesRequest()
		input.setFleetId(this.fleetId)
		input.setName(this.name)
		input.setDescription(this.description)
		input.setNewGameSessionProtectionPolicy(this.newGameSessionProtectionPolicy?.toString())
		input.setResourceCreationLimitPolicy(this.resourceCreationLimitPolicy)
		input.setMetricGroups(this.metricGroups)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.UpdateFleetAttributesResult {
	  return com.amazonaws.services.gamelift.model.UpdateFleetAttributesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.UpdateFleetAttributesResult {
		return environment.gamelift.updateFleetAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift update-fleet-attributes")
				.argument("fleet-id", fleetId)
				.argument("name", name)
				.argument("description", description)
				.argument("new-game-session-protection-policy", newGameSessionProtectionPolicy?.toString())
				.argument("resource-creation-limit-policy", resourceCreationLimitPolicy?.toString())
				.argument("metric-groups", metricGroups?.toString())
	}

}


fun AmazonGameLiftFunctions.updateFleetCapacity(fleetId: String, init: AmazonGameLiftUpdateFleetCapacityCommand.() -> Unit): com.amazonaws.services.gamelift.model.UpdateFleetCapacityResult {
	return this.block.declare(AmazonGameLiftUpdateFleetCapacityCommand(fleetId).apply(init)) as com.amazonaws.services.gamelift.model.UpdateFleetCapacityResult
}

@Generated
class AmazonGameLiftUpdateFleetCapacityCommand(val fleetId: String) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.UpdateFleetCapacityRequest, com.amazonaws.services.gamelift.model.UpdateFleetCapacityResult> {

	var desiredInstances: Int? = 0
	var minSize: Int? = 0
	var maxSize: Int? = 0

	override fun build(): com.amazonaws.services.gamelift.model.UpdateFleetCapacityRequest {
		val input = com.amazonaws.services.gamelift.model.UpdateFleetCapacityRequest()
		input.setFleetId(this.fleetId)
		input.setDesiredInstances(this.desiredInstances)
		input.setMinSize(this.minSize)
		input.setMaxSize(this.maxSize)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.UpdateFleetCapacityResult {
	  return com.amazonaws.services.gamelift.model.UpdateFleetCapacityResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.UpdateFleetCapacityResult {
		return environment.gamelift.updateFleetCapacity(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift update-fleet-capacity")
				.argument("fleet-id", fleetId)
				.argument("desired-instances", desiredInstances?.toString())
				.argument("min-size", minSize?.toString())
				.argument("max-size", maxSize?.toString())
	}

}


fun AmazonGameLiftFunctions.updateFleetPortSettings(fleetId: String, init: AmazonGameLiftUpdateFleetPortSettingsCommand.() -> Unit): com.amazonaws.services.gamelift.model.UpdateFleetPortSettingsResult {
	return this.block.declare(AmazonGameLiftUpdateFleetPortSettingsCommand(fleetId).apply(init)) as com.amazonaws.services.gamelift.model.UpdateFleetPortSettingsResult
}

@Generated
class AmazonGameLiftUpdateFleetPortSettingsCommand(val fleetId: String) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.UpdateFleetPortSettingsRequest, com.amazonaws.services.gamelift.model.UpdateFleetPortSettingsResult> {

	var inboundPermissionAuthorizations: List<com.amazonaws.services.gamelift.model.IpPermission>? = null
	var inboundPermissionRevocations: List<com.amazonaws.services.gamelift.model.IpPermission>? = null

	override fun build(): com.amazonaws.services.gamelift.model.UpdateFleetPortSettingsRequest {
		val input = com.amazonaws.services.gamelift.model.UpdateFleetPortSettingsRequest()
		input.setFleetId(this.fleetId)
		input.setInboundPermissionAuthorizations(this.inboundPermissionAuthorizations)
		input.setInboundPermissionRevocations(this.inboundPermissionRevocations)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.UpdateFleetPortSettingsResult {
	  return com.amazonaws.services.gamelift.model.UpdateFleetPortSettingsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.UpdateFleetPortSettingsResult {
		return environment.gamelift.updateFleetPortSettings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift update-fleet-port-settings")
				.argument("fleet-id", fleetId)
				.argument("inbound-permission-authorizations", inboundPermissionAuthorizations?.toString())
				.argument("inbound-permission-revocations", inboundPermissionRevocations?.toString())
	}

}


fun AmazonGameLiftFunctions.updateGameSession(gameSessionId: String, init: AmazonGameLiftUpdateGameSessionCommand.() -> Unit): com.amazonaws.services.gamelift.model.UpdateGameSessionResult {
	return this.block.declare(AmazonGameLiftUpdateGameSessionCommand(gameSessionId).apply(init)) as com.amazonaws.services.gamelift.model.UpdateGameSessionResult
}

@Generated
class AmazonGameLiftUpdateGameSessionCommand(val gameSessionId: String) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.UpdateGameSessionRequest, com.amazonaws.services.gamelift.model.UpdateGameSessionResult> {

	var maximumPlayerSessionCount: Int? = 0
	var name: String? = null
	var playerSessionCreationPolicy: PlayerSessionCreationPolicy? = null
	var protectionPolicy: ProtectionPolicy? = null

	override fun build(): com.amazonaws.services.gamelift.model.UpdateGameSessionRequest {
		val input = com.amazonaws.services.gamelift.model.UpdateGameSessionRequest()
		input.setGameSessionId(this.gameSessionId)
		input.setMaximumPlayerSessionCount(this.maximumPlayerSessionCount)
		input.setName(this.name)
		input.setPlayerSessionCreationPolicy(this.playerSessionCreationPolicy?.toString())
		input.setProtectionPolicy(this.protectionPolicy?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.UpdateGameSessionResult {
	  return com.amazonaws.services.gamelift.model.UpdateGameSessionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.UpdateGameSessionResult {
		return environment.gamelift.updateGameSession(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift update-game-session")
				.argument("game-session-id", gameSessionId)
				.argument("maximum-player-session-count", maximumPlayerSessionCount?.toString())
				.argument("name", name)
				.argument("player-session-creation-policy", playerSessionCreationPolicy?.toString())
				.argument("protection-policy", protectionPolicy?.toString())
	}

}


fun AmazonGameLiftFunctions.updateGameSessionQueue(name: String, init: AmazonGameLiftUpdateGameSessionQueueCommand.() -> Unit): com.amazonaws.services.gamelift.model.UpdateGameSessionQueueResult {
	return this.block.declare(AmazonGameLiftUpdateGameSessionQueueCommand(name).apply(init)) as com.amazonaws.services.gamelift.model.UpdateGameSessionQueueResult
}

@Generated
class AmazonGameLiftUpdateGameSessionQueueCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.UpdateGameSessionQueueRequest, com.amazonaws.services.gamelift.model.UpdateGameSessionQueueResult> {

	var timeoutInSeconds: Int? = 0
	var playerLatencyPolicies: List<com.amazonaws.services.gamelift.model.PlayerLatencyPolicy>? = null
	var destinations: List<com.amazonaws.services.gamelift.model.GameSessionQueueDestination>? = null

	override fun build(): com.amazonaws.services.gamelift.model.UpdateGameSessionQueueRequest {
		val input = com.amazonaws.services.gamelift.model.UpdateGameSessionQueueRequest()
		input.setName(this.name)
		input.setTimeoutInSeconds(this.timeoutInSeconds)
		input.setPlayerLatencyPolicies(this.playerLatencyPolicies)
		input.setDestinations(this.destinations)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.UpdateGameSessionQueueResult {
	  return com.amazonaws.services.gamelift.model.UpdateGameSessionQueueResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.UpdateGameSessionQueueResult {
		return environment.gamelift.updateGameSessionQueue(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift update-game-session-queue")
				.argument("name", name)
				.argument("timeout-in-seconds", timeoutInSeconds?.toString())
				.argument("player-latency-policies", playerLatencyPolicies?.toString())
				.argument("destinations", destinations?.toString())
	}

}


fun AmazonGameLiftFunctions.updateMatchmakingConfiguration(name: String, init: AmazonGameLiftUpdateMatchmakingConfigurationCommand.() -> Unit): com.amazonaws.services.gamelift.model.UpdateMatchmakingConfigurationResult {
	return this.block.declare(AmazonGameLiftUpdateMatchmakingConfigurationCommand(name).apply(init)) as com.amazonaws.services.gamelift.model.UpdateMatchmakingConfigurationResult
}

@Generated
class AmazonGameLiftUpdateMatchmakingConfigurationCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.UpdateMatchmakingConfigurationRequest, com.amazonaws.services.gamelift.model.UpdateMatchmakingConfigurationResult> {

	var description: String? = null
	var gameSessionQueueArns: List<String>? = null
	var requestTimeoutSeconds: Int? = 0
	var acceptanceTimeoutSeconds: Int? = 0
	var acceptanceRequired: Boolean? = false
	var ruleSetName: String? = null
	var notificationTarget: String? = null
	var additionalPlayerCount: Int? = 0
	var customEventData: String? = null
	var gameProperties: List<com.amazonaws.services.gamelift.model.GameProperty>? = null
	var gameSessionData: String? = null

	override fun build(): com.amazonaws.services.gamelift.model.UpdateMatchmakingConfigurationRequest {
		val input = com.amazonaws.services.gamelift.model.UpdateMatchmakingConfigurationRequest()
		input.setName(this.name)
		input.setDescription(this.description)
		input.setGameSessionQueueArns(this.gameSessionQueueArns)
		input.setRequestTimeoutSeconds(this.requestTimeoutSeconds)
		input.setAcceptanceTimeoutSeconds(this.acceptanceTimeoutSeconds)
		input.setAcceptanceRequired(this.acceptanceRequired)
		input.setRuleSetName(this.ruleSetName)
		input.setNotificationTarget(this.notificationTarget)
		input.setAdditionalPlayerCount(this.additionalPlayerCount)
		input.setCustomEventData(this.customEventData)
		input.setGameProperties(this.gameProperties)
		input.setGameSessionData(this.gameSessionData)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.UpdateMatchmakingConfigurationResult {
	  return com.amazonaws.services.gamelift.model.UpdateMatchmakingConfigurationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.UpdateMatchmakingConfigurationResult {
		return environment.gamelift.updateMatchmakingConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift update-matchmaking-configuration")
				.argument("name", name)
				.argument("description", description)
				.argument("game-session-queue-arns", gameSessionQueueArns?.toString())
				.argument("request-timeout-seconds", requestTimeoutSeconds?.toString())
				.argument("acceptance-timeout-seconds", acceptanceTimeoutSeconds?.toString())
				.option("acceptance-required", acceptanceRequired ?: false)
				.argument("rule-set-name", ruleSetName)
				.argument("notification-target", notificationTarget)
				.argument("additional-player-count", additionalPlayerCount?.toString())
				.argument("custom-event-data", customEventData)
				.argument("game-properties", gameProperties?.toString())
				.argument("game-session-data", gameSessionData)
	}

}


fun AmazonGameLiftFunctions.updateRuntimeConfiguration(fleetId: String, runtimeConfiguration: com.amazonaws.services.gamelift.model.RuntimeConfiguration, init: AmazonGameLiftUpdateRuntimeConfigurationCommand.() -> Unit): com.amazonaws.services.gamelift.model.UpdateRuntimeConfigurationResult {
	return this.block.declare(AmazonGameLiftUpdateRuntimeConfigurationCommand(fleetId, runtimeConfiguration).apply(init)) as com.amazonaws.services.gamelift.model.UpdateRuntimeConfigurationResult
}

@Generated
class AmazonGameLiftUpdateRuntimeConfigurationCommand(val fleetId: String, val runtimeConfiguration: com.amazonaws.services.gamelift.model.RuntimeConfiguration) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.UpdateRuntimeConfigurationRequest, com.amazonaws.services.gamelift.model.UpdateRuntimeConfigurationResult> {



	override fun build(): com.amazonaws.services.gamelift.model.UpdateRuntimeConfigurationRequest {
		val input = com.amazonaws.services.gamelift.model.UpdateRuntimeConfigurationRequest()
		input.setFleetId(this.fleetId)
		input.setRuntimeConfiguration(this.runtimeConfiguration)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.UpdateRuntimeConfigurationResult {
	  return com.amazonaws.services.gamelift.model.UpdateRuntimeConfigurationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.UpdateRuntimeConfigurationResult {
		return environment.gamelift.updateRuntimeConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift update-runtime-configuration")
				.argument("fleet-id", fleetId)
				.argument("runtime-configuration", runtimeConfiguration.toString())
	}

}


fun AmazonGameLiftFunctions.validateMatchmakingRuleSet(ruleSetBody: String, init: AmazonGameLiftValidateMatchmakingRuleSetCommand.() -> Unit): com.amazonaws.services.gamelift.model.ValidateMatchmakingRuleSetResult {
	return this.block.declare(AmazonGameLiftValidateMatchmakingRuleSetCommand(ruleSetBody).apply(init)) as com.amazonaws.services.gamelift.model.ValidateMatchmakingRuleSetResult
}

@Generated
class AmazonGameLiftValidateMatchmakingRuleSetCommand(val ruleSetBody: String) : AmazonWebServiceCommand<com.amazonaws.services.gamelift.model.ValidateMatchmakingRuleSetRequest, com.amazonaws.services.gamelift.model.ValidateMatchmakingRuleSetResult> {



	override fun build(): com.amazonaws.services.gamelift.model.ValidateMatchmakingRuleSetRequest {
		val input = com.amazonaws.services.gamelift.model.ValidateMatchmakingRuleSetRequest()
		input.setRuleSetBody(this.ruleSetBody)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.gamelift.model.ValidateMatchmakingRuleSetResult {
	  return com.amazonaws.services.gamelift.model.ValidateMatchmakingRuleSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.gamelift.model.ValidateMatchmakingRuleSetResult {
		return environment.gamelift.validateMatchmakingRuleSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws gamelift validate-matchmaking-rule-set")
				.argument("rule-set-body", ruleSetBody)
	}

}
