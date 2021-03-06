package com.codingue.koops.aws

import com.codingue.koops.core.Script
import com.codingue.koops.core.CliMarker
import com.codingue.koops.core.Command
import com.amazonaws.AmazonWebServiceRequest

//class AwsEnvironment(val s3: AmazonS3, val lambda: AWSLambda): Environment()

@CliMarker
interface AmazonWebServiceCommand<out T : AmazonWebServiceRequest, out R: Any>: Command<R> {
	fun build(): T
	fun dryResult(): R
	override fun dryRun(): R {
		println(descriptor())
		return dryResult()
	}

	override fun commandName() = "aws"

	override fun description(): String? {
		return descriptor().toString()
	}

	fun descriptor(): AmazonWebServiceDescriptor
}

@CliMarker
interface AmazonWebServiceVoidCommand<out T : AmazonWebServiceRequest>: Command<Unit> {
	fun build(): T
	override fun dryRun() {
		println(descriptor())
	}

	override fun commandName() = "aws"

	override fun description(): String? {
		return descriptor().toString()
	}

	fun descriptor(): AmazonWebServiceDescriptor
}

interface Argument
class KeyValue(val name: String, val value: String): Argument {
	override fun toString(): String = "--$name $value"
}

class Option(private val name: String, private val value: Boolean): Argument {
	override fun toString(): String = if (value) "--$name" else "--no-$name"
}

class AmazonWebServiceDescriptor(val serviceName: String) {
	private val arguments = mutableListOf<Argument>()

	fun argument(name: String, value: String?): AmazonWebServiceDescriptor {
		if (value != null && value.isNotEmpty()) {
			arguments.add(KeyValue(name, value))
		}
		return this
	}

	fun option(name: String, value: Boolean): AmazonWebServiceDescriptor {
		arguments.add(Option(name, value))
		return this
	}

	override fun toString(): String {
		return arguments.map { it.toString() }.joinToString(" ", "$serviceName ")
	}

}

@CliMarker
class AwsContinuation(val shell: Script)

val Script.aws: AwsContinuation
	get() {
		return AwsContinuation(this)
	}
