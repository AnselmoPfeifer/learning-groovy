/**
 * Created by anselmo on 01/09/16.
 */

println "\nCities without alphabetical ordering:"
/**
    Defininado um array de Cidades para que a impresao se ordenada alfabeticamente
 */
names = ["Paris", "New York", "Tokio", "Las Vegas", "Rio de Janeiro", "London"].sort()

/**
    Trabalhando com array usando closure
*/
names.each{
    element ->
    println "A cidade é ${element}"
    println "A cidade '${element}' tem ${element.size()} caracteres"
}
println "Temos ${names.size()} cidades na lista."

println ""

/**
    Quando nao declaramos o valor conforme o exemplo acima (element) a closure recebe como
    elemento default o it
*/
names.each{
        println "A cidade é  ${it}"
}

