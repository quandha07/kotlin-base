fun task6() {
    try {
        println("Enter your name:")
        val name = readln().trim()

        val nameRegex = Regex("(?:[A-Z]\\p{L}+ ){1,3}[A-Z]\\p{L}+")
        if (!nameRegex.matches(name)) {
            throw InvalidInputException("Name contains invalid characters or is empty.")
        }

        println("Enter your age:")
        val age = readln().toInt()
        if (age >= 16) {
            println("Candidate: $name. $age years old has successfully registered.")
        } else {
            println("Candidate not enough. Please enter a valid age.")
        }
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    } catch (e: InvalidInputException) {
        println("Invalid input. Please try again.")
    }
}

class InvalidInputException(message: String) : Exception(message)
