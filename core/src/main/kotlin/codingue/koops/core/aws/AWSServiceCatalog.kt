
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceVoidCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.servicecatalog.AWSServiceCatalog
import com.amazonaws.services.servicecatalog.AWSServiceCatalogClientBuilder
import com.amazonaws.services.servicecatalog.model.*

var codingue.koops.core.Environment.servicecatalog: AWSServiceCatalog
	get() {
		var service = this.capabilities[AWSServiceCatalog::class.java.name]
		if (service == null) {
			service = AWSServiceCatalogClientBuilder.standard().build()
			servicecatalog = service
		}
		return service as AWSServiceCatalog
	}
	set(servicecatalog) {
		this.capabilities[AWSServiceCatalog::class.java.name] = servicecatalog
	}

@Generated
class AWSServiceCatalogFunctions(val block: Block)

infix fun <T> AwsContinuation.servicecatalog(init: AWSServiceCatalogFunctions.() -> T): T {
	return AWSServiceCatalogFunctions(shell).run(init)
}

			

fun AWSServiceCatalogFunctions.acceptPortfolioShare(portfolioId: String, init: AWSServiceCatalogAcceptPortfolioShareCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.AcceptPortfolioShareResult {
	return this.block.declare(AWSServiceCatalogAcceptPortfolioShareCommand(portfolioId).apply(init)) as com.amazonaws.services.servicecatalog.model.AcceptPortfolioShareResult
}

@Generated
class AWSServiceCatalogAcceptPortfolioShareCommand(val portfolioId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.AcceptPortfolioShareRequest, com.amazonaws.services.servicecatalog.model.AcceptPortfolioShareResult> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.AcceptPortfolioShareRequest {
		val input = com.amazonaws.services.servicecatalog.model.AcceptPortfolioShareRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setPortfolioId(this.portfolioId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.AcceptPortfolioShareResult {
	  return com.amazonaws.services.servicecatalog.model.AcceptPortfolioShareResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.AcceptPortfolioShareResult {
		return environment.servicecatalog.acceptPortfolioShare(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog accept-portfolio-share")
				.argument("accept-language", acceptLanguage)
				.argument("portfolio-id", portfolioId)
	}

}


fun AWSServiceCatalogFunctions.associatePrincipalWithPortfolio(portfolioId: String, principalARN: String, principalType: PrincipalType, init: AWSServiceCatalogAssociatePrincipalWithPortfolioCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.AssociatePrincipalWithPortfolioResult {
	return this.block.declare(AWSServiceCatalogAssociatePrincipalWithPortfolioCommand(portfolioId, principalARN, principalType).apply(init)) as com.amazonaws.services.servicecatalog.model.AssociatePrincipalWithPortfolioResult
}

@Generated
class AWSServiceCatalogAssociatePrincipalWithPortfolioCommand(val portfolioId: String, val principalARN: String, val principalType: PrincipalType) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.AssociatePrincipalWithPortfolioRequest, com.amazonaws.services.servicecatalog.model.AssociatePrincipalWithPortfolioResult> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.AssociatePrincipalWithPortfolioRequest {
		val input = com.amazonaws.services.servicecatalog.model.AssociatePrincipalWithPortfolioRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setPortfolioId(this.portfolioId)
		input.setPrincipalARN(this.principalARN)
		input.setPrincipalType(this.principalType.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.AssociatePrincipalWithPortfolioResult {
	  return com.amazonaws.services.servicecatalog.model.AssociatePrincipalWithPortfolioResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.AssociatePrincipalWithPortfolioResult {
		return environment.servicecatalog.associatePrincipalWithPortfolio(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog associate-principal-with-portfolio")
				.argument("accept-language", acceptLanguage)
				.argument("portfolio-id", portfolioId)
				.argument("principal-arn", principalARN)
				.argument("principal-type", principalType.toString())
	}

}


fun AWSServiceCatalogFunctions.associateProductWithPortfolio(productId: String, portfolioId: String, init: AWSServiceCatalogAssociateProductWithPortfolioCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.AssociateProductWithPortfolioResult {
	return this.block.declare(AWSServiceCatalogAssociateProductWithPortfolioCommand(productId, portfolioId).apply(init)) as com.amazonaws.services.servicecatalog.model.AssociateProductWithPortfolioResult
}

@Generated
class AWSServiceCatalogAssociateProductWithPortfolioCommand(val productId: String, val portfolioId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.AssociateProductWithPortfolioRequest, com.amazonaws.services.servicecatalog.model.AssociateProductWithPortfolioResult> {

	var acceptLanguage: String? = null
	var sourcePortfolioId: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.AssociateProductWithPortfolioRequest {
		val input = com.amazonaws.services.servicecatalog.model.AssociateProductWithPortfolioRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setProductId(this.productId)
		input.setPortfolioId(this.portfolioId)
		input.setSourcePortfolioId(this.sourcePortfolioId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.AssociateProductWithPortfolioResult {
	  return com.amazonaws.services.servicecatalog.model.AssociateProductWithPortfolioResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.AssociateProductWithPortfolioResult {
		return environment.servicecatalog.associateProductWithPortfolio(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog associate-product-with-portfolio")
				.argument("accept-language", acceptLanguage)
				.argument("product-id", productId)
				.argument("portfolio-id", portfolioId)
				.argument("source-portfolio-id", sourcePortfolioId)
	}

}


fun AWSServiceCatalogFunctions.associateTagOptionWithResource(resourceId: String, tagOptionId: String, init: AWSServiceCatalogAssociateTagOptionWithResourceCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.AssociateTagOptionWithResourceResult {
	return this.block.declare(AWSServiceCatalogAssociateTagOptionWithResourceCommand(resourceId, tagOptionId).apply(init)) as com.amazonaws.services.servicecatalog.model.AssociateTagOptionWithResourceResult
}

@Generated
class AWSServiceCatalogAssociateTagOptionWithResourceCommand(val resourceId: String, val tagOptionId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.AssociateTagOptionWithResourceRequest, com.amazonaws.services.servicecatalog.model.AssociateTagOptionWithResourceResult> {



	override fun build(): com.amazonaws.services.servicecatalog.model.AssociateTagOptionWithResourceRequest {
		val input = com.amazonaws.services.servicecatalog.model.AssociateTagOptionWithResourceRequest()
		input.setResourceId(this.resourceId)
		input.setTagOptionId(this.tagOptionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.AssociateTagOptionWithResourceResult {
	  return com.amazonaws.services.servicecatalog.model.AssociateTagOptionWithResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.AssociateTagOptionWithResourceResult {
		return environment.servicecatalog.associateTagOptionWithResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog associate-tag-option-with-resource")
				.argument("resource-id", resourceId)
				.argument("tag-option-id", tagOptionId)
	}

}


fun AWSServiceCatalogFunctions.copyProduct(sourceProductArn: String, idempotencyToken: String, init: AWSServiceCatalogCopyProductCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.CopyProductResult {
	return this.block.declare(AWSServiceCatalogCopyProductCommand(sourceProductArn, idempotencyToken).apply(init)) as com.amazonaws.services.servicecatalog.model.CopyProductResult
}

@Generated
class AWSServiceCatalogCopyProductCommand(val sourceProductArn: String, val idempotencyToken: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.CopyProductRequest, com.amazonaws.services.servicecatalog.model.CopyProductResult> {

	var acceptLanguage: String? = null
	var targetProductId: String? = null
	var targetProductName: String? = null
	var sourceProvisioningArtifactIdentifiers: List<Map<ProvisioningArtifactPropertyName, String>>? = null
	var copyOptions: List<CopyOption>? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.CopyProductRequest {
		val input = com.amazonaws.services.servicecatalog.model.CopyProductRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setSourceProductArn(this.sourceProductArn)
		input.setTargetProductId(this.targetProductId)
		input.setTargetProductName(this.targetProductName)
		input.setSourceProvisioningArtifactIdentifiers(this.sourceProvisioningArtifactIdentifiers?.map { it.mapKeys { it.toString() } })
		input.setCopyOptions(this.copyOptions?.map { it.toString() })
		input.setIdempotencyToken(this.idempotencyToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.CopyProductResult {
	  return com.amazonaws.services.servicecatalog.model.CopyProductResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.CopyProductResult {
		return environment.servicecatalog.copyProduct(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog copy-product")
				.argument("accept-language", acceptLanguage)
				.argument("source-product-arn", sourceProductArn)
				.argument("target-product-id", targetProductId)
				.argument("target-product-name", targetProductName)
				.argument("source-provisioning-artifact-identifiers", sourceProvisioningArtifactIdentifiers?.toString())
				.argument("copy-options", copyOptions?.toString())
				.argument("idempotency-token", idempotencyToken)
	}

}


fun AWSServiceCatalogFunctions.createConstraint(portfolioId: String, productId: String, parameters: String, type: String, idempotencyToken: String, init: AWSServiceCatalogCreateConstraintCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.CreateConstraintResult {
	return this.block.declare(AWSServiceCatalogCreateConstraintCommand(portfolioId, productId, parameters, type, idempotencyToken).apply(init)) as com.amazonaws.services.servicecatalog.model.CreateConstraintResult
}

@Generated
class AWSServiceCatalogCreateConstraintCommand(val portfolioId: String, val productId: String, val parameters: String, val type: String, val idempotencyToken: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.CreateConstraintRequest, com.amazonaws.services.servicecatalog.model.CreateConstraintResult> {

	var acceptLanguage: String? = null
	var description: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.CreateConstraintRequest {
		val input = com.amazonaws.services.servicecatalog.model.CreateConstraintRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setPortfolioId(this.portfolioId)
		input.setProductId(this.productId)
		input.setParameters(this.parameters)
		input.setType(this.type)
		input.setDescription(this.description)
		input.setIdempotencyToken(this.idempotencyToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.CreateConstraintResult {
	  return com.amazonaws.services.servicecatalog.model.CreateConstraintResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.CreateConstraintResult {
		return environment.servicecatalog.createConstraint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog create-constraint")
				.argument("accept-language", acceptLanguage)
				.argument("portfolio-id", portfolioId)
				.argument("product-id", productId)
				.argument("parameters", parameters)
				.argument("type", type)
				.argument("description", description)
				.argument("idempotency-token", idempotencyToken)
	}

}


fun AWSServiceCatalogFunctions.createPortfolio(displayName: String, providerName: String, idempotencyToken: String, init: AWSServiceCatalogCreatePortfolioCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.CreatePortfolioResult {
	return this.block.declare(AWSServiceCatalogCreatePortfolioCommand(displayName, providerName, idempotencyToken).apply(init)) as com.amazonaws.services.servicecatalog.model.CreatePortfolioResult
}

@Generated
class AWSServiceCatalogCreatePortfolioCommand(val displayName: String, val providerName: String, val idempotencyToken: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.CreatePortfolioRequest, com.amazonaws.services.servicecatalog.model.CreatePortfolioResult> {

	var acceptLanguage: String? = null
	var description: String? = null
	var tags: List<com.amazonaws.services.servicecatalog.model.Tag>? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.CreatePortfolioRequest {
		val input = com.amazonaws.services.servicecatalog.model.CreatePortfolioRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setDisplayName(this.displayName)
		input.setDescription(this.description)
		input.setProviderName(this.providerName)
		input.setTags(this.tags)
		input.setIdempotencyToken(this.idempotencyToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.CreatePortfolioResult {
	  return com.amazonaws.services.servicecatalog.model.CreatePortfolioResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.CreatePortfolioResult {
		return environment.servicecatalog.createPortfolio(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog create-portfolio")
				.argument("accept-language", acceptLanguage)
				.argument("display-name", displayName)
				.argument("description", description)
				.argument("provider-name", providerName)
				.argument("tags", tags?.toString())
				.argument("idempotency-token", idempotencyToken)
	}

}


fun AWSServiceCatalogFunctions.createPortfolioShare(portfolioId: String, accountId: String, init: AWSServiceCatalogCreatePortfolioShareCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.CreatePortfolioShareResult {
	return this.block.declare(AWSServiceCatalogCreatePortfolioShareCommand(portfolioId, accountId).apply(init)) as com.amazonaws.services.servicecatalog.model.CreatePortfolioShareResult
}

@Generated
class AWSServiceCatalogCreatePortfolioShareCommand(val portfolioId: String, val accountId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.CreatePortfolioShareRequest, com.amazonaws.services.servicecatalog.model.CreatePortfolioShareResult> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.CreatePortfolioShareRequest {
		val input = com.amazonaws.services.servicecatalog.model.CreatePortfolioShareRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setPortfolioId(this.portfolioId)
		input.setAccountId(this.accountId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.CreatePortfolioShareResult {
	  return com.amazonaws.services.servicecatalog.model.CreatePortfolioShareResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.CreatePortfolioShareResult {
		return environment.servicecatalog.createPortfolioShare(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog create-portfolio-share")
				.argument("accept-language", acceptLanguage)
				.argument("portfolio-id", portfolioId)
				.argument("account-id", accountId)
	}

}


fun AWSServiceCatalogFunctions.createProduct(name: String, owner: String, productType: ProductType, provisioningArtifactParameters: com.amazonaws.services.servicecatalog.model.ProvisioningArtifactProperties, idempotencyToken: String, init: AWSServiceCatalogCreateProductCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.CreateProductResult {
	return this.block.declare(AWSServiceCatalogCreateProductCommand(name, owner, productType, provisioningArtifactParameters, idempotencyToken).apply(init)) as com.amazonaws.services.servicecatalog.model.CreateProductResult
}

@Generated
class AWSServiceCatalogCreateProductCommand(val name: String, val owner: String, val productType: ProductType, val provisioningArtifactParameters: com.amazonaws.services.servicecatalog.model.ProvisioningArtifactProperties, val idempotencyToken: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.CreateProductRequest, com.amazonaws.services.servicecatalog.model.CreateProductResult> {

	var acceptLanguage: String? = null
	var description: String? = null
	var distributor: String? = null
	var supportDescription: String? = null
	var supportEmail: String? = null
	var supportUrl: String? = null
	var tags: List<com.amazonaws.services.servicecatalog.model.Tag>? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.CreateProductRequest {
		val input = com.amazonaws.services.servicecatalog.model.CreateProductRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setName(this.name)
		input.setOwner(this.owner)
		input.setDescription(this.description)
		input.setDistributor(this.distributor)
		input.setSupportDescription(this.supportDescription)
		input.setSupportEmail(this.supportEmail)
		input.setSupportUrl(this.supportUrl)
		input.setProductType(this.productType.toString())
		input.setTags(this.tags)
		input.setProvisioningArtifactParameters(this.provisioningArtifactParameters)
		input.setIdempotencyToken(this.idempotencyToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.CreateProductResult {
	  return com.amazonaws.services.servicecatalog.model.CreateProductResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.CreateProductResult {
		return environment.servicecatalog.createProduct(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog create-product")
				.argument("accept-language", acceptLanguage)
				.argument("name", name)
				.argument("owner", owner)
				.argument("description", description)
				.argument("distributor", distributor)
				.argument("support-description", supportDescription)
				.argument("support-email", supportEmail)
				.argument("support-url", supportUrl)
				.argument("product-type", productType.toString())
				.argument("tags", tags?.toString())
				.argument("provisioning-artifact-parameters", provisioningArtifactParameters.toString())
				.argument("idempotency-token", idempotencyToken)
	}

}


fun AWSServiceCatalogFunctions.createProvisionedProductPlan(planName: String, planType: ProvisionedProductPlanType, productId: String, provisionedProductName: String, provisioningArtifactId: String, idempotencyToken: String, init: AWSServiceCatalogCreateProvisionedProductPlanCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.CreateProvisionedProductPlanResult {
	return this.block.declare(AWSServiceCatalogCreateProvisionedProductPlanCommand(planName, planType, productId, provisionedProductName, provisioningArtifactId, idempotencyToken).apply(init)) as com.amazonaws.services.servicecatalog.model.CreateProvisionedProductPlanResult
}

@Generated
class AWSServiceCatalogCreateProvisionedProductPlanCommand(val planName: String, val planType: ProvisionedProductPlanType, val productId: String, val provisionedProductName: String, val provisioningArtifactId: String, val idempotencyToken: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.CreateProvisionedProductPlanRequest, com.amazonaws.services.servicecatalog.model.CreateProvisionedProductPlanResult> {

	var acceptLanguage: String? = null
	var notificationArns: List<String>? = null
	var pathId: String? = null
	var provisioningParameters: List<com.amazonaws.services.servicecatalog.model.UpdateProvisioningParameter>? = null
	var tags: List<com.amazonaws.services.servicecatalog.model.Tag>? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.CreateProvisionedProductPlanRequest {
		val input = com.amazonaws.services.servicecatalog.model.CreateProvisionedProductPlanRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setPlanName(this.planName)
		input.setPlanType(this.planType.toString())
		input.setNotificationArns(this.notificationArns)
		input.setPathId(this.pathId)
		input.setProductId(this.productId)
		input.setProvisionedProductName(this.provisionedProductName)
		input.setProvisioningArtifactId(this.provisioningArtifactId)
		input.setProvisioningParameters(this.provisioningParameters)
		input.setIdempotencyToken(this.idempotencyToken)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.CreateProvisionedProductPlanResult {
	  return com.amazonaws.services.servicecatalog.model.CreateProvisionedProductPlanResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.CreateProvisionedProductPlanResult {
		return environment.servicecatalog.createProvisionedProductPlan(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog create-provisioned-product-plan")
				.argument("accept-language", acceptLanguage)
				.argument("plan-name", planName)
				.argument("plan-type", planType.toString())
				.argument("notification-arns", notificationArns?.toString())
				.argument("path-id", pathId)
				.argument("product-id", productId)
				.argument("provisioned-product-name", provisionedProductName)
				.argument("provisioning-artifact-id", provisioningArtifactId)
				.argument("provisioning-parameters", provisioningParameters?.toString())
				.argument("idempotency-token", idempotencyToken)
				.argument("tags", tags?.toString())
	}

}


fun AWSServiceCatalogFunctions.createProvisioningArtifact(productId: String, parameters: com.amazonaws.services.servicecatalog.model.ProvisioningArtifactProperties, idempotencyToken: String, init: AWSServiceCatalogCreateProvisioningArtifactCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.CreateProvisioningArtifactResult {
	return this.block.declare(AWSServiceCatalogCreateProvisioningArtifactCommand(productId, parameters, idempotencyToken).apply(init)) as com.amazonaws.services.servicecatalog.model.CreateProvisioningArtifactResult
}

@Generated
class AWSServiceCatalogCreateProvisioningArtifactCommand(val productId: String, val parameters: com.amazonaws.services.servicecatalog.model.ProvisioningArtifactProperties, val idempotencyToken: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.CreateProvisioningArtifactRequest, com.amazonaws.services.servicecatalog.model.CreateProvisioningArtifactResult> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.CreateProvisioningArtifactRequest {
		val input = com.amazonaws.services.servicecatalog.model.CreateProvisioningArtifactRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setProductId(this.productId)
		input.setParameters(this.parameters)
		input.setIdempotencyToken(this.idempotencyToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.CreateProvisioningArtifactResult {
	  return com.amazonaws.services.servicecatalog.model.CreateProvisioningArtifactResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.CreateProvisioningArtifactResult {
		return environment.servicecatalog.createProvisioningArtifact(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog create-provisioning-artifact")
				.argument("accept-language", acceptLanguage)
				.argument("product-id", productId)
				.argument("parameters", parameters.toString())
				.argument("idempotency-token", idempotencyToken)
	}

}


fun AWSServiceCatalogFunctions.createTagOption(key: String, value: String, init: AWSServiceCatalogCreateTagOptionCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.CreateTagOptionResult {
	return this.block.declare(AWSServiceCatalogCreateTagOptionCommand(key, value).apply(init)) as com.amazonaws.services.servicecatalog.model.CreateTagOptionResult
}

@Generated
class AWSServiceCatalogCreateTagOptionCommand(val key: String, val value: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.CreateTagOptionRequest, com.amazonaws.services.servicecatalog.model.CreateTagOptionResult> {



	override fun build(): com.amazonaws.services.servicecatalog.model.CreateTagOptionRequest {
		val input = com.amazonaws.services.servicecatalog.model.CreateTagOptionRequest()
		input.setKey(this.key)
		input.setValue(this.value)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.CreateTagOptionResult {
	  return com.amazonaws.services.servicecatalog.model.CreateTagOptionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.CreateTagOptionResult {
		return environment.servicecatalog.createTagOption(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog create-tag-option")
				.argument("key", key)
				.argument("value", value)
	}

}


fun AWSServiceCatalogFunctions.deleteConstraint(id: String, init: AWSServiceCatalogDeleteConstraintCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.DeleteConstraintResult {
	return this.block.declare(AWSServiceCatalogDeleteConstraintCommand(id).apply(init)) as com.amazonaws.services.servicecatalog.model.DeleteConstraintResult
}

@Generated
class AWSServiceCatalogDeleteConstraintCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DeleteConstraintRequest, com.amazonaws.services.servicecatalog.model.DeleteConstraintResult> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.DeleteConstraintRequest {
		val input = com.amazonaws.services.servicecatalog.model.DeleteConstraintRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.DeleteConstraintResult {
	  return com.amazonaws.services.servicecatalog.model.DeleteConstraintResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.DeleteConstraintResult {
		return environment.servicecatalog.deleteConstraint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog delete-constraint")
				.argument("accept-language", acceptLanguage)
				.argument("id", id)
	}

}


fun AWSServiceCatalogFunctions.deletePortfolio(id: String, init: AWSServiceCatalogDeletePortfolioCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.DeletePortfolioResult {
	return this.block.declare(AWSServiceCatalogDeletePortfolioCommand(id).apply(init)) as com.amazonaws.services.servicecatalog.model.DeletePortfolioResult
}

@Generated
class AWSServiceCatalogDeletePortfolioCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DeletePortfolioRequest, com.amazonaws.services.servicecatalog.model.DeletePortfolioResult> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.DeletePortfolioRequest {
		val input = com.amazonaws.services.servicecatalog.model.DeletePortfolioRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.DeletePortfolioResult {
	  return com.amazonaws.services.servicecatalog.model.DeletePortfolioResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.DeletePortfolioResult {
		return environment.servicecatalog.deletePortfolio(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog delete-portfolio")
				.argument("accept-language", acceptLanguage)
				.argument("id", id)
	}

}


fun AWSServiceCatalogFunctions.deletePortfolioShare(portfolioId: String, accountId: String, init: AWSServiceCatalogDeletePortfolioShareCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.DeletePortfolioShareResult {
	return this.block.declare(AWSServiceCatalogDeletePortfolioShareCommand(portfolioId, accountId).apply(init)) as com.amazonaws.services.servicecatalog.model.DeletePortfolioShareResult
}

@Generated
class AWSServiceCatalogDeletePortfolioShareCommand(val portfolioId: String, val accountId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DeletePortfolioShareRequest, com.amazonaws.services.servicecatalog.model.DeletePortfolioShareResult> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.DeletePortfolioShareRequest {
		val input = com.amazonaws.services.servicecatalog.model.DeletePortfolioShareRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setPortfolioId(this.portfolioId)
		input.setAccountId(this.accountId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.DeletePortfolioShareResult {
	  return com.amazonaws.services.servicecatalog.model.DeletePortfolioShareResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.DeletePortfolioShareResult {
		return environment.servicecatalog.deletePortfolioShare(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog delete-portfolio-share")
				.argument("accept-language", acceptLanguage)
				.argument("portfolio-id", portfolioId)
				.argument("account-id", accountId)
	}

}


fun AWSServiceCatalogFunctions.deleteProduct(id: String, init: AWSServiceCatalogDeleteProductCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.DeleteProductResult {
	return this.block.declare(AWSServiceCatalogDeleteProductCommand(id).apply(init)) as com.amazonaws.services.servicecatalog.model.DeleteProductResult
}

@Generated
class AWSServiceCatalogDeleteProductCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DeleteProductRequest, com.amazonaws.services.servicecatalog.model.DeleteProductResult> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.DeleteProductRequest {
		val input = com.amazonaws.services.servicecatalog.model.DeleteProductRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.DeleteProductResult {
	  return com.amazonaws.services.servicecatalog.model.DeleteProductResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.DeleteProductResult {
		return environment.servicecatalog.deleteProduct(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog delete-product")
				.argument("accept-language", acceptLanguage)
				.argument("id", id)
	}

}


fun AWSServiceCatalogFunctions.deleteProvisionedProductPlan(planId: String, init: AWSServiceCatalogDeleteProvisionedProductPlanCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.DeleteProvisionedProductPlanResult {
	return this.block.declare(AWSServiceCatalogDeleteProvisionedProductPlanCommand(planId).apply(init)) as com.amazonaws.services.servicecatalog.model.DeleteProvisionedProductPlanResult
}

@Generated
class AWSServiceCatalogDeleteProvisionedProductPlanCommand(val planId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DeleteProvisionedProductPlanRequest, com.amazonaws.services.servicecatalog.model.DeleteProvisionedProductPlanResult> {

	var acceptLanguage: String? = null
	var ignoreErrors: Boolean? = false

	override fun build(): com.amazonaws.services.servicecatalog.model.DeleteProvisionedProductPlanRequest {
		val input = com.amazonaws.services.servicecatalog.model.DeleteProvisionedProductPlanRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setPlanId(this.planId)
		input.setIgnoreErrors(this.ignoreErrors)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.DeleteProvisionedProductPlanResult {
	  return com.amazonaws.services.servicecatalog.model.DeleteProvisionedProductPlanResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.DeleteProvisionedProductPlanResult {
		return environment.servicecatalog.deleteProvisionedProductPlan(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog delete-provisioned-product-plan")
				.argument("accept-language", acceptLanguage)
				.argument("plan-id", planId)
				.option("ignore-errors", ignoreErrors ?: false)
	}

}


fun AWSServiceCatalogFunctions.deleteProvisioningArtifact(productId: String, provisioningArtifactId: String, init: AWSServiceCatalogDeleteProvisioningArtifactCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.DeleteProvisioningArtifactResult {
	return this.block.declare(AWSServiceCatalogDeleteProvisioningArtifactCommand(productId, provisioningArtifactId).apply(init)) as com.amazonaws.services.servicecatalog.model.DeleteProvisioningArtifactResult
}

@Generated
class AWSServiceCatalogDeleteProvisioningArtifactCommand(val productId: String, val provisioningArtifactId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DeleteProvisioningArtifactRequest, com.amazonaws.services.servicecatalog.model.DeleteProvisioningArtifactResult> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.DeleteProvisioningArtifactRequest {
		val input = com.amazonaws.services.servicecatalog.model.DeleteProvisioningArtifactRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setProductId(this.productId)
		input.setProvisioningArtifactId(this.provisioningArtifactId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.DeleteProvisioningArtifactResult {
	  return com.amazonaws.services.servicecatalog.model.DeleteProvisioningArtifactResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.DeleteProvisioningArtifactResult {
		return environment.servicecatalog.deleteProvisioningArtifact(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog delete-provisioning-artifact")
				.argument("accept-language", acceptLanguage)
				.argument("product-id", productId)
				.argument("provisioning-artifact-id", provisioningArtifactId)
	}

}


fun AWSServiceCatalogFunctions.deleteTagOption(id: String, init: AWSServiceCatalogDeleteTagOptionCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.DeleteTagOptionResult {
	return this.block.declare(AWSServiceCatalogDeleteTagOptionCommand(id).apply(init)) as com.amazonaws.services.servicecatalog.model.DeleteTagOptionResult
}

@Generated
class AWSServiceCatalogDeleteTagOptionCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DeleteTagOptionRequest, com.amazonaws.services.servicecatalog.model.DeleteTagOptionResult> {



	override fun build(): com.amazonaws.services.servicecatalog.model.DeleteTagOptionRequest {
		val input = com.amazonaws.services.servicecatalog.model.DeleteTagOptionRequest()
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.DeleteTagOptionResult {
	  return com.amazonaws.services.servicecatalog.model.DeleteTagOptionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.DeleteTagOptionResult {
		return environment.servicecatalog.deleteTagOption(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog delete-tag-option")
				.argument("id", id)
	}

}


fun AWSServiceCatalogFunctions.describeConstraint(id: String, init: AWSServiceCatalogDescribeConstraintCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.DescribeConstraintResult {
	return this.block.declare(AWSServiceCatalogDescribeConstraintCommand(id).apply(init)) as com.amazonaws.services.servicecatalog.model.DescribeConstraintResult
}

@Generated
class AWSServiceCatalogDescribeConstraintCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DescribeConstraintRequest, com.amazonaws.services.servicecatalog.model.DescribeConstraintResult> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.DescribeConstraintRequest {
		val input = com.amazonaws.services.servicecatalog.model.DescribeConstraintRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.DescribeConstraintResult {
	  return com.amazonaws.services.servicecatalog.model.DescribeConstraintResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.DescribeConstraintResult {
		return environment.servicecatalog.describeConstraint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog describe-constraint")
				.argument("accept-language", acceptLanguage)
				.argument("id", id)
	}

}


fun AWSServiceCatalogFunctions.describeCopyProductStatus(copyProductToken: String, init: AWSServiceCatalogDescribeCopyProductStatusCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.DescribeCopyProductStatusResult {
	return this.block.declare(AWSServiceCatalogDescribeCopyProductStatusCommand(copyProductToken).apply(init)) as com.amazonaws.services.servicecatalog.model.DescribeCopyProductStatusResult
}

@Generated
class AWSServiceCatalogDescribeCopyProductStatusCommand(val copyProductToken: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DescribeCopyProductStatusRequest, com.amazonaws.services.servicecatalog.model.DescribeCopyProductStatusResult> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.DescribeCopyProductStatusRequest {
		val input = com.amazonaws.services.servicecatalog.model.DescribeCopyProductStatusRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setCopyProductToken(this.copyProductToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.DescribeCopyProductStatusResult {
	  return com.amazonaws.services.servicecatalog.model.DescribeCopyProductStatusResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.DescribeCopyProductStatusResult {
		return environment.servicecatalog.describeCopyProductStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog describe-copy-product-status")
				.argument("accept-language", acceptLanguage)
				.argument("copy-product-token", copyProductToken)
	}

}


fun AWSServiceCatalogFunctions.describePortfolio(id: String, init: AWSServiceCatalogDescribePortfolioCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.DescribePortfolioResult {
	return this.block.declare(AWSServiceCatalogDescribePortfolioCommand(id).apply(init)) as com.amazonaws.services.servicecatalog.model.DescribePortfolioResult
}

@Generated
class AWSServiceCatalogDescribePortfolioCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DescribePortfolioRequest, com.amazonaws.services.servicecatalog.model.DescribePortfolioResult> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.DescribePortfolioRequest {
		val input = com.amazonaws.services.servicecatalog.model.DescribePortfolioRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.DescribePortfolioResult {
	  return com.amazonaws.services.servicecatalog.model.DescribePortfolioResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.DescribePortfolioResult {
		return environment.servicecatalog.describePortfolio(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog describe-portfolio")
				.argument("accept-language", acceptLanguage)
				.argument("id", id)
	}

}


fun AWSServiceCatalogFunctions.describeProduct(id: String, init: AWSServiceCatalogDescribeProductCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.DescribeProductResult {
	return this.block.declare(AWSServiceCatalogDescribeProductCommand(id).apply(init)) as com.amazonaws.services.servicecatalog.model.DescribeProductResult
}

@Generated
class AWSServiceCatalogDescribeProductCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DescribeProductRequest, com.amazonaws.services.servicecatalog.model.DescribeProductResult> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.DescribeProductRequest {
		val input = com.amazonaws.services.servicecatalog.model.DescribeProductRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.DescribeProductResult {
	  return com.amazonaws.services.servicecatalog.model.DescribeProductResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.DescribeProductResult {
		return environment.servicecatalog.describeProduct(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog describe-product")
				.argument("accept-language", acceptLanguage)
				.argument("id", id)
	}

}


fun AWSServiceCatalogFunctions.describeProductAsAdmin(id: String, init: AWSServiceCatalogDescribeProductAsAdminCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.DescribeProductAsAdminResult {
	return this.block.declare(AWSServiceCatalogDescribeProductAsAdminCommand(id).apply(init)) as com.amazonaws.services.servicecatalog.model.DescribeProductAsAdminResult
}

@Generated
class AWSServiceCatalogDescribeProductAsAdminCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DescribeProductAsAdminRequest, com.amazonaws.services.servicecatalog.model.DescribeProductAsAdminResult> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.DescribeProductAsAdminRequest {
		val input = com.amazonaws.services.servicecatalog.model.DescribeProductAsAdminRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.DescribeProductAsAdminResult {
	  return com.amazonaws.services.servicecatalog.model.DescribeProductAsAdminResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.DescribeProductAsAdminResult {
		return environment.servicecatalog.describeProductAsAdmin(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog describe-product-as-admin")
				.argument("accept-language", acceptLanguage)
				.argument("id", id)
	}

}


fun AWSServiceCatalogFunctions.describeProductView(id: String, init: AWSServiceCatalogDescribeProductViewCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.DescribeProductViewResult {
	return this.block.declare(AWSServiceCatalogDescribeProductViewCommand(id).apply(init)) as com.amazonaws.services.servicecatalog.model.DescribeProductViewResult
}

@Generated
class AWSServiceCatalogDescribeProductViewCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DescribeProductViewRequest, com.amazonaws.services.servicecatalog.model.DescribeProductViewResult> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.DescribeProductViewRequest {
		val input = com.amazonaws.services.servicecatalog.model.DescribeProductViewRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.DescribeProductViewResult {
	  return com.amazonaws.services.servicecatalog.model.DescribeProductViewResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.DescribeProductViewResult {
		return environment.servicecatalog.describeProductView(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog describe-product-view")
				.argument("accept-language", acceptLanguage)
				.argument("id", id)
	}

}


fun AWSServiceCatalogFunctions.describeProvisionedProduct(id: String, init: AWSServiceCatalogDescribeProvisionedProductCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductResult {
	return this.block.declare(AWSServiceCatalogDescribeProvisionedProductCommand(id).apply(init)) as com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductResult
}

@Generated
class AWSServiceCatalogDescribeProvisionedProductCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductRequest, com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductResult> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductRequest {
		val input = com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductResult {
	  return com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductResult {
		return environment.servicecatalog.describeProvisionedProduct(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog describe-provisioned-product")
				.argument("accept-language", acceptLanguage)
				.argument("id", id)
	}

}


fun AWSServiceCatalogFunctions.describeProvisionedProductPlan(planId: String, init: AWSServiceCatalogDescribeProvisionedProductPlanCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductPlanResult {
	return this.block.declare(AWSServiceCatalogDescribeProvisionedProductPlanCommand(planId).apply(init)) as com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductPlanResult
}

@Generated
class AWSServiceCatalogDescribeProvisionedProductPlanCommand(val planId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductPlanRequest, com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductPlanResult> {

	var acceptLanguage: String? = null
	var pageSize: Int? = 0
	var pageToken: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductPlanRequest {
		val input = com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductPlanRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setPlanId(this.planId)
		input.setPageSize(this.pageSize)
		input.setPageToken(this.pageToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductPlanResult {
	  return com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductPlanResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductPlanResult {
		return environment.servicecatalog.describeProvisionedProductPlan(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog describe-provisioned-product-plan")
				.argument("accept-language", acceptLanguage)
				.argument("plan-id", planId)
				.argument("page-size", pageSize?.toString())
				.argument("page-token", pageToken)
	}

}


fun AWSServiceCatalogFunctions.describeProvisioningArtifact(provisioningArtifactId: String, productId: String, init: AWSServiceCatalogDescribeProvisioningArtifactCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.DescribeProvisioningArtifactResult {
	return this.block.declare(AWSServiceCatalogDescribeProvisioningArtifactCommand(provisioningArtifactId, productId).apply(init)) as com.amazonaws.services.servicecatalog.model.DescribeProvisioningArtifactResult
}

@Generated
class AWSServiceCatalogDescribeProvisioningArtifactCommand(val provisioningArtifactId: String, val productId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DescribeProvisioningArtifactRequest, com.amazonaws.services.servicecatalog.model.DescribeProvisioningArtifactResult> {

	var acceptLanguage: String? = null
	var verbose: Boolean? = false

	override fun build(): com.amazonaws.services.servicecatalog.model.DescribeProvisioningArtifactRequest {
		val input = com.amazonaws.services.servicecatalog.model.DescribeProvisioningArtifactRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setProvisioningArtifactId(this.provisioningArtifactId)
		input.setProductId(this.productId)
		input.setVerbose(this.verbose)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.DescribeProvisioningArtifactResult {
	  return com.amazonaws.services.servicecatalog.model.DescribeProvisioningArtifactResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.DescribeProvisioningArtifactResult {
		return environment.servicecatalog.describeProvisioningArtifact(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog describe-provisioning-artifact")
				.argument("accept-language", acceptLanguage)
				.argument("provisioning-artifact-id", provisioningArtifactId)
				.argument("product-id", productId)
				.option("verbose", verbose ?: false)
	}

}


fun AWSServiceCatalogFunctions.describeProvisioningParameters(productId: String, provisioningArtifactId: String, init: AWSServiceCatalogDescribeProvisioningParametersCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.DescribeProvisioningParametersResult {
	return this.block.declare(AWSServiceCatalogDescribeProvisioningParametersCommand(productId, provisioningArtifactId).apply(init)) as com.amazonaws.services.servicecatalog.model.DescribeProvisioningParametersResult
}

@Generated
class AWSServiceCatalogDescribeProvisioningParametersCommand(val productId: String, val provisioningArtifactId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DescribeProvisioningParametersRequest, com.amazonaws.services.servicecatalog.model.DescribeProvisioningParametersResult> {

	var acceptLanguage: String? = null
	var pathId: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.DescribeProvisioningParametersRequest {
		val input = com.amazonaws.services.servicecatalog.model.DescribeProvisioningParametersRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setProductId(this.productId)
		input.setProvisioningArtifactId(this.provisioningArtifactId)
		input.setPathId(this.pathId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.DescribeProvisioningParametersResult {
	  return com.amazonaws.services.servicecatalog.model.DescribeProvisioningParametersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.DescribeProvisioningParametersResult {
		return environment.servicecatalog.describeProvisioningParameters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog describe-provisioning-parameters")
				.argument("accept-language", acceptLanguage)
				.argument("product-id", productId)
				.argument("provisioning-artifact-id", provisioningArtifactId)
				.argument("path-id", pathId)
	}

}


fun AWSServiceCatalogFunctions.describeRecord(id: String, init: AWSServiceCatalogDescribeRecordCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.DescribeRecordResult {
	return this.block.declare(AWSServiceCatalogDescribeRecordCommand(id).apply(init)) as com.amazonaws.services.servicecatalog.model.DescribeRecordResult
}

@Generated
class AWSServiceCatalogDescribeRecordCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DescribeRecordRequest, com.amazonaws.services.servicecatalog.model.DescribeRecordResult> {

	var acceptLanguage: String? = null
	var pageToken: String? = null
	var pageSize: Int? = 0

	override fun build(): com.amazonaws.services.servicecatalog.model.DescribeRecordRequest {
		val input = com.amazonaws.services.servicecatalog.model.DescribeRecordRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setId(this.id)
		input.setPageToken(this.pageToken)
		input.setPageSize(this.pageSize)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.DescribeRecordResult {
	  return com.amazonaws.services.servicecatalog.model.DescribeRecordResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.DescribeRecordResult {
		return environment.servicecatalog.describeRecord(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog describe-record")
				.argument("accept-language", acceptLanguage)
				.argument("id", id)
				.argument("page-token", pageToken)
				.argument("page-size", pageSize?.toString())
	}

}


fun AWSServiceCatalogFunctions.describeTagOption(id: String, init: AWSServiceCatalogDescribeTagOptionCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.DescribeTagOptionResult {
	return this.block.declare(AWSServiceCatalogDescribeTagOptionCommand(id).apply(init)) as com.amazonaws.services.servicecatalog.model.DescribeTagOptionResult
}

@Generated
class AWSServiceCatalogDescribeTagOptionCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DescribeTagOptionRequest, com.amazonaws.services.servicecatalog.model.DescribeTagOptionResult> {



	override fun build(): com.amazonaws.services.servicecatalog.model.DescribeTagOptionRequest {
		val input = com.amazonaws.services.servicecatalog.model.DescribeTagOptionRequest()
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.DescribeTagOptionResult {
	  return com.amazonaws.services.servicecatalog.model.DescribeTagOptionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.DescribeTagOptionResult {
		return environment.servicecatalog.describeTagOption(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog describe-tag-option")
				.argument("id", id)
	}

}


fun AWSServiceCatalogFunctions.disassociatePrincipalFromPortfolio(portfolioId: String, principalARN: String, init: AWSServiceCatalogDisassociatePrincipalFromPortfolioCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.DisassociatePrincipalFromPortfolioResult {
	return this.block.declare(AWSServiceCatalogDisassociatePrincipalFromPortfolioCommand(portfolioId, principalARN).apply(init)) as com.amazonaws.services.servicecatalog.model.DisassociatePrincipalFromPortfolioResult
}

@Generated
class AWSServiceCatalogDisassociatePrincipalFromPortfolioCommand(val portfolioId: String, val principalARN: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DisassociatePrincipalFromPortfolioRequest, com.amazonaws.services.servicecatalog.model.DisassociatePrincipalFromPortfolioResult> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.DisassociatePrincipalFromPortfolioRequest {
		val input = com.amazonaws.services.servicecatalog.model.DisassociatePrincipalFromPortfolioRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setPortfolioId(this.portfolioId)
		input.setPrincipalARN(this.principalARN)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.DisassociatePrincipalFromPortfolioResult {
	  return com.amazonaws.services.servicecatalog.model.DisassociatePrincipalFromPortfolioResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.DisassociatePrincipalFromPortfolioResult {
		return environment.servicecatalog.disassociatePrincipalFromPortfolio(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog disassociate-principal-from-portfolio")
				.argument("accept-language", acceptLanguage)
				.argument("portfolio-id", portfolioId)
				.argument("principal-arn", principalARN)
	}

}


fun AWSServiceCatalogFunctions.disassociateProductFromPortfolio(productId: String, portfolioId: String, init: AWSServiceCatalogDisassociateProductFromPortfolioCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.DisassociateProductFromPortfolioResult {
	return this.block.declare(AWSServiceCatalogDisassociateProductFromPortfolioCommand(productId, portfolioId).apply(init)) as com.amazonaws.services.servicecatalog.model.DisassociateProductFromPortfolioResult
}

@Generated
class AWSServiceCatalogDisassociateProductFromPortfolioCommand(val productId: String, val portfolioId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DisassociateProductFromPortfolioRequest, com.amazonaws.services.servicecatalog.model.DisassociateProductFromPortfolioResult> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.DisassociateProductFromPortfolioRequest {
		val input = com.amazonaws.services.servicecatalog.model.DisassociateProductFromPortfolioRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setProductId(this.productId)
		input.setPortfolioId(this.portfolioId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.DisassociateProductFromPortfolioResult {
	  return com.amazonaws.services.servicecatalog.model.DisassociateProductFromPortfolioResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.DisassociateProductFromPortfolioResult {
		return environment.servicecatalog.disassociateProductFromPortfolio(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog disassociate-product-from-portfolio")
				.argument("accept-language", acceptLanguage)
				.argument("product-id", productId)
				.argument("portfolio-id", portfolioId)
	}

}


fun AWSServiceCatalogFunctions.disassociateTagOptionFromResource(resourceId: String, tagOptionId: String, init: AWSServiceCatalogDisassociateTagOptionFromResourceCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.DisassociateTagOptionFromResourceResult {
	return this.block.declare(AWSServiceCatalogDisassociateTagOptionFromResourceCommand(resourceId, tagOptionId).apply(init)) as com.amazonaws.services.servicecatalog.model.DisassociateTagOptionFromResourceResult
}

@Generated
class AWSServiceCatalogDisassociateTagOptionFromResourceCommand(val resourceId: String, val tagOptionId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DisassociateTagOptionFromResourceRequest, com.amazonaws.services.servicecatalog.model.DisassociateTagOptionFromResourceResult> {



	override fun build(): com.amazonaws.services.servicecatalog.model.DisassociateTagOptionFromResourceRequest {
		val input = com.amazonaws.services.servicecatalog.model.DisassociateTagOptionFromResourceRequest()
		input.setResourceId(this.resourceId)
		input.setTagOptionId(this.tagOptionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.DisassociateTagOptionFromResourceResult {
	  return com.amazonaws.services.servicecatalog.model.DisassociateTagOptionFromResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.DisassociateTagOptionFromResourceResult {
		return environment.servicecatalog.disassociateTagOptionFromResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog disassociate-tag-option-from-resource")
				.argument("resource-id", resourceId)
				.argument("tag-option-id", tagOptionId)
	}

}


fun AWSServiceCatalogFunctions.executeProvisionedProductPlan(planId: String, idempotencyToken: String, init: AWSServiceCatalogExecuteProvisionedProductPlanCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductPlanResult {
	return this.block.declare(AWSServiceCatalogExecuteProvisionedProductPlanCommand(planId, idempotencyToken).apply(init)) as com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductPlanResult
}

@Generated
class AWSServiceCatalogExecuteProvisionedProductPlanCommand(val planId: String, val idempotencyToken: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductPlanRequest, com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductPlanResult> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductPlanRequest {
		val input = com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductPlanRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setPlanId(this.planId)
		input.setIdempotencyToken(this.idempotencyToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductPlanResult {
	  return com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductPlanResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductPlanResult {
		return environment.servicecatalog.executeProvisionedProductPlan(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog execute-provisioned-product-plan")
				.argument("accept-language", acceptLanguage)
				.argument("plan-id", planId)
				.argument("idempotency-token", idempotencyToken)
	}

}


fun AWSServiceCatalogFunctions.listAcceptedPortfolioShares(init: AWSServiceCatalogListAcceptedPortfolioSharesCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.ListAcceptedPortfolioSharesResult {
	return this.block.declare(AWSServiceCatalogListAcceptedPortfolioSharesCommand().apply(init)) as com.amazonaws.services.servicecatalog.model.ListAcceptedPortfolioSharesResult
}

@Generated
class AWSServiceCatalogListAcceptedPortfolioSharesCommand() : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.ListAcceptedPortfolioSharesRequest, com.amazonaws.services.servicecatalog.model.ListAcceptedPortfolioSharesResult> {

	var acceptLanguage: String? = null
	var pageToken: String? = null
	var pageSize: Int? = 0

	override fun build(): com.amazonaws.services.servicecatalog.model.ListAcceptedPortfolioSharesRequest {
		val input = com.amazonaws.services.servicecatalog.model.ListAcceptedPortfolioSharesRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setPageToken(this.pageToken)
		input.setPageSize(this.pageSize)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.ListAcceptedPortfolioSharesResult {
	  return com.amazonaws.services.servicecatalog.model.ListAcceptedPortfolioSharesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.ListAcceptedPortfolioSharesResult {
		return environment.servicecatalog.listAcceptedPortfolioShares(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog list-accepted-portfolio-shares")
				.argument("accept-language", acceptLanguage)
				.argument("page-token", pageToken)
				.argument("page-size", pageSize?.toString())
	}

}


fun AWSServiceCatalogFunctions.listConstraintsForPortfolio(portfolioId: String, init: AWSServiceCatalogListConstraintsForPortfolioCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.ListConstraintsForPortfolioResult {
	return this.block.declare(AWSServiceCatalogListConstraintsForPortfolioCommand(portfolioId).apply(init)) as com.amazonaws.services.servicecatalog.model.ListConstraintsForPortfolioResult
}

@Generated
class AWSServiceCatalogListConstraintsForPortfolioCommand(val portfolioId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.ListConstraintsForPortfolioRequest, com.amazonaws.services.servicecatalog.model.ListConstraintsForPortfolioResult> {

	var acceptLanguage: String? = null
	var productId: String? = null
	var pageSize: Int? = 0
	var pageToken: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.ListConstraintsForPortfolioRequest {
		val input = com.amazonaws.services.servicecatalog.model.ListConstraintsForPortfolioRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setPortfolioId(this.portfolioId)
		input.setProductId(this.productId)
		input.setPageSize(this.pageSize)
		input.setPageToken(this.pageToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.ListConstraintsForPortfolioResult {
	  return com.amazonaws.services.servicecatalog.model.ListConstraintsForPortfolioResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.ListConstraintsForPortfolioResult {
		return environment.servicecatalog.listConstraintsForPortfolio(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog list-constraints-for-portfolio")
				.argument("accept-language", acceptLanguage)
				.argument("portfolio-id", portfolioId)
				.argument("product-id", productId)
				.argument("page-size", pageSize?.toString())
				.argument("page-token", pageToken)
	}

}


fun AWSServiceCatalogFunctions.listLaunchPaths(productId: String, init: AWSServiceCatalogListLaunchPathsCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.ListLaunchPathsResult {
	return this.block.declare(AWSServiceCatalogListLaunchPathsCommand(productId).apply(init)) as com.amazonaws.services.servicecatalog.model.ListLaunchPathsResult
}

@Generated
class AWSServiceCatalogListLaunchPathsCommand(val productId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.ListLaunchPathsRequest, com.amazonaws.services.servicecatalog.model.ListLaunchPathsResult> {

	var acceptLanguage: String? = null
	var pageSize: Int? = 0
	var pageToken: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.ListLaunchPathsRequest {
		val input = com.amazonaws.services.servicecatalog.model.ListLaunchPathsRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setProductId(this.productId)
		input.setPageSize(this.pageSize)
		input.setPageToken(this.pageToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.ListLaunchPathsResult {
	  return com.amazonaws.services.servicecatalog.model.ListLaunchPathsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.ListLaunchPathsResult {
		return environment.servicecatalog.listLaunchPaths(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog list-launch-paths")
				.argument("accept-language", acceptLanguage)
				.argument("product-id", productId)
				.argument("page-size", pageSize?.toString())
				.argument("page-token", pageToken)
	}

}


fun AWSServiceCatalogFunctions.listPortfolioAccess(portfolioId: String, init: AWSServiceCatalogListPortfolioAccessCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.ListPortfolioAccessResult {
	return this.block.declare(AWSServiceCatalogListPortfolioAccessCommand(portfolioId).apply(init)) as com.amazonaws.services.servicecatalog.model.ListPortfolioAccessResult
}

@Generated
class AWSServiceCatalogListPortfolioAccessCommand(val portfolioId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.ListPortfolioAccessRequest, com.amazonaws.services.servicecatalog.model.ListPortfolioAccessResult> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.ListPortfolioAccessRequest {
		val input = com.amazonaws.services.servicecatalog.model.ListPortfolioAccessRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setPortfolioId(this.portfolioId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.ListPortfolioAccessResult {
	  return com.amazonaws.services.servicecatalog.model.ListPortfolioAccessResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.ListPortfolioAccessResult {
		return environment.servicecatalog.listPortfolioAccess(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog list-portfolio-access")
				.argument("accept-language", acceptLanguage)
				.argument("portfolio-id", portfolioId)
	}

}


fun AWSServiceCatalogFunctions.listPortfolios(init: AWSServiceCatalogListPortfoliosCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.ListPortfoliosResult {
	return this.block.declare(AWSServiceCatalogListPortfoliosCommand().apply(init)) as com.amazonaws.services.servicecatalog.model.ListPortfoliosResult
}

@Generated
class AWSServiceCatalogListPortfoliosCommand() : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.ListPortfoliosRequest, com.amazonaws.services.servicecatalog.model.ListPortfoliosResult> {

	var acceptLanguage: String? = null
	var pageToken: String? = null
	var pageSize: Int? = 0

	override fun build(): com.amazonaws.services.servicecatalog.model.ListPortfoliosRequest {
		val input = com.amazonaws.services.servicecatalog.model.ListPortfoliosRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setPageToken(this.pageToken)
		input.setPageSize(this.pageSize)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.ListPortfoliosResult {
	  return com.amazonaws.services.servicecatalog.model.ListPortfoliosResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.ListPortfoliosResult {
		return environment.servicecatalog.listPortfolios(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog list-portfolios")
				.argument("accept-language", acceptLanguage)
				.argument("page-token", pageToken)
				.argument("page-size", pageSize?.toString())
	}

}


fun AWSServiceCatalogFunctions.listPortfoliosForProduct(productId: String, init: AWSServiceCatalogListPortfoliosForProductCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.ListPortfoliosForProductResult {
	return this.block.declare(AWSServiceCatalogListPortfoliosForProductCommand(productId).apply(init)) as com.amazonaws.services.servicecatalog.model.ListPortfoliosForProductResult
}

@Generated
class AWSServiceCatalogListPortfoliosForProductCommand(val productId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.ListPortfoliosForProductRequest, com.amazonaws.services.servicecatalog.model.ListPortfoliosForProductResult> {

	var acceptLanguage: String? = null
	var pageToken: String? = null
	var pageSize: Int? = 0

	override fun build(): com.amazonaws.services.servicecatalog.model.ListPortfoliosForProductRequest {
		val input = com.amazonaws.services.servicecatalog.model.ListPortfoliosForProductRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setProductId(this.productId)
		input.setPageToken(this.pageToken)
		input.setPageSize(this.pageSize)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.ListPortfoliosForProductResult {
	  return com.amazonaws.services.servicecatalog.model.ListPortfoliosForProductResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.ListPortfoliosForProductResult {
		return environment.servicecatalog.listPortfoliosForProduct(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog list-portfolios-for-product")
				.argument("accept-language", acceptLanguage)
				.argument("product-id", productId)
				.argument("page-token", pageToken)
				.argument("page-size", pageSize?.toString())
	}

}


fun AWSServiceCatalogFunctions.listPrincipalsForPortfolio(portfolioId: String, init: AWSServiceCatalogListPrincipalsForPortfolioCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.ListPrincipalsForPortfolioResult {
	return this.block.declare(AWSServiceCatalogListPrincipalsForPortfolioCommand(portfolioId).apply(init)) as com.amazonaws.services.servicecatalog.model.ListPrincipalsForPortfolioResult
}

@Generated
class AWSServiceCatalogListPrincipalsForPortfolioCommand(val portfolioId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.ListPrincipalsForPortfolioRequest, com.amazonaws.services.servicecatalog.model.ListPrincipalsForPortfolioResult> {

	var acceptLanguage: String? = null
	var pageSize: Int? = 0
	var pageToken: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.ListPrincipalsForPortfolioRequest {
		val input = com.amazonaws.services.servicecatalog.model.ListPrincipalsForPortfolioRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setPortfolioId(this.portfolioId)
		input.setPageSize(this.pageSize)
		input.setPageToken(this.pageToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.ListPrincipalsForPortfolioResult {
	  return com.amazonaws.services.servicecatalog.model.ListPrincipalsForPortfolioResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.ListPrincipalsForPortfolioResult {
		return environment.servicecatalog.listPrincipalsForPortfolio(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog list-principals-for-portfolio")
				.argument("accept-language", acceptLanguage)
				.argument("portfolio-id", portfolioId)
				.argument("page-size", pageSize?.toString())
				.argument("page-token", pageToken)
	}

}


fun AWSServiceCatalogFunctions.listProvisionedProductPlans(init: AWSServiceCatalogListProvisionedProductPlansCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.ListProvisionedProductPlansResult {
	return this.block.declare(AWSServiceCatalogListProvisionedProductPlansCommand().apply(init)) as com.amazonaws.services.servicecatalog.model.ListProvisionedProductPlansResult
}

@Generated
class AWSServiceCatalogListProvisionedProductPlansCommand() : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.ListProvisionedProductPlansRequest, com.amazonaws.services.servicecatalog.model.ListProvisionedProductPlansResult> {

	var acceptLanguage: String? = null
	var provisionProductId: String? = null
	var pageSize: Int? = 0
	var pageToken: String? = null
	var accessLevelFilter: com.amazonaws.services.servicecatalog.model.AccessLevelFilter? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.ListProvisionedProductPlansRequest {
		val input = com.amazonaws.services.servicecatalog.model.ListProvisionedProductPlansRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setProvisionProductId(this.provisionProductId)
		input.setPageSize(this.pageSize)
		input.setPageToken(this.pageToken)
		input.setAccessLevelFilter(this.accessLevelFilter)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.ListProvisionedProductPlansResult {
	  return com.amazonaws.services.servicecatalog.model.ListProvisionedProductPlansResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.ListProvisionedProductPlansResult {
		return environment.servicecatalog.listProvisionedProductPlans(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog list-provisioned-product-plans")
				.argument("accept-language", acceptLanguage)
				.argument("provision-product-id", provisionProductId)
				.argument("page-size", pageSize?.toString())
				.argument("page-token", pageToken)
				.argument("access-level-filter", accessLevelFilter?.toString())
	}

}


fun AWSServiceCatalogFunctions.listProvisioningArtifacts(productId: String, init: AWSServiceCatalogListProvisioningArtifactsCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsResult {
	return this.block.declare(AWSServiceCatalogListProvisioningArtifactsCommand(productId).apply(init)) as com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsResult
}

@Generated
class AWSServiceCatalogListProvisioningArtifactsCommand(val productId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsRequest, com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsResult> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsRequest {
		val input = com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setProductId(this.productId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsResult {
	  return com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsResult {
		return environment.servicecatalog.listProvisioningArtifacts(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog list-provisioning-artifacts")
				.argument("accept-language", acceptLanguage)
				.argument("product-id", productId)
	}

}


fun AWSServiceCatalogFunctions.listRecordHistory(init: AWSServiceCatalogListRecordHistoryCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.ListRecordHistoryResult {
	return this.block.declare(AWSServiceCatalogListRecordHistoryCommand().apply(init)) as com.amazonaws.services.servicecatalog.model.ListRecordHistoryResult
}

@Generated
class AWSServiceCatalogListRecordHistoryCommand() : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.ListRecordHistoryRequest, com.amazonaws.services.servicecatalog.model.ListRecordHistoryResult> {

	var acceptLanguage: String? = null
	var accessLevelFilter: com.amazonaws.services.servicecatalog.model.AccessLevelFilter? = null
	var searchFilter: com.amazonaws.services.servicecatalog.model.ListRecordHistorySearchFilter? = null
	var pageSize: Int? = 0
	var pageToken: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.ListRecordHistoryRequest {
		val input = com.amazonaws.services.servicecatalog.model.ListRecordHistoryRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setAccessLevelFilter(this.accessLevelFilter)
		input.setSearchFilter(this.searchFilter)
		input.setPageSize(this.pageSize)
		input.setPageToken(this.pageToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.ListRecordHistoryResult {
	  return com.amazonaws.services.servicecatalog.model.ListRecordHistoryResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.ListRecordHistoryResult {
		return environment.servicecatalog.listRecordHistory(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog list-record-history")
				.argument("accept-language", acceptLanguage)
				.argument("access-level-filter", accessLevelFilter?.toString())
				.argument("search-filter", searchFilter?.toString())
				.argument("page-size", pageSize?.toString())
				.argument("page-token", pageToken)
	}

}


fun AWSServiceCatalogFunctions.listResourcesForTagOption(tagOptionId: String, init: AWSServiceCatalogListResourcesForTagOptionCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.ListResourcesForTagOptionResult {
	return this.block.declare(AWSServiceCatalogListResourcesForTagOptionCommand(tagOptionId).apply(init)) as com.amazonaws.services.servicecatalog.model.ListResourcesForTagOptionResult
}

@Generated
class AWSServiceCatalogListResourcesForTagOptionCommand(val tagOptionId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.ListResourcesForTagOptionRequest, com.amazonaws.services.servicecatalog.model.ListResourcesForTagOptionResult> {

	var resourceType: String? = null
	var pageSize: Int? = 0
	var pageToken: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.ListResourcesForTagOptionRequest {
		val input = com.amazonaws.services.servicecatalog.model.ListResourcesForTagOptionRequest()
		input.setTagOptionId(this.tagOptionId)
		input.setResourceType(this.resourceType)
		input.setPageSize(this.pageSize)
		input.setPageToken(this.pageToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.ListResourcesForTagOptionResult {
	  return com.amazonaws.services.servicecatalog.model.ListResourcesForTagOptionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.ListResourcesForTagOptionResult {
		return environment.servicecatalog.listResourcesForTagOption(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog list-resources-for-tag-option")
				.argument("tag-option-id", tagOptionId)
				.argument("resource-type", resourceType)
				.argument("page-size", pageSize?.toString())
				.argument("page-token", pageToken)
	}

}


fun AWSServiceCatalogFunctions.listTagOptions(init: AWSServiceCatalogListTagOptionsCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.ListTagOptionsResult {
	return this.block.declare(AWSServiceCatalogListTagOptionsCommand().apply(init)) as com.amazonaws.services.servicecatalog.model.ListTagOptionsResult
}

@Generated
class AWSServiceCatalogListTagOptionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.ListTagOptionsRequest, com.amazonaws.services.servicecatalog.model.ListTagOptionsResult> {

	var filters: com.amazonaws.services.servicecatalog.model.ListTagOptionsFilters? = null
	var pageSize: Int? = 0
	var pageToken: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.ListTagOptionsRequest {
		val input = com.amazonaws.services.servicecatalog.model.ListTagOptionsRequest()
		input.setFilters(this.filters)
		input.setPageSize(this.pageSize)
		input.setPageToken(this.pageToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.ListTagOptionsResult {
	  return com.amazonaws.services.servicecatalog.model.ListTagOptionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.ListTagOptionsResult {
		return environment.servicecatalog.listTagOptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog list-tag-options")
				.argument("filters", filters?.toString())
				.argument("page-size", pageSize?.toString())
				.argument("page-token", pageToken)
	}

}


fun AWSServiceCatalogFunctions.provisionProduct(productId: String, provisioningArtifactId: String, provisionedProductName: String, provisionToken: String, init: AWSServiceCatalogProvisionProductCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.ProvisionProductResult {
	return this.block.declare(AWSServiceCatalogProvisionProductCommand(productId, provisioningArtifactId, provisionedProductName, provisionToken).apply(init)) as com.amazonaws.services.servicecatalog.model.ProvisionProductResult
}

@Generated
class AWSServiceCatalogProvisionProductCommand(val productId: String, val provisioningArtifactId: String, val provisionedProductName: String, val provisionToken: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.ProvisionProductRequest, com.amazonaws.services.servicecatalog.model.ProvisionProductResult> {

	var acceptLanguage: String? = null
	var pathId: String? = null
	var provisioningParameters: List<com.amazonaws.services.servicecatalog.model.ProvisioningParameter>? = null
	var tags: List<com.amazonaws.services.servicecatalog.model.Tag>? = null
	var notificationArns: List<String>? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.ProvisionProductRequest {
		val input = com.amazonaws.services.servicecatalog.model.ProvisionProductRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setProductId(this.productId)
		input.setProvisioningArtifactId(this.provisioningArtifactId)
		input.setPathId(this.pathId)
		input.setProvisionedProductName(this.provisionedProductName)
		input.setProvisioningParameters(this.provisioningParameters)
		input.setTags(this.tags)
		input.setNotificationArns(this.notificationArns)
		input.setProvisionToken(this.provisionToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.ProvisionProductResult {
	  return com.amazonaws.services.servicecatalog.model.ProvisionProductResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.ProvisionProductResult {
		return environment.servicecatalog.provisionProduct(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog provision-product")
				.argument("accept-language", acceptLanguage)
				.argument("product-id", productId)
				.argument("provisioning-artifact-id", provisioningArtifactId)
				.argument("path-id", pathId)
				.argument("provisioned-product-name", provisionedProductName)
				.argument("provisioning-parameters", provisioningParameters?.toString())
				.argument("tags", tags?.toString())
				.argument("notification-arns", notificationArns?.toString())
				.argument("provision-token", provisionToken)
	}

}


fun AWSServiceCatalogFunctions.rejectPortfolioShare(portfolioId: String, init: AWSServiceCatalogRejectPortfolioShareCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.RejectPortfolioShareResult {
	return this.block.declare(AWSServiceCatalogRejectPortfolioShareCommand(portfolioId).apply(init)) as com.amazonaws.services.servicecatalog.model.RejectPortfolioShareResult
}

@Generated
class AWSServiceCatalogRejectPortfolioShareCommand(val portfolioId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.RejectPortfolioShareRequest, com.amazonaws.services.servicecatalog.model.RejectPortfolioShareResult> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.RejectPortfolioShareRequest {
		val input = com.amazonaws.services.servicecatalog.model.RejectPortfolioShareRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setPortfolioId(this.portfolioId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.RejectPortfolioShareResult {
	  return com.amazonaws.services.servicecatalog.model.RejectPortfolioShareResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.RejectPortfolioShareResult {
		return environment.servicecatalog.rejectPortfolioShare(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog reject-portfolio-share")
				.argument("accept-language", acceptLanguage)
				.argument("portfolio-id", portfolioId)
	}

}


fun AWSServiceCatalogFunctions.scanProvisionedProducts(init: AWSServiceCatalogScanProvisionedProductsCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.ScanProvisionedProductsResult {
	return this.block.declare(AWSServiceCatalogScanProvisionedProductsCommand().apply(init)) as com.amazonaws.services.servicecatalog.model.ScanProvisionedProductsResult
}

@Generated
class AWSServiceCatalogScanProvisionedProductsCommand() : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.ScanProvisionedProductsRequest, com.amazonaws.services.servicecatalog.model.ScanProvisionedProductsResult> {

	var acceptLanguage: String? = null
	var accessLevelFilter: com.amazonaws.services.servicecatalog.model.AccessLevelFilter? = null
	var pageSize: Int? = 0
	var pageToken: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.ScanProvisionedProductsRequest {
		val input = com.amazonaws.services.servicecatalog.model.ScanProvisionedProductsRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setAccessLevelFilter(this.accessLevelFilter)
		input.setPageSize(this.pageSize)
		input.setPageToken(this.pageToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.ScanProvisionedProductsResult {
	  return com.amazonaws.services.servicecatalog.model.ScanProvisionedProductsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.ScanProvisionedProductsResult {
		return environment.servicecatalog.scanProvisionedProducts(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog scan-provisioned-products")
				.argument("accept-language", acceptLanguage)
				.argument("access-level-filter", accessLevelFilter?.toString())
				.argument("page-size", pageSize?.toString())
				.argument("page-token", pageToken)
	}

}


fun AWSServiceCatalogFunctions.searchProducts(init: AWSServiceCatalogSearchProductsCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.SearchProductsResult {
	return this.block.declare(AWSServiceCatalogSearchProductsCommand().apply(init)) as com.amazonaws.services.servicecatalog.model.SearchProductsResult
}

@Generated
class AWSServiceCatalogSearchProductsCommand() : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.SearchProductsRequest, com.amazonaws.services.servicecatalog.model.SearchProductsResult> {

	var acceptLanguage: String? = null
	var filters: Map<ProductViewFilterBy, List<String>>? = null
	var pageSize: Int? = 0
	var sortBy: ProductViewSortBy? = null
	var sortOrder: SortOrder? = null
	var pageToken: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.SearchProductsRequest {
		val input = com.amazonaws.services.servicecatalog.model.SearchProductsRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setFilters(this.filters?.mapKeys { it.toString() })
		input.setPageSize(this.pageSize)
		input.setSortBy(this.sortBy?.toString())
		input.setSortOrder(this.sortOrder?.toString())
		input.setPageToken(this.pageToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.SearchProductsResult {
	  return com.amazonaws.services.servicecatalog.model.SearchProductsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.SearchProductsResult {
		return environment.servicecatalog.searchProducts(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog search-products")
				.argument("accept-language", acceptLanguage)
				.argument("filters", filters?.toString())
				.argument("page-size", pageSize?.toString())
				.argument("sort-by", sortBy?.toString())
				.argument("sort-order", sortOrder?.toString())
				.argument("page-token", pageToken)
	}

}


fun AWSServiceCatalogFunctions.searchProductsAsAdmin(init: AWSServiceCatalogSearchProductsAsAdminCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.SearchProductsAsAdminResult {
	return this.block.declare(AWSServiceCatalogSearchProductsAsAdminCommand().apply(init)) as com.amazonaws.services.servicecatalog.model.SearchProductsAsAdminResult
}

@Generated
class AWSServiceCatalogSearchProductsAsAdminCommand() : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.SearchProductsAsAdminRequest, com.amazonaws.services.servicecatalog.model.SearchProductsAsAdminResult> {

	var acceptLanguage: String? = null
	var portfolioId: String? = null
	var filters: Map<ProductViewFilterBy, List<String>>? = null
	var sortBy: ProductViewSortBy? = null
	var sortOrder: SortOrder? = null
	var pageToken: String? = null
	var pageSize: Int? = 0
	var productSource: ProductSource? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.SearchProductsAsAdminRequest {
		val input = com.amazonaws.services.servicecatalog.model.SearchProductsAsAdminRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setPortfolioId(this.portfolioId)
		input.setFilters(this.filters?.mapKeys { it.toString() })
		input.setSortBy(this.sortBy?.toString())
		input.setSortOrder(this.sortOrder?.toString())
		input.setPageToken(this.pageToken)
		input.setPageSize(this.pageSize)
		input.setProductSource(this.productSource?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.SearchProductsAsAdminResult {
	  return com.amazonaws.services.servicecatalog.model.SearchProductsAsAdminResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.SearchProductsAsAdminResult {
		return environment.servicecatalog.searchProductsAsAdmin(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog search-products-as-admin")
				.argument("accept-language", acceptLanguage)
				.argument("portfolio-id", portfolioId)
				.argument("filters", filters?.toString())
				.argument("sort-by", sortBy?.toString())
				.argument("sort-order", sortOrder?.toString())
				.argument("page-token", pageToken)
				.argument("page-size", pageSize?.toString())
				.argument("product-source", productSource?.toString())
	}

}


fun AWSServiceCatalogFunctions.searchProvisionedProducts(init: AWSServiceCatalogSearchProvisionedProductsCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.SearchProvisionedProductsResult {
	return this.block.declare(AWSServiceCatalogSearchProvisionedProductsCommand().apply(init)) as com.amazonaws.services.servicecatalog.model.SearchProvisionedProductsResult
}

@Generated
class AWSServiceCatalogSearchProvisionedProductsCommand() : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.SearchProvisionedProductsRequest, com.amazonaws.services.servicecatalog.model.SearchProvisionedProductsResult> {

	var acceptLanguage: String? = null
	var accessLevelFilter: com.amazonaws.services.servicecatalog.model.AccessLevelFilter? = null
	var filters: Map<ProvisionedProductViewFilterBy, List<String>>? = null
	var sortBy: String? = null
	var sortOrder: SortOrder? = null
	var pageSize: Int? = 0
	var pageToken: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.SearchProvisionedProductsRequest {
		val input = com.amazonaws.services.servicecatalog.model.SearchProvisionedProductsRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setAccessLevelFilter(this.accessLevelFilter)
		input.setFilters(this.filters?.mapKeys { it.toString() })
		input.setSortBy(this.sortBy)
		input.setSortOrder(this.sortOrder?.toString())
		input.setPageSize(this.pageSize)
		input.setPageToken(this.pageToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.SearchProvisionedProductsResult {
	  return com.amazonaws.services.servicecatalog.model.SearchProvisionedProductsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.SearchProvisionedProductsResult {
		return environment.servicecatalog.searchProvisionedProducts(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog search-provisioned-products")
				.argument("accept-language", acceptLanguage)
				.argument("access-level-filter", accessLevelFilter?.toString())
				.argument("filters", filters?.toString())
				.argument("sort-by", sortBy)
				.argument("sort-order", sortOrder?.toString())
				.argument("page-size", pageSize?.toString())
				.argument("page-token", pageToken)
	}

}


fun AWSServiceCatalogFunctions.terminateProvisionedProduct(terminateToken: String, init: AWSServiceCatalogTerminateProvisionedProductCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.TerminateProvisionedProductResult {
	return this.block.declare(AWSServiceCatalogTerminateProvisionedProductCommand(terminateToken).apply(init)) as com.amazonaws.services.servicecatalog.model.TerminateProvisionedProductResult
}

@Generated
class AWSServiceCatalogTerminateProvisionedProductCommand(val terminateToken: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.TerminateProvisionedProductRequest, com.amazonaws.services.servicecatalog.model.TerminateProvisionedProductResult> {

	var provisionedProductName: String? = null
	var provisionedProductId: String? = null
	var ignoreErrors: Boolean? = false
	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.TerminateProvisionedProductRequest {
		val input = com.amazonaws.services.servicecatalog.model.TerminateProvisionedProductRequest()
		input.setProvisionedProductName(this.provisionedProductName)
		input.setProvisionedProductId(this.provisionedProductId)
		input.setTerminateToken(this.terminateToken)
		input.setIgnoreErrors(this.ignoreErrors)
		input.setAcceptLanguage(this.acceptLanguage)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.TerminateProvisionedProductResult {
	  return com.amazonaws.services.servicecatalog.model.TerminateProvisionedProductResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.TerminateProvisionedProductResult {
		return environment.servicecatalog.terminateProvisionedProduct(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog terminate-provisioned-product")
				.argument("provisioned-product-name", provisionedProductName)
				.argument("provisioned-product-id", provisionedProductId)
				.argument("terminate-token", terminateToken)
				.option("ignore-errors", ignoreErrors ?: false)
				.argument("accept-language", acceptLanguage)
	}

}


fun AWSServiceCatalogFunctions.updateConstraint(id: String, init: AWSServiceCatalogUpdateConstraintCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.UpdateConstraintResult {
	return this.block.declare(AWSServiceCatalogUpdateConstraintCommand(id).apply(init)) as com.amazonaws.services.servicecatalog.model.UpdateConstraintResult
}

@Generated
class AWSServiceCatalogUpdateConstraintCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.UpdateConstraintRequest, com.amazonaws.services.servicecatalog.model.UpdateConstraintResult> {

	var acceptLanguage: String? = null
	var description: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.UpdateConstraintRequest {
		val input = com.amazonaws.services.servicecatalog.model.UpdateConstraintRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setId(this.id)
		input.setDescription(this.description)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.UpdateConstraintResult {
	  return com.amazonaws.services.servicecatalog.model.UpdateConstraintResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.UpdateConstraintResult {
		return environment.servicecatalog.updateConstraint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog update-constraint")
				.argument("accept-language", acceptLanguage)
				.argument("id", id)
				.argument("description", description)
	}

}


fun AWSServiceCatalogFunctions.updatePortfolio(id: String, init: AWSServiceCatalogUpdatePortfolioCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.UpdatePortfolioResult {
	return this.block.declare(AWSServiceCatalogUpdatePortfolioCommand(id).apply(init)) as com.amazonaws.services.servicecatalog.model.UpdatePortfolioResult
}

@Generated
class AWSServiceCatalogUpdatePortfolioCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.UpdatePortfolioRequest, com.amazonaws.services.servicecatalog.model.UpdatePortfolioResult> {

	var acceptLanguage: String? = null
	var displayName: String? = null
	var description: String? = null
	var providerName: String? = null
	var addTags: List<com.amazonaws.services.servicecatalog.model.Tag>? = null
	var removeTags: List<String>? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.UpdatePortfolioRequest {
		val input = com.amazonaws.services.servicecatalog.model.UpdatePortfolioRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setId(this.id)
		input.setDisplayName(this.displayName)
		input.setDescription(this.description)
		input.setProviderName(this.providerName)
		input.setAddTags(this.addTags)
		input.setRemoveTags(this.removeTags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.UpdatePortfolioResult {
	  return com.amazonaws.services.servicecatalog.model.UpdatePortfolioResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.UpdatePortfolioResult {
		return environment.servicecatalog.updatePortfolio(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog update-portfolio")
				.argument("accept-language", acceptLanguage)
				.argument("id", id)
				.argument("display-name", displayName)
				.argument("description", description)
				.argument("provider-name", providerName)
				.argument("add-tags", addTags?.toString())
				.argument("remove-tags", removeTags?.toString())
	}

}


fun AWSServiceCatalogFunctions.updateProduct(id: String, init: AWSServiceCatalogUpdateProductCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.UpdateProductResult {
	return this.block.declare(AWSServiceCatalogUpdateProductCommand(id).apply(init)) as com.amazonaws.services.servicecatalog.model.UpdateProductResult
}

@Generated
class AWSServiceCatalogUpdateProductCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.UpdateProductRequest, com.amazonaws.services.servicecatalog.model.UpdateProductResult> {

	var acceptLanguage: String? = null
	var name: String? = null
	var owner: String? = null
	var description: String? = null
	var distributor: String? = null
	var supportDescription: String? = null
	var supportEmail: String? = null
	var supportUrl: String? = null
	var addTags: List<com.amazonaws.services.servicecatalog.model.Tag>? = null
	var removeTags: List<String>? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.UpdateProductRequest {
		val input = com.amazonaws.services.servicecatalog.model.UpdateProductRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setId(this.id)
		input.setName(this.name)
		input.setOwner(this.owner)
		input.setDescription(this.description)
		input.setDistributor(this.distributor)
		input.setSupportDescription(this.supportDescription)
		input.setSupportEmail(this.supportEmail)
		input.setSupportUrl(this.supportUrl)
		input.setAddTags(this.addTags)
		input.setRemoveTags(this.removeTags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.UpdateProductResult {
	  return com.amazonaws.services.servicecatalog.model.UpdateProductResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.UpdateProductResult {
		return environment.servicecatalog.updateProduct(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog update-product")
				.argument("accept-language", acceptLanguage)
				.argument("id", id)
				.argument("name", name)
				.argument("owner", owner)
				.argument("description", description)
				.argument("distributor", distributor)
				.argument("support-description", supportDescription)
				.argument("support-email", supportEmail)
				.argument("support-url", supportUrl)
				.argument("add-tags", addTags?.toString())
				.argument("remove-tags", removeTags?.toString())
	}

}


fun AWSServiceCatalogFunctions.updateProvisionedProduct(updateToken: String, init: AWSServiceCatalogUpdateProvisionedProductCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductResult {
	return this.block.declare(AWSServiceCatalogUpdateProvisionedProductCommand(updateToken).apply(init)) as com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductResult
}

@Generated
class AWSServiceCatalogUpdateProvisionedProductCommand(val updateToken: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductRequest, com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductResult> {

	var acceptLanguage: String? = null
	var provisionedProductName: String? = null
	var provisionedProductId: String? = null
	var productId: String? = null
	var provisioningArtifactId: String? = null
	var pathId: String? = null
	var provisioningParameters: List<com.amazonaws.services.servicecatalog.model.UpdateProvisioningParameter>? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductRequest {
		val input = com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setProvisionedProductName(this.provisionedProductName)
		input.setProvisionedProductId(this.provisionedProductId)
		input.setProductId(this.productId)
		input.setProvisioningArtifactId(this.provisioningArtifactId)
		input.setPathId(this.pathId)
		input.setProvisioningParameters(this.provisioningParameters)
		input.setUpdateToken(this.updateToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductResult {
	  return com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductResult {
		return environment.servicecatalog.updateProvisionedProduct(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog update-provisioned-product")
				.argument("accept-language", acceptLanguage)
				.argument("provisioned-product-name", provisionedProductName)
				.argument("provisioned-product-id", provisionedProductId)
				.argument("product-id", productId)
				.argument("provisioning-artifact-id", provisioningArtifactId)
				.argument("path-id", pathId)
				.argument("provisioning-parameters", provisioningParameters?.toString())
				.argument("update-token", updateToken)
	}

}


fun AWSServiceCatalogFunctions.updateProvisioningArtifact(productId: String, provisioningArtifactId: String, init: AWSServiceCatalogUpdateProvisioningArtifactCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.UpdateProvisioningArtifactResult {
	return this.block.declare(AWSServiceCatalogUpdateProvisioningArtifactCommand(productId, provisioningArtifactId).apply(init)) as com.amazonaws.services.servicecatalog.model.UpdateProvisioningArtifactResult
}

@Generated
class AWSServiceCatalogUpdateProvisioningArtifactCommand(val productId: String, val provisioningArtifactId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.UpdateProvisioningArtifactRequest, com.amazonaws.services.servicecatalog.model.UpdateProvisioningArtifactResult> {

	var acceptLanguage: String? = null
	var name: String? = null
	var description: String? = null
	var active: Boolean? = false

	override fun build(): com.amazonaws.services.servicecatalog.model.UpdateProvisioningArtifactRequest {
		val input = com.amazonaws.services.servicecatalog.model.UpdateProvisioningArtifactRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setProductId(this.productId)
		input.setProvisioningArtifactId(this.provisioningArtifactId)
		input.setName(this.name)
		input.setDescription(this.description)
		input.setActive(this.active)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.UpdateProvisioningArtifactResult {
	  return com.amazonaws.services.servicecatalog.model.UpdateProvisioningArtifactResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.UpdateProvisioningArtifactResult {
		return environment.servicecatalog.updateProvisioningArtifact(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog update-provisioning-artifact")
				.argument("accept-language", acceptLanguage)
				.argument("product-id", productId)
				.argument("provisioning-artifact-id", provisioningArtifactId)
				.argument("name", name)
				.argument("description", description)
				.option("active", active ?: false)
	}

}


fun AWSServiceCatalogFunctions.updateTagOption(id: String, init: AWSServiceCatalogUpdateTagOptionCommand.() -> Unit): com.amazonaws.services.servicecatalog.model.UpdateTagOptionResult {
	return this.block.declare(AWSServiceCatalogUpdateTagOptionCommand(id).apply(init)) as com.amazonaws.services.servicecatalog.model.UpdateTagOptionResult
}

@Generated
class AWSServiceCatalogUpdateTagOptionCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.UpdateTagOptionRequest, com.amazonaws.services.servicecatalog.model.UpdateTagOptionResult> {

	var value: String? = null
	var active: Boolean? = false

	override fun build(): com.amazonaws.services.servicecatalog.model.UpdateTagOptionRequest {
		val input = com.amazonaws.services.servicecatalog.model.UpdateTagOptionRequest()
		input.setId(this.id)
		input.setValue(this.value)
		input.setActive(this.active)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.servicecatalog.model.UpdateTagOptionResult {
	  return com.amazonaws.services.servicecatalog.model.UpdateTagOptionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicecatalog.model.UpdateTagOptionResult {
		return environment.servicecatalog.updateTagOption(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog update-tag-option")
				.argument("id", id)
				.argument("value", value)
				.option("active", active ?: false)
	}

}
