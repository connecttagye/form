package com.form.network.api

import com.form.api.contract.ApiEndpoints
import com.form.api.contract.HealthResponse
import com.form.api.contract.TimeResponse
import com.form.network.http.createHttpClient
import io.ktor.client.call.*
import io.ktor.client.request.*

class FormApiClient(private val baseUrl: String) {
    private val client = createHttpClient()

    suspend fun getHealth(): HealthResponse = client.get(ApiEndpoints.health(baseUrl)).body()

    suspend fun getTime(): TimeResponse = client.get(ApiEndpoints.time(baseUrl)).body()

    fun close() = client.close()
}
