package org.example;

public interface Serwis {
    default ISamochod przygotujSamochod() {
        final ISamochod car = createSamochod();
        car.sprawdzPlyny();
        car.zatankuj();
        return car;
    }

    ISamochod createSamochod();

}


