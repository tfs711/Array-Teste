package one.digitalinovation.collections

fun main(){
    val Joao = Funcionario("João", 1500.0, "CLT")
    val Maria = Funcionario("Maria", 1000.0, "CLT")
    val Jose = Funcionario("José", 2000.0, "PJ")


    println("------------LIST-----------------")
    val funcionarios = mutableListOf(Joao, Maria) // uma lista mutavel, conseguimos fazer alteraçoes nela
    funcionarios.forEach{ println(it) }

    println("-----------------------------")
    funcionarios.add(Jose) // adicionou o Jose
    funcionarios.forEach{ println(it) }

    println("-----------------------------")
    funcionarios.remove(Joao) // removeu joao
    funcionarios.forEach{ println(it) }

    println("------------SET-----------------")
    val funcionariosSet = mutableSetOf(Joao)
    funcionariosSet.forEach{ println(it) }

    println("--------------------------------------")

    funcionariosSet.add(Maria)
    funcionariosSet.add(Jose)
    funcionariosSet.forEach{ println(it) }

    println("--------------------------------------")

    funcionariosSet.remove(Maria)
    funcionariosSet.forEach{ println(it) }

}