package com.form.importexport.json

import com.form.importexport.core.Exporter
import com.form.importexport.core.Importer
import kotlinx.serialization.json.Json
import kotlinx.serialization.encodeToString
import kotlinx.serialization.decodeFromString

class JsonImporter<T>(private val deserializer: (String) -> T) : Importer<T> {
    override suspend fun import(content: String): List<T> {
        val jsonArray = Json.parseToJsonElement(content)
        return jsonArray.toString().let { listOf(deserializer(it)) }
    }
}

class JsonExporter<T>(private val serializer: (T) -> String) : Exporter<T> {
    override suspend fun export(items: List<T>): String =
        "[${items.joinToString(",") { serializer(it) }}]"
}
