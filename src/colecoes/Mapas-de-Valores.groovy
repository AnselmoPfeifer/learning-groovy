package modulo04
/**
 * Created by anselmo on 01/09/16.
 */

def tecnologias = [
        nome: "Pedro",
        sobrenome: "Santos"
]

/*
    Usando closure para trabalhar com map de valores
 */
def texto = "Outra forma de fazer a impressao"

println "${tecnologias.nome} ${tecnologias.sobrenome}"

println ""
println texto
println "${tecnologias['nome']} ${tecnologias['sobrenome']}"

println ""
println texto
println "${tecnologias.get('nome')} ${tecnologias.get('sobrenome')}"


println ""
println texto
println "${tecnologias.getAt('nome')} ${tecnologias.getAt('sobrenome')}"