import interfaces.SprawdzanieKlimatyzacji

class NieSprawdzKlimatyzacje : SprawdzanieKlimatyzacji {

    override fun sprawdzKlimatyzacje(s: Samochod?) {
        println("Nie sprawdzam klimatyzacji w $s")
    }
}