package org.example.empty2.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import kotlinx.datetime.Clock
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text

@Page
@Composable
fun HomePage() {
    val kotlinReleaseDateTime = Clock.System.now()

    Div {
        Text(kotlinReleaseDateTime.toString())
    }
}
