package com.form.web

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.CanvasBasedWindow
import com.form.core.di.initKoin
import com.form.core.ui.HomeScreen

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    initKoin()
    CanvasBasedWindow("Form") {
        HomeScreen()
    }
}
