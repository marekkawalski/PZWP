class ZwyklyPrzeglad : Przeglad() {
    override fun wykonajPrzeglad(s: Samochod) {
        println("Zaczynam zwykly przeglad samochodu $s")
        wymienOlej(s)
        wymienFiltry(s)
        wymienSwiece(s)
        println("Zwykly przeglad samochodu $s zako�czony")
    }
}