class Kelner : IKelner {
    override fun nakryjStol() {
        println("Nakrywam stol")
    }

    override fun zbierzNaczynia() {
        println("Zbieram naczynia")
    }

    override fun podajJedzenie(nazwaJedzonka: String) {
        nakryjStol()
        println("Podaj� $nazwaJedzonka do sto�u")
        zbierzNaczynia()
    }
}