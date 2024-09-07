import java.util.*

fun task3() {
    println("Input an integer")
    try {
        val num = Scanner(System.`in`).nextInt()
        for (i in 1..10) {
            println("$num * $i = ${num * i}")
        }
    } catch (e: InputMismatchException) {
        println(e)
    }
}