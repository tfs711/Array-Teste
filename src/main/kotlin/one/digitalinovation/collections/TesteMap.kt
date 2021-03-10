package one.digitalinovation.collections

fun main(){
    val pair: Pair<String, Double> = Pair("João", 4000.0)// 1ª maneira
    val map1 = mapOf(pair)

    map1.forEach { (k, v) -> println("Chave: $k - Valor: $v")}

    val map2 = mapOf( // 2ª maneira
        "Maria" to 5000.0,
        "Jose" to 6000.0
    )
    map2.forEach { (k, v) -> println("Chave: $k - Valor: $v")}
}