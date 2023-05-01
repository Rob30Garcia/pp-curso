import kotlin.math.pow

fun main() {
    var valorParaSaque = readln().toInt()

    var notasDeCinquenta = 0
    var notasDeDez = 0
    var notasDeDois = 0

    if(valorParaSaque % 2 == 0) {
        notasDeCinquenta = (valorParaSaque.toDouble()/50.0).toInt()
        valorParaSaque -= notasDeCinquenta*50
        notasDeDez = (valorParaSaque.toDouble()/10.0).toInt()
        valorParaSaque -= notasDeDez*10
        notasDeDois = (valorParaSaque.toDouble()/2.0).toInt()

        println(String.format("%d notas de R\$50, %d notas de R\$10 e %d notas de R\$2",
            notasDeCinquenta, notasDeDez, notasDeDois))
    } else {
        println("ValorInvalido")
    }

}