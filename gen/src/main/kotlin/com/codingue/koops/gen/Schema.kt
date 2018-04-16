package com.codingue.koops.gen

data class Schema(val version: String? = null,
									val metadata: Map<String, String>,
									val operations: Map<String, Operation>,
									val shapes: Map<String, Shape>,
									val documentation: String? = null,
									val examples: Example? = null)

// empty
class Example

data class Http(val method: String = "",
								val requestUri: String = "",
								val responseCode: Int = 0)


data class Operation(val output: Ref? = null,
										 val input: Ref? = null,
										 val documentation: String? = null,
										 val name: String,
										 val authtype: String? = null,
										 val http: Http,
										 val deprecated: Boolean? = false,
										 val idempotent: Boolean = false,
										 val errors: List<Ref>?)

enum class Type {
	map, string, structure, list, integer, blob, boolean, timestamp, long, double, float, void
}

data class Shape(val type: Type,
								 val required: List<String>? = null,
								 val members: Map<String, Member>? = null,
								 val documentation: String? = null,
								 val max: Long? = 0,
								 val min: Long? = 0,
								 val pattern: String? = null,
								 val payload: String? = null,
								 val locationName: String? = null,
								 val sensitive: Boolean? = false,
								 val exception: Boolean? = false,
								 val deprecated: Boolean? = false,
								 val flattened: Boolean? = false,
								 val enum: List<String>? = null,
								 val xmlOrder: List<String>? = null,
								 val member: Ref? = null,
								 val key: Ref? = null,
								 val value: Ref? = null,
								 val streaming: Boolean = false,
								 val box: Boolean = false,
								 val wrapper: Boolean = false,
								 val error: Error? = null,
								 val fault: Boolean = false)

data class Member(val shape: String,
									val documentation: String? = null,
									val location: String? = null,
									val locationName: String? = null,
									val idempotencyToken: String? = null,
									val queryName: String? = null,
									val xmlNamespace: XmlNamespace? = null,
									val deprecated: Boolean = false,
									val flattened: Boolean = false,
									val jsonvalue: Boolean = false,
									val box: Boolean = false)

data class Error(val httpStatusCode: Int? = 0,
								 val senderFault: Boolean? = false,
								 val code: String? = null)

data class Ref(val shape: String,
							 val resultWrapper: String? = null,
							 val locationName: String? = null,
							 val exception: Boolean? = false,
							 val fault: Boolean? = false,
							 val jsonvalue: Boolean? = false,
							 val error: Error? = null,
							 val xmlNamespace: XmlNamespace? = null,
							 val documentation: String? = null)

data class XmlNamespace(val uri: String? = null)