package com.form.ios

import androidx.compose.ui.window.ComposeUIViewController
import com.form.core.di.initKoin
import com.form.core.ui.HomeScreen
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController {
    initKoin()
    return ComposeUIViewController { HomeScreen() }
}
