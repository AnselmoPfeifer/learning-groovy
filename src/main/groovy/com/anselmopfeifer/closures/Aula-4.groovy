package com.anselmopfeifer.closures
import com.anselmopfeifer.classes.Pessoa

def pessoa =  new Pessoa("MeuNome", "Sobre Nome", 30)
def lista = ["nome", "idade"]

for (item in lista ) {
    println pessoa."${item}"
}

// Imprimindo as properties / methods de uma Meta Class de Pessoa ou qualquer outra class do Java.
Pessoa.metaClass.properties.each {
    println it.name
}

Pessoa.metaClass.methods.each {
    println it.name
}

Date.metaClass.properties.each {
    println it.name
}