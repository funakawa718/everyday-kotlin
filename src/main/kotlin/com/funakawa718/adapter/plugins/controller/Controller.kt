package com.funakawa718.adapter.plugins.controller

import io.ktor.application.*
import io.ktor.response.*

class Controller {
    suspend fun get(call: ApplicationCall) = call.respondText("Hello World! from controller")
}