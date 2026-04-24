package com.form.importexport.core

interface Importer<T> {
    suspend fun import(content: String): List<T>
}

interface Exporter<T> {
    suspend fun export(items: List<T>): String
}
