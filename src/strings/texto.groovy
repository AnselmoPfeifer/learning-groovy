/**
 * Created by anselmo on 02/10/16.
 */
package test

def String nome
def String sobrenome
def int idade

nome = "Anselmo"
sobrenome = "Pfeifer"
idade = 37

sobre = "${nome} ${sobrenome} tem ${idade} anos!"

println sobre.toUpperCase()
println(sobre.toLowerCase())

println sobre.class
println sobre.class.superclass

def maisSobre = '''
Anselmo
Pfeifer
37
'''
println(maisSobre.toLowerCase())

String.metaClass.isPalindrome = {->
    delegate == delegate.reverse()
}

frases = 'Palavra'
println "$frases é uma frase? ${frases.isPalindrome()}"
frases = 'Groovy'
println "$frases é uma frase? ${frases.isPalindrome()}"

// Processando texto
def texto = '''
Excerpted from "Programming Groovy",
published by The Pragmatic Bookshelf.
Copyrights apply to this code. It may not be used to create training material,
courses, books, articles, and the like. Contact us if you are in doubt.
We make no guarantees that this code is fit for any purpose.
Visit http://www.pragmaticprogrammer.com/titles/vslg for more book information.
'''

println(texto)

/*
toLowerCas
toUpperCase
Contando os caracteres num texto
*/
println (texto.length())
