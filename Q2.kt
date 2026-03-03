fun main() {
    val scores = listOf(12, 78, 34, 90, 56)
    var highestScore = scores[0]

    for (score in scores) {
        if (score > highestScore) {
            highestScore = score
        }
    }

    println("Highest number: $highestScore")
}
