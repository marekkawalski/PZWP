class PrzegladKlimy (private val przeglad:IPrzeglad) : PrzegladDecorator() {

    fun sprawdzKlimatyzacje(s: Samochod) {
        println("Sprawdzam klimatyzacje w $s")
    }
    override fun wykonajPrzeglad(s: Samochod) {
        przeglad.wykonajPrzeglad(s)
        sprawdzKlimatyzacje(s)
    }
}