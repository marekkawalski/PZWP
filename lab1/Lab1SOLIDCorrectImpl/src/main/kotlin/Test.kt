fun main() {
    val kucharz = Kucharz()
    val kelner = Kelner()
    val kurier = Kurier()
    kurier.adres = "Akademicka 16 Gliwice"
    przygotuj(kucharz, kelner)
    przygotuj(kucharz, kurier)
}

fun przygotuj(kucharz: IKucharz, dostarczycielJedzenia: IPodanieJedzenia) {
    val zupa = Zupa("Rosol")
    zupa.skladniki.addAll(
        listOf(KoncentratPomidorowy(), Marchewka(), Makaron())
    )
    kucharz.przygotujZupe(zupa)
    dostarczycielJedzenia.podajJedzenie(zupa.nazwa)
}