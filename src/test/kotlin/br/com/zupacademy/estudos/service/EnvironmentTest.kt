package br.com.zupacademy.estudos.service

import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class EnvironmentTest {

    @Before
    fun init() {
        System.setProperty("myProp", "@rponte")
    }

    @After
    fun cleanUp() {
        System.clearProperty("myProp")
    }

    @Test
    fun deveEncontrarPropertyDaJvm() {

        // ação
        val value = Environment.getProperty("myProp")

        // validação
        assertEquals(value, "@rponte")
    }


}