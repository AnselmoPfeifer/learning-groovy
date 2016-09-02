package modulo05

/**
 * Created by anselmo on 02/09/16.
 */

diretorio = "/Users/anselmo/Documents/Desenvolvimento/workspace/Groovy/learning-groovy/src/modulo05/arquivos"

arquivos = 0

println "Listando Arquivos no diretorio ${diretorio}"

new File(diretorio).eachFile {
    file ->
        if (! file.file){
            listaDiretoio(file, arquivos)
        }
        else{
            println "Arquivos: $file.name"

        }
}
