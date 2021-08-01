//Escrever um programa que exiba os primeiros 100 números positivos pares

fun main() {
    var r:Int = 0
    var limit:Int = 0
    var count:Int = 0;

    while (count < 101) {
        r = limit % 2
        if(r ==0){
            println("$limit é par")
            count++
        }
        limit++

    }
}