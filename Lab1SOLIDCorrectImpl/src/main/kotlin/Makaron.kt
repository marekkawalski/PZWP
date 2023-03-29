class Makaron : Skladnik() {
    override fun przygotujSkladnij() {
        this.gotuj()
    }

    override fun toString(): String {
        return "makaron"
    }

    fun gotuj() {
        println("Gotowanie makaronu")
    }
}