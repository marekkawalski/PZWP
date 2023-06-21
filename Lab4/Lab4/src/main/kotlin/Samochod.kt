class Samochod(private val name: String) : ISkladnik {
    override fun dodajElement(s: ISkladnik) {
    }

    override fun usunElement(i: Int) {
    }

    override fun pobierzPotomkow(): Array<Any?>? {
        return arrayOf(Any())
    }

    override fun ileElementow(): Int {
        return 0;
    }

    override fun wypiszInfo() {
        println("$name 1")
    }
}

