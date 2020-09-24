package br.com.zupacademy.estudos.modelo

import br.com.zupacademy.estudos.modelo.Funcionario

class AnalistaDeSistema(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome, cpf, salario) {


    override fun bonificacao(): Double {
        return this.salario * 0.1
    }

}