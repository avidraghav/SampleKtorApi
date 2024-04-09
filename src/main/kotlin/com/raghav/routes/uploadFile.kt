package com.raghav.routes

import com.raghav.save
import io.ktor.http.HttpStatusCode
import io.ktor.http.content.PartData
import io.ktor.http.content.forEachPart
import io.ktor.server.application.call
import io.ktor.server.request.receiveMultipart
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.post

fun Route.uploadFile() {
    post("file") {
        val multipart = call.receiveMultipart()
        var fileUrl = ""
        multipart.forEachPart { part ->
            when (part) {
                is PartData.FormItem -> Unit
                is PartData.FileItem -> {
                    if (part.name == "image") {
                        fileUrl = "build/resources/main/static/images/image_${System.currentTimeMillis()}.png"
                        part.save("build/resources/main/static/images/", "image_${System.currentTimeMillis()}.jpg")
                    }
                }

                else -> Unit
            }
        }
        call.respond(HttpStatusCode.OK, fileUrl)
    }
}