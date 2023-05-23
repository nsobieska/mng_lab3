class Main2 {
    fun dzielniki(n: Int) {
        for (i in 1..n) {
            if (n % i == 0) {
                println("$i jest dzielnikiem $n")
            }
        }
    }

    fun main() {
        dzielniki(210)
    }
}