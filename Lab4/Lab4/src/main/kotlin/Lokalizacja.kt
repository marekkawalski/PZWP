import java.util.*

class Lokalizacja(private val name: String) : ISkladnik {
    private val elements: ArrayList<ISkladnik> = ArrayList();
    override fun dodajElement(s: ISkladnik) {
        elements.add(s)
    }
    override fun usunElement(i: Int) {
        elements.removeAt(i)
    }

    override fun pobierzPotomkow(): Array<Any?> {
        return arrayOf(elements)
    }

    override fun ileElementow(): Int {
        return elements.size
    }

    override fun wypiszInfo() {
        println(this.name + " " + ileElementow())
        for (element in elements) {
            element.wypiszInfo()
        }
    }
}