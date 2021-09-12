package com.funakawa718.adapter.plugins

import com.funakawa718.adapter.plugins.controller.Controller
import io.ktor.routing.*
import io.ktor.application.*

fun Application.configureRouting() {
    // Starting point for a Ktor app:
    routing {
        get("/") {
            Controller().get(call)
        }
    }

}
