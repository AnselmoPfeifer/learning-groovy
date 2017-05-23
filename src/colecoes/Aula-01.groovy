class Pessoa{
    String nome
    String sobreNome
    int idade

    public Pessoa (nome, sobreNome, int idade) {
        this.nome = nome
        this.sobreNome = sobreNome
        this.idade = idade

    }
    
    String toString () {
        "${this.nome} ${this.sobreNome} - ${this.idade}"
    }

    public boolean equals (obj) {
        return (obj.nome == this.nome) && (obj.sobrenome = this.sobreNome)
    }
}

// Exemplo de adicionar itens usando Java
List<Pessoa> pessoaList = new ArrayList<Pessoa>()
pessoaList.add(new Pessoa("Nome", "SobreNome", 30))
pessoaList.add(new Pessoa("Nome2", "SobreNome2", 20))
println pessoaList

// Exemplo de adicionar itens usando Groovy
pessoaList = [new Pessoa("Nome", "SobreNome", 30), new Pessoa("Nome2", "SobreNome2", 20)]
pessoaList += [new Pessoa("Nome3", "SobreNome3", 21)]
println pessoaList

// Exemplo de remover itens usando Groovy
pessoaList = [new Pessoa("Nome", "SobreNome", 30), new Pessoa("Nome2", "SobreNome2", 20)]
pessoaList -= [new Pessoa("Nome3", "SobreNome3", 21)]
println pessoaList
