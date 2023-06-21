class MyTree(private val root: ISkladnik) : Iterable<ISkladnik> {
    override fun iterator(): Iterator<ISkladnik> {
        return TreeIterator(root)
    }

    private class TreeIterator(root: ISkladnik) : Iterator<ISkladnik> {
        private val elements: MutableList<ISkladnik> = ArrayList()
        private var index: Int = 0

        init {
            traverseTree(root)
        }

        private fun traverseTree(element: ISkladnik) {
            elements.add(element)
            element.pobierzPotomkow()?.forEach { child ->
                if (child is ISkladnik) {
                    traverseTree(child)
                }
            }
        }

        override fun hasNext(): Boolean {
            return index < elements.size
        }

        override fun next(): ISkladnik {
            return elements[index++]
        }
    }

}
