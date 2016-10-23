package modulo06

/**
 * Created by anselmo on 04/09/16.
 */

def arquivo = new XmlSlurper().parse(new File('arquivos/dados.xml'))
def publicacoes = arquivo.publicacao

publicacoes.each{
    println "Publicação: ${it.@titulo}"
    println "Ano: ${it.@ano}"
    it.autores.each{
        println "Autor: ${it.@autor}"
    }
    println ""

}

