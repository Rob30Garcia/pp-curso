fun main() {
    var valorDaCompra = readln().toDouble()

    valorDaCompra = if (valorDaCompra >= 200.0) valorDaCompra - (valorDaCompra*0.05) else valorDaCompra

    println(String.format("%.2f", valorDaCompra))
}