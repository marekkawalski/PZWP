class Marchewka : Skladnik() {
    override fun przygotujSkladnij() {
        this.obierz()
        this.pokroj()
    }

    override fun toString(): String {
        return "marchewka"
    }

    fun obierz() {
        println("Obieranie marchewki")
    }

    fun pokroj() {
        println("Krojenie marchewki")
    }
}