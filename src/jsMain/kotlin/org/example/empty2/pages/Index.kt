package org.example.empty2.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.core.Page
import kotlinx.datetime.Clock
import kotlinx.datetime.LocalDateTime
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text

@Page
@Composable
fun HomePage() {
    // TODO: Add content here
    val kotlinReleaseDateTime = Clock.System.now()
    println("ok")

    Column {
        Text(kotlinReleaseDateTime.toString())
    }
}
