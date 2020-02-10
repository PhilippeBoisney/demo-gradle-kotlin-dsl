/**
 * Lists all the external libraries used by the project.
 */
object Libraries {

    object AndroidX {
        const val activityKtx = "androidx.activity:activity-ktx:1.1.0"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:1.1.3"
        const val appcompat = "androidx.appcompat:appcompat:1.2.0-alpha02"
        const val material = "com.google.android.material:material:1.1.0"
    }

    object Glide {
        private const val version = "4.10.0"

        const val core = "com.github.bumptech.glide:glide:$version"
        const val compiler = "com.github.bumptech.glide:compiler:$version"
        const val okhttp = "com.github.bumptech.glide:okhttp3-integration:$version"
    }
}