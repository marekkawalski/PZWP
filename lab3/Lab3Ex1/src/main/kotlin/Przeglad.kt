open class Przeglad {
    fun wymienOlej(s: Samochod) {
        println("Wymieniam olej w $s")
    }

    fun wymienSwiece(s: Samochod) {
        println("Wymieniam �wiece w $s")
    }

    fun wymienFiltry(s: Samochod) {
        println("Wymieniam filtry w $s")
    }

    open fun wykonajPrzeglad(s: Samochod) {
        println("Zaczynam przeglad z klimatyzacja samochodu $s")
        wymienOlej(s)
        wymienFiltry(s)
        wymienSwiece(s)
        println("Przeglad samochodu $s z klimatyzacja zakonczony")
    }
}
