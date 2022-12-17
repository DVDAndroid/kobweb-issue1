package org.example.empty2.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.core.Page
import kotlinx.datetime.LocalDateTime

@Page
@Composable
fun HomePage() {
    // TODO: Add content here
    val kotlinReleaseDateTime = LocalDateTime(2016, 2, 15, 16, 57, 0, 0)
    println(kotlinReleaseDateTime.toString())
    println("ok")
}
