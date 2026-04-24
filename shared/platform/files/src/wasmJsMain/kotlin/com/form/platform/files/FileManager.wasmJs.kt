package com.form.platform.files

actual fun createFileManager(): FileManager = object : FileManager {
    override suspend fun readText(path: String): String = TODO("Not supported on WASM/Web")
    override suspend fun writeText(path: String, content: String) = TODO("Not supported on WASM/Web")
    override suspend fun exists(path: String): Boolean = false
    override suspend fun delete(path: String): Boolean = false
    override suspend fun listFiles(directory: String): List<String> = emptyList()
}
