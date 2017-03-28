/**
 * Created by anselmo on 28/03/17.
 */

// Calculo de Bascara
// Exemplo em Java
/*
BigDecimal deltaJava(BigDecimal a, BigDecimal b, BigDecimal c){
    return b.multiply(b).minus(new BigDecimal(4).multiply(a).multiply(c))
}
println deltaJava(new BigDecimal(2), new BigDecimal(3), new BigDecimal(4))

Resultado = -23
*/

def deltaGroovy(a,b,c) {
    (b * b) - (4 * a * c)
}
println(deltaGroovy(2,3,4))