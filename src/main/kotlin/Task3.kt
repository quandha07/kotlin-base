package org.example

import java.util.*

fun task3() {
    println("Input an integer")
    try {
        var num = Scanner(System.`in`).nextInt()
        for (i in 1..10) {
            println("$num * $i = ${num * i}")
        }
    } catch (e: Exception) {
        println("The number is invalid")
    }
}