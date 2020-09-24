package br.com.zupacademy.estudos.modelo

import br.com.zupacademy.estudos.modelo.Funcionario

class Desenvolvedor(
    nome: String,
    cpf: String,
    salario: Double,
) : Funcionario(nome, cpf, salario) {

    override fun bonificacao(): Double {
        return salario * 0.1
    }
}
