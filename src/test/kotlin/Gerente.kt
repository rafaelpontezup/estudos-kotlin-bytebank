class Gerente(
    val nome: String,
    val cpf: String,
    val salario: Double,
) {

    fun bonificacao(): Double {
        return this.salario * 0.3
    }

    fun autentica(senha: String): Boolean {
        return senha == "123";
    }

}
