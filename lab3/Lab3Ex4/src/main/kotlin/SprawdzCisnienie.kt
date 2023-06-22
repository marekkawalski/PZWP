class SprawdzCisnienie (private val przeglad:IPrzeglad) : PrzegladDecorator() {
    override fun wykonajPrzeglad(s: Samochod) {
        przeglad.wykonajPrzeglad(s)
        println("Sprawdzam cisnienie")
    }
}