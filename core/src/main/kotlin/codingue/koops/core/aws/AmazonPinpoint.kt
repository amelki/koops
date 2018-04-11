
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceVoidCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.pinpoint.AmazonPinpoint
import com.amazonaws.services.pinpoint.AmazonPinpointClientBuilder
import com.amazonaws.services.pinpoint.model.*

var codingue.koops.core.Environment.mobiletargeting: AmazonPinpoint
	get() {
		var service = this.capabilities[AmazonPinpoint::class.java.name]
		if (service == null) {
			service = AmazonPinpointClientBuilder.standard().build()
			mobiletargeting = service
		}
		return service as AmazonPinpoint
	}
	set(mobiletargeting) {
		this.capabilities[AmazonPinpoint::class.java.name] = mobiletargeting
	}

@Generated
class AmazonPinpointFunctions(val block: Block)

infix fun <T> AwsContinuation.mobiletargeting(init: AmazonPinpointFunctions.() -> T): T {
	return AmazonPinpointFunctions(shell).run(init)
}

			

fun AmazonPinpointFunctions.createApp(createApplicationRequest: com.amazonaws.services.pinpoint.model.CreateApplicationRequest, init: AmazonPinpointCreateAppCommand.() -> Unit): com.amazonaws.services.pinpoint.model.CreateAppResult {
	return this.block.declare(AmazonPinpointCreateAppCommand(createApplicationRequest).apply(init)) as com.amazonaws.services.pinpoint.model.CreateAppResult
}

@Generated
class AmazonPinpointCreateAppCommand(val createApplicationRequest: com.amazonaws.services.pinpoint.model.CreateApplicationRequest) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.CreateAppRequest, com.amazonaws.services.pinpoint.model.CreateAppResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.CreateAppRequest {
		val input = com.amazonaws.services.pinpoint.model.CreateAppRequest()
		input.setCreateApplicationRequest(this.createApplicationRequest)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.CreateAppResult {
	  return com.amazonaws.services.pinpoint.model.CreateAppResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.CreateAppResult {
		return environment.mobiletargeting.createApp(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting create-app")
				.argument("create-application-request", createApplicationRequest.toString())
	}

}


fun AmazonPinpointFunctions.createCampaign(applicationId: String, writeCampaignRequest: com.amazonaws.services.pinpoint.model.WriteCampaignRequest, init: AmazonPinpointCreateCampaignCommand.() -> Unit): com.amazonaws.services.pinpoint.model.CreateCampaignResult {
	return this.block.declare(AmazonPinpointCreateCampaignCommand(applicationId, writeCampaignRequest).apply(init)) as com.amazonaws.services.pinpoint.model.CreateCampaignResult
}

@Generated
class AmazonPinpointCreateCampaignCommand(val applicationId: String, val writeCampaignRequest: com.amazonaws.services.pinpoint.model.WriteCampaignRequest) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.CreateCampaignRequest, com.amazonaws.services.pinpoint.model.CreateCampaignResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.CreateCampaignRequest {
		val input = com.amazonaws.services.pinpoint.model.CreateCampaignRequest()
		input.setApplicationId(this.applicationId)
		input.setWriteCampaignRequest(this.writeCampaignRequest)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.CreateCampaignResult {
	  return com.amazonaws.services.pinpoint.model.CreateCampaignResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.CreateCampaignResult {
		return environment.mobiletargeting.createCampaign(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting create-campaign")
				.argument("application-id", applicationId)
				.argument("write-campaign-request", writeCampaignRequest.toString())
	}

}


fun AmazonPinpointFunctions.createExportJob(applicationId: String, exportJobRequest: com.amazonaws.services.pinpoint.model.ExportJobRequest, init: AmazonPinpointCreateExportJobCommand.() -> Unit): com.amazonaws.services.pinpoint.model.CreateExportJobResult {
	return this.block.declare(AmazonPinpointCreateExportJobCommand(applicationId, exportJobRequest).apply(init)) as com.amazonaws.services.pinpoint.model.CreateExportJobResult
}

@Generated
class AmazonPinpointCreateExportJobCommand(val applicationId: String, val exportJobRequest: com.amazonaws.services.pinpoint.model.ExportJobRequest) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.CreateExportJobRequest, com.amazonaws.services.pinpoint.model.CreateExportJobResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.CreateExportJobRequest {
		val input = com.amazonaws.services.pinpoint.model.CreateExportJobRequest()
		input.setApplicationId(this.applicationId)
		input.setExportJobRequest(this.exportJobRequest)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.CreateExportJobResult {
	  return com.amazonaws.services.pinpoint.model.CreateExportJobResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.CreateExportJobResult {
		return environment.mobiletargeting.createExportJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting create-export-job")
				.argument("application-id", applicationId)
				.argument("export-job-request", exportJobRequest.toString())
	}

}


fun AmazonPinpointFunctions.createImportJob(applicationId: String, importJobRequest: com.amazonaws.services.pinpoint.model.ImportJobRequest, init: AmazonPinpointCreateImportJobCommand.() -> Unit): com.amazonaws.services.pinpoint.model.CreateImportJobResult {
	return this.block.declare(AmazonPinpointCreateImportJobCommand(applicationId, importJobRequest).apply(init)) as com.amazonaws.services.pinpoint.model.CreateImportJobResult
}

@Generated
class AmazonPinpointCreateImportJobCommand(val applicationId: String, val importJobRequest: com.amazonaws.services.pinpoint.model.ImportJobRequest) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.CreateImportJobRequest, com.amazonaws.services.pinpoint.model.CreateImportJobResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.CreateImportJobRequest {
		val input = com.amazonaws.services.pinpoint.model.CreateImportJobRequest()
		input.setApplicationId(this.applicationId)
		input.setImportJobRequest(this.importJobRequest)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.CreateImportJobResult {
	  return com.amazonaws.services.pinpoint.model.CreateImportJobResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.CreateImportJobResult {
		return environment.mobiletargeting.createImportJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting create-import-job")
				.argument("application-id", applicationId)
				.argument("import-job-request", importJobRequest.toString())
	}

}


fun AmazonPinpointFunctions.createSegment(applicationId: String, writeSegmentRequest: com.amazonaws.services.pinpoint.model.WriteSegmentRequest, init: AmazonPinpointCreateSegmentCommand.() -> Unit): com.amazonaws.services.pinpoint.model.CreateSegmentResult {
	return this.block.declare(AmazonPinpointCreateSegmentCommand(applicationId, writeSegmentRequest).apply(init)) as com.amazonaws.services.pinpoint.model.CreateSegmentResult
}

@Generated
class AmazonPinpointCreateSegmentCommand(val applicationId: String, val writeSegmentRequest: com.amazonaws.services.pinpoint.model.WriteSegmentRequest) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.CreateSegmentRequest, com.amazonaws.services.pinpoint.model.CreateSegmentResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.CreateSegmentRequest {
		val input = com.amazonaws.services.pinpoint.model.CreateSegmentRequest()
		input.setApplicationId(this.applicationId)
		input.setWriteSegmentRequest(this.writeSegmentRequest)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.CreateSegmentResult {
	  return com.amazonaws.services.pinpoint.model.CreateSegmentResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.CreateSegmentResult {
		return environment.mobiletargeting.createSegment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting create-segment")
				.argument("application-id", applicationId)
				.argument("write-segment-request", writeSegmentRequest.toString())
	}

}


fun AmazonPinpointFunctions.deleteAdmChannel(applicationId: String, init: AmazonPinpointDeleteAdmChannelCommand.() -> Unit): com.amazonaws.services.pinpoint.model.DeleteAdmChannelResult {
	return this.block.declare(AmazonPinpointDeleteAdmChannelCommand(applicationId).apply(init)) as com.amazonaws.services.pinpoint.model.DeleteAdmChannelResult
}

@Generated
class AmazonPinpointDeleteAdmChannelCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.DeleteAdmChannelRequest, com.amazonaws.services.pinpoint.model.DeleteAdmChannelResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.DeleteAdmChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.DeleteAdmChannelRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.DeleteAdmChannelResult {
	  return com.amazonaws.services.pinpoint.model.DeleteAdmChannelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.DeleteAdmChannelResult {
		return environment.mobiletargeting.deleteAdmChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting delete-adm-channel")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.deleteApnsChannel(applicationId: String, init: AmazonPinpointDeleteApnsChannelCommand.() -> Unit): com.amazonaws.services.pinpoint.model.DeleteApnsChannelResult {
	return this.block.declare(AmazonPinpointDeleteApnsChannelCommand(applicationId).apply(init)) as com.amazonaws.services.pinpoint.model.DeleteApnsChannelResult
}

@Generated
class AmazonPinpointDeleteApnsChannelCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.DeleteApnsChannelRequest, com.amazonaws.services.pinpoint.model.DeleteApnsChannelResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.DeleteApnsChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.DeleteApnsChannelRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.DeleteApnsChannelResult {
	  return com.amazonaws.services.pinpoint.model.DeleteApnsChannelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.DeleteApnsChannelResult {
		return environment.mobiletargeting.deleteApnsChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting delete-apns-channel")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.deleteApnsSandboxChannel(applicationId: String, init: AmazonPinpointDeleteApnsSandboxChannelCommand.() -> Unit): com.amazonaws.services.pinpoint.model.DeleteApnsSandboxChannelResult {
	return this.block.declare(AmazonPinpointDeleteApnsSandboxChannelCommand(applicationId).apply(init)) as com.amazonaws.services.pinpoint.model.DeleteApnsSandboxChannelResult
}

@Generated
class AmazonPinpointDeleteApnsSandboxChannelCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.DeleteApnsSandboxChannelRequest, com.amazonaws.services.pinpoint.model.DeleteApnsSandboxChannelResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.DeleteApnsSandboxChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.DeleteApnsSandboxChannelRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.DeleteApnsSandboxChannelResult {
	  return com.amazonaws.services.pinpoint.model.DeleteApnsSandboxChannelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.DeleteApnsSandboxChannelResult {
		return environment.mobiletargeting.deleteApnsSandboxChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting delete-apns-sandbox-channel")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.deleteApnsVoipChannel(applicationId: String, init: AmazonPinpointDeleteApnsVoipChannelCommand.() -> Unit): com.amazonaws.services.pinpoint.model.DeleteApnsVoipChannelResult {
	return this.block.declare(AmazonPinpointDeleteApnsVoipChannelCommand(applicationId).apply(init)) as com.amazonaws.services.pinpoint.model.DeleteApnsVoipChannelResult
}

@Generated
class AmazonPinpointDeleteApnsVoipChannelCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.DeleteApnsVoipChannelRequest, com.amazonaws.services.pinpoint.model.DeleteApnsVoipChannelResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.DeleteApnsVoipChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.DeleteApnsVoipChannelRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.DeleteApnsVoipChannelResult {
	  return com.amazonaws.services.pinpoint.model.DeleteApnsVoipChannelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.DeleteApnsVoipChannelResult {
		return environment.mobiletargeting.deleteApnsVoipChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting delete-apns-voip-channel")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.deleteApnsVoipSandboxChannel(applicationId: String, init: AmazonPinpointDeleteApnsVoipSandboxChannelCommand.() -> Unit): com.amazonaws.services.pinpoint.model.DeleteApnsVoipSandboxChannelResult {
	return this.block.declare(AmazonPinpointDeleteApnsVoipSandboxChannelCommand(applicationId).apply(init)) as com.amazonaws.services.pinpoint.model.DeleteApnsVoipSandboxChannelResult
}

@Generated
class AmazonPinpointDeleteApnsVoipSandboxChannelCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.DeleteApnsVoipSandboxChannelRequest, com.amazonaws.services.pinpoint.model.DeleteApnsVoipSandboxChannelResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.DeleteApnsVoipSandboxChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.DeleteApnsVoipSandboxChannelRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.DeleteApnsVoipSandboxChannelResult {
	  return com.amazonaws.services.pinpoint.model.DeleteApnsVoipSandboxChannelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.DeleteApnsVoipSandboxChannelResult {
		return environment.mobiletargeting.deleteApnsVoipSandboxChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting delete-apns-voip-sandbox-channel")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.deleteApp(applicationId: String, init: AmazonPinpointDeleteAppCommand.() -> Unit): com.amazonaws.services.pinpoint.model.DeleteAppResult {
	return this.block.declare(AmazonPinpointDeleteAppCommand(applicationId).apply(init)) as com.amazonaws.services.pinpoint.model.DeleteAppResult
}

@Generated
class AmazonPinpointDeleteAppCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.DeleteAppRequest, com.amazonaws.services.pinpoint.model.DeleteAppResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.DeleteAppRequest {
		val input = com.amazonaws.services.pinpoint.model.DeleteAppRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.DeleteAppResult {
	  return com.amazonaws.services.pinpoint.model.DeleteAppResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.DeleteAppResult {
		return environment.mobiletargeting.deleteApp(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting delete-app")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.deleteBaiduChannel(applicationId: String, init: AmazonPinpointDeleteBaiduChannelCommand.() -> Unit): com.amazonaws.services.pinpoint.model.DeleteBaiduChannelResult {
	return this.block.declare(AmazonPinpointDeleteBaiduChannelCommand(applicationId).apply(init)) as com.amazonaws.services.pinpoint.model.DeleteBaiduChannelResult
}

@Generated
class AmazonPinpointDeleteBaiduChannelCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.DeleteBaiduChannelRequest, com.amazonaws.services.pinpoint.model.DeleteBaiduChannelResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.DeleteBaiduChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.DeleteBaiduChannelRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.DeleteBaiduChannelResult {
	  return com.amazonaws.services.pinpoint.model.DeleteBaiduChannelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.DeleteBaiduChannelResult {
		return environment.mobiletargeting.deleteBaiduChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting delete-baidu-channel")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.deleteCampaign(applicationId: String, campaignId: String, init: AmazonPinpointDeleteCampaignCommand.() -> Unit): com.amazonaws.services.pinpoint.model.DeleteCampaignResult {
	return this.block.declare(AmazonPinpointDeleteCampaignCommand(applicationId, campaignId).apply(init)) as com.amazonaws.services.pinpoint.model.DeleteCampaignResult
}

@Generated
class AmazonPinpointDeleteCampaignCommand(val applicationId: String, val campaignId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.DeleteCampaignRequest, com.amazonaws.services.pinpoint.model.DeleteCampaignResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.DeleteCampaignRequest {
		val input = com.amazonaws.services.pinpoint.model.DeleteCampaignRequest()
		input.setApplicationId(this.applicationId)
		input.setCampaignId(this.campaignId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.DeleteCampaignResult {
	  return com.amazonaws.services.pinpoint.model.DeleteCampaignResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.DeleteCampaignResult {
		return environment.mobiletargeting.deleteCampaign(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting delete-campaign")
				.argument("application-id", applicationId)
				.argument("campaign-id", campaignId)
	}

}


fun AmazonPinpointFunctions.deleteEmailChannel(applicationId: String, init: AmazonPinpointDeleteEmailChannelCommand.() -> Unit): com.amazonaws.services.pinpoint.model.DeleteEmailChannelResult {
	return this.block.declare(AmazonPinpointDeleteEmailChannelCommand(applicationId).apply(init)) as com.amazonaws.services.pinpoint.model.DeleteEmailChannelResult
}

@Generated
class AmazonPinpointDeleteEmailChannelCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.DeleteEmailChannelRequest, com.amazonaws.services.pinpoint.model.DeleteEmailChannelResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.DeleteEmailChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.DeleteEmailChannelRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.DeleteEmailChannelResult {
	  return com.amazonaws.services.pinpoint.model.DeleteEmailChannelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.DeleteEmailChannelResult {
		return environment.mobiletargeting.deleteEmailChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting delete-email-channel")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.deleteEndpoint(applicationId: String, endpointId: String, init: AmazonPinpointDeleteEndpointCommand.() -> Unit): com.amazonaws.services.pinpoint.model.DeleteEndpointResult {
	return this.block.declare(AmazonPinpointDeleteEndpointCommand(applicationId, endpointId).apply(init)) as com.amazonaws.services.pinpoint.model.DeleteEndpointResult
}

@Generated
class AmazonPinpointDeleteEndpointCommand(val applicationId: String, val endpointId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.DeleteEndpointRequest, com.amazonaws.services.pinpoint.model.DeleteEndpointResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.DeleteEndpointRequest {
		val input = com.amazonaws.services.pinpoint.model.DeleteEndpointRequest()
		input.setApplicationId(this.applicationId)
		input.setEndpointId(this.endpointId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.DeleteEndpointResult {
	  return com.amazonaws.services.pinpoint.model.DeleteEndpointResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.DeleteEndpointResult {
		return environment.mobiletargeting.deleteEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting delete-endpoint")
				.argument("application-id", applicationId)
				.argument("endpoint-id", endpointId)
	}

}


fun AmazonPinpointFunctions.deleteEventStream(applicationId: String, init: AmazonPinpointDeleteEventStreamCommand.() -> Unit): com.amazonaws.services.pinpoint.model.DeleteEventStreamResult {
	return this.block.declare(AmazonPinpointDeleteEventStreamCommand(applicationId).apply(init)) as com.amazonaws.services.pinpoint.model.DeleteEventStreamResult
}

@Generated
class AmazonPinpointDeleteEventStreamCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.DeleteEventStreamRequest, com.amazonaws.services.pinpoint.model.DeleteEventStreamResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.DeleteEventStreamRequest {
		val input = com.amazonaws.services.pinpoint.model.DeleteEventStreamRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.DeleteEventStreamResult {
	  return com.amazonaws.services.pinpoint.model.DeleteEventStreamResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.DeleteEventStreamResult {
		return environment.mobiletargeting.deleteEventStream(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting delete-event-stream")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.deleteGcmChannel(applicationId: String, init: AmazonPinpointDeleteGcmChannelCommand.() -> Unit): com.amazonaws.services.pinpoint.model.DeleteGcmChannelResult {
	return this.block.declare(AmazonPinpointDeleteGcmChannelCommand(applicationId).apply(init)) as com.amazonaws.services.pinpoint.model.DeleteGcmChannelResult
}

@Generated
class AmazonPinpointDeleteGcmChannelCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.DeleteGcmChannelRequest, com.amazonaws.services.pinpoint.model.DeleteGcmChannelResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.DeleteGcmChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.DeleteGcmChannelRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.DeleteGcmChannelResult {
	  return com.amazonaws.services.pinpoint.model.DeleteGcmChannelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.DeleteGcmChannelResult {
		return environment.mobiletargeting.deleteGcmChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting delete-gcm-channel")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.deleteSegment(applicationId: String, segmentId: String, init: AmazonPinpointDeleteSegmentCommand.() -> Unit): com.amazonaws.services.pinpoint.model.DeleteSegmentResult {
	return this.block.declare(AmazonPinpointDeleteSegmentCommand(applicationId, segmentId).apply(init)) as com.amazonaws.services.pinpoint.model.DeleteSegmentResult
}

@Generated
class AmazonPinpointDeleteSegmentCommand(val applicationId: String, val segmentId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.DeleteSegmentRequest, com.amazonaws.services.pinpoint.model.DeleteSegmentResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.DeleteSegmentRequest {
		val input = com.amazonaws.services.pinpoint.model.DeleteSegmentRequest()
		input.setApplicationId(this.applicationId)
		input.setSegmentId(this.segmentId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.DeleteSegmentResult {
	  return com.amazonaws.services.pinpoint.model.DeleteSegmentResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.DeleteSegmentResult {
		return environment.mobiletargeting.deleteSegment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting delete-segment")
				.argument("application-id", applicationId)
				.argument("segment-id", segmentId)
	}

}


fun AmazonPinpointFunctions.deleteSmsChannel(applicationId: String, init: AmazonPinpointDeleteSmsChannelCommand.() -> Unit): com.amazonaws.services.pinpoint.model.DeleteSmsChannelResult {
	return this.block.declare(AmazonPinpointDeleteSmsChannelCommand(applicationId).apply(init)) as com.amazonaws.services.pinpoint.model.DeleteSmsChannelResult
}

@Generated
class AmazonPinpointDeleteSmsChannelCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.DeleteSmsChannelRequest, com.amazonaws.services.pinpoint.model.DeleteSmsChannelResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.DeleteSmsChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.DeleteSmsChannelRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.DeleteSmsChannelResult {
	  return com.amazonaws.services.pinpoint.model.DeleteSmsChannelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.DeleteSmsChannelResult {
		return environment.mobiletargeting.deleteSmsChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting delete-sms-channel")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.getAdmChannel(applicationId: String, init: AmazonPinpointGetAdmChannelCommand.() -> Unit): com.amazonaws.services.pinpoint.model.GetAdmChannelResult {
	return this.block.declare(AmazonPinpointGetAdmChannelCommand(applicationId).apply(init)) as com.amazonaws.services.pinpoint.model.GetAdmChannelResult
}

@Generated
class AmazonPinpointGetAdmChannelCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetAdmChannelRequest, com.amazonaws.services.pinpoint.model.GetAdmChannelResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.GetAdmChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.GetAdmChannelRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.GetAdmChannelResult {
	  return com.amazonaws.services.pinpoint.model.GetAdmChannelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.GetAdmChannelResult {
		return environment.mobiletargeting.getAdmChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-adm-channel")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.getApnsChannel(applicationId: String, init: AmazonPinpointGetApnsChannelCommand.() -> Unit): com.amazonaws.services.pinpoint.model.GetApnsChannelResult {
	return this.block.declare(AmazonPinpointGetApnsChannelCommand(applicationId).apply(init)) as com.amazonaws.services.pinpoint.model.GetApnsChannelResult
}

@Generated
class AmazonPinpointGetApnsChannelCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetApnsChannelRequest, com.amazonaws.services.pinpoint.model.GetApnsChannelResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.GetApnsChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.GetApnsChannelRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.GetApnsChannelResult {
	  return com.amazonaws.services.pinpoint.model.GetApnsChannelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.GetApnsChannelResult {
		return environment.mobiletargeting.getApnsChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-apns-channel")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.getApnsSandboxChannel(applicationId: String, init: AmazonPinpointGetApnsSandboxChannelCommand.() -> Unit): com.amazonaws.services.pinpoint.model.GetApnsSandboxChannelResult {
	return this.block.declare(AmazonPinpointGetApnsSandboxChannelCommand(applicationId).apply(init)) as com.amazonaws.services.pinpoint.model.GetApnsSandboxChannelResult
}

@Generated
class AmazonPinpointGetApnsSandboxChannelCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetApnsSandboxChannelRequest, com.amazonaws.services.pinpoint.model.GetApnsSandboxChannelResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.GetApnsSandboxChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.GetApnsSandboxChannelRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.GetApnsSandboxChannelResult {
	  return com.amazonaws.services.pinpoint.model.GetApnsSandboxChannelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.GetApnsSandboxChannelResult {
		return environment.mobiletargeting.getApnsSandboxChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-apns-sandbox-channel")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.getApnsVoipChannel(applicationId: String, init: AmazonPinpointGetApnsVoipChannelCommand.() -> Unit): com.amazonaws.services.pinpoint.model.GetApnsVoipChannelResult {
	return this.block.declare(AmazonPinpointGetApnsVoipChannelCommand(applicationId).apply(init)) as com.amazonaws.services.pinpoint.model.GetApnsVoipChannelResult
}

@Generated
class AmazonPinpointGetApnsVoipChannelCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetApnsVoipChannelRequest, com.amazonaws.services.pinpoint.model.GetApnsVoipChannelResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.GetApnsVoipChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.GetApnsVoipChannelRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.GetApnsVoipChannelResult {
	  return com.amazonaws.services.pinpoint.model.GetApnsVoipChannelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.GetApnsVoipChannelResult {
		return environment.mobiletargeting.getApnsVoipChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-apns-voip-channel")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.getApnsVoipSandboxChannel(applicationId: String, init: AmazonPinpointGetApnsVoipSandboxChannelCommand.() -> Unit): com.amazonaws.services.pinpoint.model.GetApnsVoipSandboxChannelResult {
	return this.block.declare(AmazonPinpointGetApnsVoipSandboxChannelCommand(applicationId).apply(init)) as com.amazonaws.services.pinpoint.model.GetApnsVoipSandboxChannelResult
}

@Generated
class AmazonPinpointGetApnsVoipSandboxChannelCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetApnsVoipSandboxChannelRequest, com.amazonaws.services.pinpoint.model.GetApnsVoipSandboxChannelResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.GetApnsVoipSandboxChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.GetApnsVoipSandboxChannelRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.GetApnsVoipSandboxChannelResult {
	  return com.amazonaws.services.pinpoint.model.GetApnsVoipSandboxChannelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.GetApnsVoipSandboxChannelResult {
		return environment.mobiletargeting.getApnsVoipSandboxChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-apns-voip-sandbox-channel")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.getApp(applicationId: String, init: AmazonPinpointGetAppCommand.() -> Unit): com.amazonaws.services.pinpoint.model.GetAppResult {
	return this.block.declare(AmazonPinpointGetAppCommand(applicationId).apply(init)) as com.amazonaws.services.pinpoint.model.GetAppResult
}

@Generated
class AmazonPinpointGetAppCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetAppRequest, com.amazonaws.services.pinpoint.model.GetAppResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.GetAppRequest {
		val input = com.amazonaws.services.pinpoint.model.GetAppRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.GetAppResult {
	  return com.amazonaws.services.pinpoint.model.GetAppResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.GetAppResult {
		return environment.mobiletargeting.getApp(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-app")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.getApplicationSettings(applicationId: String, init: AmazonPinpointGetApplicationSettingsCommand.() -> Unit): com.amazonaws.services.pinpoint.model.GetApplicationSettingsResult {
	return this.block.declare(AmazonPinpointGetApplicationSettingsCommand(applicationId).apply(init)) as com.amazonaws.services.pinpoint.model.GetApplicationSettingsResult
}

@Generated
class AmazonPinpointGetApplicationSettingsCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetApplicationSettingsRequest, com.amazonaws.services.pinpoint.model.GetApplicationSettingsResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.GetApplicationSettingsRequest {
		val input = com.amazonaws.services.pinpoint.model.GetApplicationSettingsRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.GetApplicationSettingsResult {
	  return com.amazonaws.services.pinpoint.model.GetApplicationSettingsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.GetApplicationSettingsResult {
		return environment.mobiletargeting.getApplicationSettings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-application-settings")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.getApps(init: AmazonPinpointGetAppsCommand.() -> Unit): com.amazonaws.services.pinpoint.model.GetAppsResult {
	return this.block.declare(AmazonPinpointGetAppsCommand().apply(init)) as com.amazonaws.services.pinpoint.model.GetAppsResult
}

@Generated
class AmazonPinpointGetAppsCommand() : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetAppsRequest, com.amazonaws.services.pinpoint.model.GetAppsResult> {

	var pageSize: String? = null
	var token: String? = null

	override fun build(): com.amazonaws.services.pinpoint.model.GetAppsRequest {
		val input = com.amazonaws.services.pinpoint.model.GetAppsRequest()
		input.setPageSize(this.pageSize)
		input.setToken(this.token)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.GetAppsResult {
	  return com.amazonaws.services.pinpoint.model.GetAppsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.GetAppsResult {
		return environment.mobiletargeting.getApps(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-apps")
				.argument("page-size", pageSize)
				.argument("token", token)
	}

}


fun AmazonPinpointFunctions.getBaiduChannel(applicationId: String, init: AmazonPinpointGetBaiduChannelCommand.() -> Unit): com.amazonaws.services.pinpoint.model.GetBaiduChannelResult {
	return this.block.declare(AmazonPinpointGetBaiduChannelCommand(applicationId).apply(init)) as com.amazonaws.services.pinpoint.model.GetBaiduChannelResult
}

@Generated
class AmazonPinpointGetBaiduChannelCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetBaiduChannelRequest, com.amazonaws.services.pinpoint.model.GetBaiduChannelResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.GetBaiduChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.GetBaiduChannelRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.GetBaiduChannelResult {
	  return com.amazonaws.services.pinpoint.model.GetBaiduChannelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.GetBaiduChannelResult {
		return environment.mobiletargeting.getBaiduChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-baidu-channel")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.getCampaign(applicationId: String, campaignId: String, init: AmazonPinpointGetCampaignCommand.() -> Unit): com.amazonaws.services.pinpoint.model.GetCampaignResult {
	return this.block.declare(AmazonPinpointGetCampaignCommand(applicationId, campaignId).apply(init)) as com.amazonaws.services.pinpoint.model.GetCampaignResult
}

@Generated
class AmazonPinpointGetCampaignCommand(val applicationId: String, val campaignId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetCampaignRequest, com.amazonaws.services.pinpoint.model.GetCampaignResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.GetCampaignRequest {
		val input = com.amazonaws.services.pinpoint.model.GetCampaignRequest()
		input.setApplicationId(this.applicationId)
		input.setCampaignId(this.campaignId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.GetCampaignResult {
	  return com.amazonaws.services.pinpoint.model.GetCampaignResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.GetCampaignResult {
		return environment.mobiletargeting.getCampaign(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-campaign")
				.argument("application-id", applicationId)
				.argument("campaign-id", campaignId)
	}

}


fun AmazonPinpointFunctions.getCampaignActivities(applicationId: String, campaignId: String, init: AmazonPinpointGetCampaignActivitiesCommand.() -> Unit): com.amazonaws.services.pinpoint.model.GetCampaignActivitiesResult {
	return this.block.declare(AmazonPinpointGetCampaignActivitiesCommand(applicationId, campaignId).apply(init)) as com.amazonaws.services.pinpoint.model.GetCampaignActivitiesResult
}

@Generated
class AmazonPinpointGetCampaignActivitiesCommand(val applicationId: String, val campaignId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetCampaignActivitiesRequest, com.amazonaws.services.pinpoint.model.GetCampaignActivitiesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.GetCampaignActivitiesResult {
	  return com.amazonaws.services.pinpoint.model.GetCampaignActivitiesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.GetCampaignActivitiesResult {
		return environment.mobiletargeting.getCampaignActivities(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-campaign-activities")
				.argument("application-id", applicationId)
				.argument("campaign-id", campaignId)
				.argument("page-size", pageSize)
				.argument("token", token)
	}

}


fun AmazonPinpointFunctions.getCampaignVersion(applicationId: String, campaignId: String, version: String, init: AmazonPinpointGetCampaignVersionCommand.() -> Unit): com.amazonaws.services.pinpoint.model.GetCampaignVersionResult {
	return this.block.declare(AmazonPinpointGetCampaignVersionCommand(applicationId, campaignId, version).apply(init)) as com.amazonaws.services.pinpoint.model.GetCampaignVersionResult
}

@Generated
class AmazonPinpointGetCampaignVersionCommand(val applicationId: String, val campaignId: String, val version: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetCampaignVersionRequest, com.amazonaws.services.pinpoint.model.GetCampaignVersionResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.GetCampaignVersionRequest {
		val input = com.amazonaws.services.pinpoint.model.GetCampaignVersionRequest()
		input.setApplicationId(this.applicationId)
		input.setCampaignId(this.campaignId)
		input.setVersion(this.version)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.GetCampaignVersionResult {
	  return com.amazonaws.services.pinpoint.model.GetCampaignVersionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.GetCampaignVersionResult {
		return environment.mobiletargeting.getCampaignVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-campaign-version")
				.argument("application-id", applicationId)
				.argument("campaign-id", campaignId)
				.argument("version", version)
	}

}


fun AmazonPinpointFunctions.getCampaignVersions(applicationId: String, campaignId: String, init: AmazonPinpointGetCampaignVersionsCommand.() -> Unit): com.amazonaws.services.pinpoint.model.GetCampaignVersionsResult {
	return this.block.declare(AmazonPinpointGetCampaignVersionsCommand(applicationId, campaignId).apply(init)) as com.amazonaws.services.pinpoint.model.GetCampaignVersionsResult
}

@Generated
class AmazonPinpointGetCampaignVersionsCommand(val applicationId: String, val campaignId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetCampaignVersionsRequest, com.amazonaws.services.pinpoint.model.GetCampaignVersionsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.GetCampaignVersionsResult {
	  return com.amazonaws.services.pinpoint.model.GetCampaignVersionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.GetCampaignVersionsResult {
		return environment.mobiletargeting.getCampaignVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-campaign-versions")
				.argument("application-id", applicationId)
				.argument("campaign-id", campaignId)
				.argument("page-size", pageSize)
				.argument("token", token)
	}

}


fun AmazonPinpointFunctions.getCampaigns(applicationId: String, init: AmazonPinpointGetCampaignsCommand.() -> Unit): com.amazonaws.services.pinpoint.model.GetCampaignsResult {
	return this.block.declare(AmazonPinpointGetCampaignsCommand(applicationId).apply(init)) as com.amazonaws.services.pinpoint.model.GetCampaignsResult
}

@Generated
class AmazonPinpointGetCampaignsCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetCampaignsRequest, com.amazonaws.services.pinpoint.model.GetCampaignsResult> {

	var pageSize: String? = null
	var token: String? = null

	override fun build(): com.amazonaws.services.pinpoint.model.GetCampaignsRequest {
		val input = com.amazonaws.services.pinpoint.model.GetCampaignsRequest()
		input.setApplicationId(this.applicationId)
		input.setPageSize(this.pageSize)
		input.setToken(this.token)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.GetCampaignsResult {
	  return com.amazonaws.services.pinpoint.model.GetCampaignsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.GetCampaignsResult {
		return environment.mobiletargeting.getCampaigns(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-campaigns")
				.argument("application-id", applicationId)
				.argument("page-size", pageSize)
				.argument("token", token)
	}

}


fun AmazonPinpointFunctions.getEmailChannel(applicationId: String, init: AmazonPinpointGetEmailChannelCommand.() -> Unit): com.amazonaws.services.pinpoint.model.GetEmailChannelResult {
	return this.block.declare(AmazonPinpointGetEmailChannelCommand(applicationId).apply(init)) as com.amazonaws.services.pinpoint.model.GetEmailChannelResult
}

@Generated
class AmazonPinpointGetEmailChannelCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetEmailChannelRequest, com.amazonaws.services.pinpoint.model.GetEmailChannelResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.GetEmailChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.GetEmailChannelRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.GetEmailChannelResult {
	  return com.amazonaws.services.pinpoint.model.GetEmailChannelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.GetEmailChannelResult {
		return environment.mobiletargeting.getEmailChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-email-channel")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.getEndpoint(applicationId: String, endpointId: String, init: AmazonPinpointGetEndpointCommand.() -> Unit): com.amazonaws.services.pinpoint.model.GetEndpointResult {
	return this.block.declare(AmazonPinpointGetEndpointCommand(applicationId, endpointId).apply(init)) as com.amazonaws.services.pinpoint.model.GetEndpointResult
}

@Generated
class AmazonPinpointGetEndpointCommand(val applicationId: String, val endpointId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetEndpointRequest, com.amazonaws.services.pinpoint.model.GetEndpointResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.GetEndpointRequest {
		val input = com.amazonaws.services.pinpoint.model.GetEndpointRequest()
		input.setApplicationId(this.applicationId)
		input.setEndpointId(this.endpointId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.GetEndpointResult {
	  return com.amazonaws.services.pinpoint.model.GetEndpointResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.GetEndpointResult {
		return environment.mobiletargeting.getEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-endpoint")
				.argument("application-id", applicationId)
				.argument("endpoint-id", endpointId)
	}

}


fun AmazonPinpointFunctions.getEventStream(applicationId: String, init: AmazonPinpointGetEventStreamCommand.() -> Unit): com.amazonaws.services.pinpoint.model.GetEventStreamResult {
	return this.block.declare(AmazonPinpointGetEventStreamCommand(applicationId).apply(init)) as com.amazonaws.services.pinpoint.model.GetEventStreamResult
}

@Generated
class AmazonPinpointGetEventStreamCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetEventStreamRequest, com.amazonaws.services.pinpoint.model.GetEventStreamResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.GetEventStreamRequest {
		val input = com.amazonaws.services.pinpoint.model.GetEventStreamRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.GetEventStreamResult {
	  return com.amazonaws.services.pinpoint.model.GetEventStreamResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.GetEventStreamResult {
		return environment.mobiletargeting.getEventStream(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-event-stream")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.getExportJob(applicationId: String, jobId: String, init: AmazonPinpointGetExportJobCommand.() -> Unit): com.amazonaws.services.pinpoint.model.GetExportJobResult {
	return this.block.declare(AmazonPinpointGetExportJobCommand(applicationId, jobId).apply(init)) as com.amazonaws.services.pinpoint.model.GetExportJobResult
}

@Generated
class AmazonPinpointGetExportJobCommand(val applicationId: String, val jobId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetExportJobRequest, com.amazonaws.services.pinpoint.model.GetExportJobResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.GetExportJobRequest {
		val input = com.amazonaws.services.pinpoint.model.GetExportJobRequest()
		input.setApplicationId(this.applicationId)
		input.setJobId(this.jobId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.GetExportJobResult {
	  return com.amazonaws.services.pinpoint.model.GetExportJobResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.GetExportJobResult {
		return environment.mobiletargeting.getExportJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-export-job")
				.argument("application-id", applicationId)
				.argument("job-id", jobId)
	}

}


fun AmazonPinpointFunctions.getExportJobs(applicationId: String, init: AmazonPinpointGetExportJobsCommand.() -> Unit): com.amazonaws.services.pinpoint.model.GetExportJobsResult {
	return this.block.declare(AmazonPinpointGetExportJobsCommand(applicationId).apply(init)) as com.amazonaws.services.pinpoint.model.GetExportJobsResult
}

@Generated
class AmazonPinpointGetExportJobsCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetExportJobsRequest, com.amazonaws.services.pinpoint.model.GetExportJobsResult> {

	var pageSize: String? = null
	var token: String? = null

	override fun build(): com.amazonaws.services.pinpoint.model.GetExportJobsRequest {
		val input = com.amazonaws.services.pinpoint.model.GetExportJobsRequest()
		input.setApplicationId(this.applicationId)
		input.setPageSize(this.pageSize)
		input.setToken(this.token)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.GetExportJobsResult {
	  return com.amazonaws.services.pinpoint.model.GetExportJobsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.GetExportJobsResult {
		return environment.mobiletargeting.getExportJobs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-export-jobs")
				.argument("application-id", applicationId)
				.argument("page-size", pageSize)
				.argument("token", token)
	}

}


fun AmazonPinpointFunctions.getGcmChannel(applicationId: String, init: AmazonPinpointGetGcmChannelCommand.() -> Unit): com.amazonaws.services.pinpoint.model.GetGcmChannelResult {
	return this.block.declare(AmazonPinpointGetGcmChannelCommand(applicationId).apply(init)) as com.amazonaws.services.pinpoint.model.GetGcmChannelResult
}

@Generated
class AmazonPinpointGetGcmChannelCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetGcmChannelRequest, com.amazonaws.services.pinpoint.model.GetGcmChannelResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.GetGcmChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.GetGcmChannelRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.GetGcmChannelResult {
	  return com.amazonaws.services.pinpoint.model.GetGcmChannelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.GetGcmChannelResult {
		return environment.mobiletargeting.getGcmChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-gcm-channel")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.getImportJob(applicationId: String, jobId: String, init: AmazonPinpointGetImportJobCommand.() -> Unit): com.amazonaws.services.pinpoint.model.GetImportJobResult {
	return this.block.declare(AmazonPinpointGetImportJobCommand(applicationId, jobId).apply(init)) as com.amazonaws.services.pinpoint.model.GetImportJobResult
}

@Generated
class AmazonPinpointGetImportJobCommand(val applicationId: String, val jobId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetImportJobRequest, com.amazonaws.services.pinpoint.model.GetImportJobResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.GetImportJobRequest {
		val input = com.amazonaws.services.pinpoint.model.GetImportJobRequest()
		input.setApplicationId(this.applicationId)
		input.setJobId(this.jobId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.GetImportJobResult {
	  return com.amazonaws.services.pinpoint.model.GetImportJobResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.GetImportJobResult {
		return environment.mobiletargeting.getImportJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-import-job")
				.argument("application-id", applicationId)
				.argument("job-id", jobId)
	}

}


fun AmazonPinpointFunctions.getImportJobs(applicationId: String, init: AmazonPinpointGetImportJobsCommand.() -> Unit): com.amazonaws.services.pinpoint.model.GetImportJobsResult {
	return this.block.declare(AmazonPinpointGetImportJobsCommand(applicationId).apply(init)) as com.amazonaws.services.pinpoint.model.GetImportJobsResult
}

@Generated
class AmazonPinpointGetImportJobsCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetImportJobsRequest, com.amazonaws.services.pinpoint.model.GetImportJobsResult> {

	var pageSize: String? = null
	var token: String? = null

	override fun build(): com.amazonaws.services.pinpoint.model.GetImportJobsRequest {
		val input = com.amazonaws.services.pinpoint.model.GetImportJobsRequest()
		input.setApplicationId(this.applicationId)
		input.setPageSize(this.pageSize)
		input.setToken(this.token)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.GetImportJobsResult {
	  return com.amazonaws.services.pinpoint.model.GetImportJobsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.GetImportJobsResult {
		return environment.mobiletargeting.getImportJobs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-import-jobs")
				.argument("application-id", applicationId)
				.argument("page-size", pageSize)
				.argument("token", token)
	}

}


fun AmazonPinpointFunctions.getSegment(applicationId: String, segmentId: String, init: AmazonPinpointGetSegmentCommand.() -> Unit): com.amazonaws.services.pinpoint.model.GetSegmentResult {
	return this.block.declare(AmazonPinpointGetSegmentCommand(applicationId, segmentId).apply(init)) as com.amazonaws.services.pinpoint.model.GetSegmentResult
}

@Generated
class AmazonPinpointGetSegmentCommand(val applicationId: String, val segmentId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetSegmentRequest, com.amazonaws.services.pinpoint.model.GetSegmentResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.GetSegmentRequest {
		val input = com.amazonaws.services.pinpoint.model.GetSegmentRequest()
		input.setApplicationId(this.applicationId)
		input.setSegmentId(this.segmentId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.GetSegmentResult {
	  return com.amazonaws.services.pinpoint.model.GetSegmentResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.GetSegmentResult {
		return environment.mobiletargeting.getSegment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-segment")
				.argument("application-id", applicationId)
				.argument("segment-id", segmentId)
	}

}


fun AmazonPinpointFunctions.getSegmentExportJobs(applicationId: String, segmentId: String, init: AmazonPinpointGetSegmentExportJobsCommand.() -> Unit): com.amazonaws.services.pinpoint.model.GetSegmentExportJobsResult {
	return this.block.declare(AmazonPinpointGetSegmentExportJobsCommand(applicationId, segmentId).apply(init)) as com.amazonaws.services.pinpoint.model.GetSegmentExportJobsResult
}

@Generated
class AmazonPinpointGetSegmentExportJobsCommand(val applicationId: String, val segmentId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetSegmentExportJobsRequest, com.amazonaws.services.pinpoint.model.GetSegmentExportJobsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.GetSegmentExportJobsResult {
	  return com.amazonaws.services.pinpoint.model.GetSegmentExportJobsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.GetSegmentExportJobsResult {
		return environment.mobiletargeting.getSegmentExportJobs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-segment-export-jobs")
				.argument("application-id", applicationId)
				.argument("page-size", pageSize)
				.argument("segment-id", segmentId)
				.argument("token", token)
	}

}


fun AmazonPinpointFunctions.getSegmentImportJobs(applicationId: String, segmentId: String, init: AmazonPinpointGetSegmentImportJobsCommand.() -> Unit): com.amazonaws.services.pinpoint.model.GetSegmentImportJobsResult {
	return this.block.declare(AmazonPinpointGetSegmentImportJobsCommand(applicationId, segmentId).apply(init)) as com.amazonaws.services.pinpoint.model.GetSegmentImportJobsResult
}

@Generated
class AmazonPinpointGetSegmentImportJobsCommand(val applicationId: String, val segmentId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetSegmentImportJobsRequest, com.amazonaws.services.pinpoint.model.GetSegmentImportJobsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.GetSegmentImportJobsResult {
	  return com.amazonaws.services.pinpoint.model.GetSegmentImportJobsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.GetSegmentImportJobsResult {
		return environment.mobiletargeting.getSegmentImportJobs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-segment-import-jobs")
				.argument("application-id", applicationId)
				.argument("page-size", pageSize)
				.argument("segment-id", segmentId)
				.argument("token", token)
	}

}


fun AmazonPinpointFunctions.getSegmentVersion(applicationId: String, segmentId: String, version: String, init: AmazonPinpointGetSegmentVersionCommand.() -> Unit): com.amazonaws.services.pinpoint.model.GetSegmentVersionResult {
	return this.block.declare(AmazonPinpointGetSegmentVersionCommand(applicationId, segmentId, version).apply(init)) as com.amazonaws.services.pinpoint.model.GetSegmentVersionResult
}

@Generated
class AmazonPinpointGetSegmentVersionCommand(val applicationId: String, val segmentId: String, val version: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetSegmentVersionRequest, com.amazonaws.services.pinpoint.model.GetSegmentVersionResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.GetSegmentVersionRequest {
		val input = com.amazonaws.services.pinpoint.model.GetSegmentVersionRequest()
		input.setApplicationId(this.applicationId)
		input.setSegmentId(this.segmentId)
		input.setVersion(this.version)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.GetSegmentVersionResult {
	  return com.amazonaws.services.pinpoint.model.GetSegmentVersionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.GetSegmentVersionResult {
		return environment.mobiletargeting.getSegmentVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-segment-version")
				.argument("application-id", applicationId)
				.argument("segment-id", segmentId)
				.argument("version", version)
	}

}


fun AmazonPinpointFunctions.getSegmentVersions(applicationId: String, segmentId: String, init: AmazonPinpointGetSegmentVersionsCommand.() -> Unit): com.amazonaws.services.pinpoint.model.GetSegmentVersionsResult {
	return this.block.declare(AmazonPinpointGetSegmentVersionsCommand(applicationId, segmentId).apply(init)) as com.amazonaws.services.pinpoint.model.GetSegmentVersionsResult
}

@Generated
class AmazonPinpointGetSegmentVersionsCommand(val applicationId: String, val segmentId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetSegmentVersionsRequest, com.amazonaws.services.pinpoint.model.GetSegmentVersionsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.GetSegmentVersionsResult {
	  return com.amazonaws.services.pinpoint.model.GetSegmentVersionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.GetSegmentVersionsResult {
		return environment.mobiletargeting.getSegmentVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-segment-versions")
				.argument("application-id", applicationId)
				.argument("page-size", pageSize)
				.argument("segment-id", segmentId)
				.argument("token", token)
	}

}


fun AmazonPinpointFunctions.getSegments(applicationId: String, init: AmazonPinpointGetSegmentsCommand.() -> Unit): com.amazonaws.services.pinpoint.model.GetSegmentsResult {
	return this.block.declare(AmazonPinpointGetSegmentsCommand(applicationId).apply(init)) as com.amazonaws.services.pinpoint.model.GetSegmentsResult
}

@Generated
class AmazonPinpointGetSegmentsCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetSegmentsRequest, com.amazonaws.services.pinpoint.model.GetSegmentsResult> {

	var pageSize: String? = null
	var token: String? = null

	override fun build(): com.amazonaws.services.pinpoint.model.GetSegmentsRequest {
		val input = com.amazonaws.services.pinpoint.model.GetSegmentsRequest()
		input.setApplicationId(this.applicationId)
		input.setPageSize(this.pageSize)
		input.setToken(this.token)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.GetSegmentsResult {
	  return com.amazonaws.services.pinpoint.model.GetSegmentsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.GetSegmentsResult {
		return environment.mobiletargeting.getSegments(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-segments")
				.argument("application-id", applicationId)
				.argument("page-size", pageSize)
				.argument("token", token)
	}

}


fun AmazonPinpointFunctions.getSmsChannel(applicationId: String, init: AmazonPinpointGetSmsChannelCommand.() -> Unit): com.amazonaws.services.pinpoint.model.GetSmsChannelResult {
	return this.block.declare(AmazonPinpointGetSmsChannelCommand(applicationId).apply(init)) as com.amazonaws.services.pinpoint.model.GetSmsChannelResult
}

@Generated
class AmazonPinpointGetSmsChannelCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.GetSmsChannelRequest, com.amazonaws.services.pinpoint.model.GetSmsChannelResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.GetSmsChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.GetSmsChannelRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.GetSmsChannelResult {
	  return com.amazonaws.services.pinpoint.model.GetSmsChannelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.GetSmsChannelResult {
		return environment.mobiletargeting.getSmsChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting get-sms-channel")
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.putEventStream(applicationId: String, writeEventStream: com.amazonaws.services.pinpoint.model.WriteEventStream, init: AmazonPinpointPutEventStreamCommand.() -> Unit): com.amazonaws.services.pinpoint.model.PutEventStreamResult {
	return this.block.declare(AmazonPinpointPutEventStreamCommand(applicationId, writeEventStream).apply(init)) as com.amazonaws.services.pinpoint.model.PutEventStreamResult
}

@Generated
class AmazonPinpointPutEventStreamCommand(val applicationId: String, val writeEventStream: com.amazonaws.services.pinpoint.model.WriteEventStream) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.PutEventStreamRequest, com.amazonaws.services.pinpoint.model.PutEventStreamResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.PutEventStreamRequest {
		val input = com.amazonaws.services.pinpoint.model.PutEventStreamRequest()
		input.setApplicationId(this.applicationId)
		input.setWriteEventStream(this.writeEventStream)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.PutEventStreamResult {
	  return com.amazonaws.services.pinpoint.model.PutEventStreamResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.PutEventStreamResult {
		return environment.mobiletargeting.putEventStream(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting put-event-stream")
				.argument("application-id", applicationId)
				.argument("write-event-stream", writeEventStream.toString())
	}

}


fun AmazonPinpointFunctions.sendMessages(applicationId: String, messageRequest: com.amazonaws.services.pinpoint.model.MessageRequest, init: AmazonPinpointSendMessagesCommand.() -> Unit): com.amazonaws.services.pinpoint.model.SendMessagesResult {
	return this.block.declare(AmazonPinpointSendMessagesCommand(applicationId, messageRequest).apply(init)) as com.amazonaws.services.pinpoint.model.SendMessagesResult
}

@Generated
class AmazonPinpointSendMessagesCommand(val applicationId: String, val messageRequest: com.amazonaws.services.pinpoint.model.MessageRequest) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.SendMessagesRequest, com.amazonaws.services.pinpoint.model.SendMessagesResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.SendMessagesRequest {
		val input = com.amazonaws.services.pinpoint.model.SendMessagesRequest()
		input.setApplicationId(this.applicationId)
		input.setMessageRequest(this.messageRequest)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.SendMessagesResult {
	  return com.amazonaws.services.pinpoint.model.SendMessagesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.SendMessagesResult {
		return environment.mobiletargeting.sendMessages(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting send-messages")
				.argument("application-id", applicationId)
				.argument("message-request", messageRequest.toString())
	}

}


fun AmazonPinpointFunctions.sendUsersMessages(applicationId: String, sendUsersMessageRequest: com.amazonaws.services.pinpoint.model.SendUsersMessageRequest, init: AmazonPinpointSendUsersMessagesCommand.() -> Unit): com.amazonaws.services.pinpoint.model.SendUsersMessagesResult {
	return this.block.declare(AmazonPinpointSendUsersMessagesCommand(applicationId, sendUsersMessageRequest).apply(init)) as com.amazonaws.services.pinpoint.model.SendUsersMessagesResult
}

@Generated
class AmazonPinpointSendUsersMessagesCommand(val applicationId: String, val sendUsersMessageRequest: com.amazonaws.services.pinpoint.model.SendUsersMessageRequest) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.SendUsersMessagesRequest, com.amazonaws.services.pinpoint.model.SendUsersMessagesResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.SendUsersMessagesRequest {
		val input = com.amazonaws.services.pinpoint.model.SendUsersMessagesRequest()
		input.setApplicationId(this.applicationId)
		input.setSendUsersMessageRequest(this.sendUsersMessageRequest)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.SendUsersMessagesResult {
	  return com.amazonaws.services.pinpoint.model.SendUsersMessagesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.SendUsersMessagesResult {
		return environment.mobiletargeting.sendUsersMessages(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting send-users-messages")
				.argument("application-id", applicationId)
				.argument("send-users-message-request", sendUsersMessageRequest.toString())
	}

}


fun AmazonPinpointFunctions.updateAdmChannel(aDMChannelRequest: com.amazonaws.services.pinpoint.model.ADMChannelRequest, applicationId: String, init: AmazonPinpointUpdateAdmChannelCommand.() -> Unit): com.amazonaws.services.pinpoint.model.UpdateAdmChannelResult {
	return this.block.declare(AmazonPinpointUpdateAdmChannelCommand(aDMChannelRequest, applicationId).apply(init)) as com.amazonaws.services.pinpoint.model.UpdateAdmChannelResult
}

@Generated
class AmazonPinpointUpdateAdmChannelCommand(val aDMChannelRequest: com.amazonaws.services.pinpoint.model.ADMChannelRequest, val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.UpdateAdmChannelRequest, com.amazonaws.services.pinpoint.model.UpdateAdmChannelResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.UpdateAdmChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.UpdateAdmChannelRequest()
		input.setADMChannelRequest(this.aDMChannelRequest)
		input.setApplicationId(this.applicationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.UpdateAdmChannelResult {
	  return com.amazonaws.services.pinpoint.model.UpdateAdmChannelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.UpdateAdmChannelResult {
		return environment.mobiletargeting.updateAdmChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting update-adm-channel")
				.argument("admchannel-request", aDMChannelRequest.toString())
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.updateApnsChannel(aPNSChannelRequest: com.amazonaws.services.pinpoint.model.APNSChannelRequest, applicationId: String, init: AmazonPinpointUpdateApnsChannelCommand.() -> Unit): com.amazonaws.services.pinpoint.model.UpdateApnsChannelResult {
	return this.block.declare(AmazonPinpointUpdateApnsChannelCommand(aPNSChannelRequest, applicationId).apply(init)) as com.amazonaws.services.pinpoint.model.UpdateApnsChannelResult
}

@Generated
class AmazonPinpointUpdateApnsChannelCommand(val aPNSChannelRequest: com.amazonaws.services.pinpoint.model.APNSChannelRequest, val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.UpdateApnsChannelRequest, com.amazonaws.services.pinpoint.model.UpdateApnsChannelResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.UpdateApnsChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.UpdateApnsChannelRequest()
		input.setAPNSChannelRequest(this.aPNSChannelRequest)
		input.setApplicationId(this.applicationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.UpdateApnsChannelResult {
	  return com.amazonaws.services.pinpoint.model.UpdateApnsChannelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.UpdateApnsChannelResult {
		return environment.mobiletargeting.updateApnsChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting update-apns-channel")
				.argument("apnschannel-request", aPNSChannelRequest.toString())
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.updateApnsSandboxChannel(aPNSSandboxChannelRequest: com.amazonaws.services.pinpoint.model.APNSSandboxChannelRequest, applicationId: String, init: AmazonPinpointUpdateApnsSandboxChannelCommand.() -> Unit): com.amazonaws.services.pinpoint.model.UpdateApnsSandboxChannelResult {
	return this.block.declare(AmazonPinpointUpdateApnsSandboxChannelCommand(aPNSSandboxChannelRequest, applicationId).apply(init)) as com.amazonaws.services.pinpoint.model.UpdateApnsSandboxChannelResult
}

@Generated
class AmazonPinpointUpdateApnsSandboxChannelCommand(val aPNSSandboxChannelRequest: com.amazonaws.services.pinpoint.model.APNSSandboxChannelRequest, val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.UpdateApnsSandboxChannelRequest, com.amazonaws.services.pinpoint.model.UpdateApnsSandboxChannelResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.UpdateApnsSandboxChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.UpdateApnsSandboxChannelRequest()
		input.setAPNSSandboxChannelRequest(this.aPNSSandboxChannelRequest)
		input.setApplicationId(this.applicationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.UpdateApnsSandboxChannelResult {
	  return com.amazonaws.services.pinpoint.model.UpdateApnsSandboxChannelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.UpdateApnsSandboxChannelResult {
		return environment.mobiletargeting.updateApnsSandboxChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting update-apns-sandbox-channel")
				.argument("apnssandbox-channel-request", aPNSSandboxChannelRequest.toString())
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.updateApnsVoipChannel(aPNSVoipChannelRequest: com.amazonaws.services.pinpoint.model.APNSVoipChannelRequest, applicationId: String, init: AmazonPinpointUpdateApnsVoipChannelCommand.() -> Unit): com.amazonaws.services.pinpoint.model.UpdateApnsVoipChannelResult {
	return this.block.declare(AmazonPinpointUpdateApnsVoipChannelCommand(aPNSVoipChannelRequest, applicationId).apply(init)) as com.amazonaws.services.pinpoint.model.UpdateApnsVoipChannelResult
}

@Generated
class AmazonPinpointUpdateApnsVoipChannelCommand(val aPNSVoipChannelRequest: com.amazonaws.services.pinpoint.model.APNSVoipChannelRequest, val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.UpdateApnsVoipChannelRequest, com.amazonaws.services.pinpoint.model.UpdateApnsVoipChannelResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.UpdateApnsVoipChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.UpdateApnsVoipChannelRequest()
		input.setAPNSVoipChannelRequest(this.aPNSVoipChannelRequest)
		input.setApplicationId(this.applicationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.UpdateApnsVoipChannelResult {
	  return com.amazonaws.services.pinpoint.model.UpdateApnsVoipChannelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.UpdateApnsVoipChannelResult {
		return environment.mobiletargeting.updateApnsVoipChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting update-apns-voip-channel")
				.argument("apnsvoip-channel-request", aPNSVoipChannelRequest.toString())
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.updateApnsVoipSandboxChannel(aPNSVoipSandboxChannelRequest: com.amazonaws.services.pinpoint.model.APNSVoipSandboxChannelRequest, applicationId: String, init: AmazonPinpointUpdateApnsVoipSandboxChannelCommand.() -> Unit): com.amazonaws.services.pinpoint.model.UpdateApnsVoipSandboxChannelResult {
	return this.block.declare(AmazonPinpointUpdateApnsVoipSandboxChannelCommand(aPNSVoipSandboxChannelRequest, applicationId).apply(init)) as com.amazonaws.services.pinpoint.model.UpdateApnsVoipSandboxChannelResult
}

@Generated
class AmazonPinpointUpdateApnsVoipSandboxChannelCommand(val aPNSVoipSandboxChannelRequest: com.amazonaws.services.pinpoint.model.APNSVoipSandboxChannelRequest, val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.UpdateApnsVoipSandboxChannelRequest, com.amazonaws.services.pinpoint.model.UpdateApnsVoipSandboxChannelResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.UpdateApnsVoipSandboxChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.UpdateApnsVoipSandboxChannelRequest()
		input.setAPNSVoipSandboxChannelRequest(this.aPNSVoipSandboxChannelRequest)
		input.setApplicationId(this.applicationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.UpdateApnsVoipSandboxChannelResult {
	  return com.amazonaws.services.pinpoint.model.UpdateApnsVoipSandboxChannelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.UpdateApnsVoipSandboxChannelResult {
		return environment.mobiletargeting.updateApnsVoipSandboxChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting update-apns-voip-sandbox-channel")
				.argument("apnsvoip-sandbox-channel-request", aPNSVoipSandboxChannelRequest.toString())
				.argument("application-id", applicationId)
	}

}


fun AmazonPinpointFunctions.updateApplicationSettings(applicationId: String, writeApplicationSettingsRequest: com.amazonaws.services.pinpoint.model.WriteApplicationSettingsRequest, init: AmazonPinpointUpdateApplicationSettingsCommand.() -> Unit): com.amazonaws.services.pinpoint.model.UpdateApplicationSettingsResult {
	return this.block.declare(AmazonPinpointUpdateApplicationSettingsCommand(applicationId, writeApplicationSettingsRequest).apply(init)) as com.amazonaws.services.pinpoint.model.UpdateApplicationSettingsResult
}

@Generated
class AmazonPinpointUpdateApplicationSettingsCommand(val applicationId: String, val writeApplicationSettingsRequest: com.amazonaws.services.pinpoint.model.WriteApplicationSettingsRequest) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.UpdateApplicationSettingsRequest, com.amazonaws.services.pinpoint.model.UpdateApplicationSettingsResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.UpdateApplicationSettingsRequest {
		val input = com.amazonaws.services.pinpoint.model.UpdateApplicationSettingsRequest()
		input.setApplicationId(this.applicationId)
		input.setWriteApplicationSettingsRequest(this.writeApplicationSettingsRequest)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.UpdateApplicationSettingsResult {
	  return com.amazonaws.services.pinpoint.model.UpdateApplicationSettingsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.UpdateApplicationSettingsResult {
		return environment.mobiletargeting.updateApplicationSettings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting update-application-settings")
				.argument("application-id", applicationId)
				.argument("write-application-settings-request", writeApplicationSettingsRequest.toString())
	}

}


fun AmazonPinpointFunctions.updateBaiduChannel(applicationId: String, baiduChannelRequest: com.amazonaws.services.pinpoint.model.BaiduChannelRequest, init: AmazonPinpointUpdateBaiduChannelCommand.() -> Unit): com.amazonaws.services.pinpoint.model.UpdateBaiduChannelResult {
	return this.block.declare(AmazonPinpointUpdateBaiduChannelCommand(applicationId, baiduChannelRequest).apply(init)) as com.amazonaws.services.pinpoint.model.UpdateBaiduChannelResult
}

@Generated
class AmazonPinpointUpdateBaiduChannelCommand(val applicationId: String, val baiduChannelRequest: com.amazonaws.services.pinpoint.model.BaiduChannelRequest) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.UpdateBaiduChannelRequest, com.amazonaws.services.pinpoint.model.UpdateBaiduChannelResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.UpdateBaiduChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.UpdateBaiduChannelRequest()
		input.setApplicationId(this.applicationId)
		input.setBaiduChannelRequest(this.baiduChannelRequest)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.UpdateBaiduChannelResult {
	  return com.amazonaws.services.pinpoint.model.UpdateBaiduChannelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.UpdateBaiduChannelResult {
		return environment.mobiletargeting.updateBaiduChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting update-baidu-channel")
				.argument("application-id", applicationId)
				.argument("baidu-channel-request", baiduChannelRequest.toString())
	}

}


fun AmazonPinpointFunctions.updateCampaign(applicationId: String, campaignId: String, writeCampaignRequest: com.amazonaws.services.pinpoint.model.WriteCampaignRequest, init: AmazonPinpointUpdateCampaignCommand.() -> Unit): com.amazonaws.services.pinpoint.model.UpdateCampaignResult {
	return this.block.declare(AmazonPinpointUpdateCampaignCommand(applicationId, campaignId, writeCampaignRequest).apply(init)) as com.amazonaws.services.pinpoint.model.UpdateCampaignResult
}

@Generated
class AmazonPinpointUpdateCampaignCommand(val applicationId: String, val campaignId: String, val writeCampaignRequest: com.amazonaws.services.pinpoint.model.WriteCampaignRequest) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.UpdateCampaignRequest, com.amazonaws.services.pinpoint.model.UpdateCampaignResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.UpdateCampaignRequest {
		val input = com.amazonaws.services.pinpoint.model.UpdateCampaignRequest()
		input.setApplicationId(this.applicationId)
		input.setCampaignId(this.campaignId)
		input.setWriteCampaignRequest(this.writeCampaignRequest)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.UpdateCampaignResult {
	  return com.amazonaws.services.pinpoint.model.UpdateCampaignResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.UpdateCampaignResult {
		return environment.mobiletargeting.updateCampaign(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting update-campaign")
				.argument("application-id", applicationId)
				.argument("campaign-id", campaignId)
				.argument("write-campaign-request", writeCampaignRequest.toString())
	}

}


fun AmazonPinpointFunctions.updateEmailChannel(applicationId: String, emailChannelRequest: com.amazonaws.services.pinpoint.model.EmailChannelRequest, init: AmazonPinpointUpdateEmailChannelCommand.() -> Unit): com.amazonaws.services.pinpoint.model.UpdateEmailChannelResult {
	return this.block.declare(AmazonPinpointUpdateEmailChannelCommand(applicationId, emailChannelRequest).apply(init)) as com.amazonaws.services.pinpoint.model.UpdateEmailChannelResult
}

@Generated
class AmazonPinpointUpdateEmailChannelCommand(val applicationId: String, val emailChannelRequest: com.amazonaws.services.pinpoint.model.EmailChannelRequest) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.UpdateEmailChannelRequest, com.amazonaws.services.pinpoint.model.UpdateEmailChannelResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.UpdateEmailChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.UpdateEmailChannelRequest()
		input.setApplicationId(this.applicationId)
		input.setEmailChannelRequest(this.emailChannelRequest)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.UpdateEmailChannelResult {
	  return com.amazonaws.services.pinpoint.model.UpdateEmailChannelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.UpdateEmailChannelResult {
		return environment.mobiletargeting.updateEmailChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting update-email-channel")
				.argument("application-id", applicationId)
				.argument("email-channel-request", emailChannelRequest.toString())
	}

}


fun AmazonPinpointFunctions.updateEndpoint(applicationId: String, endpointId: String, endpointRequest: com.amazonaws.services.pinpoint.model.EndpointRequest, init: AmazonPinpointUpdateEndpointCommand.() -> Unit): com.amazonaws.services.pinpoint.model.UpdateEndpointResult {
	return this.block.declare(AmazonPinpointUpdateEndpointCommand(applicationId, endpointId, endpointRequest).apply(init)) as com.amazonaws.services.pinpoint.model.UpdateEndpointResult
}

@Generated
class AmazonPinpointUpdateEndpointCommand(val applicationId: String, val endpointId: String, val endpointRequest: com.amazonaws.services.pinpoint.model.EndpointRequest) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.UpdateEndpointRequest, com.amazonaws.services.pinpoint.model.UpdateEndpointResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.UpdateEndpointRequest {
		val input = com.amazonaws.services.pinpoint.model.UpdateEndpointRequest()
		input.setApplicationId(this.applicationId)
		input.setEndpointId(this.endpointId)
		input.setEndpointRequest(this.endpointRequest)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.UpdateEndpointResult {
	  return com.amazonaws.services.pinpoint.model.UpdateEndpointResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.UpdateEndpointResult {
		return environment.mobiletargeting.updateEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting update-endpoint")
				.argument("application-id", applicationId)
				.argument("endpoint-id", endpointId)
				.argument("endpoint-request", endpointRequest.toString())
	}

}


fun AmazonPinpointFunctions.updateEndpointsBatch(applicationId: String, endpointBatchRequest: com.amazonaws.services.pinpoint.model.EndpointBatchRequest, init: AmazonPinpointUpdateEndpointsBatchCommand.() -> Unit): com.amazonaws.services.pinpoint.model.UpdateEndpointsBatchResult {
	return this.block.declare(AmazonPinpointUpdateEndpointsBatchCommand(applicationId, endpointBatchRequest).apply(init)) as com.amazonaws.services.pinpoint.model.UpdateEndpointsBatchResult
}

@Generated
class AmazonPinpointUpdateEndpointsBatchCommand(val applicationId: String, val endpointBatchRequest: com.amazonaws.services.pinpoint.model.EndpointBatchRequest) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.UpdateEndpointsBatchRequest, com.amazonaws.services.pinpoint.model.UpdateEndpointsBatchResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.UpdateEndpointsBatchRequest {
		val input = com.amazonaws.services.pinpoint.model.UpdateEndpointsBatchRequest()
		input.setApplicationId(this.applicationId)
		input.setEndpointBatchRequest(this.endpointBatchRequest)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.UpdateEndpointsBatchResult {
	  return com.amazonaws.services.pinpoint.model.UpdateEndpointsBatchResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.UpdateEndpointsBatchResult {
		return environment.mobiletargeting.updateEndpointsBatch(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting update-endpoints-batch")
				.argument("application-id", applicationId)
				.argument("endpoint-batch-request", endpointBatchRequest.toString())
	}

}


fun AmazonPinpointFunctions.updateGcmChannel(applicationId: String, gCMChannelRequest: com.amazonaws.services.pinpoint.model.GCMChannelRequest, init: AmazonPinpointUpdateGcmChannelCommand.() -> Unit): com.amazonaws.services.pinpoint.model.UpdateGcmChannelResult {
	return this.block.declare(AmazonPinpointUpdateGcmChannelCommand(applicationId, gCMChannelRequest).apply(init)) as com.amazonaws.services.pinpoint.model.UpdateGcmChannelResult
}

@Generated
class AmazonPinpointUpdateGcmChannelCommand(val applicationId: String, val gCMChannelRequest: com.amazonaws.services.pinpoint.model.GCMChannelRequest) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.UpdateGcmChannelRequest, com.amazonaws.services.pinpoint.model.UpdateGcmChannelResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.UpdateGcmChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.UpdateGcmChannelRequest()
		input.setApplicationId(this.applicationId)
		input.setGCMChannelRequest(this.gCMChannelRequest)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.UpdateGcmChannelResult {
	  return com.amazonaws.services.pinpoint.model.UpdateGcmChannelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.UpdateGcmChannelResult {
		return environment.mobiletargeting.updateGcmChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting update-gcm-channel")
				.argument("application-id", applicationId)
				.argument("gcmchannel-request", gCMChannelRequest.toString())
	}

}


fun AmazonPinpointFunctions.updateSegment(applicationId: String, segmentId: String, writeSegmentRequest: com.amazonaws.services.pinpoint.model.WriteSegmentRequest, init: AmazonPinpointUpdateSegmentCommand.() -> Unit): com.amazonaws.services.pinpoint.model.UpdateSegmentResult {
	return this.block.declare(AmazonPinpointUpdateSegmentCommand(applicationId, segmentId, writeSegmentRequest).apply(init)) as com.amazonaws.services.pinpoint.model.UpdateSegmentResult
}

@Generated
class AmazonPinpointUpdateSegmentCommand(val applicationId: String, val segmentId: String, val writeSegmentRequest: com.amazonaws.services.pinpoint.model.WriteSegmentRequest) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.UpdateSegmentRequest, com.amazonaws.services.pinpoint.model.UpdateSegmentResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.UpdateSegmentRequest {
		val input = com.amazonaws.services.pinpoint.model.UpdateSegmentRequest()
		input.setApplicationId(this.applicationId)
		input.setSegmentId(this.segmentId)
		input.setWriteSegmentRequest(this.writeSegmentRequest)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.UpdateSegmentResult {
	  return com.amazonaws.services.pinpoint.model.UpdateSegmentResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.UpdateSegmentResult {
		return environment.mobiletargeting.updateSegment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting update-segment")
				.argument("application-id", applicationId)
				.argument("segment-id", segmentId)
				.argument("write-segment-request", writeSegmentRequest.toString())
	}

}


fun AmazonPinpointFunctions.updateSmsChannel(applicationId: String, sMSChannelRequest: com.amazonaws.services.pinpoint.model.SMSChannelRequest, init: AmazonPinpointUpdateSmsChannelCommand.() -> Unit): com.amazonaws.services.pinpoint.model.UpdateSmsChannelResult {
	return this.block.declare(AmazonPinpointUpdateSmsChannelCommand(applicationId, sMSChannelRequest).apply(init)) as com.amazonaws.services.pinpoint.model.UpdateSmsChannelResult
}

@Generated
class AmazonPinpointUpdateSmsChannelCommand(val applicationId: String, val sMSChannelRequest: com.amazonaws.services.pinpoint.model.SMSChannelRequest) : AmazonWebServiceCommand<com.amazonaws.services.pinpoint.model.UpdateSmsChannelRequest, com.amazonaws.services.pinpoint.model.UpdateSmsChannelResult> {



	override fun build(): com.amazonaws.services.pinpoint.model.UpdateSmsChannelRequest {
		val input = com.amazonaws.services.pinpoint.model.UpdateSmsChannelRequest()
		input.setApplicationId(this.applicationId)
		input.setSMSChannelRequest(this.sMSChannelRequest)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.pinpoint.model.UpdateSmsChannelResult {
	  return com.amazonaws.services.pinpoint.model.UpdateSmsChannelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pinpoint.model.UpdateSmsChannelResult {
		return environment.mobiletargeting.updateSmsChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mobiletargeting update-sms-channel")
				.argument("application-id", applicationId)
				.argument("smschannel-request", sMSChannelRequest.toString())
	}

}
