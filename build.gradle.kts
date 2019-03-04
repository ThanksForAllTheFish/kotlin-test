
plugins {
	val kotlinVersion = "1.3.21"
	kotlin("jvm") version kotlinVersion
}

repositories {
	jcenter()
}

dependencies {
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

	testImplementation("io.kotlintest:kotlintest-runner-junit5:3.3+")
}
