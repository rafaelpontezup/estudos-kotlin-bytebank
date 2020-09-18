class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
    val tipo: Int = 0 // 0-dev,1-qa,2-gerente
) {

    fun bonificacao(): Double { // ou `fun bonificacao() = this.salario * 0.1`
        if (tipo == 0) {
            return this.salario * 0.1
        } else if (tipo == 1) {
            return this.salario * 0.2
        } else {
            return this.salario * 0.3
        }
    }

}