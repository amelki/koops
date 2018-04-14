
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws.clouddirectory

import javax.annotation.Generated
import codingue.koops.core.*
import codingue.koops.aws.*
import com.amazonaws.services.clouddirectory.*
import com.amazonaws.services.clouddirectory.model.*

var codingue.koops.core.Environment.clouddirectory: AmazonCloudDirectory
	get() {
		var service = this.capabilities["aws-clouddirectory"]
		if (service == null) {
			service = AmazonCloudDirectoryClientBuilder.standard().build()
			this.capabilities["aws-clouddirectory"] = service
		}
		return service as AmazonCloudDirectory
	}
	set(clouddirectory) {
		this.capabilities["aws-clouddirectory"] = clouddirectory
	}

@Generated
class AmazonCloudDirectoryFunctions(val block: Block)

infix fun <T> AwsContinuation.clouddirectory(init: AmazonCloudDirectoryFunctions.() -> T): T {
	return AmazonCloudDirectoryFunctions(shell).run(init)
}

			

fun AmazonCloudDirectoryFunctions.addFacetToObject(directoryArn: String, schemaFacet: com.amazonaws.services.clouddirectory.model.SchemaFacet, objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, init: AmazonCloudDirectoryAddFacetToObjectCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.AddFacetToObjectResult {
	return this.block.declare(AmazonCloudDirectoryAddFacetToObjectCommand(directoryArn, schemaFacet, objectReference).apply(init)) as com.amazonaws.services.clouddirectory.model.AddFacetToObjectResult
}

@Generated
class AmazonCloudDirectoryAddFacetToObjectCommand(val directoryArn: String, val schemaFacet: com.amazonaws.services.clouddirectory.model.SchemaFacet, val objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.AddFacetToObjectRequest, com.amazonaws.services.clouddirectory.model.AddFacetToObjectResult> {

	var objectAttributeList: List<com.amazonaws.services.clouddirectory.model.AttributeKeyAndValue>? = null

	override fun build(): com.amazonaws.services.clouddirectory.model.AddFacetToObjectRequest {
		val input = com.amazonaws.services.clouddirectory.model.AddFacetToObjectRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setSchemaFacet(this.schemaFacet)
		input.setObjectAttributeList(this.objectAttributeList)
		input.setObjectReference(this.objectReference)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.AddFacetToObjectResult {
	  return com.amazonaws.services.clouddirectory.model.AddFacetToObjectResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.AddFacetToObjectResult {
		return environment.clouddirectory.addFacetToObject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory add-facet-to-object")
				.argument("directory-arn", directoryArn)
				.argument("schema-facet", schemaFacet.toString())
				.argument("object-attribute-list", objectAttributeList?.toString())
				.argument("object-reference", objectReference.toString())
	}

}


fun AmazonCloudDirectoryFunctions.applySchema(publishedSchemaArn: String, directoryArn: String, init: AmazonCloudDirectoryApplySchemaCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.ApplySchemaResult {
	return this.block.declare(AmazonCloudDirectoryApplySchemaCommand(publishedSchemaArn, directoryArn).apply(init)) as com.amazonaws.services.clouddirectory.model.ApplySchemaResult
}

@Generated
class AmazonCloudDirectoryApplySchemaCommand(val publishedSchemaArn: String, val directoryArn: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ApplySchemaRequest, com.amazonaws.services.clouddirectory.model.ApplySchemaResult> {



	override fun build(): com.amazonaws.services.clouddirectory.model.ApplySchemaRequest {
		val input = com.amazonaws.services.clouddirectory.model.ApplySchemaRequest()
		input.setPublishedSchemaArn(this.publishedSchemaArn)
		input.setDirectoryArn(this.directoryArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.ApplySchemaResult {
	  return com.amazonaws.services.clouddirectory.model.ApplySchemaResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.ApplySchemaResult {
		return environment.clouddirectory.applySchema(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory apply-schema")
				.argument("published-schema-arn", publishedSchemaArn)
				.argument("directory-arn", directoryArn)
	}

}


fun AmazonCloudDirectoryFunctions.attachObject(directoryArn: String, parentReference: com.amazonaws.services.clouddirectory.model.ObjectReference, childReference: com.amazonaws.services.clouddirectory.model.ObjectReference, linkName: String, init: AmazonCloudDirectoryAttachObjectCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.AttachObjectResult {
	return this.block.declare(AmazonCloudDirectoryAttachObjectCommand(directoryArn, parentReference, childReference, linkName).apply(init)) as com.amazonaws.services.clouddirectory.model.AttachObjectResult
}

@Generated
class AmazonCloudDirectoryAttachObjectCommand(val directoryArn: String, val parentReference: com.amazonaws.services.clouddirectory.model.ObjectReference, val childReference: com.amazonaws.services.clouddirectory.model.ObjectReference, val linkName: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.AttachObjectRequest, com.amazonaws.services.clouddirectory.model.AttachObjectResult> {



	override fun build(): com.amazonaws.services.clouddirectory.model.AttachObjectRequest {
		val input = com.amazonaws.services.clouddirectory.model.AttachObjectRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setParentReference(this.parentReference)
		input.setChildReference(this.childReference)
		input.setLinkName(this.linkName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.AttachObjectResult {
	  return com.amazonaws.services.clouddirectory.model.AttachObjectResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.AttachObjectResult {
		return environment.clouddirectory.attachObject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory attach-object")
				.argument("directory-arn", directoryArn)
				.argument("parent-reference", parentReference.toString())
				.argument("child-reference", childReference.toString())
				.argument("link-name", linkName)
	}

}


fun AmazonCloudDirectoryFunctions.attachPolicy(policyReference: com.amazonaws.services.clouddirectory.model.ObjectReference, objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, init: AmazonCloudDirectoryAttachPolicyCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.AttachPolicyResult {
	return this.block.declare(AmazonCloudDirectoryAttachPolicyCommand(policyReference, objectReference).apply(init)) as com.amazonaws.services.clouddirectory.model.AttachPolicyResult
}

@Generated
class AmazonCloudDirectoryAttachPolicyCommand(val policyReference: com.amazonaws.services.clouddirectory.model.ObjectReference, val objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.AttachPolicyRequest, com.amazonaws.services.clouddirectory.model.AttachPolicyResult> {

	var directoryArn: String? = null

	override fun build(): com.amazonaws.services.clouddirectory.model.AttachPolicyRequest {
		val input = com.amazonaws.services.clouddirectory.model.AttachPolicyRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setPolicyReference(this.policyReference)
		input.setObjectReference(this.objectReference)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.AttachPolicyResult {
	  return com.amazonaws.services.clouddirectory.model.AttachPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.AttachPolicyResult {
		return environment.clouddirectory.attachPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory attach-policy")
				.argument("directory-arn", directoryArn)
				.argument("policy-reference", policyReference.toString())
				.argument("object-reference", objectReference.toString())
	}

}


fun AmazonCloudDirectoryFunctions.attachToIndex(directoryArn: String, indexReference: com.amazonaws.services.clouddirectory.model.ObjectReference, targetReference: com.amazonaws.services.clouddirectory.model.ObjectReference, init: AmazonCloudDirectoryAttachToIndexCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.AttachToIndexResult {
	return this.block.declare(AmazonCloudDirectoryAttachToIndexCommand(directoryArn, indexReference, targetReference).apply(init)) as com.amazonaws.services.clouddirectory.model.AttachToIndexResult
}

@Generated
class AmazonCloudDirectoryAttachToIndexCommand(val directoryArn: String, val indexReference: com.amazonaws.services.clouddirectory.model.ObjectReference, val targetReference: com.amazonaws.services.clouddirectory.model.ObjectReference) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.AttachToIndexRequest, com.amazonaws.services.clouddirectory.model.AttachToIndexResult> {



	override fun build(): com.amazonaws.services.clouddirectory.model.AttachToIndexRequest {
		val input = com.amazonaws.services.clouddirectory.model.AttachToIndexRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setIndexReference(this.indexReference)
		input.setTargetReference(this.targetReference)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.AttachToIndexResult {
	  return com.amazonaws.services.clouddirectory.model.AttachToIndexResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.AttachToIndexResult {
		return environment.clouddirectory.attachToIndex(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory attach-to-index")
				.argument("directory-arn", directoryArn)
				.argument("index-reference", indexReference.toString())
				.argument("target-reference", targetReference.toString())
	}

}


fun AmazonCloudDirectoryFunctions.attachTypedLink(directoryArn: String, sourceObjectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, targetObjectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, typedLinkFacet: com.amazonaws.services.clouddirectory.model.TypedLinkSchemaAndFacetName, attributes: List<com.amazonaws.services.clouddirectory.model.AttributeNameAndValue>, init: AmazonCloudDirectoryAttachTypedLinkCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.AttachTypedLinkResult {
	return this.block.declare(AmazonCloudDirectoryAttachTypedLinkCommand(directoryArn, sourceObjectReference, targetObjectReference, typedLinkFacet, attributes).apply(init)) as com.amazonaws.services.clouddirectory.model.AttachTypedLinkResult
}

@Generated
class AmazonCloudDirectoryAttachTypedLinkCommand(val directoryArn: String, val sourceObjectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, val targetObjectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, val typedLinkFacet: com.amazonaws.services.clouddirectory.model.TypedLinkSchemaAndFacetName, val attributes: List<com.amazonaws.services.clouddirectory.model.AttributeNameAndValue>) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.AttachTypedLinkRequest, com.amazonaws.services.clouddirectory.model.AttachTypedLinkResult> {



	override fun build(): com.amazonaws.services.clouddirectory.model.AttachTypedLinkRequest {
		val input = com.amazonaws.services.clouddirectory.model.AttachTypedLinkRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setSourceObjectReference(this.sourceObjectReference)
		input.setTargetObjectReference(this.targetObjectReference)
		input.setTypedLinkFacet(this.typedLinkFacet)
		input.setAttributes(this.attributes)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.AttachTypedLinkResult {
	  return com.amazonaws.services.clouddirectory.model.AttachTypedLinkResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.AttachTypedLinkResult {
		return environment.clouddirectory.attachTypedLink(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory attach-typed-link")
				.argument("directory-arn", directoryArn)
				.argument("source-object-reference", sourceObjectReference.toString())
				.argument("target-object-reference", targetObjectReference.toString())
				.argument("typed-link-facet", typedLinkFacet.toString())
				.argument("attributes", attributes.toString())
	}

}


fun AmazonCloudDirectoryFunctions.batchRead(directoryArn: String, operations: List<com.amazonaws.services.clouddirectory.model.BatchReadOperation>, init: AmazonCloudDirectoryBatchReadCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.BatchReadResult {
	return this.block.declare(AmazonCloudDirectoryBatchReadCommand(directoryArn, operations).apply(init)) as com.amazonaws.services.clouddirectory.model.BatchReadResult
}

@Generated
class AmazonCloudDirectoryBatchReadCommand(val directoryArn: String, val operations: List<com.amazonaws.services.clouddirectory.model.BatchReadOperation>) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.BatchReadRequest, com.amazonaws.services.clouddirectory.model.BatchReadResult> {

	var consistencyLevel: ConsistencyLevel? = null

	override fun build(): com.amazonaws.services.clouddirectory.model.BatchReadRequest {
		val input = com.amazonaws.services.clouddirectory.model.BatchReadRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setOperations(this.operations)
		input.setConsistencyLevel(this.consistencyLevel?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.BatchReadResult {
	  return com.amazonaws.services.clouddirectory.model.BatchReadResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.BatchReadResult {
		return environment.clouddirectory.batchRead(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory batch-read")
				.argument("directory-arn", directoryArn)
				.argument("operations", operations.toString())
				.argument("consistency-level", consistencyLevel?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.batchWrite(directoryArn: String, operations: List<com.amazonaws.services.clouddirectory.model.BatchWriteOperation>, init: AmazonCloudDirectoryBatchWriteCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.BatchWriteResult {
	return this.block.declare(AmazonCloudDirectoryBatchWriteCommand(directoryArn, operations).apply(init)) as com.amazonaws.services.clouddirectory.model.BatchWriteResult
}

@Generated
class AmazonCloudDirectoryBatchWriteCommand(val directoryArn: String, val operations: List<com.amazonaws.services.clouddirectory.model.BatchWriteOperation>) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.BatchWriteRequest, com.amazonaws.services.clouddirectory.model.BatchWriteResult> {



	override fun build(): com.amazonaws.services.clouddirectory.model.BatchWriteRequest {
		val input = com.amazonaws.services.clouddirectory.model.BatchWriteRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setOperations(this.operations)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.BatchWriteResult {
	  return com.amazonaws.services.clouddirectory.model.BatchWriteResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.BatchWriteResult {
		return environment.clouddirectory.batchWrite(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory batch-write")
				.argument("directory-arn", directoryArn)
				.argument("operations", operations.toString())
	}

}


fun AmazonCloudDirectoryFunctions.createDirectory(name: String, schemaArn: String, init: AmazonCloudDirectoryCreateDirectoryCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.CreateDirectoryResult {
	return this.block.declare(AmazonCloudDirectoryCreateDirectoryCommand(name, schemaArn).apply(init)) as com.amazonaws.services.clouddirectory.model.CreateDirectoryResult
}

@Generated
class AmazonCloudDirectoryCreateDirectoryCommand(val name: String, val schemaArn: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.CreateDirectoryRequest, com.amazonaws.services.clouddirectory.model.CreateDirectoryResult> {



	override fun build(): com.amazonaws.services.clouddirectory.model.CreateDirectoryRequest {
		val input = com.amazonaws.services.clouddirectory.model.CreateDirectoryRequest()
		input.setName(this.name)
		input.setSchemaArn(this.schemaArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.CreateDirectoryResult {
	  return com.amazonaws.services.clouddirectory.model.CreateDirectoryResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.CreateDirectoryResult {
		return environment.clouddirectory.createDirectory(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory create-directory")
				.argument("name", name)
				.argument("schema-arn", schemaArn)
	}

}


fun AmazonCloudDirectoryFunctions.createFacet(schemaArn: String, name: String, objectType: ObjectType, init: AmazonCloudDirectoryCreateFacetCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.CreateFacetResult {
	return this.block.declare(AmazonCloudDirectoryCreateFacetCommand(schemaArn, name, objectType).apply(init)) as com.amazonaws.services.clouddirectory.model.CreateFacetResult
}

@Generated
class AmazonCloudDirectoryCreateFacetCommand(val schemaArn: String, val name: String, val objectType: ObjectType) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.CreateFacetRequest, com.amazonaws.services.clouddirectory.model.CreateFacetResult> {

	var attributes: List<com.amazonaws.services.clouddirectory.model.FacetAttribute>? = null

	override fun build(): com.amazonaws.services.clouddirectory.model.CreateFacetRequest {
		val input = com.amazonaws.services.clouddirectory.model.CreateFacetRequest()
		input.setSchemaArn(this.schemaArn)
		input.setName(this.name)
		input.setAttributes(this.attributes)
		input.setObjectType(this.objectType.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.CreateFacetResult {
	  return com.amazonaws.services.clouddirectory.model.CreateFacetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.CreateFacetResult {
		return environment.clouddirectory.createFacet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory create-facet")
				.argument("schema-arn", schemaArn)
				.argument("name", name)
				.argument("attributes", attributes?.toString())
				.argument("object-type", objectType.toString())
	}

}


fun AmazonCloudDirectoryFunctions.createIndex(directoryArn: String, orderedIndexedAttributeList: List<com.amazonaws.services.clouddirectory.model.AttributeKey>, isUnique: Boolean, init: AmazonCloudDirectoryCreateIndexCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.CreateIndexResult {
	return this.block.declare(AmazonCloudDirectoryCreateIndexCommand(directoryArn, orderedIndexedAttributeList, isUnique).apply(init)) as com.amazonaws.services.clouddirectory.model.CreateIndexResult
}

@Generated
class AmazonCloudDirectoryCreateIndexCommand(val directoryArn: String, val orderedIndexedAttributeList: List<com.amazonaws.services.clouddirectory.model.AttributeKey>, val isUnique: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.CreateIndexRequest, com.amazonaws.services.clouddirectory.model.CreateIndexResult> {

	var parentReference: com.amazonaws.services.clouddirectory.model.ObjectReference? = null
	var linkName: String? = null

	override fun build(): com.amazonaws.services.clouddirectory.model.CreateIndexRequest {
		val input = com.amazonaws.services.clouddirectory.model.CreateIndexRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setOrderedIndexedAttributeList(this.orderedIndexedAttributeList)
		input.setIsUnique(this.isUnique)
		input.setParentReference(this.parentReference)
		input.setLinkName(this.linkName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.CreateIndexResult {
	  return com.amazonaws.services.clouddirectory.model.CreateIndexResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.CreateIndexResult {
		return environment.clouddirectory.createIndex(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory create-index")
				.argument("directory-arn", directoryArn)
				.argument("ordered-indexed-attribute-list", orderedIndexedAttributeList.toString())
				.option("is-unique", isUnique ?: false)
				.argument("parent-reference", parentReference?.toString())
				.argument("link-name", linkName)
	}

}


fun AmazonCloudDirectoryFunctions.createObject(directoryArn: String, schemaFacets: List<com.amazonaws.services.clouddirectory.model.SchemaFacet>, init: AmazonCloudDirectoryCreateObjectCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.CreateObjectResult {
	return this.block.declare(AmazonCloudDirectoryCreateObjectCommand(directoryArn, schemaFacets).apply(init)) as com.amazonaws.services.clouddirectory.model.CreateObjectResult
}

@Generated
class AmazonCloudDirectoryCreateObjectCommand(val directoryArn: String, val schemaFacets: List<com.amazonaws.services.clouddirectory.model.SchemaFacet>) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.CreateObjectRequest, com.amazonaws.services.clouddirectory.model.CreateObjectResult> {

	var objectAttributeList: List<com.amazonaws.services.clouddirectory.model.AttributeKeyAndValue>? = null
	var parentReference: com.amazonaws.services.clouddirectory.model.ObjectReference? = null
	var linkName: String? = null

	override fun build(): com.amazonaws.services.clouddirectory.model.CreateObjectRequest {
		val input = com.amazonaws.services.clouddirectory.model.CreateObjectRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setSchemaFacets(this.schemaFacets)
		input.setObjectAttributeList(this.objectAttributeList)
		input.setParentReference(this.parentReference)
		input.setLinkName(this.linkName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.CreateObjectResult {
	  return com.amazonaws.services.clouddirectory.model.CreateObjectResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.CreateObjectResult {
		return environment.clouddirectory.createObject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory create-object")
				.argument("directory-arn", directoryArn)
				.argument("schema-facets", schemaFacets.toString())
				.argument("object-attribute-list", objectAttributeList?.toString())
				.argument("parent-reference", parentReference?.toString())
				.argument("link-name", linkName)
	}

}


fun AmazonCloudDirectoryFunctions.createSchema(name: String, init: AmazonCloudDirectoryCreateSchemaCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.CreateSchemaResult {
	return this.block.declare(AmazonCloudDirectoryCreateSchemaCommand(name).apply(init)) as com.amazonaws.services.clouddirectory.model.CreateSchemaResult
}

@Generated
class AmazonCloudDirectoryCreateSchemaCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.CreateSchemaRequest, com.amazonaws.services.clouddirectory.model.CreateSchemaResult> {



	override fun build(): com.amazonaws.services.clouddirectory.model.CreateSchemaRequest {
		val input = com.amazonaws.services.clouddirectory.model.CreateSchemaRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.CreateSchemaResult {
	  return com.amazonaws.services.clouddirectory.model.CreateSchemaResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.CreateSchemaResult {
		return environment.clouddirectory.createSchema(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory create-schema")
				.argument("name", name)
	}

}


fun AmazonCloudDirectoryFunctions.createTypedLinkFacet(schemaArn: String, facet: com.amazonaws.services.clouddirectory.model.TypedLinkFacet, init: AmazonCloudDirectoryCreateTypedLinkFacetCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.CreateTypedLinkFacetResult {
	return this.block.declare(AmazonCloudDirectoryCreateTypedLinkFacetCommand(schemaArn, facet).apply(init)) as com.amazonaws.services.clouddirectory.model.CreateTypedLinkFacetResult
}

@Generated
class AmazonCloudDirectoryCreateTypedLinkFacetCommand(val schemaArn: String, val facet: com.amazonaws.services.clouddirectory.model.TypedLinkFacet) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.CreateTypedLinkFacetRequest, com.amazonaws.services.clouddirectory.model.CreateTypedLinkFacetResult> {



	override fun build(): com.amazonaws.services.clouddirectory.model.CreateTypedLinkFacetRequest {
		val input = com.amazonaws.services.clouddirectory.model.CreateTypedLinkFacetRequest()
		input.setSchemaArn(this.schemaArn)
		input.setFacet(this.facet)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.CreateTypedLinkFacetResult {
	  return com.amazonaws.services.clouddirectory.model.CreateTypedLinkFacetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.CreateTypedLinkFacetResult {
		return environment.clouddirectory.createTypedLinkFacet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory create-typed-link-facet")
				.argument("schema-arn", schemaArn)
				.argument("facet", facet.toString())
	}

}


fun AmazonCloudDirectoryFunctions.deleteDirectory(directoryArn: String, init: AmazonCloudDirectoryDeleteDirectoryCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.DeleteDirectoryResult {
	return this.block.declare(AmazonCloudDirectoryDeleteDirectoryCommand(directoryArn).apply(init)) as com.amazonaws.services.clouddirectory.model.DeleteDirectoryResult
}

@Generated
class AmazonCloudDirectoryDeleteDirectoryCommand(val directoryArn: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.DeleteDirectoryRequest, com.amazonaws.services.clouddirectory.model.DeleteDirectoryResult> {



	override fun build(): com.amazonaws.services.clouddirectory.model.DeleteDirectoryRequest {
		val input = com.amazonaws.services.clouddirectory.model.DeleteDirectoryRequest()
		input.setDirectoryArn(this.directoryArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.DeleteDirectoryResult {
	  return com.amazonaws.services.clouddirectory.model.DeleteDirectoryResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.DeleteDirectoryResult {
		return environment.clouddirectory.deleteDirectory(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory delete-directory")
				.argument("directory-arn", directoryArn)
	}

}


fun AmazonCloudDirectoryFunctions.deleteFacet(schemaArn: String, name: String, init: AmazonCloudDirectoryDeleteFacetCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.DeleteFacetResult {
	return this.block.declare(AmazonCloudDirectoryDeleteFacetCommand(schemaArn, name).apply(init)) as com.amazonaws.services.clouddirectory.model.DeleteFacetResult
}

@Generated
class AmazonCloudDirectoryDeleteFacetCommand(val schemaArn: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.DeleteFacetRequest, com.amazonaws.services.clouddirectory.model.DeleteFacetResult> {



	override fun build(): com.amazonaws.services.clouddirectory.model.DeleteFacetRequest {
		val input = com.amazonaws.services.clouddirectory.model.DeleteFacetRequest()
		input.setSchemaArn(this.schemaArn)
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.DeleteFacetResult {
	  return com.amazonaws.services.clouddirectory.model.DeleteFacetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.DeleteFacetResult {
		return environment.clouddirectory.deleteFacet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory delete-facet")
				.argument("schema-arn", schemaArn)
				.argument("name", name)
	}

}


fun AmazonCloudDirectoryFunctions.deleteObject(directoryArn: String, objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, init: AmazonCloudDirectoryDeleteObjectCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.DeleteObjectResult {
	return this.block.declare(AmazonCloudDirectoryDeleteObjectCommand(directoryArn, objectReference).apply(init)) as com.amazonaws.services.clouddirectory.model.DeleteObjectResult
}

@Generated
class AmazonCloudDirectoryDeleteObjectCommand(val directoryArn: String, val objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.DeleteObjectRequest, com.amazonaws.services.clouddirectory.model.DeleteObjectResult> {



	override fun build(): com.amazonaws.services.clouddirectory.model.DeleteObjectRequest {
		val input = com.amazonaws.services.clouddirectory.model.DeleteObjectRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setObjectReference(this.objectReference)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.DeleteObjectResult {
	  return com.amazonaws.services.clouddirectory.model.DeleteObjectResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.DeleteObjectResult {
		return environment.clouddirectory.deleteObject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory delete-object")
				.argument("directory-arn", directoryArn)
				.argument("object-reference", objectReference.toString())
	}

}


fun AmazonCloudDirectoryFunctions.deleteSchema(schemaArn: String, init: AmazonCloudDirectoryDeleteSchemaCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.DeleteSchemaResult {
	return this.block.declare(AmazonCloudDirectoryDeleteSchemaCommand(schemaArn).apply(init)) as com.amazonaws.services.clouddirectory.model.DeleteSchemaResult
}

@Generated
class AmazonCloudDirectoryDeleteSchemaCommand(val schemaArn: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.DeleteSchemaRequest, com.amazonaws.services.clouddirectory.model.DeleteSchemaResult> {



	override fun build(): com.amazonaws.services.clouddirectory.model.DeleteSchemaRequest {
		val input = com.amazonaws.services.clouddirectory.model.DeleteSchemaRequest()
		input.setSchemaArn(this.schemaArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.DeleteSchemaResult {
	  return com.amazonaws.services.clouddirectory.model.DeleteSchemaResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.DeleteSchemaResult {
		return environment.clouddirectory.deleteSchema(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory delete-schema")
				.argument("schema-arn", schemaArn)
	}

}


fun AmazonCloudDirectoryFunctions.deleteTypedLinkFacet(schemaArn: String, name: String, init: AmazonCloudDirectoryDeleteTypedLinkFacetCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.DeleteTypedLinkFacetResult {
	return this.block.declare(AmazonCloudDirectoryDeleteTypedLinkFacetCommand(schemaArn, name).apply(init)) as com.amazonaws.services.clouddirectory.model.DeleteTypedLinkFacetResult
}

@Generated
class AmazonCloudDirectoryDeleteTypedLinkFacetCommand(val schemaArn: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.DeleteTypedLinkFacetRequest, com.amazonaws.services.clouddirectory.model.DeleteTypedLinkFacetResult> {



	override fun build(): com.amazonaws.services.clouddirectory.model.DeleteTypedLinkFacetRequest {
		val input = com.amazonaws.services.clouddirectory.model.DeleteTypedLinkFacetRequest()
		input.setSchemaArn(this.schemaArn)
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.DeleteTypedLinkFacetResult {
	  return com.amazonaws.services.clouddirectory.model.DeleteTypedLinkFacetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.DeleteTypedLinkFacetResult {
		return environment.clouddirectory.deleteTypedLinkFacet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory delete-typed-link-facet")
				.argument("schema-arn", schemaArn)
				.argument("name", name)
	}

}


fun AmazonCloudDirectoryFunctions.detachFromIndex(directoryArn: String, indexReference: com.amazonaws.services.clouddirectory.model.ObjectReference, targetReference: com.amazonaws.services.clouddirectory.model.ObjectReference, init: AmazonCloudDirectoryDetachFromIndexCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.DetachFromIndexResult {
	return this.block.declare(AmazonCloudDirectoryDetachFromIndexCommand(directoryArn, indexReference, targetReference).apply(init)) as com.amazonaws.services.clouddirectory.model.DetachFromIndexResult
}

@Generated
class AmazonCloudDirectoryDetachFromIndexCommand(val directoryArn: String, val indexReference: com.amazonaws.services.clouddirectory.model.ObjectReference, val targetReference: com.amazonaws.services.clouddirectory.model.ObjectReference) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.DetachFromIndexRequest, com.amazonaws.services.clouddirectory.model.DetachFromIndexResult> {



	override fun build(): com.amazonaws.services.clouddirectory.model.DetachFromIndexRequest {
		val input = com.amazonaws.services.clouddirectory.model.DetachFromIndexRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setIndexReference(this.indexReference)
		input.setTargetReference(this.targetReference)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.DetachFromIndexResult {
	  return com.amazonaws.services.clouddirectory.model.DetachFromIndexResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.DetachFromIndexResult {
		return environment.clouddirectory.detachFromIndex(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory detach-from-index")
				.argument("directory-arn", directoryArn)
				.argument("index-reference", indexReference.toString())
				.argument("target-reference", targetReference.toString())
	}

}


fun AmazonCloudDirectoryFunctions.detachObject(directoryArn: String, parentReference: com.amazonaws.services.clouddirectory.model.ObjectReference, linkName: String, init: AmazonCloudDirectoryDetachObjectCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.DetachObjectResult {
	return this.block.declare(AmazonCloudDirectoryDetachObjectCommand(directoryArn, parentReference, linkName).apply(init)) as com.amazonaws.services.clouddirectory.model.DetachObjectResult
}

@Generated
class AmazonCloudDirectoryDetachObjectCommand(val directoryArn: String, val parentReference: com.amazonaws.services.clouddirectory.model.ObjectReference, val linkName: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.DetachObjectRequest, com.amazonaws.services.clouddirectory.model.DetachObjectResult> {



	override fun build(): com.amazonaws.services.clouddirectory.model.DetachObjectRequest {
		val input = com.amazonaws.services.clouddirectory.model.DetachObjectRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setParentReference(this.parentReference)
		input.setLinkName(this.linkName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.DetachObjectResult {
	  return com.amazonaws.services.clouddirectory.model.DetachObjectResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.DetachObjectResult {
		return environment.clouddirectory.detachObject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory detach-object")
				.argument("directory-arn", directoryArn)
				.argument("parent-reference", parentReference.toString())
				.argument("link-name", linkName)
	}

}


fun AmazonCloudDirectoryFunctions.detachPolicy(directoryArn: String, policyReference: com.amazonaws.services.clouddirectory.model.ObjectReference, objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, init: AmazonCloudDirectoryDetachPolicyCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.DetachPolicyResult {
	return this.block.declare(AmazonCloudDirectoryDetachPolicyCommand(directoryArn, policyReference, objectReference).apply(init)) as com.amazonaws.services.clouddirectory.model.DetachPolicyResult
}

@Generated
class AmazonCloudDirectoryDetachPolicyCommand(val directoryArn: String, val policyReference: com.amazonaws.services.clouddirectory.model.ObjectReference, val objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.DetachPolicyRequest, com.amazonaws.services.clouddirectory.model.DetachPolicyResult> {



	override fun build(): com.amazonaws.services.clouddirectory.model.DetachPolicyRequest {
		val input = com.amazonaws.services.clouddirectory.model.DetachPolicyRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setPolicyReference(this.policyReference)
		input.setObjectReference(this.objectReference)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.DetachPolicyResult {
	  return com.amazonaws.services.clouddirectory.model.DetachPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.DetachPolicyResult {
		return environment.clouddirectory.detachPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory detach-policy")
				.argument("directory-arn", directoryArn)
				.argument("policy-reference", policyReference.toString())
				.argument("object-reference", objectReference.toString())
	}

}


fun AmazonCloudDirectoryFunctions.detachTypedLink(directoryArn: String, typedLinkSpecifier: com.amazonaws.services.clouddirectory.model.TypedLinkSpecifier, init: AmazonCloudDirectoryDetachTypedLinkCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.DetachTypedLinkResult {
	return this.block.declare(AmazonCloudDirectoryDetachTypedLinkCommand(directoryArn, typedLinkSpecifier).apply(init)) as com.amazonaws.services.clouddirectory.model.DetachTypedLinkResult
}

@Generated
class AmazonCloudDirectoryDetachTypedLinkCommand(val directoryArn: String, val typedLinkSpecifier: com.amazonaws.services.clouddirectory.model.TypedLinkSpecifier) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.DetachTypedLinkRequest, com.amazonaws.services.clouddirectory.model.DetachTypedLinkResult> {



	override fun build(): com.amazonaws.services.clouddirectory.model.DetachTypedLinkRequest {
		val input = com.amazonaws.services.clouddirectory.model.DetachTypedLinkRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setTypedLinkSpecifier(this.typedLinkSpecifier)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.DetachTypedLinkResult {
	  return com.amazonaws.services.clouddirectory.model.DetachTypedLinkResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.DetachTypedLinkResult {
		return environment.clouddirectory.detachTypedLink(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory detach-typed-link")
				.argument("directory-arn", directoryArn)
				.argument("typed-link-specifier", typedLinkSpecifier.toString())
	}

}


fun AmazonCloudDirectoryFunctions.disableDirectory(directoryArn: String, init: AmazonCloudDirectoryDisableDirectoryCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.DisableDirectoryResult {
	return this.block.declare(AmazonCloudDirectoryDisableDirectoryCommand(directoryArn).apply(init)) as com.amazonaws.services.clouddirectory.model.DisableDirectoryResult
}

@Generated
class AmazonCloudDirectoryDisableDirectoryCommand(val directoryArn: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.DisableDirectoryRequest, com.amazonaws.services.clouddirectory.model.DisableDirectoryResult> {



	override fun build(): com.amazonaws.services.clouddirectory.model.DisableDirectoryRequest {
		val input = com.amazonaws.services.clouddirectory.model.DisableDirectoryRequest()
		input.setDirectoryArn(this.directoryArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.DisableDirectoryResult {
	  return com.amazonaws.services.clouddirectory.model.DisableDirectoryResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.DisableDirectoryResult {
		return environment.clouddirectory.disableDirectory(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory disable-directory")
				.argument("directory-arn", directoryArn)
	}

}


fun AmazonCloudDirectoryFunctions.enableDirectory(directoryArn: String, init: AmazonCloudDirectoryEnableDirectoryCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.EnableDirectoryResult {
	return this.block.declare(AmazonCloudDirectoryEnableDirectoryCommand(directoryArn).apply(init)) as com.amazonaws.services.clouddirectory.model.EnableDirectoryResult
}

@Generated
class AmazonCloudDirectoryEnableDirectoryCommand(val directoryArn: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.EnableDirectoryRequest, com.amazonaws.services.clouddirectory.model.EnableDirectoryResult> {



	override fun build(): com.amazonaws.services.clouddirectory.model.EnableDirectoryRequest {
		val input = com.amazonaws.services.clouddirectory.model.EnableDirectoryRequest()
		input.setDirectoryArn(this.directoryArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.EnableDirectoryResult {
	  return com.amazonaws.services.clouddirectory.model.EnableDirectoryResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.EnableDirectoryResult {
		return environment.clouddirectory.enableDirectory(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory enable-directory")
				.argument("directory-arn", directoryArn)
	}

}


fun AmazonCloudDirectoryFunctions.getAppliedSchemaVersion(schemaArn: String, init: AmazonCloudDirectoryGetAppliedSchemaVersionCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.GetAppliedSchemaVersionResult {
	return this.block.declare(AmazonCloudDirectoryGetAppliedSchemaVersionCommand(schemaArn).apply(init)) as com.amazonaws.services.clouddirectory.model.GetAppliedSchemaVersionResult
}

@Generated
class AmazonCloudDirectoryGetAppliedSchemaVersionCommand(val schemaArn: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.GetAppliedSchemaVersionRequest, com.amazonaws.services.clouddirectory.model.GetAppliedSchemaVersionResult> {



	override fun build(): com.amazonaws.services.clouddirectory.model.GetAppliedSchemaVersionRequest {
		val input = com.amazonaws.services.clouddirectory.model.GetAppliedSchemaVersionRequest()
		input.setSchemaArn(this.schemaArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.GetAppliedSchemaVersionResult {
	  return com.amazonaws.services.clouddirectory.model.GetAppliedSchemaVersionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.GetAppliedSchemaVersionResult {
		return environment.clouddirectory.getAppliedSchemaVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory get-applied-schema-version")
				.argument("schema-arn", schemaArn)
	}

}


fun AmazonCloudDirectoryFunctions.getDirectory(directoryArn: String, init: AmazonCloudDirectoryGetDirectoryCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.GetDirectoryResult {
	return this.block.declare(AmazonCloudDirectoryGetDirectoryCommand(directoryArn).apply(init)) as com.amazonaws.services.clouddirectory.model.GetDirectoryResult
}

@Generated
class AmazonCloudDirectoryGetDirectoryCommand(val directoryArn: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.GetDirectoryRequest, com.amazonaws.services.clouddirectory.model.GetDirectoryResult> {



	override fun build(): com.amazonaws.services.clouddirectory.model.GetDirectoryRequest {
		val input = com.amazonaws.services.clouddirectory.model.GetDirectoryRequest()
		input.setDirectoryArn(this.directoryArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.GetDirectoryResult {
	  return com.amazonaws.services.clouddirectory.model.GetDirectoryResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.GetDirectoryResult {
		return environment.clouddirectory.getDirectory(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory get-directory")
				.argument("directory-arn", directoryArn)
	}

}


fun AmazonCloudDirectoryFunctions.getFacet(schemaArn: String, name: String, init: AmazonCloudDirectoryGetFacetCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.GetFacetResult {
	return this.block.declare(AmazonCloudDirectoryGetFacetCommand(schemaArn, name).apply(init)) as com.amazonaws.services.clouddirectory.model.GetFacetResult
}

@Generated
class AmazonCloudDirectoryGetFacetCommand(val schemaArn: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.GetFacetRequest, com.amazonaws.services.clouddirectory.model.GetFacetResult> {



	override fun build(): com.amazonaws.services.clouddirectory.model.GetFacetRequest {
		val input = com.amazonaws.services.clouddirectory.model.GetFacetRequest()
		input.setSchemaArn(this.schemaArn)
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.GetFacetResult {
	  return com.amazonaws.services.clouddirectory.model.GetFacetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.GetFacetResult {
		return environment.clouddirectory.getFacet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory get-facet")
				.argument("schema-arn", schemaArn)
				.argument("name", name)
	}

}


fun AmazonCloudDirectoryFunctions.getObjectInformation(directoryArn: String, objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, init: AmazonCloudDirectoryGetObjectInformationCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.GetObjectInformationResult {
	return this.block.declare(AmazonCloudDirectoryGetObjectInformationCommand(directoryArn, objectReference).apply(init)) as com.amazonaws.services.clouddirectory.model.GetObjectInformationResult
}

@Generated
class AmazonCloudDirectoryGetObjectInformationCommand(val directoryArn: String, val objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.GetObjectInformationRequest, com.amazonaws.services.clouddirectory.model.GetObjectInformationResult> {

	var consistencyLevel: ConsistencyLevel? = null

	override fun build(): com.amazonaws.services.clouddirectory.model.GetObjectInformationRequest {
		val input = com.amazonaws.services.clouddirectory.model.GetObjectInformationRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setObjectReference(this.objectReference)
		input.setConsistencyLevel(this.consistencyLevel?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.GetObjectInformationResult {
	  return com.amazonaws.services.clouddirectory.model.GetObjectInformationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.GetObjectInformationResult {
		return environment.clouddirectory.getObjectInformation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory get-object-information")
				.argument("directory-arn", directoryArn)
				.argument("object-reference", objectReference.toString())
				.argument("consistency-level", consistencyLevel?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.getSchemaAsJson(schemaArn: String, init: AmazonCloudDirectoryGetSchemaAsJsonCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.GetSchemaAsJsonResult {
	return this.block.declare(AmazonCloudDirectoryGetSchemaAsJsonCommand(schemaArn).apply(init)) as com.amazonaws.services.clouddirectory.model.GetSchemaAsJsonResult
}

@Generated
class AmazonCloudDirectoryGetSchemaAsJsonCommand(val schemaArn: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.GetSchemaAsJsonRequest, com.amazonaws.services.clouddirectory.model.GetSchemaAsJsonResult> {



	override fun build(): com.amazonaws.services.clouddirectory.model.GetSchemaAsJsonRequest {
		val input = com.amazonaws.services.clouddirectory.model.GetSchemaAsJsonRequest()
		input.setSchemaArn(this.schemaArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.GetSchemaAsJsonResult {
	  return com.amazonaws.services.clouddirectory.model.GetSchemaAsJsonResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.GetSchemaAsJsonResult {
		return environment.clouddirectory.getSchemaAsJson(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory get-schema-as-json")
				.argument("schema-arn", schemaArn)
	}

}


fun AmazonCloudDirectoryFunctions.getTypedLinkFacetInformation(schemaArn: String, name: String, init: AmazonCloudDirectoryGetTypedLinkFacetInformationCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.GetTypedLinkFacetInformationResult {
	return this.block.declare(AmazonCloudDirectoryGetTypedLinkFacetInformationCommand(schemaArn, name).apply(init)) as com.amazonaws.services.clouddirectory.model.GetTypedLinkFacetInformationResult
}

@Generated
class AmazonCloudDirectoryGetTypedLinkFacetInformationCommand(val schemaArn: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.GetTypedLinkFacetInformationRequest, com.amazonaws.services.clouddirectory.model.GetTypedLinkFacetInformationResult> {



	override fun build(): com.amazonaws.services.clouddirectory.model.GetTypedLinkFacetInformationRequest {
		val input = com.amazonaws.services.clouddirectory.model.GetTypedLinkFacetInformationRequest()
		input.setSchemaArn(this.schemaArn)
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.GetTypedLinkFacetInformationResult {
	  return com.amazonaws.services.clouddirectory.model.GetTypedLinkFacetInformationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.GetTypedLinkFacetInformationResult {
		return environment.clouddirectory.getTypedLinkFacetInformation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory get-typed-link-facet-information")
				.argument("schema-arn", schemaArn)
				.argument("name", name)
	}

}


fun AmazonCloudDirectoryFunctions.listAppliedSchemaArns(directoryArn: String, init: AmazonCloudDirectoryListAppliedSchemaArnsCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.ListAppliedSchemaArnsResult {
	return this.block.declare(AmazonCloudDirectoryListAppliedSchemaArnsCommand(directoryArn).apply(init)) as com.amazonaws.services.clouddirectory.model.ListAppliedSchemaArnsResult
}

@Generated
class AmazonCloudDirectoryListAppliedSchemaArnsCommand(val directoryArn: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ListAppliedSchemaArnsRequest, com.amazonaws.services.clouddirectory.model.ListAppliedSchemaArnsResult> {

	var schemaArn: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.clouddirectory.model.ListAppliedSchemaArnsRequest {
		val input = com.amazonaws.services.clouddirectory.model.ListAppliedSchemaArnsRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setSchemaArn(this.schemaArn)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.ListAppliedSchemaArnsResult {
	  return com.amazonaws.services.clouddirectory.model.ListAppliedSchemaArnsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.ListAppliedSchemaArnsResult {
		return environment.clouddirectory.listAppliedSchemaArns(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory list-applied-schema-arns")
				.argument("directory-arn", directoryArn)
				.argument("schema-arn", schemaArn)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.listAttachedIndices(directoryArn: String, targetReference: com.amazonaws.services.clouddirectory.model.ObjectReference, init: AmazonCloudDirectoryListAttachedIndicesCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.ListAttachedIndicesResult {
	return this.block.declare(AmazonCloudDirectoryListAttachedIndicesCommand(directoryArn, targetReference).apply(init)) as com.amazonaws.services.clouddirectory.model.ListAttachedIndicesResult
}

@Generated
class AmazonCloudDirectoryListAttachedIndicesCommand(val directoryArn: String, val targetReference: com.amazonaws.services.clouddirectory.model.ObjectReference) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ListAttachedIndicesRequest, com.amazonaws.services.clouddirectory.model.ListAttachedIndicesResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0
	var consistencyLevel: ConsistencyLevel? = null

	override fun build(): com.amazonaws.services.clouddirectory.model.ListAttachedIndicesRequest {
		val input = com.amazonaws.services.clouddirectory.model.ListAttachedIndicesRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setTargetReference(this.targetReference)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setConsistencyLevel(this.consistencyLevel?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.ListAttachedIndicesResult {
	  return com.amazonaws.services.clouddirectory.model.ListAttachedIndicesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.ListAttachedIndicesResult {
		return environment.clouddirectory.listAttachedIndices(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory list-attached-indices")
				.argument("directory-arn", directoryArn)
				.argument("target-reference", targetReference.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("consistency-level", consistencyLevel?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.listDevelopmentSchemaArns(init: AmazonCloudDirectoryListDevelopmentSchemaArnsCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.ListDevelopmentSchemaArnsResult {
	return this.block.declare(AmazonCloudDirectoryListDevelopmentSchemaArnsCommand().apply(init)) as com.amazonaws.services.clouddirectory.model.ListDevelopmentSchemaArnsResult
}

@Generated
class AmazonCloudDirectoryListDevelopmentSchemaArnsCommand() : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ListDevelopmentSchemaArnsRequest, com.amazonaws.services.clouddirectory.model.ListDevelopmentSchemaArnsResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.clouddirectory.model.ListDevelopmentSchemaArnsRequest {
		val input = com.amazonaws.services.clouddirectory.model.ListDevelopmentSchemaArnsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.ListDevelopmentSchemaArnsResult {
	  return com.amazonaws.services.clouddirectory.model.ListDevelopmentSchemaArnsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.ListDevelopmentSchemaArnsResult {
		return environment.clouddirectory.listDevelopmentSchemaArns(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory list-development-schema-arns")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.listDirectories(init: AmazonCloudDirectoryListDirectoriesCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.ListDirectoriesResult {
	return this.block.declare(AmazonCloudDirectoryListDirectoriesCommand().apply(init)) as com.amazonaws.services.clouddirectory.model.ListDirectoriesResult
}

@Generated
class AmazonCloudDirectoryListDirectoriesCommand() : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ListDirectoriesRequest, com.amazonaws.services.clouddirectory.model.ListDirectoriesResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0
	var state: DirectoryState? = null

	override fun build(): com.amazonaws.services.clouddirectory.model.ListDirectoriesRequest {
		val input = com.amazonaws.services.clouddirectory.model.ListDirectoriesRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setState(this.state?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.ListDirectoriesResult {
	  return com.amazonaws.services.clouddirectory.model.ListDirectoriesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.ListDirectoriesResult {
		return environment.clouddirectory.listDirectories(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory list-directories")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("state", state?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.listFacetAttributes(schemaArn: String, name: String, init: AmazonCloudDirectoryListFacetAttributesCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.ListFacetAttributesResult {
	return this.block.declare(AmazonCloudDirectoryListFacetAttributesCommand(schemaArn, name).apply(init)) as com.amazonaws.services.clouddirectory.model.ListFacetAttributesResult
}

@Generated
class AmazonCloudDirectoryListFacetAttributesCommand(val schemaArn: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ListFacetAttributesRequest, com.amazonaws.services.clouddirectory.model.ListFacetAttributesResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.clouddirectory.model.ListFacetAttributesRequest {
		val input = com.amazonaws.services.clouddirectory.model.ListFacetAttributesRequest()
		input.setSchemaArn(this.schemaArn)
		input.setName(this.name)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.ListFacetAttributesResult {
	  return com.amazonaws.services.clouddirectory.model.ListFacetAttributesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.ListFacetAttributesResult {
		return environment.clouddirectory.listFacetAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory list-facet-attributes")
				.argument("schema-arn", schemaArn)
				.argument("name", name)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.listFacetNames(schemaArn: String, init: AmazonCloudDirectoryListFacetNamesCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.ListFacetNamesResult {
	return this.block.declare(AmazonCloudDirectoryListFacetNamesCommand(schemaArn).apply(init)) as com.amazonaws.services.clouddirectory.model.ListFacetNamesResult
}

@Generated
class AmazonCloudDirectoryListFacetNamesCommand(val schemaArn: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ListFacetNamesRequest, com.amazonaws.services.clouddirectory.model.ListFacetNamesResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.clouddirectory.model.ListFacetNamesRequest {
		val input = com.amazonaws.services.clouddirectory.model.ListFacetNamesRequest()
		input.setSchemaArn(this.schemaArn)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.ListFacetNamesResult {
	  return com.amazonaws.services.clouddirectory.model.ListFacetNamesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.ListFacetNamesResult {
		return environment.clouddirectory.listFacetNames(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory list-facet-names")
				.argument("schema-arn", schemaArn)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.listIncomingTypedLinks(directoryArn: String, objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, init: AmazonCloudDirectoryListIncomingTypedLinksCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.ListIncomingTypedLinksResult {
	return this.block.declare(AmazonCloudDirectoryListIncomingTypedLinksCommand(directoryArn, objectReference).apply(init)) as com.amazonaws.services.clouddirectory.model.ListIncomingTypedLinksResult
}

@Generated
class AmazonCloudDirectoryListIncomingTypedLinksCommand(val directoryArn: String, val objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ListIncomingTypedLinksRequest, com.amazonaws.services.clouddirectory.model.ListIncomingTypedLinksResult> {

	var filterAttributeRanges: List<com.amazonaws.services.clouddirectory.model.TypedLinkAttributeRange>? = null
	var filterTypedLink: com.amazonaws.services.clouddirectory.model.TypedLinkSchemaAndFacetName? = null
	var nextToken: String? = null
	var maxResults: Int? = 0
	var consistencyLevel: ConsistencyLevel? = null

	override fun build(): com.amazonaws.services.clouddirectory.model.ListIncomingTypedLinksRequest {
		val input = com.amazonaws.services.clouddirectory.model.ListIncomingTypedLinksRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setObjectReference(this.objectReference)
		input.setFilterAttributeRanges(this.filterAttributeRanges)
		input.setFilterTypedLink(this.filterTypedLink)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setConsistencyLevel(this.consistencyLevel?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.ListIncomingTypedLinksResult {
	  return com.amazonaws.services.clouddirectory.model.ListIncomingTypedLinksResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.ListIncomingTypedLinksResult {
		return environment.clouddirectory.listIncomingTypedLinks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory list-incoming-typed-links")
				.argument("directory-arn", directoryArn)
				.argument("object-reference", objectReference.toString())
				.argument("filter-attribute-ranges", filterAttributeRanges?.toString())
				.argument("filter-typed-link", filterTypedLink?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("consistency-level", consistencyLevel?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.listIndex(directoryArn: String, indexReference: com.amazonaws.services.clouddirectory.model.ObjectReference, init: AmazonCloudDirectoryListIndexCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.ListIndexResult {
	return this.block.declare(AmazonCloudDirectoryListIndexCommand(directoryArn, indexReference).apply(init)) as com.amazonaws.services.clouddirectory.model.ListIndexResult
}

@Generated
class AmazonCloudDirectoryListIndexCommand(val directoryArn: String, val indexReference: com.amazonaws.services.clouddirectory.model.ObjectReference) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ListIndexRequest, com.amazonaws.services.clouddirectory.model.ListIndexResult> {

	var rangesOnIndexedValues: List<com.amazonaws.services.clouddirectory.model.ObjectAttributeRange>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null
	var consistencyLevel: ConsistencyLevel? = null

	override fun build(): com.amazonaws.services.clouddirectory.model.ListIndexRequest {
		val input = com.amazonaws.services.clouddirectory.model.ListIndexRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setRangesOnIndexedValues(this.rangesOnIndexedValues)
		input.setIndexReference(this.indexReference)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		input.setConsistencyLevel(this.consistencyLevel?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.ListIndexResult {
	  return com.amazonaws.services.clouddirectory.model.ListIndexResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.ListIndexResult {
		return environment.clouddirectory.listIndex(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory list-index")
				.argument("directory-arn", directoryArn)
				.argument("ranges-on-indexed-values", rangesOnIndexedValues?.toString())
				.argument("index-reference", indexReference.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.argument("consistency-level", consistencyLevel?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.listObjectAttributes(directoryArn: String, objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, init: AmazonCloudDirectoryListObjectAttributesCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.ListObjectAttributesResult {
	return this.block.declare(AmazonCloudDirectoryListObjectAttributesCommand(directoryArn, objectReference).apply(init)) as com.amazonaws.services.clouddirectory.model.ListObjectAttributesResult
}

@Generated
class AmazonCloudDirectoryListObjectAttributesCommand(val directoryArn: String, val objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ListObjectAttributesRequest, com.amazonaws.services.clouddirectory.model.ListObjectAttributesResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0
	var consistencyLevel: ConsistencyLevel? = null
	var facetFilter: com.amazonaws.services.clouddirectory.model.SchemaFacet? = null

	override fun build(): com.amazonaws.services.clouddirectory.model.ListObjectAttributesRequest {
		val input = com.amazonaws.services.clouddirectory.model.ListObjectAttributesRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setObjectReference(this.objectReference)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setConsistencyLevel(this.consistencyLevel?.toString())
		input.setFacetFilter(this.facetFilter)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.ListObjectAttributesResult {
	  return com.amazonaws.services.clouddirectory.model.ListObjectAttributesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.ListObjectAttributesResult {
		return environment.clouddirectory.listObjectAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory list-object-attributes")
				.argument("directory-arn", directoryArn)
				.argument("object-reference", objectReference.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("consistency-level", consistencyLevel?.toString())
				.argument("facet-filter", facetFilter?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.listObjectChildren(directoryArn: String, objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, init: AmazonCloudDirectoryListObjectChildrenCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.ListObjectChildrenResult {
	return this.block.declare(AmazonCloudDirectoryListObjectChildrenCommand(directoryArn, objectReference).apply(init)) as com.amazonaws.services.clouddirectory.model.ListObjectChildrenResult
}

@Generated
class AmazonCloudDirectoryListObjectChildrenCommand(val directoryArn: String, val objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ListObjectChildrenRequest, com.amazonaws.services.clouddirectory.model.ListObjectChildrenResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0
	var consistencyLevel: ConsistencyLevel? = null

	override fun build(): com.amazonaws.services.clouddirectory.model.ListObjectChildrenRequest {
		val input = com.amazonaws.services.clouddirectory.model.ListObjectChildrenRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setObjectReference(this.objectReference)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setConsistencyLevel(this.consistencyLevel?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.ListObjectChildrenResult {
	  return com.amazonaws.services.clouddirectory.model.ListObjectChildrenResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.ListObjectChildrenResult {
		return environment.clouddirectory.listObjectChildren(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory list-object-children")
				.argument("directory-arn", directoryArn)
				.argument("object-reference", objectReference.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("consistency-level", consistencyLevel?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.listObjectParentPaths(directoryArn: String, objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, init: AmazonCloudDirectoryListObjectParentPathsCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.ListObjectParentPathsResult {
	return this.block.declare(AmazonCloudDirectoryListObjectParentPathsCommand(directoryArn, objectReference).apply(init)) as com.amazonaws.services.clouddirectory.model.ListObjectParentPathsResult
}

@Generated
class AmazonCloudDirectoryListObjectParentPathsCommand(val directoryArn: String, val objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ListObjectParentPathsRequest, com.amazonaws.services.clouddirectory.model.ListObjectParentPathsResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.clouddirectory.model.ListObjectParentPathsRequest {
		val input = com.amazonaws.services.clouddirectory.model.ListObjectParentPathsRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setObjectReference(this.objectReference)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.ListObjectParentPathsResult {
	  return com.amazonaws.services.clouddirectory.model.ListObjectParentPathsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.ListObjectParentPathsResult {
		return environment.clouddirectory.listObjectParentPaths(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory list-object-parent-paths")
				.argument("directory-arn", directoryArn)
				.argument("object-reference", objectReference.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.listObjectParents(directoryArn: String, objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, init: AmazonCloudDirectoryListObjectParentsCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.ListObjectParentsResult {
	return this.block.declare(AmazonCloudDirectoryListObjectParentsCommand(directoryArn, objectReference).apply(init)) as com.amazonaws.services.clouddirectory.model.ListObjectParentsResult
}

@Generated
class AmazonCloudDirectoryListObjectParentsCommand(val directoryArn: String, val objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ListObjectParentsRequest, com.amazonaws.services.clouddirectory.model.ListObjectParentsResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0
	var consistencyLevel: ConsistencyLevel? = null

	override fun build(): com.amazonaws.services.clouddirectory.model.ListObjectParentsRequest {
		val input = com.amazonaws.services.clouddirectory.model.ListObjectParentsRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setObjectReference(this.objectReference)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setConsistencyLevel(this.consistencyLevel?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.ListObjectParentsResult {
	  return com.amazonaws.services.clouddirectory.model.ListObjectParentsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.ListObjectParentsResult {
		return environment.clouddirectory.listObjectParents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory list-object-parents")
				.argument("directory-arn", directoryArn)
				.argument("object-reference", objectReference.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("consistency-level", consistencyLevel?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.listObjectPolicies(directoryArn: String, objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, init: AmazonCloudDirectoryListObjectPoliciesCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.ListObjectPoliciesResult {
	return this.block.declare(AmazonCloudDirectoryListObjectPoliciesCommand(directoryArn, objectReference).apply(init)) as com.amazonaws.services.clouddirectory.model.ListObjectPoliciesResult
}

@Generated
class AmazonCloudDirectoryListObjectPoliciesCommand(val directoryArn: String, val objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ListObjectPoliciesRequest, com.amazonaws.services.clouddirectory.model.ListObjectPoliciesResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0
	var consistencyLevel: ConsistencyLevel? = null

	override fun build(): com.amazonaws.services.clouddirectory.model.ListObjectPoliciesRequest {
		val input = com.amazonaws.services.clouddirectory.model.ListObjectPoliciesRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setObjectReference(this.objectReference)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setConsistencyLevel(this.consistencyLevel?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.ListObjectPoliciesResult {
	  return com.amazonaws.services.clouddirectory.model.ListObjectPoliciesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.ListObjectPoliciesResult {
		return environment.clouddirectory.listObjectPolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory list-object-policies")
				.argument("directory-arn", directoryArn)
				.argument("object-reference", objectReference.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("consistency-level", consistencyLevel?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.listOutgoingTypedLinks(directoryArn: String, objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, init: AmazonCloudDirectoryListOutgoingTypedLinksCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.ListOutgoingTypedLinksResult {
	return this.block.declare(AmazonCloudDirectoryListOutgoingTypedLinksCommand(directoryArn, objectReference).apply(init)) as com.amazonaws.services.clouddirectory.model.ListOutgoingTypedLinksResult
}

@Generated
class AmazonCloudDirectoryListOutgoingTypedLinksCommand(val directoryArn: String, val objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ListOutgoingTypedLinksRequest, com.amazonaws.services.clouddirectory.model.ListOutgoingTypedLinksResult> {

	var filterAttributeRanges: List<com.amazonaws.services.clouddirectory.model.TypedLinkAttributeRange>? = null
	var filterTypedLink: com.amazonaws.services.clouddirectory.model.TypedLinkSchemaAndFacetName? = null
	var nextToken: String? = null
	var maxResults: Int? = 0
	var consistencyLevel: ConsistencyLevel? = null

	override fun build(): com.amazonaws.services.clouddirectory.model.ListOutgoingTypedLinksRequest {
		val input = com.amazonaws.services.clouddirectory.model.ListOutgoingTypedLinksRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setObjectReference(this.objectReference)
		input.setFilterAttributeRanges(this.filterAttributeRanges)
		input.setFilterTypedLink(this.filterTypedLink)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setConsistencyLevel(this.consistencyLevel?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.ListOutgoingTypedLinksResult {
	  return com.amazonaws.services.clouddirectory.model.ListOutgoingTypedLinksResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.ListOutgoingTypedLinksResult {
		return environment.clouddirectory.listOutgoingTypedLinks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory list-outgoing-typed-links")
				.argument("directory-arn", directoryArn)
				.argument("object-reference", objectReference.toString())
				.argument("filter-attribute-ranges", filterAttributeRanges?.toString())
				.argument("filter-typed-link", filterTypedLink?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("consistency-level", consistencyLevel?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.listPolicyAttachments(directoryArn: String, policyReference: com.amazonaws.services.clouddirectory.model.ObjectReference, init: AmazonCloudDirectoryListPolicyAttachmentsCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.ListPolicyAttachmentsResult {
	return this.block.declare(AmazonCloudDirectoryListPolicyAttachmentsCommand(directoryArn, policyReference).apply(init)) as com.amazonaws.services.clouddirectory.model.ListPolicyAttachmentsResult
}

@Generated
class AmazonCloudDirectoryListPolicyAttachmentsCommand(val directoryArn: String, val policyReference: com.amazonaws.services.clouddirectory.model.ObjectReference) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ListPolicyAttachmentsRequest, com.amazonaws.services.clouddirectory.model.ListPolicyAttachmentsResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0
	var consistencyLevel: ConsistencyLevel? = null

	override fun build(): com.amazonaws.services.clouddirectory.model.ListPolicyAttachmentsRequest {
		val input = com.amazonaws.services.clouddirectory.model.ListPolicyAttachmentsRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setPolicyReference(this.policyReference)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setConsistencyLevel(this.consistencyLevel?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.ListPolicyAttachmentsResult {
	  return com.amazonaws.services.clouddirectory.model.ListPolicyAttachmentsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.ListPolicyAttachmentsResult {
		return environment.clouddirectory.listPolicyAttachments(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory list-policy-attachments")
				.argument("directory-arn", directoryArn)
				.argument("policy-reference", policyReference.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("consistency-level", consistencyLevel?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.listPublishedSchemaArns(init: AmazonCloudDirectoryListPublishedSchemaArnsCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.ListPublishedSchemaArnsResult {
	return this.block.declare(AmazonCloudDirectoryListPublishedSchemaArnsCommand().apply(init)) as com.amazonaws.services.clouddirectory.model.ListPublishedSchemaArnsResult
}

@Generated
class AmazonCloudDirectoryListPublishedSchemaArnsCommand() : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ListPublishedSchemaArnsRequest, com.amazonaws.services.clouddirectory.model.ListPublishedSchemaArnsResult> {

	var schemaArn: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.clouddirectory.model.ListPublishedSchemaArnsRequest {
		val input = com.amazonaws.services.clouddirectory.model.ListPublishedSchemaArnsRequest()
		input.setSchemaArn(this.schemaArn)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.ListPublishedSchemaArnsResult {
	  return com.amazonaws.services.clouddirectory.model.ListPublishedSchemaArnsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.ListPublishedSchemaArnsResult {
		return environment.clouddirectory.listPublishedSchemaArns(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory list-published-schema-arns")
				.argument("schema-arn", schemaArn)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.listTagsForResource(resourceArn: String, init: AmazonCloudDirectoryListTagsForResourceCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.ListTagsForResourceResult {
	return this.block.declare(AmazonCloudDirectoryListTagsForResourceCommand(resourceArn).apply(init)) as com.amazonaws.services.clouddirectory.model.ListTagsForResourceResult
}

@Generated
class AmazonCloudDirectoryListTagsForResourceCommand(val resourceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ListTagsForResourceRequest, com.amazonaws.services.clouddirectory.model.ListTagsForResourceResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.clouddirectory.model.ListTagsForResourceRequest {
		val input = com.amazonaws.services.clouddirectory.model.ListTagsForResourceRequest()
		input.setResourceArn(this.resourceArn)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.ListTagsForResourceResult {
	  return com.amazonaws.services.clouddirectory.model.ListTagsForResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.ListTagsForResourceResult {
		return environment.clouddirectory.listTagsForResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory list-tags-for-resource")
				.argument("resource-arn", resourceArn)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.listTypedLinkFacetAttributes(schemaArn: String, name: String, init: AmazonCloudDirectoryListTypedLinkFacetAttributesCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetAttributesResult {
	return this.block.declare(AmazonCloudDirectoryListTypedLinkFacetAttributesCommand(schemaArn, name).apply(init)) as com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetAttributesResult
}

@Generated
class AmazonCloudDirectoryListTypedLinkFacetAttributesCommand(val schemaArn: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetAttributesRequest, com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetAttributesResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetAttributesRequest {
		val input = com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetAttributesRequest()
		input.setSchemaArn(this.schemaArn)
		input.setName(this.name)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetAttributesResult {
	  return com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetAttributesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetAttributesResult {
		return environment.clouddirectory.listTypedLinkFacetAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory list-typed-link-facet-attributes")
				.argument("schema-arn", schemaArn)
				.argument("name", name)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.listTypedLinkFacetNames(schemaArn: String, init: AmazonCloudDirectoryListTypedLinkFacetNamesCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetNamesResult {
	return this.block.declare(AmazonCloudDirectoryListTypedLinkFacetNamesCommand(schemaArn).apply(init)) as com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetNamesResult
}

@Generated
class AmazonCloudDirectoryListTypedLinkFacetNamesCommand(val schemaArn: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetNamesRequest, com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetNamesResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetNamesRequest {
		val input = com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetNamesRequest()
		input.setSchemaArn(this.schemaArn)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetNamesResult {
	  return com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetNamesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetNamesResult {
		return environment.clouddirectory.listTypedLinkFacetNames(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory list-typed-link-facet-names")
				.argument("schema-arn", schemaArn)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.lookupPolicy(directoryArn: String, objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, init: AmazonCloudDirectoryLookupPolicyCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.LookupPolicyResult {
	return this.block.declare(AmazonCloudDirectoryLookupPolicyCommand(directoryArn, objectReference).apply(init)) as com.amazonaws.services.clouddirectory.model.LookupPolicyResult
}

@Generated
class AmazonCloudDirectoryLookupPolicyCommand(val directoryArn: String, val objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.LookupPolicyRequest, com.amazonaws.services.clouddirectory.model.LookupPolicyResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.clouddirectory.model.LookupPolicyRequest {
		val input = com.amazonaws.services.clouddirectory.model.LookupPolicyRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setObjectReference(this.objectReference)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.LookupPolicyResult {
	  return com.amazonaws.services.clouddirectory.model.LookupPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.LookupPolicyResult {
		return environment.clouddirectory.lookupPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory lookup-policy")
				.argument("directory-arn", directoryArn)
				.argument("object-reference", objectReference.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.publishSchema(developmentSchemaArn: String, version: String, init: AmazonCloudDirectoryPublishSchemaCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.PublishSchemaResult {
	return this.block.declare(AmazonCloudDirectoryPublishSchemaCommand(developmentSchemaArn, version).apply(init)) as com.amazonaws.services.clouddirectory.model.PublishSchemaResult
}

@Generated
class AmazonCloudDirectoryPublishSchemaCommand(val developmentSchemaArn: String, val version: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.PublishSchemaRequest, com.amazonaws.services.clouddirectory.model.PublishSchemaResult> {

	var minorVersion: String? = null
	var name: String? = null

	override fun build(): com.amazonaws.services.clouddirectory.model.PublishSchemaRequest {
		val input = com.amazonaws.services.clouddirectory.model.PublishSchemaRequest()
		input.setDevelopmentSchemaArn(this.developmentSchemaArn)
		input.setVersion(this.version)
		input.setMinorVersion(this.minorVersion)
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.PublishSchemaResult {
	  return com.amazonaws.services.clouddirectory.model.PublishSchemaResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.PublishSchemaResult {
		return environment.clouddirectory.publishSchema(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory publish-schema")
				.argument("development-schema-arn", developmentSchemaArn)
				.argument("version", version)
				.argument("minor-version", minorVersion)
				.argument("name", name)
	}

}


fun AmazonCloudDirectoryFunctions.putSchemaFromJson(schemaArn: String, document: String, init: AmazonCloudDirectoryPutSchemaFromJsonCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.PutSchemaFromJsonResult {
	return this.block.declare(AmazonCloudDirectoryPutSchemaFromJsonCommand(schemaArn, document).apply(init)) as com.amazonaws.services.clouddirectory.model.PutSchemaFromJsonResult
}

@Generated
class AmazonCloudDirectoryPutSchemaFromJsonCommand(val schemaArn: String, val document: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.PutSchemaFromJsonRequest, com.amazonaws.services.clouddirectory.model.PutSchemaFromJsonResult> {



	override fun build(): com.amazonaws.services.clouddirectory.model.PutSchemaFromJsonRequest {
		val input = com.amazonaws.services.clouddirectory.model.PutSchemaFromJsonRequest()
		input.setSchemaArn(this.schemaArn)
		input.setDocument(this.document)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.PutSchemaFromJsonResult {
	  return com.amazonaws.services.clouddirectory.model.PutSchemaFromJsonResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.PutSchemaFromJsonResult {
		return environment.clouddirectory.putSchemaFromJson(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory put-schema-from-json")
				.argument("schema-arn", schemaArn)
				.argument("document", document)
	}

}


fun AmazonCloudDirectoryFunctions.removeFacetFromObject(directoryArn: String, schemaFacet: com.amazonaws.services.clouddirectory.model.SchemaFacet, objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, init: AmazonCloudDirectoryRemoveFacetFromObjectCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.RemoveFacetFromObjectResult {
	return this.block.declare(AmazonCloudDirectoryRemoveFacetFromObjectCommand(directoryArn, schemaFacet, objectReference).apply(init)) as com.amazonaws.services.clouddirectory.model.RemoveFacetFromObjectResult
}

@Generated
class AmazonCloudDirectoryRemoveFacetFromObjectCommand(val directoryArn: String, val schemaFacet: com.amazonaws.services.clouddirectory.model.SchemaFacet, val objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.RemoveFacetFromObjectRequest, com.amazonaws.services.clouddirectory.model.RemoveFacetFromObjectResult> {



	override fun build(): com.amazonaws.services.clouddirectory.model.RemoveFacetFromObjectRequest {
		val input = com.amazonaws.services.clouddirectory.model.RemoveFacetFromObjectRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setSchemaFacet(this.schemaFacet)
		input.setObjectReference(this.objectReference)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.RemoveFacetFromObjectResult {
	  return com.amazonaws.services.clouddirectory.model.RemoveFacetFromObjectResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.RemoveFacetFromObjectResult {
		return environment.clouddirectory.removeFacetFromObject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory remove-facet-from-object")
				.argument("directory-arn", directoryArn)
				.argument("schema-facet", schemaFacet.toString())
				.argument("object-reference", objectReference.toString())
	}

}


fun AmazonCloudDirectoryFunctions.tagResource(resourceArn: String, tags: List<com.amazonaws.services.clouddirectory.model.Tag>, init: AmazonCloudDirectoryTagResourceCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.TagResourceResult {
	return this.block.declare(AmazonCloudDirectoryTagResourceCommand(resourceArn, tags).apply(init)) as com.amazonaws.services.clouddirectory.model.TagResourceResult
}

@Generated
class AmazonCloudDirectoryTagResourceCommand(val resourceArn: String, val tags: List<com.amazonaws.services.clouddirectory.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.TagResourceRequest, com.amazonaws.services.clouddirectory.model.TagResourceResult> {



	override fun build(): com.amazonaws.services.clouddirectory.model.TagResourceRequest {
		val input = com.amazonaws.services.clouddirectory.model.TagResourceRequest()
		input.setResourceArn(this.resourceArn)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.TagResourceResult {
	  return com.amazonaws.services.clouddirectory.model.TagResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.TagResourceResult {
		return environment.clouddirectory.tagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory tag-resource")
				.argument("resource-arn", resourceArn)
				.argument("tags", tags.toString())
	}

}


fun AmazonCloudDirectoryFunctions.untagResource(resourceArn: String, tagKeys: List<String>, init: AmazonCloudDirectoryUntagResourceCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.UntagResourceResult {
	return this.block.declare(AmazonCloudDirectoryUntagResourceCommand(resourceArn, tagKeys).apply(init)) as com.amazonaws.services.clouddirectory.model.UntagResourceResult
}

@Generated
class AmazonCloudDirectoryUntagResourceCommand(val resourceArn: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.UntagResourceRequest, com.amazonaws.services.clouddirectory.model.UntagResourceResult> {



	override fun build(): com.amazonaws.services.clouddirectory.model.UntagResourceRequest {
		val input = com.amazonaws.services.clouddirectory.model.UntagResourceRequest()
		input.setResourceArn(this.resourceArn)
		input.setTagKeys(this.tagKeys)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.UntagResourceResult {
	  return com.amazonaws.services.clouddirectory.model.UntagResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.UntagResourceResult {
		return environment.clouddirectory.untagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory untag-resource")
				.argument("resource-arn", resourceArn)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AmazonCloudDirectoryFunctions.updateFacet(schemaArn: String, name: String, init: AmazonCloudDirectoryUpdateFacetCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.UpdateFacetResult {
	return this.block.declare(AmazonCloudDirectoryUpdateFacetCommand(schemaArn, name).apply(init)) as com.amazonaws.services.clouddirectory.model.UpdateFacetResult
}

@Generated
class AmazonCloudDirectoryUpdateFacetCommand(val schemaArn: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.UpdateFacetRequest, com.amazonaws.services.clouddirectory.model.UpdateFacetResult> {

	var attributeUpdates: List<com.amazonaws.services.clouddirectory.model.FacetAttributeUpdate>? = null
	var objectType: ObjectType? = null

	override fun build(): com.amazonaws.services.clouddirectory.model.UpdateFacetRequest {
		val input = com.amazonaws.services.clouddirectory.model.UpdateFacetRequest()
		input.setSchemaArn(this.schemaArn)
		input.setName(this.name)
		input.setAttributeUpdates(this.attributeUpdates)
		input.setObjectType(this.objectType?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.UpdateFacetResult {
	  return com.amazonaws.services.clouddirectory.model.UpdateFacetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.UpdateFacetResult {
		return environment.clouddirectory.updateFacet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory update-facet")
				.argument("schema-arn", schemaArn)
				.argument("name", name)
				.argument("attribute-updates", attributeUpdates?.toString())
				.argument("object-type", objectType?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.updateObjectAttributes(directoryArn: String, objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, attributeUpdates: List<com.amazonaws.services.clouddirectory.model.ObjectAttributeUpdate>, init: AmazonCloudDirectoryUpdateObjectAttributesCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.UpdateObjectAttributesResult {
	return this.block.declare(AmazonCloudDirectoryUpdateObjectAttributesCommand(directoryArn, objectReference, attributeUpdates).apply(init)) as com.amazonaws.services.clouddirectory.model.UpdateObjectAttributesResult
}

@Generated
class AmazonCloudDirectoryUpdateObjectAttributesCommand(val directoryArn: String, val objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, val attributeUpdates: List<com.amazonaws.services.clouddirectory.model.ObjectAttributeUpdate>) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.UpdateObjectAttributesRequest, com.amazonaws.services.clouddirectory.model.UpdateObjectAttributesResult> {



	override fun build(): com.amazonaws.services.clouddirectory.model.UpdateObjectAttributesRequest {
		val input = com.amazonaws.services.clouddirectory.model.UpdateObjectAttributesRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setObjectReference(this.objectReference)
		input.setAttributeUpdates(this.attributeUpdates)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.UpdateObjectAttributesResult {
	  return com.amazonaws.services.clouddirectory.model.UpdateObjectAttributesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.UpdateObjectAttributesResult {
		return environment.clouddirectory.updateObjectAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory update-object-attributes")
				.argument("directory-arn", directoryArn)
				.argument("object-reference", objectReference.toString())
				.argument("attribute-updates", attributeUpdates.toString())
	}

}


fun AmazonCloudDirectoryFunctions.updateSchema(schemaArn: String, name: String, init: AmazonCloudDirectoryUpdateSchemaCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.UpdateSchemaResult {
	return this.block.declare(AmazonCloudDirectoryUpdateSchemaCommand(schemaArn, name).apply(init)) as com.amazonaws.services.clouddirectory.model.UpdateSchemaResult
}

@Generated
class AmazonCloudDirectoryUpdateSchemaCommand(val schemaArn: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.UpdateSchemaRequest, com.amazonaws.services.clouddirectory.model.UpdateSchemaResult> {



	override fun build(): com.amazonaws.services.clouddirectory.model.UpdateSchemaRequest {
		val input = com.amazonaws.services.clouddirectory.model.UpdateSchemaRequest()
		input.setSchemaArn(this.schemaArn)
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.UpdateSchemaResult {
	  return com.amazonaws.services.clouddirectory.model.UpdateSchemaResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.UpdateSchemaResult {
		return environment.clouddirectory.updateSchema(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory update-schema")
				.argument("schema-arn", schemaArn)
				.argument("name", name)
	}

}


fun AmazonCloudDirectoryFunctions.updateTypedLinkFacet(schemaArn: String, name: String, attributeUpdates: List<com.amazonaws.services.clouddirectory.model.TypedLinkFacetAttributeUpdate>, identityAttributeOrder: List<String>, init: AmazonCloudDirectoryUpdateTypedLinkFacetCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.UpdateTypedLinkFacetResult {
	return this.block.declare(AmazonCloudDirectoryUpdateTypedLinkFacetCommand(schemaArn, name, attributeUpdates, identityAttributeOrder).apply(init)) as com.amazonaws.services.clouddirectory.model.UpdateTypedLinkFacetResult
}

@Generated
class AmazonCloudDirectoryUpdateTypedLinkFacetCommand(val schemaArn: String, val name: String, val attributeUpdates: List<com.amazonaws.services.clouddirectory.model.TypedLinkFacetAttributeUpdate>, val identityAttributeOrder: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.UpdateTypedLinkFacetRequest, com.amazonaws.services.clouddirectory.model.UpdateTypedLinkFacetResult> {



	override fun build(): com.amazonaws.services.clouddirectory.model.UpdateTypedLinkFacetRequest {
		val input = com.amazonaws.services.clouddirectory.model.UpdateTypedLinkFacetRequest()
		input.setSchemaArn(this.schemaArn)
		input.setName(this.name)
		input.setAttributeUpdates(this.attributeUpdates)
		input.setIdentityAttributeOrder(this.identityAttributeOrder)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.UpdateTypedLinkFacetResult {
	  return com.amazonaws.services.clouddirectory.model.UpdateTypedLinkFacetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.UpdateTypedLinkFacetResult {
		return environment.clouddirectory.updateTypedLinkFacet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory update-typed-link-facet")
				.argument("schema-arn", schemaArn)
				.argument("name", name)
				.argument("attribute-updates", attributeUpdates.toString())
				.argument("identity-attribute-order", identityAttributeOrder.toString())
	}

}


fun AmazonCloudDirectoryFunctions.upgradeAppliedSchema(publishedSchemaArn: String, directoryArn: String, init: AmazonCloudDirectoryUpgradeAppliedSchemaCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.UpgradeAppliedSchemaResult {
	return this.block.declare(AmazonCloudDirectoryUpgradeAppliedSchemaCommand(publishedSchemaArn, directoryArn).apply(init)) as com.amazonaws.services.clouddirectory.model.UpgradeAppliedSchemaResult
}

@Generated
class AmazonCloudDirectoryUpgradeAppliedSchemaCommand(val publishedSchemaArn: String, val directoryArn: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.UpgradeAppliedSchemaRequest, com.amazonaws.services.clouddirectory.model.UpgradeAppliedSchemaResult> {

	var dryRun: Boolean? = false

	override fun build(): com.amazonaws.services.clouddirectory.model.UpgradeAppliedSchemaRequest {
		val input = com.amazonaws.services.clouddirectory.model.UpgradeAppliedSchemaRequest()
		input.setPublishedSchemaArn(this.publishedSchemaArn)
		input.setDirectoryArn(this.directoryArn)
		input.setDryRun(this.dryRun)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.UpgradeAppliedSchemaResult {
	  return com.amazonaws.services.clouddirectory.model.UpgradeAppliedSchemaResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.UpgradeAppliedSchemaResult {
		return environment.clouddirectory.upgradeAppliedSchema(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory upgrade-applied-schema")
				.argument("published-schema-arn", publishedSchemaArn)
				.argument("directory-arn", directoryArn)
				.option("dry-run", dryRun ?: false)
	}

}


fun AmazonCloudDirectoryFunctions.upgradePublishedSchema(developmentSchemaArn: String, publishedSchemaArn: String, minorVersion: String, init: AmazonCloudDirectoryUpgradePublishedSchemaCommand.() -> Unit): com.amazonaws.services.clouddirectory.model.UpgradePublishedSchemaResult {
	return this.block.declare(AmazonCloudDirectoryUpgradePublishedSchemaCommand(developmentSchemaArn, publishedSchemaArn, minorVersion).apply(init)) as com.amazonaws.services.clouddirectory.model.UpgradePublishedSchemaResult
}

@Generated
class AmazonCloudDirectoryUpgradePublishedSchemaCommand(val developmentSchemaArn: String, val publishedSchemaArn: String, val minorVersion: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.UpgradePublishedSchemaRequest, com.amazonaws.services.clouddirectory.model.UpgradePublishedSchemaResult> {

	var dryRun: Boolean? = false

	override fun build(): com.amazonaws.services.clouddirectory.model.UpgradePublishedSchemaRequest {
		val input = com.amazonaws.services.clouddirectory.model.UpgradePublishedSchemaRequest()
		input.setDevelopmentSchemaArn(this.developmentSchemaArn)
		input.setPublishedSchemaArn(this.publishedSchemaArn)
		input.setMinorVersion(this.minorVersion)
		input.setDryRun(this.dryRun)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.clouddirectory.model.UpgradePublishedSchemaResult {
	  return com.amazonaws.services.clouddirectory.model.UpgradePublishedSchemaResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.clouddirectory.model.UpgradePublishedSchemaResult {
		return environment.clouddirectory.upgradePublishedSchema(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory upgrade-published-schema")
				.argument("development-schema-arn", developmentSchemaArn)
				.argument("published-schema-arn", publishedSchemaArn)
				.argument("minor-version", minorVersion)
				.option("dry-run", dryRun ?: false)
	}

}
