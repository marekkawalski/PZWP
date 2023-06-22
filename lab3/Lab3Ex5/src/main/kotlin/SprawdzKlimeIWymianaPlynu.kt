import interfaces.SprawdzanieKlimyZWymianaPlynu

class SprawdzKlimeIWymianaPlynu : SprawdzanieKlimyZWymianaPlynu {
    override fun sprawdzKlimatyzacjeIWymienPlyn(s: Samochod?) {
        println("Sprawdzam klimatyzacje i wymieniam plyn chlodniczy w $s")
    }
}
