package org.example;

public abstract class Serwis {
    public ISamochod przygotujSamochod() {
        final ISamochod car = createSamochod();
        car.sprawdzPlyny();
        car.zatankuj();
        return car;
    }

    abstract ISamochod createSamochod();

}
