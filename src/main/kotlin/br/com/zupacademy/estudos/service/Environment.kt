package br.com.zupacademy.estudos.service

/**
 * tip: é um Singleton
 *
 * Object Declarations
 * https://kotlinlang.org/docs/reference/object-declarations.html#object-declarations
 */
object Environment {

    var version: String = "1.20.20-beta"
        private set // poderia usar val, mas fiz apenas para testes

    fun getProperty(name: String): String {
        return System.getProperty(name)
    }

    fun getProperty(name: String, defaultValue: String): String {
        val value = this.getProperty(name)
        if (value != null) {
            return value
        }
        return defaultValue
    }

}