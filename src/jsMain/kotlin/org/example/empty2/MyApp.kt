package org.example.empty2

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.App
import com.varabyte.kobweb.silk.InitSilk
import com.varabyte.kobweb.silk.InitSilkContext
import com.varabyte.kobweb.silk.SilkApp
import com.varabyte.kobweb.silk.components.layout.AnimatedColorSurfaceVariant
import com.varabyte.kobweb.silk.components.layout.Surface
import org.jetbrains.compose.web.css.*
import kotlinx.datetime.LocalDateTime

/*
@InitSilk
fun updateTheme(ctx: InitSilkContext) {
    // Configure silk here
}

@App
@Composable
fun MyApp(content: @Composable () -> Unit) {
    SilkApp {
        Surface(Modifier.minWidth(100.vw).minHeight(100.vh), variant = AnimatedColorSurfaceVariant) {
            content()
        }
    }
}

*/
fun main() {
    val kotlinReleaseDateTime = LocalDateTime(2016, 2, 15, 16, 57, 0, 0)
    println(kotlinReleaseDateTime.toString())
    println("ao")
}