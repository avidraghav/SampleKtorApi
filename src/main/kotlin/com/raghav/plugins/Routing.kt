package com.raghav.plugins

import com.raghav.routes.demoRoute
import com.raghav.routes.uploadFile
import io.ktor.server.application.Application
import io.ktor.server.http.content.resources
import io.ktor.server.http.content.static
import io.ktor.server.routing.routing

fun Application.configureRouting() {

    routing {
        demoRoute()
        uploadFile()
        // Static plugin. Try to access `/static/index.html`
        static("/static") {
            resources("static")
        }
    }
}
