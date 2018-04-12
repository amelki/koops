package codingue.koops.core

fun block(environment: Environment, block: Block.() -> Unit): Block {
	return Block(environment).apply(block)
}

fun block(block: Block.() -> Unit): Block {
	return block(Environment(), block)
}

fun pretty(init: Pretty.() -> Unit): Pretty {
	return Pretty(Environment()).apply(init)
}

fun deferred(init: Block.() -> Unit): Deferred {
	return Deferred(init)
}
