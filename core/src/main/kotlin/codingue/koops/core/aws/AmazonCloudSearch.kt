
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceVoidCommand
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

infix fun <T> AwsContinuation.cloudsearch(init: AmazonCloudSearchFunctions.() -> T): T {
	return AmazonCloudSearchFunctions(shell).run(init)
}

			

fun AmazonCloudSearchFunctions.buildSuggesters(domainName: String, init: AmazonCloudSearchBuildSuggestersCommand.() -> Unit): com.amazonaws.services.cloudsearchv2.model.BuildSuggestersResult {
	return this.block.declare(AmazonCloudSearchBuildSuggestersCommand(domainName).apply(init)) as com.amazonaws.services.cloudsearchv2.model.BuildSuggestersResult
}

@Generated
class AmazonCloudSearchBuildSuggestersCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.BuildSuggestersRequest, com.amazonaws.services.cloudsearchv2.model.BuildSuggestersResult> {



	override fun build(): com.amazonaws.services.cloudsearchv2.model.BuildSuggestersRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.BuildSuggestersRequest()
		input.setDomainName(this.domainName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudsearchv2.model.BuildSuggestersResult {
	  return com.amazonaws.services.cloudsearchv2.model.BuildSuggestersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudsearchv2.model.BuildSuggestersResult {
		return environment.cloudsearch.buildSuggesters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch build-suggesters")
				.argument("domain-name", domainName)
	}

}


fun AmazonCloudSearchFunctions.createDomain(domainName: String, init: AmazonCloudSearchCreateDomainCommand.() -> Unit): com.amazonaws.services.cloudsearchv2.model.CreateDomainResult {
	return this.block.declare(AmazonCloudSearchCreateDomainCommand(domainName).apply(init)) as com.amazonaws.services.cloudsearchv2.model.CreateDomainResult
}

@Generated
class AmazonCloudSearchCreateDomainCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.CreateDomainRequest, com.amazonaws.services.cloudsearchv2.model.CreateDomainResult> {



	override fun build(): com.amazonaws.services.cloudsearchv2.model.CreateDomainRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.CreateDomainRequest()
		input.setDomainName(this.domainName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudsearchv2.model.CreateDomainResult {
	  return com.amazonaws.services.cloudsearchv2.model.CreateDomainResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudsearchv2.model.CreateDomainResult {
		return environment.cloudsearch.createDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch create-domain")
				.argument("domain-name", domainName)
	}

}


fun AmazonCloudSearchFunctions.defineAnalysisScheme(domainName: String, analysisScheme: com.amazonaws.services.cloudsearchv2.model.AnalysisScheme, init: AmazonCloudSearchDefineAnalysisSchemeCommand.() -> Unit): com.amazonaws.services.cloudsearchv2.model.DefineAnalysisSchemeResult {
	return this.block.declare(AmazonCloudSearchDefineAnalysisSchemeCommand(domainName, analysisScheme).apply(init)) as com.amazonaws.services.cloudsearchv2.model.DefineAnalysisSchemeResult
}

@Generated
class AmazonCloudSearchDefineAnalysisSchemeCommand(val domainName: String, val analysisScheme: com.amazonaws.services.cloudsearchv2.model.AnalysisScheme) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.DefineAnalysisSchemeRequest, com.amazonaws.services.cloudsearchv2.model.DefineAnalysisSchemeResult> {



	override fun build(): com.amazonaws.services.cloudsearchv2.model.DefineAnalysisSchemeRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.DefineAnalysisSchemeRequest()
		input.setDomainName(this.domainName)
		input.setAnalysisScheme(this.analysisScheme)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudsearchv2.model.DefineAnalysisSchemeResult {
	  return com.amazonaws.services.cloudsearchv2.model.DefineAnalysisSchemeResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudsearchv2.model.DefineAnalysisSchemeResult {
		return environment.cloudsearch.defineAnalysisScheme(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch define-analysis-scheme")
				.argument("domain-name", domainName)
				.argument("analysis-scheme", analysisScheme.toString())
	}

}


fun AmazonCloudSearchFunctions.defineExpression(domainName: String, expression: com.amazonaws.services.cloudsearchv2.model.Expression, init: AmazonCloudSearchDefineExpressionCommand.() -> Unit): com.amazonaws.services.cloudsearchv2.model.DefineExpressionResult {
	return this.block.declare(AmazonCloudSearchDefineExpressionCommand(domainName, expression).apply(init)) as com.amazonaws.services.cloudsearchv2.model.DefineExpressionResult
}

@Generated
class AmazonCloudSearchDefineExpressionCommand(val domainName: String, val expression: com.amazonaws.services.cloudsearchv2.model.Expression) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.DefineExpressionRequest, com.amazonaws.services.cloudsearchv2.model.DefineExpressionResult> {



	override fun build(): com.amazonaws.services.cloudsearchv2.model.DefineExpressionRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.DefineExpressionRequest()
		input.setDomainName(this.domainName)
		input.setExpression(this.expression)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudsearchv2.model.DefineExpressionResult {
	  return com.amazonaws.services.cloudsearchv2.model.DefineExpressionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudsearchv2.model.DefineExpressionResult {
		return environment.cloudsearch.defineExpression(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch define-expression")
				.argument("domain-name", domainName)
				.argument("expression", expression.toString())
	}

}


fun AmazonCloudSearchFunctions.defineIndexField(domainName: String, indexField: com.amazonaws.services.cloudsearchv2.model.IndexField, init: AmazonCloudSearchDefineIndexFieldCommand.() -> Unit): com.amazonaws.services.cloudsearchv2.model.DefineIndexFieldResult {
	return this.block.declare(AmazonCloudSearchDefineIndexFieldCommand(domainName, indexField).apply(init)) as com.amazonaws.services.cloudsearchv2.model.DefineIndexFieldResult
}

@Generated
class AmazonCloudSearchDefineIndexFieldCommand(val domainName: String, val indexField: com.amazonaws.services.cloudsearchv2.model.IndexField) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.DefineIndexFieldRequest, com.amazonaws.services.cloudsearchv2.model.DefineIndexFieldResult> {



	override fun build(): com.amazonaws.services.cloudsearchv2.model.DefineIndexFieldRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.DefineIndexFieldRequest()
		input.setDomainName(this.domainName)
		input.setIndexField(this.indexField)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudsearchv2.model.DefineIndexFieldResult {
	  return com.amazonaws.services.cloudsearchv2.model.DefineIndexFieldResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudsearchv2.model.DefineIndexFieldResult {
		return environment.cloudsearch.defineIndexField(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch define-index-field")
				.argument("domain-name", domainName)
				.argument("index-field", indexField.toString())
	}

}


fun AmazonCloudSearchFunctions.defineSuggester(domainName: String, suggester: com.amazonaws.services.cloudsearchv2.model.Suggester, init: AmazonCloudSearchDefineSuggesterCommand.() -> Unit): com.amazonaws.services.cloudsearchv2.model.DefineSuggesterResult {
	return this.block.declare(AmazonCloudSearchDefineSuggesterCommand(domainName, suggester).apply(init)) as com.amazonaws.services.cloudsearchv2.model.DefineSuggesterResult
}

@Generated
class AmazonCloudSearchDefineSuggesterCommand(val domainName: String, val suggester: com.amazonaws.services.cloudsearchv2.model.Suggester) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.DefineSuggesterRequest, com.amazonaws.services.cloudsearchv2.model.DefineSuggesterResult> {



	override fun build(): com.amazonaws.services.cloudsearchv2.model.DefineSuggesterRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.DefineSuggesterRequest()
		input.setDomainName(this.domainName)
		input.setSuggester(this.suggester)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudsearchv2.model.DefineSuggesterResult {
	  return com.amazonaws.services.cloudsearchv2.model.DefineSuggesterResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudsearchv2.model.DefineSuggesterResult {
		return environment.cloudsearch.defineSuggester(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch define-suggester")
				.argument("domain-name", domainName)
				.argument("suggester", suggester.toString())
	}

}


fun AmazonCloudSearchFunctions.deleteAnalysisScheme(domainName: String, analysisSchemeName: String, init: AmazonCloudSearchDeleteAnalysisSchemeCommand.() -> Unit): com.amazonaws.services.cloudsearchv2.model.DeleteAnalysisSchemeResult {
	return this.block.declare(AmazonCloudSearchDeleteAnalysisSchemeCommand(domainName, analysisSchemeName).apply(init)) as com.amazonaws.services.cloudsearchv2.model.DeleteAnalysisSchemeResult
}

@Generated
class AmazonCloudSearchDeleteAnalysisSchemeCommand(val domainName: String, val analysisSchemeName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.DeleteAnalysisSchemeRequest, com.amazonaws.services.cloudsearchv2.model.DeleteAnalysisSchemeResult> {



	override fun build(): com.amazonaws.services.cloudsearchv2.model.DeleteAnalysisSchemeRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.DeleteAnalysisSchemeRequest()
		input.setDomainName(this.domainName)
		input.setAnalysisSchemeName(this.analysisSchemeName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudsearchv2.model.DeleteAnalysisSchemeResult {
	  return com.amazonaws.services.cloudsearchv2.model.DeleteAnalysisSchemeResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudsearchv2.model.DeleteAnalysisSchemeResult {
		return environment.cloudsearch.deleteAnalysisScheme(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch delete-analysis-scheme")
				.argument("domain-name", domainName)
				.argument("analysis-scheme-name", analysisSchemeName)
	}

}


fun AmazonCloudSearchFunctions.deleteDomain(domainName: String, init: AmazonCloudSearchDeleteDomainCommand.() -> Unit): com.amazonaws.services.cloudsearchv2.model.DeleteDomainResult {
	return this.block.declare(AmazonCloudSearchDeleteDomainCommand(domainName).apply(init)) as com.amazonaws.services.cloudsearchv2.model.DeleteDomainResult
}

@Generated
class AmazonCloudSearchDeleteDomainCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.DeleteDomainRequest, com.amazonaws.services.cloudsearchv2.model.DeleteDomainResult> {



	override fun build(): com.amazonaws.services.cloudsearchv2.model.DeleteDomainRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.DeleteDomainRequest()
		input.setDomainName(this.domainName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudsearchv2.model.DeleteDomainResult {
	  return com.amazonaws.services.cloudsearchv2.model.DeleteDomainResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudsearchv2.model.DeleteDomainResult {
		return environment.cloudsearch.deleteDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch delete-domain")
				.argument("domain-name", domainName)
	}

}


fun AmazonCloudSearchFunctions.deleteExpression(domainName: String, expressionName: String, init: AmazonCloudSearchDeleteExpressionCommand.() -> Unit): com.amazonaws.services.cloudsearchv2.model.DeleteExpressionResult {
	return this.block.declare(AmazonCloudSearchDeleteExpressionCommand(domainName, expressionName).apply(init)) as com.amazonaws.services.cloudsearchv2.model.DeleteExpressionResult
}

@Generated
class AmazonCloudSearchDeleteExpressionCommand(val domainName: String, val expressionName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.DeleteExpressionRequest, com.amazonaws.services.cloudsearchv2.model.DeleteExpressionResult> {



	override fun build(): com.amazonaws.services.cloudsearchv2.model.DeleteExpressionRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.DeleteExpressionRequest()
		input.setDomainName(this.domainName)
		input.setExpressionName(this.expressionName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudsearchv2.model.DeleteExpressionResult {
	  return com.amazonaws.services.cloudsearchv2.model.DeleteExpressionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudsearchv2.model.DeleteExpressionResult {
		return environment.cloudsearch.deleteExpression(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch delete-expression")
				.argument("domain-name", domainName)
				.argument("expression-name", expressionName)
	}

}


fun AmazonCloudSearchFunctions.deleteIndexField(domainName: String, indexFieldName: String, init: AmazonCloudSearchDeleteIndexFieldCommand.() -> Unit): com.amazonaws.services.cloudsearchv2.model.DeleteIndexFieldResult {
	return this.block.declare(AmazonCloudSearchDeleteIndexFieldCommand(domainName, indexFieldName).apply(init)) as com.amazonaws.services.cloudsearchv2.model.DeleteIndexFieldResult
}

@Generated
class AmazonCloudSearchDeleteIndexFieldCommand(val domainName: String, val indexFieldName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.DeleteIndexFieldRequest, com.amazonaws.services.cloudsearchv2.model.DeleteIndexFieldResult> {



	override fun build(): com.amazonaws.services.cloudsearchv2.model.DeleteIndexFieldRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.DeleteIndexFieldRequest()
		input.setDomainName(this.domainName)
		input.setIndexFieldName(this.indexFieldName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudsearchv2.model.DeleteIndexFieldResult {
	  return com.amazonaws.services.cloudsearchv2.model.DeleteIndexFieldResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudsearchv2.model.DeleteIndexFieldResult {
		return environment.cloudsearch.deleteIndexField(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch delete-index-field")
				.argument("domain-name", domainName)
				.argument("index-field-name", indexFieldName)
	}

}


fun AmazonCloudSearchFunctions.deleteSuggester(domainName: String, suggesterName: String, init: AmazonCloudSearchDeleteSuggesterCommand.() -> Unit): com.amazonaws.services.cloudsearchv2.model.DeleteSuggesterResult {
	return this.block.declare(AmazonCloudSearchDeleteSuggesterCommand(domainName, suggesterName).apply(init)) as com.amazonaws.services.cloudsearchv2.model.DeleteSuggesterResult
}

@Generated
class AmazonCloudSearchDeleteSuggesterCommand(val domainName: String, val suggesterName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.DeleteSuggesterRequest, com.amazonaws.services.cloudsearchv2.model.DeleteSuggesterResult> {



	override fun build(): com.amazonaws.services.cloudsearchv2.model.DeleteSuggesterRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.DeleteSuggesterRequest()
		input.setDomainName(this.domainName)
		input.setSuggesterName(this.suggesterName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudsearchv2.model.DeleteSuggesterResult {
	  return com.amazonaws.services.cloudsearchv2.model.DeleteSuggesterResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudsearchv2.model.DeleteSuggesterResult {
		return environment.cloudsearch.deleteSuggester(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch delete-suggester")
				.argument("domain-name", domainName)
				.argument("suggester-name", suggesterName)
	}

}


fun AmazonCloudSearchFunctions.describeAnalysisSchemes(domainName: String, init: AmazonCloudSearchDescribeAnalysisSchemesCommand.() -> Unit): com.amazonaws.services.cloudsearchv2.model.DescribeAnalysisSchemesResult {
	return this.block.declare(AmazonCloudSearchDescribeAnalysisSchemesCommand(domainName).apply(init)) as com.amazonaws.services.cloudsearchv2.model.DescribeAnalysisSchemesResult
}

@Generated
class AmazonCloudSearchDescribeAnalysisSchemesCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.DescribeAnalysisSchemesRequest, com.amazonaws.services.cloudsearchv2.model.DescribeAnalysisSchemesResult> {

	var analysisSchemeNames: List<String>? = null
	var deployed: Boolean? = false

	override fun build(): com.amazonaws.services.cloudsearchv2.model.DescribeAnalysisSchemesRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.DescribeAnalysisSchemesRequest()
		input.setDomainName(this.domainName)
		input.setAnalysisSchemeNames(this.analysisSchemeNames)
		input.setDeployed(this.deployed)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudsearchv2.model.DescribeAnalysisSchemesResult {
	  return com.amazonaws.services.cloudsearchv2.model.DescribeAnalysisSchemesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudsearchv2.model.DescribeAnalysisSchemesResult {
		return environment.cloudsearch.describeAnalysisSchemes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch describe-analysis-schemes")
				.argument("domain-name", domainName)
				.argument("analysis-scheme-names", analysisSchemeNames?.toString())
				.option("deployed", deployed ?: false)
	}

}


fun AmazonCloudSearchFunctions.describeAvailabilityOptions(domainName: String, init: AmazonCloudSearchDescribeAvailabilityOptionsCommand.() -> Unit): com.amazonaws.services.cloudsearchv2.model.DescribeAvailabilityOptionsResult {
	return this.block.declare(AmazonCloudSearchDescribeAvailabilityOptionsCommand(domainName).apply(init)) as com.amazonaws.services.cloudsearchv2.model.DescribeAvailabilityOptionsResult
}

@Generated
class AmazonCloudSearchDescribeAvailabilityOptionsCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.DescribeAvailabilityOptionsRequest, com.amazonaws.services.cloudsearchv2.model.DescribeAvailabilityOptionsResult> {

	var deployed: Boolean? = false

	override fun build(): com.amazonaws.services.cloudsearchv2.model.DescribeAvailabilityOptionsRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.DescribeAvailabilityOptionsRequest()
		input.setDomainName(this.domainName)
		input.setDeployed(this.deployed)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudsearchv2.model.DescribeAvailabilityOptionsResult {
	  return com.amazonaws.services.cloudsearchv2.model.DescribeAvailabilityOptionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudsearchv2.model.DescribeAvailabilityOptionsResult {
		return environment.cloudsearch.describeAvailabilityOptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch describe-availability-options")
				.argument("domain-name", domainName)
				.option("deployed", deployed ?: false)
	}

}


fun AmazonCloudSearchFunctions.describeDomains(init: AmazonCloudSearchDescribeDomainsCommand.() -> Unit): com.amazonaws.services.cloudsearchv2.model.DescribeDomainsResult {
	return this.block.declare(AmazonCloudSearchDescribeDomainsCommand().apply(init)) as com.amazonaws.services.cloudsearchv2.model.DescribeDomainsResult
}

@Generated
class AmazonCloudSearchDescribeDomainsCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.DescribeDomainsRequest, com.amazonaws.services.cloudsearchv2.model.DescribeDomainsResult> {

	var domainNames: List<String>? = null

	override fun build(): com.amazonaws.services.cloudsearchv2.model.DescribeDomainsRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.DescribeDomainsRequest()
		input.setDomainNames(this.domainNames)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudsearchv2.model.DescribeDomainsResult {
	  return com.amazonaws.services.cloudsearchv2.model.DescribeDomainsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudsearchv2.model.DescribeDomainsResult {
		return environment.cloudsearch.describeDomains(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch describe-domains")
				.argument("domain-names", domainNames?.toString())
	}

}


fun AmazonCloudSearchFunctions.describeExpressions(domainName: String, init: AmazonCloudSearchDescribeExpressionsCommand.() -> Unit): com.amazonaws.services.cloudsearchv2.model.DescribeExpressionsResult {
	return this.block.declare(AmazonCloudSearchDescribeExpressionsCommand(domainName).apply(init)) as com.amazonaws.services.cloudsearchv2.model.DescribeExpressionsResult
}

@Generated
class AmazonCloudSearchDescribeExpressionsCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.DescribeExpressionsRequest, com.amazonaws.services.cloudsearchv2.model.DescribeExpressionsResult> {

	var expressionNames: List<String>? = null
	var deployed: Boolean? = false

	override fun build(): com.amazonaws.services.cloudsearchv2.model.DescribeExpressionsRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.DescribeExpressionsRequest()
		input.setDomainName(this.domainName)
		input.setExpressionNames(this.expressionNames)
		input.setDeployed(this.deployed)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudsearchv2.model.DescribeExpressionsResult {
	  return com.amazonaws.services.cloudsearchv2.model.DescribeExpressionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudsearchv2.model.DescribeExpressionsResult {
		return environment.cloudsearch.describeExpressions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch describe-expressions")
				.argument("domain-name", domainName)
				.argument("expression-names", expressionNames?.toString())
				.option("deployed", deployed ?: false)
	}

}


fun AmazonCloudSearchFunctions.describeIndexFields(domainName: String, init: AmazonCloudSearchDescribeIndexFieldsCommand.() -> Unit): com.amazonaws.services.cloudsearchv2.model.DescribeIndexFieldsResult {
	return this.block.declare(AmazonCloudSearchDescribeIndexFieldsCommand(domainName).apply(init)) as com.amazonaws.services.cloudsearchv2.model.DescribeIndexFieldsResult
}

@Generated
class AmazonCloudSearchDescribeIndexFieldsCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.DescribeIndexFieldsRequest, com.amazonaws.services.cloudsearchv2.model.DescribeIndexFieldsResult> {

	var fieldNames: List<String>? = null
	var deployed: Boolean? = false

	override fun build(): com.amazonaws.services.cloudsearchv2.model.DescribeIndexFieldsRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.DescribeIndexFieldsRequest()
		input.setDomainName(this.domainName)
		input.setFieldNames(this.fieldNames)
		input.setDeployed(this.deployed)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudsearchv2.model.DescribeIndexFieldsResult {
	  return com.amazonaws.services.cloudsearchv2.model.DescribeIndexFieldsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudsearchv2.model.DescribeIndexFieldsResult {
		return environment.cloudsearch.describeIndexFields(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch describe-index-fields")
				.argument("domain-name", domainName)
				.argument("field-names", fieldNames?.toString())
				.option("deployed", deployed ?: false)
	}

}


fun AmazonCloudSearchFunctions.describeScalingParameters(domainName: String, init: AmazonCloudSearchDescribeScalingParametersCommand.() -> Unit): com.amazonaws.services.cloudsearchv2.model.DescribeScalingParametersResult {
	return this.block.declare(AmazonCloudSearchDescribeScalingParametersCommand(domainName).apply(init)) as com.amazonaws.services.cloudsearchv2.model.DescribeScalingParametersResult
}

@Generated
class AmazonCloudSearchDescribeScalingParametersCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.DescribeScalingParametersRequest, com.amazonaws.services.cloudsearchv2.model.DescribeScalingParametersResult> {



	override fun build(): com.amazonaws.services.cloudsearchv2.model.DescribeScalingParametersRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.DescribeScalingParametersRequest()
		input.setDomainName(this.domainName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudsearchv2.model.DescribeScalingParametersResult {
	  return com.amazonaws.services.cloudsearchv2.model.DescribeScalingParametersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudsearchv2.model.DescribeScalingParametersResult {
		return environment.cloudsearch.describeScalingParameters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch describe-scaling-parameters")
				.argument("domain-name", domainName)
	}

}


fun AmazonCloudSearchFunctions.describeServiceAccessPolicies(domainName: String, init: AmazonCloudSearchDescribeServiceAccessPoliciesCommand.() -> Unit): com.amazonaws.services.cloudsearchv2.model.DescribeServiceAccessPoliciesResult {
	return this.block.declare(AmazonCloudSearchDescribeServiceAccessPoliciesCommand(domainName).apply(init)) as com.amazonaws.services.cloudsearchv2.model.DescribeServiceAccessPoliciesResult
}

@Generated
class AmazonCloudSearchDescribeServiceAccessPoliciesCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.DescribeServiceAccessPoliciesRequest, com.amazonaws.services.cloudsearchv2.model.DescribeServiceAccessPoliciesResult> {

	var deployed: Boolean? = false

	override fun build(): com.amazonaws.services.cloudsearchv2.model.DescribeServiceAccessPoliciesRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.DescribeServiceAccessPoliciesRequest()
		input.setDomainName(this.domainName)
		input.setDeployed(this.deployed)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudsearchv2.model.DescribeServiceAccessPoliciesResult {
	  return com.amazonaws.services.cloudsearchv2.model.DescribeServiceAccessPoliciesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudsearchv2.model.DescribeServiceAccessPoliciesResult {
		return environment.cloudsearch.describeServiceAccessPolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch describe-service-access-policies")
				.argument("domain-name", domainName)
				.option("deployed", deployed ?: false)
	}

}


fun AmazonCloudSearchFunctions.describeSuggesters(domainName: String, init: AmazonCloudSearchDescribeSuggestersCommand.() -> Unit): com.amazonaws.services.cloudsearchv2.model.DescribeSuggestersResult {
	return this.block.declare(AmazonCloudSearchDescribeSuggestersCommand(domainName).apply(init)) as com.amazonaws.services.cloudsearchv2.model.DescribeSuggestersResult
}

@Generated
class AmazonCloudSearchDescribeSuggestersCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.DescribeSuggestersRequest, com.amazonaws.services.cloudsearchv2.model.DescribeSuggestersResult> {

	var suggesterNames: List<String>? = null
	var deployed: Boolean? = false

	override fun build(): com.amazonaws.services.cloudsearchv2.model.DescribeSuggestersRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.DescribeSuggestersRequest()
		input.setDomainName(this.domainName)
		input.setSuggesterNames(this.suggesterNames)
		input.setDeployed(this.deployed)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudsearchv2.model.DescribeSuggestersResult {
	  return com.amazonaws.services.cloudsearchv2.model.DescribeSuggestersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudsearchv2.model.DescribeSuggestersResult {
		return environment.cloudsearch.describeSuggesters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch describe-suggesters")
				.argument("domain-name", domainName)
				.argument("suggester-names", suggesterNames?.toString())
				.option("deployed", deployed ?: false)
	}

}


fun AmazonCloudSearchFunctions.indexDocuments(domainName: String, init: AmazonCloudSearchIndexDocumentsCommand.() -> Unit): com.amazonaws.services.cloudsearchv2.model.IndexDocumentsResult {
	return this.block.declare(AmazonCloudSearchIndexDocumentsCommand(domainName).apply(init)) as com.amazonaws.services.cloudsearchv2.model.IndexDocumentsResult
}

@Generated
class AmazonCloudSearchIndexDocumentsCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.IndexDocumentsRequest, com.amazonaws.services.cloudsearchv2.model.IndexDocumentsResult> {



	override fun build(): com.amazonaws.services.cloudsearchv2.model.IndexDocumentsRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.IndexDocumentsRequest()
		input.setDomainName(this.domainName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudsearchv2.model.IndexDocumentsResult {
	  return com.amazonaws.services.cloudsearchv2.model.IndexDocumentsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudsearchv2.model.IndexDocumentsResult {
		return environment.cloudsearch.indexDocuments(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch index-documents")
				.argument("domain-name", domainName)
	}

}


fun AmazonCloudSearchFunctions.listDomainNames(init: AmazonCloudSearchListDomainNamesCommand.() -> Unit): com.amazonaws.services.cloudsearchv2.model.ListDomainNamesResult {
	return this.block.declare(AmazonCloudSearchListDomainNamesCommand().apply(init)) as com.amazonaws.services.cloudsearchv2.model.ListDomainNamesResult
}

@Generated
class AmazonCloudSearchListDomainNamesCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.ListDomainNamesRequest, com.amazonaws.services.cloudsearchv2.model.ListDomainNamesResult> {



	override fun build(): com.amazonaws.services.cloudsearchv2.model.ListDomainNamesRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.ListDomainNamesRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudsearchv2.model.ListDomainNamesResult {
	  return com.amazonaws.services.cloudsearchv2.model.ListDomainNamesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudsearchv2.model.ListDomainNamesResult {
		return environment.cloudsearch.listDomainNames(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch list-domain-names")

	}

}


fun AmazonCloudSearchFunctions.updateAvailabilityOptions(domainName: String, multiAZ: Boolean, init: AmazonCloudSearchUpdateAvailabilityOptionsCommand.() -> Unit): com.amazonaws.services.cloudsearchv2.model.UpdateAvailabilityOptionsResult {
	return this.block.declare(AmazonCloudSearchUpdateAvailabilityOptionsCommand(domainName, multiAZ).apply(init)) as com.amazonaws.services.cloudsearchv2.model.UpdateAvailabilityOptionsResult
}

@Generated
class AmazonCloudSearchUpdateAvailabilityOptionsCommand(val domainName: String, val multiAZ: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.UpdateAvailabilityOptionsRequest, com.amazonaws.services.cloudsearchv2.model.UpdateAvailabilityOptionsResult> {



	override fun build(): com.amazonaws.services.cloudsearchv2.model.UpdateAvailabilityOptionsRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.UpdateAvailabilityOptionsRequest()
		input.setDomainName(this.domainName)
		input.setMultiAZ(this.multiAZ)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudsearchv2.model.UpdateAvailabilityOptionsResult {
	  return com.amazonaws.services.cloudsearchv2.model.UpdateAvailabilityOptionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudsearchv2.model.UpdateAvailabilityOptionsResult {
		return environment.cloudsearch.updateAvailabilityOptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch update-availability-options")
				.argument("domain-name", domainName)
				.option("multi-az", multiAZ ?: false)
	}

}


fun AmazonCloudSearchFunctions.updateScalingParameters(domainName: String, scalingParameters: com.amazonaws.services.cloudsearchv2.model.ScalingParameters, init: AmazonCloudSearchUpdateScalingParametersCommand.() -> Unit): com.amazonaws.services.cloudsearchv2.model.UpdateScalingParametersResult {
	return this.block.declare(AmazonCloudSearchUpdateScalingParametersCommand(domainName, scalingParameters).apply(init)) as com.amazonaws.services.cloudsearchv2.model.UpdateScalingParametersResult
}

@Generated
class AmazonCloudSearchUpdateScalingParametersCommand(val domainName: String, val scalingParameters: com.amazonaws.services.cloudsearchv2.model.ScalingParameters) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.UpdateScalingParametersRequest, com.amazonaws.services.cloudsearchv2.model.UpdateScalingParametersResult> {



	override fun build(): com.amazonaws.services.cloudsearchv2.model.UpdateScalingParametersRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.UpdateScalingParametersRequest()
		input.setDomainName(this.domainName)
		input.setScalingParameters(this.scalingParameters)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudsearchv2.model.UpdateScalingParametersResult {
	  return com.amazonaws.services.cloudsearchv2.model.UpdateScalingParametersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudsearchv2.model.UpdateScalingParametersResult {
		return environment.cloudsearch.updateScalingParameters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch update-scaling-parameters")
				.argument("domain-name", domainName)
				.argument("scaling-parameters", scalingParameters.toString())
	}

}


fun AmazonCloudSearchFunctions.updateServiceAccessPolicies(domainName: String, accessPolicies: String, init: AmazonCloudSearchUpdateServiceAccessPoliciesCommand.() -> Unit): com.amazonaws.services.cloudsearchv2.model.UpdateServiceAccessPoliciesResult {
	return this.block.declare(AmazonCloudSearchUpdateServiceAccessPoliciesCommand(domainName, accessPolicies).apply(init)) as com.amazonaws.services.cloudsearchv2.model.UpdateServiceAccessPoliciesResult
}

@Generated
class AmazonCloudSearchUpdateServiceAccessPoliciesCommand(val domainName: String, val accessPolicies: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchv2.model.UpdateServiceAccessPoliciesRequest, com.amazonaws.services.cloudsearchv2.model.UpdateServiceAccessPoliciesResult> {



	override fun build(): com.amazonaws.services.cloudsearchv2.model.UpdateServiceAccessPoliciesRequest {
		val input = com.amazonaws.services.cloudsearchv2.model.UpdateServiceAccessPoliciesRequest()
		input.setDomainName(this.domainName)
		input.setAccessPolicies(this.accessPolicies)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudsearchv2.model.UpdateServiceAccessPoliciesResult {
	  return com.amazonaws.services.cloudsearchv2.model.UpdateServiceAccessPoliciesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudsearchv2.model.UpdateServiceAccessPoliciesResult {
		return environment.cloudsearch.updateServiceAccessPolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearch update-service-access-policies")
				.argument("domain-name", domainName)
				.argument("access-policies", accessPolicies)
	}

}
