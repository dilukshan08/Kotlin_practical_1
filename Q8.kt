fun main() {
    val values = listOf(-10, 15, 8, -3, 20, -7)
    var positiveSum = 0

    for (value in values) {
        if (value > 0) {
            positiveSum += value
        }
    }

    println("Sum of positive numbers: $positiveSum")
}
