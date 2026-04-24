package com.form.importexport.json

import com.form.importexport.core.Exporter
import com.form.importexport.core.Importer
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonArray

class JsonImporter<T>(private val deserializer: (String) -> T) : Importer<T> {
    override suspend fun import(content: String): List<T> {
        val jsonArray = Json.parseToJsonElement(content).jsonArray
        return jsonArray.map { deserializer(it.toString()) }
    }
}

class JsonExporter<T>(private val serializer: (T) -> String) : Exporter<T> {
    override suspend fun export(items: List<T>): String =
        "[${items.joinToString(",") { serializer(it) }}]"
}
