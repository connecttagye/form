plugins {
    alias(libs.plugins.kotlin.multiplatform) apply false
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.serialization) apply false
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.compose.multiplatform) apply false
    alias(libs.plugins.compose.compiler) apply false
    alias(libs.plugins.sqldelight) apply false
}

allprojects {
    group = providers.gradleProperty("GROUP").getOrElse("com.form")
    version = providers.gradleProperty("VERSION_NAME").getOrElse("1.0.0")
}

subprojects {
    if (project.path.startsWith(":shared:")) {
        plugins.withId("maven-publish") {
            extensions.configure<PublishingExtension> {
                repositories {
                    maven {
                        name = "GitHubPackages"
                        url = uri("https://maven.pkg.github.com/connecttagye/form")
                        credentials {
                            username = System.getenv("GITHUB_ACTOR") ?: ""
                            password = System.getenv("GITHUB_TOKEN") ?: ""
                        }
                    }
                }
            }
        }
    }
}
