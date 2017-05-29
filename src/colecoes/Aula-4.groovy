def tecnologias = [nome: "Programação", tipo: "Groovy"]

/*
    Usando closure para trabalhar com map de valores
 */
def texto = "Outra forma de fazer a impressao"

println "${tecnologias.nome} ${tecnologias.tipo}"

println ""
println texto
println "${tecnologias['nome']} ${tecnologias['tipo']}"

println ""
println texto
println "${tecnologias.get('nome')} ${tecnologias.get('tipo')}"


println ""
println texto
println "${tecnologias.getAt('nome')} ${tecnologias.getAt('tipo')}"