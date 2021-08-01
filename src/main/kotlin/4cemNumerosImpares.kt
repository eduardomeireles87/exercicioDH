//Escrever um programa que imprima na tela os primeiros 100 números inteiros positivos ímpares

fun main() {
    var r:Int = 0
    var limit:Int = 0
    var count:Int = 0;

    while (count < 101) {
        r = limit % 2
        if(r!=0){
            println("$limit é impar")
            count++
        }
        limit++

    }
}