package com.vladdrummer.plugins

import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {

    routing {
        authenticate("auth-basic") {
            get("/login") {
                call.respondText("Hello, ${call.principal<UserIdPrincipal>()?.name}")
            }
        }
    }
}
