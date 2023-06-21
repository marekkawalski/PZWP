interface ISkladnik {
    fun dodajElement(s: ISkladnik)
    fun usunElement(i: Int)
    fun pobierzPotomkow(): Array<Any?>?
    fun ileElementow(): Int
    fun wypiszInfo()
}