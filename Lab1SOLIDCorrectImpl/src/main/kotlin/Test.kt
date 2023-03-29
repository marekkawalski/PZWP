fun main() {
    przygotujZupe()
}

fun przygotujZupe() {
    val zupa = Zupa()
    val marchewka = Marchewka()
    val ryz = Ryz()
    zupa.skladniki.add(marchewka)
    val makaron = Makaron()
    zupa.skladniki.add(ryz)
    //        zupa.przygotuj();
    zupa.przygotujZuperPomidorowa()

//        zupa.podaj();
    zupa.wyslij("Akademcika 16 Gliwice")
}

fun przygotujZupePomidorowaZRyzemNaWynos() {
    val zupa = Zupa()
    val marchewka = Marchewka()
    val ryz = Ryz()
    zupa.skladniki.add(marchewka)
    zupa.skladniki.add(ryz)
    zupa.przygotujZuperPomidorowa()
    zupa.wyslij("Akademcika 16 Gliwice")
}