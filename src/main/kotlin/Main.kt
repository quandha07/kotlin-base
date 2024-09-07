package org.example

import Robot
import task1
import task2
import task3
import task4
import task5
import task6


fun main() {
    while (true) {
        println("\n--- Menu ---")
        println("1. Variables and Data Types")
        println("2. Conditionals")
        println("3. Loops")
        println("4. Functions")
        println("5. Lists and Collections")
        println("6. Basic Input and Output")
        println("7. Big Assignment")
        val c = readlnOrNull()
        when (c) {
            "1" -> task1()
            "2" -> task2()
            "3" -> task3()
            "4" -> task4()
            "5" -> task5()
            "6" -> task6()
            "7" -> task7()
        }
    }
}

fun task7() {
    val robot = Robot(7, 3, Direction.NORTH)
    val instructions = "RAALAL"
    robot.processInstructions(instructions)
    println(robot.getPosition())
}

