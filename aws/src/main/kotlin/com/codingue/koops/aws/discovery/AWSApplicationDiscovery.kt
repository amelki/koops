
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package com.codingue.koops.aws.discovery

import javax.annotation.Generated
import com.codingue.koops.common.*
import com.codingue.koops.core.*
import com.codingue.koops.aws.*
import com.amazonaws.services.applicationdiscovery.*
import com.amazonaws.services.applicationdiscovery.model.*

var com.codingue.koops.core.Environment.discovery: AWSApplicationDiscovery
	get() {
		var service = this.capabilities["aws-discovery"]
		if (service == null) {
			service = AWSApplicationDiscoveryClientBuilder.standard().build()
			this.capabilities["aws-discovery"] = service
		}
		return service as AWSApplicationDiscovery
	}
	set(discovery) {
		this.capabilities["aws-discovery"] = discovery
	}

@Generated
class AWSApplicationDiscoveryFunctions(val block: Block)

infix fun <T> AwsContinuation.discovery(init: AWSApplicationDiscoveryFunctions.() -> T): T {
	return AWSApplicationDiscoveryFunctions(shell).run(init)
}

			

fun AWSApplicationDiscoveryFunctions.associateConfigurationItemsToApplication(init: (AWSApplicationDiscoveryAssociateConfigurationItemsToApplicationCommand.() -> Unit)? = null): com.amazonaws.services.applicationdiscovery.model.AssociateConfigurationItemsToApplicationResult {
	return this.block.declare(AWSApplicationDiscoveryAssociateConfigurationItemsToApplicationCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.applicationdiscovery.model.AssociateConfigurationItemsToApplicationResult
}

@Generated
class AWSApplicationDiscoveryAssociateConfigurationItemsToApplicationCommand() : AmazonWebServiceCommand<com.amazonaws.services.applicationdiscovery.model.AssociateConfigurationItemsToApplicationRequest, com.amazonaws.services.applicationdiscovery.model.AssociateConfigurationItemsToApplicationResult> {

	var applicationConfigurationId: String? = null
	var configurationIds: List<String>? = null

	override fun build(): com.amazonaws.services.applicationdiscovery.model.AssociateConfigurationItemsToApplicationRequest {
		val input = com.amazonaws.services.applicationdiscovery.model.AssociateConfigurationItemsToApplicationRequest()
		input.setApplicationConfigurationId(this.applicationConfigurationId)
		input.setConfigurationIds(this.configurationIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.applicationdiscovery.model.AssociateConfigurationItemsToApplicationResult {
	  return com.amazonaws.services.applicationdiscovery.model.AssociateConfigurationItemsToApplicationResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.applicationdiscovery.model.AssociateConfigurationItemsToApplicationResult {
		return environment.discovery.associateConfigurationItemsToApplication(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws discovery associate-configuration-items-to-application")
				.argument("application-configuration-id", applicationConfigurationId)
				.argument("configuration-ids", configurationIds?.toString())
	}

}


fun AWSApplicationDiscoveryFunctions.createApplication(init: (AWSApplicationDiscoveryCreateApplicationCommand.() -> Unit)? = null): com.amazonaws.services.applicationdiscovery.model.CreateApplicationResult {
	return this.block.declare(AWSApplicationDiscoveryCreateApplicationCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.applicationdiscovery.model.CreateApplicationResult
}

@Generated
class AWSApplicationDiscoveryCreateApplicationCommand() : AmazonWebServiceCommand<com.amazonaws.services.applicationdiscovery.model.CreateApplicationRequest, com.amazonaws.services.applicationdiscovery.model.CreateApplicationResult> {

	var name: String? = null
	var description: String? = null

	override fun build(): com.amazonaws.services.applicationdiscovery.model.CreateApplicationRequest {
		val input = com.amazonaws.services.applicationdiscovery.model.CreateApplicationRequest()
		input.setName(this.name)
		input.setDescription(this.description)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.applicationdiscovery.model.CreateApplicationResult {
	  return com.amazonaws.services.applicationdiscovery.model.CreateApplicationResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.applicationdiscovery.model.CreateApplicationResult {
		return environment.discovery.createApplication(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws discovery create-application")
				.argument("name", name)
				.argument("description", description)
	}

}


fun AWSApplicationDiscoveryFunctions.createTags(init: (AWSApplicationDiscoveryCreateTagsCommand.() -> Unit)? = null): com.amazonaws.services.applicationdiscovery.model.CreateTagsResult {
	return this.block.declare(AWSApplicationDiscoveryCreateTagsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.applicationdiscovery.model.CreateTagsResult
}

@Generated
class AWSApplicationDiscoveryCreateTagsCommand() : AmazonWebServiceCommand<com.amazonaws.services.applicationdiscovery.model.CreateTagsRequest, com.amazonaws.services.applicationdiscovery.model.CreateTagsResult> {

	var configurationIds: List<String>? = null
	var tags: List<com.amazonaws.services.applicationdiscovery.model.Tag>? = null

	override fun build(): com.amazonaws.services.applicationdiscovery.model.CreateTagsRequest {
		val input = com.amazonaws.services.applicationdiscovery.model.CreateTagsRequest()
		input.setConfigurationIds(this.configurationIds)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.applicationdiscovery.model.CreateTagsResult {
	  return com.amazonaws.services.applicationdiscovery.model.CreateTagsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.applicationdiscovery.model.CreateTagsResult {
		return environment.discovery.createTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws discovery create-tags")
				.argument("configuration-ids", configurationIds?.toString())
				.argument("tags", tags?.toString())
	}

}


fun AWSApplicationDiscoveryFunctions.deleteApplications(init: (AWSApplicationDiscoveryDeleteApplicationsCommand.() -> Unit)? = null): com.amazonaws.services.applicationdiscovery.model.DeleteApplicationsResult {
	return this.block.declare(AWSApplicationDiscoveryDeleteApplicationsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.applicationdiscovery.model.DeleteApplicationsResult
}

@Generated
class AWSApplicationDiscoveryDeleteApplicationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.applicationdiscovery.model.DeleteApplicationsRequest, com.amazonaws.services.applicationdiscovery.model.DeleteApplicationsResult> {

	var configurationIds: List<String>? = null

	override fun build(): com.amazonaws.services.applicationdiscovery.model.DeleteApplicationsRequest {
		val input = com.amazonaws.services.applicationdiscovery.model.DeleteApplicationsRequest()
		input.setConfigurationIds(this.configurationIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.applicationdiscovery.model.DeleteApplicationsResult {
	  return com.amazonaws.services.applicationdiscovery.model.DeleteApplicationsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.applicationdiscovery.model.DeleteApplicationsResult {
		return environment.discovery.deleteApplications(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws discovery delete-applications")
				.argument("configuration-ids", configurationIds?.toString())
	}

}


fun AWSApplicationDiscoveryFunctions.deleteTags(init: (AWSApplicationDiscoveryDeleteTagsCommand.() -> Unit)? = null): com.amazonaws.services.applicationdiscovery.model.DeleteTagsResult {
	return this.block.declare(AWSApplicationDiscoveryDeleteTagsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.applicationdiscovery.model.DeleteTagsResult
}

@Generated
class AWSApplicationDiscoveryDeleteTagsCommand() : AmazonWebServiceCommand<com.amazonaws.services.applicationdiscovery.model.DeleteTagsRequest, com.amazonaws.services.applicationdiscovery.model.DeleteTagsResult> {

	var configurationIds: List<String>? = null
	var tags: List<com.amazonaws.services.applicationdiscovery.model.Tag>? = null

	override fun build(): com.amazonaws.services.applicationdiscovery.model.DeleteTagsRequest {
		val input = com.amazonaws.services.applicationdiscovery.model.DeleteTagsRequest()
		input.setConfigurationIds(this.configurationIds)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.applicationdiscovery.model.DeleteTagsResult {
	  return com.amazonaws.services.applicationdiscovery.model.DeleteTagsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.applicationdiscovery.model.DeleteTagsResult {
		return environment.discovery.deleteTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws discovery delete-tags")
				.argument("configuration-ids", configurationIds?.toString())
				.argument("tags", tags?.toString())
	}

}


fun AWSApplicationDiscoveryFunctions.describeAgents(init: (AWSApplicationDiscoveryDescribeAgentsCommand.() -> Unit)? = null): com.amazonaws.services.applicationdiscovery.model.DescribeAgentsResult {
	return this.block.declare(AWSApplicationDiscoveryDescribeAgentsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.applicationdiscovery.model.DescribeAgentsResult
}

@Generated
class AWSApplicationDiscoveryDescribeAgentsCommand() : AmazonWebServiceCommand<com.amazonaws.services.applicationdiscovery.model.DescribeAgentsRequest, com.amazonaws.services.applicationdiscovery.model.DescribeAgentsResult> {

	var agentIds: List<String>? = null
	var filters: List<com.amazonaws.services.applicationdiscovery.model.Filter>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.applicationdiscovery.model.DescribeAgentsRequest {
		val input = com.amazonaws.services.applicationdiscovery.model.DescribeAgentsRequest()
		input.setAgentIds(this.agentIds)
		input.setFilters(this.filters)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.applicationdiscovery.model.DescribeAgentsResult {
	  return com.amazonaws.services.applicationdiscovery.model.DescribeAgentsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.applicationdiscovery.model.DescribeAgentsResult {
		return environment.discovery.describeAgents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws discovery describe-agents")
				.argument("agent-ids", agentIds?.toString())
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSApplicationDiscoveryFunctions.describeConfigurations(init: (AWSApplicationDiscoveryDescribeConfigurationsCommand.() -> Unit)? = null): com.amazonaws.services.applicationdiscovery.model.DescribeConfigurationsResult {
	return this.block.declare(AWSApplicationDiscoveryDescribeConfigurationsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.applicationdiscovery.model.DescribeConfigurationsResult
}

@Generated
class AWSApplicationDiscoveryDescribeConfigurationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.applicationdiscovery.model.DescribeConfigurationsRequest, com.amazonaws.services.applicationdiscovery.model.DescribeConfigurationsResult> {

	var configurationIds: List<String>? = null

	override fun build(): com.amazonaws.services.applicationdiscovery.model.DescribeConfigurationsRequest {
		val input = com.amazonaws.services.applicationdiscovery.model.DescribeConfigurationsRequest()
		input.setConfigurationIds(this.configurationIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.applicationdiscovery.model.DescribeConfigurationsResult {
	  return com.amazonaws.services.applicationdiscovery.model.DescribeConfigurationsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.applicationdiscovery.model.DescribeConfigurationsResult {
		return environment.discovery.describeConfigurations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws discovery describe-configurations")
				.argument("configuration-ids", configurationIds?.toString())
	}

}


fun AWSApplicationDiscoveryFunctions.describeExportConfigurations(init: (AWSApplicationDiscoveryDescribeExportConfigurationsCommand.() -> Unit)? = null): com.amazonaws.services.applicationdiscovery.model.DescribeExportConfigurationsResult {
	return this.block.declare(AWSApplicationDiscoveryDescribeExportConfigurationsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.applicationdiscovery.model.DescribeExportConfigurationsResult
}

@Generated
class AWSApplicationDiscoveryDescribeExportConfigurationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.applicationdiscovery.model.DescribeExportConfigurationsRequest, com.amazonaws.services.applicationdiscovery.model.DescribeExportConfigurationsResult> {

	var exportIds: List<String>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.applicationdiscovery.model.DescribeExportConfigurationsRequest {
		val input = com.amazonaws.services.applicationdiscovery.model.DescribeExportConfigurationsRequest()
		input.setExportIds(this.exportIds)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.applicationdiscovery.model.DescribeExportConfigurationsResult {
	  return com.amazonaws.services.applicationdiscovery.model.DescribeExportConfigurationsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.applicationdiscovery.model.DescribeExportConfigurationsResult {
		return environment.discovery.describeExportConfigurations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws discovery describe-export-configurations")
				.argument("export-ids", exportIds?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSApplicationDiscoveryFunctions.describeExportTasks(init: (AWSApplicationDiscoveryDescribeExportTasksCommand.() -> Unit)? = null): com.amazonaws.services.applicationdiscovery.model.DescribeExportTasksResult {
	return this.block.declare(AWSApplicationDiscoveryDescribeExportTasksCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.applicationdiscovery.model.DescribeExportTasksResult
}

@Generated
class AWSApplicationDiscoveryDescribeExportTasksCommand() : AmazonWebServiceCommand<com.amazonaws.services.applicationdiscovery.model.DescribeExportTasksRequest, com.amazonaws.services.applicationdiscovery.model.DescribeExportTasksResult> {

	var exportIds: List<String>? = null
	var filters: List<com.amazonaws.services.applicationdiscovery.model.ExportFilter>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.applicationdiscovery.model.DescribeExportTasksRequest {
		val input = com.amazonaws.services.applicationdiscovery.model.DescribeExportTasksRequest()
		input.setExportIds(this.exportIds)
		input.setFilters(this.filters)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.applicationdiscovery.model.DescribeExportTasksResult {
	  return com.amazonaws.services.applicationdiscovery.model.DescribeExportTasksResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.applicationdiscovery.model.DescribeExportTasksResult {
		return environment.discovery.describeExportTasks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws discovery describe-export-tasks")
				.argument("export-ids", exportIds?.toString())
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSApplicationDiscoveryFunctions.describeTags(init: (AWSApplicationDiscoveryDescribeTagsCommand.() -> Unit)? = null): com.amazonaws.services.applicationdiscovery.model.DescribeTagsResult {
	return this.block.declare(AWSApplicationDiscoveryDescribeTagsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.applicationdiscovery.model.DescribeTagsResult
}

@Generated
class AWSApplicationDiscoveryDescribeTagsCommand() : AmazonWebServiceCommand<com.amazonaws.services.applicationdiscovery.model.DescribeTagsRequest, com.amazonaws.services.applicationdiscovery.model.DescribeTagsResult> {

	var filters: List<com.amazonaws.services.applicationdiscovery.model.TagFilter>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.applicationdiscovery.model.DescribeTagsRequest {
		val input = com.amazonaws.services.applicationdiscovery.model.DescribeTagsRequest()
		input.setFilters(this.filters)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.applicationdiscovery.model.DescribeTagsResult {
	  return com.amazonaws.services.applicationdiscovery.model.DescribeTagsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.applicationdiscovery.model.DescribeTagsResult {
		return environment.discovery.describeTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws discovery describe-tags")
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSApplicationDiscoveryFunctions.disassociateConfigurationItemsFromApplication(init: (AWSApplicationDiscoveryDisassociateConfigurationItemsFromApplicationCommand.() -> Unit)? = null): com.amazonaws.services.applicationdiscovery.model.DisassociateConfigurationItemsFromApplicationResult {
	return this.block.declare(AWSApplicationDiscoveryDisassociateConfigurationItemsFromApplicationCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.applicationdiscovery.model.DisassociateConfigurationItemsFromApplicationResult
}

@Generated
class AWSApplicationDiscoveryDisassociateConfigurationItemsFromApplicationCommand() : AmazonWebServiceCommand<com.amazonaws.services.applicationdiscovery.model.DisassociateConfigurationItemsFromApplicationRequest, com.amazonaws.services.applicationdiscovery.model.DisassociateConfigurationItemsFromApplicationResult> {

	var applicationConfigurationId: String? = null
	var configurationIds: List<String>? = null

	override fun build(): com.amazonaws.services.applicationdiscovery.model.DisassociateConfigurationItemsFromApplicationRequest {
		val input = com.amazonaws.services.applicationdiscovery.model.DisassociateConfigurationItemsFromApplicationRequest()
		input.setApplicationConfigurationId(this.applicationConfigurationId)
		input.setConfigurationIds(this.configurationIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.applicationdiscovery.model.DisassociateConfigurationItemsFromApplicationResult {
	  return com.amazonaws.services.applicationdiscovery.model.DisassociateConfigurationItemsFromApplicationResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.applicationdiscovery.model.DisassociateConfigurationItemsFromApplicationResult {
		return environment.discovery.disassociateConfigurationItemsFromApplication(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws discovery disassociate-configuration-items-from-application")
				.argument("application-configuration-id", applicationConfigurationId)
				.argument("configuration-ids", configurationIds?.toString())
	}

}


fun AWSApplicationDiscoveryFunctions.exportConfigurations(init: (AWSApplicationDiscoveryExportConfigurationsCommand.() -> Unit)? = null): com.amazonaws.services.applicationdiscovery.model.ExportConfigurationsResult {
	return this.block.declare(AWSApplicationDiscoveryExportConfigurationsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.applicationdiscovery.model.ExportConfigurationsResult
}

@Generated
class AWSApplicationDiscoveryExportConfigurationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.applicationdiscovery.model.ExportConfigurationsRequest, com.amazonaws.services.applicationdiscovery.model.ExportConfigurationsResult> {



	override fun build(): com.amazonaws.services.applicationdiscovery.model.ExportConfigurationsRequest {
		val input = com.amazonaws.services.applicationdiscovery.model.ExportConfigurationsRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.applicationdiscovery.model.ExportConfigurationsResult {
	  return com.amazonaws.services.applicationdiscovery.model.ExportConfigurationsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.applicationdiscovery.model.ExportConfigurationsResult {
		return environment.discovery.exportConfigurations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws discovery export-configurations")

	}

}


fun AWSApplicationDiscoveryFunctions.getDiscoverySummary(init: (AWSApplicationDiscoveryGetDiscoverySummaryCommand.() -> Unit)? = null): com.amazonaws.services.applicationdiscovery.model.GetDiscoverySummaryResult {
	return this.block.declare(AWSApplicationDiscoveryGetDiscoverySummaryCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.applicationdiscovery.model.GetDiscoverySummaryResult
}

@Generated
class AWSApplicationDiscoveryGetDiscoverySummaryCommand() : AmazonWebServiceCommand<com.amazonaws.services.applicationdiscovery.model.GetDiscoverySummaryRequest, com.amazonaws.services.applicationdiscovery.model.GetDiscoverySummaryResult> {



	override fun build(): com.amazonaws.services.applicationdiscovery.model.GetDiscoverySummaryRequest {
		val input = com.amazonaws.services.applicationdiscovery.model.GetDiscoverySummaryRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.applicationdiscovery.model.GetDiscoverySummaryResult {
	  return com.amazonaws.services.applicationdiscovery.model.GetDiscoverySummaryResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.applicationdiscovery.model.GetDiscoverySummaryResult {
		return environment.discovery.getDiscoverySummary(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws discovery get-discovery-summary")

	}

}


fun AWSApplicationDiscoveryFunctions.listConfigurations(init: (AWSApplicationDiscoveryListConfigurationsCommand.() -> Unit)? = null): com.amazonaws.services.applicationdiscovery.model.ListConfigurationsResult {
	return this.block.declare(AWSApplicationDiscoveryListConfigurationsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.applicationdiscovery.model.ListConfigurationsResult
}

@Generated
class AWSApplicationDiscoveryListConfigurationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.applicationdiscovery.model.ListConfigurationsRequest, com.amazonaws.services.applicationdiscovery.model.ListConfigurationsResult> {

	var configurationType: ConfigurationItemType? = null
	var filters: List<com.amazonaws.services.applicationdiscovery.model.Filter>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null
	var orderBy: List<com.amazonaws.services.applicationdiscovery.model.OrderByElement>? = null

	override fun build(): com.amazonaws.services.applicationdiscovery.model.ListConfigurationsRequest {
		val input = com.amazonaws.services.applicationdiscovery.model.ListConfigurationsRequest()
		input.setConfigurationType(this.configurationType?.toString())
		input.setFilters(this.filters)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		input.setOrderBy(this.orderBy)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.applicationdiscovery.model.ListConfigurationsResult {
	  return com.amazonaws.services.applicationdiscovery.model.ListConfigurationsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.applicationdiscovery.model.ListConfigurationsResult {
		return environment.discovery.listConfigurations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws discovery list-configurations")
				.argument("configuration-type", configurationType?.toString())
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.argument("order-by", orderBy?.toString())
	}

}


fun AWSApplicationDiscoveryFunctions.listServerNeighbors(init: (AWSApplicationDiscoveryListServerNeighborsCommand.() -> Unit)? = null): com.amazonaws.services.applicationdiscovery.model.ListServerNeighborsResult {
	return this.block.declare(AWSApplicationDiscoveryListServerNeighborsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.applicationdiscovery.model.ListServerNeighborsResult
}

@Generated
class AWSApplicationDiscoveryListServerNeighborsCommand() : AmazonWebServiceCommand<com.amazonaws.services.applicationdiscovery.model.ListServerNeighborsRequest, com.amazonaws.services.applicationdiscovery.model.ListServerNeighborsResult> {

	var configurationId: String? = null
	var portInformationNeeded: Boolean? = false
	var neighborConfigurationIds: List<String>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.applicationdiscovery.model.ListServerNeighborsRequest {
		val input = com.amazonaws.services.applicationdiscovery.model.ListServerNeighborsRequest()
		input.setConfigurationId(this.configurationId)
		input.setPortInformationNeeded(this.portInformationNeeded)
		input.setNeighborConfigurationIds(this.neighborConfigurationIds)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.applicationdiscovery.model.ListServerNeighborsResult {
	  return com.amazonaws.services.applicationdiscovery.model.ListServerNeighborsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.applicationdiscovery.model.ListServerNeighborsResult {
		return environment.discovery.listServerNeighbors(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws discovery list-server-neighbors")
				.argument("configuration-id", configurationId)
				.option("port-information-needed", portInformationNeeded ?: false)
				.argument("neighbor-configuration-ids", neighborConfigurationIds?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSApplicationDiscoveryFunctions.startDataCollectionByAgentIds(init: (AWSApplicationDiscoveryStartDataCollectionByAgentIdsCommand.() -> Unit)? = null): com.amazonaws.services.applicationdiscovery.model.StartDataCollectionByAgentIdsResult {
	return this.block.declare(AWSApplicationDiscoveryStartDataCollectionByAgentIdsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.applicationdiscovery.model.StartDataCollectionByAgentIdsResult
}

@Generated
class AWSApplicationDiscoveryStartDataCollectionByAgentIdsCommand() : AmazonWebServiceCommand<com.amazonaws.services.applicationdiscovery.model.StartDataCollectionByAgentIdsRequest, com.amazonaws.services.applicationdiscovery.model.StartDataCollectionByAgentIdsResult> {

	var agentIds: List<String>? = null

	override fun build(): com.amazonaws.services.applicationdiscovery.model.StartDataCollectionByAgentIdsRequest {
		val input = com.amazonaws.services.applicationdiscovery.model.StartDataCollectionByAgentIdsRequest()
		input.setAgentIds(this.agentIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.applicationdiscovery.model.StartDataCollectionByAgentIdsResult {
	  return com.amazonaws.services.applicationdiscovery.model.StartDataCollectionByAgentIdsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.applicationdiscovery.model.StartDataCollectionByAgentIdsResult {
		return environment.discovery.startDataCollectionByAgentIds(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws discovery start-data-collection-by-agent-ids")
				.argument("agent-ids", agentIds?.toString())
	}

}


fun AWSApplicationDiscoveryFunctions.startExportTask(init: (AWSApplicationDiscoveryStartExportTaskCommand.() -> Unit)? = null): com.amazonaws.services.applicationdiscovery.model.StartExportTaskResult {
	return this.block.declare(AWSApplicationDiscoveryStartExportTaskCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.applicationdiscovery.model.StartExportTaskResult
}

@Generated
class AWSApplicationDiscoveryStartExportTaskCommand() : AmazonWebServiceCommand<com.amazonaws.services.applicationdiscovery.model.StartExportTaskRequest, com.amazonaws.services.applicationdiscovery.model.StartExportTaskResult> {

	var exportDataFormat: List<ExportDataFormat>? = null
	var filters: List<com.amazonaws.services.applicationdiscovery.model.ExportFilter>? = null
	var startTime: java.util.Date? = null
	var endTime: java.util.Date? = null

	override fun build(): com.amazonaws.services.applicationdiscovery.model.StartExportTaskRequest {
		val input = com.amazonaws.services.applicationdiscovery.model.StartExportTaskRequest()
		input.setExportDataFormat(this.exportDataFormat?.map { it.toString() })
		input.setFilters(this.filters)
		input.setStartTime(this.startTime)
		input.setEndTime(this.endTime)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.applicationdiscovery.model.StartExportTaskResult {
	  return com.amazonaws.services.applicationdiscovery.model.StartExportTaskResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.applicationdiscovery.model.StartExportTaskResult {
		return environment.discovery.startExportTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws discovery start-export-task")
				.argument("export-data-format", exportDataFormat?.toString())
				.argument("filters", filters?.toString())
				.argument("start-time", startTime?.toString())
				.argument("end-time", endTime?.toString())
	}

}


fun AWSApplicationDiscoveryFunctions.stopDataCollectionByAgentIds(init: (AWSApplicationDiscoveryStopDataCollectionByAgentIdsCommand.() -> Unit)? = null): com.amazonaws.services.applicationdiscovery.model.StopDataCollectionByAgentIdsResult {
	return this.block.declare(AWSApplicationDiscoveryStopDataCollectionByAgentIdsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.applicationdiscovery.model.StopDataCollectionByAgentIdsResult
}

@Generated
class AWSApplicationDiscoveryStopDataCollectionByAgentIdsCommand() : AmazonWebServiceCommand<com.amazonaws.services.applicationdiscovery.model.StopDataCollectionByAgentIdsRequest, com.amazonaws.services.applicationdiscovery.model.StopDataCollectionByAgentIdsResult> {

	var agentIds: List<String>? = null

	override fun build(): com.amazonaws.services.applicationdiscovery.model.StopDataCollectionByAgentIdsRequest {
		val input = com.amazonaws.services.applicationdiscovery.model.StopDataCollectionByAgentIdsRequest()
		input.setAgentIds(this.agentIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.applicationdiscovery.model.StopDataCollectionByAgentIdsResult {
	  return com.amazonaws.services.applicationdiscovery.model.StopDataCollectionByAgentIdsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.applicationdiscovery.model.StopDataCollectionByAgentIdsResult {
		return environment.discovery.stopDataCollectionByAgentIds(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws discovery stop-data-collection-by-agent-ids")
				.argument("agent-ids", agentIds?.toString())
	}

}


fun AWSApplicationDiscoveryFunctions.updateApplication(init: (AWSApplicationDiscoveryUpdateApplicationCommand.() -> Unit)? = null): com.amazonaws.services.applicationdiscovery.model.UpdateApplicationResult {
	return this.block.declare(AWSApplicationDiscoveryUpdateApplicationCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.applicationdiscovery.model.UpdateApplicationResult
}

@Generated
class AWSApplicationDiscoveryUpdateApplicationCommand() : AmazonWebServiceCommand<com.amazonaws.services.applicationdiscovery.model.UpdateApplicationRequest, com.amazonaws.services.applicationdiscovery.model.UpdateApplicationResult> {

	var configurationId: String? = null
	var name: String? = null
	var description: String? = null

	override fun build(): com.amazonaws.services.applicationdiscovery.model.UpdateApplicationRequest {
		val input = com.amazonaws.services.applicationdiscovery.model.UpdateApplicationRequest()
		input.setConfigurationId(this.configurationId)
		input.setName(this.name)
		input.setDescription(this.description)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.applicationdiscovery.model.UpdateApplicationResult {
	  return com.amazonaws.services.applicationdiscovery.model.UpdateApplicationResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.applicationdiscovery.model.UpdateApplicationResult {
		return environment.discovery.updateApplication(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws discovery update-application")
				.argument("configuration-id", configurationId)
				.argument("name", name)
				.argument("description", description)
	}

}
