import interfaces.SprawdzanieKlimyZWymianaPlynu

class NieSprawdzKlimeIWymianaPlynu : SprawdzanieKlimyZWymianaPlynu {
    override fun sprawdzKlimatyzacjeIWymienPlyn(s: Samochod?) {
        println("Nie saprawdzam klimatyzacji i nie wymieniam plynu chlodniczego w $s")
    }
}