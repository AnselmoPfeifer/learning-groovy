package com.anselmopfeifer.arquivos

/**
 * Created by anselmo on 02/09/16.
 */

diretorio = "/mnt/data/Git/AnselmoPfeifer/learning-groovy/src/main/groovy/com/anselmopfeifer/arquivos"

arquivos = 0

println "Listando Arquivos no diretorio ${diretorio}"

new File(diretorio).eachFile {
    file ->
        if (! file.file){
            listaDiretoio(file, arquivos)
        }
        else{
            println "Arquivos: $file"
            println "Arquivos: $file.name"

        }
}
