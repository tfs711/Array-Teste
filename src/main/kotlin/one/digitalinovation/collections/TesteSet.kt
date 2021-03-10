package one.digitalinovation.collections

fun main(){
    val Joao = Funcionario("João", 1500.0, "CLT")
    val Maria = Funcionario("Maria", 1000.0, "CLT")
    val Jose = Funcionario("José", 2000.0, "PJ")

    val funcionarios1 = setOf(Joao, Maria)  // 2 conjuntos
    val funcionarios2 = setOf(Jose)

    val resultUnion = funcionarios1.union(funcionarios2) // união dos conjuntos
    resultUnion.forEach{println(it)}

    println("--------------------------------------")

    val funcionarios3 = setOf(Joao, Maria, Jose)
    val resultSubtract = funcionarios3.subtract(funcionarios2) // subtração dos conjuntos
    resultSubtract.forEach{println(it)}

    println("--------------------------------------")

    val resultIntersect = funcionarios3.intersect(funcionarios2) // intersecção dos conjuntos
    resultIntersect.forEach{println(it)}
}