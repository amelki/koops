
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.alexaforbusiness.AmazonAlexaForBusiness
import com.amazonaws.services.alexaforbusiness.model.*

var codingue.koops.core.Environment.alexaforbusiness: AmazonAlexaForBusiness
	get() = this.capabilities[AmazonAlexaForBusiness::class.java.name] as AmazonAlexaForBusiness
	set(alexaforbusiness) {
		this.capabilities[AmazonAlexaForBusiness::class.java.name] = alexaforbusiness
	}

@Generated
class AmazonAlexaForBusinessFunctions(val block: Block)

infix fun AwsContinuation.alexaforbusiness(init: AmazonAlexaForBusinessFunctions.() -> Unit) {
	AmazonAlexaForBusinessFunctions(shell).apply(init)
}

			

fun AmazonAlexaForBusinessFunctions.associateContactWithAddressBook(contactArn: String, addressBookArn: String, init: AmazonAlexaForBusinessAssociateContactWithAddressBookCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessAssociateContactWithAddressBookCommand(contactArn, addressBookArn).apply(init))
}

@Generated
class AmazonAlexaForBusinessAssociateContactWithAddressBookCommand(val contactArn: String, val addressBookArn: String) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.AssociateContactWithAddressBookRequest> {



	override fun build(): com.amazonaws.services.alexaforbusiness.model.AssociateContactWithAddressBookRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.AssociateContactWithAddressBookRequest()
		input.setContactArn(this.contactArn)
		input.setAddressBookArn(this.addressBookArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.associateContactWithAddressBook(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness associate-contact-with-address-book")
				.argument("contact-arn", contactArn)
				.argument("address-book-arn", addressBookArn)
	}

}


fun AmazonAlexaForBusinessFunctions.associateDeviceWithRoom(init: AmazonAlexaForBusinessAssociateDeviceWithRoomCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessAssociateDeviceWithRoomCommand().apply(init))
}

@Generated
class AmazonAlexaForBusinessAssociateDeviceWithRoomCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithRoomRequest> {

	var deviceArn: String? = null
	var roomArn: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithRoomRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithRoomRequest()
		input.setDeviceArn(this.deviceArn)
		input.setRoomArn(this.roomArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.associateDeviceWithRoom(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness associate-device-with-room")
				.argument("device-arn", deviceArn)
				.argument("room-arn", roomArn)
	}

}


fun AmazonAlexaForBusinessFunctions.associateSkillGroupWithRoom(init: AmazonAlexaForBusinessAssociateSkillGroupWithRoomCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessAssociateSkillGroupWithRoomCommand().apply(init))
}

@Generated
class AmazonAlexaForBusinessAssociateSkillGroupWithRoomCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.AssociateSkillGroupWithRoomRequest> {

	var skillGroupArn: String? = null
	var roomArn: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.AssociateSkillGroupWithRoomRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.AssociateSkillGroupWithRoomRequest()
		input.setSkillGroupArn(this.skillGroupArn)
		input.setRoomArn(this.roomArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.associateSkillGroupWithRoom(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness associate-skill-group-with-room")
				.argument("skill-group-arn", skillGroupArn)
				.argument("room-arn", roomArn)
	}

}


fun AmazonAlexaForBusinessFunctions.createAddressBook(name: String, init: AmazonAlexaForBusinessCreateAddressBookCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessCreateAddressBookCommand(name).apply(init))
}

@Generated
class AmazonAlexaForBusinessCreateAddressBookCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.CreateAddressBookRequest> {

	var description: String? = null
	var clientRequestToken: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.CreateAddressBookRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.CreateAddressBookRequest()
		input.setName(this.name)
		input.setDescription(this.description)
		input.setClientRequestToken(this.clientRequestToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.createAddressBook(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness create-address-book")
				.argument("name", name)
				.argument("description", description)
				.argument("client-request-token", clientRequestToken)
	}

}


fun AmazonAlexaForBusinessFunctions.createContact(firstName: String, phoneNumber: String, init: AmazonAlexaForBusinessCreateContactCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessCreateContactCommand(firstName, phoneNumber).apply(init))
}

@Generated
class AmazonAlexaForBusinessCreateContactCommand(val firstName: String, val phoneNumber: String) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.CreateContactRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.createContact(build())
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


fun AmazonAlexaForBusinessFunctions.createProfile(profileName: String, timezone: String, address: String, distanceUnit: DistanceUnit, temperatureUnit: TemperatureUnit, wakeWord: WakeWord, init: AmazonAlexaForBusinessCreateProfileCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessCreateProfileCommand(profileName, timezone, address, distanceUnit, temperatureUnit, wakeWord).apply(init))
}

@Generated
class AmazonAlexaForBusinessCreateProfileCommand(val profileName: String, val timezone: String, val address: String, val distanceUnit: DistanceUnit, val temperatureUnit: TemperatureUnit, val wakeWord: WakeWord) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.CreateProfileRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.createProfile(build())
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


fun AmazonAlexaForBusinessFunctions.createRoom(roomName: String, init: AmazonAlexaForBusinessCreateRoomCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessCreateRoomCommand(roomName).apply(init))
}

@Generated
class AmazonAlexaForBusinessCreateRoomCommand(val roomName: String) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.CreateRoomRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.createRoom(build())
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


fun AmazonAlexaForBusinessFunctions.createSkillGroup(skillGroupName: String, init: AmazonAlexaForBusinessCreateSkillGroupCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessCreateSkillGroupCommand(skillGroupName).apply(init))
}

@Generated
class AmazonAlexaForBusinessCreateSkillGroupCommand(val skillGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.CreateSkillGroupRequest> {

	var description: String? = null
	var clientRequestToken: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.CreateSkillGroupRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.CreateSkillGroupRequest()
		input.setSkillGroupName(this.skillGroupName)
		input.setDescription(this.description)
		input.setClientRequestToken(this.clientRequestToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.createSkillGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness create-skill-group")
				.argument("skill-group-name", skillGroupName)
				.argument("description", description)
				.argument("client-request-token", clientRequestToken)
	}

}


fun AmazonAlexaForBusinessFunctions.createUser(userId: String, init: AmazonAlexaForBusinessCreateUserCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessCreateUserCommand(userId).apply(init))
}

@Generated
class AmazonAlexaForBusinessCreateUserCommand(val userId: String) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.CreateUserRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.createUser(build())
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


fun AmazonAlexaForBusinessFunctions.deleteAddressBook(addressBookArn: String, init: AmazonAlexaForBusinessDeleteAddressBookCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessDeleteAddressBookCommand(addressBookArn).apply(init))
}

@Generated
class AmazonAlexaForBusinessDeleteAddressBookCommand(val addressBookArn: String) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.DeleteAddressBookRequest> {



	override fun build(): com.amazonaws.services.alexaforbusiness.model.DeleteAddressBookRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.DeleteAddressBookRequest()
		input.setAddressBookArn(this.addressBookArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.deleteAddressBook(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness delete-address-book")
				.argument("address-book-arn", addressBookArn)
	}

}


fun AmazonAlexaForBusinessFunctions.deleteContact(contactArn: String, init: AmazonAlexaForBusinessDeleteContactCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessDeleteContactCommand(contactArn).apply(init))
}

@Generated
class AmazonAlexaForBusinessDeleteContactCommand(val contactArn: String) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.DeleteContactRequest> {



	override fun build(): com.amazonaws.services.alexaforbusiness.model.DeleteContactRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.DeleteContactRequest()
		input.setContactArn(this.contactArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.deleteContact(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness delete-contact")
				.argument("contact-arn", contactArn)
	}

}


fun AmazonAlexaForBusinessFunctions.deleteProfile(init: AmazonAlexaForBusinessDeleteProfileCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessDeleteProfileCommand().apply(init))
}

@Generated
class AmazonAlexaForBusinessDeleteProfileCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.DeleteProfileRequest> {

	var profileArn: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.DeleteProfileRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.DeleteProfileRequest()
		input.setProfileArn(this.profileArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.deleteProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness delete-profile")
				.argument("profile-arn", profileArn)
	}

}


fun AmazonAlexaForBusinessFunctions.deleteRoom(init: AmazonAlexaForBusinessDeleteRoomCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessDeleteRoomCommand().apply(init))
}

@Generated
class AmazonAlexaForBusinessDeleteRoomCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.DeleteRoomRequest> {

	var roomArn: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.DeleteRoomRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.DeleteRoomRequest()
		input.setRoomArn(this.roomArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.deleteRoom(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness delete-room")
				.argument("room-arn", roomArn)
	}

}


fun AmazonAlexaForBusinessFunctions.deleteRoomSkillParameter(skillId: String, parameterKey: String, init: AmazonAlexaForBusinessDeleteRoomSkillParameterCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessDeleteRoomSkillParameterCommand(skillId, parameterKey).apply(init))
}

@Generated
class AmazonAlexaForBusinessDeleteRoomSkillParameterCommand(val skillId: String, val parameterKey: String) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.DeleteRoomSkillParameterRequest> {

	var roomArn: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.DeleteRoomSkillParameterRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.DeleteRoomSkillParameterRequest()
		input.setRoomArn(this.roomArn)
		input.setSkillId(this.skillId)
		input.setParameterKey(this.parameterKey)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.deleteRoomSkillParameter(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness delete-room-skill-parameter")
				.argument("room-arn", roomArn)
				.argument("skill-id", skillId)
				.argument("parameter-key", parameterKey)
	}

}


fun AmazonAlexaForBusinessFunctions.deleteSkillGroup(init: AmazonAlexaForBusinessDeleteSkillGroupCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessDeleteSkillGroupCommand().apply(init))
}

@Generated
class AmazonAlexaForBusinessDeleteSkillGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.DeleteSkillGroupRequest> {

	var skillGroupArn: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.DeleteSkillGroupRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.DeleteSkillGroupRequest()
		input.setSkillGroupArn(this.skillGroupArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.deleteSkillGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness delete-skill-group")
				.argument("skill-group-arn", skillGroupArn)
	}

}


fun AmazonAlexaForBusinessFunctions.deleteUser(enrollmentId: String, init: AmazonAlexaForBusinessDeleteUserCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessDeleteUserCommand(enrollmentId).apply(init))
}

@Generated
class AmazonAlexaForBusinessDeleteUserCommand(val enrollmentId: String) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.DeleteUserRequest> {

	var userArn: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.DeleteUserRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.DeleteUserRequest()
		input.setUserArn(this.userArn)
		input.setEnrollmentId(this.enrollmentId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.deleteUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness delete-user")
				.argument("user-arn", userArn)
				.argument("enrollment-id", enrollmentId)
	}

}


fun AmazonAlexaForBusinessFunctions.disassociateContactFromAddressBook(contactArn: String, addressBookArn: String, init: AmazonAlexaForBusinessDisassociateContactFromAddressBookCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessDisassociateContactFromAddressBookCommand(contactArn, addressBookArn).apply(init))
}

@Generated
class AmazonAlexaForBusinessDisassociateContactFromAddressBookCommand(val contactArn: String, val addressBookArn: String) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.DisassociateContactFromAddressBookRequest> {



	override fun build(): com.amazonaws.services.alexaforbusiness.model.DisassociateContactFromAddressBookRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.DisassociateContactFromAddressBookRequest()
		input.setContactArn(this.contactArn)
		input.setAddressBookArn(this.addressBookArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.disassociateContactFromAddressBook(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness disassociate-contact-from-address-book")
				.argument("contact-arn", contactArn)
				.argument("address-book-arn", addressBookArn)
	}

}


fun AmazonAlexaForBusinessFunctions.disassociateDeviceFromRoom(init: AmazonAlexaForBusinessDisassociateDeviceFromRoomCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessDisassociateDeviceFromRoomCommand().apply(init))
}

@Generated
class AmazonAlexaForBusinessDisassociateDeviceFromRoomCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.DisassociateDeviceFromRoomRequest> {

	var deviceArn: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.DisassociateDeviceFromRoomRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.DisassociateDeviceFromRoomRequest()
		input.setDeviceArn(this.deviceArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.disassociateDeviceFromRoom(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness disassociate-device-from-room")
				.argument("device-arn", deviceArn)
	}

}


fun AmazonAlexaForBusinessFunctions.disassociateSkillGroupFromRoom(init: AmazonAlexaForBusinessDisassociateSkillGroupFromRoomCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessDisassociateSkillGroupFromRoomCommand().apply(init))
}

@Generated
class AmazonAlexaForBusinessDisassociateSkillGroupFromRoomCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.DisassociateSkillGroupFromRoomRequest> {

	var skillGroupArn: String? = null
	var roomArn: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.DisassociateSkillGroupFromRoomRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.DisassociateSkillGroupFromRoomRequest()
		input.setSkillGroupArn(this.skillGroupArn)
		input.setRoomArn(this.roomArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.disassociateSkillGroupFromRoom(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness disassociate-skill-group-from-room")
				.argument("skill-group-arn", skillGroupArn)
				.argument("room-arn", roomArn)
	}

}


fun AmazonAlexaForBusinessFunctions.getAddressBook(addressBookArn: String, init: AmazonAlexaForBusinessGetAddressBookCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessGetAddressBookCommand(addressBookArn).apply(init))
}

@Generated
class AmazonAlexaForBusinessGetAddressBookCommand(val addressBookArn: String) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.GetAddressBookRequest> {



	override fun build(): com.amazonaws.services.alexaforbusiness.model.GetAddressBookRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.GetAddressBookRequest()
		input.setAddressBookArn(this.addressBookArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.getAddressBook(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness get-address-book")
				.argument("address-book-arn", addressBookArn)
	}

}


fun AmazonAlexaForBusinessFunctions.getContact(contactArn: String, init: AmazonAlexaForBusinessGetContactCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessGetContactCommand(contactArn).apply(init))
}

@Generated
class AmazonAlexaForBusinessGetContactCommand(val contactArn: String) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.GetContactRequest> {



	override fun build(): com.amazonaws.services.alexaforbusiness.model.GetContactRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.GetContactRequest()
		input.setContactArn(this.contactArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.getContact(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness get-contact")
				.argument("contact-arn", contactArn)
	}

}


fun AmazonAlexaForBusinessFunctions.getDevice(init: AmazonAlexaForBusinessGetDeviceCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessGetDeviceCommand().apply(init))
}

@Generated
class AmazonAlexaForBusinessGetDeviceCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.GetDeviceRequest> {

	var deviceArn: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.GetDeviceRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.GetDeviceRequest()
		input.setDeviceArn(this.deviceArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.getDevice(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness get-device")
				.argument("device-arn", deviceArn)
	}

}


fun AmazonAlexaForBusinessFunctions.getProfile(init: AmazonAlexaForBusinessGetProfileCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessGetProfileCommand().apply(init))
}

@Generated
class AmazonAlexaForBusinessGetProfileCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.GetProfileRequest> {

	var profileArn: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.GetProfileRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.GetProfileRequest()
		input.setProfileArn(this.profileArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.getProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness get-profile")
				.argument("profile-arn", profileArn)
	}

}


fun AmazonAlexaForBusinessFunctions.getRoom(init: AmazonAlexaForBusinessGetRoomCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessGetRoomCommand().apply(init))
}

@Generated
class AmazonAlexaForBusinessGetRoomCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.GetRoomRequest> {

	var roomArn: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.GetRoomRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.GetRoomRequest()
		input.setRoomArn(this.roomArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.getRoom(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness get-room")
				.argument("room-arn", roomArn)
	}

}


fun AmazonAlexaForBusinessFunctions.getRoomSkillParameter(skillId: String, parameterKey: String, init: AmazonAlexaForBusinessGetRoomSkillParameterCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessGetRoomSkillParameterCommand(skillId, parameterKey).apply(init))
}

@Generated
class AmazonAlexaForBusinessGetRoomSkillParameterCommand(val skillId: String, val parameterKey: String) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.GetRoomSkillParameterRequest> {

	var roomArn: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.GetRoomSkillParameterRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.GetRoomSkillParameterRequest()
		input.setRoomArn(this.roomArn)
		input.setSkillId(this.skillId)
		input.setParameterKey(this.parameterKey)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.getRoomSkillParameter(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness get-room-skill-parameter")
				.argument("room-arn", roomArn)
				.argument("skill-id", skillId)
				.argument("parameter-key", parameterKey)
	}

}


fun AmazonAlexaForBusinessFunctions.getSkillGroup(init: AmazonAlexaForBusinessGetSkillGroupCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessGetSkillGroupCommand().apply(init))
}

@Generated
class AmazonAlexaForBusinessGetSkillGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.GetSkillGroupRequest> {

	var skillGroupArn: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.GetSkillGroupRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.GetSkillGroupRequest()
		input.setSkillGroupArn(this.skillGroupArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.getSkillGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness get-skill-group")
				.argument("skill-group-arn", skillGroupArn)
	}

}


fun AmazonAlexaForBusinessFunctions.listSkills(init: AmazonAlexaForBusinessListSkillsCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessListSkillsCommand().apply(init))
}

@Generated
class AmazonAlexaForBusinessListSkillsCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.ListSkillsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.listSkills(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness list-skills")
				.argument("skill-group-arn", skillGroupArn)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonAlexaForBusinessFunctions.listTags(arn: String, init: AmazonAlexaForBusinessListTagsCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessListTagsCommand(arn).apply(init))
}

@Generated
class AmazonAlexaForBusinessListTagsCommand(val arn: String) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.ListTagsRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.alexaforbusiness.model.ListTagsRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.ListTagsRequest()
		input.setArn(this.arn)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.listTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness list-tags")
				.argument("arn", arn)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonAlexaForBusinessFunctions.putRoomSkillParameter(skillId: String, roomSkillParameter: com.amazonaws.services.alexaforbusiness.model.RoomSkillParameter, init: AmazonAlexaForBusinessPutRoomSkillParameterCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessPutRoomSkillParameterCommand(skillId, roomSkillParameter).apply(init))
}

@Generated
class AmazonAlexaForBusinessPutRoomSkillParameterCommand(val skillId: String, val roomSkillParameter: com.amazonaws.services.alexaforbusiness.model.RoomSkillParameter) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.PutRoomSkillParameterRequest> {

	var roomArn: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.PutRoomSkillParameterRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.PutRoomSkillParameterRequest()
		input.setRoomArn(this.roomArn)
		input.setSkillId(this.skillId)
		input.setRoomSkillParameter(this.roomSkillParameter)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.putRoomSkillParameter(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness put-room-skill-parameter")
				.argument("room-arn", roomArn)
				.argument("skill-id", skillId)
				.argument("room-skill-parameter", roomSkillParameter.toString())
	}

}


fun AmazonAlexaForBusinessFunctions.resolveRoom(userId: String, skillId: String, init: AmazonAlexaForBusinessResolveRoomCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessResolveRoomCommand(userId, skillId).apply(init))
}

@Generated
class AmazonAlexaForBusinessResolveRoomCommand(val userId: String, val skillId: String) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.ResolveRoomRequest> {



	override fun build(): com.amazonaws.services.alexaforbusiness.model.ResolveRoomRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.ResolveRoomRequest()
		input.setUserId(this.userId)
		input.setSkillId(this.skillId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.resolveRoom(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness resolve-room")
				.argument("user-id", userId)
				.argument("skill-id", skillId)
	}

}


fun AmazonAlexaForBusinessFunctions.revokeInvitation(init: AmazonAlexaForBusinessRevokeInvitationCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessRevokeInvitationCommand().apply(init))
}

@Generated
class AmazonAlexaForBusinessRevokeInvitationCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.RevokeInvitationRequest> {

	var userArn: String? = null
	var enrollmentId: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.RevokeInvitationRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.RevokeInvitationRequest()
		input.setUserArn(this.userArn)
		input.setEnrollmentId(this.enrollmentId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.revokeInvitation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness revoke-invitation")
				.argument("user-arn", userArn)
				.argument("enrollment-id", enrollmentId)
	}

}


fun AmazonAlexaForBusinessFunctions.searchAddressBooks(init: AmazonAlexaForBusinessSearchAddressBooksCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessSearchAddressBooksCommand().apply(init))
}

@Generated
class AmazonAlexaForBusinessSearchAddressBooksCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.SearchAddressBooksRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.searchAddressBooks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness search-address-books")
				.argument("filters", filters?.toString())
				.argument("sort-criteria", sortCriteria?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonAlexaForBusinessFunctions.searchContacts(init: AmazonAlexaForBusinessSearchContactsCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessSearchContactsCommand().apply(init))
}

@Generated
class AmazonAlexaForBusinessSearchContactsCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.SearchContactsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.searchContacts(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness search-contacts")
				.argument("filters", filters?.toString())
				.argument("sort-criteria", sortCriteria?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonAlexaForBusinessFunctions.searchDevices(init: AmazonAlexaForBusinessSearchDevicesCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessSearchDevicesCommand().apply(init))
}

@Generated
class AmazonAlexaForBusinessSearchDevicesCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.SearchDevicesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.searchDevices(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness search-devices")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("filters", filters?.toString())
				.argument("sort-criteria", sortCriteria?.toString())
	}

}


fun AmazonAlexaForBusinessFunctions.searchProfiles(init: AmazonAlexaForBusinessSearchProfilesCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessSearchProfilesCommand().apply(init))
}

@Generated
class AmazonAlexaForBusinessSearchProfilesCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.SearchProfilesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.searchProfiles(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness search-profiles")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("filters", filters?.toString())
				.argument("sort-criteria", sortCriteria?.toString())
	}

}


fun AmazonAlexaForBusinessFunctions.searchRooms(init: AmazonAlexaForBusinessSearchRoomsCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessSearchRoomsCommand().apply(init))
}

@Generated
class AmazonAlexaForBusinessSearchRoomsCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.SearchRoomsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.searchRooms(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness search-rooms")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("filters", filters?.toString())
				.argument("sort-criteria", sortCriteria?.toString())
	}

}


fun AmazonAlexaForBusinessFunctions.searchSkillGroups(init: AmazonAlexaForBusinessSearchSkillGroupsCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessSearchSkillGroupsCommand().apply(init))
}

@Generated
class AmazonAlexaForBusinessSearchSkillGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.SearchSkillGroupsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.searchSkillGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness search-skill-groups")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("filters", filters?.toString())
				.argument("sort-criteria", sortCriteria?.toString())
	}

}


fun AmazonAlexaForBusinessFunctions.searchUsers(init: AmazonAlexaForBusinessSearchUsersCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessSearchUsersCommand().apply(init))
}

@Generated
class AmazonAlexaForBusinessSearchUsersCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.SearchUsersRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.searchUsers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness search-users")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("filters", filters?.toString())
				.argument("sort-criteria", sortCriteria?.toString())
	}

}


fun AmazonAlexaForBusinessFunctions.sendInvitation(init: AmazonAlexaForBusinessSendInvitationCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessSendInvitationCommand().apply(init))
}

@Generated
class AmazonAlexaForBusinessSendInvitationCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.SendInvitationRequest> {

	var userArn: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.SendInvitationRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.SendInvitationRequest()
		input.setUserArn(this.userArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.sendInvitation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness send-invitation")
				.argument("user-arn", userArn)
	}

}


fun AmazonAlexaForBusinessFunctions.startDeviceSync(features: List<Feature>, init: AmazonAlexaForBusinessStartDeviceSyncCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessStartDeviceSyncCommand(features).apply(init))
}

@Generated
class AmazonAlexaForBusinessStartDeviceSyncCommand(val features: List<Feature>) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.StartDeviceSyncRequest> {

	var roomArn: String? = null
	var deviceArn: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.StartDeviceSyncRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.StartDeviceSyncRequest()
		input.setRoomArn(this.roomArn)
		input.setDeviceArn(this.deviceArn)
		input.setFeatures(this.features.map { it.toString() })
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.startDeviceSync(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness start-device-sync")
				.argument("room-arn", roomArn)
				.argument("device-arn", deviceArn)
				.argument("features", features.toString())
	}

}


fun AmazonAlexaForBusinessFunctions.tagResource(arn: String, tags: List<com.amazonaws.services.alexaforbusiness.model.Tag>, init: AmazonAlexaForBusinessTagResourceCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessTagResourceCommand(arn, tags).apply(init))
}

@Generated
class AmazonAlexaForBusinessTagResourceCommand(val arn: String, val tags: List<com.amazonaws.services.alexaforbusiness.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.TagResourceRequest> {



	override fun build(): com.amazonaws.services.alexaforbusiness.model.TagResourceRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.TagResourceRequest()
		input.setArn(this.arn)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.tagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness tag-resource")
				.argument("arn", arn)
				.argument("tags", tags.toString())
	}

}


fun AmazonAlexaForBusinessFunctions.untagResource(arn: String, tagKeys: List<String>, init: AmazonAlexaForBusinessUntagResourceCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessUntagResourceCommand(arn, tagKeys).apply(init))
}

@Generated
class AmazonAlexaForBusinessUntagResourceCommand(val arn: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.UntagResourceRequest> {



	override fun build(): com.amazonaws.services.alexaforbusiness.model.UntagResourceRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.UntagResourceRequest()
		input.setArn(this.arn)
		input.setTagKeys(this.tagKeys)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.untagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness untag-resource")
				.argument("arn", arn)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AmazonAlexaForBusinessFunctions.updateAddressBook(addressBookArn: String, init: AmazonAlexaForBusinessUpdateAddressBookCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessUpdateAddressBookCommand(addressBookArn).apply(init))
}

@Generated
class AmazonAlexaForBusinessUpdateAddressBookCommand(val addressBookArn: String) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.UpdateAddressBookRequest> {

	var name: String? = null
	var description: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.UpdateAddressBookRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.UpdateAddressBookRequest()
		input.setAddressBookArn(this.addressBookArn)
		input.setName(this.name)
		input.setDescription(this.description)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.updateAddressBook(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness update-address-book")
				.argument("address-book-arn", addressBookArn)
				.argument("name", name)
				.argument("description", description)
	}

}


fun AmazonAlexaForBusinessFunctions.updateContact(contactArn: String, init: AmazonAlexaForBusinessUpdateContactCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessUpdateContactCommand(contactArn).apply(init))
}

@Generated
class AmazonAlexaForBusinessUpdateContactCommand(val contactArn: String) : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.UpdateContactRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.updateContact(build())
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


fun AmazonAlexaForBusinessFunctions.updateDevice(init: AmazonAlexaForBusinessUpdateDeviceCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessUpdateDeviceCommand().apply(init))
}

@Generated
class AmazonAlexaForBusinessUpdateDeviceCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.UpdateDeviceRequest> {

	var deviceArn: String? = null
	var deviceName: String? = null

	override fun build(): com.amazonaws.services.alexaforbusiness.model.UpdateDeviceRequest {
		val input = com.amazonaws.services.alexaforbusiness.model.UpdateDeviceRequest()
		input.setDeviceArn(this.deviceArn)
		input.setDeviceName(this.deviceName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.updateDevice(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness update-device")
				.argument("device-arn", deviceArn)
				.argument("device-name", deviceName)
	}

}


fun AmazonAlexaForBusinessFunctions.updateProfile(init: AmazonAlexaForBusinessUpdateProfileCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessUpdateProfileCommand().apply(init))
}

@Generated
class AmazonAlexaForBusinessUpdateProfileCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.UpdateProfileRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.updateProfile(build())
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


fun AmazonAlexaForBusinessFunctions.updateRoom(init: AmazonAlexaForBusinessUpdateRoomCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessUpdateRoomCommand().apply(init))
}

@Generated
class AmazonAlexaForBusinessUpdateRoomCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.UpdateRoomRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.updateRoom(build())
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


fun AmazonAlexaForBusinessFunctions.updateSkillGroup(init: AmazonAlexaForBusinessUpdateSkillGroupCommand.() -> Unit) {
	this.block.declare(AmazonAlexaForBusinessUpdateSkillGroupCommand().apply(init))
}

@Generated
class AmazonAlexaForBusinessUpdateSkillGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.alexaforbusiness.model.UpdateSkillGroupRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.alexaforbusiness.updateSkillGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws alexaforbusiness update-skill-group")
				.argument("skill-group-arn", skillGroupArn)
				.argument("skill-group-name", skillGroupName)
				.argument("description", description)
	}

}
