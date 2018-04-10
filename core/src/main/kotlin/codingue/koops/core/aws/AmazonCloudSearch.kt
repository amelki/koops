
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.cloudsearchv2.AmazonCloudSearch
import com.amazonaws.services.cloudsearchv2.model.*

var codingue.koops.core.Environment.cloudsearch: AmazonCloudSearch
	get() = this.capabilities[AmazonCloudSearch::class.java.name] as AmazonCloudSearch
	set(cloudsearch) {
		this.capabilities[AmazonCloudSearch::class.java.name] = cloudsearch
	}

@Generated
class AmazonCloudSearchFunctions(val block: Block)

infix fun AwsContinuation.cloudsearch(init: AmazonCloudSearchFunctions.() -> Unit) {
	AmazonCloudSearchFunctions(shell).apply(init)
}

			

fun AmazonCloudSearchFunctions.buildSuggesters(domainName: String, init: AmazonCloudSearchBuildSuggestersCommand.() -> Unit) {
	this.block.declare(AmazonCloudSearchBuildSuggestersCommand(domainName).apply(init))
}

@Generated
class AmazonCloudSearchBuildSuggestersCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.BuildSuggestersRequest> {



	override fun build(): com.amazonaws.services.cloudsearchv2.model.BuildSuggestersRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.BuildSuggestersRequest()
		input.setDomainName(this.domainName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudsearch.buildSuggesters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch build-suggesters")
				.argument("domain-name", domainName)
	}

}


fun AmazonCloudSearchFunctions.createDomain(domainName: String, init: AmazonCloudSearchCreateDomainCommand.() -> Unit) {
	this.block.declare(AmazonCloudSearchCreateDomainCommand(domainName).apply(init))
}

@Generated
class AmazonCloudSearchCreateDomainCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.CreateDomainRequest> {



	override fun build(): com.amazonaws.services.cloudsearchv2.model.CreateDomainRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.CreateDomainRequest()
		input.setDomainName(this.domainName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudsearch.createDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch create-domain")
				.argument("domain-name", domainName)
	}

}


fun AmazonCloudSearchFunctions.defineAnalysisScheme(domainName: String, analysisScheme: com.amazonaws.services.cloudsearchv2.model.AnalysisScheme, init: AmazonCloudSearchDefineAnalysisSchemeCommand.() -> Unit) {
	this.block.declare(AmazonCloudSearchDefineAnalysisSchemeCommand(domainName, analysisScheme).apply(init))
}

@Generated
class AmazonCloudSearchDefineAnalysisSchemeCommand(val domainName: String, val analysisScheme: com.amazonaws.services.cloudsearchv2.model.AnalysisScheme) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.DefineAnalysisSchemeRequest> {



	override fun build(): com.amazonaws.services.cloudsearchv2.model.DefineAnalysisSchemeRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.DefineAnalysisSchemeRequest()
		input.setDomainName(this.domainName)
		input.setAnalysisScheme(this.analysisScheme)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudsearch.defineAnalysisScheme(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch define-analysis-scheme")
				.argument("domain-name", domainName)
				.argument("analysis-scheme", analysisScheme.toString())
	}

}


fun AmazonCloudSearchFunctions.defineExpression(domainName: String, expression: com.amazonaws.services.cloudsearchv2.model.Expression, init: AmazonCloudSearchDefineExpressionCommand.() -> Unit) {
	this.block.declare(AmazonCloudSearchDefineExpressionCommand(domainName, expression).apply(init))
}

@Generated
class AmazonCloudSearchDefineExpressionCommand(val domainName: String, val expression: com.amazonaws.services.cloudsearchv2.model.Expression) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.DefineExpressionRequest> {



	override fun build(): com.amazonaws.services.cloudsearchv2.model.DefineExpressionRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.DefineExpressionRequest()
		input.setDomainName(this.domainName)
		input.setExpression(this.expression)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudsearch.defineExpression(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch define-expression")
				.argument("domain-name", domainName)
				.argument("expression", expression.toString())
	}

}


fun AmazonCloudSearchFunctions.defineIndexField(domainName: String, indexField: com.amazonaws.services.cloudsearchv2.model.IndexField, init: AmazonCloudSearchDefineIndexFieldCommand.() -> Unit) {
	this.block.declare(AmazonCloudSearchDefineIndexFieldCommand(domainName, indexField).apply(init))
}

@Generated
class AmazonCloudSearchDefineIndexFieldCommand(val domainName: String, val indexField: com.amazonaws.services.cloudsearchv2.model.IndexField) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.DefineIndexFieldRequest> {



	override fun build(): com.amazonaws.services.cloudsearchv2.model.DefineIndexFieldRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.DefineIndexFieldRequest()
		input.setDomainName(this.domainName)
		input.setIndexField(this.indexField)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudsearch.defineIndexField(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch define-index-field")
				.argument("domain-name", domainName)
				.argument("index-field", indexField.toString())
	}

}


fun AmazonCloudSearchFunctions.defineSuggester(domainName: String, suggester: com.amazonaws.services.cloudsearchv2.model.Suggester, init: AmazonCloudSearchDefineSuggesterCommand.() -> Unit) {
	this.block.declare(AmazonCloudSearchDefineSuggesterCommand(domainName, suggester).apply(init))
}

@Generated
class AmazonCloudSearchDefineSuggesterCommand(val domainName: String, val suggester: com.amazonaws.services.cloudsearchv2.model.Suggester) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.DefineSuggesterRequest> {



	override fun build(): com.amazonaws.services.cloudsearchv2.model.DefineSuggesterRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.DefineSuggesterRequest()
		input.setDomainName(this.domainName)
		input.setSuggester(this.suggester)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudsearch.defineSuggester(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch define-suggester")
				.argument("domain-name", domainName)
				.argument("suggester", suggester.toString())
	}

}


fun AmazonCloudSearchFunctions.deleteAnalysisScheme(domainName: String, analysisSchemeName: String, init: AmazonCloudSearchDeleteAnalysisSchemeCommand.() -> Unit) {
	this.block.declare(AmazonCloudSearchDeleteAnalysisSchemeCommand(domainName, analysisSchemeName).apply(init))
}

@Generated
class AmazonCloudSearchDeleteAnalysisSchemeCommand(val domainName: String, val analysisSchemeName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.DeleteAnalysisSchemeRequest> {



	override fun build(): com.amazonaws.services.cloudsearchv2.model.DeleteAnalysisSchemeRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.DeleteAnalysisSchemeRequest()
		input.setDomainName(this.domainName)
		input.setAnalysisSchemeName(this.analysisSchemeName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudsearch.deleteAnalysisScheme(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch delete-analysis-scheme")
				.argument("domain-name", domainName)
				.argument("analysis-scheme-name", analysisSchemeName)
	}

}


fun AmazonCloudSearchFunctions.deleteDomain(domainName: String, init: AmazonCloudSearchDeleteDomainCommand.() -> Unit) {
	this.block.declare(AmazonCloudSearchDeleteDomainCommand(domainName).apply(init))
}

@Generated
class AmazonCloudSearchDeleteDomainCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.DeleteDomainRequest> {



	override fun build(): com.amazonaws.services.cloudsearchv2.model.DeleteDomainRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.DeleteDomainRequest()
		input.setDomainName(this.domainName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudsearch.deleteDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch delete-domain")
				.argument("domain-name", domainName)
	}

}


fun AmazonCloudSearchFunctions.deleteExpression(domainName: String, expressionName: String, init: AmazonCloudSearchDeleteExpressionCommand.() -> Unit) {
	this.block.declare(AmazonCloudSearchDeleteExpressionCommand(domainName, expressionName).apply(init))
}

@Generated
class AmazonCloudSearchDeleteExpressionCommand(val domainName: String, val expressionName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.DeleteExpressionRequest> {



	override fun build(): com.amazonaws.services.cloudsearchv2.model.DeleteExpressionRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.DeleteExpressionRequest()
		input.setDomainName(this.domainName)
		input.setExpressionName(this.expressionName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudsearch.deleteExpression(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch delete-expression")
				.argument("domain-name", domainName)
				.argument("expression-name", expressionName)
	}

}


fun AmazonCloudSearchFunctions.deleteIndexField(domainName: String, indexFieldName: String, init: AmazonCloudSearchDeleteIndexFieldCommand.() -> Unit) {
	this.block.declare(AmazonCloudSearchDeleteIndexFieldCommand(domainName, indexFieldName).apply(init))
}

@Generated
class AmazonCloudSearchDeleteIndexFieldCommand(val domainName: String, val indexFieldName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.DeleteIndexFieldRequest> {



	override fun build(): com.amazonaws.services.cloudsearchv2.model.DeleteIndexFieldRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.DeleteIndexFieldRequest()
		input.setDomainName(this.domainName)
		input.setIndexFieldName(this.indexFieldName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudsearch.deleteIndexField(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch delete-index-field")
				.argument("domain-name", domainName)
				.argument("index-field-name", indexFieldName)
	}

}


fun AmazonCloudSearchFunctions.deleteSuggester(domainName: String, suggesterName: String, init: AmazonCloudSearchDeleteSuggesterCommand.() -> Unit) {
	this.block.declare(AmazonCloudSearchDeleteSuggesterCommand(domainName, suggesterName).apply(init))
}

@Generated
class AmazonCloudSearchDeleteSuggesterCommand(val domainName: String, val suggesterName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.DeleteSuggesterRequest> {



	override fun build(): com.amazonaws.services.cloudsearchv2.model.DeleteSuggesterRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.DeleteSuggesterRequest()
		input.setDomainName(this.domainName)
		input.setSuggesterName(this.suggesterName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudsearch.deleteSuggester(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch delete-suggester")
				.argument("domain-name", domainName)
				.argument("suggester-name", suggesterName)
	}

}


fun AmazonCloudSearchFunctions.describeAnalysisSchemes(domainName: String, init: AmazonCloudSearchDescribeAnalysisSchemesCommand.() -> Unit) {
	this.block.declare(AmazonCloudSearchDescribeAnalysisSchemesCommand(domainName).apply(init))
}

@Generated
class AmazonCloudSearchDescribeAnalysisSchemesCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.DescribeAnalysisSchemesRequest> {

	var analysisSchemeNames: List<String>? = null
	var deployed: Boolean? = false

	override fun build(): com.amazonaws.services.cloudsearchv2.model.DescribeAnalysisSchemesRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.DescribeAnalysisSchemesRequest()
		input.setDomainName(this.domainName)
		input.setAnalysisSchemeNames(this.analysisSchemeNames)
		input.setDeployed(this.deployed)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudsearch.describeAnalysisSchemes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch describe-analysis-schemes")
				.argument("domain-name", domainName)
				.argument("analysis-scheme-names", analysisSchemeNames?.toString())
				.option("deployed", deployed ?: false)
	}

}


fun AmazonCloudSearchFunctions.describeAvailabilityOptions(domainName: String, init: AmazonCloudSearchDescribeAvailabilityOptionsCommand.() -> Unit) {
	this.block.declare(AmazonCloudSearchDescribeAvailabilityOptionsCommand(domainName).apply(init))
}

@Generated
class AmazonCloudSearchDescribeAvailabilityOptionsCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.DescribeAvailabilityOptionsRequest> {

	var deployed: Boolean? = false

	override fun build(): com.amazonaws.services.cloudsearchv2.model.DescribeAvailabilityOptionsRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.DescribeAvailabilityOptionsRequest()
		input.setDomainName(this.domainName)
		input.setDeployed(this.deployed)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudsearch.describeAvailabilityOptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch describe-availability-options")
				.argument("domain-name", domainName)
				.option("deployed", deployed ?: false)
	}

}


fun AmazonCloudSearchFunctions.describeDomains(init: AmazonCloudSearchDescribeDomainsCommand.() -> Unit) {
	this.block.declare(AmazonCloudSearchDescribeDomainsCommand().apply(init))
}

@Generated
class AmazonCloudSearchDescribeDomainsCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.DescribeDomainsRequest> {

	var domainNames: List<String>? = null

	override fun build(): com.amazonaws.services.cloudsearchv2.model.DescribeDomainsRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.DescribeDomainsRequest()
		input.setDomainNames(this.domainNames)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudsearch.describeDomains(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch describe-domains")
				.argument("domain-names", domainNames?.toString())
	}

}


fun AmazonCloudSearchFunctions.describeExpressions(domainName: String, init: AmazonCloudSearchDescribeExpressionsCommand.() -> Unit) {
	this.block.declare(AmazonCloudSearchDescribeExpressionsCommand(domainName).apply(init))
}

@Generated
class AmazonCloudSearchDescribeExpressionsCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.DescribeExpressionsRequest> {

	var expressionNames: List<String>? = null
	var deployed: Boolean? = false

	override fun build(): com.amazonaws.services.cloudsearchv2.model.DescribeExpressionsRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.DescribeExpressionsRequest()
		input.setDomainName(this.domainName)
		input.setExpressionNames(this.expressionNames)
		input.setDeployed(this.deployed)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudsearch.describeExpressions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch describe-expressions")
				.argument("domain-name", domainName)
				.argument("expression-names", expressionNames?.toString())
				.option("deployed", deployed ?: false)
	}

}


fun AmazonCloudSearchFunctions.describeIndexFields(domainName: String, init: AmazonCloudSearchDescribeIndexFieldsCommand.() -> Unit) {
	this.block.declare(AmazonCloudSearchDescribeIndexFieldsCommand(domainName).apply(init))
}

@Generated
class AmazonCloudSearchDescribeIndexFieldsCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.DescribeIndexFieldsRequest> {

	var fieldNames: List<String>? = null
	var deployed: Boolean? = false

	override fun build(): com.amazonaws.services.cloudsearchv2.model.DescribeIndexFieldsRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.DescribeIndexFieldsRequest()
		input.setDomainName(this.domainName)
		input.setFieldNames(this.fieldNames)
		input.setDeployed(this.deployed)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudsearch.describeIndexFields(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch describe-index-fields")
				.argument("domain-name", domainName)
				.argument("field-names", fieldNames?.toString())
				.option("deployed", deployed ?: false)
	}

}


fun AmazonCloudSearchFunctions.describeScalingParameters(domainName: String, init: AmazonCloudSearchDescribeScalingParametersCommand.() -> Unit) {
	this.block.declare(AmazonCloudSearchDescribeScalingParametersCommand(domainName).apply(init))
}

@Generated
class AmazonCloudSearchDescribeScalingParametersCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.DescribeScalingParametersRequest> {



	override fun build(): com.amazonaws.services.cloudsearchv2.model.DescribeScalingParametersRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.DescribeScalingParametersRequest()
		input.setDomainName(this.domainName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudsearch.describeScalingParameters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch describe-scaling-parameters")
				.argument("domain-name", domainName)
	}

}


fun AmazonCloudSearchFunctions.describeServiceAccessPolicies(domainName: String, init: AmazonCloudSearchDescribeServiceAccessPoliciesCommand.() -> Unit) {
	this.block.declare(AmazonCloudSearchDescribeServiceAccessPoliciesCommand(domainName).apply(init))
}

@Generated
class AmazonCloudSearchDescribeServiceAccessPoliciesCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.DescribeServiceAccessPoliciesRequest> {

	var deployed: Boolean? = false

	override fun build(): com.amazonaws.services.cloudsearchv2.model.DescribeServiceAccessPoliciesRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.DescribeServiceAccessPoliciesRequest()
		input.setDomainName(this.domainName)
		input.setDeployed(this.deployed)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudsearch.describeServiceAccessPolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch describe-service-access-policies")
				.argument("domain-name", domainName)
				.option("deployed", deployed ?: false)
	}

}


fun AmazonCloudSearchFunctions.describeSuggesters(domainName: String, init: AmazonCloudSearchDescribeSuggestersCommand.() -> Unit) {
	this.block.declare(AmazonCloudSearchDescribeSuggestersCommand(domainName).apply(init))
}

@Generated
class AmazonCloudSearchDescribeSuggestersCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.DescribeSuggestersRequest> {

	var suggesterNames: List<String>? = null
	var deployed: Boolean? = false

	override fun build(): com.amazonaws.services.cloudsearchv2.model.DescribeSuggestersRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.DescribeSuggestersRequest()
		input.setDomainName(this.domainName)
		input.setSuggesterNames(this.suggesterNames)
		input.setDeployed(this.deployed)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudsearch.describeSuggesters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch describe-suggesters")
				.argument("domain-name", domainName)
				.argument("suggester-names", suggesterNames?.toString())
				.option("deployed", deployed ?: false)
	}

}


fun AmazonCloudSearchFunctions.indexDocuments(domainName: String, init: AmazonCloudSearchIndexDocumentsCommand.() -> Unit) {
	this.block.declare(AmazonCloudSearchIndexDocumentsCommand(domainName).apply(init))
}

@Generated
class AmazonCloudSearchIndexDocumentsCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.IndexDocumentsRequest> {



	override fun build(): com.amazonaws.services.cloudsearchv2.model.IndexDocumentsRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.IndexDocumentsRequest()
		input.setDomainName(this.domainName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudsearch.indexDocuments(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch index-documents")
				.argument("domain-name", domainName)
	}

}


fun AmazonCloudSearchFunctions.listDomainNames(init: AmazonCloudSearchListDomainNamesCommand.() -> Unit) {
	this.block.declare(AmazonCloudSearchListDomainNamesCommand().apply(init))
}

@Generated
class AmazonCloudSearchListDomainNamesCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.ListDomainNamesRequest> {



	override fun build(): com.amazonaws.services.cloudsearchv2.model.ListDomainNamesRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.ListDomainNamesRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudsearch.listDomainNames(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch list-domain-names")

	}

}


fun AmazonCloudSearchFunctions.updateAvailabilityOptions(domainName: String, multiAZ: Boolean, init: AmazonCloudSearchUpdateAvailabilityOptionsCommand.() -> Unit) {
	this.block.declare(AmazonCloudSearchUpdateAvailabilityOptionsCommand(domainName, multiAZ).apply(init))
}

@Generated
class AmazonCloudSearchUpdateAvailabilityOptionsCommand(val domainName: String, val multiAZ: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.UpdateAvailabilityOptionsRequest> {



	override fun build(): com.amazonaws.services.cloudsearchv2.model.UpdateAvailabilityOptionsRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.UpdateAvailabilityOptionsRequest()
		input.setDomainName(this.domainName)
		input.setMultiAZ(this.multiAZ)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudsearch.updateAvailabilityOptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch update-availability-options")
				.argument("domain-name", domainName)
				.option("multi-az", multiAZ ?: false)
	}

}


fun AmazonCloudSearchFunctions.updateScalingParameters(domainName: String, scalingParameters: com.amazonaws.services.cloudsearchv2.model.ScalingParameters, init: AmazonCloudSearchUpdateScalingParametersCommand.() -> Unit) {
	this.block.declare(AmazonCloudSearchUpdateScalingParametersCommand(domainName, scalingParameters).apply(init))
}

@Generated
class AmazonCloudSearchUpdateScalingParametersCommand(val domainName: String, val scalingParameters: com.amazonaws.services.cloudsearchv2.model.ScalingParameters) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.UpdateScalingParametersRequest> {



	override fun build(): com.amazonaws.services.cloudsearchv2.model.UpdateScalingParametersRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.UpdateScalingParametersRequest()
		input.setDomainName(this.domainName)
		input.setScalingParameters(this.scalingParameters)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudsearch.updateScalingParameters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch update-scaling-parameters")
				.argument("domain-name", domainName)
				.argument("scaling-parameters", scalingParameters.toString())
	}

}


fun AmazonCloudSearchFunctions.updateServiceAccessPolicies(domainName: String, accessPolicies: String, init: AmazonCloudSearchUpdateServiceAccessPoliciesCommand.() -> Unit) {
	this.block.declare(AmazonCloudSearchUpdateServiceAccessPoliciesCommand(domainName, accessPolicies).apply(init))
}

@Generated
class AmazonCloudSearchUpdateServiceAccessPoliciesCommand(val domainName: String, val accessPolicies: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.UpdateServiceAccessPoliciesRequest> {



	override fun build(): com.amazonaws.services.cloudsearchv2.model.UpdateServiceAccessPoliciesRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.UpdateServiceAccessPoliciesRequest()
		input.setDomainName(this.domainName)
		input.setAccessPolicies(this.accessPolicies)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudsearch.updateServiceAccessPolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch update-service-access-policies")
				.argument("domain-name", domainName)
				.argument("access-policies", accessPolicies)
	}

}
