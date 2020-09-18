import org.junit.Assert
import org.junit.Test

class FuncionarioTest {

    @Test
    fun deveCalcularBonificacaoQuandoDesenvolvedor() {
        // cenário
        val dev = Funcionario(
            nome = "rafael",
            cpf = "636.575.203-25",
            salario = 1042.91
        )

        // ação
        val bonificacao = dev.bonificacao()

        // validação
        assertEqualsWithPrecision(104.29, bonificacao)
    }

    @Test
    fun deveCalcularBonificacaoQuandoQA() {
        // cenário
        val qa = Funcionario(
            nome = "rafael",
            cpf = "636.575.203-25",
            salario = 1042.91,
            tipo = 1
        )

        // ação
        val bonificacao = qa.bonificacao()

        // validação
        assertEqualsWithPrecision(208.58, bonificacao)
    }

    @Test
    fun deveCalcularBonificacaoQuandoGerente() {
        // cenário
        val gerente = Gerente(
            nome = "rafael",
            cpf = "636.575.203-25",
            salario = 1042.91,
        )

        // ação
        val bonificacao = gerente.bonificacao()

        // validação
        assertEqualsWithPrecision(312.87, bonificacao)
    }

    private fun assertEqualsWithPrecision(expected: Double, actual: Double, delta: Double = 000.1) {
        Assert.assertEquals(expected, actual, delta)
    }
}