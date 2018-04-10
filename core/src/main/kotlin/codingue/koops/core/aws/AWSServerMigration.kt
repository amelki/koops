
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.servermigration.AWSServerMigration
import com.amazonaws.services.servermigration.model.*

var codingue.koops.core.Environment.sms: AWSServerMigration
	get() = this.capabilities[AWSServerMigration::class.java.name] as AWSServerMigration
	set(sms) {
		this.capabilities[AWSServerMigration::class.java.name] = sms
	}

@Generated
class AWSServerMigrationFunctions(val block: Block)

infix fun AwsContinuation.sms(init: AWSServerMigrationFunctions.() -> Unit) {
	AWSServerMigrationFunctions(shell).apply(init)
}

			

fun AWSServerMigrationFunctions.createReplicationJob(init: AWSServerMigrationCreateReplicationJobCommand.() -> Unit) {
	this.block.declare(AWSServerMigrationCreateReplicationJobCommand().apply(init))
}

@Generated
class AWSServerMigrationCreateReplicationJobCommand() : AmazonWebServiceCommand<com.amazonaws.services.servermigration.model.CreateReplicationJobRequest> {

	var serverId: String? = null
	var seedReplicationTime: java.util.Date? = null
	var frequency: Int? = 0
	var licenseType: LicenseType? = null
	var roleName: String? = null
	var description: String? = null

	override fun build(): com.amazonaws.services.servermigration.model.CreateReplicationJobRequest {
		val input = com.amazonaws.services.servermigration.model.CreateReplicationJobRequest()
		input.setServerId(this.serverId)
		input.setSeedReplicationTime(this.seedReplicationTime)
		input.setFrequency(this.frequency)
		input.setLicenseType(this.licenseType?.toString())
		input.setRoleName(this.roleName)
		input.setDescription(this.description)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sms.createReplicationJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sms create-replication-job")
				.argument("server-id", serverId)
				.argument("seed-replication-time", seedReplicationTime?.toString())
				.argument("frequency", frequency?.toString())
				.argument("license-type", licenseType?.toString())
				.argument("role-name", roleName)
				.argument("description", description)
	}

}


fun AWSServerMigrationFunctions.deleteReplicationJob(init: AWSServerMigrationDeleteReplicationJobCommand.() -> Unit) {
	this.block.declare(AWSServerMigrationDeleteReplicationJobCommand().apply(init))
}

@Generated
class AWSServerMigrationDeleteReplicationJobCommand() : AmazonWebServiceCommand<com.amazonaws.services.servermigration.model.DeleteReplicationJobRequest> {

	var replicationJobId: String? = null

	override fun build(): com.amazonaws.services.servermigration.model.DeleteReplicationJobRequest {
		val input = com.amazonaws.services.servermigration.model.DeleteReplicationJobRequest()
		input.setReplicationJobId(this.replicationJobId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sms.deleteReplicationJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sms delete-replication-job")
				.argument("replication-job-id", replicationJobId)
	}

}


fun AWSServerMigrationFunctions.deleteServerCatalog(init: AWSServerMigrationDeleteServerCatalogCommand.() -> Unit) {
	this.block.declare(AWSServerMigrationDeleteServerCatalogCommand().apply(init))
}

@Generated
class AWSServerMigrationDeleteServerCatalogCommand() : AmazonWebServiceCommand<com.amazonaws.services.servermigration.model.DeleteServerCatalogRequest> {



	override fun build(): com.amazonaws.services.servermigration.model.DeleteServerCatalogRequest {
		val input = com.amazonaws.services.servermigration.model.DeleteServerCatalogRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sms.deleteServerCatalog(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sms delete-server-catalog")

	}

}


fun AWSServerMigrationFunctions.disassociateConnector(init: AWSServerMigrationDisassociateConnectorCommand.() -> Unit) {
	this.block.declare(AWSServerMigrationDisassociateConnectorCommand().apply(init))
}

@Generated
class AWSServerMigrationDisassociateConnectorCommand() : AmazonWebServiceCommand<com.amazonaws.services.servermigration.model.DisassociateConnectorRequest> {

	var connectorId: String? = null

	override fun build(): com.amazonaws.services.servermigration.model.DisassociateConnectorRequest {
		val input = com.amazonaws.services.servermigration.model.DisassociateConnectorRequest()
		input.setConnectorId(this.connectorId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sms.disassociateConnector(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sms disassociate-connector")
				.argument("connector-id", connectorId)
	}

}


fun AWSServerMigrationFunctions.getConnectors(init: AWSServerMigrationGetConnectorsCommand.() -> Unit) {
	this.block.declare(AWSServerMigrationGetConnectorsCommand().apply(init))
}

@Generated
class AWSServerMigrationGetConnectorsCommand() : AmazonWebServiceCommand<com.amazonaws.services.servermigration.model.GetConnectorsRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.servermigration.model.GetConnectorsRequest {
		val input = com.amazonaws.services.servermigration.model.GetConnectorsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sms.getConnectors(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sms get-connectors")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSServerMigrationFunctions.getReplicationJobs(init: AWSServerMigrationGetReplicationJobsCommand.() -> Unit) {
	this.block.declare(AWSServerMigrationGetReplicationJobsCommand().apply(init))
}

@Generated
class AWSServerMigrationGetReplicationJobsCommand() : AmazonWebServiceCommand<com.amazonaws.services.servermigration.model.GetReplicationJobsRequest> {

	var replicationJobId: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.servermigration.model.GetReplicationJobsRequest {
		val input = com.amazonaws.services.servermigration.model.GetReplicationJobsRequest()
		input.setReplicationJobId(this.replicationJobId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sms.getReplicationJobs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sms get-replication-jobs")
				.argument("replication-job-id", replicationJobId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSServerMigrationFunctions.getReplicationRuns(init: AWSServerMigrationGetReplicationRunsCommand.() -> Unit) {
	this.block.declare(AWSServerMigrationGetReplicationRunsCommand().apply(init))
}

@Generated
class AWSServerMigrationGetReplicationRunsCommand() : AmazonWebServiceCommand<com.amazonaws.services.servermigration.model.GetReplicationRunsRequest> {

	var replicationJobId: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.servermigration.model.GetReplicationRunsRequest {
		val input = com.amazonaws.services.servermigration.model.GetReplicationRunsRequest()
		input.setReplicationJobId(this.replicationJobId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sms.getReplicationRuns(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sms get-replication-runs")
				.argument("replication-job-id", replicationJobId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSServerMigrationFunctions.getServers(init: AWSServerMigrationGetServersCommand.() -> Unit) {
	this.block.declare(AWSServerMigrationGetServersCommand().apply(init))
}

@Generated
class AWSServerMigrationGetServersCommand() : AmazonWebServiceCommand<com.amazonaws.services.servermigration.model.GetServersRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.servermigration.model.GetServersRequest {
		val input = com.amazonaws.services.servermigration.model.GetServersRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sms.getServers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sms get-servers")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSServerMigrationFunctions.importServerCatalog(init: AWSServerMigrationImportServerCatalogCommand.() -> Unit) {
	this.block.declare(AWSServerMigrationImportServerCatalogCommand().apply(init))
}

@Generated
class AWSServerMigrationImportServerCatalogCommand() : AmazonWebServiceCommand<com.amazonaws.services.servermigration.model.ImportServerCatalogRequest> {



	override fun build(): com.amazonaws.services.servermigration.model.ImportServerCatalogRequest {
		val input = com.amazonaws.services.servermigration.model.ImportServerCatalogRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sms.importServerCatalog(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sms import-server-catalog")

	}

}


fun AWSServerMigrationFunctions.startOnDemandReplicationRun(init: AWSServerMigrationStartOnDemandReplicationRunCommand.() -> Unit) {
	this.block.declare(AWSServerMigrationStartOnDemandReplicationRunCommand().apply(init))
}

@Generated
class AWSServerMigrationStartOnDemandReplicationRunCommand() : AmazonWebServiceCommand<com.amazonaws.services.servermigration.model.StartOnDemandReplicationRunRequest> {

	var replicationJobId: String? = null
	var description: String? = null

	override fun build(): com.amazonaws.services.servermigration.model.StartOnDemandReplicationRunRequest {
		val input = com.amazonaws.services.servermigration.model.StartOnDemandReplicationRunRequest()
		input.setReplicationJobId(this.replicationJobId)
		input.setDescription(this.description)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sms.startOnDemandReplicationRun(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sms start-on-demand-replication-run")
				.argument("replication-job-id", replicationJobId)
				.argument("description", description)
	}

}


fun AWSServerMigrationFunctions.updateReplicationJob(init: AWSServerMigrationUpdateReplicationJobCommand.() -> Unit) {
	this.block.declare(AWSServerMigrationUpdateReplicationJobCommand().apply(init))
}

@Generated
class AWSServerMigrationUpdateReplicationJobCommand() : AmazonWebServiceCommand<com.amazonaws.services.servermigration.model.UpdateReplicationJobRequest> {

	var replicationJobId: String? = null
	var frequency: Int? = 0
	var nextReplicationRunStartTime: java.util.Date? = null
	var licenseType: LicenseType? = null
	var roleName: String? = null
	var description: String? = null

	override fun build(): com.amazonaws.services.servermigration.model.UpdateReplicationJobRequest {
		val input = com.amazonaws.services.servermigration.model.UpdateReplicationJobRequest()
		input.setReplicationJobId(this.replicationJobId)
		input.setFrequency(this.frequency)
		input.setNextReplicationRunStartTime(this.nextReplicationRunStartTime)
		input.setLicenseType(this.licenseType?.toString())
		input.setRoleName(this.roleName)
		input.setDescription(this.description)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sms.updateReplicationJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sms update-replication-job")
				.argument("replication-job-id", replicationJobId)
				.argument("frequency", frequency?.toString())
				.argument("next-replication-run-start-time", nextReplicationRunStartTime?.toString())
				.argument("license-type", licenseType?.toString())
				.argument("role-name", roleName)
				.argument("description", description)
	}

}
