open class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
) {

    open fun bonificacao(): Double { // ou `fun bonificacao() = this.salario * 0.1`
        return this.salario * 0.1
    }

}