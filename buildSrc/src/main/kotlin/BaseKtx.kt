import com.android.build.gradle.BaseExtension
import com.android.build.gradle.internal.dsl.BaseAppModuleExtension

/**
 * Sets the android{} configuration for the "app" module.
 */
fun BaseAppModuleExtension.setAppConfig() {
    setLibraryConfig()

    defaultConfig {
        applicationId = ProjectConfiguration.applicationId
        versionCode = ProjectConfiguration.versionCode
        versionName = ProjectConfiguration.versionName
    }
}

/**
 * Sets the android{} configuration for the "library" modules.
 */
fun BaseExtension.setLibraryConfig() {
    compileSdkVersion(ProjectConfiguration.compileSdk)
    buildToolsVersion(ProjectConfiguration.buildTools)

    defaultConfig {
        minSdkVersion(ProjectConfiguration.minSdk)
        targetSdkVersion(ProjectConfiguration.targetSdk)

        testInstrumentationRunner = ProjectConfiguration.testInstrumentationRunner
    }

    sourceSets {
        getByName("main").java.srcDirs("src/main/kotlin")
    }
}

/**
 * Enables the support for vectorDrawable (using SVG on ImageView)
 */
fun BaseExtension.enableVectorDrawable() {
    defaultConfig {
        vectorDrawables.useSupportLibrary = true
    }
}