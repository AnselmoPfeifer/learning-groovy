package com.anselmopfeifer.switchCase

abstract class Placa {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in)

        println('Digite a entrada')
        Integer finalPlaca = entrada.nextInt()
        switch (finalPlaca) {
            case 1:
                println('Vencimento dia 11 de Janeiro')
                break
            case 2:
                println('Vencimento dia 12 de Janeiro')
                break
            default:
                println('Valor nao encontrado!')
        }
    }
}