/**
 * Created by anselmo on 20/03/17.
 */

// Exemplo de Map em JAVA
Map mapJava = new HashMap()
mapJava.put('nome', 'Pedro')
mapJava.put('sobreNome', 'Santos')
println mapJava


// Exemplo de uso do Map em Groovy
Map mapGroovy = [:]
mapGroovy.put('nome', 'Pedro')
mapGroovy.put('sobreNome', 'Santos')
println mapGroovy

// Ou podemos usar:
Map mapGroovy2 = [:]
mapGroovy2.nome = 'Pedro'
mapGroovy2.sobreNome = 'Santos'
println mapGroovy2
// Tudo que vem depois do . num map o Groovy vai enter que é uma chave