abstract class Przeglad {
    fun wymienOlej(s: Samochod) {
        println("Wymieniam olej w $s")
    }

    fun wymienSwiece(s: Samochod) {
        println("Wymieniam �wiece w $s")
    }

    fun wymienFiltry(s: Samochod) {
        println("Wymieniam filtry w $s")
    }

    abstract fun wykonajPrzeglad(s: Samochod)


}
