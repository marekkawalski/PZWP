class Zupa {
    val skladniki = ArrayList<Skladnik>()

    var nazwa: String? = null

    fun przygotuj() {
        println("Przygotowanie zupy ze sk�adnik�w: $skladniki")
        println("Nalewam wod� do garnka")
        println("Wrzucam kostk� roso�ow�")
        nazwa = "ros�"
        for (skladnik in skladniki) {
            if (skladnik is Marchewka) {
                val marchewka = skladnik
                marchewka.obierz()
                marchewka.pokroj()
            }
            if (skladnik is Makaron) {
                skladnik.gotuj()
            }
            if (skladnik is Ryz) {
                skladnik.gotuj()
            }
        }
    }

    fun przygotujZuperPomidorowa() {
        println("Przygotowanie zupy ze sk�adnik�w: $skladniki")
        println("Nalewam wod� do garnka")
        println("Wrzucam koncentrat pomidorowy")
        nazwa = "ros�"
        for (skladnik in skladniki) {
            if (skladnik is Marchewka) {
                val marchewka = skladnik
                marchewka.obierz()
                marchewka.pokroj()
            }
            if (skladnik is Makaron) {
                skladnik.gotuj()
            }
            if (skladnik is Ryz) {
                skladnik.gotuj()
            }
        }
    }

    fun podaj() {
        println("Podanie obiadu")
        println("Podaj� $nazwa do sto�u")
    }

    fun wyslij(adres: String) {
        println("Wyslanie obiadu na adres$adres\n")
        println("Wyslij� $nazwa na adres")
    }
}