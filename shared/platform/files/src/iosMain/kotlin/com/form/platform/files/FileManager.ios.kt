package com.form.platform.files

import kotlinx.cinterop.*
import platform.Foundation.*

actual fun createFileManager(): FileManager = object : FileManager {
    override suspend fun readText(path: String): String =
        NSString.stringWithContentsOfFile(path, NSUTF8StringEncoding, null) ?: ""

    override suspend fun writeText(path: String, content: String) {
        (content as NSString).writeToFile(path, atomically = true, encoding = NSUTF8StringEncoding, error = null)
    }

    override suspend fun exists(path: String): Boolean =
        NSFileManager.defaultManager.fileExistsAtPath(path)

    override suspend fun delete(path: String): Boolean =
        NSFileManager.defaultManager.removeItemAtPath(path, null)

    override suspend fun listFiles(directory: String): List<String> =
        NSFileManager.defaultManager.contentsOfDirectoryAtPath(directory, null)
            ?.mapNotNull { it as? String } ?: emptyList()
}
