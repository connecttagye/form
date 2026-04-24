package com.form.platform.files

interface FileManager {
    suspend fun readText(path: String): String
    suspend fun writeText(path: String, content: String)
    suspend fun exists(path: String): Boolean
    suspend fun delete(path: String): Boolean
    suspend fun listFiles(directory: String): List<String>
}

expect fun createFileManager(): FileManager
