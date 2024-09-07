import java.util.*

fun task4() {
    println("Input in Integer")
    try {
        val num = Scanner(System.`in`).nextInt()
        var result = 1
        for (i: Int in 1..num) {
            result *= i
        }
        println("the factorial of $num: $result")
    } catch (e: InputMismatchException) {
        println("The number is invalid")
    }
}