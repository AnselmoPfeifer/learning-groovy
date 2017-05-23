class Pessoa{

    String nome
    int idade

    public void digaMeuNome(){
        println "Ola eu sou ${nome}"
    }

    public void digaMinhaIdade(){
        println "${digaMeuNome()} e tenho ${idade} anos!"
    }
}

// Interceptando os Metodos
// Eh uma boa pratica colocar o tipo do primeiro parametro.
Pessoa.metaClass.invokeMethod = {String nome, parametros ->
    println "Vou chamar ${nome}"
    def metodo = Pessoa.metaClass.getMetaMethod(nome)
    def retorno = metodo.invoke(delegate, parametros)
    
    println "Chamei ${metodo}"
    return
}

// 1 Verifica o vai chamar
// 2 Chama o metodo
// Imprime o metodo chamado

def pessoa = new Pessoa(nome: "Meu Nome", idade: 30)
pessoa.digaMeuNome()