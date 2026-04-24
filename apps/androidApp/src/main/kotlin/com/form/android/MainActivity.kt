package com.form.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.form.core.di.initKoin
import com.form.core.ui.HomeScreen
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (GlobalContext.getOrNull() == null) {
            initKoin {
                androidContext(this@MainActivity.applicationContext)
            }
        }
        setContent {
            HomeScreen()
        }
    }
}
