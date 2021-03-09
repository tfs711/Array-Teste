package one.digitalinovation.collections

fun main(){
    val salarios = doubleArrayOf(1000.0, 2000.0, 3000.0)

    for (salario in salarios){
        println(salario)
    }
    println("--------------------------------------")

    println("Maior salario: ${salarios.max()}")
    println("Menor salario: ${salarios.min()}")
    println("Media salarial: ${salarios.average()}")

    println("--------------------------------------")

    val salariosMaiorque2500 = salarios.filter { it > 2500.0 }
    salariosMaiorque2500.forEach{println(it)}
}