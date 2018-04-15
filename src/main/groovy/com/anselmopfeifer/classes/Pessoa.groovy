package com.anselmopfeifer.classes

class Pessoa{
    String nome
    String sobreNome
    int idade

    Pessoa(nome, sobreNome, int idade) {
        this.nome = nome
        this.sobreNome = sobreNome
        this.idade = idade

    }

    String toString () {
        "${this.nome} ${this.sobreNome} - ${this.idade}"
    }

    boolean equals (obj) {
        return (obj.nome == this.nome) && (obj.sobrenome = this.sobreNome)
    }

    void digaMeuNome(){
        println "Ola eu sou ${nome}"
    }

    void digaMinhaIdade(){
        println "${digaMeuNome()} e tenho ${idade} anos!"
    }
}