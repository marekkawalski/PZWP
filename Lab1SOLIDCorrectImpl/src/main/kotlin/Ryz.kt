class Ryz : Skladnik() {
    override fun przygotujSkladnij() {
        this.gotuj()
    }

    override fun toString(): String {
        return "ryz"
    }

    fun gotuj() {
        println("Gotowanie ryzu")
    }
}