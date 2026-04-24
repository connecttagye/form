package com.form.api.contract

object ApiEndpoints {
    const val HEALTH = "/health"
    const val TIME = "/time"

    fun health(baseUrl: String): String = buildUrl(baseUrl, HEALTH)

    fun time(baseUrl: String): String = buildUrl(baseUrl, TIME)

    private fun buildUrl(baseUrl: String, path: String): String {
        val normalizedBaseUrl = baseUrl.removeSuffix("/")
        return normalizedBaseUrl + path
    }
}
