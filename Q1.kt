fun main() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    var evenSum = 0

    for (value in numberList) {
        if (value % 2 == 0) {
            evenSum += value
        }
    }

    println("Sum of even numbers: $evenSum")
}
