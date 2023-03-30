package org.example;

public class SerwisSamochodOsobowy extends Serwis{
    @Override
    ISamochod createSamochod() {
        return new SamochodOsobowy();
    }
}
