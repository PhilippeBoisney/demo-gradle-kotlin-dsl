package tasks

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction
import java.io.IOException
import java.net.URL

/**
 * Simple Gradle task that pings a provided url.
 *
 * You can also use external libraries to do that by adding them to your build.gradle.kts
 */
open class PingUrlTask : DefaultTask() {
    @Input
    lateinit var url: String

    @TaskAction
    fun ping() {
        println("🚀 Task starts...︎")

        try {
            URL(url)
                .openStream()
                .bufferedReader()
                .use { it.readText() }
            println("🚀 Ping Succeed ✅︎")
        } catch (e: IOException) {
            println("🚀 Ping Failed !")
        }
    }
}