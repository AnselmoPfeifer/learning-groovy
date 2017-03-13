// Example 01
def soma(valor) {
    total = 0
    for (int i = 2; i <= valor; i += 2) {
        total += i
    }

    // return total
    total
}

// 2 + 4 + 6 + 8 + 10 = 30
println "A soma dos numeros Pares entre 1 e 10 eh: ${soma(6)}"

//Example 02
def produtos(quantidade) {
    produto = 1
    for(int i = 2; i <= quantidade; i += 2) {
        produto *= i
    }
    produtos
}
println "O produto de números pares de 1 a 10. ${produtos(10)}"

// Example 03
def sqr (n) {
    squared = []
    for (int i = 2; i <= n; i += 2) {
        squared << i ** 2
    }
     squared
}

println "Squares of even numbers from 1 to 10 is ${sqr(10)}"