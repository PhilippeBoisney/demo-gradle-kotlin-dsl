plugins {
    androidApp()
}

android {
    setAppConfig()
}

dependencies {
    implementation(project(Modules.MyFeature))
    implementation(project(Modules.Design))
}
