import AndroidConfig.ID
import AndroidConfig.MIN_SDK_VERSION
import AndroidConfig.TARGET_SDK_VERSION
import AndroidConfig.VERSION_CODE
import AndroidConfig.VERSION_NAME

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
}

android {
    compileSdkVersion(AndroidConfig.COMPILE_SDK_VERSION)
    buildToolsVersion = "29.0.3"

    defaultConfig {
        applicationId = ID
        minSdkVersion(MIN_SDK_VERSION)
        targetSdkVersion(TARGET_SDK_VERSION)
        versionCode = VERSION_CODE
        versionName = VERSION_NAME

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        getByName("debug") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

}

dependencies {
    implementation(fileTree("dir" to "libs", "include" to listOf("*.jar")))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")



    implementation(LibraryDependency.CONSTRAINT)
    implementation(LibraryDependency.APPCOMPAT)
    implementation(LibraryDependency.MATERIAL)
    implementation(LibraryDependency.RECYCYLER_VIEW)
    implementation(LibraryDependency.CARD_VIEW)
    implementation(LibraryDependency.SWIPE_TO_REFERESH)
    implementation(LibraryDependency.NAVIGATION_FRAGMENT)
    implementation(LibraryDependency.NAVIGATION_UI)
    implementation(LibraryDependency.NAVIGATION_RUNTIME)
    implementation(LibraryDependency.MATERIAL_DIALOG)
    implementation(LibraryDependency.CORE_KTX)
    implementation(LibraryDependency.CROP)
    implementation(LibraryDependency.GLIDE)
    kapt(LibraryDependency.GLIDE_COMPILAR)
    implementation(LibraryDependency.LIVE_DATA_RUNTIME)
    kapt(LibraryDependency.LIVE_DATA_COMPILER)
    implementation(LibraryDependency.LIVE_DATA_KTX)
    implementation(LibraryDependency.OKHTTP)

    implementation(LibraryDependency.ROOM_RUNTIME)
    kapt(LibraryDependency.ROOM_COMPILER)
    implementation(LibraryDependency.ROOM_KTX)


    implementation(LibraryDependency.COROUTINES_CORE)
    implementation(LibraryDependency.COROUTINES_ANDROID)

    implementation(LibraryDependency.KOIN)
    implementation(LibraryDependency.KOIN_VIEWMODEL)
    implementation(LibraryDependency.KOIN_SCOPE)


    implementation(LibraryDependency.RETROFIT)
    implementation(LibraryDependency.RETROFIT_CONVERTER)
    implementation(LibraryDependency.RETROFIT_INTERCEPTOR)
    implementation(LibraryDependency.COLLECTION_KTX)



    addTestDependencies()
}


