package org.example;

public class Klient {
    public Klient() {
        Serwis serwis = new SerwisSamochodOsobowy();
        final ISamochod mojSamochod = serwis.przygotujSamochod();
        mojSamochod.test();
        serwis = new SerwisSamochodCiezarowy();
        ISamochod mojSamochod2 = serwis.przygotujSamochod();
        mojSamochod2.test();
    }

    public static void main(String[] args) {
        new Klient();
    }


}

