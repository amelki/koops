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
fun print(init: Print.() -> Unit): Print {
	return Print(Environment()).apply(init)
}

fun print(environment: Environment, init: Print.() -> Unit): Print {
	return Print(environment).apply(init)
}

fun Block.print(init: Print.() -> Unit) {
	return Print(environment).run(init)
}

fun deferred(init: Block.() -> Unit): Deferred {
	return Deferred(init)
}

fun log(init: Block.() -> Unit): Block {
	return Print(Environment()).apply({ jsonCommandResults(init) })
}

fun log(environment: Environment, init: Block.() -> Unit): Block {
	return Print(environment).apply({ jsonCommandResults(init) })
}
