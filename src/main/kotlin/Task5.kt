package org.example

fun task5() {
    val studentNames = mutableListOf<String>()
    while (true) {
        println("\n--- Student List Management ---")
        if (studentNames.isEmpty()) {
            println("The student list is empty.")
        } else {
            println("List of students:")
            for (name in studentNames) {
                println(name)
            }
        }
        println()
        println("1. Add Student")
        println("2. Delete Student")
        println("3. Exit")
        print("Please select an option: ")
        var option = readLine()
        when (option) {
            "1" -> {
                println("Enter the name of the student you want to add")
                var student = readln().trim()
                val nameRegex = Regex("(?:[A-Z]\\p{L}+ ){1,3}[A-Z]\\p{L}+")
                if (student != null && nameRegex.matches(student)) {
                    studentNames.add(student)
                    println("Added a new student $student")
                } else {
                    println("Please enter a valid student name")
                }
            }

            "2" -> {
                println("Enter the name of the student you want to delete")
                var student = readln()
                if (studentNames.remove(student)) {
                    println("Deleted a new student $student")
                } else {
                    println("Please enter a valid student name")
                }
            }

            "3" -> {
                println("Exit.")
                break
            }

            else -> println("invalid")
        }

    }
}