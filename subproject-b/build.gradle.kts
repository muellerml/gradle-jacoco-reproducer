plugins {
    kotlin("jvm") version "1.9.23"
    `jvm-test-suite`
}
testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            useJUnitJupiter()
        }
    }
}
