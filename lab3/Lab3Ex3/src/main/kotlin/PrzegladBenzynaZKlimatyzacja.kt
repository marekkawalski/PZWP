class PrzegladBenzynaZKlimatyzacja : Przeglad(){

    override fun wykonajPrzeglad(s: Samochod) {
        wykoajCoreCzescPrzegladu(s)
        sprawdzKlimatyzacje(s)
        wymienSwiece(s)
        println("Przeglad samochodu $s z klimatyzacja zakonczony")
    }
}