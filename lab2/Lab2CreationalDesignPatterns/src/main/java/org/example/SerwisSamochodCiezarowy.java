package org.example;

public class SerwisSamochodCiezarowy implements Serwis {
    @Override
    public ISamochod createSamochod() {
        return new SamochodCiezarowy();
    }
}
