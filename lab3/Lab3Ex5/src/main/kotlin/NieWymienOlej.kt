import interfaces.WymianaOleju

class NieWymienOlej : WymianaOleju {

    override fun wymienOlej(s: Samochod?) {
        println("Nie wymieniam oleju w $s")
    }
}