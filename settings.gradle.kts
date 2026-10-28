
pluginManagement {
    repositories {
        // 阿里云镜像：优先加速插件下载
//        maven("https://maven.aliyun.com/repository/gradle-plugin")
//        maven("https://maven.aliyun.com/repository/google")
//        maven("https://maven.aliyun.com/repository/public")

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
        // 阿里云镜像：优先加速 Android 和普通依赖下载
//        maven("https://maven.aliyun.com/repository/google")
//        maven("https://maven.aliyun.com/repository/public")

        google()
        mavenCentral()
    }
}

rootProject.name = "SiteCam"
include(":app")
