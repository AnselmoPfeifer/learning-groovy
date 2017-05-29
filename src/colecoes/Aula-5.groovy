package modulo04
/**
 * Created by anselmo on 01/09/16.
 */

/**
    Trabalhando com array usando closure
    Defininado um array de numeros
    neste caso estamos declarando o valor do array numbers para receber
    uma lista de numeros do 4 (inclusive) ao 16.
    e fazer a sua impresao inversa
 */
def numerosInvertidos = [*4..16].reverse()
def numbers = [*4..16]
println "Imprimindo o array de numeros "
println numerosInvertidos
println numbers

println ""

// Adicionando o numero 17 no final da lista
numbers << 17
numerosInvertidos << 17
println "Imprimindo o array de numeros e incluindo o valor 17 no final"
println numerosInvertidos
println numbers

println ""

// Removendo o ultimo elemento da lista
numbers.pop()
numerosInvertidos.pop()
println "Imprimindo o array de numeros e removendo o valor 17 do final"
println numerosInvertidos
println numbers