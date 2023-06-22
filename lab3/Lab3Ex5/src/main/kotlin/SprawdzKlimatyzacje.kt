import interfaces.SprawdzanieKlimatyzacji

class SprawdzKlimatyzacje : SprawdzanieKlimatyzacji {
    override fun sprawdzKlimatyzacje(s: Samochod?) {
        println("Sprawdzam klimatyzacje w $s")
    }
}
