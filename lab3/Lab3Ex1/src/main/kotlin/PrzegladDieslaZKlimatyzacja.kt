class PrzegladDieslaZKlimatyzacja : Przeglad(), Klimatyzacja {
    override fun wykonajPrzeglad(s: Samochod) {
        println("Zaczynam przegl�d samochodu $s z dieslem")
        sprawdzKlimatyzacje(s)
        wymienOlej(s)
        wymienFiltry(s)
        println("Przegl�d samochodu $s zako�czony")
    }
}