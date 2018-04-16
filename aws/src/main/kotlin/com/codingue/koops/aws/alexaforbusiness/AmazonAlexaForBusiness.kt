
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package com.codingue.koops.aws.alexaforbusiness

import javax.annotation.Generated
import com.codingue.koops.common.*
import com.codingue.koops.core.*
import com.codingue.koops.aws.*
import com.amazonaws.services.alexaforbusiness.*
import com.amazonaws.services.alexaforbusiness.model.*

var com.codingue.koops.core.Environment.alexaforbusiness: AmazonAlexaForBusiness
	get() {
		var service = this.capabilities["aws-alexaforbusiness"]
		if (service == null) {
			service = AmazonAlexaForBusinessClientBuilder.standard().build()
			this.capabilities["aws-alexaforbusiness"] = service
		}
		return service as AmazonAlexaForBusiness
	}
	set(alexaforbusiness) {
		this.capabilities["aws-alexaforbusiness"] = alexaforbusiness
	}

@Generated
class AmazonAlexaForBusinessFunctions(val block: Script)

infix fun <T> AwsContinuation.alexaforbusiness(init: AmazonAlexaForBusinessFunctions.() -> T): T {
	return AmazonAlexaForBusinessFunctions(shell).run(init)
}

			

fun AmazonAlexaForBusinessFunctions.associateContactWithAddressBook(contactArn: String, addressBookArn: String, init: (AmazonAlexaForBusinessAssociateContactWithAddressBookCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.AssociateContactWithAddressBookResult {
	return this.block.declare(AmazonAlexaForBusinessAssociateContactWithAddressBookCommand(contactArn, addressBookArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.AssociateContactWithAddressBookResult
}

@Generated
class AmazonAlexaForBusinessAssociateContactWithAddressBookCommand(val contactArn: String, val addressBookArn: String) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.AssociateContactWithAddressBookRequest, com.amazonaws.services.alexaforbusiness.model.AssociateContactWithAddressBookResult> {



	override fun build(): com.amazonaws.services.alexaforbusiness.model.AssociateContactWithAddressBookRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.AssociateContactWithAddressBookRequest()
		input.setContactArn(this.contactArn)
		input.setAddressBookArn(this.addressBookArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.AssociateContactWithAddressBookResult {
	  return com.amazonaws.services.alexaforbusiness.model.AssociateContactWithAddressBookResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.AssociateContactWithAddressBookResult {
		return environment.alexaforbusiness.associateContactWithAddressBook(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness associate-contact-with-address-book")
				.argument("contact-arn", contactArn)
				.argument("address-book-arn", addressBookArn)
	}

}


fun AmazonAlexaForBusinessFunctions.associateDeviceWithRoom(init: (AmazonAlexaForBusinessAssociateDeviceWithRoomCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithRoomResult {
	return this.block.declare(AmazonAlexaForBusinessAssociateDeviceWithRoomCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithRoomResult
}

@Generated
class AmazonAlexaForBusinessAssociateDeviceWithRoomCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithRoomRequest, com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithRoomResult> {

	var deviceArn: String? = null
	var roomArn: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithRoomRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithRoomRequest()
		input.setDeviceArn(this.deviceArn)
		input.setRoomArn(this.roomArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithRoomResult {
	  return com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithRoomResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithRoomResult {
		return environment.alexaforbusiness.associateDeviceWithRoom(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness associate-device-with-room")
				.argument("device-arn", deviceArn)
				.argument("room-arn", roomArn)
	}

}


fun AmazonAlexaForBusinessFunctions.associateSkillGroupWithRoom(init: (AmazonAlexaForBusinessAssociateSkillGroupWithRoomCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.AssociateSkillGroupWithRoomResult {
	return this.block.declare(AmazonAlexaForBusinessAssociateSkillGroupWithRoomCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.AssociateSkillGroupWithRoomResult
}

@Generated
class AmazonAlexaForBusinessAssociateSkillGroupWithRoomCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.AssociateSkillGroupWithRoomRequest, com.amazonaws.services.alexaforbusiness.model.AssociateSkillGroupWithRoomResult> {

	var skillGroupArn: String? = null
	var roomArn: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.AssociateSkillGroupWithRoomRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.AssociateSkillGroupWithRoomRequest()
		input.setSkillGroupArn(this.skillGroupArn)
		input.setRoomArn(this.roomArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.AssociateSkillGroupWithRoomResult {
	  return com.amazonaws.services.alexaforbusiness.model.AssociateSkillGroupWithRoomResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.AssociateSkillGroupWithRoomResult {
		return environment.alexaforbusiness.associateSkillGroupWithRoom(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness associate-skill-group-with-room")
				.argument("skill-group-arn", skillGroupArn)
				.argument("room-arn", roomArn)
	}

}


fun AmazonAlexaForBusinessFunctions.createAddressBook(name: String, init: (AmazonAlexaForBusinessCreateAddressBookCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.CreateAddressBookResult {
	return this.block.declare(AmazonAlexaForBusinessCreateAddressBookCommand(name).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.CreateAddressBookResult
}

@Generated
class AmazonAlexaForBusinessCreateAddressBookCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.CreateAddressBookRequest, com.amazonaws.services.alexaforbusiness.model.CreateAddressBookResult> {

	var description: String? = null
	var clientRequestToken: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.CreateAddressBookRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.CreateAddressBookRequest()
		input.setName(this.name)
		input.setDescription(this.description)
		input.setClientRequestToken(this.clientRequestToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.CreateAddressBookResult {
	  return com.amazonaws.services.alexaforbusiness.model.CreateAddressBookResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.CreateAddressBookResult {
		return environment.alexaforbusiness.createAddressBook(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness create-address-book")
				.argument("name", name)
				.argument("description", description)
				.argument("client-request-token", clientRequestToken)
	}

}


fun AmazonAlexaForBusinessFunctions.createContact(firstName: String, phoneNumber: String, init: (AmazonAlexaForBusinessCreateContactCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.CreateContactResult {
	return this.block.declare(AmazonAlexaForBusinessCreateContactCommand(firstName, phoneNumber).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.CreateContactResult
}

@Generated
class AmazonAlexaForBusinessCreateContactCommand(val firstName: String, val phoneNumber: String) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.CreateContactRequest, com.amazonaws.services.alexaforbusiness.model.CreateContactResult> {

	var displayName: String? = null
	var lastName: String? = null
	var clientRequestToken: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.CreateContactRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.CreateContactRequest()
		input.setDisplayName(this.displayName)
		input.setFirstName(this.firstName)
		input.setLastName(this.lastName)
		input.setPhoneNumber(this.phoneNumber)
		input.setClientRequestToken(this.clientRequestToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.CreateContactResult {
	  return com.amazonaws.services.alexaforbusiness.model.CreateContactResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.CreateContactResult {
		return environment.alexaforbusiness.createContact(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness create-contact")
				.argument("display-name", displayName)
				.argument("first-name", firstName)
				.argument("last-name", lastName)
				.argument("phone-number", phoneNumber)
				.argument("client-request-token", clientRequestToken)
	}

}


fun AmazonAlexaForBusinessFunctions.createProfile(profileName: String, timezone: String, address: String, distanceUnit: DistanceUnit, temperatureUnit: TemperatureUnit, wakeWord: WakeWord, init: (AmazonAlexaForBusinessCreateProfileCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.CreateProfileResult {
	return this.block.declare(AmazonAlexaForBusinessCreateProfileCommand(profileName, timezone, address, distanceUnit, temperatureUnit, wakeWord).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.CreateProfileResult
}

@Generated
class AmazonAlexaForBusinessCreateProfileCommand(val profileName: String, val timezone: String, val address: String, val distanceUnit: DistanceUnit, val temperatureUnit: TemperatureUnit, val wakeWord: WakeWord) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.CreateProfileRequest, com.amazonaws.services.alexaforbusiness.model.CreateProfileResult> {

	var clientRequestToken: String? = null
	var setupModeDisabled: Boolean? = false
	var maxVolumeLimit: Int? = 0
	var pSTNEnabled: Boolean? = false

	override fun build(): com.amazonaws.services.alexaforbusiness.model.CreateProfileRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.CreateProfileRequest()
		input.setProfileName(this.profileName)
		input.setTimezone(this.timezone)
		input.setAddress(this.address)
		input.setDistanceUnit(this.distanceUnit.toString())
		input.setTemperatureUnit(this.temperatureUnit.toString())
		input.setWakeWord(this.wakeWord.toString())
		input.setClientRequestToken(this.clientRequestToken)
		input.setSetupModeDisabled(this.setupModeDisabled)
		input.setMaxVolumeLimit(this.maxVolumeLimit)
		input.setPSTNEnabled(this.pSTNEnabled)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.CreateProfileResult {
	  return com.amazonaws.services.alexaforbusiness.model.CreateProfileResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.CreateProfileResult {
		return environment.alexaforbusiness.createProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness create-profile")
				.argument("profile-name", profileName)
				.argument("timezone", timezone)
				.argument("address", address)
				.argument("distance-unit", distanceUnit.toString())
				.argument("temperature-unit", temperatureUnit.toString())
				.argument("wake-word", wakeWord.toString())
				.argument("client-request-token", clientRequestToken)
				.option("setup-mode-disabled", setupModeDisabled ?: false)
				.argument("max-volume-limit", maxVolumeLimit?.toString())
				.option("pstnenabled", pSTNEnabled ?: false)
	}

}


fun AmazonAlexaForBusinessFunctions.createRoom(roomName: String, init: (AmazonAlexaForBusinessCreateRoomCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.CreateRoomResult {
	return this.block.declare(AmazonAlexaForBusinessCreateRoomCommand(roomName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.CreateRoomResult
}

@Generated
class AmazonAlexaForBusinessCreateRoomCommand(val roomName: String) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.CreateRoomRequest, com.amazonaws.services.alexaforbusiness.model.CreateRoomResult> {

	var description: String? = null
	var profileArn: String? = null
	var providerCalendarId: String? = null
	var clientRequestToken: String? = null
	var tags: List<com.amazonaws.services.alexaforbusiness.model.Tag>? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.CreateRoomRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.CreateRoomRequest()
		input.setRoomName(this.roomName)
		input.setDescription(this.description)
		input.setProfileArn(this.profileArn)
		input.setProviderCalendarId(this.providerCalendarId)
		input.setClientRequestToken(this.clientRequestToken)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.CreateRoomResult {
	  return com.amazonaws.services.alexaforbusiness.model.CreateRoomResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.CreateRoomResult {
		return environment.alexaforbusiness.createRoom(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness create-room")
				.argument("room-name", roomName)
				.argument("description", description)
				.argument("profile-arn", profileArn)
				.argument("provider-calendar-id", providerCalendarId)
				.argument("client-request-token", clientRequestToken)
				.argument("tags", tags?.toString())
	}

}


fun AmazonAlexaForBusinessFunctions.createSkillGroup(skillGroupName: String, init: (AmazonAlexaForBusinessCreateSkillGroupCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.CreateSkillGroupResult {
	return this.block.declare(AmazonAlexaForBusinessCreateSkillGroupCommand(skillGroupName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.CreateSkillGroupResult
}

@Generated
class AmazonAlexaForBusinessCreateSkillGroupCommand(val skillGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.CreateSkillGroupRequest, com.amazonaws.services.alexaforbusiness.model.CreateSkillGroupResult> {

	var description: String? = null
	var clientRequestToken: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.CreateSkillGroupRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.CreateSkillGroupRequest()
		input.setSkillGroupName(this.skillGroupName)
		input.setDescription(this.description)
		input.setClientRequestToken(this.clientRequestToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.CreateSkillGroupResult {
	  return com.amazonaws.services.alexaforbusiness.model.CreateSkillGroupResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.CreateSkillGroupResult {
		return environment.alexaforbusiness.createSkillGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness create-skill-group")
				.argument("skill-group-name", skillGroupName)
				.argument("description", description)
				.argument("client-request-token", clientRequestToken)
	}

}


fun AmazonAlexaForBusinessFunctions.createUser(userId: String, init: (AmazonAlexaForBusinessCreateUserCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.CreateUserResult {
	return this.block.declare(AmazonAlexaForBusinessCreateUserCommand(userId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.CreateUserResult
}

@Generated
class AmazonAlexaForBusinessCreateUserCommand(val userId: String) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.CreateUserRequest, com.amazonaws.services.alexaforbusiness.model.CreateUserResult> {

	var firstName: String? = null
	var lastName: String? = null
	var email: String? = null
	var clientRequestToken: String? = null
	var tags: List<com.amazonaws.services.alexaforbusiness.model.Tag>? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.CreateUserRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.CreateUserRequest()
		input.setUserId(this.userId)
		input.setFirstName(this.firstName)
		input.setLastName(this.lastName)
		input.setEmail(this.email)
		input.setClientRequestToken(this.clientRequestToken)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.CreateUserResult {
	  return com.amazonaws.services.alexaforbusiness.model.CreateUserResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.CreateUserResult {
		return environment.alexaforbusiness.createUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness create-user")
				.argument("user-id", userId)
				.argument("first-name", firstName)
				.argument("last-name", lastName)
				.argument("email", email)
				.argument("client-request-token", clientRequestToken)
				.argument("tags", tags?.toString())
	}

}


fun AmazonAlexaForBusinessFunctions.deleteAddressBook(addressBookArn: String, init: (AmazonAlexaForBusinessDeleteAddressBookCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.DeleteAddressBookResult {
	return this.block.declare(AmazonAlexaForBusinessDeleteAddressBookCommand(addressBookArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.DeleteAddressBookResult
}

@Generated
class AmazonAlexaForBusinessDeleteAddressBookCommand(val addressBookArn: String) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.DeleteAddressBookRequest, com.amazonaws.services.alexaforbusiness.model.DeleteAddressBookResult> {



	override fun build(): com.amazonaws.services.alexaforbusiness.model.DeleteAddressBookRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.DeleteAddressBookRequest()
		input.setAddressBookArn(this.addressBookArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.DeleteAddressBookResult {
	  return com.amazonaws.services.alexaforbusiness.model.DeleteAddressBookResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.DeleteAddressBookResult {
		return environment.alexaforbusiness.deleteAddressBook(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness delete-address-book")
				.argument("address-book-arn", addressBookArn)
	}

}


fun AmazonAlexaForBusinessFunctions.deleteContact(contactArn: String, init: (AmazonAlexaForBusinessDeleteContactCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.DeleteContactResult {
	return this.block.declare(AmazonAlexaForBusinessDeleteContactCommand(contactArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.DeleteContactResult
}

@Generated
class AmazonAlexaForBusinessDeleteContactCommand(val contactArn: String) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.DeleteContactRequest, com.amazonaws.services.alexaforbusiness.model.DeleteContactResult> {



	override fun build(): com.amazonaws.services.alexaforbusiness.model.DeleteContactRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.DeleteContactRequest()
		input.setContactArn(this.contactArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.DeleteContactResult {
	  return com.amazonaws.services.alexaforbusiness.model.DeleteContactResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.DeleteContactResult {
		return environment.alexaforbusiness.deleteContact(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness delete-contact")
				.argument("contact-arn", contactArn)
	}

}


fun AmazonAlexaForBusinessFunctions.deleteProfile(init: (AmazonAlexaForBusinessDeleteProfileCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.DeleteProfileResult {
	return this.block.declare(AmazonAlexaForBusinessDeleteProfileCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.DeleteProfileResult
}

@Generated
class AmazonAlexaForBusinessDeleteProfileCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.DeleteProfileRequest, com.amazonaws.services.alexaforbusiness.model.DeleteProfileResult> {

	var profileArn: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.DeleteProfileRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.DeleteProfileRequest()
		input.setProfileArn(this.profileArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.DeleteProfileResult {
	  return com.amazonaws.services.alexaforbusiness.model.DeleteProfileResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.DeleteProfileResult {
		return environment.alexaforbusiness.deleteProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness delete-profile")
				.argument("profile-arn", profileArn)
	}

}


fun AmazonAlexaForBusinessFunctions.deleteRoom(init: (AmazonAlexaForBusinessDeleteRoomCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.DeleteRoomResult {
	return this.block.declare(AmazonAlexaForBusinessDeleteRoomCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.DeleteRoomResult
}

@Generated
class AmazonAlexaForBusinessDeleteRoomCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.DeleteRoomRequest, com.amazonaws.services.alexaforbusiness.model.DeleteRoomResult> {

	var roomArn: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.DeleteRoomRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.DeleteRoomRequest()
		input.setRoomArn(this.roomArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.DeleteRoomResult {
	  return com.amazonaws.services.alexaforbusiness.model.DeleteRoomResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.DeleteRoomResult {
		return environment.alexaforbusiness.deleteRoom(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness delete-room")
				.argument("room-arn", roomArn)
	}

}


fun AmazonAlexaForBusinessFunctions.deleteRoomSkillParameter(skillId: String, parameterKey: String, init: (AmazonAlexaForBusinessDeleteRoomSkillParameterCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.DeleteRoomSkillParameterResult {
	return this.block.declare(AmazonAlexaForBusinessDeleteRoomSkillParameterCommand(skillId, parameterKey).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.DeleteRoomSkillParameterResult
}

@Generated
class AmazonAlexaForBusinessDeleteRoomSkillParameterCommand(val skillId: String, val parameterKey: String) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.DeleteRoomSkillParameterRequest, com.amazonaws.services.alexaforbusiness.model.DeleteRoomSkillParameterResult> {

	var roomArn: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.DeleteRoomSkillParameterRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.DeleteRoomSkillParameterRequest()
		input.setRoomArn(this.roomArn)
		input.setSkillId(this.skillId)
		input.setParameterKey(this.parameterKey)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.DeleteRoomSkillParameterResult {
	  return com.amazonaws.services.alexaforbusiness.model.DeleteRoomSkillParameterResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.DeleteRoomSkillParameterResult {
		return environment.alexaforbusiness.deleteRoomSkillParameter(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness delete-room-skill-parameter")
				.argument("room-arn", roomArn)
				.argument("skill-id", skillId)
				.argument("parameter-key", parameterKey)
	}

}


fun AmazonAlexaForBusinessFunctions.deleteSkillGroup(init: (AmazonAlexaForBusinessDeleteSkillGroupCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.DeleteSkillGroupResult {
	return this.block.declare(AmazonAlexaForBusinessDeleteSkillGroupCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.DeleteSkillGroupResult
}

@Generated
class AmazonAlexaForBusinessDeleteSkillGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.DeleteSkillGroupRequest, com.amazonaws.services.alexaforbusiness.model.DeleteSkillGroupResult> {

	var skillGroupArn: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.DeleteSkillGroupRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.DeleteSkillGroupRequest()
		input.setSkillGroupArn(this.skillGroupArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.DeleteSkillGroupResult {
	  return com.amazonaws.services.alexaforbusiness.model.DeleteSkillGroupResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.DeleteSkillGroupResult {
		return environment.alexaforbusiness.deleteSkillGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness delete-skill-group")
				.argument("skill-group-arn", skillGroupArn)
	}

}


fun AmazonAlexaForBusinessFunctions.deleteUser(enrollmentId: String, init: (AmazonAlexaForBusinessDeleteUserCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.DeleteUserResult {
	return this.block.declare(AmazonAlexaForBusinessDeleteUserCommand(enrollmentId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.DeleteUserResult
}

@Generated
class AmazonAlexaForBusinessDeleteUserCommand(val enrollmentId: String) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.DeleteUserRequest, com.amazonaws.services.alexaforbusiness.model.DeleteUserResult> {

	var userArn: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.DeleteUserRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.DeleteUserRequest()
		input.setUserArn(this.userArn)
		input.setEnrollmentId(this.enrollmentId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.DeleteUserResult {
	  return com.amazonaws.services.alexaforbusiness.model.DeleteUserResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.DeleteUserResult {
		return environment.alexaforbusiness.deleteUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness delete-user")
				.argument("user-arn", userArn)
				.argument("enrollment-id", enrollmentId)
	}

}


fun AmazonAlexaForBusinessFunctions.disassociateContactFromAddressBook(contactArn: String, addressBookArn: String, init: (AmazonAlexaForBusinessDisassociateContactFromAddressBookCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.DisassociateContactFromAddressBookResult {
	return this.block.declare(AmazonAlexaForBusinessDisassociateContactFromAddressBookCommand(contactArn, addressBookArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.DisassociateContactFromAddressBookResult
}

@Generated
class AmazonAlexaForBusinessDisassociateContactFromAddressBookCommand(val contactArn: String, val addressBookArn: String) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.DisassociateContactFromAddressBookRequest, com.amazonaws.services.alexaforbusiness.model.DisassociateContactFromAddressBookResult> {



	override fun build(): com.amazonaws.services.alexaforbusiness.model.DisassociateContactFromAddressBookRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.DisassociateContactFromAddressBookRequest()
		input.setContactArn(this.contactArn)
		input.setAddressBookArn(this.addressBookArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.DisassociateContactFromAddressBookResult {
	  return com.amazonaws.services.alexaforbusiness.model.DisassociateContactFromAddressBookResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.DisassociateContactFromAddressBookResult {
		return environment.alexaforbusiness.disassociateContactFromAddressBook(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness disassociate-contact-from-address-book")
				.argument("contact-arn", contactArn)
				.argument("address-book-arn", addressBookArn)
	}

}


fun AmazonAlexaForBusinessFunctions.disassociateDeviceFromRoom(init: (AmazonAlexaForBusinessDisassociateDeviceFromRoomCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.DisassociateDeviceFromRoomResult {
	return this.block.declare(AmazonAlexaForBusinessDisassociateDeviceFromRoomCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.DisassociateDeviceFromRoomResult
}

@Generated
class AmazonAlexaForBusinessDisassociateDeviceFromRoomCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.DisassociateDeviceFromRoomRequest, com.amazonaws.services.alexaforbusiness.model.DisassociateDeviceFromRoomResult> {

	var deviceArn: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.DisassociateDeviceFromRoomRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.DisassociateDeviceFromRoomRequest()
		input.setDeviceArn(this.deviceArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.DisassociateDeviceFromRoomResult {
	  return com.amazonaws.services.alexaforbusiness.model.DisassociateDeviceFromRoomResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.DisassociateDeviceFromRoomResult {
		return environment.alexaforbusiness.disassociateDeviceFromRoom(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness disassociate-device-from-room")
				.argument("device-arn", deviceArn)
	}

}


fun AmazonAlexaForBusinessFunctions.disassociateSkillGroupFromRoom(init: (AmazonAlexaForBusinessDisassociateSkillGroupFromRoomCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.DisassociateSkillGroupFromRoomResult {
	return this.block.declare(AmazonAlexaForBusinessDisassociateSkillGroupFromRoomCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.DisassociateSkillGroupFromRoomResult
}

@Generated
class AmazonAlexaForBusinessDisassociateSkillGroupFromRoomCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.DisassociateSkillGroupFromRoomRequest, com.amazonaws.services.alexaforbusiness.model.DisassociateSkillGroupFromRoomResult> {

	var skillGroupArn: String? = null
	var roomArn: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.DisassociateSkillGroupFromRoomRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.DisassociateSkillGroupFromRoomRequest()
		input.setSkillGroupArn(this.skillGroupArn)
		input.setRoomArn(this.roomArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.DisassociateSkillGroupFromRoomResult {
	  return com.amazonaws.services.alexaforbusiness.model.DisassociateSkillGroupFromRoomResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.DisassociateSkillGroupFromRoomResult {
		return environment.alexaforbusiness.disassociateSkillGroupFromRoom(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness disassociate-skill-group-from-room")
				.argument("skill-group-arn", skillGroupArn)
				.argument("room-arn", roomArn)
	}

}


fun AmazonAlexaForBusinessFunctions.getAddressBook(addressBookArn: String, init: (AmazonAlexaForBusinessGetAddressBookCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.GetAddressBookResult {
	return this.block.declare(AmazonAlexaForBusinessGetAddressBookCommand(addressBookArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.GetAddressBookResult
}

@Generated
class AmazonAlexaForBusinessGetAddressBookCommand(val addressBookArn: String) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.GetAddressBookRequest, com.amazonaws.services.alexaforbusiness.model.GetAddressBookResult> {



	override fun build(): com.amazonaws.services.alexaforbusiness.model.GetAddressBookRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.GetAddressBookRequest()
		input.setAddressBookArn(this.addressBookArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.GetAddressBookResult {
	  return com.amazonaws.services.alexaforbusiness.model.GetAddressBookResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.GetAddressBookResult {
		return environment.alexaforbusiness.getAddressBook(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness get-address-book")
				.argument("address-book-arn", addressBookArn)
	}

}


fun AmazonAlexaForBusinessFunctions.getContact(contactArn: String, init: (AmazonAlexaForBusinessGetContactCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.GetContactResult {
	return this.block.declare(AmazonAlexaForBusinessGetContactCommand(contactArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.GetContactResult
}

@Generated
class AmazonAlexaForBusinessGetContactCommand(val contactArn: String) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.GetContactRequest, com.amazonaws.services.alexaforbusiness.model.GetContactResult> {



	override fun build(): com.amazonaws.services.alexaforbusiness.model.GetContactRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.GetContactRequest()
		input.setContactArn(this.contactArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.GetContactResult {
	  return com.amazonaws.services.alexaforbusiness.model.GetContactResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.GetContactResult {
		return environment.alexaforbusiness.getContact(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness get-contact")
				.argument("contact-arn", contactArn)
	}

}


fun AmazonAlexaForBusinessFunctions.getDevice(init: (AmazonAlexaForBusinessGetDeviceCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.GetDeviceResult {
	return this.block.declare(AmazonAlexaForBusinessGetDeviceCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.GetDeviceResult
}

@Generated
class AmazonAlexaForBusinessGetDeviceCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.GetDeviceRequest, com.amazonaws.services.alexaforbusiness.model.GetDeviceResult> {

	var deviceArn: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.GetDeviceRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.GetDeviceRequest()
		input.setDeviceArn(this.deviceArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.GetDeviceResult {
	  return com.amazonaws.services.alexaforbusiness.model.GetDeviceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.GetDeviceResult {
		return environment.alexaforbusiness.getDevice(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness get-device")
				.argument("device-arn", deviceArn)
	}

}


fun AmazonAlexaForBusinessFunctions.getProfile(init: (AmazonAlexaForBusinessGetProfileCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.GetProfileResult {
	return this.block.declare(AmazonAlexaForBusinessGetProfileCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.GetProfileResult
}

@Generated
class AmazonAlexaForBusinessGetProfileCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.GetProfileRequest, com.amazonaws.services.alexaforbusiness.model.GetProfileResult> {

	var profileArn: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.GetProfileRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.GetProfileRequest()
		input.setProfileArn(this.profileArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.GetProfileResult {
	  return com.amazonaws.services.alexaforbusiness.model.GetProfileResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.GetProfileResult {
		return environment.alexaforbusiness.getProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness get-profile")
				.argument("profile-arn", profileArn)
	}

}


fun AmazonAlexaForBusinessFunctions.getRoom(init: (AmazonAlexaForBusinessGetRoomCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.GetRoomResult {
	return this.block.declare(AmazonAlexaForBusinessGetRoomCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.GetRoomResult
}

@Generated
class AmazonAlexaForBusinessGetRoomCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.GetRoomRequest, com.amazonaws.services.alexaforbusiness.model.GetRoomResult> {

	var roomArn: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.GetRoomRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.GetRoomRequest()
		input.setRoomArn(this.roomArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.GetRoomResult {
	  return com.amazonaws.services.alexaforbusiness.model.GetRoomResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.GetRoomResult {
		return environment.alexaforbusiness.getRoom(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness get-room")
				.argument("room-arn", roomArn)
	}

}


fun AmazonAlexaForBusinessFunctions.getRoomSkillParameter(skillId: String, parameterKey: String, init: (AmazonAlexaForBusinessGetRoomSkillParameterCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.GetRoomSkillParameterResult {
	return this.block.declare(AmazonAlexaForBusinessGetRoomSkillParameterCommand(skillId, parameterKey).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.GetRoomSkillParameterResult
}

@Generated
class AmazonAlexaForBusinessGetRoomSkillParameterCommand(val skillId: String, val parameterKey: String) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.GetRoomSkillParameterRequest, com.amazonaws.services.alexaforbusiness.model.GetRoomSkillParameterResult> {

	var roomArn: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.GetRoomSkillParameterRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.GetRoomSkillParameterRequest()
		input.setRoomArn(this.roomArn)
		input.setSkillId(this.skillId)
		input.setParameterKey(this.parameterKey)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.GetRoomSkillParameterResult {
	  return com.amazonaws.services.alexaforbusiness.model.GetRoomSkillParameterResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.GetRoomSkillParameterResult {
		return environment.alexaforbusiness.getRoomSkillParameter(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness get-room-skill-parameter")
				.argument("room-arn", roomArn)
				.argument("skill-id", skillId)
				.argument("parameter-key", parameterKey)
	}

}


fun AmazonAlexaForBusinessFunctions.getSkillGroup(init: (AmazonAlexaForBusinessGetSkillGroupCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.GetSkillGroupResult {
	return this.block.declare(AmazonAlexaForBusinessGetSkillGroupCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.GetSkillGroupResult
}

@Generated
class AmazonAlexaForBusinessGetSkillGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.GetSkillGroupRequest, com.amazonaws.services.alexaforbusiness.model.GetSkillGroupResult> {

	var skillGroupArn: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.GetSkillGroupRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.GetSkillGroupRequest()
		input.setSkillGroupArn(this.skillGroupArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.GetSkillGroupResult {
	  return com.amazonaws.services.alexaforbusiness.model.GetSkillGroupResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.GetSkillGroupResult {
		return environment.alexaforbusiness.getSkillGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness get-skill-group")
				.argument("skill-group-arn", skillGroupArn)
	}

}


fun AmazonAlexaForBusinessFunctions.listSkills(init: (AmazonAlexaForBusinessListSkillsCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.ListSkillsResult {
	return this.block.declare(AmazonAlexaForBusinessListSkillsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.ListSkillsResult
}

@Generated
class AmazonAlexaForBusinessListSkillsCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.ListSkillsRequest, com.amazonaws.services.alexaforbusiness.model.ListSkillsResult> {

	var skillGroupArn: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.alexaforbusiness.model.ListSkillsRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.ListSkillsRequest()
		input.setSkillGroupArn(this.skillGroupArn)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.ListSkillsResult {
	  return com.amazonaws.services.alexaforbusiness.model.ListSkillsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.ListSkillsResult {
		return environment.alexaforbusiness.listSkills(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness list-skills")
				.argument("skill-group-arn", skillGroupArn)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonAlexaForBusinessFunctions.listTags(arn: String, init: (AmazonAlexaForBusinessListTagsCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.ListTagsResult {
	return this.block.declare(AmazonAlexaForBusinessListTagsCommand(arn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.ListTagsResult
}

@Generated
class AmazonAlexaForBusinessListTagsCommand(val arn: String) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.ListTagsRequest, com.amazonaws.services.alexaforbusiness.model.ListTagsResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.alexaforbusiness.model.ListTagsRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.ListTagsRequest()
		input.setArn(this.arn)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.ListTagsResult {
	  return com.amazonaws.services.alexaforbusiness.model.ListTagsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.ListTagsResult {
		return environment.alexaforbusiness.listTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness list-tags")
				.argument("arn", arn)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonAlexaForBusinessFunctions.putRoomSkillParameter(skillId: String, roomSkillParameter: com.amazonaws.services.alexaforbusiness.model.RoomSkillParameter, init: (AmazonAlexaForBusinessPutRoomSkillParameterCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.PutRoomSkillParameterResult {
	return this.block.declare(AmazonAlexaForBusinessPutRoomSkillParameterCommand(skillId, roomSkillParameter).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.PutRoomSkillParameterResult
}

@Generated
class AmazonAlexaForBusinessPutRoomSkillParameterCommand(val skillId: String, val roomSkillParameter: com.amazonaws.services.alexaforbusiness.model.RoomSkillParameter) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.PutRoomSkillParameterRequest, com.amazonaws.services.alexaforbusiness.model.PutRoomSkillParameterResult> {

	var roomArn: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.PutRoomSkillParameterRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.PutRoomSkillParameterRequest()
		input.setRoomArn(this.roomArn)
		input.setSkillId(this.skillId)
		input.setRoomSkillParameter(this.roomSkillParameter)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.PutRoomSkillParameterResult {
	  return com.amazonaws.services.alexaforbusiness.model.PutRoomSkillParameterResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.PutRoomSkillParameterResult {
		return environment.alexaforbusiness.putRoomSkillParameter(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness put-room-skill-parameter")
				.argument("room-arn", roomArn)
				.argument("skill-id", skillId)
				.argument("room-skill-parameter", roomSkillParameter.toString())
	}

}


fun AmazonAlexaForBusinessFunctions.resolveRoom(userId: String, skillId: String, init: (AmazonAlexaForBusinessResolveRoomCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.ResolveRoomResult {
	return this.block.declare(AmazonAlexaForBusinessResolveRoomCommand(userId, skillId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.ResolveRoomResult
}

@Generated
class AmazonAlexaForBusinessResolveRoomCommand(val userId: String, val skillId: String) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.ResolveRoomRequest, com.amazonaws.services.alexaforbusiness.model.ResolveRoomResult> {



	override fun build(): com.amazonaws.services.alexaforbusiness.model.ResolveRoomRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.ResolveRoomRequest()
		input.setUserId(this.userId)
		input.setSkillId(this.skillId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.ResolveRoomResult {
	  return com.amazonaws.services.alexaforbusiness.model.ResolveRoomResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.ResolveRoomResult {
		return environment.alexaforbusiness.resolveRoom(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness resolve-room")
				.argument("user-id", userId)
				.argument("skill-id", skillId)
	}

}


fun AmazonAlexaForBusinessFunctions.revokeInvitation(init: (AmazonAlexaForBusinessRevokeInvitationCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.RevokeInvitationResult {
	return this.block.declare(AmazonAlexaForBusinessRevokeInvitationCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.RevokeInvitationResult
}

@Generated
class AmazonAlexaForBusinessRevokeInvitationCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.RevokeInvitationRequest, com.amazonaws.services.alexaforbusiness.model.RevokeInvitationResult> {

	var userArn: String? = null
	var enrollmentId: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.RevokeInvitationRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.RevokeInvitationRequest()
		input.setUserArn(this.userArn)
		input.setEnrollmentId(this.enrollmentId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.RevokeInvitationResult {
	  return com.amazonaws.services.alexaforbusiness.model.RevokeInvitationResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.RevokeInvitationResult {
		return environment.alexaforbusiness.revokeInvitation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness revoke-invitation")
				.argument("user-arn", userArn)
				.argument("enrollment-id", enrollmentId)
	}

}


fun AmazonAlexaForBusinessFunctions.searchAddressBooks(init: (AmazonAlexaForBusinessSearchAddressBooksCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.SearchAddressBooksResult {
	return this.block.declare(AmazonAlexaForBusinessSearchAddressBooksCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.SearchAddressBooksResult
}

@Generated
class AmazonAlexaForBusinessSearchAddressBooksCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.SearchAddressBooksRequest, com.amazonaws.services.alexaforbusiness.model.SearchAddressBooksResult> {

	var filters: List<com.amazonaws.services.alexaforbusiness.model.Filter>? = null
	var sortCriteria: List<com.amazonaws.services.alexaforbusiness.model.Sort>? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.alexaforbusiness.model.SearchAddressBooksRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.SearchAddressBooksRequest()
		input.setFilters(this.filters)
		input.setSortCriteria(this.sortCriteria)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.SearchAddressBooksResult {
	  return com.amazonaws.services.alexaforbusiness.model.SearchAddressBooksResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.SearchAddressBooksResult {
		return environment.alexaforbusiness.searchAddressBooks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness search-address-books")
				.argument("filters", filters?.toString())
				.argument("sort-criteria", sortCriteria?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonAlexaForBusinessFunctions.searchContacts(init: (AmazonAlexaForBusinessSearchContactsCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.SearchContactsResult {
	return this.block.declare(AmazonAlexaForBusinessSearchContactsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.SearchContactsResult
}

@Generated
class AmazonAlexaForBusinessSearchContactsCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.SearchContactsRequest, com.amazonaws.services.alexaforbusiness.model.SearchContactsResult> {

	var filters: List<com.amazonaws.services.alexaforbusiness.model.Filter>? = null
	var sortCriteria: List<com.amazonaws.services.alexaforbusiness.model.Sort>? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.alexaforbusiness.model.SearchContactsRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.SearchContactsRequest()
		input.setFilters(this.filters)
		input.setSortCriteria(this.sortCriteria)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.SearchContactsResult {
	  return com.amazonaws.services.alexaforbusiness.model.SearchContactsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.SearchContactsResult {
		return environment.alexaforbusiness.searchContacts(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness search-contacts")
				.argument("filters", filters?.toString())
				.argument("sort-criteria", sortCriteria?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonAlexaForBusinessFunctions.searchDevices(init: (AmazonAlexaForBusinessSearchDevicesCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.SearchDevicesResult {
	return this.block.declare(AmazonAlexaForBusinessSearchDevicesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.SearchDevicesResult
}

@Generated
class AmazonAlexaForBusinessSearchDevicesCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.SearchDevicesRequest, com.amazonaws.services.alexaforbusiness.model.SearchDevicesResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0
	var filters: List<com.amazonaws.services.alexaforbusiness.model.Filter>? = null
	var sortCriteria: List<com.amazonaws.services.alexaforbusiness.model.Sort>? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.SearchDevicesRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.SearchDevicesRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setFilters(this.filters)
		input.setSortCriteria(this.sortCriteria)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.SearchDevicesResult {
	  return com.amazonaws.services.alexaforbusiness.model.SearchDevicesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.SearchDevicesResult {
		return environment.alexaforbusiness.searchDevices(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness search-devices")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("filters", filters?.toString())
				.argument("sort-criteria", sortCriteria?.toString())
	}

}


fun AmazonAlexaForBusinessFunctions.searchProfiles(init: (AmazonAlexaForBusinessSearchProfilesCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.SearchProfilesResult {
	return this.block.declare(AmazonAlexaForBusinessSearchProfilesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.SearchProfilesResult
}

@Generated
class AmazonAlexaForBusinessSearchProfilesCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.SearchProfilesRequest, com.amazonaws.services.alexaforbusiness.model.SearchProfilesResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0
	var filters: List<com.amazonaws.services.alexaforbusiness.model.Filter>? = null
	var sortCriteria: List<com.amazonaws.services.alexaforbusiness.model.Sort>? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.SearchProfilesRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.SearchProfilesRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setFilters(this.filters)
		input.setSortCriteria(this.sortCriteria)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.SearchProfilesResult {
	  return com.amazonaws.services.alexaforbusiness.model.SearchProfilesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.SearchProfilesResult {
		return environment.alexaforbusiness.searchProfiles(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness search-profiles")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("filters", filters?.toString())
				.argument("sort-criteria", sortCriteria?.toString())
	}

}


fun AmazonAlexaForBusinessFunctions.searchRooms(init: (AmazonAlexaForBusinessSearchRoomsCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.SearchRoomsResult {
	return this.block.declare(AmazonAlexaForBusinessSearchRoomsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.SearchRoomsResult
}

@Generated
class AmazonAlexaForBusinessSearchRoomsCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.SearchRoomsRequest, com.amazonaws.services.alexaforbusiness.model.SearchRoomsResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0
	var filters: List<com.amazonaws.services.alexaforbusiness.model.Filter>? = null
	var sortCriteria: List<com.amazonaws.services.alexaforbusiness.model.Sort>? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.SearchRoomsRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.SearchRoomsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setFilters(this.filters)
		input.setSortCriteria(this.sortCriteria)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.SearchRoomsResult {
	  return com.amazonaws.services.alexaforbusiness.model.SearchRoomsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.SearchRoomsResult {
		return environment.alexaforbusiness.searchRooms(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness search-rooms")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("filters", filters?.toString())
				.argument("sort-criteria", sortCriteria?.toString())
	}

}


fun AmazonAlexaForBusinessFunctions.searchSkillGroups(init: (AmazonAlexaForBusinessSearchSkillGroupsCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.SearchSkillGroupsResult {
	return this.block.declare(AmazonAlexaForBusinessSearchSkillGroupsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.SearchSkillGroupsResult
}

@Generated
class AmazonAlexaForBusinessSearchSkillGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.SearchSkillGroupsRequest, com.amazonaws.services.alexaforbusiness.model.SearchSkillGroupsResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0
	var filters: List<com.amazonaws.services.alexaforbusiness.model.Filter>? = null
	var sortCriteria: List<com.amazonaws.services.alexaforbusiness.model.Sort>? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.SearchSkillGroupsRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.SearchSkillGroupsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setFilters(this.filters)
		input.setSortCriteria(this.sortCriteria)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.SearchSkillGroupsResult {
	  return com.amazonaws.services.alexaforbusiness.model.SearchSkillGroupsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.SearchSkillGroupsResult {
		return environment.alexaforbusiness.searchSkillGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness search-skill-groups")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("filters", filters?.toString())
				.argument("sort-criteria", sortCriteria?.toString())
	}

}


fun AmazonAlexaForBusinessFunctions.searchUsers(init: (AmazonAlexaForBusinessSearchUsersCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.SearchUsersResult {
	return this.block.declare(AmazonAlexaForBusinessSearchUsersCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.SearchUsersResult
}

@Generated
class AmazonAlexaForBusinessSearchUsersCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.SearchUsersRequest, com.amazonaws.services.alexaforbusiness.model.SearchUsersResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0
	var filters: List<com.amazonaws.services.alexaforbusiness.model.Filter>? = null
	var sortCriteria: List<com.amazonaws.services.alexaforbusiness.model.Sort>? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.SearchUsersRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.SearchUsersRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setFilters(this.filters)
		input.setSortCriteria(this.sortCriteria)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.SearchUsersResult {
	  return com.amazonaws.services.alexaforbusiness.model.SearchUsersResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.SearchUsersResult {
		return environment.alexaforbusiness.searchUsers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness search-users")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("filters", filters?.toString())
				.argument("sort-criteria", sortCriteria?.toString())
	}

}


fun AmazonAlexaForBusinessFunctions.sendInvitation(init: (AmazonAlexaForBusinessSendInvitationCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.SendInvitationResult {
	return this.block.declare(AmazonAlexaForBusinessSendInvitationCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.SendInvitationResult
}

@Generated
class AmazonAlexaForBusinessSendInvitationCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.SendInvitationRequest, com.amazonaws.services.alexaforbusiness.model.SendInvitationResult> {

	var userArn: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.SendInvitationRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.SendInvitationRequest()
		input.setUserArn(this.userArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.SendInvitationResult {
	  return com.amazonaws.services.alexaforbusiness.model.SendInvitationResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.SendInvitationResult {
		return environment.alexaforbusiness.sendInvitation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness send-invitation")
				.argument("user-arn", userArn)
	}

}


fun AmazonAlexaForBusinessFunctions.startDeviceSync(features: List<Feature>, init: (AmazonAlexaForBusinessStartDeviceSyncCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.StartDeviceSyncResult {
	return this.block.declare(AmazonAlexaForBusinessStartDeviceSyncCommand(features).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.StartDeviceSyncResult
}

@Generated
class AmazonAlexaForBusinessStartDeviceSyncCommand(val features: List<Feature>) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.StartDeviceSyncRequest, com.amazonaws.services.alexaforbusiness.model.StartDeviceSyncResult> {

	var roomArn: String? = null
	var deviceArn: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.StartDeviceSyncRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.StartDeviceSyncRequest()
		input.setRoomArn(this.roomArn)
		input.setDeviceArn(this.deviceArn)
		input.setFeatures(this.features.map { it.toString() })
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.StartDeviceSyncResult {
	  return com.amazonaws.services.alexaforbusiness.model.StartDeviceSyncResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.StartDeviceSyncResult {
		return environment.alexaforbusiness.startDeviceSync(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness start-device-sync")
				.argument("room-arn", roomArn)
				.argument("device-arn", deviceArn)
				.argument("features", features.toString())
	}

}


fun AmazonAlexaForBusinessFunctions.tagResource(arn: String, tags: List<com.amazonaws.services.alexaforbusiness.model.Tag>, init: (AmazonAlexaForBusinessTagResourceCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.TagResourceResult {
	return this.block.declare(AmazonAlexaForBusinessTagResourceCommand(arn, tags).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.TagResourceResult
}

@Generated
class AmazonAlexaForBusinessTagResourceCommand(val arn: String, val tags: List<com.amazonaws.services.alexaforbusiness.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.TagResourceRequest, com.amazonaws.services.alexaforbusiness.model.TagResourceResult> {



	override fun build(): com.amazonaws.services.alexaforbusiness.model.TagResourceRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.TagResourceRequest()
		input.setArn(this.arn)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.TagResourceResult {
	  return com.amazonaws.services.alexaforbusiness.model.TagResourceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.TagResourceResult {
		return environment.alexaforbusiness.tagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness tag-resource")
				.argument("arn", arn)
				.argument("tags", tags.toString())
	}

}


fun AmazonAlexaForBusinessFunctions.untagResource(arn: String, tagKeys: List<String>, init: (AmazonAlexaForBusinessUntagResourceCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.UntagResourceResult {
	return this.block.declare(AmazonAlexaForBusinessUntagResourceCommand(arn, tagKeys).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.UntagResourceResult
}

@Generated
class AmazonAlexaForBusinessUntagResourceCommand(val arn: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.UntagResourceRequest, com.amazonaws.services.alexaforbusiness.model.UntagResourceResult> {



	override fun build(): com.amazonaws.services.alexaforbusiness.model.UntagResourceRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.UntagResourceRequest()
		input.setArn(this.arn)
		input.setTagKeys(this.tagKeys)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.UntagResourceResult {
	  return com.amazonaws.services.alexaforbusiness.model.UntagResourceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.UntagResourceResult {
		return environment.alexaforbusiness.untagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness untag-resource")
				.argument("arn", arn)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AmazonAlexaForBusinessFunctions.updateAddressBook(addressBookArn: String, init: (AmazonAlexaForBusinessUpdateAddressBookCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.UpdateAddressBookResult {
	return this.block.declare(AmazonAlexaForBusinessUpdateAddressBookCommand(addressBookArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.UpdateAddressBookResult
}

@Generated
class AmazonAlexaForBusinessUpdateAddressBookCommand(val addressBookArn: String) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.UpdateAddressBookRequest, com.amazonaws.services.alexaforbusiness.model.UpdateAddressBookResult> {

	var name: String? = null
	var description: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.UpdateAddressBookRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.UpdateAddressBookRequest()
		input.setAddressBookArn(this.addressBookArn)
		input.setName(this.name)
		input.setDescription(this.description)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.UpdateAddressBookResult {
	  return com.amazonaws.services.alexaforbusiness.model.UpdateAddressBookResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.UpdateAddressBookResult {
		return environment.alexaforbusiness.updateAddressBook(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness update-address-book")
				.argument("address-book-arn", addressBookArn)
				.argument("name", name)
				.argument("description", description)
	}

}


fun AmazonAlexaForBusinessFunctions.updateContact(contactArn: String, init: (AmazonAlexaForBusinessUpdateContactCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.UpdateContactResult {
	return this.block.declare(AmazonAlexaForBusinessUpdateContactCommand(contactArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.UpdateContactResult
}

@Generated
class AmazonAlexaForBusinessUpdateContactCommand(val contactArn: String) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.UpdateContactRequest, com.amazonaws.services.alexaforbusiness.model.UpdateContactResult> {

	var displayName: String? = null
	var firstName: String? = null
	var lastName: String? = null
	var phoneNumber: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.UpdateContactRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.UpdateContactRequest()
		input.setContactArn(this.contactArn)
		input.setDisplayName(this.displayName)
		input.setFirstName(this.firstName)
		input.setLastName(this.lastName)
		input.setPhoneNumber(this.phoneNumber)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.UpdateContactResult {
	  return com.amazonaws.services.alexaforbusiness.model.UpdateContactResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.UpdateContactResult {
		return environment.alexaforbusiness.updateContact(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness update-contact")
				.argument("contact-arn", contactArn)
				.argument("display-name", displayName)
				.argument("first-name", firstName)
				.argument("last-name", lastName)
				.argument("phone-number", phoneNumber)
	}

}


fun AmazonAlexaForBusinessFunctions.updateDevice(init: (AmazonAlexaForBusinessUpdateDeviceCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.UpdateDeviceResult {
	return this.block.declare(AmazonAlexaForBusinessUpdateDeviceCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.UpdateDeviceResult
}

@Generated
class AmazonAlexaForBusinessUpdateDeviceCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.UpdateDeviceRequest, com.amazonaws.services.alexaforbusiness.model.UpdateDeviceResult> {

	var deviceArn: String? = null
	var deviceName: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.UpdateDeviceRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.UpdateDeviceRequest()
		input.setDeviceArn(this.deviceArn)
		input.setDeviceName(this.deviceName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.UpdateDeviceResult {
	  return com.amazonaws.services.alexaforbusiness.model.UpdateDeviceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.UpdateDeviceResult {
		return environment.alexaforbusiness.updateDevice(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness update-device")
				.argument("device-arn", deviceArn)
				.argument("device-name", deviceName)
	}

}


fun AmazonAlexaForBusinessFunctions.updateProfile(init: (AmazonAlexaForBusinessUpdateProfileCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.UpdateProfileResult {
	return this.block.declare(AmazonAlexaForBusinessUpdateProfileCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.UpdateProfileResult
}

@Generated
class AmazonAlexaForBusinessUpdateProfileCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.UpdateProfileRequest, com.amazonaws.services.alexaforbusiness.model.UpdateProfileResult> {

	var profileArn: String? = null
	var profileName: String? = null
	var timezone: String? = null
	var address: String? = null
	var distanceUnit: DistanceUnit? = null
	var temperatureUnit: TemperatureUnit? = null
	var wakeWord: WakeWord? = null
	var setupModeDisabled: Boolean? = false
	var maxVolumeLimit: Int? = 0
	var pSTNEnabled: Boolean? = false

	override fun build(): com.amazonaws.services.alexaforbusiness.model.UpdateProfileRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.UpdateProfileRequest()
		input.setProfileArn(this.profileArn)
		input.setProfileName(this.profileName)
		input.setTimezone(this.timezone)
		input.setAddress(this.address)
		input.setDistanceUnit(this.distanceUnit?.toString())
		input.setTemperatureUnit(this.temperatureUnit?.toString())
		input.setWakeWord(this.wakeWord?.toString())
		input.setSetupModeDisabled(this.setupModeDisabled)
		input.setMaxVolumeLimit(this.maxVolumeLimit)
		input.setPSTNEnabled(this.pSTNEnabled)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.UpdateProfileResult {
	  return com.amazonaws.services.alexaforbusiness.model.UpdateProfileResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.UpdateProfileResult {
		return environment.alexaforbusiness.updateProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness update-profile")
				.argument("profile-arn", profileArn)
				.argument("profile-name", profileName)
				.argument("timezone", timezone)
				.argument("address", address)
				.argument("distance-unit", distanceUnit?.toString())
				.argument("temperature-unit", temperatureUnit?.toString())
				.argument("wake-word", wakeWord?.toString())
				.option("setup-mode-disabled", setupModeDisabled ?: false)
				.argument("max-volume-limit", maxVolumeLimit?.toString())
				.option("pstnenabled", pSTNEnabled ?: false)
	}

}


fun AmazonAlexaForBusinessFunctions.updateRoom(init: (AmazonAlexaForBusinessUpdateRoomCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.UpdateRoomResult {
	return this.block.declare(AmazonAlexaForBusinessUpdateRoomCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.UpdateRoomResult
}

@Generated
class AmazonAlexaForBusinessUpdateRoomCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.UpdateRoomRequest, com.amazonaws.services.alexaforbusiness.model.UpdateRoomResult> {

	var roomArn: String? = null
	var roomName: String? = null
	var description: String? = null
	var providerCalendarId: String? = null
	var profileArn: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.UpdateRoomRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.UpdateRoomRequest()
		input.setRoomArn(this.roomArn)
		input.setRoomName(this.roomName)
		input.setDescription(this.description)
		input.setProviderCalendarId(this.providerCalendarId)
		input.setProfileArn(this.profileArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.UpdateRoomResult {
	  return com.amazonaws.services.alexaforbusiness.model.UpdateRoomResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.UpdateRoomResult {
		return environment.alexaforbusiness.updateRoom(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness update-room")
				.argument("room-arn", roomArn)
				.argument("room-name", roomName)
				.argument("description", description)
				.argument("provider-calendar-id", providerCalendarId)
				.argument("profile-arn", profileArn)
	}

}


fun AmazonAlexaForBusinessFunctions.updateSkillGroup(init: (AmazonAlexaForBusinessUpdateSkillGroupCommand.() -> Unit)? = null): com.amazonaws.services.alexaforbusiness.model.UpdateSkillGroupResult {
	return this.block.declare(AmazonAlexaForBusinessUpdateSkillGroupCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.alexaforbusiness.model.UpdateSkillGroupResult
}

@Generated
class AmazonAlexaForBusinessUpdateSkillGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.UpdateSkillGroupRequest, com.amazonaws.services.alexaforbusiness.model.UpdateSkillGroupResult> {

	var skillGroupArn: String? = null
	var skillGroupName: String? = null
	var description: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.UpdateSkillGroupRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.UpdateSkillGroupRequest()
		input.setSkillGroupArn(this.skillGroupArn)
		input.setSkillGroupName(this.skillGroupName)
		input.setDescription(this.description)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.alexaforbusiness.model.UpdateSkillGroupResult {
	  return com.amazonaws.services.alexaforbusiness.model.UpdateSkillGroupResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.alexaforbusiness.model.UpdateSkillGroupResult {
		return environment.alexaforbusiness.updateSkillGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness update-skill-group")
				.argument("skill-group-arn", skillGroupArn)
				.argument("skill-group-name", skillGroupName)
				.argument("description", description)
	}

}
