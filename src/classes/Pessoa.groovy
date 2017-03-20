package classes

class Pessoa {
    String nome
    String sobreNome
    Integer idade
}

Pessoa pessoa = new Pessoa()
pessoa.nome = 'Anselmo'
pessoa.sobreNome = 'Pfeifer'
pessoa.idade = 30

println pessoa.nome