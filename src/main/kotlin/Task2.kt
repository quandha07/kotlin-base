import java.util.*

fun task2() {
    println("Input an integer")
    try {
        val num = Scanner(System.`in`).nextInt()
        if (num > 0)
            print("The number is positive")
        else
            print("The number is negative")
    } catch (e: InputMismatchException) {
        print("The number is invalid")
    }

}