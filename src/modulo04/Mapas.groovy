package modulo04
/**
 * Created by anselmo on 01/09/16.
 */

def tecnologias = [
        nome: "Anselmo",
        sobrenome: "Pfeifer"
]

/*
    Usando closure para trabalhar com map de valores
 */

println "Tecnologias.name = ${tecnologias.nome}"
println "Tecnologias.name = ${tecnologias.sobrenome}"

println ""

println "Outra forma de fazer a impressao"
println "Tecnologias.name = ${tecnologias['nome']}"
println "Tecnologias.name = ${tecnologias['sobrenome']}"

println ""

println "Outra forma de fazer a impressao"
println "Tecnologias.name = ${tecnologias.get('nome')}"
println "Tecnologias.name = ${tecnologias.get('sobrenome')}"

println ""

println "Outra forma de fazer a impressao"
println "Tecnologias.name = ${tecnologias.getAt('name')}"
println "Tecnologias.name = ${tecnologias.getAt('nivel')}"