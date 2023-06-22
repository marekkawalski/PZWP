import interfaces.*

class Przeglad(
    filtr: WymianaFiltrow,
    swieca: WymianaSwiec,
    olej: WymianaOleju,
    klima: SprawdzanieKlimatyzacji,
    cisnienie: SprawdzanieCisnienia,
    klimaPlyn: SprawdzanieKlimyZWymianaPlynu
) {
    private val filtr: WymianaFiltrow
    private val swieca: WymianaSwiec
    private val olej: WymianaOleju
    private val klima: SprawdzanieKlimatyzacji
    private val cisnienie: SprawdzanieCisnienia
    private val klimaPlyn: SprawdzanieKlimyZWymianaPlynu

    init {
        this.filtr = filtr
        this.swieca = swieca
        this.olej = olej
        this.klima = klima
        this.cisnienie = cisnienie
        this.klimaPlyn = klimaPlyn
    }

    fun wykonajPrzeglad(s: Samochod?) {
        filtr.wymienFiltr(s)
        swieca.wymienSwiece(s)
        klima.sprawdzKlimatyzacje(s)
        olej.wymienOlej(s)
        cisnienie.sprawdzCisnienie(s)
        klimaPlyn.sprawdzKlimatyzacjeIWymienPlyn(s)
    }
}
