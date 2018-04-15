package com.anselmopfeifer.arquivos

/**
 * Created by anselmo on 01/09/16.
 */

new File("arquivos/dados.txt").eachLine{
    line ->
        if (line =~ 'Groovy'){
            println "Encontramos 'Groovy' na linha ${line}"
        }
        println ""

        println "Imprimindo linha com total de caracteres"
        println "A linha: ${line} - Tem ${line.size()} caracteres"
}

