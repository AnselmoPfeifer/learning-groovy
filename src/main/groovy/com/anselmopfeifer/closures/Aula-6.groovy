package com.anselmopfeifer.closures
import com.anselmopfeifer.classes.Pessoa

// Interceptando os Metodos
// Eh uma boa pratica colocar o tipo do primeiro parametro.
Pessoa.metaClass.invokeMethod = {String nome, parametros ->
    println "Vou chamar ${nome}"
    def metodo = Pessoa.metaClass.getMetaMethod(nome)
    def retorno = metodo.invoke(delegate, parametros)

    println "Chamei ${metodo}"
    return
}

// 1 Verifica o vai chamar
// 2 Chama o metodo
// Imprime o metodo chamado

def pessoa = new Pessoa("MeuNome", "Sobre Nome", 30)
pessoa.digaMeuNome()