package one.digitalinovation.collections

fun main() {
    val values = IntArray(5)
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    for (valor in values) {    //1ª maneira de imprimir um array
        println(valor)
    }
    println("--------------------------------------------------")

    values.forEach {
        println(it)            //2ª maneira de imprimir um array
    }
    println("--------------------------------------------------")

    values.forEach { valor ->   //3ª maneira de imprimir um array
        println(valor)
    }
    println("--------------------------------------------------")

    for(index in values.indices){   //4ª mostrar o indice do array
        println(values[index])
    }

    println("--------------------------------------------------")

    values.sort()
    for (valor in values){          //5ª maneira , mostrando por ordem crescente
        println(valor)
    }
}