class PrzegladBenzynaKlimaPlyn :Przeglad() {
    fun sprawdzKlimeIPlyn(s: Samochod){
        println("Sprawdzam klime i plyn w $s")
    }
    override fun wykonajPrzeglad(s: Samochod) {
        wykoajCoreCzescPrzegladu(s)
        sprawdzKlimatyzacje(s)
        wymienSwiece(s)
        sprawdzKlimeIPlyn(s)
        println("Przeglad samochodu $s z klimatyzacja i plynem zakonczony")
    }
}