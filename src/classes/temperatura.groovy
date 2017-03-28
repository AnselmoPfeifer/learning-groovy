/**
 * Created by anselmo on 28/03/17.
 */
// Usando o exemplo de passagem de parametros para metodos e classes

class Quente{
    def fale (valor){
        println "Diga class Quente - ${valor}"
    }
}

class Fria{
    def fale (valor){
        println "Diga class Fria - ${valor}"
    }
}

static digaTemperatura(objeto, valor){
    objeto.fale(valor)
}

digaTemperatura(new Quente(), 'Esta muito quente!')
digaTemperatura(new Fria(), 'Esta muito frio!')