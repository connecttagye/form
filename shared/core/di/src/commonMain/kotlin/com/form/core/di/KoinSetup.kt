package com.form.core.di

import org.koin.core.KoinApplication
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.module

val commonModule = module {
    // shared bindings — add as modules grow
}

fun initKoin(
    platformModules: List<Module> = emptyList(),
    config: KoinApplication.() -> Unit = {}
): KoinApplication =
    startKoin {
        config()
        modules(commonModule + platformModules)
    }
