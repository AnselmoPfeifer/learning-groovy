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

pessoaList = [new Pessoa("Nome", "SobreNome", 30), new Pessoa("Nome2", "SobreNome2", 20)]

// Interacao na lista
pessoaList.each { pessoa ->
    //println "${pessoa.nome} ${pessoa.sobreNome}"
}

// Fazendo um busca dentro de uma Lista
pessoaList.find { it.nome == "Nome2" }
pessoaList.findAll { it.nome == "Nome2" }