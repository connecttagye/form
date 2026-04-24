package com.form.server

import com.form.api.contract.HealthResponse
import com.form.api.contract.TimeResponse
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.datetime.Clock
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import kotlinx.serialization.json.Json
import org.koin.dsl.module
import org.koin.ktor.plugin.Koin

val serverModule = module {
    // server-level bindings
}

fun Application.configureServer() {
    install(ContentNegotiation) {
        json(Json { prettyPrint = true })
    }
    install(Koin) {
        modules(serverModule)
    }
    routing {
        get("/health") {
            call.respond(HealthResponse(status = "ok"))
        }
        get("/time") {
            val now = Clock.System.now().toLocalDateTime(TimeZone.UTC)
            call.respond(TimeResponse(time = now.toString()))
        }
    }
}
