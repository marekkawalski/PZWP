fun main() {
    val zwyklyPrzegladZKlimatyzacja = ZwyklyPrzegladZKlimatyzacja()
    var s = Samochod("Fiat Punto")
    zwyklyPrzegladZKlimatyzacja.wykonajPrzeglad(s)
    println("\n\n")

    val zwyklyPrzeglad = ZwyklyPrzeglad()
    s = Samochod("Ford Mondeo")
    zwyklyPrzeglad.wykonajPrzeglad(s)
    println("\n\n")

    val przegladDiesla = PrzegladDiesla()
    s = Samochod("Skoda Superb")
    przegladDiesla.wykonajPrzeglad(s)
    println("\n\n")

    val przegladDieslaZKlimatyzacja = PrzegladDieslaZKlimatyzacja()
    s = Samochod("Volvo XC 90")
    przegladDieslaZKlimatyzacja.wykonajPrzeglad(s)
    println("\n\n")
}

