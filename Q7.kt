fun main() {
    val n = 6
    var result = 1

    for (i in 1..n) {
        result *= i
    }

    println("Factorial of $n is $result")
}
