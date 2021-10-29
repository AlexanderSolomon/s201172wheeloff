package com.example.s201172wheeloffortune

import com.example.s201172wheeloffortune.userInput as userInput1

fun main(){
 var james = Person("alex","solo")
    val stringInput = readLine()

    println("wrote: $stringInput")
}

class Person constructor(firstName: String, lastName: String){

    init {
        println("person created"+ "firstName = $firstName and lastName = $lastName")
    }

}


