import interfaces.WymianaOleju

class WymienOlej : WymianaOleju {
    override fun wymienOlej(s: Samochod?) {
        println("Wymiana oleju w $s")
    }
}
