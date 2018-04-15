package com.anselmopfeifer.colecoes

def pessoaList = [
        new Pessoa("MeuNome", "Sobre Nome", 30), new Pessoa("MeuNome", "Sobre Nome", 20)
]

// Interacao na lista
pessoaList.each { pessoa ->
    //println "${pessoa.nome} - ${pessoa.sobreNome}"
}

// Fazendo um busca dentro de uma Lista
println pessoaList.find { it.nome == "MeuNome" }
println pessoaList.findAll { it.nome == "MeuNome" }