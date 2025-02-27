package com.example.simbirsoft_kotlin_training_2

import java.time.Instant

data class User(
    val id: Long,
    val name: String,
    val age: Int,
    val type: Type
) {
    val startTime: Instant by lazy { Instant.now() }
}