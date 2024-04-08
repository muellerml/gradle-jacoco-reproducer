plugins {
    kotlin("jvm") version "1.9.23"
    id("jacoco-report-aggregation")
    id("com.autonomousapps.dependency-analysis") version "1.31.0"
}

group = "de.muellerml"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    jacocoAggregation(project(":subproject-a"))
    jacocoAggregation(project(":subproject-b"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}
