package modulo04
/**
 * Created by anselmo on 01/09/16.
 */

def tecnologias = [name: "Groovy", nivel: "Alto"]

/*
    Usando closure para trabalhar com map de valores
 */

println "Tecnologias.name = ${tecnologias.name}"
println "Tecnologias.name = ${tecnologias.nivel}"

println ""

println "Outra forma de fazer a impressao"
println "Tecnologias.name = ${tecnologias['name']}"
println "Tecnologias.name = ${tecnologias['nivel']}"

println ""

println "Outra forma de fazer a impressao"
println "Tecnologias.name = ${tecnologias.get('name')}"
println "Tecnologias.name = ${tecnologias.get('nivel')}"

println ""

println "Outra forma de fazer a impressao"
println "Tecnologias.name = ${tecnologias.getAt('name')}"
println "Tecnologias.name = ${tecnologias.getAt('nivel')}"