package com.example.simbirsoft_kotlin_training_2

import java.math.BigDecimal

interface Publication {
    val price: BigDecimal
    val wordCount: Int
    fun getType(): String
}