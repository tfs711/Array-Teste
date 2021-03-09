package one.digitalinovation.collections

fun main(){
    val nomes = Array(3){""}
    nomes[0] = "Thomas"
    nomes[1] = "Yago"
    nomes[2] = "Dandara"

    for (nome in nomes){
        println(nome)
    }
    println("---------------------------")
    nomes.sort() // ordem crescente
    nomes.forEach { println(it) }

    println("---------------------------")

    val nomes2 = arrayOf("Tiago", "Yara", "Bia")// ja poe o size e em ordem crescente por causa do sort
    nomes2.sort() // ordem crescente
    nomes2.forEach { println(it) }
}