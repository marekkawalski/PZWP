class Przeglad : IPrzeglad() {
    override fun wykonajPrzeglad(s: Samochod) {
        wykoajCoreCzescPrzegladu(s)
        println("Glowna czesc przeglad samochodu $s zako�czona")
    }
}