
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws.glue

import javax.annotation.Generated
import codingue.koops.core.*
import codingue.koops.aws.*
import com.amazonaws.services.glue.*
import com.amazonaws.services.glue.model.*

var codingue.koops.core.Environment.glue: AWSGlue
	get() {
		var service = this.capabilities["aws-glue"]
		if (service == null) {
			service = AWSGlueClientBuilder.standard().build()
			this.capabilities["aws-glue"] = service
		}
		return service as AWSGlue
	}
	set(glue) {
		this.capabilities["aws-glue"] = glue
	}

@Generated
class AWSGlueFunctions(val block: Block)

infix fun <T> AwsContinuation.glue(init: AWSGlueFunctions.() -> T): T {
	return AWSGlueFunctions(shell).run(init)
}

			

fun AWSGlueFunctions.batchCreatePartition(databaseName: String, tableName: String, partitionInputList: List<com.amazonaws.services.glue.model.PartitionInput>, init: AWSGlueBatchCreatePartitionCommand.() -> Unit): com.amazonaws.services.glue.model.BatchCreatePartitionResult {
	return this.block.declare(AWSGlueBatchCreatePartitionCommand(databaseName, tableName, partitionInputList).apply(init)) as com.amazonaws.services.glue.model.BatchCreatePartitionResult
}

@Generated
class AWSGlueBatchCreatePartitionCommand(val databaseName: String, val tableName: String, val partitionInputList: List<com.amazonaws.services.glue.model.PartitionInput>) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.BatchCreatePartitionRequest, com.amazonaws.services.glue.model.BatchCreatePartitionResult> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.BatchCreatePartitionRequest {
		val input = com.amazonaws.services.glue.model.BatchCreatePartitionRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseName(this.databaseName)
		input.setTableName(this.tableName)
		input.setPartitionInputList(this.partitionInputList)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.BatchCreatePartitionResult {
	  return com.amazonaws.services.glue.model.BatchCreatePartitionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.BatchCreatePartitionResult {
		return environment.glue.batchCreatePartition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue batch-create-partition")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("table-name", tableName)
				.argument("partition-input-list", partitionInputList.toString())
	}

}


fun AWSGlueFunctions.batchDeleteConnection(connectionNameList: List<String>, init: AWSGlueBatchDeleteConnectionCommand.() -> Unit): com.amazonaws.services.glue.model.BatchDeleteConnectionResult {
	return this.block.declare(AWSGlueBatchDeleteConnectionCommand(connectionNameList).apply(init)) as com.amazonaws.services.glue.model.BatchDeleteConnectionResult
}

@Generated
class AWSGlueBatchDeleteConnectionCommand(val connectionNameList: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.BatchDeleteConnectionRequest, com.amazonaws.services.glue.model.BatchDeleteConnectionResult> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.BatchDeleteConnectionRequest {
		val input = com.amazonaws.services.glue.model.BatchDeleteConnectionRequest()
		input.setCatalogId(this.catalogId)
		input.setConnectionNameList(this.connectionNameList)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.BatchDeleteConnectionResult {
	  return com.amazonaws.services.glue.model.BatchDeleteConnectionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.BatchDeleteConnectionResult {
		return environment.glue.batchDeleteConnection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue batch-delete-connection")
				.argument("catalog-id", catalogId)
				.argument("connection-name-list", connectionNameList.toString())
	}

}


fun AWSGlueFunctions.batchDeletePartition(databaseName: String, tableName: String, partitionsToDelete: List<com.amazonaws.services.glue.model.PartitionValueList>, init: AWSGlueBatchDeletePartitionCommand.() -> Unit): com.amazonaws.services.glue.model.BatchDeletePartitionResult {
	return this.block.declare(AWSGlueBatchDeletePartitionCommand(databaseName, tableName, partitionsToDelete).apply(init)) as com.amazonaws.services.glue.model.BatchDeletePartitionResult
}

@Generated
class AWSGlueBatchDeletePartitionCommand(val databaseName: String, val tableName: String, val partitionsToDelete: List<com.amazonaws.services.glue.model.PartitionValueList>) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.BatchDeletePartitionRequest, com.amazonaws.services.glue.model.BatchDeletePartitionResult> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.BatchDeletePartitionRequest {
		val input = com.amazonaws.services.glue.model.BatchDeletePartitionRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseName(this.databaseName)
		input.setTableName(this.tableName)
		input.setPartitionsToDelete(this.partitionsToDelete)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.BatchDeletePartitionResult {
	  return com.amazonaws.services.glue.model.BatchDeletePartitionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.BatchDeletePartitionResult {
		return environment.glue.batchDeletePartition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue batch-delete-partition")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("table-name", tableName)
				.argument("partitions-to-delete", partitionsToDelete.toString())
	}

}


fun AWSGlueFunctions.batchDeleteTable(databaseName: String, tablesToDelete: List<String>, init: AWSGlueBatchDeleteTableCommand.() -> Unit): com.amazonaws.services.glue.model.BatchDeleteTableResult {
	return this.block.declare(AWSGlueBatchDeleteTableCommand(databaseName, tablesToDelete).apply(init)) as com.amazonaws.services.glue.model.BatchDeleteTableResult
}

@Generated
class AWSGlueBatchDeleteTableCommand(val databaseName: String, val tablesToDelete: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.BatchDeleteTableRequest, com.amazonaws.services.glue.model.BatchDeleteTableResult> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.BatchDeleteTableRequest {
		val input = com.amazonaws.services.glue.model.BatchDeleteTableRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseName(this.databaseName)
		input.setTablesToDelete(this.tablesToDelete)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.BatchDeleteTableResult {
	  return com.amazonaws.services.glue.model.BatchDeleteTableResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.BatchDeleteTableResult {
		return environment.glue.batchDeleteTable(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue batch-delete-table")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("tables-to-delete", tablesToDelete.toString())
	}

}


fun AWSGlueFunctions.batchDeleteTableVersion(databaseName: String, tableName: String, versionIds: List<String>, init: AWSGlueBatchDeleteTableVersionCommand.() -> Unit): com.amazonaws.services.glue.model.BatchDeleteTableVersionResult {
	return this.block.declare(AWSGlueBatchDeleteTableVersionCommand(databaseName, tableName, versionIds).apply(init)) as com.amazonaws.services.glue.model.BatchDeleteTableVersionResult
}

@Generated
class AWSGlueBatchDeleteTableVersionCommand(val databaseName: String, val tableName: String, val versionIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.BatchDeleteTableVersionRequest, com.amazonaws.services.glue.model.BatchDeleteTableVersionResult> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.BatchDeleteTableVersionRequest {
		val input = com.amazonaws.services.glue.model.BatchDeleteTableVersionRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseName(this.databaseName)
		input.setTableName(this.tableName)
		input.setVersionIds(this.versionIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.BatchDeleteTableVersionResult {
	  return com.amazonaws.services.glue.model.BatchDeleteTableVersionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.BatchDeleteTableVersionResult {
		return environment.glue.batchDeleteTableVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue batch-delete-table-version")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("table-name", tableName)
				.argument("version-ids", versionIds.toString())
	}

}


fun AWSGlueFunctions.batchGetPartition(databaseName: String, tableName: String, partitionsToGet: List<com.amazonaws.services.glue.model.PartitionValueList>, init: AWSGlueBatchGetPartitionCommand.() -> Unit): com.amazonaws.services.glue.model.BatchGetPartitionResult {
	return this.block.declare(AWSGlueBatchGetPartitionCommand(databaseName, tableName, partitionsToGet).apply(init)) as com.amazonaws.services.glue.model.BatchGetPartitionResult
}

@Generated
class AWSGlueBatchGetPartitionCommand(val databaseName: String, val tableName: String, val partitionsToGet: List<com.amazonaws.services.glue.model.PartitionValueList>) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.BatchGetPartitionRequest, com.amazonaws.services.glue.model.BatchGetPartitionResult> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.BatchGetPartitionRequest {
		val input = com.amazonaws.services.glue.model.BatchGetPartitionRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseName(this.databaseName)
		input.setTableName(this.tableName)
		input.setPartitionsToGet(this.partitionsToGet)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.BatchGetPartitionResult {
	  return com.amazonaws.services.glue.model.BatchGetPartitionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.BatchGetPartitionResult {
		return environment.glue.batchGetPartition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue batch-get-partition")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("table-name", tableName)
				.argument("partitions-to-get", partitionsToGet.toString())
	}

}


fun AWSGlueFunctions.batchStopJobRun(jobName: String, jobRunIds: List<String>, init: AWSGlueBatchStopJobRunCommand.() -> Unit): com.amazonaws.services.glue.model.BatchStopJobRunResult {
	return this.block.declare(AWSGlueBatchStopJobRunCommand(jobName, jobRunIds).apply(init)) as com.amazonaws.services.glue.model.BatchStopJobRunResult
}

@Generated
class AWSGlueBatchStopJobRunCommand(val jobName: String, val jobRunIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.BatchStopJobRunRequest, com.amazonaws.services.glue.model.BatchStopJobRunResult> {



	override fun build(): com.amazonaws.services.glue.model.BatchStopJobRunRequest {
		val input = com.amazonaws.services.glue.model.BatchStopJobRunRequest()
		input.setJobName(this.jobName)
		input.setJobRunIds(this.jobRunIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.BatchStopJobRunResult {
	  return com.amazonaws.services.glue.model.BatchStopJobRunResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.BatchStopJobRunResult {
		return environment.glue.batchStopJobRun(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue batch-stop-job-run")
				.argument("job-name", jobName)
				.argument("job-run-ids", jobRunIds.toString())
	}

}


fun AWSGlueFunctions.createClassifier(init: AWSGlueCreateClassifierCommand.() -> Unit): com.amazonaws.services.glue.model.CreateClassifierResult {
	return this.block.declare(AWSGlueCreateClassifierCommand().apply(init)) as com.amazonaws.services.glue.model.CreateClassifierResult
}

@Generated
class AWSGlueCreateClassifierCommand() : AmazonWebServiceCommand<com.amazonaws.services.glue.model.CreateClassifierRequest, com.amazonaws.services.glue.model.CreateClassifierResult> {

	var grokClassifier: com.amazonaws.services.glue.model.CreateGrokClassifierRequest? = null
	var xMLClassifier: com.amazonaws.services.glue.model.CreateXMLClassifierRequest? = null
	var jsonClassifier: com.amazonaws.services.glue.model.CreateJsonClassifierRequest? = null

	override fun build(): com.amazonaws.services.glue.model.CreateClassifierRequest {
		val input = com.amazonaws.services.glue.model.CreateClassifierRequest()
		input.setGrokClassifier(this.grokClassifier)
		input.setXMLClassifier(this.xMLClassifier)
		input.setJsonClassifier(this.jsonClassifier)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.CreateClassifierResult {
	  return com.amazonaws.services.glue.model.CreateClassifierResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.CreateClassifierResult {
		return environment.glue.createClassifier(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue create-classifier")
				.argument("grok-classifier", grokClassifier?.toString())
				.argument("xmlclassifier", xMLClassifier?.toString())
				.argument("json-classifier", jsonClassifier?.toString())
	}

}


fun AWSGlueFunctions.createConnection(connectionInput: com.amazonaws.services.glue.model.ConnectionInput, init: AWSGlueCreateConnectionCommand.() -> Unit): com.amazonaws.services.glue.model.CreateConnectionResult {
	return this.block.declare(AWSGlueCreateConnectionCommand(connectionInput).apply(init)) as com.amazonaws.services.glue.model.CreateConnectionResult
}

@Generated
class AWSGlueCreateConnectionCommand(val connectionInput: com.amazonaws.services.glue.model.ConnectionInput) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.CreateConnectionRequest, com.amazonaws.services.glue.model.CreateConnectionResult> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.CreateConnectionRequest {
		val input = com.amazonaws.services.glue.model.CreateConnectionRequest()
		input.setCatalogId(this.catalogId)
		input.setConnectionInput(this.connectionInput)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.CreateConnectionResult {
	  return com.amazonaws.services.glue.model.CreateConnectionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.CreateConnectionResult {
		return environment.glue.createConnection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue create-connection")
				.argument("catalog-id", catalogId)
				.argument("connection-input", connectionInput.toString())
	}

}


fun AWSGlueFunctions.createCrawler(name: String, role: String, databaseName: String, targets: com.amazonaws.services.glue.model.CrawlerTargets, init: AWSGlueCreateCrawlerCommand.() -> Unit): com.amazonaws.services.glue.model.CreateCrawlerResult {
	return this.block.declare(AWSGlueCreateCrawlerCommand(name, role, databaseName, targets).apply(init)) as com.amazonaws.services.glue.model.CreateCrawlerResult
}

@Generated
class AWSGlueCreateCrawlerCommand(val name: String, val role: String, val databaseName: String, val targets: com.amazonaws.services.glue.model.CrawlerTargets) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.CreateCrawlerRequest, com.amazonaws.services.glue.model.CreateCrawlerResult> {

	var description: String? = null
	var schedule: String? = null
	var classifiers: List<String>? = null
	var tablePrefix: String? = null
	var schemaChangePolicy: com.amazonaws.services.glue.model.SchemaChangePolicy? = null
	var configuration: String? = null

	override fun build(): com.amazonaws.services.glue.model.CreateCrawlerRequest {
		val input = com.amazonaws.services.glue.model.CreateCrawlerRequest()
		input.setName(this.name)
		input.setRole(this.role)
		input.setDatabaseName(this.databaseName)
		input.setDescription(this.description)
		input.setTargets(this.targets)
		input.setSchedule(this.schedule)
		input.setClassifiers(this.classifiers)
		input.setTablePrefix(this.tablePrefix)
		input.setSchemaChangePolicy(this.schemaChangePolicy)
		input.setConfiguration(this.configuration)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.CreateCrawlerResult {
	  return com.amazonaws.services.glue.model.CreateCrawlerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.CreateCrawlerResult {
		return environment.glue.createCrawler(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue create-crawler")
				.argument("name", name)
				.argument("role", role)
				.argument("database-name", databaseName)
				.argument("description", description)
				.argument("targets", targets.toString())
				.argument("schedule", schedule)
				.argument("classifiers", classifiers?.toString())
				.argument("table-prefix", tablePrefix)
				.argument("schema-change-policy", schemaChangePolicy?.toString())
				.argument("configuration", configuration)
	}

}


fun AWSGlueFunctions.createDatabase(databaseInput: com.amazonaws.services.glue.model.DatabaseInput, init: AWSGlueCreateDatabaseCommand.() -> Unit): com.amazonaws.services.glue.model.CreateDatabaseResult {
	return this.block.declare(AWSGlueCreateDatabaseCommand(databaseInput).apply(init)) as com.amazonaws.services.glue.model.CreateDatabaseResult
}

@Generated
class AWSGlueCreateDatabaseCommand(val databaseInput: com.amazonaws.services.glue.model.DatabaseInput) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.CreateDatabaseRequest, com.amazonaws.services.glue.model.CreateDatabaseResult> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.CreateDatabaseRequest {
		val input = com.amazonaws.services.glue.model.CreateDatabaseRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseInput(this.databaseInput)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.CreateDatabaseResult {
	  return com.amazonaws.services.glue.model.CreateDatabaseResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.CreateDatabaseResult {
		return environment.glue.createDatabase(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue create-database")
				.argument("catalog-id", catalogId)
				.argument("database-input", databaseInput.toString())
	}

}


fun AWSGlueFunctions.createDevEndpoint(endpointName: String, roleArn: String, init: AWSGlueCreateDevEndpointCommand.() -> Unit): com.amazonaws.services.glue.model.CreateDevEndpointResult {
	return this.block.declare(AWSGlueCreateDevEndpointCommand(endpointName, roleArn).apply(init)) as com.amazonaws.services.glue.model.CreateDevEndpointResult
}

@Generated
class AWSGlueCreateDevEndpointCommand(val endpointName: String, val roleArn: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.CreateDevEndpointRequest, com.amazonaws.services.glue.model.CreateDevEndpointResult> {

	var securityGroupIds: List<String>? = null
	var subnetId: String? = null
	var publicKey: String? = null
	var numberOfNodes: Int? = 0
	var extraPythonLibsS3Path: String? = null
	var extraJarsS3Path: String? = null

	override fun build(): com.amazonaws.services.glue.model.CreateDevEndpointRequest {
		val input = com.amazonaws.services.glue.model.CreateDevEndpointRequest()
		input.setEndpointName(this.endpointName)
		input.setRoleArn(this.roleArn)
		input.setSecurityGroupIds(this.securityGroupIds)
		input.setSubnetId(this.subnetId)
		input.setPublicKey(this.publicKey)
		input.setNumberOfNodes(this.numberOfNodes)
		input.setExtraPythonLibsS3Path(this.extraPythonLibsS3Path)
		input.setExtraJarsS3Path(this.extraJarsS3Path)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.CreateDevEndpointResult {
	  return com.amazonaws.services.glue.model.CreateDevEndpointResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.CreateDevEndpointResult {
		return environment.glue.createDevEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue create-dev-endpoint")
				.argument("endpoint-name", endpointName)
				.argument("role-arn", roleArn)
				.argument("security-group-ids", securityGroupIds?.toString())
				.argument("subnet-id", subnetId)
				.argument("public-key", publicKey)
				.argument("number-of-nodes", numberOfNodes?.toString())
				.argument("extra-python-libs-s3-path", extraPythonLibsS3Path)
				.argument("extra-jars-s3-path", extraJarsS3Path)
	}

}


fun AWSGlueFunctions.createJob(name: String, role: String, command: com.amazonaws.services.glue.model.JobCommand, init: AWSGlueCreateJobCommand.() -> Unit): com.amazonaws.services.glue.model.CreateJobResult {
	return this.block.declare(AWSGlueCreateJobCommand(name, role, command).apply(init)) as com.amazonaws.services.glue.model.CreateJobResult
}

@Generated
class AWSGlueCreateJobCommand(val name: String, val role: String, val command: com.amazonaws.services.glue.model.JobCommand) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.CreateJobRequest, com.amazonaws.services.glue.model.CreateJobResult> {

	var description: String? = null
	var logUri: String? = null
	var executionProperty: com.amazonaws.services.glue.model.ExecutionProperty? = null
	var defaultArguments: Map<String, String>? = null
	var connections: com.amazonaws.services.glue.model.ConnectionsList? = null
	var maxRetries: Int? = 0
	var allocatedCapacity: Int? = 0

	override fun build(): com.amazonaws.services.glue.model.CreateJobRequest {
		val input = com.amazonaws.services.glue.model.CreateJobRequest()
		input.setName(this.name)
		input.setDescription(this.description)
		input.setLogUri(this.logUri)
		input.setRole(this.role)
		input.setExecutionProperty(this.executionProperty)
		input.setCommand(this.command)
		input.setDefaultArguments(this.defaultArguments)
		input.setConnections(this.connections)
		input.setMaxRetries(this.maxRetries)
		input.setAllocatedCapacity(this.allocatedCapacity)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.CreateJobResult {
	  return com.amazonaws.services.glue.model.CreateJobResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.CreateJobResult {
		return environment.glue.createJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue create-job")
				.argument("name", name)
				.argument("description", description)
				.argument("log-uri", logUri)
				.argument("role", role)
				.argument("execution-property", executionProperty?.toString())
				.argument("command", command.toString())
				.argument("default-arguments", defaultArguments?.toString())
				.argument("connections", connections?.toString())
				.argument("max-retries", maxRetries?.toString())
				.argument("allocated-capacity", allocatedCapacity?.toString())
	}

}


fun AWSGlueFunctions.createPartition(databaseName: String, tableName: String, partitionInput: com.amazonaws.services.glue.model.PartitionInput, init: AWSGlueCreatePartitionCommand.() -> Unit): com.amazonaws.services.glue.model.CreatePartitionResult {
	return this.block.declare(AWSGlueCreatePartitionCommand(databaseName, tableName, partitionInput).apply(init)) as com.amazonaws.services.glue.model.CreatePartitionResult
}

@Generated
class AWSGlueCreatePartitionCommand(val databaseName: String, val tableName: String, val partitionInput: com.amazonaws.services.glue.model.PartitionInput) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.CreatePartitionRequest, com.amazonaws.services.glue.model.CreatePartitionResult> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.CreatePartitionRequest {
		val input = com.amazonaws.services.glue.model.CreatePartitionRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseName(this.databaseName)
		input.setTableName(this.tableName)
		input.setPartitionInput(this.partitionInput)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.CreatePartitionResult {
	  return com.amazonaws.services.glue.model.CreatePartitionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.CreatePartitionResult {
		return environment.glue.createPartition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue create-partition")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("table-name", tableName)
				.argument("partition-input", partitionInput.toString())
	}

}


fun AWSGlueFunctions.createScript(init: AWSGlueCreateScriptCommand.() -> Unit): com.amazonaws.services.glue.model.CreateScriptResult {
	return this.block.declare(AWSGlueCreateScriptCommand().apply(init)) as com.amazonaws.services.glue.model.CreateScriptResult
}

@Generated
class AWSGlueCreateScriptCommand() : AmazonWebServiceCommand<com.amazonaws.services.glue.model.CreateScriptRequest, com.amazonaws.services.glue.model.CreateScriptResult> {

	var dagNodes: List<com.amazonaws.services.glue.model.CodeGenNode>? = null
	var dagEdges: List<com.amazonaws.services.glue.model.CodeGenEdge>? = null
	var language: Language? = null

	override fun build(): com.amazonaws.services.glue.model.CreateScriptRequest {
		val input = com.amazonaws.services.glue.model.CreateScriptRequest()
		input.setDagNodes(this.dagNodes)
		input.setDagEdges(this.dagEdges)
		input.setLanguage(this.language?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.CreateScriptResult {
	  return com.amazonaws.services.glue.model.CreateScriptResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.CreateScriptResult {
		return environment.glue.createScript(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue create-script")
				.argument("dag-nodes", dagNodes?.toString())
				.argument("dag-edges", dagEdges?.toString())
				.argument("language", language?.toString())
	}

}


fun AWSGlueFunctions.createTable(databaseName: String, tableInput: com.amazonaws.services.glue.model.TableInput, init: AWSGlueCreateTableCommand.() -> Unit): com.amazonaws.services.glue.model.CreateTableResult {
	return this.block.declare(AWSGlueCreateTableCommand(databaseName, tableInput).apply(init)) as com.amazonaws.services.glue.model.CreateTableResult
}

@Generated
class AWSGlueCreateTableCommand(val databaseName: String, val tableInput: com.amazonaws.services.glue.model.TableInput) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.CreateTableRequest, com.amazonaws.services.glue.model.CreateTableResult> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.CreateTableRequest {
		val input = com.amazonaws.services.glue.model.CreateTableRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseName(this.databaseName)
		input.setTableInput(this.tableInput)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.CreateTableResult {
	  return com.amazonaws.services.glue.model.CreateTableResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.CreateTableResult {
		return environment.glue.createTable(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue create-table")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("table-input", tableInput.toString())
	}

}


fun AWSGlueFunctions.createTrigger(name: String, type: TriggerType, actions: List<com.amazonaws.services.glue.model.Action>, init: AWSGlueCreateTriggerCommand.() -> Unit): com.amazonaws.services.glue.model.CreateTriggerResult {
	return this.block.declare(AWSGlueCreateTriggerCommand(name, type, actions).apply(init)) as com.amazonaws.services.glue.model.CreateTriggerResult
}

@Generated
class AWSGlueCreateTriggerCommand(val name: String, val type: TriggerType, val actions: List<com.amazonaws.services.glue.model.Action>) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.CreateTriggerRequest, com.amazonaws.services.glue.model.CreateTriggerResult> {

	var schedule: String? = null
	var predicate: com.amazonaws.services.glue.model.Predicate? = null
	var description: String? = null

	override fun build(): com.amazonaws.services.glue.model.CreateTriggerRequest {
		val input = com.amazonaws.services.glue.model.CreateTriggerRequest()
		input.setName(this.name)
		input.setType(this.type.toString())
		input.setSchedule(this.schedule)
		input.setPredicate(this.predicate)
		input.setActions(this.actions)
		input.setDescription(this.description)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.CreateTriggerResult {
	  return com.amazonaws.services.glue.model.CreateTriggerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.CreateTriggerResult {
		return environment.glue.createTrigger(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue create-trigger")
				.argument("name", name)
				.argument("type", type.toString())
				.argument("schedule", schedule)
				.argument("predicate", predicate?.toString())
				.argument("actions", actions.toString())
				.argument("description", description)
	}

}


fun AWSGlueFunctions.createUserDefinedFunction(databaseName: String, functionInput: com.amazonaws.services.glue.model.UserDefinedFunctionInput, init: AWSGlueCreateUserDefinedFunctionCommand.() -> Unit): com.amazonaws.services.glue.model.CreateUserDefinedFunctionResult {
	return this.block.declare(AWSGlueCreateUserDefinedFunctionCommand(databaseName, functionInput).apply(init)) as com.amazonaws.services.glue.model.CreateUserDefinedFunctionResult
}

@Generated
class AWSGlueCreateUserDefinedFunctionCommand(val databaseName: String, val functionInput: com.amazonaws.services.glue.model.UserDefinedFunctionInput) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.CreateUserDefinedFunctionRequest, com.amazonaws.services.glue.model.CreateUserDefinedFunctionResult> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.CreateUserDefinedFunctionRequest {
		val input = com.amazonaws.services.glue.model.CreateUserDefinedFunctionRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseName(this.databaseName)
		input.setFunctionInput(this.functionInput)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.CreateUserDefinedFunctionResult {
	  return com.amazonaws.services.glue.model.CreateUserDefinedFunctionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.CreateUserDefinedFunctionResult {
		return environment.glue.createUserDefinedFunction(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue create-user-defined-function")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("function-input", functionInput.toString())
	}

}


fun AWSGlueFunctions.deleteClassifier(name: String, init: AWSGlueDeleteClassifierCommand.() -> Unit): com.amazonaws.services.glue.model.DeleteClassifierResult {
	return this.block.declare(AWSGlueDeleteClassifierCommand(name).apply(init)) as com.amazonaws.services.glue.model.DeleteClassifierResult
}

@Generated
class AWSGlueDeleteClassifierCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.DeleteClassifierRequest, com.amazonaws.services.glue.model.DeleteClassifierResult> {



	override fun build(): com.amazonaws.services.glue.model.DeleteClassifierRequest {
		val input = com.amazonaws.services.glue.model.DeleteClassifierRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.DeleteClassifierResult {
	  return com.amazonaws.services.glue.model.DeleteClassifierResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.DeleteClassifierResult {
		return environment.glue.deleteClassifier(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue delete-classifier")
				.argument("name", name)
	}

}


fun AWSGlueFunctions.deleteConnection(connectionName: String, init: AWSGlueDeleteConnectionCommand.() -> Unit): com.amazonaws.services.glue.model.DeleteConnectionResult {
	return this.block.declare(AWSGlueDeleteConnectionCommand(connectionName).apply(init)) as com.amazonaws.services.glue.model.DeleteConnectionResult
}

@Generated
class AWSGlueDeleteConnectionCommand(val connectionName: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.DeleteConnectionRequest, com.amazonaws.services.glue.model.DeleteConnectionResult> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.DeleteConnectionRequest {
		val input = com.amazonaws.services.glue.model.DeleteConnectionRequest()
		input.setCatalogId(this.catalogId)
		input.setConnectionName(this.connectionName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.DeleteConnectionResult {
	  return com.amazonaws.services.glue.model.DeleteConnectionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.DeleteConnectionResult {
		return environment.glue.deleteConnection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue delete-connection")
				.argument("catalog-id", catalogId)
				.argument("connection-name", connectionName)
	}

}


fun AWSGlueFunctions.deleteCrawler(name: String, init: AWSGlueDeleteCrawlerCommand.() -> Unit): com.amazonaws.services.glue.model.DeleteCrawlerResult {
	return this.block.declare(AWSGlueDeleteCrawlerCommand(name).apply(init)) as com.amazonaws.services.glue.model.DeleteCrawlerResult
}

@Generated
class AWSGlueDeleteCrawlerCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.DeleteCrawlerRequest, com.amazonaws.services.glue.model.DeleteCrawlerResult> {



	override fun build(): com.amazonaws.services.glue.model.DeleteCrawlerRequest {
		val input = com.amazonaws.services.glue.model.DeleteCrawlerRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.DeleteCrawlerResult {
	  return com.amazonaws.services.glue.model.DeleteCrawlerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.DeleteCrawlerResult {
		return environment.glue.deleteCrawler(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue delete-crawler")
				.argument("name", name)
	}

}


fun AWSGlueFunctions.deleteDatabase(name: String, init: AWSGlueDeleteDatabaseCommand.() -> Unit): com.amazonaws.services.glue.model.DeleteDatabaseResult {
	return this.block.declare(AWSGlueDeleteDatabaseCommand(name).apply(init)) as com.amazonaws.services.glue.model.DeleteDatabaseResult
}

@Generated
class AWSGlueDeleteDatabaseCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.DeleteDatabaseRequest, com.amazonaws.services.glue.model.DeleteDatabaseResult> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.DeleteDatabaseRequest {
		val input = com.amazonaws.services.glue.model.DeleteDatabaseRequest()
		input.setCatalogId(this.catalogId)
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.DeleteDatabaseResult {
	  return com.amazonaws.services.glue.model.DeleteDatabaseResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.DeleteDatabaseResult {
		return environment.glue.deleteDatabase(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue delete-database")
				.argument("catalog-id", catalogId)
				.argument("name", name)
	}

}


fun AWSGlueFunctions.deleteDevEndpoint(endpointName: String, init: AWSGlueDeleteDevEndpointCommand.() -> Unit): com.amazonaws.services.glue.model.DeleteDevEndpointResult {
	return this.block.declare(AWSGlueDeleteDevEndpointCommand(endpointName).apply(init)) as com.amazonaws.services.glue.model.DeleteDevEndpointResult
}

@Generated
class AWSGlueDeleteDevEndpointCommand(val endpointName: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.DeleteDevEndpointRequest, com.amazonaws.services.glue.model.DeleteDevEndpointResult> {



	override fun build(): com.amazonaws.services.glue.model.DeleteDevEndpointRequest {
		val input = com.amazonaws.services.glue.model.DeleteDevEndpointRequest()
		input.setEndpointName(this.endpointName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.DeleteDevEndpointResult {
	  return com.amazonaws.services.glue.model.DeleteDevEndpointResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.DeleteDevEndpointResult {
		return environment.glue.deleteDevEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue delete-dev-endpoint")
				.argument("endpoint-name", endpointName)
	}

}


fun AWSGlueFunctions.deleteJob(jobName: String, init: AWSGlueDeleteJobCommand.() -> Unit): com.amazonaws.services.glue.model.DeleteJobResult {
	return this.block.declare(AWSGlueDeleteJobCommand(jobName).apply(init)) as com.amazonaws.services.glue.model.DeleteJobResult
}

@Generated
class AWSGlueDeleteJobCommand(val jobName: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.DeleteJobRequest, com.amazonaws.services.glue.model.DeleteJobResult> {



	override fun build(): com.amazonaws.services.glue.model.DeleteJobRequest {
		val input = com.amazonaws.services.glue.model.DeleteJobRequest()
		input.setJobName(this.jobName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.DeleteJobResult {
	  return com.amazonaws.services.glue.model.DeleteJobResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.DeleteJobResult {
		return environment.glue.deleteJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue delete-job")
				.argument("job-name", jobName)
	}

}


fun AWSGlueFunctions.deletePartition(databaseName: String, tableName: String, partitionValues: List<String>, init: AWSGlueDeletePartitionCommand.() -> Unit): com.amazonaws.services.glue.model.DeletePartitionResult {
	return this.block.declare(AWSGlueDeletePartitionCommand(databaseName, tableName, partitionValues).apply(init)) as com.amazonaws.services.glue.model.DeletePartitionResult
}

@Generated
class AWSGlueDeletePartitionCommand(val databaseName: String, val tableName: String, val partitionValues: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.DeletePartitionRequest, com.amazonaws.services.glue.model.DeletePartitionResult> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.DeletePartitionRequest {
		val input = com.amazonaws.services.glue.model.DeletePartitionRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseName(this.databaseName)
		input.setTableName(this.tableName)
		input.setPartitionValues(this.partitionValues)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.DeletePartitionResult {
	  return com.amazonaws.services.glue.model.DeletePartitionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.DeletePartitionResult {
		return environment.glue.deletePartition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue delete-partition")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("table-name", tableName)
				.argument("partition-values", partitionValues.toString())
	}

}


fun AWSGlueFunctions.deleteTable(databaseName: String, name: String, init: AWSGlueDeleteTableCommand.() -> Unit): com.amazonaws.services.glue.model.DeleteTableResult {
	return this.block.declare(AWSGlueDeleteTableCommand(databaseName, name).apply(init)) as com.amazonaws.services.glue.model.DeleteTableResult
}

@Generated
class AWSGlueDeleteTableCommand(val databaseName: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.DeleteTableRequest, com.amazonaws.services.glue.model.DeleteTableResult> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.DeleteTableRequest {
		val input = com.amazonaws.services.glue.model.DeleteTableRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseName(this.databaseName)
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.DeleteTableResult {
	  return com.amazonaws.services.glue.model.DeleteTableResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.DeleteTableResult {
		return environment.glue.deleteTable(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue delete-table")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("name", name)
	}

}


fun AWSGlueFunctions.deleteTableVersion(databaseName: String, tableName: String, versionId: String, init: AWSGlueDeleteTableVersionCommand.() -> Unit): com.amazonaws.services.glue.model.DeleteTableVersionResult {
	return this.block.declare(AWSGlueDeleteTableVersionCommand(databaseName, tableName, versionId).apply(init)) as com.amazonaws.services.glue.model.DeleteTableVersionResult
}

@Generated
class AWSGlueDeleteTableVersionCommand(val databaseName: String, val tableName: String, val versionId: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.DeleteTableVersionRequest, com.amazonaws.services.glue.model.DeleteTableVersionResult> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.DeleteTableVersionRequest {
		val input = com.amazonaws.services.glue.model.DeleteTableVersionRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseName(this.databaseName)
		input.setTableName(this.tableName)
		input.setVersionId(this.versionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.DeleteTableVersionResult {
	  return com.amazonaws.services.glue.model.DeleteTableVersionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.DeleteTableVersionResult {
		return environment.glue.deleteTableVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue delete-table-version")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("table-name", tableName)
				.argument("version-id", versionId)
	}

}


fun AWSGlueFunctions.deleteTrigger(name: String, init: AWSGlueDeleteTriggerCommand.() -> Unit): com.amazonaws.services.glue.model.DeleteTriggerResult {
	return this.block.declare(AWSGlueDeleteTriggerCommand(name).apply(init)) as com.amazonaws.services.glue.model.DeleteTriggerResult
}

@Generated
class AWSGlueDeleteTriggerCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.DeleteTriggerRequest, com.amazonaws.services.glue.model.DeleteTriggerResult> {



	override fun build(): com.amazonaws.services.glue.model.DeleteTriggerRequest {
		val input = com.amazonaws.services.glue.model.DeleteTriggerRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.DeleteTriggerResult {
	  return com.amazonaws.services.glue.model.DeleteTriggerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.DeleteTriggerResult {
		return environment.glue.deleteTrigger(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue delete-trigger")
				.argument("name", name)
	}

}


fun AWSGlueFunctions.deleteUserDefinedFunction(databaseName: String, functionName: String, init: AWSGlueDeleteUserDefinedFunctionCommand.() -> Unit): com.amazonaws.services.glue.model.DeleteUserDefinedFunctionResult {
	return this.block.declare(AWSGlueDeleteUserDefinedFunctionCommand(databaseName, functionName).apply(init)) as com.amazonaws.services.glue.model.DeleteUserDefinedFunctionResult
}

@Generated
class AWSGlueDeleteUserDefinedFunctionCommand(val databaseName: String, val functionName: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.DeleteUserDefinedFunctionRequest, com.amazonaws.services.glue.model.DeleteUserDefinedFunctionResult> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.DeleteUserDefinedFunctionRequest {
		val input = com.amazonaws.services.glue.model.DeleteUserDefinedFunctionRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseName(this.databaseName)
		input.setFunctionName(this.functionName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.DeleteUserDefinedFunctionResult {
	  return com.amazonaws.services.glue.model.DeleteUserDefinedFunctionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.DeleteUserDefinedFunctionResult {
		return environment.glue.deleteUserDefinedFunction(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue delete-user-defined-function")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("function-name", functionName)
	}

}


fun AWSGlueFunctions.getCatalogImportStatus(init: AWSGlueGetCatalogImportStatusCommand.() -> Unit): com.amazonaws.services.glue.model.GetCatalogImportStatusResult {
	return this.block.declare(AWSGlueGetCatalogImportStatusCommand().apply(init)) as com.amazonaws.services.glue.model.GetCatalogImportStatusResult
}

@Generated
class AWSGlueGetCatalogImportStatusCommand() : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetCatalogImportStatusRequest, com.amazonaws.services.glue.model.GetCatalogImportStatusResult> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.GetCatalogImportStatusRequest {
		val input = com.amazonaws.services.glue.model.GetCatalogImportStatusRequest()
		input.setCatalogId(this.catalogId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.GetCatalogImportStatusResult {
	  return com.amazonaws.services.glue.model.GetCatalogImportStatusResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.GetCatalogImportStatusResult {
		return environment.glue.getCatalogImportStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-catalog-import-status")
				.argument("catalog-id", catalogId)
	}

}


fun AWSGlueFunctions.getClassifier(name: String, init: AWSGlueGetClassifierCommand.() -> Unit): com.amazonaws.services.glue.model.GetClassifierResult {
	return this.block.declare(AWSGlueGetClassifierCommand(name).apply(init)) as com.amazonaws.services.glue.model.GetClassifierResult
}

@Generated
class AWSGlueGetClassifierCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetClassifierRequest, com.amazonaws.services.glue.model.GetClassifierResult> {



	override fun build(): com.amazonaws.services.glue.model.GetClassifierRequest {
		val input = com.amazonaws.services.glue.model.GetClassifierRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.GetClassifierResult {
	  return com.amazonaws.services.glue.model.GetClassifierResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.GetClassifierResult {
		return environment.glue.getClassifier(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-classifier")
				.argument("name", name)
	}

}


fun AWSGlueFunctions.getClassifiers(init: AWSGlueGetClassifiersCommand.() -> Unit): com.amazonaws.services.glue.model.GetClassifiersResult {
	return this.block.declare(AWSGlueGetClassifiersCommand().apply(init)) as com.amazonaws.services.glue.model.GetClassifiersResult
}

@Generated
class AWSGlueGetClassifiersCommand() : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetClassifiersRequest, com.amazonaws.services.glue.model.GetClassifiersResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.glue.model.GetClassifiersRequest {
		val input = com.amazonaws.services.glue.model.GetClassifiersRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.GetClassifiersResult {
	  return com.amazonaws.services.glue.model.GetClassifiersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.GetClassifiersResult {
		return environment.glue.getClassifiers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-classifiers")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSGlueFunctions.getConnection(name: String, init: AWSGlueGetConnectionCommand.() -> Unit): com.amazonaws.services.glue.model.GetConnectionResult {
	return this.block.declare(AWSGlueGetConnectionCommand(name).apply(init)) as com.amazonaws.services.glue.model.GetConnectionResult
}

@Generated
class AWSGlueGetConnectionCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetConnectionRequest, com.amazonaws.services.glue.model.GetConnectionResult> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.GetConnectionRequest {
		val input = com.amazonaws.services.glue.model.GetConnectionRequest()
		input.setCatalogId(this.catalogId)
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.GetConnectionResult {
	  return com.amazonaws.services.glue.model.GetConnectionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.GetConnectionResult {
		return environment.glue.getConnection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-connection")
				.argument("catalog-id", catalogId)
				.argument("name", name)
	}

}


fun AWSGlueFunctions.getConnections(init: AWSGlueGetConnectionsCommand.() -> Unit): com.amazonaws.services.glue.model.GetConnectionsResult {
	return this.block.declare(AWSGlueGetConnectionsCommand().apply(init)) as com.amazonaws.services.glue.model.GetConnectionsResult
}

@Generated
class AWSGlueGetConnectionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetConnectionsRequest, com.amazonaws.services.glue.model.GetConnectionsResult> {

	var catalogId: String? = null
	var filter: com.amazonaws.services.glue.model.GetConnectionsFilter? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.glue.model.GetConnectionsRequest {
		val input = com.amazonaws.services.glue.model.GetConnectionsRequest()
		input.setCatalogId(this.catalogId)
		input.setFilter(this.filter)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.GetConnectionsResult {
	  return com.amazonaws.services.glue.model.GetConnectionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.GetConnectionsResult {
		return environment.glue.getConnections(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-connections")
				.argument("catalog-id", catalogId)
				.argument("filter", filter?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSGlueFunctions.getCrawler(name: String, init: AWSGlueGetCrawlerCommand.() -> Unit): com.amazonaws.services.glue.model.GetCrawlerResult {
	return this.block.declare(AWSGlueGetCrawlerCommand(name).apply(init)) as com.amazonaws.services.glue.model.GetCrawlerResult
}

@Generated
class AWSGlueGetCrawlerCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetCrawlerRequest, com.amazonaws.services.glue.model.GetCrawlerResult> {



	override fun build(): com.amazonaws.services.glue.model.GetCrawlerRequest {
		val input = com.amazonaws.services.glue.model.GetCrawlerRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.GetCrawlerResult {
	  return com.amazonaws.services.glue.model.GetCrawlerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.GetCrawlerResult {
		return environment.glue.getCrawler(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-crawler")
				.argument("name", name)
	}

}


fun AWSGlueFunctions.getCrawlerMetrics(init: AWSGlueGetCrawlerMetricsCommand.() -> Unit): com.amazonaws.services.glue.model.GetCrawlerMetricsResult {
	return this.block.declare(AWSGlueGetCrawlerMetricsCommand().apply(init)) as com.amazonaws.services.glue.model.GetCrawlerMetricsResult
}

@Generated
class AWSGlueGetCrawlerMetricsCommand() : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetCrawlerMetricsRequest, com.amazonaws.services.glue.model.GetCrawlerMetricsResult> {

	var crawlerNameList: List<String>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.glue.model.GetCrawlerMetricsRequest {
		val input = com.amazonaws.services.glue.model.GetCrawlerMetricsRequest()
		input.setCrawlerNameList(this.crawlerNameList)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.GetCrawlerMetricsResult {
	  return com.amazonaws.services.glue.model.GetCrawlerMetricsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.GetCrawlerMetricsResult {
		return environment.glue.getCrawlerMetrics(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-crawler-metrics")
				.argument("crawler-name-list", crawlerNameList?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSGlueFunctions.getCrawlers(init: AWSGlueGetCrawlersCommand.() -> Unit): com.amazonaws.services.glue.model.GetCrawlersResult {
	return this.block.declare(AWSGlueGetCrawlersCommand().apply(init)) as com.amazonaws.services.glue.model.GetCrawlersResult
}

@Generated
class AWSGlueGetCrawlersCommand() : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetCrawlersRequest, com.amazonaws.services.glue.model.GetCrawlersResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.glue.model.GetCrawlersRequest {
		val input = com.amazonaws.services.glue.model.GetCrawlersRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.GetCrawlersResult {
	  return com.amazonaws.services.glue.model.GetCrawlersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.GetCrawlersResult {
		return environment.glue.getCrawlers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-crawlers")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSGlueFunctions.getDatabase(name: String, init: AWSGlueGetDatabaseCommand.() -> Unit): com.amazonaws.services.glue.model.GetDatabaseResult {
	return this.block.declare(AWSGlueGetDatabaseCommand(name).apply(init)) as com.amazonaws.services.glue.model.GetDatabaseResult
}

@Generated
class AWSGlueGetDatabaseCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetDatabaseRequest, com.amazonaws.services.glue.model.GetDatabaseResult> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.GetDatabaseRequest {
		val input = com.amazonaws.services.glue.model.GetDatabaseRequest()
		input.setCatalogId(this.catalogId)
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.GetDatabaseResult {
	  return com.amazonaws.services.glue.model.GetDatabaseResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.GetDatabaseResult {
		return environment.glue.getDatabase(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-database")
				.argument("catalog-id", catalogId)
				.argument("name", name)
	}

}


fun AWSGlueFunctions.getDatabases(init: AWSGlueGetDatabasesCommand.() -> Unit): com.amazonaws.services.glue.model.GetDatabasesResult {
	return this.block.declare(AWSGlueGetDatabasesCommand().apply(init)) as com.amazonaws.services.glue.model.GetDatabasesResult
}

@Generated
class AWSGlueGetDatabasesCommand() : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetDatabasesRequest, com.amazonaws.services.glue.model.GetDatabasesResult> {

	var catalogId: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.glue.model.GetDatabasesRequest {
		val input = com.amazonaws.services.glue.model.GetDatabasesRequest()
		input.setCatalogId(this.catalogId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.GetDatabasesResult {
	  return com.amazonaws.services.glue.model.GetDatabasesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.GetDatabasesResult {
		return environment.glue.getDatabases(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-databases")
				.argument("catalog-id", catalogId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSGlueFunctions.getDataflowGraph(init: AWSGlueGetDataflowGraphCommand.() -> Unit): com.amazonaws.services.glue.model.GetDataflowGraphResult {
	return this.block.declare(AWSGlueGetDataflowGraphCommand().apply(init)) as com.amazonaws.services.glue.model.GetDataflowGraphResult
}

@Generated
class AWSGlueGetDataflowGraphCommand() : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetDataflowGraphRequest, com.amazonaws.services.glue.model.GetDataflowGraphResult> {

	var pythonScript: String? = null

	override fun build(): com.amazonaws.services.glue.model.GetDataflowGraphRequest {
		val input = com.amazonaws.services.glue.model.GetDataflowGraphRequest()
		input.setPythonScript(this.pythonScript)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.GetDataflowGraphResult {
	  return com.amazonaws.services.glue.model.GetDataflowGraphResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.GetDataflowGraphResult {
		return environment.glue.getDataflowGraph(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-dataflow-graph")
				.argument("python-script", pythonScript)
	}

}


fun AWSGlueFunctions.getDevEndpoint(endpointName: String, init: AWSGlueGetDevEndpointCommand.() -> Unit): com.amazonaws.services.glue.model.GetDevEndpointResult {
	return this.block.declare(AWSGlueGetDevEndpointCommand(endpointName).apply(init)) as com.amazonaws.services.glue.model.GetDevEndpointResult
}

@Generated
class AWSGlueGetDevEndpointCommand(val endpointName: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetDevEndpointRequest, com.amazonaws.services.glue.model.GetDevEndpointResult> {



	override fun build(): com.amazonaws.services.glue.model.GetDevEndpointRequest {
		val input = com.amazonaws.services.glue.model.GetDevEndpointRequest()
		input.setEndpointName(this.endpointName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.GetDevEndpointResult {
	  return com.amazonaws.services.glue.model.GetDevEndpointResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.GetDevEndpointResult {
		return environment.glue.getDevEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-dev-endpoint")
				.argument("endpoint-name", endpointName)
	}

}


fun AWSGlueFunctions.getDevEndpoints(init: AWSGlueGetDevEndpointsCommand.() -> Unit): com.amazonaws.services.glue.model.GetDevEndpointsResult {
	return this.block.declare(AWSGlueGetDevEndpointsCommand().apply(init)) as com.amazonaws.services.glue.model.GetDevEndpointsResult
}

@Generated
class AWSGlueGetDevEndpointsCommand() : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetDevEndpointsRequest, com.amazonaws.services.glue.model.GetDevEndpointsResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.glue.model.GetDevEndpointsRequest {
		val input = com.amazonaws.services.glue.model.GetDevEndpointsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.GetDevEndpointsResult {
	  return com.amazonaws.services.glue.model.GetDevEndpointsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.GetDevEndpointsResult {
		return environment.glue.getDevEndpoints(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-dev-endpoints")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSGlueFunctions.getJob(jobName: String, init: AWSGlueGetJobCommand.() -> Unit): com.amazonaws.services.glue.model.GetJobResult {
	return this.block.declare(AWSGlueGetJobCommand(jobName).apply(init)) as com.amazonaws.services.glue.model.GetJobResult
}

@Generated
class AWSGlueGetJobCommand(val jobName: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetJobRequest, com.amazonaws.services.glue.model.GetJobResult> {



	override fun build(): com.amazonaws.services.glue.model.GetJobRequest {
		val input = com.amazonaws.services.glue.model.GetJobRequest()
		input.setJobName(this.jobName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.GetJobResult {
	  return com.amazonaws.services.glue.model.GetJobResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.GetJobResult {
		return environment.glue.getJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-job")
				.argument("job-name", jobName)
	}

}


fun AWSGlueFunctions.getJobRun(jobName: String, runId: String, init: AWSGlueGetJobRunCommand.() -> Unit): com.amazonaws.services.glue.model.GetJobRunResult {
	return this.block.declare(AWSGlueGetJobRunCommand(jobName, runId).apply(init)) as com.amazonaws.services.glue.model.GetJobRunResult
}

@Generated
class AWSGlueGetJobRunCommand(val jobName: String, val runId: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetJobRunRequest, com.amazonaws.services.glue.model.GetJobRunResult> {

	var predecessorsIncluded: Boolean? = false

	override fun build(): com.amazonaws.services.glue.model.GetJobRunRequest {
		val input = com.amazonaws.services.glue.model.GetJobRunRequest()
		input.setJobName(this.jobName)
		input.setRunId(this.runId)
		input.setPredecessorsIncluded(this.predecessorsIncluded)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.GetJobRunResult {
	  return com.amazonaws.services.glue.model.GetJobRunResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.GetJobRunResult {
		return environment.glue.getJobRun(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-job-run")
				.argument("job-name", jobName)
				.argument("run-id", runId)
				.option("predecessors-included", predecessorsIncluded ?: false)
	}

}


fun AWSGlueFunctions.getJobRuns(jobName: String, init: AWSGlueGetJobRunsCommand.() -> Unit): com.amazonaws.services.glue.model.GetJobRunsResult {
	return this.block.declare(AWSGlueGetJobRunsCommand(jobName).apply(init)) as com.amazonaws.services.glue.model.GetJobRunsResult
}

@Generated
class AWSGlueGetJobRunsCommand(val jobName: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetJobRunsRequest, com.amazonaws.services.glue.model.GetJobRunsResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.glue.model.GetJobRunsRequest {
		val input = com.amazonaws.services.glue.model.GetJobRunsRequest()
		input.setJobName(this.jobName)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.GetJobRunsResult {
	  return com.amazonaws.services.glue.model.GetJobRunsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.GetJobRunsResult {
		return environment.glue.getJobRuns(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-job-runs")
				.argument("job-name", jobName)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSGlueFunctions.getJobs(init: AWSGlueGetJobsCommand.() -> Unit): com.amazonaws.services.glue.model.GetJobsResult {
	return this.block.declare(AWSGlueGetJobsCommand().apply(init)) as com.amazonaws.services.glue.model.GetJobsResult
}

@Generated
class AWSGlueGetJobsCommand() : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetJobsRequest, com.amazonaws.services.glue.model.GetJobsResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.glue.model.GetJobsRequest {
		val input = com.amazonaws.services.glue.model.GetJobsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.GetJobsResult {
	  return com.amazonaws.services.glue.model.GetJobsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.GetJobsResult {
		return environment.glue.getJobs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-jobs")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSGlueFunctions.getMapping(source: com.amazonaws.services.glue.model.CatalogEntry, init: AWSGlueGetMappingCommand.() -> Unit): com.amazonaws.services.glue.model.GetMappingResult {
	return this.block.declare(AWSGlueGetMappingCommand(source).apply(init)) as com.amazonaws.services.glue.model.GetMappingResult
}

@Generated
class AWSGlueGetMappingCommand(val source: com.amazonaws.services.glue.model.CatalogEntry) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetMappingRequest, com.amazonaws.services.glue.model.GetMappingResult> {

	var sinks: List<com.amazonaws.services.glue.model.CatalogEntry>? = null
	var location: com.amazonaws.services.glue.model.Location? = null

	override fun build(): com.amazonaws.services.glue.model.GetMappingRequest {
		val input = com.amazonaws.services.glue.model.GetMappingRequest()
		input.setSource(this.source)
		input.setSinks(this.sinks)
		input.setLocation(this.location)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.GetMappingResult {
	  return com.amazonaws.services.glue.model.GetMappingResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.GetMappingResult {
		return environment.glue.getMapping(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-mapping")
				.argument("source", source.toString())
				.argument("sinks", sinks?.toString())
				.argument("location", location?.toString())
	}

}


fun AWSGlueFunctions.getPartition(databaseName: String, tableName: String, partitionValues: List<String>, init: AWSGlueGetPartitionCommand.() -> Unit): com.amazonaws.services.glue.model.GetPartitionResult {
	return this.block.declare(AWSGlueGetPartitionCommand(databaseName, tableName, partitionValues).apply(init)) as com.amazonaws.services.glue.model.GetPartitionResult
}

@Generated
class AWSGlueGetPartitionCommand(val databaseName: String, val tableName: String, val partitionValues: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetPartitionRequest, com.amazonaws.services.glue.model.GetPartitionResult> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.GetPartitionRequest {
		val input = com.amazonaws.services.glue.model.GetPartitionRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseName(this.databaseName)
		input.setTableName(this.tableName)
		input.setPartitionValues(this.partitionValues)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.GetPartitionResult {
	  return com.amazonaws.services.glue.model.GetPartitionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.GetPartitionResult {
		return environment.glue.getPartition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-partition")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("table-name", tableName)
				.argument("partition-values", partitionValues.toString())
	}

}


fun AWSGlueFunctions.getPartitions(databaseName: String, tableName: String, init: AWSGlueGetPartitionsCommand.() -> Unit): com.amazonaws.services.glue.model.GetPartitionsResult {
	return this.block.declare(AWSGlueGetPartitionsCommand(databaseName, tableName).apply(init)) as com.amazonaws.services.glue.model.GetPartitionsResult
}

@Generated
class AWSGlueGetPartitionsCommand(val databaseName: String, val tableName: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetPartitionsRequest, com.amazonaws.services.glue.model.GetPartitionsResult> {

	var catalogId: String? = null
	var expression: String? = null
	var nextToken: String? = null
	var segment: com.amazonaws.services.glue.model.Segment? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.glue.model.GetPartitionsRequest {
		val input = com.amazonaws.services.glue.model.GetPartitionsRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseName(this.databaseName)
		input.setTableName(this.tableName)
		input.setExpression(this.expression)
		input.setNextToken(this.nextToken)
		input.setSegment(this.segment)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.GetPartitionsResult {
	  return com.amazonaws.services.glue.model.GetPartitionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.GetPartitionsResult {
		return environment.glue.getPartitions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-partitions")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("table-name", tableName)
				.argument("expression", expression)
				.argument("next-token", nextToken)
				.argument("segment", segment?.toString())
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSGlueFunctions.getPlan(mapping: List<com.amazonaws.services.glue.model.MappingEntry>, source: com.amazonaws.services.glue.model.CatalogEntry, init: AWSGlueGetPlanCommand.() -> Unit): com.amazonaws.services.glue.model.GetPlanResult {
	return this.block.declare(AWSGlueGetPlanCommand(mapping, source).apply(init)) as com.amazonaws.services.glue.model.GetPlanResult
}

@Generated
class AWSGlueGetPlanCommand(val mapping: List<com.amazonaws.services.glue.model.MappingEntry>, val source: com.amazonaws.services.glue.model.CatalogEntry) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetPlanRequest, com.amazonaws.services.glue.model.GetPlanResult> {

	var sinks: List<com.amazonaws.services.glue.model.CatalogEntry>? = null
	var location: com.amazonaws.services.glue.model.Location? = null
	var language: Language? = null

	override fun build(): com.amazonaws.services.glue.model.GetPlanRequest {
		val input = com.amazonaws.services.glue.model.GetPlanRequest()
		input.setMapping(this.mapping)
		input.setSource(this.source)
		input.setSinks(this.sinks)
		input.setLocation(this.location)
		input.setLanguage(this.language?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.GetPlanResult {
	  return com.amazonaws.services.glue.model.GetPlanResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.GetPlanResult {
		return environment.glue.getPlan(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-plan")
				.argument("mapping", mapping.toString())
				.argument("source", source.toString())
				.argument("sinks", sinks?.toString())
				.argument("location", location?.toString())
				.argument("language", language?.toString())
	}

}


fun AWSGlueFunctions.getTable(databaseName: String, name: String, init: AWSGlueGetTableCommand.() -> Unit): com.amazonaws.services.glue.model.GetTableResult {
	return this.block.declare(AWSGlueGetTableCommand(databaseName, name).apply(init)) as com.amazonaws.services.glue.model.GetTableResult
}

@Generated
class AWSGlueGetTableCommand(val databaseName: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetTableRequest, com.amazonaws.services.glue.model.GetTableResult> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.GetTableRequest {
		val input = com.amazonaws.services.glue.model.GetTableRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseName(this.databaseName)
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.GetTableResult {
	  return com.amazonaws.services.glue.model.GetTableResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.GetTableResult {
		return environment.glue.getTable(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-table")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("name", name)
	}

}


fun AWSGlueFunctions.getTableVersion(databaseName: String, tableName: String, init: AWSGlueGetTableVersionCommand.() -> Unit): com.amazonaws.services.glue.model.GetTableVersionResult {
	return this.block.declare(AWSGlueGetTableVersionCommand(databaseName, tableName).apply(init)) as com.amazonaws.services.glue.model.GetTableVersionResult
}

@Generated
class AWSGlueGetTableVersionCommand(val databaseName: String, val tableName: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetTableVersionRequest, com.amazonaws.services.glue.model.GetTableVersionResult> {

	var catalogId: String? = null
	var versionId: String? = null

	override fun build(): com.amazonaws.services.glue.model.GetTableVersionRequest {
		val input = com.amazonaws.services.glue.model.GetTableVersionRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseName(this.databaseName)
		input.setTableName(this.tableName)
		input.setVersionId(this.versionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.GetTableVersionResult {
	  return com.amazonaws.services.glue.model.GetTableVersionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.GetTableVersionResult {
		return environment.glue.getTableVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-table-version")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("table-name", tableName)
				.argument("version-id", versionId)
	}

}


fun AWSGlueFunctions.getTableVersions(databaseName: String, tableName: String, init: AWSGlueGetTableVersionsCommand.() -> Unit): com.amazonaws.services.glue.model.GetTableVersionsResult {
	return this.block.declare(AWSGlueGetTableVersionsCommand(databaseName, tableName).apply(init)) as com.amazonaws.services.glue.model.GetTableVersionsResult
}

@Generated
class AWSGlueGetTableVersionsCommand(val databaseName: String, val tableName: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetTableVersionsRequest, com.amazonaws.services.glue.model.GetTableVersionsResult> {

	var catalogId: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.glue.model.GetTableVersionsRequest {
		val input = com.amazonaws.services.glue.model.GetTableVersionsRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseName(this.databaseName)
		input.setTableName(this.tableName)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.GetTableVersionsResult {
	  return com.amazonaws.services.glue.model.GetTableVersionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.GetTableVersionsResult {
		return environment.glue.getTableVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-table-versions")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("table-name", tableName)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSGlueFunctions.getTables(databaseName: String, init: AWSGlueGetTablesCommand.() -> Unit): com.amazonaws.services.glue.model.GetTablesResult {
	return this.block.declare(AWSGlueGetTablesCommand(databaseName).apply(init)) as com.amazonaws.services.glue.model.GetTablesResult
}

@Generated
class AWSGlueGetTablesCommand(val databaseName: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetTablesRequest, com.amazonaws.services.glue.model.GetTablesResult> {

	var catalogId: String? = null
	var expression: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.glue.model.GetTablesRequest {
		val input = com.amazonaws.services.glue.model.GetTablesRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseName(this.databaseName)
		input.setExpression(this.expression)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.GetTablesResult {
	  return com.amazonaws.services.glue.model.GetTablesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.GetTablesResult {
		return environment.glue.getTables(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-tables")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("expression", expression)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSGlueFunctions.getTrigger(name: String, init: AWSGlueGetTriggerCommand.() -> Unit): com.amazonaws.services.glue.model.GetTriggerResult {
	return this.block.declare(AWSGlueGetTriggerCommand(name).apply(init)) as com.amazonaws.services.glue.model.GetTriggerResult
}

@Generated
class AWSGlueGetTriggerCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetTriggerRequest, com.amazonaws.services.glue.model.GetTriggerResult> {



	override fun build(): com.amazonaws.services.glue.model.GetTriggerRequest {
		val input = com.amazonaws.services.glue.model.GetTriggerRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.GetTriggerResult {
	  return com.amazonaws.services.glue.model.GetTriggerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.GetTriggerResult {
		return environment.glue.getTrigger(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-trigger")
				.argument("name", name)
	}

}


fun AWSGlueFunctions.getTriggers(init: AWSGlueGetTriggersCommand.() -> Unit): com.amazonaws.services.glue.model.GetTriggersResult {
	return this.block.declare(AWSGlueGetTriggersCommand().apply(init)) as com.amazonaws.services.glue.model.GetTriggersResult
}

@Generated
class AWSGlueGetTriggersCommand() : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetTriggersRequest, com.amazonaws.services.glue.model.GetTriggersResult> {

	var nextToken: String? = null
	var dependentJobName: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.glue.model.GetTriggersRequest {
		val input = com.amazonaws.services.glue.model.GetTriggersRequest()
		input.setNextToken(this.nextToken)
		input.setDependentJobName(this.dependentJobName)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.GetTriggersResult {
	  return com.amazonaws.services.glue.model.GetTriggersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.GetTriggersResult {
		return environment.glue.getTriggers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-triggers")
				.argument("next-token", nextToken)
				.argument("dependent-job-name", dependentJobName)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSGlueFunctions.getUserDefinedFunction(databaseName: String, functionName: String, init: AWSGlueGetUserDefinedFunctionCommand.() -> Unit): com.amazonaws.services.glue.model.GetUserDefinedFunctionResult {
	return this.block.declare(AWSGlueGetUserDefinedFunctionCommand(databaseName, functionName).apply(init)) as com.amazonaws.services.glue.model.GetUserDefinedFunctionResult
}

@Generated
class AWSGlueGetUserDefinedFunctionCommand(val databaseName: String, val functionName: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetUserDefinedFunctionRequest, com.amazonaws.services.glue.model.GetUserDefinedFunctionResult> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.GetUserDefinedFunctionRequest {
		val input = com.amazonaws.services.glue.model.GetUserDefinedFunctionRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseName(this.databaseName)
		input.setFunctionName(this.functionName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.GetUserDefinedFunctionResult {
	  return com.amazonaws.services.glue.model.GetUserDefinedFunctionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.GetUserDefinedFunctionResult {
		return environment.glue.getUserDefinedFunction(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-user-defined-function")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("function-name", functionName)
	}

}


fun AWSGlueFunctions.getUserDefinedFunctions(databaseName: String, pattern: String, init: AWSGlueGetUserDefinedFunctionsCommand.() -> Unit): com.amazonaws.services.glue.model.GetUserDefinedFunctionsResult {
	return this.block.declare(AWSGlueGetUserDefinedFunctionsCommand(databaseName, pattern).apply(init)) as com.amazonaws.services.glue.model.GetUserDefinedFunctionsResult
}

@Generated
class AWSGlueGetUserDefinedFunctionsCommand(val databaseName: String, val pattern: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetUserDefinedFunctionsRequest, com.amazonaws.services.glue.model.GetUserDefinedFunctionsResult> {

	var catalogId: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.glue.model.GetUserDefinedFunctionsRequest {
		val input = com.amazonaws.services.glue.model.GetUserDefinedFunctionsRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseName(this.databaseName)
		input.setPattern(this.pattern)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.GetUserDefinedFunctionsResult {
	  return com.amazonaws.services.glue.model.GetUserDefinedFunctionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.GetUserDefinedFunctionsResult {
		return environment.glue.getUserDefinedFunctions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-user-defined-functions")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("pattern", pattern)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSGlueFunctions.importCatalogToGlue(init: AWSGlueImportCatalogToGlueCommand.() -> Unit): com.amazonaws.services.glue.model.ImportCatalogToGlueResult {
	return this.block.declare(AWSGlueImportCatalogToGlueCommand().apply(init)) as com.amazonaws.services.glue.model.ImportCatalogToGlueResult
}

@Generated
class AWSGlueImportCatalogToGlueCommand() : AmazonWebServiceCommand<com.amazonaws.services.glue.model.ImportCatalogToGlueRequest, com.amazonaws.services.glue.model.ImportCatalogToGlueResult> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.ImportCatalogToGlueRequest {
		val input = com.amazonaws.services.glue.model.ImportCatalogToGlueRequest()
		input.setCatalogId(this.catalogId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.ImportCatalogToGlueResult {
	  return com.amazonaws.services.glue.model.ImportCatalogToGlueResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.ImportCatalogToGlueResult {
		return environment.glue.importCatalogToGlue(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue import-catalog-to-glue")
				.argument("catalog-id", catalogId)
	}

}


fun AWSGlueFunctions.resetJobBookmark(jobName: String, init: AWSGlueResetJobBookmarkCommand.() -> Unit): com.amazonaws.services.glue.model.ResetJobBookmarkResult {
	return this.block.declare(AWSGlueResetJobBookmarkCommand(jobName).apply(init)) as com.amazonaws.services.glue.model.ResetJobBookmarkResult
}

@Generated
class AWSGlueResetJobBookmarkCommand(val jobName: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.ResetJobBookmarkRequest, com.amazonaws.services.glue.model.ResetJobBookmarkResult> {



	override fun build(): com.amazonaws.services.glue.model.ResetJobBookmarkRequest {
		val input = com.amazonaws.services.glue.model.ResetJobBookmarkRequest()
		input.setJobName(this.jobName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.ResetJobBookmarkResult {
	  return com.amazonaws.services.glue.model.ResetJobBookmarkResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.ResetJobBookmarkResult {
		return environment.glue.resetJobBookmark(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue reset-job-bookmark")
				.argument("job-name", jobName)
	}

}


fun AWSGlueFunctions.startCrawler(name: String, init: AWSGlueStartCrawlerCommand.() -> Unit): com.amazonaws.services.glue.model.StartCrawlerResult {
	return this.block.declare(AWSGlueStartCrawlerCommand(name).apply(init)) as com.amazonaws.services.glue.model.StartCrawlerResult
}

@Generated
class AWSGlueStartCrawlerCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.StartCrawlerRequest, com.amazonaws.services.glue.model.StartCrawlerResult> {



	override fun build(): com.amazonaws.services.glue.model.StartCrawlerRequest {
		val input = com.amazonaws.services.glue.model.StartCrawlerRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.StartCrawlerResult {
	  return com.amazonaws.services.glue.model.StartCrawlerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.StartCrawlerResult {
		return environment.glue.startCrawler(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue start-crawler")
				.argument("name", name)
	}

}


fun AWSGlueFunctions.startCrawlerSchedule(crawlerName: String, init: AWSGlueStartCrawlerScheduleCommand.() -> Unit): com.amazonaws.services.glue.model.StartCrawlerScheduleResult {
	return this.block.declare(AWSGlueStartCrawlerScheduleCommand(crawlerName).apply(init)) as com.amazonaws.services.glue.model.StartCrawlerScheduleResult
}

@Generated
class AWSGlueStartCrawlerScheduleCommand(val crawlerName: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.StartCrawlerScheduleRequest, com.amazonaws.services.glue.model.StartCrawlerScheduleResult> {



	override fun build(): com.amazonaws.services.glue.model.StartCrawlerScheduleRequest {
		val input = com.amazonaws.services.glue.model.StartCrawlerScheduleRequest()
		input.setCrawlerName(this.crawlerName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.StartCrawlerScheduleResult {
	  return com.amazonaws.services.glue.model.StartCrawlerScheduleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.StartCrawlerScheduleResult {
		return environment.glue.startCrawlerSchedule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue start-crawler-schedule")
				.argument("crawler-name", crawlerName)
	}

}


fun AWSGlueFunctions.startJobRun(jobName: String, init: AWSGlueStartJobRunCommand.() -> Unit): com.amazonaws.services.glue.model.StartJobRunResult {
	return this.block.declare(AWSGlueStartJobRunCommand(jobName).apply(init)) as com.amazonaws.services.glue.model.StartJobRunResult
}

@Generated
class AWSGlueStartJobRunCommand(val jobName: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.StartJobRunRequest, com.amazonaws.services.glue.model.StartJobRunResult> {

	var jobRunId: String? = null
	var arguments: Map<String, String>? = null
	var allocatedCapacity: Int? = 0

	override fun build(): com.amazonaws.services.glue.model.StartJobRunRequest {
		val input = com.amazonaws.services.glue.model.StartJobRunRequest()
		input.setJobName(this.jobName)
		input.setJobRunId(this.jobRunId)
		input.setArguments(this.arguments)
		input.setAllocatedCapacity(this.allocatedCapacity)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.StartJobRunResult {
	  return com.amazonaws.services.glue.model.StartJobRunResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.StartJobRunResult {
		return environment.glue.startJobRun(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue start-job-run")
				.argument("job-name", jobName)
				.argument("job-run-id", jobRunId)
				.argument("arguments", arguments?.toString())
				.argument("allocated-capacity", allocatedCapacity?.toString())
	}

}


fun AWSGlueFunctions.startTrigger(name: String, init: AWSGlueStartTriggerCommand.() -> Unit): com.amazonaws.services.glue.model.StartTriggerResult {
	return this.block.declare(AWSGlueStartTriggerCommand(name).apply(init)) as com.amazonaws.services.glue.model.StartTriggerResult
}

@Generated
class AWSGlueStartTriggerCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.StartTriggerRequest, com.amazonaws.services.glue.model.StartTriggerResult> {



	override fun build(): com.amazonaws.services.glue.model.StartTriggerRequest {
		val input = com.amazonaws.services.glue.model.StartTriggerRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.StartTriggerResult {
	  return com.amazonaws.services.glue.model.StartTriggerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.StartTriggerResult {
		return environment.glue.startTrigger(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue start-trigger")
				.argument("name", name)
	}

}


fun AWSGlueFunctions.stopCrawler(name: String, init: AWSGlueStopCrawlerCommand.() -> Unit): com.amazonaws.services.glue.model.StopCrawlerResult {
	return this.block.declare(AWSGlueStopCrawlerCommand(name).apply(init)) as com.amazonaws.services.glue.model.StopCrawlerResult
}

@Generated
class AWSGlueStopCrawlerCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.StopCrawlerRequest, com.amazonaws.services.glue.model.StopCrawlerResult> {



	override fun build(): com.amazonaws.services.glue.model.StopCrawlerRequest {
		val input = com.amazonaws.services.glue.model.StopCrawlerRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.StopCrawlerResult {
	  return com.amazonaws.services.glue.model.StopCrawlerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.StopCrawlerResult {
		return environment.glue.stopCrawler(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue stop-crawler")
				.argument("name", name)
	}

}


fun AWSGlueFunctions.stopCrawlerSchedule(crawlerName: String, init: AWSGlueStopCrawlerScheduleCommand.() -> Unit): com.amazonaws.services.glue.model.StopCrawlerScheduleResult {
	return this.block.declare(AWSGlueStopCrawlerScheduleCommand(crawlerName).apply(init)) as com.amazonaws.services.glue.model.StopCrawlerScheduleResult
}

@Generated
class AWSGlueStopCrawlerScheduleCommand(val crawlerName: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.StopCrawlerScheduleRequest, com.amazonaws.services.glue.model.StopCrawlerScheduleResult> {



	override fun build(): com.amazonaws.services.glue.model.StopCrawlerScheduleRequest {
		val input = com.amazonaws.services.glue.model.StopCrawlerScheduleRequest()
		input.setCrawlerName(this.crawlerName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.StopCrawlerScheduleResult {
	  return com.amazonaws.services.glue.model.StopCrawlerScheduleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.StopCrawlerScheduleResult {
		return environment.glue.stopCrawlerSchedule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue stop-crawler-schedule")
				.argument("crawler-name", crawlerName)
	}

}


fun AWSGlueFunctions.stopTrigger(name: String, init: AWSGlueStopTriggerCommand.() -> Unit): com.amazonaws.services.glue.model.StopTriggerResult {
	return this.block.declare(AWSGlueStopTriggerCommand(name).apply(init)) as com.amazonaws.services.glue.model.StopTriggerResult
}

@Generated
class AWSGlueStopTriggerCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.StopTriggerRequest, com.amazonaws.services.glue.model.StopTriggerResult> {



	override fun build(): com.amazonaws.services.glue.model.StopTriggerRequest {
		val input = com.amazonaws.services.glue.model.StopTriggerRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.StopTriggerResult {
	  return com.amazonaws.services.glue.model.StopTriggerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.StopTriggerResult {
		return environment.glue.stopTrigger(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue stop-trigger")
				.argument("name", name)
	}

}


fun AWSGlueFunctions.updateClassifier(init: AWSGlueUpdateClassifierCommand.() -> Unit): com.amazonaws.services.glue.model.UpdateClassifierResult {
	return this.block.declare(AWSGlueUpdateClassifierCommand().apply(init)) as com.amazonaws.services.glue.model.UpdateClassifierResult
}

@Generated
class AWSGlueUpdateClassifierCommand() : AmazonWebServiceCommand<com.amazonaws.services.glue.model.UpdateClassifierRequest, com.amazonaws.services.glue.model.UpdateClassifierResult> {

	var grokClassifier: com.amazonaws.services.glue.model.UpdateGrokClassifierRequest? = null
	var xMLClassifier: com.amazonaws.services.glue.model.UpdateXMLClassifierRequest? = null
	var jsonClassifier: com.amazonaws.services.glue.model.UpdateJsonClassifierRequest? = null

	override fun build(): com.amazonaws.services.glue.model.UpdateClassifierRequest {
		val input = com.amazonaws.services.glue.model.UpdateClassifierRequest()
		input.setGrokClassifier(this.grokClassifier)
		input.setXMLClassifier(this.xMLClassifier)
		input.setJsonClassifier(this.jsonClassifier)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.UpdateClassifierResult {
	  return com.amazonaws.services.glue.model.UpdateClassifierResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.UpdateClassifierResult {
		return environment.glue.updateClassifier(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue update-classifier")
				.argument("grok-classifier", grokClassifier?.toString())
				.argument("xmlclassifier", xMLClassifier?.toString())
				.argument("json-classifier", jsonClassifier?.toString())
	}

}


fun AWSGlueFunctions.updateConnection(name: String, connectionInput: com.amazonaws.services.glue.model.ConnectionInput, init: AWSGlueUpdateConnectionCommand.() -> Unit): com.amazonaws.services.glue.model.UpdateConnectionResult {
	return this.block.declare(AWSGlueUpdateConnectionCommand(name, connectionInput).apply(init)) as com.amazonaws.services.glue.model.UpdateConnectionResult
}

@Generated
class AWSGlueUpdateConnectionCommand(val name: String, val connectionInput: com.amazonaws.services.glue.model.ConnectionInput) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.UpdateConnectionRequest, com.amazonaws.services.glue.model.UpdateConnectionResult> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.UpdateConnectionRequest {
		val input = com.amazonaws.services.glue.model.UpdateConnectionRequest()
		input.setCatalogId(this.catalogId)
		input.setName(this.name)
		input.setConnectionInput(this.connectionInput)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.UpdateConnectionResult {
	  return com.amazonaws.services.glue.model.UpdateConnectionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.UpdateConnectionResult {
		return environment.glue.updateConnection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue update-connection")
				.argument("catalog-id", catalogId)
				.argument("name", name)
				.argument("connection-input", connectionInput.toString())
	}

}


fun AWSGlueFunctions.updateCrawler(name: String, init: AWSGlueUpdateCrawlerCommand.() -> Unit): com.amazonaws.services.glue.model.UpdateCrawlerResult {
	return this.block.declare(AWSGlueUpdateCrawlerCommand(name).apply(init)) as com.amazonaws.services.glue.model.UpdateCrawlerResult
}

@Generated
class AWSGlueUpdateCrawlerCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.UpdateCrawlerRequest, com.amazonaws.services.glue.model.UpdateCrawlerResult> {

	var role: String? = null
	var databaseName: String? = null
	var description: String? = null
	var targets: com.amazonaws.services.glue.model.CrawlerTargets? = null
	var schedule: String? = null
	var classifiers: List<String>? = null
	var tablePrefix: String? = null
	var schemaChangePolicy: com.amazonaws.services.glue.model.SchemaChangePolicy? = null
	var configuration: String? = null

	override fun build(): com.amazonaws.services.glue.model.UpdateCrawlerRequest {
		val input = com.amazonaws.services.glue.model.UpdateCrawlerRequest()
		input.setName(this.name)
		input.setRole(this.role)
		input.setDatabaseName(this.databaseName)
		input.setDescription(this.description)
		input.setTargets(this.targets)
		input.setSchedule(this.schedule)
		input.setClassifiers(this.classifiers)
		input.setTablePrefix(this.tablePrefix)
		input.setSchemaChangePolicy(this.schemaChangePolicy)
		input.setConfiguration(this.configuration)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.UpdateCrawlerResult {
	  return com.amazonaws.services.glue.model.UpdateCrawlerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.UpdateCrawlerResult {
		return environment.glue.updateCrawler(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue update-crawler")
				.argument("name", name)
				.argument("role", role)
				.argument("database-name", databaseName)
				.argument("description", description)
				.argument("targets", targets?.toString())
				.argument("schedule", schedule)
				.argument("classifiers", classifiers?.toString())
				.argument("table-prefix", tablePrefix)
				.argument("schema-change-policy", schemaChangePolicy?.toString())
				.argument("configuration", configuration)
	}

}


fun AWSGlueFunctions.updateCrawlerSchedule(crawlerName: String, init: AWSGlueUpdateCrawlerScheduleCommand.() -> Unit): com.amazonaws.services.glue.model.UpdateCrawlerScheduleResult {
	return this.block.declare(AWSGlueUpdateCrawlerScheduleCommand(crawlerName).apply(init)) as com.amazonaws.services.glue.model.UpdateCrawlerScheduleResult
}

@Generated
class AWSGlueUpdateCrawlerScheduleCommand(val crawlerName: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.UpdateCrawlerScheduleRequest, com.amazonaws.services.glue.model.UpdateCrawlerScheduleResult> {

	var schedule: String? = null

	override fun build(): com.amazonaws.services.glue.model.UpdateCrawlerScheduleRequest {
		val input = com.amazonaws.services.glue.model.UpdateCrawlerScheduleRequest()
		input.setCrawlerName(this.crawlerName)
		input.setSchedule(this.schedule)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.UpdateCrawlerScheduleResult {
	  return com.amazonaws.services.glue.model.UpdateCrawlerScheduleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.UpdateCrawlerScheduleResult {
		return environment.glue.updateCrawlerSchedule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue update-crawler-schedule")
				.argument("crawler-name", crawlerName)
				.argument("schedule", schedule)
	}

}


fun AWSGlueFunctions.updateDatabase(name: String, databaseInput: com.amazonaws.services.glue.model.DatabaseInput, init: AWSGlueUpdateDatabaseCommand.() -> Unit): com.amazonaws.services.glue.model.UpdateDatabaseResult {
	return this.block.declare(AWSGlueUpdateDatabaseCommand(name, databaseInput).apply(init)) as com.amazonaws.services.glue.model.UpdateDatabaseResult
}

@Generated
class AWSGlueUpdateDatabaseCommand(val name: String, val databaseInput: com.amazonaws.services.glue.model.DatabaseInput) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.UpdateDatabaseRequest, com.amazonaws.services.glue.model.UpdateDatabaseResult> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.UpdateDatabaseRequest {
		val input = com.amazonaws.services.glue.model.UpdateDatabaseRequest()
		input.setCatalogId(this.catalogId)
		input.setName(this.name)
		input.setDatabaseInput(this.databaseInput)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.UpdateDatabaseResult {
	  return com.amazonaws.services.glue.model.UpdateDatabaseResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.UpdateDatabaseResult {
		return environment.glue.updateDatabase(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue update-database")
				.argument("catalog-id", catalogId)
				.argument("name", name)
				.argument("database-input", databaseInput.toString())
	}

}


fun AWSGlueFunctions.updateDevEndpoint(endpointName: String, init: AWSGlueUpdateDevEndpointCommand.() -> Unit): com.amazonaws.services.glue.model.UpdateDevEndpointResult {
	return this.block.declare(AWSGlueUpdateDevEndpointCommand(endpointName).apply(init)) as com.amazonaws.services.glue.model.UpdateDevEndpointResult
}

@Generated
class AWSGlueUpdateDevEndpointCommand(val endpointName: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.UpdateDevEndpointRequest, com.amazonaws.services.glue.model.UpdateDevEndpointResult> {

	var publicKey: String? = null
	var customLibraries: com.amazonaws.services.glue.model.DevEndpointCustomLibraries? = null
	var updateEtlLibraries: Boolean? = false

	override fun build(): com.amazonaws.services.glue.model.UpdateDevEndpointRequest {
		val input = com.amazonaws.services.glue.model.UpdateDevEndpointRequest()
		input.setEndpointName(this.endpointName)
		input.setPublicKey(this.publicKey)
		input.setCustomLibraries(this.customLibraries)
		input.setUpdateEtlLibraries(this.updateEtlLibraries)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.UpdateDevEndpointResult {
	  return com.amazonaws.services.glue.model.UpdateDevEndpointResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.UpdateDevEndpointResult {
		return environment.glue.updateDevEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue update-dev-endpoint")
				.argument("endpoint-name", endpointName)
				.argument("public-key", publicKey)
				.argument("custom-libraries", customLibraries?.toString())
				.option("update-etl-libraries", updateEtlLibraries ?: false)
	}

}


fun AWSGlueFunctions.updateJob(jobName: String, jobUpdate: com.amazonaws.services.glue.model.JobUpdate, init: AWSGlueUpdateJobCommand.() -> Unit): com.amazonaws.services.glue.model.UpdateJobResult {
	return this.block.declare(AWSGlueUpdateJobCommand(jobName, jobUpdate).apply(init)) as com.amazonaws.services.glue.model.UpdateJobResult
}

@Generated
class AWSGlueUpdateJobCommand(val jobName: String, val jobUpdate: com.amazonaws.services.glue.model.JobUpdate) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.UpdateJobRequest, com.amazonaws.services.glue.model.UpdateJobResult> {



	override fun build(): com.amazonaws.services.glue.model.UpdateJobRequest {
		val input = com.amazonaws.services.glue.model.UpdateJobRequest()
		input.setJobName(this.jobName)
		input.setJobUpdate(this.jobUpdate)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.UpdateJobResult {
	  return com.amazonaws.services.glue.model.UpdateJobResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.UpdateJobResult {
		return environment.glue.updateJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue update-job")
				.argument("job-name", jobName)
				.argument("job-update", jobUpdate.toString())
	}

}


fun AWSGlueFunctions.updatePartition(databaseName: String, tableName: String, partitionValueList: List<String>, partitionInput: com.amazonaws.services.glue.model.PartitionInput, init: AWSGlueUpdatePartitionCommand.() -> Unit): com.amazonaws.services.glue.model.UpdatePartitionResult {
	return this.block.declare(AWSGlueUpdatePartitionCommand(databaseName, tableName, partitionValueList, partitionInput).apply(init)) as com.amazonaws.services.glue.model.UpdatePartitionResult
}

@Generated
class AWSGlueUpdatePartitionCommand(val databaseName: String, val tableName: String, val partitionValueList: List<String>, val partitionInput: com.amazonaws.services.glue.model.PartitionInput) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.UpdatePartitionRequest, com.amazonaws.services.glue.model.UpdatePartitionResult> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.UpdatePartitionRequest {
		val input = com.amazonaws.services.glue.model.UpdatePartitionRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseName(this.databaseName)
		input.setTableName(this.tableName)
		input.setPartitionValueList(this.partitionValueList)
		input.setPartitionInput(this.partitionInput)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.UpdatePartitionResult {
	  return com.amazonaws.services.glue.model.UpdatePartitionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.UpdatePartitionResult {
		return environment.glue.updatePartition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue update-partition")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("table-name", tableName)
				.argument("partition-value-list", partitionValueList.toString())
				.argument("partition-input", partitionInput.toString())
	}

}


fun AWSGlueFunctions.updateTable(databaseName: String, tableInput: com.amazonaws.services.glue.model.TableInput, init: AWSGlueUpdateTableCommand.() -> Unit): com.amazonaws.services.glue.model.UpdateTableResult {
	return this.block.declare(AWSGlueUpdateTableCommand(databaseName, tableInput).apply(init)) as com.amazonaws.services.glue.model.UpdateTableResult
}

@Generated
class AWSGlueUpdateTableCommand(val databaseName: String, val tableInput: com.amazonaws.services.glue.model.TableInput) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.UpdateTableRequest, com.amazonaws.services.glue.model.UpdateTableResult> {

	var catalogId: String? = null
	var skipArchive: Boolean? = false

	override fun build(): com.amazonaws.services.glue.model.UpdateTableRequest {
		val input = com.amazonaws.services.glue.model.UpdateTableRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseName(this.databaseName)
		input.setTableInput(this.tableInput)
		input.setSkipArchive(this.skipArchive)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.UpdateTableResult {
	  return com.amazonaws.services.glue.model.UpdateTableResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.UpdateTableResult {
		return environment.glue.updateTable(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue update-table")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("table-input", tableInput.toString())
				.option("skip-archive", skipArchive ?: false)
	}

}


fun AWSGlueFunctions.updateTrigger(name: String, triggerUpdate: com.amazonaws.services.glue.model.TriggerUpdate, init: AWSGlueUpdateTriggerCommand.() -> Unit): com.amazonaws.services.glue.model.UpdateTriggerResult {
	return this.block.declare(AWSGlueUpdateTriggerCommand(name, triggerUpdate).apply(init)) as com.amazonaws.services.glue.model.UpdateTriggerResult
}

@Generated
class AWSGlueUpdateTriggerCommand(val name: String, val triggerUpdate: com.amazonaws.services.glue.model.TriggerUpdate) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.UpdateTriggerRequest, com.amazonaws.services.glue.model.UpdateTriggerResult> {



	override fun build(): com.amazonaws.services.glue.model.UpdateTriggerRequest {
		val input = com.amazonaws.services.glue.model.UpdateTriggerRequest()
		input.setName(this.name)
		input.setTriggerUpdate(this.triggerUpdate)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.UpdateTriggerResult {
	  return com.amazonaws.services.glue.model.UpdateTriggerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.UpdateTriggerResult {
		return environment.glue.updateTrigger(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue update-trigger")
				.argument("name", name)
				.argument("trigger-update", triggerUpdate.toString())
	}

}


fun AWSGlueFunctions.updateUserDefinedFunction(databaseName: String, functionName: String, functionInput: com.amazonaws.services.glue.model.UserDefinedFunctionInput, init: AWSGlueUpdateUserDefinedFunctionCommand.() -> Unit): com.amazonaws.services.glue.model.UpdateUserDefinedFunctionResult {
	return this.block.declare(AWSGlueUpdateUserDefinedFunctionCommand(databaseName, functionName, functionInput).apply(init)) as com.amazonaws.services.glue.model.UpdateUserDefinedFunctionResult
}

@Generated
class AWSGlueUpdateUserDefinedFunctionCommand(val databaseName: String, val functionName: String, val functionInput: com.amazonaws.services.glue.model.UserDefinedFunctionInput) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.UpdateUserDefinedFunctionRequest, com.amazonaws.services.glue.model.UpdateUserDefinedFunctionResult> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.UpdateUserDefinedFunctionRequest {
		val input = com.amazonaws.services.glue.model.UpdateUserDefinedFunctionRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseName(this.databaseName)
		input.setFunctionName(this.functionName)
		input.setFunctionInput(this.functionInput)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glue.model.UpdateUserDefinedFunctionResult {
	  return com.amazonaws.services.glue.model.UpdateUserDefinedFunctionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.glue.model.UpdateUserDefinedFunctionResult {
		return environment.glue.updateUserDefinedFunction(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue update-user-defined-function")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("function-name", functionName)
				.argument("function-input", functionInput.toString())
	}

}
