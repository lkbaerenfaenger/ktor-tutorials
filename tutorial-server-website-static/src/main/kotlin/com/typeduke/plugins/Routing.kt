package com.typeduke.plugins

import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*

fun Application.configureRouting() {
    routing {
        static("/static") {
            resources("files")
        }
    }
}
