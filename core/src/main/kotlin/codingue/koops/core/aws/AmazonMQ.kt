
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
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

infix fun AwsContinuation.mq(init: AmazonMQFunctions.() -> Unit) {
	AmazonMQFunctions(shell).apply(init)
}

			

fun AmazonMQFunctions.createBroker(init: AmazonMQCreateBrokerCommand.() -> Unit) {
	this.block.declare(AmazonMQCreateBrokerCommand().apply(init))
}

@Generated
class AmazonMQCreateBrokerCommand() : AmazonWebServiceCommand<com.amazonaws.services.mq.model.CreateBrokerRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mq.createBroker(build())
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


fun AmazonMQFunctions.createConfiguration(init: AmazonMQCreateConfigurationCommand.() -> Unit) {
	this.block.declare(AmazonMQCreateConfigurationCommand().apply(init))
}

@Generated
class AmazonMQCreateConfigurationCommand() : AmazonWebServiceCommand<com.amazonaws.services.mq.model.CreateConfigurationRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mq.createConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mq create-configuration")
				.argument("engine-type", engineType?.toString())
				.argument("engine-version", engineVersion)
				.argument("name", name)
	}

}


fun AmazonMQFunctions.createUser(brokerId: String, username: String, init: AmazonMQCreateUserCommand.() -> Unit) {
	this.block.declare(AmazonMQCreateUserCommand(brokerId, username).apply(init))
}

@Generated
class AmazonMQCreateUserCommand(val brokerId: String, val username: String) : AmazonWebServiceCommand<com.amazonaws.services.mq.model.CreateUserRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mq.createUser(build())
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


fun AmazonMQFunctions.deleteBroker(brokerId: String, init: AmazonMQDeleteBrokerCommand.() -> Unit) {
	this.block.declare(AmazonMQDeleteBrokerCommand(brokerId).apply(init))
}

@Generated
class AmazonMQDeleteBrokerCommand(val brokerId: String) : AmazonWebServiceCommand<com.amazonaws.services.mq.model.DeleteBrokerRequest> {



	override fun build(): com.amazonaws.services.mq.model.DeleteBrokerRequest {
		val input = com.amazonaws.services.mq.model.DeleteBrokerRequest()
		input.setBrokerId(this.brokerId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mq.deleteBroker(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mq delete-broker")
				.argument("broker-id", brokerId)
	}

}


fun AmazonMQFunctions.deleteUser(brokerId: String, username: String, init: AmazonMQDeleteUserCommand.() -> Unit) {
	this.block.declare(AmazonMQDeleteUserCommand(brokerId, username).apply(init))
}

@Generated
class AmazonMQDeleteUserCommand(val brokerId: String, val username: String) : AmazonWebServiceCommand<com.amazonaws.services.mq.model.DeleteUserRequest> {



	override fun build(): com.amazonaws.services.mq.model.DeleteUserRequest {
		val input = com.amazonaws.services.mq.model.DeleteUserRequest()
		input.setBrokerId(this.brokerId)
		input.setUsername(this.username)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mq.deleteUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mq delete-user")
				.argument("broker-id", brokerId)
				.argument("username", username)
	}

}


fun AmazonMQFunctions.describeBroker(brokerId: String, init: AmazonMQDescribeBrokerCommand.() -> Unit) {
	this.block.declare(AmazonMQDescribeBrokerCommand(brokerId).apply(init))
}

@Generated
class AmazonMQDescribeBrokerCommand(val brokerId: String) : AmazonWebServiceCommand<com.amazonaws.services.mq.model.DescribeBrokerRequest> {



	override fun build(): com.amazonaws.services.mq.model.DescribeBrokerRequest {
		val input = com.amazonaws.services.mq.model.DescribeBrokerRequest()
		input.setBrokerId(this.brokerId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mq.describeBroker(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mq describe-broker")
				.argument("broker-id", brokerId)
	}

}


fun AmazonMQFunctions.describeConfiguration(configurationId: String, init: AmazonMQDescribeConfigurationCommand.() -> Unit) {
	this.block.declare(AmazonMQDescribeConfigurationCommand(configurationId).apply(init))
}

@Generated
class AmazonMQDescribeConfigurationCommand(val configurationId: String) : AmazonWebServiceCommand<com.amazonaws.services.mq.model.DescribeConfigurationRequest> {



	override fun build(): com.amazonaws.services.mq.model.DescribeConfigurationRequest {
		val input = com.amazonaws.services.mq.model.DescribeConfigurationRequest()
		input.setConfigurationId(this.configurationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mq.describeConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mq describe-configuration")
				.argument("configuration-id", configurationId)
	}

}


fun AmazonMQFunctions.describeConfigurationRevision(configurationId: String, configurationRevision: String, init: AmazonMQDescribeConfigurationRevisionCommand.() -> Unit) {
	this.block.declare(AmazonMQDescribeConfigurationRevisionCommand(configurationId, configurationRevision).apply(init))
}

@Generated
class AmazonMQDescribeConfigurationRevisionCommand(val configurationId: String, val configurationRevision: String) : AmazonWebServiceCommand<com.amazonaws.services.mq.model.DescribeConfigurationRevisionRequest> {



	override fun build(): com.amazonaws.services.mq.model.DescribeConfigurationRevisionRequest {
		val input = com.amazonaws.services.mq.model.DescribeConfigurationRevisionRequest()
		input.setConfigurationId(this.configurationId)
		input.setConfigurationRevision(this.configurationRevision)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mq.describeConfigurationRevision(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mq describe-configuration-revision")
				.argument("configuration-id", configurationId)
				.argument("configuration-revision", configurationRevision)
	}

}


fun AmazonMQFunctions.describeUser(brokerId: String, username: String, init: AmazonMQDescribeUserCommand.() -> Unit) {
	this.block.declare(AmazonMQDescribeUserCommand(brokerId, username).apply(init))
}

@Generated
class AmazonMQDescribeUserCommand(val brokerId: String, val username: String) : AmazonWebServiceCommand<com.amazonaws.services.mq.model.DescribeUserRequest> {



	override fun build(): com.amazonaws.services.mq.model.DescribeUserRequest {
		val input = com.amazonaws.services.mq.model.DescribeUserRequest()
		input.setBrokerId(this.brokerId)
		input.setUsername(this.username)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mq.describeUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mq describe-user")
				.argument("broker-id", brokerId)
				.argument("username", username)
	}

}


fun AmazonMQFunctions.listBrokers(init: AmazonMQListBrokersCommand.() -> Unit) {
	this.block.declare(AmazonMQListBrokersCommand().apply(init))
}

@Generated
class AmazonMQListBrokersCommand() : AmazonWebServiceCommand<com.amazonaws.services.mq.model.ListBrokersRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.mq.model.ListBrokersRequest {
		val input = com.amazonaws.services.mq.model.ListBrokersRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mq.listBrokers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mq list-brokers")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonMQFunctions.listConfigurationRevisions(configurationId: String, init: AmazonMQListConfigurationRevisionsCommand.() -> Unit) {
	this.block.declare(AmazonMQListConfigurationRevisionsCommand(configurationId).apply(init))
}

@Generated
class AmazonMQListConfigurationRevisionsCommand(val configurationId: String) : AmazonWebServiceCommand<com.amazonaws.services.mq.model.ListConfigurationRevisionsRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.mq.model.ListConfigurationRevisionsRequest {
		val input = com.amazonaws.services.mq.model.ListConfigurationRevisionsRequest()
		input.setConfigurationId(this.configurationId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mq.listConfigurationRevisions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mq list-configuration-revisions")
				.argument("configuration-id", configurationId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonMQFunctions.listConfigurations(init: AmazonMQListConfigurationsCommand.() -> Unit) {
	this.block.declare(AmazonMQListConfigurationsCommand().apply(init))
}

@Generated
class AmazonMQListConfigurationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.mq.model.ListConfigurationsRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.mq.model.ListConfigurationsRequest {
		val input = com.amazonaws.services.mq.model.ListConfigurationsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mq.listConfigurations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mq list-configurations")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonMQFunctions.listUsers(brokerId: String, init: AmazonMQListUsersCommand.() -> Unit) {
	this.block.declare(AmazonMQListUsersCommand(brokerId).apply(init))
}

@Generated
class AmazonMQListUsersCommand(val brokerId: String) : AmazonWebServiceCommand<com.amazonaws.services.mq.model.ListUsersRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.mq.model.ListUsersRequest {
		val input = com.amazonaws.services.mq.model.ListUsersRequest()
		input.setBrokerId(this.brokerId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mq.listUsers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mq list-users")
				.argument("broker-id", brokerId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonMQFunctions.rebootBroker(brokerId: String, init: AmazonMQRebootBrokerCommand.() -> Unit) {
	this.block.declare(AmazonMQRebootBrokerCommand(brokerId).apply(init))
}

@Generated
class AmazonMQRebootBrokerCommand(val brokerId: String) : AmazonWebServiceCommand<com.amazonaws.services.mq.model.RebootBrokerRequest> {



	override fun build(): com.amazonaws.services.mq.model.RebootBrokerRequest {
		val input = com.amazonaws.services.mq.model.RebootBrokerRequest()
		input.setBrokerId(this.brokerId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mq.rebootBroker(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mq reboot-broker")
				.argument("broker-id", brokerId)
	}

}


fun AmazonMQFunctions.updateBroker(brokerId: String, init: AmazonMQUpdateBrokerCommand.() -> Unit) {
	this.block.declare(AmazonMQUpdateBrokerCommand(brokerId).apply(init))
}

@Generated
class AmazonMQUpdateBrokerCommand(val brokerId: String) : AmazonWebServiceCommand<com.amazonaws.services.mq.model.UpdateBrokerRequest> {

	var configuration: com.amazonaws.services.mq.model.ConfigurationId? = null

	override fun build(): com.amazonaws.services.mq.model.UpdateBrokerRequest {
		val input = com.amazonaws.services.mq.model.UpdateBrokerRequest()
		input.setBrokerId(this.brokerId)
		input.setConfiguration(this.configuration)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mq.updateBroker(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mq update-broker")
				.argument("broker-id", brokerId)
				.argument("configuration", configuration?.toString())
	}

}


fun AmazonMQFunctions.updateConfiguration(configurationId: String, init: AmazonMQUpdateConfigurationCommand.() -> Unit) {
	this.block.declare(AmazonMQUpdateConfigurationCommand(configurationId).apply(init))
}

@Generated
class AmazonMQUpdateConfigurationCommand(val configurationId: String) : AmazonWebServiceCommand<com.amazonaws.services.mq.model.UpdateConfigurationRequest> {

	var data: String? = null
	var description: String? = null

	override fun build(): com.amazonaws.services.mq.model.UpdateConfigurationRequest {
		val input = com.amazonaws.services.mq.model.UpdateConfigurationRequest()
		input.setConfigurationId(this.configurationId)
		input.setData(this.data)
		input.setDescription(this.description)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mq.updateConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mq update-configuration")
				.argument("configuration-id", configurationId)
				.argument("data", data)
				.argument("description", description)
	}

}


fun AmazonMQFunctions.updateUser(brokerId: String, username: String, init: AmazonMQUpdateUserCommand.() -> Unit) {
	this.block.declare(AmazonMQUpdateUserCommand(brokerId, username).apply(init))
}

@Generated
class AmazonMQUpdateUserCommand(val brokerId: String, val username: String) : AmazonWebServiceCommand<com.amazonaws.services.mq.model.UpdateUserRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mq.updateUser(build())
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
