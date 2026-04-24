rootProject.name = "Form"

pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

include(":apps:androidApp")
include(":apps:desktopApp")
include(":apps:iosApp")
include(":apps:webApp")
include(":server")
include(":shared:core:common")
include(":shared:core:ui")
include(":shared:core:log")
include(":shared:core:di")
include(":shared:api:contract")
include(":shared:network:http")
include(":shared:network:api")
include(":shared:storage:db")
include(":shared:storage:settings")
include(":shared:util:text")
include(":shared:importexport:core")
include(":shared:importexport:json")
include(":shared:platform:device")
include(":shared:platform:files")
include(":shared:platform:messaging")
