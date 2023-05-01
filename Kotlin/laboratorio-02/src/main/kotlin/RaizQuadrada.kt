import kotlin.math.sqrt

fun main() {
    val radicando = readln().toInt()

    var raiz = sqrt(radicando.toDouble())

    println(String.format("%.3f\n", raiz))
}