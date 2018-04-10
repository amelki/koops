
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.pinpoint.AmazonPinpoint
import com.amazonaws.services.pinpoint.model.*

var codingue.koops.core.Environment.mobiletargeting: AmazonPinpoint
	get() = this.capabilities[AmazonPinpoint::class.java.name] as AmazonPinpoint
	set(mobiletargeting) {
		this.capabilities[AmazonPinpoint::class.java.name] = mobiletargeting
	}

@Generated
class AmazonPinpointFunctions(val block: Block)

infix fun AwsContinuation.mobiletargeting(init: AmazonPinpointFunctions.() -> Unit) {
	AmazonPinpointFunctions(shell).apply(init)
}

			

fun AmazonPinpointFunctions.createApp(createApplicationRequest: com.amazonaws.services.pinpoint.model.CreateApplicationRequest, init: AmazonPinpointCreateAppCommand.() -> Unit) {
	this.block.declare(AmazonPinpointCreateAppCommand(createApplicationRequest).apply(init))
}

@Generated
class AmazonPinpointCreateAppCommand(val createApplicationRequest: com.amazonaws.services.pinpoint.model.CreateApplicationRequest) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.CreateAppRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.CreateAppRequest {
		val input = com.amazonaws.services.pinpoint.model.CreateAppRequest()
		input.setCreateApplicationRequest(this.createApplicationRequest)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.createApp(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting create-app")
				.argument("create-application-request", createApplicationRequest.toString())
	}

}


fun AmazonPinpointFunctions.createCampaign(applicationId: String, writeCampaignRequest: com.amazonaws.services.pinpoint.model.WriteCampaignRequest, init: AmazonPinpointCreateCampaignCommand.() -> Unit) {
	this.block.declare(AmazonPinpointCreateCampaignCommand(applicationId, writeCampaignRequest).apply(init))
}

@Generated
class AmazonPinpointCreateCampaignCommand(val applicationId: String, val writeCampaignRequest: com.amazonaws.services.pinpoint.model.WriteCampaignRequest) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.CreateCampaignRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.CreateCampaignRequest {
		val input = com.amazonaws.services.pinpoint.model.CreateCampaignRequest()
		input.setApplicationId(this.applicationId)
		input.setWriteCampaignRequest(this.writeCampaignRequest)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.createCampaign(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting create-campaign")
				.argument("application-id", applicationId)
				.argument("write-campaign-request", writeCampaignRequest.toString())
	}

}


fun AmazonPinpointFunctions.createExportJob(applicationId: String, exportJobRequest: com.amazonaws.services.pinpoint.model.ExportJobRequest, init: AmazonPinpointCreateExportJobCommand.() -> Unit) {
	this.block.declare(AmazonPinpointCreateExportJobCommand(applicationId, exportJobRequest).apply(init))
}

@Generated
class AmazonPinpointCreateExportJobCommand(val applicationId: String, val exportJobRequest: com.amazonaws.services.pinpoint.model.ExportJobRequest) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.CreateExportJobRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.CreateExportJobRequest {
		val input = com.amazonaws.services.pinpoint.model.CreateExportJobRequest()
		input.setApplicationId(this.applicationId)
		input.setExportJobRequest(this.exportJobRequest)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.createExportJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting create-export-job")
				.argument("application-id", applicationId)
				.argument("export-job-request", exportJobRequest.toString())
	}

}


fun AmazonPinpointFunctions.createImportJob(applicationId: String, importJobRequest: com.amazonaws.services.pinpoint.model.ImportJobRequest, init: AmazonPinpointCreateImportJobCommand.() -> Unit) {
	this.block.declare(AmazonPinpointCreateImportJobCommand(applicationId, importJobRequest).apply(init))
}

@Generated
class AmazonPinpointCreateImportJobCommand(val applicationId: String, val importJobRequest: com.amazonaws.services.pinpoint.model.ImportJobRequest) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.CreateImportJobRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.CreateImportJobRequest {
		val input = com.amazonaws.services.pinpoint.model.CreateImportJobRequest()
		input.setApplicationId(this.applicationId)
		input.setImportJobRequest(this.importJobRequest)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.createImportJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting create-import-job")
				.argument("application-id", applicationId)
				.argument("import-job-request", importJobRequest.toString())
	}

}


fun AmazonPinpointFunctions.createSegment(applicationId: String, writeSegmentRequest: com.amazonaws.services.pinpoint.model.WriteSegmentRequest, init: AmazonPinpointCreateSegmentCommand.() -> Unit) {
	this.block.declare(AmazonPinpointCreateSegmentCommand(applicationId, writeSegmentRequest).apply(init))
}

@Generated
class AmazonPinpointCreateSegmentCommand(val applicationId: String, val writeSegmentRequest: com.amazonaws.services.pinpoint.model.WriteSegmentRequest) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.CreateSegmentRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.CreateSegmentRequest {
		val input = com.amazonaws.services.pinpoint.model.CreateSegmentRequest()
		input.setApplicationId(this.applicationId)
		input.setWriteSegmentRequest(this.writeSegmentRequest)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.createSegment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting create-segment")
				.argument("application-id", applicationId)
				.argument("write-segment-request", writeSegmentRequest.toString())
	}

}


fun AmazonPinpointFunctions.deleteAdmChannel(applicationId: String, init: AmazonPinpointDeleteAdmChannelCommand.() -> Unit) {
	this.block.declare(AmazonPinpointDeleteAdmChannelCommand(applicationId).apply(init))
}

@Generated
class AmazonPinpointDeleteAdmChannelCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.DeleteAdmChannelRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.DeleteAdmChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.DeleteAdmChannelRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.deleteAdmChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting delete-adm-channel")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.deleteApnsChannel(applicationId: String, init: AmazonPinpointDeleteApnsChannelCommand.() -> Unit) {
	this.block.declare(AmazonPinpointDeleteApnsChannelCommand(applicationId).apply(init))
}

@Generated
class AmazonPinpointDeleteApnsChannelCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.DeleteApnsChannelRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.DeleteApnsChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.DeleteApnsChannelRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.deleteApnsChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting delete-apns-channel")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.deleteApnsSandboxChannel(applicationId: String, init: AmazonPinpointDeleteApnsSandboxChannelCommand.() -> Unit) {
	this.block.declare(AmazonPinpointDeleteApnsSandboxChannelCommand(applicationId).apply(init))
}

@Generated
class AmazonPinpointDeleteApnsSandboxChannelCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.DeleteApnsSandboxChannelRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.DeleteApnsSandboxChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.DeleteApnsSandboxChannelRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.deleteApnsSandboxChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting delete-apns-sandbox-channel")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.deleteApnsVoipChannel(applicationId: String, init: AmazonPinpointDeleteApnsVoipChannelCommand.() -> Unit) {
	this.block.declare(AmazonPinpointDeleteApnsVoipChannelCommand(applicationId).apply(init))
}

@Generated
class AmazonPinpointDeleteApnsVoipChannelCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.DeleteApnsVoipChannelRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.DeleteApnsVoipChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.DeleteApnsVoipChannelRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.deleteApnsVoipChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting delete-apns-voip-channel")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.deleteApnsVoipSandboxChannel(applicationId: String, init: AmazonPinpointDeleteApnsVoipSandboxChannelCommand.() -> Unit) {
	this.block.declare(AmazonPinpointDeleteApnsVoipSandboxChannelCommand(applicationId).apply(init))
}

@Generated
class AmazonPinpointDeleteApnsVoipSandboxChannelCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.DeleteApnsVoipSandboxChannelRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.DeleteApnsVoipSandboxChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.DeleteApnsVoipSandboxChannelRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.deleteApnsVoipSandboxChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting delete-apns-voip-sandbox-channel")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.deleteApp(applicationId: String, init: AmazonPinpointDeleteAppCommand.() -> Unit) {
	this.block.declare(AmazonPinpointDeleteAppCommand(applicationId).apply(init))
}

@Generated
class AmazonPinpointDeleteAppCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.DeleteAppRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.DeleteAppRequest {
		val input = com.amazonaws.services.pinpoint.model.DeleteAppRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.deleteApp(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting delete-app")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.deleteBaiduChannel(applicationId: String, init: AmazonPinpointDeleteBaiduChannelCommand.() -> Unit) {
	this.block.declare(AmazonPinpointDeleteBaiduChannelCommand(applicationId).apply(init))
}

@Generated
class AmazonPinpointDeleteBaiduChannelCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.DeleteBaiduChannelRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.DeleteBaiduChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.DeleteBaiduChannelRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.deleteBaiduChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting delete-baidu-channel")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.deleteCampaign(applicationId: String, campaignId: String, init: AmazonPinpointDeleteCampaignCommand.() -> Unit) {
	this.block.declare(AmazonPinpointDeleteCampaignCommand(applicationId, campaignId).apply(init))
}

@Generated
class AmazonPinpointDeleteCampaignCommand(val applicationId: String, val campaignId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.DeleteCampaignRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.DeleteCampaignRequest {
		val input = com.amazonaws.services.pinpoint.model.DeleteCampaignRequest()
		input.setApplicationId(this.applicationId)
		input.setCampaignId(this.campaignId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.deleteCampaign(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting delete-campaign")
				.argument("application-id", applicationId)
				.argument("campaign-id", campaignId)
	}

}


fun AmazonPinpointFunctions.deleteEmailChannel(applicationId: String, init: AmazonPinpointDeleteEmailChannelCommand.() -> Unit) {
	this.block.declare(AmazonPinpointDeleteEmailChannelCommand(applicationId).apply(init))
}

@Generated
class AmazonPinpointDeleteEmailChannelCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.DeleteEmailChannelRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.DeleteEmailChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.DeleteEmailChannelRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.deleteEmailChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting delete-email-channel")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.deleteEndpoint(applicationId: String, endpointId: String, init: AmazonPinpointDeleteEndpointCommand.() -> Unit) {
	this.block.declare(AmazonPinpointDeleteEndpointCommand(applicationId, endpointId).apply(init))
}

@Generated
class AmazonPinpointDeleteEndpointCommand(val applicationId: String, val endpointId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.DeleteEndpointRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.DeleteEndpointRequest {
		val input = com.amazonaws.services.pinpoint.model.DeleteEndpointRequest()
		input.setApplicationId(this.applicationId)
		input.setEndpointId(this.endpointId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.deleteEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting delete-endpoint")
				.argument("application-id", applicationId)
				.argument("endpoint-id", endpointId)
	}

}


fun AmazonPinpointFunctions.deleteEventStream(applicationId: String, init: AmazonPinpointDeleteEventStreamCommand.() -> Unit) {
	this.block.declare(AmazonPinpointDeleteEventStreamCommand(applicationId).apply(init))
}

@Generated
class AmazonPinpointDeleteEventStreamCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.DeleteEventStreamRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.DeleteEventStreamRequest {
		val input = com.amazonaws.services.pinpoint.model.DeleteEventStreamRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.deleteEventStream(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting delete-event-stream")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.deleteGcmChannel(applicationId: String, init: AmazonPinpointDeleteGcmChannelCommand.() -> Unit) {
	this.block.declare(AmazonPinpointDeleteGcmChannelCommand(applicationId).apply(init))
}

@Generated
class AmazonPinpointDeleteGcmChannelCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.DeleteGcmChannelRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.DeleteGcmChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.DeleteGcmChannelRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.deleteGcmChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting delete-gcm-channel")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.deleteSegment(applicationId: String, segmentId: String, init: AmazonPinpointDeleteSegmentCommand.() -> Unit) {
	this.block.declare(AmazonPinpointDeleteSegmentCommand(applicationId, segmentId).apply(init))
}

@Generated
class AmazonPinpointDeleteSegmentCommand(val applicationId: String, val segmentId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.DeleteSegmentRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.DeleteSegmentRequest {
		val input = com.amazonaws.services.pinpoint.model.DeleteSegmentRequest()
		input.setApplicationId(this.applicationId)
		input.setSegmentId(this.segmentId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.deleteSegment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting delete-segment")
				.argument("application-id", applicationId)
				.argument("segment-id", segmentId)
	}

}


fun AmazonPinpointFunctions.deleteSmsChannel(applicationId: String, init: AmazonPinpointDeleteSmsChannelCommand.() -> Unit) {
	this.block.declare(AmazonPinpointDeleteSmsChannelCommand(applicationId).apply(init))
}

@Generated
class AmazonPinpointDeleteSmsChannelCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.DeleteSmsChannelRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.DeleteSmsChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.DeleteSmsChannelRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.deleteSmsChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting delete-sms-channel")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.getAdmChannel(applicationId: String, init: AmazonPinpointGetAdmChannelCommand.() -> Unit) {
	this.block.declare(AmazonPinpointGetAdmChannelCommand(applicationId).apply(init))
}

@Generated
class AmazonPinpointGetAdmChannelCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetAdmChannelRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.GetAdmChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.GetAdmChannelRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.getAdmChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-adm-channel")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.getApnsChannel(applicationId: String, init: AmazonPinpointGetApnsChannelCommand.() -> Unit) {
	this.block.declare(AmazonPinpointGetApnsChannelCommand(applicationId).apply(init))
}

@Generated
class AmazonPinpointGetApnsChannelCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetApnsChannelRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.GetApnsChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.GetApnsChannelRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.getApnsChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-apns-channel")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.getApnsSandboxChannel(applicationId: String, init: AmazonPinpointGetApnsSandboxChannelCommand.() -> Unit) {
	this.block.declare(AmazonPinpointGetApnsSandboxChannelCommand(applicationId).apply(init))
}

@Generated
class AmazonPinpointGetApnsSandboxChannelCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetApnsSandboxChannelRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.GetApnsSandboxChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.GetApnsSandboxChannelRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.getApnsSandboxChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-apns-sandbox-channel")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.getApnsVoipChannel(applicationId: String, init: AmazonPinpointGetApnsVoipChannelCommand.() -> Unit) {
	this.block.declare(AmazonPinpointGetApnsVoipChannelCommand(applicationId).apply(init))
}

@Generated
class AmazonPinpointGetApnsVoipChannelCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetApnsVoipChannelRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.GetApnsVoipChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.GetApnsVoipChannelRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.getApnsVoipChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-apns-voip-channel")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.getApnsVoipSandboxChannel(applicationId: String, init: AmazonPinpointGetApnsVoipSandboxChannelCommand.() -> Unit) {
	this.block.declare(AmazonPinpointGetApnsVoipSandboxChannelCommand(applicationId).apply(init))
}

@Generated
class AmazonPinpointGetApnsVoipSandboxChannelCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetApnsVoipSandboxChannelRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.GetApnsVoipSandboxChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.GetApnsVoipSandboxChannelRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.getApnsVoipSandboxChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-apns-voip-sandbox-channel")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.getApp(applicationId: String, init: AmazonPinpointGetAppCommand.() -> Unit) {
	this.block.declare(AmazonPinpointGetAppCommand(applicationId).apply(init))
}

@Generated
class AmazonPinpointGetAppCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetAppRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.GetAppRequest {
		val input = com.amazonaws.services.pinpoint.model.GetAppRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.getApp(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-app")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.getApplicationSettings(applicationId: String, init: AmazonPinpointGetApplicationSettingsCommand.() -> Unit) {
	this.block.declare(AmazonPinpointGetApplicationSettingsCommand(applicationId).apply(init))
}

@Generated
class AmazonPinpointGetApplicationSettingsCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetApplicationSettingsRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.GetApplicationSettingsRequest {
		val input = com.amazonaws.services.pinpoint.model.GetApplicationSettingsRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.getApplicationSettings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-application-settings")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.getApps(init: AmazonPinpointGetAppsCommand.() -> Unit) {
	this.block.declare(AmazonPinpointGetAppsCommand().apply(init))
}

@Generated
class AmazonPinpointGetAppsCommand() : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetAppsRequest> {

	var pageSize: String? = null
	var token: String? = null

	override fun build(): com.amazonaws.services.pinpoint.model.GetAppsRequest {
		val input = com.amazonaws.services.pinpoint.model.GetAppsRequest()
		input.setPageSize(this.pageSize)
		input.setToken(this.token)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.getApps(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-apps")
				.argument("page-size", pageSize)
				.argument("token", token)
	}

}


fun AmazonPinpointFunctions.getBaiduChannel(applicationId: String, init: AmazonPinpointGetBaiduChannelCommand.() -> Unit) {
	this.block.declare(AmazonPinpointGetBaiduChannelCommand(applicationId).apply(init))
}

@Generated
class AmazonPinpointGetBaiduChannelCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetBaiduChannelRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.GetBaiduChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.GetBaiduChannelRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.getBaiduChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-baidu-channel")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.getCampaign(applicationId: String, campaignId: String, init: AmazonPinpointGetCampaignCommand.() -> Unit) {
	this.block.declare(AmazonPinpointGetCampaignCommand(applicationId, campaignId).apply(init))
}

@Generated
class AmazonPinpointGetCampaignCommand(val applicationId: String, val campaignId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetCampaignRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.GetCampaignRequest {
		val input = com.amazonaws.services.pinpoint.model.GetCampaignRequest()
		input.setApplicationId(this.applicationId)
		input.setCampaignId(this.campaignId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.getCampaign(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-campaign")
				.argument("application-id", applicationId)
				.argument("campaign-id", campaignId)
	}

}


fun AmazonPinpointFunctions.getCampaignActivities(applicationId: String, campaignId: String, init: AmazonPinpointGetCampaignActivitiesCommand.() -> Unit) {
	this.block.declare(AmazonPinpointGetCampaignActivitiesCommand(applicationId, campaignId).apply(init))
}

@Generated
class AmazonPinpointGetCampaignActivitiesCommand(val applicationId: String, val campaignId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetCampaignActivitiesRequest> {

	var pageSize: String? = null
	var token: String? = null

	override fun build(): com.amazonaws.services.pinpoint.model.GetCampaignActivitiesRequest {
		val input = com.amazonaws.services.pinpoint.model.GetCampaignActivitiesRequest()
		input.setApplicationId(this.applicationId)
		input.setCampaignId(this.campaignId)
		input.setPageSize(this.pageSize)
		input.setToken(this.token)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.getCampaignActivities(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-campaign-activities")
				.argument("application-id", applicationId)
				.argument("campaign-id", campaignId)
				.argument("page-size", pageSize)
				.argument("token", token)
	}

}


fun AmazonPinpointFunctions.getCampaignVersion(applicationId: String, campaignId: String, version: String, init: AmazonPinpointGetCampaignVersionCommand.() -> Unit) {
	this.block.declare(AmazonPinpointGetCampaignVersionCommand(applicationId, campaignId, version).apply(init))
}

@Generated
class AmazonPinpointGetCampaignVersionCommand(val applicationId: String, val campaignId: String, val version: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetCampaignVersionRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.GetCampaignVersionRequest {
		val input = com.amazonaws.services.pinpoint.model.GetCampaignVersionRequest()
		input.setApplicationId(this.applicationId)
		input.setCampaignId(this.campaignId)
		input.setVersion(this.version)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.getCampaignVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-campaign-version")
				.argument("application-id", applicationId)
				.argument("campaign-id", campaignId)
				.argument("version", version)
	}

}


fun AmazonPinpointFunctions.getCampaignVersions(applicationId: String, campaignId: String, init: AmazonPinpointGetCampaignVersionsCommand.() -> Unit) {
	this.block.declare(AmazonPinpointGetCampaignVersionsCommand(applicationId, campaignId).apply(init))
}

@Generated
class AmazonPinpointGetCampaignVersionsCommand(val applicationId: String, val campaignId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetCampaignVersionsRequest> {

	var pageSize: String? = null
	var token: String? = null

	override fun build(): com.amazonaws.services.pinpoint.model.GetCampaignVersionsRequest {
		val input = com.amazonaws.services.pinpoint.model.GetCampaignVersionsRequest()
		input.setApplicationId(this.applicationId)
		input.setCampaignId(this.campaignId)
		input.setPageSize(this.pageSize)
		input.setToken(this.token)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.getCampaignVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-campaign-versions")
				.argument("application-id", applicationId)
				.argument("campaign-id", campaignId)
				.argument("page-size", pageSize)
				.argument("token", token)
	}

}


fun AmazonPinpointFunctions.getCampaigns(applicationId: String, init: AmazonPinpointGetCampaignsCommand.() -> Unit) {
	this.block.declare(AmazonPinpointGetCampaignsCommand(applicationId).apply(init))
}

@Generated
class AmazonPinpointGetCampaignsCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetCampaignsRequest> {

	var pageSize: String? = null
	var token: String? = null

	override fun build(): com.amazonaws.services.pinpoint.model.GetCampaignsRequest {
		val input = com.amazonaws.services.pinpoint.model.GetCampaignsRequest()
		input.setApplicationId(this.applicationId)
		input.setPageSize(this.pageSize)
		input.setToken(this.token)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.getCampaigns(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-campaigns")
				.argument("application-id", applicationId)
				.argument("page-size", pageSize)
				.argument("token", token)
	}

}


fun AmazonPinpointFunctions.getEmailChannel(applicationId: String, init: AmazonPinpointGetEmailChannelCommand.() -> Unit) {
	this.block.declare(AmazonPinpointGetEmailChannelCommand(applicationId).apply(init))
}

@Generated
class AmazonPinpointGetEmailChannelCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetEmailChannelRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.GetEmailChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.GetEmailChannelRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.getEmailChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-email-channel")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.getEndpoint(applicationId: String, endpointId: String, init: AmazonPinpointGetEndpointCommand.() -> Unit) {
	this.block.declare(AmazonPinpointGetEndpointCommand(applicationId, endpointId).apply(init))
}

@Generated
class AmazonPinpointGetEndpointCommand(val applicationId: String, val endpointId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetEndpointRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.GetEndpointRequest {
		val input = com.amazonaws.services.pinpoint.model.GetEndpointRequest()
		input.setApplicationId(this.applicationId)
		input.setEndpointId(this.endpointId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.getEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-endpoint")
				.argument("application-id", applicationId)
				.argument("endpoint-id", endpointId)
	}

}


fun AmazonPinpointFunctions.getEventStream(applicationId: String, init: AmazonPinpointGetEventStreamCommand.() -> Unit) {
	this.block.declare(AmazonPinpointGetEventStreamCommand(applicationId).apply(init))
}

@Generated
class AmazonPinpointGetEventStreamCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetEventStreamRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.GetEventStreamRequest {
		val input = com.amazonaws.services.pinpoint.model.GetEventStreamRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.getEventStream(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-event-stream")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.getExportJob(applicationId: String, jobId: String, init: AmazonPinpointGetExportJobCommand.() -> Unit) {
	this.block.declare(AmazonPinpointGetExportJobCommand(applicationId, jobId).apply(init))
}

@Generated
class AmazonPinpointGetExportJobCommand(val applicationId: String, val jobId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetExportJobRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.GetExportJobRequest {
		val input = com.amazonaws.services.pinpoint.model.GetExportJobRequest()
		input.setApplicationId(this.applicationId)
		input.setJobId(this.jobId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.getExportJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-export-job")
				.argument("application-id", applicationId)
				.argument("job-id", jobId)
	}

}


fun AmazonPinpointFunctions.getExportJobs(applicationId: String, init: AmazonPinpointGetExportJobsCommand.() -> Unit) {
	this.block.declare(AmazonPinpointGetExportJobsCommand(applicationId).apply(init))
}

@Generated
class AmazonPinpointGetExportJobsCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetExportJobsRequest> {

	var pageSize: String? = null
	var token: String? = null

	override fun build(): com.amazonaws.services.pinpoint.model.GetExportJobsRequest {
		val input = com.amazonaws.services.pinpoint.model.GetExportJobsRequest()
		input.setApplicationId(this.applicationId)
		input.setPageSize(this.pageSize)
		input.setToken(this.token)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.getExportJobs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-export-jobs")
				.argument("application-id", applicationId)
				.argument("page-size", pageSize)
				.argument("token", token)
	}

}


fun AmazonPinpointFunctions.getGcmChannel(applicationId: String, init: AmazonPinpointGetGcmChannelCommand.() -> Unit) {
	this.block.declare(AmazonPinpointGetGcmChannelCommand(applicationId).apply(init))
}

@Generated
class AmazonPinpointGetGcmChannelCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetGcmChannelRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.GetGcmChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.GetGcmChannelRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.getGcmChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-gcm-channel")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.getImportJob(applicationId: String, jobId: String, init: AmazonPinpointGetImportJobCommand.() -> Unit) {
	this.block.declare(AmazonPinpointGetImportJobCommand(applicationId, jobId).apply(init))
}

@Generated
class AmazonPinpointGetImportJobCommand(val applicationId: String, val jobId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetImportJobRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.GetImportJobRequest {
		val input = com.amazonaws.services.pinpoint.model.GetImportJobRequest()
		input.setApplicationId(this.applicationId)
		input.setJobId(this.jobId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.getImportJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-import-job")
				.argument("application-id", applicationId)
				.argument("job-id", jobId)
	}

}


fun AmazonPinpointFunctions.getImportJobs(applicationId: String, init: AmazonPinpointGetImportJobsCommand.() -> Unit) {
	this.block.declare(AmazonPinpointGetImportJobsCommand(applicationId).apply(init))
}

@Generated
class AmazonPinpointGetImportJobsCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetImportJobsRequest> {

	var pageSize: String? = null
	var token: String? = null

	override fun build(): com.amazonaws.services.pinpoint.model.GetImportJobsRequest {
		val input = com.amazonaws.services.pinpoint.model.GetImportJobsRequest()
		input.setApplicationId(this.applicationId)
		input.setPageSize(this.pageSize)
		input.setToken(this.token)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.getImportJobs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-import-jobs")
				.argument("application-id", applicationId)
				.argument("page-size", pageSize)
				.argument("token", token)
	}

}


fun AmazonPinpointFunctions.getSegment(applicationId: String, segmentId: String, init: AmazonPinpointGetSegmentCommand.() -> Unit) {
	this.block.declare(AmazonPinpointGetSegmentCommand(applicationId, segmentId).apply(init))
}

@Generated
class AmazonPinpointGetSegmentCommand(val applicationId: String, val segmentId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetSegmentRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.GetSegmentRequest {
		val input = com.amazonaws.services.pinpoint.model.GetSegmentRequest()
		input.setApplicationId(this.applicationId)
		input.setSegmentId(this.segmentId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.getSegment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-segment")
				.argument("application-id", applicationId)
				.argument("segment-id", segmentId)
	}

}


fun AmazonPinpointFunctions.getSegmentExportJobs(applicationId: String, segmentId: String, init: AmazonPinpointGetSegmentExportJobsCommand.() -> Unit) {
	this.block.declare(AmazonPinpointGetSegmentExportJobsCommand(applicationId, segmentId).apply(init))
}

@Generated
class AmazonPinpointGetSegmentExportJobsCommand(val applicationId: String, val segmentId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetSegmentExportJobsRequest> {

	var pageSize: String? = null
	var token: String? = null

	override fun build(): com.amazonaws.services.pinpoint.model.GetSegmentExportJobsRequest {
		val input = com.amazonaws.services.pinpoint.model.GetSegmentExportJobsRequest()
		input.setApplicationId(this.applicationId)
		input.setPageSize(this.pageSize)
		input.setSegmentId(this.segmentId)
		input.setToken(this.token)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.getSegmentExportJobs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-segment-export-jobs")
				.argument("application-id", applicationId)
				.argument("page-size", pageSize)
				.argument("segment-id", segmentId)
				.argument("token", token)
	}

}


fun AmazonPinpointFunctions.getSegmentImportJobs(applicationId: String, segmentId: String, init: AmazonPinpointGetSegmentImportJobsCommand.() -> Unit) {
	this.block.declare(AmazonPinpointGetSegmentImportJobsCommand(applicationId, segmentId).apply(init))
}

@Generated
class AmazonPinpointGetSegmentImportJobsCommand(val applicationId: String, val segmentId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetSegmentImportJobsRequest> {

	var pageSize: String? = null
	var token: String? = null

	override fun build(): com.amazonaws.services.pinpoint.model.GetSegmentImportJobsRequest {
		val input = com.amazonaws.services.pinpoint.model.GetSegmentImportJobsRequest()
		input.setApplicationId(this.applicationId)
		input.setPageSize(this.pageSize)
		input.setSegmentId(this.segmentId)
		input.setToken(this.token)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.getSegmentImportJobs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-segment-import-jobs")
				.argument("application-id", applicationId)
				.argument("page-size", pageSize)
				.argument("segment-id", segmentId)
				.argument("token", token)
	}

}


fun AmazonPinpointFunctions.getSegmentVersion(applicationId: String, segmentId: String, version: String, init: AmazonPinpointGetSegmentVersionCommand.() -> Unit) {
	this.block.declare(AmazonPinpointGetSegmentVersionCommand(applicationId, segmentId, version).apply(init))
}

@Generated
class AmazonPinpointGetSegmentVersionCommand(val applicationId: String, val segmentId: String, val version: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetSegmentVersionRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.GetSegmentVersionRequest {
		val input = com.amazonaws.services.pinpoint.model.GetSegmentVersionRequest()
		input.setApplicationId(this.applicationId)
		input.setSegmentId(this.segmentId)
		input.setVersion(this.version)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.getSegmentVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-segment-version")
				.argument("application-id", applicationId)
				.argument("segment-id", segmentId)
				.argument("version", version)
	}

}


fun AmazonPinpointFunctions.getSegmentVersions(applicationId: String, segmentId: String, init: AmazonPinpointGetSegmentVersionsCommand.() -> Unit) {
	this.block.declare(AmazonPinpointGetSegmentVersionsCommand(applicationId, segmentId).apply(init))
}

@Generated
class AmazonPinpointGetSegmentVersionsCommand(val applicationId: String, val segmentId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetSegmentVersionsRequest> {

	var pageSize: String? = null
	var token: String? = null

	override fun build(): com.amazonaws.services.pinpoint.model.GetSegmentVersionsRequest {
		val input = com.amazonaws.services.pinpoint.model.GetSegmentVersionsRequest()
		input.setApplicationId(this.applicationId)
		input.setPageSize(this.pageSize)
		input.setSegmentId(this.segmentId)
		input.setToken(this.token)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.getSegmentVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-segment-versions")
				.argument("application-id", applicationId)
				.argument("page-size", pageSize)
				.argument("segment-id", segmentId)
				.argument("token", token)
	}

}


fun AmazonPinpointFunctions.getSegments(applicationId: String, init: AmazonPinpointGetSegmentsCommand.() -> Unit) {
	this.block.declare(AmazonPinpointGetSegmentsCommand(applicationId).apply(init))
}

@Generated
class AmazonPinpointGetSegmentsCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetSegmentsRequest> {

	var pageSize: String? = null
	var token: String? = null

	override fun build(): com.amazonaws.services.pinpoint.model.GetSegmentsRequest {
		val input = com.amazonaws.services.pinpoint.model.GetSegmentsRequest()
		input.setApplicationId(this.applicationId)
		input.setPageSize(this.pageSize)
		input.setToken(this.token)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.getSegments(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-segments")
				.argument("application-id", applicationId)
				.argument("page-size", pageSize)
				.argument("token", token)
	}

}


fun AmazonPinpointFunctions.getSmsChannel(applicationId: String, init: AmazonPinpointGetSmsChannelCommand.() -> Unit) {
	this.block.declare(AmazonPinpointGetSmsChannelCommand(applicationId).apply(init))
}

@Generated
class AmazonPinpointGetSmsChannelCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetSmsChannelRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.GetSmsChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.GetSmsChannelRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.getSmsChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-sms-channel")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.putEventStream(applicationId: String, writeEventStream: com.amazonaws.services.pinpoint.model.WriteEventStream, init: AmazonPinpointPutEventStreamCommand.() -> Unit) {
	this.block.declare(AmazonPinpointPutEventStreamCommand(applicationId, writeEventStream).apply(init))
}

@Generated
class AmazonPinpointPutEventStreamCommand(val applicationId: String, val writeEventStream: com.amazonaws.services.pinpoint.model.WriteEventStream) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.PutEventStreamRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.PutEventStreamRequest {
		val input = com.amazonaws.services.pinpoint.model.PutEventStreamRequest()
		input.setApplicationId(this.applicationId)
		input.setWriteEventStream(this.writeEventStream)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.putEventStream(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting put-event-stream")
				.argument("application-id", applicationId)
				.argument("write-event-stream", writeEventStream.toString())
	}

}


fun AmazonPinpointFunctions.sendMessages(applicationId: String, messageRequest: com.amazonaws.services.pinpoint.model.MessageRequest, init: AmazonPinpointSendMessagesCommand.() -> Unit) {
	this.block.declare(AmazonPinpointSendMessagesCommand(applicationId, messageRequest).apply(init))
}

@Generated
class AmazonPinpointSendMessagesCommand(val applicationId: String, val messageRequest: com.amazonaws.services.pinpoint.model.MessageRequest) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.SendMessagesRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.SendMessagesRequest {
		val input = com.amazonaws.services.pinpoint.model.SendMessagesRequest()
		input.setApplicationId(this.applicationId)
		input.setMessageRequest(this.messageRequest)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.sendMessages(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting send-messages")
				.argument("application-id", applicationId)
				.argument("message-request", messageRequest.toString())
	}

}


fun AmazonPinpointFunctions.sendUsersMessages(applicationId: String, sendUsersMessageRequest: com.amazonaws.services.pinpoint.model.SendUsersMessageRequest, init: AmazonPinpointSendUsersMessagesCommand.() -> Unit) {
	this.block.declare(AmazonPinpointSendUsersMessagesCommand(applicationId, sendUsersMessageRequest).apply(init))
}

@Generated
class AmazonPinpointSendUsersMessagesCommand(val applicationId: String, val sendUsersMessageRequest: com.amazonaws.services.pinpoint.model.SendUsersMessageRequest) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.SendUsersMessagesRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.SendUsersMessagesRequest {
		val input = com.amazonaws.services.pinpoint.model.SendUsersMessagesRequest()
		input.setApplicationId(this.applicationId)
		input.setSendUsersMessageRequest(this.sendUsersMessageRequest)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.sendUsersMessages(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting send-users-messages")
				.argument("application-id", applicationId)
				.argument("send-users-message-request", sendUsersMessageRequest.toString())
	}

}


fun AmazonPinpointFunctions.updateAdmChannel(aDMChannelRequest: com.amazonaws.services.pinpoint.model.ADMChannelRequest, applicationId: String, init: AmazonPinpointUpdateAdmChannelCommand.() -> Unit) {
	this.block.declare(AmazonPinpointUpdateAdmChannelCommand(aDMChannelRequest, applicationId).apply(init))
}

@Generated
class AmazonPinpointUpdateAdmChannelCommand(val aDMChannelRequest: com.amazonaws.services.pinpoint.model.ADMChannelRequest, val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.UpdateAdmChannelRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.UpdateAdmChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.UpdateAdmChannelRequest()
		input.setADMChannelRequest(this.aDMChannelRequest)
		input.setApplicationId(this.applicationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.updateAdmChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting update-adm-channel")
				.argument("admchannel-request", aDMChannelRequest.toString())
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.updateApnsChannel(aPNSChannelRequest: com.amazonaws.services.pinpoint.model.APNSChannelRequest, applicationId: String, init: AmazonPinpointUpdateApnsChannelCommand.() -> Unit) {
	this.block.declare(AmazonPinpointUpdateApnsChannelCommand(aPNSChannelRequest, applicationId).apply(init))
}

@Generated
class AmazonPinpointUpdateApnsChannelCommand(val aPNSChannelRequest: com.amazonaws.services.pinpoint.model.APNSChannelRequest, val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.UpdateApnsChannelRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.UpdateApnsChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.UpdateApnsChannelRequest()
		input.setAPNSChannelRequest(this.aPNSChannelRequest)
		input.setApplicationId(this.applicationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.updateApnsChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting update-apns-channel")
				.argument("apnschannel-request", aPNSChannelRequest.toString())
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.updateApnsSandboxChannel(aPNSSandboxChannelRequest: com.amazonaws.services.pinpoint.model.APNSSandboxChannelRequest, applicationId: String, init: AmazonPinpointUpdateApnsSandboxChannelCommand.() -> Unit) {
	this.block.declare(AmazonPinpointUpdateApnsSandboxChannelCommand(aPNSSandboxChannelRequest, applicationId).apply(init))
}

@Generated
class AmazonPinpointUpdateApnsSandboxChannelCommand(val aPNSSandboxChannelRequest: com.amazonaws.services.pinpoint.model.APNSSandboxChannelRequest, val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.UpdateApnsSandboxChannelRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.UpdateApnsSandboxChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.UpdateApnsSandboxChannelRequest()
		input.setAPNSSandboxChannelRequest(this.aPNSSandboxChannelRequest)
		input.setApplicationId(this.applicationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.updateApnsSandboxChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting update-apns-sandbox-channel")
				.argument("apnssandbox-channel-request", aPNSSandboxChannelRequest.toString())
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.updateApnsVoipChannel(aPNSVoipChannelRequest: com.amazonaws.services.pinpoint.model.APNSVoipChannelRequest, applicationId: String, init: AmazonPinpointUpdateApnsVoipChannelCommand.() -> Unit) {
	this.block.declare(AmazonPinpointUpdateApnsVoipChannelCommand(aPNSVoipChannelRequest, applicationId).apply(init))
}

@Generated
class AmazonPinpointUpdateApnsVoipChannelCommand(val aPNSVoipChannelRequest: com.amazonaws.services.pinpoint.model.APNSVoipChannelRequest, val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.UpdateApnsVoipChannelRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.UpdateApnsVoipChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.UpdateApnsVoipChannelRequest()
		input.setAPNSVoipChannelRequest(this.aPNSVoipChannelRequest)
		input.setApplicationId(this.applicationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.updateApnsVoipChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting update-apns-voip-channel")
				.argument("apnsvoip-channel-request", aPNSVoipChannelRequest.toString())
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.updateApnsVoipSandboxChannel(aPNSVoipSandboxChannelRequest: com.amazonaws.services.pinpoint.model.APNSVoipSandboxChannelRequest, applicationId: String, init: AmazonPinpointUpdateApnsVoipSandboxChannelCommand.() -> Unit) {
	this.block.declare(AmazonPinpointUpdateApnsVoipSandboxChannelCommand(aPNSVoipSandboxChannelRequest, applicationId).apply(init))
}

@Generated
class AmazonPinpointUpdateApnsVoipSandboxChannelCommand(val aPNSVoipSandboxChannelRequest: com.amazonaws.services.pinpoint.model.APNSVoipSandboxChannelRequest, val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.UpdateApnsVoipSandboxChannelRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.UpdateApnsVoipSandboxChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.UpdateApnsVoipSandboxChannelRequest()
		input.setAPNSVoipSandboxChannelRequest(this.aPNSVoipSandboxChannelRequest)
		input.setApplicationId(this.applicationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.updateApnsVoipSandboxChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting update-apns-voip-sandbox-channel")
				.argument("apnsvoip-sandbox-channel-request", aPNSVoipSandboxChannelRequest.toString())
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.updateApplicationSettings(applicationId: String, writeApplicationSettingsRequest: com.amazonaws.services.pinpoint.model.WriteApplicationSettingsRequest, init: AmazonPinpointUpdateApplicationSettingsCommand.() -> Unit) {
	this.block.declare(AmazonPinpointUpdateApplicationSettingsCommand(applicationId, writeApplicationSettingsRequest).apply(init))
}

@Generated
class AmazonPinpointUpdateApplicationSettingsCommand(val applicationId: String, val writeApplicationSettingsRequest: com.amazonaws.services.pinpoint.model.WriteApplicationSettingsRequest) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.UpdateApplicationSettingsRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.UpdateApplicationSettingsRequest {
		val input = com.amazonaws.services.pinpoint.model.UpdateApplicationSettingsRequest()
		input.setApplicationId(this.applicationId)
		input.setWriteApplicationSettingsRequest(this.writeApplicationSettingsRequest)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.updateApplicationSettings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting update-application-settings")
				.argument("application-id", applicationId)
				.argument("write-application-settings-request", writeApplicationSettingsRequest.toString())
	}

}


fun AmazonPinpointFunctions.updateBaiduChannel(applicationId: String, baiduChannelRequest: com.amazonaws.services.pinpoint.model.BaiduChannelRequest, init: AmazonPinpointUpdateBaiduChannelCommand.() -> Unit) {
	this.block.declare(AmazonPinpointUpdateBaiduChannelCommand(applicationId, baiduChannelRequest).apply(init))
}

@Generated
class AmazonPinpointUpdateBaiduChannelCommand(val applicationId: String, val baiduChannelRequest: com.amazonaws.services.pinpoint.model.BaiduChannelRequest) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.UpdateBaiduChannelRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.UpdateBaiduChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.UpdateBaiduChannelRequest()
		input.setApplicationId(this.applicationId)
		input.setBaiduChannelRequest(this.baiduChannelRequest)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.updateBaiduChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting update-baidu-channel")
				.argument("application-id", applicationId)
				.argument("baidu-channel-request", baiduChannelRequest.toString())
	}

}


fun AmazonPinpointFunctions.updateCampaign(applicationId: String, campaignId: String, writeCampaignRequest: com.amazonaws.services.pinpoint.model.WriteCampaignRequest, init: AmazonPinpointUpdateCampaignCommand.() -> Unit) {
	this.block.declare(AmazonPinpointUpdateCampaignCommand(applicationId, campaignId, writeCampaignRequest).apply(init))
}

@Generated
class AmazonPinpointUpdateCampaignCommand(val applicationId: String, val campaignId: String, val writeCampaignRequest: com.amazonaws.services.pinpoint.model.WriteCampaignRequest) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.UpdateCampaignRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.UpdateCampaignRequest {
		val input = com.amazonaws.services.pinpoint.model.UpdateCampaignRequest()
		input.setApplicationId(this.applicationId)
		input.setCampaignId(this.campaignId)
		input.setWriteCampaignRequest(this.writeCampaignRequest)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.updateCampaign(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting update-campaign")
				.argument("application-id", applicationId)
				.argument("campaign-id", campaignId)
				.argument("write-campaign-request", writeCampaignRequest.toString())
	}

}


fun AmazonPinpointFunctions.updateEmailChannel(applicationId: String, emailChannelRequest: com.amazonaws.services.pinpoint.model.EmailChannelRequest, init: AmazonPinpointUpdateEmailChannelCommand.() -> Unit) {
	this.block.declare(AmazonPinpointUpdateEmailChannelCommand(applicationId, emailChannelRequest).apply(init))
}

@Generated
class AmazonPinpointUpdateEmailChannelCommand(val applicationId: String, val emailChannelRequest: com.amazonaws.services.pinpoint.model.EmailChannelRequest) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.UpdateEmailChannelRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.UpdateEmailChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.UpdateEmailChannelRequest()
		input.setApplicationId(this.applicationId)
		input.setEmailChannelRequest(this.emailChannelRequest)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.updateEmailChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting update-email-channel")
				.argument("application-id", applicationId)
				.argument("email-channel-request", emailChannelRequest.toString())
	}

}


fun AmazonPinpointFunctions.updateEndpoint(applicationId: String, endpointId: String, endpointRequest: com.amazonaws.services.pinpoint.model.EndpointRequest, init: AmazonPinpointUpdateEndpointCommand.() -> Unit) {
	this.block.declare(AmazonPinpointUpdateEndpointCommand(applicationId, endpointId, endpointRequest).apply(init))
}

@Generated
class AmazonPinpointUpdateEndpointCommand(val applicationId: String, val endpointId: String, val endpointRequest: com.amazonaws.services.pinpoint.model.EndpointRequest) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.UpdateEndpointRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.UpdateEndpointRequest {
		val input = com.amazonaws.services.pinpoint.model.UpdateEndpointRequest()
		input.setApplicationId(this.applicationId)
		input.setEndpointId(this.endpointId)
		input.setEndpointRequest(this.endpointRequest)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.updateEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting update-endpoint")
				.argument("application-id", applicationId)
				.argument("endpoint-id", endpointId)
				.argument("endpoint-request", endpointRequest.toString())
	}

}


fun AmazonPinpointFunctions.updateEndpointsBatch(applicationId: String, endpointBatchRequest: com.amazonaws.services.pinpoint.model.EndpointBatchRequest, init: AmazonPinpointUpdateEndpointsBatchCommand.() -> Unit) {
	this.block.declare(AmazonPinpointUpdateEndpointsBatchCommand(applicationId, endpointBatchRequest).apply(init))
}

@Generated
class AmazonPinpointUpdateEndpointsBatchCommand(val applicationId: String, val endpointBatchRequest: com.amazonaws.services.pinpoint.model.EndpointBatchRequest) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.UpdateEndpointsBatchRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.UpdateEndpointsBatchRequest {
		val input = com.amazonaws.services.pinpoint.model.UpdateEndpointsBatchRequest()
		input.setApplicationId(this.applicationId)
		input.setEndpointBatchRequest(this.endpointBatchRequest)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.updateEndpointsBatch(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting update-endpoints-batch")
				.argument("application-id", applicationId)
				.argument("endpoint-batch-request", endpointBatchRequest.toString())
	}

}


fun AmazonPinpointFunctions.updateGcmChannel(applicationId: String, gCMChannelRequest: com.amazonaws.services.pinpoint.model.GCMChannelRequest, init: AmazonPinpointUpdateGcmChannelCommand.() -> Unit) {
	this.block.declare(AmazonPinpointUpdateGcmChannelCommand(applicationId, gCMChannelRequest).apply(init))
}

@Generated
class AmazonPinpointUpdateGcmChannelCommand(val applicationId: String, val gCMChannelRequest: com.amazonaws.services.pinpoint.model.GCMChannelRequest) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.UpdateGcmChannelRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.UpdateGcmChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.UpdateGcmChannelRequest()
		input.setApplicationId(this.applicationId)
		input.setGCMChannelRequest(this.gCMChannelRequest)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.updateGcmChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting update-gcm-channel")
				.argument("application-id", applicationId)
				.argument("gcmchannel-request", gCMChannelRequest.toString())
	}

}


fun AmazonPinpointFunctions.updateSegment(applicationId: String, segmentId: String, writeSegmentRequest: com.amazonaws.services.pinpoint.model.WriteSegmentRequest, init: AmazonPinpointUpdateSegmentCommand.() -> Unit) {
	this.block.declare(AmazonPinpointUpdateSegmentCommand(applicationId, segmentId, writeSegmentRequest).apply(init))
}

@Generated
class AmazonPinpointUpdateSegmentCommand(val applicationId: String, val segmentId: String, val writeSegmentRequest: com.amazonaws.services.pinpoint.model.WriteSegmentRequest) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.UpdateSegmentRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.UpdateSegmentRequest {
		val input = com.amazonaws.services.pinpoint.model.UpdateSegmentRequest()
		input.setApplicationId(this.applicationId)
		input.setSegmentId(this.segmentId)
		input.setWriteSegmentRequest(this.writeSegmentRequest)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.updateSegment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting update-segment")
				.argument("application-id", applicationId)
				.argument("segment-id", segmentId)
				.argument("write-segment-request", writeSegmentRequest.toString())
	}

}


fun AmazonPinpointFunctions.updateSmsChannel(applicationId: String, sMSChannelRequest: com.amazonaws.services.pinpoint.model.SMSChannelRequest, init: AmazonPinpointUpdateSmsChannelCommand.() -> Unit) {
	this.block.declare(AmazonPinpointUpdateSmsChannelCommand(applicationId, sMSChannelRequest).apply(init))
}

@Generated
class AmazonPinpointUpdateSmsChannelCommand(val applicationId: String, val sMSChannelRequest: com.amazonaws.services.pinpoint.model.SMSChannelRequest) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.UpdateSmsChannelRequest> {



	override fun build(): com.amazonaws.services.pinpoint.model.UpdateSmsChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.UpdateSmsChannelRequest()
		input.setApplicationId(this.applicationId)
		input.setSMSChannelRequest(this.sMSChannelRequest)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mobiletargeting.updateSmsChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting update-sms-channel")
				.argument("application-id", applicationId)
				.argument("smschannel-request", sMSChannelRequest.toString())
	}

}
