def name = "Groovy" //Variavel dinamicamente tipada
int age = 10 //Variavel  staticamente tipada

from = "codehaus" //Variavel dinamicamente tipada

println("My name is ${name} I` am from ${from}, I have ${age} years.")

name = 1
from = 0
println("The number is ${name} after ${from}.")

//Nao aceita, pois esta tipada como inteiro
age = "10 years"

