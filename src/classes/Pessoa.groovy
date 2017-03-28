package classes

class Pessoa {
    String nome
    String sobreNome
    Integer idade
}

Pessoa pessoa = new Pessoa()
pessoa.nome = 'Pedro'
pessoa.sobreNome = 'Santos'
pessoa.idade = 30

println pessoa.nome