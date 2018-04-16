package com.codingue.koops.core

import java.io.File
import java.nio.file.Paths

open class Environment(var dryRun: Boolean = false) {
	val capabilities = HashMap<String, Any>()
	var workingDir: String? = null
	var progress = true
	var maxColumns = 120

	fun resolvedWorkingDir(): File {
		if (workingDir != null) {
			if (workingDir!!.startsWith("~")) {
				return File(System.getProperty("user.home") + workingDir!!.substring(1))
			}
			return File(workingDir)
		} else {
			val currentRelativePath = Paths.get("")
			val s = currentRelativePath.toAbsolutePath().toString()
			return File(s)
		}
	}

	fun resolvePath(path: String): File {
		val file = File(path)
		if (!file.isAbsolute) {
			return resolvedWorkingDir().resolve(path)
		}
		return File(path)
	}

}

