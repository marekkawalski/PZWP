fun main() {
    val s = Samochod("Skoda Superb")
    val przeglad = Przeglad(
        WymienFiltry(),
        NieWymienSwiece(),
        WymienOlej(),
        SprawdzKlimatyzacje(),
        SprawdzCisnienie(),
        SprawdzKlimeIWymianaPlynu()
    )
    println("Zaczynam przeglad samochodu " + s.marka)
    przeglad.wykonajPrzeglad(s)
    println("Przeglad samochodu " + s.marka + " zakonczony")
}