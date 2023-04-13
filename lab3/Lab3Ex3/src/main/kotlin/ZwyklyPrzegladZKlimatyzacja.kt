class ZwyklyPrzegladZKlimatyzacja : Przeglad(), Klimatyzacja {

    override fun wykonajPrzeglad(s: Samochod) {
        wykoajCoreCzescPrzegladu(s)
        sprawdzKlimatyzacje(s)
        wymienSwiece(s)
        println("Przeglad samochodu $s z klimatyzacja zakonczony")
    }
}