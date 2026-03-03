fun main() {
    val targetNumber = 4
    var userGuess = 0

    while (userGuess != targetNumber) {
        print("Guess a number between 1 and 5: ")
        userGuess = readLine()?.toIntOrNull() ?: 0

        if (userGuess != targetNumber) {
            println("Incorrect guess. Try again!")
        }
    }

    println("Congratulations! You guessed the number.")
}
