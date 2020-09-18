class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String = "123" // tip: atributo adicional
) : Funcionario(nome, cpf, salario) { // tip: se classe filha tem construtor-primario entao deve chamar construtor-primario da classe pai

    override fun bonificacao(): Double { // tip: deve ter "override" para sobrescrever
        return this.salario * 0.3
    }

    fun autentica(senha: String): Boolean {
        return senha == this.senha;
    }

}
