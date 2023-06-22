import interfaces.WymianaSwiec

class NieWymienSwiece : WymianaSwiec {

    override fun wymienSwiece(s: Samochod?) {
        println("Nie wymieniam swiec w $s")
    }
}
