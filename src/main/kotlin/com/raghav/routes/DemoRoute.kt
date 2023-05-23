package com.raghav.routes

import com.raghav.data.model.Demo
import io.ktor.http.HttpStatusCode
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get

private val response = Demo("Yay! Api request works.", "1")
fun Route.demoRoute() {
    get("/demo_response") {
        call.respond(
            HttpStatusCode.OK,
            response
        )
    }
}