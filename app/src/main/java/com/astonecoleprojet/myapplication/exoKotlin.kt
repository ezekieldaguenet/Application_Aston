//exoKotlin.kt
fun main() {
    println(min(2,3,4))
    println(pair(2))
    println(pair(3))
    myPrint("toto")
}

fun min(a:Int, b:Int, c:Int ) = if(a < b && a < c) a
else if(b < a && b < c) b
else  c

fun pair(c:Int) = c%2 == 0
fun myPrint(chaine:String) = println("##$chaine##")
