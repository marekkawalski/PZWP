class PrzegladDiesla : Przeglad() {
    override fun wykonajPrzeglad(s: Samochod) {
        println("Zaczynam przeglad z klimatyzacja samochodu $s")
        wymienOlej(s)
        wymienFiltry(s)
        println("Przeglad samochodu $s z klimatyzacja zakonczony")
    }
}