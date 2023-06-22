fun main() {
    val przegladBenzynaZKlimatyzacja = PrzegladBenzynaZKlimatyzacja()
    var s = Samochod("Fiat Punto")
    przegladBenzynaZKlimatyzacja.wykonajPrzeglad(s)
    println("\n\n")

    val przegladBenzyna = PrzegladBenzyna()
    s = Samochod("Ford Mondeo")
    przegladBenzyna.wykonajPrzeglad(s)
    println("\n\n")

    val przegladDiesla = PrzegladDiesla()
    s = Samochod("Skoda Superb")
    przegladDiesla.wykonajPrzeglad(s)
    println("\n\n")

    val przegladDieslaZKlimatyzacja = PrzegladDieslaZKlimatyzacja()
    s = Samochod("Volvo XC 90")
    przegladDieslaZKlimatyzacja.wykonajPrzeglad(s)
    println("\n\n")

    val przegladBenzynaKlimaCisnienie = PrzegladBenzynaKlimaCisnienie()
    s = Samochod("Volvo XC 40")
    przegladBenzynaKlimaCisnienie.wykonajPrzeglad(s)
    println("\n\n")
}

