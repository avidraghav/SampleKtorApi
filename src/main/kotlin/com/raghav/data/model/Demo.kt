package com.raghav.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Demo(
    val title: String,
    val id: String
)