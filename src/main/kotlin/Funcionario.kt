class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
    val tipo: Int = 0 // 0-dev,1-qa,2-gerente
) {

    fun bonificacao(): Double { // ou `fun bonificacao() = this.salario * 0.1`
        return when (tipo) {
            0 -> this.salario * 0.1
            1 -> this.salario * 0.2
            else -> this.salario * 0.3
        }
    }

}