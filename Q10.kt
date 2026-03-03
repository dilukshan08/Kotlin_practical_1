fun main() {
    val rows = 6

    for (row in 1..rows) {
        for (col in 1..row) {
            print("*")
        }
        println()
    }
}
