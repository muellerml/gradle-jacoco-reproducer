plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "gradle-jacoco-reproducer"

include("subproject-a")
include("subproject-b")

