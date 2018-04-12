
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws

import javax.annotation.Generated
import codingue.koops.core.*
import com.amazonaws.services.simpledb.*
import com.amazonaws.services.simpledb.model.*

var codingue.koops.core.Environment.sdb: AmazonSimpleDB
	get() {
		var service = this.capabilities["aws-sdb"]
		if (service == null) {
			service = AmazonSimpleDBClientBuilder.standard().build()
			this.capabilities["aws-sdb"] = service
		}
		return service as AmazonSimpleDB
	}
	set(sdb) {
		this.capabilities["aws-sdb"] = sdb
	}

@Generated
class AmazonSimpleDBFunctions(val block: Block)

infix fun <T> AwsContinuation.sdb(init: AmazonSimpleDBFunctions.() -> T): T {
	return AmazonSimpleDBFunctions(shell).run(init)
}

			

fun AmazonSimpleDBFunctions.batchDeleteAttributes(domainName: String, items: List<com.amazonaws.services.simpledb.model.DeletableItem>, init: AmazonSimpleDBBatchDeleteAttributesCommand.() -> Unit): com.amazonaws.services.simpledb.model.BatchDeleteAttributesResult {
	return this.block.declare(AmazonSimpleDBBatchDeleteAttributesCommand(domainName, items).apply(init)) as com.amazonaws.services.simpledb.model.BatchDeleteAttributesResult
}

@Generated
class AmazonSimpleDBBatchDeleteAttributesCommand(val domainName: String, val items: List<com.amazonaws.services.simpledb.model.DeletableItem>) : AmazonWebServiceCommand<com.amazonaws.services.simpledb.model.BatchDeleteAttributesRequest, com.amazonaws.services.simpledb.model.BatchDeleteAttributesResult> {



	override fun build(): com.amazonaws.services.simpledb.model.BatchDeleteAttributesRequest {
		val input = com.amazonaws.services.simpledb.model.BatchDeleteAttributesRequest()
		input.setDomainName(this.domainName)
		input.setItems(this.items)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpledb.model.BatchDeleteAttributesResult {
	  return com.amazonaws.services.simpledb.model.BatchDeleteAttributesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpledb.model.BatchDeleteAttributesResult {
		return environment.sdb.batchDeleteAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sdb batch-delete-attributes")
				.argument("domain-name", domainName)
				.argument("items", items.toString())
	}

}


fun AmazonSimpleDBFunctions.batchPutAttributes(domainName: String, items: List<com.amazonaws.services.simpledb.model.ReplaceableItem>, init: AmazonSimpleDBBatchPutAttributesCommand.() -> Unit): com.amazonaws.services.simpledb.model.BatchPutAttributesResult {
	return this.block.declare(AmazonSimpleDBBatchPutAttributesCommand(domainName, items).apply(init)) as com.amazonaws.services.simpledb.model.BatchPutAttributesResult
}

@Generated
class AmazonSimpleDBBatchPutAttributesCommand(val domainName: String, val items: List<com.amazonaws.services.simpledb.model.ReplaceableItem>) : AmazonWebServiceCommand<com.amazonaws.services.simpledb.model.BatchPutAttributesRequest, com.amazonaws.services.simpledb.model.BatchPutAttributesResult> {



	override fun build(): com.amazonaws.services.simpledb.model.BatchPutAttributesRequest {
		val input = com.amazonaws.services.simpledb.model.BatchPutAttributesRequest()
		input.setDomainName(this.domainName)
		input.setItems(this.items)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpledb.model.BatchPutAttributesResult {
	  return com.amazonaws.services.simpledb.model.BatchPutAttributesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpledb.model.BatchPutAttributesResult {
		return environment.sdb.batchPutAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sdb batch-put-attributes")
				.argument("domain-name", domainName)
				.argument("items", items.toString())
	}

}


fun AmazonSimpleDBFunctions.createDomain(domainName: String, init: AmazonSimpleDBCreateDomainCommand.() -> Unit): com.amazonaws.services.simpledb.model.CreateDomainResult {
	return this.block.declare(AmazonSimpleDBCreateDomainCommand(domainName).apply(init)) as com.amazonaws.services.simpledb.model.CreateDomainResult
}

@Generated
class AmazonSimpleDBCreateDomainCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpledb.model.CreateDomainRequest, com.amazonaws.services.simpledb.model.CreateDomainResult> {



	override fun build(): com.amazonaws.services.simpledb.model.CreateDomainRequest {
		val input = com.amazonaws.services.simpledb.model.CreateDomainRequest()
		input.setDomainName(this.domainName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpledb.model.CreateDomainResult {
	  return com.amazonaws.services.simpledb.model.CreateDomainResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpledb.model.CreateDomainResult {
		return environment.sdb.createDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sdb create-domain")
				.argument("domain-name", domainName)
	}

}


fun AmazonSimpleDBFunctions.deleteAttributes(domainName: String, itemName: String, init: AmazonSimpleDBDeleteAttributesCommand.() -> Unit): com.amazonaws.services.simpledb.model.DeleteAttributesResult {
	return this.block.declare(AmazonSimpleDBDeleteAttributesCommand(domainName, itemName).apply(init)) as com.amazonaws.services.simpledb.model.DeleteAttributesResult
}

@Generated
class AmazonSimpleDBDeleteAttributesCommand(val domainName: String, val itemName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpledb.model.DeleteAttributesRequest, com.amazonaws.services.simpledb.model.DeleteAttributesResult> {

	var attributes: List<com.amazonaws.services.simpledb.model.Attribute>? = null
	var expected: com.amazonaws.services.simpledb.model.UpdateCondition? = null

	override fun build(): com.amazonaws.services.simpledb.model.DeleteAttributesRequest {
		val input = com.amazonaws.services.simpledb.model.DeleteAttributesRequest()
		input.setDomainName(this.domainName)
		input.setItemName(this.itemName)
		input.setAttributes(this.attributes)
		input.setExpected(this.expected)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpledb.model.DeleteAttributesResult {
	  return com.amazonaws.services.simpledb.model.DeleteAttributesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpledb.model.DeleteAttributesResult {
		return environment.sdb.deleteAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sdb delete-attributes")
				.argument("domain-name", domainName)
				.argument("item-name", itemName)
				.argument("attributes", attributes?.toString())
				.argument("expected", expected?.toString())
	}

}


fun AmazonSimpleDBFunctions.deleteDomain(domainName: String, init: AmazonSimpleDBDeleteDomainCommand.() -> Unit): com.amazonaws.services.simpledb.model.DeleteDomainResult {
	return this.block.declare(AmazonSimpleDBDeleteDomainCommand(domainName).apply(init)) as com.amazonaws.services.simpledb.model.DeleteDomainResult
}

@Generated
class AmazonSimpleDBDeleteDomainCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpledb.model.DeleteDomainRequest, com.amazonaws.services.simpledb.model.DeleteDomainResult> {



	override fun build(): com.amazonaws.services.simpledb.model.DeleteDomainRequest {
		val input = com.amazonaws.services.simpledb.model.DeleteDomainRequest()
		input.setDomainName(this.domainName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpledb.model.DeleteDomainResult {
	  return com.amazonaws.services.simpledb.model.DeleteDomainResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpledb.model.DeleteDomainResult {
		return environment.sdb.deleteDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sdb delete-domain")
				.argument("domain-name", domainName)
	}

}


fun AmazonSimpleDBFunctions.domainMetadata(domainName: String, init: AmazonSimpleDBDomainMetadataCommand.() -> Unit): com.amazonaws.services.simpledb.model.DomainMetadataResult {
	return this.block.declare(AmazonSimpleDBDomainMetadataCommand(domainName).apply(init)) as com.amazonaws.services.simpledb.model.DomainMetadataResult
}

@Generated
class AmazonSimpleDBDomainMetadataCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpledb.model.DomainMetadataRequest, com.amazonaws.services.simpledb.model.DomainMetadataResult> {



	override fun build(): com.amazonaws.services.simpledb.model.DomainMetadataRequest {
		val input = com.amazonaws.services.simpledb.model.DomainMetadataRequest()
		input.setDomainName(this.domainName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpledb.model.DomainMetadataResult {
	  return com.amazonaws.services.simpledb.model.DomainMetadataResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpledb.model.DomainMetadataResult {
		return environment.sdb.domainMetadata(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sdb domain-metadata")
				.argument("domain-name", domainName)
	}

}


fun AmazonSimpleDBFunctions.getAttributes(domainName: String, itemName: String, init: AmazonSimpleDBGetAttributesCommand.() -> Unit): com.amazonaws.services.simpledb.model.GetAttributesResult {
	return this.block.declare(AmazonSimpleDBGetAttributesCommand(domainName, itemName).apply(init)) as com.amazonaws.services.simpledb.model.GetAttributesResult
}

@Generated
class AmazonSimpleDBGetAttributesCommand(val domainName: String, val itemName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpledb.model.GetAttributesRequest, com.amazonaws.services.simpledb.model.GetAttributesResult> {

	var attributeNames: List<String>? = null
	var consistentRead: Boolean? = false

	override fun build(): com.amazonaws.services.simpledb.model.GetAttributesRequest {
		val input = com.amazonaws.services.simpledb.model.GetAttributesRequest()
		input.setDomainName(this.domainName)
		input.setItemName(this.itemName)
		input.setAttributeNames(this.attributeNames)
		input.setConsistentRead(this.consistentRead)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpledb.model.GetAttributesResult {
	  return com.amazonaws.services.simpledb.model.GetAttributesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpledb.model.GetAttributesResult {
		return environment.sdb.getAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sdb get-attributes")
				.argument("domain-name", domainName)
				.argument("item-name", itemName)
				.argument("attribute-names", attributeNames?.toString())
				.option("consistent-read", consistentRead ?: false)
	}

}


fun AmazonSimpleDBFunctions.listDomains(init: AmazonSimpleDBListDomainsCommand.() -> Unit): com.amazonaws.services.simpledb.model.ListDomainsResult {
	return this.block.declare(AmazonSimpleDBListDomainsCommand().apply(init)) as com.amazonaws.services.simpledb.model.ListDomainsResult
}

@Generated
class AmazonSimpleDBListDomainsCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpledb.model.ListDomainsRequest, com.amazonaws.services.simpledb.model.ListDomainsResult> {

	var maxNumberOfDomains: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.simpledb.model.ListDomainsRequest {
		val input = com.amazonaws.services.simpledb.model.ListDomainsRequest()
		input.setMaxNumberOfDomains(this.maxNumberOfDomains)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpledb.model.ListDomainsResult {
	  return com.amazonaws.services.simpledb.model.ListDomainsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpledb.model.ListDomainsResult {
		return environment.sdb.listDomains(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sdb list-domains")
				.argument("max-number-of-domains", maxNumberOfDomains?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonSimpleDBFunctions.putAttributes(domainName: String, itemName: String, attributes: List<com.amazonaws.services.simpledb.model.ReplaceableAttribute>, init: AmazonSimpleDBPutAttributesCommand.() -> Unit): com.amazonaws.services.simpledb.model.PutAttributesResult {
	return this.block.declare(AmazonSimpleDBPutAttributesCommand(domainName, itemName, attributes).apply(init)) as com.amazonaws.services.simpledb.model.PutAttributesResult
}

@Generated
class AmazonSimpleDBPutAttributesCommand(val domainName: String, val itemName: String, val attributes: List<com.amazonaws.services.simpledb.model.ReplaceableAttribute>) : AmazonWebServiceCommand<com.amazonaws.services.simpledb.model.PutAttributesRequest, com.amazonaws.services.simpledb.model.PutAttributesResult> {

	var expected: com.amazonaws.services.simpledb.model.UpdateCondition? = null

	override fun build(): com.amazonaws.services.simpledb.model.PutAttributesRequest {
		val input = com.amazonaws.services.simpledb.model.PutAttributesRequest()
		input.setDomainName(this.domainName)
		input.setItemName(this.itemName)
		input.setAttributes(this.attributes)
		input.setExpected(this.expected)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpledb.model.PutAttributesResult {
	  return com.amazonaws.services.simpledb.model.PutAttributesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpledb.model.PutAttributesResult {
		return environment.sdb.putAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sdb put-attributes")
				.argument("domain-name", domainName)
				.argument("item-name", itemName)
				.argument("attributes", attributes.toString())
				.argument("expected", expected?.toString())
	}

}


fun AmazonSimpleDBFunctions.select(selectExpression: String, init: AmazonSimpleDBSelectCommand.() -> Unit): com.amazonaws.services.simpledb.model.SelectResult {
	return this.block.declare(AmazonSimpleDBSelectCommand(selectExpression).apply(init)) as com.amazonaws.services.simpledb.model.SelectResult
}

@Generated
class AmazonSimpleDBSelectCommand(val selectExpression: String) : AmazonWebServiceCommand<com.amazonaws.services.simpledb.model.SelectRequest, com.amazonaws.services.simpledb.model.SelectResult> {

	var nextToken: String? = null
	var consistentRead: Boolean? = false

	override fun build(): com.amazonaws.services.simpledb.model.SelectRequest {
		val input = com.amazonaws.services.simpledb.model.SelectRequest()
		input.setSelectExpression(this.selectExpression)
		input.setNextToken(this.nextToken)
		input.setConsistentRead(this.consistentRead)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpledb.model.SelectResult {
	  return com.amazonaws.services.simpledb.model.SelectResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpledb.model.SelectResult {
		return environment.sdb.select(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sdb select")
				.argument("select-expression", selectExpression)
				.argument("next-token", nextToken)
				.option("consistent-read", consistentRead ?: false)
	}

}
