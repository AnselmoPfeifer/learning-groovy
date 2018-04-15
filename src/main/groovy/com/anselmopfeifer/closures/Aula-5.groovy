package com.anselmopfeifer.closures

import com.anselmopfeifer.classes.Pessoa

Pessoa.metaClass.nao = {
    println "Nao"
}

def pessoa = new Pessoa(nome: "Meu Nome", idade: 30)
pessoa.digaMeuNome()
pessoa.nao()

// Mudando o comportamento do Metodo usando o metaClass
Pessoa.metaClass.digaMeuNome = {
    println "Mudando meu nome usando o metaClass"
}
pessoa.digaMeuNome()

// Extendendo a Class String do Java adicionando o metodo quente.
String.metaClass.quente = {
    println "Quente"
}

"ABC".quente()