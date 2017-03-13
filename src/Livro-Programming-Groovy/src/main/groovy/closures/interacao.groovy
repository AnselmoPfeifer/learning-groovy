/**
 * Created by anselmo on 13/03/17.
 */

def interacao (numero, closure) {
    1.upto (numero) {
        println "A interacao com valor ${it}"
        closure
    }
}

println 'Chamando a interacao'
total = 0
interacao(10) {
    total += it
    println "Usando closure o total foi: ${total}"
}

println'Done'