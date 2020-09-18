open class Funcionario( // tip: deve ser "open" para ser herdada
    val nome: String,
    val cpf: String,
    val salario: Double,
) {

    /**
     * tip: deve ser "open" para sobrescrita
     */
    open fun bonificacao(): Double { // tip: ou `fun bonificacao() = this.salario * 0.1`
        return this.salario * 0.1
    }

}