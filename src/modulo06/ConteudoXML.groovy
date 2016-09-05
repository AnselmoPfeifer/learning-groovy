package modulo06

/**
 * Created by anselmo on 04/09/16.
 */

import groovy.xml.MarkupBuilder

def saida = new File("arquivos/dados.xml")

def escrever = new FileWriter(saida)

def arquivo = new MarkupBuilder(escrever)

arquivo.publications() {
    publication(title: 'Introdução a programacao Groovy', year: 2016){
        authors() {
            author('Anselmo Pfeifer')
        }
    }

    publication(title: 'Java Server Faces', year: 2015){
        authors() {
            author('Anselmo Pfeifer')
        }
    }

    publication(title: 'JPA e Hibernate', year: 2016){
        authors() {
            author('Anselmo Pfeifer')
        }
    }

}