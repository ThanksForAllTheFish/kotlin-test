package org.t4atf.kotlintest

class App {
	companion object {
		val threadLocal: ThreadLocal<String> = ThreadLocal()
	}

	val greeting: String
		get() {
			return threadLocal.get()
		}
}