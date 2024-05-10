pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
//        maven {
//            url = uri("https://your.maven.repo.url")
//            // 변수 참조
//            val authToken: String by settings.extra
//            val userName: String by settings.extra
//
//            credentials {
//                username = authToken
//                password = userName
//            }
//        }
    }
}

rootProject.name = "logs"
include(":app")
include(":logs")
