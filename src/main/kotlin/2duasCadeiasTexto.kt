//Escrever o código que deve analisar duas cadeias de texto e,
// caso sejam diferentes, retornar true, ou, caso sejam iguais, retornar false.

fun main() {
    val nome1: String = "Eduardo"
    val nome2: String = "Meireles"
    var iguais:Boolean = false


     if (nome1 == nome2) {
         iguais=false
    } else {
        iguais=true
    }
    print(iguais)
}

