package one.digitalinovation.collections

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
