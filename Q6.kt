fun main() {
    val fruits = listOf("Mango", "Orange", "Grapes")
    val reverseOrder = mutableListOf<String>()

    for (index in fruits.size - 1 downTo 0) {
        reverseOrder.add(fruits[index])
    }

    println("Reversed list: $reverseOrder")
}
