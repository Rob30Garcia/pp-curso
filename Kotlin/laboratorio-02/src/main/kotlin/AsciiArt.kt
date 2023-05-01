fun main() {
    val numeroDeAsteristicos = readln().toInt()

    var menos = 1
    for (i in 0..numeroDeAsteristicos - 1) {
        for (j in 0..numeroDeAsteristicos - menos) {
            print("*")
        }

        for (l in 1..2*(menos - 1)) {
            print(" ")
        }

        for (k in 0..numeroDeAsteristicos - menos) {
            print("*")
        }
        println()
        menos++
    }
}