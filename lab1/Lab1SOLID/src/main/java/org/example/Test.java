package org.example;

public class Test {
    public static void main(String[] args) {
        przygotujZupePomidorowaZMakaronem();
        System.out.println("\n\n\n");
        przygotujZupePomidorowaZRyzemNaWynos();
    }
    public static void przygotujZupePomidorowaZMakaronem() {
        Zupa zupa = new Zupa();
        Marchewka marchewka = new Marchewka();
        Makaron makaron = new Makaron();
        zupa.skladniki.add(marchewka);
        zupa.skladniki.add(makaron);
        zupa.przygotujZuperPomidorowa();
        zupa.podaj();
    }
    public static void przygotujZupePomidorowaZRyzemNaWynos() {
        Zupa zupa = new Zupa();
        Marchewka marchewka = new Marchewka();
        Ryz ryz = new Ryz();
        zupa.skladniki.add(marchewka);
        zupa.skladniki.add(ryz);
        zupa.przygotujZuperPomidorowa();
        zupa.wyslij("Akademcika 16 Gliwice");
    }
}