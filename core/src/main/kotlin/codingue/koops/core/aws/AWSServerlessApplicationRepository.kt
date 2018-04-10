
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.serverlessapplicationrepository.AWSServerlessApplicationRepository
import com.amazonaws.services.serverlessapplicationrepository.model.*

var codingue.koops.core.Environment.serverlessrepo: AWSServerlessApplicationRepository
	get() = this.capabilities[AWSServerlessApplicationRepository::class.java.name] as AWSServerlessApplicationRepository
	set(serverlessrepo) {
		this.capabilities[AWSServerlessApplicationRepository::class.java.name] = serverlessrepo
	}

@Generated
class AWSServerlessApplicationRepositoryFunctions(val block: Block)

infix fun AwsContinuation.serverlessrepo(init: AWSServerlessApplicationRepositoryFunctions.() -> Unit) {
	AWSServerlessApplicationRepositoryFunctions(shell).apply(init)
}

			

fun AWSServerlessApplicationRepositoryFunctions.createApplication(init: AWSServerlessApplicationRepositoryCreateApplicationCommand.() -> Unit) {
	this.block.declare(AWSServerlessApplicationRepositoryCreateApplicationCommand().apply(init))
}

@Generated
class AWSServerlessApplicationRepositoryCreateApplicationCommand() : AmazonWebServiceCommand<com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationRequest> {

	var author: String? = null
	var description: String? = null
	var homePageUrl: String? = null
	var labels: List<String>? = null
	var licenseBody: String? = null
	var licenseUrl: String? = null
	var name: String? = null
	var readmeBody: String? = null
	var readmeUrl: String? = null
	var semanticVersion: String? = null
	var sourceCodeUrl: String? = null
	var spdxLicenseId: String? = null
	var templateBody: String? = null
	var templateUrl: String? = null

	override fun build(): com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationRequest {
		val input = com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationRequest()
		input.setAuthor(this.author)
		input.setDescription(this.description)
		input.setHomePageUrl(this.homePageUrl)
		input.setLabels(this.labels)
		input.setLicenseBody(this.licenseBody)
		input.setLicenseUrl(this.licenseUrl)
		input.setName(this.name)
		input.setReadmeBody(this.readmeBody)
		input.setReadmeUrl(this.readmeUrl)
		input.setSemanticVersion(this.semanticVersion)
		input.setSourceCodeUrl(this.sourceCodeUrl)
		input.setSpdxLicenseId(this.spdxLicenseId)
		input.setTemplateBody(this.templateBody)
		input.setTemplateUrl(this.templateUrl)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.serverlessrepo.createApplication(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws serverlessrepo create-application")
				.argument("author", author)
				.argument("description", description)
				.argument("home-page-url", homePageUrl)
				.argument("labels", labels?.toString())
				.argument("license-body", licenseBody)
				.argument("license-url", licenseUrl)
				.argument("name", name)
				.argument("readme-body", readmeBody)
				.argument("readme-url", readmeUrl)
				.argument("semantic-version", semanticVersion)
				.argument("source-code-url", sourceCodeUrl)
				.argument("spdx-license-id", spdxLicenseId)
				.argument("template-body", templateBody)
				.argument("template-url", templateUrl)
	}

}


fun AWSServerlessApplicationRepositoryFunctions.createApplicationVersion(applicationId: String, semanticVersion: String, init: AWSServerlessApplicationRepositoryCreateApplicationVersionCommand.() -> Unit) {
	this.block.declare(AWSServerlessApplicationRepositoryCreateApplicationVersionCommand(applicationId, semanticVersion).apply(init))
}

@Generated
class AWSServerlessApplicationRepositoryCreateApplicationVersionCommand(val applicationId: String, val semanticVersion: String) : AmazonWebServiceCommand<com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationVersionRequest> {

	var sourceCodeUrl: String? = null
	var templateBody: String? = null
	var templateUrl: String? = null

	override fun build(): com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationVersionRequest {
		val input = com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationVersionRequest()
		input.setApplicationId(this.applicationId)
		input.setSemanticVersion(this.semanticVersion)
		input.setSourceCodeUrl(this.sourceCodeUrl)
		input.setTemplateBody(this.templateBody)
		input.setTemplateUrl(this.templateUrl)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.serverlessrepo.createApplicationVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws serverlessrepo create-application-version")
				.argument("application-id", applicationId)
				.argument("semantic-version", semanticVersion)
				.argument("source-code-url", sourceCodeUrl)
				.argument("template-body", templateBody)
				.argument("template-url", templateUrl)
	}

}


fun AWSServerlessApplicationRepositoryFunctions.createCloudFormationChangeSet(applicationId: String, init: AWSServerlessApplicationRepositoryCreateCloudFormationChangeSetCommand.() -> Unit) {
	this.block.declare(AWSServerlessApplicationRepositoryCreateCloudFormationChangeSetCommand(applicationId).apply(init))
}

@Generated
class AWSServerlessApplicationRepositoryCreateCloudFormationChangeSetCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationChangeSetRequest> {

	var parameterOverrides: List<com.amazonaws.services.serverlessapplicationrepository.model.ParameterValue>? = null
	var semanticVersion: String? = null
	var stackName: String? = null

	override fun build(): com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationChangeSetRequest {
		val input = com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationChangeSetRequest()
		input.setApplicationId(this.applicationId)
		input.setParameterOverrides(this.parameterOverrides)
		input.setSemanticVersion(this.semanticVersion)
		input.setStackName(this.stackName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.serverlessrepo.createCloudFormationChangeSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws serverlessrepo create-cloud-formation-change-set")
				.argument("application-id", applicationId)
				.argument("parameter-overrides", parameterOverrides?.toString())
				.argument("semantic-version", semanticVersion)
				.argument("stack-name", stackName)
	}

}


fun AWSServerlessApplicationRepositoryFunctions.deleteApplication(applicationId: String, init: AWSServerlessApplicationRepositoryDeleteApplicationCommand.() -> Unit) {
	this.block.declare(AWSServerlessApplicationRepositoryDeleteApplicationCommand(applicationId).apply(init))
}

@Generated
class AWSServerlessApplicationRepositoryDeleteApplicationCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.serverlessapplicationrepository.model.DeleteApplicationRequest> {



	override fun build(): com.amazonaws.services.serverlessapplicationrepository.model.DeleteApplicationRequest {
		val input = com.amazonaws.services.serverlessapplicationrepository.model.DeleteApplicationRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.serverlessrepo.deleteApplication(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws serverlessrepo delete-application")
				.argument("application-id", applicationId)
	}

}


fun AWSServerlessApplicationRepositoryFunctions.getApplication(applicationId: String, init: AWSServerlessApplicationRepositoryGetApplicationCommand.() -> Unit) {
	this.block.declare(AWSServerlessApplicationRepositoryGetApplicationCommand(applicationId).apply(init))
}

@Generated
class AWSServerlessApplicationRepositoryGetApplicationCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationRequest> {

	var semanticVersion: String? = null

	override fun build(): com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationRequest {
		val input = com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationRequest()
		input.setApplicationId(this.applicationId)
		input.setSemanticVersion(this.semanticVersion)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.serverlessrepo.getApplication(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws serverlessrepo get-application")
				.argument("application-id", applicationId)
				.argument("semantic-version", semanticVersion)
	}

}


fun AWSServerlessApplicationRepositoryFunctions.getApplicationPolicy(applicationId: String, init: AWSServerlessApplicationRepositoryGetApplicationPolicyCommand.() -> Unit) {
	this.block.declare(AWSServerlessApplicationRepositoryGetApplicationPolicyCommand(applicationId).apply(init))
}

@Generated
class AWSServerlessApplicationRepositoryGetApplicationPolicyCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationPolicyRequest> {



	override fun build(): com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationPolicyRequest {
		val input = com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationPolicyRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.serverlessrepo.getApplicationPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws serverlessrepo get-application-policy")
				.argument("application-id", applicationId)
	}

}


fun AWSServerlessApplicationRepositoryFunctions.listApplicationVersions(applicationId: String, init: AWSServerlessApplicationRepositoryListApplicationVersionsCommand.() -> Unit) {
	this.block.declare(AWSServerlessApplicationRepositoryListApplicationVersionsCommand(applicationId).apply(init))
}

@Generated
class AWSServerlessApplicationRepositoryListApplicationVersionsCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationVersionsRequest> {

	var maxItems: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationVersionsRequest {
		val input = com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationVersionsRequest()
		input.setApplicationId(this.applicationId)
		input.setMaxItems(this.maxItems)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.serverlessrepo.listApplicationVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws serverlessrepo list-application-versions")
				.argument("application-id", applicationId)
				.argument("max-items", maxItems?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSServerlessApplicationRepositoryFunctions.listApplications(init: AWSServerlessApplicationRepositoryListApplicationsCommand.() -> Unit) {
	this.block.declare(AWSServerlessApplicationRepositoryListApplicationsCommand().apply(init))
}

@Generated
class AWSServerlessApplicationRepositoryListApplicationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationsRequest> {

	var maxItems: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationsRequest {
		val input = com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationsRequest()
		input.setMaxItems(this.maxItems)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.serverlessrepo.listApplications(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws serverlessrepo list-applications")
				.argument("max-items", maxItems?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSServerlessApplicationRepositoryFunctions.putApplicationPolicy(applicationId: String, init: AWSServerlessApplicationRepositoryPutApplicationPolicyCommand.() -> Unit) {
	this.block.declare(AWSServerlessApplicationRepositoryPutApplicationPolicyCommand(applicationId).apply(init))
}

@Generated
class AWSServerlessApplicationRepositoryPutApplicationPolicyCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.serverlessapplicationrepository.model.PutApplicationPolicyRequest> {

	var statements: List<com.amazonaws.services.serverlessapplicationrepository.model.ApplicationPolicyStatement>? = null

	override fun build(): com.amazonaws.services.serverlessapplicationrepository.model.PutApplicationPolicyRequest {
		val input = com.amazonaws.services.serverlessapplicationrepository.model.PutApplicationPolicyRequest()
		input.setApplicationId(this.applicationId)
		input.setStatements(this.statements)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.serverlessrepo.putApplicationPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws serverlessrepo put-application-policy")
				.argument("application-id", applicationId)
				.argument("statements", statements?.toString())
	}

}


fun AWSServerlessApplicationRepositoryFunctions.updateApplication(applicationId: String, init: AWSServerlessApplicationRepositoryUpdateApplicationCommand.() -> Unit) {
	this.block.declare(AWSServerlessApplicationRepositoryUpdateApplicationCommand(applicationId).apply(init))
}

@Generated
class AWSServerlessApplicationRepositoryUpdateApplicationCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.serverlessapplicationrepository.model.UpdateApplicationRequest> {

	var author: String? = null
	var description: String? = null
	var homePageUrl: String? = null
	var labels: List<String>? = null
	var readmeBody: String? = null
	var readmeUrl: String? = null

	override fun build(): com.amazonaws.services.serverlessapplicationrepository.model.UpdateApplicationRequest {
		val input = com.amazonaws.services.serverlessapplicationrepository.model.UpdateApplicationRequest()
		input.setApplicationId(this.applicationId)
		input.setAuthor(this.author)
		input.setDescription(this.description)
		input.setHomePageUrl(this.homePageUrl)
		input.setLabels(this.labels)
		input.setReadmeBody(this.readmeBody)
		input.setReadmeUrl(this.readmeUrl)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.serverlessrepo.updateApplication(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws serverlessrepo update-application")
				.argument("application-id", applicationId)
				.argument("author", author)
				.argument("description", description)
				.argument("home-page-url", homePageUrl)
				.argument("labels", labels?.toString())
				.argument("readme-body", readmeBody)
				.argument("readme-url", readmeUrl)
	}

}
