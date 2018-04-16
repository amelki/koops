package com.codingue.koops.core

fun env(init: Environment.() -> Unit): Environment {
	return Environment().apply(init)
}

fun script(environment: Environment, init: Script.() -> Unit): Script {
	return Script(environment).applyInit(environment, init)
}

fun script(block: Script.() -> Unit): Script {
	return script(Environment(), block)
}

fun deferred(init: Script.() -> Unit): Deferred {
	return Deferred(init)
}

