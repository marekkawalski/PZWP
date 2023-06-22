import interfaces.SprawdzanieCisnienia

class NieSprawdzCisnienie : SprawdzanieCisnienia {
    override fun sprawdzCisnienie(s: Samochod?) {
        println("Nie sprawdzam cisnienia w $s")
    }
}