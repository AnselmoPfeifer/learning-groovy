println "Hello world!"

def x = 1
println x

x = new java.util.Date()
println x

x = -3.1499392
println x

x = false
println x

x = "Groovy!"
println x

// Collections and maps
// Criando um lista vazia e adicionando elementos
def tecnologias = []
tecnologias.add("Grails")
tecnologias << "Groovy"
tecnologias.addAll(["Gradle","Griffon"])
println tecnologias
println tecnologias.size

// Removendo elementos da lista
/*
    tecnologias.remove("Griffon")
    tecnologias = tecnologias - 'Grails'
    println tecnologias
*/
// Interacao entre elementos da Lista, imporimindo indice e nome:
tecnologias.each { println "Tecnologias: $it"}
tecnologias.eachWithIndex { it, i -> println "$i: $it"}

// Verificando se na lista contem ( X )
contem = tecnologias.contains( 'Groovy' )
// Ou
contem = 'Groovy' in tecnologias
println contem
// Ou
tecnologias.containsAll(['Groovy','Grails'])

// Ordenando itens da lista
tecnologias.sort()
println tecnologias
sortedTecnologias = tecnologias.sort( true )
println sortedTecnologias

// Substituindo todos os elementos de uma lista (Exemplo trocando Gradle por gradle)
Collections.replaceAll(tecnologias, 'Gradle', 'gradle')
println tecnologias

// Fazendo uma mistrura na lista
Collections.shuffle(tecnologias, new Random())
println tecnologias

// Limpando uma lista
tecnologias.clear()
println tecnologias

/*
    # Trabalhando com Mapas #
*/
// Criando um mapa Vazio
def meuMapa = [:]
println meuMapa

// Adicionando valores no Mapa
meuMapa = ['nome':'Anselmo', 'sobrenome':'Pfeifer', 'cidade':'Campo Grande', 'estado': 'MS']
meuMapa.put ('pais', 'Brasil')
println meuMapa

// Fazendo uma interacao entre os elementos do mapa
meuMapa.each{ println "$it.key: $it.value"}

// Verificar se no mapa contem ( X ) valor
def mapa = meuMapa
assert mapa.containsKey('nome')
assert mapa.containsValue('Anselmo')
// Imprimindo todos os itens (chave e valor do mapa
println mapa.keySet()
println mapa.values()


class Test {
    // Declarando propriedade para somente leitura
    final String nome = "Anselmo"

    // Propriedade somente leitura com getter público e setter protegido
    String language
    protected void setLanguage(String language) { this.language = language }

    // Propriedade dinamicamente
    def sobreNome
}

// Explorando o uso de if e else em groovy
def numero  = 3
if (numero == 1) {
    println "Numero 1"
}else if (numero == 2) {
    println "Numero 2"
}else {
    println "Numero 3"
}

// Explorando o suporte ao operador ternário
def valor = 10
def novoValor = (valor > 1)? "Certo": "Falhou"
assert novoValor == "Certo"

// TODO
//displayName = user.name ? user.name : 'Anonymous'