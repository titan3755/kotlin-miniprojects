package main

import kotlin.math.*

fun main() {
    try {
        println("-- Prime Numbers --")
        println("Mode -->")
        println("1. Check if prime number")
        println("2. Print prime numbers within range")
        println("3. Print number of primes numbers within range")
        print("Option: ")
        val userResponse: String = readln()
        when (userResponse) {
            "1" -> {
                print("Enter a number: ")
                val number: Int = readln().toInt()
                if (checkPrime(number)) {
                    println("$number is a prime number")
                } else {
                    println("$number is not a prime number")
                }
            }
            "2" -> {
                print("Enter a range (start end): ")
                val (start, end) = readln().split(" ").map { it.toInt() }
                for (i in start..end) {
                    if (checkPrime(i)) {
                        print("$i ")
                    }
                }
                println()
            }
            "3" -> {
                print("Enter a range (start end): ")
                val (start, end) = readln().split(" ").map { it.toInt() }
                var count = 0
                for (i in start..end) {
                    if (checkPrime(i)) {
                        count++
                    }
                }
                println("Number of prime numbers within range: $count")
            }
            else -> {
                println("Invalid option")
            }
        }
    } catch (e: Exception) {
        println(e.message)
    }
}

fun checkPrime(number: Int): Boolean {
    if (number < 2) return false
    for (i in 2..sqrt(number.toDouble()).toInt()) {
        if (number % i == 0) return false
    }
    return true
}