package one.digitalinovation.collections

fun main(){
    val salarios = arrayOf(             //transforma a String em bigDecimal
        "2000". toBigDecimal(),
        "1500". toBigDecimal(),
        "2500". toBigDecimal()
    )


    println("----------------------")
    println(salarios.somatoria())

    println("----------------------")
    println(salarios.media())

}