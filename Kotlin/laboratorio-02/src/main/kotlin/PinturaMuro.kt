fun main() {
    val valorPorMetroQuadrado = readln().toDouble()
    val area = 12*3

    var valorDoServico = area*valorPorMetroQuadrado + 100.0

    println(String.format("%.1f", valorDoServico))

}