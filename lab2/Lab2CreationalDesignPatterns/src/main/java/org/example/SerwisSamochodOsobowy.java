package org.example;

public class SerwisSamochodOsobowy implements Serwis {
    @Override
    public ISamochod createSamochod() {
        return new SamochodOsobowy();
    }
}
