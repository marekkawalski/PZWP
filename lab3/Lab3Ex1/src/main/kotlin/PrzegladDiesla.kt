class PrzegladDiesla : Przeglad() {
    override fun wykonajPrzeglad(s: Samochod) {
        println("Zaczynam przegl�d samochodu $s z dieslem")
        wymienOlej(s)
        wymienFiltry(s)
        println("Przegl�d samochodu $s zako�czony")
    }
}