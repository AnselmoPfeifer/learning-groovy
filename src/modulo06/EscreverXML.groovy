package modulo06

/**
 * Created by anselmo on 04/09/16.
 */

import groovy.xml.MarkupBuilder

def saida = new File("arquivos/dados.xml")

def escrever = new FileWriter(saida)

def arquivo = new MarkupBuilder(escrever)

arquivo.publicacoes() {
    publicacao(titulo: 'Introdução a programacao Groovy', ano: 2016){
        autores() {
            autor('Anselmo Pfeifer')
        }
    }

    publicacao(titulo: 'Java Server Faces', ano: 2015){
        autores() {
            autor('Anselmo Pfeifer')
        }
    }

    publicacao(titulo: 'JPA e Hibernate', ano: 2016){
        autores() {
            autor('Anselmo Pfeifer')
        }
    }

    publicacao(titulo: 'JPA e Hibernate', ano: 2016){
        autores() {
            autor('Anselmo Pfeifer')
        }
    }

    publicacao(titulo: 'Java Server Faces', ano: 2015){
        autores() {
            autor('Anselmo Pfeifer')
        }
    }
}