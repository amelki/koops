package com.codingue.koops.core

import java.io.File

@CliMarker
class SystemContinuation(private val block: Script) {

	infix fun cd(directory: String) = block.declare({
		setCurrentDirectory(directory)
	}, {
		println("cd $directory")
	})

}

val Script.system: SystemContinuation
	get() {
		return SystemContinuation(this)
	}

fun Script.system(init: SystemContinuation.() -> Unit) {
	SystemContinuation(this).apply(init)
}

private fun setCurrentDirectory(directory_name: String): Boolean {
	var result = false  // Boolean indicating whether directory was set
	val directory: File = File(directory_name).absoluteFile       // Desired current working directory
	if (directory.exists() || directory.mkdirs()) {
		result = System.setProperty("user.dir", directory.absolutePath) != null
	}
	return result
}
