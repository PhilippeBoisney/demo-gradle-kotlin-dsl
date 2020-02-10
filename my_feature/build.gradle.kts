plugins {
    androidLibrary()
    kotlinAndroid()
    kotlinAndroidExt()
}

android {
    setLibraryConfig()
    enableVectorDrawable()

    defaultConfig {
        buildConfigBoolean("ENABLE_LOGGING", true)
    }
}

dependencies {
    implementation(project(Modules.Design))

    implementation(Libraries.AndroidX.activityKtx)
    implementation(Libraries.AndroidX.appcompat)
    implementation(Libraries.AndroidX.constraintLayout)
}
