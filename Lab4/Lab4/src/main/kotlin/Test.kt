fun main() {
    val s: ISkladnik = Lokalizacja("Polska")
    var l: Lokalizacja = Lokalizacja("Kraków")
    s.dodajElement(l)
    l.dodajElement(Samochod("Fiat"))
    l.dodajElement(Samochod("Opel"))
    l = Lokalizacja("Warszawa")
    l.dodajElement(Samochod("Mercedes"))
    s.dodajElement(l)
    s.dodajElement(Samochod("Ford"))
    s.wypiszInfo()

    println("\n\n")
    val mt = MyTree(s)
    val it: Iterator<ISkladnik> = mt.iterator()
    while (it.hasNext()) {
        println(it.next().wypiszInfo())
    }
}