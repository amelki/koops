package codingue.koops.common

import java.io.File
import java.io.InputStream
import java.util.ArrayList
import java.util.zip.ZipEntry
import java.util.zip.ZipInputStream

inline fun <T> T.applyIf(condition: Boolean, block: T.() -> Unit): T {
	if (condition) {
		return apply { block() }
	}
	return this
}

inline fun <T> T.applyUnless(condition: Boolean, block: T.() -> Unit): T {
	return applyIf(!condition, block)
}

inline fun <T> T.applyIfNotNull(any: Any?, block: T.() -> Unit): T {
	return applyIf(any != null, block)
}

inline fun <T> T.applyIfNull(any: Any?, block: T.() -> Unit): T {
	return applyIf(any == null, block)
}


/**
 * Apply the given block to each zip entry of the stream
 * If the stop function is invoked inside the block, stop processing entries and return
 * The stream is closed after returning
 */
fun ZipInputStream.forEachEntry(filter: Regex? = null, block: (entry: ZipEntry, stream: InputStream, stop: () -> Unit) -> Unit) {
	use {
		var entry: ZipEntry? = null
		while ({ entry = this.nextEntry; entry }() != null) {
			try {
				var stopped = false
				if (filter == null || filter.matches(entry!!.name)) {
					block(entry as ZipEntry, this, { stopped = true })
					if (stopped) {
						return
					}
				}
			} finally {
				this.closeEntry()
			}
		}
	}
}

/**
 * Get the entries contained in the given zip input stream.
 * The stream is closed after returning
 */
fun ZipInputStream.listEntries(filter: Regex? = null): List<String> {
	use {
		val result = ArrayList<String>()
		it.forEachEntry { entry, _, _ ->
			if (filter == null || filter.matches(entry.name)) {
				result.add(entry.name)
			}
		}
		return result
	}
}

fun InputStream.toFile(path: String) {
	File(path).outputStream().use { copyTo(it) }
}

