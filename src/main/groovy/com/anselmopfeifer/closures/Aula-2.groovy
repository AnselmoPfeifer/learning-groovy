package com.anselmopfeifer.closures
/**
 * Created by anselmo on 23/03/17.
 */

/*
  Closures
  Em Groovy Closure é um bloco de codigo
  ou um ponteiro de metodo. É um pedaco de codigo que é definido, e Em seguida executado em um ponto Posterior

  Mais informacoes em:
    http://www.groovy-lang.org/closures.html
    https://learnxinyminutes.com/docs/groovy/
*/

// Examplo 01:  do uso de uma Closure, aqui so geramos o metodo e nao imprimimos nada!
def clos = {println "Hello World!... Closure criada!"}

println "Imprimindo a closure (clos())"
clos()

// Examplo 02: Passando parâmetros para um encerramento
def sum = { a, b -> println a+b }

println "Imprimindo a closure (sum())"
sum(2,1)

// Examplo 03:  Lista de parametros
def valor1 = 2
def multiplicacaoPor = { numero -> numero * valor1 }
println multiplicacaoPor(220)

// Examplo 04: Pode omitir a lista de parametros se ela for simples (it)
def closureSimples = { println it }
closureSimples("Closure com unico parametro (it)")

// Examplo 05: Memoize os resultados usando closure
// Um protocolo subjacente que permite o uso de caches de memorização
// personalizáveis ​​e permutáveis ​​que aderem ao sincrônico encontrado CacheProtocolno core.cache

// https://github.com/clojure/core.memoize/
def memoizeClosure = { a, b ->
    sleep(3000) // Simular um processo demorado
    a + b
}
mem = memoizeClosure.memoize()
def chamandoClosure(a,b) {
    def start = System.currentTimeMillis()
    mem(a,b)
    println "Campos( a = $a, b = $b) - recebeu ${System.currentTimeMillis() - start} ms!"
}
chamandoClosure(10, 20)
chamandoClosure(10, 20)
chamandoClosure(10, 20)
chamandoClosure(10, 20)
chamandoClosure(100, 200)
chamandoClosure(100, 200)
chamandoClosure(100, 200)
chamandoClosure(100, 200)
chamandoClosure(100, 200)

// Examplo 06:
// Usando o Expando do Groovy para adicionar propriedades e
// adicionar encerramentos como métodos a uma instância dessa Classe
// http://mrhaki.blogspot.mx/2009/10/groovy-goodness-expando-as-dynamic-bean.html

def usuario = new Expando(nome: 'Pedro')
assert 'Pedro' == usuario.nome

usuario.sobreNome = 'Santos'
assert 'Santos' == usuario.sobreNome

usuario.idade = 18
assert 18 == usuario.idade

// Aqui usa-se a closure para interagir sobre as propriedades nome e sobreNome do Objeto
usuario.showInfo = { saida ->
    saida << "Nome: $nome"
    saida << " $sobreNome -"
    saida << " Idade $idade"
}

def sw = new StringWriter()
println usuario.showInfo(sw)

/*

// TODO estudar mais a parte de MOP
// Examplo 07
// Metaprogramming (MOP)
// Usando ExpandoMetaClass para adicionar comportamento
String.metaClass.testeAdd = {
    println "Nos adicionamos isto!"
}

String valor = "Teste"
valor?.testeAdd()

// Intercepadando a chamada do metodo
class Teste implements GroovyInterceptable {
    def soma (Integer valorUm, Integer valorDois) { valorUm + valorDois }
    def multiplicacao (Integer valorUm, Integer valorDois) { valorUm * valorDois }

    def chamandoMetodo(String nome, args) {
        System.out.println "Chamando o metodo $nome com os args: $args !!!"
    }
}

def teste = new Teste()
teste?.soma(2,3)
teste?.multiplicacao(2,3)

class Foo {
    def propertyMissing(String name) { name }
}
def f = new Foo()
assertEquals "boo", f.boo

*/