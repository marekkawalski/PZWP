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

    fun wykoajCoreCzescPrzegladu(s:Samochod){
        println("Zaczynam przeglad samochodu $s")
        wymienOlej(s)
        wymienFiltry(s)
    }
    abstract fun wykonajPrzeglad(s: Samochod)

}
