
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

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

infix fun AwsContinuation.cloudhsm(init: AWSCloudHSMFunctions.() -> Unit) {
	AWSCloudHSMFunctions(shell).apply(init)
}

			

fun AWSCloudHSMFunctions.addTagsToResource(resourceArn: String, tagList: List<com.amazonaws.services.cloudhsm.model.Tag>, init: AWSCloudHSMAddTagsToResourceCommand.() -> Unit) {
	this.block.declare(AWSCloudHSMAddTagsToResourceCommand(resourceArn, tagList).apply(init))
}

@Generated
class AWSCloudHSMAddTagsToResourceCommand(val resourceArn: String, val tagList: List<com.amazonaws.services.cloudhsm.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.AddTagsToResourceRequest> {



	override fun build(): com.amazonaws.services.cloudhsm.model.AddTagsToResourceRequest {
		val input = com.amazonaws.services.cloudhsm.model.AddTagsToResourceRequest()
		input.setResourceArn(this.resourceArn)
		input.setTagList(this.tagList)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudhsm.addTagsToResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsm add-tags-to-resource")
				.argument("resource-arn", resourceArn)
				.argument("tag-list", tagList.toString())
	}

}


fun AWSCloudHSMFunctions.createHapg(label: String, init: AWSCloudHSMCreateHapgCommand.() -> Unit) {
	this.block.declare(AWSCloudHSMCreateHapgCommand(label).apply(init))
}

@Generated
class AWSCloudHSMCreateHapgCommand(val label: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.CreateHapgRequest> {



	override fun build(): com.amazonaws.services.cloudhsm.model.CreateHapgRequest {
		val input = com.amazonaws.services.cloudhsm.model.CreateHapgRequest()
		input.setLabel(this.label)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudhsm.createHapg(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsm create-hapg")
				.argument("label", label)
	}

}


fun AWSCloudHSMFunctions.createHsm(subnetId: String, sshKey: String, iamRoleArn: String, subscriptionType: SubscriptionType, init: AWSCloudHSMCreateHsmCommand.() -> Unit) {
	this.block.declare(AWSCloudHSMCreateHsmCommand(subnetId, sshKey, iamRoleArn, subscriptionType).apply(init))
}

@Generated
class AWSCloudHSMCreateHsmCommand(val subnetId: String, val sshKey: String, val iamRoleArn: String, val subscriptionType: SubscriptionType) : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.CreateHsmRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudhsm.createHsm(build())
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


fun AWSCloudHSMFunctions.createLunaClient(certificate: String, init: AWSCloudHSMCreateLunaClientCommand.() -> Unit) {
	this.block.declare(AWSCloudHSMCreateLunaClientCommand(certificate).apply(init))
}

@Generated
class AWSCloudHSMCreateLunaClientCommand(val certificate: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.CreateLunaClientRequest> {

	var label: String? = null

	override fun build(): com.amazonaws.services.cloudhsm.model.CreateLunaClientRequest {
		val input = com.amazonaws.services.cloudhsm.model.CreateLunaClientRequest()
		input.setLabel(this.label)
		input.setCertificate(this.certificate)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudhsm.createLunaClient(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsm create-luna-client")
				.argument("label", label)
				.argument("certificate", certificate)
	}

}


fun AWSCloudHSMFunctions.deleteHapg(hapgArn: String, init: AWSCloudHSMDeleteHapgCommand.() -> Unit) {
	this.block.declare(AWSCloudHSMDeleteHapgCommand(hapgArn).apply(init))
}

@Generated
class AWSCloudHSMDeleteHapgCommand(val hapgArn: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.DeleteHapgRequest> {



	override fun build(): com.amazonaws.services.cloudhsm.model.DeleteHapgRequest {
		val input = com.amazonaws.services.cloudhsm.model.DeleteHapgRequest()
		input.setHapgArn(this.hapgArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudhsm.deleteHapg(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsm delete-hapg")
				.argument("hapg-arn", hapgArn)
	}

}


fun AWSCloudHSMFunctions.deleteHsm(hsmArn: String, init: AWSCloudHSMDeleteHsmCommand.() -> Unit) {
	this.block.declare(AWSCloudHSMDeleteHsmCommand(hsmArn).apply(init))
}

@Generated
class AWSCloudHSMDeleteHsmCommand(val hsmArn: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.DeleteHsmRequest> {



	override fun build(): com.amazonaws.services.cloudhsm.model.DeleteHsmRequest {
		val input = com.amazonaws.services.cloudhsm.model.DeleteHsmRequest()
		input.setHsmArn(this.hsmArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudhsm.deleteHsm(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsm delete-hsm")
				.argument("hsm-arn", hsmArn)
	}

}


fun AWSCloudHSMFunctions.deleteLunaClient(clientArn: String, init: AWSCloudHSMDeleteLunaClientCommand.() -> Unit) {
	this.block.declare(AWSCloudHSMDeleteLunaClientCommand(clientArn).apply(init))
}

@Generated
class AWSCloudHSMDeleteLunaClientCommand(val clientArn: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.DeleteLunaClientRequest> {



	override fun build(): com.amazonaws.services.cloudhsm.model.DeleteLunaClientRequest {
		val input = com.amazonaws.services.cloudhsm.model.DeleteLunaClientRequest()
		input.setClientArn(this.clientArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudhsm.deleteLunaClient(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsm delete-luna-client")
				.argument("client-arn", clientArn)
	}

}


fun AWSCloudHSMFunctions.describeHapg(hapgArn: String, init: AWSCloudHSMDescribeHapgCommand.() -> Unit) {
	this.block.declare(AWSCloudHSMDescribeHapgCommand(hapgArn).apply(init))
}

@Generated
class AWSCloudHSMDescribeHapgCommand(val hapgArn: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.DescribeHapgRequest> {



	override fun build(): com.amazonaws.services.cloudhsm.model.DescribeHapgRequest {
		val input = com.amazonaws.services.cloudhsm.model.DescribeHapgRequest()
		input.setHapgArn(this.hapgArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudhsm.describeHapg(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsm describe-hapg")
				.argument("hapg-arn", hapgArn)
	}

}


fun AWSCloudHSMFunctions.describeHsm(init: AWSCloudHSMDescribeHsmCommand.() -> Unit) {
	this.block.declare(AWSCloudHSMDescribeHsmCommand().apply(init))
}

@Generated
class AWSCloudHSMDescribeHsmCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.DescribeHsmRequest> {

	var hsmArn: String? = null
	var hsmSerialNumber: String? = null

	override fun build(): com.amazonaws.services.cloudhsm.model.DescribeHsmRequest {
		val input = com.amazonaws.services.cloudhsm.model.DescribeHsmRequest()
		input.setHsmArn(this.hsmArn)
		input.setHsmSerialNumber(this.hsmSerialNumber)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudhsm.describeHsm(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsm describe-hsm")
				.argument("hsm-arn", hsmArn)
				.argument("hsm-serial-number", hsmSerialNumber)
	}

}


fun AWSCloudHSMFunctions.describeLunaClient(init: AWSCloudHSMDescribeLunaClientCommand.() -> Unit) {
	this.block.declare(AWSCloudHSMDescribeLunaClientCommand().apply(init))
}

@Generated
class AWSCloudHSMDescribeLunaClientCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.DescribeLunaClientRequest> {

	var clientArn: String? = null
	var certificateFingerprint: String? = null

	override fun build(): com.amazonaws.services.cloudhsm.model.DescribeLunaClientRequest {
		val input = com.amazonaws.services.cloudhsm.model.DescribeLunaClientRequest()
		input.setClientArn(this.clientArn)
		input.setCertificateFingerprint(this.certificateFingerprint)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudhsm.describeLunaClient(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsm describe-luna-client")
				.argument("client-arn", clientArn)
				.argument("certificate-fingerprint", certificateFingerprint)
	}

}


fun AWSCloudHSMFunctions.getConfig(clientArn: String, clientVersion: ClientVersion, hapgList: List<String>, init: AWSCloudHSMGetConfigCommand.() -> Unit) {
	this.block.declare(AWSCloudHSMGetConfigCommand(clientArn, clientVersion, hapgList).apply(init))
}

@Generated
class AWSCloudHSMGetConfigCommand(val clientArn: String, val clientVersion: ClientVersion, val hapgList: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.GetConfigRequest> {



	override fun build(): com.amazonaws.services.cloudhsm.model.GetConfigRequest {
		val input = com.amazonaws.services.cloudhsm.model.GetConfigRequest()
		input.setClientArn(this.clientArn)
		input.setClientVersion(this.clientVersion.toString())
		input.setHapgList(this.hapgList)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudhsm.getConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsm get-config")
				.argument("client-arn", clientArn)
				.argument("client-version", clientVersion.toString())
				.argument("hapg-list", hapgList.toString())
	}

}


fun AWSCloudHSMFunctions.listAvailableZones(init: AWSCloudHSMListAvailableZonesCommand.() -> Unit) {
	this.block.declare(AWSCloudHSMListAvailableZonesCommand().apply(init))
}

@Generated
class AWSCloudHSMListAvailableZonesCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.ListAvailableZonesRequest> {



	override fun build(): com.amazonaws.services.cloudhsm.model.ListAvailableZonesRequest {
		val input = com.amazonaws.services.cloudhsm.model.ListAvailableZonesRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudhsm.listAvailableZones(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsm list-available-zones")

	}

}


fun AWSCloudHSMFunctions.listHapgs(init: AWSCloudHSMListHapgsCommand.() -> Unit) {
	this.block.declare(AWSCloudHSMListHapgsCommand().apply(init))
}

@Generated
class AWSCloudHSMListHapgsCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.ListHapgsRequest> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cloudhsm.model.ListHapgsRequest {
		val input = com.amazonaws.services.cloudhsm.model.ListHapgsRequest()
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudhsm.listHapgs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsm list-hapgs")
				.argument("next-token", nextToken)
	}

}


fun AWSCloudHSMFunctions.listHsms(init: AWSCloudHSMListHsmsCommand.() -> Unit) {
	this.block.declare(AWSCloudHSMListHsmsCommand().apply(init))
}

@Generated
class AWSCloudHSMListHsmsCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.ListHsmsRequest> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cloudhsm.model.ListHsmsRequest {
		val input = com.amazonaws.services.cloudhsm.model.ListHsmsRequest()
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudhsm.listHsms(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsm list-hsms")
				.argument("next-token", nextToken)
	}

}


fun AWSCloudHSMFunctions.listLunaClients(init: AWSCloudHSMListLunaClientsCommand.() -> Unit) {
	this.block.declare(AWSCloudHSMListLunaClientsCommand().apply(init))
}

@Generated
class AWSCloudHSMListLunaClientsCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.ListLunaClientsRequest> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cloudhsm.model.ListLunaClientsRequest {
		val input = com.amazonaws.services.cloudhsm.model.ListLunaClientsRequest()
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudhsm.listLunaClients(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsm list-luna-clients")
				.argument("next-token", nextToken)
	}

}


fun AWSCloudHSMFunctions.listTagsForResource(resourceArn: String, init: AWSCloudHSMListTagsForResourceCommand.() -> Unit) {
	this.block.declare(AWSCloudHSMListTagsForResourceCommand(resourceArn).apply(init))
}

@Generated
class AWSCloudHSMListTagsForResourceCommand(val resourceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.ListTagsForResourceRequest> {



	override fun build(): com.amazonaws.services.cloudhsm.model.ListTagsForResourceRequest {
		val input = com.amazonaws.services.cloudhsm.model.ListTagsForResourceRequest()
		input.setResourceArn(this.resourceArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudhsm.listTagsForResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsm list-tags-for-resource")
				.argument("resource-arn", resourceArn)
	}

}


fun AWSCloudHSMFunctions.modifyHapg(hapgArn: String, init: AWSCloudHSMModifyHapgCommand.() -> Unit) {
	this.block.declare(AWSCloudHSMModifyHapgCommand(hapgArn).apply(init))
}

@Generated
class AWSCloudHSMModifyHapgCommand(val hapgArn: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.ModifyHapgRequest> {

	var label: String? = null
	var partitionSerialList: List<String>? = null

	override fun build(): com.amazonaws.services.cloudhsm.model.ModifyHapgRequest {
		val input = com.amazonaws.services.cloudhsm.model.ModifyHapgRequest()
		input.setHapgArn(this.hapgArn)
		input.setLabel(this.label)
		input.setPartitionSerialList(this.partitionSerialList)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudhsm.modifyHapg(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsm modify-hapg")
				.argument("hapg-arn", hapgArn)
				.argument("label", label)
				.argument("partition-serial-list", partitionSerialList?.toString())
	}

}


fun AWSCloudHSMFunctions.modifyHsm(hsmArn: String, init: AWSCloudHSMModifyHsmCommand.() -> Unit) {
	this.block.declare(AWSCloudHSMModifyHsmCommand(hsmArn).apply(init))
}

@Generated
class AWSCloudHSMModifyHsmCommand(val hsmArn: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.ModifyHsmRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudhsm.modifyHsm(build())
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


fun AWSCloudHSMFunctions.modifyLunaClient(clientArn: String, certificate: String, init: AWSCloudHSMModifyLunaClientCommand.() -> Unit) {
	this.block.declare(AWSCloudHSMModifyLunaClientCommand(clientArn, certificate).apply(init))
}

@Generated
class AWSCloudHSMModifyLunaClientCommand(val clientArn: String, val certificate: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.ModifyLunaClientRequest> {



	override fun build(): com.amazonaws.services.cloudhsm.model.ModifyLunaClientRequest {
		val input = com.amazonaws.services.cloudhsm.model.ModifyLunaClientRequest()
		input.setClientArn(this.clientArn)
		input.setCertificate(this.certificate)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudhsm.modifyLunaClient(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsm modify-luna-client")
				.argument("client-arn", clientArn)
				.argument("certificate", certificate)
	}

}


fun AWSCloudHSMFunctions.removeTagsFromResource(resourceArn: String, tagKeyList: List<String>, init: AWSCloudHSMRemoveTagsFromResourceCommand.() -> Unit) {
	this.block.declare(AWSCloudHSMRemoveTagsFromResourceCommand(resourceArn, tagKeyList).apply(init))
}

@Generated
class AWSCloudHSMRemoveTagsFromResourceCommand(val resourceArn: String, val tagKeyList: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.cloudhsm.model.RemoveTagsFromResourceRequest> {



	override fun build(): com.amazonaws.services.cloudhsm.model.RemoveTagsFromResourceRequest {
		val input = com.amazonaws.services.cloudhsm.model.RemoveTagsFromResourceRequest()
		input.setResourceArn(this.resourceArn)
		input.setTagKeyList(this.tagKeyList)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudhsm.removeTagsFromResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsm remove-tags-from-resource")
				.argument("resource-arn", resourceArn)
				.argument("tag-key-list", tagKeyList.toString())
	}

}
