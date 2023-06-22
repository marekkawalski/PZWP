class PrzegladKlimyZPlynem (private val przeglad:IPrzeglad) : PrzegladDecorator() {

    fun sprawdzKlimatyzacjeIPlyn(s: Samochod) {
        println("Sprawdzam klimatyzacje i wymieniam plyn w $s")
    }
    override fun wykonajPrzeglad(s: Samochod) {
        przeglad.wykonajPrzeglad(s)
        sprawdzKlimatyzacjeIPlyn(s)
    }
}