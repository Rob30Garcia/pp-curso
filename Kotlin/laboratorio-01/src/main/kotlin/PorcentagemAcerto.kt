fun main() {
    var valores = readln().split("-1")

    var respostas = valores[0].trim().split(" ")
    var gabarito = valores[1].trim().split(" ")

    var acertos = 0
    for (i in 0..respostas.size - 1) {
        acertos += if (respostas[i] == gabarito[i]) 1 else 0
    }

    var porcentagem: Double = acertos.toDouble()/respostas.size.toDouble()

    println(String.format("%.2f", porcentagem * 100.0))
}