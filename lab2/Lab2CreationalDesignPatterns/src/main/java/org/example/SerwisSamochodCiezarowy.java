package org.example;

public class SerwisSamochodCiezarowy extends Serwis{
    @Override
    ISamochod createSamochod() {
        return new SamochodCiezarowy();
    }
}
