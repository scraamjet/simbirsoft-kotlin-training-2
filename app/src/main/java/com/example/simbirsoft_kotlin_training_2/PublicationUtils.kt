package com.example.simbirsoft_kotlin_training_2

fun buy(publication: Publication) {
    val formattedPrice = "%.2f".format(publication.price)
    println("The purchase is complete. The purchase amount was $formattedPrice€")
}
