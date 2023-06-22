import interfaces.SprawdzanieCisnienia

class SprawdzCisnienie : SprawdzanieCisnienia {
    override fun sprawdzCisnienie(s: Samochod?) {
        println("Sprawdzam cisnienia w $s")
    }
}