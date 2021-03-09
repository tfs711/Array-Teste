package one.digitalinovation.collections

fun main() {
    val values = intArrayOf(2, 3, 4, 1, 10, 7)  // uma outra maneira de fazer um array

    values.forEach {
        println(it)
    }
    println("------------------------------") // maneira ordenada sort
    values.sort()
    values.forEach {
        println(it)
    }
}
