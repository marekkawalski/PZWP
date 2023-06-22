class PrzegladBenzynaKlimaCisnienie : Przeglad(){

    fun sprawdzCisnienie(s: Samochod){
        println("Sprawdzam cisnienie w $s")
    }
    override fun wykonajPrzeglad(s: Samochod) {
        wykoajCoreCzescPrzegladu(s)
        sprawdzKlimatyzacje(s)
        wymienSwiece(s)
        sprawdzCisnienie(s)
        println("Przeglad samochodu $s z klimatyzacja i cisnieniem zakonczony")
    }
}