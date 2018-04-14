
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws.sms

import javax.annotation.Generated
import codingue.koops.core.*
import codingue.koops.aws.*
import com.amazonaws.services.servermigration.*
import com.amazonaws.services.servermigration.model.*

var codingue.koops.core.Environment.sms: AWSServerMigration
	get() {
		var service = this.capabilities["aws-sms"]
		if (service == null) {
			service = AWSServerMigrationClientBuilder.standard().build()
			this.capabilities["aws-sms"] = service
		}
		return service as AWSServerMigration
	}
	set(sms) {
		this.capabilities["aws-sms"] = sms
	}

@Generated
class AWSServerMigrationFunctions(val block: Block)

infix fun <T> AwsContinuation.sms(init: AWSServerMigrationFunctions.() -> T): T {
	return AWSServerMigrationFunctions(shell).run(init)
}

			

fun AWSServerMigrationFunctions.createReplicationJob(init: AWSServerMigrationCreateReplicationJobCommand.() -> Unit): com.amazonaws.services.servermigration.model.CreateReplicationJobResult {
	return this.block.declare(AWSServerMigrationCreateReplicationJobCommand().apply(init)) as com.amazonaws.services.servermigration.model.CreateReplicationJobResult
}

@Generated
class AWSServerMigrationCreateReplicationJobCommand() : AmazonWebServiceCommand<com.amazonaws.services.servermigration.model.CreateReplicationJobRequest, com.amazonaws.services.servermigration.model.CreateReplicationJobResult> {

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

	
	override fun dryResult(): com.amazonaws.services.servermigration.model.CreateReplicationJobResult {
	  return com.amazonaws.services.servermigration.model.CreateReplicationJobResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servermigration.model.CreateReplicationJobResult {
		return environment.sms.createReplicationJob(build())
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


fun AWSServerMigrationFunctions.deleteReplicationJob(init: AWSServerMigrationDeleteReplicationJobCommand.() -> Unit): com.amazonaws.services.servermigration.model.DeleteReplicationJobResult {
	return this.block.declare(AWSServerMigrationDeleteReplicationJobCommand().apply(init)) as com.amazonaws.services.servermigration.model.DeleteReplicationJobResult
}

@Generated
class AWSServerMigrationDeleteReplicationJobCommand() : AmazonWebServiceCommand<com.amazonaws.services.servermigration.model.DeleteReplicationJobRequest, com.amazonaws.services.servermigration.model.DeleteReplicationJobResult> {

	var replicationJobId: String? = null

	override fun build(): com.amazonaws.services.servermigration.model.DeleteReplicationJobRequest {
		val input = com.amazonaws.services.servermigration.model.DeleteReplicationJobRequest()
		input.setReplicationJobId(this.replicationJobId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servermigration.model.DeleteReplicationJobResult {
	  return com.amazonaws.services.servermigration.model.DeleteReplicationJobResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servermigration.model.DeleteReplicationJobResult {
		return environment.sms.deleteReplicationJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sms delete-replication-job")
				.argument("replication-job-id", replicationJobId)
	}

}


fun AWSServerMigrationFunctions.deleteServerCatalog(init: AWSServerMigrationDeleteServerCatalogCommand.() -> Unit): com.amazonaws.services.servermigration.model.DeleteServerCatalogResult {
	return this.block.declare(AWSServerMigrationDeleteServerCatalogCommand().apply(init)) as com.amazonaws.services.servermigration.model.DeleteServerCatalogResult
}

@Generated
class AWSServerMigrationDeleteServerCatalogCommand() : AmazonWebServiceCommand<com.amazonaws.services.servermigration.model.DeleteServerCatalogRequest, com.amazonaws.services.servermigration.model.DeleteServerCatalogResult> {



	override fun build(): com.amazonaws.services.servermigration.model.DeleteServerCatalogRequest {
		val input = com.amazonaws.services.servermigration.model.DeleteServerCatalogRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servermigration.model.DeleteServerCatalogResult {
	  return com.amazonaws.services.servermigration.model.DeleteServerCatalogResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servermigration.model.DeleteServerCatalogResult {
		return environment.sms.deleteServerCatalog(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sms delete-server-catalog")

	}

}


fun AWSServerMigrationFunctions.disassociateConnector(init: AWSServerMigrationDisassociateConnectorCommand.() -> Unit): com.amazonaws.services.servermigration.model.DisassociateConnectorResult {
	return this.block.declare(AWSServerMigrationDisassociateConnectorCommand().apply(init)) as com.amazonaws.services.servermigration.model.DisassociateConnectorResult
}

@Generated
class AWSServerMigrationDisassociateConnectorCommand() : AmazonWebServiceCommand<com.amazonaws.services.servermigration.model.DisassociateConnectorRequest, com.amazonaws.services.servermigration.model.DisassociateConnectorResult> {

	var connectorId: String? = null

	override fun build(): com.amazonaws.services.servermigration.model.DisassociateConnectorRequest {
		val input = com.amazonaws.services.servermigration.model.DisassociateConnectorRequest()
		input.setConnectorId(this.connectorId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servermigration.model.DisassociateConnectorResult {
	  return com.amazonaws.services.servermigration.model.DisassociateConnectorResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servermigration.model.DisassociateConnectorResult {
		return environment.sms.disassociateConnector(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sms disassociate-connector")
				.argument("connector-id", connectorId)
	}

}


fun AWSServerMigrationFunctions.getConnectors(init: AWSServerMigrationGetConnectorsCommand.() -> Unit): com.amazonaws.services.servermigration.model.GetConnectorsResult {
	return this.block.declare(AWSServerMigrationGetConnectorsCommand().apply(init)) as com.amazonaws.services.servermigration.model.GetConnectorsResult
}

@Generated
class AWSServerMigrationGetConnectorsCommand() : AmazonWebServiceCommand<com.amazonaws.services.servermigration.model.GetConnectorsRequest, com.amazonaws.services.servermigration.model.GetConnectorsResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.servermigration.model.GetConnectorsRequest {
		val input = com.amazonaws.services.servermigration.model.GetConnectorsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servermigration.model.GetConnectorsResult {
	  return com.amazonaws.services.servermigration.model.GetConnectorsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servermigration.model.GetConnectorsResult {
		return environment.sms.getConnectors(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sms get-connectors")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSServerMigrationFunctions.getReplicationJobs(init: AWSServerMigrationGetReplicationJobsCommand.() -> Unit): com.amazonaws.services.servermigration.model.GetReplicationJobsResult {
	return this.block.declare(AWSServerMigrationGetReplicationJobsCommand().apply(init)) as com.amazonaws.services.servermigration.model.GetReplicationJobsResult
}

@Generated
class AWSServerMigrationGetReplicationJobsCommand() : AmazonWebServiceCommand<com.amazonaws.services.servermigration.model.GetReplicationJobsRequest, com.amazonaws.services.servermigration.model.GetReplicationJobsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.servermigration.model.GetReplicationJobsResult {
	  return com.amazonaws.services.servermigration.model.GetReplicationJobsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servermigration.model.GetReplicationJobsResult {
		return environment.sms.getReplicationJobs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sms get-replication-jobs")
				.argument("replication-job-id", replicationJobId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSServerMigrationFunctions.getReplicationRuns(init: AWSServerMigrationGetReplicationRunsCommand.() -> Unit): com.amazonaws.services.servermigration.model.GetReplicationRunsResult {
	return this.block.declare(AWSServerMigrationGetReplicationRunsCommand().apply(init)) as com.amazonaws.services.servermigration.model.GetReplicationRunsResult
}

@Generated
class AWSServerMigrationGetReplicationRunsCommand() : AmazonWebServiceCommand<com.amazonaws.services.servermigration.model.GetReplicationRunsRequest, com.amazonaws.services.servermigration.model.GetReplicationRunsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.servermigration.model.GetReplicationRunsResult {
	  return com.amazonaws.services.servermigration.model.GetReplicationRunsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servermigration.model.GetReplicationRunsResult {
		return environment.sms.getReplicationRuns(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sms get-replication-runs")
				.argument("replication-job-id", replicationJobId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSServerMigrationFunctions.getServers(init: AWSServerMigrationGetServersCommand.() -> Unit): com.amazonaws.services.servermigration.model.GetServersResult {
	return this.block.declare(AWSServerMigrationGetServersCommand().apply(init)) as com.amazonaws.services.servermigration.model.GetServersResult
}

@Generated
class AWSServerMigrationGetServersCommand() : AmazonWebServiceCommand<com.amazonaws.services.servermigration.model.GetServersRequest, com.amazonaws.services.servermigration.model.GetServersResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.servermigration.model.GetServersRequest {
		val input = com.amazonaws.services.servermigration.model.GetServersRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servermigration.model.GetServersResult {
	  return com.amazonaws.services.servermigration.model.GetServersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servermigration.model.GetServersResult {
		return environment.sms.getServers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sms get-servers")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSServerMigrationFunctions.importServerCatalog(init: AWSServerMigrationImportServerCatalogCommand.() -> Unit): com.amazonaws.services.servermigration.model.ImportServerCatalogResult {
	return this.block.declare(AWSServerMigrationImportServerCatalogCommand().apply(init)) as com.amazonaws.services.servermigration.model.ImportServerCatalogResult
}

@Generated
class AWSServerMigrationImportServerCatalogCommand() : AmazonWebServiceCommand<com.amazonaws.services.servermigration.model.ImportServerCatalogRequest, com.amazonaws.services.servermigration.model.ImportServerCatalogResult> {



	override fun build(): com.amazonaws.services.servermigration.model.ImportServerCatalogRequest {
		val input = com.amazonaws.services.servermigration.model.ImportServerCatalogRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servermigration.model.ImportServerCatalogResult {
	  return com.amazonaws.services.servermigration.model.ImportServerCatalogResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servermigration.model.ImportServerCatalogResult {
		return environment.sms.importServerCatalog(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sms import-server-catalog")

	}

}


fun AWSServerMigrationFunctions.startOnDemandReplicationRun(init: AWSServerMigrationStartOnDemandReplicationRunCommand.() -> Unit): com.amazonaws.services.servermigration.model.StartOnDemandReplicationRunResult {
	return this.block.declare(AWSServerMigrationStartOnDemandReplicationRunCommand().apply(init)) as com.amazonaws.services.servermigration.model.StartOnDemandReplicationRunResult
}

@Generated
class AWSServerMigrationStartOnDemandReplicationRunCommand() : AmazonWebServiceCommand<com.amazonaws.services.servermigration.model.StartOnDemandReplicationRunRequest, com.amazonaws.services.servermigration.model.StartOnDemandReplicationRunResult> {

	var replicationJobId: String? = null
	var description: String? = null

	override fun build(): com.amazonaws.services.servermigration.model.StartOnDemandReplicationRunRequest {
		val input = com.amazonaws.services.servermigration.model.StartOnDemandReplicationRunRequest()
		input.setReplicationJobId(this.replicationJobId)
		input.setDescription(this.description)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servermigration.model.StartOnDemandReplicationRunResult {
	  return com.amazonaws.services.servermigration.model.StartOnDemandReplicationRunResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servermigration.model.StartOnDemandReplicationRunResult {
		return environment.sms.startOnDemandReplicationRun(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sms start-on-demand-replication-run")
				.argument("replication-job-id", replicationJobId)
				.argument("description", description)
	}

}


fun AWSServerMigrationFunctions.updateReplicationJob(init: AWSServerMigrationUpdateReplicationJobCommand.() -> Unit): com.amazonaws.services.servermigration.model.UpdateReplicationJobResult {
	return this.block.declare(AWSServerMigrationUpdateReplicationJobCommand().apply(init)) as com.amazonaws.services.servermigration.model.UpdateReplicationJobResult
}

@Generated
class AWSServerMigrationUpdateReplicationJobCommand() : AmazonWebServiceCommand<com.amazonaws.services.servermigration.model.UpdateReplicationJobRequest, com.amazonaws.services.servermigration.model.UpdateReplicationJobResult> {

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

	
	override fun dryResult(): com.amazonaws.services.servermigration.model.UpdateReplicationJobResult {
	  return com.amazonaws.services.servermigration.model.UpdateReplicationJobResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servermigration.model.UpdateReplicationJobResult {
		return environment.sms.updateReplicationJob(build())
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
