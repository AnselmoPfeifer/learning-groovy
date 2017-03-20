import org.codehaus.groovy.util.ComplexKeyHashMap

/**
 * Created by anselmo on 20/03/17.
 */

// Exemplo de Map em JAVA
Map mapJava = new HashMap()
mapJava.put('nome', 'Anselmo')
mapJava.put('sobreNome', 'Pfeifer')
println mapJava


// Exemplo de uso do Map em Groovy
Map mapGroovy = [:]
mapGroovy.put('nome', 'Anselmo')
mapGroovy.put('sobreNome', 'Pfeifer')
println mapGroovy

// Ou podemos usar:
Map mapGroovy2 = [:]
mapGroovy2.nome = 'Anselmo'
mapGroovy2.sobreNome = 'Pfeifer'
println mapGroovy2
// Tudo que vem depois do . num map o Groovy vai enter que é uma chave