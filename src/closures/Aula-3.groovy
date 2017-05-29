/**
 * Created by anselmo on 28/03/17.
 */

def meuNome = 'Pedro'
def minhaCidade = 'Sao Paulo'

// Exemplo 01
// Closure de um valor somente
def primeiroExemplo = { nome ->
    println "Ola ${nome}"
}
primeiroExemplo(meuNome)
println ""

// Quando temos um unico valor podemos ocultar ele ex:
def  segundoExemplo = {
    println "Ola ${it}"
}
segundoExemplo(meuNome)
println ""

// Exemplo 02
// Closure com doi valores
def terceiroExemplo = {nome, cidade ->
    println "Meu nome é: ${nome}, e eu moro na cidade ${cidade}"
}
terceiroExemplo(meuNome, minhaCidade)

// Exemplo 03
// Closure dentro de uma class

class Pessoa {
    private String nome

    def quartoExemplo = {
        println "Ola, meu nome é ${nome}, seja bem vindo ${it}"
    }
}
def pessoa = new Pessoa(nome: meuNome)
//pessoa.quartoExemplo()

println ""
// Exemplo 04
// Usando a closure como atributo de outro metodo
def lista = ['A', 'B', 'C']
class Quente{

    void metodoQuente(lista, codigo){
        for (item in lista){
            codigo(item)
        }
    }
}
def temperatura = new Quente()
temperatura.metodoQuente(lista, pessoa.quartoExemplo)
println ""

// Outra forma de usar eh com o each, neste caso nao precisa do metodo acima (metodoQuente)
lista.each(pessoa.quartoExemplo)
println ""
