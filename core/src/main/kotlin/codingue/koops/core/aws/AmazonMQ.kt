
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceVoidCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.mq.AmazonMQ
import com.amazonaws.services.mq.model.*

var codingue.koops.core.Environment.mq: AmazonMQ
	get() = this.capabilities[AmazonMQ::class.java.name] as AmazonMQ
	set(mq) {
		this.capabilities[AmazonMQ::class.java.name] = mq
	}

@Generated
class AmazonMQFunctions(val block: Block)

infix fun <T> AwsContinuation.mq(init: AmazonMQFunctions.() -> T): T {
	return AmazonMQFunctions(shell).run(init)
}

			

fun AmazonMQFunctions.createBroker(init: AmazonMQCreateBrokerCommand.() -> Unit): com.amazonaws.services.mq.model.CreateBrokerResult {
	return this.block.declare(AmazonMQCreateBrokerCommand().apply(init)) as com.amazonaws.services.mq.model.CreateBrokerResult
}

@Generated
class AmazonMQCreateBrokerCommand() : AmazonWebServiceCommand<com.amazonaws.services.mq.model.CreateBrokerRequest, com.amazonaws.services.mq.model.CreateBrokerResult> {

	var autoMinorVersionUpgrade: Boolean? = false
	var brokerName: String? = null
	var configuration: com.amazonaws.services.mq.model.ConfigurationId? = null
	var creatorRequestId: String? = null
	var deploymentMode: DeploymentMode? = null
	var engineType: EngineType? = null
	var engineVersion: String? = null
	var hostInstanceType: String? = null
	var maintenanceWindowStartTime: com.amazonaws.services.mq.model.WeeklyStartTime? = null
	var publiclyAccessible: Boolean? = false
	var securityGroups: List<String>? = null
	var subnetIds: List<String>? = null
	var users: List<com.amazonaws.services.mq.model.User>? = null

	override fun build(): com.amazonaws.services.mq.model.CreateBrokerRequest {
		val input = com.amazonaws.services.mq.model.CreateBrokerRequest()
		input.setAutoMinorVersionUpgrade(this.autoMinorVersionUpgrade)
		input.setBrokerName(this.brokerName)
		input.setConfiguration(this.configuration)
		input.setCreatorRequestId(this.creatorRequestId)
		input.setDeploymentMode(this.deploymentMode?.toString())
		input.setEngineType(this.engineType?.toString())
		input.setEngineVersion(this.engineVersion)
		input.setHostInstanceType(this.hostInstanceType)
		input.setMaintenanceWindowStartTime(this.maintenanceWindowStartTime)
		input.setPubliclyAccessible(this.publiclyAccessible)
		input.setSecurityGroups(this.securityGroups)
		input.setSubnetIds(this.subnetIds)
		input.setUsers(this.users)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mq.model.CreateBrokerResult {
	  return com.amazonaws.services.mq.model.CreateBrokerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mq.model.CreateBrokerResult {
		return environment.mq.createBroker(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mq create-broker")
				.option("auto-minor-version-upgrade", autoMinorVersionUpgrade ?: false)
				.argument("broker-name", brokerName)
				.argument("configuration", configuration?.toString())
				.argument("creator-request-id", creatorRequestId)
				.argument("deployment-mode", deploymentMode?.toString())
				.argument("engine-type", engineType?.toString())
				.argument("engine-version", engineVersion)
				.argument("host-instance-type", hostInstanceType)
				.argument("maintenance-window-start-time", maintenanceWindowStartTime?.toString())
				.option("publicly-accessible", publiclyAccessible ?: false)
				.argument("security-groups", securityGroups?.toString())
				.argument("subnet-ids", subnetIds?.toString())
				.argument("users", users?.toString())
	}

}


fun AmazonMQFunctions.createConfiguration(init: AmazonMQCreateConfigurationCommand.() -> Unit): com.amazonaws.services.mq.model.CreateConfigurationResult {
	return this.block.declare(AmazonMQCreateConfigurationCommand().apply(init)) as com.amazonaws.services.mq.model.CreateConfigurationResult
}

@Generated
class AmazonMQCreateConfigurationCommand() : AmazonWebServiceCommand<com.amazonaws.services.mq.model.CreateConfigurationRequest, com.amazonaws.services.mq.model.CreateConfigurationResult> {

	var engineType: EngineType? = null
	var engineVersion: String? = null
	var name: String? = null

	override fun build(): com.amazonaws.services.mq.model.CreateConfigurationRequest {
		val input = com.amazonaws.services.mq.model.CreateConfigurationRequest()
		input.setEngineType(this.engineType?.toString())
		input.setEngineVersion(this.engineVersion)
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mq.model.CreateConfigurationResult {
	  return com.amazonaws.services.mq.model.CreateConfigurationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mq.model.CreateConfigurationResult {
		return environment.mq.createConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mq create-configuration")
				.argument("engine-type", engineType?.toString())
				.argument("engine-version", engineVersion)
				.argument("name", name)
	}

}


fun AmazonMQFunctions.createUser(brokerId: String, username: String, init: AmazonMQCreateUserCommand.() -> Unit): com.amazonaws.services.mq.model.CreateUserResult {
	return this.block.declare(AmazonMQCreateUserCommand(brokerId, username).apply(init)) as com.amazonaws.services.mq.model.CreateUserResult
}

@Generated
class AmazonMQCreateUserCommand(val brokerId: String, val username: String) : AmazonWebServiceCommand<com.amazonaws.services.mq.model.CreateUserRequest, com.amazonaws.services.mq.model.CreateUserResult> {

	var consoleAccess: Boolean? = false
	var groups: List<String>? = null
	var password: String? = null

	override fun build(): com.amazonaws.services.mq.model.CreateUserRequest {
		val input = com.amazonaws.services.mq.model.CreateUserRequest()
		input.setBrokerId(this.brokerId)
		input.setConsoleAccess(this.consoleAccess)
		input.setGroups(this.groups)
		input.setPassword(this.password)
		input.setUsername(this.username)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mq.model.CreateUserResult {
	  return com.amazonaws.services.mq.model.CreateUserResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mq.model.CreateUserResult {
		return environment.mq.createUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mq create-user")
				.argument("broker-id", brokerId)
				.option("console-access", consoleAccess ?: false)
				.argument("groups", groups?.toString())
				.argument("password", password)
				.argument("username", username)
	}

}


fun AmazonMQFunctions.deleteBroker(brokerId: String, init: AmazonMQDeleteBrokerCommand.() -> Unit): com.amazonaws.services.mq.model.DeleteBrokerResult {
	return this.block.declare(AmazonMQDeleteBrokerCommand(brokerId).apply(init)) as com.amazonaws.services.mq.model.DeleteBrokerResult
}

@Generated
class AmazonMQDeleteBrokerCommand(val brokerId: String) : AmazonWebServiceCommand<com.amazonaws.services.mq.model.DeleteBrokerRequest, com.amazonaws.services.mq.model.DeleteBrokerResult> {



	override fun build(): com.amazonaws.services.mq.model.DeleteBrokerRequest {
		val input = com.amazonaws.services.mq.model.DeleteBrokerRequest()
		input.setBrokerId(this.brokerId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mq.model.DeleteBrokerResult {
	  return com.amazonaws.services.mq.model.DeleteBrokerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mq.model.DeleteBrokerResult {
		return environment.mq.deleteBroker(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mq delete-broker")
				.argument("broker-id", brokerId)
	}

}


fun AmazonMQFunctions.deleteUser(brokerId: String, username: String, init: AmazonMQDeleteUserCommand.() -> Unit): com.amazonaws.services.mq.model.DeleteUserResult {
	return this.block.declare(AmazonMQDeleteUserCommand(brokerId, username).apply(init)) as com.amazonaws.services.mq.model.DeleteUserResult
}

@Generated
class AmazonMQDeleteUserCommand(val brokerId: String, val username: String) : AmazonWebServiceCommand<com.amazonaws.services.mq.model.DeleteUserRequest, com.amazonaws.services.mq.model.DeleteUserResult> {



	override fun build(): com.amazonaws.services.mq.model.DeleteUserRequest {
		val input = com.amazonaws.services.mq.model.DeleteUserRequest()
		input.setBrokerId(this.brokerId)
		input.setUsername(this.username)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mq.model.DeleteUserResult {
	  return com.amazonaws.services.mq.model.DeleteUserResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mq.model.DeleteUserResult {
		return environment.mq.deleteUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mq delete-user")
				.argument("broker-id", brokerId)
				.argument("username", username)
	}

}


fun AmazonMQFunctions.describeBroker(brokerId: String, init: AmazonMQDescribeBrokerCommand.() -> Unit): com.amazonaws.services.mq.model.DescribeBrokerResult {
	return this.block.declare(AmazonMQDescribeBrokerCommand(brokerId).apply(init)) as com.amazonaws.services.mq.model.DescribeBrokerResult
}

@Generated
class AmazonMQDescribeBrokerCommand(val brokerId: String) : AmazonWebServiceCommand<com.amazonaws.services.mq.model.DescribeBrokerRequest, com.amazonaws.services.mq.model.DescribeBrokerResult> {



	override fun build(): com.amazonaws.services.mq.model.DescribeBrokerRequest {
		val input = com.amazonaws.services.mq.model.DescribeBrokerRequest()
		input.setBrokerId(this.brokerId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mq.model.DescribeBrokerResult {
	  return com.amazonaws.services.mq.model.DescribeBrokerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mq.model.DescribeBrokerResult {
		return environment.mq.describeBroker(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mq describe-broker")
				.argument("broker-id", brokerId)
	}

}


fun AmazonMQFunctions.describeConfiguration(configurationId: String, init: AmazonMQDescribeConfigurationCommand.() -> Unit): com.amazonaws.services.mq.model.DescribeConfigurationResult {
	return this.block.declare(AmazonMQDescribeConfigurationCommand(configurationId).apply(init)) as com.amazonaws.services.mq.model.DescribeConfigurationResult
}

@Generated
class AmazonMQDescribeConfigurationCommand(val configurationId: String) : AmazonWebServiceCommand<com.amazonaws.services.mq.model.DescribeConfigurationRequest, com.amazonaws.services.mq.model.DescribeConfigurationResult> {



	override fun build(): com.amazonaws.services.mq.model.DescribeConfigurationRequest {
		val input = com.amazonaws.services.mq.model.DescribeConfigurationRequest()
		input.setConfigurationId(this.configurationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mq.model.DescribeConfigurationResult {
	  return com.amazonaws.services.mq.model.DescribeConfigurationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mq.model.DescribeConfigurationResult {
		return environment.mq.describeConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mq describe-configuration")
				.argument("configuration-id", configurationId)
	}

}


fun AmazonMQFunctions.describeConfigurationRevision(configurationId: String, configurationRevision: String, init: AmazonMQDescribeConfigurationRevisionCommand.() -> Unit): com.amazonaws.services.mq.model.DescribeConfigurationRevisionResult {
	return this.block.declare(AmazonMQDescribeConfigurationRevisionCommand(configurationId, configurationRevision).apply(init)) as com.amazonaws.services.mq.model.DescribeConfigurationRevisionResult
}

@Generated
class AmazonMQDescribeConfigurationRevisionCommand(val configurationId: String, val configurationRevision: String) : AmazonWebServiceCommand<com.amazonaws.services.mq.model.DescribeConfigurationRevisionRequest, com.amazonaws.services.mq.model.DescribeConfigurationRevisionResult> {



	override fun build(): com.amazonaws.services.mq.model.DescribeConfigurationRevisionRequest {
		val input = com.amazonaws.services.mq.model.DescribeConfigurationRevisionRequest()
		input.setConfigurationId(this.configurationId)
		input.setConfigurationRevision(this.configurationRevision)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mq.model.DescribeConfigurationRevisionResult {
	  return com.amazonaws.services.mq.model.DescribeConfigurationRevisionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mq.model.DescribeConfigurationRevisionResult {
		return environment.mq.describeConfigurationRevision(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mq describe-configuration-revision")
				.argument("configuration-id", configurationId)
				.argument("configuration-revision", configurationRevision)
	}

}


fun AmazonMQFunctions.describeUser(brokerId: String, username: String, init: AmazonMQDescribeUserCommand.() -> Unit): com.amazonaws.services.mq.model.DescribeUserResult {
	return this.block.declare(AmazonMQDescribeUserCommand(brokerId, username).apply(init)) as com.amazonaws.services.mq.model.DescribeUserResult
}

@Generated
class AmazonMQDescribeUserCommand(val brokerId: String, val username: String) : AmazonWebServiceCommand<com.amazonaws.services.mq.model.DescribeUserRequest, com.amazonaws.services.mq.model.DescribeUserResult> {



	override fun build(): com.amazonaws.services.mq.model.DescribeUserRequest {
		val input = com.amazonaws.services.mq.model.DescribeUserRequest()
		input.setBrokerId(this.brokerId)
		input.setUsername(this.username)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mq.model.DescribeUserResult {
	  return com.amazonaws.services.mq.model.DescribeUserResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mq.model.DescribeUserResult {
		return environment.mq.describeUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mq describe-user")
				.argument("broker-id", brokerId)
				.argument("username", username)
	}

}


fun AmazonMQFunctions.listBrokers(init: AmazonMQListBrokersCommand.() -> Unit): com.amazonaws.services.mq.model.ListBrokersResult {
	return this.block.declare(AmazonMQListBrokersCommand().apply(init)) as com.amazonaws.services.mq.model.ListBrokersResult
}

@Generated
class AmazonMQListBrokersCommand() : AmazonWebServiceCommand<com.amazonaws.services.mq.model.ListBrokersRequest, com.amazonaws.services.mq.model.ListBrokersResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.mq.model.ListBrokersRequest {
		val input = com.amazonaws.services.mq.model.ListBrokersRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mq.model.ListBrokersResult {
	  return com.amazonaws.services.mq.model.ListBrokersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mq.model.ListBrokersResult {
		return environment.mq.listBrokers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mq list-brokers")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonMQFunctions.listConfigurationRevisions(configurationId: String, init: AmazonMQListConfigurationRevisionsCommand.() -> Unit): com.amazonaws.services.mq.model.ListConfigurationRevisionsResult {
	return this.block.declare(AmazonMQListConfigurationRevisionsCommand(configurationId).apply(init)) as com.amazonaws.services.mq.model.ListConfigurationRevisionsResult
}

@Generated
class AmazonMQListConfigurationRevisionsCommand(val configurationId: String) : AmazonWebServiceCommand<com.amazonaws.services.mq.model.ListConfigurationRevisionsRequest, com.amazonaws.services.mq.model.ListConfigurationRevisionsResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.mq.model.ListConfigurationRevisionsRequest {
		val input = com.amazonaws.services.mq.model.ListConfigurationRevisionsRequest()
		input.setConfigurationId(this.configurationId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mq.model.ListConfigurationRevisionsResult {
	  return com.amazonaws.services.mq.model.ListConfigurationRevisionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mq.model.ListConfigurationRevisionsResult {
		return environment.mq.listConfigurationRevisions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mq list-configuration-revisions")
				.argument("configuration-id", configurationId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonMQFunctions.listConfigurations(init: AmazonMQListConfigurationsCommand.() -> Unit): com.amazonaws.services.mq.model.ListConfigurationsResult {
	return this.block.declare(AmazonMQListConfigurationsCommand().apply(init)) as com.amazonaws.services.mq.model.ListConfigurationsResult
}

@Generated
class AmazonMQListConfigurationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.mq.model.ListConfigurationsRequest, com.amazonaws.services.mq.model.ListConfigurationsResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.mq.model.ListConfigurationsRequest {
		val input = com.amazonaws.services.mq.model.ListConfigurationsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mq.model.ListConfigurationsResult {
	  return com.amazonaws.services.mq.model.ListConfigurationsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mq.model.ListConfigurationsResult {
		return environment.mq.listConfigurations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mq list-configurations")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonMQFunctions.listUsers(brokerId: String, init: AmazonMQListUsersCommand.() -> Unit): com.amazonaws.services.mq.model.ListUsersResult {
	return this.block.declare(AmazonMQListUsersCommand(brokerId).apply(init)) as com.amazonaws.services.mq.model.ListUsersResult
}

@Generated
class AmazonMQListUsersCommand(val brokerId: String) : AmazonWebServiceCommand<com.amazonaws.services.mq.model.ListUsersRequest, com.amazonaws.services.mq.model.ListUsersResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.mq.model.ListUsersRequest {
		val input = com.amazonaws.services.mq.model.ListUsersRequest()
		input.setBrokerId(this.brokerId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mq.model.ListUsersResult {
	  return com.amazonaws.services.mq.model.ListUsersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mq.model.ListUsersResult {
		return environment.mq.listUsers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mq list-users")
				.argument("broker-id", brokerId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonMQFunctions.rebootBroker(brokerId: String, init: AmazonMQRebootBrokerCommand.() -> Unit): com.amazonaws.services.mq.model.RebootBrokerResult {
	return this.block.declare(AmazonMQRebootBrokerCommand(brokerId).apply(init)) as com.amazonaws.services.mq.model.RebootBrokerResult
}

@Generated
class AmazonMQRebootBrokerCommand(val brokerId: String) : AmazonWebServiceCommand<com.amazonaws.services.mq.model.RebootBrokerRequest, com.amazonaws.services.mq.model.RebootBrokerResult> {



	override fun build(): com.amazonaws.services.mq.model.RebootBrokerRequest {
		val input = com.amazonaws.services.mq.model.RebootBrokerRequest()
		input.setBrokerId(this.brokerId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mq.model.RebootBrokerResult {
	  return com.amazonaws.services.mq.model.RebootBrokerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mq.model.RebootBrokerResult {
		return environment.mq.rebootBroker(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mq reboot-broker")
				.argument("broker-id", brokerId)
	}

}


fun AmazonMQFunctions.updateBroker(brokerId: String, init: AmazonMQUpdateBrokerCommand.() -> Unit): com.amazonaws.services.mq.model.UpdateBrokerResult {
	return this.block.declare(AmazonMQUpdateBrokerCommand(brokerId).apply(init)) as com.amazonaws.services.mq.model.UpdateBrokerResult
}

@Generated
class AmazonMQUpdateBrokerCommand(val brokerId: String) : AmazonWebServiceCommand<com.amazonaws.services.mq.model.UpdateBrokerRequest, com.amazonaws.services.mq.model.UpdateBrokerResult> {

	var configuration: com.amazonaws.services.mq.model.ConfigurationId? = null

	override fun build(): com.amazonaws.services.mq.model.UpdateBrokerRequest {
		val input = com.amazonaws.services.mq.model.UpdateBrokerRequest()
		input.setBrokerId(this.brokerId)
		input.setConfiguration(this.configuration)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mq.model.UpdateBrokerResult {
	  return com.amazonaws.services.mq.model.UpdateBrokerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mq.model.UpdateBrokerResult {
		return environment.mq.updateBroker(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mq update-broker")
				.argument("broker-id", brokerId)
				.argument("configuration", configuration?.toString())
	}

}


fun AmazonMQFunctions.updateConfiguration(configurationId: String, init: AmazonMQUpdateConfigurationCommand.() -> Unit): com.amazonaws.services.mq.model.UpdateConfigurationResult {
	return this.block.declare(AmazonMQUpdateConfigurationCommand(configurationId).apply(init)) as com.amazonaws.services.mq.model.UpdateConfigurationResult
}

@Generated
class AmazonMQUpdateConfigurationCommand(val configurationId: String) : AmazonWebServiceCommand<com.amazonaws.services.mq.model.UpdateConfigurationRequest, com.amazonaws.services.mq.model.UpdateConfigurationResult> {

	var data: String? = null
	var description: String? = null

	override fun build(): com.amazonaws.services.mq.model.UpdateConfigurationRequest {
		val input = com.amazonaws.services.mq.model.UpdateConfigurationRequest()
		input.setConfigurationId(this.configurationId)
		input.setData(this.data)
		input.setDescription(this.description)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mq.model.UpdateConfigurationResult {
	  return com.amazonaws.services.mq.model.UpdateConfigurationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mq.model.UpdateConfigurationResult {
		return environment.mq.updateConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mq update-configuration")
				.argument("configuration-id", configurationId)
				.argument("data", data)
				.argument("description", description)
	}

}


fun AmazonMQFunctions.updateUser(brokerId: String, username: String, init: AmazonMQUpdateUserCommand.() -> Unit): com.amazonaws.services.mq.model.UpdateUserResult {
	return this.block.declare(AmazonMQUpdateUserCommand(brokerId, username).apply(init)) as com.amazonaws.services.mq.model.UpdateUserResult
}

@Generated
class AmazonMQUpdateUserCommand(val brokerId: String, val username: String) : AmazonWebServiceCommand<com.amazonaws.services.mq.model.UpdateUserRequest, com.amazonaws.services.mq.model.UpdateUserResult> {

	var consoleAccess: Boolean? = false
	var groups: List<String>? = null
	var password: String? = null

	override fun build(): com.amazonaws.services.mq.model.UpdateUserRequest {
		val input = com.amazonaws.services.mq.model.UpdateUserRequest()
		input.setBrokerId(this.brokerId)
		input.setConsoleAccess(this.consoleAccess)
		input.setGroups(this.groups)
		input.setPassword(this.password)
		input.setUsername(this.username)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mq.model.UpdateUserResult {
	  return com.amazonaws.services.mq.model.UpdateUserResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mq.model.UpdateUserResult {
		return environment.mq.updateUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mq update-user")
				.argument("broker-id", brokerId)
				.option("console-access", consoleAccess ?: false)
				.argument("groups", groups?.toString())
				.argument("password", password)
				.argument("username", username)
	}

}
