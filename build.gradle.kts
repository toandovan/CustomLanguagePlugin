plugins {
    id("org.jetbrains.intellij") version "1.4.0"
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    maven("https://www.jetbrains.com/intellij-repository/releases/")
    mavenCentral()
}

// Configure Gradle IntelliJ Plugin - read more: https://github.com/JetBrains/gradle-intellij-plugin
intellij {
    version.set("2021.2")
    type.set("IC") // Target IDE Platform

    plugins.set(listOf(/* Plugin Dependencies */))
}
tasks {
    // Set the JVM compatibility versions
    patchPluginXml {
        sinceBuild.set("221")
        untilBuild.set("221.*")
    }

//    instrumentCode {
//        compilerVersion = "203.7707.56"
//    }

//    signPlugin {
//        certificateChain.set(System.getenv("CERTIFICATE_CHAIN"))
//        privateKey.set(System.getenv("PRIVATE_KEY"))
//        password.set(System.getenv("PRIVATE_KEY_PASSWORD"))
//    }
//
//    publishPlugin {
//        token.set(System.getenv("PUBLISH_TOKEN"))
//    }
}
