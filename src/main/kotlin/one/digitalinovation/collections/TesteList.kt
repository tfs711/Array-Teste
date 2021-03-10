package one.digitalinovation.collections

fun main(){
    val Joao = Funcionario("João", 1500.0, "CLT")
    val Maria = Funcionario("Maria", 1000.0, "CLT")
    val Jose = Funcionario("José", 2000.0, "PJ")

    val funcionarios = listOf(Joao, Maria, Jose)

    funcionarios.forEach{println(it)} // it representa funcionario

    println("----------------------")
    println(funcionarios.find { it.nome == "Maria" })

    println("----------------------")
    funcionarios.sortedBy { it.salario }.forEach { println(it) } //buscando somente o salario

    println("----------------------")
    funcionarios.groupBy { it.tipoContratacao }.forEach { println(it) } //agrupar elementos

}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
){
    override fun toString(): String =
        """
            Nome: $nome
            Salario: $salario
        """.trimIndent()

}