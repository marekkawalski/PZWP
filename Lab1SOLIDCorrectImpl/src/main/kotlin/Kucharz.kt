class Kucharz : IKucharz {
    override fun przygotujZupe(zupa: Zupa) {
        println("Przygotowanie zupy ze sk�adnik�w: ${zupa.skladniki}")
        println("Nalewam wod� do garnka")
        for (skladnik in zupa.skladniki) {
            skladnik.przygotujSkladnij()
        }
    }
}