plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.serialization)
    `maven-publish`
}

kotlin {
    androidTarget()
    jvm("desktop")
    iosX64()
    iosArm64()
    iosSimulatorArm64()
    js(IR) { browser() }
    wasmJs { browser() }

    sourceSets {
        commonMain.dependencies {
            implementation(project(":shared:importexport:core"))
            implementation(libs.kotlinx.serialization.json)
        }
    }
}

android {
    namespace = "com.form.importexport.json"
    compileSdk = 35
    defaultConfig { minSdk = 24 }
}
