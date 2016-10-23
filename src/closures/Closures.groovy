package modulo03
/**
 * Created by anselmo on 01/09/16.
 */

public class MyMath{
    public static int square (int numberToSquare){
        return numberToSquare * numberToSquare;
    }
}
//Executando na forma padrao em OO
println "Common way to execute a code block"
println MyMath.square(2);

println ""

//Executado na maneira groovy usando closure
def square = { number -> number * number }
println "Groovy way to execute a code block"

println square(2)