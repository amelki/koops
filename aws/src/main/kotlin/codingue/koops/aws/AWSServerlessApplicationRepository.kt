
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws

import javax.annotation.Generated
import codingue.koops.core.*
import com.amazonaws.services.serverlessapplicationrepository.*
import com.amazonaws.services.serverlessapplicationrepository.model.*

var codingue.koops.core.Environment.serverlessrepo: AWSServerlessApplicationRepository
	get() {
		var service = this.capabilities["aws-serverlessrepo"]
		if (service == null) {
			service = AWSServerlessApplicationRepositoryClientBuilder.standard().build()
			this.capabilities["aws-serverlessrepo"] = service
		}
		return service as AWSServerlessApplicationRepository
	}
	set(serverlessrepo) {
		this.capabilities["aws-serverlessrepo"] = serverlessrepo
	}

@Generated
class AWSServerlessApplicationRepositoryFunctions(val block: Block)

infix fun <T> AwsContinuation.serverlessrepo(init: AWSServerlessApplicationRepositoryFunctions.() -> T): T {
	return AWSServerlessApplicationRepositoryFunctions(shell).run(init)
}

			

fun AWSServerlessApplicationRepositoryFunctions.createApplication(init: AWSServerlessApplicationRepositoryCreateApplicationCommand.() -> Unit): com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationResult {
	return this.block.declare(AWSServerlessApplicationRepositoryCreateApplicationCommand().apply(init)) as com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationResult
}

@Generated
class AWSServerlessApplicationRepositoryCreateApplicationCommand() : AmazonWebServiceCommand<com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationRequest, com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationResult> {

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

	
	override fun dryResult(): com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationResult {
	  return com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationResult {
		return environment.serverlessrepo.createApplication(build())
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


fun AWSServerlessApplicationRepositoryFunctions.createApplicationVersion(applicationId: String, semanticVersion: String, init: AWSServerlessApplicationRepositoryCreateApplicationVersionCommand.() -> Unit): com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationVersionResult {
	return this.block.declare(AWSServerlessApplicationRepositoryCreateApplicationVersionCommand(applicationId, semanticVersion).apply(init)) as com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationVersionResult
}

@Generated
class AWSServerlessApplicationRepositoryCreateApplicationVersionCommand(val applicationId: String, val semanticVersion: String) : AmazonWebServiceCommand<com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationVersionRequest, com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationVersionResult> {

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

	
	override fun dryResult(): com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationVersionResult {
	  return com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationVersionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationVersionResult {
		return environment.serverlessrepo.createApplicationVersion(build())
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


fun AWSServerlessApplicationRepositoryFunctions.createCloudFormationChangeSet(applicationId: String, init: AWSServerlessApplicationRepositoryCreateCloudFormationChangeSetCommand.() -> Unit): com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationChangeSetResult {
	return this.block.declare(AWSServerlessApplicationRepositoryCreateCloudFormationChangeSetCommand(applicationId).apply(init)) as com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationChangeSetResult
}

@Generated
class AWSServerlessApplicationRepositoryCreateCloudFormationChangeSetCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationChangeSetRequest, com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationChangeSetResult> {

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

	
	override fun dryResult(): com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationChangeSetResult {
	  return com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationChangeSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationChangeSetResult {
		return environment.serverlessrepo.createCloudFormationChangeSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws serverlessrepo create-cloud-formation-change-set")
				.argument("application-id", applicationId)
				.argument("parameter-overrides", parameterOverrides?.toString())
				.argument("semantic-version", semanticVersion)
				.argument("stack-name", stackName)
	}

}


fun AWSServerlessApplicationRepositoryFunctions.deleteApplication(applicationId: String, init: AWSServerlessApplicationRepositoryDeleteApplicationCommand.() -> Unit): com.amazonaws.services.serverlessapplicationrepository.model.DeleteApplicationResult {
	return this.block.declare(AWSServerlessApplicationRepositoryDeleteApplicationCommand(applicationId).apply(init)) as com.amazonaws.services.serverlessapplicationrepository.model.DeleteApplicationResult
}

@Generated
class AWSServerlessApplicationRepositoryDeleteApplicationCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.serverlessapplicationrepository.model.DeleteApplicationRequest, com.amazonaws.services.serverlessapplicationrepository.model.DeleteApplicationResult> {



	override fun build(): com.amazonaws.services.serverlessapplicationrepository.model.DeleteApplicationRequest {
		val input = com.amazonaws.services.serverlessapplicationrepository.model.DeleteApplicationRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.serverlessapplicationrepository.model.DeleteApplicationResult {
	  return com.amazonaws.services.serverlessapplicationrepository.model.DeleteApplicationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.serverlessapplicationrepository.model.DeleteApplicationResult {
		return environment.serverlessrepo.deleteApplication(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws serverlessrepo delete-application")
				.argument("application-id", applicationId)
	}

}


fun AWSServerlessApplicationRepositoryFunctions.getApplication(applicationId: String, init: AWSServerlessApplicationRepositoryGetApplicationCommand.() -> Unit): com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationResult {
	return this.block.declare(AWSServerlessApplicationRepositoryGetApplicationCommand(applicationId).apply(init)) as com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationResult
}

@Generated
class AWSServerlessApplicationRepositoryGetApplicationCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationRequest, com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationResult> {

	var semanticVersion: String? = null

	override fun build(): com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationRequest {
		val input = com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationRequest()
		input.setApplicationId(this.applicationId)
		input.setSemanticVersion(this.semanticVersion)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationResult {
	  return com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationResult {
		return environment.serverlessrepo.getApplication(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws serverlessrepo get-application")
				.argument("application-id", applicationId)
				.argument("semantic-version", semanticVersion)
	}

}


fun AWSServerlessApplicationRepositoryFunctions.getApplicationPolicy(applicationId: String, init: AWSServerlessApplicationRepositoryGetApplicationPolicyCommand.() -> Unit): com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationPolicyResult {
	return this.block.declare(AWSServerlessApplicationRepositoryGetApplicationPolicyCommand(applicationId).apply(init)) as com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationPolicyResult
}

@Generated
class AWSServerlessApplicationRepositoryGetApplicationPolicyCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationPolicyRequest, com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationPolicyResult> {



	override fun build(): com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationPolicyRequest {
		val input = com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationPolicyRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationPolicyResult {
	  return com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationPolicyResult {
		return environment.serverlessrepo.getApplicationPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws serverlessrepo get-application-policy")
				.argument("application-id", applicationId)
	}

}


fun AWSServerlessApplicationRepositoryFunctions.listApplicationVersions(applicationId: String, init: AWSServerlessApplicationRepositoryListApplicationVersionsCommand.() -> Unit): com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationVersionsResult {
	return this.block.declare(AWSServerlessApplicationRepositoryListApplicationVersionsCommand(applicationId).apply(init)) as com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationVersionsResult
}

@Generated
class AWSServerlessApplicationRepositoryListApplicationVersionsCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationVersionsRequest, com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationVersionsResult> {

	var maxItems: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationVersionsRequest {
		val input = com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationVersionsRequest()
		input.setApplicationId(this.applicationId)
		input.setMaxItems(this.maxItems)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationVersionsResult {
	  return com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationVersionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationVersionsResult {
		return environment.serverlessrepo.listApplicationVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws serverlessrepo list-application-versions")
				.argument("application-id", applicationId)
				.argument("max-items", maxItems?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSServerlessApplicationRepositoryFunctions.listApplications(init: AWSServerlessApplicationRepositoryListApplicationsCommand.() -> Unit): com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationsResult {
	return this.block.declare(AWSServerlessApplicationRepositoryListApplicationsCommand().apply(init)) as com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationsResult
}

@Generated
class AWSServerlessApplicationRepositoryListApplicationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationsRequest, com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationsResult> {

	var maxItems: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationsRequest {
		val input = com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationsRequest()
		input.setMaxItems(this.maxItems)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationsResult {
	  return com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationsResult {
		return environment.serverlessrepo.listApplications(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws serverlessrepo list-applications")
				.argument("max-items", maxItems?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSServerlessApplicationRepositoryFunctions.putApplicationPolicy(applicationId: String, init: AWSServerlessApplicationRepositoryPutApplicationPolicyCommand.() -> Unit): com.amazonaws.services.serverlessapplicationrepository.model.PutApplicationPolicyResult {
	return this.block.declare(AWSServerlessApplicationRepositoryPutApplicationPolicyCommand(applicationId).apply(init)) as com.amazonaws.services.serverlessapplicationrepository.model.PutApplicationPolicyResult
}

@Generated
class AWSServerlessApplicationRepositoryPutApplicationPolicyCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.serverlessapplicationrepository.model.PutApplicationPolicyRequest, com.amazonaws.services.serverlessapplicationrepository.model.PutApplicationPolicyResult> {

	var statements: List<com.amazonaws.services.serverlessapplicationrepository.model.ApplicationPolicyStatement>? = null

	override fun build(): com.amazonaws.services.serverlessapplicationrepository.model.PutApplicationPolicyRequest {
		val input = com.amazonaws.services.serverlessapplicationrepository.model.PutApplicationPolicyRequest()
		input.setApplicationId(this.applicationId)
		input.setStatements(this.statements)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.serverlessapplicationrepository.model.PutApplicationPolicyResult {
	  return com.amazonaws.services.serverlessapplicationrepository.model.PutApplicationPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.serverlessapplicationrepository.model.PutApplicationPolicyResult {
		return environment.serverlessrepo.putApplicationPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws serverlessrepo put-application-policy")
				.argument("application-id", applicationId)
				.argument("statements", statements?.toString())
	}

}


fun AWSServerlessApplicationRepositoryFunctions.updateApplication(applicationId: String, init: AWSServerlessApplicationRepositoryUpdateApplicationCommand.() -> Unit): com.amazonaws.services.serverlessapplicationrepository.model.UpdateApplicationResult {
	return this.block.declare(AWSServerlessApplicationRepositoryUpdateApplicationCommand(applicationId).apply(init)) as com.amazonaws.services.serverlessapplicationrepository.model.UpdateApplicationResult
}

@Generated
class AWSServerlessApplicationRepositoryUpdateApplicationCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.serverlessapplicationrepository.model.UpdateApplicationRequest, com.amazonaws.services.serverlessapplicationrepository.model.UpdateApplicationResult> {

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

	
	override fun dryResult(): com.amazonaws.services.serverlessapplicationrepository.model.UpdateApplicationResult {
	  return com.amazonaws.services.serverlessapplicationrepository.model.UpdateApplicationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.serverlessapplicationrepository.model.UpdateApplicationResult {
		return environment.serverlessrepo.updateApplication(build())
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
