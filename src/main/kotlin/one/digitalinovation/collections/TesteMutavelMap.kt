package one.digitalinovation.collections

fun main() {
    val Joao = Funcionario("João", 1500.0, "CLT")
    val Maria = Funcionario("Maria", 1000.0, "CLT")
    val Jose = Funcionario("José", 2000.0, "PJ")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(Joao.nome, Joao)
    repositorio.create(Maria.nome, Maria)
    repositorio.create(Jose.nome, Jose)

    println(repositorio.findById(Joao.nome))

    println("------------------------------")
    repositorio.findAll().forEach { println(it) } //estou trazendo todos os elementos de meu mapa

    println("------------------------------")
    repositorio.remove(Maria.nome)   // excluir Maria
    repositorio.findAll().forEach { println(it) }


}