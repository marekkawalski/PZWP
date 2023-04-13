class Kurier : IKurier {
    var adres: String? = null

    override fun podajJedzenie(nazwaJedzonka: String) {
        println("Zawoze $nazwaJedzonka pod adres $adres")
    }
}