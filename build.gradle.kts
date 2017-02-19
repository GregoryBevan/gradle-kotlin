val kotlin_version = "1.1-M04"

buildscript {
	repositories { gradleScriptKotlin() }
	dependencies {
		classpath(kotlinModule("gradle-plugin", "1.1-M04"))
	}
}


subprojects() {

	apply {
		plugin("kotlin")
	}

	repositories {
		gradleScriptKotlin()
	}

	dependencies {
		compile(kotlinModule("stdlib", kotlin_version))
		testCompile("junit:junit:4.11")
		testCompile("org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version")
	}

}
