import interfaces.WymianaFiltrow

class NieWymienFiltry : WymianaFiltrow {

    override fun wymienFiltr(s: Samochod?) {
        println("Nie wymieniam filtrow w $s")
    }
}
