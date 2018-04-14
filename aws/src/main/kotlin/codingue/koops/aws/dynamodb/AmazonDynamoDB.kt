
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws.dynamodb

import javax.annotation.Generated
import codingue.koops.core.*
import codingue.koops.aws.*
import com.amazonaws.services.dynamodbv2.*
import com.amazonaws.services.dynamodbv2.model.*

var codingue.koops.core.Environment.dynamodb: AmazonDynamoDB
	get() {
		var service = this.capabilities["aws-dynamodb"]
		if (service == null) {
			service = AmazonDynamoDBClientBuilder.standard().build()
			this.capabilities["aws-dynamodb"] = service
		}
		return service as AmazonDynamoDB
	}
	set(dynamodb) {
		this.capabilities["aws-dynamodb"] = dynamodb
	}

@Generated
class AmazonDynamoDBFunctions(val block: Block)

infix fun <T> AwsContinuation.dynamodb(init: AmazonDynamoDBFunctions.() -> T): T {
	return AmazonDynamoDBFunctions(shell).run(init)
}

			

fun AmazonDynamoDBFunctions.batchGetItem(requestItems: Map<String, com.amazonaws.services.dynamodbv2.model.KeysAndAttributes>, init: AmazonDynamoDBBatchGetItemCommand.() -> Unit): com.amazonaws.services.dynamodbv2.model.BatchGetItemResult {
	return this.block.declare(AmazonDynamoDBBatchGetItemCommand(requestItems).apply(init)) as com.amazonaws.services.dynamodbv2.model.BatchGetItemResult
}

@Generated
class AmazonDynamoDBBatchGetItemCommand(val requestItems: Map<String, com.amazonaws.services.dynamodbv2.model.KeysAndAttributes>) : AmazonWebServiceCommand<com.amazonaws.services.dynamodbv2.model.BatchGetItemRequest, com.amazonaws.services.dynamodbv2.model.BatchGetItemResult> {

	var returnConsumedCapacity: ReturnConsumedCapacity? = null

	override fun build(): com.amazonaws.services.dynamodbv2.model.BatchGetItemRequest {
		val input = com.amazonaws.services.dynamodbv2.model.BatchGetItemRequest()
		input.setRequestItems(this.requestItems)
		input.setReturnConsumedCapacity(this.returnConsumedCapacity?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dynamodbv2.model.BatchGetItemResult {
	  return com.amazonaws.services.dynamodbv2.model.BatchGetItemResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.dynamodbv2.model.BatchGetItemResult {
		return environment.dynamodb.batchGetItem(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dynamodb batch-get-item")
				.argument("request-items", requestItems.toString())
				.argument("return-consumed-capacity", returnConsumedCapacity?.toString())
	}

}


fun AmazonDynamoDBFunctions.batchWriteItem(requestItems: Map<String, List<com.amazonaws.services.dynamodbv2.model.WriteRequest>>, init: AmazonDynamoDBBatchWriteItemCommand.() -> Unit): com.amazonaws.services.dynamodbv2.model.BatchWriteItemResult {
	return this.block.declare(AmazonDynamoDBBatchWriteItemCommand(requestItems).apply(init)) as com.amazonaws.services.dynamodbv2.model.BatchWriteItemResult
}

@Generated
class AmazonDynamoDBBatchWriteItemCommand(val requestItems: Map<String, List<com.amazonaws.services.dynamodbv2.model.WriteRequest>>) : AmazonWebServiceCommand<com.amazonaws.services.dynamodbv2.model.BatchWriteItemRequest, com.amazonaws.services.dynamodbv2.model.BatchWriteItemResult> {

	var returnConsumedCapacity: ReturnConsumedCapacity? = null
	var returnItemCollectionMetrics: ReturnItemCollectionMetrics? = null

	override fun build(): com.amazonaws.services.dynamodbv2.model.BatchWriteItemRequest {
		val input = com.amazonaws.services.dynamodbv2.model.BatchWriteItemRequest()
		input.setRequestItems(this.requestItems)
		input.setReturnConsumedCapacity(this.returnConsumedCapacity?.toString())
		input.setReturnItemCollectionMetrics(this.returnItemCollectionMetrics?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dynamodbv2.model.BatchWriteItemResult {
	  return com.amazonaws.services.dynamodbv2.model.BatchWriteItemResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.dynamodbv2.model.BatchWriteItemResult {
		return environment.dynamodb.batchWriteItem(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dynamodb batch-write-item")
				.argument("request-items", requestItems.toString())
				.argument("return-consumed-capacity", returnConsumedCapacity?.toString())
				.argument("return-item-collection-metrics", returnItemCollectionMetrics?.toString())
	}

}


fun AmazonDynamoDBFunctions.createBackup(tableName: String, backupName: String, init: AmazonDynamoDBCreateBackupCommand.() -> Unit): com.amazonaws.services.dynamodbv2.model.CreateBackupResult {
	return this.block.declare(AmazonDynamoDBCreateBackupCommand(tableName, backupName).apply(init)) as com.amazonaws.services.dynamodbv2.model.CreateBackupResult
}

@Generated
class AmazonDynamoDBCreateBackupCommand(val tableName: String, val backupName: String) : AmazonWebServiceCommand<com.amazonaws.services.dynamodbv2.model.CreateBackupRequest, com.amazonaws.services.dynamodbv2.model.CreateBackupResult> {



	override fun build(): com.amazonaws.services.dynamodbv2.model.CreateBackupRequest {
		val input = com.amazonaws.services.dynamodbv2.model.CreateBackupRequest()
		input.setTableName(this.tableName)
		input.setBackupName(this.backupName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dynamodbv2.model.CreateBackupResult {
	  return com.amazonaws.services.dynamodbv2.model.CreateBackupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.dynamodbv2.model.CreateBackupResult {
		return environment.dynamodb.createBackup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dynamodb create-backup")
				.argument("table-name", tableName)
				.argument("backup-name", backupName)
	}

}


fun AmazonDynamoDBFunctions.createGlobalTable(globalTableName: String, replicationGroup: List<com.amazonaws.services.dynamodbv2.model.Replica>, init: AmazonDynamoDBCreateGlobalTableCommand.() -> Unit): com.amazonaws.services.dynamodbv2.model.CreateGlobalTableResult {
	return this.block.declare(AmazonDynamoDBCreateGlobalTableCommand(globalTableName, replicationGroup).apply(init)) as com.amazonaws.services.dynamodbv2.model.CreateGlobalTableResult
}

@Generated
class AmazonDynamoDBCreateGlobalTableCommand(val globalTableName: String, val replicationGroup: List<com.amazonaws.services.dynamodbv2.model.Replica>) : AmazonWebServiceCommand<com.amazonaws.services.dynamodbv2.model.CreateGlobalTableRequest, com.amazonaws.services.dynamodbv2.model.CreateGlobalTableResult> {



	override fun build(): com.amazonaws.services.dynamodbv2.model.CreateGlobalTableRequest {
		val input = com.amazonaws.services.dynamodbv2.model.CreateGlobalTableRequest()
		input.setGlobalTableName(this.globalTableName)
		input.setReplicationGroup(this.replicationGroup)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dynamodbv2.model.CreateGlobalTableResult {
	  return com.amazonaws.services.dynamodbv2.model.CreateGlobalTableResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.dynamodbv2.model.CreateGlobalTableResult {
		return environment.dynamodb.createGlobalTable(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dynamodb create-global-table")
				.argument("global-table-name", globalTableName)
				.argument("replication-group", replicationGroup.toString())
	}

}


fun AmazonDynamoDBFunctions.createTable(attributeDefinitions: List<com.amazonaws.services.dynamodbv2.model.AttributeDefinition>, tableName: String, keySchema: List<com.amazonaws.services.dynamodbv2.model.KeySchemaElement>, provisionedThroughput: com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput, init: AmazonDynamoDBCreateTableCommand.() -> Unit): com.amazonaws.services.dynamodbv2.model.CreateTableResult {
	return this.block.declare(AmazonDynamoDBCreateTableCommand(attributeDefinitions, tableName, keySchema, provisionedThroughput).apply(init)) as com.amazonaws.services.dynamodbv2.model.CreateTableResult
}

@Generated
class AmazonDynamoDBCreateTableCommand(val attributeDefinitions: List<com.amazonaws.services.dynamodbv2.model.AttributeDefinition>, val tableName: String, val keySchema: List<com.amazonaws.services.dynamodbv2.model.KeySchemaElement>, val provisionedThroughput: com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput) : AmazonWebServiceCommand<com.amazonaws.services.dynamodbv2.model.CreateTableRequest, com.amazonaws.services.dynamodbv2.model.CreateTableResult> {

	var localSecondaryIndexes: List<com.amazonaws.services.dynamodbv2.model.LocalSecondaryIndex>? = null
	var globalSecondaryIndexes: List<com.amazonaws.services.dynamodbv2.model.GlobalSecondaryIndex>? = null
	var streamSpecification: com.amazonaws.services.dynamodbv2.model.StreamSpecification? = null
	var sSESpecification: com.amazonaws.services.dynamodbv2.model.SSESpecification? = null

	override fun build(): com.amazonaws.services.dynamodbv2.model.CreateTableRequest {
		val input = com.amazonaws.services.dynamodbv2.model.CreateTableRequest()
		input.setAttributeDefinitions(this.attributeDefinitions)
		input.setTableName(this.tableName)
		input.setKeySchema(this.keySchema)
		input.setLocalSecondaryIndexes(this.localSecondaryIndexes)
		input.setGlobalSecondaryIndexes(this.globalSecondaryIndexes)
		input.setProvisionedThroughput(this.provisionedThroughput)
		input.setStreamSpecification(this.streamSpecification)
		input.setSSESpecification(this.sSESpecification)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dynamodbv2.model.CreateTableResult {
	  return com.amazonaws.services.dynamodbv2.model.CreateTableResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.dynamodbv2.model.CreateTableResult {
		return environment.dynamodb.createTable(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dynamodb create-table")
				.argument("attribute-definitions", attributeDefinitions.toString())
				.argument("table-name", tableName)
				.argument("key-schema", keySchema.toString())
				.argument("local-secondary-indexes", localSecondaryIndexes?.toString())
				.argument("global-secondary-indexes", globalSecondaryIndexes?.toString())
				.argument("provisioned-throughput", provisionedThroughput.toString())
				.argument("stream-specification", streamSpecification?.toString())
				.argument("ssespecification", sSESpecification?.toString())
	}

}


fun AmazonDynamoDBFunctions.deleteBackup(backupArn: String, init: AmazonDynamoDBDeleteBackupCommand.() -> Unit): com.amazonaws.services.dynamodbv2.model.DeleteBackupResult {
	return this.block.declare(AmazonDynamoDBDeleteBackupCommand(backupArn).apply(init)) as com.amazonaws.services.dynamodbv2.model.DeleteBackupResult
}

@Generated
class AmazonDynamoDBDeleteBackupCommand(val backupArn: String) : AmazonWebServiceCommand<com.amazonaws.services.dynamodbv2.model.DeleteBackupRequest, com.amazonaws.services.dynamodbv2.model.DeleteBackupResult> {



	override fun build(): com.amazonaws.services.dynamodbv2.model.DeleteBackupRequest {
		val input = com.amazonaws.services.dynamodbv2.model.DeleteBackupRequest()
		input.setBackupArn(this.backupArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dynamodbv2.model.DeleteBackupResult {
	  return com.amazonaws.services.dynamodbv2.model.DeleteBackupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.dynamodbv2.model.DeleteBackupResult {
		return environment.dynamodb.deleteBackup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dynamodb delete-backup")
				.argument("backup-arn", backupArn)
	}

}


fun AmazonDynamoDBFunctions.deleteItem(tableName: String, key: Map<String, com.amazonaws.services.dynamodbv2.model.AttributeValue>, init: AmazonDynamoDBDeleteItemCommand.() -> Unit): com.amazonaws.services.dynamodbv2.model.DeleteItemResult {
	return this.block.declare(AmazonDynamoDBDeleteItemCommand(tableName, key).apply(init)) as com.amazonaws.services.dynamodbv2.model.DeleteItemResult
}

@Generated
class AmazonDynamoDBDeleteItemCommand(val tableName: String, val key: Map<String, com.amazonaws.services.dynamodbv2.model.AttributeValue>) : AmazonWebServiceCommand<com.amazonaws.services.dynamodbv2.model.DeleteItemRequest, com.amazonaws.services.dynamodbv2.model.DeleteItemResult> {

	var expected: Map<String, com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue>? = null
	var conditionalOperator: ConditionalOperator? = null
	var returnValues: ReturnValue? = null
	var returnConsumedCapacity: ReturnConsumedCapacity? = null
	var returnItemCollectionMetrics: ReturnItemCollectionMetrics? = null
	var conditionExpression: String? = null
	var expressionAttributeNames: Map<String, String>? = null
	var expressionAttributeValues: Map<String, com.amazonaws.services.dynamodbv2.model.AttributeValue>? = null

	override fun build(): com.amazonaws.services.dynamodbv2.model.DeleteItemRequest {
		val input = com.amazonaws.services.dynamodbv2.model.DeleteItemRequest()
		input.setTableName(this.tableName)
		input.setKey(this.key)
		input.setExpected(this.expected)
		input.setConditionalOperator(this.conditionalOperator?.toString())
		input.setReturnValues(this.returnValues?.toString())
		input.setReturnConsumedCapacity(this.returnConsumedCapacity?.toString())
		input.setReturnItemCollectionMetrics(this.returnItemCollectionMetrics?.toString())
		input.setConditionExpression(this.conditionExpression)
		input.setExpressionAttributeNames(this.expressionAttributeNames)
		input.setExpressionAttributeValues(this.expressionAttributeValues)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dynamodbv2.model.DeleteItemResult {
	  return com.amazonaws.services.dynamodbv2.model.DeleteItemResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.dynamodbv2.model.DeleteItemResult {
		return environment.dynamodb.deleteItem(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dynamodb delete-item")
				.argument("table-name", tableName)
				.argument("key", key.toString())
				.argument("expected", expected?.toString())
				.argument("conditional-operator", conditionalOperator?.toString())
				.argument("return-values", returnValues?.toString())
				.argument("return-consumed-capacity", returnConsumedCapacity?.toString())
				.argument("return-item-collection-metrics", returnItemCollectionMetrics?.toString())
				.argument("condition-expression", conditionExpression)
				.argument("expression-attribute-names", expressionAttributeNames?.toString())
				.argument("expression-attribute-values", expressionAttributeValues?.toString())
	}

}


fun AmazonDynamoDBFunctions.deleteTable(tableName: String, init: AmazonDynamoDBDeleteTableCommand.() -> Unit): com.amazonaws.services.dynamodbv2.model.DeleteTableResult {
	return this.block.declare(AmazonDynamoDBDeleteTableCommand(tableName).apply(init)) as com.amazonaws.services.dynamodbv2.model.DeleteTableResult
}

@Generated
class AmazonDynamoDBDeleteTableCommand(val tableName: String) : AmazonWebServiceCommand<com.amazonaws.services.dynamodbv2.model.DeleteTableRequest, com.amazonaws.services.dynamodbv2.model.DeleteTableResult> {



	override fun build(): com.amazonaws.services.dynamodbv2.model.DeleteTableRequest {
		val input = com.amazonaws.services.dynamodbv2.model.DeleteTableRequest()
		input.setTableName(this.tableName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dynamodbv2.model.DeleteTableResult {
	  return com.amazonaws.services.dynamodbv2.model.DeleteTableResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.dynamodbv2.model.DeleteTableResult {
		return environment.dynamodb.deleteTable(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dynamodb delete-table")
				.argument("table-name", tableName)
	}

}


fun AmazonDynamoDBFunctions.describeBackup(backupArn: String, init: AmazonDynamoDBDescribeBackupCommand.() -> Unit): com.amazonaws.services.dynamodbv2.model.DescribeBackupResult {
	return this.block.declare(AmazonDynamoDBDescribeBackupCommand(backupArn).apply(init)) as com.amazonaws.services.dynamodbv2.model.DescribeBackupResult
}

@Generated
class AmazonDynamoDBDescribeBackupCommand(val backupArn: String) : AmazonWebServiceCommand<com.amazonaws.services.dynamodbv2.model.DescribeBackupRequest, com.amazonaws.services.dynamodbv2.model.DescribeBackupResult> {



	override fun build(): com.amazonaws.services.dynamodbv2.model.DescribeBackupRequest {
		val input = com.amazonaws.services.dynamodbv2.model.DescribeBackupRequest()
		input.setBackupArn(this.backupArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dynamodbv2.model.DescribeBackupResult {
	  return com.amazonaws.services.dynamodbv2.model.DescribeBackupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.dynamodbv2.model.DescribeBackupResult {
		return environment.dynamodb.describeBackup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dynamodb describe-backup")
				.argument("backup-arn", backupArn)
	}

}


fun AmazonDynamoDBFunctions.describeContinuousBackups(tableName: String, init: AmazonDynamoDBDescribeContinuousBackupsCommand.() -> Unit): com.amazonaws.services.dynamodbv2.model.DescribeContinuousBackupsResult {
	return this.block.declare(AmazonDynamoDBDescribeContinuousBackupsCommand(tableName).apply(init)) as com.amazonaws.services.dynamodbv2.model.DescribeContinuousBackupsResult
}

@Generated
class AmazonDynamoDBDescribeContinuousBackupsCommand(val tableName: String) : AmazonWebServiceCommand<com.amazonaws.services.dynamodbv2.model.DescribeContinuousBackupsRequest, com.amazonaws.services.dynamodbv2.model.DescribeContinuousBackupsResult> {



	override fun build(): com.amazonaws.services.dynamodbv2.model.DescribeContinuousBackupsRequest {
		val input = com.amazonaws.services.dynamodbv2.model.DescribeContinuousBackupsRequest()
		input.setTableName(this.tableName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dynamodbv2.model.DescribeContinuousBackupsResult {
	  return com.amazonaws.services.dynamodbv2.model.DescribeContinuousBackupsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.dynamodbv2.model.DescribeContinuousBackupsResult {
		return environment.dynamodb.describeContinuousBackups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dynamodb describe-continuous-backups")
				.argument("table-name", tableName)
	}

}


fun AmazonDynamoDBFunctions.describeGlobalTable(globalTableName: String, init: AmazonDynamoDBDescribeGlobalTableCommand.() -> Unit): com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableResult {
	return this.block.declare(AmazonDynamoDBDescribeGlobalTableCommand(globalTableName).apply(init)) as com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableResult
}

@Generated
class AmazonDynamoDBDescribeGlobalTableCommand(val globalTableName: String) : AmazonWebServiceCommand<com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableRequest, com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableResult> {



	override fun build(): com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableRequest {
		val input = com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableRequest()
		input.setGlobalTableName(this.globalTableName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableResult {
	  return com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableResult {
		return environment.dynamodb.describeGlobalTable(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dynamodb describe-global-table")
				.argument("global-table-name", globalTableName)
	}

}


fun AmazonDynamoDBFunctions.describeLimits(init: AmazonDynamoDBDescribeLimitsCommand.() -> Unit): com.amazonaws.services.dynamodbv2.model.DescribeLimitsResult {
	return this.block.declare(AmazonDynamoDBDescribeLimitsCommand().apply(init)) as com.amazonaws.services.dynamodbv2.model.DescribeLimitsResult
}

@Generated
class AmazonDynamoDBDescribeLimitsCommand() : AmazonWebServiceCommand<com.amazonaws.services.dynamodbv2.model.DescribeLimitsRequest, com.amazonaws.services.dynamodbv2.model.DescribeLimitsResult> {



	override fun build(): com.amazonaws.services.dynamodbv2.model.DescribeLimitsRequest {
		val input = com.amazonaws.services.dynamodbv2.model.DescribeLimitsRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dynamodbv2.model.DescribeLimitsResult {
	  return com.amazonaws.services.dynamodbv2.model.DescribeLimitsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.dynamodbv2.model.DescribeLimitsResult {
		return environment.dynamodb.describeLimits(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dynamodb describe-limits")

	}

}


fun AmazonDynamoDBFunctions.describeTable(tableName: String, init: AmazonDynamoDBDescribeTableCommand.() -> Unit): com.amazonaws.services.dynamodbv2.model.DescribeTableResult {
	return this.block.declare(AmazonDynamoDBDescribeTableCommand(tableName).apply(init)) as com.amazonaws.services.dynamodbv2.model.DescribeTableResult
}

@Generated
class AmazonDynamoDBDescribeTableCommand(val tableName: String) : AmazonWebServiceCommand<com.amazonaws.services.dynamodbv2.model.DescribeTableRequest, com.amazonaws.services.dynamodbv2.model.DescribeTableResult> {



	override fun build(): com.amazonaws.services.dynamodbv2.model.DescribeTableRequest {
		val input = com.amazonaws.services.dynamodbv2.model.DescribeTableRequest()
		input.setTableName(this.tableName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dynamodbv2.model.DescribeTableResult {
	  return com.amazonaws.services.dynamodbv2.model.DescribeTableResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.dynamodbv2.model.DescribeTableResult {
		return environment.dynamodb.describeTable(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dynamodb describe-table")
				.argument("table-name", tableName)
	}

}


fun AmazonDynamoDBFunctions.describeTimeToLive(tableName: String, init: AmazonDynamoDBDescribeTimeToLiveCommand.() -> Unit): com.amazonaws.services.dynamodbv2.model.DescribeTimeToLiveResult {
	return this.block.declare(AmazonDynamoDBDescribeTimeToLiveCommand(tableName).apply(init)) as com.amazonaws.services.dynamodbv2.model.DescribeTimeToLiveResult
}

@Generated
class AmazonDynamoDBDescribeTimeToLiveCommand(val tableName: String) : AmazonWebServiceCommand<com.amazonaws.services.dynamodbv2.model.DescribeTimeToLiveRequest, com.amazonaws.services.dynamodbv2.model.DescribeTimeToLiveResult> {



	override fun build(): com.amazonaws.services.dynamodbv2.model.DescribeTimeToLiveRequest {
		val input = com.amazonaws.services.dynamodbv2.model.DescribeTimeToLiveRequest()
		input.setTableName(this.tableName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dynamodbv2.model.DescribeTimeToLiveResult {
	  return com.amazonaws.services.dynamodbv2.model.DescribeTimeToLiveResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.dynamodbv2.model.DescribeTimeToLiveResult {
		return environment.dynamodb.describeTimeToLive(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dynamodb describe-time-to-live")
				.argument("table-name", tableName)
	}

}


fun AmazonDynamoDBFunctions.getItem(tableName: String, key: Map<String, com.amazonaws.services.dynamodbv2.model.AttributeValue>, init: AmazonDynamoDBGetItemCommand.() -> Unit): com.amazonaws.services.dynamodbv2.model.GetItemResult {
	return this.block.declare(AmazonDynamoDBGetItemCommand(tableName, key).apply(init)) as com.amazonaws.services.dynamodbv2.model.GetItemResult
}

@Generated
class AmazonDynamoDBGetItemCommand(val tableName: String, val key: Map<String, com.amazonaws.services.dynamodbv2.model.AttributeValue>) : AmazonWebServiceCommand<com.amazonaws.services.dynamodbv2.model.GetItemRequest, com.amazonaws.services.dynamodbv2.model.GetItemResult> {

	var attributesToGet: List<String>? = null
	var consistentRead: Boolean? = false
	var returnConsumedCapacity: ReturnConsumedCapacity? = null
	var projectionExpression: String? = null
	var expressionAttributeNames: Map<String, String>? = null

	override fun build(): com.amazonaws.services.dynamodbv2.model.GetItemRequest {
		val input = com.amazonaws.services.dynamodbv2.model.GetItemRequest()
		input.setTableName(this.tableName)
		input.setKey(this.key)
		input.setAttributesToGet(this.attributesToGet)
		input.setConsistentRead(this.consistentRead)
		input.setReturnConsumedCapacity(this.returnConsumedCapacity?.toString())
		input.setProjectionExpression(this.projectionExpression)
		input.setExpressionAttributeNames(this.expressionAttributeNames)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dynamodbv2.model.GetItemResult {
	  return com.amazonaws.services.dynamodbv2.model.GetItemResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.dynamodbv2.model.GetItemResult {
		return environment.dynamodb.getItem(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dynamodb get-item")
				.argument("table-name", tableName)
				.argument("key", key.toString())
				.argument("attributes-to-get", attributesToGet?.toString())
				.option("consistent-read", consistentRead ?: false)
				.argument("return-consumed-capacity", returnConsumedCapacity?.toString())
				.argument("projection-expression", projectionExpression)
				.argument("expression-attribute-names", expressionAttributeNames?.toString())
	}

}


fun AmazonDynamoDBFunctions.listBackups(init: AmazonDynamoDBListBackupsCommand.() -> Unit): com.amazonaws.services.dynamodbv2.model.ListBackupsResult {
	return this.block.declare(AmazonDynamoDBListBackupsCommand().apply(init)) as com.amazonaws.services.dynamodbv2.model.ListBackupsResult
}

@Generated
class AmazonDynamoDBListBackupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.dynamodbv2.model.ListBackupsRequest, com.amazonaws.services.dynamodbv2.model.ListBackupsResult> {

	var tableName: String? = null
	var limit: Int? = 0
	var timeRangeLowerBound: java.util.Date? = null
	var timeRangeUpperBound: java.util.Date? = null
	var exclusiveStartBackupArn: String? = null

	override fun build(): com.amazonaws.services.dynamodbv2.model.ListBackupsRequest {
		val input = com.amazonaws.services.dynamodbv2.model.ListBackupsRequest()
		input.setTableName(this.tableName)
		input.setLimit(this.limit)
		input.setTimeRangeLowerBound(this.timeRangeLowerBound)
		input.setTimeRangeUpperBound(this.timeRangeUpperBound)
		input.setExclusiveStartBackupArn(this.exclusiveStartBackupArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dynamodbv2.model.ListBackupsResult {
	  return com.amazonaws.services.dynamodbv2.model.ListBackupsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.dynamodbv2.model.ListBackupsResult {
		return environment.dynamodb.listBackups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dynamodb list-backups")
				.argument("table-name", tableName)
				.argument("limit", limit?.toString())
				.argument("time-range-lower-bound", timeRangeLowerBound?.toString())
				.argument("time-range-upper-bound", timeRangeUpperBound?.toString())
				.argument("exclusive-start-backup-arn", exclusiveStartBackupArn)
	}

}


fun AmazonDynamoDBFunctions.listGlobalTables(init: AmazonDynamoDBListGlobalTablesCommand.() -> Unit): com.amazonaws.services.dynamodbv2.model.ListGlobalTablesResult {
	return this.block.declare(AmazonDynamoDBListGlobalTablesCommand().apply(init)) as com.amazonaws.services.dynamodbv2.model.ListGlobalTablesResult
}

@Generated
class AmazonDynamoDBListGlobalTablesCommand() : AmazonWebServiceCommand<com.amazonaws.services.dynamodbv2.model.ListGlobalTablesRequest, com.amazonaws.services.dynamodbv2.model.ListGlobalTablesResult> {

	var exclusiveStartGlobalTableName: String? = null
	var limit: Int? = 0
	var regionName: String? = null

	override fun build(): com.amazonaws.services.dynamodbv2.model.ListGlobalTablesRequest {
		val input = com.amazonaws.services.dynamodbv2.model.ListGlobalTablesRequest()
		input.setExclusiveStartGlobalTableName(this.exclusiveStartGlobalTableName)
		input.setLimit(this.limit)
		input.setRegionName(this.regionName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dynamodbv2.model.ListGlobalTablesResult {
	  return com.amazonaws.services.dynamodbv2.model.ListGlobalTablesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.dynamodbv2.model.ListGlobalTablesResult {
		return environment.dynamodb.listGlobalTables(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dynamodb list-global-tables")
				.argument("exclusive-start-global-table-name", exclusiveStartGlobalTableName)
				.argument("limit", limit?.toString())
				.argument("region-name", regionName)
	}

}


fun AmazonDynamoDBFunctions.listTables(init: AmazonDynamoDBListTablesCommand.() -> Unit): com.amazonaws.services.dynamodbv2.model.ListTablesResult {
	return this.block.declare(AmazonDynamoDBListTablesCommand().apply(init)) as com.amazonaws.services.dynamodbv2.model.ListTablesResult
}

@Generated
class AmazonDynamoDBListTablesCommand() : AmazonWebServiceCommand<com.amazonaws.services.dynamodbv2.model.ListTablesRequest, com.amazonaws.services.dynamodbv2.model.ListTablesResult> {

	var exclusiveStartTableName: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.dynamodbv2.model.ListTablesRequest {
		val input = com.amazonaws.services.dynamodbv2.model.ListTablesRequest()
		input.setExclusiveStartTableName(this.exclusiveStartTableName)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dynamodbv2.model.ListTablesResult {
	  return com.amazonaws.services.dynamodbv2.model.ListTablesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.dynamodbv2.model.ListTablesResult {
		return environment.dynamodb.listTables(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dynamodb list-tables")
				.argument("exclusive-start-table-name", exclusiveStartTableName)
				.argument("limit", limit?.toString())
	}

}


fun AmazonDynamoDBFunctions.listTagsOfResource(resourceArn: String, init: AmazonDynamoDBListTagsOfResourceCommand.() -> Unit): com.amazonaws.services.dynamodbv2.model.ListTagsOfResourceResult {
	return this.block.declare(AmazonDynamoDBListTagsOfResourceCommand(resourceArn).apply(init)) as com.amazonaws.services.dynamodbv2.model.ListTagsOfResourceResult
}

@Generated
class AmazonDynamoDBListTagsOfResourceCommand(val resourceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.dynamodbv2.model.ListTagsOfResourceRequest, com.amazonaws.services.dynamodbv2.model.ListTagsOfResourceResult> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.dynamodbv2.model.ListTagsOfResourceRequest {
		val input = com.amazonaws.services.dynamodbv2.model.ListTagsOfResourceRequest()
		input.setResourceArn(this.resourceArn)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dynamodbv2.model.ListTagsOfResourceResult {
	  return com.amazonaws.services.dynamodbv2.model.ListTagsOfResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.dynamodbv2.model.ListTagsOfResourceResult {
		return environment.dynamodb.listTagsOfResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dynamodb list-tags-of-resource")
				.argument("resource-arn", resourceArn)
				.argument("next-token", nextToken)
	}

}


fun AmazonDynamoDBFunctions.putItem(tableName: String, item: Map<String, com.amazonaws.services.dynamodbv2.model.AttributeValue>, init: AmazonDynamoDBPutItemCommand.() -> Unit): com.amazonaws.services.dynamodbv2.model.PutItemResult {
	return this.block.declare(AmazonDynamoDBPutItemCommand(tableName, item).apply(init)) as com.amazonaws.services.dynamodbv2.model.PutItemResult
}

@Generated
class AmazonDynamoDBPutItemCommand(val tableName: String, val item: Map<String, com.amazonaws.services.dynamodbv2.model.AttributeValue>) : AmazonWebServiceCommand<com.amazonaws.services.dynamodbv2.model.PutItemRequest, com.amazonaws.services.dynamodbv2.model.PutItemResult> {

	var expected: Map<String, com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue>? = null
	var returnValues: ReturnValue? = null
	var returnConsumedCapacity: ReturnConsumedCapacity? = null
	var returnItemCollectionMetrics: ReturnItemCollectionMetrics? = null
	var conditionalOperator: ConditionalOperator? = null
	var conditionExpression: String? = null
	var expressionAttributeNames: Map<String, String>? = null
	var expressionAttributeValues: Map<String, com.amazonaws.services.dynamodbv2.model.AttributeValue>? = null

	override fun build(): com.amazonaws.services.dynamodbv2.model.PutItemRequest {
		val input = com.amazonaws.services.dynamodbv2.model.PutItemRequest()
		input.setTableName(this.tableName)
		input.setItem(this.item)
		input.setExpected(this.expected)
		input.setReturnValues(this.returnValues?.toString())
		input.setReturnConsumedCapacity(this.returnConsumedCapacity?.toString())
		input.setReturnItemCollectionMetrics(this.returnItemCollectionMetrics?.toString())
		input.setConditionalOperator(this.conditionalOperator?.toString())
		input.setConditionExpression(this.conditionExpression)
		input.setExpressionAttributeNames(this.expressionAttributeNames)
		input.setExpressionAttributeValues(this.expressionAttributeValues)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dynamodbv2.model.PutItemResult {
	  return com.amazonaws.services.dynamodbv2.model.PutItemResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.dynamodbv2.model.PutItemResult {
		return environment.dynamodb.putItem(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dynamodb put-item")
				.argument("table-name", tableName)
				.argument("item", item.toString())
				.argument("expected", expected?.toString())
				.argument("return-values", returnValues?.toString())
				.argument("return-consumed-capacity", returnConsumedCapacity?.toString())
				.argument("return-item-collection-metrics", returnItemCollectionMetrics?.toString())
				.argument("conditional-operator", conditionalOperator?.toString())
				.argument("condition-expression", conditionExpression)
				.argument("expression-attribute-names", expressionAttributeNames?.toString())
				.argument("expression-attribute-values", expressionAttributeValues?.toString())
	}

}


fun AmazonDynamoDBFunctions.query(tableName: String, init: AmazonDynamoDBQueryCommand.() -> Unit): com.amazonaws.services.dynamodbv2.model.QueryResult {
	return this.block.declare(AmazonDynamoDBQueryCommand(tableName).apply(init)) as com.amazonaws.services.dynamodbv2.model.QueryResult
}

@Generated
class AmazonDynamoDBQueryCommand(val tableName: String) : AmazonWebServiceCommand<com.amazonaws.services.dynamodbv2.model.QueryRequest, com.amazonaws.services.dynamodbv2.model.QueryResult> {

	var indexName: String? = null
	var select: Select? = null
	var attributesToGet: List<String>? = null
	var limit: Int? = 0
	var consistentRead: Boolean? = false
	var keyConditions: Map<String, com.amazonaws.services.dynamodbv2.model.Condition>? = null
	var queryFilter: Map<String, com.amazonaws.services.dynamodbv2.model.Condition>? = null
	var conditionalOperator: ConditionalOperator? = null
	var scanIndexForward: Boolean? = false
	var exclusiveStartKey: Map<String, com.amazonaws.services.dynamodbv2.model.AttributeValue>? = null
	var returnConsumedCapacity: ReturnConsumedCapacity? = null
	var projectionExpression: String? = null
	var filterExpression: String? = null
	var keyConditionExpression: String? = null
	var expressionAttributeNames: Map<String, String>? = null
	var expressionAttributeValues: Map<String, com.amazonaws.services.dynamodbv2.model.AttributeValue>? = null

	override fun build(): com.amazonaws.services.dynamodbv2.model.QueryRequest {
		val input = com.amazonaws.services.dynamodbv2.model.QueryRequest()
		input.setTableName(this.tableName)
		input.setIndexName(this.indexName)
		input.setSelect(this.select?.toString())
		input.setAttributesToGet(this.attributesToGet)
		input.setLimit(this.limit)
		input.setConsistentRead(this.consistentRead)
		input.setKeyConditions(this.keyConditions)
		input.setQueryFilter(this.queryFilter)
		input.setConditionalOperator(this.conditionalOperator?.toString())
		input.setScanIndexForward(this.scanIndexForward)
		input.setExclusiveStartKey(this.exclusiveStartKey)
		input.setReturnConsumedCapacity(this.returnConsumedCapacity?.toString())
		input.setProjectionExpression(this.projectionExpression)
		input.setFilterExpression(this.filterExpression)
		input.setKeyConditionExpression(this.keyConditionExpression)
		input.setExpressionAttributeNames(this.expressionAttributeNames)
		input.setExpressionAttributeValues(this.expressionAttributeValues)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dynamodbv2.model.QueryResult {
	  return com.amazonaws.services.dynamodbv2.model.QueryResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.dynamodbv2.model.QueryResult {
		return environment.dynamodb.query(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dynamodb query")
				.argument("table-name", tableName)
				.argument("index-name", indexName)
				.argument("select", select?.toString())
				.argument("attributes-to-get", attributesToGet?.toString())
				.argument("limit", limit?.toString())
				.option("consistent-read", consistentRead ?: false)
				.argument("key-conditions", keyConditions?.toString())
				.argument("query-filter", queryFilter?.toString())
				.argument("conditional-operator", conditionalOperator?.toString())
				.option("scan-index-forward", scanIndexForward ?: false)
				.argument("exclusive-start-key", exclusiveStartKey?.toString())
				.argument("return-consumed-capacity", returnConsumedCapacity?.toString())
				.argument("projection-expression", projectionExpression)
				.argument("filter-expression", filterExpression)
				.argument("key-condition-expression", keyConditionExpression)
				.argument("expression-attribute-names", expressionAttributeNames?.toString())
				.argument("expression-attribute-values", expressionAttributeValues?.toString())
	}

}


fun AmazonDynamoDBFunctions.restoreTableFromBackup(targetTableName: String, backupArn: String, init: AmazonDynamoDBRestoreTableFromBackupCommand.() -> Unit): com.amazonaws.services.dynamodbv2.model.RestoreTableFromBackupResult {
	return this.block.declare(AmazonDynamoDBRestoreTableFromBackupCommand(targetTableName, backupArn).apply(init)) as com.amazonaws.services.dynamodbv2.model.RestoreTableFromBackupResult
}

@Generated
class AmazonDynamoDBRestoreTableFromBackupCommand(val targetTableName: String, val backupArn: String) : AmazonWebServiceCommand<com.amazonaws.services.dynamodbv2.model.RestoreTableFromBackupRequest, com.amazonaws.services.dynamodbv2.model.RestoreTableFromBackupResult> {



	override fun build(): com.amazonaws.services.dynamodbv2.model.RestoreTableFromBackupRequest {
		val input = com.amazonaws.services.dynamodbv2.model.RestoreTableFromBackupRequest()
		input.setTargetTableName(this.targetTableName)
		input.setBackupArn(this.backupArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dynamodbv2.model.RestoreTableFromBackupResult {
	  return com.amazonaws.services.dynamodbv2.model.RestoreTableFromBackupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.dynamodbv2.model.RestoreTableFromBackupResult {
		return environment.dynamodb.restoreTableFromBackup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dynamodb restore-table-from-backup")
				.argument("target-table-name", targetTableName)
				.argument("backup-arn", backupArn)
	}

}


fun AmazonDynamoDBFunctions.restoreTableToPointInTime(sourceTableName: String, targetTableName: String, init: AmazonDynamoDBRestoreTableToPointInTimeCommand.() -> Unit): com.amazonaws.services.dynamodbv2.model.RestoreTableToPointInTimeResult {
	return this.block.declare(AmazonDynamoDBRestoreTableToPointInTimeCommand(sourceTableName, targetTableName).apply(init)) as com.amazonaws.services.dynamodbv2.model.RestoreTableToPointInTimeResult
}

@Generated
class AmazonDynamoDBRestoreTableToPointInTimeCommand(val sourceTableName: String, val targetTableName: String) : AmazonWebServiceCommand<com.amazonaws.services.dynamodbv2.model.RestoreTableToPointInTimeRequest, com.amazonaws.services.dynamodbv2.model.RestoreTableToPointInTimeResult> {

	var useLatestRestorableTime: Boolean? = false
	var restoreDateTime: java.util.Date? = null

	override fun build(): com.amazonaws.services.dynamodbv2.model.RestoreTableToPointInTimeRequest {
		val input = com.amazonaws.services.dynamodbv2.model.RestoreTableToPointInTimeRequest()
		input.setSourceTableName(this.sourceTableName)
		input.setTargetTableName(this.targetTableName)
		input.setUseLatestRestorableTime(this.useLatestRestorableTime)
		input.setRestoreDateTime(this.restoreDateTime)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dynamodbv2.model.RestoreTableToPointInTimeResult {
	  return com.amazonaws.services.dynamodbv2.model.RestoreTableToPointInTimeResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.dynamodbv2.model.RestoreTableToPointInTimeResult {
		return environment.dynamodb.restoreTableToPointInTime(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dynamodb restore-table-to-point-in-time")
				.argument("source-table-name", sourceTableName)
				.argument("target-table-name", targetTableName)
				.option("use-latest-restorable-time", useLatestRestorableTime ?: false)
				.argument("restore-date-time", restoreDateTime?.toString())
	}

}


fun AmazonDynamoDBFunctions.scan(tableName: String, init: AmazonDynamoDBScanCommand.() -> Unit): com.amazonaws.services.dynamodbv2.model.ScanResult {
	return this.block.declare(AmazonDynamoDBScanCommand(tableName).apply(init)) as com.amazonaws.services.dynamodbv2.model.ScanResult
}

@Generated
class AmazonDynamoDBScanCommand(val tableName: String) : AmazonWebServiceCommand<com.amazonaws.services.dynamodbv2.model.ScanRequest, com.amazonaws.services.dynamodbv2.model.ScanResult> {

	var indexName: String? = null
	var attributesToGet: List<String>? = null
	var limit: Int? = 0
	var select: Select? = null
	var scanFilter: Map<String, com.amazonaws.services.dynamodbv2.model.Condition>? = null
	var conditionalOperator: ConditionalOperator? = null
	var exclusiveStartKey: Map<String, com.amazonaws.services.dynamodbv2.model.AttributeValue>? = null
	var returnConsumedCapacity: ReturnConsumedCapacity? = null
	var totalSegments: Int? = 0
	var segment: Int? = 0
	var projectionExpression: String? = null
	var filterExpression: String? = null
	var expressionAttributeNames: Map<String, String>? = null
	var expressionAttributeValues: Map<String, com.amazonaws.services.dynamodbv2.model.AttributeValue>? = null
	var consistentRead: Boolean? = false

	override fun build(): com.amazonaws.services.dynamodbv2.model.ScanRequest {
		val input = com.amazonaws.services.dynamodbv2.model.ScanRequest()
		input.setTableName(this.tableName)
		input.setIndexName(this.indexName)
		input.setAttributesToGet(this.attributesToGet)
		input.setLimit(this.limit)
		input.setSelect(this.select?.toString())
		input.setScanFilter(this.scanFilter)
		input.setConditionalOperator(this.conditionalOperator?.toString())
		input.setExclusiveStartKey(this.exclusiveStartKey)
		input.setReturnConsumedCapacity(this.returnConsumedCapacity?.toString())
		input.setTotalSegments(this.totalSegments)
		input.setSegment(this.segment)
		input.setProjectionExpression(this.projectionExpression)
		input.setFilterExpression(this.filterExpression)
		input.setExpressionAttributeNames(this.expressionAttributeNames)
		input.setExpressionAttributeValues(this.expressionAttributeValues)
		input.setConsistentRead(this.consistentRead)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dynamodbv2.model.ScanResult {
	  return com.amazonaws.services.dynamodbv2.model.ScanResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.dynamodbv2.model.ScanResult {
		return environment.dynamodb.scan(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dynamodb scan")
				.argument("table-name", tableName)
				.argument("index-name", indexName)
				.argument("attributes-to-get", attributesToGet?.toString())
				.argument("limit", limit?.toString())
				.argument("select", select?.toString())
				.argument("scan-filter", scanFilter?.toString())
				.argument("conditional-operator", conditionalOperator?.toString())
				.argument("exclusive-start-key", exclusiveStartKey?.toString())
				.argument("return-consumed-capacity", returnConsumedCapacity?.toString())
				.argument("total-segments", totalSegments?.toString())
				.argument("segment", segment?.toString())
				.argument("projection-expression", projectionExpression)
				.argument("filter-expression", filterExpression)
				.argument("expression-attribute-names", expressionAttributeNames?.toString())
				.argument("expression-attribute-values", expressionAttributeValues?.toString())
				.option("consistent-read", consistentRead ?: false)
	}

}


fun AmazonDynamoDBFunctions.tagResource(resourceArn: String, tags: List<com.amazonaws.services.dynamodbv2.model.Tag>, init: AmazonDynamoDBTagResourceCommand.() -> Unit): com.amazonaws.services.dynamodbv2.model.TagResourceResult {
	return this.block.declare(AmazonDynamoDBTagResourceCommand(resourceArn, tags).apply(init)) as com.amazonaws.services.dynamodbv2.model.TagResourceResult
}

@Generated
class AmazonDynamoDBTagResourceCommand(val resourceArn: String, val tags: List<com.amazonaws.services.dynamodbv2.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.dynamodbv2.model.TagResourceRequest, com.amazonaws.services.dynamodbv2.model.TagResourceResult> {



	override fun build(): com.amazonaws.services.dynamodbv2.model.TagResourceRequest {
		val input = com.amazonaws.services.dynamodbv2.model.TagResourceRequest()
		input.setResourceArn(this.resourceArn)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dynamodbv2.model.TagResourceResult {
	  return com.amazonaws.services.dynamodbv2.model.TagResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.dynamodbv2.model.TagResourceResult {
		return environment.dynamodb.tagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dynamodb tag-resource")
				.argument("resource-arn", resourceArn)
				.argument("tags", tags.toString())
	}

}


fun AmazonDynamoDBFunctions.untagResource(resourceArn: String, tagKeys: List<String>, init: AmazonDynamoDBUntagResourceCommand.() -> Unit): com.amazonaws.services.dynamodbv2.model.UntagResourceResult {
	return this.block.declare(AmazonDynamoDBUntagResourceCommand(resourceArn, tagKeys).apply(init)) as com.amazonaws.services.dynamodbv2.model.UntagResourceResult
}

@Generated
class AmazonDynamoDBUntagResourceCommand(val resourceArn: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.dynamodbv2.model.UntagResourceRequest, com.amazonaws.services.dynamodbv2.model.UntagResourceResult> {



	override fun build(): com.amazonaws.services.dynamodbv2.model.UntagResourceRequest {
		val input = com.amazonaws.services.dynamodbv2.model.UntagResourceRequest()
		input.setResourceArn(this.resourceArn)
		input.setTagKeys(this.tagKeys)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dynamodbv2.model.UntagResourceResult {
	  return com.amazonaws.services.dynamodbv2.model.UntagResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.dynamodbv2.model.UntagResourceResult {
		return environment.dynamodb.untagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dynamodb untag-resource")
				.argument("resource-arn", resourceArn)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AmazonDynamoDBFunctions.updateContinuousBackups(tableName: String, pointInTimeRecoverySpecification: com.amazonaws.services.dynamodbv2.model.PointInTimeRecoverySpecification, init: AmazonDynamoDBUpdateContinuousBackupsCommand.() -> Unit): com.amazonaws.services.dynamodbv2.model.UpdateContinuousBackupsResult {
	return this.block.declare(AmazonDynamoDBUpdateContinuousBackupsCommand(tableName, pointInTimeRecoverySpecification).apply(init)) as com.amazonaws.services.dynamodbv2.model.UpdateContinuousBackupsResult
}

@Generated
class AmazonDynamoDBUpdateContinuousBackupsCommand(val tableName: String, val pointInTimeRecoverySpecification: com.amazonaws.services.dynamodbv2.model.PointInTimeRecoverySpecification) : AmazonWebServiceCommand<com.amazonaws.services.dynamodbv2.model.UpdateContinuousBackupsRequest, com.amazonaws.services.dynamodbv2.model.UpdateContinuousBackupsResult> {



	override fun build(): com.amazonaws.services.dynamodbv2.model.UpdateContinuousBackupsRequest {
		val input = com.amazonaws.services.dynamodbv2.model.UpdateContinuousBackupsRequest()
		input.setTableName(this.tableName)
		input.setPointInTimeRecoverySpecification(this.pointInTimeRecoverySpecification)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dynamodbv2.model.UpdateContinuousBackupsResult {
	  return com.amazonaws.services.dynamodbv2.model.UpdateContinuousBackupsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.dynamodbv2.model.UpdateContinuousBackupsResult {
		return environment.dynamodb.updateContinuousBackups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dynamodb update-continuous-backups")
				.argument("table-name", tableName)
				.argument("point-in-time-recovery-specification", pointInTimeRecoverySpecification.toString())
	}

}


fun AmazonDynamoDBFunctions.updateGlobalTable(globalTableName: String, replicaUpdates: List<com.amazonaws.services.dynamodbv2.model.ReplicaUpdate>, init: AmazonDynamoDBUpdateGlobalTableCommand.() -> Unit): com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableResult {
	return this.block.declare(AmazonDynamoDBUpdateGlobalTableCommand(globalTableName, replicaUpdates).apply(init)) as com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableResult
}

@Generated
class AmazonDynamoDBUpdateGlobalTableCommand(val globalTableName: String, val replicaUpdates: List<com.amazonaws.services.dynamodbv2.model.ReplicaUpdate>) : AmazonWebServiceCommand<com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableRequest, com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableResult> {



	override fun build(): com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableRequest {
		val input = com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableRequest()
		input.setGlobalTableName(this.globalTableName)
		input.setReplicaUpdates(this.replicaUpdates)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableResult {
	  return com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableResult {
		return environment.dynamodb.updateGlobalTable(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dynamodb update-global-table")
				.argument("global-table-name", globalTableName)
				.argument("replica-updates", replicaUpdates.toString())
	}

}


fun AmazonDynamoDBFunctions.updateItem(tableName: String, key: Map<String, com.amazonaws.services.dynamodbv2.model.AttributeValue>, init: AmazonDynamoDBUpdateItemCommand.() -> Unit): com.amazonaws.services.dynamodbv2.model.UpdateItemResult {
	return this.block.declare(AmazonDynamoDBUpdateItemCommand(tableName, key).apply(init)) as com.amazonaws.services.dynamodbv2.model.UpdateItemResult
}

@Generated
class AmazonDynamoDBUpdateItemCommand(val tableName: String, val key: Map<String, com.amazonaws.services.dynamodbv2.model.AttributeValue>) : AmazonWebServiceCommand<com.amazonaws.services.dynamodbv2.model.UpdateItemRequest, com.amazonaws.services.dynamodbv2.model.UpdateItemResult> {

	var attributeUpdates: Map<String, com.amazonaws.services.dynamodbv2.model.AttributeValueUpdate>? = null
	var expected: Map<String, com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue>? = null
	var conditionalOperator: ConditionalOperator? = null
	var returnValues: ReturnValue? = null
	var returnConsumedCapacity: ReturnConsumedCapacity? = null
	var returnItemCollectionMetrics: ReturnItemCollectionMetrics? = null
	var updateExpression: String? = null
	var conditionExpression: String? = null
	var expressionAttributeNames: Map<String, String>? = null
	var expressionAttributeValues: Map<String, com.amazonaws.services.dynamodbv2.model.AttributeValue>? = null

	override fun build(): com.amazonaws.services.dynamodbv2.model.UpdateItemRequest {
		val input = com.amazonaws.services.dynamodbv2.model.UpdateItemRequest()
		input.setTableName(this.tableName)
		input.setKey(this.key)
		input.setAttributeUpdates(this.attributeUpdates)
		input.setExpected(this.expected)
		input.setConditionalOperator(this.conditionalOperator?.toString())
		input.setReturnValues(this.returnValues?.toString())
		input.setReturnConsumedCapacity(this.returnConsumedCapacity?.toString())
		input.setReturnItemCollectionMetrics(this.returnItemCollectionMetrics?.toString())
		input.setUpdateExpression(this.updateExpression)
		input.setConditionExpression(this.conditionExpression)
		input.setExpressionAttributeNames(this.expressionAttributeNames)
		input.setExpressionAttributeValues(this.expressionAttributeValues)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dynamodbv2.model.UpdateItemResult {
	  return com.amazonaws.services.dynamodbv2.model.UpdateItemResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.dynamodbv2.model.UpdateItemResult {
		return environment.dynamodb.updateItem(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dynamodb update-item")
				.argument("table-name", tableName)
				.argument("key", key.toString())
				.argument("attribute-updates", attributeUpdates?.toString())
				.argument("expected", expected?.toString())
				.argument("conditional-operator", conditionalOperator?.toString())
				.argument("return-values", returnValues?.toString())
				.argument("return-consumed-capacity", returnConsumedCapacity?.toString())
				.argument("return-item-collection-metrics", returnItemCollectionMetrics?.toString())
				.argument("update-expression", updateExpression)
				.argument("condition-expression", conditionExpression)
				.argument("expression-attribute-names", expressionAttributeNames?.toString())
				.argument("expression-attribute-values", expressionAttributeValues?.toString())
	}

}


fun AmazonDynamoDBFunctions.updateTable(tableName: String, init: AmazonDynamoDBUpdateTableCommand.() -> Unit): com.amazonaws.services.dynamodbv2.model.UpdateTableResult {
	return this.block.declare(AmazonDynamoDBUpdateTableCommand(tableName).apply(init)) as com.amazonaws.services.dynamodbv2.model.UpdateTableResult
}

@Generated
class AmazonDynamoDBUpdateTableCommand(val tableName: String) : AmazonWebServiceCommand<com.amazonaws.services.dynamodbv2.model.UpdateTableRequest, com.amazonaws.services.dynamodbv2.model.UpdateTableResult> {

	var attributeDefinitions: List<com.amazonaws.services.dynamodbv2.model.AttributeDefinition>? = null
	var provisionedThroughput: com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput? = null
	var globalSecondaryIndexUpdates: List<com.amazonaws.services.dynamodbv2.model.GlobalSecondaryIndexUpdate>? = null
	var streamSpecification: com.amazonaws.services.dynamodbv2.model.StreamSpecification? = null

	override fun build(): com.amazonaws.services.dynamodbv2.model.UpdateTableRequest {
		val input = com.amazonaws.services.dynamodbv2.model.UpdateTableRequest()
		input.setAttributeDefinitions(this.attributeDefinitions)
		input.setTableName(this.tableName)
		input.setProvisionedThroughput(this.provisionedThroughput)
		input.setGlobalSecondaryIndexUpdates(this.globalSecondaryIndexUpdates)
		input.setStreamSpecification(this.streamSpecification)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dynamodbv2.model.UpdateTableResult {
	  return com.amazonaws.services.dynamodbv2.model.UpdateTableResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.dynamodbv2.model.UpdateTableResult {
		return environment.dynamodb.updateTable(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dynamodb update-table")
				.argument("attribute-definitions", attributeDefinitions?.toString())
				.argument("table-name", tableName)
				.argument("provisioned-throughput", provisionedThroughput?.toString())
				.argument("global-secondary-index-updates", globalSecondaryIndexUpdates?.toString())
				.argument("stream-specification", streamSpecification?.toString())
	}

}


fun AmazonDynamoDBFunctions.updateTimeToLive(tableName: String, timeToLiveSpecification: com.amazonaws.services.dynamodbv2.model.TimeToLiveSpecification, init: AmazonDynamoDBUpdateTimeToLiveCommand.() -> Unit): com.amazonaws.services.dynamodbv2.model.UpdateTimeToLiveResult {
	return this.block.declare(AmazonDynamoDBUpdateTimeToLiveCommand(tableName, timeToLiveSpecification).apply(init)) as com.amazonaws.services.dynamodbv2.model.UpdateTimeToLiveResult
}

@Generated
class AmazonDynamoDBUpdateTimeToLiveCommand(val tableName: String, val timeToLiveSpecification: com.amazonaws.services.dynamodbv2.model.TimeToLiveSpecification) : AmazonWebServiceCommand<com.amazonaws.services.dynamodbv2.model.UpdateTimeToLiveRequest, com.amazonaws.services.dynamodbv2.model.UpdateTimeToLiveResult> {



	override fun build(): com.amazonaws.services.dynamodbv2.model.UpdateTimeToLiveRequest {
		val input = com.amazonaws.services.dynamodbv2.model.UpdateTimeToLiveRequest()
		input.setTableName(this.tableName)
		input.setTimeToLiveSpecification(this.timeToLiveSpecification)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dynamodbv2.model.UpdateTimeToLiveResult {
	  return com.amazonaws.services.dynamodbv2.model.UpdateTimeToLiveResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.dynamodbv2.model.UpdateTimeToLiveResult {
		return environment.dynamodb.updateTimeToLive(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dynamodb update-time-to-live")
				.argument("table-name", tableName)
				.argument("time-to-live-specification", timeToLiveSpecification.toString())
	}

}
