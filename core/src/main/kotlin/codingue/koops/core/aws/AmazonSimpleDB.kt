
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.simpledb.AmazonSimpleDB
import com.amazonaws.services.simpledb.model.*

var codingue.koops.core.Environment.sdb: AmazonSimpleDB
	get() = this.capabilities[AmazonSimpleDB::class.java.name] as AmazonSimpleDB
	set(sdb) {
		this.capabilities[AmazonSimpleDB::class.java.name] = sdb
	}

@Generated
class AmazonSimpleDBFunctions(val block: Block)

infix fun AwsContinuation.sdb(init: AmazonSimpleDBFunctions.() -> Unit) {
	AmazonSimpleDBFunctions(shell).apply(init)
}

			

fun AmazonSimpleDBFunctions.batchDeleteAttributes(domainName: String, items: List<com.amazonaws.services.simpledb.model.DeletableItem>, init: AmazonSimpleDBBatchDeleteAttributesCommand.() -> Unit) {
	this.block.declare(AmazonSimpleDBBatchDeleteAttributesCommand(domainName, items).apply(init))
}

@Generated
class AmazonSimpleDBBatchDeleteAttributesCommand(val domainName: String, val items: List<com.amazonaws.services.simpledb.model.DeletableItem>) : AmazonWebServiceCommand<com.amazonaws.services.simpledb.model.BatchDeleteAttributesRequest> {



	override fun build(): com.amazonaws.services.simpledb.model.BatchDeleteAttributesRequest {
		val input = com.amazonaws.services.simpledb.model.BatchDeleteAttributesRequest()
		input.setDomainName(this.domainName)
		input.setItems(this.items)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sdb.batchDeleteAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sdb batch-delete-attributes")
				.argument("domain-name", domainName)
				.argument("items", items.toString())
	}

}


fun AmazonSimpleDBFunctions.batchPutAttributes(domainName: String, items: List<com.amazonaws.services.simpledb.model.ReplaceableItem>, init: AmazonSimpleDBBatchPutAttributesCommand.() -> Unit) {
	this.block.declare(AmazonSimpleDBBatchPutAttributesCommand(domainName, items).apply(init))
}

@Generated
class AmazonSimpleDBBatchPutAttributesCommand(val domainName: String, val items: List<com.amazonaws.services.simpledb.model.ReplaceableItem>) : AmazonWebServiceCommand<com.amazonaws.services.simpledb.model.BatchPutAttributesRequest> {



	override fun build(): com.amazonaws.services.simpledb.model.BatchPutAttributesRequest {
		val input = com.amazonaws.services.simpledb.model.BatchPutAttributesRequest()
		input.setDomainName(this.domainName)
		input.setItems(this.items)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sdb.batchPutAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sdb batch-put-attributes")
				.argument("domain-name", domainName)
				.argument("items", items.toString())
	}

}


fun AmazonSimpleDBFunctions.createDomain(domainName: String, init: AmazonSimpleDBCreateDomainCommand.() -> Unit) {
	this.block.declare(AmazonSimpleDBCreateDomainCommand(domainName).apply(init))
}

@Generated
class AmazonSimpleDBCreateDomainCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpledb.model.CreateDomainRequest> {



	override fun build(): com.amazonaws.services.simpledb.model.CreateDomainRequest {
		val input = com.amazonaws.services.simpledb.model.CreateDomainRequest()
		input.setDomainName(this.domainName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sdb.createDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sdb create-domain")
				.argument("domain-name", domainName)
	}

}


fun AmazonSimpleDBFunctions.deleteAttributes(domainName: String, itemName: String, init: AmazonSimpleDBDeleteAttributesCommand.() -> Unit) {
	this.block.declare(AmazonSimpleDBDeleteAttributesCommand(domainName, itemName).apply(init))
}

@Generated
class AmazonSimpleDBDeleteAttributesCommand(val domainName: String, val itemName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpledb.model.DeleteAttributesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sdb.deleteAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sdb delete-attributes")
				.argument("domain-name", domainName)
				.argument("item-name", itemName)
				.argument("attributes", attributes?.toString())
				.argument("expected", expected?.toString())
	}

}


fun AmazonSimpleDBFunctions.deleteDomain(domainName: String, init: AmazonSimpleDBDeleteDomainCommand.() -> Unit) {
	this.block.declare(AmazonSimpleDBDeleteDomainCommand(domainName).apply(init))
}

@Generated
class AmazonSimpleDBDeleteDomainCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpledb.model.DeleteDomainRequest> {



	override fun build(): com.amazonaws.services.simpledb.model.DeleteDomainRequest {
		val input = com.amazonaws.services.simpledb.model.DeleteDomainRequest()
		input.setDomainName(this.domainName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sdb.deleteDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sdb delete-domain")
				.argument("domain-name", domainName)
	}

}


fun AmazonSimpleDBFunctions.domainMetadata(domainName: String, init: AmazonSimpleDBDomainMetadataCommand.() -> Unit) {
	this.block.declare(AmazonSimpleDBDomainMetadataCommand(domainName).apply(init))
}

@Generated
class AmazonSimpleDBDomainMetadataCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpledb.model.DomainMetadataRequest> {



	override fun build(): com.amazonaws.services.simpledb.model.DomainMetadataRequest {
		val input = com.amazonaws.services.simpledb.model.DomainMetadataRequest()
		input.setDomainName(this.domainName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sdb.domainMetadata(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sdb domain-metadata")
				.argument("domain-name", domainName)
	}

}


fun AmazonSimpleDBFunctions.getAttributes(domainName: String, itemName: String, init: AmazonSimpleDBGetAttributesCommand.() -> Unit) {
	this.block.declare(AmazonSimpleDBGetAttributesCommand(domainName, itemName).apply(init))
}

@Generated
class AmazonSimpleDBGetAttributesCommand(val domainName: String, val itemName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpledb.model.GetAttributesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sdb.getAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sdb get-attributes")
				.argument("domain-name", domainName)
				.argument("item-name", itemName)
				.argument("attribute-names", attributeNames?.toString())
				.option("consistent-read", consistentRead ?: false)
	}

}


fun AmazonSimpleDBFunctions.listDomains(init: AmazonSimpleDBListDomainsCommand.() -> Unit) {
	this.block.declare(AmazonSimpleDBListDomainsCommand().apply(init))
}

@Generated
class AmazonSimpleDBListDomainsCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpledb.model.ListDomainsRequest> {

	var maxNumberOfDomains: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.simpledb.model.ListDomainsRequest {
		val input = com.amazonaws.services.simpledb.model.ListDomainsRequest()
		input.setMaxNumberOfDomains(this.maxNumberOfDomains)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sdb.listDomains(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sdb list-domains")
				.argument("max-number-of-domains", maxNumberOfDomains?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonSimpleDBFunctions.putAttributes(domainName: String, itemName: String, attributes: List<com.amazonaws.services.simpledb.model.ReplaceableAttribute>, init: AmazonSimpleDBPutAttributesCommand.() -> Unit) {
	this.block.declare(AmazonSimpleDBPutAttributesCommand(domainName, itemName, attributes).apply(init))
}

@Generated
class AmazonSimpleDBPutAttributesCommand(val domainName: String, val itemName: String, val attributes: List<com.amazonaws.services.simpledb.model.ReplaceableAttribute>) : AmazonWebServiceCommand<com.amazonaws.services.simpledb.model.PutAttributesRequest> {

	var expected: com.amazonaws.services.simpledb.model.UpdateCondition? = null

	override fun build(): com.amazonaws.services.simpledb.model.PutAttributesRequest {
		val input = com.amazonaws.services.simpledb.model.PutAttributesRequest()
		input.setDomainName(this.domainName)
		input.setItemName(this.itemName)
		input.setAttributes(this.attributes)
		input.setExpected(this.expected)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sdb.putAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sdb put-attributes")
				.argument("domain-name", domainName)
				.argument("item-name", itemName)
				.argument("attributes", attributes.toString())
				.argument("expected", expected?.toString())
	}

}


fun AmazonSimpleDBFunctions.select(selectExpression: String, init: AmazonSimpleDBSelectCommand.() -> Unit) {
	this.block.declare(AmazonSimpleDBSelectCommand(selectExpression).apply(init))
}

@Generated
class AmazonSimpleDBSelectCommand(val selectExpression: String) : AmazonWebServiceCommand<com.amazonaws.services.simpledb.model.SelectRequest> {

	var nextToken: String? = null
	var consistentRead: Boolean? = false

	override fun build(): com.amazonaws.services.simpledb.model.SelectRequest {
		val input = com.amazonaws.services.simpledb.model.SelectRequest()
		input.setSelectExpression(this.selectExpression)
		input.setNextToken(this.nextToken)
		input.setConsistentRead(this.consistentRead)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sdb.select(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sdb select")
				.argument("select-expression", selectExpression)
				.argument("next-token", nextToken)
				.option("consistent-read", consistentRead ?: false)
	}

}
