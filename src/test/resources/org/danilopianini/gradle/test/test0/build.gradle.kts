import kotlin.io.path.createTempDirectory

plugins {
    id("it.unibo.collektive.collektivize-gradle-plugin")
}

collektivize {
    outputDirectory.set(createTempDirectory().toFile())
}