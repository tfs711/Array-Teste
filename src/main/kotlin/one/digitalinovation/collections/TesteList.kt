package one.digitalinovation.collections

fun main(){
    val Joao = Funcionario("João", 1500.0)
    val Maria = Funcionario("Maria", 1000.0)
    val Jose = Funcionario("José", 2000.0)

    val funcionarios = listOf(Joao, Maria, Jose)

    funcionarios.forEach{println(it)} // it representa funcionario

    println("----------------------")
    println(funcionarios.find { it.nome == "Maria" })

    println("----------------------")
    funcionarios.sortedBy { it.salario }.forEach { println(it) } //buscando somente o salario
}

data class Funcionario(
    val nome: String,
    val salario: Double
){
    override fun toString(): String =
        """
            Nome: $nome
            Salario: $salario
        """.trimIndent()

}