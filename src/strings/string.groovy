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

texto = "${nome} ${sobrenome} tem ${idade} anos!"

println texto.toUpperCase()

def grupoTexto = '''
Anselmo
Pfeifer
37
'''

println(grupoTexto.toLowerCase())