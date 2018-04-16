package com.codingue.koops.core

open class CommandException(val command: Command<*>, message: String? = null, t: Throwable? = null): Exception(message, t)

class VerificationException(command: Command<*>, message: String): CommandException(command, message)
