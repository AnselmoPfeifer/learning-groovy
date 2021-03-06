package com.anselmopfeifer.closures

class Alone {
    String qualquer = "Sou um atributo da class Alone"

    void metodoAlone () {
        println "Impressao do metodo Alone!"
    }
}

class Juntinho {
    void metodoJuntoUm() {
        println "Metodo Junto Um"
    }

    void metodoJuntoDois() {
        println "Metodo Junto Dois"
    }
}

// Usando o Mixins (Uma batedeira de class) e misturando os metodos
Pessoa.mixin Alone, Juntinho

def pessoa = new Pessoa(nome: "Meu nome", idade: 30)
pessoa.metodoAlone()
pessoa.metodoJuntoUm()
pessoa.metodoJuntoDois()