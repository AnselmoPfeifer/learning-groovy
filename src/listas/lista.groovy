// Exemplo de lista em JAVA
ArrayList listaJava = new ArrayList()
listaJava.add("Laranja")
listaJava.add("Maça")
println listaJava
println listaJava.size()
println listaJava.class

// Exemplo de lista em Groovy
List listaGroovy = []
listaGroovy.add("Laranja")
listaGroovy.add("Maça")
listaGroovy.add("Refrigerante")
println listaGroovy
println listaGroovy.size()
println listaGroovy.class
listaGroovy.remove('Laranja')
println listaGroovy
println listaGroovy.size()

// Ou podemos usar com += para adicionar ou -= para remover

// Adicionar
listaGroovy += 'Laranja'
println listaGroovy
println listaGroovy.size()

// Remover
listaGroovy -= 'Laranja'
println listaGroovy
println listaGroovy.size()
