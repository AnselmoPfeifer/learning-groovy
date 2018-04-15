package com.anselmopfeifer.classes

import java.util.stream.DoubleStream

/**
 * Created by anselmo on 03/10/16.
 */
class GroovyTest {

    static void main (String [] args){

        println("Hello World");

        def nome = "Pedro"
        def sobreNome = "Santos"
        def nomeCompleto = "${nome} ${sobreNome}"

        println(nome)
        println(sobreNome)
        println(nomeCompleto)

        //Reomovendo as letra
        println(nome.substring(1))
        println(nome.substring(1,3))
        println(nome.substring(1,6))

        def nomeVerdadeiro = false
        println(nomeVerdadeiro ? "Sim": "Não")
    }
}
