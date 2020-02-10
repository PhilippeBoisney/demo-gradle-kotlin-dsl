import com.android.build.gradle.internal.dsl.BaseFlavor

/**
 * Convenient extension which create a ConfigField for a given [value].
 */
fun BaseFlavor.buildConfigBoolean(name: String, value: Boolean) =
    buildConfigField("Boolean", name, value.toString())