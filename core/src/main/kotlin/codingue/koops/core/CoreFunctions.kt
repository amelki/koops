package codingue.koops.core

fun env(init: Environment.() -> Unit): Environment {
	return Environment().apply(init)
}

fun block(environment: Environment, block: Block.() -> Unit): Block {
	return Block(environment).apply(block)
}

fun block(block: Block.() -> Unit): Block {
	return block(Environment(), block)
}

/**
 * Prints the result of the commands declared in the given init block
 */
fun pretty(init: Pretty.() -> Unit): Pretty {
	return Pretty(Environment()).apply(init)
}

fun pretty(environment: Environment, init: Pretty.() -> Unit): Pretty {
	return Pretty(environment).apply(init)
}

fun Block.pretty(init: Pretty.() -> Unit) {
	return Pretty(environment).run(init)
}

fun deferred(init: Block.() -> Unit): Deferred {
	return Deferred(init)
}

fun log(init: Block.() -> Unit): Block {
	return Pretty(Environment()).apply({ jsonCommandResults(init) })
}

fun log(environment: Environment, init: Block.() -> Unit): Block {
	return Pretty(environment).apply({ jsonCommandResults(init) })
}
