//import com.varabyte.kobweb.gradle.application.util.configAsKobwebApplication

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.jetbrains.compose)
//    alias(libs.plugins.kobweb.application)
//    alias(libs.plugins.kobwebx.markdown)
}

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    google()
    maven("https://us-central1-maven.pkg.dev/varabyte-repos/public")
}

group = "org.example.empty2"
version = "1.0-SNAPSHOT"

//kobweb {
//    app {
//        index {
//            description.set("Powered by Kobweb")
//        }
//    }
//}

kotlin {
//    configAsKobwebApplication("empty2", includeServer = true)

    js(IR) {
        moduleName = "empty2"
        browser {
            commonWebpackConfig {
                outputFileName = "empty2.js"
            }
        }
        binaries.executable()
    }

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions.jvmTarget = "11"
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.runtime)
                implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.4.0")
            }
        }

        val jsMain by getting {
            kotlin.srcDir("build/generated/kobweb/src/jsMain/kotlin")
            resources.srcDir("build/generated/kobweb/src/jsMain/resources/public")

            dependencies {
                implementation(compose.web.core)
                implementation(libs.kobweb.core)
                implementation(libs.kobweb.silk.core)
                implementation(libs.kobweb.silk.icons.fa)
                implementation(libs.kobwebx.markdown)
//                // https://github.com/Kotlin/kotlinx-datetime/blob/0f4c62d32d87b35d8af54b408ed8685d0ddfd18a/core/build.gradle.kts#L184
//                implementation(npm("@js-joda/core", "3.2.0"))
            }
        }
//        val jvmMain by getting {
//            dependencies {
//                implementation(libs.kobweb.api)
//             }
//        }
    }
}