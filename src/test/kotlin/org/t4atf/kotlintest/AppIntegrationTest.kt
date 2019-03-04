package org.t4atf.kotlintest

import io.kotlintest.Description
import io.kotlintest.Spec
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class AppIntegrationTest : StringSpec() {
	override fun beforeSpec(description: Description, spec: Spec) {
		App.threadLocal.set("test")
	}

	init {
		"greetings".config(threads = 1) {
			App().greeting shouldBe "test"
		}
	}
}