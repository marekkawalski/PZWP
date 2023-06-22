class PrzegladBenzyna : Przeglad() {
    override fun wykonajPrzeglad(s: Samochod) {
        wykoajCoreCzescPrzegladu(s)
        wymienSwiece(s)
        println("Zwykly przeglad samochodu $s zako�czony")
    }
}