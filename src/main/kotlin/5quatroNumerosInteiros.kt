//Escrever um código que deve analisar quatro números inteiros e,
// caso numA seja maior que numC e numD ou caso numB seja maior que numC e numD,
// retornar true, caso contrário, retornar false


fun main() {
    val numA: Int = 96
    val numB: Int = 71
    val numC: Int = 30
    val numD: Int = 18

    if ((numA > numC) && (numA >numD) || (numB > numC) && (numB >numD)) {
        print(true)
    } else {
        print(false)
    }

}
