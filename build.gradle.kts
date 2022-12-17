//import com.varabyte.kobweb.gradle.application.util.configAsKobwebApplication

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.jetbrains.compose)
   // alias(libs.plugins.kobweb.application)
//  /   alias(libs.plugins.kobwebx.markdown)
}

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    google()
    maven("https://us-central1-maven.pkg.dev/varabyte-repos/public")
}

group = "org.example.empty2"
version = "1.0-SNAPSHOT"

/*
kobweb {
    app {
        index {
            description.set("Powered by Kobweb")
        }
    }
}*/

kotlin {
    //configAsKobwebApplication("empty2", includeServer = true)
js(IR){
    browser()
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
            dependencies {
                implementation(compose.web.core)
                implementation(libs.kobweb.core)
                implementation(libs.kobweb.silk.core)
                implementation(libs.kobweb.silk.icons.fa)
                implementation(libs.kobwebx.markdown)
             }
        }
        /*val jvmMain by getting {
            dependencies {
                implementation(libs.kobweb.api)
             }
        }*/
    }
}