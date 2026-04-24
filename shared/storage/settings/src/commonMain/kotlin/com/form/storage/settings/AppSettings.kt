package com.form.storage.settings

import com.russhwolf.settings.Settings

class AppSettings(private val settings: Settings = Settings()) {
    fun getString(key: String, default: String = ""): String = settings.getString(key, default)
    fun putString(key: String, value: String) = settings.putString(key, value)
    fun getBoolean(key: String, default: Boolean = false): Boolean = settings.getBoolean(key, default)
    fun putBoolean(key: String, value: Boolean) = settings.putBoolean(key, value)
    fun getInt(key: String, default: Int = 0): Int = settings.getInt(key, default)
    fun putInt(key: String, value: Int) = settings.putInt(key, value)
    fun remove(key: String) = settings.remove(key)
    fun clear() = settings.clear()
}
