import com.android.build.gradle.internal.dsl.BaseFlavor

/**
 * Convenient extension which create a ConfigField for a given [value].
 */
fun BaseFlavor.buildConfigField(name: String, value: Boolean) =
    buildConfigField("Boolean", name, value.toString())