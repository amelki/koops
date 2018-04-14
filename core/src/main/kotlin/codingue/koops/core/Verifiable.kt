package codingue.koops.core

interface Verifiable<out T> {
	infix fun verifies(f: T.() -> Boolean)
}

