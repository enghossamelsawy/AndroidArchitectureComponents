object CoreVersion {
    const val KOTLIN = "1.3.72"
    const val NAVIGATION = "2.3.0-alpha04"
    const val ANDROID_GRADLE = "3.6.3"
    const val KTLINT_GRADLE = "9.2.1"
    const val KTLINT = "0.34.2"
    const val DETEKT = "1.0.0"
}

object GradlePluginId {
    const val ANDROID_APP = "com.android.application"
    const val ANDROID_LIB = "com.android.library"
    const val ANDROID = "kotlin-android"
    const val ANDROID_EXT = "kotlin-android-extensions"
    const val SAFE_ARGS = "androidx.navigation.safeargs"
    const val BASE_GRADLE_PLUGIN = "base-gradle-plugin"
    const val KTLINT_GRADLE = "org.jlleitschuh.gradle.ktlint"
    const val KTLINT_MAVEN = "https://plugins.gradle.org/m2/"
    const val DETEKT = "io.gitlab.arturbosch.detekt"


    const val ANDROID_APPLICATION = "com.android.application"
    const val ANDROID_DYNAMIC_FEATURE = "com.android.dynamic-feature"
    const val ANDROID_LIBRARY = "com.android.library"
    const val KOTLIN_JVM = "org.jetbrains.kotlin.jvm"
    const val KOTLIN_ANDROID = "org.jetbrains.kotlin.android"
    const val KOTLIN_ANDROID_EXTENSIONS = "org.jetbrains.kotlin.android.extensions"
    const val GRADLE_VERSION_PLUGIN = "com.github.ben-manes.versions"

}

object GradleClasspath {
    const val KOTLIN_PlUGIN = "gradle-plugin"
    const val ANDROID_GRADLE = "com.android.tools.build:gradle:${CoreVersion.ANDROID_GRADLE}"
    const val SAFE_ARGS =
        "androidx.navigation:navigation-safe-args-gradle-plugin:${CoreVersion.NAVIGATION}"
    const val KTLINT_CLASSPATH = "org.jlleitschuh.gradle:ktlint-gradle:${CoreVersion.KTLINT_GRADLE}"
}

object GradlePluginVersion {
    const val ANDROID_GRADLE = "3.6.3"
    const val KTLINT_GRADLE = "9.2.1"
    const val DETEKT = "1.9.1"
    const val GRADLE_VERSION_PLUGIN = "0.22.0"
    const val KOTLIN = CoreVersion.KOTLIN
    const val SAFE_ARGS = CoreVersion.NAVIGATION
}


object GradleOldWayPlugins {
    const val ANDROID_GRADLE =
        "com.android.tools.build:gradle:${GradlePluginVersion.ANDROID_GRADLE}"
    const val SAFE_ARGS =
        "androidx.navigation:navigation-safe-args-gradle-plugin:${GradlePluginVersion.SAFE_ARGS}"
}
