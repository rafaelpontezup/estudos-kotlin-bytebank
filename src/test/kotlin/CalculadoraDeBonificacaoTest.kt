import org.junit.Assert
import org.junit.Test

class CalculadoraDeBonificacaoTest {

    @Test
    fun deveCalcularBonificacaoParaTodosOsFuncionarios() {

        val analista = Funcionario(nome = "analista", cpf = "001", 1000.0)
        val gerente = Gerente(nome = "analista", cpf = "001", 1000.0)
        val dev = Desenvolvedor(nome = "analista", cpf = "001", 1000.0)
        val qa = QA(nome = "analista", cpf = "001", 1000.0)

        val calculadora = CalculadoraDeBonificacao()

        calculadora.registra(qa)
        calculadora.registra(dev)
        calculadora.registra(gerente)
        calculadora.registra(analista)

        assertEqualsWithPrecision(850.00, calculadora.total)
    }

    private fun assertEqualsWithPrecision(expected: Double, actual: Double, delta: Double = 000.1) {
        Assert.assertEquals(expected, actual, delta)
    }

}