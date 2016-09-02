package modulo04
/**
 * Created by anselmo on 01/09/16.
 */

println "\nCities without alphabetical ordering:"
/*
A collection is a list of object where each object inside this
a list can be called as element. In the code bellow we are
defining a collection of array type where each element is a
string of a famous city
 */

names = ["Paris", "New York", "Tokio", "Las Vegas", "Rio de Janeiro", "London"]

/*
All groovy colletions have several helper methods, in the code' bellow
where are calling the "each"method that a closure as parameter as internally iterates
over the names array and then call the closure for each element in the array.
This closure takes an array element as parameter.
*/

names.each{
    element ->
    println "The city is ${element}"
    println "The city '${element}' have ${element.size()} characters"
}
println "has ${names.size()} city in list."