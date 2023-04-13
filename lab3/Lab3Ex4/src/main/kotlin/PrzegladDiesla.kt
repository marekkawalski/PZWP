class PrzegladDiesla : Przeglad() {
    override fun wykonajPrzeglad(s: Samochod) {
        wykoajCoreCzescPrzegladu(s)
        println("Przegl�d samochodu $s zako�czony")
    }
}