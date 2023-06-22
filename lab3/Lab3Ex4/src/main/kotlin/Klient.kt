fun main() {

    val przegladBenzyny = Przeglad()
    var przegladKlimy = PrzegladKlimy(przegladBenzyny)
    var przegladSwiec = SprawdzSwiece(przegladKlimy)
    var s = Samochod("Ford Mondeo w benzynie z klimą")
    przegladSwiec.wykonajPrzeglad(s)
    println("\n\n")

    val przegladDiesla = Przeglad()
    przegladKlimy = PrzegladKlimy(przegladDiesla)
    s = Samochod("Fiat Punto w Dieslu z klimą")
    przegladKlimy.wykonajPrzeglad(s)

    println("\n\n")
    val przegladMalucha = Przeglad()
    s = Samochod("Maluch w benzynie bez klimy")
    przegladMalucha.wykonajPrzeglad(s)
}

