
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.applicationdiscovery.AWSApplicationDiscovery
import com.amazonaws.services.applicationdiscovery.model.*

var codingue.koops.core.Environment.discovery: AWSApplicationDiscovery
	get() = this.capabilities[AWSApplicationDiscovery::class.java.name] as AWSApplicationDiscovery
	set(discovery) {
		this.capabilities[AWSApplicationDiscovery::class.java.name] = discovery
	}

@Generated
class AWSApplicationDiscoveryFunctions(val block: Block)

infix fun AwsContinuation.discovery(init: AWSApplicationDiscoveryFunctions.() -> Unit) {
	AWSApplicationDiscoveryFunctions(shell).apply(init)
}

			

fun AWSApplicationDiscoveryFunctions.associateConfigurationItemsToApplication(init: AWSApplicationDiscoveryAssociateConfigurationItemsToApplicationCommand.() -> Unit) {
	this.block.declare(AWSApplicationDiscoveryAssociateConfigurationItemsToApplicationCommand().apply(init))
}

@Generated
class AWSApplicationDiscoveryAssociateConfigurationItemsToApplicationCommand() : AmazonWebServiceCommand<com.amazonaws.services.applicationdiscovery.model.AssociateConfigurationItemsToApplicationRequest> {

	var applicationConfigurationId: String? = null
	var configurationIds: List<String>? = null

	override fun build(): com.amazonaws.services.applicationdiscovery.model.AssociateConfigurationItemsToApplicationRequest {
		val input = com.amazonaws.services.applicationdiscovery.model.AssociateConfigurationItemsToApplicationRequest()
		input.setApplicationConfigurationId(this.applicationConfigurationId)
		input.setConfigurationIds(this.configurationIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.discovery.associateConfigurationItemsToApplication(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws discovery associate-configuration-items-to-application")
				.argument("application-configuration-id", applicationConfigurationId)
				.argument("configuration-ids", configurationIds?.toString())
	}

}


fun AWSApplicationDiscoveryFunctions.createApplication(init: AWSApplicationDiscoveryCreateApplicationCommand.() -> Unit) {
	this.block.declare(AWSApplicationDiscoveryCreateApplicationCommand().apply(init))
}

@Generated
class AWSApplicationDiscoveryCreateApplicationCommand() : AmazonWebServiceCommand<com.amazonaws.services.applicationdiscovery.model.CreateApplicationRequest> {

	var name: String? = null
	var description: String? = null

	override fun build(): com.amazonaws.services.applicationdiscovery.model.CreateApplicationRequest {
		val input = com.amazonaws.services.applicationdiscovery.model.CreateApplicationRequest()
		input.setName(this.name)
		input.setDescription(this.description)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.discovery.createApplication(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws discovery create-application")
				.argument("name", name)
				.argument("description", description)
	}

}


fun AWSApplicationDiscoveryFunctions.createTags(init: AWSApplicationDiscoveryCreateTagsCommand.() -> Unit) {
	this.block.declare(AWSApplicationDiscoveryCreateTagsCommand().apply(init))
}

@Generated
class AWSApplicationDiscoveryCreateTagsCommand() : AmazonWebServiceCommand<com.amazonaws.services.applicationdiscovery.model.CreateTagsRequest> {

	var configurationIds: List<String>? = null
	var tags: List<com.amazonaws.services.applicationdiscovery.model.Tag>? = null

	override fun build(): com.amazonaws.services.applicationdiscovery.model.CreateTagsRequest {
		val input = com.amazonaws.services.applicationdiscovery.model.CreateTagsRequest()
		input.setConfigurationIds(this.configurationIds)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.discovery.createTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws discovery create-tags")
				.argument("configuration-ids", configurationIds?.toString())
				.argument("tags", tags?.toString())
	}

}


fun AWSApplicationDiscoveryFunctions.deleteApplications(init: AWSApplicationDiscoveryDeleteApplicationsCommand.() -> Unit) {
	this.block.declare(AWSApplicationDiscoveryDeleteApplicationsCommand().apply(init))
}

@Generated
class AWSApplicationDiscoveryDeleteApplicationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.applicationdiscovery.model.DeleteApplicationsRequest> {

	var configurationIds: List<String>? = null

	override fun build(): com.amazonaws.services.applicationdiscovery.model.DeleteApplicationsRequest {
		val input = com.amazonaws.services.applicationdiscovery.model.DeleteApplicationsRequest()
		input.setConfigurationIds(this.configurationIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.discovery.deleteApplications(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws discovery delete-applications")
				.argument("configuration-ids", configurationIds?.toString())
	}

}


fun AWSApplicationDiscoveryFunctions.deleteTags(init: AWSApplicationDiscoveryDeleteTagsCommand.() -> Unit) {
	this.block.declare(AWSApplicationDiscoveryDeleteTagsCommand().apply(init))
}

@Generated
class AWSApplicationDiscoveryDeleteTagsCommand() : AmazonWebServiceCommand<com.amazonaws.services.applicationdiscovery.model.DeleteTagsRequest> {

	var configurationIds: List<String>? = null
	var tags: List<com.amazonaws.services.applicationdiscovery.model.Tag>? = null

	override fun build(): com.amazonaws.services.applicationdiscovery.model.DeleteTagsRequest {
		val input = com.amazonaws.services.applicationdiscovery.model.DeleteTagsRequest()
		input.setConfigurationIds(this.configurationIds)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.discovery.deleteTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws discovery delete-tags")
				.argument("configuration-ids", configurationIds?.toString())
				.argument("tags", tags?.toString())
	}

}


fun AWSApplicationDiscoveryFunctions.describeAgents(init: AWSApplicationDiscoveryDescribeAgentsCommand.() -> Unit) {
	this.block.declare(AWSApplicationDiscoveryDescribeAgentsCommand().apply(init))
}

@Generated
class AWSApplicationDiscoveryDescribeAgentsCommand() : AmazonWebServiceCommand<com.amazonaws.services.applicationdiscovery.model.DescribeAgentsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.discovery.describeAgents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws discovery describe-agents")
				.argument("agent-ids", agentIds?.toString())
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSApplicationDiscoveryFunctions.describeConfigurations(init: AWSApplicationDiscoveryDescribeConfigurationsCommand.() -> Unit) {
	this.block.declare(AWSApplicationDiscoveryDescribeConfigurationsCommand().apply(init))
}

@Generated
class AWSApplicationDiscoveryDescribeConfigurationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.applicationdiscovery.model.DescribeConfigurationsRequest> {

	var configurationIds: List<String>? = null

	override fun build(): com.amazonaws.services.applicationdiscovery.model.DescribeConfigurationsRequest {
		val input = com.amazonaws.services.applicationdiscovery.model.DescribeConfigurationsRequest()
		input.setConfigurationIds(this.configurationIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.discovery.describeConfigurations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws discovery describe-configurations")
				.argument("configuration-ids", configurationIds?.toString())
	}

}


fun AWSApplicationDiscoveryFunctions.describeExportConfigurations(init: AWSApplicationDiscoveryDescribeExportConfigurationsCommand.() -> Unit) {
	this.block.declare(AWSApplicationDiscoveryDescribeExportConfigurationsCommand().apply(init))
}

@Generated
class AWSApplicationDiscoveryDescribeExportConfigurationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.applicationdiscovery.model.DescribeExportConfigurationsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.discovery.describeExportConfigurations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws discovery describe-export-configurations")
				.argument("export-ids", exportIds?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSApplicationDiscoveryFunctions.describeExportTasks(init: AWSApplicationDiscoveryDescribeExportTasksCommand.() -> Unit) {
	this.block.declare(AWSApplicationDiscoveryDescribeExportTasksCommand().apply(init))
}

@Generated
class AWSApplicationDiscoveryDescribeExportTasksCommand() : AmazonWebServiceCommand<com.amazonaws.services.applicationdiscovery.model.DescribeExportTasksRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.discovery.describeExportTasks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws discovery describe-export-tasks")
				.argument("export-ids", exportIds?.toString())
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSApplicationDiscoveryFunctions.describeTags(init: AWSApplicationDiscoveryDescribeTagsCommand.() -> Unit) {
	this.block.declare(AWSApplicationDiscoveryDescribeTagsCommand().apply(init))
}

@Generated
class AWSApplicationDiscoveryDescribeTagsCommand() : AmazonWebServiceCommand<com.amazonaws.services.applicationdiscovery.model.DescribeTagsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.discovery.describeTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws discovery describe-tags")
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSApplicationDiscoveryFunctions.disassociateConfigurationItemsFromApplication(init: AWSApplicationDiscoveryDisassociateConfigurationItemsFromApplicationCommand.() -> Unit) {
	this.block.declare(AWSApplicationDiscoveryDisassociateConfigurationItemsFromApplicationCommand().apply(init))
}

@Generated
class AWSApplicationDiscoveryDisassociateConfigurationItemsFromApplicationCommand() : AmazonWebServiceCommand<com.amazonaws.services.applicationdiscovery.model.DisassociateConfigurationItemsFromApplicationRequest> {

	var applicationConfigurationId: String? = null
	var configurationIds: List<String>? = null

	override fun build(): com.amazonaws.services.applicationdiscovery.model.DisassociateConfigurationItemsFromApplicationRequest {
		val input = com.amazonaws.services.applicationdiscovery.model.DisassociateConfigurationItemsFromApplicationRequest()
		input.setApplicationConfigurationId(this.applicationConfigurationId)
		input.setConfigurationIds(this.configurationIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.discovery.disassociateConfigurationItemsFromApplication(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws discovery disassociate-configuration-items-from-application")
				.argument("application-configuration-id", applicationConfigurationId)
				.argument("configuration-ids", configurationIds?.toString())
	}

}


fun AWSApplicationDiscoveryFunctions.exportConfigurations(init: AWSApplicationDiscoveryExportConfigurationsCommand.() -> Unit) {
	this.block.declare(AWSApplicationDiscoveryExportConfigurationsCommand().apply(init))
}

@Generated
class AWSApplicationDiscoveryExportConfigurationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.applicationdiscovery.model.ExportConfigurationsRequest> {



	override fun build(): com.amazonaws.services.applicationdiscovery.model.ExportConfigurationsRequest {
		val input = com.amazonaws.services.applicationdiscovery.model.ExportConfigurationsRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.discovery.exportConfigurations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws discovery export-configurations")

	}

}


fun AWSApplicationDiscoveryFunctions.getDiscoverySummary(init: AWSApplicationDiscoveryGetDiscoverySummaryCommand.() -> Unit) {
	this.block.declare(AWSApplicationDiscoveryGetDiscoverySummaryCommand().apply(init))
}

@Generated
class AWSApplicationDiscoveryGetDiscoverySummaryCommand() : AmazonWebServiceCommand<com.amazonaws.services.applicationdiscovery.model.GetDiscoverySummaryRequest> {



	override fun build(): com.amazonaws.services.applicationdiscovery.model.GetDiscoverySummaryRequest {
		val input = com.amazonaws.services.applicationdiscovery.model.GetDiscoverySummaryRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.discovery.getDiscoverySummary(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws discovery get-discovery-summary")

	}

}


fun AWSApplicationDiscoveryFunctions.listConfigurations(init: AWSApplicationDiscoveryListConfigurationsCommand.() -> Unit) {
	this.block.declare(AWSApplicationDiscoveryListConfigurationsCommand().apply(init))
}

@Generated
class AWSApplicationDiscoveryListConfigurationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.applicationdiscovery.model.ListConfigurationsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.discovery.listConfigurations(build())
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


fun AWSApplicationDiscoveryFunctions.listServerNeighbors(init: AWSApplicationDiscoveryListServerNeighborsCommand.() -> Unit) {
	this.block.declare(AWSApplicationDiscoveryListServerNeighborsCommand().apply(init))
}

@Generated
class AWSApplicationDiscoveryListServerNeighborsCommand() : AmazonWebServiceCommand<com.amazonaws.services.applicationdiscovery.model.ListServerNeighborsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.discovery.listServerNeighbors(build())
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


fun AWSApplicationDiscoveryFunctions.startDataCollectionByAgentIds(init: AWSApplicationDiscoveryStartDataCollectionByAgentIdsCommand.() -> Unit) {
	this.block.declare(AWSApplicationDiscoveryStartDataCollectionByAgentIdsCommand().apply(init))
}

@Generated
class AWSApplicationDiscoveryStartDataCollectionByAgentIdsCommand() : AmazonWebServiceCommand<com.amazonaws.services.applicationdiscovery.model.StartDataCollectionByAgentIdsRequest> {

	var agentIds: List<String>? = null

	override fun build(): com.amazonaws.services.applicationdiscovery.model.StartDataCollectionByAgentIdsRequest {
		val input = com.amazonaws.services.applicationdiscovery.model.StartDataCollectionByAgentIdsRequest()
		input.setAgentIds(this.agentIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.discovery.startDataCollectionByAgentIds(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws discovery start-data-collection-by-agent-ids")
				.argument("agent-ids", agentIds?.toString())
	}

}


fun AWSApplicationDiscoveryFunctions.startExportTask(init: AWSApplicationDiscoveryStartExportTaskCommand.() -> Unit) {
	this.block.declare(AWSApplicationDiscoveryStartExportTaskCommand().apply(init))
}

@Generated
class AWSApplicationDiscoveryStartExportTaskCommand() : AmazonWebServiceCommand<com.amazonaws.services.applicationdiscovery.model.StartExportTaskRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.discovery.startExportTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws discovery start-export-task")
				.argument("export-data-format", exportDataFormat?.toString())
				.argument("filters", filters?.toString())
				.argument("start-time", startTime?.toString())
				.argument("end-time", endTime?.toString())
	}

}


fun AWSApplicationDiscoveryFunctions.stopDataCollectionByAgentIds(init: AWSApplicationDiscoveryStopDataCollectionByAgentIdsCommand.() -> Unit) {
	this.block.declare(AWSApplicationDiscoveryStopDataCollectionByAgentIdsCommand().apply(init))
}

@Generated
class AWSApplicationDiscoveryStopDataCollectionByAgentIdsCommand() : AmazonWebServiceCommand<com.amazonaws.services.applicationdiscovery.model.StopDataCollectionByAgentIdsRequest> {

	var agentIds: List<String>? = null

	override fun build(): com.amazonaws.services.applicationdiscovery.model.StopDataCollectionByAgentIdsRequest {
		val input = com.amazonaws.services.applicationdiscovery.model.StopDataCollectionByAgentIdsRequest()
		input.setAgentIds(this.agentIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.discovery.stopDataCollectionByAgentIds(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws discovery stop-data-collection-by-agent-ids")
				.argument("agent-ids", agentIds?.toString())
	}

}


fun AWSApplicationDiscoveryFunctions.updateApplication(init: AWSApplicationDiscoveryUpdateApplicationCommand.() -> Unit) {
	this.block.declare(AWSApplicationDiscoveryUpdateApplicationCommand().apply(init))
}

@Generated
class AWSApplicationDiscoveryUpdateApplicationCommand() : AmazonWebServiceCommand<com.amazonaws.services.applicationdiscovery.model.UpdateApplicationRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.discovery.updateApplication(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws discovery update-application")
				.argument("configuration-id", configurationId)
				.argument("name", name)
				.argument("description", description)
	}

}
