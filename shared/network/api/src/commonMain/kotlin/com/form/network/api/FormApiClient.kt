package com.form.network.api

import com.form.api.contract.ApiEndpoints
import com.form.api.contract.HealthResponse
import com.form.api.contract.TimeResponse
import com.form.network.http.createHttpClient
import io.ktor.client.call.*
import io.ktor.client.request.*

class FormApiClient(private val baseUrl: String = ApiEndpoints.BASE_URL) {
    private val client = createHttpClient()

    suspend fun getHealth(): HealthResponse = client.get("$baseUrl${ApiEndpoints.HEALTH}").body()

    suspend fun getTime(): TimeResponse = client.get("$baseUrl${ApiEndpoints.TIME}").body()

    fun close() = client.close()
}
