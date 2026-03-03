fun main() {
    val sentence = "Hello Kotlin"
    var vowelCount = 0

    for (character in sentence.lowercase()) {
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
            vowelCount++
        }
    }

    println("Total vowels: $vowelCount")
}
