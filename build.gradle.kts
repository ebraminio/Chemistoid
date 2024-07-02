plugins {
    alias(libs.plugins.kotlin)
    alias(libs.plugins.ktor)
}

group = "org.wikimedia.chemistoid"
version = "0.0.1"

application {
    mainClass.set("org.wikimedia.chemistoid.ApplicationKt")

    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.cdk)
    implementation(libs.ktor.jvm)
    implementation(libs.ktor.netty)
    implementation(libs.logback)
    testImplementation(libs.ktor.tests)
    testImplementation(kotlin("test"))
}
