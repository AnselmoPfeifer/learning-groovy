/**
 * Created by anselmo on 13/03/17.
 */

//Exemple 01
def tellFortune(closure)
{
    closure new Date("03/13/2017"), "Data para ser lembrada!"
}

tellFortune() { data, evento ->
    println "Fortune for ${data} is '${evento}'"
}

// Exemple 02
def tellFortune2(closure)
{
    Date date = new Date("03/13/2017")

    postFortune = closure.curry(date)
    postFortune "They're features, not bugs"
}

tellFortune2() { data, fortune ->
    println "Fortune for ${data} is '${fortune}'"
}