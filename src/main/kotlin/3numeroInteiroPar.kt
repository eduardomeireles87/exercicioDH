//Escrever o código que deve analisar um número inteiro e,
// caso ele seja par,retornar true, caso contrário, retorna false

fun main() {
    val n:Int = 30
    var r:Int = 0
    r = n % 2

    if (r==0){
        println("Esse número é par!")
        } else {
            println ("Esse Número é ímpar")
    }
}