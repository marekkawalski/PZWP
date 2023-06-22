class PrzegladDieslaZKlimatyzacja : Przeglad() {
    override fun wykonajPrzeglad(s: Samochod) {
        wykoajCoreCzescPrzegladu(s)
        sprawdzKlimatyzacje(s)
        println("Przegl�d samochodu $s zako�czony")
    }
}