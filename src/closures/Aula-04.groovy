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

def pessoa = new Pessoa(nome: "Meu Nome", idade: 30)
def lista = ["nome", "idade"]

for (item in lista ) {
    println pessoa."${item}"
}

// Imprimindo as properties / methods de uma Meta Class de Pessoa ou qualquer outra class do Java.
Pessoa.metaClass.properties.each {
    println it.name
}

Pessoa.metaClass.methods.each {
    println it.name
}

Date.metaClass.properties.each {
    println it.name
}