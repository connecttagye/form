package com.form.platform.files

import java.io.File

actual fun createFileManager(): FileManager = object : FileManager {
    override suspend fun readText(path: String): String = File(path).readText()
    override suspend fun writeText(path: String, content: String) = File(path).writeText(content)
    override suspend fun exists(path: String): Boolean = File(path).exists()
    override suspend fun delete(path: String): Boolean = File(path).delete()
    override suspend fun listFiles(directory: String): List<String> =
        File(directory).listFiles()?.map { it.name } ?: emptyList()
}
