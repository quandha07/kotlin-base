package org.example

import java.util.*

fun task2() {
    println("Input an integer")
    try {
        var num = Scanner(System.`in`).nextInt()
        if (num > 0)
            print("The number is positive")
        else
            print("The number is negative")
    } catch (e: Exception) {
        print("The number is invalid")
    }

}