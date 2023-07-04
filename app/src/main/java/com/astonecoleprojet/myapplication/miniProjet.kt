package com.astonecoleprojet.myapplication

//Utilisation
fun main() {
    //Lazy loading + une seule instanciation
    val html = RequestUtils.sendGet("https://www.google.fr")
    println(html)
}