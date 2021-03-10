package one.digitalinovation.collections

fun main(){
    val salarios = doubleArrayOf(1000.0, 2000.0, 3000.0)

    for (salario in salarios){
        println(salario)
    }
    println("--------------------------------------")

    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salarial: ${salarios.average()}")

    println("--------------------------------------")

    val salariosMaiorque2500 = salarios.filter { it > 2500.0 }
    salariosMaiorque2500.forEach{println(it)}

    println("--------------------------------------")

    println(salarios.count { it in 1000.0..2500.0})  //count - contou qts expressões estão entre eles - 1000 e 2500

    println("--------------------------------------")

    println(salarios.find { it == 3000.0})  // ele procura o valor pedido, se for um elemento inexistente, retornaria null

    println("--------------------------------------")

    println(salarios.any { it == 1000.0})  // ele procura qualquer elemento válido, retornando true, e senão, false
}