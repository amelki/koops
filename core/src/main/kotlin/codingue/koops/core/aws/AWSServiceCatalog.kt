
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.servicecatalog.AWSServiceCatalog
import com.amazonaws.services.servicecatalog.model.*

var codingue.koops.core.Environment.servicecatalog: AWSServiceCatalog
	get() = this.capabilities[AWSServiceCatalog::class.java.name] as AWSServiceCatalog
	set(servicecatalog) {
		this.capabilities[AWSServiceCatalog::class.java.name] = servicecatalog
	}

@Generated
class AWSServiceCatalogFunctions(val block: Block)

infix fun AwsContinuation.servicecatalog(init: AWSServiceCatalogFunctions.() -> Unit) {
	AWSServiceCatalogFunctions(shell).apply(init)
}

			

fun AWSServiceCatalogFunctions.acceptPortfolioShare(portfolioId: String, init: AWSServiceCatalogAcceptPortfolioShareCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogAcceptPortfolioShareCommand(portfolioId).apply(init))
}

@Generated
class AWSServiceCatalogAcceptPortfolioShareCommand(val portfolioId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.AcceptPortfolioShareRequest> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.AcceptPortfolioShareRequest {
		val input = com.amazonaws.services.servicecatalog.model.AcceptPortfolioShareRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setPortfolioId(this.portfolioId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.acceptPortfolioShare(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog accept-portfolio-share")
				.argument("accept-language", acceptLanguage)
				.argument("portfolio-id", portfolioId)
	}

}


fun AWSServiceCatalogFunctions.associatePrincipalWithPortfolio(portfolioId: String, principalARN: String, principalType: PrincipalType, init: AWSServiceCatalogAssociatePrincipalWithPortfolioCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogAssociatePrincipalWithPortfolioCommand(portfolioId, principalARN, principalType).apply(init))
}

@Generated
class AWSServiceCatalogAssociatePrincipalWithPortfolioCommand(val portfolioId: String, val principalARN: String, val principalType: PrincipalType) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.AssociatePrincipalWithPortfolioRequest> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.AssociatePrincipalWithPortfolioRequest {
		val input = com.amazonaws.services.servicecatalog.model.AssociatePrincipalWithPortfolioRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setPortfolioId(this.portfolioId)
		input.setPrincipalARN(this.principalARN)
		input.setPrincipalType(this.principalType.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.associatePrincipalWithPortfolio(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog associate-principal-with-portfolio")
				.argument("accept-language", acceptLanguage)
				.argument("portfolio-id", portfolioId)
				.argument("principal-arn", principalARN)
				.argument("principal-type", principalType.toString())
	}

}


fun AWSServiceCatalogFunctions.associateProductWithPortfolio(productId: String, portfolioId: String, init: AWSServiceCatalogAssociateProductWithPortfolioCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogAssociateProductWithPortfolioCommand(productId, portfolioId).apply(init))
}

@Generated
class AWSServiceCatalogAssociateProductWithPortfolioCommand(val productId: String, val portfolioId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.AssociateProductWithPortfolioRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.associateProductWithPortfolio(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog associate-product-with-portfolio")
				.argument("accept-language", acceptLanguage)
				.argument("product-id", productId)
				.argument("portfolio-id", portfolioId)
				.argument("source-portfolio-id", sourcePortfolioId)
	}

}


fun AWSServiceCatalogFunctions.associateTagOptionWithResource(resourceId: String, tagOptionId: String, init: AWSServiceCatalogAssociateTagOptionWithResourceCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogAssociateTagOptionWithResourceCommand(resourceId, tagOptionId).apply(init))
}

@Generated
class AWSServiceCatalogAssociateTagOptionWithResourceCommand(val resourceId: String, val tagOptionId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.AssociateTagOptionWithResourceRequest> {



	override fun build(): com.amazonaws.services.servicecatalog.model.AssociateTagOptionWithResourceRequest {
		val input = com.amazonaws.services.servicecatalog.model.AssociateTagOptionWithResourceRequest()
		input.setResourceId(this.resourceId)
		input.setTagOptionId(this.tagOptionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.associateTagOptionWithResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog associate-tag-option-with-resource")
				.argument("resource-id", resourceId)
				.argument("tag-option-id", tagOptionId)
	}

}


fun AWSServiceCatalogFunctions.copyProduct(sourceProductArn: String, idempotencyToken: String, init: AWSServiceCatalogCopyProductCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogCopyProductCommand(sourceProductArn, idempotencyToken).apply(init))
}

@Generated
class AWSServiceCatalogCopyProductCommand(val sourceProductArn: String, val idempotencyToken: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.CopyProductRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.copyProduct(build())
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


fun AWSServiceCatalogFunctions.createConstraint(portfolioId: String, productId: String, parameters: String, type: String, idempotencyToken: String, init: AWSServiceCatalogCreateConstraintCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogCreateConstraintCommand(portfolioId, productId, parameters, type, idempotencyToken).apply(init))
}

@Generated
class AWSServiceCatalogCreateConstraintCommand(val portfolioId: String, val productId: String, val parameters: String, val type: String, val idempotencyToken: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.CreateConstraintRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.createConstraint(build())
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


fun AWSServiceCatalogFunctions.createPortfolio(displayName: String, providerName: String, idempotencyToken: String, init: AWSServiceCatalogCreatePortfolioCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogCreatePortfolioCommand(displayName, providerName, idempotencyToken).apply(init))
}

@Generated
class AWSServiceCatalogCreatePortfolioCommand(val displayName: String, val providerName: String, val idempotencyToken: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.CreatePortfolioRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.createPortfolio(build())
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


fun AWSServiceCatalogFunctions.createPortfolioShare(portfolioId: String, accountId: String, init: AWSServiceCatalogCreatePortfolioShareCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogCreatePortfolioShareCommand(portfolioId, accountId).apply(init))
}

@Generated
class AWSServiceCatalogCreatePortfolioShareCommand(val portfolioId: String, val accountId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.CreatePortfolioShareRequest> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.CreatePortfolioShareRequest {
		val input = com.amazonaws.services.servicecatalog.model.CreatePortfolioShareRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setPortfolioId(this.portfolioId)
		input.setAccountId(this.accountId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.createPortfolioShare(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog create-portfolio-share")
				.argument("accept-language", acceptLanguage)
				.argument("portfolio-id", portfolioId)
				.argument("account-id", accountId)
	}

}


fun AWSServiceCatalogFunctions.createProduct(name: String, owner: String, productType: ProductType, provisioningArtifactParameters: com.amazonaws.services.servicecatalog.model.ProvisioningArtifactProperties, idempotencyToken: String, init: AWSServiceCatalogCreateProductCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogCreateProductCommand(name, owner, productType, provisioningArtifactParameters, idempotencyToken).apply(init))
}

@Generated
class AWSServiceCatalogCreateProductCommand(val name: String, val owner: String, val productType: ProductType, val provisioningArtifactParameters: com.amazonaws.services.servicecatalog.model.ProvisioningArtifactProperties, val idempotencyToken: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.CreateProductRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.createProduct(build())
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


fun AWSServiceCatalogFunctions.createProvisionedProductPlan(planName: String, planType: ProvisionedProductPlanType, productId: String, provisionedProductName: String, provisioningArtifactId: String, idempotencyToken: String, init: AWSServiceCatalogCreateProvisionedProductPlanCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogCreateProvisionedProductPlanCommand(planName, planType, productId, provisionedProductName, provisioningArtifactId, idempotencyToken).apply(init))
}

@Generated
class AWSServiceCatalogCreateProvisionedProductPlanCommand(val planName: String, val planType: ProvisionedProductPlanType, val productId: String, val provisionedProductName: String, val provisioningArtifactId: String, val idempotencyToken: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.CreateProvisionedProductPlanRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.createProvisionedProductPlan(build())
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


fun AWSServiceCatalogFunctions.createProvisioningArtifact(productId: String, parameters: com.amazonaws.services.servicecatalog.model.ProvisioningArtifactProperties, idempotencyToken: String, init: AWSServiceCatalogCreateProvisioningArtifactCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogCreateProvisioningArtifactCommand(productId, parameters, idempotencyToken).apply(init))
}

@Generated
class AWSServiceCatalogCreateProvisioningArtifactCommand(val productId: String, val parameters: com.amazonaws.services.servicecatalog.model.ProvisioningArtifactProperties, val idempotencyToken: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.CreateProvisioningArtifactRequest> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.CreateProvisioningArtifactRequest {
		val input = com.amazonaws.services.servicecatalog.model.CreateProvisioningArtifactRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setProductId(this.productId)
		input.setParameters(this.parameters)
		input.setIdempotencyToken(this.idempotencyToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.createProvisioningArtifact(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog create-provisioning-artifact")
				.argument("accept-language", acceptLanguage)
				.argument("product-id", productId)
				.argument("parameters", parameters.toString())
				.argument("idempotency-token", idempotencyToken)
	}

}


fun AWSServiceCatalogFunctions.createTagOption(key: String, value: String, init: AWSServiceCatalogCreateTagOptionCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogCreateTagOptionCommand(key, value).apply(init))
}

@Generated
class AWSServiceCatalogCreateTagOptionCommand(val key: String, val value: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.CreateTagOptionRequest> {



	override fun build(): com.amazonaws.services.servicecatalog.model.CreateTagOptionRequest {
		val input = com.amazonaws.services.servicecatalog.model.CreateTagOptionRequest()
		input.setKey(this.key)
		input.setValue(this.value)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.createTagOption(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog create-tag-option")
				.argument("key", key)
				.argument("value", value)
	}

}


fun AWSServiceCatalogFunctions.deleteConstraint(id: String, init: AWSServiceCatalogDeleteConstraintCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogDeleteConstraintCommand(id).apply(init))
}

@Generated
class AWSServiceCatalogDeleteConstraintCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DeleteConstraintRequest> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.DeleteConstraintRequest {
		val input = com.amazonaws.services.servicecatalog.model.DeleteConstraintRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.deleteConstraint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog delete-constraint")
				.argument("accept-language", acceptLanguage)
				.argument("id", id)
	}

}


fun AWSServiceCatalogFunctions.deletePortfolio(id: String, init: AWSServiceCatalogDeletePortfolioCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogDeletePortfolioCommand(id).apply(init))
}

@Generated
class AWSServiceCatalogDeletePortfolioCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DeletePortfolioRequest> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.DeletePortfolioRequest {
		val input = com.amazonaws.services.servicecatalog.model.DeletePortfolioRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.deletePortfolio(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog delete-portfolio")
				.argument("accept-language", acceptLanguage)
				.argument("id", id)
	}

}


fun AWSServiceCatalogFunctions.deletePortfolioShare(portfolioId: String, accountId: String, init: AWSServiceCatalogDeletePortfolioShareCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogDeletePortfolioShareCommand(portfolioId, accountId).apply(init))
}

@Generated
class AWSServiceCatalogDeletePortfolioShareCommand(val portfolioId: String, val accountId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DeletePortfolioShareRequest> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.DeletePortfolioShareRequest {
		val input = com.amazonaws.services.servicecatalog.model.DeletePortfolioShareRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setPortfolioId(this.portfolioId)
		input.setAccountId(this.accountId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.deletePortfolioShare(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog delete-portfolio-share")
				.argument("accept-language", acceptLanguage)
				.argument("portfolio-id", portfolioId)
				.argument("account-id", accountId)
	}

}


fun AWSServiceCatalogFunctions.deleteProduct(id: String, init: AWSServiceCatalogDeleteProductCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogDeleteProductCommand(id).apply(init))
}

@Generated
class AWSServiceCatalogDeleteProductCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DeleteProductRequest> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.DeleteProductRequest {
		val input = com.amazonaws.services.servicecatalog.model.DeleteProductRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.deleteProduct(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog delete-product")
				.argument("accept-language", acceptLanguage)
				.argument("id", id)
	}

}


fun AWSServiceCatalogFunctions.deleteProvisionedProductPlan(planId: String, init: AWSServiceCatalogDeleteProvisionedProductPlanCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogDeleteProvisionedProductPlanCommand(planId).apply(init))
}

@Generated
class AWSServiceCatalogDeleteProvisionedProductPlanCommand(val planId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DeleteProvisionedProductPlanRequest> {

	var acceptLanguage: String? = null
	var ignoreErrors: Boolean? = false

	override fun build(): com.amazonaws.services.servicecatalog.model.DeleteProvisionedProductPlanRequest {
		val input = com.amazonaws.services.servicecatalog.model.DeleteProvisionedProductPlanRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setPlanId(this.planId)
		input.setIgnoreErrors(this.ignoreErrors)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.deleteProvisionedProductPlan(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog delete-provisioned-product-plan")
				.argument("accept-language", acceptLanguage)
				.argument("plan-id", planId)
				.option("ignore-errors", ignoreErrors ?: false)
	}

}


fun AWSServiceCatalogFunctions.deleteProvisioningArtifact(productId: String, provisioningArtifactId: String, init: AWSServiceCatalogDeleteProvisioningArtifactCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogDeleteProvisioningArtifactCommand(productId, provisioningArtifactId).apply(init))
}

@Generated
class AWSServiceCatalogDeleteProvisioningArtifactCommand(val productId: String, val provisioningArtifactId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DeleteProvisioningArtifactRequest> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.DeleteProvisioningArtifactRequest {
		val input = com.amazonaws.services.servicecatalog.model.DeleteProvisioningArtifactRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setProductId(this.productId)
		input.setProvisioningArtifactId(this.provisioningArtifactId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.deleteProvisioningArtifact(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog delete-provisioning-artifact")
				.argument("accept-language", acceptLanguage)
				.argument("product-id", productId)
				.argument("provisioning-artifact-id", provisioningArtifactId)
	}

}


fun AWSServiceCatalogFunctions.deleteTagOption(id: String, init: AWSServiceCatalogDeleteTagOptionCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogDeleteTagOptionCommand(id).apply(init))
}

@Generated
class AWSServiceCatalogDeleteTagOptionCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DeleteTagOptionRequest> {



	override fun build(): com.amazonaws.services.servicecatalog.model.DeleteTagOptionRequest {
		val input = com.amazonaws.services.servicecatalog.model.DeleteTagOptionRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.deleteTagOption(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog delete-tag-option")
				.argument("id", id)
	}

}


fun AWSServiceCatalogFunctions.describeConstraint(id: String, init: AWSServiceCatalogDescribeConstraintCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogDescribeConstraintCommand(id).apply(init))
}

@Generated
class AWSServiceCatalogDescribeConstraintCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DescribeConstraintRequest> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.DescribeConstraintRequest {
		val input = com.amazonaws.services.servicecatalog.model.DescribeConstraintRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.describeConstraint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog describe-constraint")
				.argument("accept-language", acceptLanguage)
				.argument("id", id)
	}

}


fun AWSServiceCatalogFunctions.describeCopyProductStatus(copyProductToken: String, init: AWSServiceCatalogDescribeCopyProductStatusCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogDescribeCopyProductStatusCommand(copyProductToken).apply(init))
}

@Generated
class AWSServiceCatalogDescribeCopyProductStatusCommand(val copyProductToken: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DescribeCopyProductStatusRequest> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.DescribeCopyProductStatusRequest {
		val input = com.amazonaws.services.servicecatalog.model.DescribeCopyProductStatusRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setCopyProductToken(this.copyProductToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.describeCopyProductStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog describe-copy-product-status")
				.argument("accept-language", acceptLanguage)
				.argument("copy-product-token", copyProductToken)
	}

}


fun AWSServiceCatalogFunctions.describePortfolio(id: String, init: AWSServiceCatalogDescribePortfolioCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogDescribePortfolioCommand(id).apply(init))
}

@Generated
class AWSServiceCatalogDescribePortfolioCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DescribePortfolioRequest> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.DescribePortfolioRequest {
		val input = com.amazonaws.services.servicecatalog.model.DescribePortfolioRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.describePortfolio(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog describe-portfolio")
				.argument("accept-language", acceptLanguage)
				.argument("id", id)
	}

}


fun AWSServiceCatalogFunctions.describeProduct(id: String, init: AWSServiceCatalogDescribeProductCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogDescribeProductCommand(id).apply(init))
}

@Generated
class AWSServiceCatalogDescribeProductCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DescribeProductRequest> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.DescribeProductRequest {
		val input = com.amazonaws.services.servicecatalog.model.DescribeProductRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.describeProduct(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog describe-product")
				.argument("accept-language", acceptLanguage)
				.argument("id", id)
	}

}


fun AWSServiceCatalogFunctions.describeProductAsAdmin(id: String, init: AWSServiceCatalogDescribeProductAsAdminCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogDescribeProductAsAdminCommand(id).apply(init))
}

@Generated
class AWSServiceCatalogDescribeProductAsAdminCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DescribeProductAsAdminRequest> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.DescribeProductAsAdminRequest {
		val input = com.amazonaws.services.servicecatalog.model.DescribeProductAsAdminRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.describeProductAsAdmin(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog describe-product-as-admin")
				.argument("accept-language", acceptLanguage)
				.argument("id", id)
	}

}


fun AWSServiceCatalogFunctions.describeProductView(id: String, init: AWSServiceCatalogDescribeProductViewCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogDescribeProductViewCommand(id).apply(init))
}

@Generated
class AWSServiceCatalogDescribeProductViewCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DescribeProductViewRequest> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.DescribeProductViewRequest {
		val input = com.amazonaws.services.servicecatalog.model.DescribeProductViewRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.describeProductView(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog describe-product-view")
				.argument("accept-language", acceptLanguage)
				.argument("id", id)
	}

}


fun AWSServiceCatalogFunctions.describeProvisionedProduct(id: String, init: AWSServiceCatalogDescribeProvisionedProductCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogDescribeProvisionedProductCommand(id).apply(init))
}

@Generated
class AWSServiceCatalogDescribeProvisionedProductCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductRequest> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductRequest {
		val input = com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.describeProvisionedProduct(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog describe-provisioned-product")
				.argument("accept-language", acceptLanguage)
				.argument("id", id)
	}

}


fun AWSServiceCatalogFunctions.describeProvisionedProductPlan(planId: String, init: AWSServiceCatalogDescribeProvisionedProductPlanCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogDescribeProvisionedProductPlanCommand(planId).apply(init))
}

@Generated
class AWSServiceCatalogDescribeProvisionedProductPlanCommand(val planId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductPlanRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.describeProvisionedProductPlan(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog describe-provisioned-product-plan")
				.argument("accept-language", acceptLanguage)
				.argument("plan-id", planId)
				.argument("page-size", pageSize?.toString())
				.argument("page-token", pageToken)
	}

}


fun AWSServiceCatalogFunctions.describeProvisioningArtifact(provisioningArtifactId: String, productId: String, init: AWSServiceCatalogDescribeProvisioningArtifactCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogDescribeProvisioningArtifactCommand(provisioningArtifactId, productId).apply(init))
}

@Generated
class AWSServiceCatalogDescribeProvisioningArtifactCommand(val provisioningArtifactId: String, val productId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DescribeProvisioningArtifactRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.describeProvisioningArtifact(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog describe-provisioning-artifact")
				.argument("accept-language", acceptLanguage)
				.argument("provisioning-artifact-id", provisioningArtifactId)
				.argument("product-id", productId)
				.option("verbose", verbose ?: false)
	}

}


fun AWSServiceCatalogFunctions.describeProvisioningParameters(productId: String, provisioningArtifactId: String, init: AWSServiceCatalogDescribeProvisioningParametersCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogDescribeProvisioningParametersCommand(productId, provisioningArtifactId).apply(init))
}

@Generated
class AWSServiceCatalogDescribeProvisioningParametersCommand(val productId: String, val provisioningArtifactId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DescribeProvisioningParametersRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.describeProvisioningParameters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog describe-provisioning-parameters")
				.argument("accept-language", acceptLanguage)
				.argument("product-id", productId)
				.argument("provisioning-artifact-id", provisioningArtifactId)
				.argument("path-id", pathId)
	}

}


fun AWSServiceCatalogFunctions.describeRecord(id: String, init: AWSServiceCatalogDescribeRecordCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogDescribeRecordCommand(id).apply(init))
}

@Generated
class AWSServiceCatalogDescribeRecordCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DescribeRecordRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.describeRecord(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog describe-record")
				.argument("accept-language", acceptLanguage)
				.argument("id", id)
				.argument("page-token", pageToken)
				.argument("page-size", pageSize?.toString())
	}

}


fun AWSServiceCatalogFunctions.describeTagOption(id: String, init: AWSServiceCatalogDescribeTagOptionCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogDescribeTagOptionCommand(id).apply(init))
}

@Generated
class AWSServiceCatalogDescribeTagOptionCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DescribeTagOptionRequest> {



	override fun build(): com.amazonaws.services.servicecatalog.model.DescribeTagOptionRequest {
		val input = com.amazonaws.services.servicecatalog.model.DescribeTagOptionRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.describeTagOption(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog describe-tag-option")
				.argument("id", id)
	}

}


fun AWSServiceCatalogFunctions.disassociatePrincipalFromPortfolio(portfolioId: String, principalARN: String, init: AWSServiceCatalogDisassociatePrincipalFromPortfolioCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogDisassociatePrincipalFromPortfolioCommand(portfolioId, principalARN).apply(init))
}

@Generated
class AWSServiceCatalogDisassociatePrincipalFromPortfolioCommand(val portfolioId: String, val principalARN: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DisassociatePrincipalFromPortfolioRequest> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.DisassociatePrincipalFromPortfolioRequest {
		val input = com.amazonaws.services.servicecatalog.model.DisassociatePrincipalFromPortfolioRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setPortfolioId(this.portfolioId)
		input.setPrincipalARN(this.principalARN)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.disassociatePrincipalFromPortfolio(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog disassociate-principal-from-portfolio")
				.argument("accept-language", acceptLanguage)
				.argument("portfolio-id", portfolioId)
				.argument("principal-arn", principalARN)
	}

}


fun AWSServiceCatalogFunctions.disassociateProductFromPortfolio(productId: String, portfolioId: String, init: AWSServiceCatalogDisassociateProductFromPortfolioCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogDisassociateProductFromPortfolioCommand(productId, portfolioId).apply(init))
}

@Generated
class AWSServiceCatalogDisassociateProductFromPortfolioCommand(val productId: String, val portfolioId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DisassociateProductFromPortfolioRequest> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.DisassociateProductFromPortfolioRequest {
		val input = com.amazonaws.services.servicecatalog.model.DisassociateProductFromPortfolioRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setProductId(this.productId)
		input.setPortfolioId(this.portfolioId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.disassociateProductFromPortfolio(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog disassociate-product-from-portfolio")
				.argument("accept-language", acceptLanguage)
				.argument("product-id", productId)
				.argument("portfolio-id", portfolioId)
	}

}


fun AWSServiceCatalogFunctions.disassociateTagOptionFromResource(resourceId: String, tagOptionId: String, init: AWSServiceCatalogDisassociateTagOptionFromResourceCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogDisassociateTagOptionFromResourceCommand(resourceId, tagOptionId).apply(init))
}

@Generated
class AWSServiceCatalogDisassociateTagOptionFromResourceCommand(val resourceId: String, val tagOptionId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.DisassociateTagOptionFromResourceRequest> {



	override fun build(): com.amazonaws.services.servicecatalog.model.DisassociateTagOptionFromResourceRequest {
		val input = com.amazonaws.services.servicecatalog.model.DisassociateTagOptionFromResourceRequest()
		input.setResourceId(this.resourceId)
		input.setTagOptionId(this.tagOptionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.disassociateTagOptionFromResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog disassociate-tag-option-from-resource")
				.argument("resource-id", resourceId)
				.argument("tag-option-id", tagOptionId)
	}

}


fun AWSServiceCatalogFunctions.executeProvisionedProductPlan(planId: String, idempotencyToken: String, init: AWSServiceCatalogExecuteProvisionedProductPlanCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogExecuteProvisionedProductPlanCommand(planId, idempotencyToken).apply(init))
}

@Generated
class AWSServiceCatalogExecuteProvisionedProductPlanCommand(val planId: String, val idempotencyToken: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductPlanRequest> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductPlanRequest {
		val input = com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductPlanRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setPlanId(this.planId)
		input.setIdempotencyToken(this.idempotencyToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.executeProvisionedProductPlan(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog execute-provisioned-product-plan")
				.argument("accept-language", acceptLanguage)
				.argument("plan-id", planId)
				.argument("idempotency-token", idempotencyToken)
	}

}


fun AWSServiceCatalogFunctions.listAcceptedPortfolioShares(init: AWSServiceCatalogListAcceptedPortfolioSharesCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogListAcceptedPortfolioSharesCommand().apply(init))
}

@Generated
class AWSServiceCatalogListAcceptedPortfolioSharesCommand() : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.ListAcceptedPortfolioSharesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.listAcceptedPortfolioShares(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog list-accepted-portfolio-shares")
				.argument("accept-language", acceptLanguage)
				.argument("page-token", pageToken)
				.argument("page-size", pageSize?.toString())
	}

}


fun AWSServiceCatalogFunctions.listConstraintsForPortfolio(portfolioId: String, init: AWSServiceCatalogListConstraintsForPortfolioCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogListConstraintsForPortfolioCommand(portfolioId).apply(init))
}

@Generated
class AWSServiceCatalogListConstraintsForPortfolioCommand(val portfolioId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.ListConstraintsForPortfolioRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.listConstraintsForPortfolio(build())
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


fun AWSServiceCatalogFunctions.listLaunchPaths(productId: String, init: AWSServiceCatalogListLaunchPathsCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogListLaunchPathsCommand(productId).apply(init))
}

@Generated
class AWSServiceCatalogListLaunchPathsCommand(val productId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.ListLaunchPathsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.listLaunchPaths(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog list-launch-paths")
				.argument("accept-language", acceptLanguage)
				.argument("product-id", productId)
				.argument("page-size", pageSize?.toString())
				.argument("page-token", pageToken)
	}

}


fun AWSServiceCatalogFunctions.listPortfolioAccess(portfolioId: String, init: AWSServiceCatalogListPortfolioAccessCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogListPortfolioAccessCommand(portfolioId).apply(init))
}

@Generated
class AWSServiceCatalogListPortfolioAccessCommand(val portfolioId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.ListPortfolioAccessRequest> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.ListPortfolioAccessRequest {
		val input = com.amazonaws.services.servicecatalog.model.ListPortfolioAccessRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setPortfolioId(this.portfolioId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.listPortfolioAccess(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog list-portfolio-access")
				.argument("accept-language", acceptLanguage)
				.argument("portfolio-id", portfolioId)
	}

}


fun AWSServiceCatalogFunctions.listPortfolios(init: AWSServiceCatalogListPortfoliosCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogListPortfoliosCommand().apply(init))
}

@Generated
class AWSServiceCatalogListPortfoliosCommand() : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.ListPortfoliosRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.listPortfolios(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog list-portfolios")
				.argument("accept-language", acceptLanguage)
				.argument("page-token", pageToken)
				.argument("page-size", pageSize?.toString())
	}

}


fun AWSServiceCatalogFunctions.listPortfoliosForProduct(productId: String, init: AWSServiceCatalogListPortfoliosForProductCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogListPortfoliosForProductCommand(productId).apply(init))
}

@Generated
class AWSServiceCatalogListPortfoliosForProductCommand(val productId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.ListPortfoliosForProductRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.listPortfoliosForProduct(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog list-portfolios-for-product")
				.argument("accept-language", acceptLanguage)
				.argument("product-id", productId)
				.argument("page-token", pageToken)
				.argument("page-size", pageSize?.toString())
	}

}


fun AWSServiceCatalogFunctions.listPrincipalsForPortfolio(portfolioId: String, init: AWSServiceCatalogListPrincipalsForPortfolioCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogListPrincipalsForPortfolioCommand(portfolioId).apply(init))
}

@Generated
class AWSServiceCatalogListPrincipalsForPortfolioCommand(val portfolioId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.ListPrincipalsForPortfolioRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.listPrincipalsForPortfolio(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog list-principals-for-portfolio")
				.argument("accept-language", acceptLanguage)
				.argument("portfolio-id", portfolioId)
				.argument("page-size", pageSize?.toString())
				.argument("page-token", pageToken)
	}

}


fun AWSServiceCatalogFunctions.listProvisionedProductPlans(init: AWSServiceCatalogListProvisionedProductPlansCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogListProvisionedProductPlansCommand().apply(init))
}

@Generated
class AWSServiceCatalogListProvisionedProductPlansCommand() : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.ListProvisionedProductPlansRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.listProvisionedProductPlans(build())
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


fun AWSServiceCatalogFunctions.listProvisioningArtifacts(productId: String, init: AWSServiceCatalogListProvisioningArtifactsCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogListProvisioningArtifactsCommand(productId).apply(init))
}

@Generated
class AWSServiceCatalogListProvisioningArtifactsCommand(val productId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsRequest> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsRequest {
		val input = com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setProductId(this.productId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.listProvisioningArtifacts(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog list-provisioning-artifacts")
				.argument("accept-language", acceptLanguage)
				.argument("product-id", productId)
	}

}


fun AWSServiceCatalogFunctions.listRecordHistory(init: AWSServiceCatalogListRecordHistoryCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogListRecordHistoryCommand().apply(init))
}

@Generated
class AWSServiceCatalogListRecordHistoryCommand() : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.ListRecordHistoryRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.listRecordHistory(build())
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


fun AWSServiceCatalogFunctions.listResourcesForTagOption(tagOptionId: String, init: AWSServiceCatalogListResourcesForTagOptionCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogListResourcesForTagOptionCommand(tagOptionId).apply(init))
}

@Generated
class AWSServiceCatalogListResourcesForTagOptionCommand(val tagOptionId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.ListResourcesForTagOptionRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.listResourcesForTagOption(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog list-resources-for-tag-option")
				.argument("tag-option-id", tagOptionId)
				.argument("resource-type", resourceType)
				.argument("page-size", pageSize?.toString())
				.argument("page-token", pageToken)
	}

}


fun AWSServiceCatalogFunctions.listTagOptions(init: AWSServiceCatalogListTagOptionsCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogListTagOptionsCommand().apply(init))
}

@Generated
class AWSServiceCatalogListTagOptionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.ListTagOptionsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.listTagOptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog list-tag-options")
				.argument("filters", filters?.toString())
				.argument("page-size", pageSize?.toString())
				.argument("page-token", pageToken)
	}

}


fun AWSServiceCatalogFunctions.provisionProduct(productId: String, provisioningArtifactId: String, provisionedProductName: String, provisionToken: String, init: AWSServiceCatalogProvisionProductCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogProvisionProductCommand(productId, provisioningArtifactId, provisionedProductName, provisionToken).apply(init))
}

@Generated
class AWSServiceCatalogProvisionProductCommand(val productId: String, val provisioningArtifactId: String, val provisionedProductName: String, val provisionToken: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.ProvisionProductRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.provisionProduct(build())
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


fun AWSServiceCatalogFunctions.rejectPortfolioShare(portfolioId: String, init: AWSServiceCatalogRejectPortfolioShareCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogRejectPortfolioShareCommand(portfolioId).apply(init))
}

@Generated
class AWSServiceCatalogRejectPortfolioShareCommand(val portfolioId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.RejectPortfolioShareRequest> {

	var acceptLanguage: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.RejectPortfolioShareRequest {
		val input = com.amazonaws.services.servicecatalog.model.RejectPortfolioShareRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setPortfolioId(this.portfolioId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.rejectPortfolioShare(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog reject-portfolio-share")
				.argument("accept-language", acceptLanguage)
				.argument("portfolio-id", portfolioId)
	}

}


fun AWSServiceCatalogFunctions.scanProvisionedProducts(init: AWSServiceCatalogScanProvisionedProductsCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogScanProvisionedProductsCommand().apply(init))
}

@Generated
class AWSServiceCatalogScanProvisionedProductsCommand() : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.ScanProvisionedProductsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.scanProvisionedProducts(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog scan-provisioned-products")
				.argument("accept-language", acceptLanguage)
				.argument("access-level-filter", accessLevelFilter?.toString())
				.argument("page-size", pageSize?.toString())
				.argument("page-token", pageToken)
	}

}


fun AWSServiceCatalogFunctions.searchProducts(init: AWSServiceCatalogSearchProductsCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogSearchProductsCommand().apply(init))
}

@Generated
class AWSServiceCatalogSearchProductsCommand() : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.SearchProductsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.searchProducts(build())
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


fun AWSServiceCatalogFunctions.searchProductsAsAdmin(init: AWSServiceCatalogSearchProductsAsAdminCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogSearchProductsAsAdminCommand().apply(init))
}

@Generated
class AWSServiceCatalogSearchProductsAsAdminCommand() : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.SearchProductsAsAdminRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.searchProductsAsAdmin(build())
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


fun AWSServiceCatalogFunctions.searchProvisionedProducts(init: AWSServiceCatalogSearchProvisionedProductsCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogSearchProvisionedProductsCommand().apply(init))
}

@Generated
class AWSServiceCatalogSearchProvisionedProductsCommand() : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.SearchProvisionedProductsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.searchProvisionedProducts(build())
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


fun AWSServiceCatalogFunctions.terminateProvisionedProduct(terminateToken: String, init: AWSServiceCatalogTerminateProvisionedProductCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogTerminateProvisionedProductCommand(terminateToken).apply(init))
}

@Generated
class AWSServiceCatalogTerminateProvisionedProductCommand(val terminateToken: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.TerminateProvisionedProductRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.terminateProvisionedProduct(build())
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


fun AWSServiceCatalogFunctions.updateConstraint(id: String, init: AWSServiceCatalogUpdateConstraintCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogUpdateConstraintCommand(id).apply(init))
}

@Generated
class AWSServiceCatalogUpdateConstraintCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.UpdateConstraintRequest> {

	var acceptLanguage: String? = null
	var description: String? = null

	override fun build(): com.amazonaws.services.servicecatalog.model.UpdateConstraintRequest {
		val input = com.amazonaws.services.servicecatalog.model.UpdateConstraintRequest()
		input.setAcceptLanguage(this.acceptLanguage)
		input.setId(this.id)
		input.setDescription(this.description)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.updateConstraint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog update-constraint")
				.argument("accept-language", acceptLanguage)
				.argument("id", id)
				.argument("description", description)
	}

}


fun AWSServiceCatalogFunctions.updatePortfolio(id: String, init: AWSServiceCatalogUpdatePortfolioCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogUpdatePortfolioCommand(id).apply(init))
}

@Generated
class AWSServiceCatalogUpdatePortfolioCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.UpdatePortfolioRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.updatePortfolio(build())
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


fun AWSServiceCatalogFunctions.updateProduct(id: String, init: AWSServiceCatalogUpdateProductCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogUpdateProductCommand(id).apply(init))
}

@Generated
class AWSServiceCatalogUpdateProductCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.UpdateProductRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.updateProduct(build())
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


fun AWSServiceCatalogFunctions.updateProvisionedProduct(updateToken: String, init: AWSServiceCatalogUpdateProvisionedProductCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogUpdateProvisionedProductCommand(updateToken).apply(init))
}

@Generated
class AWSServiceCatalogUpdateProvisionedProductCommand(val updateToken: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.updateProvisionedProduct(build())
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


fun AWSServiceCatalogFunctions.updateProvisioningArtifact(productId: String, provisioningArtifactId: String, init: AWSServiceCatalogUpdateProvisioningArtifactCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogUpdateProvisioningArtifactCommand(productId, provisioningArtifactId).apply(init))
}

@Generated
class AWSServiceCatalogUpdateProvisioningArtifactCommand(val productId: String, val provisioningArtifactId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.UpdateProvisioningArtifactRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.updateProvisioningArtifact(build())
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


fun AWSServiceCatalogFunctions.updateTagOption(id: String, init: AWSServiceCatalogUpdateTagOptionCommand.() -> Unit) {
	this.block.declare(AWSServiceCatalogUpdateTagOptionCommand(id).apply(init))
}

@Generated
class AWSServiceCatalogUpdateTagOptionCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicecatalog.model.UpdateTagOptionRequest> {

	var value: String? = null
	var active: Boolean? = false

	override fun build(): com.amazonaws.services.servicecatalog.model.UpdateTagOptionRequest {
		val input = com.amazonaws.services.servicecatalog.model.UpdateTagOptionRequest()
		input.setId(this.id)
		input.setValue(this.value)
		input.setActive(this.active)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicecatalog.updateTagOption(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicecatalog update-tag-option")
				.argument("id", id)
				.argument("value", value)
				.option("active", active ?: false)
	}

}
