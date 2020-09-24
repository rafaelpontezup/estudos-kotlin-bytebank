package br.com.zupacademy.estudos.outros
import br.com.zupacademy.estudos.modelo.Conta as ContaDoModelo
import br.com.zupacademy.estudos.modelo.Conta as OutraConta

class CriadorDeContas {

    fun cria() {

        val c1 = Conta() // classe desse pacote
        val c2 = ContaDoModelo("", "", 1.1) // tip: podemo criar aliases para classes importadas
        val c3 = br.com.zupacademy.estudos.modelo.Conta("", "", 2.2)
        val c4 = OutraConta("", "", 3.3) // tip: alias pra mesma classe

    }
}