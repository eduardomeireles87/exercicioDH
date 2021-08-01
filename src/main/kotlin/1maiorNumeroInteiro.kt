/* Escrever o código que deve analisar três números inteiros e retornar o maior deles
* É uma função com 3 entradas, compara as 3. Retorna a maior.

Variável maior
Variáveis n1, n2, n3

If n1>n2 then maior=n1 else maior=n2
If maior< n3 then maior=n3

Return maior*/



fun main() {
    val x: Int = 30
    val y: Int = 18
    val z: Int = 96

   // println(maxOf(x, y, z))
    if (x > y)  {
        if (x > z) {
            println (x)
        } else {
            println(z)
        }
    }else {
        if (y>z) {
            println(y)
        } else
            println(z)
    }

}

