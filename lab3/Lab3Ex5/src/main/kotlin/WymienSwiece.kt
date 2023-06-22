import interfaces.WymianaSwiec

class WymienSwiece : WymianaSwiec {
    override fun wymienSwiece(s: Samochod?) {
        println("Wymiana swiec w $s")
    }
}
