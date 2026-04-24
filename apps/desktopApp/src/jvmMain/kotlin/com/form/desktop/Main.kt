package com.form.desktop

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.form.core.di.initKoin
import com.form.core.ui.HomeScreen

fun main() {
    initKoin()
    application {
        Window(onCloseRequest = ::exitApplication, title = "Form") {
            HomeScreen()
        }
    }
}
