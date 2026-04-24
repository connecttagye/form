package com.form.api.contract

import kotlinx.serialization.Serializable

@Serializable
data class HealthResponse(val status: String)

@Serializable
data class TimeResponse(val time: String)
