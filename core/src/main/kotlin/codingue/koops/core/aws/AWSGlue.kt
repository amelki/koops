
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.glue.AWSGlue
import com.amazonaws.services.glue.model.*

var codingue.koops.core.Environment.glue: AWSGlue
	get() = this.capabilities[AWSGlue::class.java.name] as AWSGlue
	set(glue) {
		this.capabilities[AWSGlue::class.java.name] = glue
	}

@Generated
class AWSGlueFunctions(val block: Block)

infix fun AwsContinuation.glue(init: AWSGlueFunctions.() -> Unit) {
	AWSGlueFunctions(shell).apply(init)
}

			

fun AWSGlueFunctions.batchCreatePartition(databaseName: String, tableName: String, partitionInputList: List<com.amazonaws.services.glue.model.PartitionInput>, init: AWSGlueBatchCreatePartitionCommand.() -> Unit) {
	this.block.declare(AWSGlueBatchCreatePartitionCommand(databaseName, tableName, partitionInputList).apply(init))
}

@Generated
class AWSGlueBatchCreatePartitionCommand(val databaseName: String, val tableName: String, val partitionInputList: List<com.amazonaws.services.glue.model.PartitionInput>) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.BatchCreatePartitionRequest> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.BatchCreatePartitionRequest {
		val input = com.amazonaws.services.glue.model.BatchCreatePartitionRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseName(this.databaseName)
		input.setTableName(this.tableName)
		input.setPartitionInputList(this.partitionInputList)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.batchCreatePartition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue batch-create-partition")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("table-name", tableName)
				.argument("partition-input-list", partitionInputList.toString())
	}

}


fun AWSGlueFunctions.batchDeleteConnection(connectionNameList: List<String>, init: AWSGlueBatchDeleteConnectionCommand.() -> Unit) {
	this.block.declare(AWSGlueBatchDeleteConnectionCommand(connectionNameList).apply(init))
}

@Generated
class AWSGlueBatchDeleteConnectionCommand(val connectionNameList: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.BatchDeleteConnectionRequest> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.BatchDeleteConnectionRequest {
		val input = com.amazonaws.services.glue.model.BatchDeleteConnectionRequest()
		input.setCatalogId(this.catalogId)
		input.setConnectionNameList(this.connectionNameList)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.batchDeleteConnection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue batch-delete-connection")
				.argument("catalog-id", catalogId)
				.argument("connection-name-list", connectionNameList.toString())
	}

}


fun AWSGlueFunctions.batchDeletePartition(databaseName: String, tableName: String, partitionsToDelete: List<com.amazonaws.services.glue.model.PartitionValueList>, init: AWSGlueBatchDeletePartitionCommand.() -> Unit) {
	this.block.declare(AWSGlueBatchDeletePartitionCommand(databaseName, tableName, partitionsToDelete).apply(init))
}

@Generated
class AWSGlueBatchDeletePartitionCommand(val databaseName: String, val tableName: String, val partitionsToDelete: List<com.amazonaws.services.glue.model.PartitionValueList>) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.BatchDeletePartitionRequest> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.BatchDeletePartitionRequest {
		val input = com.amazonaws.services.glue.model.BatchDeletePartitionRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseName(this.databaseName)
		input.setTableName(this.tableName)
		input.setPartitionsToDelete(this.partitionsToDelete)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.batchDeletePartition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue batch-delete-partition")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("table-name", tableName)
				.argument("partitions-to-delete", partitionsToDelete.toString())
	}

}


fun AWSGlueFunctions.batchDeleteTable(databaseName: String, tablesToDelete: List<String>, init: AWSGlueBatchDeleteTableCommand.() -> Unit) {
	this.block.declare(AWSGlueBatchDeleteTableCommand(databaseName, tablesToDelete).apply(init))
}

@Generated
class AWSGlueBatchDeleteTableCommand(val databaseName: String, val tablesToDelete: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.BatchDeleteTableRequest> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.BatchDeleteTableRequest {
		val input = com.amazonaws.services.glue.model.BatchDeleteTableRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseName(this.databaseName)
		input.setTablesToDelete(this.tablesToDelete)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.batchDeleteTable(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue batch-delete-table")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("tables-to-delete", tablesToDelete.toString())
	}

}


fun AWSGlueFunctions.batchDeleteTableVersion(databaseName: String, tableName: String, versionIds: List<String>, init: AWSGlueBatchDeleteTableVersionCommand.() -> Unit) {
	this.block.declare(AWSGlueBatchDeleteTableVersionCommand(databaseName, tableName, versionIds).apply(init))
}

@Generated
class AWSGlueBatchDeleteTableVersionCommand(val databaseName: String, val tableName: String, val versionIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.BatchDeleteTableVersionRequest> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.BatchDeleteTableVersionRequest {
		val input = com.amazonaws.services.glue.model.BatchDeleteTableVersionRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseName(this.databaseName)
		input.setTableName(this.tableName)
		input.setVersionIds(this.versionIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.batchDeleteTableVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue batch-delete-table-version")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("table-name", tableName)
				.argument("version-ids", versionIds.toString())
	}

}


fun AWSGlueFunctions.batchGetPartition(databaseName: String, tableName: String, partitionsToGet: List<com.amazonaws.services.glue.model.PartitionValueList>, init: AWSGlueBatchGetPartitionCommand.() -> Unit) {
	this.block.declare(AWSGlueBatchGetPartitionCommand(databaseName, tableName, partitionsToGet).apply(init))
}

@Generated
class AWSGlueBatchGetPartitionCommand(val databaseName: String, val tableName: String, val partitionsToGet: List<com.amazonaws.services.glue.model.PartitionValueList>) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.BatchGetPartitionRequest> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.BatchGetPartitionRequest {
		val input = com.amazonaws.services.glue.model.BatchGetPartitionRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseName(this.databaseName)
		input.setTableName(this.tableName)
		input.setPartitionsToGet(this.partitionsToGet)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.batchGetPartition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue batch-get-partition")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("table-name", tableName)
				.argument("partitions-to-get", partitionsToGet.toString())
	}

}


fun AWSGlueFunctions.batchStopJobRun(jobName: String, jobRunIds: List<String>, init: AWSGlueBatchStopJobRunCommand.() -> Unit) {
	this.block.declare(AWSGlueBatchStopJobRunCommand(jobName, jobRunIds).apply(init))
}

@Generated
class AWSGlueBatchStopJobRunCommand(val jobName: String, val jobRunIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.BatchStopJobRunRequest> {



	override fun build(): com.amazonaws.services.glue.model.BatchStopJobRunRequest {
		val input = com.amazonaws.services.glue.model.BatchStopJobRunRequest()
		input.setJobName(this.jobName)
		input.setJobRunIds(this.jobRunIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.batchStopJobRun(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue batch-stop-job-run")
				.argument("job-name", jobName)
				.argument("job-run-ids", jobRunIds.toString())
	}

}


fun AWSGlueFunctions.createClassifier(init: AWSGlueCreateClassifierCommand.() -> Unit) {
	this.block.declare(AWSGlueCreateClassifierCommand().apply(init))
}

@Generated
class AWSGlueCreateClassifierCommand() : AmazonWebServiceCommand<com.amazonaws.services.glue.model.CreateClassifierRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.createClassifier(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue create-classifier")
				.argument("grok-classifier", grokClassifier?.toString())
				.argument("xmlclassifier", xMLClassifier?.toString())
				.argument("json-classifier", jsonClassifier?.toString())
	}

}


fun AWSGlueFunctions.createConnection(connectionInput: com.amazonaws.services.glue.model.ConnectionInput, init: AWSGlueCreateConnectionCommand.() -> Unit) {
	this.block.declare(AWSGlueCreateConnectionCommand(connectionInput).apply(init))
}

@Generated
class AWSGlueCreateConnectionCommand(val connectionInput: com.amazonaws.services.glue.model.ConnectionInput) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.CreateConnectionRequest> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.CreateConnectionRequest {
		val input = com.amazonaws.services.glue.model.CreateConnectionRequest()
		input.setCatalogId(this.catalogId)
		input.setConnectionInput(this.connectionInput)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.createConnection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue create-connection")
				.argument("catalog-id", catalogId)
				.argument("connection-input", connectionInput.toString())
	}

}


fun AWSGlueFunctions.createCrawler(name: String, role: String, databaseName: String, targets: com.amazonaws.services.glue.model.CrawlerTargets, init: AWSGlueCreateCrawlerCommand.() -> Unit) {
	this.block.declare(AWSGlueCreateCrawlerCommand(name, role, databaseName, targets).apply(init))
}

@Generated
class AWSGlueCreateCrawlerCommand(val name: String, val role: String, val databaseName: String, val targets: com.amazonaws.services.glue.model.CrawlerTargets) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.CreateCrawlerRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.createCrawler(build())
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


fun AWSGlueFunctions.createDatabase(databaseInput: com.amazonaws.services.glue.model.DatabaseInput, init: AWSGlueCreateDatabaseCommand.() -> Unit) {
	this.block.declare(AWSGlueCreateDatabaseCommand(databaseInput).apply(init))
}

@Generated
class AWSGlueCreateDatabaseCommand(val databaseInput: com.amazonaws.services.glue.model.DatabaseInput) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.CreateDatabaseRequest> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.CreateDatabaseRequest {
		val input = com.amazonaws.services.glue.model.CreateDatabaseRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseInput(this.databaseInput)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.createDatabase(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue create-database")
				.argument("catalog-id", catalogId)
				.argument("database-input", databaseInput.toString())
	}

}


fun AWSGlueFunctions.createDevEndpoint(endpointName: String, roleArn: String, init: AWSGlueCreateDevEndpointCommand.() -> Unit) {
	this.block.declare(AWSGlueCreateDevEndpointCommand(endpointName, roleArn).apply(init))
}

@Generated
class AWSGlueCreateDevEndpointCommand(val endpointName: String, val roleArn: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.CreateDevEndpointRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.createDevEndpoint(build())
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


fun AWSGlueFunctions.createJob(name: String, role: String, command: com.amazonaws.services.glue.model.JobCommand, init: AWSGlueCreateJobCommand.() -> Unit) {
	this.block.declare(AWSGlueCreateJobCommand(name, role, command).apply(init))
}

@Generated
class AWSGlueCreateJobCommand(val name: String, val role: String, val command: com.amazonaws.services.glue.model.JobCommand) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.CreateJobRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.createJob(build())
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


fun AWSGlueFunctions.createPartition(databaseName: String, tableName: String, partitionInput: com.amazonaws.services.glue.model.PartitionInput, init: AWSGlueCreatePartitionCommand.() -> Unit) {
	this.block.declare(AWSGlueCreatePartitionCommand(databaseName, tableName, partitionInput).apply(init))
}

@Generated
class AWSGlueCreatePartitionCommand(val databaseName: String, val tableName: String, val partitionInput: com.amazonaws.services.glue.model.PartitionInput) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.CreatePartitionRequest> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.CreatePartitionRequest {
		val input = com.amazonaws.services.glue.model.CreatePartitionRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseName(this.databaseName)
		input.setTableName(this.tableName)
		input.setPartitionInput(this.partitionInput)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.createPartition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue create-partition")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("table-name", tableName)
				.argument("partition-input", partitionInput.toString())
	}

}


fun AWSGlueFunctions.createScript(init: AWSGlueCreateScriptCommand.() -> Unit) {
	this.block.declare(AWSGlueCreateScriptCommand().apply(init))
}

@Generated
class AWSGlueCreateScriptCommand() : AmazonWebServiceCommand<com.amazonaws.services.glue.model.CreateScriptRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.createScript(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue create-script")
				.argument("dag-nodes", dagNodes?.toString())
				.argument("dag-edges", dagEdges?.toString())
				.argument("language", language?.toString())
	}

}


fun AWSGlueFunctions.createTable(databaseName: String, tableInput: com.amazonaws.services.glue.model.TableInput, init: AWSGlueCreateTableCommand.() -> Unit) {
	this.block.declare(AWSGlueCreateTableCommand(databaseName, tableInput).apply(init))
}

@Generated
class AWSGlueCreateTableCommand(val databaseName: String, val tableInput: com.amazonaws.services.glue.model.TableInput) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.CreateTableRequest> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.CreateTableRequest {
		val input = com.amazonaws.services.glue.model.CreateTableRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseName(this.databaseName)
		input.setTableInput(this.tableInput)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.createTable(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue create-table")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("table-input", tableInput.toString())
	}

}


fun AWSGlueFunctions.createTrigger(name: String, type: TriggerType, actions: List<com.amazonaws.services.glue.model.Action>, init: AWSGlueCreateTriggerCommand.() -> Unit) {
	this.block.declare(AWSGlueCreateTriggerCommand(name, type, actions).apply(init))
}

@Generated
class AWSGlueCreateTriggerCommand(val name: String, val type: TriggerType, val actions: List<com.amazonaws.services.glue.model.Action>) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.CreateTriggerRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.createTrigger(build())
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


fun AWSGlueFunctions.createUserDefinedFunction(databaseName: String, functionInput: com.amazonaws.services.glue.model.UserDefinedFunctionInput, init: AWSGlueCreateUserDefinedFunctionCommand.() -> Unit) {
	this.block.declare(AWSGlueCreateUserDefinedFunctionCommand(databaseName, functionInput).apply(init))
}

@Generated
class AWSGlueCreateUserDefinedFunctionCommand(val databaseName: String, val functionInput: com.amazonaws.services.glue.model.UserDefinedFunctionInput) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.CreateUserDefinedFunctionRequest> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.CreateUserDefinedFunctionRequest {
		val input = com.amazonaws.services.glue.model.CreateUserDefinedFunctionRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseName(this.databaseName)
		input.setFunctionInput(this.functionInput)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.createUserDefinedFunction(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue create-user-defined-function")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("function-input", functionInput.toString())
	}

}


fun AWSGlueFunctions.deleteClassifier(name: String, init: AWSGlueDeleteClassifierCommand.() -> Unit) {
	this.block.declare(AWSGlueDeleteClassifierCommand(name).apply(init))
}

@Generated
class AWSGlueDeleteClassifierCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.DeleteClassifierRequest> {



	override fun build(): com.amazonaws.services.glue.model.DeleteClassifierRequest {
		val input = com.amazonaws.services.glue.model.DeleteClassifierRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.deleteClassifier(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue delete-classifier")
				.argument("name", name)
	}

}


fun AWSGlueFunctions.deleteConnection(connectionName: String, init: AWSGlueDeleteConnectionCommand.() -> Unit) {
	this.block.declare(AWSGlueDeleteConnectionCommand(connectionName).apply(init))
}

@Generated
class AWSGlueDeleteConnectionCommand(val connectionName: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.DeleteConnectionRequest> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.DeleteConnectionRequest {
		val input = com.amazonaws.services.glue.model.DeleteConnectionRequest()
		input.setCatalogId(this.catalogId)
		input.setConnectionName(this.connectionName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.deleteConnection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue delete-connection")
				.argument("catalog-id", catalogId)
				.argument("connection-name", connectionName)
	}

}


fun AWSGlueFunctions.deleteCrawler(name: String, init: AWSGlueDeleteCrawlerCommand.() -> Unit) {
	this.block.declare(AWSGlueDeleteCrawlerCommand(name).apply(init))
}

@Generated
class AWSGlueDeleteCrawlerCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.DeleteCrawlerRequest> {



	override fun build(): com.amazonaws.services.glue.model.DeleteCrawlerRequest {
		val input = com.amazonaws.services.glue.model.DeleteCrawlerRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.deleteCrawler(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue delete-crawler")
				.argument("name", name)
	}

}


fun AWSGlueFunctions.deleteDatabase(name: String, init: AWSGlueDeleteDatabaseCommand.() -> Unit) {
	this.block.declare(AWSGlueDeleteDatabaseCommand(name).apply(init))
}

@Generated
class AWSGlueDeleteDatabaseCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.DeleteDatabaseRequest> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.DeleteDatabaseRequest {
		val input = com.amazonaws.services.glue.model.DeleteDatabaseRequest()
		input.setCatalogId(this.catalogId)
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.deleteDatabase(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue delete-database")
				.argument("catalog-id", catalogId)
				.argument("name", name)
	}

}


fun AWSGlueFunctions.deleteDevEndpoint(endpointName: String, init: AWSGlueDeleteDevEndpointCommand.() -> Unit) {
	this.block.declare(AWSGlueDeleteDevEndpointCommand(endpointName).apply(init))
}

@Generated
class AWSGlueDeleteDevEndpointCommand(val endpointName: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.DeleteDevEndpointRequest> {



	override fun build(): com.amazonaws.services.glue.model.DeleteDevEndpointRequest {
		val input = com.amazonaws.services.glue.model.DeleteDevEndpointRequest()
		input.setEndpointName(this.endpointName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.deleteDevEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue delete-dev-endpoint")
				.argument("endpoint-name", endpointName)
	}

}


fun AWSGlueFunctions.deleteJob(jobName: String, init: AWSGlueDeleteJobCommand.() -> Unit) {
	this.block.declare(AWSGlueDeleteJobCommand(jobName).apply(init))
}

@Generated
class AWSGlueDeleteJobCommand(val jobName: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.DeleteJobRequest> {



	override fun build(): com.amazonaws.services.glue.model.DeleteJobRequest {
		val input = com.amazonaws.services.glue.model.DeleteJobRequest()
		input.setJobName(this.jobName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.deleteJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue delete-job")
				.argument("job-name", jobName)
	}

}


fun AWSGlueFunctions.deletePartition(databaseName: String, tableName: String, partitionValues: List<String>, init: AWSGlueDeletePartitionCommand.() -> Unit) {
	this.block.declare(AWSGlueDeletePartitionCommand(databaseName, tableName, partitionValues).apply(init))
}

@Generated
class AWSGlueDeletePartitionCommand(val databaseName: String, val tableName: String, val partitionValues: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.DeletePartitionRequest> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.DeletePartitionRequest {
		val input = com.amazonaws.services.glue.model.DeletePartitionRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseName(this.databaseName)
		input.setTableName(this.tableName)
		input.setPartitionValues(this.partitionValues)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.deletePartition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue delete-partition")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("table-name", tableName)
				.argument("partition-values", partitionValues.toString())
	}

}


fun AWSGlueFunctions.deleteTable(databaseName: String, name: String, init: AWSGlueDeleteTableCommand.() -> Unit) {
	this.block.declare(AWSGlueDeleteTableCommand(databaseName, name).apply(init))
}

@Generated
class AWSGlueDeleteTableCommand(val databaseName: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.DeleteTableRequest> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.DeleteTableRequest {
		val input = com.amazonaws.services.glue.model.DeleteTableRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseName(this.databaseName)
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.deleteTable(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue delete-table")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("name", name)
	}

}


fun AWSGlueFunctions.deleteTableVersion(databaseName: String, tableName: String, versionId: String, init: AWSGlueDeleteTableVersionCommand.() -> Unit) {
	this.block.declare(AWSGlueDeleteTableVersionCommand(databaseName, tableName, versionId).apply(init))
}

@Generated
class AWSGlueDeleteTableVersionCommand(val databaseName: String, val tableName: String, val versionId: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.DeleteTableVersionRequest> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.DeleteTableVersionRequest {
		val input = com.amazonaws.services.glue.model.DeleteTableVersionRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseName(this.databaseName)
		input.setTableName(this.tableName)
		input.setVersionId(this.versionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.deleteTableVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue delete-table-version")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("table-name", tableName)
				.argument("version-id", versionId)
	}

}


fun AWSGlueFunctions.deleteTrigger(name: String, init: AWSGlueDeleteTriggerCommand.() -> Unit) {
	this.block.declare(AWSGlueDeleteTriggerCommand(name).apply(init))
}

@Generated
class AWSGlueDeleteTriggerCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.DeleteTriggerRequest> {



	override fun build(): com.amazonaws.services.glue.model.DeleteTriggerRequest {
		val input = com.amazonaws.services.glue.model.DeleteTriggerRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.deleteTrigger(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue delete-trigger")
				.argument("name", name)
	}

}


fun AWSGlueFunctions.deleteUserDefinedFunction(databaseName: String, functionName: String, init: AWSGlueDeleteUserDefinedFunctionCommand.() -> Unit) {
	this.block.declare(AWSGlueDeleteUserDefinedFunctionCommand(databaseName, functionName).apply(init))
}

@Generated
class AWSGlueDeleteUserDefinedFunctionCommand(val databaseName: String, val functionName: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.DeleteUserDefinedFunctionRequest> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.DeleteUserDefinedFunctionRequest {
		val input = com.amazonaws.services.glue.model.DeleteUserDefinedFunctionRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseName(this.databaseName)
		input.setFunctionName(this.functionName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.deleteUserDefinedFunction(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue delete-user-defined-function")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("function-name", functionName)
	}

}


fun AWSGlueFunctions.getCatalogImportStatus(init: AWSGlueGetCatalogImportStatusCommand.() -> Unit) {
	this.block.declare(AWSGlueGetCatalogImportStatusCommand().apply(init))
}

@Generated
class AWSGlueGetCatalogImportStatusCommand() : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetCatalogImportStatusRequest> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.GetCatalogImportStatusRequest {
		val input = com.amazonaws.services.glue.model.GetCatalogImportStatusRequest()
		input.setCatalogId(this.catalogId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.getCatalogImportStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-catalog-import-status")
				.argument("catalog-id", catalogId)
	}

}


fun AWSGlueFunctions.getClassifier(name: String, init: AWSGlueGetClassifierCommand.() -> Unit) {
	this.block.declare(AWSGlueGetClassifierCommand(name).apply(init))
}

@Generated
class AWSGlueGetClassifierCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetClassifierRequest> {



	override fun build(): com.amazonaws.services.glue.model.GetClassifierRequest {
		val input = com.amazonaws.services.glue.model.GetClassifierRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.getClassifier(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-classifier")
				.argument("name", name)
	}

}


fun AWSGlueFunctions.getClassifiers(init: AWSGlueGetClassifiersCommand.() -> Unit) {
	this.block.declare(AWSGlueGetClassifiersCommand().apply(init))
}

@Generated
class AWSGlueGetClassifiersCommand() : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetClassifiersRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.glue.model.GetClassifiersRequest {
		val input = com.amazonaws.services.glue.model.GetClassifiersRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.getClassifiers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-classifiers")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSGlueFunctions.getConnection(name: String, init: AWSGlueGetConnectionCommand.() -> Unit) {
	this.block.declare(AWSGlueGetConnectionCommand(name).apply(init))
}

@Generated
class AWSGlueGetConnectionCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetConnectionRequest> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.GetConnectionRequest {
		val input = com.amazonaws.services.glue.model.GetConnectionRequest()
		input.setCatalogId(this.catalogId)
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.getConnection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-connection")
				.argument("catalog-id", catalogId)
				.argument("name", name)
	}

}


fun AWSGlueFunctions.getConnections(init: AWSGlueGetConnectionsCommand.() -> Unit) {
	this.block.declare(AWSGlueGetConnectionsCommand().apply(init))
}

@Generated
class AWSGlueGetConnectionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetConnectionsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.getConnections(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-connections")
				.argument("catalog-id", catalogId)
				.argument("filter", filter?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSGlueFunctions.getCrawler(name: String, init: AWSGlueGetCrawlerCommand.() -> Unit) {
	this.block.declare(AWSGlueGetCrawlerCommand(name).apply(init))
}

@Generated
class AWSGlueGetCrawlerCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetCrawlerRequest> {



	override fun build(): com.amazonaws.services.glue.model.GetCrawlerRequest {
		val input = com.amazonaws.services.glue.model.GetCrawlerRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.getCrawler(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-crawler")
				.argument("name", name)
	}

}


fun AWSGlueFunctions.getCrawlerMetrics(init: AWSGlueGetCrawlerMetricsCommand.() -> Unit) {
	this.block.declare(AWSGlueGetCrawlerMetricsCommand().apply(init))
}

@Generated
class AWSGlueGetCrawlerMetricsCommand() : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetCrawlerMetricsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.getCrawlerMetrics(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-crawler-metrics")
				.argument("crawler-name-list", crawlerNameList?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSGlueFunctions.getCrawlers(init: AWSGlueGetCrawlersCommand.() -> Unit) {
	this.block.declare(AWSGlueGetCrawlersCommand().apply(init))
}

@Generated
class AWSGlueGetCrawlersCommand() : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetCrawlersRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.glue.model.GetCrawlersRequest {
		val input = com.amazonaws.services.glue.model.GetCrawlersRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.getCrawlers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-crawlers")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSGlueFunctions.getDatabase(name: String, init: AWSGlueGetDatabaseCommand.() -> Unit) {
	this.block.declare(AWSGlueGetDatabaseCommand(name).apply(init))
}

@Generated
class AWSGlueGetDatabaseCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetDatabaseRequest> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.GetDatabaseRequest {
		val input = com.amazonaws.services.glue.model.GetDatabaseRequest()
		input.setCatalogId(this.catalogId)
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.getDatabase(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-database")
				.argument("catalog-id", catalogId)
				.argument("name", name)
	}

}


fun AWSGlueFunctions.getDatabases(init: AWSGlueGetDatabasesCommand.() -> Unit) {
	this.block.declare(AWSGlueGetDatabasesCommand().apply(init))
}

@Generated
class AWSGlueGetDatabasesCommand() : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetDatabasesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.getDatabases(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-databases")
				.argument("catalog-id", catalogId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSGlueFunctions.getDataflowGraph(init: AWSGlueGetDataflowGraphCommand.() -> Unit) {
	this.block.declare(AWSGlueGetDataflowGraphCommand().apply(init))
}

@Generated
class AWSGlueGetDataflowGraphCommand() : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetDataflowGraphRequest> {

	var pythonScript: String? = null

	override fun build(): com.amazonaws.services.glue.model.GetDataflowGraphRequest {
		val input = com.amazonaws.services.glue.model.GetDataflowGraphRequest()
		input.setPythonScript(this.pythonScript)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.getDataflowGraph(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-dataflow-graph")
				.argument("python-script", pythonScript)
	}

}


fun AWSGlueFunctions.getDevEndpoint(endpointName: String, init: AWSGlueGetDevEndpointCommand.() -> Unit) {
	this.block.declare(AWSGlueGetDevEndpointCommand(endpointName).apply(init))
}

@Generated
class AWSGlueGetDevEndpointCommand(val endpointName: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetDevEndpointRequest> {



	override fun build(): com.amazonaws.services.glue.model.GetDevEndpointRequest {
		val input = com.amazonaws.services.glue.model.GetDevEndpointRequest()
		input.setEndpointName(this.endpointName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.getDevEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-dev-endpoint")
				.argument("endpoint-name", endpointName)
	}

}


fun AWSGlueFunctions.getDevEndpoints(init: AWSGlueGetDevEndpointsCommand.() -> Unit) {
	this.block.declare(AWSGlueGetDevEndpointsCommand().apply(init))
}

@Generated
class AWSGlueGetDevEndpointsCommand() : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetDevEndpointsRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.glue.model.GetDevEndpointsRequest {
		val input = com.amazonaws.services.glue.model.GetDevEndpointsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.getDevEndpoints(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-dev-endpoints")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSGlueFunctions.getJob(jobName: String, init: AWSGlueGetJobCommand.() -> Unit) {
	this.block.declare(AWSGlueGetJobCommand(jobName).apply(init))
}

@Generated
class AWSGlueGetJobCommand(val jobName: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetJobRequest> {



	override fun build(): com.amazonaws.services.glue.model.GetJobRequest {
		val input = com.amazonaws.services.glue.model.GetJobRequest()
		input.setJobName(this.jobName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.getJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-job")
				.argument("job-name", jobName)
	}

}


fun AWSGlueFunctions.getJobRun(jobName: String, runId: String, init: AWSGlueGetJobRunCommand.() -> Unit) {
	this.block.declare(AWSGlueGetJobRunCommand(jobName, runId).apply(init))
}

@Generated
class AWSGlueGetJobRunCommand(val jobName: String, val runId: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetJobRunRequest> {

	var predecessorsIncluded: Boolean? = false

	override fun build(): com.amazonaws.services.glue.model.GetJobRunRequest {
		val input = com.amazonaws.services.glue.model.GetJobRunRequest()
		input.setJobName(this.jobName)
		input.setRunId(this.runId)
		input.setPredecessorsIncluded(this.predecessorsIncluded)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.getJobRun(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-job-run")
				.argument("job-name", jobName)
				.argument("run-id", runId)
				.option("predecessors-included", predecessorsIncluded ?: false)
	}

}


fun AWSGlueFunctions.getJobRuns(jobName: String, init: AWSGlueGetJobRunsCommand.() -> Unit) {
	this.block.declare(AWSGlueGetJobRunsCommand(jobName).apply(init))
}

@Generated
class AWSGlueGetJobRunsCommand(val jobName: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetJobRunsRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.glue.model.GetJobRunsRequest {
		val input = com.amazonaws.services.glue.model.GetJobRunsRequest()
		input.setJobName(this.jobName)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.getJobRuns(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-job-runs")
				.argument("job-name", jobName)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSGlueFunctions.getJobs(init: AWSGlueGetJobsCommand.() -> Unit) {
	this.block.declare(AWSGlueGetJobsCommand().apply(init))
}

@Generated
class AWSGlueGetJobsCommand() : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetJobsRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.glue.model.GetJobsRequest {
		val input = com.amazonaws.services.glue.model.GetJobsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.getJobs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-jobs")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSGlueFunctions.getMapping(source: com.amazonaws.services.glue.model.CatalogEntry, init: AWSGlueGetMappingCommand.() -> Unit) {
	this.block.declare(AWSGlueGetMappingCommand(source).apply(init))
}

@Generated
class AWSGlueGetMappingCommand(val source: com.amazonaws.services.glue.model.CatalogEntry) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetMappingRequest> {

	var sinks: List<com.amazonaws.services.glue.model.CatalogEntry>? = null
	var location: com.amazonaws.services.glue.model.Location? = null

	override fun build(): com.amazonaws.services.glue.model.GetMappingRequest {
		val input = com.amazonaws.services.glue.model.GetMappingRequest()
		input.setSource(this.source)
		input.setSinks(this.sinks)
		input.setLocation(this.location)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.getMapping(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-mapping")
				.argument("source", source.toString())
				.argument("sinks", sinks?.toString())
				.argument("location", location?.toString())
	}

}


fun AWSGlueFunctions.getPartition(databaseName: String, tableName: String, partitionValues: List<String>, init: AWSGlueGetPartitionCommand.() -> Unit) {
	this.block.declare(AWSGlueGetPartitionCommand(databaseName, tableName, partitionValues).apply(init))
}

@Generated
class AWSGlueGetPartitionCommand(val databaseName: String, val tableName: String, val partitionValues: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetPartitionRequest> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.GetPartitionRequest {
		val input = com.amazonaws.services.glue.model.GetPartitionRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseName(this.databaseName)
		input.setTableName(this.tableName)
		input.setPartitionValues(this.partitionValues)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.getPartition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-partition")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("table-name", tableName)
				.argument("partition-values", partitionValues.toString())
	}

}


fun AWSGlueFunctions.getPartitions(databaseName: String, tableName: String, init: AWSGlueGetPartitionsCommand.() -> Unit) {
	this.block.declare(AWSGlueGetPartitionsCommand(databaseName, tableName).apply(init))
}

@Generated
class AWSGlueGetPartitionsCommand(val databaseName: String, val tableName: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetPartitionsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.getPartitions(build())
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


fun AWSGlueFunctions.getPlan(mapping: List<com.amazonaws.services.glue.model.MappingEntry>, source: com.amazonaws.services.glue.model.CatalogEntry, init: AWSGlueGetPlanCommand.() -> Unit) {
	this.block.declare(AWSGlueGetPlanCommand(mapping, source).apply(init))
}

@Generated
class AWSGlueGetPlanCommand(val mapping: List<com.amazonaws.services.glue.model.MappingEntry>, val source: com.amazonaws.services.glue.model.CatalogEntry) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetPlanRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.getPlan(build())
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


fun AWSGlueFunctions.getTable(databaseName: String, name: String, init: AWSGlueGetTableCommand.() -> Unit) {
	this.block.declare(AWSGlueGetTableCommand(databaseName, name).apply(init))
}

@Generated
class AWSGlueGetTableCommand(val databaseName: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetTableRequest> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.GetTableRequest {
		val input = com.amazonaws.services.glue.model.GetTableRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseName(this.databaseName)
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.getTable(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-table")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("name", name)
	}

}


fun AWSGlueFunctions.getTableVersion(databaseName: String, tableName: String, init: AWSGlueGetTableVersionCommand.() -> Unit) {
	this.block.declare(AWSGlueGetTableVersionCommand(databaseName, tableName).apply(init))
}

@Generated
class AWSGlueGetTableVersionCommand(val databaseName: String, val tableName: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetTableVersionRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.getTableVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-table-version")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("table-name", tableName)
				.argument("version-id", versionId)
	}

}


fun AWSGlueFunctions.getTableVersions(databaseName: String, tableName: String, init: AWSGlueGetTableVersionsCommand.() -> Unit) {
	this.block.declare(AWSGlueGetTableVersionsCommand(databaseName, tableName).apply(init))
}

@Generated
class AWSGlueGetTableVersionsCommand(val databaseName: String, val tableName: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetTableVersionsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.getTableVersions(build())
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


fun AWSGlueFunctions.getTables(databaseName: String, init: AWSGlueGetTablesCommand.() -> Unit) {
	this.block.declare(AWSGlueGetTablesCommand(databaseName).apply(init))
}

@Generated
class AWSGlueGetTablesCommand(val databaseName: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetTablesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.getTables(build())
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


fun AWSGlueFunctions.getTrigger(name: String, init: AWSGlueGetTriggerCommand.() -> Unit) {
	this.block.declare(AWSGlueGetTriggerCommand(name).apply(init))
}

@Generated
class AWSGlueGetTriggerCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetTriggerRequest> {



	override fun build(): com.amazonaws.services.glue.model.GetTriggerRequest {
		val input = com.amazonaws.services.glue.model.GetTriggerRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.getTrigger(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-trigger")
				.argument("name", name)
	}

}


fun AWSGlueFunctions.getTriggers(init: AWSGlueGetTriggersCommand.() -> Unit) {
	this.block.declare(AWSGlueGetTriggersCommand().apply(init))
}

@Generated
class AWSGlueGetTriggersCommand() : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetTriggersRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.getTriggers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-triggers")
				.argument("next-token", nextToken)
				.argument("dependent-job-name", dependentJobName)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSGlueFunctions.getUserDefinedFunction(databaseName: String, functionName: String, init: AWSGlueGetUserDefinedFunctionCommand.() -> Unit) {
	this.block.declare(AWSGlueGetUserDefinedFunctionCommand(databaseName, functionName).apply(init))
}

@Generated
class AWSGlueGetUserDefinedFunctionCommand(val databaseName: String, val functionName: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetUserDefinedFunctionRequest> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.GetUserDefinedFunctionRequest {
		val input = com.amazonaws.services.glue.model.GetUserDefinedFunctionRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseName(this.databaseName)
		input.setFunctionName(this.functionName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.getUserDefinedFunction(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue get-user-defined-function")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("function-name", functionName)
	}

}


fun AWSGlueFunctions.getUserDefinedFunctions(databaseName: String, pattern: String, init: AWSGlueGetUserDefinedFunctionsCommand.() -> Unit) {
	this.block.declare(AWSGlueGetUserDefinedFunctionsCommand(databaseName, pattern).apply(init))
}

@Generated
class AWSGlueGetUserDefinedFunctionsCommand(val databaseName: String, val pattern: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.GetUserDefinedFunctionsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.getUserDefinedFunctions(build())
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


fun AWSGlueFunctions.importCatalogToGlue(init: AWSGlueImportCatalogToGlueCommand.() -> Unit) {
	this.block.declare(AWSGlueImportCatalogToGlueCommand().apply(init))
}

@Generated
class AWSGlueImportCatalogToGlueCommand() : AmazonWebServiceCommand<com.amazonaws.services.glue.model.ImportCatalogToGlueRequest> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.ImportCatalogToGlueRequest {
		val input = com.amazonaws.services.glue.model.ImportCatalogToGlueRequest()
		input.setCatalogId(this.catalogId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.importCatalogToGlue(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue import-catalog-to-glue")
				.argument("catalog-id", catalogId)
	}

}


fun AWSGlueFunctions.resetJobBookmark(jobName: String, init: AWSGlueResetJobBookmarkCommand.() -> Unit) {
	this.block.declare(AWSGlueResetJobBookmarkCommand(jobName).apply(init))
}

@Generated
class AWSGlueResetJobBookmarkCommand(val jobName: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.ResetJobBookmarkRequest> {



	override fun build(): com.amazonaws.services.glue.model.ResetJobBookmarkRequest {
		val input = com.amazonaws.services.glue.model.ResetJobBookmarkRequest()
		input.setJobName(this.jobName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.resetJobBookmark(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue reset-job-bookmark")
				.argument("job-name", jobName)
	}

}


fun AWSGlueFunctions.startCrawler(name: String, init: AWSGlueStartCrawlerCommand.() -> Unit) {
	this.block.declare(AWSGlueStartCrawlerCommand(name).apply(init))
}

@Generated
class AWSGlueStartCrawlerCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.StartCrawlerRequest> {



	override fun build(): com.amazonaws.services.glue.model.StartCrawlerRequest {
		val input = com.amazonaws.services.glue.model.StartCrawlerRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.startCrawler(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue start-crawler")
				.argument("name", name)
	}

}


fun AWSGlueFunctions.startCrawlerSchedule(crawlerName: String, init: AWSGlueStartCrawlerScheduleCommand.() -> Unit) {
	this.block.declare(AWSGlueStartCrawlerScheduleCommand(crawlerName).apply(init))
}

@Generated
class AWSGlueStartCrawlerScheduleCommand(val crawlerName: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.StartCrawlerScheduleRequest> {



	override fun build(): com.amazonaws.services.glue.model.StartCrawlerScheduleRequest {
		val input = com.amazonaws.services.glue.model.StartCrawlerScheduleRequest()
		input.setCrawlerName(this.crawlerName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.startCrawlerSchedule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue start-crawler-schedule")
				.argument("crawler-name", crawlerName)
	}

}


fun AWSGlueFunctions.startJobRun(jobName: String, init: AWSGlueStartJobRunCommand.() -> Unit) {
	this.block.declare(AWSGlueStartJobRunCommand(jobName).apply(init))
}

@Generated
class AWSGlueStartJobRunCommand(val jobName: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.StartJobRunRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.startJobRun(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue start-job-run")
				.argument("job-name", jobName)
				.argument("job-run-id", jobRunId)
				.argument("arguments", arguments?.toString())
				.argument("allocated-capacity", allocatedCapacity?.toString())
	}

}


fun AWSGlueFunctions.startTrigger(name: String, init: AWSGlueStartTriggerCommand.() -> Unit) {
	this.block.declare(AWSGlueStartTriggerCommand(name).apply(init))
}

@Generated
class AWSGlueStartTriggerCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.StartTriggerRequest> {



	override fun build(): com.amazonaws.services.glue.model.StartTriggerRequest {
		val input = com.amazonaws.services.glue.model.StartTriggerRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.startTrigger(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue start-trigger")
				.argument("name", name)
	}

}


fun AWSGlueFunctions.stopCrawler(name: String, init: AWSGlueStopCrawlerCommand.() -> Unit) {
	this.block.declare(AWSGlueStopCrawlerCommand(name).apply(init))
}

@Generated
class AWSGlueStopCrawlerCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.StopCrawlerRequest> {



	override fun build(): com.amazonaws.services.glue.model.StopCrawlerRequest {
		val input = com.amazonaws.services.glue.model.StopCrawlerRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.stopCrawler(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue stop-crawler")
				.argument("name", name)
	}

}


fun AWSGlueFunctions.stopCrawlerSchedule(crawlerName: String, init: AWSGlueStopCrawlerScheduleCommand.() -> Unit) {
	this.block.declare(AWSGlueStopCrawlerScheduleCommand(crawlerName).apply(init))
}

@Generated
class AWSGlueStopCrawlerScheduleCommand(val crawlerName: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.StopCrawlerScheduleRequest> {



	override fun build(): com.amazonaws.services.glue.model.StopCrawlerScheduleRequest {
		val input = com.amazonaws.services.glue.model.StopCrawlerScheduleRequest()
		input.setCrawlerName(this.crawlerName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.stopCrawlerSchedule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue stop-crawler-schedule")
				.argument("crawler-name", crawlerName)
	}

}


fun AWSGlueFunctions.stopTrigger(name: String, init: AWSGlueStopTriggerCommand.() -> Unit) {
	this.block.declare(AWSGlueStopTriggerCommand(name).apply(init))
}

@Generated
class AWSGlueStopTriggerCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.StopTriggerRequest> {



	override fun build(): com.amazonaws.services.glue.model.StopTriggerRequest {
		val input = com.amazonaws.services.glue.model.StopTriggerRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.stopTrigger(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue stop-trigger")
				.argument("name", name)
	}

}


fun AWSGlueFunctions.updateClassifier(init: AWSGlueUpdateClassifierCommand.() -> Unit) {
	this.block.declare(AWSGlueUpdateClassifierCommand().apply(init))
}

@Generated
class AWSGlueUpdateClassifierCommand() : AmazonWebServiceCommand<com.amazonaws.services.glue.model.UpdateClassifierRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.updateClassifier(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue update-classifier")
				.argument("grok-classifier", grokClassifier?.toString())
				.argument("xmlclassifier", xMLClassifier?.toString())
				.argument("json-classifier", jsonClassifier?.toString())
	}

}


fun AWSGlueFunctions.updateConnection(name: String, connectionInput: com.amazonaws.services.glue.model.ConnectionInput, init: AWSGlueUpdateConnectionCommand.() -> Unit) {
	this.block.declare(AWSGlueUpdateConnectionCommand(name, connectionInput).apply(init))
}

@Generated
class AWSGlueUpdateConnectionCommand(val name: String, val connectionInput: com.amazonaws.services.glue.model.ConnectionInput) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.UpdateConnectionRequest> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.UpdateConnectionRequest {
		val input = com.amazonaws.services.glue.model.UpdateConnectionRequest()
		input.setCatalogId(this.catalogId)
		input.setName(this.name)
		input.setConnectionInput(this.connectionInput)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.updateConnection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue update-connection")
				.argument("catalog-id", catalogId)
				.argument("name", name)
				.argument("connection-input", connectionInput.toString())
	}

}


fun AWSGlueFunctions.updateCrawler(name: String, init: AWSGlueUpdateCrawlerCommand.() -> Unit) {
	this.block.declare(AWSGlueUpdateCrawlerCommand(name).apply(init))
}

@Generated
class AWSGlueUpdateCrawlerCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.UpdateCrawlerRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.updateCrawler(build())
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


fun AWSGlueFunctions.updateCrawlerSchedule(crawlerName: String, init: AWSGlueUpdateCrawlerScheduleCommand.() -> Unit) {
	this.block.declare(AWSGlueUpdateCrawlerScheduleCommand(crawlerName).apply(init))
}

@Generated
class AWSGlueUpdateCrawlerScheduleCommand(val crawlerName: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.UpdateCrawlerScheduleRequest> {

	var schedule: String? = null

	override fun build(): com.amazonaws.services.glue.model.UpdateCrawlerScheduleRequest {
		val input = com.amazonaws.services.glue.model.UpdateCrawlerScheduleRequest()
		input.setCrawlerName(this.crawlerName)
		input.setSchedule(this.schedule)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.updateCrawlerSchedule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue update-crawler-schedule")
				.argument("crawler-name", crawlerName)
				.argument("schedule", schedule)
	}

}


fun AWSGlueFunctions.updateDatabase(name: String, databaseInput: com.amazonaws.services.glue.model.DatabaseInput, init: AWSGlueUpdateDatabaseCommand.() -> Unit) {
	this.block.declare(AWSGlueUpdateDatabaseCommand(name, databaseInput).apply(init))
}

@Generated
class AWSGlueUpdateDatabaseCommand(val name: String, val databaseInput: com.amazonaws.services.glue.model.DatabaseInput) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.UpdateDatabaseRequest> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.UpdateDatabaseRequest {
		val input = com.amazonaws.services.glue.model.UpdateDatabaseRequest()
		input.setCatalogId(this.catalogId)
		input.setName(this.name)
		input.setDatabaseInput(this.databaseInput)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.updateDatabase(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue update-database")
				.argument("catalog-id", catalogId)
				.argument("name", name)
				.argument("database-input", databaseInput.toString())
	}

}


fun AWSGlueFunctions.updateDevEndpoint(endpointName: String, init: AWSGlueUpdateDevEndpointCommand.() -> Unit) {
	this.block.declare(AWSGlueUpdateDevEndpointCommand(endpointName).apply(init))
}

@Generated
class AWSGlueUpdateDevEndpointCommand(val endpointName: String) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.UpdateDevEndpointRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.updateDevEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue update-dev-endpoint")
				.argument("endpoint-name", endpointName)
				.argument("public-key", publicKey)
				.argument("custom-libraries", customLibraries?.toString())
				.option("update-etl-libraries", updateEtlLibraries ?: false)
	}

}


fun AWSGlueFunctions.updateJob(jobName: String, jobUpdate: com.amazonaws.services.glue.model.JobUpdate, init: AWSGlueUpdateJobCommand.() -> Unit) {
	this.block.declare(AWSGlueUpdateJobCommand(jobName, jobUpdate).apply(init))
}

@Generated
class AWSGlueUpdateJobCommand(val jobName: String, val jobUpdate: com.amazonaws.services.glue.model.JobUpdate) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.UpdateJobRequest> {



	override fun build(): com.amazonaws.services.glue.model.UpdateJobRequest {
		val input = com.amazonaws.services.glue.model.UpdateJobRequest()
		input.setJobName(this.jobName)
		input.setJobUpdate(this.jobUpdate)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.updateJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue update-job")
				.argument("job-name", jobName)
				.argument("job-update", jobUpdate.toString())
	}

}


fun AWSGlueFunctions.updatePartition(databaseName: String, tableName: String, partitionValueList: List<String>, partitionInput: com.amazonaws.services.glue.model.PartitionInput, init: AWSGlueUpdatePartitionCommand.() -> Unit) {
	this.block.declare(AWSGlueUpdatePartitionCommand(databaseName, tableName, partitionValueList, partitionInput).apply(init))
}

@Generated
class AWSGlueUpdatePartitionCommand(val databaseName: String, val tableName: String, val partitionValueList: List<String>, val partitionInput: com.amazonaws.services.glue.model.PartitionInput) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.UpdatePartitionRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.updatePartition(build())
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


fun AWSGlueFunctions.updateTable(databaseName: String, tableInput: com.amazonaws.services.glue.model.TableInput, init: AWSGlueUpdateTableCommand.() -> Unit) {
	this.block.declare(AWSGlueUpdateTableCommand(databaseName, tableInput).apply(init))
}

@Generated
class AWSGlueUpdateTableCommand(val databaseName: String, val tableInput: com.amazonaws.services.glue.model.TableInput) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.UpdateTableRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.updateTable(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue update-table")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("table-input", tableInput.toString())
				.option("skip-archive", skipArchive ?: false)
	}

}


fun AWSGlueFunctions.updateTrigger(name: String, triggerUpdate: com.amazonaws.services.glue.model.TriggerUpdate, init: AWSGlueUpdateTriggerCommand.() -> Unit) {
	this.block.declare(AWSGlueUpdateTriggerCommand(name, triggerUpdate).apply(init))
}

@Generated
class AWSGlueUpdateTriggerCommand(val name: String, val triggerUpdate: com.amazonaws.services.glue.model.TriggerUpdate) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.UpdateTriggerRequest> {



	override fun build(): com.amazonaws.services.glue.model.UpdateTriggerRequest {
		val input = com.amazonaws.services.glue.model.UpdateTriggerRequest()
		input.setName(this.name)
		input.setTriggerUpdate(this.triggerUpdate)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.updateTrigger(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue update-trigger")
				.argument("name", name)
				.argument("trigger-update", triggerUpdate.toString())
	}

}


fun AWSGlueFunctions.updateUserDefinedFunction(databaseName: String, functionName: String, functionInput: com.amazonaws.services.glue.model.UserDefinedFunctionInput, init: AWSGlueUpdateUserDefinedFunctionCommand.() -> Unit) {
	this.block.declare(AWSGlueUpdateUserDefinedFunctionCommand(databaseName, functionName, functionInput).apply(init))
}

@Generated
class AWSGlueUpdateUserDefinedFunctionCommand(val databaseName: String, val functionName: String, val functionInput: com.amazonaws.services.glue.model.UserDefinedFunctionInput) : AmazonWebServiceCommand<com.amazonaws.services.glue.model.UpdateUserDefinedFunctionRequest> {

	var catalogId: String? = null

	override fun build(): com.amazonaws.services.glue.model.UpdateUserDefinedFunctionRequest {
		val input = com.amazonaws.services.glue.model.UpdateUserDefinedFunctionRequest()
		input.setCatalogId(this.catalogId)
		input.setDatabaseName(this.databaseName)
		input.setFunctionName(this.functionName)
		input.setFunctionInput(this.functionInput)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glue.updateUserDefinedFunction(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glue update-user-defined-function")
				.argument("catalog-id", catalogId)
				.argument("database-name", databaseName)
				.argument("function-name", functionName)
				.argument("function-input", functionInput.toString())
	}

}
