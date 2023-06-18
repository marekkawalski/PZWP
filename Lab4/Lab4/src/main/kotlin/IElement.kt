interface IElement {
    fun addElement(element: kolekcje.zad1.IElement?)

    fun removeElement(index: Int)

    fun getChildren(): Array<Any?>?

    fun countElements(): Int

    fun info()
}