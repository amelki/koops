package com.codingue.koops.core

fun env(init: Environment.() -> Unit): Environment {
	return Environment().apply(init)
}

fun script(environment: Environment, init: Block.() -> Unit): Block {
	return Block(environment).applyInit(environment, init)
}

fun script(block: Block.() -> Unit): Block {
	return script(Environment(), block)
}

fun deferred(init: Block.() -> Unit): Deferred {
	return Deferred(init)
}

