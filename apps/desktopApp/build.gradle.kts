import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.compose.compiler)
}

kotlin {
    jvm()
    sourceSets {
        val jvmMain by getting {
            dependencies {
                implementation(project(":shared:core:ui"))
                implementation(project(":shared:core:di"))
                implementation(project(":shared:core:common"))
                implementation(project(":shared:core:log"))
                implementation(compose.desktop.currentOs)
                implementation(libs.koin.core)
            }
        }
    }
}

compose.desktop {
    application {
        mainClass = "com.form.desktop.MainKt"
        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "Form"
            packageVersion = "1.0.0"
        }
    }
}
