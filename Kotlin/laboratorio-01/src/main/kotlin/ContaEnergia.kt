fun main() {
    var conta = readln().split(" ")

    val gasto = conta[0].toInt()
    val tipo = conta[1]

    var valorDaConta = 0.0
    when (tipo) {
        "R" -> valorDaConta = if (gasto <= 500) gasto * 0.40 else  gasto * 0.65
        "C" -> valorDaConta = if (gasto <= 1000) gasto * 0.55 else gasto * 0.60
        "I" -> valorDaConta = if (gasto <= 5000) gasto * 0.55 else gasto * 0.60
        else -> {
            println("-1.00")
            return
        }
    }

    println(String.format("%.2f", valorDaConta))
}