fun main() {
    val quantidadeDeLinhas = readln().toInt()

    for (i in 0..quantidadeDeLinhas - 1) {
        for (j in 0..quantidadeDeLinhas - 1) {
            if(i%2 == 0) print("* ") else print(" *")
        }
        println()
    }
}