package com.form.server

import io.ktor.server.cio.*
import io.ktor.server.engine.*

fun main() {
    embeddedServer(CIO, port = 8080, module = { configureServer() }).start(wait = true)
}
