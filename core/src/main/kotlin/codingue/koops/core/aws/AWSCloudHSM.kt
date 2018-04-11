
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.cloudhsm.AWSCloudHSM
import com.amazonaws.services.cloudhsm.model.*

var codingue.koops.core.Environment.cloudhsm: AWSCloudHSM
	get() = this.capabilities[AWSCloudHSM::class.java.name] as AWSCloudHSM
	set(cloudhsm) {
		this.capabilities[AWSCloudHSM::class.java.name] = cloudhsm
	}

@Generated
class AWSCloudHSMFunctions(val block: Block)

infix fun <T> AwsContinuation.cloudhsm(init: AWSCloudHSMFunctions.() -> T): T {
	return AWSCloudHSMFunctions(shell).run(init)
}

			

fun AWSCloudHSMFunctions.addTagsToResource(resourceArn: String, tagList: List<com.amazonaws.services.cloudhsm.model.Tag>, init: AWSCloudHSMAddTagsToResourceCommand.() -> Unit): com.amazonaws.services.cloudhsm.model.AddTagsToResourceResult {
	return this.block.declare(AWSCloudHSMAddTagsToResourceCommand(resourceArn, tagList).apply(init)) as com.amazonaws.services.cloudhsm.model.AddTagsToResourceResult
}

@Generated
class AWSCloudHSMAddTagsToResourceCommand(val resourceArn: String, val tagList: List<com.amazonaws.services.cloudhsm.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.AddTagsToResourceRequest, com.amazonaws.services.cloudhsm.model.AddTagsToResourceResult> {



	override fun build(): com.amazonaws.services.cloudhsm.model.AddTagsToResourceRequest {
		val input = com.amazonaws.services.cloudhsm.model.AddTagsToResourceRequest()
		input.setResourceArn(this.resourceArn)
		input.setTagList(this.tagList)
		return input
	}

	override fun dryResult(): com.amazonaws.services.cloudhsm.model.AddTagsToResourceResult {
	  return com.amazonaws.services.cloudhsm.model.AddTagsToResourceResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudhsm.model.AddTagsToResourceResult {
		return environment.cloudhsm.addTagsToResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsm add-tags-to-resource")
				.argument("resource-arn", resourceArn)
				.argument("tag-list", tagList.toString())
	}

}


fun AWSCloudHSMFunctions.createHapg(label: String, init: AWSCloudHSMCreateHapgCommand.() -> Unit): com.amazonaws.services.cloudhsm.model.CreateHapgResult {
	return this.block.declare(AWSCloudHSMCreateHapgCommand(label).apply(init)) as com.amazonaws.services.cloudhsm.model.CreateHapgResult
}

@Generated
class AWSCloudHSMCreateHapgCommand(val label: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.CreateHapgRequest, com.amazonaws.services.cloudhsm.model.CreateHapgResult> {



	override fun build(): com.amazonaws.services.cloudhsm.model.CreateHapgRequest {
		val input = com.amazonaws.services.cloudhsm.model.CreateHapgRequest()
		input.setLabel(this.label)
		return input
	}

	override fun dryResult(): com.amazonaws.services.cloudhsm.model.CreateHapgResult {
	  return com.amazonaws.services.cloudhsm.model.CreateHapgResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudhsm.model.CreateHapgResult {
		return environment.cloudhsm.createHapg(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsm create-hapg")
				.argument("label", label)
	}

}


fun AWSCloudHSMFunctions.createHsm(subnetId: String, sshKey: String, iamRoleArn: String, subscriptionType: SubscriptionType, init: AWSCloudHSMCreateHsmCommand.() -> Unit): com.amazonaws.services.cloudhsm.model.CreateHsmResult {
	return this.block.declare(AWSCloudHSMCreateHsmCommand(subnetId, sshKey, iamRoleArn, subscriptionType).apply(init)) as com.amazonaws.services.cloudhsm.model.CreateHsmResult
}

@Generated
class AWSCloudHSMCreateHsmCommand(val subnetId: String, val sshKey: String, val iamRoleArn: String, val subscriptionType: SubscriptionType) : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.CreateHsmRequest, com.amazonaws.services.cloudhsm.model.CreateHsmResult> {

	var eniIp: String? = null
	var externalId: String? = null
	var clientToken: String? = null
	var syslogIp: String? = null

	override fun build(): com.amazonaws.services.cloudhsm.model.CreateHsmRequest {
		val input = com.amazonaws.services.cloudhsm.model.CreateHsmRequest()
		input.setSubnetId(this.subnetId)
		input.setSshKey(this.sshKey)
		input.setEniIp(this.eniIp)
		input.setIamRoleArn(this.iamRoleArn)
		input.setExternalId(this.externalId)
		input.setSubscriptionType(this.subscriptionType.toString())
		input.setClientToken(this.clientToken)
		input.setSyslogIp(this.syslogIp)
		return input
	}

	override fun dryResult(): com.amazonaws.services.cloudhsm.model.CreateHsmResult {
	  return com.amazonaws.services.cloudhsm.model.CreateHsmResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudhsm.model.CreateHsmResult {
		return environment.cloudhsm.createHsm(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsm create-hsm")
				.argument("subnet-id", subnetId)
				.argument("ssh-key", sshKey)
				.argument("eni-ip", eniIp)
				.argument("iam-role-arn", iamRoleArn)
				.argument("external-id", externalId)
				.argument("subscription-type", subscriptionType.toString())
				.argument("client-token", clientToken)
				.argument("syslog-ip", syslogIp)
	}

}


fun AWSCloudHSMFunctions.createLunaClient(certificate: String, init: AWSCloudHSMCreateLunaClientCommand.() -> Unit): com.amazonaws.services.cloudhsm.model.CreateLunaClientResult {
	return this.block.declare(AWSCloudHSMCreateLunaClientCommand(certificate).apply(init)) as com.amazonaws.services.cloudhsm.model.CreateLunaClientResult
}

@Generated
class AWSCloudHSMCreateLunaClientCommand(val certificate: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.CreateLunaClientRequest, com.amazonaws.services.cloudhsm.model.CreateLunaClientResult> {

	var label: String? = null

	override fun build(): com.amazonaws.services.cloudhsm.model.CreateLunaClientRequest {
		val input = com.amazonaws.services.cloudhsm.model.CreateLunaClientRequest()
		input.setLabel(this.label)
		input.setCertificate(this.certificate)
		return input
	}

	override fun dryResult(): com.amazonaws.services.cloudhsm.model.CreateLunaClientResult {
	  return com.amazonaws.services.cloudhsm.model.CreateLunaClientResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudhsm.model.CreateLunaClientResult {
		return environment.cloudhsm.createLunaClient(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsm create-luna-client")
				.argument("label", label)
				.argument("certificate", certificate)
	}

}


fun AWSCloudHSMFunctions.deleteHapg(hapgArn: String, init: AWSCloudHSMDeleteHapgCommand.() -> Unit): com.amazonaws.services.cloudhsm.model.DeleteHapgResult {
	return this.block.declare(AWSCloudHSMDeleteHapgCommand(hapgArn).apply(init)) as com.amazonaws.services.cloudhsm.model.DeleteHapgResult
}

@Generated
class AWSCloudHSMDeleteHapgCommand(val hapgArn: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.DeleteHapgRequest, com.amazonaws.services.cloudhsm.model.DeleteHapgResult> {



	override fun build(): com.amazonaws.services.cloudhsm.model.DeleteHapgRequest {
		val input = com.amazonaws.services.cloudhsm.model.DeleteHapgRequest()
		input.setHapgArn(this.hapgArn)
		return input
	}

	override fun dryResult(): com.amazonaws.services.cloudhsm.model.DeleteHapgResult {
	  return com.amazonaws.services.cloudhsm.model.DeleteHapgResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudhsm.model.DeleteHapgResult {
		return environment.cloudhsm.deleteHapg(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsm delete-hapg")
				.argument("hapg-arn", hapgArn)
	}

}


fun AWSCloudHSMFunctions.deleteHsm(hsmArn: String, init: AWSCloudHSMDeleteHsmCommand.() -> Unit): com.amazonaws.services.cloudhsm.model.DeleteHsmResult {
	return this.block.declare(AWSCloudHSMDeleteHsmCommand(hsmArn).apply(init)) as com.amazonaws.services.cloudhsm.model.DeleteHsmResult
}

@Generated
class AWSCloudHSMDeleteHsmCommand(val hsmArn: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.DeleteHsmRequest, com.amazonaws.services.cloudhsm.model.DeleteHsmResult> {



	override fun build(): com.amazonaws.services.cloudhsm.model.DeleteHsmRequest {
		val input = com.amazonaws.services.cloudhsm.model.DeleteHsmRequest()
		input.setHsmArn(this.hsmArn)
		return input
	}

	override fun dryResult(): com.amazonaws.services.cloudhsm.model.DeleteHsmResult {
	  return com.amazonaws.services.cloudhsm.model.DeleteHsmResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudhsm.model.DeleteHsmResult {
		return environment.cloudhsm.deleteHsm(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsm delete-hsm")
				.argument("hsm-arn", hsmArn)
	}

}


fun AWSCloudHSMFunctions.deleteLunaClient(clientArn: String, init: AWSCloudHSMDeleteLunaClientCommand.() -> Unit): com.amazonaws.services.cloudhsm.model.DeleteLunaClientResult {
	return this.block.declare(AWSCloudHSMDeleteLunaClientCommand(clientArn).apply(init)) as com.amazonaws.services.cloudhsm.model.DeleteLunaClientResult
}

@Generated
class AWSCloudHSMDeleteLunaClientCommand(val clientArn: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.DeleteLunaClientRequest, com.amazonaws.services.cloudhsm.model.DeleteLunaClientResult> {



	override fun build(): com.amazonaws.services.cloudhsm.model.DeleteLunaClientRequest {
		val input = com.amazonaws.services.cloudhsm.model.DeleteLunaClientRequest()
		input.setClientArn(this.clientArn)
		return input
	}

	override fun dryResult(): com.amazonaws.services.cloudhsm.model.DeleteLunaClientResult {
	  return com.amazonaws.services.cloudhsm.model.DeleteLunaClientResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudhsm.model.DeleteLunaClientResult {
		return environment.cloudhsm.deleteLunaClient(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsm delete-luna-client")
				.argument("client-arn", clientArn)
	}

}


fun AWSCloudHSMFunctions.describeHapg(hapgArn: String, init: AWSCloudHSMDescribeHapgCommand.() -> Unit): com.amazonaws.services.cloudhsm.model.DescribeHapgResult {
	return this.block.declare(AWSCloudHSMDescribeHapgCommand(hapgArn).apply(init)) as com.amazonaws.services.cloudhsm.model.DescribeHapgResult
}

@Generated
class AWSCloudHSMDescribeHapgCommand(val hapgArn: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.DescribeHapgRequest, com.amazonaws.services.cloudhsm.model.DescribeHapgResult> {



	override fun build(): com.amazonaws.services.cloudhsm.model.DescribeHapgRequest {
		val input = com.amazonaws.services.cloudhsm.model.DescribeHapgRequest()
		input.setHapgArn(this.hapgArn)
		return input
	}

	override fun dryResult(): com.amazonaws.services.cloudhsm.model.DescribeHapgResult {
	  return com.amazonaws.services.cloudhsm.model.DescribeHapgResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudhsm.model.DescribeHapgResult {
		return environment.cloudhsm.describeHapg(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsm describe-hapg")
				.argument("hapg-arn", hapgArn)
	}

}


fun AWSCloudHSMFunctions.describeHsm(init: AWSCloudHSMDescribeHsmCommand.() -> Unit): com.amazonaws.services.cloudhsm.model.DescribeHsmResult {
	return this.block.declare(AWSCloudHSMDescribeHsmCommand().apply(init)) as com.amazonaws.services.cloudhsm.model.DescribeHsmResult
}

@Generated
class AWSCloudHSMDescribeHsmCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.DescribeHsmRequest, com.amazonaws.services.cloudhsm.model.DescribeHsmResult> {

	var hsmArn: String? = null
	var hsmSerialNumber: String? = null

	override fun build(): com.amazonaws.services.cloudhsm.model.DescribeHsmRequest {
		val input = com.amazonaws.services.cloudhsm.model.DescribeHsmRequest()
		input.setHsmArn(this.hsmArn)
		input.setHsmSerialNumber(this.hsmSerialNumber)
		return input
	}

	override fun dryResult(): com.amazonaws.services.cloudhsm.model.DescribeHsmResult {
	  return com.amazonaws.services.cloudhsm.model.DescribeHsmResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudhsm.model.DescribeHsmResult {
		return environment.cloudhsm.describeHsm(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsm describe-hsm")
				.argument("hsm-arn", hsmArn)
				.argument("hsm-serial-number", hsmSerialNumber)
	}

}


fun AWSCloudHSMFunctions.describeLunaClient(init: AWSCloudHSMDescribeLunaClientCommand.() -> Unit): com.amazonaws.services.cloudhsm.model.DescribeLunaClientResult {
	return this.block.declare(AWSCloudHSMDescribeLunaClientCommand().apply(init)) as com.amazonaws.services.cloudhsm.model.DescribeLunaClientResult
}

@Generated
class AWSCloudHSMDescribeLunaClientCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.DescribeLunaClientRequest, com.amazonaws.services.cloudhsm.model.DescribeLunaClientResult> {

	var clientArn: String? = null
	var certificateFingerprint: String? = null

	override fun build(): com.amazonaws.services.cloudhsm.model.DescribeLunaClientRequest {
		val input = com.amazonaws.services.cloudhsm.model.DescribeLunaClientRequest()
		input.setClientArn(this.clientArn)
		input.setCertificateFingerprint(this.certificateFingerprint)
		return input
	}

	override fun dryResult(): com.amazonaws.services.cloudhsm.model.DescribeLunaClientResult {
	  return com.amazonaws.services.cloudhsm.model.DescribeLunaClientResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudhsm.model.DescribeLunaClientResult {
		return environment.cloudhsm.describeLunaClient(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsm describe-luna-client")
				.argument("client-arn", clientArn)
				.argument("certificate-fingerprint", certificateFingerprint)
	}

}


fun AWSCloudHSMFunctions.getConfig(clientArn: String, clientVersion: ClientVersion, hapgList: List<String>, init: AWSCloudHSMGetConfigCommand.() -> Unit): com.amazonaws.services.cloudhsm.model.GetConfigResult {
	return this.block.declare(AWSCloudHSMGetConfigCommand(clientArn, clientVersion, hapgList).apply(init)) as com.amazonaws.services.cloudhsm.model.GetConfigResult
}

@Generated
class AWSCloudHSMGetConfigCommand(val clientArn: String, val clientVersion: ClientVersion, val hapgList: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.GetConfigRequest, com.amazonaws.services.cloudhsm.model.GetConfigResult> {



	override fun build(): com.amazonaws.services.cloudhsm.model.GetConfigRequest {
		val input = com.amazonaws.services.cloudhsm.model.GetConfigRequest()
		input.setClientArn(this.clientArn)
		input.setClientVersion(this.clientVersion.toString())
		input.setHapgList(this.hapgList)
		return input
	}

	override fun dryResult(): com.amazonaws.services.cloudhsm.model.GetConfigResult {
	  return com.amazonaws.services.cloudhsm.model.GetConfigResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudhsm.model.GetConfigResult {
		return environment.cloudhsm.getConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsm get-config")
				.argument("client-arn", clientArn)
				.argument("client-version", clientVersion.toString())
				.argument("hapg-list", hapgList.toString())
	}

}


fun AWSCloudHSMFunctions.listAvailableZones(init: AWSCloudHSMListAvailableZonesCommand.() -> Unit): com.amazonaws.services.cloudhsm.model.ListAvailableZonesResult {
	return this.block.declare(AWSCloudHSMListAvailableZonesCommand().apply(init)) as com.amazonaws.services.cloudhsm.model.ListAvailableZonesResult
}

@Generated
class AWSCloudHSMListAvailableZonesCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.ListAvailableZonesRequest, com.amazonaws.services.cloudhsm.model.ListAvailableZonesResult> {



	override fun build(): com.amazonaws.services.cloudhsm.model.ListAvailableZonesRequest {
		val input = com.amazonaws.services.cloudhsm.model.ListAvailableZonesRequest()

		return input
	}

	override fun dryResult(): com.amazonaws.services.cloudhsm.model.ListAvailableZonesResult {
	  return com.amazonaws.services.cloudhsm.model.ListAvailableZonesResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudhsm.model.ListAvailableZonesResult {
		return environment.cloudhsm.listAvailableZones(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsm list-available-zones")

	}

}


fun AWSCloudHSMFunctions.listHapgs(init: AWSCloudHSMListHapgsCommand.() -> Unit): com.amazonaws.services.cloudhsm.model.ListHapgsResult {
	return this.block.declare(AWSCloudHSMListHapgsCommand().apply(init)) as com.amazonaws.services.cloudhsm.model.ListHapgsResult
}

@Generated
class AWSCloudHSMListHapgsCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.ListHapgsRequest, com.amazonaws.services.cloudhsm.model.ListHapgsResult> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cloudhsm.model.ListHapgsRequest {
		val input = com.amazonaws.services.cloudhsm.model.ListHapgsRequest()
		input.setNextToken(this.nextToken)
		return input
	}

	override fun dryResult(): com.amazonaws.services.cloudhsm.model.ListHapgsResult {
	  return com.amazonaws.services.cloudhsm.model.ListHapgsResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudhsm.model.ListHapgsResult {
		return environment.cloudhsm.listHapgs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsm list-hapgs")
				.argument("next-token", nextToken)
	}

}


fun AWSCloudHSMFunctions.listHsms(init: AWSCloudHSMListHsmsCommand.() -> Unit): com.amazonaws.services.cloudhsm.model.ListHsmsResult {
	return this.block.declare(AWSCloudHSMListHsmsCommand().apply(init)) as com.amazonaws.services.cloudhsm.model.ListHsmsResult
}

@Generated
class AWSCloudHSMListHsmsCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.ListHsmsRequest, com.amazonaws.services.cloudhsm.model.ListHsmsResult> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cloudhsm.model.ListHsmsRequest {
		val input = com.amazonaws.services.cloudhsm.model.ListHsmsRequest()
		input.setNextToken(this.nextToken)
		return input
	}

	override fun dryResult(): com.amazonaws.services.cloudhsm.model.ListHsmsResult {
	  return com.amazonaws.services.cloudhsm.model.ListHsmsResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudhsm.model.ListHsmsResult {
		return environment.cloudhsm.listHsms(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsm list-hsms")
				.argument("next-token", nextToken)
	}

}


fun AWSCloudHSMFunctions.listLunaClients(init: AWSCloudHSMListLunaClientsCommand.() -> Unit): com.amazonaws.services.cloudhsm.model.ListLunaClientsResult {
	return this.block.declare(AWSCloudHSMListLunaClientsCommand().apply(init)) as com.amazonaws.services.cloudhsm.model.ListLunaClientsResult
}

@Generated
class AWSCloudHSMListLunaClientsCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.ListLunaClientsRequest, com.amazonaws.services.cloudhsm.model.ListLunaClientsResult> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cloudhsm.model.ListLunaClientsRequest {
		val input = com.amazonaws.services.cloudhsm.model.ListLunaClientsRequest()
		input.setNextToken(this.nextToken)
		return input
	}

	override fun dryResult(): com.amazonaws.services.cloudhsm.model.ListLunaClientsResult {
	  return com.amazonaws.services.cloudhsm.model.ListLunaClientsResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudhsm.model.ListLunaClientsResult {
		return environment.cloudhsm.listLunaClients(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsm list-luna-clients")
				.argument("next-token", nextToken)
	}

}


fun AWSCloudHSMFunctions.listTagsForResource(resourceArn: String, init: AWSCloudHSMListTagsForResourceCommand.() -> Unit): com.amazonaws.services.cloudhsm.model.ListTagsForResourceResult {
	return this.block.declare(AWSCloudHSMListTagsForResourceCommand(resourceArn).apply(init)) as com.amazonaws.services.cloudhsm.model.ListTagsForResourceResult
}

@Generated
class AWSCloudHSMListTagsForResourceCommand(val resourceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.ListTagsForResourceRequest, com.amazonaws.services.cloudhsm.model.ListTagsForResourceResult> {



	override fun build(): com.amazonaws.services.cloudhsm.model.ListTagsForResourceRequest {
		val input = com.amazonaws.services.cloudhsm.model.ListTagsForResourceRequest()
		input.setResourceArn(this.resourceArn)
		return input
	}

	override fun dryResult(): com.amazonaws.services.cloudhsm.model.ListTagsForResourceResult {
	  return com.amazonaws.services.cloudhsm.model.ListTagsForResourceResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudhsm.model.ListTagsForResourceResult {
		return environment.cloudhsm.listTagsForResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsm list-tags-for-resource")
				.argument("resource-arn", resourceArn)
	}

}


fun AWSCloudHSMFunctions.modifyHapg(hapgArn: String, init: AWSCloudHSMModifyHapgCommand.() -> Unit): com.amazonaws.services.cloudhsm.model.ModifyHapgResult {
	return this.block.declare(AWSCloudHSMModifyHapgCommand(hapgArn).apply(init)) as com.amazonaws.services.cloudhsm.model.ModifyHapgResult
}

@Generated
class AWSCloudHSMModifyHapgCommand(val hapgArn: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.ModifyHapgRequest, com.amazonaws.services.cloudhsm.model.ModifyHapgResult> {

	var label: String? = null
	var partitionSerialList: List<String>? = null

	override fun build(): com.amazonaws.services.cloudhsm.model.ModifyHapgRequest {
		val input = com.amazonaws.services.cloudhsm.model.ModifyHapgRequest()
		input.setHapgArn(this.hapgArn)
		input.setLabel(this.label)
		input.setPartitionSerialList(this.partitionSerialList)
		return input
	}

	override fun dryResult(): com.amazonaws.services.cloudhsm.model.ModifyHapgResult {
	  return com.amazonaws.services.cloudhsm.model.ModifyHapgResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudhsm.model.ModifyHapgResult {
		return environment.cloudhsm.modifyHapg(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsm modify-hapg")
				.argument("hapg-arn", hapgArn)
				.argument("label", label)
				.argument("partition-serial-list", partitionSerialList?.toString())
	}

}


fun AWSCloudHSMFunctions.modifyHsm(hsmArn: String, init: AWSCloudHSMModifyHsmCommand.() -> Unit): com.amazonaws.services.cloudhsm.model.ModifyHsmResult {
	return this.block.declare(AWSCloudHSMModifyHsmCommand(hsmArn).apply(init)) as com.amazonaws.services.cloudhsm.model.ModifyHsmResult
}

@Generated
class AWSCloudHSMModifyHsmCommand(val hsmArn: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.ModifyHsmRequest, com.amazonaws.services.cloudhsm.model.ModifyHsmResult> {

	var subnetId: String? = null
	var eniIp: String? = null
	var iamRoleArn: String? = null
	var externalId: String? = null
	var syslogIp: String? = null

	override fun build(): com.amazonaws.services.cloudhsm.model.ModifyHsmRequest {
		val input = com.amazonaws.services.cloudhsm.model.ModifyHsmRequest()
		input.setHsmArn(this.hsmArn)
		input.setSubnetId(this.subnetId)
		input.setEniIp(this.eniIp)
		input.setIamRoleArn(this.iamRoleArn)
		input.setExternalId(this.externalId)
		input.setSyslogIp(this.syslogIp)
		return input
	}

	override fun dryResult(): com.amazonaws.services.cloudhsm.model.ModifyHsmResult {
	  return com.amazonaws.services.cloudhsm.model.ModifyHsmResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudhsm.model.ModifyHsmResult {
		return environment.cloudhsm.modifyHsm(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsm modify-hsm")
				.argument("hsm-arn", hsmArn)
				.argument("subnet-id", subnetId)
				.argument("eni-ip", eniIp)
				.argument("iam-role-arn", iamRoleArn)
				.argument("external-id", externalId)
				.argument("syslog-ip", syslogIp)
	}

}


fun AWSCloudHSMFunctions.modifyLunaClient(clientArn: String, certificate: String, init: AWSCloudHSMModifyLunaClientCommand.() -> Unit): com.amazonaws.services.cloudhsm.model.ModifyLunaClientResult {
	return this.block.declare(AWSCloudHSMModifyLunaClientCommand(clientArn, certificate).apply(init)) as com.amazonaws.services.cloudhsm.model.ModifyLunaClientResult
}

@Generated
class AWSCloudHSMModifyLunaClientCommand(val clientArn: String, val certificate: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.ModifyLunaClientRequest, com.amazonaws.services.cloudhsm.model.ModifyLunaClientResult> {



	override fun build(): com.amazonaws.services.cloudhsm.model.ModifyLunaClientRequest {
		val input = com.amazonaws.services.cloudhsm.model.ModifyLunaClientRequest()
		input.setClientArn(this.clientArn)
		input.setCertificate(this.certificate)
		return input
	}

	override fun dryResult(): com.amazonaws.services.cloudhsm.model.ModifyLunaClientResult {
	  return com.amazonaws.services.cloudhsm.model.ModifyLunaClientResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudhsm.model.ModifyLunaClientResult {
		return environment.cloudhsm.modifyLunaClient(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsm modify-luna-client")
				.argument("client-arn", clientArn)
				.argument("certificate", certificate)
	}

}


fun AWSCloudHSMFunctions.removeTagsFromResource(resourceArn: String, tagKeyList: List<String>, init: AWSCloudHSMRemoveTagsFromResourceCommand.() -> Unit): com.amazonaws.services.cloudhsm.model.RemoveTagsFromResourceResult {
	return this.block.declare(AWSCloudHSMRemoveTagsFromResourceCommand(resourceArn, tagKeyList).apply(init)) as com.amazonaws.services.cloudhsm.model.RemoveTagsFromResourceResult
}

@Generated
class AWSCloudHSMRemoveTagsFromResourceCommand(val resourceArn: String, val tagKeyList: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.RemoveTagsFromResourceRequest, com.amazonaws.services.cloudhsm.model.RemoveTagsFromResourceResult> {



	override fun build(): com.amazonaws.services.cloudhsm.model.RemoveTagsFromResourceRequest {
		val input = com.amazonaws.services.cloudhsm.model.RemoveTagsFromResourceRequest()
		input.setResourceArn(this.resourceArn)
		input.setTagKeyList(this.tagKeyList)
		return input
	}

	override fun dryResult(): com.amazonaws.services.cloudhsm.model.RemoveTagsFromResourceResult {
	  return com.amazonaws.services.cloudhsm.model.RemoveTagsFromResourceResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudhsm.model.RemoveTagsFromResourceResult {
		return environment.cloudhsm.removeTagsFromResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsm remove-tags-from-resource")
				.argument("resource-arn", resourceArn)
				.argument("tag-key-list", tagKeyList.toString())
	}

}
