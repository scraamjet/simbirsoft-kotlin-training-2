package com.example.simbirsoft_kotlin_training_2

fun User.throwIfUnderage() {
    if (age < 18) {
        println("User $name is not an adult.")
        throw UnderageUserException("User $name is not an adult.")
    }
    println("User $name is an adult.")
}
