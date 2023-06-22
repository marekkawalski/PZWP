fun main() {
    val przegladZKlimatyzacja = PrzegladZKlimatyzacja()
    var s = Samochod("Fiat Punto")
    przegladZKlimatyzacja.wykonajPrzeglad(s)
    println("\n\n")

    val przeglad = Przeglad()
    s = Samochod("Ford Mondeo")
    przeglad.wykonajPrzeglad(s)
    println("\n\n")

    val przegladDiesla = PrzegladDiesla()
    s = Samochod("Skoda Superb")
    przegladDiesla.wykonajPrzeglad(s)
    println("\n\n")
}

