package modulo03
/**
 * Created by anselmo on 01/09/16.
 */

// Usando apenas um atributo
public class Test{
    public static int calculo (int numeroParaCalculo){
        return numeroParaCalculo * numeroParaCalculo;
    }
}

def valor = 22876
def valor2 = 22876

//Executando na forma padrao em OO
println "Executando (calculo) Calculo na forma padrao em OO"
println Test.calculo(valor);

println ""


//Executado na maneira groovy usando closure
def calculo = { number -> number * number }
println "Executado (calculo) na maneira groovy usando closure"

println calculo(valor)


// Passando dois atributos

public class Test2{
    public static int calculo2 (int numeroParaCalculo, int numeroParaCalculo2){
        return numeroParaCalculo * numeroParaCalculo2;
    }
}

//Executando na forma padrao em OO
println "Executando (calcul02) na forma padrao em OO"
println Test2.calculo2(valor, valor2);

println ""

def calculo2 = { numero, numero2-> numero * numero2 }
println "Executado (calcul02) na maneira groovy usando closure"

println calculo2(valor, valor2)