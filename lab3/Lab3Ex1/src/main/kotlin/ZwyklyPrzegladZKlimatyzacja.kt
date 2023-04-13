class ZwyklyPrzegladZKlimatyzacja : Przeglad(), Klimatyzacja {

    override fun wykonajPrzeglad(s: Samochod) {
        println("Zaczynam przeglad z klimatyzacja samochodu $s")
        sprawdzKlimatyzacje(s)
        wymienOlej(s)
        wymienFiltry(s)
        wymienSwiece(s)
        println("Przeglad samochodu $s z klimatyzacja zakonczony")
    }
}